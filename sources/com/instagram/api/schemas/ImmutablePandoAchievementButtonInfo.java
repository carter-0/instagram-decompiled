package com.instagram.api.schemas;

import X.17P;
import X.AnonymousClass7TH;
import X.C3035269k;
import X.CTC;
import android.os.Parcel;

public final class ImmutablePandoAchievementButtonInfo extends 17P implements AchievementButtonInfo {
    public static final C3035269k CREATOR = CTC.A00(1);

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    public final String Air() {
        return A0h(-1759410662);
    }

    public final String Avk() {
        return A0h(1169975446);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoAchievementButtonInfo] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
