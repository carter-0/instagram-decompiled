package com.facebookpay.msc.transactions.viewmodel;

import X.C13926TlU;
import X.C13927TlV;
import X.C13928TlW;
import X.C13929TlX;
import X.C13931TlZ;
import X.Pxi;
import X.RGV;
import android.os.Parcel;
import android.os.Parcelable;

public final class DummyPayoutActivityForTest implements C13931TlZ, Parcelable {
    public final String Bb1() {
        return "2021-04-01";
    }

    public final String Bb3() {
        return "123456789";
    }

    public final String Bb9() {
        return "PAID";
    }

    public final String getId() {
        return "2053892059";
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.TlU, java.lang.Object] */
    public final C13926TlU Bb7() {
        return new Object();
    }

    public final RGV Bb8() {
        return RGV.SETTLED;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.TlW, java.lang.Object] */
    public final C13928TlW BbC() {
        return new Object();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.TlX, java.lang.Object] */
    public final C13929TlX BbF() {
        return new Object();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.TlV, java.lang.Object] */
    public final C13927TlV BbG() {
        return new Object();
    }

    public final int describeContents() {
        throw Pxi.A0p("An operation is not implemented: ", "Not yet implemented");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        throw Pxi.A0p("An operation is not implemented: ", "Not yet implemented");
    }
}
