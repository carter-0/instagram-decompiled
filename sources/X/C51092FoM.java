package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.user.model.User;

/* renamed from: X.FoM  reason: case insensitive filesystem */
public final class C51092FoM implements G83 {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ 0wc A01;
    public final /* synthetic */ C14631Tzd A02;
    public final /* synthetic */ User A03;
    public final /* synthetic */ C51031FnN A04;

    public final /* synthetic */ void onFinish() {
    }

    public final /* synthetic */ void onStart() {
    }

    public C51092FoM(FragmentActivity fragmentActivity, 0wc r2, C14631Tzd tzd, User user, C51031FnN fnN) {
        this.A01 = r2;
        this.A03 = user;
        this.A00 = fragmentActivity;
        this.A02 = tzd;
        this.A04 = fnN;
    }

    public final void DEH(Integer num) {
        C59689JTv.A0B(this.A00, "unrestricted_user_failed");
    }

    public final void onSuccess() {
        0wc r4 = this.A01;
        User user = this.A03;
        AnonymousClass73V.A0G(r4, "impression", "unrestrict_success_toast", user.getId());
        C59689JTv.A07(this.A00, 2131952113);
        user.A1E(false);
        C14631Tzd tzd = this.A02;
        tzd.A0G = false;
        tzd.A0D = false;
        this.A04.A07.Cs5();
    }
}
