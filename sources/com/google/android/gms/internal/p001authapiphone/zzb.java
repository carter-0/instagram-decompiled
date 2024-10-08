package com.google.android.gms.internal.p001authapiphone;

import X.AnonymousClass0fD;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.auth-api-phone.zzb  reason: invalid package */
public abstract class zzb extends Binder implements IInterface {
    public final IBinder asBinder() {
        AnonymousClass0fD.A0A(-688269044, AnonymousClass0fD.A03(-926332573));
        return this;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTransact(int r6, android.os.Parcel r7, android.os.Parcel r8, int r9) {
        /*
            r5 = this;
            r0 = -1007757403(0xffffffffc3eed7a5, float:-477.68472)
            int r4 = X.AnonymousClass0fD.A03(r0)
            r0 = 16777215(0xffffff, float:2.3509886E-38)
            if (r6 <= r0) goto L_0x001a
            boolean r0 = super.onTransact(r6, r7, r8, r9)
            if (r0 == 0) goto L_0x001d
            r1 = 1
            r0 = 2087296780(0x7c699f0c, float:4.852124E36)
        L_0x0016:
            X.AnonymousClass0fD.A0A(r0, r4)
            return r1
        L_0x001a:
            X.Pxf.A14(r5, r7)
        L_0x001d:
            r3 = r5
            com.google.android.gms.internal.auth-api-phone.zzi r3 = (com.google.android.gms.internal.p001authapiphone.zzi) r3
            r0 = -277024361(0xffffffffef7cf197, float:-7.8282287E28)
            int r2 = X.AnonymousClass0fD.A03(r0)
            r1 = 1
            if (r6 != r1) goto L_0x003f
            android.os.Parcelable$Creator r0 = com.google.android.gms.common.api.Status.CREATOR
            android.os.Parcelable r0 = X.Pxh.A0L(r7, r0)
            com.google.android.gms.common.api.Status r0 = (com.google.android.gms.common.api.Status) r0
            r3.FPJ(r0)
            r0 = 1367700893(0x5185759d, float:7.1650484E10)
        L_0x0038:
            X.AnonymousClass0fD.A0A(r0, r2)
            r0 = -1137030019(0xffffffffbc3a4c7d, float:-0.011370775)
            goto L_0x0016
        L_0x003f:
            r1 = 0
            r0 = -1307104644(0xffffffffb2172a7c, float:-8.799017E-9)
            goto L_0x0038
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p001authapiphone.zzb.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
