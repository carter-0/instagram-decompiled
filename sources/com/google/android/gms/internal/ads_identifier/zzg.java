package com.google.android.gms.internal.ads_identifier;

import X.AnonymousClass0fD;
import X.AnonymousClass7TH;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public final class zzg implements IInterface, zze {
    public final IBinder A00;
    public final String A01 = "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService";

    public final IBinder asBinder() {
        int A03 = AnonymousClass0fD.A03(-1432473586);
        IBinder iBinder = this.A00;
        AnonymousClass0fD.A0A(-1748524563, A03);
        return iBinder;
    }

    public zzg(IBinder iBinder) {
        int A03 = AnonymousClass0fD.A03(-1565293878);
        this.A00 = iBinder;
        AnonymousClass0fD.A0A(-1848817682, A03);
        AnonymousClass0fD.A0A(666617611, AnonymousClass0fD.A03(44314466));
    }

    public final Parcel A00(Parcel parcel, int i) {
        int A03 = AnonymousClass0fD.A03(121677159);
        parcel = Parcel.obtain();
        try {
            AnonymousClass7TH.A0N(this.A00, parcel, parcel, i);
            return parcel;
        } catch (RuntimeException e) {
            throw e;
        } finally {
            parcel.recycle();
            AnonymousClass0fD.A0A(-141453190, A03);
        }
    }
}
