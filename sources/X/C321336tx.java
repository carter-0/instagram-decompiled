package X;

import android.app.Activity;
import com.instagram.avatars.coinflip.ProfileCoinFlipView;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.6tx  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C321336tx implements C62320sa {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ ProfileCoinFlipView A01;
    public final /* synthetic */ AnonymousClass0iw A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ AnonymousClass70F A04;
    public final /* synthetic */ C323286xF A05;
    public final /* synthetic */ C319896rP A06;
    public final /* synthetic */ User A07;

    public /* synthetic */ C321336tx(Activity activity, ProfileCoinFlipView profileCoinFlipView, AnonymousClass0iw r3, UserSession userSession, AnonymousClass70F r5, C323286xF r6, C319896rP r7, User user) {
        this.A01 = profileCoinFlipView;
        this.A04 = r5;
        this.A00 = activity;
        this.A05 = r6;
        this.A07 = user;
        this.A03 = userSession;
        this.A02 = r3;
        this.A06 = r7;
    }

    public final Object invoke() {
        ProfileCoinFlipView profileCoinFlipView = this.A01;
        AnonymousClass70F r7 = this.A04;
        Activity activity = this.A00;
        C323286xF r8 = this.A05;
        User user = this.A07;
        UserSession userSession = this.A03;
        AnonymousClass0iw r4 = this.A02;
        C319896rP r9 = this.A06;
        if (profileCoinFlipView.A02.size() >= 2) {
            AnonymousClass70L.A01(activity, r4, userSession, (C321016tR) profileCoinFlipView.A02.get(1), r7, r8, r9, user);
        }
        return C60340gF.A00;
    }
}
