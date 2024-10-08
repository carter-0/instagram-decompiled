package X;

import androidx.compose.runtime.snapshots.Snapshot;
import java.util.List;

/* renamed from: X.5PD  reason: invalid class name */
public class AnonymousClass5PD extends Snapshot {
    public static final int[] A09 = new int[0];
    public int A00 = 1;
    public int A01;
    public AnonymousClass5P8 A02 = AnonymousClass5P8.A04;
    public boolean A03;
    public int[] A04 = A09;
    public 0vq A05;
    public List A06;
    public final 0sP A07;
    public final 0sP A08;

    public final AnonymousClass5PD A0J(0sP r14, 0sP r15) {
        C288395bq r7;
        0sP r6 = r15;
        if (this instanceof AnonymousClass5PC) {
            C377469Ly r2 = new C377469Ly(r14, r15, 7);
            int i = AnonymousClass5P3.A00;
            return (AnonymousClass5PD) ((Snapshot) AnonymousClass5P3.A0A(new AnonymousClass9L6(r2, 40)));
        } else if (this instanceof AnonymousClass5PF) {
            AnonymousClass5PF r4 = (AnonymousClass5PF) this;
            0sP A0C = AnonymousClass5P3.A0C(r14, r4.A00, true);
            0sP r22 = r4.A01;
            if (!(r22 == null || r15 == r22)) {
                r6 = new C377469Ly(r15, r22, 9);
            }
            boolean z = r4.A03;
            AnonymousClass5PD A002 = AnonymousClass5PF.A00(r4);
            if (!z) {
                return new AnonymousClass5PF(A002.A0J((0sP) null, r6), A0C, r6, false, true);
            }
            return A002.A0J(A0C, r6);
        } else {
            if (!(!this.A02)) {
                C18086VlG.A00("Cannot use a disposed snapshot");
            } else if (!this.A03 || this.A01 >= 0) {
                A0N(A01());
                Object obj = AnonymousClass5P3.A07;
                synchronized (obj) {
                    int i2 = AnonymousClass5P3.A00;
                    AnonymousClass5P3.A00 = i2 + 1;
                    AnonymousClass5P3.A01 = AnonymousClass5P3.A01.A01(i2);
                    AnonymousClass5P8 A042 = A04();
                    A0E(A042.A01(i2));
                    int A012 = A01();
                    while (true) {
                        A012++;
                        if (A012 >= i2) {
                            break;
                        }
                        A042 = A042.A01(A012);
                    }
                    0sP A0C2 = AnonymousClass5P3.A0C(r14, this.A07, true);
                    0sP A062 = A06();
                    if (!(A062 == null || r15 == A062)) {
                        r6 = new C377469Ly(r15, A062, 9);
                    }
                    r7 = new C288395bq(this, A042, A0C2, r6, i2);
                }
                if (!this.A03 && !this.A02) {
                    int A013 = A01();
                    synchronized (obj) {
                        int i3 = AnonymousClass5P3.A00;
                        AnonymousClass5P3.A00 = i3 + 1;
                        this.A00 = i3;
                        AnonymousClass5P3.A01 = AnonymousClass5P3.A01.A01(A01());
                    }
                    AnonymousClass5P8 A043 = A04();
                    int A014 = A01();
                    for (int i4 = A013 + 1; i4 < A014; i4++) {
                        A043 = A043.A01(i4);
                    }
                    A0E(A043);
                }
                return r7;
            } else {
                C18086VlG.A01("Unsupported operation on a disposed or applied snapshot");
            }
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public final void A09() {
        for (int A0F : this.A04) {
            AnonymousClass5P3.A0F(A0F);
        }
        super.A09();
    }

    public void A0H() {
        if (!this.A02) {
            super.A0H();
            A0D(this);
        }
    }

    public final 0vq A0I() {
        if (this instanceof AnonymousClass5PF) {
            return AnonymousClass5PF.A00((AnonymousClass5PF) this).A0I();
        }
        return this.A05;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x01bc, code lost:
        monitor-enter(r25);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:?, code lost:
        A09();
        X.AnonymousClass5P3.A0D();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x01d0, code lost:
        if (r3 == null) goto L_0x0213;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x01d2, code lost:
        r10 = r3.A03;
        r7 = r3.A02;
        r6 = r7.length - 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x01d9, code lost:
        if (r6 < 0) goto L_0x0213;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x01db, code lost:
        r5 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x01dc, code lost:
        r16 = r7[r5];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x01e8, code lost:
        if (((r16 & ((r16 ^ -1) << 7)) & -9187201950435737472L) == -9187201950435737472L) goto L_0x020e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x01ea, code lost:
        r4 = 8 - (((r5 - r6) ^ -1) >>> 31);
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x01f3, code lost:
        if (r3 >= r4) goto L_0x020c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x01fb, code lost:
        if ((r16 & 255) >= 128) goto L_0x0207;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x01fd, code lost:
        X.AnonymousClass5P3.A0I((X.C284925Ox) r10[(r5 << 3) + r3]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0207, code lost:
        r16 = r16 >> 8;
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x020c, code lost:
        if (r4 != 8) goto L_0x0213;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x020e, code lost:
        if (r5 == r6) goto L_0x0213;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0210, code lost:
        r5 = r5 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0213, code lost:
        if (r11 == null) goto L_0x0254;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0215, code lost:
        r12 = r11.A03;
        r11 = r11.A02;
        r10 = r11.length - 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x021c, code lost:
        if (r10 < 0) goto L_0x0254;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x021e, code lost:
        r7 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x021f, code lost:
        r14 = r11[r7];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x022a, code lost:
        if (((((r14 ^ -1) << 7) & r14) & -9187201950435737472L) == -9187201950435737472L) goto L_0x024f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x022c, code lost:
        r6 = 8 - (((r7 - r10) ^ -1) >>> 31);
        r5 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0235, code lost:
        if (r5 >= r6) goto L_0x024d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x023d, code lost:
        if ((r14 & 255) >= 128) goto L_0x0249;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x023f, code lost:
        X.AnonymousClass5P3.A0I((X.C284925Ox) r12[(r7 << 3) + r5]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0249, code lost:
        r14 = r14 >> 8;
        r5 = r5 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x024d, code lost:
        if (r6 != 8) goto L_0x0254;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x024f, code lost:
        if (r7 == r10) goto L_0x0254;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x0251, code lost:
        r7 = r7 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0254, code lost:
        r3 = r9.A06;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x0256, code lost:
        if (r3 == null) goto L_0x026b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x0258, code lost:
        r2 = r3.size();
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x025d, code lost:
        if (r1 >= r2) goto L_0x026b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x025f, code lost:
        X.AnonymousClass5P3.A0I((X.C284925Ox) r3.get(r1));
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x026b, code lost:
        r9.A06 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x026d, code lost:
        monitor-exit(r25);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00ca, code lost:
        r7.A03 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00cf, code lost:
        if (r7.A00 != false) goto L_0x026e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00d1, code lost:
        r7.A00 = true;
        r6.A0D(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0179, code lost:
        r9.A03 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x017c, code lost:
        if (r3 == null) goto L_0x019e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x017e, code lost:
        r4 = new X.C285135Pw(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0189, code lost:
        if ((!r4.isEmpty()) == false) goto L_0x019e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x018b, code lost:
        r2 = r5.size();
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0190, code lost:
        if (r1 >= r2) goto L_0x019e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0192, code lost:
        ((X.0sL) r5.get(r1)).invoke(r4, r9);
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x019e, code lost:
        if (r11 == null) goto L_0x01bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x01a2, code lost:
        if (r11.A01 == 0) goto L_0x01bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x01a4, code lost:
        r4 = new X.C285135Pw(r11);
        r2 = r5.size();
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x01ae, code lost:
        if (r1 >= r2) goto L_0x01bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x01b0, code lost:
        ((X.0sL) r5.get(r1)).invoke(r4, r9);
        r1 = r1 + 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C288415bs A0K() {
        /*
            r26 = this;
            r9 = r26
            boolean r0 = r9 instanceof X.AnonymousClass5PF
            if (r0 == 0) goto L_0x0012
            r0 = r9
            X.5PF r0 = (X.AnonymousClass5PF) r0
            X.5PD r0 = X.AnonymousClass5PF.A00(r0)
            X.5bs r1 = r0.A0K()
            return r1
        L_0x0012:
            boolean r0 = r9 instanceof X.C288395bq
            if (r0 == 0) goto L_0x00e3
            r7 = r9
            X.5bq r7 = (X.C288395bq) r7
            X.5PD r6 = r7.A01
            boolean r0 = r6.A03
            if (r0 != 0) goto L_0x00dd
            boolean r0 = r6.A02
            if (r0 != 0) goto L_0x00dd
            X.0vq r5 = r7.A0I()
            int r3 = r7.A01()
            r4 = 0
            if (r5 == 0) goto L_0x003a
            X.5P8 r0 = r6.A04()
            java.util.HashMap r2 = X.AnonymousClass5P3.A0B(r6, r7, r0)
        L_0x0036:
            java.lang.Object r8 = X.AnonymousClass5P3.A07
            monitor-enter(r8)
            goto L_0x003c
        L_0x003a:
            r2 = r4
            goto L_0x0036
        L_0x003c:
            X.AnonymousClass5P3.A0G(r7)     // Catch:{ all -> 0x00da }
            if (r5 == 0) goto L_0x005b
            int r0 = r5.A01     // Catch:{ all -> 0x00da }
            if (r0 == 0) goto L_0x005b
            int r1 = r6.A01()     // Catch:{ all -> 0x00da }
            X.5P8 r0 = r6.A04()     // Catch:{ all -> 0x00da }
            X.5bs r1 = r7.A0L(r0, r2, r1)     // Catch:{ all -> 0x00da }
            X.5br r0 = X.C288405br.A00     // Catch:{ all -> 0x00da }
            boolean r0 = X.0qQ.A0K(r1, r0)     // Catch:{ all -> 0x00da }
            if (r0 != 0) goto L_0x005f
            monitor-exit(r8)
            return r1
        L_0x005b:
            r7.A0A()     // Catch:{ all -> 0x00da }
            goto L_0x0068
        L_0x005f:
            X.0vq r0 = r6.A0I()     // Catch:{ all -> 0x00da }
            if (r0 == 0) goto L_0x008b
            r0.A07(r5)     // Catch:{ all -> 0x00da }
        L_0x0068:
            int r0 = r6.A01()     // Catch:{ all -> 0x00da }
            if (r0 >= r3) goto L_0x0071
            r6.A0M()     // Catch:{ all -> 0x00da }
        L_0x0071:
            X.5P8 r0 = r6.A04()     // Catch:{ all -> 0x00da }
            X.5P8 r1 = r0.A00(r3)     // Catch:{ all -> 0x00da }
            X.5P8 r0 = r7.A02     // Catch:{ all -> 0x00da }
            X.5P8 r0 = r1.A02(r0)     // Catch:{ all -> 0x00da }
            r6.A0E(r0)     // Catch:{ all -> 0x00da }
            r6.A0N(r3)     // Catch:{ all -> 0x00da }
            int r3 = r7.A01     // Catch:{ all -> 0x00da }
            r0 = -1
            r7.A01 = r0     // Catch:{ all -> 0x00da }
            goto L_0x0092
        L_0x008b:
            r6.A0O(r5)     // Catch:{ all -> 0x00da }
            r7.A0O(r4)     // Catch:{ all -> 0x00da }
            goto L_0x0068
        L_0x0092:
            if (r3 < 0) goto L_0x00a5
            int[] r2 = r6.A04     // Catch:{ all -> 0x00da }
            r0 = 0
            X.0qQ.A0B(r2, r0)     // Catch:{ all -> 0x00da }
            int r1 = r2.length     // Catch:{ all -> 0x00da }
            int r0 = r1 + 1
            int[] r0 = java.util.Arrays.copyOf(r2, r0)     // Catch:{ all -> 0x00da }
            r0[r1] = r3     // Catch:{ all -> 0x00da }
            r6.A04 = r0     // Catch:{ all -> 0x00da }
        L_0x00a5:
            X.5P8 r1 = r7.A02     // Catch:{ all -> 0x00da }
            X.5P8 r0 = r6.A02     // Catch:{ all -> 0x00d8 }
            X.5P8 r0 = r0.A03(r1)     // Catch:{ all -> 0x00d8 }
            r6.A02 = r0     // Catch:{ all -> 0x00d8 }
            int[] r5 = r7.A04     // Catch:{ all -> 0x00da }
            int r4 = r5.length     // Catch:{ all -> 0x00da }
            if (r4 == 0) goto L_0x00c9
            int[] r3 = r6.A04     // Catch:{ all -> 0x00da }
            int r2 = r3.length     // Catch:{ all -> 0x00da }
            if (r2 == 0) goto L_0x00c7
            r1 = 0
            int r0 = r2 + r4
            int[] r0 = java.util.Arrays.copyOf(r3, r0)     // Catch:{ all -> 0x00da }
            java.lang.System.arraycopy(r5, r1, r0, r2, r4)     // Catch:{ all -> 0x00da }
            X.0qQ.A0A(r0)     // Catch:{ all -> 0x00da }
            r5 = r0
        L_0x00c7:
            r6.A04 = r5     // Catch:{ all -> 0x00da }
        L_0x00c9:
            monitor-exit(r8)
            r1 = 1
            r7.A03 = r1
            boolean r0 = r7.A00
            if (r0 != 0) goto L_0x026e
            r7.A00 = r1
            r6.A0D(r7)
            goto L_0x026e
        L_0x00d8:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x00da }
        L_0x00da:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        L_0x00dd:
            X.5bt r1 = new X.5bt
            r1.<init>(r7)
            return r1
        L_0x00e3:
            boolean r0 = r9 instanceof X.AnonymousClass5PC
            if (r0 == 0) goto L_0x00ef
            java.lang.String r1 = "Cannot apply the global snapshot directly. Call Snapshot.advanceGlobalSnapshot"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x00ef:
            X.0vq r11 = r9.A0I()
            r8 = 0
            if (r11 == 0) goto L_0x0118
            java.util.concurrent.atomic.AtomicReference r0 = X.AnonymousClass5P3.A08
            java.lang.Object r2 = r0.get()
            X.5PD r2 = (X.AnonymousClass5PD) r2
            X.5P8 r1 = X.AnonymousClass5P3.A01
            java.lang.Object r0 = r0.get()
            androidx.compose.runtime.snapshots.Snapshot r0 = (androidx.compose.runtime.snapshots.Snapshot) r0
            int r0 = r0.A01()
            X.5P8 r0 = r1.A00(r0)
            java.util.HashMap r3 = X.AnonymousClass5P3.A0B(r2, r9, r0)
        L_0x0112:
            X.0sn r5 = X.0sn.A00
            java.lang.Object r25 = X.AnonymousClass5P3.A07
            monitor-enter(r25)
            goto L_0x011a
        L_0x0118:
            r3 = r8
            goto L_0x0112
        L_0x011a:
            X.AnonymousClass5P3.A0G(r9)     // Catch:{ all -> 0x0271 }
            if (r11 == 0) goto L_0x015a
            int r0 = r11.A01     // Catch:{ all -> 0x0271 }
            if (r0 == 0) goto L_0x015a
            java.util.concurrent.atomic.AtomicReference r0 = X.AnonymousClass5P3.A08     // Catch:{ all -> 0x0271 }
            java.lang.Object r4 = r0.get()     // Catch:{ all -> 0x0271 }
            X.5PC r4 = (X.AnonymousClass5PC) r4     // Catch:{ all -> 0x0271 }
            int r2 = X.AnonymousClass5P3.A00     // Catch:{ all -> 0x0271 }
            X.5P8 r1 = X.AnonymousClass5P3.A01     // Catch:{ all -> 0x0271 }
            int r0 = r4.A01()     // Catch:{ all -> 0x0271 }
            X.5P8 r0 = r1.A00(r0)     // Catch:{ all -> 0x0271 }
            X.5bs r1 = r9.A0L(r0, r3, r2)     // Catch:{ all -> 0x0271 }
            X.5br r0 = X.C288405br.A00     // Catch:{ all -> 0x0271 }
            boolean r0 = X.0qQ.A0K(r1, r0)     // Catch:{ all -> 0x0271 }
            if (r0 != 0) goto L_0x0145
            monitor-exit(r25)
            return r1
        L_0x0145:
            r9.A07()     // Catch:{ all -> 0x0271 }
            X.0sP r0 = X.AnonymousClass5P3.A09     // Catch:{ all -> 0x0271 }
            X.AnonymousClass5P3.A09(r4, r0)     // Catch:{ all -> 0x0271 }
            X.0vq r3 = r4.A0I()     // Catch:{ all -> 0x0271 }
            r9.A0O(r8)     // Catch:{ all -> 0x0271 }
            r4.A0O(r8)     // Catch:{ all -> 0x0271 }
            java.util.List r5 = X.AnonymousClass5P3.A02     // Catch:{ all -> 0x0271 }
            goto L_0x0178
        L_0x015a:
            r9.A07()     // Catch:{ all -> 0x0271 }
            java.util.concurrent.atomic.AtomicReference r0 = X.AnonymousClass5P3.A08     // Catch:{ all -> 0x0271 }
            java.lang.Object r1 = r0.get()     // Catch:{ all -> 0x0271 }
            X.5PC r1 = (X.AnonymousClass5PC) r1     // Catch:{ all -> 0x0271 }
            X.0sP r0 = X.AnonymousClass5P3.A09     // Catch:{ all -> 0x0271 }
            X.AnonymousClass5P3.A09(r1, r0)     // Catch:{ all -> 0x0271 }
            X.0vq r3 = r1.A0I()     // Catch:{ all -> 0x0271 }
            if (r3 == 0) goto L_0x0177
            int r0 = r3.A01     // Catch:{ all -> 0x0271 }
            if (r0 == 0) goto L_0x0177
            java.util.List r5 = X.AnonymousClass5P3.A02     // Catch:{ all -> 0x0271 }
            goto L_0x0178
        L_0x0177:
            r3 = r8
        L_0x0178:
            monitor-exit(r25)
            r0 = 1
            r9.A03 = r0
            if (r3 == 0) goto L_0x019e
            X.5Pw r4 = new X.5Pw
            r4.<init>(r3)
            boolean r0 = r4.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x019e
            int r2 = r5.size()
            r1 = 0
        L_0x0190:
            if (r1 >= r2) goto L_0x019e
            java.lang.Object r0 = r5.get(r1)
            X.0sL r0 = (X.0sL) r0
            r0.invoke(r4, r9)
            int r1 = r1 + 1
            goto L_0x0190
        L_0x019e:
            if (r11 == 0) goto L_0x01bc
            int r0 = r11.A01
            if (r0 == 0) goto L_0x01bc
            X.5Pw r4 = new X.5Pw
            r4.<init>(r11)
            int r2 = r5.size()
            r1 = 0
        L_0x01ae:
            if (r1 >= r2) goto L_0x01bc
            java.lang.Object r0 = r5.get(r1)
            X.0sL r0 = (X.0sL) r0
            r0.invoke(r4, r9)
            int r1 = r1 + 1
            goto L_0x01ae
        L_0x01bc:
            monitor-enter(r25)
            r9.A09()     // Catch:{ all -> 0x0271 }
            X.AnonymousClass5P3.A0D()     // Catch:{ all -> 0x0271 }
            r23 = 255(0xff, double:1.26E-321)
            r22 = 7
            r20 = -1
            r18 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            r13 = 8
            if (r3 == 0) goto L_0x0213
            java.lang.Object[] r10 = r3.A03     // Catch:{ all -> 0x0271 }
            long[] r7 = r3.A02     // Catch:{ all -> 0x0271 }
            int r0 = r7.length     // Catch:{ all -> 0x0271 }
            int r6 = r0 + -2
            if (r6 < 0) goto L_0x0213
            r5 = 0
        L_0x01dc:
            r16 = r7[r5]     // Catch:{ all -> 0x0271 }
            long r3 = r16 ^ r20
            long r3 = r3 << r22
            long r1 = r16 & r3
            long r1 = r1 & r18
            int r0 = (r1 > r18 ? 1 : (r1 == r18 ? 0 : -1))
            if (r0 == 0) goto L_0x020e
            int r0 = r5 - r6
            r0 = r0 ^ -1
            int r0 = r0 >>> 31
            int r4 = 8 - r0
            r3 = 0
        L_0x01f3:
            if (r3 >= r4) goto L_0x020c
            long r14 = r16 & r23
            r1 = 128(0x80, double:6.32E-322)
            int r0 = (r14 > r1 ? 1 : (r14 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0207
            int r0 = r5 << 3
            int r0 = r0 + r3
            r0 = r10[r0]     // Catch:{ all -> 0x0271 }
            X.5Ox r0 = (X.C284925Ox) r0     // Catch:{ all -> 0x0271 }
            X.AnonymousClass5P3.A0I(r0)     // Catch:{ all -> 0x0271 }
        L_0x0207:
            long r16 = r16 >> r13
            int r3 = r3 + 1
            goto L_0x01f3
        L_0x020c:
            if (r4 != r13) goto L_0x0213
        L_0x020e:
            if (r5 == r6) goto L_0x0213
            int r5 = r5 + 1
            goto L_0x01dc
        L_0x0213:
            if (r11 == 0) goto L_0x0254
            java.lang.Object[] r12 = r11.A03     // Catch:{ all -> 0x0271 }
            long[] r11 = r11.A02     // Catch:{ all -> 0x0271 }
            int r0 = r11.length     // Catch:{ all -> 0x0271 }
            int r10 = r0 + -2
            if (r10 < 0) goto L_0x0254
            r7 = 0
        L_0x021f:
            r14 = r11[r7]     // Catch:{ all -> 0x0271 }
            long r3 = r14 ^ r20
            long r3 = r3 << r22
            long r3 = r3 & r14
            long r3 = r3 & r18
            int r0 = (r3 > r18 ? 1 : (r3 == r18 ? 0 : -1))
            if (r0 == 0) goto L_0x024f
            int r0 = r7 - r10
            r0 = r0 ^ -1
            int r0 = r0 >>> 31
            int r6 = 8 - r0
            r5 = 0
        L_0x0235:
            if (r5 >= r6) goto L_0x024d
            long r3 = r14 & r23
            r1 = 128(0x80, double:6.32E-322)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0249
            int r0 = r7 << 3
            int r0 = r0 + r5
            r0 = r12[r0]     // Catch:{ all -> 0x0271 }
            X.5Ox r0 = (X.C284925Ox) r0     // Catch:{ all -> 0x0271 }
            X.AnonymousClass5P3.A0I(r0)     // Catch:{ all -> 0x0271 }
        L_0x0249:
            long r14 = r14 >> r13
            int r5 = r5 + 1
            goto L_0x0235
        L_0x024d:
            if (r6 != r13) goto L_0x0254
        L_0x024f:
            if (r7 == r10) goto L_0x0254
            int r7 = r7 + 1
            goto L_0x021f
        L_0x0254:
            java.util.List r3 = r9.A06     // Catch:{ all -> 0x0271 }
            if (r3 == 0) goto L_0x026b
            int r2 = r3.size()     // Catch:{ all -> 0x0271 }
            r1 = 0
        L_0x025d:
            if (r1 >= r2) goto L_0x026b
            java.lang.Object r0 = r3.get(r1)     // Catch:{ all -> 0x0271 }
            X.5Ox r0 = (X.C284925Ox) r0     // Catch:{ all -> 0x0271 }
            X.AnonymousClass5P3.A0I(r0)     // Catch:{ all -> 0x0271 }
            int r1 = r1 + 1
            goto L_0x025d
        L_0x026b:
            r9.A06 = r8     // Catch:{ all -> 0x0271 }
            monitor-exit(r25)
        L_0x026e:
            X.5br r1 = X.C288405br.A00
            return r1
        L_0x0271:
            r0 = move-exception
            monitor-exit(r25)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5PD.A0K():X.5bs");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0050, code lost:
        r4 = (X.C284925Ox) r10[(r7 << 3) + r5];
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C288415bs A0L(X.AnonymousClass5P8 r21, java.util.Map r22, int r23) {
        /*
            r20 = this;
            r12 = r20
            X.5P8 r1 = r12.A04()
            int r0 = r12.A01()
            X.5P8 r1 = r1.A01(r0)
            X.5P8 r0 = r12.A02
            X.5P8 r19 = r1.A03(r0)
            X.0vq r11 = r12.A0I()
            X.0qQ.A0A(r11)
            java.lang.Object[] r10 = r11.A03
            long[] r9 = r11.A02
            int r0 = r9.length
            int r8 = r0 + -2
            r3 = 0
            if (r8 < 0) goto L_0x014d
            r1 = r3
            r7 = 0
        L_0x0027:
            r17 = r9[r7]
            r13 = -1
            long r13 = r13 ^ r17
            r0 = 7
            long r13 = r13 << r0
            long r13 = r13 & r17
            r4 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r13 = r13 & r4
            int r0 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x00ef
            int r0 = r7 - r8
            r0 = r0 ^ -1
            int r0 = r0 >>> 31
            int r6 = 8 - r0
            r5 = 0
        L_0x0044:
            if (r5 >= r6) goto L_0x00eb
            r13 = 255(0xff, double:1.26E-321)
            long r15 = r17 & r13
            r13 = 128(0x80, double:6.32E-322)
            int r0 = (r15 > r13 ? 1 : (r15 == r13 ? 0 : -1))
            if (r0 >= 0) goto L_0x00c9
            int r0 = r7 << 3
            int r0 = r0 + r5
            r4 = r10[r0]
            X.5Ox r4 = (X.C284925Ox) r4
            X.5P2 r2 = r4.B6D()
            r13 = r21
            r0 = r23
            X.5P2 r14 = X.AnonymousClass5P3.A05(r13, r2, r0)
            if (r14 == 0) goto L_0x00c9
            int r13 = r12.A01()
            r0 = r19
            X.5P2 r13 = X.AnonymousClass5P3.A05(r0, r2, r13)
            if (r13 == 0) goto L_0x00c9
            int r15 = r13.A00
            r0 = 1
            if (r15 == r0) goto L_0x00c9
            boolean r0 = r14.equals(r13)
            if (r0 != 0) goto L_0x00c9
            int r15 = r12.A01()
            X.5P8 r0 = r12.A04()
            X.5P2 r0 = X.AnonymousClass5P3.A05(r0, r2, r15)
            if (r0 == 0) goto L_0x00f5
            r2 = r22
            if (r22 == 0) goto L_0x0094
            java.lang.Object r2 = r2.get(r14)
            if (r2 != 0) goto L_0x00a0
        L_0x0094:
            X.5P2 r2 = r4.CoB(r13, r14, r0)
            if (r2 != 0) goto L_0x00a0
            X.5bt r0 = new X.5bt
            r0.<init>(r12)
            return r0
        L_0x00a0:
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x00c9
            boolean r0 = r2.equals(r14)
            if (r0 == 0) goto L_0x00d1
            if (r3 != 0) goto L_0x00b3
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
        L_0x00b3:
            X.5P2 r2 = r14.A00()
            X.0eP r0 = new X.0eP
            r0.<init>(r4, r2)
            r3.add(r0)
            if (r1 != 0) goto L_0x00c6
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
        L_0x00c6:
            r1.add(r4)
        L_0x00c9:
            r0 = 8
            long r17 = r17 >> r0
            int r5 = r5 + 1
            goto L_0x0044
        L_0x00d1:
            if (r3 != 0) goto L_0x00d8
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
        L_0x00d8:
            boolean r0 = r2.equals(r13)
            if (r0 == 0) goto L_0x00e2
            X.5P2 r2 = r13.A00()
        L_0x00e2:
            X.0eP r0 = new X.0eP
            r0.<init>(r4, r2)
            r3.add(r0)
            goto L_0x00c9
        L_0x00eb:
            r0 = 8
            if (r6 != r0) goto L_0x00fd
        L_0x00ef:
            if (r7 == r8) goto L_0x00fd
            int r7 = r7 + 1
            goto L_0x0027
        L_0x00f5:
            X.AnonymousClass5P3.A0E()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x00fd:
            if (r3 == 0) goto L_0x0130
            r12.A0M()
            int r7 = r3.size()
            r6 = 0
        L_0x0107:
            if (r6 >= r7) goto L_0x0130
            java.lang.Object r0 = r3.get(r6)
            X.0eP r0 = (X.0eP) r0
            java.lang.Object r5 = r0.A00
            X.5Ox r5 = (X.C284925Ox) r5
            java.lang.Object r4 = r0.A01
            X.5P2 r4 = (X.AnonymousClass5P2) r4
            int r0 = r12.A01()
            r4.A00 = r0
            java.lang.Object r2 = X.AnonymousClass5P3.A07
            monitor-enter(r2)
            X.5P2 r0 = r5.B6D()     // Catch:{ all -> 0x012d }
            r4.A01 = r0     // Catch:{ all -> 0x012d }
            r5.E4K(r4)     // Catch:{ all -> 0x012d }
            monitor-exit(r2)
            int r6 = r6 + 1
            goto L_0x0107
        L_0x012d:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x0130:
            if (r1 == 0) goto L_0x014d
            int r3 = r1.size()
            r2 = 0
        L_0x0137:
            if (r2 >= r3) goto L_0x0143
            java.lang.Object r0 = r1.get(r2)
            r11.A0A(r0)
            int r2 = r2 + 1
            goto L_0x0137
        L_0x0143:
            java.util.List r0 = r12.A06
            if (r0 == 0) goto L_0x014b
            java.util.ArrayList r1 = X.00k.A0S(r1, r0)
        L_0x014b:
            r12.A06 = r1
        L_0x014d:
            X.5br r0 = X.C288405br.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5PD.A0L(X.5P8, java.util.Map, int):X.5bs");
    }

    public final void A0N(int i) {
        synchronized (AnonymousClass5P3.A07) {
            this.A02 = this.A02.A01(i);
        }
    }

    public final void A0O(0vq r2) {
        if (this instanceof AnonymousClass5PF) {
            C21524Xds.A00();
            throw AnonymousClass00P.createAndThrow();
        } else {
            this.A05 = r2;
        }
    }

    public AnonymousClass5PD(AnonymousClass5P8 r2, 0sP r3, 0sP r4, int i) {
        super(r2, i);
        this.A07 = r3;
        this.A08 = r4;
    }

    public final void A0M() {
        A0N(A01());
        if (!this.A03 && !this.A02) {
            int A012 = A01();
            synchronized (AnonymousClass5P3.A07) {
                int i = AnonymousClass5P3.A00;
                AnonymousClass5P3.A00 = i + 1;
                if (this instanceof AnonymousClass5PF) {
                    C21524Xds.A00();
                    throw AnonymousClass00P.createAndThrow();
                } else {
                    this.A00 = i;
                    AnonymousClass5P3.A01 = AnonymousClass5P3.A01.A01(A01());
                }
            }
            AnonymousClass5P8 A042 = A04();
            int A013 = A01();
            for (int i2 = A012 + 1; i2 < A013; i2++) {
                A042 = A042.A01(i2);
            }
            A0E(A042);
        }
    }
}
