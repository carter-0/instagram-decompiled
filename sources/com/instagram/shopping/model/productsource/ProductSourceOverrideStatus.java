package com.instagram.shopping.model.productsource;

import X.AnonymousClass7TF;
import X.C358248ab;
import X.DbT;
import X.W6F;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.model.shopping.ProductSource;

public enum ProductSourceOverrideStatus implements Parcelable {
    A05(-1, -1),
    BUSINESS_PARTNER(2131954084, 2131954083),
    ALREADY_TAGGED(2131954082, 2131954081);
    
    public static final Parcelable.Creator CREATOR = null;
    public final int A00;
    public final int A01;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        CREATOR = new W6F(55);
    }

    public final void A00(Context context, ProductSource productSource) {
        String str;
        String str2 = "";
        if (!(productSource == null || ((str = productSource.A03) == null && (str = productSource.A04) == null && (str = productSource.A01) == null))) {
            str2 = str;
        }
        C358248ab r3 = new C358248ab(context);
        r3.A05 = AnonymousClass7TF.A0e(context.getResources(), str2, this.A01);
        r3.A0q(AnonymousClass7TF.A0e(context.getResources(), str2, this.A00));
        r3.A06();
        r3.A0r(true);
        DbT.A1V(r3);
    }

    /* access modifiers changed from: public */
    ProductSourceOverrideStatus(int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(ordinal());
    }
}
