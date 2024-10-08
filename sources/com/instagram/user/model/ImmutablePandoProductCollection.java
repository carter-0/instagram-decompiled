package com.instagram.user.model;

import X.17P;
import X.1E9;
import X.1hu;
import X.AnonymousClass7TG;
import X.AnonymousClass7TH;
import X.C3035269k;
import X.C41845B3m;
import X.C41846B3n;
import X.C41847B3o;
import X.C45133Cqr;
import X.C46172DOz;
import X.CTA;
import X.DP0;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;
import com.google.common.collect.ImmutableList;
import com.instagram.api.schemas.ProductCollectionV2Type;
import com.instagram.common.session.UserSession;
import com.instagram.model.shopping.businessintegrity.ProductCollectionReviewStatus;
import com.instagram.model.shopping.productcollection.ImmutablePandoProductCollectionCover;
import com.instagram.model.shopping.productcollection.ImmutablePandoProductCollectionDropsMetadata;
import com.instagram.model.shopping.productcollection.ProductCollectionCover;
import com.instagram.model.shopping.productcollection.ProductCollectionCoverImpl;
import com.instagram.model.shopping.productcollection.ProductCollectionDropsMetadata;
import com.instagram.model.shopping.productcollection.ProductCollectionDropsMetadataImpl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class ImmutablePandoProductCollection extends 17P implements ProductCollection {
    public static final C3035269k CREATOR = CTA.A00(82);
    public List A00;

    public final ProductCollectionReviewStatus Aor() {
        return (ProductCollectionReviewStatus) A0N(1212741336, C46172DOz.A00);
    }

    public final ProductCollectionV2Type Aou() {
        return (ProductCollectionV2Type) A0N(1060506683, DP0.A00);
    }

    public final ProductCollectionCover Arp() {
        return (ProductCollectionCover) A05(94852023, ImmutablePandoProductCollectionCover.class);
    }

    public final ProductCollectionDropsMetadata AzC() {
        return (ProductCollectionDropsMetadata) A05(-309579179, ImmutablePandoProductCollectionDropsMetadata.class);
    }

    public final List CD6() {
        return this.A00;
    }

    public final ProductCollection EAX(1E9 r4) {
        ArrayList arrayList;
        ImmutableList A08 = A08(111578632, ImmutablePandoUserDict.class);
        if (A08 != null) {
            arrayList = AnonymousClass7TG.A0r(A08);
            Iterator it = A08.iterator();
            while (it.hasNext()) {
                C41847B3o.A1P(r4, arrayList, it);
            }
        } else {
            arrayList = null;
        }
        this.A00 = arrayList;
        return this;
    }

    public final ProductCollectionImpl FGp(1hu r2) {
        if (r2 == null) {
            r2 = new 1hu((UserSession) null);
        }
        return FGo(C41846B3n.A0S(r2));
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.user.model.ProductCollection, com.instagram.user.model.ImmutablePandoProductCollection] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, C45133Cqr.A00(this));
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    public final String Aoi() {
        return A0i(-821242276);
    }

    public final String BRr() {
        return A0i(574223090);
    }

    public final ProductCollectionImpl FGo(1E9 r14) {
        ProductCollectionCoverImpl productCollectionCoverImpl;
        ProductCollectionDropsMetadataImpl productCollectionDropsMetadataImpl;
        String A0i = A0i(-821242276);
        ProductCollectionReviewStatus Aor = Aor();
        ProductCollectionV2Type Aou = Aou();
        ProductCollectionCover Arp = Arp();
        ArrayList arrayList = null;
        if (Arp != null) {
            productCollectionCoverImpl = Arp.FFa();
        } else {
            productCollectionCoverImpl = null;
        }
        String A0T = A0T();
        ProductCollectionDropsMetadata AzC = AzC();
        if (AzC != null) {
            productCollectionDropsMetadataImpl = AzC.FFb();
        } else {
            productCollectionDropsMetadataImpl = null;
        }
        String A0i2 = A0i(574223090);
        String A0U = A0U();
        String A0Y = A0Y();
        ImmutableList A08 = A08(111578632, ImmutablePandoUserDict.class);
        if (A08 != null) {
            ArrayList A0r = AnonymousClass7TG.A0r(A08);
            Iterator it = A08.iterator();
            while (it.hasNext()) {
                C41847B3o.A1P(r14, A0r, it);
            }
            if (A0r != null) {
                arrayList = AnonymousClass7TG.A0r(A0r);
                Iterator it2 = A0r.iterator();
                while (it2.hasNext()) {
                    C41847B3o.A1Q(r14, arrayList, it2);
                }
            }
        }
        return new ProductCollectionImpl(Aou, Aor, productCollectionCoverImpl, productCollectionDropsMetadataImpl, A0i, A0T, A0i2, A0U, A0Y, arrayList);
    }

    public final String getDescription() {
        return A0T();
    }

    public final String getSubtitle() {
        return A0U();
    }

    public final String getTitle() {
        return A0Y();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.user.model.ImmutablePandoProductCollection] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
