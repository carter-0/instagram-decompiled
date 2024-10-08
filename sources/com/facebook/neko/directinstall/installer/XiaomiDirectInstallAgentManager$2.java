package com.facebook.neko.directinstall.installer;

import X.AnonymousClass0fD;
import X.C8896REo;
import X.C8951RIq;
import X.QQV;
import X.SOJ;
import X.TC0;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import com.xiaomi.market.IDownloadCallback;
import java.util.Map;

public final class XiaomiDirectInstallAgentManager$2 extends Binder implements IDownloadCallback {
    public final /* synthetic */ QQV A00;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public XiaomiDirectInstallAgentManager$2(QQV qqv) {
        this();
        this.A00 = qqv;
        AnonymousClass0fD.A0A(669819278, AnonymousClass0fD.A03(-1448477207));
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [com.xiaomi.market.IDownloadCallback, java.lang.Object, com.xiaomi.market.IDownloadCallback$Stub$Proxy] */
    public static IDownloadCallback A00(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.xiaomi.market.IDownloadCallback");
        if (queryLocalInterface != null && (queryLocalInterface instanceof IDownloadCallback)) {
            return (IDownloadCallback) queryLocalInterface;
        }
        ? obj = new Object();
        int A03 = AnonymousClass0fD.A03(2001306125);
        obj.A00 = iBinder;
        AnonymousClass0fD.A0A(-1078892535, A03);
        return obj;
    }

    public final void A01(String str, float f) {
        int A03 = AnonymousClass0fD.A03(1065219540);
        QQV qqv = this.A00;
        SOJ soj = qqv.A04;
        soj.A00 = qqv.A04;
        soj.A01 = str;
        SOJ.A00((C8951RIq) null, soj, Long.valueOf((long) f), "RUNNING_DOWNLOAD", (String) null);
        qqv.A03.A01(new DirectInstallDownloadEvent(C8896REo.RUNNING_DOWNLOAD, Double.valueOf((double) f)));
        AnonymousClass0fD.A0A(2120750211, A03);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0090, code lost:
        if (r1.equals(r0) == false) goto L_0x0044;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0099, code lost:
        if (r1.equals("30") != false) goto L_0x009b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x009b, code lost:
        r2 = X.RE5.NETWORK_FAILURE;
     */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x005b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02(java.lang.String r6, int r7) {
        /*
            r5 = this;
            r0 = 1240505979(0x49f09e7b, float:1971151.4)
            int r3 = X.AnonymousClass0fD.A03(r0)
            X.QQV r4 = r5.A00
            X.SOJ r1 = r4.A04
            java.lang.String r0 = r4.A04
            r1.A00 = r0
            r1.A01 = r6
            java.lang.String r1 = java.lang.String.valueOf(r7)
            if (r1 == 0) goto L_0x0044
            int r2 = r1.hashCode()
            r0 = 52
            if (r2 == r0) goto L_0x0087
            r0 = 1568(0x620, float:2.197E-42)
            if (r2 == r0) goto L_0x0079
            r0 = 1573(0x625, float:2.204E-42)
            if (r2 == r0) goto L_0x0076
            r0 = 1601(0x641, float:2.243E-42)
            if (r2 == r0) goto L_0x0073
            r0 = 1629(0x65d, float:2.283E-42)
            if (r2 == r0) goto L_0x0093
            r0 = 1507430(0x170066, float:2.11236E-39)
            if (r2 == r0) goto L_0x0070
            r0 = 1507454(0x17007e, float:2.112393E-39)
            if (r2 == r0) goto L_0x006d
            r0 = 1606(0x646, float:2.25E-42)
            if (r2 == r0) goto L_0x006a
            r0 = 1607(0x647, float:2.252E-42)
            if (r2 == r0) goto L_0x0067
            switch(r2) {
                case 1633: goto L_0x008a;
                case 1634: goto L_0x0061;
                case 1635: goto L_0x007c;
                case 1636: goto L_0x0064;
                default: goto L_0x0044;
            }
        L_0x0044:
            X.RE5 r2 = X.RE5.UNKNOWN
        L_0x0046:
            int r0 = r4.A00
            android.os.Handler r1 = r4.A02
            if (r7 != r0) goto L_0x005b
            X.TBx r0 = new X.TBx
            r0.<init>(r4)
        L_0x0051:
            r1.post(r0)
            r0 = -346782530(0xffffffffeb5484be, float:-2.5691913E26)
            X.AnonymousClass0fD.A0A(r0, r3)
            return
        L_0x005b:
            X.TIa r0 = new X.TIa
            r0.<init>(r4, r2, r7)
            goto L_0x0051
        L_0x0061:
            java.lang.String r0 = "35"
            goto L_0x008c
        L_0x0064:
            java.lang.String r0 = "37"
            goto L_0x007e
        L_0x0067:
            java.lang.String r0 = "29"
            goto L_0x008c
        L_0x006a:
            java.lang.String r0 = "28"
            goto L_0x008c
        L_0x006d:
            java.lang.String r0 = "1010"
            goto L_0x008c
        L_0x0070:
            java.lang.String r0 = "1007"
            goto L_0x008c
        L_0x0073:
            java.lang.String r0 = "23"
            goto L_0x008c
        L_0x0076:
            java.lang.String r0 = "16"
            goto L_0x007e
        L_0x0079:
            java.lang.String r0 = "11"
            goto L_0x007e
        L_0x007c:
            java.lang.String r0 = "36"
        L_0x007e:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0044
            X.RE5 r2 = X.RE5.STORAGE_INSUFFICIENT
            goto L_0x0046
        L_0x0087:
            java.lang.String r0 = "4"
            goto L_0x008c
        L_0x008a:
            java.lang.String r0 = "34"
        L_0x008c:
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x009b
            goto L_0x0044
        L_0x0093:
            java.lang.String r0 = "30"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0044
        L_0x009b:
            X.RE5 r2 = X.RE5.NETWORK_FAILURE
            goto L_0x0046
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.neko.directinstall.installer.XiaomiDirectInstallAgentManager$2.A02(java.lang.String, int):void");
    }

    public final void A03(String str, int i) {
        String str2;
        int A03 = AnonymousClass0fD.A03(1093326931);
        QQV qqv = this.A00;
        SOJ soj = qqv.A04;
        soj.A00 = qqv.A04;
        soj.A01 = str;
        if (i == 3) {
            qqv.A03.A00(C8896REo.RUNNING_DOWNLOAD);
            str2 = "RUNNING_DOWNLOAD";
            soj.A01(str2);
        } else if (i == 6) {
            qqv.A03.A00(C8896REo.START_INSTALL);
            str2 = "START_INSTALL";
            soj.A01(str2);
        } else if (i == 9) {
            qqv.A03.A01(new DirectInstallDownloadEvent(C8896REo.SUCCESS_DOWNLOAD, Double.valueOf(100.0d)));
            qqv.A02.post(new TC0(qqv));
        }
        Map map = qqv.A0A;
        Integer valueOf = Integer.valueOf(i);
        if (map.containsKey(valueOf)) {
            map.get(valueOf);
        }
        AnonymousClass0fD.A0A(2138474281, A03);
    }

    public final void DCq(String str, int i, String str2) {
        int i2;
        int A03 = AnonymousClass0fD.A03(93185211);
        if (QQV.A00(this.A00) >= 2) {
            i2 = 1253019088;
        } else {
            A02("", i);
            i2 = -363791660;
        }
        AnonymousClass0fD.A0A(i2, A03);
    }

    public final void DaU(String str, float f, long j) {
        int i;
        int A03 = AnonymousClass0fD.A03(1635341675);
        if (QQV.A00(this.A00) >= 2) {
            i = -928569350;
        } else {
            A01("", f);
            i = 1818862744;
        }
        AnonymousClass0fD.A0A(i, A03);
    }

    public final void Dmp(String str, int i, String str2) {
        int i2;
        int A03 = AnonymousClass0fD.A03(1139894094);
        if (QQV.A00(this.A00) >= 2) {
            i2 = -1203952042;
        } else {
            A03("", i);
            i2 = -935302539;
        }
        AnonymousClass0fD.A0A(i2, A03);
    }

    public final IBinder asBinder() {
        AnonymousClass0fD.A0A(-668395579, AnonymousClass0fD.A03(-762425002));
        return this;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0093, code lost:
        r9.writeNoException();
        r0 = 1062406180;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTransact(int r7, android.os.Parcel r8, android.os.Parcel r9, int r10) {
        /*
            r6 = this;
            r0 = -2109416729(0xffffffff8244dae7, float:-1.4462628E-37)
            int r4 = X.AnonymousClass0fD.A03(r0)
            r3 = 1
            java.lang.String r1 = "com.xiaomi.market.IDownloadCallback"
            if (r7 < r3) goto L_0x0017
            r0 = 16777215(0xffffff, float:2.3509886E-38)
            if (r7 > r0) goto L_0x0022
            r8.enforceInterface(r1)
            switch(r7) {
                case 1: goto L_0x0084;
                case 2: goto L_0x0074;
                case 3: goto L_0x0064;
                case 4: goto L_0x0052;
                case 5: goto L_0x0040;
                case 6: goto L_0x002e;
                default: goto L_0x0017;
            }
        L_0x0017:
            boolean r1 = super.onTransact(r7, r8, r9, r10)
            r0 = 30349999(0x1cf1aaf, float:7.607808E-38)
            X.AnonymousClass0fD.A0A(r0, r4)
            return r1
        L_0x0022:
            r0 = 1598968902(0x5f4e5446, float:1.4867585E19)
            if (r7 != r0) goto L_0x0017
            r9.writeString(r1)
            r0 = -1543774960(0xffffffffa3fbdd10, float:-2.7307098E-17)
            goto L_0x0099
        L_0x002e:
            r8.readString()
            r8.readLong()
            float r1 = r8.readFloat()
            java.lang.String r0 = r8.readString()
            r6.A01(r0, r1)
            goto L_0x0093
        L_0x0040:
            r8.readString()
            int r1 = r8.readInt()
            r8.readString()
            java.lang.String r0 = r8.readString()
            r6.A02(r0, r1)
            goto L_0x0093
        L_0x0052:
            r8.readString()
            int r1 = r8.readInt()
            r8.readString()
            java.lang.String r0 = r8.readString()
            r6.A03(r0, r1)
            goto L_0x0093
        L_0x0064:
            java.lang.String r5 = r8.readString()
            long r0 = r8.readLong()
            float r2 = r8.readFloat()
            r6.DaU(r5, r2, r0)
            goto L_0x0093
        L_0x0074:
            java.lang.String r2 = r8.readString()
            int r1 = r8.readInt()
            java.lang.String r0 = r8.readString()
            r6.DCq(r2, r1, r0)
            goto L_0x0093
        L_0x0084:
            java.lang.String r2 = r8.readString()
            int r1 = r8.readInt()
            java.lang.String r0 = r8.readString()
            r6.Dmp(r2, r1, r0)
        L_0x0093:
            r9.writeNoException()
            r0 = 1062406180(0x3f530824, float:0.82434297)
        L_0x0099:
            X.AnonymousClass0fD.A0A(r0, r4)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.neko.directinstall.installer.XiaomiDirectInstallAgentManager$2.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }

    public XiaomiDirectInstallAgentManager$2() {
        int A03 = AnonymousClass0fD.A03(2052793266);
        attachInterface(this, "com.xiaomi.market.IDownloadCallback");
        AnonymousClass0fD.A0A(1552423430, A03);
    }
}
