package com.instagram.model.shopping.reels;

import X.17P;
import X.1E9;
import X.AnonymousClass7TG;
import X.AnonymousClass7TH;
import X.C3035269k;
import X.C41845B3m;
import X.C41848B3p;
import X.C44939CnZ;
import X.CTA;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.user.model.ImmutablePandoProductDetailsProductItemDict;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class ImmutablePandoReelMultiProductLink extends 17P implements ReelMultiProductLinkIntf {
    public static final C3035269k CREATOR = CTA.A00(60);
    public List A00;

    public final List Bga() {
        List list = this.A00;
        if (list == null) {
            return A08(-1003761308, ImmutablePandoProductDetailsProductItemDict.class);
        }
        return list;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.model.shopping.reels.ReelMultiProductLinkIntf, com.instagram.model.shopping.reels.ImmutablePandoReelMultiProductLink] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, C44939CnZ.A00(this));
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    public final ReelMultiProductLinkIntf EAC(1E9 r4) {
        ArrayList arrayList;
        List Bga = Bga();
        if (Bga != null) {
            arrayList = AnonymousClass7TG.A0r(Bga);
            Iterator it = Bga.iterator();
            while (it.hasNext()) {
                C41848B3p.A1R(r4, arrayList, it);
            }
        } else {
            arrayList = null;
        }
        this.A00 = arrayList;
        return this;
    }

    public final ReelMultiProductLink FFp(1E9 r4) {
        ArrayList arrayList;
        List Bga = Bga();
        if (Bga != null) {
            arrayList = AnonymousClass7TG.A0r(Bga);
            Iterator it = Bga.iterator();
            while (it.hasNext()) {
                C41848B3p.A1S(r4, arrayList, it);
            }
        } else {
            arrayList = null;
        }
        return new ReelMultiProductLink(arrayList);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.model.shopping.reels.ImmutablePandoReelMultiProductLink] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
