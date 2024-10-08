package X;

import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.direct.thread.analytics.DirectThreadAnalyticsParams;
import com.instagram.model.direct.messageid.MessageIdentifier;
import com.instagram.user.model.User;

/* renamed from: X.McF  reason: case insensitive filesystem */
public final class C66770McF extends C392289uY {
    public AnonymousClass2Ep A00;
    public DirectThreadAnalyticsParams A01;
    public MessageIdentifier A02;
    public User A03;
    public String A04;
    public boolean A05;
    public ViewStub A06;
    public final FragmentActivity A07;
    public final UserSession A08;
    public final A44 A09;
    public final C66748Mbt A0A;
    public final AnonymousClass91K A0B = new AnonymousClass91J(this);

    public final View A06(Context context) {
        String string;
        0qQ.A0B(context, 0);
        this.A06 = new ViewStub(context);
        C69017Nct nct = new C69017Nct();
        nct.A07 = context.getString(2131971337);
        nct.A03 = Float.valueOf(context.getResources().getDimension(R.dimen.account_group_management_row_text_size));
        nct.A04 = context.getString(2131971346);
        nct.A05 = context.getString(2131953611);
        nct.A01 = 0;
        User user = this.A03;
        if (user != null) {
            if (!user.CPV()) {
                User user2 = this.A03;
                if (user2 != null) {
                    string = DbY.A0b(context, user2, 2131971338);
                }
            } else {
                string = context.getString(2131968772);
            }
            nct.A06 = string;
            nct.A02 = 2;
            nct.A00 = 0;
            nct.A08 = true;
            ViewStub viewStub = this.A06;
            if (viewStub != null) {
                OSO.A00(viewStub, this.A0B, nct);
                ViewStub viewStub2 = this.A06;
                if (viewStub2 != null) {
                    return viewStub2;
                }
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
            throw AnonymousClass7TE.A0z("Required value was null.");
        }
        0qQ.A0F("sender");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void A07(C39761A8b a8b, C74401PuH puH, AnonymousClass2Ep r9, boolean z) {
        String C6C;
        0qQ.A0B(puH, 1);
        if (!(r9 == null || (C6C = r9.C6C()) == null)) {
            this.A00 = r9;
            this.A04 = C6C;
            C66748Mbt mbt = this.A0A;
            if (C66748Mbt.A00(mbt, C6C) == AnonymousClass05K.A0C) {
                String str = this.A04;
                if (str != null) {
                    1Av r3 = mbt.A00;
                    String A0g = 002.A0g("on_device_nudity_banner_state/recipient/", str, "/message_id/");
                    String str2 = "";
                    String string = r3.A01.getString(A0g, str2);
                    if (string != null) {
                        str2 = string;
                    }
                    if (str2.length() > 0) {
                        UserSession userSession = this.A08;
                        2Dm A002 = 2L2.A00(userSession);
                        String str3 = this.A04;
                        if (str3 != null) {
                            C254703su BRz = A002.BRz(C66581MXm.A0e(str3), str2);
                            if (!(BRz == null || BRz.A0g() == null)) {
                                this.A02 = C66580MXl.A0i(String.valueOf(BRz.A0g()), BRz.A0f());
                                this.A05 = !BRz.A1c();
                                User A022 = 17h.A00(userSession).A02(BRz.A1u);
                                if (A022 != null && C66797Mcj.A02(userSession, AnonymousClass7TF.A1S(BRz.A1S() ? 1 : 0, 1))) {
                                    this.A03 = A022;
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

    public static final void A00(C66770McF mcF) {
        C74324Pt0 pt0 = mcF.A00;
        if (pt0 != null) {
            pt0.onDismiss();
        }
        AnonymousClass7TH.A0R(mcF.A06);
    }

    public final void A04(boolean z) {
        String str;
        AnonymousClass7TF.A16(this.A06);
        C66748Mbt mbt = this.A0A;
        String str2 = this.A04;
        if (str2 == null) {
            str = "threadId";
        } else {
            1Av r3 = mbt.A00;
            r3.A0z(002.A0R("on_device_nudity_banner_state/recipient/", str2), 4);
            r3.A0q(002.A0g("on_device_nudity_banner_state/recipient/", str2, "/message_id/"));
            if (this.A05) {
                UserSession userSession = this.A08;
                C69459Nm3 nm3 = C69459Nm3.RECEIVER;
                DirectThreadAnalyticsParams directThreadAnalyticsParams = this.A01;
                if (directThreadAnalyticsParams == null) {
                    str = "directThreadAnalyticsParams";
                } else {
                    C71137Odf.A07(nm3, userSession, directThreadAnalyticsParams);
                    return;
                }
            } else {
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final boolean A05() {
        ViewStub viewStub = this.A06;
        if (viewStub == null || viewStub.getVisibility() != 0) {
            return false;
        }
        return true;
    }

    public C66770McF(FragmentActivity fragmentActivity, UserSession userSession, A44 a44) {
        this.A07 = fragmentActivity;
        this.A08 = userSession;
        this.A09 = a44;
        this.A0A = new C66748Mbt(userSession);
    }
}
