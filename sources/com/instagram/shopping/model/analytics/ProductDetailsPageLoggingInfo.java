package com.instagram.shopping.model.analytics;

import X.0bb;
import X.0qQ;
import X.AnonymousClass000;
import X.AnonymousClass0T0;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C13989Tnp;
import X.C14930UFt;
import X.C263944Ny;
import X.Pxi;
import X.W6F;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.user.model.Product;
import java.util.Map;

public final class ProductDetailsPageLoggingInfo extends AnonymousClass0T0 implements Parcelable {
    public static final W6F CREATOR = new W6F(44);
    public final long A00;
    public final long A01;
    public final C263944Ny A02;
    public final String A03 = null;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ProductDetailsPageLoggingInfo) {
                ProductDetailsPageLoggingInfo productDetailsPageLoggingInfo = (ProductDetailsPageLoggingInfo) obj;
                if (this.A00 != productDetailsPageLoggingInfo.A00 || this.A01 != productDetailsPageLoggingInfo.A01 || !0qQ.A0K(this.A02, productDetailsPageLoggingInfo.A02) || !0qQ.A0K(this.A03, productDetailsPageLoggingInfo.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeLong(this.A00);
        parcel.writeLong(this.A01);
        Long l = this.A02.A00;
        0qQ.A07(l);
        parcel.writeLong(l.longValue());
    }

    public ProductDetailsPageLoggingInfo(String str, String str2, String str3) {
        long parseLong = Long.parseLong(str);
        long parseLong2 = Long.parseLong(str2);
        C263944Ny A002 = C263944Ny.A00(str3);
        this.A00 = parseLong;
        this.A01 = parseLong2;
        this.A02 = A002;
    }

    public final C14930UFt A00() {
        0bb r3 = new 0bb();
        r3.A05(AnonymousClass000.A00(308), Long.valueOf(this.A00));
        r3.A05("pdp_product_id", Long.valueOf(this.A01));
        C263944Ny r2 = this.A02;
        Map map = r3.A00;
        Object obj = r2;
        if (r2 != null) {
            obj = r2.FH4();
        }
        map.put("pdp_merchant_id", obj);
        r3.A06("central_pdp_version", this.A03);
        return r3;
    }

    public final int hashCode() {
        long j = this.A00;
        return AnonymousClass7TF.A07(this.A02, AnonymousClass7TF.A01(this.A01, ((int) (j ^ (j >>> 32))) * 31)) + AnonymousClass7TG.A0E(this.A03);
    }

    public ProductDetailsPageLoggingInfo(Product product, Product product2) {
        long parseLong = Long.parseLong(product.A0H);
        long parseLong2 = Long.parseLong(product2.A0H);
        C263944Ny A002 = C263944Ny.A00(C13989Tnp.A0q(product2));
        this.A00 = parseLong;
        this.A01 = parseLong2;
        this.A02 = A002;
    }

    public ProductDetailsPageLoggingInfo(Parcel parcel) {
        long readLong = parcel.readLong();
        long readLong2 = parcel.readLong();
        C263944Ny r1 = new C263944Ny(Pxi.A0T(parcel));
        this.A00 = readLong;
        this.A01 = readLong2;
        this.A02 = r1;
    }
}
