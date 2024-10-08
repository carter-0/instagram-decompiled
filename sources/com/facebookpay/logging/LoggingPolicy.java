package com.facebookpay.logging;

import X.0qQ;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.Pxi;
import X.SWW;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;

public final class LoggingPolicy implements Parcelable {
    public static final Parcelable.Creator CREATOR = SWW.A00(6);
    public final String A00;
    public final ArrayList A01;

    public LoggingPolicy(String str, ArrayList arrayList) {
        0qQ.A0B(str, 1);
        this.A00 = str;
        this.A01 = arrayList;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof LoggingPolicy) {
                LoggingPolicy loggingPolicy = (LoggingPolicy) obj;
                if (!0qQ.A0K(this.A00, loggingPolicy.A00) || !0qQ.A0K(this.A01, loggingPolicy.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A00);
        Iterator A0l = Pxi.A0l(parcel, this.A01);
        while (A0l.hasNext()) {
            ((ClientSuppressionPolicy) A0l.next()).writeToParcel(parcel, i);
        }
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A01, AnonymousClass7TE.A0O(this.A00));
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("LoggingPolicy(loggingPolicyProduct=");
        A1A.append(this.A00);
        A1A.append(", clientSuppressionPolicy=");
        return AnonymousClass7TG.A0n(this.A01, A1A);
    }
}
