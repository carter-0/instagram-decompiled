package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;

public final class F0W {
    public final Activity A00;
    public final 0xG A01 = DbS.A0O("broadcast_channel_participation_hub");
    public final UserSession A02;
    public final LBH A03;
    public final String A04;
    public final AnonymousClass0eM A05;
    public final AnonymousClass0eM A06;

    public F0W(Activity activity, UserSession userSession, LBH lbh) {
        this.A02 = userSession;
        this.A00 = activity;
        this.A03 = lbh;
        this.A04 = lbh.A06.C6C();
        this.A06 = AnonymousClass0eN.A01(new C41655Ay7(this, 13));
        this.A05 = AnonymousClass0eN.A01(new C41655Ay7(this, 12));
    }
}
