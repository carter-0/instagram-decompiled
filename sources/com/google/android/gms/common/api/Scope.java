package com.google.android.gms.common.api;

import X.AnonymousClass3Qk;
import X.C301145yd;
import X.SWX;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class Scope extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new SWX(24);
    public final int A00;
    public final String A01;

    public final String toString() {
        return this.A01;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scope)) {
            return false;
        }
        return this.A01.equals(((Scope) obj).A01);
    }

    public final int hashCode() {
        return this.A01.hashCode();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.A00;
        int A012 = C301145yd.A01(parcel, 20293);
        C301145yd.A05(parcel, i2);
        C301145yd.A0B(parcel, this.A01);
        C301145yd.A06(parcel, A012);
    }

    public Scope(int i, String str) {
        AnonymousClass3Qk.A06(str, "scopeUri must not be null or empty");
        this.A00 = i;
        this.A01 = str;
    }
}
