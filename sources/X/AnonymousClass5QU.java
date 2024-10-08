package X;

import android.graphics.Rect;
import android.view.FocusFinder;
import android.view.View;
import androidx.compose.ui.platform.AndroidComposeView;

/* renamed from: X.5QU  reason: invalid class name */
public final /* synthetic */ class AnonymousClass5QU extends 03J implements 0sP {
    public AnonymousClass5QU(Object obj) {
        super(1, obj, AndroidComposeView.class, "onMoveFocusInChildren", "onMoveFocusInChildren-3ESFkO8(I)Z", 0);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Rect rect;
        View findNextFocusFromRect;
        int i = ((I1T) obj).A00;
        AndroidComposeView androidComposeView = (AndroidComposeView) this.receiver;
        boolean z = false;
        if (i == 7) {
            z = true;
        }
        boolean z2 = false;
        if (!z && i != 8) {
            Integer A01 = I2C.A01(i);
            if (A01 != null) {
                int intValue = A01.intValue();
                AnonymousClass5VN A04 = AndroidComposeView.A04(androidComposeView);
                if (A04 != null) {
                    rect = I2D.A00(A04);
                } else {
                    rect = null;
                }
                FocusFinder instance = FocusFinder.getInstance();
                if (rect == null) {
                    findNextFocusFromRect = instance.findNextFocus(androidComposeView, androidComposeView.findFocus(), intValue);
                } else {
                    findNextFocusFromRect = instance.findNextFocusFromRect(androidComposeView, rect, intValue);
                }
                if (findNextFocusFromRect != null) {
                    z2 = I2C.A02(rect, findNextFocusFromRect, A01);
                }
            } else {
                throw new IllegalStateException("Invalid focus direction");
            }
        }
        return Boolean.valueOf(z2);
    }
}
