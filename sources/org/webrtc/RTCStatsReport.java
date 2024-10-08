package org.webrtc;

import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import java.util.Iterator;
import java.util.Map;

public class RTCStatsReport {
    public final Map stats;
    public final long timestampUs;

    public static RTCStatsReport create(long j, Map map) {
        return new RTCStatsReport(j, map);
    }

    public Map getStatsMap() {
        return this.stats;
    }

    public double getTimestampUs() {
        return (double) this.timestampUs;
    }

    public RTCStatsReport(long j, Map map) {
        this.timestampUs = j;
        this.stats = map;
    }

    public String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("{ timestampUs: ");
        A1A.append(this.timestampUs);
        A1A.append(", stats: [\n");
        Iterator A0v = AnonymousClass7TF.A0v(this.stats);
        boolean z = true;
        while (A0v.hasNext()) {
            Object next = A0v.next();
            if (!z) {
                A1A.append(",\n");
            }
            A1A.append(next);
            z = false;
        }
        return AnonymousClass7TF.A0l(" ] }", A1A);
    }
}
