package com.google.android.gms.common;

import X.C301145yd;
import X.C376409Hw;
import X.S4O;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

public class Feature extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C376409Hw(42);
    public final String A00;
    @Deprecated
    public final int A01;
    public final long A02;

    public final long A00() {
        long j = this.A02;
        return j == -1 ? (long) this.A01 : j;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Feature) {
            Feature feature = (Feature) obj;
            String str = this.A00;
            String str2 = feature.A00;
            if (str == null ? str2 == null : str.equals(str2)) {
                if (A00() == feature.A00()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A00, Long.valueOf(A00())});
    }

    public final String toString() {
        S4O s4o = new S4O(this);
        s4o.A00(this.A00, PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
        s4o.A00(Long.valueOf(A00()), "version");
        return s4o.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A012 = C301145yd.A01(parcel, 20293);
        C301145yd.A0C(parcel, this.A00, 1, false);
        C301145yd.A07(parcel, 2, this.A01);
        C301145yd.A08(parcel, 3, A00());
        C301145yd.A06(parcel, A012);
    }

    public Feature(String str, long j) {
        this.A00 = str;
        this.A02 = j;
        this.A01 = -1;
    }

    public Feature(String str, int i, long j) {
        this.A00 = str;
        this.A01 = i;
        this.A02 = j;
    }
}
