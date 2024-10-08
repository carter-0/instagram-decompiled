package X;

import android.os.Handler;
import android.view.TextureView;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;

/* renamed from: X.7ru  reason: invalid class name and case insensitive filesystem */
public abstract class C344467ru implements C343697qe {
    public C343837qt A00;

    public final void CMP() {
        C345877uE r0;
        C41790B0t b0t;
        C39904AIm aIm;
        if (this instanceof C345567tj) {
            C345567tj r3 = (C345567tj) this;
            C343717qg r1 = C345547th.A00;
            C343837qt r02 = r3.A00;
            r02.getClass();
            C343697qe Ape = r02.Ape(r1);
            0qQ.A07(Ape);
            C345547th r12 = (C345547th) Ape;
            C344337rh r03 = r3.A02;
            if (r03 == null) {
                r03 = new AU1(r3);
                r3.A02 = r03;
            }
            r12.A9s(r03);
            if (((Boolean) r3.A09(C345577tk.A00, false)).booleanValue()) {
                C343717qg r13 = C345877uE.A00;
                C343837qt r04 = r3.A00;
                r04.getClass();
                if (r04.CQN(r13)) {
                    C343837qt r05 = r3.A00;
                    r05.getClass();
                    C343697qe Ape2 = r05.Ape(r13);
                    0qQ.A07(Ape2);
                    r0 = (C345877uE) Ape2;
                    b0t = r3.A01;
                    if (b0t == null) {
                        b0t = new ARN(r3);
                        r3.A01 = b0t;
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        } else if (this instanceof C345587tl) {
            C345587tl r32 = (C345587tl) this;
            C343717qg r14 = C344327rg.A00;
            C343837qt r06 = r32.A00;
            r06.getClass();
            C340547lR r07 = ((C344307re) ((C344327rg) r06.Ape(r14))).A02;
            r32.A02 = r07;
            C340507lN r15 = r32.A04;
            r15.hashCode();
            r07.A0M.A01(r15);
            C340607lX r16 = r32.A02.A0N;
            r32.A01 = r16;
            r32.A00 = new C70666OFn(r16);
            r32.A00 = r16.CJf(0) ^ true ? 1 : 0;
            C343717qg r17 = C345757u2.A04;
            C343837qt r08 = r32.A00;
            r08.getClass();
            if (r08.CQN(r17)) {
                C343837qt r09 = r32.A00;
                r09.getClass();
                ((C380729Zh) ((C345757u2) r09.Ape(r17))).A04 = r32.A00;
                return;
            }
            return;
        } else if (this instanceof C345617to) {
            C345617to r33 = (C345617to) this;
            C343717qg r18 = C344397rn.A00;
            C343837qt r010 = r33.A00;
            r010.getClass();
            C344397rn r19 = (C344397rn) r010.Ape(r18);
            r33.A04 = r19;
            r19.AAM(r33.A05);
            r33.A04.EqK(new C22259XyH(r33));
            return;
        } else {
            if (this instanceof C345637tq) {
                aIm = ((C345637tq) this).A00;
            } else if (this instanceof C345657ts) {
                C345657ts r34 = (C345657ts) this;
                C343717qg r110 = C345547th.A00;
                C343837qt r011 = r34.A00;
                r011.getClass();
                if (r011.CQN(r110)) {
                    C343837qt r012 = r34.A00;
                    r012.getClass();
                    r34.A01 = (C345547th) r012.Ape(r110);
                }
                aIm = r34.A00;
            } else if (this instanceof C345667tt) {
                C345667tt r35 = (C345667tt) this;
                C343717qg r111 = C345607tn.A00;
                C343837qt r013 = r35.A00;
                r013.getClass();
                r35.A01 = (C345607tn) r013.Ape(r111);
                C343717qg r112 = C345547th.A00;
                C343837qt r014 = r35.A00;
                r014.getClass();
                r35.A02 = (C345547th) r014.Ape(r112);
                C343717qg r113 = C344397rn.A00;
                C343837qt r015 = r35.A00;
                r015.getClass();
                if (r015.CQN(r113)) {
                    C343837qt r016 = r35.A00;
                    r016.getClass();
                    C344397rn r114 = (C344397rn) r016.Ape(r113);
                    r35.A03 = r114;
                    r114.AAM(r35.A05);
                    return;
                }
                return;
            } else if (this instanceof C345687tv) {
                C345687tv r36 = (C345687tv) this;
                C343717qg r115 = C345607tn.A00;
                C343837qt r017 = r36.A00;
                r017.getClass();
                C345607tn r116 = (C345607tn) r017.Ape(r115);
                r36.A00 = r116.Ajm();
                r116.A9Z(r36.A01);
                return;
            } else if (this instanceof C345707tx) {
                C345707tx r37 = (C345707tx) this;
                C343717qg r117 = C345757u2.A04;
                C343837qt r018 = r37.A00;
                r018.getClass();
                if (r018.CQN(r117)) {
                    C343837qt r019 = r37.A00;
                    r019.getClass();
                    C345757u2 r2 = (C345757u2) r019.Ape(r117);
                    A3A a3a = r37.A09;
                    if (a3a == null) {
                        a3a = new A3A(r37);
                        r37.A09 = a3a;
                    }
                    C380729Zh r22 = (C380729Zh) r2;
                    r22.A05 = a3a;
                    A3B a3b = r37.A0A;
                    if (a3b == null) {
                        a3b = new A3B(r37);
                        r37.A0A = a3b;
                    }
                    r22.A06 = a3b;
                    C70666OFn oFn = r37.A08;
                    if (oFn == null) {
                        oFn = new C70666OFn(r37.A0e);
                        r37.A08 = oFn;
                    }
                    r22.A04 = oFn;
                }
                C343717qg r118 = C345877uE.A00;
                C343837qt r020 = r37.A00;
                r020.getClass();
                if (r020.CQN(r118)) {
                    C343837qt r021 = r37.A00;
                    r021.getClass();
                    r0 = (C345877uE) r021.Ape(r118);
                    b0t = r37.A0C;
                    if (b0t == null) {
                        b0t = new ARM(r37);
                        r37.A0C = b0t;
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
            C343837qt r119 = aIm.A0A;
            C343697qe Ape3 = r119.Ape(C344477rv.A01);
            Ape3.getClass();
            aIm.A02 = (C344477rv) Ape3;
            r119.Apu(B33.A00);
            return;
        }
        C345867uD r022 = (C345867uD) r0;
        r022.A04.A01(b0t);
        b0t.DVZ(r022.A01, r022.A00);
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [X.7u1, java.lang.Object] */
    public final void CMk() {
        if (this instanceof C344457rt) {
            C344457rt r2 = (C344457rt) this;
            C343717qg r1 = C343687qd.A01;
            C343837qt r0 = r2.A00;
            r0.getClass();
            if (r0.CQN(r1)) {
                C343837qt r02 = r2.A00;
                r02.getClass();
                C344737sL BQ6 = ((C343687qd) r02.Ape(r1)).BQ6();
                0qQ.A07(BQ6);
                C344457rt.A01(r2, BQ6);
            }
        } else if (this instanceof C345157t1) {
            C345157t1 r22 = (C345157t1) this;
            C345157t1.A00(r22);
            C345197t5 r3 = r22.A03;
            C343837qt r4 = r22.A00;
            r4.getClass();
            r3.A00 = new Object();
            C343717qg r12 = C345547th.A00;
            if (r4.CQN(r12)) {
                C345547th r13 = (C345547th) r4.Ape(r12);
                r3.A04 = r13;
                if (r13 != null) {
                    r13.A9s(r3.A08);
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            }
            C343717qg r14 = C345757u2.A04;
            if (r4.CQN(r14)) {
                C345757u2 r15 = (C345757u2) r4.Ape(r14);
                r3.A01 = r15;
                if (r15 != null) {
                    ((C380729Zh) r15).A02 = r3.A00;
                    r3.A00();
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            }
            C343717qg r16 = C345777u4.A00;
            if (r4.CQN(r16)) {
                C343697qe Ape = r4.Ape(r16);
                0qQ.A07(Ape);
                r3.A02(new ArrayList(((C345777u4) Ape).Blz()));
            }
        }
    }

    public final void connect() {
        if (this instanceof C344457rt) {
            C344457rt r2 = (C344457rt) this;
            if (r2.A05 != null) {
                r2.A06.A01.sendEmptyMessage(1);
            }
        } else if (this instanceof C345157t1) {
            C345157t1 r22 = (C345157t1) this;
            r22.A02 = true;
            C344647sC r0 = r22.A01;
            if (r0 != null) {
                r0.A01.sendEmptyMessage(1);
            }
        } else if (this instanceof C380729Zh) {
            C380729Zh r23 = (C380729Zh) this;
            C343717qg r3 = C345547th.A00;
            C343837qt r02 = r23.A00;
            r02.getClass();
            C345547th r1 = (C345547th) r02.Ape(r3);
            C343837qt r03 = r23.A00;
            r03.getClass();
            if (((C345547th) r03.Ape(r3)).CKQ()) {
                View Bf9 = r1.Bf9();
                r23.A03 = Bf9;
                Bf9.setOnTouchListener(r23.A09);
            }
        } else if (this instanceof C380749Zj) {
            C346027uT r04 = ((C380749Zj) this).A06;
            if (r04 != null) {
                r04.A0D = true;
            }
        } else if (this instanceof C345657ts) {
            C345657ts r24 = (C345657ts) this;
            C345547th r12 = r24.A01;
            if (r12 != null) {
                r12.A9s(r24.A09);
            }
            C341147mP r13 = r24.A0A;
            if (r13 != null) {
                r13.EwL(new AU5(r24));
            }
        } else if (this instanceof C345667tt) {
            ((C345667tt) this).A09 = false;
        } else if (this instanceof C345687tv) {
            synchronized (((C345687tv) this).A03) {
            }
        } else if (this instanceof C345707tx) {
            C345707tx r25 = (C345707tx) this;
            if (r25.A0Q) {
                r25.A0Q = false;
                C343717qg r14 = C345547th.A00;
                C343837qt r05 = r25.A00;
                r05.getClass();
                C345547th r15 = (C345547th) r05.Ape(r14);
                C344337rh r06 = r25.A0D;
                if (r06 == null) {
                    r06 = new AU0(r25);
                    r25.A0D = r06;
                }
                r15.A9s(r06);
                if (r25.A0P) {
                    C345707tx.A02(r25);
                }
            }
        }
    }

    public final void disconnect() {
        C344647sC r2;
        if (this instanceof C344457rt) {
            C344457rt r7 = (C344457rt) this;
            if (r7.A05 != null) {
                r2 = r7.A06;
            } else {
                return;
            }
        } else if (this instanceof C345157t1) {
            C345157t1 r72 = (C345157t1) this;
            r72.A02 = false;
            r2 = r72.A01;
            if (r2 != null) {
                C344767sO r0 = r72.A00;
                if (r0 != null) {
                    r0.A0d = false;
                    Handler handler = r0.A02;
                    if (handler != null) {
                        handler.removeMessages(3);
                    }
                }
            } else {
                return;
            }
        } else if (this instanceof C380729Zh) {
            C380729Zh r73 = (C380729Zh) this;
            View view = r73.A03;
            if (view != null) {
                view.setOnTouchListener((View.OnTouchListener) null);
                r73.A03 = null;
                return;
            }
            return;
        } else if (this instanceof C380749Zj) {
            C346027uT r02 = ((C380749Zj) this).A06;
            if (r02 != null) {
                r02.A0D = false;
                return;
            }
            return;
        } else if (this instanceof C345657ts) {
            C345657ts r74 = (C345657ts) this;
            C341147mP r03 = r74.A0A;
            if (r03 != null) {
                r03.stop();
            }
            C345547th r1 = r74.A01;
            if (r1 != null) {
                r1.EES(r74.A09);
            }
            C346027uT r04 = r74.A02;
            if (r04 != null) {
                r74.EEN(r04);
                r74.A02 = null;
                return;
            }
            return;
        } else if (this instanceof C345667tt) {
            C345667tt r75 = (C345667tt) this;
            synchronized (r75.A07) {
                if (r75.A08 != null) {
                    C41807B1m b1m = r75.A08.A01;
                    b1m.getClass();
                    RuntimeException runtimeException = new RuntimeException("Photo capture already in progress: cancel request");
                    if (ALI.A0A()) {
                        b1m.D0v();
                    } else {
                        AnonymousClass7TE.A1S(ALI.A00(), new Object[]{b1m, runtimeException}, 8);
                    }
                    C345667tt.A01(r75);
                }
            }
            r75.A09 = true;
            return;
        } else if (this instanceof C345687tv) {
            C345687tv r76 = (C345687tv) this;
            synchronized (r76.A03) {
                Integer num = r76.A05;
                Integer num2 = AnonymousClass05K.A01;
                if (num == num2) {
                    CountDownLatch countDownLatch = new CountDownLatch(1);
                    if (r76.A05 == num2) {
                        r76.A00.EyT(new C382559dt(r76, countDownLatch), false);
                    }
                    r76.A05 = AnonymousClass05K.A00;
                    C345687tv.A00(r76);
                    B2M b2m = r76.A04;
                    r76.A04 = null;
                    if (b2m != null) {
                        ALI.A04(b2m, new RuntimeException("Camera is backgrounded during recording"));
                    }
                }
            }
            return;
        } else if (this instanceof C345707tx) {
            C345707tx r77 = (C345707tx) this;
            if (!r77.A0Q) {
                C343717qg r12 = C345547th.A00;
                C343837qt r05 = r77.A00;
                r05.getClass();
                C345547th r13 = (C345547th) r05.Ape(r12);
                C344337rh r06 = r77.A0D;
                if (r06 == null) {
                    r06 = new AU0(r77);
                    r77.A0D = r06;
                }
                r13.EES(r06);
                r77.A06 = null;
                r77.A05 = null;
                C345707tx.A05(r77);
                r77.A0Q = true;
                List list = r77.A0d.A00;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    C345687tv r3 = ((A3C) list.get(i)).A00;
                    synchronized (r3.A03) {
                        if (r3.A05 == AnonymousClass05K.A01) {
                            r3.EyR(false);
                        }
                    }
                }
                C345707tx.A04(r77);
                return;
            }
            return;
        } else {
            return;
        }
        boolean z = r2.A06;
        C344567s4 r14 = r2.A04;
        if (!z) {
            r14.A02();
        } else if (r14.A0A) {
            r14.A0F = true;
        }
        r2.A01.sendEmptyMessage(2);
    }

    public final void release() {
        C39904AIm aIm;
        if (this instanceof C344457rt) {
            C344457rt r3 = (C344457rt) this;
            C344527s0 r2 = r3.A05;
            if (r2 != null) {
                r3.A0A = new CountDownLatch(1);
                r3.A06.A01.sendEmptyMessage(3);
                C344557s3 r0 = r2.A00;
                if (r0 != null) {
                    r0.release();
                    r2.A00 = null;
                }
                C344507ry r22 = r2.A01;
                C344517rz r32 = C344507ry.A05;
                boolean z = false;
                Map map = r22.A00;
                Object obj = map.get(r32);
                if (obj != null) {
                    z = obj;
                }
                boolean booleanValue = ((Boolean) z).booleanValue();
                C344557s3 r02 = (C344557s3) map.remove(C344507ry.A0B);
                if (booleanValue && r02 != null) {
                    r02.release();
                }
            }
        } else if (this instanceof C345157t1) {
            C345157t1 r33 = (C345157t1) this;
            r33.A02 = false;
            C344647sC r03 = r33.A01;
            if (r03 != null) {
                r03.A01.sendEmptyMessage(3);
            }
        } else if (this instanceof C345567tj) {
            C345567tj r34 = (C345567tj) this;
            C343717qg r1 = C345547th.A00;
            C343837qt r04 = r34.A00;
            r04.getClass();
            C343697qe Ape = r04.Ape(r1);
            0qQ.A07(Ape);
            C345547th r12 = (C345547th) Ape;
            C344337rh r05 = r34.A02;
            if (r05 == null) {
                r05 = new AU1(r34);
                r34.A02 = r05;
            }
            r12.EES(r05);
        } else if (this instanceof C345617to) {
            C345617to r35 = (C345617to) this;
            r35.A04.EEg(r35.A05);
        } else if (this instanceof C380749Zj) {
            C380749Zj r36 = (C380749Zj) this;
            synchronized (r36) {
                TextureView textureView = r36.A05;
                r36.A05 = null;
                for (C344337rh DZH : r36.A00.A00) {
                    DZH.DZH(r36.A05);
                }
                if (textureView != null) {
                    textureView.setSurfaceTextureListener((TextureView.SurfaceTextureListener) null);
                }
                C346027uT r06 = r36.A06;
                r36.A06 = null;
                if (r06 != null) {
                    r06.A01();
                }
            }
        } else {
            if (this instanceof C345637tq) {
                aIm = ((C345637tq) this).A00;
            } else if (this instanceof C345657ts) {
                C345657ts r37 = (C345657ts) this;
                r37.A02 = null;
                r37.A0B.A00();
                aIm = r37.A00;
            } else if (this instanceof C345707tx) {
                C345707tx r38 = (C345707tx) this;
                C345707tx.A05(r38);
                C343717qg r13 = C345757u2.A04;
                C343837qt r07 = r38.A00;
                r07.getClass();
                if (r07.CQN(r13)) {
                    C343837qt r08 = r38.A00;
                    r08.getClass();
                    C380729Zh r09 = (C380729Zh) ((C345757u2) r08.Ape(r13));
                    r09.A05 = null;
                    r09.A06 = null;
                    r09.A04 = null;
                }
                C343717qg r14 = C345877uE.A00;
                C343837qt r010 = r38.A00;
                r010.getClass();
                if (r010.CQN(r14)) {
                    C343837qt r011 = r38.A00;
                    r011.getClass();
                    C345877uE r012 = (C345877uE) r011.Ape(r14);
                    C41790B0t b0t = r38.A0C;
                    if (b0t == null) {
                        b0t = new ARM(r38);
                        r38.A0C = b0t;
                    }
                    ((C345867uD) r012).A04.A02(b0t);
                    return;
                }
                return;
            } else {
                return;
            }
            if (C39904AIm.A03(aIm)) {
                aIm.A0C.clear();
                aIm.A0D.clear();
                aIm.A08.clear();
                aIm.A07.clear();
                aIm.A09.clear();
                return;
            }
            aIm.A06.post(new C40727AiE(aIm));
        }
    }

    public final Object A09(C343667qb r2, Object obj) {
        C343837qt r0 = this.A00;
        r0.getClass();
        Object Apu = r0.Apu(r2);
        if (Apu != null) {
            return Apu;
        }
        return obj;
    }

    public final void APC() {
    }

    public final void ARH() {
    }

    public C343717qg BJt() {
        if (this instanceof C344457rt) {
            return C344477rv.A01;
        }
        if (this instanceof C345157t1) {
            C343717qg r0 = C345167t2.A01;
            0qQ.A08(r0);
            return r0;
        } else if (this instanceof C345567tj) {
            C343717qg r02 = C345577tk.A01;
            0qQ.A08(r02);
            return r02;
        } else if (this instanceof C380729Zh) {
            return C345757u2.A04;
        } else {
            if (!(this instanceof C380719Zg)) {
                if (this instanceof C380699Ze) {
                    return B3T.A01;
                }
                if (this instanceof C345617to) {
                    return C345627tp.A00;
                }
                if (this instanceof C380739Zi) {
                    C343717qg r03 = B3P.A00;
                    0qQ.A08(r03);
                    return r03;
                } else if (this instanceof C380749Zj) {
                    C343717qg r04 = C345547th.A00;
                    0qQ.A08(r04);
                    return r04;
                } else if (this instanceof C345667tt) {
                    return C345677tu.A00;
                } else {
                    if (this instanceof C345687tv) {
                        return C345697tw.A00;
                    }
                    if (!(this instanceof C380709Zf)) {
                        throw new UnsupportedOperationException("getKey() not supported");
                    }
                }
            }
            C343717qg r05 = C345777u4.A00;
            0qQ.A08(r05);
            return r05;
        }
    }

    public final void E3N() {
    }

    public final void EAf() {
    }

    public final void EIx() {
        C346027uT r0;
        if (this instanceof C345157t1) {
            C345157t1 r02 = (C345157t1) this;
            r02.A02 = true;
            C344647sC r03 = r02.A01;
            if (r03 != null) {
                r03.A01.sendEmptyMessage(1);
                return;
            }
            return;
        }
        if (this instanceof C344457rt) {
            C344457rt r2 = (C344457rt) this;
            if (r2.A05 != null) {
                r2.A06.A01.sendEmptyMessage(1);
            }
        } else if ((this instanceof C380749Zj) && (r0 = ((C380749Zj) this).A06) != null) {
            r0.A0D = true;
        }
    }

    public final void pause() {
        C346027uT r0;
        C344647sC r2;
        if (this instanceof C345157t1) {
            C345157t1 r02 = (C345157t1) this;
            r02.A02 = false;
            r2 = r02.A01;
            if (r2 != null) {
                C344767sO r03 = r02.A00;
                if (r03 != null) {
                    r03.A0d = false;
                    Handler handler = r03.A02;
                    if (handler != null) {
                        handler.removeMessages(3);
                    }
                }
            } else {
                return;
            }
        } else {
            if (this instanceof C344457rt) {
                C344457rt r22 = (C344457rt) this;
                if (r22.A05 != null) {
                    r2 = r22.A06;
                } else {
                    return;
                }
            } else if ((this instanceof C380749Zj) && (r0 = ((C380749Zj) this).A06) != null) {
                r0.A0D = false;
                return;
            } else {
                return;
            }
        }
        boolean z = r2.A06;
        C344567s4 r1 = r2.A04;
        if (!z) {
            r1.A02();
        } else if (r1.A0A) {
            r1.A0F = true;
        }
        r2.A01.sendEmptyMessage(2);
    }

    public static void A03(ATD atd, C343717qg r1, Object obj, int i) {
        C345197t5 r12 = ((C345157t1) ((C345167t2) atd.Ape(r1))).A03;
        ArrayList arrayList = new ArrayList(i);
        arrayList.add(obj);
        r12.A02(arrayList);
    }
}
