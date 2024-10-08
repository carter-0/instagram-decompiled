package com.google.android.gms.internal.fido;

import X.AnonymousClass0fD;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;

public abstract class zzb extends Binder implements IInterface {
    public final IBinder asBinder() {
        AnonymousClass0fD.A0A(670219340, AnonymousClass0fD.A03(1617277324));
        return this;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x004d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTransact(int r8, android.os.Parcel r9, android.os.Parcel r10, int r11) {
        /*
            r7 = this;
            r0 = 319829779(0x13103713, float:1.8202509E-27)
            int r6 = X.AnonymousClass0fD.A03(r0)
            r0 = 16777215(0xffffff, float:2.3509886E-38)
            if (r8 <= r0) goto L_0x001a
            boolean r0 = super.onTransact(r8, r9, r10, r11)
            if (r0 == 0) goto L_0x001d
            r3 = 1
            r0 = 2061915392(0x7ae65500, float:5.9797614E35)
        L_0x0016:
            X.AnonymousClass0fD.A0A(r0, r6)
            return r3
        L_0x001a:
            X.Pxf.A14(r7, r9)
        L_0x001d:
            r5 = r7
            com.google.android.gms.internal.fido.zzq r5 = (com.google.android.gms.internal.fido.zzq) r5
            r0 = -381567941(0xffffffffe941bc3b, float:-1.4638224E25)
            int r4 = X.AnonymousClass0fD.A03(r0)
            r3 = 1
            if (r8 != r3) goto L_0x004d
            android.os.Parcelable$Creator r0 = com.google.android.gms.common.api.Status.CREATOR
            android.os.Parcelable r2 = X.Pxh.A0L(r9, r0)
            com.google.android.gms.common.api.Status r2 = (com.google.android.gms.common.api.Status) r2
            android.os.Parcelable$Creator r0 = android.app.PendingIntent.CREATOR
            android.os.Parcelable r1 = X.Pxh.A0L(r9, r0)
            android.app.PendingIntent r1 = (android.app.PendingIntent) r1
            int r0 = r9.dataAvail()
            if (r0 > 0) goto L_0x0052
            r5.FPM(r1, r2)
            r0 = -1407774653(0xffffffffac171043, float:-2.1467418E-12)
        L_0x0046:
            X.AnonymousClass0fD.A0A(r0, r4)
            r0 = 2060134006(0x7acb2676, float:5.2740817E35)
            goto L_0x0016
        L_0x004d:
            r3 = 0
            r0 = 1429328687(0x5531d32f, float:1.22200365E13)
            goto L_0x0046
        L_0x0052:
            android.os.BadParcelableException r0 = X.Pxg.A0M(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.fido.zzb.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
