package com.google.android.gms.internal.gtm;

import X.AnonymousClass0fD;
import android.os.IBinder;
import android.os.IInterface;

public final class zzcf implements IInterface, zzce {
    public final IBinder A00;
    public final String A01 = "com.google.android.gms.analytics.internal.IAnalyticsService";

    public zzcf(IBinder iBinder) {
        int A03 = AnonymousClass0fD.A03(728595681);
        this.A00 = iBinder;
        AnonymousClass0fD.A0A(-1729265600, A03);
        AnonymousClass0fD.A0A(301352018, AnonymousClass0fD.A03(-1913896335));
    }

    public final IBinder asBinder() {
        int A03 = AnonymousClass0fD.A03(749957443);
        IBinder iBinder = this.A00;
        AnonymousClass0fD.A0A(1293538116, A03);
        return iBinder;
    }
}
