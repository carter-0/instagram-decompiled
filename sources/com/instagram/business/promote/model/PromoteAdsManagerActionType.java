package com.instagram.business.promote.model;

import X.0oU;
import X.C17754VeW;
import X.Pxg;
import X.W6D;
import android.os.Parcel;
import android.os.Parcelable;

public enum PromoteAdsManagerActionType implements Parcelable {
    APPEAL,
    EDIT,
    LEARN_MORE,
    LEARN_MORE_FOR_NOT_DELIVERING_PROMOTION,
    PAUSE,
    PAY_NOW,
    PROMOTE_AGAIN,
    RESUME,
    REVIEW,
    VIEW_APPEAL,
    DRAFT,
    SPEND_LIMIT_REACHED;
    
    public static final C17754VeW A00 = null;
    public static final Parcelable.Creator CREATOR = null;

    public final int describeContents() {
        return 0;
    }

    /* JADX WARNING: type inference failed for: r0v14, types: [java.lang.Object, X.VeW] */
    /* access modifiers changed from: public */
    static {
        PromoteAdsManagerActionType[] promoteAdsManagerActionTypeArr;
        A01 = 0oU.A00(promoteAdsManagerActionTypeArr);
        A00 = new Object();
        CREATOR = new W6D(29);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Pxg.A1G(parcel, this);
    }
}
