package com.google.android.gms.internal.p001authapiphone;

import X.AnonymousClass0fD;
import X.AnonymousClass7TH;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.auth-api-phone.zza  reason: invalid package */
public abstract class zza implements IInterface {
    public final IBinder A00;

    public zza(IBinder iBinder) {
        int A03 = AnonymousClass0fD.A03(-1128324677);
        this.A00 = iBinder;
        AnonymousClass0fD.A0A(531508785, A03);
    }

    public final IBinder asBinder() {
        int A03 = AnonymousClass0fD.A03(976510229);
        IBinder iBinder = this.A00;
        AnonymousClass0fD.A0A(-848440143, A03);
        return iBinder;
    }

    public final void A00(Parcel parcel, int i) {
        int A03 = AnonymousClass0fD.A03(-846835758);
        Parcel obtain = Parcel.obtain();
        try {
            AnonymousClass7TH.A0N(this.A00, parcel, obtain, i);
        } finally {
            parcel.recycle();
            obtain.recycle();
            AnonymousClass0fD.A0A(221639151, A03);
        }
    }
}
