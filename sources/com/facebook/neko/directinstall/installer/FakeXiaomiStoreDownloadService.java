package com.facebook.neko.directinstall.installer;

import X.AnonymousClass0fD;
import X.QQX;
import X.RRF;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import com.xiaomi.market.IDownloadCallback;
import com.xiaomi.market.IMarketDownloadService;

public final class FakeXiaomiStoreDownloadService extends Binder implements IMarketDownloadService {
    public IDownloadCallback A00;
    public String A01;
    public final RRF A02 = new QQX(this);

    public FakeXiaomiStoreDownloadService() {
        int A03 = AnonymousClass0fD.A03(-2086013564);
        attachInterface(this, "com.xiaomi.market.IMarketDownloadService");
        AnonymousClass0fD.A0A(-923934261, A03);
        int A032 = AnonymousClass0fD.A03(303336049);
        AnonymousClass0fD.A0A(698200755, A032);
    }

    public final boolean AG8(String str) {
        int A03 = AnonymousClass0fD.A03(-766254722);
        int A032 = AnonymousClass0fD.A03(-1537892000);
        this.A01 = null;
        this.A00 = null;
        AnonymousClass0fD.A0A(-2048853029, A032);
        AnonymousClass0fD.A0A(-1028624088, A03);
        return true;
    }

    public final boolean AQ6(Bundle bundle) {
        boolean z;
        int i;
        int A03 = AnonymousClass0fD.A03(-1574708869);
        if (bundle == null) {
            z = false;
            i = -2099745228;
        } else {
            this.A01 = bundle.getString("packageName");
            this.A02.A00();
            z = true;
            i = -165940769;
        }
        AnonymousClass0fD.A0A(i, A03);
        return z;
    }

    public final int AXa() {
        AnonymousClass0fD.A0A(38506948, AnonymousClass0fD.A03(-386961383));
        return 1;
    }

    public final boolean CQd() {
        AnonymousClass0fD.A0A(-302789340, AnonymousClass0fD.A03(-1311441955));
        return true;
    }

    public final boolean EBZ(IDownloadCallback iDownloadCallback) {
        int A03 = AnonymousClass0fD.A03(984874151);
        this.A00 = iDownloadCallback;
        AnonymousClass0fD.A0A(-2068447587, A03);
        return true;
    }

    public final boolean FIM(IDownloadCallback iDownloadCallback) {
        int A03 = AnonymousClass0fD.A03(96305412);
        this.A00 = null;
        AnonymousClass0fD.A0A(-1960604056, A03);
        return true;
    }

    public final IBinder asBinder() {
        AnonymousClass0fD.A0A(1825130304, AnonymousClass0fD.A03(652559621));
        return this;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x008b, code lost:
        r7.writeNoException();
        r7.writeInt(r0);
        r0 = -887205629;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTransact(int r5, android.os.Parcel r6, android.os.Parcel r7, int r8) {
        /*
            r4 = this;
            r0 = -811439349(0xffffffffcfa26b0b, float:-5.4498483E9)
            int r3 = X.AnonymousClass0fD.A03(r0)
            r2 = 1
            java.lang.String r1 = "com.xiaomi.market.IMarketDownloadService"
            if (r5 < r2) goto L_0x0017
            r0 = 16777215(0xffffff, float:2.3509886E-38)
            if (r5 > r0) goto L_0x0022
            r6.enforceInterface(r1)
            switch(r5) {
                case 1: goto L_0x002e;
                case 2: goto L_0x003b;
                case 3: goto L_0x004d;
                case 4: goto L_0x005f;
                case 5: goto L_0x0068;
                case 6: goto L_0x0075;
                case 7: goto L_0x0082;
                case 8: goto L_0x0087;
                default: goto L_0x0017;
            }
        L_0x0017:
            boolean r1 = super.onTransact(r5, r6, r7, r8)
            r0 = -1604836022(0xffffffffa058254a, float:-1.830825E-19)
            X.AnonymousClass0fD.A0A(r0, r3)
            return r1
        L_0x0022:
            r0 = 1598968902(0x5f4e5446, float:1.4867585E19)
            if (r5 != r0) goto L_0x0017
            r7.writeString(r1)
            r0 = 1982259187(0x7626dff3, float:8.461558E32)
            goto L_0x0094
        L_0x002e:
            android.os.Parcelable$Creator r0 = android.os.Bundle.CREATOR
            java.lang.Object r0 = X.Pxj.A0i(r6, r0)
            android.os.Bundle r0 = (android.os.Bundle) r0
            boolean r0 = r4.AQ6(r0)
            goto L_0x008b
        L_0x003b:
            r6.readString()
            r0 = 1552795857(0x5c8dc8d1, float:3.19270174E17)
            int r1 = X.AnonymousClass0fD.A03(r0)
            r0 = 1416811659(0x5472d48b, float:4.17179186E12)
            X.AnonymousClass0fD.A0A(r0, r1)
            r0 = 0
            goto L_0x008b
        L_0x004d:
            r6.readString()
            r0 = 777418995(0x2e5678f3, float:4.876539E-11)
            int r1 = X.AnonymousClass0fD.A03(r0)
            r0 = 299937920(0x11e0b080, float:3.5449745E-28)
            X.AnonymousClass0fD.A0A(r0, r1)
            r0 = 0
            goto L_0x008b
        L_0x005f:
            java.lang.String r0 = r6.readString()
            boolean r0 = r4.AG8(r0)
            goto L_0x008b
        L_0x0068:
            android.os.IBinder r0 = r6.readStrongBinder()
            com.xiaomi.market.IDownloadCallback r0 = com.facebook.neko.directinstall.installer.XiaomiDirectInstallAgentManager$2.A00(r0)
            boolean r0 = r4.EBZ(r0)
            goto L_0x008b
        L_0x0075:
            android.os.IBinder r0 = r6.readStrongBinder()
            com.xiaomi.market.IDownloadCallback r0 = com.facebook.neko.directinstall.installer.XiaomiDirectInstallAgentManager$2.A00(r0)
            boolean r0 = r4.FIM(r0)
            goto L_0x008b
        L_0x0082:
            boolean r0 = r4.CQd()
            goto L_0x008b
        L_0x0087:
            int r0 = r4.AXa()
        L_0x008b:
            r7.writeNoException()
            r7.writeInt(r0)
            r0 = -887205629(0xffffffffcb1e5103, float:-1.0375427E7)
        L_0x0094:
            X.AnonymousClass0fD.A0A(r0, r3)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.neko.directinstall.installer.FakeXiaomiStoreDownloadService.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
