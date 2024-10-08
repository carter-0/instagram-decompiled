package androidx.browser.customtabs;

import X.AnonymousClass0fD;
import X.AnonymousClass7TF;
import X.RRS;
import X.RRY;
import X.SF1;
import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Parcel;
import android.support.customtabs.ICustomTabsCallback;

public final class CustomTabsClient$2 extends Binder implements ICustomTabsCallback {
    public Handler A00;
    public final /* synthetic */ RRY A01;
    public final /* synthetic */ SF1 A02;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CustomTabsClient$2(RRY rry, SF1 sf1) {
        this();
        this.A02 = sf1;
        this.A01 = rry;
        int A03 = AnonymousClass0fD.A03(384519775);
        this.A00 = AnonymousClass7TF.A0D();
        AnonymousClass0fD.A0A(1799872716, A03);
    }

    public static Bundle A00(Parcel parcel) {
        return (Bundle) RRS.A00(parcel, Bundle.CREATOR);
    }

    public final IBinder asBinder() {
        AnonymousClass0fD.A0A(1811810145, AnonymousClass0fD.A03(1292419511));
        return this;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00b1, code lost:
        X.AnonymousClass0fD.A0A(r0, r5);
        r10.writeNoException();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x01ca, code lost:
        X.AnonymousClass0fD.A0A(r0, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x01cd, code lost:
        r0 = -1519841439;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTransact(int r8, android.os.Parcel r9, android.os.Parcel r10, int r11) {
        /*
            r7 = this;
            r0 = 1998126708(0x7718fe74, float:3.103086E33)
            int r4 = X.AnonymousClass0fD.A03(r0)
            java.lang.String r1 = android.support.customtabs.ICustomTabsCallback.A00
            r3 = 1
            if (r8 < r3) goto L_0x0017
            r0 = 16777215(0xffffff, float:2.3509886E-38)
            if (r8 > r0) goto L_0x0022
            r9.enforceInterface(r1)
            switch(r8) {
                case 2: goto L_0x002f;
                case 3: goto L_0x0055;
                case 4: goto L_0x007b;
                case 5: goto L_0x009c;
                case 6: goto L_0x00c7;
                case 7: goto L_0x00f8;
                case 8: goto L_0x011d;
                case 9: goto L_0x0146;
                case 10: goto L_0x0167;
                case 11: goto L_0x0197;
                case 12: goto L_0x01b8;
                default: goto L_0x0017;
            }
        L_0x0017:
            boolean r1 = super.onTransact(r8, r9, r10, r11)
            r0 = 845529007(0x3265bfaf, float:1.3373138E-8)
            X.AnonymousClass0fD.A0A(r0, r4)
            return r1
        L_0x0022:
            r0 = 1598968902(0x5f4e5446, float:1.4867585E19)
            if (r8 != r0) goto L_0x0017
            r10.writeString(r1)
            r0 = -119753359(0xfffffffff8dcb571, float:-3.5812043E34)
            goto L_0x01d0
        L_0x002f:
            r9.readInt()
            android.os.Bundle r2 = A00(r9)
            r0 = 1410601498(0x5414121a, float:2.54383541E12)
            int r5 = X.AnonymousClass0fD.A03(r0)
            X.RRY r0 = r7.A01
            if (r0 != 0) goto L_0x0046
            r0 = 342474511(0x1469bf0f, float:1.18011735E-26)
            goto L_0x01ca
        L_0x0046:
            android.os.Handler r1 = r7.A00
            X.TEK r0 = new X.TEK
            r0.<init>(r2, r7)
            r1.post(r0)
            r0 = -345134098(0xffffffffeb6dabee, float:-2.8732733E26)
            goto L_0x01ca
        L_0x0055:
            r9.readString()
            android.os.Bundle r2 = A00(r9)
            r0 = 280857892(0x10bd8d24, float:7.476482E-29)
            int r5 = X.AnonymousClass0fD.A03(r0)
            X.RRY r0 = r7.A01
            if (r0 != 0) goto L_0x006c
            r0 = -1466254445(0xffffffffa89abb93, float:-1.7178782E-14)
            goto L_0x01ca
        L_0x006c:
            android.os.Handler r1 = r7.A00
            X.TEL r0 = new X.TEL
            r0.<init>(r2, r7)
            r1.post(r0)
            r0 = -874376074(0xffffffffcbe21476, float:-2.9632748E7)
            goto L_0x01ca
        L_0x007b:
            android.os.Bundle r2 = A00(r9)
            r0 = -254870466(0xfffffffff0cefc3e, float:-5.1247083E29)
            int r5 = X.AnonymousClass0fD.A03(r0)
            X.RRY r0 = r7.A01
            if (r0 != 0) goto L_0x008e
            r0 = -1393329243(0xffffffffacf37ba5, float:-6.9202027E-12)
            goto L_0x00b1
        L_0x008e:
            android.os.Handler r1 = r7.A00
            X.TEM r0 = new X.TEM
            r0.<init>(r2, r7)
            r1.post(r0)
            r0 = 1624761050(0x60d7e2da, float:1.2444989E20)
            goto L_0x00b1
        L_0x009c:
            r9.readString()
            android.os.Bundle r2 = A00(r9)
            r0 = -1411054007(0xffffffffabe50649, float:-1.6273173E-12)
            int r5 = X.AnonymousClass0fD.A03(r0)
            X.RRY r0 = r7.A01
            if (r0 != 0) goto L_0x00b9
            r0 = -571922823(0xffffffffdde92679, float:-2.10003106E18)
        L_0x00b1:
            X.AnonymousClass0fD.A0A(r0, r5)
            r10.writeNoException()
            goto L_0x01cd
        L_0x00b9:
            android.os.Handler r1 = r7.A00
            X.TEN r0 = new X.TEN
            r0.<init>(r2, r7)
            r1.post(r0)
            r0 = 1714819642(0x6636123a, float:2.1495173E23)
            goto L_0x00b1
        L_0x00c7:
            r9.readInt()
            android.os.Parcelable$Creator r0 = android.net.Uri.CREATOR
            java.lang.Object r6 = X.Pxj.A0i(r9, r0)
            android.net.Uri r6 = (android.net.Uri) r6
            r9.readInt()
            android.os.Bundle r2 = A00(r9)
            r0 = -929785878(0xffffffffc89497ea, float:-304319.3)
            int r5 = X.AnonymousClass0fD.A03(r0)
            X.RRY r0 = r7.A01
            if (r0 != 0) goto L_0x00e9
            r0 = 1174877577(0x46073589, float:8653.384)
            goto L_0x01ca
        L_0x00e9:
            android.os.Handler r1 = r7.A00
            X.TI1 r0 = new X.TI1
            r0.<init>(r6, r2, r7)
            r1.post(r0)
            r0 = -800058247(0xffffffffd0501479, float:-1.39640105E10)
            goto L_0x01ca
        L_0x00f8:
            r9.readString()
            android.os.Parcelable$Creator r0 = android.os.Bundle.CREATOR
            X.Pxj.A0i(r9, r0)
            r0 = 130179932(0x7c2635c, float:2.9248274E-34)
            int r2 = X.AnonymousClass0fD.A03(r0)
            X.RRY r1 = r7.A01
            r0 = 196303901(0xbb35c1d, float:6.908689E-32)
            if (r1 != 0) goto L_0x0111
            r0 = -1577857650(0xffffffffa1f3cd8e, float:-1.652073E-18)
        L_0x0111:
            X.AnonymousClass0fD.A0A(r0, r2)
            r10.writeNoException()
            r0 = 0
            r10.writeInt(r0)
            goto L_0x01cd
        L_0x011d:
            r9.readInt()
            r9.readInt()
            android.os.Bundle r2 = A00(r9)
            r0 = -969784953(0xffffffffc6324187, float:-11408.382)
            int r5 = X.AnonymousClass0fD.A03(r0)
            X.RRY r0 = r7.A01
            if (r0 != 0) goto L_0x0137
            r0 = 776988062(0x2e4fe59e, float:4.7270292E-11)
            goto L_0x01ca
        L_0x0137:
            android.os.Handler r1 = r7.A00
            X.TEO r0 = new X.TEO
            r0.<init>(r2, r7)
            r1.post(r0)
            r0 = -2125804126(0xffffffff814acda2, float:-3.7249075E-38)
            goto L_0x01ca
        L_0x0146:
            android.os.Bundle r2 = A00(r9)
            r0 = -1955902456(0xffffffff8b6b4c08, float:-4.5316553E-32)
            int r5 = X.AnonymousClass0fD.A03(r0)
            X.RRY r0 = r7.A01
            if (r0 != 0) goto L_0x0159
            r0 = 376858216(0x16766668, float:1.9904035E-25)
            goto L_0x01ca
        L_0x0159:
            android.os.Handler r1 = r7.A00
            X.TEP r0 = new X.TEP
            r0.<init>(r2, r7)
            r1.post(r0)
            r0 = -1292394067(0xffffffffb2f7a1ad, float:-2.8828106E-8)
            goto L_0x01ca
        L_0x0167:
            r9.readInt()
            r9.readInt()
            r9.readInt()
            r9.readInt()
            r9.readInt()
            android.os.Bundle r2 = A00(r9)
            r0 = -722379985(0xffffffffd4f15b2f, float:-8.2929354E12)
            int r5 = X.AnonymousClass0fD.A03(r0)
            X.RRY r0 = r7.A01
            if (r0 != 0) goto L_0x0189
            r0 = -1584273715(0xffffffffa191e6cd, float:-9.886675E-19)
            goto L_0x01ca
        L_0x0189:
            android.os.Handler r1 = r7.A00
            X.TEQ r0 = new X.TEQ
            r0.<init>(r2, r7)
            r1.post(r0)
            r0 = -578802765(0xffffffffdd802bb3, float:-1.15445903E18)
            goto L_0x01ca
        L_0x0197:
            android.os.Bundle r2 = A00(r9)
            r0 = 556096963(0x21255dc3, float:5.6028267E-19)
            int r5 = X.AnonymousClass0fD.A03(r0)
            X.RRY r0 = r7.A01
            if (r0 != 0) goto L_0x01aa
            r0 = 1183621324(0x468ca0cc, float:18000.398)
            goto L_0x01ca
        L_0x01aa:
            android.os.Handler r1 = r7.A00
            X.TER r0 = new X.TER
            r0.<init>(r2, r7)
            r1.post(r0)
            r0 = 1380064537(0x52421d19, float:2.08427958E11)
            goto L_0x01ca
        L_0x01b8:
            android.os.Bundle r2 = A00(r9)
            r0 = -823600047(0xffffffffcee8dc51, float:-1.95337638E9)
            int r5 = X.AnonymousClass0fD.A03(r0)
            X.RRY r0 = r7.A01
            if (r0 != 0) goto L_0x01d4
            r0 = -456507229(0xffffffffe4ca40a3, float:-2.98472E22)
        L_0x01ca:
            X.AnonymousClass0fD.A0A(r0, r5)
        L_0x01cd:
            r0 = -1519841439(0xffffffffa5690f61, float:-2.0214739E-16)
        L_0x01d0:
            X.AnonymousClass0fD.A0A(r0, r4)
            return r3
        L_0x01d4:
            android.os.Handler r1 = r7.A00
            X.TEJ r0 = new X.TEJ
            r0.<init>(r2, r7)
            r1.post(r0)
            r0 = 1232129958(0x4970cfa6, float:986362.4)
            goto L_0x01ca
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.browser.customtabs.CustomTabsClient$2.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }

    public CustomTabsClient$2() {
        int A03 = AnonymousClass0fD.A03(88679620);
        attachInterface(this, ICustomTabsCallback.A00);
        AnonymousClass0fD.A0A(-1375888170, A03);
    }
}
