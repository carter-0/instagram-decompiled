package com.google.android.play.integrity.internal;

import X.AnonymousClass0fD;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;

public abstract class b extends Binder implements IInterface {
    public final IBinder asBinder() {
        AnonymousClass0fD.A0A(-1313686943, AnonymousClass0fD.A03(163954456));
        return this;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x006c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTransact(int r11, android.os.Parcel r12, android.os.Parcel r13, int r14) {
        /*
            r10 = this;
            r0 = 277221383(0x10861007, float:5.2878375E-29)
            int r3 = X.AnonymousClass0fD.A03(r0)
            r0 = 16777215(0xffffff, float:2.3509886E-38)
            if (r11 <= r0) goto L_0x001a
            boolean r0 = super.onTransact(r11, r12, r13, r14)
            if (r0 == 0) goto L_0x001d
            r1 = 1
            r0 = 487345273(0x1d0c4c79, float:1.8568381E-21)
        L_0x0016:
            X.AnonymousClass0fD.A0A(r0, r3)
            return r1
        L_0x001a:
            X.Pxf.A14(r10, r12)
        L_0x001d:
            r8 = r10
            com.google.android.play.core.integrity.s r8 = (com.google.android.play.core.integrity.s) r8
            r0 = 1735054892(0x676ad62c, float:1.1089845E24)
            int r4 = X.AnonymousClass0fD.A03(r0)
            r0 = 2
            if (r11 != r0) goto L_0x006c
            android.os.Parcelable$Creator r0 = android.os.Bundle.CREATOR
            android.os.Parcelable r7 = X.Pxh.A0L(r12, r0)
            android.os.BaseBundle r7 = (android.os.BaseBundle) r7
            int r0 = r12.dataAvail()
            if (r0 > 0) goto L_0x00d7
            r0 = -1001810849(0xffffffffc449945f, float:-806.3183)
            int r5 = X.AnonymousClass0fD.A03(r0)
            X.Rv7 r0 = r8.A02
            X.SOT r2 = r0.A01
            X.8nD r6 = r8.A00
            java.lang.Object r9 = r2.A07
            monitor-enter(r9)
            java.util.Set r0 = r2.A0A     // Catch:{ all -> 0x00d4 }
            r0.remove(r6)     // Catch:{ all -> 0x00d4 }
            monitor-exit(r9)     // Catch:{ all -> 0x00d4 }
            monitor-enter(r9)
            java.util.concurrent.atomic.AtomicInteger r1 = r2.A0B     // Catch:{ all -> 0x00d1 }
            int r0 = r1.get()     // Catch:{ all -> 0x00d1 }
            if (r0 <= 0) goto L_0x006a
            int r0 = r1.decrementAndGet()     // Catch:{ all -> 0x00d1 }
            if (r0 <= 0) goto L_0x006a
            X.SGh r2 = r2.A06     // Catch:{ all -> 0x00d1 }
            java.lang.String r1 = "Leaving the connection open for other ongoing calls."
            java.lang.Object[] r0 = X.Pxe.A1b()     // Catch:{ all -> 0x00d1 }
            r2.A01(r1, r0)     // Catch:{ all -> 0x00d1 }
            monitor-exit(r9)     // Catch:{ all -> 0x00d1 }
            goto L_0x007d
        L_0x006a:
            monitor-exit(r9)     // Catch:{ all -> 0x00d1 }
            goto L_0x0071
        L_0x006c:
            r1 = 0
            r0 = -1004332104(0xffffffffc4231bb8, float:-652.4331)
            goto L_0x00a4
        L_0x0071:
            X.QyA r1 = new X.QyA
            r1.<init>(r2)
            android.os.Handler r0 = r2.A01()
            r0.post(r1)
        L_0x007d:
            X.SGh r2 = r8.A01
            java.lang.Object[] r1 = X.Pxe.A1b()
            java.lang.String r0 = "onRequestIntegrityToken"
            r2.A01(r0, r1)
            java.lang.String r0 = "error"
            int r1 = r7.getInt(r0)
            r2 = 0
            if (r1 == 0) goto L_0x00ac
            X.QpI r0 = new X.QpI
            r0.<init>(r1, r2)
            r6.A02(r0)
            r0 = -1670897561(0xffffffff9c682067, float:-7.680424E-22)
        L_0x009d:
            X.AnonymousClass0fD.A0A(r0, r5)
            r1 = 1
            r0 = -2013443003(0xffffffff87fd4c45, float:-3.8112036E-34)
        L_0x00a4:
            X.AnonymousClass0fD.A0A(r0, r4)
            r0 = 1606579641(0x5fc275b9, float:2.8024618E19)
            goto L_0x0016
        L_0x00ac:
            java.lang.String r0 = "token"
            java.lang.String r0 = r7.getString(r0)
            if (r0 != 0) goto L_0x00c3
            r1 = -100
            X.QpI r0 = new X.QpI
            r0.<init>(r1, r2)
            r6.A02(r0)
            r0 = 360108791(0x1576d2f7, float:4.9845726E-26)
            goto L_0x009d
        L_0x00c3:
            X.Qxt r1 = new X.Qxt
            r1.<init>(r0)
            X.9GD r0 = r6.A00
            r0.A0F(r1)
            r0 = 1453337108(0x56a02a14, float:8.8051292E13)
            goto L_0x009d
        L_0x00d1:
            r0 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x00d1 }
            throw r0
        L_0x00d4:
            r0 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x00d4 }
            throw r0
        L_0x00d7:
            android.os.BadParcelableException r0 = X.Pxg.A0M(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.integrity.internal.b.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
