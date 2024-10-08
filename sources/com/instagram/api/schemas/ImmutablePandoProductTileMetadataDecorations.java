package com.instagram.api.schemas;

import X.17P;
import X.1E9;
import X.AnonymousClass7TG;
import X.AnonymousClass7TH;
import X.C3035269k;
import X.CTB;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;

public final class ImmutablePandoProductTileMetadataDecorations extends 17P implements ProductTileMetadataDecorations {
    public static final C3035269k CREATOR = CTB.A00(56);

    public final List AfJ() {
        return A0o(-336959801, ImmutablePandoProductTileBannerMetadataDecoration.class);
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoProductTileMetadataDecorations] */
    public final boolean BC0() {
        return getBooleanValueByHashCode(103379179);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoProductTileMetadataDecorations] */
    public final boolean BvH() {
        return getBooleanValueByHashCode(445905929);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoProductTileMetadataDecorations] */
    public final boolean Bvo() {
        return getBooleanValueByHashCode(1441419896);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoProductTileMetadataDecorations] */
    public final boolean Bvp() {
        return getBooleanValueByHashCode(454837273);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoProductTileMetadataDecorations] */
    public final boolean Bvt() {
        return getBooleanValueByHashCode(-1813196302);
    }

    public final ProductTileContext CHg() {
        return (ProductTileContext) A05(951530927, ImmutablePandoProductTileContext.class);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoProductTileMetadataDecorations] */
    public final Boolean CdM() {
        return getOptionalBooleanValueByHashCode(618262526);
    }

    /* JADX WARNING: type inference failed for: r11v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoProductTileMetadataDecorations] */
    public final ProductTileMetadataDecorationsImpl F83(1E9 r12) {
        ProductTileContextImpl productTileContextImpl;
        List<ProductTileBannerMetadataDecoration> AfJ = AfJ();
        ArrayList A0r = AnonymousClass7TG.A0r(AfJ);
        for (ProductTileBannerMetadataDecoration F7x : AfJ) {
            A0r.add(F7x.F7x());
        }
        ProductTileContext CHg = CHg();
        if (CHg != null) {
            productTileContextImpl = CHg.F7y(r12);
        } else {
            productTileContextImpl = null;
        }
        return new ProductTileMetadataDecorationsImpl(productTileContextImpl, getOptionalBooleanValueByHashCode(618262526), A0r, getBooleanValueByHashCode(103379179), getBooleanValueByHashCode(2003884718), getBooleanValueByHashCode(445905929), getBooleanValueByHashCode(2137929178), getBooleanValueByHashCode(1441419896), getBooleanValueByHashCode(454837273), getBooleanValueByHashCode(-1813196302));
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoProductTileMetadataDecorations] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
