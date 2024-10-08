package com.facebookpay.logging;

import X.0qQ;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C51972G9s;
import X.DbS;
import X.G9t;
import X.Pxi;
import X.Pxj;
import X.SWW;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.Set;

public final class LoggingContext implements Parcelable {
    public static final Parcelable.Creator CREATOR = SWW.A00(5);
    public final long A00;
    public final LoggingPolicy A01;
    public final String A02;
    public final Set A03;
    public final Set A04;
    public final boolean A05;

    public LoggingContext(LoggingPolicy loggingPolicy, String str, Set set, Set set2, long j, boolean z) {
        0qQ.A0B(str, 1);
        this.A02 = str;
        this.A00 = j;
        this.A01 = loggingPolicy;
        this.A03 = set;
        this.A04 = set2;
        this.A05 = z;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof LoggingContext) {
                LoggingContext loggingContext = (LoggingContext) obj;
                if (!0qQ.A0K(this.A02, loggingContext.A02) || this.A00 != loggingContext.A00 || !0qQ.A0K(this.A01, loggingContext.A01) || !0qQ.A0K(this.A03, loggingContext.A03) || !0qQ.A0K(this.A04, loggingContext.A04) || this.A05 != loggingContext.A05) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A02);
        parcel.writeLong(this.A00);
        LoggingPolicy loggingPolicy = this.A01;
        if (loggingPolicy == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            loggingPolicy.writeToParcel(parcel, i);
        }
        Iterator A0w = Pxj.A0w(parcel, this.A03);
        while (A0w.hasNext()) {
            Pxi.A15(parcel, A0w);
        }
        Iterator A0w2 = Pxj.A0w(parcel, this.A04);
        while (A0w2.hasNext()) {
            Pxi.A15(parcel, A0w2);
        }
        parcel.writeInt(this.A05 ? 1 : 0);
    }

    public final int hashCode() {
        int A0O = AnonymousClass7TE.A0O(this.A02);
        return DbS.A06(this.A05, AnonymousClass7TF.A07(this.A04, AnonymousClass7TF.A07(this.A03, (C51972G9s.A07(this.A00, A0O) + AnonymousClass7TG.A0C(this.A01)) * 31)));
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("LoggingContext(sessionId=");
        A1A.append(this.A02);
        A1A.append(", productId=");
        A1A.append(this.A00);
        A1A.append(", loggingPolicy=");
        A1A.append(this.A01);
        A1A.append(", eventSuppressionPolicy=");
        A1A.append(this.A03);
        A1A.append(", payloadFieldSuppressionPolicy=");
        A1A.append(this.A04);
        A1A.append(", disableLogging=");
        return G9t.A1C(A1A, this.A05);
    }
}
