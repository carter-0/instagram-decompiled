package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.challenge.activity.ChallengeActivity;

/* renamed from: X.Egi  reason: case insensitive filesystem */
public abstract class C48573Egi {
    /* JADX WARNING: type inference failed for: r0v10, types: [X.1qK, java.lang.Object] */
    public static final Object A00(C307896Rx r4, AnonymousClass6Tm r5) {
        C276544tV r3 = (C276544tV) r5.A02();
        FragmentActivity A04 = C308206Td.A04(r4);
        0qQ.A0B(A04, 0);
        if (A04 instanceof ChallengeActivity) {
            A04.finish();
        }
        if (!r3.A0R(36, false)) {
            return null;
        }
        FZ1 A00 = F5E.A00(C308206Td.A0B(r4));
        0qQ.A07(A00);
        if (!"IG_PAYOUT_EDIT".equals(DbV.A10(r3, ""))) {
            return null;
        }
        AnonymousClass1Nd.A00(A00.A06).A00(new Object());
        return null;
    }
}
