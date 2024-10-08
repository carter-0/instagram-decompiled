package X;

import android.os.Handler;
import android.os.Looper;
import com.facebook.common.time.AwakeTimeSinceBootClock;
import java.util.List;

/* renamed from: X.7rm  reason: invalid class name and case insensitive filesystem */
public final class C344387rm extends C344317rf implements C344397rn {
    public static final String A0V = C341037mE.class.getSimpleName();
    public int A00 = 0;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public C344477rv A08;
    public C345107sw A09;
    public C346257us A0A;
    public C346267ut A0B;
    public C344337rh A0C;
    public C341127mN A0D;
    public C343967r6 A0E;
    public C343927r2 A0F;
    public C341837nb A0G;
    public C341827na A0H;
    public boolean A0I;
    public boolean A0J;
    public final Handler A0K;
    public final Handler A0L;
    public final C344407ro A0M;
    public final C344037rD A0N;
    public final C3496981j A0O = new C3496981j();
    public final C341097mK A0P;
    public final boolean A0Q;
    public final C341037mE A0R;
    public volatile C341147mP A0S;
    public volatile boolean A0T;
    public volatile C346027uT A0U;

    public static void A00(C344387rm r2) {
        A04(r2, (C346027uT) null);
        C343717qg r1 = C345547th.A00;
        if (r2.A00.CQN(r1)) {
            C345547th r12 = (C345547th) r2.A0A(r1);
            C344337rh r0 = r2.A0C;
            if (r0 == null) {
                r0 = new AU3(r2);
                r2.A0C = r0;
            }
            r12.EES(r0);
        }
        C341147mP r02 = r2.A0S;
        if (r02 != null) {
            r02.stop();
        }
    }

    public final boolean EAg() {
        return false;
    }

    public static void A01(C344387rm r2) {
        C343717qg r1 = C345547th.A00;
        if (r2.A00.CQN(r1)) {
            C345547th r12 = (C345547th) r2.A0A(r1);
            C344337rh r0 = r2.A0C;
            if (r0 == null) {
                r0 = new AU3(r2);
                r2.A0C = r0;
            }
            r12.A9s(r0);
        }
        C341147mP r13 = r2.A0S;
        if (r13 != null) {
            C341127mN r02 = r2.A0D;
            if (r02 == null) {
                r02 = new C341927nl(r2);
                r2.A0D = r02;
            }
            r13.EwL(r02);
        }
    }

    public static void A03(C344387rm r13) {
        int i;
        int i2;
        int i3;
        C346257us r2;
        int i4;
        int i5 = r13.A03;
        if (i5 != 0 && (i = r13.A02) != 0 && (i2 = r13.A05) != 0 && (i3 = r13.A04) != 0 && (r2 = r13.A0A) != null) {
            int i6 = i5;
            if (r13.A07 % 180 != 0) {
                i6 = i;
                i = i5;
            }
            int i7 = r13.A06;
            int i8 = i2;
            int i9 = i3;
            if (i7 % 180 != 0) {
                i8 = i3;
                i9 = i2;
            }
            if (r13.A0I) {
                i4 = r13.A01;
            } else {
                i4 = 0;
            }
            C345067ss FKc = r2.FKc(i6, i, i8, i9, i7, i4, r13.A00, r13.A0J);
            C346027uT r1 = r13.A0U;
            if (r1 != null) {
                r1.A06 = r13.A06;
            }
            int i10 = 0;
            r13.A08.FLA(0, FKc.A01, FKc.A00, r13.A0J, i2, i3);
            int i11 = r13.A05;
            int i12 = r13.A04;
            int i13 = r13.A06;
            if (r13.A0I) {
                i10 = r13.A01;
            }
            boolean z = r13.A0J;
            if (i11 != 0 && i12 != 0) {
                List list = r13.A0O.A00;
                int size = list.size();
                for (int i14 = 0; i14 < size; i14++) {
                    ((C341027mD) list.get(i14)).DVh(i11, i12, i13, i10, z);
                }
            }
        }
    }

    public static void A04(C344387rm r9, C346027uT r10) {
        C346047uV r6;
        C346027uT r0 = r9.A0U;
        C346027uT r7 = r10;
        if (!(r0 == null || r0 == r10)) {
            r9.EEN(r0);
        }
        r9.A0U = r10;
        if (r10 != null) {
            boolean z = false;
            C343967r6 r02 = r9.A0E;
            if (r02 != null) {
                z = r02.CTO(132);
            }
            AwakeTimeSinceBootClock awakeTimeSinceBootClock = null;
            if (z) {
                r6 = new C346047uV(r9);
            } else {
                r6 = null;
            }
            C344407ro r5 = r9.A0M;
            boolean z2 = false;
            C343967r6 r03 = r9.A0E;
            if (r03 != null) {
                z2 = r03.CTO(133);
            }
            C344037rD r04 = r9.A0N;
            if (r04 != null) {
                awakeTimeSinceBootClock = r04.BU4();
            }
            C346037uU r3 = new C346037uU(awakeTimeSinceBootClock, r5, r6, r7, z2);
            if (r9.A0T) {
                r3.A01 = 3;
            }
            r3.A09 = true;
            r9.A08.BQ8().A8c(r3, 0);
        }
    }

    public final void A09() {
        C343967r6 r0;
        C343937r3 r2 = C343967r6.A00;
        C343837qt r1 = this.A00;
        if (r1.CQO(r2)) {
            r0 = (C343967r6) r1.Apf(r2);
        } else {
            r0 = null;
        }
        this.A0E = r0;
        this.A0F = (C343927r2) r1.Apf(C343927r2.A00);
        this.A08 = (C344477rv) A0A(C344477rv.A01);
        this.A0S = ((C344447rs) A0A(C344447rs.A00)).Blg();
    }

    public final void A0C(C341067mH r5) {
        C346247ur r2 = new C346247ur(r5, new C345047sq());
        if (this.A0L.getLooper() == Looper.myLooper()) {
            this.A09 = r2;
            C346267ut r0 = this.A0B;
            if (r0 == null) {
                r0 = new C343247pu(this);
                this.A0B = r0;
            }
            r2.EeQ(r0);
            this.A0A = r2;
            this.A08.BQ8().EZt(new C346277uu(this.A0M, this.A09, false), 0);
            return;
        }
        throw new IllegalStateException("getInputTextureId() must be called at SurfacePipe thread.");
    }

    public final void A9j(C346027uT r10) {
        C344407ro r5 = this.A0M;
        boolean z = false;
        C343967r6 r0 = this.A0E;
        if (r0 != null) {
            z = r0.CTO(133);
        }
        C346037uU r3 = new C346037uU((AwakeTimeSinceBootClock) null, r5, (C346047uV) null, r10, z);
        if (this.A0T) {
            r3.A00 = 7;
            r3.A01 = 7;
        }
        r3.A09 = true;
        this.A08.BQ8().A8c(r3, 0);
    }

    public final void AAM(C341027mD r8) {
        int i;
        C341027mD r1 = r8;
        if (this.A0O.A01(r8)) {
            int i2 = this.A05;
            int i3 = this.A04;
            int i4 = this.A06;
            if (this.A0I) {
                i = this.A01;
            } else {
                i = 0;
            }
            boolean z = this.A0J;
            if (i2 > 0 && i3 > 0) {
                r1.DVh(i2, i3, i4, i, z);
            }
        }
    }

    public final void AQS(Runnable runnable) {
        C344717sJ r1 = ((C344687sG) this.A08.BQ8()).A07;
        C345037sp r2 = (C345037sp) r1.A00.get(0);
        if (r2 == null) {
            r1.A01.A00(C368978td.GL_COPY_RENDERER_SKIP_OUTPUT_NOT_SET);
            return;
        }
        r2.A07 = true;
        synchronized (C345037sp.A08) {
            r2.A03 = runnable;
        }
    }

    public final C343717qg BJt() {
        return C344397rn.A00;
    }

    public final C341047mF C3L() {
        return this.A0R;
    }

    public final boolean CKl() {
        return this.A08.CKm();
    }

    public final void EEN(C346027uT r3) {
        this.A08.BQ8().EDi(0, r3);
    }

    public final void EEg(C341027mD r2) {
        this.A0O.A02(r2);
    }

    public final void Eeo(C341907ni r3, Object obj) {
        C341037mE r1 = this.A0R;
        if (r3 == C341897nh.A00) {
            r1.A07.A01 = (C341897nh) obj;
        }
    }

    public final void EgY(boolean z) {
        C346027uT r0 = this.A0U;
        if (r0 != null) {
            r0.A0D = z;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v19, resolved type: X.AUw} */
    /* JADX WARNING: type inference failed for: r0v13, types: [X.7mK] */
    /* JADX WARNING: type inference failed for: r0v18 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C344387rm(X.C343837qt r6, boolean r7, boolean r8) {
        /*
            r5 = this;
            r5.<init>(r6)
            X.81j r0 = new X.81j
            r0.<init>()
            r5.A0O = r0
            r4 = 0
            r5.A00 = r4
            X.7qb r0 = X.C343737qi.A00
            X.7ro r1 = new X.7ro
            r1.<init>()
            X.7qt r3 = r5.A00
            java.lang.Object r0 = r3.Apu(r0)
            if (r0 == 0) goto L_0x001d
            r1 = r0
        L_0x001d:
            X.7ro r1 = (X.C344407ro) r1
            r5.A0M = r1
            android.os.Handler r0 = X.C344427rq.A00(r6)
            r5.A0L = r0
            X.7r3 r2 = X.C343927r2.A00
            boolean r1 = r3.CQO(r2)
            r0 = 0
            if (r1 == 0) goto L_0x0080
            X.7r1 r2 = r3.Apf(r2)
            X.7r2 r2 = (X.C343927r2) r2
            java.lang.String r1 = "Lite-Controller-Thread"
            android.os.Handler r1 = r2.BAM(r1)
        L_0x003c:
            r5.A0K = r1
            X.7r3 r2 = X.C344037rD.A00
            boolean r1 = r3.CQO(r2)
            if (r1 == 0) goto L_0x004c
            X.7r1 r0 = r3.Apf(r2)
            X.7rD r0 = (X.C344037rD) r0
        L_0x004c:
            r5.A0N = r0
            X.7mE r0 = new X.7mE
            r0.<init>(r5)
            r5.A0R = r0
            r0 = 0
            if (r7 == 0) goto L_0x0059
            r0 = 1
        L_0x0059:
            r5.A0Q = r0
            r5.A0I = r8
            X.7qb r0 = X.C343777qm.A01
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r4)
            java.lang.Object r0 = r3.Apu(r0)
            if (r0 == 0) goto L_0x006a
            r1 = r0
        L_0x006a:
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r0 = r1.booleanValue()
            if (r0 == 0) goto L_0x007a
            X.AUw r0 = new X.AUw
            r0.<init>()
        L_0x0077:
            r5.A0P = r0
            return
        L_0x007a:
            X.7mJ r0 = new X.7mJ
            r0.<init>()
            goto L_0x0077
        L_0x0080:
            r1 = r0
            goto L_0x003c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C344387rm.<init>(X.7qt, boolean, boolean):void");
    }

    public final void Egk(C341837nb r1) {
        this.A0G = r1;
    }

    public final void EqK(C341827na r1) {
        this.A0H = r1;
    }
}
