package com.google.android.play.core.splitinstall.internal;

import X.AnonymousClass0fD;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.play.core.splitinstall.zzbh;

public abstract class zzl extends Binder implements IInterface {
    public final IBinder asBinder() {
        AnonymousClass0fD.A0A(-1032421521, AnonymousClass0fD.A03(-1800318004));
        return this;
    }

    public static int A00(zzbh zzbh, int i) {
        int A03 = AnonymousClass0fD.A03(i);
        zzbh.A01.A00.A02(zzbh.A00);
        return A03;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002e, code lost:
        X.AnonymousClass0fD.A0A(r0, r4);
        r0 = -783287010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0196, code lost:
        X.AnonymousClass0fD.A0A(r0, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0199, code lost:
        r1 = true;
        r0 = -2010019424;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0103  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0113  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0134  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0155  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0176  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTransact(int r9, android.os.Parcel r10, android.os.Parcel r11, int r12) {
        /*
            r8 = this;
            r0 = 1437407141(0x55ad17a5, float:2.3789633E13)
            int r3 = X.AnonymousClass0fD.A03(r0)
            r0 = 16777215(0xffffff, float:2.3509886E-38)
            if (r9 <= r0) goto L_0x001a
            boolean r0 = super.onTransact(r9, r10, r11, r12)
            if (r0 == 0) goto L_0x001d
            r1 = 1
            r0 = 1791072272(0x6ac19810, float:1.1702039E26)
        L_0x0016:
            X.AnonymousClass0fD.A0A(r0, r3)
            return r1
        L_0x001a:
            X.Pxf.A14(r8, r10)
        L_0x001d:
            r1 = r8
            com.google.android.play.core.splitinstall.internal.zzbp r1 = (com.google.android.play.core.splitinstall.internal.zzbp) r1
            r0 = 1924091511(0x72af4e77, float:6.944606E30)
            int r4 = X.AnonymousClass0fD.A03(r0)
            switch(r9) {
                case 2: goto L_0x0035;
                case 3: goto L_0x0049;
                case 4: goto L_0x006f;
                case 5: goto L_0x0083;
                case 6: goto L_0x00a9;
                case 7: goto L_0x00e5;
                case 8: goto L_0x00f3;
                case 9: goto L_0x0103;
                case 10: goto L_0x0113;
                case 11: goto L_0x0134;
                case 12: goto L_0x0155;
                case 13: goto L_0x0176;
                default: goto L_0x002a;
            }
        L_0x002a:
            r1 = 0
            r0 = -1539198318(0xffffffffa441b292, float:-4.200146E-17)
        L_0x002e:
            X.AnonymousClass0fD.A0A(r0, r4)
            r0 = -783287010(0xffffffffd14ffd1e, float:-5.5831552E10)
            goto L_0x0016
        L_0x0035:
            int r2 = r10.readInt()
            android.os.Parcelable$Creator r0 = android.os.Bundle.CREATOR
            android.os.Parcelable r0 = X.Pxh.A0L(r10, r0)
            android.os.Bundle r0 = (android.os.Bundle) r0
            X.Q18.A00(r10)
            r1.FQC(r2, r0)
            goto L_0x0199
        L_0x0049:
            int r6 = r10.readInt()
            android.os.Parcelable$Creator r0 = android.os.Bundle.CREATOR
            X.Pxh.A0L(r10, r0)
            X.Q18.A00(r10)
            com.google.android.play.core.splitinstall.zzbh r1 = (com.google.android.play.core.splitinstall.zzbh) r1
            r0 = 1934057034(0x73475e4a, float:1.5795585E31)
            int r5 = A00(r1, r0)
            X.2Jh r2 = X.2Jg.A02
            java.lang.Object[] r1 = X.AnonymousClass7TF.A1b(r6)
            java.lang.String r0 = "onCompleteInstall(%d)"
            r2.A03(r0, r1)
            r0 = 1781361505(0x6a2d6b61, float:5.2412812E25)
            goto L_0x0196
        L_0x006f:
            int r2 = r10.readInt()
            android.os.Parcelable$Creator r0 = android.os.Bundle.CREATOR
            android.os.Parcelable r0 = X.Pxh.A0L(r10, r0)
            android.os.Bundle r0 = (android.os.Bundle) r0
            X.Q18.A00(r10)
            r1.FPG(r2, r0)
            goto L_0x0199
        L_0x0083:
            int r6 = r10.readInt()
            android.os.Parcelable$Creator r0 = android.os.Bundle.CREATOR
            X.Pxh.A0L(r10, r0)
            X.Q18.A00(r10)
            com.google.android.play.core.splitinstall.zzbh r1 = (com.google.android.play.core.splitinstall.zzbh) r1
            r0 = 1182649588(0x467dccf4, float:16243.238)
            int r5 = A00(r1, r0)
            X.2Jh r2 = X.2Jg.A02
            java.lang.Object[] r1 = X.AnonymousClass7TF.A1b(r6)
            java.lang.String r0 = "onGetSession(%d)"
            r2.A03(r0, r1)
            r0 = 2057390965(0x7aa14b75, float:4.1874512E35)
            goto L_0x0196
        L_0x00a9:
            android.os.Parcelable$Creator r0 = android.os.Bundle.CREATOR
            android.os.Parcelable r2 = X.Pxh.A0L(r10, r0)
            android.os.BaseBundle r2 = (android.os.BaseBundle) r2
            X.Q18.A00(r10)
            com.google.android.play.core.splitinstall.zzbh r1 = (com.google.android.play.core.splitinstall.zzbh) r1
            r0 = -1631494501(0xffffffff9ec15e9b, float:-2.0473798E-20)
            int r5 = X.AnonymousClass0fD.A03(r0)
            X.2Jg r0 = r1.A01
            X.2Jk r0 = r0.A00
            X.8nD r7 = r1.A00
            r0.A02(r7)
            java.lang.String r0 = "error_code"
            int r6 = r2.getInt(r0)
            X.2Jh r2 = X.2Jg.A02
            java.lang.Object[] r1 = X.AnonymousClass7TF.A1b(r6)
            java.lang.String r0 = "onError(%d)"
            r2.A02(r0, r1)
            X.QpH r0 = new X.QpH
            r0.<init>(r6)
            r7.A02(r0)
            r0 = 883727599(0x34ac9cef, float:3.215168E-7)
            goto L_0x0196
        L_0x00e5:
            android.os.Parcelable$Creator r0 = android.os.Bundle.CREATOR
            java.util.ArrayList r0 = r10.createTypedArrayList(r0)
            X.Q18.A00(r10)
            r1.FQ5(r0)
            goto L_0x0199
        L_0x00f3:
            android.os.Parcelable$Creator r0 = android.os.Bundle.CREATOR
            android.os.Parcelable r0 = X.Pxh.A0L(r10, r0)
            android.os.Bundle r0 = (android.os.Bundle) r0
            X.Q18.A00(r10)
            r1.FPx(r0)
            goto L_0x0199
        L_0x0103:
            android.os.Parcelable$Creator r0 = android.os.Bundle.CREATOR
            android.os.Parcelable r0 = X.Pxh.A0L(r10, r0)
            android.os.Bundle r0 = (android.os.Bundle) r0
            X.Q18.A00(r10)
            r1.FPe(r0)
            goto L_0x0199
        L_0x0113:
            android.os.Parcelable$Creator r0 = android.os.Bundle.CREATOR
            X.Pxh.A0L(r10, r0)
            X.Q18.A00(r10)
            com.google.android.play.core.splitinstall.zzbh r1 = (com.google.android.play.core.splitinstall.zzbh) r1
            r0 = -116363309(0xfffffffff9106fd3, float:-4.6872426E34)
            int r5 = A00(r1, r0)
            X.2Jh r2 = X.2Jg.A02
            java.lang.Object[] r1 = X.Pxe.A1b()
            java.lang.String r0 = "onGetSplitsForAppUpdate"
            r2.A03(r0, r1)
            r0 = 1512882556(0x5a2cc17c, float:1.21566086E16)
            goto L_0x0196
        L_0x0134:
            android.os.Parcelable$Creator r0 = android.os.Bundle.CREATOR
            X.Pxh.A0L(r10, r0)
            X.Q18.A00(r10)
            com.google.android.play.core.splitinstall.zzbh r1 = (com.google.android.play.core.splitinstall.zzbh) r1
            r0 = 171597811(0xa3a5ff3, float:8.97362E-33)
            int r5 = A00(r1, r0)
            X.2Jh r2 = X.2Jg.A02
            java.lang.Object[] r1 = X.Pxe.A1b()
            java.lang.String r0 = "onCompleteInstallForAppUpdate"
            r2.A03(r0, r1)
            r0 = 1551966624(0x5c8121a0, float:2.90777945E17)
            goto L_0x0196
        L_0x0155:
            android.os.Parcelable$Creator r0 = android.os.Bundle.CREATOR
            X.Pxh.A0L(r10, r0)
            X.Q18.A00(r10)
            com.google.android.play.core.splitinstall.zzbh r1 = (com.google.android.play.core.splitinstall.zzbh) r1
            r0 = 678463550(0x2870883e, float:1.3352219E-14)
            int r5 = A00(r1, r0)
            X.2Jh r2 = X.2Jg.A02
            java.lang.Object[] r1 = X.Pxe.A1b()
            java.lang.String r0 = "onDeferredLanguageInstall"
            r2.A03(r0, r1)
            r0 = 653500679(0x26f3a107, float:1.6905159E-15)
            goto L_0x0196
        L_0x0176:
            android.os.Parcelable$Creator r0 = android.os.Bundle.CREATOR
            X.Pxh.A0L(r10, r0)
            X.Q18.A00(r10)
            com.google.android.play.core.splitinstall.zzbh r1 = (com.google.android.play.core.splitinstall.zzbh) r1
            r0 = -1970025888(0xffffffff8a93ca60, float:-1.423171E-32)
            int r5 = A00(r1, r0)
            X.2Jh r2 = X.2Jg.A02
            java.lang.Object[] r1 = X.Pxe.A1b()
            java.lang.String r0 = "onDeferredLanguageUninstall"
            r2.A03(r0, r1)
            r0 = -1647322115(0xffffffff9dcfdbfd, float:-5.5019906E-21)
        L_0x0196:
            X.AnonymousClass0fD.A0A(r0, r5)
        L_0x0199:
            r1 = 1
            r0 = -2010019424(0xffffffff883189a0, float:-5.3425777E-34)
            goto L_0x002e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.splitinstall.internal.zzl.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
