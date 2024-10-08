package com.instagram.api.schemas;

import X.17P;
import X.AnonymousClass7TH;
import X.C3035269k;
import X.CTB;
import X.DLO;
import android.os.Parcel;

public final class ImmutablePandoOpenInspirationHubCommand extends 17P implements OpenInspirationHubCommand {
    public static final C3035269k CREATOR = CTB.A00(30);

    public final XDTCreatorInspirationHubType C4R() {
        return (XDTCreatorInspirationHubType) A0N(486944743, DLO.A00);
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    public final OpenInspirationHubCommandImpl F79() {
        return new OpenInspirationHubCommandImpl(C4R());
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoOpenInspirationHubCommand] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
