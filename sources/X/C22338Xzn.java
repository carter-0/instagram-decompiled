package X;

import com.facebook.common.callercontext.CallerContextable;
import com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;

/* renamed from: X.Xzn  reason: case insensitive filesystem */
public final class C22338Xzn implements BusinessFlowAnalyticsLogger, CallerContextable {
    public static final String __redex_internal_original_name = "InspirationHubLogger";
    public String A00;
    public final 0wc A01;
    public final String A02;

    public final void A03(String str) {
        String str2 = this.A00;
        if (str2 == null) {
            0qQ.A0F("entryPoint");
            throw AnonymousClass00P.createAndThrow();
        } else {
            ChP(new C22030Xtl(str, str2, (String) null, (String) null, (String) null, (Map) null, (Map) null, (Map) null));
        }
    }

    public final void A06(String str, String str2, String str3, String str4) {
        0qQ.A0B(str3, 2);
        A07(str, str2, str3, str4, (String) null);
    }

    public final void A07(String str, String str2, String str3, String str4, String str5) {
        0qQ.A0B(str3, 2);
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        A1H.put(AnonymousClass000.A00(1792), str3);
        if (str4 != null) {
            A1H.put("media_index", str4);
        }
        if (str5 != null) {
            A1H.put("media_id", str5);
        }
        String str6 = this.A00;
        if (str6 == null) {
            0qQ.A0F("entryPoint");
            throw AnonymousClass00P.createAndThrow();
        } else {
            Ckp(new C22030Xtl(str, str6, str2, (String) null, (String) null, (Map) null, A1H, (Map) null));
        }
    }

    public final void ChP(C22030Xtl xtl) {
        0qQ.A0B(xtl, 0);
        0Aj A0e = AnonymousClass7TE.A0e(this.A01, "inspiration_hub_cancel");
        if (A0e.isSampled()) {
            String str = xtl.A01;
            if (str != null) {
                C22030Xtl.A06(A0e, xtl, str);
                C21053XCe.A15(A0e, this.A02);
                A00(A0e, xtl);
                A02(A0e, xtl);
                A0e.Cgf();
                return;
            }
            throw AnonymousClass7TE.A0y();
        }
    }

    public final void ChY(C22030Xtl xtl) {
    }

    public final void Ci5(C22030Xtl xtl) {
        0qQ.A0B(xtl, 0);
        0Aj A0e = AnonymousClass7TE.A0e(this.A01, "inspiration_hub_fetch_data");
        if (A0e.isSampled()) {
            C21053XCe.A15(A0e, this.A02);
            String str = xtl.A01;
            if (str != null) {
                C22030Xtl.A06(A0e, xtl, str);
                C22030Xtl.A02(A0e, xtl);
                A01(A0e, xtl);
                A00(A0e, xtl);
                A02(A0e, xtl);
                A0e.Cgf();
                return;
            }
            throw AnonymousClass7TE.A0y();
        }
    }

    public final void Ci6(C22030Xtl xtl) {
        0qQ.A0B(xtl, 0);
        0Aj A0e = AnonymousClass7TE.A0e(this.A01, "inspiration_hub_fetch_data_error");
        if (A0e.isSampled()) {
            A0e.AAJ("step", xtl.A04);
            C21053XCe.A15(A0e, this.A02);
            C22030Xtl.A08(A0e, xtl, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, xtl.A01);
            String str = xtl.A03;
            if (str != null) {
                A0e.AAJ("error_message", str);
            }
            String str2 = xtl.A02;
            if (str2 != null) {
                A0e.AAJ("error_identifier", str2);
            }
            A01(A0e, xtl);
            A00(A0e, xtl);
            A02(A0e, xtl);
            A0e.Cgf();
        }
    }

    public final void Ci7(C22030Xtl xtl) {
        0qQ.A0B(xtl, 0);
        0Aj A0e = AnonymousClass7TE.A0e(this.A01, "inspiration_hub_finish_step");
        if (A0e.isSampled()) {
            String str = xtl.A01;
            if (str != null) {
                C22030Xtl.A06(A0e, xtl, str);
                C21053XCe.A15(A0e, this.A02);
                A01(A0e, xtl);
                A00(A0e, xtl);
                A02(A0e, xtl);
                A0e.Cgf();
                return;
            }
            throw AnonymousClass7TE.A0y();
        }
    }

    public final void CkV(C22030Xtl xtl) {
    }

    public final void Cka(C22030Xtl xtl) {
        0qQ.A0B(xtl, 0);
        0Aj A0e = AnonymousClass7TE.A0e(this.A01, "inspiration_hub_start_step");
        if (A0e.isSampled()) {
            String str = xtl.A01;
            if (str != null) {
                C22030Xtl.A06(A0e, xtl, str);
                C21053XCe.A15(A0e, this.A02);
                A01(A0e, xtl);
                A00(A0e, xtl);
                A02(A0e, xtl);
                A0e.Cgf();
                return;
            }
            throw AnonymousClass7TE.A0y();
        }
    }

    public final void Ckg(C22030Xtl xtl) {
    }

    public final void Ckh(C22030Xtl xtl) {
    }

    public final void Ckp(C22030Xtl xtl) {
        0qQ.A0B(xtl, 0);
        0Aj A0e = AnonymousClass7TE.A0e(this.A01, "inspiration_hub_tap_component");
        if (A0e.isSampled()) {
            String str = xtl.A01;
            if (str != null) {
                C22030Xtl.A06(A0e, xtl, str);
                C22030Xtl.A08(A0e, xtl, "waterfall_id", this.A02);
                A01(A0e, xtl);
                A00(A0e, xtl);
                A02(A0e, xtl);
                A0e.Cgf();
                return;
            }
            throw AnonymousClass7TE.A0y();
        }
    }

    public final void ClC(C22030Xtl xtl) {
        0qQ.A0B(xtl, 0);
        0Aj A0e = AnonymousClass7TE.A0e(this.A01, "inspiration_hub_view_component");
        if (A0e.isSampled()) {
            String str = xtl.A01;
            if (str != null) {
                C22030Xtl.A06(A0e, xtl, str);
                C22030Xtl.A08(A0e, xtl, "waterfall_id", this.A02);
                A01(A0e, xtl);
                A00(A0e, xtl);
                A02(A0e, xtl);
                A0e.Cgf();
                return;
            }
            throw AnonymousClass7TE.A0y();
        }
    }

    public final void A04(String str) {
        String str2 = this.A00;
        if (str2 != null) {
            Ci7(new C22030Xtl(str, str2, (String) null, (String) null, (String) null, (Map) null, (Map) null, (Map) null));
        }
    }

    public final void A05(String str, String str2) {
        if (str2 != null) {
            this.A00 = str2;
        }
        String str3 = this.A00;
        if (str3 != null) {
            Cka(new C22030Xtl(str, str3, (String) null, (String) null, (String) null, (Map) null, (Map) null, (Map) null));
        }
    }

    public C22338Xzn(AnonymousClass0iw r2, UserSession userSession) {
        AnonymousClass7TG.A1O(userSession, r2);
        this.A01 = AnonymousClass0kN.A01(r2, userSession);
        String obj = UUID.randomUUID().toString();
        0qQ.A07(obj);
        this.A02 = obj;
    }

    public static void A00(0Aj r2, C22030Xtl xtl) {
        Map A0B = xtl.A0B();
        if (A0B != null) {
            r2.A9H("selected_values", A0B);
        }
    }

    public static void A01(0Aj r2, C22030Xtl xtl) {
        Map A09 = xtl.A09();
        if (A09 != null) {
            r2.A9H("available_options", A09);
        }
    }

    public static void A02(0Aj r2, C22030Xtl xtl) {
        Map A0A = xtl.A0A();
        if (A0A != null) {
            r2.A9H("default_values", A0A);
        }
    }
}
