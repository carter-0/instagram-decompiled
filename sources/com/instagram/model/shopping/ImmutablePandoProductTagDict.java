package com.instagram.model.shopping;

import X.17P;
import X.1E9;
import X.AnonymousClass7TH;
import X.AnonymousClass91G;
import X.C3035269k;
import X.C41845B3m;
import X.C41847B3o;
import X.C41848B3p;
import X.CTA;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.user.model.ProductDetailsProductItemDict;
import com.instagram.user.model.ProductDetailsProductItemDictIntf;
import java.util.List;

public final class ImmutablePandoProductTagDict extends 17P implements ProductTagDictIntf {
    public static final C3035269k CREATOR = CTA.A00(41);
    public ProductDetailsProductItemDictIntf A00;

    public final ProductDetailsProductItemDictIntf Bfu() {
        return C41847B3o.A0x(this, this.A00);
    }

    public final ProductTagDictIntf EA4(1E9 r2) {
        this.A00 = C41848B3p.A1A(r2, C41847B3o.A0x(this, this.A00));
        return this;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.model.shopping.ProductTagDictIntf, com.instagram.model.shopping.ImmutablePandoProductTagDict] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, AnonymousClass91G.A00(this));
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.model.shopping.ImmutablePandoProductTagDict] */
    public final Integer Awa() {
        return getOptionalIntValueByHashCode(-1429847026);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.model.shopping.ImmutablePandoProductTagDict] */
    public final Integer BDI() {
        return getOptionalIntValueByHashCode(-1773577443);
    }

    public final List Bdo() {
        return A0l(747804969);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.model.shopping.ImmutablePandoProductTagDict] */
    public final Boolean Caf() {
        return getOptionalBooleanValueByHashCode(-28848122);
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [com.facebook.pando.TreeJNI, com.instagram.model.shopping.ImmutablePandoProductTagDict, X.17P] */
    public final ProductTagDict FFM(1E9 r7) {
        ProductDetailsProductItemDict productDetailsProductItemDict;
        Integer optionalIntValueByHashCode = getOptionalIntValueByHashCode(-1429847026);
        Integer optionalIntValueByHashCode2 = getOptionalIntValueByHashCode(-1773577443);
        Boolean optionalBooleanValueByHashCode = getOptionalBooleanValueByHashCode(-28848122);
        List A0l = A0l(747804969);
        ProductDetailsProductItemDictIntf A0x = C41847B3o.A0x(this, this.A00);
        if (A0x != null) {
            productDetailsProductItemDict = A0x.FGq(r7);
        } else {
            productDetailsProductItemDict = null;
        }
        return new ProductTagDict(productDetailsProductItemDict, optionalBooleanValueByHashCode, optionalIntValueByHashCode, optionalIntValueByHashCode2, A0l);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.model.shopping.ImmutablePandoProductTagDict] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
