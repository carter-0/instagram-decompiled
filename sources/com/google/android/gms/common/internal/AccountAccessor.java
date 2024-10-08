package com.google.android.gms.common.internal;

import X.AnonymousClass0fD;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.common.zza;
import com.google.android.gms.internal.common.zzb;

public abstract class AccountAccessor extends zzb implements IAccountAccessor {
    /* JADX WARNING: type inference failed for: r2v1, types: [com.google.android.gms.internal.common.zza, com.google.android.gms.common.internal.IAccountAccessor] */
    public static IAccountAccessor A00(IBinder iBinder) {
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
        if (queryLocalInterface instanceof IAccountAccessor) {
            return (IAccountAccessor) queryLocalInterface;
        }
        ? zza = new zza("com.google.android.gms.common.internal.IAccountAccessor", iBinder);
        AnonymousClass0fD.A0A(1342352058, AnonymousClass0fD.A03(2075624599));
        return zza;
    }
}
