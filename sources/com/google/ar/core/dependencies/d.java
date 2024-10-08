package com.google.ar.core.dependencies;

import X.AnonymousClass0fD;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;

public abstract class d extends Binder implements IInterface {
    public final IBinder asBinder() {
        AnonymousClass0fD.A0A(2107740493, AnonymousClass0fD.A03(1107149806));
        return this;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00ce  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTransact(int r8, android.os.Parcel r9, android.os.Parcel r10, int r11) {
        /*
            r7 = this;
            r0 = -736586471(0xffffffffd4189519, float:-2.62134589E12)
            int r2 = X.AnonymousClass0fD.A03(r0)
            r0 = 16777215(0xffffff, float:2.3509886E-38)
            if (r8 <= r0) goto L_0x001a
            boolean r0 = super.onTransact(r8, r9, r10, r11)
            if (r0 == 0) goto L_0x001d
            r0 = 1
            r1 = -1272518448(0xffffffffb426e8d0, float:-1.5544651E-7)
        L_0x0016:
            X.AnonymousClass0fD.A0A(r1, r2)
            return r0
        L_0x001a:
            X.Pxf.A14(r7, r9)
        L_0x001d:
            r6 = r7
            boolean r0 = r7 instanceof com.google.ar.core.p
            if (r0 == 0) goto L_0x00ce
            com.google.ar.core.p r6 = (com.google.ar.core.p) r6
            r0 = 1431115017(0x554d1509, float:1.40931393E13)
            int r3 = X.AnonymousClass0fD.A03(r0)
            r0 = 1
            if (r8 == r0) goto L_0x003f
            r0 = 2
            if (r8 == r0) goto L_0x0055
            r0 = 3
            if (r8 == r0) goto L_0x003f
            r0 = 417900606(0x18e8a83e, float:6.0140476E-24)
        L_0x0037:
            X.AnonymousClass0fD.A0A(r0, r3)
            r0 = 0
        L_0x003b:
            r1 = -1300946122(0xffffffffb2752336, float:-1.4268883E-8)
            goto L_0x0016
        L_0x003f:
            android.os.Parcelable$Creator r1 = android.os.Bundle.CREATOR
            int r0 = r9.readInt()
            if (r0 == 0) goto L_0x004a
            r1.createFromParcel(r9)
        L_0x004a:
            int r0 = r9.dataAvail()
            if (r0 <= 0) goto L_0x0095
            android.os.BadParcelableException r0 = X.Pxg.A0M(r0)
            throw r0
        L_0x0055:
            android.os.Parcelable$Creator r0 = android.os.Bundle.CREATOR
            android.os.Parcelable r5 = X.Pxh.A0L(r9, r0)
            android.os.BaseBundle r5 = (android.os.BaseBundle) r5
            int r0 = r9.dataAvail()
            if (r0 > 0) goto L_0x00da
            r0 = -190924828(0xfffffffff49eb7e4, float:-1.0059969E32)
            int r4 = X.AnonymousClass0fD.A03(r0)
            java.lang.String r1 = "error.code"
            r0 = -100
            int r5 = r5.getInt(r1, r0)
            r0 = -5
            java.lang.String r1 = "ARCore-InstallService"
            if (r5 == r0) goto L_0x00bc
            r0 = -3
            if (r5 == r0) goto L_0x00aa
            if (r5 == 0) goto L_0x009d
            java.lang.String r0 = "requestInfo returned: "
            java.lang.String r0 = X.002.A0O(r0, r5)
            android.util.Log.e(r1, r0)
            X.TJ5 r0 = r6.A00
            X.S0g r1 = r0.A01
            X.RDH r0 = X.RDH.A05
            r1.A00(r0)
            r0 = -383192804(0xffffffffe928f11c, float:-1.2764884E25)
        L_0x0092:
            X.AnonymousClass0fD.A0A(r0, r4)
        L_0x0095:
            r0 = -1518218442(0xffffffffa581d336, float:-2.2521055E-16)
            X.AnonymousClass0fD.A0A(r0, r3)
            r0 = 1
            goto L_0x003b
        L_0x009d:
            X.TJ5 r0 = r6.A00
            X.S0g r1 = r0.A01
            X.RDH r0 = X.RDH.A03
            r1.A00(r0)
            r0 = 949657793(0x389aa0c1, float:7.373235E-5)
            goto L_0x0092
        L_0x00aa:
            java.lang.String r0 = "The Google Play application must be updated."
            android.util.Log.e(r1, r0)
            X.TJ5 r0 = r6.A00
            X.S0g r1 = r0.A01
            X.RDH r0 = X.RDH.A05
            r1.A00(r0)
            r0 = 1454721154(0x56b54882, float:9.9661512E13)
            goto L_0x0092
        L_0x00bc:
            java.lang.String r0 = "The device is not supported."
            android.util.Log.e(r1, r0)
            X.TJ5 r0 = r6.A00
            X.S0g r1 = r0.A01
            X.RDH r0 = X.RDH.A06
            r1.A00(r0)
            r0 = 1193096800(0x471d3660, float:40246.375)
            goto L_0x0092
        L_0x00ce:
            r0 = -2127237398(0xffffffff8134eeea, float:-3.323219E-38)
            int r3 = X.AnonymousClass0fD.A03(r0)
            r0 = -927599597(0xffffffffc8b5f413, float:-372640.6)
            goto L_0x0037
        L_0x00da:
            android.os.BadParcelableException r0 = X.Pxg.A0M(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ar.core.dependencies.d.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
