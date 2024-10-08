package X;

import android.opengl.GLES30;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: X.ATg  reason: case insensitive filesystem */
public final class C40140ATg implements C344747sM, C344777sP, B3U {
    public C368028rx A00;
    public C344767sO A01;
    public C344567s4 A02;
    public C344697sH A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public boolean A0B;
    public final C344407ro A0C;
    public final A93 A0D = new A93(this);
    public final Map A0E = AnonymousClass7TE.A1E();
    public final Map A0F = new TreeMap(new C41283ArO(2));
    public final C345087su[] A0G = new C345087su[2];

    public final /* synthetic */ C345137sz EEw(C345137sz r1, C345097sv r2, C344697sH r3, Long l) {
        return r1;
    }

    public final void FLA(int i, int i2, int i3, boolean z, int i4, int i5) {
        int i6;
        boolean z2;
        int i7 = i2;
        this.A08 = i2;
        int i8 = i3;
        this.A07 = i3;
        int i9 = i4;
        this.A0A = i4;
        int i10 = i5;
        this.A09 = i5;
        this.A0B = true;
        Iterator A0v = AnonymousClass7TF.A0v(this.A0F);
        while (true) {
            i6 = i;
            z2 = z;
            if (!A0v.hasNext()) {
                break;
            }
            ((C344737sL) A0v.next()).FLA(i6, i7, i8, z2, i9, i10);
        }
        C344767sO r2 = this.A01;
        if (r2 != null) {
            r2.FLA(i6, i7, i8, z2, i9, i10);
        }
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [X.Av8, java.lang.RuntimeException] */
    private C345137sz A00(C345137sz r6, C344737sL r7, C344697sH r8, Long l, boolean z) {
        C345097sv r3;
        try {
            C349257zq.A03("CompositeMediaGraph.renderMediaGraph");
            if (r6 == null) {
                r6 = (C345137sz) r8.BHP(r7.Avq());
            }
            if (!z || r8.B9Q(0) != 1) {
                r3 = null;
            } else {
                List B9R = r8.B9R(0);
                synchronized (B9R) {
                    r3 = (C345097sv) B9R.get(0);
                }
                if (r3 != null) {
                    A93 a93 = this.A0D;
                    a93.A00 = r6.C7X();
                    r3.EeR(a93);
                }
            }
            r6 = r7.EEw(r6, r3, r8, l);
            if (z && r3 != null) {
                r3.EeR((A93) null);
            }
        } catch (Throwable th) {
            try {
                this.A02.A05(new RuntimeException("CompositeMediaGraph.renderMediaGraph() failed.", th));
            } catch (Throwable th2) {
                C349257zq.A01();
                throw th2;
            }
        }
        C349257zq.A01();
        return r6;
    }

    public final void A01(C391129sO r9, C344737sL r10) {
        C344737sL r1 = r10;
        this.A0F.put(r9, r10);
        if (this.A0B) {
            r1.FLA(0, this.A08, this.A07, false, this.A0A, this.A09);
        }
    }

    public final void A8F(C40191AVf aVf) {
        C344737sL r3 = aVf.A01;
        r3.FLA(0, this.A08, this.A07, false, this.A0A, this.A09);
        C391129sO r2 = aVf.A00;
        C391129sO r1 = C391129sO.LAYOUT;
        Map map = this.A0F;
        if (r2 != r1) {
            map.put(r2, r3);
        } else {
            map.put(r1, r3);
        }
    }

    public final void ACn(C345897uG r3) {
        Iterator A0v = AnonymousClass7TF.A0v(this.A0F);
        while (A0v.hasNext()) {
            ((C344747sM) A0v.next()).ACn(r3);
        }
        C344767sO r0 = this.A01;
        if (r0 != null) {
            r0.ACn(r3);
        }
    }

    public final int AlC() {
        boolean A1V = AnonymousClass7TF.A1V(this.A01);
        Iterator A0v = AnonymousClass7TF.A0v(this.A0F);
        while (A0v.hasNext()) {
            A1V |= ((C344737sL) A0v.next()).AlC();
        }
        return A1V ? 1 : 0;
    }

    public final /* synthetic */ int Avq() {
        return 0;
    }

    public final boolean CKm() {
        Iterator A0v = AnonymousClass7TF.A0v(this.A0F);
        while (A0v.hasNext()) {
            if (((C344737sL) A0v.next()).CKm()) {
                return true;
            }
        }
        C344767sO r0 = this.A01;
        if (r0 == null || !r0.CKm()) {
            return false;
        }
        return true;
    }

    public final void CMa(C344567s4 r3) {
        this.A02 = r3;
        Iterator A0v = AnonymousClass7TF.A0v(this.A0F);
        while (A0v.hasNext()) {
            ((C344747sM) A0v.next()).CMa(r3);
        }
        C344767sO r0 = this.A01;
        if (r0 != null) {
            r0.CMa(r3);
        }
    }

    public final /* synthetic */ boolean Cag() {
        return false;
    }

    public final void E4d(C344907sc r2, C345237tA r3) {
        C344767sO r0 = this.A01;
        if (r0 != null) {
            C344767sO.A05(r0, r2, r3);
        }
    }

    public final void EDX(C40191AVf aVf) {
        this.A0F.remove(aVf.A00);
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [X.Av8, java.lang.RuntimeException] */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00f4, code lost:
        if (r15.A03 != null) goto L_0x00f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0102, code lost:
        if (r7.size() != r15.A0E.size()) goto L_0x0104;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void EEx(X.C344697sH r23, java.lang.Long r24) {
        /*
            r22 = this;
            r3 = r23
            r15 = r22
            java.lang.String r0 = "CompositeMediaGraph.render"
            X.C349257zq.A03(r0)     // Catch:{ all -> 0x0258 }
            X.8rx r0 = r15.A00     // Catch:{ all -> 0x0258 }
            r6 = 0
            if (r0 == 0) goto L_0x001f
            java.lang.Object r0 = r3.BHP(r6)     // Catch:{ all -> 0x0258 }
            X.7sz r0 = (X.C345137sz) r0     // Catch:{ all -> 0x0258 }
            X.7v0 r1 = r0.getTexture()     // Catch:{ all -> 0x0258 }
            if (r1 == 0) goto L_0x001f
            X.8rx r0 = r15.A00     // Catch:{ all -> 0x0258 }
            r0.A00(r1)     // Catch:{ all -> 0x0258 }
        L_0x001f:
            boolean r0 = r15.A05     // Catch:{ all -> 0x0258 }
            r4 = r24
            if (r0 != 0) goto L_0x0035
            X.7s4 r0 = r15.A02     // Catch:{ all -> 0x0258 }
            X.7uG r0 = r0.A0E     // Catch:{ all -> 0x0258 }
            if (r0 == 0) goto L_0x00ea
            X.7uN r0 = r0.Blv()     // Catch:{ all -> 0x0258 }
            boolean r0 = r0.A02()     // Catch:{ all -> 0x0258 }
            if (r0 == 0) goto L_0x00ea
        L_0x0035:
            r2 = 0
            java.util.Map r7 = r15.A0F     // Catch:{ all -> 0x0258 }
            java.util.Iterator r1 = X.AnonymousClass7TF.A0v(r7)     // Catch:{ all -> 0x0258 }
            r5 = 0
        L_0x003d:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0258 }
            if (r0 == 0) goto L_0x0054
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x0258 }
            X.7sL r0 = (X.C344737sL) r0     // Catch:{ all -> 0x0258 }
            if (r0 == 0) goto L_0x003d
            boolean r0 = r0.CKm()     // Catch:{ all -> 0x0258 }
            if (r0 == 0) goto L_0x003d
            int r5 = r5 + 1
            goto L_0x003d
        L_0x0054:
            X.7sO r0 = r15.A01     // Catch:{ all -> 0x0258 }
            if (r0 == 0) goto L_0x0060
            boolean r0 = r0.CKm()     // Catch:{ all -> 0x0258 }
            if (r0 == 0) goto L_0x0060
            int r5 = r5 + 1
        L_0x0060:
            java.util.Iterator r14 = X.AnonymousClass7TF.A0v(r7)     // Catch:{ all -> 0x0258 }
            r1 = 1
            r9 = 0
            r13 = 1
        L_0x0067:
            boolean r0 = r14.hasNext()     // Catch:{ all -> 0x0258 }
            if (r0 == 0) goto L_0x00b9
            java.lang.Object r12 = r14.next()     // Catch:{ all -> 0x0258 }
            X.7sL r12 = (X.C344737sL) r12     // Catch:{ all -> 0x0258 }
            if (r12 == 0) goto L_0x0067
            boolean r0 = r12.CKm()     // Catch:{ all -> 0x0258 }
            if (r0 == 0) goto L_0x0067
            int r9 = r9 + 1
            boolean r20 = X.AnonymousClass7TF.A1S(r9, r5)
            boolean r0 = r15.A06     // Catch:{ all -> 0x0258 }
            if (r0 == 0) goto L_0x009d
            if (r2 != 0) goto L_0x009d
            int r0 = r12.Avq()     // Catch:{ all -> 0x0258 }
            java.lang.Object r2 = r3.BHP(r0)     // Catch:{ all -> 0x0258 }
            X.7sz r2 = (X.C345137sz) r2     // Catch:{ all -> 0x0258 }
            long r10 = r2.C7X()     // Catch:{ all -> 0x0258 }
            r7 = 0
            int r0 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r0 != 0) goto L_0x009d
            goto L_0x0265
        L_0x009d:
            r18 = r3
            r19 = r4
            r16 = r2
            r17 = r12
            X.7sz r2 = r15.A00(r16, r17, r18, r19, r20)     // Catch:{ all -> 0x0258 }
            if (r20 == 0) goto L_0x0067
            boolean r0 = r12.Cag()     // Catch:{ all -> 0x0258 }
            if (r0 == 0) goto L_0x0067
            int r0 = r3.B9Q(r6)     // Catch:{ all -> 0x0258 }
            if (r0 != r1) goto L_0x0067
            r13 = 0
            goto L_0x0067
        L_0x00b9:
            if (r2 != 0) goto L_0x00c1
            java.lang.Object r2 = r3.BHP(r6)     // Catch:{ all -> 0x0258 }
            X.7sz r2 = (X.C345137sz) r2     // Catch:{ all -> 0x0258 }
        L_0x00c1:
            X.7sO r0 = r15.A01     // Catch:{ all -> 0x0258 }
            if (r0 == 0) goto L_0x00dc
            boolean r0 = r0.CKm()     // Catch:{ all -> 0x0258 }
            if (r0 == 0) goto L_0x00dc
            int r0 = r9 + 1
            if (r0 == r5) goto L_0x00d0
            r1 = 0
        L_0x00d0:
            X.7sO r0 = r15.A01     // Catch:{ all -> 0x0258 }
            r5 = r15
            r6 = r2
            r7 = r0
            r8 = r3
            r9 = r4
            r10 = r1
            X.7sz r2 = r5.A00(r6, r7, r8, r9, r10)     // Catch:{ all -> 0x0258 }
        L_0x00dc:
            if (r13 == 0) goto L_0x0265
            if (r2 == 0) goto L_0x0265
            X.7sG r3 = (X.C344687sG) r3     // Catch:{ all -> 0x0258 }
            X.7sJ r1 = r3.A07     // Catch:{ all -> 0x0258 }
            r0 = 0
            r1.A01(r2, r0)     // Catch:{ all -> 0x0258 }
            goto L_0x0265
        L_0x00ea:
            boolean r0 = r15.A04     // Catch:{ all -> 0x0258 }
            if (r0 == 0) goto L_0x010c
            X.7sO r0 = r15.A01     // Catch:{ all -> 0x0258 }
            if (r0 == 0) goto L_0x0115
            X.7sH r0 = r15.A03     // Catch:{ all -> 0x0258 }
            if (r0 == 0) goto L_0x0104
        L_0x00f6:
            java.util.Map r7 = r15.A0F     // Catch:{ all -> 0x0258 }
            int r1 = r7.size()     // Catch:{ all -> 0x0258 }
            java.util.Map r0 = r15.A0E     // Catch:{ all -> 0x0258 }
            int r0 = r0.size()     // Catch:{ all -> 0x0258 }
            if (r1 == r0) goto L_0x0224
        L_0x0104:
            java.util.Map r0 = r15.A0E     // Catch:{ all -> 0x0258 }
            r0.clear()     // Catch:{ all -> 0x0258 }
            r0 = 0
            r15.A03 = r0     // Catch:{ all -> 0x0258 }
        L_0x010c:
            java.util.Map r7 = r15.A0F     // Catch:{ all -> 0x0258 }
            int r9 = r7.size()     // Catch:{ all -> 0x0258 }
            X.7sO r1 = r15.A01     // Catch:{ all -> 0x0258 }
            goto L_0x011a
        L_0x0115:
            X.7sH r0 = r15.A03     // Catch:{ all -> 0x0258 }
            if (r0 != 0) goto L_0x0104
            goto L_0x00f6
        L_0x011a:
            boolean r0 = X.AnonymousClass7TF.A1V(r1)
            int r9 = r9 + r0
            r5 = 1
            if (r9 != r5) goto L_0x013e
            if (r1 == 0) goto L_0x0126
            goto L_0x0220
        L_0x0126:
            java.util.Iterator r2 = X.AnonymousClass7TF.A0u(r7)     // Catch:{ all -> 0x0258 }
        L_0x012a:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x0258 }
            if (r0 == 0) goto L_0x0222
            java.util.Map$Entry r0 = X.AnonymousClass7TE.A1J(r2)     // Catch:{ all -> 0x0258 }
            java.util.Map r1 = r15.A0E     // Catch:{ all -> 0x0258 }
            java.lang.Object r0 = r0.getKey()     // Catch:{ all -> 0x0258 }
            r1.put(r0, r3)     // Catch:{ all -> 0x0258 }
            goto L_0x012a
        L_0x013e:
            java.lang.Object r1 = r3.BHP(r6)     // Catch:{ all -> 0x0258 }
            X.7sz r1 = (X.C345137sz) r1     // Catch:{ all -> 0x0258 }
            X.7ss r0 = r1.CFP()     // Catch:{ all -> 0x0258 }
            r0.getClass()     // Catch:{ all -> 0x0258 }
            int r13 = r0.A01     // Catch:{ all -> 0x0258 }
            int r12 = r0.A00     // Catch:{ all -> 0x0258 }
            int r11 = r1.Awt()     // Catch:{ all -> 0x0258 }
            r10 = 0
        L_0x0154:
            int r0 = r9 + -1
            r8 = 2
            if (r10 >= r0) goto L_0x017a
            if (r10 >= r8) goto L_0x017a
            X.7su[] r14 = r15.A0G     // Catch:{ all -> 0x0258 }
            r0 = r14[r10]     // Catch:{ all -> 0x0258 }
            if (r0 != 0) goto L_0x0177
            X.7ro r8 = r15.A0C     // Catch:{ all -> 0x0258 }
            X.7sq r2 = new X.7sq     // Catch:{ all -> 0x0258 }
            r2.<init>()     // Catch:{ all -> 0x0258 }
            X.7st r1 = new X.7st     // Catch:{ all -> 0x0258 }
            r1.<init>()     // Catch:{ all -> 0x0258 }
            X.7su r0 = new X.7su     // Catch:{ all -> 0x0258 }
            r0.<init>(r8, r2, r1, r6)     // Catch:{ all -> 0x0258 }
            r0.A03(r13, r12, r11)     // Catch:{ all -> 0x0258 }
            r14[r10] = r0     // Catch:{ all -> 0x0258 }
        L_0x0177:
            int r10 = r10 + 1
            goto L_0x0154
        L_0x017a:
            java.util.Set r0 = r7.keySet()     // Catch:{ all -> 0x0258 }
            java.util.ArrayList r11 = X.AnonymousClass7TE.A1D(r0)     // Catch:{ all -> 0x0258 }
            r10 = 0
        L_0x0183:
            int r0 = r11.size()     // Catch:{ all -> 0x0258 }
            if (r10 >= r0) goto L_0x01fe
            if (r10 != 0) goto L_0x018c
            goto L_0x01e7
        L_0x018c:
            int r0 = r11.size()     // Catch:{ all -> 0x0258 }
            int r0 = r0 - r5
            if (r10 != r0) goto L_0x01bb
            X.7sO r0 = r15.A01     // Catch:{ all -> 0x0258 }
            if (r0 != 0) goto L_0x01bb
            X.7sG r2 = r3.BDv()     // Catch:{ all -> 0x0258 }
            X.7ro r12 = r15.A0C     // Catch:{ all -> 0x0258 }
            X.7su[] r1 = r15.A0G     // Catch:{ all -> 0x0258 }
            int r0 = r10 + -1
            int r0 = r0 % r8
            r0 = r1[r0]     // Catch:{ all -> 0x0258 }
            X.7sy r1 = r0.A0A     // Catch:{ all -> 0x0258 }
            r19 = 0
            X.7uu r0 = new X.7uu     // Catch:{ all -> 0x0258 }
            r16 = r0
            r17 = r12
            r18 = r1
            r20 = r5
            r21 = r6
            r16.<init>(r17, r18, r19, r20, r21)     // Catch:{ all -> 0x0258 }
            r2.EZt(r0, r6)     // Catch:{ all -> 0x0258 }
            goto L_0x01f2
        L_0x01bb:
            X.7ro r14 = r15.A0C     // Catch:{ all -> 0x0258 }
            X.7s4 r0 = r15.A02     // Catch:{ all -> 0x0258 }
            r13 = 0
            X.7sG r2 = new X.7sG     // Catch:{ all -> 0x0258 }
            r2.<init>(r14, r13, r0)     // Catch:{ all -> 0x0258 }
            X.7su[] r12 = r15.A0G     // Catch:{ all -> 0x0258 }
            int r0 = r10 + -1
            int r0 = r0 % r8
            r0 = r12[r0]     // Catch:{ all -> 0x0258 }
            X.7sy r1 = r0.A0A     // Catch:{ all -> 0x0258 }
            X.7uu r0 = new X.7uu     // Catch:{ all -> 0x0258 }
            r16 = r0
            r17 = r14
            r18 = r1
            r19 = r13
            r20 = r5
            r21 = r6
            r16.<init>(r17, r18, r19, r20, r21)     // Catch:{ all -> 0x0258 }
            r2.EZt(r0, r6)     // Catch:{ all -> 0x0258 }
            int r0 = r10 % 2
            r0 = r12[r0]     // Catch:{ all -> 0x0258 }
            goto L_0x01ef
        L_0x01e7:
            X.7sG r2 = r3.BDu()     // Catch:{ all -> 0x0258 }
            X.7su[] r0 = r15.A0G     // Catch:{ all -> 0x0258 }
            r0 = r0[r6]     // Catch:{ all -> 0x0258 }
        L_0x01ef:
            r2.A8c(r0, r6)     // Catch:{ all -> 0x0258 }
        L_0x01f2:
            java.util.Map r1 = r15.A0E     // Catch:{ all -> 0x0258 }
            java.lang.Object r0 = r11.get(r10)     // Catch:{ all -> 0x0258 }
            r1.put(r0, r2)     // Catch:{ all -> 0x0258 }
            int r10 = r10 + 1
            goto L_0x0183
        L_0x01fe:
            X.7sO r0 = r15.A01     // Catch:{ all -> 0x0258 }
            if (r0 == 0) goto L_0x0222
            X.7sG r3 = r3.BDv()     // Catch:{ all -> 0x0258 }
            r15.A03 = r3     // Catch:{ all -> 0x0258 }
            X.7ro r2 = r15.A0C     // Catch:{ all -> 0x0258 }
            X.7su[] r0 = r15.A0G     // Catch:{ all -> 0x0258 }
            int r9 = r9 % r8
            r0 = r0[r9]     // Catch:{ all -> 0x0258 }
            X.7sy r1 = r0.A0A     // Catch:{ all -> 0x0258 }
            r11 = 0
            X.7uu r0 = new X.7uu     // Catch:{ all -> 0x0258 }
            r8 = r0
            r9 = r2
            r10 = r1
            r12 = r5
            r13 = r6
            r8.<init>(r9, r10, r11, r12, r13)     // Catch:{ all -> 0x0258 }
            r3.EZt(r0, r6)     // Catch:{ all -> 0x0258 }
            goto L_0x0222
        L_0x0220:
            r15.A03 = r3     // Catch:{ all -> 0x0258 }
        L_0x0222:
            r15.A04 = r5     // Catch:{ all -> 0x0258 }
        L_0x0224:
            java.util.Iterator r3 = X.AnonymousClass7TF.A0u(r7)     // Catch:{ all -> 0x0258 }
        L_0x0228:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x0258 }
            if (r0 == 0) goto L_0x024b
            java.util.Map$Entry r0 = X.AnonymousClass7TE.A1J(r3)     // Catch:{ all -> 0x0258 }
            java.lang.Object r2 = r0.getValue()     // Catch:{ all -> 0x0258 }
            X.7sL r2 = (X.C344737sL) r2     // Catch:{ all -> 0x0258 }
            java.util.Map r1 = r15.A0E     // Catch:{ all -> 0x0258 }
            java.lang.Object r0 = r0.getKey()     // Catch:{ all -> 0x0258 }
            java.lang.Object r0 = r1.get(r0)     // Catch:{ all -> 0x0258 }
            X.7sH r0 = (X.C344697sH) r0     // Catch:{ all -> 0x0258 }
            r0.getClass()     // Catch:{ all -> 0x0258 }
            r2.EEx(r0, r4)     // Catch:{ all -> 0x0258 }
            goto L_0x0228
        L_0x024b:
            X.7sO r1 = r15.A01     // Catch:{ all -> 0x0258 }
            if (r1 == 0) goto L_0x0265
            X.7sH r0 = r15.A03     // Catch:{ all -> 0x0258 }
            r0.getClass()     // Catch:{ all -> 0x0258 }
            r1.EEx(r0, r4)     // Catch:{ all -> 0x0258 }
            goto L_0x0265
        L_0x0258:
            r3 = move-exception
            X.7s4 r2 = r15.A02     // Catch:{ all -> 0x0269 }
            java.lang.String r1 = "CompositeMediaGraph.render() failed."
            X.Av8 r0 = new X.Av8     // Catch:{ all -> 0x0269 }
            r0.<init>(r1, r3)     // Catch:{ all -> 0x0269 }
            r2.A05(r0)     // Catch:{ all -> 0x0269 }
        L_0x0265:
            X.C349257zq.A01()
            return
        L_0x0269:
            r0 = move-exception
            X.C349257zq.A01()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C40140ATg.EEx(X.7sH, java.lang.Long):void");
    }

    public final void EeS(B19 b19) {
        this.A0D.A01 = b19;
    }

    public final void FMh(int i, Object obj) {
        Iterator A0v = AnonymousClass7TF.A0v(this.A0F);
        while (A0v.hasNext()) {
            ((C344737sL) A0v.next()).FMh(i, obj);
        }
        C344767sO r0 = this.A01;
        if (r0 != null) {
            r0.FMh(i, obj);
        }
    }

    public final void detach() {
        Iterator A0v = AnonymousClass7TF.A0v(this.A0F);
        while (A0v.hasNext()) {
            ((C344747sM) A0v.next()).detach();
        }
        C344767sO r0 = this.A01;
        if (r0 != null) {
            r0.detach();
        }
        A93 a93 = this.A0D;
        Long l = a93.A02;
        if (l != null) {
            GLES30.glDeleteSync(l.longValue());
            a93.A02 = null;
        }
    }

    public final void release() {
        Iterator A0v = AnonymousClass7TF.A0v(this.A0F);
        while (A0v.hasNext()) {
            ((C344747sM) A0v.next()).release();
        }
        C344767sO r0 = this.A01;
        if (r0 != null) {
            r0.release();
        }
    }

    public C40140ATg(C344407ro r4) {
        this.A0C = r4;
    }

    public final void E4c(C344907sc r4) {
        C344877sZ CAG = r4.CAG();
        if (CAG == C344877sZ.BACKGROUND_GRADIENT || CAG == C344877sZ.ZOOM_CROP) {
            Iterator A0v = AnonymousClass7TF.A0v(this.A0F);
            while (A0v.hasNext()) {
                C344737sL r1 = (C344737sL) A0v.next();
                if (r1 instanceof C344777sP) {
                    ((C344777sP) r1).E4c(r4);
                }
            }
            return;
        }
        C344767sO r12 = this.A01;
        if (r12 != null) {
            C344767sO.A05(r12, r4, (C345237tA) null);
        }
    }
}
