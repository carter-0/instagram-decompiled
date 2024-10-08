package X;

import com.instagram.igds.components.button.IgdsButton;

/* renamed from: X.HaE  reason: case insensitive filesystem */
public abstract class C54981HaE {
    public static final void A00(C53156GjS gjS, AnonymousClass3W1 r5) {
        int intValue = r5.A16.intValue();
        if (intValue == 0) {
            IgdsButton igdsButton = gjS.A02;
            igdsButton.setEnabled(false);
            igdsButton.setLoading(true);
        } else if (intValue != 2) {
            IgdsButton igdsButton2 = gjS.A02;
            igdsButton2.setEnabled(true);
            igdsButton2.setLoading(false);
        } else {
            gjS.A02.setEnabled(false);
        }
    }
}
