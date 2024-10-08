package X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.32N  reason: invalid class name */
public final class AnonymousClass32N {
    public final C250603lj A00;
    public final 2el A01;

    public AnonymousClass32N(FragmentActivity fragmentActivity, UserSession userSession, 2el r12, AnonymousClass4DU r13, C231332rR r14, String str, String str2, String str3, boolean z) {
        0qQ.A0B(r12, 1);
        0qQ.A0B(fragmentActivity, 2);
        0qQ.A0B(userSession, 4);
        0qQ.A0B(r13, 5);
        this.A01 = r12;
        this.A00 = new AnonymousClass32O(fragmentActivity, userSession, r13, r14, str, str2, str3, z);
    }

    public final void A00(View view, 1Xj r7) {
        String A0R = 002.A0R("shopping_feed_cta_bar_impression_", r7.getId());
        2el r3 = this.A01;
        C60340gF r2 = C60340gF.A00;
        AnonymousClass30Y r0 = AnonymousClass30Y.A07;
        C2354830a r1 = new C2354830a(r7, r2, A0R);
        r1.A00(this.A00);
        r3.A05(view, r1.A01());
    }
}
