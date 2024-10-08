package X;

import android.graphics.Rect;
import android.os.Build;
import android.text.Editable;
import android.text.TextUtils;
import android.text.method.KeyListener;
import com.facebook.primitive.textinput.TextInputView;

/* renamed from: X.GbC  reason: case insensitive filesystem */
public final class C52700GbC {
    public static final boolean A02(int i) {
        int i2 = i & 4095;
        return i2 == 129 || i2 == 225 || i2 == 18 || i2 == 145;
    }

    public static final boolean A03(TextInputView textInputView) {
        Editable text = textInputView.getText();
        if (text == null) {
            return false;
        }
        Rect A0W = AnonymousClass7TE.A0W();
        textInputView.getPaint().getTextBounds(text.toString(), 0, text.length(), A0W);
        if (A0W.width() > (textInputView.getWidth() - textInputView.getPaddingLeft()) - textInputView.getPaddingRight()) {
            return true;
        }
        return false;
    }

    public static final boolean A01() {
        if (Build.VERSION.SDK_INT >= 29) {
            return true;
        }
        return false;
    }

    public static final void A00(TextUtils.TruncateAt truncateAt, C52706GbJ gbJ, TextInputView textInputView) {
        if (textInputView.getEllipsize() != truncateAt) {
            KeyListener keyListener = textInputView.getKeyListener();
            if (keyListener == null) {
                C52711GbO gbO = gbJ.A03;
                if (gbO != null) {
                    keyListener = gbO.A0H;
                } else {
                    throw AnonymousClass7TE.A0y();
                }
            }
            gbJ.A00 = keyListener;
            textInputView.setKeyListener((KeyListener) null);
            textInputView.setEllipsize(truncateAt);
        }
    }

    public final boolean A04(TextInputView textInputView) {
        Editable text = textInputView.getText();
        if (text == null || text.length() == 0 || textInputView.getWidth() == 0 || textInputView.getLineCount() > 1 || (textInputView.getInputType() & 131087) == 131073 || A02(textInputView.getInputType())) {
            return false;
        }
        return true;
    }
}
