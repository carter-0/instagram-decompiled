package com.instagram.user.model;

import X.17P;
import X.1E6;
import X.1E9;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.AnonymousClass7TH;
import X.C3035269k;
import X.C41845B3m;
import X.C41846B3n;
import X.C41847B3o;
import X.C41848B3p;
import X.C45139Cqx;
import X.CTA;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.model.upcomingeventsmetadata.ImmutablePandoUpcomingEventMedia;
import com.instagram.model.upcomingeventsmetadata.UpcomingEventMedia;
import com.instagram.model.upcomingeventsmetadata.UpcomingEventMediaImpl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class ImmutablePandoUpcomingDropCampaignEventMetadata extends 17P implements UpcomingDropCampaignEventMetadata {
    public static final C3035269k CREATOR = CTA.A00(87);
    public ProductCollection A00;
    public User A01;
    public List A02;

    public final ProductCollection Aoo() {
        return C41847B3o.A0w(this, this.A00);
    }

    public final UpcomingEventMedia As2() {
        return (UpcomingEventMedia) A05(175980892, ImmutablePandoUpcomingEventMedia.class);
    }

    public final User BRo() {
        User user = this.A01;
        if (user != null) {
            return user;
        }
        throw AnonymousClass7TE.A1B("Please call reconciledWithStore() first to access the 'merchant' field.");
    }

    public final List Bga() {
        List list = this.A02;
        if (list == null) {
            return A0o(-1003761308, ImmutablePandoProductDetailsProductItemDict.class);
        }
        return list;
    }

    public final UpcomingDropCampaignEventMetadata EAc(1E9 r4) {
        ProductCollection A0w = C41847B3o.A0w(this, this.A00);
        if (A0w != null) {
            A0w.EAX(r4);
        } else {
            A0w = null;
        }
        this.A00 = A0w;
        this.A01 = C41846B3n.A0c(r4, this, -505296440);
        List Bga = Bga();
        ArrayList A0r = AnonymousClass7TG.A0r(Bga);
        Iterator it = Bga.iterator();
        while (it.hasNext()) {
            C41848B3p.A1R(r4, A0r, it);
        }
        this.A02 = A0r;
        return this;
    }

    public final UpcomingDropCampaignEventMetadataImpl FGw(1E9 r9) {
        ProductCollectionImpl productCollectionImpl;
        ProductCollection A0w = C41847B3o.A0w(this, this.A00);
        UpcomingEventMediaImpl upcomingEventMediaImpl = null;
        if (A0w != null) {
            productCollectionImpl = A0w.FGo(r9);
        } else {
            productCollectionImpl = null;
        }
        UpcomingEventMedia As2 = As2();
        if (As2 != null) {
            upcomingEventMediaImpl = As2.FG4();
        }
        String A0k = A0k(-1068649126);
        String A0h = A0h(2034986993);
        User A0r = C41847B3o.A0r(r9, this, -505296440);
        List Bga = Bga();
        ArrayList A0r2 = AnonymousClass7TG.A0r(Bga);
        Iterator it = Bga.iterator();
        while (it.hasNext()) {
            C41848B3p.A1S(r9, A0r2, it);
        }
        return new UpcomingDropCampaignEventMetadataImpl(upcomingEventMediaImpl, productCollectionImpl, A0r, A0k, A0h, A0r2);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.user.model.UpcomingDropCampaignEventMetadata, com.instagram.user.model.ImmutablePandoUpcomingDropCampaignEventMetadata] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, C45139Cqx.A00(this));
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    public final String Az9() {
        return A0k(-1068649126);
    }

    public final String BLi() {
        return A0h(2034986993);
    }

    public final UpcomingDropCampaignEventMetadataImpl FGx(1E6 r2) {
        return FGw(C41847B3o.A0q(r2));
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.user.model.ImmutablePandoUpcomingDropCampaignEventMetadata] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
