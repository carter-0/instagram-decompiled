package com.google.android.gms.internal.auth;

import X.AnonymousClass0fD;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;

public abstract class zzb extends Binder implements IInterface {
    public final IBinder asBinder() {
        AnonymousClass0fD.A0A(-321684353, AnonymousClass0fD.A03(178570651));
        return this;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0063  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTransact(int r8, android.os.Parcel r9, android.os.Parcel r10, int r11) {
        /*
            r7 = this;
            r0 = -2033467173(0xffffffff86cbc0db, float:-7.664349E-35)
            int r3 = X.AnonymousClass0fD.A03(r0)
            r0 = 16777215(0xffffff, float:2.3509886E-38)
            if (r8 <= r0) goto L_0x001a
            boolean r0 = super.onTransact(r8, r9, r10, r11)
            if (r0 == 0) goto L_0x001d
            r1 = 1
            r0 = 75942226(0x486c952, float:3.1688132E-36)
        L_0x0016:
            X.AnonymousClass0fD.A0A(r0, r3)
            return r1
        L_0x001a:
            X.Pxf.A14(r7, r9)
        L_0x001d:
            r6 = r7
            com.google.android.gms.internal.auth.zzw r6 = (com.google.android.gms.internal.auth.zzw) r6
            r0 = -2081466325(0xffffffff83ef582b, float:-1.40674E-36)
            int r5 = X.AnonymousClass0fD.A03(r0)
            r0 = 2
            if (r8 != r0) goto L_0x0063
            android.os.Parcelable$Creator r0 = com.google.android.gms.common.api.Status.CREATOR
            android.os.Parcelable r4 = X.Pxh.A0L(r9, r0)
            com.google.android.gms.common.api.Status r4 = (com.google.android.gms.common.api.Status) r4
            android.os.Parcelable$Creator r1 = android.os.Bundle.CREATOR
            int r0 = r9.readInt()
            if (r0 != 0) goto L_0x005e
            r0 = 0
        L_0x003b:
            int r1 = r9.dataAvail()
            if (r1 > 0) goto L_0x0068
            r1 = 826791745(0x3147d741, float:2.908067E-9)
            int r2 = X.AnonymousClass0fD.A03(r1)
            X.8nD r1 = r6.A00
            X.QpR.A02(r4, r1, r0)
            r0 = 2120761652(0x7e684134, float:7.717986E37)
            X.AnonymousClass0fD.A0A(r0, r2)
            r1 = 1
            r0 = 1991893942(0x76b9e3b6, float:1.8851434E33)
        L_0x0057:
            X.AnonymousClass0fD.A0A(r0, r5)
            r0 = -41829849(0xfffffffffd81ba27, float:-2.155462E37)
            goto L_0x0016
        L_0x005e:
            java.lang.Object r0 = r1.createFromParcel(r9)
            goto L_0x003b
        L_0x0063:
            r1 = 0
            r0 = 1803982827(0x6b8697eb, float:3.2542694E26)
            goto L_0x0057
        L_0x0068:
            android.os.BadParcelableException r0 = X.Pxg.A0M(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.zzb.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
