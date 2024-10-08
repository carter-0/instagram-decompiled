package X;

import com.instagram.avatars.coinflip.ProfileCoinFlipView;
import com.instagram.user.model.User;

/* renamed from: X.6tp  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C321256tp implements C62320sa {
    public final /* synthetic */ AnonymousClass70F A00;
    public final /* synthetic */ C323286xF A01;
    public final /* synthetic */ C319896rP A02;
    public final /* synthetic */ User A03;

    public /* synthetic */ C321256tp(AnonymousClass70F r1, C323286xF r2, C319896rP r3, User user) {
        this.A00 = r1;
        this.A01 = r2;
        this.A03 = user;
        this.A02 = r3;
    }

    public final Object invoke() {
        AnonymousClass70F r0 = this.A00;
        C323286xF r4 = this.A01;
        User user = this.A03;
        C319896rP r2 = this.A02;
        if (((ProfileCoinFlipView) r0.A0R.A01()).A01 == C320946tJ.PROFILE_PICTURE) {
            r4.DPK(r2, user);
        } else {
            r4.DP8(user);
        }
        return C60340gF.A00;
    }
}
