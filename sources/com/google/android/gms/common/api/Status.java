package com.google.android.gms.common.api;

import X.AnonymousClass63X;
import X.C301145yd;
import X.C376409Hw;
import X.C9696RfE;
import X.S4O;
import X.SA1;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

public final class Status extends AbstractSafeParcelable implements AnonymousClass63X, ReflectedParcelable {
    public static final Status A04 = new Status(16, (String) null);
    public static final Status A05 = new Status(18, (String) null);
    public static final Status A06 = new Status(8, (String) null);
    public static final Status A07 = new Status(14, (String) null);
    public static final Status A08 = new Status(0, (String) null);
    public static final Status A09 = new Status(-1, (String) null);
    public static final Status A0A = new Status(15, (String) null);
    public static final Status A0B = new Status(17, (String) null);
    public static final Parcelable.Creator CREATOR = new C376409Hw(36);
    public final int A00;
    public final PendingIntent A01;
    public final ConnectionResult A02;
    public final String A03;

    public Status(int i, String str) {
        this((PendingIntent) null, (ConnectionResult) null, str, i);
    }

    public final Status BzI() {
        return this;
    }

    public final void A00(Activity activity, int i) {
        PendingIntent pendingIntent = this.A01;
        if (pendingIntent != null) {
            activity.startIntentSenderForResult(pendingIntent.getIntentSender(), i, (Intent) null, 0, 0, 0);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        if (this.A00 != status.A00 || !SA1.A01(this.A03, status.A03) || !SA1.A01(this.A01, status.A01) || !SA1.A01(this.A02, status.A02)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.A00), this.A03, this.A01, this.A02});
    }

    public final String toString() {
        S4O s4o = new S4O(this);
        String str = this.A03;
        if (str == null) {
            str = C9696RfE.A00(this.A00);
        }
        s4o.A00(str, "statusCode");
        s4o.A00(this.A01, "resolution");
        return s4o.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A012 = C301145yd.A01(parcel, 20293);
        C301145yd.A05(parcel, this.A00);
        C301145yd.A0B(parcel, this.A03);
        C301145yd.A0A(parcel, this.A01, 3, i, false);
        C301145yd.A0A(parcel, this.A02, 4, i, false);
        C301145yd.A06(parcel, A012);
    }

    public Status(PendingIntent pendingIntent, ConnectionResult connectionResult, String str, int i) {
        this.A00 = i;
        this.A03 = str;
        this.A01 = pendingIntent;
        this.A02 = connectionResult;
    }
}
