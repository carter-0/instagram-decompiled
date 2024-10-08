package com.instagram.model.direct.threadkey.impl;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass9HR;
import X.C254743sy;
import X.C254793t3;
import X.C254923tH;
import X.C376399Hv;
import android.os.Parcel;
import android.os.Parcelable;

public final class MsysThreadId extends AnonymousClass0T0 implements Comparable, Parcelable, AnonymousClass9HR, C254793t3, C254743sy {
    public static final Parcelable.Creator CREATOR = new C376399Hv(23);
    public final long A00;
    public final C254923tH A01;
    public final Long A02;

    public MsysThreadId(C254923tH r2, Long l, long j) {
        0qQ.A0B(r2, 3);
        this.A00 = j;
        this.A02 = l;
        this.A01 = r2;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof MsysThreadId) {
                MsysThreadId msysThreadId = (MsysThreadId) obj;
                if (!(this.A00 == msysThreadId.A00 && 0qQ.A0K(this.A02, msysThreadId.A02) && this.A01 == msysThreadId.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MsysThreadId(threadKey=");
        sb.append(this.A00);
        sb.append(", threadFbid=");
        sb.append(this.A02);
        sb.append(", transportType=");
        sb.append(this.A01);
        sb.append(')');
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeLong(this.A00);
        Long l = this.A02;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeString(this.A01.name());
    }

    public final C254923tH C9i() {
        return this.A01;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        MsysThreadId msysThreadId = (MsysThreadId) obj;
        0qQ.A0B(msysThreadId, 0);
        int A012 = 0qQ.A01(this.A00, msysThreadId.A00);
        if (A012 == 0) {
            return this.A01.compareTo(msysThreadId.A01);
        }
        return A012;
    }

    public final int hashCode() {
        int hashCode;
        long j = this.A00;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        Long l = this.A02;
        if (l == null) {
            hashCode = 0;
        } else {
            hashCode = l.hashCode();
        }
        return ((i + hashCode) * 31) + this.A01.hashCode();
    }
}
