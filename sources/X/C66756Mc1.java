package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import android.util.AttributeSet;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.banner.IgdsBanner;

/* renamed from: X.Mc1  reason: case insensitive filesystem */
public final class C66756Mc1 extends C392289uY implements G76 {
    public AnonymousClass2Ep A00;
    public final FragmentActivity A01;
    public final UserSession A02;
    public final C313756gx A03;
    public final C254793t3 A04;
    public final AnonymousClass4kA A05;

    public final View A06(Context context) {
        0qQ.A0B(context, 0);
        IgdsBanner igdsBanner = new IgdsBanner(context, (AttributeSet) null, 0);
        igdsBanner.setIcon((int) R.drawable.instagram_questions_pano_outline_24);
        SpannableStringBuilder A0E = C51965G9l.A0E();
        StyleSpan styleSpan = new StyleSpan(1);
        int length = A0E.length();
        A0E.append(JTQ.A0a(context, 2131963770));
        0qQ.A07(A0E.append(10));
        C66582MXn.A12(A0E, styleSpan, length);
        SpannableStringBuilder append = A0E.append(JTQ.A0a(context, 2131963769));
        0qQ.A07(append);
        DbT.A1U(igdsBanner, append, false);
        igdsBanner.setAction(2131963768);
        igdsBanner.setDismissible(true);
        igdsBanner.A00 = this;
        return igdsBanner;
    }

    public final void A07(C39761A8b a8b, C74401PuH puH, AnonymousClass2Ep r11, boolean z) {
        String str;
        0qQ.A0B(puH, 1);
        this.A00 = r11;
        AnonymousClass4kA r5 = this.A05;
        0s0 r1 = r5.A06;
        AnonymousClass0YZ[] r4 = AnonymousClass4kA.A0c;
        long A0R = AnonymousClass7TE.A0R(r1.CDM(r5, r4[30]));
        if (r11 != null && r11.C6a() == 29) {
            C242243Te A0b = C66580MXl.A0b(r11);
            if (A0b != null) {
                str = A0b.A07;
            } else {
                str = null;
            }
            UserSession userSession = this.A02;
            if (C51966G9m.A1W(userSession, str) && A0R > 0 && AnonymousClass7TG.A0I() > A0R && !AnonymousClass7TG.A1a(r5, r5.A0H, r4, 31) && 182.A06(0Tu.A05, userSession, 36319407399050628L)) {
                C313756gx r52 = this.A03;
                String C6C = r11.C6C();
                String C6k = r11.C6k();
                int AdN = r11.AdN();
                1Ln A0J = DbT.A0J(r52);
                if (DbT.A1Y(A0J)) {
                    DbW.A17(A0J, r52);
                    C66581MXm.A1I(A0J, "learn_how_banner_rendered");
                    A0J.A0p("learn_how_banner");
                    C66582MXn.A1C(A0J, r52, DbZ.A0b(A0J, "thread_view", C6C, C6k, AdN));
                }
                puH.DoM(this);
                return;
            }
        }
        puH.onFailure();
    }

    public final void onActionClicked() {
        String str;
        int i;
        int i2;
        AnonymousClass4kA r4 = this.A05;
        AnonymousClass7TF.A1J(r4, r4.A0H, AnonymousClass4kA.A0c, 31, true);
        C313756gx r5 = this.A03;
        AnonymousClass2Ep r0 = this.A00;
        String str2 = null;
        if (r0 != null) {
            str = r0.C6C();
        } else {
            str = null;
        }
        AnonymousClass2Ep r02 = this.A00;
        if (r02 != null) {
            str2 = r02.C6k();
        }
        AnonymousClass2Ep r03 = this.A00;
        if (r03 != null) {
            i = r03.AdN();
        } else {
            i = 0;
        }
        1Ln A0J = DbT.A0J(r5);
        if (DbT.A1Y(A0J)) {
            DbW.A17(A0J, r5);
            DbV.A1M(A0J, "render_best_practices_sheet");
            A0J.A0p("learn_how_banner");
            C66582MXn.A1C(A0J, r5, DbZ.A0b(A0J, "thread_view", str, str2, i));
        }
        UserSession userSession = this.A02;
        FragmentActivity fragmentActivity = this.A01;
        C254793t3 r42 = this.A04;
        C69270NiW niW = C69270NiW.BEST_PRACTICES;
        AnonymousClass2Ep r04 = this.A00;
        if (r04 != null) {
            i2 = r04.AdN();
        } else {
            i2 = 0;
        }
        C69873Ntb.A00(fragmentActivity, userSession, niW, r42, "thread_view", "broadcast_channel_education_upsell_banner", i2);
    }

    public final void onBannerDismissed() {
        AnonymousClass4kA r4 = this.A05;
        AnonymousClass7TF.A1J(r4, r4.A0H, AnonymousClass4kA.A0c, 31, true);
    }

    public C66756Mc1(FragmentActivity fragmentActivity, UserSession userSession, C254793t3 r4) {
        this.A02 = userSession;
        this.A01 = fragmentActivity;
        this.A04 = r4;
        this.A05 = AnonymousClass4k9.A00(userSession);
        this.A03 = C313746gw.A00(userSession);
    }
}
