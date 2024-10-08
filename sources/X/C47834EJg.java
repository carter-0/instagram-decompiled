package X;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.direct.channels.analytics.ChannelCreationSource;
import com.instagram.user.model.User;

/* renamed from: X.EJg  reason: case insensitive filesystem */
public final class C47834EJg extends C392289uY implements G76 {
    public AnonymousClass2Ep A00;
    public ExZ A01;
    public final UserSession A02;
    public final AnonymousClass4kA A03;
    public final FragmentActivity A04;
    public final User A05;
    public final String A06;

    public final View A06(Context context) {
        0qQ.A0B(context, 0);
        ExZ exZ = new ExZ(context, this.A02, this);
        this.A01 = exZ;
        return exZ.A01;
    }

    public final void A07(C39761A8b a8b, C74401PuH puH, AnonymousClass2Ep r4, boolean z) {
        0qQ.A0B(puH, 1);
        if (r4 == null || !A08(r4)) {
            puH.onFailure();
            return;
        }
        this.A00 = r4;
        puH.DoM(this);
    }

    public final boolean A08(AnonymousClass2Ep r12) {
        Boolean BBw;
        if (0qQ.A0K(this.A06, C273654mx.A00(905))) {
            return true;
        }
        if (r12.C6a() != 29) {
            return false;
        }
        UserSession userSession = this.A02;
        if (!AnonymousClass7K4.A00(userSession)) {
            return false;
        }
        C242043Sk BcS = this.A05.A03.BcS();
        if (BcS != null && (BBw = BcS.BBw()) != null && BBw.booleanValue()) {
            return false;
        }
        0xa r4 = this.A03.A00;
        if (r4.getBoolean("has_explicitly_dismissed_broadcast_channel_mimicry_upsell", false) || r4.getInt("broadcast_channel_mimicry_upsell_impression_count", 0) >= 3) {
            return false;
        }
        String C6C = r12.C6C();
        0Tu r5 = 0Tu.A06;
        return (((long) r4.getInt(002.A0R(AnonymousClass000.A00(2728), C6C), 0)) > 182.A01(r5, userSession, 36597987561376841L) || ((long) r4.getInt(002.A0R(AnonymousClass000.A00(2726), C6C), 0)) >= 182.A01(r5, userSession, 36597987561311304L) || ((long) r4.getInt(AnonymousClass000.A00(2727), 0)) >= 182.A01(r5, userSession, 36597987561376841L)) && 182.A06(0Tu.A05, userSession, 36316512585454021L) && !182.A06(r5, userSession, 36329410369962087L);
    }

    public final void A04(boolean z) {
        0xa r3 = this.A03.A00;
        AnonymousClass7TG.A1L(r3.AR4(), r3, "broadcast_channel_mimicry_upsell_impression_count", 0);
        AnonymousClass2Ep r1 = this.A00;
        if (r1 != null) {
            C313756gx A002 = C313746gw.A00(this.A02);
            int AdN = r1.AdN();
            String C6C = r1.C6C();
            String C6k = r1.C6k();
            1Ln A0J = DbT.A0J(A002);
            if (DbT.A1Y(A0J)) {
                DbW.A17(A0J, A002);
                Dba.A1D(A0J, "mimicry_upsell_banner_rendered");
                A0J.A0p("mimicry_upsell_banner");
                A0J.A0i(DbZ.A0b(A0J, "thread_view", C6C, C6k, AdN));
                A0J.A0w(AnonymousClass7TF.A0w("entrypoint", "mimicry_upsell_composer_banner"));
                A0J.Cgf();
            }
        }
    }

    public final void onActionClicked() {
        FC2.A02(this.A02, ChannelCreationSource.MIMICRY_UPSELL_COMPOSER, EV0.Broadcast).CfS(this.A04);
        0xY AR4 = this.A03.A00.AR4();
        AR4.E5T("has_explicitly_dismissed_broadcast_channel_mimicry_upsell", true);
        AR4.apply();
        ExZ exZ = this.A01;
        if (exZ != null) {
            exZ.A01.setVisibility(8);
        }
    }

    public final void onBannerDismissed() {
        0xY AR4 = this.A03.A00.AR4();
        AR4.E5T("has_explicitly_dismissed_broadcast_channel_mimicry_upsell", true);
        AR4.apply();
        AnonymousClass2Ep r1 = this.A00;
        if (r1 != null) {
            C313756gx A002 = C313746gw.A00(this.A02);
            int AdN = r1.AdN();
            String C6C = r1.C6C();
            String C6k = r1.C6k();
            1Ln A0J = DbT.A0J(A002);
            if (DbT.A1Y(A0J)) {
                DbW.A17(A0J, A002);
                DbV.A1M(A0J, "mimicry_upsell_banner_cancelled");
                A0J.A0p("mimicry_upsell_banner");
                A0J.A0i(DbZ.A0b(A0J, "thread_view", C6C, C6k, AdN));
                A0J.A0w(AnonymousClass7TF.A0w("entrypoint", "mimicry_upsell_composer_banner"));
                A0J.Cgf();
            }
        }
        C74324Pt0 pt0 = this.A00;
        if (pt0 != null) {
            pt0.onDismiss();
        }
    }

    public C47834EJg(FragmentActivity fragmentActivity, UserSession userSession, String str) {
        this.A04 = fragmentActivity;
        this.A02 = userSession;
        this.A06 = str;
        this.A03 = AnonymousClass4k9.A00(userSession);
        this.A05 = DbT.A0j(userSession);
    }
}
