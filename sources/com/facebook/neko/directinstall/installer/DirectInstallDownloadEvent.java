package com.facebook.neko.directinstall.installer;

import X.2Ob;
import X.C66725MbW;
import X.C66726MbX;
import X.C8896REo;
import X.Pxf;
import X.Pxi;
import X.RE5;
import X.SWZ;
import android.os.Parcel;
import android.os.Parcelable;

public class DirectInstallDownloadEvent implements Parcelable {
    public static final Parcelable.Creator CREATOR = SWZ.A01(38);
    public RE5 A00;
    public Double A01;
    public final C8896REo A02;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            DirectInstallDownloadEvent directInstallDownloadEvent = (DirectInstallDownloadEvent) obj;
            if (!(this.A02 == directInstallDownloadEvent.A02 && this.A00 == directInstallDownloadEvent.A00 && 2Ob.A00(this.A01, directInstallDownloadEvent.A01))) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return Pxf.A0B(this.A02, this.A00, this.A01);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A02.toString());
        parcel.writeValue(this.A01);
    }

    public DirectInstallDownloadEvent(RE5 re5, C8896REo rEo) {
        this.A02 = rEo;
        this.A00 = re5;
    }

    public final String toString() {
        C66726MbX A002 = C66725MbW.A00(this);
        A002.A01(this.A02, "statusEvent");
        A002.A01(this.A01, "downloadProgress");
        A002.A01(this.A00, "oemErrorType");
        return A002.toString();
    }

    public DirectInstallDownloadEvent(C8896REo rEo, Double d) {
        this.A02 = rEo;
        this.A01 = d;
    }

    public DirectInstallDownloadEvent(Parcel parcel) {
        String readString = parcel.readString();
        readString.getClass();
        this.A02 = C8896REo.valueOf(readString);
        this.A01 = (Double) Pxi.A0U(parcel, Double.class);
    }

    public DirectInstallDownloadEvent(C8896REo rEo) {
        this.A02 = rEo;
    }
}
