package X;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import com.facebook.neko.directinstall.installer.DirectInstallDownloadEvent;
import com.instagram.direct.stella.StellaIpcDirectMessagingServiceClient;
import com.sec.android.app.samsungapps.downloadservice.aidl.IGalaxyStoreDownloadService;
import com.xiaomi.market.IMarketDownloadService;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import java.util.zip.CRC32;

public abstract class SJG {
    public int A00;
    public final Context A01;
    public final Handler A02 = AnonymousClass7TF.A0D();
    public final C10982S3r A03;
    public final SOJ A04;
    public final C10316RqE A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final C10317RqF A09;

    public static void A02(SJG sjg, SOJ soj, String str, String str2) {
        SOJ.A00((C8951RIq) null, soj, (Long) null, str, str2);
        sjg.A03.A00(C8896REo.FAILED_DOWNLOAD);
    }

    public final void A03() {
        AtomicReference atomicReference;
        if (this instanceof QQV) {
            QQV qqv = (QQV) this;
            qqv.A04.A01("IPC_SERVICE_UNBIND_REQUESTED");
            try {
                IMarketDownloadService iMarketDownloadService = qqv.A03;
                if (iMarketDownloadService != null) {
                    iMarketDownloadService.FIM(qqv.A01);
                }
                qqv.A08.FIS(qqv.A01, qqv.A07);
                qqv.A03 = null;
            } catch (RemoteException | IllegalArgumentException e) {
                e.getMessage();
            }
        } else {
            if (this instanceof QQU) {
                QQU qqu = (QQU) this;
                ServiceConnection serviceConnection = qqu.A00;
                qqu.A04.A01("IPC_SERVICE_UNBIND_REQUESTED");
                C13771Tgk tgk = qqu.A03;
                Context context = qqu.A01;
                0qQ.A06(context);
                tgk.FIS(context, serviceConnection);
                atomicReference = qqu.A06;
            } else if (this instanceof QQS) {
                this.A04.A01("IPC_SERVICE_UNBIND_REQUESTED");
                return;
            } else {
                QQT qqt = (QQT) this;
                qqt.A04.A01("IPC_SERVICE_UNBIND_REQUESTED");
                C13771Tgk tgk2 = qqt.A05;
                Context context2 = qqt.A01;
                0qQ.A06(context2);
                tgk2.FIS(context2, qqt.A01);
                atomicReference = qqt.A06;
            }
            atomicReference.set((Object) null);
        }
    }

    public final void A04() {
        if (this instanceof QQV) {
            QQV qqv = (QQV) this;
            SOJ soj = qqv.A04;
            soj.A01("IPC_SERVICE_INSTALL_REQUESTED");
            if (qqv.A03 == null) {
                soj.A01("IPC_SERVICE_INSTALL_REQUEST_SKIPPED");
                qqv.A05 = true;
                return;
            }
            try {
                Bundle A0a = AnonymousClass7TE.A0a();
                A0a.putString("ref", "insta_direct");
                A0a.putString("callerPackage", qqv.A01.getPackageName());
                A0a.putString("packageName", qqv.A06);
                long nextLong = new SecureRandom().nextLong();
                StringBuilder A1A = AnonymousClass7TE.A1A();
                A1A.append(nextLong);
                A1A.append(':');
                A0a.putString("nonce", Pxe.A0z(A1A, (int) (System.currentTimeMillis() / StellaIpcDirectMessagingServiceClient.KEEP_CONNECTION_ALIVE_MS)));
                TAS tas = new TAS('a', 'z');
                TAS tas2 = new TAS('A', 'Z');
                ArrayList A1C = AnonymousClass7TE.A1C();
                018.A16(tas, A1C);
                018.A16(tas2, A1C);
                ArrayList A0S = 00k.A0S(new TAS('0', '9'), A1C);
                2HY r0 = new 2HY(1, 10);
                ArrayList A0p = AnonymousClass7TF.A0p(r0);
                0sh it = r0.iterator();
                while (it.hasNext()) {
                    it.A00();
                    AnonymousClass7TF.A1M(A0p, 2SP.A01.A06(0, A0S.size()));
                }
                ArrayList A0p2 = AnonymousClass7TF.A0p(A0p);
                Iterator it2 = A0p.iterator();
                while (it2.hasNext()) {
                    A0p2.add(A0S.get(AnonymousClass7TG.A0F(it2)));
                }
                String A0P = 00k.A0P("", "", "", A0p2, (0sP) null);
                String A0R = 002.A0R(A0P, "mimarket");
                CRC32 crc32 = new CRC32();
                crc32.update(C66582MXn.A1a(A0R));
                long value = crc32.getValue();
                StringBuilder A0n = AnonymousClass7TF.A0n(A0P);
                A0n.append(':');
                String A10 = Pxe.A10(A0n, value);
                qqv.A04 = A10;
                A0a.putString("requestId", A10);
                A0a.putString("referrer", qqv.A07);
                A0a.toString();
                if (!qqv.A03.AQ6(A0a)) {
                    qqv.A03();
                } else {
                    soj.A01("IPC_SERVICE_INSTALL_START");
                }
            } catch (RemoteException | SecurityException e) {
                SOJ.A00((C8951RIq) null, soj, (Long) null, "FAILED_INSTALL", e.getMessage());
            }
        } else if (this instanceof QQU) {
            QQU qqu = (QQU) this;
            SOJ soj2 = qqu.A04;
            soj2.A01("IPC_SERVICE_INSTALL_REQUESTED");
            IGalaxyStoreDownloadService iGalaxyStoreDownloadService = (IGalaxyStoreDownloadService) qqu.A06.get();
            if (iGalaxyStoreDownloadService == null) {
                soj2.A01("IPC_SERVICE_INSTALL_REQUEST_SKIPPED");
                return;
            }
            try {
                iGalaxyStoreDownloadService.AQ7(QQU.A00(qqu, true), qqu.A04);
                soj2.A01("IPC_SERVICE_INSTALL_START");
            } catch (RemoteException e2) {
                A02(qqu, soj2, "FAILED_INSTALL", e2.getMessage());
            }
        } else if (this instanceof QQS) {
            SOJ soj3 = this.A04;
            soj3.A01("IPC_SERVICE_INSTALL_REQUESTED");
            try {
                throw new C318126oR("An operation is not implemented.");
            } catch (Exception e3) {
                A02(this, soj3, "FAILED_INSTALL", e3.getMessage());
            }
        } else {
            SOJ soj4 = this.A04;
            soj4.A01("IPC_SERVICE_INSTALL_REQUESTED");
            soj4.A01("IPC_SERVICE_INSTALL_REQUEST_SKIPPED");
        }
    }

    public final void A05(RE5 re5, C8896REo rEo, String str, String str2) {
        if (re5 != null) {
            this.A03.A01(new DirectInstallDownloadEvent(re5, rEo));
        } else {
            this.A03.A00(rEo);
        }
        A03();
        boolean equals = "SUCCESS_INSTALL".equals(str);
        SOJ soj = this.A04;
        if (equals) {
            SOJ.A00((C8951RIq) null, soj, (Long) null, "SUCCESS_INSTALL", (String) null);
            C10316RqE rqE = this.A05;
            Context context = this.A01;
            String str3 = this.A06;
            DbY.A1S(context, soj);
            C10670Rw5 A002 = C9263RVo.A00(rqE.A00);
            if (A002.A00) {
                if (A002.A02.getBoolean("AIS_AUTO_OPEN_KEY", 182.A06(0Tu.A05, A002.A01.A00, 36317131058516774L))) {
                    Pxk.A0N(context, soj, str3, "AUTO_APP_OPEN");
                    return;
                }
                return;
            }
            return;
        }
        SOJ.A00((C8951RIq) null, soj, (Long) null, "FAILED_INSTALL", str2);
    }

    public SJG(Context context, C10806RyS ryS, String str) {
        this.A01 = context;
        this.A06 = ryS.A05;
        this.A03 = ryS.A00;
        this.A07 = ryS.A06;
        this.A04 = ryS.A01;
        this.A05 = ryS.A03;
        this.A08 = str;
        this.A09 = ryS.A04;
    }
}
