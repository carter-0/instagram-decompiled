package com.instagram.api.schemas;

import X.17P;
import X.AnonymousClass7TH;
import X.C3035269k;
import X.CTC;
import X.J04;
import android.os.Parcel;

public final class ImmutablePandoChallengeButtonInfo extends 17P implements ChallengeButtonInfo {
    public static final C3035269k CREATOR = new CTC(26);

    public final ChallengeButtonAction Aig() {
        return (ChallengeButtonAction) A0M(877541347, J04.A00);
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    public final String Air() {
        return A0h(-1759410662);
    }

    public final String Avk() {
        return A0h(1169975446);
    }

    public final ChallengeButtonInfoImpl F1I() {
        return new ChallengeButtonInfoImpl(Aig(), A0h(-1759410662), A0h(1169975446));
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoChallengeButtonInfo] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
