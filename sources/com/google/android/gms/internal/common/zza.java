package com.google.android.gms.internal.common;

import X.AnonymousClass0fD;
import X.AnonymousClass7TH;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;

public abstract class zza implements IInterface {
    public final IBinder A00;
    public final String A01;

    public zza(String str, IBinder iBinder) {
        int A03 = AnonymousClass0fD.A03(-916451897);
        this.A00 = iBinder;
        this.A01 = str;
        AnonymousClass0fD.A0A(-816241654, A03);
    }

    public final IBinder asBinder() {
        int A03 = AnonymousClass0fD.A03(1190100001);
        IBinder iBinder = this.A00;
        AnonymousClass0fD.A0A(-170944782, A03);
        return iBinder;
    }

    public static IObjectWrapper A00(Parcel parcel, zza zza, int i) {
        Parcel A02 = zza.A02(parcel, i);
        IObjectWrapper A012 = IObjectWrapper.Stub.A01(A02.readStrongBinder());
        A02.recycle();
        return A012;
    }

    public final Parcel A01() {
        int A03 = AnonymousClass0fD.A03(-24564629);
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.A01);
        AnonymousClass0fD.A0A(1470833525, A03);
        return obtain;
    }

    public final Parcel A02(Parcel parcel, int i) {
        int A03 = AnonymousClass0fD.A03(1026128298);
        parcel = Parcel.obtain();
        try {
            AnonymousClass7TH.A0N(this.A00, parcel, parcel, i);
            return parcel;
        } catch (RuntimeException e) {
            throw e;
        } finally {
            parcel.recycle();
            AnonymousClass0fD.A0A(882642655, A03);
        }
    }
}
