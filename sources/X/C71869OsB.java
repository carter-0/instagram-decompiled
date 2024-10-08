package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.rtc.RtcCallKey;
import com.instagram.react.modules.base.IgReactQEModule;

/* renamed from: X.OsB  reason: case insensitive filesystem */
public final class C71869OsB implements AnonymousClass0iw {
    public static final String __redex_internal_original_name = "RtcAvatarLoggerImpl";
    public RtcCallKey A00;
    public final ONT A01;
    public final C70929OSc A02;
    public final 0wc A03;
    public final AnonymousClass1FE A04 = new Object();
    public final C69277Nid A05;

    public static final void A00(C71869OsB osB, Integer num, Integer num2, String str, String str2) {
        String str3;
        C69277Nid nid;
        String str4 = null;
        ONT ont = osB.A01;
        if (ont.A01() || !((nid = osB.A05) == C69277Nid.P2P_E2EE || nid == C69277Nid.GVC_E2EE)) {
            boolean A012 = ont.A01();
            0Aj A0e = AnonymousClass7TE.A0e(osB.A03, "rtc_avatar_call_action");
            A0e.AAJ(AnonymousClass000.A00(238), O24.A00(num2));
            switch (num.intValue()) {
                case 0:
                    str3 = "enable_avatar_mode_did_tap";
                    break;
                case 1:
                    str3 = "disable_avatar_mode_did_tap";
                    break;
                case 2:
                    str3 = "avatar_effect_did_apply";
                    break;
                case 3:
                    str3 = "avatar_effect_did_fail_to_apply";
                    break;
                case 4:
                    str3 = "avatar_creation_nux_did_show";
                    break;
                case 5:
                    str3 = "avatar_creation_nux_did_tap";
                    break;
                case 6:
                    str3 = "call_end_avatar_promo_impression";
                    break;
                case 7:
                    str3 = "call_end_avatar_promo_button_tapped";
                    break;
                case 8:
                    str3 = "avatar_in_call_personalised_promo_shown";
                    break;
                case 9:
                    str3 = "avatar_in_call_custom_promo_shown";
                    break;
                case 10:
                    str3 = "avatar_in_call_personalised_promo_tapped";
                    break;
                case 11:
                    str3 = "avatar_in_call_custom_promo_tapped";
                    break;
                case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                    str3 = "avatar_in_call_discovery_promo_shown";
                    break;
                case 13:
                    str3 = "avatar_in_call_discovery_promo_tapped";
                    break;
                case 14:
                    str3 = "avatar_in_call_app_upgrade_upsell_shown";
                    break;
                case 15:
                    str3 = "avatar_in_call_app_upgrade_upsell_dismissed";
                    break;
                case 16:
                    str3 = "avatar_is_generating_notification_did_show";
                    break;
                case 17:
                    str3 = "avatar_loading_notification_did_show";
                    break;
                default:
                    str3 = "avatar_loading_error_notification_did_show";
                    break;
            }
            A0e.AAJ(C273654mx.A00(37), str3);
            A0e.A9F("steady_time", Long.valueOf(osB.A04.now()));
            if (A012) {
                str = "1004";
            }
            A0e.AAJ("effect_id", str);
            if (A012) {
                str2 = null;
            }
            A0e.AAJ(AnonymousClass000.A00(1294), str2);
            A0e.AAJ("emote_id", (String) null);
            A0e.AAJ("emote_name", (String) null);
            RtcCallKey rtcCallKey = osB.A00;
            if (rtcCallKey != null) {
                str4 = rtcCallKey.A00;
            }
            A0e.AAJ("server_info_data", str4);
            A0e.AAJ(C273654mx.A00(556), (String) null);
            A0e.Cgf();
        }
    }

    public final String getModuleName() {
        return "rtc_avatar";
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [X.1FE, java.lang.Object] */
    public /* synthetic */ C71869OsB(UserSession userSession, C69277Nid nid, RtcCallKey rtcCallKey) {
        C70929OSc oSc = new C70929OSc(02m.A0p);
        ONT ont = new ONT(userSession);
        this.A00 = rtcCallKey;
        this.A05 = nid;
        this.A02 = oSc;
        this.A01 = ont;
        this.A03 = AnonymousClass0kN.A01(this, userSession);
    }
}
