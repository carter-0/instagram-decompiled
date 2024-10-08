package com.instagram.api.schemas;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C41845B3m;
import X.C45415Cvv;
import X.DE6;
import android.os.Parcel;
import android.os.Parcelable;

public final class ProductTileUCILoggingInfoImpl extends AnonymousClass0T0 implements Parcelable, ProductTileUCILoggingInfo {
    public static final Parcelable.Creator CREATOR = DE6.A00(47);
    public final long A00;
    public final long A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;

    public ProductTileUCILoggingInfoImpl(long j, String str, String str2, String str3, String str4, long j2) {
        0qQ.A0B(str4, 5);
        this.A02 = str;
        this.A03 = str2;
        this.A04 = str3;
        this.A00 = j;
        this.A05 = str4;
        this.A01 = j2;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ProductTileUCILoggingInfoImpl) {
                ProductTileUCILoggingInfoImpl productTileUCILoggingInfoImpl = (ProductTileUCILoggingInfoImpl) obj;
                if (!0qQ.A0K(this.A02, productTileUCILoggingInfoImpl.A02) || !0qQ.A0K(this.A03, productTileUCILoggingInfoImpl.A03) || !0qQ.A0K(this.A04, productTileUCILoggingInfoImpl.A04) || this.A00 != productTileUCILoggingInfoImpl.A00 || !0qQ.A0K(this.A05, productTileUCILoggingInfoImpl.A05) || this.A01 != productTileUCILoggingInfoImpl.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        parcel.writeString(this.A04);
        parcel.writeLong(this.A00);
        parcel.writeString(this.A05);
        parcel.writeLong(this.A01);
    }

    public final /* bridge */ /* synthetic */ C45415Cvv AKM() {
        return new C45415Cvv(this);
    }

    public final String Bg9() {
        return this.A02;
    }

    public final String BjL() {
        return this.A03;
    }

    public final String BjN() {
        return this.A04;
    }

    public final long BjQ() {
        return this.A00;
    }

    public final String CB2() {
        return this.A05;
    }

    public final long CCn() {
        return this.A01;
    }

    public final int hashCode() {
        int A08 = AnonymousClass7TF.A08(this.A05, AnonymousClass7TF.A01(this.A00, ((((AnonymousClass7TG.A0E(this.A02) * 31) + AnonymousClass7TG.A0E(this.A03)) * 31) + C41845B3m.A00(this.A04)) * 31));
        long j = this.A01;
        return A08 + ((int) (j ^ (j >>> 32)));
    }
}
