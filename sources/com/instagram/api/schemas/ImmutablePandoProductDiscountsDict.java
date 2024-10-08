package com.instagram.api.schemas;

import X.17P;
import X.AnonymousClass7TG;
import X.AnonymousClass7TH;
import X.C3035269k;
import X.C41845B3m;
import X.C44264Cbz;
import X.CTB;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.ArrayList;
import java.util.List;

public final class ImmutablePandoProductDiscountsDict extends 17P implements ProductDiscountsDict {
    public static final C3035269k CREATOR = CTB.A00(47);

    public final List Axx() {
        return A08(-121228462, ImmutablePandoProductDiscountInformationDict.class);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ProductDiscountsDict, com.instagram.api.schemas.ImmutablePandoProductDiscountsDict] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, C44264Cbz.A00(this));
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    public final ProductDiscountsDictImpl F7t() {
        ArrayList arrayList;
        List<ProductDiscountInformationDict> Axx = Axx();
        if (Axx != null) {
            arrayList = AnonymousClass7TG.A0r(Axx);
            for (ProductDiscountInformationDict F7s : Axx) {
                arrayList.add(F7s.F7s());
            }
        } else {
            arrayList = null;
        }
        return new ProductDiscountsDictImpl(arrayList);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoProductDiscountsDict] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
