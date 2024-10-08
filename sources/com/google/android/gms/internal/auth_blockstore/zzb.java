package com.google.android.gms.internal.auth_blockstore;

import X.AnonymousClass0fD;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;

public abstract class zzb extends Binder implements IInterface {
    public final IBinder asBinder() {
        AnonymousClass0fD.A0A(-1811953677, AnonymousClass0fD.A03(-2026300582));
        return this;
    }

    public zzb(String str) {
        int A03 = AnonymousClass0fD.A03(-709917162);
        attachInterface(this, str);
        AnonymousClass0fD.A0A(5853961, A03);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0074  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTransact(int r9, android.os.Parcel r10, android.os.Parcel r11, int r12) {
        /*
            r8 = this;
            r0 = -36567356(0xfffffffffdd206c4, float:-3.4896626E37)
            int r4 = X.AnonymousClass0fD.A03(r0)
            r0 = 16777215(0xffffff, float:2.3509886E-38)
            if (r9 <= r0) goto L_0x001a
            boolean r0 = super.onTransact(r9, r10, r11, r12)
            if (r0 == 0) goto L_0x001d
            r6 = 1
            r0 = -1201329244(0xffffffffb8652ba4, float:-5.4638498E-5)
        L_0x0016:
            X.AnonymousClass0fD.A0A(r0, r4)
            return r6
        L_0x001a:
            X.Pxf.A14(r8, r10)
        L_0x001d:
            r7 = r8
            boolean r0 = r8 instanceof com.google.android.gms.internal.auth_blockstore.zzk
            if (r0 == 0) goto L_0x0074
            com.google.android.gms.internal.auth_blockstore.zzk r7 = (com.google.android.gms.internal.auth_blockstore.zzk) r7
            r0 = 1499518719(0x5960d6ff, float:3.95542409E15)
            int r5 = X.AnonymousClass0fD.A03(r0)
            r0 = 1
            if (r9 == r0) goto L_0x00fa
            r0 = 2
            if (r9 == r0) goto L_0x003c
            r0 = -625242649(0xffffffffdabb8de7, float:-2.6395922E16)
            X.AnonymousClass0fD.A0A(r0, r5)
            r6 = 0
        L_0x0038:
            r0 = 1450982289(0x567c3b91, float:6.9333191E13)
            goto L_0x0016
        L_0x003c:
            android.os.Parcelable$Creator r0 = com.google.android.gms.common.api.Status.CREATOR
            android.os.Parcelable r3 = X.Pxh.A0L(r10, r0)
            com.google.android.gms.common.api.Status r3 = (com.google.android.gms.common.api.Status) r3
            android.os.Parcelable$Creator r1 = com.google.android.gms.auth.blockstore.RetrieveBytesResponse.CREATOR
            int r0 = r10.readInt()
            if (r0 != 0) goto L_0x006f
            r0 = 0
        L_0x004d:
            int r1 = r10.dataAvail()
            if (r1 > 0) goto L_0x00f5
            com.google.android.gms.internal.auth_blockstore.zzv r7 = (com.google.android.gms.internal.auth_blockstore.zzv) r7
            r1 = 1172786908(0x45e74edc, float:7401.8574)
            int r2 = X.AnonymousClass0fD.A03(r1)
            X.8nD r1 = r7.A00
            X.C9697RfF.A00(r3, r1, r0)
            r0 = 1523190538(0x5aca0b0a, float:2.84350414E16)
            X.AnonymousClass0fD.A0A(r0, r2)
            r0 = 199390045(0xbe2735d, float:8.722561E-32)
            X.AnonymousClass0fD.A0A(r0, r5)
            r6 = 1
            goto L_0x0038
        L_0x006f:
            java.lang.Object r0 = r1.createFromParcel(r10)
            goto L_0x004d
        L_0x0074:
            boolean r0 = r8 instanceof com.google.android.gms.internal.auth_blockstore.zzy
            if (r0 == 0) goto L_0x00b8
            com.google.android.gms.internal.auth_blockstore.zzy r7 = (com.google.android.gms.internal.auth_blockstore.zzy) r7
            r0 = 309586204(0x1273e91c, float:7.696461E-28)
            int r5 = X.AnonymousClass0fD.A03(r0)
            r6 = 1
            if (r9 != r6) goto L_0x00b3
            android.os.Parcelable$Creator r0 = com.google.android.gms.common.api.Status.CREATOR
            android.os.Parcelable r3 = X.Pxh.A0L(r10, r0)
            com.google.android.gms.common.api.Status r3 = (com.google.android.gms.common.api.Status) r3
            boolean r1 = X.C41848B3p.A1X(r10)
            int r0 = r10.dataAvail()
            if (r0 > 0) goto L_0x0125
            r0 = 1109666827(0x42242c0b, float:41.04301)
            int r2 = X.AnonymousClass0fD.A03(r0)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            X.8nD r0 = r7.A00
            X.C9697RfF.A00(r3, r0, r1)
            r0 = -2070289974(0xffffffff8499e1ca, float:-3.617748E-36)
            X.AnonymousClass0fD.A0A(r0, r2)
            r0 = -1911967959(0xffffffff8e09af29, float:-1.697089E-30)
        L_0x00af:
            X.AnonymousClass0fD.A0A(r0, r5)
            goto L_0x0038
        L_0x00b3:
            r6 = 0
            r0 = 688817054(0x290e839e, float:3.1644494E-14)
            goto L_0x00af
        L_0x00b8:
            com.google.android.gms.internal.auth_blockstore.zzu r7 = (com.google.android.gms.internal.auth_blockstore.zzu) r7
            r0 = 81411986(0x4da3f92, float:5.1309934E-36)
            int r5 = X.AnonymousClass0fD.A03(r0)
            r6 = 1
            if (r9 != r6) goto L_0x00f0
            android.os.Parcelable$Creator r0 = com.google.android.gms.common.api.Status.CREATOR
            android.os.Parcelable r3 = X.Pxh.A0L(r10, r0)
            com.google.android.gms.common.api.Status r3 = (com.google.android.gms.common.api.Status) r3
            int r1 = r10.readInt()
            int r0 = r10.dataAvail()
            if (r0 > 0) goto L_0x012a
            r0 = 969333406(0x39c6da9e, float:3.7928385E-4)
            int r2 = X.AnonymousClass0fD.A03(r0)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            X.8nD r0 = r7.A00
            X.C9697RfF.A00(r3, r0, r1)
            r0 = 457067075(0x1b3e4a43, float:1.5740427E-22)
            X.AnonymousClass0fD.A0A(r0, r2)
            r0 = 68497620(0x41530d4, float:1.7537287E-36)
            goto L_0x00af
        L_0x00f0:
            r6 = 0
            r0 = -853772175(0xffffffffcd1c7871, float:-1.64071184E8)
            goto L_0x00af
        L_0x00f5:
            android.os.BadParcelableException r2 = X.Pxg.A0M(r1)
            throw r2
        L_0x00fa:
            android.os.Parcelable$Creator r1 = com.google.android.gms.common.api.Status.CREATOR
            int r0 = r10.readInt()
            if (r0 == 0) goto L_0x0105
            r1.createFromParcel(r10)
        L_0x0105:
            r10.createByteArray()
            int r0 = r10.dataAvail()
            if (r0 > 0) goto L_0x0120
            r0 = -323253540(0xffffffffecbb8adc, float:-1.813799E27)
            int r1 = X.AnonymousClass0fD.A03(r0)
            java.lang.UnsupportedOperationException r2 = X.C66580MXl.A11()
            r0 = -363254742(0xffffffffea592c2a, float:-6.5636365E25)
            X.AnonymousClass0fD.A0A(r0, r1)
            throw r2
        L_0x0120:
            android.os.BadParcelableException r2 = X.Pxg.A0M(r0)
            throw r2
        L_0x0125:
            android.os.BadParcelableException r2 = X.Pxg.A0M(r0)
            throw r2
        L_0x012a:
            android.os.BadParcelableException r2 = X.Pxg.A0M(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth_blockstore.zzb.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
