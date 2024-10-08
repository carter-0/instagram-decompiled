package com.instagram.api.schemas;

import X.17P;
import X.AnonymousClass7TH;
import X.C3035269k;
import X.C45371CvD;
import X.C46072DLd;
import X.CTB;
import android.os.Parcel;
import java.util.List;

public final class ImmutablePandoProductTileMetadata extends 17P implements ProductTileMetadata {
    public static final C3035269k CREATOR = CTB.A00(55);

    public final /* synthetic */ C45371CvD AKK() {
        return new C45371CvD(this);
    }

    public final ProductTileMetadataDestination AwY() {
        return (ProductTileMetadataDestination) A0N(-1429847026, C46072DLd.A00);
    }

    public final List BKR() {
        return A0o(-1110417409, ImmutablePandoProductTileLabel.class);
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    public final ProductTileMetadataDecorations Avh() {
        return (ProductTileMetadataDecorations) A05(638148035, ImmutablePandoProductTileMetadataDecorations.class);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoProductTileMetadata] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
