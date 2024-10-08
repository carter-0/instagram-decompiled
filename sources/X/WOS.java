package X;

import android.os.Bundle;
import com.instagram.api.schemas.NonDiscInfo;
import com.instagram.api.schemas.PaymentInfo;
import com.instagram.common.session.UserSession;
import java.util.Currency;
import java.util.HashMap;

public final class WOS implements X3L {
    public final /* synthetic */ C15299Ua6 A00;

    public WOS(C15299Ua6 ua6) {
        this.A00 = ua6;
    }

    public final void CtD() {
        String str;
        boolean z;
        PaymentInfo paymentInfo;
        Integer num;
        int i;
        VRT vrt;
        C59721JVf jVf;
        GSY gsy;
        Object obj;
        String obj2;
        NonDiscInfo nonDiscInfo;
        C14788U8z u8z = (C14788U8z) this.A00.A0G.getValue();
        C14788U8z.A03(u8z, true);
        UserSession userSession = u8z.A08;
        WGU A002 = WGU.A00(userSession);
        C16678UzE uzE = C16678UzE.BOOST_PACKAGES;
        AnonymousClass0Ud r16 = u8z.A0F;
        String valueOf = String.valueOf(((UL6) r16.getValue()).A00());
        C61065Jw3 A01 = ((UL6) r16.getValue()).A01();
        if (A01 != null) {
            str = W2x.A02((Currency) A01.A02, A01.A00, A01.A01);
        } else {
            str = "";
        }
        String valueOf2 = String.valueOf(((UL6) r16.getValue()).A00());
        0Aj A0e = AnonymousClass7TE.A0e(A002.A05, "promoted_posts_tap_component");
        if (A0e.isSampled()) {
            0bb r1 = new 0bb();
            C13990Tnq.A18(r1, A002);
            r1.A03("run_continuously", false);
            r1.A06("default_recommended_daily_budget", "");
            if (valueOf != null) {
                r1.A06("default_recommended_duration_in_days", valueOf);
            }
            if (str != null) {
                r1.A06("daily_budget_selected", str);
            }
            if (valueOf2 != null) {
                r1.A06("duration_in_days_selected", valueOf2);
            }
            A0e.AAJ("component", "create_promotion");
            C13990Tnq.A10(A0e, A002, uzE);
            C13988Tno.A18(A0e, r1);
        }
        C15026UKf uKf = u8z.A00;
        if (uKf == null || (nonDiscInfo = uKf.A05) == null || !nonDiscInfo.A01 || nonDiscInfo.A00) {
            z = false;
        } else {
            u8z.A06.A00 = new HashMap();
            u8z.A03 = null;
            u8z.A00 = null;
            C14788U8z.A03(u8z, false);
            VRT vrt2 = u8z.A02;
            if (vrt2 != null) {
                C15299Ua6 ua6 = vrt2.A01;
                if (ua6.getActivity() != null) {
                    AnonymousClass0eM r9 = ua6.A0F;
                    JTU.A0D(r9).A0R(uzE.toString(), "open_non_discrimination_screen");
                    C13990Tnq.A0h();
                    C15319UaR uaR = new C15319UaR();
                    C309516Yo A0P = DbZ.A0P(ua6, r9);
                    A0P.A0B((Bundle) null, uaR);
                    A0P.A04();
                }
            }
            z = true;
        }
        C15026UKf uKf2 = u8z.A00;
        if (!(uKf2 == null || (jVf = uKf2.A01) == null || (gsy = (GSY) jVf.A00) == null || (obj = gsy.A00) == null || (obj2 = obj.toString()) == null || z)) {
            C14788U8z.A02(u8z, obj2, "enter_billing_wizard_by_blocked_submit");
            z = true;
        }
        C15026UKf uKf3 = u8z.A00;
        if (!(uKf3 == null || (paymentInfo = uKf3.A06) == null || (num = paymentInfo.A01) == null)) {
            int intValue = num.intValue();
            int A0A = AnonymousClass7TG.A0A(paymentInfo.A02);
            C61065Jw3 A012 = ((UL6) r16.getValue()).A01();
            if (A012 != null) {
                i = A012.A00;
            } else {
                i = 0;
            }
            if (i + A0A > intValue && (vrt = u8z.A02) != null && vrt.A00 && 182.A06(0Tu.A05, userSession, 36321215572354214L)) {
                if (!z) {
                    u8z.A06.A00 = new HashMap();
                    u8z.A03 = null;
                    u8z.A00 = null;
                    C14788U8z.A03(u8z, false);
                    VRT vrt3 = u8z.A02;
                    if (vrt3 != null) {
                        vrt3.A00 = true;
                        C15299Ua6 ua62 = vrt3.A01;
                        if (ua62.getActivity() != null) {
                            AnonymousClass0eM r3 = ua62.A0F;
                            JTU.A0D(r3).A0R(uzE.toString(), "open_asl_screen");
                            C13990Tnq.A0h();
                            Bundle bundle = new Bundle();
                            bundle.putString("step", uzE.toString());
                            C15317UaP uaP = new C15317UaP();
                            uaP.setArguments(bundle);
                            C309516Yo A0P2 = DbZ.A0P(ua62, r3);
                            A0P2.A0B((Bundle) null, uaP);
                            A0P2.A04();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
        }
        if (!z) {
            C14788U8z.A00(u8z);
        }
    }
}
