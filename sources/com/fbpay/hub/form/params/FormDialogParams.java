package com.fbpay.hub.form.params;

import X.0qQ;
import X.C10697Rwb;
import X.C11367SPk;
import X.C51971G9r;
import X.Pxi;
import X.Pxj;
import X.SWW;
import android.os.Parcel;
import android.os.Parcelable;

public class FormDialogParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = SWW.A00(19);
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final String A04;
    public final String A05;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FormDialogParams) {
                FormDialogParams formDialogParams = (FormDialogParams) obj;
                if (!(0qQ.A0K(this.A04, formDialogParams.A04) && this.A00 == formDialogParams.A00 && this.A01 == formDialogParams.A01 && this.A02 == formDialogParams.A02 && 0qQ.A0K(this.A05, formDialogParams.A05) && this.A03 == formDialogParams.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((((((C11367SPk.A01(this.A04) * 31) + this.A00) * 31) + this.A01) * 31) + this.A02) * 31) + C51971G9r.A0E(this.A05)) * 31) + this.A03;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Pxj.A1B(parcel, this.A04, 0, 1);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A02);
        Pxj.A1B(parcel, this.A05, 0, 1);
        parcel.writeInt(this.A03);
    }

    public FormDialogParams(Parcel parcel) {
        this.A04 = Pxj.A0A(parcel, this) != 0 ? parcel.readString() : null;
        this.A00 = parcel.readInt();
        this.A01 = parcel.readInt();
        this.A02 = parcel.readInt();
        this.A05 = Pxi.A0e(parcel);
        this.A03 = parcel.readInt();
    }

    public FormDialogParams(C10697Rwb rwb) {
        this.A04 = null;
        this.A00 = rwb.A00;
        this.A01 = rwb.A01;
        this.A02 = rwb.A02;
        this.A05 = null;
        this.A03 = rwb.A03;
    }
}
