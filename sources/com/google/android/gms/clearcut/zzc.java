package com.google.android.gms.clearcut;

import X.AnonymousClass7TF;
import X.C301145yd;
import X.Pxe;
import X.Pxf;
import X.SWX;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class zzc extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = SWX.A00(22);
    public final long A00;
    public final long A01;
    public final boolean A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof zzc) {
                zzc zzc = (zzc) obj;
                if (!(this.A02 == zzc.A02 && this.A00 == zzc.A00 && this.A01 == zzc.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Pxf.A0B(Boolean.valueOf(this.A02), Long.valueOf(this.A00), Long.valueOf(this.A01));
    }

    public final String toString() {
        StringBuilder A16 = Pxe.A16("CollectForDebugParcelable[skipPersistentStorage: ");
        A16.append(this.A02);
        A16.append(",collectForDebugStartTimeMillis: ");
        A16.append(this.A00);
        A16.append(",collectForDebugExpiryTimeMillis: ");
        A16.append(this.A01);
        return AnonymousClass7TF.A0l("]", A16);
    }

    public zzc(long j, long j2, boolean z) {
        this.A02 = z;
        this.A00 = j;
        this.A01 = j2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A03 = Pxf.A03(parcel);
        C301145yd.A09(parcel, 1, this.A02);
        C301145yd.A08(parcel, 2, this.A01);
        C301145yd.A08(parcel, 3, this.A00);
        C301145yd.A06(parcel, A03);
    }
}
