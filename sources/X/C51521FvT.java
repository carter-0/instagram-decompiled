package X;

import android.app.Activity;
import com.instagram.avatars.coinflip.ProfileCoinFlipView;
import com.instagram.common.session.UserSession;

/* renamed from: X.FvT  reason: case insensitive filesystem */
public final /* synthetic */ class C51521FvT implements Runnable {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ ProfileCoinFlipView A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ 26t A03;

    public /* synthetic */ C51521FvT(Activity activity, ProfileCoinFlipView profileCoinFlipView, UserSession userSession, 26t r4) {
        this.A00 = activity;
        this.A01 = profileCoinFlipView;
        this.A02 = userSession;
        this.A03 = r4;
    }

    public final void run() {
        Activity activity = this.A00;
        ProfileCoinFlipView profileCoinFlipView = this.A01;
        UserSession userSession = this.A02;
        26t r3 = this.A03;
        AnonymousClass5Gt A0e = AnonymousClass7TG.A0e(activity, 2131953439);
        A0e.A03(profileCoinFlipView);
        A0e.A01();
        A0e.A0B = true;
        A0e.A00 = 5000;
        A0e.A0A = true;
        A0e.A00().A07(userSession);
        0xY AR4 = r3.A00.AR4();
        AR4.E5T(C273654mx.A00(1291), true);
        AR4.apply();
    }
}
