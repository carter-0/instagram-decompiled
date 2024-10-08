package X;

import android.animation.AnimatorSet;
import java.util.List;

/* renamed from: X.JFh  reason: case insensitive filesystem */
public final class C59329JFh extends 0Yg implements 0sL {
    public static final C59329JFh A00 = new C59329JFh();

    public C59329JFh() {
        super(2);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C52871Ge4 ge4 = (C52871Ge4) obj2;
        0qQ.A0B(ge4, 1);
        List A002 = C52871Ge4.A00(ge4.A06, ge4, 0);
        List A003 = C52871Ge4.A00(ge4.A07, ge4, 1);
        List A004 = C52871Ge4.A00(ge4.A05, ge4, 2);
        AnimatorSet animatorSet = ge4.A01;
        animatorSet.playTogether(00k.A0S(A003, 00k.A0S(A004, A002)));
        animatorSet.addListener(new C52775GcS(ge4, 3));
        ge4.A00 = true;
        animatorSet.start();
        return C51965G9l.A0f(C58714IwN.A01(ge4, 37));
    }
}
