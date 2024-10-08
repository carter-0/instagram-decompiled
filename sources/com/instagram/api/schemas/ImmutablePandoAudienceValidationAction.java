package com.instagram.api.schemas;

import X.17P;
import X.AnonymousClass7TH;
import X.C3035269k;
import X.CTC;
import android.os.Parcel;

public final class ImmutablePandoAudienceValidationAction extends 17P implements AudienceValidationAction {
    public static final C3035269k CREATOR = CTC.A00(10);

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    public final String getCtaText() {
        return A0h(-815905284);
    }

    public final String getUrl() {
        return A0V();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoAudienceValidationAction] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
