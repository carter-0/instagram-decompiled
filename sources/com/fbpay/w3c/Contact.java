package com.fbpay.w3c;

import X.0qQ;
import X.C11367SPk;
import X.C249803kO;
import X.C51971G9r;
import X.Pxf;
import X.Pxi;
import X.SWW;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableList;

public class Contact implements Parcelable, ContactSpec {
    public static final Parcelable.Creator CREATOR = SWW.A00(39);
    public final ImmutableList A00;
    public final ImmutableList A01;
    public final String A02;

    public Contact(ImmutableList immutableList, ImmutableList immutableList2, String str) {
        C11367SPk.A03(immutableList, "emails");
        this.A00 = immutableList;
        this.A02 = str;
        C11367SPk.A03(immutableList2, "phones");
        this.A01 = immutableList2;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Contact) {
                Contact contact = (Contact) obj;
                if (!0qQ.A0K(this.A00, contact.A00) || !0qQ.A0K(this.A02, contact.A02) || !0qQ.A0K(this.A01, contact.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((C11367SPk.A01(this.A00) * 31) + C51971G9r.A0E(this.A02)) * 31) + C51971G9r.A0E(this.A01);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C249803kO A0P = Pxi.A0P(parcel, this.A00);
        while (A0P.hasNext()) {
            parcel.writeParcelable((Email) A0P.next(), i);
        }
        String str = this.A02;
        if (str == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(str);
        }
        C249803kO A0P2 = Pxi.A0P(parcel, this.A01);
        while (A0P2.hasNext()) {
            parcel.writeParcelable((Phone) A0P2.next(), i);
        }
    }

    public Contact(Parcel parcel) {
        String readString;
        ClassLoader A0W = Pxf.A0W(this);
        int readInt = parcel.readInt();
        Object[] objArr = new Email[readInt];
        for (int i = 0; i < readInt; i++) {
            objArr[i] = parcel.readParcelable(A0W);
        }
        this.A00 = ImmutableList.copyOf(objArr);
        if (parcel.readInt() == 0) {
            readString = null;
        } else {
            readString = parcel.readString();
        }
        this.A02 = readString;
        int readInt2 = parcel.readInt();
        Object[] objArr2 = new Phone[readInt2];
        for (int i2 = 0; i2 < readInt2; i2++) {
            objArr2[i2] = parcel.readParcelable(A0W);
        }
        this.A01 = ImmutableList.copyOf(objArr2);
    }
}
