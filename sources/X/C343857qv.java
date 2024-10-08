package X;

import android.os.Handler;
import com.facebook.onecamera.outputcontrollers.camera.basic.BasicCameraOutputController;
import com.facebook.onecamera.outputcontrollers.touchgesture.basic.BasicTouchGestureOutputController;
import java.util.List;
import org.webrtc.HardwareVideoEncoderFactory;

/* renamed from: X.7qv  reason: invalid class name and case insensitive filesystem */
public abstract class C343857qv implements C343707qf {
    public boolean A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;

    public static C345817u8 A02(ATD atd, C343717qg r4, boolean z) {
        atd.A01(new C344387rm(atd, false, z), r4);
        atd.A01(new C380749Zj(atd), C345547th.A00);
        atd.A01(new C344457rt(atd), C344477rv.A01);
        return new C345817u8(atd, false);
    }

    public void A09() {
    }

    public final void A05() {
        C341147mP r2;
        C341127mN r0;
        if (this instanceof C345517te) {
            C345517te r22 = (C345517te) this;
            C342907pM r02 = (C342907pM) r22.A00.Apt(C344267ra.A00);
            if (r02 != null) {
                r22.A00 = r02;
            }
        } else if (this instanceof C343847qu) {
            for (C343707qf connect : ((C343847qu) this).A00) {
                connect.connect();
            }
        } else if (this instanceof C344387rm) {
            C344387rm.A01((C344387rm) this);
        } else if (this instanceof C345247tB) {
            A08();
        } else if (this instanceof C345227t8) {
            C345227t8.A00((C345227t8) this);
        } else if (this instanceof C344307re) {
            C344307re r23 = (C344307re) this;
            if (!r23.A00) {
                r23.A00 = true;
                C340547lR r3 = r23.A02;
                C340507lN r1 = r23.A04;
                r1.hashCode();
                r3.A0M.A01(r1);
                C342927pO r03 = C340437lG.A00;
                C343837qt r5 = r23.A00;
                Number number = (Number) r5.Apt(r03);
                if (number != null) {
                    r3.A08(number.intValue());
                }
                C340147km r12 = (C340147km) r5.Apt(C340437lG.A02);
                if (r12 != null) {
                    r3.A0C(r12);
                }
                C340167ko r04 = (C340167ko) r5.Apt(C340437lG.A01);
                if (r04 == null) {
                    r04 = C344307re.A00(r12);
                }
                r3.A06 = r04;
                C340467lJ r24 = r3.A0O;
                r24.EpA(!r5.CQN(C344397rn.A00));
                Boolean bool = (Boolean) r5.Apt(C340437lG.A03);
                if (bool != null) {
                    boolean booleanValue = bool.booleanValue();
                    r3.A0F = booleanValue;
                    r3.A0N.EdB(booleanValue);
                }
                C340337l6 r05 = (C340337l6) r5.Apt(C340437lG.A04);
                if (r05 != null) {
                    r24.Eea(r05);
                }
                r3.A0F(true);
            }
        } else if (this instanceof C345797u6) {
            C345797u6 r13 = (C345797u6) this;
            r13.A00 = 2;
            List list = r13.A02.A00;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ((C364988mL) list.get(i)).A0K = true;
            }
        } else {
            if (this instanceof C345817u8) {
                C345817u8 r14 = (C345817u8) this;
                if (r14.A02) {
                    r14.A03 = (C344477rv) r14.A0A(C344477rv.A01);
                    r2 = r14.A01;
                    r0 = r14.A00;
                } else {
                    return;
                }
            } else if (this instanceof C345847uB) {
                C346027uT r06 = ((C345847uB) this).A08;
                if (r06 != null) {
                    r06.A0D = true;
                    return;
                }
                return;
            } else if (this instanceof C345827u9) {
                C345827u9 r15 = (C345827u9) this;
                ((C345547th) r15.A0A(C345547th.A00)).A9s(r15);
                r2 = r15.A0J;
                if (r2 != null) {
                    r0 = r15.A0C;
                } else {
                    return;
                }
            } else if (this instanceof C345867uD) {
                C345867uD r25 = (C345867uD) this;
                C345867uD.A03(r25, new TTN(r25, 1));
                return;
            } else {
                return;
            }
            r2.EwL(r0);
        }
    }

    public final void A06() {
        if (this instanceof C343847qu) {
            for (C343707qf disconnect : ((C343847qu) this).A00) {
                disconnect.disconnect();
            }
        } else if (this instanceof C344387rm) {
            C344387rm.A00((C344387rm) this);
        } else if (this instanceof C344307re) {
            C344307re r1 = (C344307re) this;
            if (r1.A00) {
                r1.A00 = false;
                C340547lR r2 = r1.A02;
                C340507lN r12 = r1.A04;
                r12.hashCode();
                r2.A0M.A02(r12);
                r2.A04();
            }
        } else if (this instanceof C345247tB) {
            A07();
        } else if (this instanceof C345227t8) {
            C345227t8 r13 = (C345227t8) this;
            r13.A04 = false;
            r13.A03 = false;
            r13.A02 = false;
        } else if (this instanceof C345797u6) {
            C345797u6 r14 = (C345797u6) this;
            r14.A00 = 1;
            List list = r14.A02.A00;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ((C364988mL) list.get(i)).A0K = false;
            }
        } else if (this instanceof C345817u8) {
            C345817u8 r15 = (C345817u8) this;
            if (r15.A02) {
                r15.A03 = null;
                r15.A01.stop();
            }
        } else if (this instanceof C345847uB) {
            C346027uT r0 = ((C345847uB) this).A08;
            if (r0 != null) {
                r0.A0D = false;
            }
        } else if (this instanceof C345827u9) {
            C345827u9 r22 = (C345827u9) this;
            ((C345547th) r22.A0A(C345547th.A00)).EES(r22);
            C341147mP r02 = r22.A0J;
            if (r02 != null) {
                r02.stop();
            }
            r22.A0B.post(new C40741AiV(r22));
        } else if (this instanceof C345867uD) {
            C345867uD r23 = (C345867uD) this;
            C345867uD.A03(r23, new TTN(r23, 2));
        }
    }

    public final void A07() {
        C346027uT r0;
        if (this instanceof C345247tB) {
            C341427mr r02 = ((C345247tB) this).A02;
            if (r02 != null) {
                r02.A05();
            }
        } else if (this instanceof C343847qu) {
            for (C343707qf pause : ((C343847qu) this).A00) {
                pause.pause();
            }
        } else if (this instanceof C344307re) {
            ((C344307re) this).A02.A04();
        } else if (this instanceof C344387rm) {
            C344387rm.A00((C344387rm) this);
        } else if (this instanceof C341157mQ) {
            C344927se r03 = ((C341157mQ) this).A00.A0L;
            if (r03 != null) {
                C344947sg r2 = r03.A04;
                r2.A0G = false;
                r2.A08.post(r2.A0A);
            }
        } else if (this instanceof C345227t8) {
            C345227t8 r1 = (C345227t8) this;
            r1.A04 = false;
            r1.A03 = false;
            r1.A02 = false;
        } else if (this instanceof C345817u8) {
            C345817u8 r12 = (C345817u8) this;
            if (r12.A02) {
                r12.A03 = null;
                r12.A01.stop();
            }
        } else if (this instanceof C345797u6) {
            C345797u6 r13 = (C345797u6) this;
            r13.A00 = 1;
            List list = r13.A02.A00;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ((C364988mL) list.get(i)).A0K = false;
            }
        } else if ((this instanceof C345847uB) && (r0 = ((C345847uB) this).A08) != null) {
            r0.A0D = false;
        }
    }

    public final void A08() {
        C346027uT r0;
        if (this instanceof C345247tB) {
            C343427qC r2 = ((C345247tB) this).A00;
            if (r2 != null) {
                r2.A00 = 0;
            }
        } else if (this instanceof C344387rm) {
            C344387rm.A01((C344387rm) this);
        } else if (this instanceof C345227t8) {
            C345227t8.A00((C345227t8) this);
        } else if (this instanceof C343847qu) {
            for (C343707qf EIx : ((C343847qu) this).A00) {
                EIx.EIx();
            }
        } else if (this instanceof C344307re) {
            C344307re r02 = (C344307re) this;
            C340547lR r22 = r02.A02;
            C340507lN r1 = r02.A04;
            r1.hashCode();
            r22.A0M.A01(r1);
            r22.A0F(true);
        } else if (this instanceof C345817u8) {
            C345817u8 r23 = (C345817u8) this;
            if (r23.A02) {
                r23.A03 = (C344477rv) r23.A0A(C344477rv.A01);
                r23.A01.EwL(r23.A00);
            }
        } else if (this instanceof C345797u6) {
            C345797u6 r12 = (C345797u6) this;
            r12.A00 = 2;
            List list = r12.A02.A00;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ((C364988mL) list.get(i)).A0K = true;
            }
        } else if ((this instanceof C345847uB) && (r0 = ((C345847uB) this).A08) != null) {
            r0.A0D = true;
        }
    }

    public final void APC() {
        02V.A07(this.A00, "Observer cannot disable, not initialized.");
        if (this.A03) {
            this.A03 = false;
            if (this instanceof C344307re) {
                A06();
            }
        }
    }

    public final void ARH() {
        02V.A07(this.A00, "Observer cannot enable, not initialized.");
        if (!this.A03) {
            this.A03 = true;
            if (this instanceof C344307re) {
                A05();
            }
            if (this.A02 && !this.A01) {
                A05();
                this.A01 = true;
            }
        }
    }

    public final void CMP() {
        if (!this.A00) {
            this.A00 = true;
            this.A03 = true;
            this.A01 = false;
            A09();
        }
    }

    public final void CMk() {
        String str;
        boolean z;
        02V.A07(this.A00, "Observer not initialized.");
        if (this instanceof C343847qu) {
            for (C343707qf CMk : ((C343847qu) this).A00) {
                CMk.CMk();
            }
        } else if (this instanceof C345227t8) {
            C345227t8 r6 = (C345227t8) this;
            C343717qg r1 = C345607tn.A00;
            C343837qt r4 = r6.A00;
            if (r4.CQN(r1)) {
                C345607tn r12 = (C345607tn) r6.A0A(r1);
                r6.A0D = r12.Ajm();
                z = r12.Ce8();
            } else {
                C340547lR r13 = ((C344307re) ((C344327rg) r6.A0A(C344327rg.A00))).A02;
                r6.A0D = r13.A0N;
                z = false;
                if (r13.A0L == C340277l0.CAMERA2) {
                    z = true;
                }
            }
            r6.A05 = z;
            if (r6.A0D != null) {
                r6.A0D.A8q(r6.A06);
            }
            C343717qg r3 = C345167t2.A01;
            r6.A0C = (C345167t2) r6.A0A(r3);
            r6.A00 = C341887ng.A00(r4.getContext(), r6.A09);
            ((C344397rn) r6.A0A(C344397rn.A00)).Eeo(C341897nh.A00, r6.A00);
            C345157t1 r0 = (C345157t1) ((C345167t2) r6.A0A(r3));
            C345157t1.A00(r0);
            C344767sO r02 = r0.A03.A02;
            if (r02 != null) {
                r02.A0K.EBc(r6.A07, C344877sZ.CONFIGURATION);
                C345157t1 r03 = (C345157t1) ((C345167t2) r6.A0A(r3));
                C345157t1.A00(r03);
                C344767sO r04 = r03.A03.A02;
                if (r04 != null) {
                    C344837sV r05 = r04.A0K;
                    C344887sa r32 = r6.A08;
                    C344867sY r2 = r05.A01;
                    r2.A01[r32.Blu().ordinal()] = r32;
                    C344867sY.A00(r2);
                    return;
                }
                throw new IllegalStateException("Required value was null.");
            }
            throw new IllegalStateException("Required value was null.");
        } else if (this instanceof C345727tz) {
            C345727tz r62 = (C345727tz) this;
            B3P b3p = r62.A05;
            Integer num = r62.A07;
            C341567nA r8 = r62.A0F;
            Handler handler = r62.A09;
            C344467ru r10 = (C344467ru) b3p;
            0qQ.A0B(num, 0);
            0qQ.A0B(r8, 1);
            0qQ.A0B(handler, 2);
            int intValue = num.intValue();
            if (intValue == 0) {
                C343937r3 r5 = C343967r6.A00;
                C343837qt r06 = r10.A00;
                r06.getClass();
                C343917r1 Apf = r06.Apf(r5);
                0qQ.A07(Apf);
                C343967r6 r42 = (C343967r6) Apf;
                C343717qg r14 = C345167t2.A01;
                C343837qt r07 = r10.A00;
                r07.getClass();
                C343697qe Ape = r07.Ape(r14);
                0qQ.A07(Ape);
                C345207t6 r33 = ((C345157t1) ((C345167t2) Ape)).A03.A07;
                0qQ.A07(r33);
                C343717qg r15 = C345627tp.A00;
                C343837qt r08 = r10.A00;
                r08.getClass();
                C343697qe Ape2 = r08.Ape(r15);
                0qQ.A0C(Ape2, "null cannot be cast to non-null type com.facebook.cameracore.litecamera.videocapture.internal.VideoCaptureControllerImpl");
                C345727tz r9 = (C345727tz) Ape2;
                C343717qg r11 = C344477rv.A01;
                C343837qt r09 = r10.A00;
                r09.getClass();
                if (r09.CQN(r11)) {
                    C343717qg r16 = AnonymousClass7t9.A00;
                    C343837qt r010 = r10.A00;
                    r010.getClass();
                    if (r010.CQN(r16)) {
                        C343837qt r011 = r10.A00;
                        r011.getClass();
                        ((C344477rv) r011.Ape(r11)).BQ8();
                        C343837qt r012 = r10.A00;
                        r012.getClass();
                        r012.Ape(r16);
                    }
                }
                C341537n7 r013 = r9.A0A;
                0qQ.A07(r013);
                C341647nI A002 = C392899vY.A00(handler, r013, r33, r42, r8);
                AVA ava = r62.A0B;
                C343967r6 r014 = r62.A0D;
                if (r014 == null) {
                    r014 = (C343967r6) r62.A00.Apf(r5);
                }
                ADm aDm = r62.A0E;
                ava.A00 = r014;
                ava.A01 = aDm;
                C341647nI r17 = ava.A02;
                if (r17 != null) {
                    Handler handler2 = r17.A00;
                    handler2.sendMessage(handler2.obtainMessage(5, new Object[0]));
                }
                ava.A02 = A002;
                return;
            }
            if (1 - intValue != 0) {
                str = "NORMAL";
            } else {
                str = "BOOMERANG";
            }
            throw new IllegalArgumentException(002.A0R("RecordingController type not supported: ", str));
        }
    }

    public final void E3N() {
        02V.A07(this.A00, "Observer not initialized.");
        if (this instanceof C343847qu) {
            for (C343707qf E3N : ((C343847qu) this).A00) {
                E3N.E3N();
            }
        } else if (this instanceof C345437tU) {
            C345437tU r2 = (C345437tU) this;
            Object Apt = r2.A00.Apt(C344247rY.A00);
            if (Apt != null) {
                r2.A01.A01(Apt);
            }
        }
    }

    public final void EAf() {
        02V.A07(this.A00, "Observer cannot reconfigure, not initialized.");
        if (this.A02) {
            if (this instanceof C343847qu) {
                for (C343707qf EAf : ((C343847qu) this).A00) {
                    EAf.EAf();
                }
            } else if (this instanceof C344307re) {
                C344307re r4 = (C344307re) this;
                if (r4.A00) {
                    C342927pO r0 = C340437lG.A00;
                    C343837qt r3 = r4.A00;
                    Number number = (Number) r3.Apt(r0);
                    if (number != null) {
                        r4.A02.A08(number.intValue());
                    }
                    C340147km r2 = (C340147km) r3.Apt(C340437lG.A02);
                    if (r2 != null) {
                        r4.A02.A0C(r2);
                    }
                    C340167ko r1 = (C340167ko) r3.Apt(C340437lG.A01);
                    if (r1 != null) {
                        r4.A02.A06 = r1;
                        return;
                    }
                    r4.A02.A06 = C344307re.A00(r2);
                }
            }
        }
    }

    public final void EIx() {
        02V.A07(this.A00, "Observer cannot resume, not initialized.");
        if (this.A02) {
            A08();
        }
    }

    public final void connect() {
        02V.A07(this.A00, "Observer not initialized.");
        if (!this.A02) {
            this.A02 = true;
            if (this.A03) {
                A05();
                this.A01 = true;
            }
        }
    }

    public final void disconnect() {
        02V.A07(this.A00, "Observer not initialized.");
        if (this.A02) {
            if (this.A01) {
                A06();
                this.A01 = false;
            }
            this.A02 = false;
        }
    }

    public final void pause() {
        02V.A07(this.A00, "Observer cannot pause, not initialized.");
        if (this.A02) {
            A07();
        }
    }

    public final void release() {
        C345547th r1;
        C344337rh r0;
        if (this.A00) {
            if (this instanceof C345467tX) {
                C345467tX r2 = (C345467tX) this;
                r2.A00 = null;
                r2.A01 = null;
            } else if (this instanceof C343847qu) {
                for (C343707qf release : ((C343847qu) this).A00) {
                    release.release();
                }
            } else if (this instanceof BasicTouchGestureOutputController) {
                ((BasicTouchGestureOutputController) this).A01 = null;
            } else if (this instanceof BasicCameraOutputController) {
                BasicCameraOutputController basicCameraOutputController = (BasicCameraOutputController) this;
                C340547lR r02 = basicCameraOutputController.A04;
                if (r02 != null) {
                    r02.A0N.EWv((C365938nv) null);
                }
                basicCameraOutputController.A04 = null;
            } else if (this instanceof C345437tU) {
                C345437tU r22 = (C345437tU) this;
                C340547lR r03 = r22.A00;
                if (r03 != null) {
                    C340507lN r12 = r22.A02;
                    r12.hashCode();
                    r03.A0M.A02(r12);
                    r12.D99(r22.A00);
                    r22.A00 = null;
                }
                C343717qg r3 = C344397rn.A00;
                C343837qt r13 = r22.A00;
                if (r13.CQN(r3)) {
                    ((C344397rn) r13.Ape(r3)).Egk((C341837nb) null);
                }
                r22.A01.A00();
            } else if (this instanceof C345287tF) {
                C345287tF r23 = (C345287tF) this;
                r23.A01 = null;
                r23.A00 = null;
            } else if (this instanceof C344387rm) {
                C344387rm r24 = (C344387rm) this;
                r24.A0O.A00();
                r24.A0S = null;
            } else if (this instanceof C344347ri) {
                C344347ri r25 = (C344347ri) this;
                r25.A05 = null;
                r25.A04 = null;
                r25.A06 = null;
            } else if (this instanceof C344307re) {
                C344307re r26 = (C344307re) this;
                C343717qg r14 = C345547th.A00;
                if (r26.A00.CQN(r14)) {
                    ((C345547th) r26.A0A(r14)).EES(r26.A01);
                }
                C340547lR r04 = r26.A02;
                C340537lQ r15 = r04.A0R;
                if (r04.A0S) {
                    r15.A01 = null;
                } else {
                    r15.A02 = null;
                }
                r26.A03.release();
            } else if (this instanceof C344367rk) {
                ((C344367rk) this).A03 = null;
            } else if (this instanceof C345247tB) {
                C345247tB r27 = (C345247tB) this;
                C341427mr r05 = r27.A02;
                if (r05 != null) {
                    r05.A05();
                    r05.A04();
                }
                r27.A03 = null;
                r27.A02 = null;
            } else if (this instanceof C345227t8) {
                C345227t8 r28 = (C345227t8) this;
                if (r28.A0D != null) {
                    r28.A0D.EDo(r28.A06);
                }
                r28.A0D = null;
                r28.A0C = null;
            } else if (this instanceof C345407tR) {
                C345407tR r29 = (C345407tR) this;
                r29.A0B.append("rel,");
                r29.A0F = false;
                r29.A04 = AnonymousClass05K.A15;
                if (r29.A02 != null) {
                    if (r29.A0C.get()) {
                        r29.A09.Cjw(new C391719tX((int) HardwareVideoEncoderFactory.QCOM_VP8_KEY_FRAME_INTERVAL_ANDROID_M_MS, "Component released while recording"), "recording_controller_error", "ArVideoCaptureCoordinator", "", "high", "release", (long) r29.hashCode());
                    }
                    r29.A02.A01();
                    Handler handler = r29.A02.A00;
                    handler.sendMessage(handler.obtainMessage(5, new Object[0]));
                }
                r29.A07.release();
                r29.A08.release();
                r29.A02 = null;
                r29.A03 = null;
                r29.A04 = AnonymousClass05K.A1F;
            } else if (this instanceof C345387tP) {
                C345387tP r210 = (C345387tP) this;
                r210.A04 = null;
                r210.A02 = null;
                r210.A03 = null;
            } else if (this instanceof C345367tN) {
                ((C345367tN) this).A00 = null;
            } else if (this instanceof C345797u6) {
                C345797u6 r211 = (C345797u6) this;
                r211.A00 = 0;
                List list = r211.A02.A00;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    ((C364988mL) list.get(i)).A03();
                }
            } else if (this instanceof C345517te) {
                ((C344477rv) ((C345477tY) this).A00.Ape(C344477rv.A01)).EiV((C345537tg) null);
            } else if (this instanceof C379089Sl) {
                C379089Sl r212 = (C379089Sl) this;
                r212.A00 = null;
                r212.A02 = null;
            } else if (this instanceof C345847uB) {
                C345847uB.A00((C345847uB) this);
            } else if (this instanceof C382429dg) {
                ((C382429dg) this).A00 = null;
            } else if (this instanceof C379879Vr) {
                ((C379879Vr) this).A01 = null;
            } else if (this instanceof C345827u9) {
                C345827u9 r213 = (C345827u9) this;
                r213.A0J = null;
                r213.A0E.A00();
                r213.A0D.A00();
                r213.A0B.post(new AiW(r213));
            } else {
                if (this instanceof C382259dP) {
                    C382259dP r214 = (C382259dP) this;
                    C343717qg r16 = C345547th.A00;
                    if (r214.A00.CQN(r16)) {
                        r1 = (C345547th) r214.A0A(r16);
                        r0 = r214.A02;
                    }
                } else if (this instanceof C345727tz) {
                    C345727tz r215 = (C345727tz) this;
                    C344397rn r17 = r215.A06;
                    if (r17 != null) {
                        r17.EEg(r215.A0C);
                    }
                    AVA ava = r215.A0B;
                    C341647nI r18 = ava.A02;
                    if (r18 != null) {
                        Handler handler2 = r18.A00;
                        handler2.sendMessage(handler2.obtainMessage(5, new Object[0]));
                    }
                    ava.A02 = null;
                } else if (this instanceof C345867uD) {
                    C345867uD r216 = (C345867uD) this;
                    C343697qe A0A = r216.A0A(C345547th.A00);
                    0qQ.A07(A0A);
                    r1 = (C345547th) A0A;
                    r0 = (C344337rh) r216.A05.getValue();
                }
                r1.EES(r0);
            }
            this.A03 = false;
            this.A00 = false;
            this.A01 = false;
        }
    }
}
