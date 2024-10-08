package X;

import com.instagram.api.schemas.BCPDealOutputTypeEnum;
import com.instagram.api.schemas.BrandedContentProjectAction;
import com.instagram.api.schemas.BrandedContentProjectMetadata;
import java.io.IOException;

public abstract class LGt {
    public static BrandedContentProjectMetadata parseFromJson(16F r15) {
        String str;
        String str2;
        0qQ.A0B(r15, 0);
        try {
            if (r15.A11() != 16L.A0D) {
                r15.A0z();
                return null;
            }
            BrandedContentProjectAction brandedContentProjectAction = null;
            Boolean bool = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            BCPDealOutputTypeEnum bCPDealOutputTypeEnum = null;
            String str7 = null;
            String str8 = null;
            while (r15.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r15);
                if ("action".equals(A17)) {
                    if (r15.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r15.A1P();
                    }
                    brandedContentProjectAction = (BrandedContentProjectAction) BrandedContentProjectAction.A01.get(str2);
                    if (brandedContentProjectAction == null) {
                        brandedContentProjectAction = BrandedContentProjectAction.UNRECOGNIZED;
                    }
                } else if ("ads_permission_required".equals(A17)) {
                    bool = AnonymousClass7TF.A0S(r15);
                } else if ("brand_id".equals(A17)) {
                    if (r15.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r15.A1P();
                    }
                } else if ("brand_username".equals(A17)) {
                    if (r15.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r15.A1P();
                    }
                } else if ("campaign_app_android_package_name".equals(A17)) {
                    if (r15.A11() == 16L.A0G) {
                        str5 = null;
                    } else {
                        str5 = r15.A1P();
                    }
                } else if ("campaign_app_ios_content_id".equals(A17)) {
                    if (r15.A11() == 16L.A0G) {
                        str6 = null;
                    } else {
                        str6 = r15.A1P();
                    }
                } else if ("deal_output_type".equals(A17)) {
                    if (r15.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r15.A1P();
                    }
                    bCPDealOutputTypeEnum = (BCPDealOutputTypeEnum) BCPDealOutputTypeEnum.A01.get(str);
                    if (bCPDealOutputTypeEnum == null) {
                        bCPDealOutputTypeEnum = BCPDealOutputTypeEnum.UNRECOGNIZED;
                    }
                } else if ("project_id".equals(A17)) {
                    if (r15.A11() == 16L.A0G) {
                        str7 = null;
                    } else {
                        str7 = r15.A1P();
                    }
                } else if ("project_name".equals(A17)) {
                    if (r15.A11() == 16L.A0G) {
                        str8 = null;
                    } else {
                        str8 = r15.A1P();
                    }
                }
                r15.A0z();
            }
            if (brandedContentProjectAction == null && (r15 instanceof 0c9)) {
                AnonymousClass7TF.A1L("action", r15, "BrandedContentProjectMetadata");
            } else if (str7 != null || !(r15 instanceof 0c9)) {
                return new BrandedContentProjectMetadata(bCPDealOutputTypeEnum, brandedContentProjectAction, bool, str3, str4, str5, str6, str7, str8);
            } else {
                AnonymousClass7TF.A1L("project_id", r15, "BrandedContentProjectMetadata");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }

    public static void A00(17Z r2, BrandedContentProjectMetadata brandedContentProjectMetadata) {
        r2.A0c();
        BrandedContentProjectAction brandedContentProjectAction = brandedContentProjectMetadata.A01;
        if (brandedContentProjectAction != null) {
            r2.A0R("action", brandedContentProjectAction.A00);
        }
        Boolean bool = brandedContentProjectMetadata.A02;
        if (bool != null) {
            r2.A0S("ads_permission_required", bool.booleanValue());
        }
        String str = brandedContentProjectMetadata.A03;
        if (str != null) {
            r2.A0R("brand_id", str);
        }
        String str2 = brandedContentProjectMetadata.A04;
        if (str2 != null) {
            r2.A0R("brand_username", str2);
        }
        String str3 = brandedContentProjectMetadata.A05;
        if (str3 != null) {
            r2.A0R("campaign_app_android_package_name", str3);
        }
        String str4 = brandedContentProjectMetadata.A06;
        if (str4 != null) {
            r2.A0R("campaign_app_ios_content_id", str4);
        }
        BCPDealOutputTypeEnum bCPDealOutputTypeEnum = brandedContentProjectMetadata.A00;
        if (bCPDealOutputTypeEnum != null) {
            r2.A0R("deal_output_type", bCPDealOutputTypeEnum.A00);
        }
        String str5 = brandedContentProjectMetadata.A07;
        if (str5 != null) {
            r2.A0R("project_id", str5);
        }
        String str6 = brandedContentProjectMetadata.A08;
        if (str6 != null) {
            r2.A0R("project_name", str6);
        }
        r2.A0Z();
    }
}
