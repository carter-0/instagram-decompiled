package X;

import android.os.Handler;

/* renamed from: X.7t1  reason: invalid class name and case insensitive filesystem */
public final class C345157t1 extends C344467ru implements C345167t2 {
    public C344767sO A00;
    public C344647sC A01;
    public boolean A02;
    public final C345197t5 A03;
    public final C345177t3 A04;
    public final C345187t4 A05;
    public final C344037rD A06;
    public final C343927r2 A07;
    public final C343967r6 A08;

    public final void Ddr(C344907sc r4) {
        C344767sO r0;
        Handler handler;
        if (!this.A02 && r4.CAG() == C344877sZ.MSQRD_EFFECT && ((Boolean) A09(C345167t2.A00, false)).booleanValue()) {
            C345197t5 r2 = this.A03;
            if (((C348407yO) r4).A00 == null && (r0 = r2.A02) != null && (handler = r0.A02) != null) {
                handler.post(new C40938Alk(r2, r4));
            }
        } else if (this.A02) {
            C344767sO r1 = this.A03.A02;
            if (r1 != null) {
                C344767sO.A05(r1, r4, (C345237tA) null);
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    public static final void A00(C345157t1 r3) {
        if (r3.A03.A02 == null) {
            C343717qg r1 = C343687qd.A01;
            C343837qt r0 = r3.A00;
            r0.getClass();
            if (r0.CQN(r1)) {
                C343837qt r02 = r3.A00;
                r02.getClass();
                C344737sL BQ6 = ((C343687qd) r02.Ape(r1)).BQ6();
                0qQ.A07(BQ6);
                if ((BQ6.AlC() & 1) != 0) {
                    BQ6.FMh(1, new C342977pT(r3));
                }
            }
        }
    }

    public C345157t1(C343837qt r13) {
        C344037rD r5;
        this.A00 = r13;
        C343937r3 r2 = C344037rD.A00;
        C343967r6 r0 = null;
        if (r13.CQO(r2)) {
            r5 = (C344037rD) r13.Apf(r2);
        } else {
            r5 = null;
        }
        this.A06 = r5;
        C343937r3 r22 = C343967r6.A00;
        this.A08 = r13.CQO(r22) ? (C343967r6) r13.Apf(r22) : r0;
        C343927r2 r11 = (C343927r2) r13.Apf(C343927r2.A00);
        this.A07 = r11;
        C345177t3 r6 = new C345177t3(this);
        this.A04 = r6;
        C345187t4 r4 = C345187t4.A00;
        this.A05 = r4;
        if (((Boolean) A09(C343737qi.A06, false)).booleanValue()) {
            C343717qg r1 = C344477rv.A01;
            C343837qt r02 = this.A00;
            r02.getClass();
            C343697qe Ape = r02.Ape(r1);
            0qQ.A07(Ape);
            C344527s0 B9P = ((C344477rv) Ape).B9P();
            if (B9P != null) {
                C343897qz.A01().A00("ArEngineRenderThread", 0);
                this.A01 = new C344647sC((C344407ro) A09(C343737qi.A00, new C344407ro()), B9P.A00(r11.BAM("ArEngineRenderThread").getLooper()), new AnonymousClass9S7(), ((Boolean) A09(C343777qm.A00, false)).booleanValue());
            }
        }
        C345197t5 r23 = new C345197t5(this.A01, ((Number) A09(C343737qi.A0L, 0)).intValue());
        this.A03 = r23;
        C343667qb r12 = C343767ql.A00;
        C343837qt r03 = this.A00;
        r03.getClass();
        C344767sO r04 = (C344767sO) r03.Apu(r12);
        this.A00 = r04;
        if (r04 != null) {
            if (r5 != null) {
                r04.A05 = r5;
            }
            r23.A01(r6, r4, r04);
        }
    }
}
