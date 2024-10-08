package com.google.android.gms.auth;

import X.AnonymousClass3Qk;
import X.Pxi;
import X.SWX;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

public class AccountChangeEventsResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = SWX.A00(20);
    public final int A00;
    public final List A01;

    public final void writeToParcel(Parcel parcel, int i) {
        Pxi.A16(parcel, this.A01, 2, Pxi.A06(parcel, this.A00));
    }

    public AccountChangeEventsResponse(int i, List list) {
        this.A00 = i;
        AnonymousClass3Qk.A02(list);
        this.A01 = list;
    }
}
