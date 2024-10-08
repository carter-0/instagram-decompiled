package com.google.android.gms.common.internal;

import X.C301145yd;
import X.Pxi;
import X.SWX;
import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class zat extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = SWX.A00(31);
    public final int A00;
    public final int A01;
    public final Account A02;
    public final GoogleSignInAccount A03;

    public final void writeToParcel(Parcel parcel, int i) {
        int A06 = Pxi.A06(parcel, this.A00);
        boolean A1R = Pxi.A1R(parcel, this.A02, i);
        C301145yd.A07(parcel, 3, this.A01);
        C301145yd.A0A(parcel, this.A03, 4, i, A1R);
        C301145yd.A06(parcel, A06);
    }

    public zat(Account account, GoogleSignInAccount googleSignInAccount, int i, int i2) {
        this.A00 = i;
        this.A02 = account;
        this.A01 = i2;
        this.A03 = googleSignInAccount;
    }
}
