package com.facebook.iabeventlogging.model;

import X.C8945RGn;
import X.Pxe;
import X.Pxg;
import X.Pxh;
import android.os.Parcel;

public class IABHistoryEvent extends IABEvent {
    public final Long A00;
    public final Long A01;
    public final Long A02;
    public final boolean A03;
    public final String[] A04;

    public IABHistoryEvent(Long l, Long l2, Long l3, String str, String[] strArr, long j, long j2, boolean z) {
        super(C8945RGn.IAB_HISTORY, str, j, j2);
        this.A04 = strArr;
        this.A02 = l;
        this.A01 = l2;
        this.A00 = l3;
        this.A03 = z;
    }

    public final String toString() {
        StringBuilder A16 = Pxe.A16("IABDropPixelsEvent{");
        A16.append("urls='");
        A16.append(this.A04);
        A16.append('\'');
        A16.append(", startTs='");
        A16.append(this.A02);
        A16.append('\'');
        A16.append(", fullyLoadedTs='");
        A16.append(this.A00);
        A16.append('\'');
        A16.append(", interactiveTs='");
        A16.append(this.A01);
        A16.append('\'');
        A16.append(", isJsNavigation='");
        A16.append(this.A03);
        A16.append('\'');
        Pxh.A1D(this, A16, '\'');
        return Pxg.A0y(A16, this.A00);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        long longValue;
        long longValue2;
        super.writeToParcel(parcel, i);
        parcel.writeStringArray(this.A04);
        Long l = this.A02;
        long j = -1;
        if (l == null) {
            longValue = -1;
        } else {
            longValue = l.longValue();
        }
        parcel.writeLong(longValue);
        Long l2 = this.A01;
        if (l2 == null) {
            longValue2 = -1;
        } else {
            longValue2 = l2.longValue();
        }
        parcel.writeLong(longValue2);
        Long l3 = this.A00;
        if (l3 != null) {
            j = l3.longValue();
        }
        parcel.writeLong(j);
        parcel.writeInt(this.A03 ? 1 : 0);
    }
}
