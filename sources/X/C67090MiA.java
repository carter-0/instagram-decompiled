package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.MiA  reason: case insensitive filesystem */
public final class C67090MiA implements 1wn {
    public final C66633Ma2 A00;

    public static final void A00(C67090MiA miA) {
        C66633Ma2 ma2 = miA.A00;
        UserSession A0P = C66582MXn.A0P(ma2);
        if ((AnonymousClass7TF.A0Q(A0P).A0J() == 16V.A05 || AnonymousClass7TF.A0Q(A0P).A0J() == 16V.A06) && 182.A06(0Tu.A05, A0P, 36319209822624787L)) {
            FragmentActivity activity = ma2.A1J.getActivity();
            if (activity != null) {
                C66736Mbh A0U = C66581MXm.A0U(ma2);
                C68601NOx nOx = new C68601NOx(new C70555OBd(activity, miA));
                C67141Miz miz = A0U.A0E;
                C68601NOx nOx2 = miz.A0A;
                if (nOx2 == null || !nOx.equals(nOx2)) {
                    miz.A0A = nOx;
                    C66736Mbh.A04(A0U);
                    return;
                }
                return;
            }
            throw AnonymousClass7TE.A0y();
        }
    }

    public C67090MiA(C66633Ma2 ma2) {
        this.A00 = ma2;
    }

    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int A03 = AnonymousClass0fD.A03(254410695);
        C375939Fv r5 = (C375939Fv) obj;
        int A0D = AnonymousClass7TG.A0D(r5, -1493914881);
        if (r5.A00 && 2El.A0M(this.A00.A0p(), true)) {
            A00(this);
        }
        AnonymousClass0fD.A0A(-1562246942, A0D);
        AnonymousClass0fD.A0A(1374148567, A03);
    }
}
