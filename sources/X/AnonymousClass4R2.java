package X;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.SparseArray;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.util.Util;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.4R2  reason: invalid class name */
public final class AnonymousClass4R2 extends AnonymousClass4R3 implements AnonymousClass4R5 {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public long A05;
    public long A06;
    public C2612348u A07;
    public AnonymousClass4RP A08;
    public AnonymousClass4RP A09;
    public AnonymousClass4RP A0A;
    public C264864Rp A0B;
    public AnonymousClass4P7 A0C;
    public C264784Rg A0D;
    public AnonymousClass4P6 A0E;
    public AnonymousClass4QB A0F;
    public C264804Ri A0G;
    public AnonymousClass4S7 A0H;
    public C264344Pn A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public C265164Su A0N;
    public final Handler A0O;
    public final Handler A0P;
    public final Looper A0Q;
    public final C264914Ru A0R;
    public final C264784Rg A0S;
    public final AnonymousClass4R4 A0T;
    public final C264744Rc A0U;
    public final AnonymousClass4RR A0V;
    public final C264634Qq A0W;
    public final C264734Rb A0X;
    public final C697227w A0Y;
    public final AnonymousClass4Q3 A0Z;
    public final CopyOnWriteArraySet A0a;
    public final CopyOnWriteArraySet A0b;
    public final AnonymousClass4PL[] A0c;

    public final void A9I(C265164Su r1) {
    }

    public final void E3q(C265164Su r10, boolean z, boolean z2) {
        this.A07 = null;
        this.A0N = r10;
        C264864Rp A002 = A00(2, false, z2);
        this.A0J = true;
        this.A02++;
        AnonymousClass4S5 r2 = (AnonymousClass4S5) this.A0R.A0d;
        AnonymousClass4SD A003 = AnonymousClass4S5.A00();
        A003.A00 = r2.A00.obtainMessage(0, 0, z2 ? 1 : 0, r10);
        A003.A01 = r2;
        A003.A01();
        A02(this, A002, 4, 1, false, false);
    }

    public final void EL1(long j) {
        this.A0K = true;
        this.A02++;
        this.A05 = j;
        C264914Ru r1 = this.A0R;
        C264874Rq r5 = this.A0B.A05;
        UUID uuid = AnonymousClass4T7.A04;
        r1.A0d.CsU(new C292595jD(r5, Util.A07(j)), 17).A01();
        Iterator it = this.A0b.iterator();
        while (it.hasNext()) {
            ((AnonymousClass4RS) it.next()).DYJ(1);
        }
    }

    public final void EXr(boolean z) {
    }

    public final void Efw(boolean z) {
        if (this.A0L != z) {
            this.A0L = z;
            this.A03++;
            this.A0R.A0d.CsT(1, z ? 1 : 0, 0).A01();
            C264864Rp r4 = this.A0B;
            if (!z) {
                this.A0M = z;
                Iterator it = this.A0b.iterator();
                while (it.hasNext()) {
                    AnonymousClass4RS r3 = (AnonymousClass4RS) it.next();
                    if (r3 instanceof AnonymousClass4SF) {
                        AnonymousClass4SF r32 = (AnonymousClass4SF) r3;
                        int i = r4.A00;
                        if (i == 3) {
                            AnonymousClass4P4 r1 = r32.A06;
                            if (r1.A02 != null) {
                                AnonymousClass4P4.A03(r1);
                            }
                        }
                        for (AnonymousClass4SE A002 : r32.A06.A0R) {
                            A002.A00(i, false);
                        }
                    } else {
                        r3.DXp(z, r4.A00);
                    }
                }
            }
        }
    }

    public final void stop(boolean z) {
        this.A07 = null;
        this.A0N = null;
        C264864Rp A002 = A00(1, true, true);
        this.A02++;
        this.A0R.A0d.CsT(6, 1, 0).A01();
        A02(this, A002, 4, 1, false, false);
        this.A0G = new C264804Ri(0sn.A00);
    }

    private C264864Rp A00(int i, boolean z, boolean z2) {
        int A062;
        long Atl;
        Timeline timeline;
        C264844Rn r6;
        C264734Rb r7;
        if (z) {
            this.A01 = 0;
            this.A00 = 0;
            Atl = 0;
            this.A06 = 0;
        } else {
            this.A01 = Auj();
            if (A03()) {
                A062 = this.A00;
            } else {
                C264864Rp r0 = this.A0B;
                A062 = r0.A03.A06(r0.A05.A04);
            }
            this.A00 = A062;
            this.A06 = AuI();
            Atl = Atl();
        }
        this.A05 = Atl;
        if (z2) {
            timeline = Timeline.A00;
        } else {
            timeline = this.A0B.A03;
        }
        C264864Rp r02 = this.A0B;
        C264874Rq r4 = r02.A05;
        long j = r02.A02;
        long j2 = r02.A01;
        if (z2) {
            r6 = C264844Rn.A03;
            r7 = this.A0X;
        } else {
            r6 = r02.A06;
            r7 = r02.A07;
        }
        return new C264864Rp(timeline, r4, r4, r6, r7, AnonymousClass05K.A00, i, j, j2, j, 0, j, false, false);
    }

    public static void A02(AnonymousClass4R2 r7, C264864Rp r8, int i, int i2, boolean z, boolean z2) {
        C264864Rp r6 = r7.A0B;
        boolean z3 = true;
        boolean z4 = false;
        if (r6.A03 != r8.A03) {
            z4 = true;
        }
        boolean z5 = false;
        if (r6.A00 != r8.A00) {
            z5 = true;
        }
        boolean z6 = false;
        if (r6.A0A != r8.A0A) {
            z6 = true;
        }
        if (r6.A07 == r8.A07) {
            z3 = false;
        }
        r7.A0B = r8;
        if (z4 || i2 == 0) {
            Iterator it = r7.A0b.iterator();
            while (it.hasNext()) {
                C265344Tm.A00((AnonymousClass4RS) it.next(), r7.A0B.A03, i2);
            }
        }
        if (z) {
            Iterator it2 = r7.A0b.iterator();
            while (it2.hasNext()) {
                ((AnonymousClass4RS) it2.next()).DYJ(i);
            }
        }
        if (z3) {
            C264634Qq r1 = r7.A0W;
            ((C264624Qp) r1).A00 = (C265234Tb) r7.A0B.A07.A02;
            Iterator it3 = r7.A0b.iterator();
            while (it3.hasNext()) {
                ((AnonymousClass4RS) it3.next()).DtG(r7.A0B.A07.A01);
            }
        }
        if (z6) {
            Iterator it4 = r7.A0b.iterator();
            while (it4.hasNext()) {
                it4.next();
            }
        }
        if (z5) {
            Iterator it5 = r7.A0b.iterator();
            while (it5.hasNext()) {
                ((AnonymousClass4RS) it5.next()).DXp(r7.A0M, r7.A0B.A00);
            }
        }
        if (z2) {
            Iterator it6 = r7.A0b.iterator();
            while (it6.hasNext()) {
                it6.next();
            }
        }
    }

    private boolean A03() {
        if (this.A0B.A03.A02() == 0 || this.A02 > 0) {
            return true;
        }
        return false;
    }

    public final void A8z(AnonymousClass4RS r2) {
        this.A0b.add(r2);
    }

    public final SparseArray Aar() {
        int A002;
        C265984Xc r0;
        AnonymousClass4TC r02 = this.A0R.A0Y.A05;
        SparseArray sparseArray = new SparseArray();
        if (r02 != null) {
            AnonymousClass4TD[] r4 = r02.A0B;
            for (AnonymousClass4TD r2 : r4) {
                if (r2 instanceof AnonymousClass4TP) {
                    AnonymousClass4TP r22 = (AnonymousClass4TP) r2;
                    A002 = r22.A0F;
                    r0 = r22.A0I;
                } else if (r2 instanceof C265384Tq) {
                    XDK xdk = (XDK) ((C265384Tq) r2);
                    XDJ xdj = xdk.A01;
                    Map map = XDJ.A0d;
                    C264844Rn r03 = xdj.A07.A00;
                    int i = xdk.A00;
                    A002 = 2Kn.A00(((C264854Ro) r03.A02.get(i)).A04[0].A0W);
                    r0 = xdj.A0H[i];
                }
                sparseArray.put(A002, Long.valueOf(r0.A05()));
            }
        }
        return sparseArray;
    }

    public final long AiQ() {
        long j = this.A0B.A0B;
        UUID uuid = AnonymousClass4T7.A04;
        return Util.A08(j);
    }

    public final long AiR() {
        long j = this.A0B.A0D;
        UUID uuid = AnonymousClass4T7.A04;
        return Util.A08(j);
    }

    public final Timeline AuY() {
        return this.A0B.A03;
    }

    public final C264844Rn Aub() {
        return this.A0B.A06;
    }

    public final AnonymousClass4TK Auc() {
        return new AnonymousClass4TK(this.A0B.A07.A04);
    }

    public final long AzG() {
        long j;
        C264864Rp r1 = this.A0B;
        Timeline timeline = r1.A03;
        if (timeline.A02() == 0) {
            return -9223372036854775807L;
        }
        if (CZN()) {
            C264874Rq r3 = r1.A05;
            Object obj = r3.A04;
            C264744Rc r2 = this.A0U;
            timeline.A0B(r2, obj);
            j = r2.A01(r3.A00, r3.A01);
            UUID uuid = AnonymousClass4T7.A04;
        } else {
            j = timeline.A0E(this.A00, Auj(), 0).A03;
        }
        return Util.A08(j);
    }

    public final HandlerThread BIU() {
        return this.A0R.A0U;
    }

    public final boolean BIz() {
        return this.A0B.A09;
    }

    public final boolean Bd1() {
        return this.A0L;
    }

    public final int BdC() {
        return this.A0B.A00;
    }

    public final long BlI() {
        return this.A0R.A0e.Bds() / 1000;
    }

    public final int Bm2() {
        return this.A04;
    }

    public final boolean BwE() {
        return false;
    }

    public final Integer Byk() {
        return this.A0B.A08;
    }

    public final void E3P(long j) {
        long j2 = -1;
        int i = (j > -1 ? 1 : (j == -1 ? 0 : -1));
        C264914Ru r1 = this.A0R;
        if (i != 0) {
            UUID uuid = AnonymousClass4T7.A04;
            j2 = Util.A07(j);
        }
        r1.A0d.CsU(Long.valueOf(j2), 16).A01();
    }

    public final void E3m() {
        throw new RuntimeException();
    }

    public final void EDF() {
        this.A0b.clear();
    }

    public final void EJE() {
        C265164Su r2 = this.A0N;
        if (r2 != null && this.A0B.A00 == 1) {
            E3q(r2, false, false);
        }
    }

    public final void Efz(AnonymousClass4P7 r3) {
        this.A0R.A0d.CsU(r3, 4).A01();
    }

    public final void EiI(long j) {
        this.A0R.A0e.A02(j * 1000);
    }

    public final void EiZ(int i) {
        if (this.A04 != i) {
            this.A04 = i;
            this.A0R.A0d.CsT(12, i, 0).A01();
            Iterator it = this.A0b.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    public final void EjX(AnonymousClass4P6 r3) {
        if (r3 == null) {
            r3 = AnonymousClass4P6.A03;
        }
        this.A0R.A0d.CsU(r3, 5).A01();
        this.A0E = r3;
    }

    public final void Eq9(List list) {
        for (AnonymousClass4PL r1 : this.A0c) {
            if (((AnonymousClass4PK) r1).A0B == 2) {
                AnonymousClass4SA A012 = A01(r1);
                A012.A01(13);
                A012.A02(list);
                A012.A00();
            }
        }
    }

    public final void release() {
        synchronized (27e.class) {
        }
        this.A0N = null;
        C264914Ru r2 = this.A0R;
        synchronized (r2) {
            if (!r2.A0M) {
                ((AnonymousClass4S5) r2.A0d).A00.sendEmptyMessage(7);
                boolean z = false;
                while (!r2.A0M) {
                    try {
                        r2.wait();
                    } catch (InterruptedException unused) {
                        z = true;
                    }
                }
                if (z) {
                    Thread.currentThread().interrupt();
                }
            }
        }
        this.A0O.removeCallbacksAndMessages((Object) null);
        this.A0B = A00(1, false, false);
        this.A0G = C264804Ri.A01;
    }

    public AnonymousClass4R2(AnonymousClass4R1 r45, C697227w r46, C635813i r47, C635813i r48, C635813i r49, C635813i r50) {
        Looper mainLooper;
        AnonymousClass4PL[] AMr = ((C264694Qx) r49.get()).AMr((Handler) null, (AnonymousClass4PB) null, (C265114Sp) null, (AnonymousClass4QO) null, (AnonymousClass4QJ) null, (AnonymousClass4PC) null);
        C264634Qq r1 = (C264634Qq) r50.get();
        AnonymousClass4QZ r5 = (AnonymousClass4QZ) r48.get();
        AnonymousClass28n r4 = (AnonymousClass28n) r47.get();
        AnonymousClass4R1 r3 = r45;
        boolean z = r3.A07;
        boolean z2 = r3.A04;
        boolean z3 = r3.A02;
        long j = r3.A01;
        int i = r3.A00;
        boolean z4 = r3.A05;
        boolean z5 = r3.A06;
        boolean z6 = r3.A03;
        AnonymousClass4Q3 r9 = new AnonymousClass4Q3();
        this.A0Z = r9;
        try {
            int length = AMr.length;
            C256703wD.A04(length > 0);
            this.A0c = AMr;
            r1.getClass();
            this.A0W = r1;
            this.A0L = false;
            this.A04 = 0;
            AnonymousClass4RP r2 = AnonymousClass4RP.A0V;
            this.A08 = r2;
            this.A09 = r2;
            this.A0A = r2;
            this.A0F = AnonymousClass4QB.A02;
            this.A0b = new CopyOnWriteArraySet();
            this.A0V = AnonymousClass4RR.A00;
            this.A0E = AnonymousClass4P6.A03;
            C264734Rb r32 = new C264734Rb(AnonymousClass4RZ.A01, (Object) null, new AnonymousClass4RW[length], new AnonymousClass4RX[length]);
            this.A0X = r32;
            this.A0U = new C264744Rc();
            C264774Rf r22 = new C264774Rf();
            int[] iArr = {1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 22, 23, 24, 25, 26, 27, 28};
            int i2 = 0;
            do {
                r22.A01(iArr[i2]);
                i2++;
            } while (i2 < 21);
            r22.A01(29);
            C264784Rg r8 = C264784Rg.A01;
            C264784Rg r23 = new C264784Rg(r22.A00());
            this.A0S = r23;
            C264774Rf r82 = new C264774Rf();
            r82.A02(r23.A00);
            r82.A01(4);
            r82.A01(10);
            this.A0D = new C264784Rg(r82.A00());
            this.A0G = C264804Ri.A01;
            this.A0C = AnonymousClass4P7.A03;
            this.A0Q = Looper.myLooper();
            if (Looper.myLooper() != null) {
                mainLooper = Looper.myLooper();
            } else {
                mainLooper = Looper.getMainLooper();
            }
            C264824Rk r24 = new C264824Rk(mainLooper, this);
            this.A0O = r24;
            C697227w r7 = r46;
            this.A0Y = r7;
            this.A0T = this;
            this.A0B = new C264864Rp(Timeline.A00, C264844Rn.A03, r32, 0);
            C264824Rk r17 = r24;
            AnonymousClass4QZ r18 = r5;
            C264914Ru r16 = new C264914Ru(r17, r18, C264894Rs.A03, r1, r32, r4, r7, AMr, this.A04, i, j, this.A0L, z, z2, z3, z4, z5, z6);
            this.A0R = r16;
            this.A0I = C264344Pn.A04;
            this.A0H = AnonymousClass4S7.A02;
            this.A0P = new Handler(r16.A0U.getLooper());
            this.A0a = new CopyOnWriteArraySet();
            r9.A02();
        } catch (Throwable th) {
            this.A0Z.A02();
            throw th;
        }
    }

    private AnonymousClass4SA A01(AnonymousClass4PM r8) {
        int Auj = Auj();
        C264914Ru r2 = this.A0R;
        Timeline timeline = this.A0B.A03;
        if (Auj == -1) {
            Auj = 0;
        }
        return new AnonymousClass4SA(r2.A0U.getLooper(), r2, r8, timeline, this.A0Y, Auj);
    }

    public final void ADy(long j) {
        A0J(Auj(), j);
    }

    public final AnonymousClass4SA AMN(AnonymousClass4PM r2) {
        return A01(r2);
    }

    public final long AiT() {
        long j;
        if (CZN()) {
            C264864Rp r0 = this.A0B;
            if (!r0.A04.equals(r0.A05)) {
                return AzG();
            }
            j = this.A0B.A0B;
            UUID uuid = AnonymousClass4T7.A04;
        } else if (A03()) {
            return this.A06;
        } else {
            C264864Rp r5 = this.A0B;
            if (r5.A04.A03 != r5.A05.A03) {
                return Util.A08(r5.A03.A0E(this.A00, Auj(), 0).A03);
            }
            long j2 = r5.A0B;
            C264864Rp r2 = this.A0B;
            C264874Rq r52 = r2.A04;
            if (r52.A00 != -1) {
                r2.A03.A0B(this.A0U, r52.A04);
                r2 = this.A0B;
                r52 = r2.A04;
                j2 = 0;
            }
            Timeline timeline = r2.A03;
            Object obj = r52.A04;
            C264744Rc r02 = this.A0U;
            timeline.A0B(r02, obj);
            j = j2 + r02.A02;
        }
        return Util.A08(j);
    }

    public final long Atl() {
        if (A03()) {
            return this.A05;
        }
        long j = this.A0B.A0C;
        UUID uuid = AnonymousClass4T7.A04;
        return Util.A08(j);
    }

    public final int AuC() {
        int Auj = Auj();
        if (Auj == -1) {
            return 0;
        }
        return Auj;
    }

    public final long AuI() {
        if (A03()) {
            return this.A06;
        }
        C264864Rp r1 = this.A0B;
        boolean z = false;
        if (r1.A05.A00 != -1) {
            z = true;
        }
        long j = r1.A0C;
        UUID uuid = AnonymousClass4T7.A04;
        if (z) {
            return Util.A08(j);
        }
        long A082 = Util.A08(j);
        C264864Rp r4 = this.A0B;
        C264874Rq r12 = r4.A05;
        if (r12.A00 != -1) {
            return A082;
        }
        Timeline timeline = r4.A03;
        Object obj = r12.A04;
        C264744Rc r0 = this.A0U;
        timeline.A0B(r0, obj);
        return A082 + Util.A08(r0.A02);
    }

    public final int Auj() {
        if (A03()) {
            return this.A01;
        }
        C264864Rp r0 = this.A0B;
        return r0.A03.A0B(this.A0U, r0.A05.A04).A00;
    }

    public final boolean CZN() {
        if (A03() || this.A0B.A05.A00 == -1) {
            return false;
        }
        return true;
    }
}
