package com.instagram.model.shopping.clips;

import X.17P;
import X.1E9;
import X.AnonymousClass7TG;
import X.AnonymousClass7TH;
import X.C3035269k;
import X.C41845B3m;
import X.C41847B3o;
import X.C44915Cn6;
import X.CTA;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.user.model.ImmutablePandoProductWrapper;
import com.instagram.user.model.ProductCollection;
import com.instagram.user.model.ProductCollectionImpl;
import com.instagram.user.model.ProductWrapperIntf;
import java.util.ArrayList;
import java.util.List;

public final class ImmutablePandoClipsShoppingInfo extends 17P implements ClipsShoppingInfoIntf {
    public static final C3035269k CREATOR = CTA.A00(43);
    public ProductCollection A00;
    public List A01;

    public final ClipsShoppingCTABarIntf AoB() {
        return (ClipsShoppingCTABarIntf) A05(-2003911895, ImmutablePandoClipsShoppingCTABar.class);
    }

    public final ProductCollection Aoo() {
        return C41847B3o.A0w(this, this.A00);
    }

    public final List Bga() {
        List list = this.A01;
        if (list == null) {
            return A08(-1003761308, ImmutablePandoProductWrapper.class);
        }
        return list;
    }

    public final ClipsShoppingInfoIntf EA5(1E9 r4) {
        ProductCollection A0w = C41847B3o.A0w(this, this.A00);
        ArrayList arrayList = null;
        if (A0w != null) {
            A0w.EAX(r4);
        } else {
            A0w = null;
        }
        this.A00 = A0w;
        List<ProductWrapperIntf> Bga = Bga();
        if (Bga != null) {
            arrayList = AnonymousClass7TG.A0r(Bga);
            for (ProductWrapperIntf productWrapperIntf : Bga) {
                productWrapperIntf.EAZ(r4);
                arrayList.add(productWrapperIntf);
            }
        }
        this.A01 = arrayList;
        return this;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.model.shopping.clips.ImmutablePandoClipsShoppingInfo, com.instagram.model.shopping.clips.ClipsShoppingInfoIntf] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, C44915Cn6.A00(this));
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    public final ClipsShoppingInfo FFO(1E9 r6) {
        ClipsShoppingCTABar clipsShoppingCTABar;
        ProductCollectionImpl productCollectionImpl;
        ClipsShoppingCTABarIntf AoB = AoB();
        ArrayList arrayList = null;
        if (AoB != null) {
            clipsShoppingCTABar = AoB.FFN();
        } else {
            clipsShoppingCTABar = null;
        }
        ProductCollection A0w = C41847B3o.A0w(this, this.A00);
        if (A0w != null) {
            productCollectionImpl = A0w.FGo(r6);
        } else {
            productCollectionImpl = null;
        }
        List<ProductWrapperIntf> Bga = Bga();
        if (Bga != null) {
            arrayList = AnonymousClass7TG.A0r(Bga);
            for (ProductWrapperIntf FGs : Bga) {
                arrayList.add(FGs.FGs(r6));
            }
        }
        return new ClipsShoppingInfo(clipsShoppingCTABar, productCollectionImpl, arrayList);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.model.shopping.clips.ImmutablePandoClipsShoppingInfo] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
