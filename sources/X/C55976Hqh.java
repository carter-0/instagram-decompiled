package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.Hqh  reason: case insensitive filesystem */
public final class C55976Hqh {
    public final int A00;
    public final AnonymousClass0iw A01;
    public final UserSession A02;
    public final 1Xj A03;

    public final void A00(FragmentActivity fragmentActivity, String str, String str2, String str3) {
        0qQ.A0B(str, 1);
        FragmentActivity fragmentActivity2 = fragmentActivity;
        C52273GLp.A03(fragmentActivity2, this.A01, this.A02, str, str2, str3, (int[]) null);
        fragmentActivity.onBackPressed();
    }

    public C55976Hqh(AnonymousClass0iw r1, UserSession userSession, 1Xj r3, int i) {
        AnonymousClass7TG.A1P(userSession, r3);
        this.A02 = userSession;
        this.A01 = r1;
        this.A03 = r3;
        this.A00 = i;
    }
}
