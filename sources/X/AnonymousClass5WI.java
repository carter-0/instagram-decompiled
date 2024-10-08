package X;

import android.view.KeyEvent;
import java.util.Map;

/* renamed from: X.5WI  reason: invalid class name */
public abstract class AnonymousClass5WI extends C267944cV implements AnonymousClass5VD, AnonymousClass5Qr, AnonymousClass5WC, C267954cW, AnonymousClass5VE {
    public static final C288675cI A0H = new Object();
    public C287085Yy A00;
    public C56842IEp A01;
    public C287605aT A02;
    public C287605aT A03;
    public C56843IEq A04;
    public AnonymousClass6FQ A05;
    public C62320sa A06;
    public boolean A07;
    public long A08;
    public C267804cE A09;
    public C287625aV A0A;
    public String A0B;
    public boolean A0C;
    public final C288685cJ A0D = new C267794cD();
    public final C288695cK A0E;
    public final Object A0F;
    public final Map A0G;

    public final boolean BuF() {
        return true;
    }

    public final boolean DYc(KeyEvent keyEvent) {
        return false;
    }

    private final void A00() {
        C287085Yy r2;
        if (this.A09 == null && (r2 = this.A00) != null) {
            C287605aT r1 = this.A02;
            if (r1 == null) {
                r1 = new AnonymousClass5aS();
                this.A02 = r1;
            }
            this.A0E.A0J(r1);
            C287605aT r0 = this.A02;
            0qQ.A0A(r0);
            C267804cE AKt = r2.AKt(r0);
            A0H(AKt);
            this.A09 = AKt;
        }
    }

    public final void A0E() {
        if (!this.A0C) {
            A00();
        }
        if (this.A07) {
            A0H(this.A0D);
            A0H(this.A0E);
        }
    }

    public final boolean A0G() {
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003b, code lost:
        if (r2 != false) goto L_0x0018;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A0J(X.AnonymousClass6FR r11, X.AnonymousClass4D7 r12) {
        /*
            r10 = this;
            boolean r0 = r10 instanceof X.C288655cG
            r4 = r11
            r5 = r12
            if (r0 == 0) goto L_0x0040
            r3 = r10
            X.5cG r3 = (X.C288655cG) r3
            boolean r2 = r3.A07
            r1 = 0
            if (r2 == 0) goto L_0x003a
            X.0sa r0 = r3.A01
            if (r0 == 0) goto L_0x003a
            r0 = 6
            X.9L6 r6 = new X.9L6
            r6.<init>(r3, r0)
        L_0x0018:
            X.0sa r0 = r3.A02
            if (r0 == 0) goto L_0x003e
            r0 = 7
            X.9L6 r7 = new X.9L6
            r7.<init>(r3, r0)
        L_0x0022:
            r0 = 1
            X.9K6 r9 = new X.9K6
            r9.<init>(r3, r1, r0)
            r0 = 8
            X.9L6 r8 = new X.9L6
            r8.<init>(r3, r0)
            java.lang.Object r1 = androidx.compose.foundation.gestures.TapGestureDetectorKt.A03(r4, r5, r6, r7, r8, r9)
        L_0x0033:
            X.1Hj r0 = X.1Hj.A02
            if (r1 == r0) goto L_0x0039
            X.0gF r1 = X.C60340gF.A00
        L_0x0039:
            return r1
        L_0x003a:
            r6 = r1
            if (r2 == 0) goto L_0x003e
            goto L_0x0018
        L_0x003e:
            r7 = r1
            goto L_0x0022
        L_0x0040:
            r1 = 0
            r0 = 0
            X.9K6 r2 = new X.9K6
            r2.<init>(r10, r1, r0)
            r1 = 5
            X.9L6 r0 = new X.9L6
            r0.<init>(r10, r1)
            java.lang.Object r1 = androidx.compose.foundation.gestures.TapGestureDetectorKt.A04(r11, r12, r0, r2)
            goto L_0x0033
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5WI.A0J(X.6FR, X.4D7):java.lang.Object");
    }

    public final void A0K() {
        C287605aT r3 = this.A02;
        if (r3 != null) {
            C56843IEq iEq = this.A04;
            if (iEq != null) {
                ((AnonymousClass5aS) r3).A00.FIA(new C56846IEt(iEq));
            }
            C56842IEp iEp = this.A01;
            if (iEp != null) {
                ((AnonymousClass5aS) r3).A00.FIA(new C56845IEs(iEp));
            }
            for (C56843IEq iEt : this.A0G.values()) {
                ((AnonymousClass5aS) r3).A00.FIA(new C56846IEt(iEt));
            }
        }
        this.A04 = null;
        this.A01 = null;
        this.A0G.clear();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0061, code lost:
        if (r4.A00 == null) goto L_0x0063;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x006d, code lost:
        if (r4.A09 == null) goto L_0x006f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x006f, code lost:
        r0 = r4.A09;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0071, code lost:
        if (r0 != null) goto L_0x0083;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0073, code lost:
        if (r2 != false) goto L_0x007b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0075, code lost:
        r4.A09 = null;
        A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x007b, code lost:
        r4.A0E.A0J(r4.A02);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0082, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0083, code lost:
        A0I(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0087, code lost:
        if (r3 != false) goto L_0x006f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0L(X.C287085Yy r5, X.C287605aT r6, X.C287625aV r7, java.lang.String r8, X.C62320sa r9, boolean r10) {
        /*
            r4 = this;
            X.5aT r0 = r4.A03
            boolean r0 = X.0qQ.A0K(r0, r6)
            if (r0 != 0) goto L_0x0096
            r4.A0K()
            r4.A03 = r6
            r4.A02 = r6
            r3 = 1
        L_0x0010:
            X.5Yy r0 = r4.A00
            boolean r0 = X.0qQ.A0K(r0, r5)
            if (r0 != 0) goto L_0x001b
            r4.A00 = r5
            r3 = 1
        L_0x001b:
            boolean r0 = r4.A07
            if (r0 == r10) goto L_0x0034
            X.5cJ r0 = r4.A0D
            if (r10 == 0) goto L_0x008a
            r4.A0H(r0)
            X.5cK r0 = r4.A0E
            r4.A0H(r0)
        L_0x002b:
            X.5R6 r0 = X.AnonymousClass5WH.A02(r4)
            r0.A0M()
            r4.A07 = r10
        L_0x0034:
            java.lang.String r0 = r4.A0B
            boolean r0 = X.0qQ.A0K(r0, r8)
            if (r0 != 0) goto L_0x0045
            r4.A0B = r8
            X.5R6 r0 = X.AnonymousClass5WH.A02(r4)
            r0.A0M()
        L_0x0045:
            X.5aV r0 = r4.A0A
            boolean r0 = X.0qQ.A0K(r0, r7)
            if (r0 != 0) goto L_0x0056
            r4.A0A = r7
            X.5R6 r0 = X.AnonymousClass5WH.A02(r4)
            r0.A0M()
        L_0x0056:
            r4.A06 = r9
            boolean r2 = r4.A0C
            X.5aT r0 = r4.A03
            if (r0 != 0) goto L_0x0063
            X.5Yy r1 = r4.A00
            r0 = 1
            if (r1 != 0) goto L_0x0064
        L_0x0063:
            r0 = 0
        L_0x0064:
            if (r2 == r0) goto L_0x0087
            r4.A0C = r0
            r2 = r0
            if (r0 != 0) goto L_0x0087
            X.4cE r0 = r4.A09
            if (r0 != 0) goto L_0x0087
        L_0x006f:
            X.4cE r0 = r4.A09
            if (r0 != 0) goto L_0x0083
            if (r2 != 0) goto L_0x007b
        L_0x0075:
            r0 = 0
            r4.A09 = r0
            r4.A00()
        L_0x007b:
            X.5cK r1 = r4.A0E
            X.5aT r0 = r4.A02
            r1.A0J(r0)
            return
        L_0x0083:
            r4.A0I(r0)
            goto L_0x0075
        L_0x0087:
            if (r3 == 0) goto L_0x007b
            goto L_0x006f
        L_0x008a:
            r4.A0I(r0)
            X.5cK r0 = r4.A0E
            r4.A0I(r0)
            r4.A0K()
            goto L_0x002b
        L_0x0096:
            r3 = 0
            goto L_0x0010
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5WI.A0L(X.5Yy, X.5aT, X.5aV, java.lang.String, X.0sa, boolean):void");
    }

    public void A0M(AnonymousClass5SW r5) {
        if (this instanceof C288655cG) {
            C288655cG r1 = (C288655cG) this;
            if (r1.A02 != null) {
                r5.ENH(C290125en.A0C, new C290145ep(r1.A00, new AnonymousClass9L8(r1, 3)));
            }
        }
    }

    public final void AC5(AnonymousClass5SW r4) {
        C287625aV r0 = this.A0A;
        if (r0 != null) {
            C285645Sc.A02(r4, r0.A00);
        }
        C285645Sc.A04(r4, this.A0B, new AnonymousClass9L8(this, 2));
        if (this.A07) {
            this.A0E.AC5(r4);
        } else {
            r4.ENH(AnonymousClass5SZ.A03, C60340gF.A00);
        }
        A0M(r4);
    }

    public final /* synthetic */ boolean Bu0() {
        return false;
    }

    public final Object C9j() {
        return this.A0F;
    }

    public final /* synthetic */ boolean CNf() {
        return false;
    }

    /* renamed from: D0Z */
    public final void Dyp() {
        C56842IEp iEp;
        C287605aT r2 = this.A02;
        if (!(r2 == null || (iEp = this.A01) == null)) {
            ((AnonymousClass5aS) r2).A00.FIA(new C56845IEs(iEp));
        }
        this.A01 = null;
        AnonymousClass6FQ r0 = this.A05;
        if (r0 != null) {
            r0.D0Z();
        }
    }

    public final void DXw(C304926Ft r8, GWN gwn, long j) {
        C262224Cq A052;
        int i;
        long j2 = (((j << 32) >> 33) & 4294967295L) | ((j >> 33) << 32);
        this.A08 = C289325dP.A00((float) ((int) (j2 >> 32)), (float) ((int) (j2 & 4294967295L)));
        A00();
        if (this.A07 && gwn == GWN.Main) {
            int i2 = r8.A00;
            if (i2 == 4) {
                A052 = A05();
                i = 0;
            } else if (i2 == 5) {
                A052 = A05();
                i = 1;
            }
            C376879Jr r2 = new C376879Jr(this, (AnonymousClass4D7) null, i);
            1Eo.A03(AnonymousClass05K.A00, 19B.A00, r2, A052);
        }
        AnonymousClass6FQ r0 = this.A05;
        if (r0 == null) {
            AnonymousClass9K3 r1 = new AnonymousClass9K3(this, (AnonymousClass4D7) null, 2);
            C304926Ft r02 = C304916Fs.A00;
            r0 = new AnonymousClass6FP((Object) null, (Object) null, r1);
            A0H(r0);
            this.A05 = r0;
        }
        r0.DXw(r8, gwn, j);
    }

    public final /* synthetic */ boolean Era() {
        return false;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.4cD, X.5cJ] */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0031, code lost:
        if (r2.A00 == null) goto L_0x0033;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass5WI(X.C287085Yy r3, X.C287605aT r4, X.C287625aV r5, java.lang.String r6, X.C62320sa r7, boolean r8) {
        /*
            r2 = this;
            r2.<init>()
            r2.A02 = r4
            r2.A00 = r3
            r2.A0B = r6
            r2.A0A = r5
            r2.A07 = r8
            r2.A06 = r7
            X.5cJ r0 = new X.5cJ
            r0.<init>()
            r2.A0D = r0
            X.5cK r0 = new X.5cK
            r0.<init>(r4)
            r2.A0E = r0
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r2.A0G = r0
            r0 = 0
            r2.A08 = r0
            X.5aT r0 = r2.A02
            r2.A03 = r0
            if (r0 != 0) goto L_0x0033
            X.5Yy r1 = r2.A00
            r0 = 1
            if (r1 != 0) goto L_0x0034
        L_0x0033:
            r0 = 0
        L_0x0034:
            r2.A0C = r0
            X.5cI r0 = A0H
            r2.A0F = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5WI.<init>(X.5Yy, X.5aT, X.5aV, java.lang.String, X.0sa, boolean):void");
    }

    public final void A0F() {
        A0K();
        if (this.A03 == null) {
            this.A02 = null;
        }
        C267804cE r0 = this.A09;
        if (r0 != null) {
            A0I(r0);
        }
        this.A09 = null;
    }

    public final void DGD(C288915ch r2) {
        if (r2.CTr()) {
            A00();
        }
        if (this.A07) {
            this.A0E.DGD(r2);
        }
    }

    public final boolean DMm(KeyEvent keyEvent) {
        int keyCode;
        int keyCode2;
        A00();
        if (this.A07) {
            long j = C55289HfI.A00;
            if (HRR.A00(keyEvent) == 2 && ((keyCode2 = (int) ((((long) keyEvent.getKeyCode()) << 32) >> 32)) == 23 || keyCode2 == 66 || keyCode2 == 160)) {
                Map map = this.A0G;
                if (!map.containsKey(new AE0(((long) keyEvent.getKeyCode()) << 32))) {
                    Object obj = new Object();
                    map.put(new AE0(((long) keyEvent.getKeyCode()) << 32), obj);
                    if (this.A02 == null) {
                        return true;
                    }
                    C262224Cq A052 = A05();
                    1Eo.A05(19B.A00, new MH2((Object) this, obj, (AnonymousClass4D7) null, 0), A052);
                    return true;
                }
                return false;
            }
        }
        if (this.A07) {
            long j2 = C55289HfI.A00;
            if (HRR.A00(keyEvent) == 1 && ((keyCode = (int) ((((long) keyEvent.getKeyCode()) << 32) >> 32)) == 23 || keyCode == 66 || keyCode == 160)) {
                Object remove = this.A0G.remove(new AE0(((long) keyEvent.getKeyCode()) << 32));
                if (!(remove == null || this.A02 == null)) {
                    C262224Cq A053 = A05();
                    1Eo.A05(19B.A00, new MH2((Object) this, remove, (AnonymousClass4D7) null, 1), A053);
                }
                this.A06.invoke();
                return true;
            }
        }
        return false;
    }
}
