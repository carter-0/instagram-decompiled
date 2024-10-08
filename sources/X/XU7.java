package X;

import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.EditorBoundsInfo;

public abstract class XU7 {
    public static final void A00(CursorAnchorInfo.Builder builder, AnonymousClass5VN r3) {
        builder.setEditorBoundsInfo(new EditorBoundsInfo.Builder().setEditorBounds(I2D.A01(r3)).setHandwritingBounds(I2D.A01(r3)).build());
    }
}
