package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.base.IgReactQEModule;
import java.util.Map;
import kotlin.Deprecated;

/* renamed from: X.Hs7  reason: case insensitive filesystem */
public final class C56058Hs7 {
    public final 0wc A00;

    public C56058Hs7(AnonymousClass0iw r2, UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A00 = AnonymousClass0kN.A01(r2, userSession);
    }

    @Deprecated(message = "For all future logs use logUpsellsEvent")
    public final void A01(String str, String str2, String str3) {
        0qQ.A0B(str3, 2);
        0Aj A0e = AnonymousClass7TE.A0e(this.A00, "instagram_wellbeing_upsells_impression");
        if (A0e.isSampled()) {
            Map A0w = AnonymousClass7TF.A0w("nav_chain", DbS.A0k());
            DbS.A1M(A0e, str);
            C51969G9p.A1F(A0e, "entrypoint", str3, A0w);
            if (str2 != null) {
                A0e.AAJ(AnonymousClass9NE.A00(), str2);
            }
            A0e.Cgf();
        }
    }

    @Deprecated(message = "For all future logs use logUpsellsEvent")
    public final void A02(String str, String str2, String str3, String str4) {
        0qQ.A0B(str3, 2);
        0Aj A0e = AnonymousClass7TE.A0e(this.A00, C273654mx.A00(2887));
        if (A0e.isSampled()) {
            Map A0w = AnonymousClass7TF.A0w("nav_chain", DbS.A0k());
            DbS.A1M(A0e, str);
            DbS.A1H(A0e, str4);
            C51969G9p.A1F(A0e, "entrypoint", str3, A0w);
            if (str2 != null) {
                A0e.AAJ(AnonymousClass9NE.A00(), str2);
            }
            A0e.Cgf();
        }
    }

    public final void A00(C54660HMr hMr, C54658HMp hMp, Integer num, Integer num2, String str, Map map) {
        String str2;
        String str3;
        String str4;
        AnonymousClass7TG.A1R(hMp, map);
        0Aj A0e = AnonymousClass7TE.A0e(this.A00, AnonymousClass000.A00(3311));
        if (A0e.isSampled()) {
            map.put("nav_chain", DbS.A0k());
            switch (num.intValue()) {
                case 0:
                    str2 = "undo_snackbar";
                    break;
                case 1:
                    str2 = "bottom_sheet";
                    break;
                case 2:
                    str2 = "main_app";
                    break;
                default:
                    str2 = "messages_screen";
                    break;
            }
            DbS.A1M(A0e, str2);
            switch (num2.intValue()) {
                case 0:
                    str3 = "display_bottomsheet";
                    break;
                case 1:
                    str3 = "dismiss_bottomsheet";
                    break;
                case 2:
                    str3 = "save_setting";
                    break;
                case 3:
                    str3 = "save_setting_success";
                    break;
                case 4:
                    str3 = "save_setting_failed";
                    break;
                case 5:
                    str3 = "display_undo_snackbar";
                    break;
                case 6:
                    str3 = "click_undo_snackbar";
                    break;
                case 7:
                    str3 = "undo_setting_success";
                    break;
                case 8:
                    str3 = "undo_setting_failed";
                    break;
                case 9:
                    str3 = "link_clicked";
                    break;
                case 10:
                    str3 = AnonymousClass000.A00(3880);
                    break;
                case 11:
                    str3 = AnonymousClass000.A00(2988);
                    break;
                case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                    str3 = "null_view_model";
                    break;
                case 13:
                    str3 = "sync_setting";
                    break;
                case 14:
                    str3 = "sync_setting_failed";
                    break;
                default:
                    str3 = "do_not_show_bottomsheet";
                    break;
            }
            DbS.A1H(A0e, str3);
            A0e.AAJ(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, hMp.A00);
            if (hMr == null || (str4 = hMr.A00) == null) {
                str4 = "";
            }
            C51969G9p.A1F(A0e, "entrypoint", str4, map);
            if (str != null) {
                A0e.AAJ(AnonymousClass9NE.A00(), str);
            }
            A0e.Cgf();
        }
    }
}
