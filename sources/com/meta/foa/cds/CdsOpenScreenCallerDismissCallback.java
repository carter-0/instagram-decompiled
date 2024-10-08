package com.meta.foa.cds;

import X.C14615TzM;
import X.C51891G6g;
import X.SWU;
import android.os.Parcel;
import android.os.Parcelable;

public class CdsOpenScreenCallerDismissCallback implements CdsOpenScreenDismissCallback {
    public static final Parcelable.Creator CREATOR = new SWU(28);
    public final C51891G6g A00;

    public final int describeContents() {
        return 0;
    }

    public final void D9E(int i) {
        this.A00.EJT(i);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(C14615TzM.A00(this.A00));
    }

    public CdsOpenScreenCallerDismissCallback(C51891G6g g6g) {
        this.A00 = g6g;
    }
}
