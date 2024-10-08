package X;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.session.UserSession;
import com.instagram.direct.smartsuggestion.model.SmartSuggestion;
import com.instagram.model.direct.DirectThreadKey;
import java.util.HashMap;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.TimeZone;

/* renamed from: X.Mc6  reason: case insensitive filesystem */
public final class C66761Mc6 extends C392289uY implements G76 {
    public AnonymousClass2Ep A00;
    public C70608ODf A01;
    public final FragmentActivity A02;
    public final AnonymousClass0iw A03;
    public final UserSession A04;
    public final AnonymousClass4kA A05;

    public final View A06(Context context) {
        0qQ.A0B(context, 0);
        C70608ODf oDf = new C70608ODf(context, this);
        this.A01 = oDf;
        return oDf.A00;
    }

    public final void A07(C39761A8b a8b, C74401PuH puH, AnonymousClass2Ep r7, boolean z) {
        SmartSuggestion Bwx;
        0Tu r2;
        long j;
        0qQ.A0B(puH, 1);
        if (!(r7 == null || (Bwx = r7.Bwx()) == null || Bwx.A03 != AnonymousClass05K.A0j)) {
            UserSession userSession = this.A04;
            if (AnonymousClass431.A01(userSession)) {
                r2 = 0Tu.A05;
                j = 36315932762574527L;
            } else if (DbT.A0j(userSession).A20()) {
                r2 = 0Tu.A05;
                j = 36315932762640064L;
            }
            if (182.A06(r2, userSession, j)) {
                this.A00 = r7;
                puH.DoM(this);
                return;
            }
        }
        puH.onFailure();
    }

    public final void A04(boolean z) {
        0wc A012;
        AnonymousClass2Ep r3 = this.A00;
        if (r3 != null) {
            UserSession userSession = this.A04;
            AnonymousClass0iw r1 = this.A03;
            long parseLong = Long.parseLong(A00(r3));
            String C6C = r3.C6C();
            if (C6C == null) {
                C6C = "";
            }
            0qQ.A0B(userSession, 0);
            if (r1 == null) {
                A012 = AnonymousClass0kN.A02(userSession);
            } else {
                A012 = AnonymousClass0kN.A01(r1, userSession);
            }
            0Aj A0e = AnonymousClass7TE.A0e(A012, "instagram_business_appointment_upsell_impression");
            if (A0e.isSampled()) {
                A0e.A9F("consumer_id", Long.valueOf(parseLong));
                C66580MXl.A1J(A0e, C6C);
                A0e.AAJ("referrer_ui_component", "direct_thread_cts");
                A0e.AAJ("referrer_ui_surface", "ig_direct");
                A0e.Cgf();
            }
        }
    }

    public final void onActionClicked() {
        String str;
        C70608ODf oDf = this.A01;
        if (oDf != null) {
            oDf.A00.setVisibility(8);
        }
        onBannerDismissed();
        AnonymousClass4kA r3 = this.A05;
        0s0 r2 = r3.A03;
        AnonymousClass0YZ[] r1 = AnonymousClass4kA.A0c;
        if (AnonymousClass7TG.A1a(r3, r2, r1, 2)) {
            AnonymousClass2Ep r0 = this.A00;
            if (r0 != null) {
                OZW ozw = OZW.A00;
                FragmentActivity fragmentActivity = this.A02;
                UserSession userSession = this.A04;
                ozw.A02(fragmentActivity, this.A03, userSession, "com.bloks.www.services.ig.appointment.calendar", A00(r0), userSession.A06, "", "direct_thread_cts", "");
            }
        } else {
            AnonymousClass7TF.A1J(r3, r2, r1, 2, true);
            AnonymousClass2Ep r22 = this.A00;
            if (r22 != null) {
                FragmentActivity fragmentActivity2 = this.A02;
                UserSession userSession2 = this.A04;
                AnonymousClass0iw r5 = this.A03;
                0eP A1L = AnonymousClass7TE.A1L("merchant_id", userSession2.A06);
                0eP A1L2 = AnonymousClass7TE.A1L(AnonymousClass000.A00(1258), A00(r22));
                0eP A1L3 = AnonymousClass7TE.A1L("display_variant", "appointment_creation");
                TimeZone timeZone = TimeZone.getDefault();
                if (timeZone == null || (str = timeZone.getID()) == null) {
                    str = "";
                }
                HashMap A022 = 0Yt.A02(new 0eP[]{A1L, A1L2, A1L3, AnonymousClass7TE.A1L("timezone", str), AnonymousClass7TE.A1L("referrer_ui_component", "direct_thread_cts")});
                Dba.A0j(2, fragmentActivity2, r5);
                C46649DiU A042 = C46649DiU.A04("com.bloks.www.services.ig.appointment.education", A022);
                IgBloksScreenConfig A0N = DbS.A0N(userSession2);
                Integer num = AnonymousClass05K.A01;
                A0N.A0P = num;
                A0N.A0R = r5.getModuleName();
                A0N.A00 = 32;
                A0N.A0P = num;
                A042.A0D(fragmentActivity2, A0N);
            }
        }
        AnonymousClass2Ep r32 = this.A00;
        if (r32 != null) {
            UserSession userSession3 = this.A04;
            AnonymousClass0iw r12 = this.A03;
            long parseLong = Long.parseLong(A00(r32));
            String C6C = r32.C6C();
            if (C6C == null) {
                C6C = "";
            }
            AnonymousClass7TG.A1N(userSession3, r12);
            0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r12, userSession3), "instagram_business_appointment_upsell_click");
            if (A0e.isSampled()) {
                A0e.A9F("consumer_id", Long.valueOf(parseLong));
                C66580MXl.A1J(A0e, C6C);
                A0e.AAJ("referrer_ui_component", "direct_thread_cts");
                A0e.AAJ("referrer_ui_surface", "ig_direct");
                A0e.Cgf();
            }
        }
    }

    public final void onBannerDismissed() {
        String str;
        AnonymousClass2Ep r0 = this.A00;
        if (r0 != null) {
            UserSession userSession = this.A04;
            DirectThreadKey BJy = r0.BJy();
            SmartSuggestion Bwx = r0.Bwx();
            if (Bwx != null) {
                str = Bwx.A05;
            } else {
                str = null;
            }
            O04.A00(userSession, BJy, str);
        }
    }

    public C66761Mc6(FragmentActivity fragmentActivity, AnonymousClass0iw r3, UserSession userSession) {
        this.A04 = userSession;
        this.A03 = r3;
        this.A02 = fragmentActivity;
        this.A05 = AnonymousClass4k9.A00(userSession);
    }

    private final String A00(AnonymousClass2Ep r5) {
        List BRV = r5.BRV();
        0qQ.A0A(BRV);
        for (Object next : BRV) {
            String str = (String) next;
            if (!str.equals(this.A04.A06)) {
                0qQ.A07(next);
                return str;
            }
        }
        throw new NoSuchElementException(AnonymousClass000.A00(3));
    }
}
