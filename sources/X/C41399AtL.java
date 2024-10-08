package X;

import com.instagram.common.session.UserSession;
import com.instagram.ui.text.ConstrainedEditText;

/* renamed from: X.AtL  reason: case insensitive filesystem */
public final class C41399AtL implements AnonymousClass0eL, C62320sa {
    public final int A00;
    public final Object A01;

    public C41399AtL(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final Object invoke() {
        switch (this.A00) {
            case 0:
                return new C40268AYh((UserSession) this.A01);
            case 1:
                C379049Sf r1 = (C379049Sf) this.A01;
                return new AnonymousClass9Xy(r1.A0C, r1);
            default:
                C358368an r3 = (C358368an) this.A01;
                r3.A0e = false;
                C358368an.A0A(r3);
                r3.A0V();
                ConstrainedEditText constrainedEditText = r3.A1j;
                constrainedEditText.requestFocus();
                constrainedEditText.setOnFocusChangeListener(new C358818bW(r3));
                27p.A01(r3.A1J).A1c(C358088aL.A08, r3.A0U);
                return C60340gF.A00;
        }
    }
}
