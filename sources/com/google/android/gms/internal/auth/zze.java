package com.google.android.gms.internal.auth;

import X.AnonymousClass0fD;
import android.os.IBinder;
import android.os.IInterface;

public abstract class zze extends zzb implements zzf {
    /* JADX WARNING: type inference failed for: r2v1, types: [com.google.android.gms.internal.auth.zza, com.google.android.gms.internal.auth.zzf] */
    public static zzf A00(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.auth.IAuthManagerService");
        if (queryLocalInterface instanceof zzf) {
            return (zzf) queryLocalInterface;
        }
        ? zza = new zza("com.google.android.auth.IAuthManagerService", iBinder);
        AnonymousClass0fD.A0A(81811183, AnonymousClass0fD.A03(1166281155));
        return zza;
    }
}
