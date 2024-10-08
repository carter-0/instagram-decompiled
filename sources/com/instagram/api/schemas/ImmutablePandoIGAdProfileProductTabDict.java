package com.instagram.api.schemas;

import X.17P;
import X.1E6;
import X.1E9;
import X.AnonymousClass7TG;
import X.AnonymousClass7TH;
import X.C3035269k;
import X.C41845B3m;
import X.C41847B3o;
import X.C41848B3p;
import X.C44167CYg;
import X.C46060DKr;
import X.CTC;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.user.model.ImmutablePandoProductDetailsProductItemDict;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class ImmutablePandoIGAdProfileProductTabDict extends 17P implements IGAdProfileProductTabDict {
    public static final C3035269k CREATOR = CTC.A00(91);
    public List A00;

    public final IGAdProfileProductTabFeatureModeEnum B4r() {
        return (IGAdProfileProductTabFeatureModeEnum) A0N(1209000268, C46060DKr.A00);
    }

    public final List Bga() {
        List list = this.A00;
        if (list == null) {
            return A08(-1003761308, ImmutablePandoProductDetailsProductItemDict.class);
        }
        return list;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoIGAdProfileProductTabDict, com.instagram.api.schemas.IGAdProfileProductTabDict] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, C44167CYg.A00(this));
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoIGAdProfileProductTabDict] */
    public final Boolean BUE() {
        return getOptionalBooleanValueByHashCode(1635664600);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoIGAdProfileProductTabDict] */
    public final Boolean CZn() {
        return getOptionalBooleanValueByHashCode(-223460414);
    }

    public final IGAdProfileProductTabDict E7V(1E9 r4) {
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

    /* JADX WARNING: type inference failed for: r6v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoIGAdProfileProductTabDict] */
    public final IGAdProfileProductTabDictImpl F3r(1E9 r7) {
        ArrayList arrayList;
        IGAdProfileProductTabFeatureModeEnum B4r = B4r();
        Boolean optionalBooleanValueByHashCode = getOptionalBooleanValueByHashCode(-223460414);
        Boolean optionalBooleanValueByHashCode2 = getOptionalBooleanValueByHashCode(1635664600);
        List Bga = Bga();
        if (Bga != null) {
            arrayList = AnonymousClass7TG.A0r(Bga);
            Iterator it = Bga.iterator();
            while (it.hasNext()) {
                C41848B3p.A1S(r7, arrayList, it);
            }
        } else {
            arrayList = null;
        }
        return new IGAdProfileProductTabDictImpl(B4r, optionalBooleanValueByHashCode, optionalBooleanValueByHashCode2, arrayList);
    }

    public final IGAdProfileProductTabDictImpl F3s(1E6 r2) {
        return F3r(C41847B3o.A0q(r2));
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoIGAdProfileProductTabDict] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
