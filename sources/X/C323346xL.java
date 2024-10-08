package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.profile.fragment.UserDetailFragment;
import com.instagram.user.model.User;

/* renamed from: X.6xL  reason: invalid class name and case insensitive filesystem */
public final class C323346xL implements C227252iu, C323356xM {
    public final FragmentActivity A00;
    public final 0wc A01;
    public final UserSession A02;
    public final AnonymousClass4DU A03;
    public final C318866pf A04;
    public final C323256xC A05;
    public final DcA A06;
    public final UserDetailFragment A07;
    public final Dc6 A08;
    public final C323336xK A09;
    public final String A0A;
    public final String A0B;
    public final C323206x7 A0C;

    public final void D2B(User user) {
        0qQ.A0B(user, 0);
        if (this.A07.isResumed()) {
            this.A0C.BhL().D2b(user, "user_profile_top_bar", false);
        }
    }

    public final void EKl() {
        this.A07.EKl();
    }

    public C323346xL(FragmentActivity fragmentActivity, 0wc r2, UserSession userSession, AnonymousClass4DU r4, C318866pf r5, C323256xC r6, DcA dcA, C323206x7 r8, UserDetailFragment userDetailFragment, Dc6 dc6, C323336xK r11, String str, String str2) {
        this.A08 = dc6;
        this.A02 = userSession;
        this.A00 = fragmentActivity;
        this.A06 = dcA;
        this.A05 = r6;
        this.A07 = userDetailFragment;
        this.A0A = str;
        this.A0B = str2;
        this.A04 = r5;
        this.A01 = r2;
        this.A03 = r4;
        this.A0C = r8;
        this.A09 = r11;
    }
}
