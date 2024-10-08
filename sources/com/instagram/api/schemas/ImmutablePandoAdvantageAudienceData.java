package com.instagram.api.schemas;

import X.17P;
import X.AnonymousClass7TH;
import X.C20723Wxw;
import X.C3035269k;
import X.CTC;
import android.os.Parcel;

public final class ImmutablePandoAdvantageAudienceData extends 17P implements AdvantageAudienceData {
    public static final C3035269k CREATOR = new CTC(3);

    public final XFBTargetingAutomationAdvantageAudienceStatus Aa9() {
        return (XFBTargetingAutomationAdvantageAudienceStatus) A0N(-1413005703, C20723Wxw.A00);
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoAdvantageAudienceData] */
    public final Integer BT2() {
        return getOptionalIntValueByHashCode(-683686230);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoAdvantageAudienceData] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
