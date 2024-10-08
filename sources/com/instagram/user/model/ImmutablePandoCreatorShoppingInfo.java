package com.instagram.user.model;

import X.0qQ;
import X.17P;
import X.1E6;
import X.1E9;
import X.1aC;
import X.AnonymousClass731;
import X.AnonymousClass7TG;
import X.AnonymousClass7TH;
import X.C3035269k;
import X.CTA;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class ImmutablePandoCreatorShoppingInfo extends 17P implements CreatorShoppingInfo {
    public static final C3035269k CREATOR = new CTA(81);
    public List A00;

    public final CreatorShoppingInfoImpl FGk(1E6 r4) {
        return FGj(new 1E9(r4, 6, false));
    }

    private final List A01(1E9 r5) {
        ImmutableList A08 = A08(811810775, ImmutablePandoUserDict.class);
        if (A08 == null) {
            return null;
        }
        ArrayList A0r = AnonymousClass7TG.A0r(A08);
        Iterator it = A08.iterator();
        while (it.hasNext()) {
            ImmutablePandoUserDict immutablePandoUserDict = (ImmutablePandoUserDict) it.next();
            Parcelable.Creator creator = User.CREATOR;
            0qQ.A0A(immutablePandoUserDict);
            A0r.add(1aC.A01(r5, immutablePandoUserDict));
        }
        return A0r;
    }

    public final List BN1() {
        return this.A00;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.facebook.pando.TreeJNI, com.instagram.user.model.CreatorShoppingInfo, com.instagram.user.model.ImmutablePandoCreatorShoppingInfo] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI(AnonymousClass731.A00(this), this);
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    public final CreatorShoppingInfo EAV(1E9 r2) {
        this.A00 = A01(r2);
        return this;
    }

    public final CreatorShoppingInfoImpl FGj(1E9 r4) {
        ArrayList arrayList;
        List<User> A01 = A01(r4);
        if (A01 != null) {
            arrayList = AnonymousClass7TG.A0r(A01);
            for (User A002 : A01) {
                arrayList.add(r4.A00(A002));
            }
        } else {
            arrayList = null;
        }
        return new CreatorShoppingInfoImpl(arrayList);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.user.model.ImmutablePandoCreatorShoppingInfo] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
