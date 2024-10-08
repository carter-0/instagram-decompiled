package com.google.android.gms.internal.safetynet;

import X.AnonymousClass0fD;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;

public abstract class zzb extends Binder implements IInterface {
    public final IBinder asBinder() {
        AnonymousClass0fD.A0A(1162498016, AnonymousClass0fD.A03(1315444279));
        return this;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0051  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTransact(int r8, android.os.Parcel r9, android.os.Parcel r10, int r11) {
        /*
            r7 = this;
            r0 = -1670519701(0xffffffff9c6de46b, float:-7.8711945E-22)
            int r5 = X.AnonymousClass0fD.A03(r0)
            r0 = 16777215(0xffffff, float:2.3509886E-38)
            if (r8 <= r0) goto L_0x001a
            boolean r0 = super.onTransact(r8, r9, r10, r11)
            if (r0 == 0) goto L_0x001d
            r1 = 1
            r0 = -1419468264(0xffffffffab64a218, float:-8.122682E-13)
        L_0x0016:
            X.AnonymousClass0fD.A0A(r0, r5)
            return r1
        L_0x001a:
            X.Pxf.A14(r7, r9)
        L_0x001d:
            r1 = r7
            com.google.android.gms.internal.safetynet.zzh r1 = (com.google.android.gms.internal.safetynet.zzh) r1
            r0 = -327317852(0xffffffffec7d86a4, float:-1.2259762E27)
            int r6 = X.AnonymousClass0fD.A03(r0)
            r0 = 1
            if (r8 == r0) goto L_0x0051
            r0 = 2
            if (r8 == r0) goto L_0x0116
            r0 = 3
            if (r8 == r0) goto L_0x00fd
            r0 = 4
            if (r8 == r0) goto L_0x00e6
            r0 = 6
            if (r8 == r0) goto L_0x00cd
            r0 = 8
            if (r8 == r0) goto L_0x00b4
            r0 = 15
            if (r8 == r0) goto L_0x009a
            r0 = 10
            if (r8 == r0) goto L_0x0082
            r0 = 11
            if (r8 == r0) goto L_0x0128
            r0 = -1079990223(0xffffffffbfa0a831, float:-1.2551328)
            X.AnonymousClass0fD.A0A(r0, r6)
            r1 = 0
        L_0x004d:
            r0 = -283988315(0xffffffffef12aea5, float:-4.5395944E28)
            goto L_0x0016
        L_0x0051:
            android.os.Parcelable$Creator r0 = com.google.android.gms.common.api.Status.CREATOR
            android.os.Parcelable r4 = X.Pxh.A0L(r9, r0)
            com.google.android.gms.common.api.Status r4 = (com.google.android.gms.common.api.Status) r4
            android.os.Parcelable$Creator r0 = com.google.android.gms.safetynet.zza.CREATOR
            android.os.Parcelable r3 = X.Pxh.A0L(r9, r0)
            com.google.android.gms.safetynet.zza r3 = (com.google.android.gms.safetynet.zza) r3
            com.google.android.gms.internal.safetynet.zzs r1 = (com.google.android.gms.internal.safetynet.zzs) r1
            r0 = -1438580690(0xffffffffaa41002e, float:-1.7141906E-13)
            int r2 = X.AnonymousClass0fD.A03(r0)
            X.Qxa r1 = r1.A00
            X.Or3 r0 = new X.Or3
            r0.<init>(r4, r3)
            r1.A06(r0)
            r0 = 938216723(0x37ec0d13, float:2.813948E-5)
            X.AnonymousClass0fD.A0A(r0, r2)
            r0 = -1675967967(0xffffffff9c1ac221, float:-5.120523E-22)
            X.AnonymousClass0fD.A0A(r0, r6)
            r1 = 1
            goto L_0x004d
        L_0x0082:
            android.os.Parcelable$Creator r0 = com.google.android.gms.common.api.Status.CREATOR
            X.Pxh.A0L(r9, r0)
            r9.readInt()
            r0 = 938961795(0x37f76b83, float:2.9494759E-5)
            int r2 = X.AnonymousClass0fD.A03(r0)
            java.lang.UnsupportedOperationException r1 = X.C66580MXl.A11()
            r0 = -682690614(0xffffffffd74ef7ca, float:-2.27563641E14)
            goto L_0x013b
        L_0x009a:
            android.os.Parcelable$Creator r0 = com.google.android.gms.common.api.Status.CREATOR
            X.Pxh.A0L(r9, r0)
            android.os.Parcelable$Creator r0 = com.google.android.gms.safetynet.zzh.CREATOR
            X.Pxh.A0L(r9, r0)
            r0 = 497120371(0x1da17473, float:4.273675E-21)
            int r2 = X.AnonymousClass0fD.A03(r0)
            java.lang.UnsupportedOperationException r1 = X.C66580MXl.A11()
            r0 = 1233272284(0x49823ddc, float:1066939.5)
            goto L_0x013b
        L_0x00b4:
            android.os.Parcelable$Creator r0 = com.google.android.gms.common.api.Status.CREATOR
            X.Pxh.A0L(r9, r0)
            android.os.Parcelable$Creator r0 = com.google.android.gms.safetynet.zzd.CREATOR
            X.Pxh.A0L(r9, r0)
            r0 = -576487706(0xffffffffdda37ee6, float:-1.47263832E18)
            int r2 = X.AnonymousClass0fD.A03(r0)
            java.lang.UnsupportedOperationException r1 = X.C66580MXl.A11()
            r0 = 835279620(0x31c95b04, float:5.860217E-9)
            goto L_0x013b
        L_0x00cd:
            android.os.Parcelable$Creator r0 = com.google.android.gms.common.api.Status.CREATOR
            X.Pxh.A0L(r9, r0)
            android.os.Parcelable$Creator r0 = com.google.android.gms.safetynet.zzf.CREATOR
            X.Pxh.A0L(r9, r0)
            r0 = -1732215827(0xffffffff98c07bed, float:-4.975597E-24)
            int r2 = X.AnonymousClass0fD.A03(r0)
            java.lang.UnsupportedOperationException r1 = X.C66580MXl.A11()
            r0 = 2110392790(0x7dca09d6, float:3.356939E37)
            goto L_0x013b
        L_0x00e6:
            android.os.Parcelable$Creator r0 = com.google.android.gms.common.api.Status.CREATOR
            X.Pxh.A0L(r9, r0)
            r9.readInt()
            r0 = 504100917(0x1e0bf835, float:7.409927E-21)
            int r2 = X.AnonymousClass0fD.A03(r0)
            java.lang.UnsupportedOperationException r1 = X.C66580MXl.A11()
            r0 = -1042925533(0xffffffffc1d63823, float:-26.77741)
            goto L_0x013b
        L_0x00fd:
            android.os.Parcelable$Creator r0 = com.google.android.gms.common.api.Status.CREATOR
            X.Pxh.A0L(r9, r0)
            android.os.Parcelable$Creator r0 = com.google.android.gms.safetynet.SafeBrowsingData.CREATOR
            X.Pxh.A0L(r9, r0)
            r0 = 10410541(0x9eda2d, float:1.4588275E-38)
            int r2 = X.AnonymousClass0fD.A03(r0)
            java.lang.UnsupportedOperationException r1 = X.C66580MXl.A11()
            r0 = 110687571(0x698f553, float:5.7536517E-35)
            goto L_0x013b
        L_0x0116:
            r9.readString()
            r0 = 330561414(0x13b3f786, float:4.543003E-27)
            int r2 = X.AnonymousClass0fD.A03(r0)
            java.lang.UnsupportedOperationException r1 = X.C66580MXl.A11()
            r0 = -1631347409(0xffffffff9ec39d2f, float:-2.0711438E-20)
            goto L_0x013b
        L_0x0128:
            android.os.Parcelable$Creator r0 = com.google.android.gms.common.api.Status.CREATOR
            X.Pxh.A0L(r9, r0)
            r0 = -2008051377(0xffffffff884f914f, float:-6.2462606E-34)
            int r2 = X.AnonymousClass0fD.A03(r0)
            java.lang.UnsupportedOperationException r1 = X.C66580MXl.A11()
            r0 = -94107580(0xfffffffffa640844, float:-2.9600283E35)
        L_0x013b:
            X.AnonymousClass0fD.A0A(r0, r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.safetynet.zzb.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
