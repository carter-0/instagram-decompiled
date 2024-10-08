package X;

import com.instagram.api.schemas.BCPDealOutputTypeEnum;
import com.instagram.api.schemas.BrandedContentProjectAction;
import com.instagram.api.schemas.BrandedContentProjectMetadataIntf;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Kq2  reason: case insensitive filesystem */
public abstract /* synthetic */ class C63012Kq2 {
    public static Map A00(BrandedContentProjectMetadataIntf brandedContentProjectMetadataIntf) {
        String str;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (brandedContentProjectMetadataIntf.AYA() != null) {
            BrandedContentProjectAction AYA = brandedContentProjectMetadataIntf.AYA();
            0qQ.A0B(AYA, 0);
            A1H.put("action", AYA.A00);
        }
        if (brandedContentProjectMetadataIntf.Aa1() != null) {
            A1H.put("ads_permission_required", brandedContentProjectMetadataIntf.Aa1());
        }
        if (brandedContentProjectMetadataIntf.Ahf() != null) {
            A1H.put("brand_id", brandedContentProjectMetadataIntf.Ahf());
        }
        if (brandedContentProjectMetadataIntf.Ahm() != null) {
            A1H.put("brand_username", brandedContentProjectMetadataIntf.Ahm());
        }
        if (brandedContentProjectMetadataIntf.Aju() != null) {
            A1H.put("campaign_app_android_package_name", brandedContentProjectMetadataIntf.Aju());
        }
        if (brandedContentProjectMetadataIntf.Ajv() != null) {
            A1H.put("campaign_app_ios_content_id", brandedContentProjectMetadataIntf.Ajv());
        }
        if (brandedContentProjectMetadataIntf.AvT() != null) {
            BCPDealOutputTypeEnum AvT = brandedContentProjectMetadataIntf.AvT();
            if (AvT != null) {
                str = AvT.A00;
            } else {
                str = null;
            }
            A1H.put("deal_output_type", str);
        }
        if (brandedContentProjectMetadataIntf.Bhc() != null) {
            A1H.put("project_id", brandedContentProjectMetadataIntf.Bhc());
        }
        if (brandedContentProjectMetadataIntf.Bhd() != null) {
            A1H.put("project_name", brandedContentProjectMetadataIntf.Bhd());
        }
        return 0Yt.A0B(A1H);
    }
}
