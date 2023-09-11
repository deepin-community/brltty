/*
 * libbrlapi - A library providing access to braille terminals for applications.
 *
 * Copyright (C) 2006-2023 by
 *   Samuel Thibault <Samuel.Thibault@ens-lyon.org>
 *   Sébastien Hinderer <Sebastien.Hinderer@ens-lyon.org>
 *
 * libbrlapi comes with ABSOLUTELY NO WARRANTY.
 *
 * This is free software, placed under the terms of the
 * GNU Lesser General Public License, as published by the Free Software
 * Foundation; either version 2.1 of the License, or (at your option) any
 * later version. Please see the file LICENSE-LGPL for details.
 *
 * Web Page: http://brltty.app/
 *
 * This software is maintained by Dave Mielke <dave@mielke.cc>.
 */

package org.a11y.brlapi.parameters;
import org.a11y.brlapi.*;

public class CursorBlinkPercentageParameter extends GlobalParameter implements Parameter.ByteSettable {
  public CursorBlinkPercentageParameter (ConnectionBase connection) {
    super(connection);
  }

  @Override
  public final int getParameter () {
    return Constants.PARAM_CURSOR_BLINK_PERCENTAGE;
  }

  @Override
  public final Byte get () {
    return asByte(getValue());
  }

  @Override
  public final void set (byte percentage) {
    setValue(new byte[] {percentage});
  }

  @Override
  public final byte getMaximum () {
    return 100;
  }
}
