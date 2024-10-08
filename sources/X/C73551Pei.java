package X;

import com.instagram.direct.stella.StellaIpcDirectMessagingServiceClient;
import java.util.Iterator;
import java.util.List;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentMap;

/* renamed from: X.Pei  reason: case insensitive filesystem */
public final class C73551Pei extends TimerTask {
    public final /* synthetic */ C300945yD A00;

    public C73551Pei(C300945yD r1) {
        this.A00 = r1;
    }

    public final void run() {
        ConcurrentMap concurrentMap;
        C300945yD r9 = this.A00;
        List list = r9.A03;
        synchronized (list) {
            r9.A00 = null;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C70689OGk oGk = (C70689OGk) it.next();
                if (oGk.A00 + StellaIpcDirectMessagingServiceClient.KEEP_CONNECTION_ALIVE_MS < System.currentTimeMillis()) {
                    String str = oGk.A03;
                    String str2 = oGk.A01;
                    boolean z = oGk.A05;
                    boolean z2 = oGk.A04;
                    boolean z3 = true;
                    boolean z4 = false;
                    if (z2) {
                        z3 = false;
                        z4 = true;
                    }
                    C300945yD.A01(r9, str, str2, oGk.A02, 2000000, z3, z4, AnonymousClass7TF.A1Q(z ? 1 : 0));
                    if (z2) {
                        concurrentMap = r9.A04;
                    } else {
                        concurrentMap = r9.A05;
                    }
                    ConcurrentMap concurrentMap2 = (ConcurrentMap) concurrentMap.get(str);
                    if (concurrentMap2 != null) {
                        concurrentMap2.remove(str2);
                    }
                    it.remove();
                }
            }
            C300945yD.A00(r9);
        }
    }
}
