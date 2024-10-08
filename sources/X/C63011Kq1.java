package X;

import com.instagram.api.schemas.BrandedContentBrandTaggingRequestApprovalStatus;

/* renamed from: X.Kq1  reason: case insensitive filesystem */
public abstract class C63011Kq1 {
    public static final BrandedContentBrandTaggingRequestApprovalStatus A00(String str) {
        BrandedContentBrandTaggingRequestApprovalStatus brandedContentBrandTaggingRequestApprovalStatus = (BrandedContentBrandTaggingRequestApprovalStatus) BrandedContentBrandTaggingRequestApprovalStatus.A01.get(str);
        if (brandedContentBrandTaggingRequestApprovalStatus == null) {
            return BrandedContentBrandTaggingRequestApprovalStatus.UNRECOGNIZED;
        }
        return brandedContentBrandTaggingRequestApprovalStatus;
    }
}
