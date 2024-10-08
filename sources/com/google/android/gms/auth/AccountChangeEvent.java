package com.google.android.gms.auth;

import X.AnonymousClass3Qk;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C301145yd;
import X.Pxi;
import X.SA1;
import X.SWX;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

public class AccountChangeEvent extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = SWX.A00(18);
    public final int A00;
    public final int A01;
    public final int A02;
    public final long A03;
    public final String A04;
    public final String A05;

    public final boolean equals(Object obj) {
        if (obj instanceof AccountChangeEvent) {
            if (obj != this) {
                AccountChangeEvent accountChangeEvent = (AccountChangeEvent) obj;
                if (!(this.A00 == accountChangeEvent.A00 && this.A03 == accountChangeEvent.A03 && SA1.A01(this.A04, accountChangeEvent.A04) && this.A01 == accountChangeEvent.A01 && this.A02 == accountChangeEvent.A02 && SA1.A01(this.A05, accountChangeEvent.A05))) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.A00), Long.valueOf(this.A03), this.A04, Integer.valueOf(this.A01), Integer.valueOf(this.A02), this.A05});
    }

    public final String toString() {
        String str;
        int i = this.A01;
        if (i == 1) {
            str = "ADDED";
        } else if (i == 2) {
            str = "REMOVED";
        } else if (i == 3) {
            str = "RENAMED_FROM";
        } else if (i != 4) {
            str = "UNKNOWN";
        } else {
            str = "RENAMED_TO";
        }
        String str2 = this.A04;
        String str3 = this.A05;
        int i2 = this.A02;
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("AccountChangeEvent {accountName = ");
        A1A.append(str2);
        A1A.append(", changeType = ");
        A1A.append(str);
        A1A.append(", changeData = ");
        A1A.append(str3);
        A1A.append(", eventIndex = ");
        A1A.append(i2);
        return AnonymousClass7TF.A0l("}", A1A);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A06 = Pxi.A06(parcel, this.A00);
        C301145yd.A08(parcel, 2, this.A03);
        C301145yd.A0C(parcel, this.A04, 3, false);
        C301145yd.A07(parcel, 4, this.A01);
        C301145yd.A07(parcel, 5, this.A02);
        C301145yd.A0C(parcel, this.A05, 6, false);
        C301145yd.A06(parcel, A06);
    }

    public AccountChangeEvent(String str, String str2, int i, int i2, int i3, long j) {
        this.A00 = i;
        this.A03 = j;
        AnonymousClass3Qk.A02(str);
        this.A04 = str;
        this.A01 = i2;
        this.A02 = i3;
        this.A05 = str2;
    }
}
