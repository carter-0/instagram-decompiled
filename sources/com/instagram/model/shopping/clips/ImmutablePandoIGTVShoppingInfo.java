package com.instagram.model.shopping.clips;

import X.17P;
import X.1E6;
import X.1E9;
import X.AnonymousClass7TG;
import X.AnonymousClass7TH;
import X.C3035269k;
import X.C41845B3m;
import X.C41846B3n;
import X.C41847B3o;
import X.C41848B3p;
import X.C44916Cn7;
import X.CTA;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.user.model.ImmutablePandoProductWrapper;
import com.instagram.user.model.ImmutablePandoUserDict;
import com.instagram.user.model.ProductCollection;
import com.instagram.user.model.ProductCollectionImpl;
import com.instagram.user.model.ProductWrapperIntf;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.List;

public final class ImmutablePandoIGTVShoppingInfo extends 17P implements IGTVShoppingInfoIntf {
    public static final C3035269k CREATOR = CTA.A00(44);
    public ProductCollection A00;
    public User A01;
    public List A02;

    public final ClipsShoppingCTABarIntf AoB() {
        return (ClipsShoppingCTABarIntf) A05(-2003911895, ImmutablePandoClipsShoppingCTABar.class);
    }

    public final ProductCollection Aoo() {
        return C41847B3o.A0w(this, this.A00);
    }

    public final User BRo() {
        return this.A01;
    }

    public final List Bga() {
        List list = this.A02;
        if (list == null) {
            return A08(-1003761308, ImmutablePandoProductWrapper.class);
        }
        return list;
    }

    public final IGTVShoppingInfoIntf EA6(1E9 r4) {
        ProductCollection A0w = C41847B3o.A0w(this, this.A00);
        ArrayList arrayList = null;
        if (A0w != null) {
            A0w.EAX(r4);
        } else {
            A0w = null;
        }
        this.A00 = A0w;
        this.A01 = C41848B3p.A1B(r4, this, -505296440);
        List<ProductWrapperIntf> Bga = Bga();
        if (Bga != null) {
            arrayList = AnonymousClass7TG.A0r(Bga);
            for (ProductWrapperIntf productWrapperIntf : Bga) {
                productWrapperIntf.EAZ(r4);
                arrayList.add(productWrapperIntf);
            }
        }
        this.A02 = arrayList;
        return this;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.model.shopping.clips.IGTVShoppingInfoIntf, com.instagram.model.shopping.clips.ImmutablePandoIGTVShoppingInfo] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, C44916Cn7.A00(this));
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    public final IGTVShoppingInfo FFP(1E9 r7) {
        ClipsShoppingCTABar clipsShoppingCTABar;
        ProductCollectionImpl productCollectionImpl;
        User user;
        User A0b;
        ClipsShoppingCTABarIntf AoB = AoB();
        ArrayList arrayList = null;
        if (AoB != null) {
            clipsShoppingCTABar = AoB.FFN();
        } else {
            clipsShoppingCTABar = null;
        }
        ProductCollection A0w = C41847B3o.A0w(this, this.A00);
        if (A0w != null) {
            productCollectionImpl = A0w.FGo(r7);
        } else {
            productCollectionImpl = null;
        }
        ImmutablePandoUserDict A0Z = C41845B3m.A0Z(this, -505296440);
        if (A0Z == null || (A0b = C41845B3m.A0b(r7, A0Z)) == null) {
            user = null;
        } else {
            user = C41846B3n.A0b(r7, A0b);
        }
        List<ProductWrapperIntf> Bga = Bga();
        if (Bga != null) {
            arrayList = AnonymousClass7TG.A0r(Bga);
            for (ProductWrapperIntf FGs : Bga) {
                arrayList.add(FGs.FGs(r7));
            }
        }
        return new IGTVShoppingInfo(clipsShoppingCTABar, productCollectionImpl, user, arrayList);
    }

    public final IGTVShoppingInfo FFQ(1E6 r2) {
        return FFP(C41846B3n.A0S(r2));
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.model.shopping.clips.ImmutablePandoIGTVShoppingInfo] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
