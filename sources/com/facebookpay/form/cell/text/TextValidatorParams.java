package com.facebookpay.form.cell.text;

import X.0qQ;
import X.AnonymousClass05K;
import X.AnonymousClass7TE;
import X.C11088S9j;
import X.SWV;
import android.os.Parcel;
import android.os.Parcelable;

public final class TextValidatorParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = SWV.A00(76);
    public final int A00;
    public final int A01;
    public final Integer A02;
    public final String A03;
    public final String A04;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(C11088S9j.A01(this.A02));
        parcel.writeString(this.A04);
        parcel.writeString(this.A03);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A00);
    }

    public TextValidatorParams(String str, int i, Integer num) {
        this.A02 = num;
        this.A04 = "";
        this.A03 = str;
        this.A01 = 0;
        this.A00 = i;
    }

    public TextValidatorParams(Integer num, String str, int i, int i2) {
        0qQ.A0B(str, 2);
        this.A02 = num;
        this.A04 = str;
        this.A03 = null;
        this.A01 = i;
        this.A00 = i2;
    }

    public TextValidatorParams(String str, Integer num, String str2) {
        this.A02 = num;
        this.A04 = str;
        this.A03 = str2;
        this.A01 = 0;
        this.A00 = 0;
    }

    public TextValidatorParams(Parcel parcel) {
        Integer num;
        String readString = parcel.readString();
        if (readString != null) {
            if (readString.equals("MIN_LENGTH")) {
                num = AnonymousClass05K.A00;
            } else if (readString.equals("MAX_LENGTH")) {
                num = AnonymousClass05K.A01;
            } else if (readString.equals("EXACT_LENGTH")) {
                num = AnonymousClass05K.A0C;
            } else if (readString.equals("REGEX")) {
                num = AnonymousClass05K.A0N;
            } else if (readString.equals("EMPTY")) {
                num = AnonymousClass05K.A0Y;
            } else if (readString.equals("US_STATE")) {
                num = AnonymousClass05K.A0j;
            } else if (readString.equals("DATE")) {
                num = AnonymousClass05K.A0u;
            } else if (readString.equals("CARD")) {
                num = AnonymousClass05K.A15;
            } else if (readString.equals("CARD_TYPE")) {
                num = AnonymousClass05K.A1F;
            } else if (readString.equals("US_PHONE")) {
                num = AnonymousClass05K.A1I;
            } else if (readString.equals("PHONE")) {
                num = AnonymousClass05K.A02;
            } else {
                throw AnonymousClass7TE.A0w(readString);
            }
            this.A02 = num;
            String readString2 = parcel.readString();
            if (readString2 != null) {
                this.A04 = readString2;
                this.A03 = parcel.readString();
                this.A01 = parcel.readInt();
                this.A00 = parcel.readInt();
                return;
            }
            throw AnonymousClass7TE.A0z("Required value was null.");
        }
        throw AnonymousClass7TE.A0z("Required value was null.");
    }
}
