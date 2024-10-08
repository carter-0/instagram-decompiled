package com.facebook.neko.directinstall.installer;

import X.AnonymousClass0fD;
import X.AnonymousClass7TG;
import X.C12885TBz;
import X.C8896REo;
import X.C8951RIq;
import X.QQU;
import X.SOJ;
import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import com.sec.android.app.samsungapps.downloadservice.aidl.IGalaxyStoreDownloadCallback;

public final class SamsungDirectInstallAgentManager$iGalaxyStoreDownloadCallback$1 extends Binder implements IGalaxyStoreDownloadCallback {
    public final /* synthetic */ QQU A00;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public SamsungDirectInstallAgentManager$iGalaxyStoreDownloadCallback$1(QQU qqu) {
        this();
        this.A00 = qqu;
        AnonymousClass0fD.A0A(678009440, AnonymousClass0fD.A03(1308273485));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0045, code lost:
        if (r1.equals(r0) == false) goto L_0x0016;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0047, code lost:
        r2 = X.RE5.STORAGE_INSUFFICIENT;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0065, code lost:
        if (r1.equals(r0) == false) goto L_0x0016;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0067, code lost:
        r2 = X.RE5.NETWORK_FAILURE;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DCp(java.lang.String r6, int r7) {
        /*
            r5 = this;
            r0 = 953962677(0x38dc50b5, float:1.050545E-4)
            int r4 = X.AnonymousClass0fD.A03(r0)
            X.QQU r3 = r5.A00
            java.lang.String r1 = java.lang.String.valueOf(r7)
            if (r1 == 0) goto L_0x0016
            int r0 = r1.hashCode()
            switch(r0) {
                case 1447: goto L_0x0033;
                case 1335965481: goto L_0x0036;
                case 1448635040: goto L_0x0039;
                case 1448635042: goto L_0x003c;
                case 1448635047: goto L_0x003f;
                case 1448635134: goto L_0x004a;
                case 1448635166: goto L_0x004d;
                case 1448635167: goto L_0x0050;
                case 1477268034: goto L_0x0053;
                case 1477268035: goto L_0x0056;
                case 1477268037: goto L_0x0059;
                case 1477268997: goto L_0x005c;
                case 1477268998: goto L_0x005f;
                default: goto L_0x0016;
            }
        L_0x0016:
            X.RE5 r2 = X.RE5.UNKNOWN
        L_0x0018:
            int r0 = r3.A00
            android.os.Handler r1 = r3.A02
            if (r7 != r0) goto L_0x002d
            X.TBx r0 = new X.TBx
            r0.<init>(r3)
        L_0x0023:
            r1.post(r0)
            r0 = -1949017307(0xffffffff8bd45b25, float:-8.179657E-32)
            X.AnonymousClass0fD.A0A(r0, r4)
            return
        L_0x002d:
            X.TIa r0 = new X.TIa
            r0.<init>(r3, r2, r7)
            goto L_0x0023
        L_0x0033:
            java.lang.String r0 = "-4"
            goto L_0x0041
        L_0x0036:
            java.lang.String r0 = "-20004"
            goto L_0x0041
        L_0x0039:
            java.lang.String r0 = "100001"
            goto L_0x0061
        L_0x003c:
            java.lang.String r0 = "100003"
            goto L_0x0061
        L_0x003f:
            java.lang.String r0 = "100008"
        L_0x0041:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0016
            X.RE5 r2 = X.RE5.STORAGE_INSUFFICIENT
            goto L_0x0018
        L_0x004a:
            java.lang.String r0 = "100032"
            goto L_0x0061
        L_0x004d:
            java.lang.String r0 = "100043"
            goto L_0x0061
        L_0x0050:
            java.lang.String r0 = "100044"
            goto L_0x0061
        L_0x0053:
            java.lang.String r0 = "200400"
            goto L_0x0061
        L_0x0056:
            java.lang.String r0 = "200401"
            goto L_0x0061
        L_0x0059:
            java.lang.String r0 = "200403"
            goto L_0x0061
        L_0x005c:
            java.lang.String r0 = "200502"
            goto L_0x0061
        L_0x005f:
            java.lang.String r0 = "200503"
        L_0x0061:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0016
            X.RE5 r2 = X.RE5.NETWORK_FAILURE
            goto L_0x0018
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.neko.directinstall.installer.SamsungDirectInstallAgentManager$iGalaxyStoreDownloadCallback$1.DCp(java.lang.String, int):void");
    }

    public final void DaU(String str, float f, long j) {
        Long valueOf;
        int A0D = AnonymousClass7TG.A0D(str, -429939291);
        QQU qqu = this.A00;
        SOJ soj = qqu.A04;
        long j2 = (long) (((float) j) * f);
        if (j == 0) {
            valueOf = null;
        } else {
            valueOf = Long.valueOf((j2 * 100) / j);
        }
        SOJ.A00((C8951RIq) null, soj, valueOf, "RUNNING_DOWNLOAD", (String) null);
        qqu.A03.A01(new DirectInstallDownloadEvent(C8896REo.RUNNING_DOWNLOAD, Double.valueOf(((double) f) * 100.0d)));
        AnonymousClass0fD.A0A(-1332060998, A0D);
    }

    public final void Dmp(String str, int i, String str2) {
        SOJ soj;
        String str3;
        int A03 = AnonymousClass0fD.A03(-177021894);
        QQU qqu = this.A00;
        if (i != 0) {
            if (i == 1) {
                qqu.A03.A00(C8896REo.RUNNING_DOWNLOAD);
                soj = qqu.A04;
                str3 = "RUNNING_DOWNLOAD";
            } else if (i == 3) {
                qqu.A03.A00(C8896REo.START_INSTALL);
                soj = qqu.A04;
                str3 = "START_INSTALL";
            } else if (i == 4) {
                qqu.A02.post(new C12885TBz(qqu));
            }
            soj.A01(str3);
        } else {
            qqu.A03.A00(C8896REo.WAITING_DOWNLOAD);
            soj = qqu.A04;
            str3 = "DOWNLOAD_WAITING";
            soj.A01(str3);
        }
        AnonymousClass0fD.A0A(82889272, A03);
    }

    public final IBinder asBinder() {
        AnonymousClass0fD.A0A(485096436, AnonymousClass0fD.A03(-1077808869));
        return this;
    }

    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        int i3;
        int A03 = AnonymousClass0fD.A03(-509569779);
        if (i >= 1) {
            if (i <= 16777215) {
                parcel.enforceInterface("com.sec.android.app.samsungapps.downloadservice.aidl.IGalaxyStoreDownloadCallback");
                if (i == 1) {
                    Dmp(parcel.readString(), parcel.readInt(), parcel.readString());
                } else if (i == 2) {
                    DCp(parcel.readString(), parcel.readInt());
                } else if (i == 3) {
                    DaU(parcel.readString(), parcel.readFloat(), parcel.readLong());
                }
                i3 = -461081625;
            } else if (i == 1598968902) {
                parcel2.writeString("com.sec.android.app.samsungapps.downloadservice.aidl.IGalaxyStoreDownloadCallback");
                i3 = -1435321624;
            }
            AnonymousClass0fD.A0A(i3, A03);
            return true;
        }
        boolean onTransact = super.onTransact(i, parcel, parcel2, i2);
        AnonymousClass0fD.A0A(-1117603650, A03);
        return onTransact;
    }

    public SamsungDirectInstallAgentManager$iGalaxyStoreDownloadCallback$1() {
        int A03 = AnonymousClass0fD.A03(1964293957);
        attachInterface(this, "com.sec.android.app.samsungapps.downloadservice.aidl.IGalaxyStoreDownloadCallback");
        AnonymousClass0fD.A0A(1552819372, A03);
    }
}
