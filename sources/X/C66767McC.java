package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.direct.integrity.banner.fullscreen.FullscreenBannerViewModel;
import com.instagram.direct.thread.analytics.DirectThreadAnalyticsParams;
import java.util.ArrayList;

/* renamed from: X.McC  reason: case insensitive filesystem */
public final class C66767McC extends C392289uY {
    public DirectThreadAnalyticsParams A00;
    public C331157Pu A01;
    public String A02;
    public boolean A03;
    public boolean A04;
    public final Activity A05;
    public final UserSession A06;
    public final C66748Mbt A07;

    public final void A07(C39761A8b a8b, C74401PuH puH, AnonymousClass2Ep r7, boolean z) {
        String C6C;
        0qQ.A0B(puH, 1);
        if (!(r7 == null || (C6C = r7.C6C()) == null)) {
            this.A02 = C6C;
            C66748Mbt mbt = this.A07;
            if (C66748Mbt.A01(mbt, C6C) == AnonymousClass05K.A00) {
                UserSession userSession = this.A06;
                if (C66797Mcj.A00(userSession)) {
                    String str = this.A02;
                    if (str != null) {
                        String A022 = mbt.A02(str);
                        if (A022.length() > 0) {
                            2Dm A002 = 2L2.A00(userSession);
                            String str2 = this.A02;
                            if (str2 != null) {
                                C254703su BRz = A002.BRz(C66581MXm.A0e(str2), A022);
                                if (BRz != null) {
                                    boolean z2 = !BRz.A1c();
                                    this.A03 = z2;
                                    if (z2) {
                                        this.A00 = C3263376i.A01(r7, BRz.A2G);
                                    }
                                }
                            }
                        }
                        puH.DoM(this);
                        return;
                    }
                    0qQ.A0F("threadId");
                    throw AnonymousClass00P.createAndThrow();
                }
            }
        }
        puH.onFailure();
    }

    public final void A04(boolean z) {
        if (!this.A04) {
            ArrayList A1C = AnonymousClass7TE.A1C();
            Activity activity = this.A05;
            A1C.add(new FullscreenBannerViewModel.SectionBulletPoint(Integer.valueOf(R.drawable.instagram_warning_pano_outline_24), (String) null, AnonymousClass7TE.A16(activity, 2131973108), (String) null));
            A1C.add(new FullscreenBannerViewModel.SectionBulletPoint(Integer.valueOf(R.drawable.instagram_delete_pano_outline_24), (String) null, AnonymousClass7TE.A16(activity, 2131973109), (String) null));
            C69177NgP A0K = C66584MXp.A0K(new FullscreenBannerViewModel(Integer.valueOf(R.drawable.ig_illustrations_illo_heart_circle_refresh), (String) null, activity.getString(2131973110), activity.getString(2131954045), A1C));
            UserSession userSession = this.A06;
            C331127Pr A0W = DbS.A0W(userSession);
            A0W.A0g = activity.getString(2131968772);
            A0W.A1J = true;
            A0W.A0K = new C71402Ok1((Object) this, 23);
            A0W.A0h = activity.getString(2131953611);
            A0W.A1N = true;
            A0W.A0L = new C71402Ok1((Object) this, 24);
            A0W.A0U = new C72959PQr(this, 20);
            A0W.A1P = true;
            C331157Pu A002 = A0W.A00();
            this.A01 = A002;
            A002.A02(activity, A0K);
            C331157Pu r0 = this.A01;
            if (r0 != null && r0.A0S()) {
                this.A04 = true;
                C66748Mbt mbt = this.A07;
                String str = this.A02;
                if (str == null) {
                    C66580MXl.A18();
                    throw AnonymousClass00P.createAndThrow();
                }
                mbt.A00.A0z(002.A0R("on_device_nudity_banner_state/sender/", str), 2);
                if (this.A03) {
                    C71137Odf.A06(C69459Nm3.SENDER, userSession, this.A00);
                }
            }
        }
    }

    public final boolean A05() {
        return this.A04;
    }

    public C66767McC(Activity activity, UserSession userSession) {
        this.A05 = activity;
        this.A06 = userSession;
        this.A07 = new C66748Mbt(userSession);
    }

    public final View A06(Context context) {
        return C66584MXp.A09(context);
    }
}
