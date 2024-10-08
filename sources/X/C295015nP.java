package X;

import com.facebook.litho.ComponentTree;
import com.facebook.litho.LithoView;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.5nP  reason: invalid class name and case insensitive filesystem */
public final class C295015nP {
    public static final AtomicInteger A0H = new AtomicInteger(1);
    public int A00;
    public ComponentTree A01;
    public AnonymousClass3XI A02;
    public C338207ha A03;
    public C338367hq A04;
    public boolean A05 = true;
    public boolean A06;
    public int A07 = -1;
    public int A08 = -1;
    public C338397ht A09;
    public XDO A0A;
    public final int A0B;
    public final AnonymousClass2TL A0C;
    public final AtomicInteger A0D = new AtomicInteger(0);
    public final boolean A0E;
    public final 2Sa A0F;
    public final C338607iE A0G;

    public C295015nP(AnonymousClass2TL r3, 2Sa r4, C338607iE r5, C338367hq r6, boolean z) {
        this.A04 = r6;
        this.A0G = r5;
        this.A0B = A0H.getAndIncrement();
        this.A0C = r3;
        this.A0F = r4;
        this.A09 = null;
        this.A0E = z;
    }

    public final synchronized ComponentTree A01() {
        return this.A01;
    }

    public final synchronized C338367hq A02() {
        return this.A04;
    }

    public final synchronized void A03() {
        boolean z;
        ComponentTree componentTree;
        Object Auo = this.A04.Auo("acquire_state_handler");
        if (Auo instanceof Boolean) {
            z = ((Boolean) Auo).booleanValue();
        } else {
            z = this.A0E;
        }
        if (z && (componentTree = this.A01) != null) {
            this.A02 = componentTree.A0F();
        }
        A04();
    }

    public final synchronized void A04() {
        ComponentTree componentTree = this.A01;
        if (componentTree != null) {
            XDO xdo = this.A0A;
            if (xdo != null) {
                xdo.A00(AnonymousClass05K.A0C);
            } else {
                componentTree.A0J();
                this.A01 = null;
            }
        }
        this.A06 = false;
    }

    public final synchronized void A05() {
        ComponentTree componentTree = this.A01;
        if (componentTree != null) {
            LithoView lithoView = componentTree.A08;
            if (lithoView == null || !lithoView.isAttachedToWindow()) {
                A04();
            } else {
                this.A01.A08.addOnAttachStateChangeListener(new ALw(this));
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002a, code lost:
        if (r12 == null) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002c, code lost:
        r3.A0P(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002f, code lost:
        com.facebook.litho.ComponentTree.A04(r2, r3, (X.AnonymousClass2T3) null, r5, r6, r7, 1, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0035, code lost:
        monitor-enter(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0038, code lost:
        if (r10.A01 != r3) goto L_0x0044;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0040, code lost:
        if (r2 != r10.A04.Apd()) goto L_0x0044;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0042, code lost:
        r10.A06 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0044, code lost:
        monitor-exit(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0045, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A06(X.2V1 r11, X.C337997hF r12, int r13, int r14) {
        /*
            r10 = this;
            monitor-enter(r10)
            X.7hq r0 = r10.A04     // Catch:{ all -> 0x0049 }
            boolean r0 = r0.EFI()     // Catch:{ all -> 0x0049 }
            if (r0 == 0) goto L_0x000b
            monitor-exit(r10)     // Catch:{ all -> 0x0049 }
            return
        L_0x000b:
            r6 = r13
            r10.A08 = r13     // Catch:{ all -> 0x0049 }
            r7 = r14
            r10.A07 = r14     // Catch:{ all -> 0x0049 }
            r10.A00(r11)     // Catch:{ all -> 0x0049 }
            com.facebook.litho.ComponentTree r3 = r10.A01     // Catch:{ all -> 0x0049 }
            X.7hq r0 = r10.A04     // Catch:{ all -> 0x0049 }
            X.3mp r2 = r0.Apd()     // Catch:{ all -> 0x0049 }
            X.7hq r1 = r10.A04     // Catch:{ all -> 0x0049 }
            boolean r0 = r1 instanceof X.C338407hu     // Catch:{ all -> 0x0049 }
            if (r0 == 0) goto L_0x0028
            X.7hu r1 = (X.C338407hu) r1     // Catch:{ all -> 0x0049 }
            X.2VJ r5 = r1.A00     // Catch:{ all -> 0x0049 }
        L_0x0026:
            monitor-exit(r10)     // Catch:{ all -> 0x0049 }
            goto L_0x002a
        L_0x0028:
            r5 = 0
            goto L_0x0026
        L_0x002a:
            if (r12 == 0) goto L_0x002f
            r3.A0P(r12)
        L_0x002f:
            r8 = 1
            r4 = 0
            r9 = r8
            com.facebook.litho.ComponentTree.A04(r2, r3, r4, r5, r6, r7, r8, r9)
            monitor-enter(r10)
            com.facebook.litho.ComponentTree r0 = r10.A01     // Catch:{ all -> 0x0046 }
            if (r0 != r3) goto L_0x0044
            X.7hq r0 = r10.A04     // Catch:{ all -> 0x0046 }
            X.3mp r0 = r0.Apd()     // Catch:{ all -> 0x0046 }
            if (r2 != r0) goto L_0x0044
            r10.A06 = r8     // Catch:{ all -> 0x0046 }
        L_0x0044:
            monitor-exit(r10)     // Catch:{ all -> 0x0046 }
            return
        L_0x0046:
            r0 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x0046 }
            throw r0
        L_0x0049:
            r0 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x0049 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C295015nP.A06(X.2V1, X.7hF, int, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002a, code lost:
        com.facebook.litho.ComponentTree.A04(r2, r3, r12, r5, r6, r7, 0, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0030, code lost:
        monitor-enter(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0033, code lost:
        if (r3 != r10.A01) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003b, code lost:
        if (r2 != r10.A04.Apd()) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003d, code lost:
        r10.A06 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0040, code lost:
        if (r12 == null) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0042, code lost:
        r10.A00 = r12.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0046, code lost:
        monitor-exit(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0047, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A07(X.2V1 r11, X.AnonymousClass2T3 r12, int r13, int r14) {
        /*
            r10 = this;
            monitor-enter(r10)
            X.7hq r0 = r10.A04     // Catch:{ all -> 0x004b }
            boolean r0 = r0.EFI()     // Catch:{ all -> 0x004b }
            if (r0 == 0) goto L_0x000b
            monitor-exit(r10)     // Catch:{ all -> 0x004b }
            return
        L_0x000b:
            r6 = r13
            r10.A08 = r13     // Catch:{ all -> 0x004b }
            r7 = r14
            r10.A07 = r14     // Catch:{ all -> 0x004b }
            r10.A00(r11)     // Catch:{ all -> 0x004b }
            com.facebook.litho.ComponentTree r3 = r10.A01     // Catch:{ all -> 0x004b }
            X.7hq r0 = r10.A04     // Catch:{ all -> 0x004b }
            X.3mp r2 = r0.Apd()     // Catch:{ all -> 0x004b }
            X.7hq r1 = r10.A04     // Catch:{ all -> 0x004b }
            boolean r0 = r1 instanceof X.C338407hu     // Catch:{ all -> 0x004b }
            if (r0 == 0) goto L_0x0028
            X.7hu r1 = (X.C338407hu) r1     // Catch:{ all -> 0x004b }
            X.2VJ r5 = r1.A00     // Catch:{ all -> 0x004b }
        L_0x0026:
            monitor-exit(r10)     // Catch:{ all -> 0x004b }
            goto L_0x002a
        L_0x0028:
            r5 = 0
            goto L_0x0026
        L_0x002a:
            r8 = 0
            r4 = r12
            r9 = r8
            com.facebook.litho.ComponentTree.A04(r2, r3, r4, r5, r6, r7, r8, r9)
            monitor-enter(r10)
            com.facebook.litho.ComponentTree r0 = r10.A01     // Catch:{ all -> 0x0048 }
            if (r3 != r0) goto L_0x0046
            X.7hq r0 = r10.A04     // Catch:{ all -> 0x0048 }
            X.3mp r0 = r0.Apd()     // Catch:{ all -> 0x0048 }
            if (r2 != r0) goto L_0x0046
            r0 = 1
            r10.A06 = r0     // Catch:{ all -> 0x0048 }
            if (r12 == 0) goto L_0x0046
            int r0 = r12.A00     // Catch:{ all -> 0x0048 }
            r10.A00 = r0     // Catch:{ all -> 0x0048 }
        L_0x0046:
            monitor-exit(r10)     // Catch:{ all -> 0x0048 }
            return
        L_0x0048:
            r0 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x0048 }
            throw r0
        L_0x004b:
            r0 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x004b }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C295015nP.A07(X.2V1, X.2T3, int, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0021, code lost:
        if (com.facebook.litho.ComponentTree.A0D(r3, r3.A06, r2, r1) != false) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0029, code lost:
        if (r0 != false) goto L_0x002b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean A08() {
        /*
            r4 = this;
            monitor-enter(r4)
            X.7hq r0 = r4.A04     // Catch:{ all -> 0x0030 }
            boolean r0 = r0.EFI()     // Catch:{ all -> 0x0030 }
            if (r0 != 0) goto L_0x002b
            com.facebook.litho.ComponentTree r3 = r4.A01     // Catch:{ all -> 0x0030 }
            if (r3 == 0) goto L_0x002e
            int r2 = r4.A08     // Catch:{ all -> 0x0030 }
            int r1 = r4.A07     // Catch:{ all -> 0x0030 }
            monitor-enter(r3)     // Catch:{ all -> 0x0030 }
            X.2T4 r0 = r3.A07     // Catch:{ all -> 0x0026 }
            boolean r0 = com.facebook.litho.ComponentTree.A0D(r3, r0, r2, r1)     // Catch:{ all -> 0x0026 }
            if (r0 != 0) goto L_0x0023
            X.2T4 r0 = r3.A06     // Catch:{ all -> 0x0026 }
            boolean r1 = com.facebook.litho.ComponentTree.A0D(r3, r0, r2, r1)     // Catch:{ all -> 0x0026 }
            r0 = 0
            if (r1 == 0) goto L_0x0024
        L_0x0023:
            r0 = 1
        L_0x0024:
            monitor-exit(r3)     // Catch:{ all -> 0x0030 }
            goto L_0x0029
        L_0x0026:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0030 }
            throw r0     // Catch:{ all -> 0x0030 }
        L_0x0029:
            if (r0 == 0) goto L_0x002e
        L_0x002b:
            r0 = 1
        L_0x002c:
            monitor-exit(r4)
            return r0
        L_0x002e:
            r0 = 0
            goto L_0x002c
        L_0x0030:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C295015nP.A08():boolean");
    }

    public final synchronized boolean A09() {
        return this.A06;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000e, code lost:
        if (r2.A07 != r4) goto L_0x0010;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean A0A(int r3, int r4) {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.A09()     // Catch:{ all -> 0x0013 }
            if (r0 == 0) goto L_0x0010
            int r0 = r2.A08     // Catch:{ all -> 0x0013 }
            if (r0 != r3) goto L_0x0010
            int r1 = r2.A07     // Catch:{ all -> 0x0013 }
            r0 = 1
            if (r1 == r4) goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            monitor-exit(r2)
            return r0
        L_0x0013:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C295015nP.A0A(int, int):boolean");
    }

    /* JADX WARNING: type inference failed for: r0v31, types: [X.7ht, java.lang.Object] */
    private void A00(2V1 r42) {
        AT0 at0;
        if (this.A01 == null) {
            if (this.A0C != null) {
                this.A0A = new XDO(this);
            }
            AnonymousClass3X6 A022 = ComponentTree.A02(this.A04.Apd(), r42, this.A0A);
            String BNt = this.A04.BNt();
            2Sa r3 = this.A0F;
            int i = 2Sa.DEFAULT_BACKGROUND_THREAD_PRIORITY;
            0qQ.A0B(r3, 0);
            2Sa A032 = 2Sa.A03(r3, (AnonymousClass3X7) null, (2Sd) null, (Integer) null, (Integer) null, -1, 15, false, false, false, false, false, false, false, false, false, false, false, false, false, false);
            boolean z = A032.A0P;
            AnonymousClass3X7 r40 = A032.A02;
            boolean z2 = A032.A0M;
            2Sd r26 = A032.A03;
            2Sf r25 = A032.A01;
            Integer num = A032.A05;
            boolean z3 = A032.A0X;
            String str = A032.A07;
            boolean z4 = A032.A00;
            boolean z5 = A032.A09;
            boolean z6 = A032.A0J;
            boolean z7 = A032.A0C;
            boolean z8 = A032.A0A;
            boolean z9 = A032.A0L;
            boolean z10 = A032.A0T;
            Integer num2 = A032.A06;
            boolean z11 = A032.A0E;
            boolean z12 = A032.A0G;
            0sP r10 = A032.A08;
            boolean z13 = A032.A0W;
            boolean z14 = A032.A0I;
            boolean z15 = A032.A0F;
            boolean z16 = A032.A0H;
            boolean z17 = A032.A0D;
            boolean z18 = A032.A0N;
            if (this.A04.BNt() != null) {
                str = BNt;
            }
            boolean z19 = z3;
            A022.A06 = AnonymousClass3XC.A00(r25, A032, r40, r26, num, num2, str, r10, z5, z8, z7, z17, z11, z15, z12, z16, z4, z14, z6, z9, z2, z18, z, z10, z13, z19);
            A022.A05 = this.A02;
            C338607iE r0 = this.A0G;
            if (r0 == null) {
                at0 = null;
            } else {
                at0 = new AT0(this, r0.A00);
            }
            A022.A02 = at0;
            C338397ht r02 = this.A09;
            C338397ht r03 = r02;
            if (r02 == null) {
                ? obj = new Object();
                this.A09 = obj;
                r03 = obj;
            }
            A022.A04 = r03;
            ComponentTree A002 = A022.A00();
            this.A01 = A002;
            this.A09.A00 = A002;
            C338207ha r04 = this.A03;
            if (r04 != null) {
                A002.A0i = r04;
            }
        }
    }
}
