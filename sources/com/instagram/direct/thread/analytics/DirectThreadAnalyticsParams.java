package com.instagram.direct.thread.analytics;

import X.0qQ;
import X.AnonymousClass0T0;
import X.C3263576k;
import X.C376399Hv;
import android.os.Parcel;
import android.os.Parcelable;

public final class DirectThreadAnalyticsParams extends AnonymousClass0T0 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C376399Hv(5);
    public final long A00;
    public final long A01;
    public final C3263576k A02;

    public DirectThreadAnalyticsParams(C3263576k r2, long j, long j2) {
        0qQ.A0B(r2, 2);
        this.A01 = j;
        this.A02 = r2;
        this.A00 = j2;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DirectThreadAnalyticsParams) {
                DirectThreadAnalyticsParams directThreadAnalyticsParams = (DirectThreadAnalyticsParams) obj;
                if (!(this.A01 == directThreadAnalyticsParams.A01 && this.A02 == directThreadAnalyticsParams.A02 && this.A00 == directThreadAnalyticsParams.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DirectThreadAnalyticsParams(threadSize=");
        sb.append(this.A01);
        sb.append(", directSource=");
        sb.append(this.A02);
        sb.append(", consistentThreadFbId=");
        sb.append(this.A00);
        sb.append(')');
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeLong(this.A01);
        parcel.writeString(this.A02.name());
        parcel.writeLong(this.A00);
    }

    public final int hashCode() {
        long j = this.A01;
        long j2 = this.A00;
        return (((((int) (j ^ (j >>> 32))) * 31) + this.A02.hashCode()) * 31) + ((int) (j2 ^ (j2 >>> 32)));
    }
}
