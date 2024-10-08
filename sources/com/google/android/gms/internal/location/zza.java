package com.google.android.gms.internal.location;

import X.AnonymousClass0fD;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;

public abstract class zza extends Binder implements IInterface {
    public zza(String str) {
        int A03 = AnonymousClass0fD.A03(1432871374);
        attachInterface(this, str);
        AnonymousClass0fD.A0A(-703433712, A03);
    }

    public final IBinder asBinder() {
        AnonymousClass0fD.A0A(-65678159, AnonymousClass0fD.A03(1813310896));
        return this;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x005c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTransact(int r8, android.os.Parcel r9, android.os.Parcel r10, int r11) {
        /*
            r7 = this;
            r0 = -1221644972(0xffffffffb72f2d54, float:-1.0441367E-5)
            int r3 = X.AnonymousClass0fD.A03(r0)
            r0 = 16777215(0xffffff, float:2.3509886E-38)
            if (r8 <= r0) goto L_0x001a
            boolean r0 = super.onTransact(r8, r9, r10, r11)
            if (r0 == 0) goto L_0x001d
            r5 = 1
            r0 = -62759463(0xfffffffffc425dd9, float:-4.0368362E36)
        L_0x0016:
            X.AnonymousClass0fD.A0A(r0, r3)
            return r5
        L_0x001a:
            X.Pxf.A14(r7, r9)
        L_0x001d:
            r2 = r7
            boolean r0 = r7 instanceof com.google.android.gms.internal.location.zzaz
            if (r0 == 0) goto L_0x005c
            com.google.android.gms.internal.location.zzaz r2 = (com.google.android.gms.internal.location.zzaz) r2
            r0 = 1226516167(0x491b26c7, float:635500.44)
            int r6 = X.AnonymousClass0fD.A03(r0)
            r5 = 1
            if (r8 != r5) goto L_0x0057
            android.os.Parcelable$Creator r0 = com.google.android.gms.location.LocationSettingsResult.CREATOR
            android.os.Parcelable r4 = X.Pxh.A0L(r9, r0)
            com.google.android.gms.location.LocationSettingsResult r4 = (com.google.android.gms.location.LocationSettingsResult) r4
            r0 = -1860818505(0xffffffff911629b7, float:-1.1845768E-28)
            int r1 = X.AnonymousClass0fD.A03(r0)
            X.Tav r0 = r2.A00
            com.google.android.gms.common.api.internal.BasePendingResult r0 = (com.google.android.gms.common.api.internal.BasePendingResult) r0
            r0.A06(r4)
            r0 = 0
            r2.A00 = r0
            r0 = 1377546889(0x521bb289, float:1.67178813E11)
            X.AnonymousClass0fD.A0A(r0, r1)
            r0 = -343838041(0xffffffffeb8172a7, float:-3.1298572E26)
        L_0x0050:
            X.AnonymousClass0fD.A0A(r0, r6)
        L_0x0053:
            r0 = 1093600575(0x412f053f, float:10.938781)
            goto L_0x0016
        L_0x0057:
            r5 = 0
            r0 = -1697043938(0xffffffff9ad92a1e, float:-8.981714E-23)
            goto L_0x0050
        L_0x005c:
            boolean r0 = r7 instanceof com.google.android.gms.internal.location.zzas
            if (r0 == 0) goto L_0x0077
            com.google.android.gms.internal.location.zzas r2 = (com.google.android.gms.internal.location.zzas) r2
            r0 = -715841369(0xffffffffd55520a7, float:-1.46460136E13)
            int r4 = X.AnonymousClass0fD.A03(r0)
            r0 = 1
            if (r8 == r0) goto L_0x00c1
            r0 = 2
            if (r8 == r0) goto L_0x008a
            r0 = -1146999123(0xffffffffbba22ead, float:-0.004949412)
        L_0x0072:
            X.AnonymousClass0fD.A0A(r0, r4)
            r5 = 0
            goto L_0x0053
        L_0x0077:
            com.google.android.gms.internal.location.zzah r2 = (com.google.android.gms.internal.location.zzah) r2
            r0 = 715726681(0x2aa91f59, float:3.0042182E-13)
            int r4 = X.AnonymousClass0fD.A03(r0)
            r0 = 1
            if (r8 == r0) goto L_0x00b2
            r0 = 2
            if (r8 == r0) goto L_0x00ae
            r0 = -1598604518(0xffffffffa0b73b1a, float:-3.1040516E-19)
            goto L_0x0072
        L_0x008a:
            android.os.Parcelable$Creator r0 = com.google.android.gms.location.LocationAvailability.CREATOR
            android.os.Parcelable r1 = X.Pxh.A0L(r9, r0)
            com.google.android.gms.location.LocationAvailability r1 = (com.google.android.gms.location.LocationAvailability) r1
            r0 = -708481067(0xffffffffd5c56fd5, float:-2.71355132E13)
            int r5 = X.AnonymousClass0fD.A03(r0)
            X.Rus r2 = r2.A00
            X.SxH r0 = new X.SxH
            r0.<init>(r1)
            X.TH5 r1 = new X.TH5
            r1.<init>(r0, r2)
            java.util.concurrent.Executor r0 = r2.A00
            r0.execute(r1)
            r0 = 1333366222(0x4f798dce, float:4.1868201E9)
            goto L_0x00e4
        L_0x00ae:
            r2.A6u()
            goto L_0x00bd
        L_0x00b2:
            android.os.Parcelable$Creator r0 = com.google.android.gms.internal.location.zzac.CREATOR
            android.os.Parcelable r0 = X.Pxh.A0L(r9, r0)
            com.google.android.gms.internal.location.zzac r0 = (com.google.android.gms.internal.location.zzac) r0
            r2.FP4(r0)
        L_0x00bd:
            r0 = 1405533967(0x53c6bf0f, float:1.70721791E12)
            goto L_0x00ea
        L_0x00c1:
            android.os.Parcelable$Creator r0 = com.google.android.gms.location.LocationResult.CREATOR
            android.os.Parcelable r1 = X.Pxh.A0L(r9, r0)
            com.google.android.gms.location.LocationResult r1 = (com.google.android.gms.location.LocationResult) r1
            r0 = -1310496737(0xffffffffb1e3681f, float:-6.6184067E-9)
            int r5 = X.AnonymousClass0fD.A03(r0)
            X.Rus r2 = r2.A00
            X.SxG r0 = new X.SxG
            r0.<init>(r1)
            X.TH5 r1 = new X.TH5
            r1.<init>(r0, r2)
            java.util.concurrent.Executor r0 = r2.A00
            r0.execute(r1)
            r0 = -6166997(0xffffffffffa1e62b, float:NaN)
        L_0x00e4:
            X.AnonymousClass0fD.A0A(r0, r5)
            r0 = -813099893(0xffffffffcf89148b, float:-4.5996498E9)
        L_0x00ea:
            X.AnonymousClass0fD.A0A(r0, r4)
            r5 = 1
            goto L_0x0053
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.location.zza.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
