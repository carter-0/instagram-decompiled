package com.instagram.user.model;

import X.17P;
import X.1E9;
import X.AnonymousClass7TG;
import X.AnonymousClass7TH;
import X.C3035269k;
import X.C41845B3m;
import X.C41846B3n;
import X.C41847B3o;
import X.C41848B3p;
import X.C45136Cqu;
import X.CTA;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.ImmutablePandoScheduledLiveAffiliateInfo;
import com.instagram.api.schemas.ImmutablePandoScheduledLiveDiscountInfo;
import com.instagram.api.schemas.ScheduledLiveAffiliateInfo;
import com.instagram.api.schemas.ScheduledLiveAffiliateInfoImpl;
import com.instagram.api.schemas.ScheduledLiveDiscountInfo;
import com.instagram.api.schemas.ScheduledLiveDiscountInfoImpl;
import java.util.ArrayList;
import java.util.List;

public final class ImmutablePandoScheduledLiveProductsMetadata extends 17P implements ScheduledLiveProductsMetadataIntf {
    public static final C3035269k CREATOR = CTA.A00(85);
    public ProductCollection A00;
    public User A01;
    public List A02;

    public final ScheduledLiveAffiliateInfo AaE() {
        return (ScheduledLiveAffiliateInfo) A05(-1521819552, ImmutablePandoScheduledLiveAffiliateInfo.class);
    }

    public final ProductCollection Aoo() {
        return C41847B3o.A0w(this, this.A00);
    }

    public final ScheduledLiveDiscountInfo Axt() {
        return (ScheduledLiveDiscountInfo) A05(-133183252, ImmutablePandoScheduledLiveDiscountInfo.class);
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

    public final ScheduledLiveProductsMetadataIntf EAb(1E9 r4) {
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

    /* JADX WARNING: type inference failed for: r1v0, types: [com.instagram.user.model.ScheduledLiveProductsMetadataIntf, com.facebook.pando.TreeJNI, com.instagram.user.model.ImmutablePandoScheduledLiveProductsMetadata] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, C45136Cqu.A00(this));
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    public final ScheduledLiveProductsMetadata FGv(1E9 r8) {
        ScheduledLiveAffiliateInfoImpl scheduledLiveAffiliateInfoImpl;
        ProductCollectionImpl productCollectionImpl;
        ScheduledLiveDiscountInfoImpl scheduledLiveDiscountInfoImpl;
        User user;
        User A0b;
        ScheduledLiveAffiliateInfo AaE = AaE();
        ArrayList arrayList = null;
        if (AaE != null) {
            scheduledLiveAffiliateInfoImpl = AaE.F8p();
        } else {
            scheduledLiveAffiliateInfoImpl = null;
        }
        ProductCollection A0w = C41847B3o.A0w(this, this.A00);
        if (A0w != null) {
            productCollectionImpl = A0w.FGo(r8);
        } else {
            productCollectionImpl = null;
        }
        ScheduledLiveDiscountInfo Axt = Axt();
        if (Axt != null) {
            scheduledLiveDiscountInfoImpl = Axt.F8q();
        } else {
            scheduledLiveDiscountInfoImpl = null;
        }
        ImmutablePandoUserDict A0Z = C41845B3m.A0Z(this, -505296440);
        if (A0Z == null || (A0b = C41845B3m.A0b(r8, A0Z)) == null) {
            user = null;
        } else {
            user = C41846B3n.A0b(r8, A0b);
        }
        List<ProductWrapperIntf> Bga = Bga();
        if (Bga != null) {
            arrayList = AnonymousClass7TG.A0r(Bga);
            for (ProductWrapperIntf FGs : Bga) {
                arrayList.add(FGs.FGs(r8));
            }
        }
        return new ScheduledLiveProductsMetadata(scheduledLiveAffiliateInfoImpl, scheduledLiveDiscountInfoImpl, productCollectionImpl, user, arrayList);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.user.model.ImmutablePandoScheduledLiveProductsMetadata] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
