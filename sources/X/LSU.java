package X;

import android.os.Bundle;
import com.instagram.api.schemas.BrandedContentGatingInfo;
import com.instagram.api.schemas.BrandedContentGatingInfoIntf;
import com.instagram.api.schemas.BrandedContentProjectMetadataIntf;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import java.util.List;

public abstract class LSU {
    public static Bundle A00(BrandedContentGatingInfoIntf brandedContentGatingInfoIntf, BrandedContentProjectMetadataIntf brandedContentProjectMetadataIntf, String str, String str2, List list, boolean z, boolean z2, boolean z3) {
        0qQ.A0B(list, 2);
        return Q21.A00(AnonymousClass7TE.A1L("argument_create_ad_code", Boolean.valueOf(z)), AnonymousClass7TE.A1L("argument_show_action_bar", Boolean.valueOf(z2)), AnonymousClass7TE.A1L("argument_bc_tag_list", AnonymousClass7TE.A1D(list)), AnonymousClass7TE.A1L("argument_bc_project_metadata", brandedContentProjectMetadataIntf), AnonymousClass7TE.A1L("argument_bc_gating_info", brandedContentGatingInfoIntf), AnonymousClass7TE.A1L("argument_is_paid_partnership_label", Boolean.valueOf(z3)), AnonymousClass7TE.A1L("argument_media_type", str), AnonymousClass7TE.A1L("media_id", str2));
    }

    public static K8W A03(BrandedContentGatingInfoIntf brandedContentGatingInfoIntf, String str, String str2, List list, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        DbW.A1N(list, 0, str);
        K8W k8w = new K8W();
        DbT.A1N(k8w, new 0eP[]{AnonymousClass7TE.A1L("brand_partners", AnonymousClass7TE.A1D(list)), AnonymousClass7TE.A1L("BRANDED_CONTENT_GATING_INFO", brandedContentGatingInfoIntf), AnonymousClass7TE.A1L("disclosure_fragment_entered_from_brand_search", Boolean.valueOf(z)), AnonymousClass7TE.A1L("disclosure_fragment_is_edit_flow", Boolean.valueOf(z2)), AnonymousClass7TE.A1L("disclosure_fragment_is_paid_partnership_on", Boolean.valueOf(z3)), AnonymousClass7TE.A1L("ARGUMENT_MEDIA_ID", str2), AnonymousClass7TE.A1L("ARGUMENT_MEDIA_TYPE", str), AnonymousClass7TE.A1L("has_interactive_elements_for_story", Boolean.valueOf(z4)), AnonymousClass7TE.A1L("includes_suspected_sponsor", Boolean.valueOf(z5))});
        return k8w;
    }

    public static K8V A04(BrandedContentGatingInfoIntf brandedContentGatingInfoIntf, BrandedContentProjectMetadataIntf brandedContentProjectMetadataIntf, String str, String str2, List list, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
        0qQ.A0B(list, 0);
        K8V k8v = new K8V();
        DbT.A1N(k8v, new 0eP[]{AnonymousClass7TE.A1L("brand_partners", AnonymousClass7TE.A1D(list)), AnonymousClass7TE.A1L("project_metadata", brandedContentProjectMetadataIntf), AnonymousClass7TE.A1L("BRANDED_CONTENT_GATING_INFO", brandedContentGatingInfoIntf), AnonymousClass7TE.A1L("disclosure_fragment_entered_from_brand_search", Boolean.valueOf(z)), AnonymousClass7TE.A1L("disclosure_fragment_is_edit_flow", Boolean.valueOf(z2)), AnonymousClass7TE.A1L("disclosure_fragment_is_paid_partnership_on", Boolean.valueOf(z3)), AnonymousClass7TE.A1L("ARGUMENT_MEDIA_TYPE", str), AnonymousClass7TE.A1L("ARGUMENT_MEDIA_ID", str2), AnonymousClass7TE.A1L(AnonymousClass000.A00(408), Boolean.valueOf(z4)), AnonymousClass7TE.A1L("includes_suspected_sponsor", Boolean.valueOf(z5)), AnonymousClass7TE.A1L("is_from_consolidated", Boolean.valueOf(z6)), AnonymousClass7TE.A1L("is_from_ppl_and_ads_entrypoint", Boolean.valueOf(z7)), AnonymousClass7TE.A1L("argument_create_ad_code", Boolean.valueOf(z8))});
        return k8v;
    }

    public static K87 A01(BrandedContentGatingInfo brandedContentGatingInfo, String str, boolean z, boolean z2) {
        K87 k87 = new K87();
        DbT.A1N(k87, AnonymousClass7TH.A0h("entered_from_disclosure_menu", Boolean.valueOf(z2), AnonymousClass7TE.A1L("BRANDED_CONTENT_GATING_INFO", brandedContentGatingInfo), AnonymousClass7TE.A1L("ARGUMENT_MEDIA_TYPE", str), AnonymousClass7TE.A1L("ARGUMENT_IS_EDITING", Boolean.valueOf(z))));
        return k87;
    }

    public static C47486E4q A02(String str, String str2, String str3, String str4) {
        C47486E4q e4q = new C47486E4q();
        DbT.A1N(e4q, AnonymousClass7TH.A0h(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str4, AnonymousClass7TE.A1L(AnonymousClass000.A00(2081), str2), AnonymousClass7TE.A1L(Dbp.A01(), str), AnonymousClass7TE.A1L("ARGUMENT_MEDIA_ID", str3)));
        return e4q;
    }
}
