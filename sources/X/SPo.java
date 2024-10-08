package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.instagram.common.session.UserSession;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public abstract class SPo {
    public static final LinkedHashMap A00(C10860RzL rzL, 1yd r39) {
        boolean A1Z;
        boolean A1Z2;
        boolean A1Z3;
        boolean A1Z4;
        boolean A1Z5;
        boolean A1Z6;
        String A0f;
        1yd r7 = r39;
        0qQ.A0B(r7, 1);
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        0eP[] r10 = new 0eP[45];
        String valueOf = String.valueOf(false);
        0eP A1L = AnonymousClass7TE.A1L("contact_usage_on_hybrid_prompt_enabled", valueOf);
        UserSession userSession = r7.A00;
        0Tu r1 = 0Tu.A06;
        0eP A1L2 = AnonymousClass7TE.A1L("show_update_prompt_on_contact_edit", String.valueOf(DbY.A1Z(r1, userSession, 36322860545288747L)));
        0eP A1L3 = AnonymousClass7TE.A1L("enable_fix_contact_data_fetch", valueOf);
        0eP A1L4 = AnonymousClass7TE.A1L("use_logger_v2", String.valueOf(DbY.A1Z(r1, userSession, 36322860547517000L)));
        0eP A1L5 = AnonymousClass7TE.A1L("payment_autofill_regex_versions_used", Pxe.A0w(r1, userSession, 36873380867276812L));
        0eP A1L6 = AnonymousClass7TE.A1L("enable_automatic_contact_update", String.valueOf(r7.A01()));
        0eP A1L7 = AnonymousClass7TE.A1L("enable_autofill_perf_qpl_logging", String.valueOf(r7.A09(false)));
        0Tu r2 = 0Tu.A05;
        if (182.A06(r2, userSession, 36322860547582537L)) {
            A1Z = false;
        } else {
            A1Z = DbY.A1Z(r1, userSession, 36322860546665019L);
        }
        0eP A1L8 = AnonymousClass7TE.A1L("enable_autofill_perf_js_ping_logging", String.valueOf(A1Z));
        0eP A1L9 = AnonymousClass7TE.A1L("enable_autofill_usage_contact_bloks", String.valueOf(r7.A0G(false)));
        0eP A1L10 = AnonymousClass7TE.A1L("enable_autofill_save_contact_bloks", String.valueOf(r7.A0F(false)));
        if (182.A06(r2, userSession, 36322860547189315L)) {
            A1Z2 = false;
        } else {
            A1Z2 = DbY.A1Z(r1, userSession, 36322860545944115L);
        }
        0eP A1L11 = AnonymousClass7TE.A1L("enable_autofill_update_contact_bloks", String.valueOf(A1Z2));
        0eP A1L12 = AnonymousClass7TE.A1L("enable_autofill_save_payment_bloks", String.valueOf(r7.A0H(false)));
        0eP A1L13 = AnonymousClass7TE.A1L("enable_autofill_usage_payment_bloks", String.valueOf(r7.A0I(false)));
        0eP A1L14 = AnonymousClass7TE.A1L("prefetch_bloks_payment_save_on_app_start", String.valueOf(r7.A05()));
        0eP A1L15 = AnonymousClass7TE.A1L("prefetch_bloks_payment_usage_on_app_start", String.valueOf(r7.A06()));
        0eP A1L16 = AnonymousClass7TE.A1L("prefetch_bloks_contact_update_on_app_start", String.valueOf(r7.A03()));
        0eP A1L17 = AnonymousClass7TE.A1L("prefetch_bloks_contact_save_on_app_start", String.valueOf(r7.A02()));
        0eP A1L18 = AnonymousClass7TE.A1L("enable_consolidated_autofill", String.valueOf(DbY.A1Z(r1, userSession, 36322860546599482L)));
        0eP A1L19 = AnonymousClass7TE.A1L("is_multi_pills_contact_soft_keyboard_variant", valueOf);
        0eP A1L20 = AnonymousClass7TE.A1L("is_single_pill_contact_soft_keyboard_variant", valueOf);
        0eP A1L21 = AnonymousClass7TE.A1L("show_contact_soft_keyboard", valueOf);
        0eP A1L22 = AnonymousClass7TE.A1L("show_single_entry_contact_soft_keyboard", valueOf);
        0eP A1L23 = AnonymousClass7TE.A1L("show_multiple_entries_Enabled", valueOf);
        0eP A1L24 = AnonymousClass7TE.A1L("disable_unbound_cards_usage", String.valueOf(DbY.A1Z(r1, userSession, 36310430914379879L)));
        0eP A1L25 = AnonymousClass7TE.A1L("autofill_visible_fields_only", String.valueOf(DbY.A1Z(r1, userSession, 36322860549352032L)));
        if (Pxf.A1T(r2, userSession)) {
            A1Z3 = false;
        } else {
            A1Z3 = DbY.A1Z(r1, userSession, 36322860550138470L);
        }
        0eP A1L26 = AnonymousClass7TE.A1L("suppress_contact_nux_enabled", String.valueOf(A1Z3));
        if (Pxf.A1T(r2, userSession)) {
            A1Z4 = false;
        } else {
            A1Z4 = DbY.A1Z(r1, userSession, 36322860550269544L);
        }
        System.arraycopy(new 0eP[]{A1L, A1L2, A1L3, A1L4, A1L5, A1L6, A1L7, A1L8, A1L9, A1L10, A1L11, A1L12, A1L13, A1L14, A1L15, A1L16, A1L17, A1L18, A1L19, A1L20, A1L21, A1L22, A1L23, A1L24, A1L25, A1L26, AnonymousClass7TE.A1L("suppress_payment_nux_enabled", String.valueOf(A1Z4))}, 0, r10, 0, 27);
        if (Pxf.A1T(r2, userSession)) {
            A1Z5 = false;
        } else {
            A1Z5 = DbY.A1Z(r1, userSession, 36322860550466155L);
        }
        0eP A1L27 = AnonymousClass7TE.A1L("suppress_automatic_update_enabled", String.valueOf(A1Z5));
        if (Pxf.A1T(r2, userSession)) {
            A1Z6 = false;
        } else {
            A1Z6 = DbY.A1Z(r1, userSession, 36322860550204007L);
        }
        System.arraycopy(new 0eP[]{A1L27, AnonymousClass7TE.A1L("suppress_all_nux_enabled", String.valueOf(A1Z6)), AnonymousClass7TE.A1L("enable_hide_ads_consent_contact_nux", String.valueOf(DbY.A1Z(r1, userSession, 36322860550531692L))), AnonymousClass7TE.A1L("enable_hide_ads_consent_payments_nux", String.valueOf(DbY.A1Z(r1, userSession, 36322860550400618L))), AnonymousClass7TE.A1L("enable_hide_ads_consent_contact_payments_nux", String.valueOf(DbY.A1Z(r1, userSession, 36322860550335081L))), AnonymousClass7TE.A1L("enable_nux_personalization_contact", String.valueOf(DbY.A1Z(r1, userSession, 36322860550924914L))), AnonymousClass7TE.A1L("enable_nux_personalization_payment", String.valueOf(DbY.A1Z(r1, userSession, 36322860550793840L))), AnonymousClass7TE.A1L("enable_nux_personalization_contact_and_payment", String.valueOf(r7.A0B(false))), AnonymousClass7TE.A1L("payment_soft_keyboard_variant", Pxe.A0w(r1, userSession, 36885810498634400L)), AnonymousClass7TE.A1L("contact_autofill_wallet_stored_data_variant", Pxe.A0w(r1, userSession, 36885810504729262L)), AnonymousClass7TE.A1L("remove_hybrid_save_enabled", String.valueOf(r7.A0C(false))), AnonymousClass7TE.A1L("payment_disclosure_updated_style_enabled", String.valueOf(DbY.A1Z(r1, userSession, 36322860551645818L))), AnonymousClass7TE.A1L("split_hybrid_prompt_variant", Pxe.A0w(r1, userSession, 36885810499224225L)), AnonymousClass7TE.A1L("enable_contact_autofill_android_framework", String.valueOf(r7.A07(false))), AnonymousClass7TE.A1L("use_local_autofill_cvv_verification", String.valueOf(DbY.A1Z(r1, userSession, 36322860546468409L))), AnonymousClass7TE.A1L("show_lightweight_disclosure", valueOf), AnonymousClass7TE.A1L("enable_contact_automatic_autofill", String.valueOf(r7.A0A(false))), AnonymousClass7TE.A1L("lightweight_disclosure_bottomsheet_target_list", NetInfoModule.CONNECTION_TYPE_NONE)}, 0, r10, 27, 18);
        A1H.putAll(0Yt.A06(r10));
        C61080JwI jwI = rzL.A0F;
        0qQ.A0B(jwI, 0);
        Map map = (Map) jwI.A00;
        if ((!map.isEmpty()) && (A0f = Pxf.A0f(map)) != null) {
            A1H.put("autofill_qrt", A0f);
        }
        return A1H;
    }

    public static final boolean A03(1yd r3, boolean z) {
        0Tu r2;
        UserSession userSession = r3.A00;
        if (z) {
            r2 = 0Tu.A05;
        } else {
            r2 = 0Tu.A06;
        }
        return AnonymousClass7TF.A0j(DbV.A12(Pxe.A0w(r2, userSession, 36885810499224225L))).equals("pure_payment");
    }

    public static final boolean A01(C10860RzL rzL, 1yd r5, boolean z) {
        0Tu r2;
        AnonymousClass7TG.A1N(rzL, r5);
        UserSession userSession = r5.A00;
        if (z) {
            r2 = 0Tu.A05;
        } else {
            r2 = 0Tu.A06;
        }
        if (!DbY.A1Z(r2, userSession, 36322860550924914L) && !r5.A0B(z)) {
            return false;
        }
        List<C59721JVf> list = (List) rzL.A0E.A00;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        for (C59721JVf jVf : list) {
            if (jVf.A00 == AnonymousClass05K.A01 && jVf.A01 == AnonymousClass05K.A0Y) {
                return true;
            }
        }
        return false;
    }

    public static final boolean A02(C10860RzL rzL, 1yd r5, boolean z) {
        0Tu r2;
        AnonymousClass7TG.A1N(rzL, r5);
        UserSession userSession = r5.A00;
        if (z) {
            r2 = 0Tu.A05;
        } else {
            r2 = 0Tu.A06;
        }
        if (!DbY.A1Z(r2, userSession, 36322860550793840L) && !r5.A0B(z)) {
            return false;
        }
        List<C59721JVf> list = (List) rzL.A0E.A00;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        for (C59721JVf jVf : list) {
            if (jVf.A00 == AnonymousClass05K.A00 && jVf.A01 == AnonymousClass05K.A01) {
                return true;
            }
        }
        return false;
    }
}
