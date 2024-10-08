package X;

import android.os.Handler;
import android.view.View;
import java.util.List;

/* renamed from: X.7u9  reason: invalid class name and case insensitive filesystem */
public final class C345827u9 extends C344317rf implements C344397rn, C344337rh, C345837uA {
    public static final Object A0N = new Object();
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public C341827na A05;
    public boolean A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public final Handler A0B;
    public final AU9 A0C;
    public final C3496981j A0D;
    public final C3496981j A0E;
    public final Object A0F;
    public final boolean A0G;
    public final AV6 A0H;
    public final boolean A0I;
    public volatile C341147mP A0J;
    public volatile C18849W5t A0K;
    public volatile C346027uT A0L;
    public volatile C346027uT A0M;

    public final void AQS(Runnable runnable) {
    }

    public final boolean CKl() {
        return false;
    }

    public final void DZC(C346027uT r4) {
        C18849W5t w5t = this.A0K;
        C346027uT r0 = this.A0M;
        if (r0 != null) {
            A03(w5t, r0);
            r0.A01();
        }
        this.A0M = null;
    }

    public final void DZH(View view) {
    }

    public final boolean EAg() {
        return false;
    }

    public final /* synthetic */ void Eeo(C341907ni r1, Object obj) {
    }

    public final /* synthetic */ void Egk(C341837nb r1) {
    }

    public static void A00(C345827u9 r5) {
        C18849W5t w5t = r5.A0K;
        A04(w5t, r5.A0M);
        List list = r5.A0E.A00;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            A04(w5t, (C346027uT) list.get(i));
        }
    }

    public static void A01(C345827u9 r14) {
        int i;
        int i2;
        int i3;
        C18849W5t w5t = r14.A0K;
        C346027uT r9 = r14.A0L;
        C346027uT r5 = r14.A0M;
        int i4 = r14.A03;
        if (i4 != 0 && (i = r14.A01) != 0 && (i2 = r14.A08) != 0 && (i3 = r14.A07) != 0 && w5t != null && r9 != null && r5 != null) {
            int i5 = r14.A02 - r14.A04;
            int i6 = i4;
            int i7 = i;
            if (i5 % 180 == 0) {
                i7 = i4;
                i6 = i;
            }
            boolean z = r14.A0I;
            if (!z || (i7 >= i2 && i6 >= i3)) {
                r14.A0A = i2;
                r14.A09 = i3;
            } else {
                float f = (float) i7;
                float f2 = (float) i6;
                float f3 = ((float) i2) / ((float) i3);
                if (f3 < f / f2) {
                    r14.A0A = (int) (f2 * f3);
                } else {
                    r14.A0A = i7;
                    i6 = (int) (f / f3);
                }
                r14.A09 = i6;
            }
            r9.A02(i4, i, i5, r14.A06);
            r9.A02 = (float) r14.A02;
            if (z) {
                int i8 = r14.A0A;
                int i9 = r14.A09;
                synchronized (r5) {
                    r5.A02(i8, i9, 0, false);
                }
            }
            int i10 = r14.A0A;
            int i11 = r14.A09;
            int i12 = r14.A02;
            int i13 = r14.A00;
            boolean z2 = r14.A06;
            List list = r14.A0D.A00;
            int size = list.size();
            for (int i14 = 0; i14 < size; i14++) {
                ((C341027mD) list.get(i14)).DVh(i10, i11, i12, i13, z2);
            }
        }
    }

    public static void A03(C18849W5t w5t, C346027uT r7) {
        if (r7 != null && w5t != null) {
            synchronized (w5t) {
                if (!w5t.A02.A03()) {
                    C3496981j r5 = w5t.A00;
                    List list = r5.A00;
                    int size = list.size();
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            break;
                        }
                        C18076Vl5 vl5 = (C18076Vl5) list.get(i);
                        if (vl5.A00 == r7) {
                            r5.A02(vl5);
                            vl5.A03();
                            break;
                        }
                        i++;
                    }
                }
            }
        }
    }

    public static void A04(C18849W5t w5t, C346027uT r7) {
        if (r7 != null && w5t != null) {
            synchronized (w5t) {
                C18656VwB vwB = w5t.A02;
                if (!vwB.A03()) {
                    C3496981j r4 = w5t.A00;
                    List list = r4.A00;
                    int size = list.size();
                    int i = 0;
                    while (true) {
                        if (i < size) {
                            if (((C18076Vl5) list.get(i)).A00 == r7) {
                                break;
                            }
                            i++;
                        } else {
                            C18076Vl5 A002 = vwB.A00(r7);
                            if (A002 != null) {
                                r4.A01(A002);
                            }
                        }
                    }
                }
            }
        }
    }

    public final void A09() {
        C343717qg r1 = C344447rs.A00;
        if (this.A00.CQN(r1)) {
            this.A0J = ((C344447rs) A0A(r1)).Blg();
        }
    }

    public final void A9j(C346027uT r2) {
        this.A0E.A01(r2);
        A04(this.A0K, r2);
    }

    public final void AAM(C341027mD r8) {
        C341027mD r1 = r8;
        if (this.A0D.A01(r8)) {
            int i = this.A0A;
            int i2 = this.A09;
            int i3 = this.A02;
            int i4 = this.A00;
            boolean z = this.A06;
            if (i > 0 && i2 > 0) {
                r1.DVh(i, i2, i3, i4, z);
            }
        }
    }

    public final C343717qg BJt() {
        return C344397rn.A00;
    }

    public final C341047mF C3L() {
        return this.A0H;
    }

    public final void DZB(C346027uT r3) {
        C18849W5t w5t = this.A0K;
        C346027uT r0 = this.A0M;
        if (!(r0 == null || r0 == r3)) {
            A03(w5t, r0);
            r0.A01();
        }
        this.A0M = r3;
        if (r3 != null) {
            A04(w5t, r3);
        }
    }

    public final void DZD(C346027uT r3, int i, int i2) {
        this.A08 = i;
        this.A07 = i2;
        this.A0B.post(new AiX(this));
    }

    public final void EEN(C346027uT r2) {
        this.A0E.A02(r2);
        A03(this.A0K, r2);
    }

    public final void EEg(C341027mD r2) {
        this.A0D.A02(r2);
    }

    public final void EgY(boolean z) {
        C346027uT r0 = this.A0M;
        if (r0 != null) {
            r0.A0D = z;
        }
    }

    public C345827u9(C343837qt r6) {
        super(r6);
        C343667qb r0 = C345837uA.A00;
        Object obj = A0N;
        C343837qt r4 = this.A00;
        Object Apu = r4.Apu(r0);
        this.A0F = Apu != null ? Apu : obj;
        boolean z = true;
        Object obj2 = true;
        Object Apu2 = r4.Apu(C345837uA.A02);
        this.A0I = ((Boolean) (Apu2 != null ? Apu2 : obj2)).booleanValue();
        Object Apu3 = r4.Apu(C345837uA.A01);
        this.A0G = ((Boolean) (Apu3 != null ? Apu3 : z)).booleanValue();
        this.A0E = new C3496981j();
        this.A0D = new C3496981j();
        this.A0B = ((C343927r2) r4.Apf(C343927r2.A00)).BAM("Lite-SurfacePipe-Thread");
        this.A0H = new AV6(this);
        this.A0C = new AU9(this);
    }

    public final void EqK(C341827na r1) {
        this.A05 = r1;
    }
}
