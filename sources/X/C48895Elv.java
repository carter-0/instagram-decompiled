package X;

import android.view.View;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;

/* renamed from: X.Elv  reason: case insensitive filesystem */
public abstract class C48895Elv {
    public static final void A00(IgdsBottomButtonLayout igdsBottomButtonLayout, boolean z) {
        if (z) {
            igdsBottomButtonLayout.setPrimaryButtonEnabled(true);
            return;
        }
        igdsBottomButtonLayout.setPrimaryButtonEnabled(false);
        0kx r1 = new 0kx(igdsBottomButtonLayout);
        while (r1.hasNext()) {
            View view = (View) r1.next();
            view.setClickable(false);
            view.setFocusable(false);
        }
        AnonymousClass0fU.A00(FP1.A00(igdsBottomButtonLayout, 7), igdsBottomButtonLayout);
    }
}
