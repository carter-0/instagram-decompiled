package com.google.android.gms.dynamic;

import X.AnonymousClass0fD;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.common.zza;
import com.google.android.gms.internal.common.zzb;

public interface IObjectWrapper extends IInterface {

    public abstract class Stub extends zzb implements IObjectWrapper {
        public Stub() {
            super("com.google.android.gms.dynamic.IObjectWrapper");
            AnonymousClass0fD.A0A(315065025, AnonymousClass0fD.A03(369804989));
        }

        /* JADX WARNING: type inference failed for: r2v1, types: [com.google.android.gms.dynamic.IObjectWrapper, com.google.android.gms.internal.common.zza] */
        public static IObjectWrapper A01(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            if (queryLocalInterface instanceof IObjectWrapper) {
                return (IObjectWrapper) queryLocalInterface;
            }
            ? zza = new zza("com.google.android.gms.dynamic.IObjectWrapper", iBinder);
            AnonymousClass0fD.A0A(-187073898, AnonymousClass0fD.A03(1047145825));
            return zza;
        }
    }
}
