package com.google.android.gms.auth;

import X.C301145yd;
import X.Pxi;
import X.SWX;
import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class AccountChangeEventsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = SWX.A00(19);
    public int A00;
    public Account A01;
    @Deprecated
    public String A02;
    public final int A03;

    public final void writeToParcel(Parcel parcel, int i) {
        int A06 = Pxi.A06(parcel, this.A03);
        C301145yd.A07(parcel, 2, this.A00);
        C301145yd.A0C(parcel, this.A02, 3, false);
        C301145yd.A0A(parcel, this.A01, 4, i, false);
        C301145yd.A06(parcel, A06);
    }

    public AccountChangeEventsRequest(Account account, String str, int i, int i2) {
        this.A03 = i;
        this.A00 = i2;
        this.A02 = str;
        if (account != null || TextUtils.isEmpty(str)) {
            this.A01 = account;
        } else {
            this.A01 = new Account(str, "com.google");
        }
    }

    public AccountChangeEventsRequest() {
        this.A03 = 1;
    }
}
