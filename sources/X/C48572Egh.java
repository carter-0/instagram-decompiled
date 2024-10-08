package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.challenge.activity.ChallengeActivity;

/* renamed from: X.Egh  reason: case insensitive filesystem */
public abstract class C48572Egh {
    /* JADX WARNING: type inference failed for: r0v9, types: [X.1qK, java.lang.Object] */
    public static Object A00(C307896Rx r4, AnonymousClass6Tm r5) {
        Object A01 = r5.A01();
        boolean A012 = Q0A.A01(r5.A02());
        FragmentActivity A04 = C308206Td.A04(r4);
        0qQ.A0B(A04, 0);
        if (A04 instanceof ChallengeActivity) {
            A04.finish();
        }
        if (!A012) {
            return null;
        }
        FZ1 A00 = F5E.A00(C308206Td.A0B(r4));
        if (!"IG_PAYOUT_EDIT".equals(A01)) {
            return null;
        }
        AnonymousClass1Nd.A00(A00.A06).A00(new Object());
        return null;
    }
}
