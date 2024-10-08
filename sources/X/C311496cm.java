package X;

import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import kotlin.Deprecated;

/* renamed from: X.6cm  reason: invalid class name and case insensitive filesystem */
public final class C311496cm {
    public boolean A00;
    public final AnonymousClass0iw A01;
    public final 0wc A02;
    public final UserSession A03;
    public final String A04;

    public C311496cm(AnonymousClass0iw r2, UserSession userSession) {
        0qQ.A0B(r2, 1);
        0qQ.A0B(userSession, 2);
        this.A01 = r2;
        this.A03 = userSession;
        this.A04 = r2.getModuleName();
        this.A02 = AnonymousClass0kN.A01(r2, userSession);
    }

    public final void A01(Boolean bool, Integer num, String str) {
        0wc r2 = this.A02;
        0Aj A002 = r2.A00(r2.A00, "contact_import_upsell_impression");
        A002.AAJ("module", this.A04);
        A002.AAJ("view_module", str);
        A002.A8k("position", num);
        A002.AAJ(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, (String) null);
        A002.A7p("is_partial_ci", bool);
        A002.Cgf();
        this.A00 = true;
    }

    public final void A03(Integer num, String str, boolean z) {
        0wc r2 = this.A02;
        0Aj A002 = r2.A00(r2.A00, "contact_import_upsell_dismissed");
        A002.AAJ("module", this.A04);
        A002.AAJ("view_module", str);
        A002.A8k("position", num);
        A002.AAJ(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, (String) null);
        A002.A7p("is_partial_ci", Boolean.valueOf(z));
        A002.Cgf();
    }

    @Deprecated(message = "Use logContactImportUpsellImpression instead")
    public final void A00() {
        0wc r2 = this.A02;
        0Aj A002 = r2.A00(r2.A00, "inline_ci_upsell_impression");
        A002.AAJ("module", this.A04);
        A002.Cgf();
        this.A00 = true;
    }

    public final void A02(Boolean bool, Integer num, String str, String str2) {
        0wc r2 = this.A02;
        0Aj A002 = r2.A00(r2.A00, "contact_import_upsell_clicked");
        A002.AAJ("module", this.A04);
        A002.AAJ("view_module", str);
        A002.A8k("position", num);
        A002.AAJ(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str2);
        A002.A7p("is_partial_ci", bool);
        A002.Cgf();
    }

    public final void A04(Integer num, String str, boolean z) {
        String str2;
        0wc r2 = this.A02;
        0Aj A002 = r2.A00(r2.A00, "contacts_import_permissions_popup");
        switch (num.intValue()) {
            case 0:
                str2 = AnonymousClass000.A00(1840);
                break;
            case 1:
                str2 = "access_granted";
                break;
            case 2:
                str2 = "access_granted_from_system_settings";
                break;
            case 3:
                str2 = Pxd.A00(622);
                break;
            case 4:
                str2 = "access_denied_from_system_settings";
                break;
            default:
                str2 = "access_denied_dont_ask";
                break;
        }
        A002.AAJ("request_result", str2);
        A002.AAJ(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str);
        A002.AAJ("module", this.A04);
        A002.A7p("is_partial_ci", Boolean.valueOf(z));
        A002.Cgf();
    }
}
