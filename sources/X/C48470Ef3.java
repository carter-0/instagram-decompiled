package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.direct.perf.constants.ThreadFetchReason;

/* renamed from: X.Ef3  reason: case insensitive filesystem */
public abstract class C48470Ef3 {
    public static final C60340gF A00(C307896Rx r14, AnonymousClass6Tm r15) {
        UserSession A0W = DbX.A0W(r14);
        FragmentActivity A04 = C308206Td.A04(r14);
        AnonymousClass0iw A08 = C308206Td.A08(r14);
        Object A03 = r15.A03(0);
        String A0p = DbS.A0p(A03);
        String str = (String) A03;
        AnonymousClass6ST r5 = new AnonymousClass6ST(A04, true);
        DbX.A15(A04, r5);
        AnonymousClass0fN.A00(r5);
        C71129OdS.A03(A0W, ThreadFetchReason.OPEN_BROADCAST_CHANNEL, new C50414FbN(A04, A08, A0W, r5, (String) DbT.A0q(r15, A0p, 1), str), 20, str, false);
        return C60340gF.A00;
    }
}
