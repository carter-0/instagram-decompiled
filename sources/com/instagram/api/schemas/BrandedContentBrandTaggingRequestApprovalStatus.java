package com.instagram.api.schemas;

import X.0oU;
import X.AnonymousClass7TG;
import X.DbS;
import X.Dbb;
import X.SWT;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;

public enum BrandedContentBrandTaggingRequestApprovalStatus implements Parcelable {
    UNRECOGNIZED("BrandedContentBrandTaggingRequestApprovalStatus_unspecified"),
    REQUEST_CANCELLED_BY_CREATOR("request_cancelled_by_creator"),
    REQUEST_DECLINED("request_declined"),
    REQUEST_LIMIT_REACHED("request_limit_reached"),
    REQUEST_ONCE_GRANTED("request_once_granted"),
    REQUEST_PENDING("request_pending"),
    REQUEST_REJECTED_BY_BRAND("request_rejected_by_brand");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        BrandedContentBrandTaggingRequestApprovalStatus[] brandedContentBrandTaggingRequestApprovalStatusArr;
        A02 = 0oU.A00(brandedContentBrandTaggingRequestApprovalStatusArr);
        LinkedHashMap A0x = DbS.A0x(AnonymousClass7TG.A01(r3));
        for (BrandedContentBrandTaggingRequestApprovalStatus brandedContentBrandTaggingRequestApprovalStatus : values()) {
            A0x.put(brandedContentBrandTaggingRequestApprovalStatus.A00, brandedContentBrandTaggingRequestApprovalStatus);
        }
        A01 = A0x;
        CREATOR = new SWT(68);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    BrandedContentBrandTaggingRequestApprovalStatus(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
