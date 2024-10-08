package com.instagram.api.schemas;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C17666Vbx;
import X.C41845B3m;
import X.DE6;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.user.model.User;

public final class ProductPivotsButtonImpl extends AnonymousClass0T0 implements Parcelable, ProductPivotsButton {
    public static final Parcelable.Creator CREATOR = DE6.A00(27);
    public final ProductPivotsButtonActionType A00;
    public final ProductPivotsButtonActionType A01;
    public final User A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;

    public ProductPivotsButtonImpl(ProductPivotsButtonActionType productPivotsButtonActionType, ProductPivotsButtonActionType productPivotsButtonActionType2, User user, String str, String str2, String str3, String str4, String str5) {
        0qQ.A0B(productPivotsButtonActionType, 1);
        this.A00 = productPivotsButtonActionType;
        this.A03 = str;
        this.A04 = str2;
        this.A05 = str3;
        this.A06 = str4;
        this.A01 = productPivotsButtonActionType2;
        this.A02 = user;
        this.A07 = str5;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ProductPivotsButtonImpl) {
                ProductPivotsButtonImpl productPivotsButtonImpl = (ProductPivotsButtonImpl) obj;
                if (this.A00 != productPivotsButtonImpl.A00 || !0qQ.A0K(this.A03, productPivotsButtonImpl.A03) || !0qQ.A0K(this.A04, productPivotsButtonImpl.A04) || !0qQ.A0K(this.A05, productPivotsButtonImpl.A05) || !0qQ.A0K(this.A06, productPivotsButtonImpl.A06) || this.A01 != productPivotsButtonImpl.A01 || !0qQ.A0K(this.A02, productPivotsButtonImpl.A02) || !0qQ.A0K(this.A07, productPivotsButtonImpl.A07)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A03);
        parcel.writeString(this.A04);
        parcel.writeString(this.A05);
        parcel.writeString(this.A06);
        parcel.writeParcelable(this.A01, i);
        parcel.writeParcelable(this.A02, i);
        parcel.writeString(this.A07);
    }

    public final /* bridge */ /* synthetic */ C17666Vbx AKJ() {
        return new C17666Vbx(this);
    }

    public final ProductPivotsButtonActionType AYE() {
        return this.A00;
    }

    public final String Air() {
        return this.A03;
    }

    public final String Awd() {
        return this.A04;
    }

    public final String Awf() {
        return this.A05;
    }

    public final String Awg() {
        return this.A06;
    }

    public final ProductPivotsButtonActionType Awi() {
        return this.A01;
    }

    public final User BRo() {
        return this.A02;
    }

    public final String getText() {
        return this.A07;
    }

    public final int hashCode() {
        return ((((((((((((AnonymousClass7TE.A0K(this.A00) + AnonymousClass7TG.A0E(this.A03)) * 31) + AnonymousClass7TG.A0E(this.A04)) * 31) + AnonymousClass7TG.A0E(this.A05)) * 31) + AnonymousClass7TG.A0E(this.A06)) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TG.A0C(this.A02)) * 31) + C41845B3m.A00(this.A07);
    }
}
