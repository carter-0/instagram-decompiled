package X;

import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import org.webrtc.HardwareVideoEncoderFactory;

/* renamed from: X.7tR  reason: invalid class name and case insensitive filesystem */
public final class C345407tR extends C345357tM implements C345417tS {
    public C345297tG A00;
    public ADm A01;
    public C341647nI A02;
    public Boolean A03;
    public Integer A04;
    public CountDownLatch A05;
    public C341337mi A06;
    public final C341337mi A07;
    public final C341337mi A08 = new Object();
    public final C344037rD A09;
    public final C343967r6 A0A;
    public final StringBuffer A0B;
    public final AtomicBoolean A0C;
    public volatile C382309dU A0D;
    public volatile Integer A0E = AnonymousClass05K.A0C;
    public volatile boolean A0F;

    public static C343467qG A00(C343967r6 r8, ADm aDm, Integer num, Integer num2, boolean z) {
        Integer num3;
        C343967r6 r2 = r8;
        int i = 44100;
        if (r8.CTP(74)) {
            i = 48000;
        }
        Integer valueOf = Integer.valueOf(i);
        int i2 = 1;
        if (r8.CTP(77)) {
            i2 = 2;
        }
        Integer valueOf2 = Integer.valueOf(i2);
        Integer num4 = num;
        if (num2 == null || num == null) {
            num3 = null;
        } else {
            num3 = Integer.valueOf(num2.intValue() * i2 * C39902AIk.A00(num.intValue()));
        }
        ADm aDm2 = aDm;
        if (z) {
            return new C343467qG(r2, aDm2, valueOf, num4, valueOf2, (Integer) null, num3);
        }
        return new C343467qG(r2, aDm2, valueOf, num4, valueOf2, (Integer) null, num3);
    }

    public final void A09() {
        this.A0B.append("init,");
        C341337mi r0 = this.A07;
        C343837qt r1 = this.A00;
        r0.CMZ(r1);
        this.A08.CMZ(r1);
        this.A03 = (Boolean) r1.Apt(C342937pP.A02);
        this.A00 = (C345297tG) r1.Ape(C345297tG.A00);
        this.A02 = ((C345287tF) this.A00).A01;
        ((C344397rn) r1.Ape(C344397rn.A00)).EqK(new C341817nZ(this));
        this.A0F = true;
        this.A04 = AnonymousClass05K.A01;
    }

    public final C345277tE BJs() {
        return C345417tS.A00;
    }

    public final String Bz9() {
        String str;
        StringBuilder sb = new StringBuilder();
        Integer num = this.A04;
        if (num != null) {
            switch (num.intValue()) {
                case 1:
                    str = "STOPPED";
                    break;
                case 2:
                    str = "STARTING";
                    break;
                case 3:
                    str = "STARTING_OPTIC_STARTED";
                    break;
                case 4:
                    str = "RECORDING";
                    break;
                case 5:
                    str = "STOPPING";
                    break;
                case 6:
                    str = "STOPPING_OPTIC_STOPPED";
                    break;
                case 7:
                    str = "RELEASING";
                    break;
                case 8:
                    str = "RELEASED";
                    break;
                default:
                    str = AnonymousClass000.A00(4380);
                    break;
            }
        } else {
            str = "null";
        }
        sb.append(str);
        sb.append(" ");
        sb.append(this.A0B);
        return sb.toString();
    }

    public final boolean CaT() {
        if (!this.A0F) {
            return false;
        }
        return this.A06.CaT();
    }

    public final void Exo(ADm aDm, LOF lof, A6Z a6z) {
        C341337mi r0;
        this.A0B.append("start,");
        C344037rD r2 = this.A09;
        C393079vr.A00(r2, "ArVideoCaptureCoordinator", (long) hashCode());
        if (!this.A0F) {
            C391719tX r3 = new C391719tX((int) HardwareVideoEncoderFactory.QCOM_VP8_KEY_FRAME_INTERVAL_ANDROID_M_MS, "Video recording not initialized. Cannot start.");
            r2.Cjw(r3, "recording_controller_error", "ArVideoCaptureCoordinator", "", "high", "startVideoRecording", (long) hashCode());
            a6z.A01.A01(r3);
            return;
        }
        AV8 av8 = new AV8(this, a6z, new boolean[]{false});
        if (this.A0C.compareAndSet(false, true)) {
            this.A04 = AnonymousClass05K.A0C;
            Boolean bool = aDm.A00;
            if (bool != null) {
                this.A06.ARW(bool.booleanValue());
            }
            this.A0D = null;
            this.A01 = aDm;
            Number number = (Number) lof.A00(LOF.A0B);
            if (number == null || number.intValue() != 2) {
                r0 = this.A07;
            } else {
                r0 = this.A08;
            }
            this.A06 = r0;
            r0.Exp(av8, lof);
            return;
        }
        av8.DxB(new C391719tX((int) HardwareVideoEncoderFactory.QCOM_VP8_KEY_FRAME_INTERVAL_ANDROID_M_MS, "Duplicated request from product"));
    }

    public final void EyS(Integer num) {
        Integer num2;
        this.A0B.append("stop,");
        if (this.A0F) {
            C344037rD r2 = this.A09;
            0qQ.A0B(r2, 0);
            r2.Cjx("recording_stop_requested", "ArVideoCaptureCoordinator", "", (Map) null, (long) hashCode());
            r2.DD7(19, "recording_stop_requested");
            if (num.intValue() != 0) {
                num2 = AnonymousClass05K.A01;
            } else {
                num2 = AnonymousClass05K.A00;
            }
            this.A0E = num2;
            this.A04 = AnonymousClass05K.A0j;
            this.A06.EyQ();
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.7mi, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v0, types: [X.7mi, java.lang.Object] */
    public C345407tR(C343837qt r4) {
        super(r4);
        StringBuffer stringBuffer = new StringBuffer();
        this.A0B = stringBuffer;
        ? obj = new Object();
        this.A07 = obj;
        this.A06 = obj;
        this.A0F = false;
        this.A0C = new AtomicBoolean(false);
        this.A04 = AnonymousClass05K.A00;
        C343937r3 r0 = C343967r6.A00;
        C343837qt r1 = this.A00;
        this.A0A = (C343967r6) r1.Apf(r0);
        this.A09 = (C344037rD) r1.Apf(C344037rD.A00);
        stringBuffer.append("ctor,");
    }
}
