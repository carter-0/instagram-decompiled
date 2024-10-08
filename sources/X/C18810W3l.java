package X;

import com.instagram.model.upcomingeventsmetadata.UpcomingEventMedia;
import com.instagram.user.model.UpcomingEvent;
import com.instagram.user.model.UpcomingEventLiveMetadata;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

/* renamed from: X.W3l  reason: case insensitive filesystem */
public abstract class C18810W3l {
    public static final long A02(UpcomingEvent upcomingEvent) {
        0qQ.A0B(upcomingEvent, 0);
        return TimeUnit.SECONDS.toMillis(upcomingEvent.getStartTime());
    }

    public static final boolean A06(UpcomingEvent upcomingEvent) {
        long currentTimeMillis = System.currentTimeMillis();
        UpcomingEventLiveMetadata BNJ = upcomingEvent.BNJ();
        if (BNJ != null) {
            if (BNJ.Ai3() == null || !AnonymousClass7TF.A1Y(BNJ.CPg(), false)) {
                return false;
            }
        } else if (A02(upcomingEvent) > currentTimeMillis) {
            return false;
        }
        if (currentTimeMillis <= A00(upcomingEvent)) {
            return true;
        }
        return false;
    }

    public static final boolean A0A(UpcomingEvent upcomingEvent) {
        0qQ.A0B(upcomingEvent, 0);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        if (timeUnit.toMinutes(A02(upcomingEvent)) - timeUnit.toMinutes(System.currentTimeMillis()) > TimeUnit.SECONDS.toMinutes(1200) || TimeUnit.MILLISECONDS.toMinutes(A02(upcomingEvent)) + TimeUnit.SECONDS.toMinutes(2700) < TimeUnit.MILLISECONDS.toMinutes(System.currentTimeMillis())) {
            return false;
        }
        return true;
    }

    public static final boolean A0B(UpcomingEvent upcomingEvent) {
        0qQ.A0B(upcomingEvent, 0);
        UpcomingEventLiveMetadata BNJ = upcomingEvent.BNJ();
        if (BNJ == null || !BNJ.CbF()) {
            return false;
        }
        return true;
    }

    public static final boolean A0C(UpcomingEvent upcomingEvent) {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis >= A01(upcomingEvent)) {
            return false;
        }
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(A01(upcomingEvent));
        instance.set(11, 0);
        instance.set(12, 0);
        instance.set(13, 0);
        instance.set(14, 0);
        instance.add(5, -7);
        if (instance.getTimeInMillis() <= currentTimeMillis) {
            return true;
        }
        return false;
    }

    public static final long A00(UpcomingEvent upcomingEvent) {
        Long B1d = upcomingEvent.B1d();
        if (B1d == null) {
            return A02(upcomingEvent) + TimeUnit.HOURS.toMillis(24);
        }
        return TimeUnit.SECONDS.toMillis(B1d.longValue());
    }

    public static final long A01(UpcomingEvent upcomingEvent) {
        if (A03(upcomingEvent) == AnonymousClass05K.A01) {
            return A00(upcomingEvent);
        }
        return A02(upcomingEvent);
    }

    public static final Integer A03(UpcomingEvent upcomingEvent) {
        if (upcomingEvent.getStartTime() != 0 || upcomingEvent.B1d() == null) {
            return AnonymousClass05K.A00;
        }
        return AnonymousClass05K.A01;
    }

    public static final String A04(UpcomingEvent upcomingEvent) {
        UpcomingEventMedia BPg = upcomingEvent.BPg();
        if (BPg != null) {
            return BPg.getId();
        }
        return null;
    }

    public static final boolean A05(UpcomingEvent upcomingEvent) {
        long A02;
        long currentTimeMillis = System.currentTimeMillis();
        if (A03(upcomingEvent).intValue() == 1) {
            A02 = A00(upcomingEvent);
        } else {
            A02 = A02(upcomingEvent);
        }
        if (A02 <= currentTimeMillis) {
            return true;
        }
        return false;
    }

    public static final boolean A07(UpcomingEvent upcomingEvent) {
        if (!A06(upcomingEvent) || A0D(upcomingEvent, System.currentTimeMillis())) {
            return false;
        }
        return true;
    }

    public static final boolean A08(UpcomingEvent upcomingEvent) {
        long j;
        boolean A0B = A0B(upcomingEvent);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long minutes = timeUnit.toMinutes(A02(upcomingEvent)) - timeUnit.toMinutes(System.currentTimeMillis());
        if (A0B) {
            j = TimeUnit.SECONDS.toMinutes(1200);
        } else {
            j = 15;
        }
        if (minutes > j) {
            return false;
        }
        return true;
    }

    public static final boolean A09(UpcomingEvent upcomingEvent) {
        UpcomingEventLiveMetadata BNJ = upcomingEvent.BNJ();
        if (BNJ == null) {
            return false;
        }
        if (A06(upcomingEvent) || (A0D(upcomingEvent, System.currentTimeMillis()) && BNJ.BeF() != null)) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0044, code lost:
        if (r1 == false) goto L_0x0047;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0037, code lost:
        if (r0 > 0) goto L_0x0039;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A0D(com.instagram.user.model.UpcomingEvent r7, long r8) {
        /*
            com.instagram.user.model.UpcomingEventLiveMetadata r6 = r7.BNJ()
            r3 = 1
            if (r6 == 0) goto L_0x0047
            long r1 = A02(r7)
            long r4 = A00(r7)
            boolean r0 = r6.CbF()
            if (r0 == 0) goto L_0x0047
            int r0 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r0 < 0) goto L_0x0047
            java.lang.String r0 = r6.Ai3()
            if (r0 != 0) goto L_0x0039
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r4 = r0.toMinutes(r1)
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.SECONDS
            r0 = 2700(0xa8c, double:1.334E-320)
            long r0 = r2.toMinutes(r0)
            long r4 = r4 + r0
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r1 = r0.toMinutes(r8)
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            r1 = 1
            if (r0 <= 0) goto L_0x003a
        L_0x0039:
            r1 = 0
        L_0x003a:
            java.lang.Boolean r0 = r6.CPg()
            boolean r0 = X.AnonymousClass7TF.A1Y(r0, r3)
            if (r0 != 0) goto L_0x0046
            if (r1 == 0) goto L_0x0047
        L_0x0046:
            return r3
        L_0x0047:
            long r1 = A00(r7)
            int r0 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r0 < 0) goto L_0x0046
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18810W3l.A0D(com.instagram.user.model.UpcomingEvent, long):boolean");
    }
}
