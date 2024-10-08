package com.google.android.gms.internal.device_performance;

import X.AnonymousClass0fD;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;

public abstract class zzb extends Binder implements IInterface {
    public final IBinder asBinder() {
        AnonymousClass0fD.A0A(-1959001936, AnonymousClass0fD.A03(-1572805081));
        return this;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0066  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTransact(int r9, android.os.Parcel r10, android.os.Parcel r11, int r12) {
        /*
            r8 = this;
            r0 = -1184030945(0xffffffffb96d1f1f, float:-2.2613675E-4)
            int r3 = X.AnonymousClass0fD.A03(r0)
            r0 = 16777215(0xffffff, float:2.3509886E-38)
            if (r9 <= r0) goto L_0x001a
            boolean r0 = super.onTransact(r9, r10, r11, r12)
            if (r0 == 0) goto L_0x001d
            r4 = 1
            r0 = -82483914(0xfffffffffb156536, float:-7.75705E35)
        L_0x0016:
            X.AnonymousClass0fD.A0A(r0, r3)
            return r4
        L_0x001a:
            X.Pxf.A14(r8, r10)
        L_0x001d:
            r7 = r8
            com.google.android.gms.deviceperformance.internal.zzc r7 = (com.google.android.gms.deviceperformance.internal.zzc) r7
            r0 = -1611070412(0xffffffff9ff90434, float:-1.05462555E-19)
            int r5 = X.AnonymousClass0fD.A03(r0)
            r4 = 1
            if (r9 != r4) goto L_0x0066
            android.os.Parcelable$Creator r0 = com.google.android.gms.common.api.Status.CREATOR
            android.os.Parcelable r6 = X.Pxh.A0L(r10, r0)
            com.google.android.gms.common.api.Status r6 = (com.google.android.gms.common.api.Status) r6
            android.os.Parcelable$Creator r0 = com.google.android.gms.deviceperformance.MediaPerformanceClassResult.CREATOR
            android.os.Parcelable r1 = X.Pxh.A0L(r10, r0)
            com.google.android.gms.deviceperformance.MediaPerformanceClassResult r1 = (com.google.android.gms.deviceperformance.MediaPerformanceClassResult) r1
            int r0 = r10.dataAvail()
            if (r0 > 0) goto L_0x006b
            r0 = -1231792574(0xffffffffb6945642, float:-4.4207854E-6)
            int r2 = X.AnonymousClass0fD.A03(r0)
            if (r1 == 0) goto L_0x0064
            int r0 = r1.A00
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
        L_0x004f:
            X.8nD r0 = r7.A00
            X.C9697RfF.A00(r6, r0, r1)
            r0 = -1487025361(0xffffffffa75dcb2f, float:-3.0780057E-15)
            X.AnonymousClass0fD.A0A(r0, r2)
            r0 = 1221499478(0x48ce9a56, float:423122.7)
        L_0x005d:
            X.AnonymousClass0fD.A0A(r0, r5)
            r0 = 1467249746(0x57747452, float:2.68780429E14)
            goto L_0x0016
        L_0x0064:
            r1 = 0
            goto L_0x004f
        L_0x0066:
            r4 = 0
            r0 = 350385654(0x14e275f6, float:2.2866696E-26)
            goto L_0x005d
        L_0x006b:
            android.os.BadParcelableException r0 = X.Pxg.A0M(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.device_performance.zzb.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
