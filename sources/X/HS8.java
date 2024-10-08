package X;

import android.view.KeyEvent;
import com.facebook.primitive.textinput.TextInputView;

public abstract class HS8 {
    public static final Object A00(C307896Rx r6, AnonymousClass6Tm r7) {
        C276544tV A0P = DbY.A0P(r7, 0);
        C307786Rm r2 = r6.A03;
        if (r2 != null) {
            int A04 = DbW.A04(r7.A02(), "null cannot be cast to non-null type kotlin.Number");
            C52706GbJ gbJ = (C52706GbJ) C307476Qg.A06(r2, A0P);
            if (gbJ == null) {
                return null;
            }
            C245983dn.A02((String) null);
            TextInputView textInputView = gbJ.A02;
            if (textInputView == null) {
                return null;
            }
            for (int i = 0; i < A04; i++) {
                textInputView.dispatchKeyEvent(new KeyEvent(0, 67));
            }
            return null;
        }
        throw AnonymousClass7TE.A0y();
    }
}
