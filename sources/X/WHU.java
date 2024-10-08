package X;

import java.util.Date;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

public final class WHU implements X8H {
    public int A00;
    public C18758Vzt A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final String A05 = AnonymousClass7TF.A0h(this);
    public final boolean A06;
    public final X8G A07;
    public final VQi A08;
    public final C18465VsF A09;
    public final C17876VhT A0A;

    public static final C18758Vzt A00(WHU whu) {
        C18758Vzt vzt = whu.A01;
        if (vzt == null) {
            C18465VsF vsF = whu.A09;
            String str = whu.A05;
            C17876VhT vhT = whu.A0A;
            X8G x8g = whu.A07;
            DbY.A1S(str, x8g);
            ConcurrentHashMap concurrentHashMap = C18465VsF.A03;
            synchronized (concurrentHashMap) {
                VQl vQl = (VQl) concurrentHashMap.get(str);
                if (vQl != null) {
                    concurrentHashMap.remove(str);
                    vzt = vQl.A00;
                } else {
                    vzt = new C18758Vzt(x8g, new VLS(vsF.A01), vhT, vsF.A02, vsF.A00);
                }
            }
            whu.A01 = vzt;
        }
        return vzt;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0056, code lost:
        if (r3 <= r9) goto L_0x0058;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0058, code lost:
        if (r9 <= r2) goto L_0x005a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00a1, code lost:
        if (r9 >= 0) goto L_0x0058;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0099  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C249903kY Afx(int r9, int r10, int r11) {
        /*
            r8 = this;
            boolean r0 = r8.A06
            int r6 = r8.A03
            int r5 = r8.A02
            if (r0 == 0) goto L_0x0018
            if (r10 < r6) goto L_0x000c
            if (r11 >= r5) goto L_0x0018
        L_0x000c:
            double r2 = (double) r6
            double r0 = (double) r5
            double r2 = r2 / r0
            if (r11 <= r10) goto L_0x00f6
            if (r11 <= r5) goto L_0x0014
            r11 = r5
        L_0x0014:
            r5 = r11
            double r0 = (double) r11
            double r0 = r0 * r2
            int r6 = (int) r0
        L_0x0018:
            X.Vzt r4 = A00(r8)
            java.util.Map r0 = r4.A01
            java.lang.Object r1 = X.C51968G9o.A10(r0, r9)
            java.lang.Number r1 = (java.lang.Number) r1
            if (r1 == 0) goto L_0x00a9
            int r9 = r1.intValue()
            r4.A00 = r9
            java.util.concurrent.ConcurrentHashMap r0 = r4.A08
            java.lang.Object r1 = r0.get(r1)
            X.VQj r1 = (X.VQj) r1
            if (r1 == 0) goto L_0x00a6
            boolean r0 = r1.A00
            if (r0 != 0) goto L_0x00a6
            X.3kY r7 = r1.A01
            boolean r0 = r7.A06()
            if (r0 == 0) goto L_0x00a6
            X.VLT r0 = r4.A05
            int r3 = r4.A0A
            int r2 = r4.A03
            int r2 = r2 + r3
            int r1 = r0.A00
            int r2 = r2 % r1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            if (r2 < 0) goto L_0x00a4
            if (r0 == 0) goto L_0x00a4
        L_0x0054:
            if (r3 >= r2) goto L_0x009c
            if (r3 > r9) goto L_0x005d
        L_0x0058:
            if (r9 > r2) goto L_0x005d
        L_0x005a:
            X.C18758Vzt.A01(r4, r6, r5)
        L_0x005d:
            X.3kY r2 = r7.A03()
            java.lang.Integer r1 = X.AnonymousClass05K.A00
        L_0x0063:
            X.VQk r0 = new X.VQk
            r0.<init>(r2, r1)
            X.VQi r5 = r8.A08
            java.util.concurrent.atomic.AtomicInteger r1 = X.C18411VrD.A05
            r4 = 0
            X.0qQ.A0B(r5, r4)
            java.util.concurrent.ConcurrentHashMap r3 = X.C18411VrD.A02
            boolean r1 = r3.contains(r5)
            if (r1 != 0) goto L_0x0083
            int r1 = r5.A00
            float r2 = (float) r1
            r1 = 1045220557(0x3e4ccccd, float:0.2)
            float r2 = r2 * r1
            int r1 = (int) r2
            X.C66581MXm.A1S(r5, r3, r1)
        L_0x0083:
            java.lang.Integer r1 = r0.A01
            int r2 = r1.intValue()
            if (r2 == r4) goto L_0x0099
            r1 = 1
            if (r2 == r1) goto L_0x0096
            java.util.concurrent.atomic.AtomicInteger r1 = X.C18411VrD.A03
        L_0x0090:
            r1.incrementAndGet()
            X.3kY r0 = r0.A00
            return r0
        L_0x0096:
            java.util.concurrent.atomic.AtomicInteger r1 = X.C18411VrD.A04
            goto L_0x0090
        L_0x0099:
            java.util.concurrent.atomic.AtomicInteger r1 = X.C18411VrD.A05
            goto L_0x0090
        L_0x009c:
            if (r3 > r9) goto L_0x00a1
            if (r9 > r1) goto L_0x00a1
            goto L_0x005a
        L_0x00a1:
            if (r9 < 0) goto L_0x005d
            goto L_0x0058
        L_0x00a4:
            int r2 = r2 + r1
            goto L_0x0054
        L_0x00a6:
            X.C18758Vzt.A01(r4, r6, r5)
        L_0x00a9:
            X.VLT r0 = r4.A05
            int r5 = r0.A00
            r1 = 0
            X.2HY r0 = new X.2HY
            r0.<init>(r1, r5)
            java.util.Iterator r2 = r0.iterator()
        L_0x00b7:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00f1
            r0 = r2
            X.0sh r0 = (X.0sh) r0
            int r0 = r0.A00()
            int r3 = r9 - r0
            int r3 = r3 % r5
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            if (r3 < 0) goto L_0x00ef
            if (r0 == 0) goto L_0x00ef
        L_0x00cf:
            java.util.concurrent.ConcurrentHashMap r0 = r4.A08
            java.lang.Object r1 = X.C51968G9o.A0z(r0, r3)
            X.VQj r1 = (X.VQj) r1
            if (r1 == 0) goto L_0x00b7
            boolean r0 = r1.A00
            if (r0 != 0) goto L_0x00b7
            X.3kY r1 = r1.A01
            boolean r0 = r1.A06()
            if (r0 == 0) goto L_0x00b7
            X.3kY r2 = r1.A03()
            r4.A00 = r3
            java.lang.Integer r1 = X.AnonymousClass05K.A01
            goto L_0x0063
        L_0x00ef:
            int r3 = r3 + r5
            goto L_0x00cf
        L_0x00f1:
            r2 = 0
            java.lang.Integer r1 = X.AnonymousClass05K.A0C
            goto L_0x0063
        L_0x00f6:
            if (r10 <= r6) goto L_0x00f9
            r10 = r6
        L_0x00f9:
            r6 = r10
            double r0 = (double) r10
            double r0 = r0 / r2
            int r5 = (int) r0
            goto L_0x0018
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WHU.Afx(int, int, int):X.3kY");
    }

    public final void E44(C62320sa r7, int i, int i2) {
        int i3;
        int i4;
        if (i > 0 && i2 > 0 && (i3 = this.A03) > 0 && (i4 = this.A02) > 0) {
            if (this.A06 && (i < i3 || i2 < i4)) {
                double d = ((double) i3) / ((double) i4);
                if (i2 > i) {
                    if (i2 > i4) {
                        i2 = i4;
                    }
                    i3 = (int) (((double) i2) * d);
                } else {
                    if (i > i3) {
                        i = i3;
                    }
                    i3 = i;
                }
            }
            C18758Vzt A002 = A00(this);
            0qQ.A0B(C20624WwI.A00, 2);
            C18758Vzt.A01(A002, i3, i3);
        }
    }

    public WHU(X8G x8g, C18465VsF vsF, C17876VhT vhT, boolean z) {
        this.A07 = x8g;
        this.A0A = vhT;
        this.A09 = vsF;
        this.A06 = z;
        X9T x9t = ((WHP) x8g).A00.A06;
        this.A03 = x9t.getWidth();
        this.A02 = x9t.getHeight();
        long millis = TimeUnit.SECONDS.toMillis(1) / ((long) (x8g.BOg() / x8g.getFrameCount()));
        int i = (int) (millis < 1 ? 1 : millis);
        this.A04 = i;
        this.A00 = i;
        this.A08 = new VQi(this);
    }

    public final void onStop() {
        A00(this);
        C18758Vzt A002 = A00(this);
        String str = this.A05;
        0qQ.A0B(str, 0);
        C18465VsF.A03.put(str, new VQl(A002, new Date()));
        this.A01 = null;
    }

    public final void E45(XBU xbu, X9F x9f, VZ6 vz6, C62320sa r4, int i) {
    }
}
