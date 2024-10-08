package X;

import java.util.Random;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: X.WIa  reason: case insensitive filesystem */
public final class C19048WIa implements 0TN {
    public final long A00;
    public final long A01;
    public final AnonymousClass2QT A02;
    public final ScheduledExecutorService A03;
    public volatile boolean A04;

    public final void DD0(0TG r1) {
    }

    public final int BnN() {
        boolean A1R = AnonymousClass7TF.A1R((this.A00 > 0 ? 1 : (this.A00 == 0 ? 0 : -1)));
        return this.A01 > 0 ? A1R | true ? 1 : 0 : A1R ? 1 : 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DUC(com.facebook.memorytimeline.MemoryTimeline r15, X.0TM r16) {
        /*
            r14 = this;
            r0 = r16
            java.util.Collection r0 = r0.A00
            java.util.Iterator r11 = r0.iterator()
        L_0x0008:
            boolean r0 = r11.hasNext()
            r5 = 0
            if (r0 == 0) goto L_0x0098
            java.lang.Object r10 = r11.next()
            X.0TD r10 = (X.0TD) r10
            X.0TJ r1 = r10.A02
            X.0TJ r0 = X.0TJ.A0G
            java.lang.String r7 = " bigger than "
            r8 = 1024(0x400, double:5.06E-321)
            if (r1 != r0) goto L_0x009c
            long r2 = r14.A01
            int r0 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x009c
            long r0 = r10.A00
            long r0 = r0 / r8
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L_0x0008
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r4 = "Resident anonymous size of "
            r8.append(r4)
            r8.append(r0)
            r8.append(r7)
            r8.append(r2)
        L_0x0040:
            java.lang.String r11 = r8.toString()
            if (r11 == 0) goto L_0x0098
            X.2QT r0 = r14.A02
            long r12 = java.lang.System.currentTimeMillis()
            X.2QR r0 = r0.A00
            X.0xa r8 = r0.A04
            java.lang.String r7 = "last_dump_time"
            long r0 = r8.getLong(r7, r5)
            long r12 = r12 - r0
            r9 = 86400000(0x5265c00, double:4.2687272E-316)
            int r0 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
            if (r0 < 0) goto L_0x0099
            long r2 = r9 - r12
        L_0x0060:
            r4 = 0
            r14.A04 = r4
            int r0 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r0 > 0) goto L_0x008c
            X.2QF r0 = X.2QF.A00()
            X.2QM r1 = r0.A02()
            java.lang.String r0 = "Daily"
            r1.A09(r0, r11, r4)
            long r4 = java.lang.System.currentTimeMillis()
            long r2 = r4 + r9
            X.0xY r1 = r8.AR4()
            r1.E5c(r7, r4)
            java.lang.String r0 = "next_dump_time"
            r1.E5c(r0, r2)
            r1.apply()
            r2 = 86400000(0x5265c00, double:4.2687272E-316)
        L_0x008c:
            java.util.concurrent.ScheduledExecutorService r4 = r14.A03
            X.Wi0 r1 = new X.Wi0
            r1.<init>(r14)
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS
            r4.schedule(r1, r2, r0)
        L_0x0098:
            return
        L_0x0099:
            r2 = 0
            goto L_0x0060
        L_0x009c:
            X.0TJ r0 = X.0TJ.A0V
            if (r1 != r0) goto L_0x0008
            long r3 = r14.A00
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x0008
            long r1 = r10.A00
            long r1 = r1 / r8
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x0008
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r0 = "Java heap size of "
            r8.append(r0)
            r8.append(r1)
            r8.append(r7)
            r8.append(r3)
            goto L_0x0040
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19048WIa.DUC(com.facebook.memorytimeline.MemoryTimeline, X.0TM):void");
    }

    public final boolean FNJ() {
        return this.A04;
    }

    public C19048WIa(AnonymousClass2QT r13, ScheduledExecutorService scheduledExecutorService, long j, long j2, long j3, long j4) {
        Random random = new Random();
        if (j2 > 0) {
            this.A00 = ((long) random.nextInt((int) ((j2 - j) + 1))) + j;
        }
        if (j4 > 0) {
            this.A01 = j3 + ((long) random.nextInt((int) ((j4 - j3) + 1)));
        }
        this.A02 = r13;
        this.A03 = scheduledExecutorService;
        long currentTimeMillis = System.currentTimeMillis() - r13.A00.A04.getLong("last_dump_time", 0);
        if (86400000 >= currentTimeMillis) {
            long j5 = 86400000 - currentTimeMillis;
            if (j5 > 0) {
                this.A04 = false;
                scheduledExecutorService.schedule(new C19930Whz(this), j5, TimeUnit.MILLISECONDS);
                return;
            }
        }
        this.A04 = true;
    }
}
