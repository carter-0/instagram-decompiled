package X;

import com.facebook.secure.securewebview.SecureWebView;
import com.instagram.common.session.UserSession;
import com.instagram.direct.stella.StellaIpcDirectMessagingServiceClient;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class SOF {
    public ScheduledFuture A00;
    public final AnonymousClass0JR A01 = new Object();
    public final UserSession A02;
    public final Map A03 = new ConcurrentHashMap();
    public final ScheduledExecutorService A04;

    /* JADX WARNING: type inference failed for: r0v2, types: [java.lang.Object, X.0JR] */
    public SOF(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A02 = userSession;
        ScheduledThreadPoolExecutor A0z = Pxf.A0z();
        this.A04 = A0z;
        this.A00 = A0z.scheduleAtFixedRate(new TE8(this), 0, StellaIpcDirectMessagingServiceClient.KEEP_CONNECTION_ALIVE_MS, TimeUnit.MILLISECONDS);
    }

    public static final synchronized void A01(SOF sof, long j) {
        ScheduledFuture scheduledFuture;
        synchronized (sof) {
            Map map = sof.A03;
            Long valueOf = Long.valueOf(j);
            C10844Rz4 rz4 = (C10844Rz4) map.get(valueOf);
            if (rz4 != null) {
                SecureWebView secureWebView = rz4.A03;
                if (secureWebView != null) {
                    SAG.A00(secureWebView);
                }
                map.remove(valueOf);
                if (map.isEmpty() && (scheduledFuture = sof.A00) != null) {
                    scheduledFuture.cancel(true);
                }
            }
        }
    }

    public final synchronized void A02(long j, int i, String str) {
        C10844Rz4 rz4 = (C10844Rz4) this.A03.get(Long.valueOf(j));
        if (rz4 != null) {
            rz4.A04 = AnonymousClass05K.A01;
            rz4.A00 = i;
            rz4.A05 = str;
            A00(this, j);
            A01(this, j);
        }
    }

    public static final void A00(SOF sof, long j) {
        C277014uI r7;
        long j2;
        C307896Rx r6;
        int i;
        C308276Tl r5;
        C10844Rz4 rz4 = (C10844Rz4) sof.A03.get(Long.valueOf(j));
        if (rz4 != null) {
            int intValue = rz4.A04.intValue();
            if (intValue == 2) {
                r7 = rz4.A08;
                if (r7 != null) {
                    j2 = rz4.A01;
                    r6 = rz4.A06;
                    i = 0;
                } else {
                    return;
                }
            } else if (intValue != 1) {
                i = 0;
                r7 = rz4.A09;
                if (r7 != null) {
                    j2 = rz4.A01;
                    r6 = rz4.A06;
                } else {
                    return;
                }
            } else {
                r7 = rz4.A07;
                if (r7 != null) {
                    long j3 = rz4.A01;
                    int i2 = rz4.A00;
                    String str = rz4.A05;
                    r6 = rz4.A06;
                    r5 = DbS.A0P();
                    r5.A01(Long.valueOf(j3));
                    r5.A03(Integer.valueOf(i2), 1);
                    r5.A03(str, 2);
                    C299275ur.A00(r6, r5.A00(), r7);
                }
                return;
            }
            r5 = DbS.A0P();
            r5.A03(Long.valueOf(j2), i);
            C299275ur.A00(r6, r5.A00(), r7);
        }
    }
}
