package X;

import com.instagram.user.model.User;

/* renamed from: X.FnP  reason: case insensitive filesystem */
public final class C51033FnP implements G81 {
    public final /* synthetic */ User A00;
    public final /* synthetic */ C51031FnN A01;

    public final void DED() {
    }

    public final void onCancel() {
    }

    public C51033FnP(User user, C51031FnN fnN) {
        this.A01 = fnN;
        this.A00 = user;
    }

    public final void D5S() {
        DbZ.A1S(this.A01.A06.A00, "remove_follower_dialog_confirmed", this.A00.getId());
    }

    public final void onSuccess() {
        C51031FnN fnN = this.A01;
        C59689JTv.A07(fnN.A02.getContext(), 2131972137);
        C49170Eqb.A00(fnN.A04, this.A00);
    }
}
