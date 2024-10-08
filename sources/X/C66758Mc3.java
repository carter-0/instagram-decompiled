package X;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.direct.integrity.banner.fullscreen.FullscreenBannerViewModel;
import com.instagram.direct.thread.analytics.DirectThreadAnalyticsParams;
import com.instagram.model.direct.messageid.MessageIdentifier;
import com.instagram.user.model.User;
import java.util.ArrayList;

/* renamed from: X.Mc3  reason: case insensitive filesystem */
public final class C66758Mc3 extends C392289uY {
    public AnonymousClass2Ep A00;
    public DirectThreadAnalyticsParams A01;
    public C331157Pu A02;
    public MessageIdentifier A03;
    public User A04;
    public String A05;
    public boolean A06;
    public boolean A07;
    public final FragmentActivity A08;
    public final UserSession A09;
    public final A44 A0A;
    public final C66748Mbt A0B;

    public final void A07(C39761A8b a8b, C74401PuH puH, AnonymousClass2Ep r9, boolean z) {
        String C6C;
        0qQ.A0B(puH, 1);
        if (!(r9 == null || (C6C = r9.C6C()) == null)) {
            this.A00 = r9;
            this.A05 = C6C;
            C66748Mbt mbt = this.A0B;
            if (C66748Mbt.A00(mbt, C6C) == AnonymousClass05K.A00) {
                String str = this.A05;
                if (str != null) {
                    1Av r3 = mbt.A00;
                    String A0g = 002.A0g("on_device_nudity_banner_state/recipient/", str, "/message_id/");
                    String str2 = "";
                    String string = r3.A01.getString(A0g, str2);
                    if (string != null) {
                        str2 = string;
                    }
                    if (str2.length() > 0) {
                        UserSession userSession = this.A09;
                        2Dm A002 = 2L2.A00(userSession);
                        String str3 = this.A05;
                        if (str3 != null) {
                            C254703su BRz = A002.BRz(C66581MXm.A0e(str3), str2);
                            if (!(BRz == null || BRz.A0g() == null)) {
                                this.A03 = C66580MXl.A0i(String.valueOf(BRz.A0g()), BRz.A0f());
                                this.A06 = !BRz.A1c();
                                User A022 = 17h.A00(userSession).A02(BRz.A1u);
                                if (A022 != null && C66797Mcj.A02(userSession, AnonymousClass7TF.A1S(BRz.A1S() ? 1 : 0, 1))) {
                                    this.A04 = A022;
                                    this.A01 = C3263376i.A01(r9, BRz.A2G);
                                    puH.DoM(this);
                                    return;
                                }
                            }
                        }
                    }
                }
                0qQ.A0F("threadId");
                throw AnonymousClass00P.createAndThrow();
            }
        }
        puH.onFailure();
    }

    public final void A04(boolean z) {
        int i;
        if (!this.A07) {
            ArrayList A1C = AnonymousClass7TE.A1C();
            FragmentActivity fragmentActivity = this.A08;
            A1C.add(new FullscreenBannerViewModel.SectionBulletPoint(Integer.valueOf(R.drawable.instagram_shield_pano_outline_24), (String) null, AnonymousClass7TE.A16(fragmentActivity, 2131971339), (String) null));
            A1C.add(new FullscreenBannerViewModel.SectionBulletPoint(Integer.valueOf(R.drawable.instagram_info_pano_outline_24), (String) null, AnonymousClass7TE.A16(fragmentActivity, 2131971340), (String) null));
            C69177NgP A0K = C66584MXp.A0K(new FullscreenBannerViewModel(Integer.valueOf(R.drawable.ig_illustrations_illo_heart_circle_refresh), (String) null, fragmentActivity.getString(2131971337), fragmentActivity.getString(2131954045), A1C));
            UserSession userSession = this.A09;
            C331127Pr A0W = DbS.A0W(userSession);
            A0W.A0g = fragmentActivity.getString(2131953611);
            A0W.A1J = true;
            A0W.A0K = new C71402Ok1((Object) this, 20);
            User user = this.A04;
            String str = "sender";
            if (user != null) {
                if (!user.CPV()) {
                    User user2 = this.A04;
                    if (user2 != null) {
                        A0W.A0h = DbY.A0b(fragmentActivity, user2, 2131971338);
                        A0W.A1N = true;
                        i = 21;
                    }
                } else {
                    A0W.A0h = fragmentActivity.getString(2131968772);
                    A0W.A1N = true;
                    i = 22;
                }
                A0W.A0L = new C71402Ok1((Object) this, i);
                A0W.A0U = new C72959PQr(this, 19);
                A0W.A1P = true;
                C331157Pu A002 = A0W.A00();
                this.A02 = A002;
                A002.A02(fragmentActivity, A0K);
                C331157Pu r0 = this.A02;
                if (r0 != null && r0.A0S()) {
                    this.A07 = true;
                    C66748Mbt mbt = this.A0B;
                    String str2 = this.A05;
                    if (str2 == null) {
                        str = "threadId";
                    } else {
                        mbt.A00.A0z(002.A0R("on_device_nudity_banner_state/recipient/", str2), 2);
                        if (this.A06) {
                            C69459Nm3 nm3 = C69459Nm3.RECEIVER;
                            DirectThreadAnalyticsParams directThreadAnalyticsParams = this.A01;
                            if (directThreadAnalyticsParams == null) {
                                str = "directThreadAnalyticsParams";
                            } else {
                                C71137Odf.A06(nm3, userSession, directThreadAnalyticsParams);
                                return;
                            }
                        } else {
                            return;
                        }
                    }
                } else {
                    return;
                }
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public final boolean A05() {
        return this.A07;
    }

    public C66758Mc3(FragmentActivity fragmentActivity, UserSession userSession, A44 a44) {
        this.A08 = fragmentActivity;
        this.A09 = userSession;
        this.A0A = a44;
        this.A0B = new C66748Mbt(userSession);
    }

    public final View A06(Context context) {
        return C66584MXp.A09(context);
    }
}
