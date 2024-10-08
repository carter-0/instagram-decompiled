package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.Ntb  reason: case insensitive filesystem */
public abstract class C69873Ntb {
    public static final void A00(FragmentActivity fragmentActivity, UserSession userSession, C69270NiW niW, C254793t3 r7, String str, String str2, int i) {
        boolean A1Z = AnonymousClass7TG.A1Z(userSession, fragmentActivity);
        AnonymousClass37E r1 = AnonymousClass37D.A00;
        AnonymousClass37D A01 = r1.A01(fragmentActivity);
        if (A01 != null && ((AnonymousClass37F) A01).A0g == A1Z) {
            DbX.A10(fragmentActivity, r1);
        }
        AnonymousClass7TF.A0D().postDelayed(new C51546Fvs(fragmentActivity, userSession, niW, r7, str, str2, i), 500);
    }
}
