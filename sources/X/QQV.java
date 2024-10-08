package X;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.RemoteException;
import com.facebook.neko.directinstall.installer.XiaomiDirectInstallAgentManager$2;
import com.xiaomi.market.IMarketDownloadService;
import java.util.Map;

public final class QQV extends SJG {
    public int A00;
    public XiaomiDirectInstallAgentManager$2 A01;
    public C10317RqF A02;
    public IMarketDownloadService A03;
    public String A04;
    public boolean A05;
    public boolean A06;
    public final ServiceConnection A07;
    public final C13771Tgk A08;
    public final SMG A09;
    public final Map A0A;

    public static int A00(QQV qqv) {
        try {
            IMarketDownloadService iMarketDownloadService = qqv.A03;
            if (iMarketDownloadService != null) {
                return iMarketDownloadService.AXa();
            }
            return 1;
        } catch (RemoteException e) {
            e.getMessage();
            return 1;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: X.Sny} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: X.Sny} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: X.Sny} */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public QQV(android.content.Context r8, X.C10806RyS r9) {
        /*
            r7 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = X.C10072Rm9.A00
            boolean r0 = r0.get()
            if (r0 != 0) goto L_0x00b3
            boolean r0 = com.facebook.endtoend.EndToEnd.isRunningEndToEndTest()
            if (r0 != 0) goto L_0x00b3
            X.QQQ r3 = new X.QQQ
            r3.<init>()
        L_0x0013:
            X.SMG r2 = X.SMG.A00
            java.lang.String r0 = "xiaomi"
            r7.<init>(r8, r9, r0)
            java.util.HashMap r0 = X.AnonymousClass7TE.A1E()
            r7.A0A = r0
            r0 = 0
            r7.A03 = r0
            r6 = 0
            r7.A05 = r6
            r7.A04 = r0
            r7.A06 = r6
            r7.A00 = r6
            r5 = 1
            X.SVZ r0 = new X.SVZ
            r0.<init>(r7, r5)
            r7.A07 = r0
            com.facebook.neko.directinstall.installer.XiaomiDirectInstallAgentManager$2 r0 = new com.facebook.neko.directinstall.installer.XiaomiDirectInstallAgentManager$2
            r0.<init>(r7)
            r7.A01 = r0
            java.util.Map r4 = r7.A0A
            java.lang.Integer r1 = X.C51967G9n.A0j()
            java.lang.String r0 = "STATUS_NONE"
            r4.put(r1, r0)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)
            java.lang.String r0 = "STATUS_WAITING"
            r4.put(r1, r0)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            java.lang.String r0 = "STATUS_CONNECTING"
            r4.put(r1, r0)
            java.lang.Integer r1 = X.C66580MXl.A0q()
            java.lang.String r0 = "STATUS_PENDING"
            r4.put(r1, r0)
            r0 = 3
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "STATUS_DOWNLOADING"
            r4.put(r1, r0)
            r0 = 4
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "STATUS_PAUSED"
            r4.put(r1, r0)
            java.lang.Integer r1 = X.Pxe.A0l()
            java.lang.String r0 = "STATUS_VERIFYING"
            r4.put(r1, r0)
            r0 = 6
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "STATUS_INSTALLING"
            r4.put(r1, r0)
            java.lang.Integer r1 = X.Pxe.A0m()
            java.lang.String r0 = "STATUS_WAITING_INSTALL"
            r4.put(r1, r0)
            java.lang.Integer r1 = X.Pxe.A0n()
            java.lang.String r0 = "STATUS_FAILED"
            r4.put(r1, r0)
            r0 = 9
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "STATUS_SUCCESS"
            r4.put(r1, r0)
            r7.A08 = r3
            r0 = 1006(0x3ee, float:1.41E-42)
            r7.A00 = r0
            r7.A09 = r2
            X.RqF r0 = r9.A04
            r7.A02 = r0
            return
        L_0x00b3:
            X.QQZ r3 = new X.QQZ
            r3.<init>()
            goto L_0x0013
        */
        throw new UnsupportedOperationException("Method not decompiled: X.QQV.<init>(android.content.Context, X.RyS):void");
    }

    public static boolean A01(QQV qqv) {
        Intent A092 = DbS.A09();
        SOJ soj = qqv.A04;
        soj.A01("IPC_SERVICE_BIND_REQUESTED");
        C66581MXm.A17(A092, "com.xiaomi.mipicks", "com.xiaomi.market.data.MarketDownloadService");
        C13771Tgk tgk = qqv.A08;
        Context context = qqv.A01;
        ServiceConnection serviceConnection = qqv.A07;
        boolean ADg = tgk.ADg(context, A092, serviceConnection);
        if (ADg) {
            return ADg;
        }
        soj.A01("FALLBACK_TO_XIAOMI_DISCOVER_SERVICE");
        C66581MXm.A17(A092, "com.xiaomi.discover", "com.xiaomi.market.data.MarketDownloadService");
        return tgk.ADg(context, A092, serviceConnection);
    }
}
