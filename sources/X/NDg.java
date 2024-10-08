package X;

import android.net.TrafficStats;
import com.facebook.rsys.trafficshaping.gen.TrafficShapingProxy;
import com.instagram.common.session.UserSession;

public final class NDg extends TrafficShapingProxy {
    public final UserSession A00;
    public final OFW A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;

    public final void startQueueingTraffic() {
        C64261Io r0;
        AnonymousClass1Rn.A00.set(true);
        if (this.A02) {
            02m.A0p.markerStart(16263308);
            OFW ofw = this.A01;
            if (!ofw.A03) {
                ofw.A03 = true;
                ofw.A02 = TrafficStats.getTotalTxBytes();
                ofw.A01 = TrafficStats.getTotalRxBytes();
                ofw.A00 = System.currentTimeMillis();
            }
        }
        if (this.A03) {
            synchronized (AnonymousClass50G.A01) {
                r0 = AnonymousClass50G.A00;
            }
            if (r0 != null) {
                r0.pause();
            }
        }
    }

    public final void stopQueueingTraffic() {
        C64261Io r0;
        long totalTxBytes;
        C381659c7 r5;
        AnonymousClass1Rn.A00.set(false);
        if (this.A02) {
            OFW ofw = this.A01;
            if (!ofw.A03) {
                r5 = new C381659c7(0, 0, 0, 1);
            } else {
                long j = -1;
                if (ofw.A02 == -1) {
                    totalTxBytes = -1;
                } else {
                    totalTxBytes = TrafficStats.getTotalTxBytes() - ofw.A02;
                }
                ofw.A02 = totalTxBytes;
                if (ofw.A01 != -1) {
                    j = TrafficStats.getTotalRxBytes() - ofw.A01;
                }
                ofw.A01 = j;
                ofw.A03 = false;
                r5 = new C381659c7(ofw.A02, j, System.currentTimeMillis() - ofw.A00, 1);
            }
            02m r4 = 02m.A0p;
            r4.markerAnnotate(16263308, "duration_ms", r5.A03);
            r4.markerAnnotate(16263308, "bytes_received", r5.A01);
            r4.markerAnnotate(16263308, "bytes_sent", r5.A02);
            r4.markerEnd(16263308, 2);
        }
        if (this.A03 && !this.A04) {
            synchronized (AnonymousClass50G.A01) {
                r0 = AnonymousClass50G.A00;
            }
            if (r0 != null) {
                r0.EIx();
            }
        }
    }

    public NDg(UserSession userSession, OFW ofw) {
        this.A00 = userSession;
        this.A01 = ofw;
        0Tu r2 = 0Tu.A05;
        this.A02 = 182.A06(r2, userSession, 36324063135674072L);
        this.A03 = 182.A06(r2, userSession, 36324063135739609L);
        this.A04 = 182.A06(r2, userSession, 36324063135805146L);
    }
}
