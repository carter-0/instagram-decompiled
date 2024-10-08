package X;

import android.os.Handler;

public abstract class RRF {
    public final void A00() {
        Integer num;
        Integer[] numArr;
        Integer num2;
        int i;
        int i2 = C10072Rm9.A01.get();
        Integer[] A00 = AnonymousClass05K.A00(4);
        int length = A00.length;
        int i3 = 0;
        while (true) {
            if (i3 < length) {
                num = A00[i3];
                switch (num.intValue()) {
                    case 1:
                        i = 1;
                        break;
                    case 2:
                        i = 2;
                        break;
                    case 3:
                        i = 3;
                        break;
                    default:
                        i = 0;
                        break;
                }
                if (i != i2) {
                    i3++;
                }
            } else {
                num = AnonymousClass05K.A00;
            }
        }
        int intValue = num.intValue();
        if (intValue == 0) {
            numArr = new Integer[8];
            numArr[0] = AnonymousClass05K.A00;
            numArr[1] = AnonymousClass05K.A01;
            numArr[2] = AnonymousClass05K.A0C;
            numArr[3] = AnonymousClass05K.A0N;
            numArr[4] = AnonymousClass05K.A0Y;
            numArr[5] = AnonymousClass05K.A0j;
            numArr[6] = AnonymousClass05K.A0u;
            num2 = AnonymousClass05K.A15;
        } else if (intValue == 1) {
            numArr = new Integer[]{AnonymousClass05K.A00, AnonymousClass05K.A01, AnonymousClass05K.A0C, AnonymousClass05K.A0N, AnonymousClass05K.A0Y, AnonymousClass05K.A1F};
            Object obj = new Object();
            Handler A0D = AnonymousClass7TF.A0D();
            0t0 A01 = AnonymousClass0eN.A01(new C58208IoC(5, A0D, this, obj, numArr));
            A0D.removeCallbacks((Runnable) A01.getValue());
            A0D.postDelayed((Runnable) A01.getValue(), 1000);
        } else if (intValue == 2) {
            numArr = new Integer[8];
            numArr[0] = AnonymousClass05K.A00;
            numArr[1] = AnonymousClass05K.A01;
            numArr[2] = AnonymousClass05K.A0C;
            numArr[3] = AnonymousClass05K.A0N;
            numArr[4] = AnonymousClass05K.A0Y;
            numArr[5] = AnonymousClass05K.A0j;
            numArr[6] = AnonymousClass05K.A0u;
            num2 = AnonymousClass05K.A1I;
        } else if (intValue == 3) {
            numArr = new Integer[8];
            numArr[0] = AnonymousClass05K.A00;
            numArr[1] = AnonymousClass05K.A01;
            numArr[2] = AnonymousClass05K.A0C;
            numArr[3] = AnonymousClass05K.A0N;
            numArr[4] = AnonymousClass05K.A0Y;
            numArr[5] = AnonymousClass05K.A0j;
            numArr[6] = AnonymousClass05K.A0u;
            num2 = AnonymousClass05K.A02;
        } else {
            throw AnonymousClass7TE.A1K();
        }
        numArr[7] = num2;
        Object obj2 = new Object();
        Handler A0D2 = AnonymousClass7TF.A0D();
        0t0 A012 = AnonymousClass0eN.A01(new C58208IoC(5, A0D2, this, obj2, numArr));
        A0D2.removeCallbacks((Runnable) A012.getValue());
        A0D2.postDelayed((Runnable) A012.getValue(), 1000);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0089, code lost:
        r5.DCp(r4, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x008c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00a8, code lost:
        r5.DaU(r4, r0, 100);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00ab, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(java.lang.Integer r8) {
        /*
            r7 = this;
            boolean r0 = r7 instanceof X.QQX
            if (r0 == 0) goto L_0x0060
            r0 = r7
            X.QQX r0 = (X.QQX) r0
            com.facebook.neko.directinstall.installer.FakeXiaomiStoreDownloadService r0 = r0.A00
            com.xiaomi.market.IDownloadCallback r2 = r0.A00
            java.lang.String r4 = r0.A01
            java.lang.String r3 = "FakeXiaomiStoreDownloadService"
            if (r2 == 0) goto L_0x00be
            if (r4 == 0) goto L_0x00c2
            int r5 = r8.intValue()     // Catch:{ RemoteException -> 0x00b9 }
            r0 = 100
            switch(r5) {
                case 0: goto L_0x001d;
                case 1: goto L_0x0024;
                case 2: goto L_0x002b;
                case 3: goto L_0x002e;
                case 4: goto L_0x0031;
                case 5: goto L_0x0034;
                case 6: goto L_0x003a;
                case 7: goto L_0x0041;
                case 8: goto L_0x0049;
                case 9: goto L_0x0051;
                case 10: goto L_0x0059;
                default: goto L_0x001c;
            }     // Catch:{ RemoteException -> 0x00b9 }
        L_0x001c:
            return
        L_0x001d:
            r1 = 2
            java.lang.String r0 = "Download Waiting"
            r2.Dmp(r4, r1, r0)     // Catch:{ RemoteException -> 0x00b9 }
            return
        L_0x0024:
            r1 = 3
            java.lang.String r0 = "Download Started"
            r2.Dmp(r4, r1, r0)     // Catch:{ RemoteException -> 0x00b9 }
            return
        L_0x002b:
            r5 = 1101004800(0x41a00000, float:20.0)
            goto L_0x0036
        L_0x002e:
            r5 = 1112014848(0x42480000, float:50.0)
            goto L_0x0036
        L_0x0031:
            r5 = 1116471296(0x428c0000, float:70.0)
            goto L_0x0036
        L_0x0034:
            r5 = 1120403456(0x42c80000, float:100.0)
        L_0x0036:
            r2.DaU(r4, r5, r0)     // Catch:{ RemoteException -> 0x00b9 }
            return
        L_0x003a:
            r1 = 6
            java.lang.String r0 = "Install Started"
            r2.Dmp(r4, r1, r0)     // Catch:{ RemoteException -> 0x00b9 }
            return
        L_0x0041:
            r1 = 9
            java.lang.String r0 = "Install Successful"
            r2.Dmp(r4, r1, r0)     // Catch:{ RemoteException -> 0x00b9 }
            return
        L_0x0049:
            r1 = 23
            java.lang.String r0 = "Network error"
            r2.DCq(r4, r1, r0)     // Catch:{ RemoteException -> 0x00b9 }
            return
        L_0x0051:
            r1 = 37
            java.lang.String r0 = "Insufficient space before installation"
            r2.DCq(r4, r1, r0)     // Catch:{ RemoteException -> 0x00b9 }
            return
        L_0x0059:
            r1 = 1
            java.lang.String r0 = "N/A - There is no installation package for this model."
            r2.DCq(r4, r1, r0)     // Catch:{ RemoteException -> 0x00b9 }
            return
        L_0x0060:
            r0 = r7
            X.QQW r0 = (X.QQW) r0
            r6 = 0
            X.0qQ.A0B(r8, r6)
            com.facebook.neko.directinstall.installer.FakeGalaxyStoreDownloadService r0 = r0.A00
            com.sec.android.app.samsungapps.downloadservice.aidl.IGalaxyStoreDownloadCallback r5 = r0.A00
            java.lang.String r4 = r0.A01
            java.lang.String r3 = "FakeGalaxyStoreDownloadService"
            if (r5 == 0) goto L_0x00be
            if (r4 == 0) goto L_0x00c2
            int r0 = r8.intValue()     // Catch:{ RemoteException -> 0x00b9 }
            r1 = 100
            switch(r0) {
                case 0: goto L_0x00b3;
                case 1: goto L_0x00ac;
                case 2: goto L_0x00a5;
                case 3: goto L_0x00a2;
                case 4: goto L_0x009e;
                case 5: goto L_0x009b;
                case 6: goto L_0x0094;
                case 7: goto L_0x008d;
                case 8: goto L_0x0086;
                case 9: goto L_0x0084;
                case 10: goto L_0x0081;
                default: goto L_0x007c;
            }     // Catch:{ RemoteException -> 0x00b9 }
        L_0x007c:
            X.Wub r0 = X.AnonymousClass7TE.A1K()     // Catch:{ RemoteException -> 0x00b9 }
            throw r0     // Catch:{ RemoteException -> 0x00b9 }
        L_0x0081:
            r0 = 1004(0x3ec, float:1.407E-42)
            goto L_0x0089
        L_0x0084:
            r0 = -4
            goto L_0x0089
        L_0x0086:
            r0 = 100001(0x186a1, float:1.40131E-40)
        L_0x0089:
            r5.DCp(r4, r0)     // Catch:{ RemoteException -> 0x00b9 }
            return
        L_0x008d:
            r1 = 4
            java.lang.String r0 = "Install Successful"
            r5.Dmp(r4, r1, r0)     // Catch:{ RemoteException -> 0x00b9 }
            return
        L_0x0094:
            r1 = 3
            java.lang.String r0 = "Install Started"
            r5.Dmp(r4, r1, r0)     // Catch:{ RemoteException -> 0x00b9 }
            return
        L_0x009b:
            r0 = 1065353216(0x3f800000, float:1.0)
            goto L_0x00a8
        L_0x009e:
            r0 = 1060320051(0x3f333333, float:0.7)
            goto L_0x00a8
        L_0x00a2:
            r0 = 1056964608(0x3f000000, float:0.5)
            goto L_0x00a8
        L_0x00a5:
            r0 = 1045220557(0x3e4ccccd, float:0.2)
        L_0x00a8:
            r5.DaU(r4, r0, r1)     // Catch:{ RemoteException -> 0x00b9 }
            return
        L_0x00ac:
            r1 = 1
            java.lang.String r0 = "Download Started"
            r5.Dmp(r4, r1, r0)     // Catch:{ RemoteException -> 0x00b9 }
            return
        L_0x00b3:
            java.lang.String r0 = "Download Waiting"
            r5.Dmp(r4, r6, r0)     // Catch:{ RemoteException -> 0x00b9 }
            return
        L_0x00b9:
            r0 = move-exception
            X.0KC.A0F(r3, r4, r0)
            return
        L_0x00be:
            java.lang.String r0 = "sendEvent: callback shouldn't be null."
            goto L_0x00c5
        L_0x00c2:
            java.lang.String r0 = "sendEvent: packageName shouldn't be null."
        L_0x00c5:
            X.0KC.A0C(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.RRF.A01(java.lang.Integer):void");
    }
}
