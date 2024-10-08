package X;

import android.os.Bundle;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.leadgen.core.model.LeadGenProfileContentInfo;

public final class U8H extends AnonymousClass9YH {
    public final AnonymousClass0iw A00;
    public final UserSession A01;
    public final String A02;

    public final 2YL A02(C319836rJ r22, Class cls, String str) {
        C18027Vk5 vk5;
        C17361VSo vSo;
        C319836rJ r2 = r22;
        boolean A1b = C51973G9u.A1b(str, cls, r2);
        String str2 = (String) r2.A00("formID");
        if (str2 != null) {
            vk5 = C18544Vtw.A01.A00(str2);
        } else {
            vk5 = null;
        }
        LeadGenProfileContentInfo leadGenProfileContentInfo = (LeadGenProfileContentInfo) r2.A00("arg_profile_content_info");
        String str3 = (String) r2.A00("arg_form_page_type");
        if (vk5 != null) {
            UserSession userSession = this.A01;
            AnonymousClass0iw r8 = this.A00;
            String str4 = (String) r2.A00("adID");
            String str5 = (String) r2.A00("trackingToken");
            String str6 = (String) r2.A00("ad_creation_source");
            if (str6 == null) {
                str6 = "UNKNOWN";
            }
            String str7 = (String) r2.A00(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
            if (str7 == null) {
                str7 = 2EG.A46.toString();
            }
            WYW wyw = new WYW(r8, userSession, str4, str5, str2, str6, str7, (String) r2.A00("advertiser_fbidv2"), this.A02, C18809W3g.A06(vk5), vk5.A02(), AnonymousClass7TF.A1V(vk5.A00.A00), AnonymousClass7TF.A1Y(r2.A00("is_form_extension"), A1b));
            String str8 = (String) r2.A00(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
            if (str8 == null) {
                str8 = 2EG.A46.toString();
            }
            vSo = new C17361VSo(wyw, str8);
        } else {
            vSo = null;
        }
        return new C14774U8k(this.A01, vSo, leadGenProfileContentInfo, str3);
    }

    public U8H(Bundle bundle, AnonymousClass0g9 r3, AnonymousClass0iw r4) {
        super(bundle, r3);
        this.A00 = r4;
        this.A01 = DbS.A0U(bundle);
        this.A02 = C18809W3g.A02(bundle);
    }
}
