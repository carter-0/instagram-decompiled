package X;

import com.instagram.igds.components.button.IgdsButton;

/* renamed from: X.Ebo  reason: case insensitive filesystem */
public abstract class C48269Ebo {
    public static final void A00(C276544tV r2, IgdsButton igdsButton) {
        C273024lp r0;
        if (0qQ.A0K(r2.A0E(), "large")) {
            r0 = C273024lp.LARGE;
        } else {
            r0 = C273024lp.MEDIUM;
        }
        igdsButton.setSize(r0);
        igdsButton.setText(r2.A0I());
    }
}
