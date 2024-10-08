package X;

import android.os.Handler;
import java.util.HashMap;
import java.util.Map;
import org.webrtc.HardwareVideoEncoderFactory;

/* renamed from: X.7nO  reason: invalid class name and case insensitive filesystem */
public final class C341707nO implements C341717nP {
    public static final C341737nR A0K = new C341727nQ();
    public Handler A00;
    public C39897ADz A01;
    public C39732A6y A02;
    public B3W A03;
    public A9N A04;
    public C343467qG A05;
    public C39777A8w A06;
    public C341667nK A07;
    public boolean A08;
    public boolean A09;
    public final Handler A0A;
    public final C341587nC A0B;
    public final C341467mw A0C;
    public final C343967r6 A0D;
    public final C341747nS A0E = new C341747nS(this);
    public final C341567nA A0F;
    public final C341417mq A0G;
    public final Runnable A0H = new C341757nT(this);
    public volatile int A0I;
    public volatile boolean A0J;

    public final Map Apr() {
        return null;
    }

    public final Map BiV() {
        HashMap hashMap = new HashMap(5);
        C39897ADz aDz = this.A01;
        if (aDz != null) {
            if (aDz.A06 > 10) {
                hashMap.put("recording_audio_avg_processing_time_ms", String.valueOf(aDz.A01()));
                hashMap.put("recording_audio_num_deadline_missed", String.valueOf(this.A01.A01));
            }
            hashMap.put("recording_audio_was_effect_on", String.valueOf(this.A01.A09));
            hashMap.put("recording_audio_frame_size_ms", String.valueOf(Math.round(((float) this.A01.A0C) / 1000000.0f)));
            hashMap.put("recording_audio_num_frames", String.valueOf(this.A01.A06));
            hashMap.put("recording_audio_samples_per_frame", String.valueOf(this.A01.A0B));
            hashMap.put("recording_audio_num_empty_reads", String.valueOf(this.A01.A02));
            hashMap.put("recording_audio_num_nonempty_reads", String.valueOf(this.A01.A03));
            hashMap.put("recording_audio_num_read_errors", String.valueOf(this.A01.A04));
            hashMap.put("recording_audio_total_bytes_read", String.valueOf(this.A01.A05));
            hashMap.put("recording_audio_bitrate", String.valueOf(this.A01.A00));
        }
        C39732A6y a6y = this.A02;
        if (a6y != null) {
            hashMap.put("recording_audio_zero_frames", String.valueOf(a6y.A04));
            hashMap.put("recording_audio_quiet_frames", String.valueOf(this.A02.A02));
            hashMap.put("recording_audio_saturated_samples", String.valueOf(this.A02.A03));
            hashMap.put("recording_audio_num_clicks", String.valueOf(this.A02.A00));
        }
        this.A01 = null;
        this.A02 = null;
        return hashMap;
    }

    public final synchronized void Ep5(C341667nK r2) {
        this.A07 = r2;
    }

    public final void Ey4(C341687nM r13) {
        this.A0I = 0;
        if (!this.A09) {
            C341567nA r3 = this.A0F;
            r3.Cjl(19, "recording_stop_audio_started");
            r3.Cjv((C391719tX) null, "stop_recording_audio_started", "AudioRecordingTrack", "", (String) null, (Map) null, (long) hashCode());
        }
        this.A0J = false;
        C341467mw r7 = this.A0C;
        r7.A01("sAT");
        ATK atk = new ATK(r13, this);
        C22252XyA xyA = new C22252XyA(this.A0A, new C391719tX((int) HardwareVideoEncoderFactory.QCOM_VP8_KEY_FRAME_INTERVAL_ANDROID_M_MS, "Timeout while removeOutput from AudioPipelineRecorder"), atk, this.A0D.Ar5(1008));
        r7.A01("roAP");
        this.A0B.EEP(xyA.A00(), xyA, this.A0E);
    }

    public final Map AvW() {
        Map AvY = this.A0B.AvY();
        if (AvY == null) {
            AvY = new HashMap(4);
        }
        String str = "True";
        String str2 = "False";
        if (this.A06 == null) {
            str2 = str;
        }
        AvY.put("recording_audio_received_data", str2);
        if (!this.A0J) {
            str = "False";
        }
        AvY.put("recording_audio_encoding_enabled", str);
        String A002 = this.A0C.A00();
        if (A002 != null) {
            AvY.put("recording_audio_encoding_calls", A002);
        }
        AvY.put("recording_audio_stop_progress", String.valueOf(this.A0I));
        B3W b3w = this.A03;
        if (b3w != null) {
            b3w.AvX(AvY);
        }
        return AvY;
    }

    public final B15 BZW() {
        return this.A03;
    }

    public final C341767nU CAE() {
        return C341767nU.AUDIO;
    }

    public final boolean CQQ() {
        return this.A08;
    }

    public final void E3u(C341737nR r19, C343477qH r20) {
        String str;
        B3W xwB;
        C343477qH r1 = r20;
        HashMap hashMap = new HashMap();
        if (r1.equals(this.A05)) {
            str = "true";
        } else {
            str = "false";
        }
        hashMap.put("recording_prepare_with_same_config", str);
        C341567nA r5 = this.A0F;
        r5.Cjv((C391719tX) null, "prepare_recording_audio_started", "AudioRecordingTrack", "", (String) null, hashMap, (long) hashCode());
        C341737nR r6 = r19;
        if (r1.equals(this.A05)) {
            C18091VlL.A00(this.A0A, r6);
            return;
        }
        r5.Cjl(19, "recording_prepare_audio_started");
        release();
        this.A09 = false;
        C343467qG r12 = (C343467qG) r1;
        this.A05 = r12;
        C343487qI r4 = r12.A00;
        int i = r4.A03;
        int i2 = r4.A02;
        C343507qK r8 = r12.A01;
        C39897ADz aDz = new C39897ADz(C39902AIk.A01(i2, r8.A03, (long) i, (long) r8.A08) * 1000, (long) ((i / C39902AIk.A00(i2)) / Integer.bitCount(r4.A01)));
        this.A01 = aDz;
        aDz.A00 = (long) r8.A01;
        aDz.A0A = true;
        this.A02 = new C39732A6y();
        this.A00 = C341447mt.A01("AudioRecordingThread");
        C341467mw r7 = this.A0C;
        r7.A01("pAT");
        C40080AQk aQk = new C40080AQk(r6, this, hashMap);
        Handler handler = this.A0A;
        A9U a9u = new A9U(handler, aQk);
        C343467qG r2 = this.A05;
        Runnable runnable = this.A0H;
        C40081AQl A002 = a9u.A00(runnable);
        if (r2 != null) {
            r7.A01("pAP");
            this.A0B.E3s(this.A00, handler, r2.A00, new ATJ(A002, this));
        }
        C343467qG r13 = this.A05;
        C40081AQl A003 = a9u.A00(runnable);
        if (r13 != null) {
            A9N a9n = new A9N(this);
            this.A04 = a9n;
            C343507qK r11 = r13.A01;
            Handler handler2 = this.A00;
            C343967r6 r122 = this.A0D;
            boolean CTO = r122.CTO(68);
            boolean CTO2 = r122.CTO(70);
            XZ8 xz8 = new XZ8(this.A0E);
            boolean CTO3 = r122.CTO(138);
            if (!CTO) {
                xwB = new C22147XwB(handler2, r11, r122, xz8, a9n, CTO3);
            } else if (CTO2) {
                xwB = new C22146XwA(handler2, r11, r122, xz8, a9n);
            } else {
                xwB = new XIK(handler2, r11, r122, xz8, a9n);
            }
            this.A03 = xwB;
            r7.A01("pAE");
            this.A03.E3t(handler, new C40076AQg(A003, this));
        }
        a9u.A01();
        this.A0J = false;
    }

    public final void EwK(C341687nM r20, C39777A8w a8w) {
        C341467mw r1 = this.A0C;
        r1.A01("stAT");
        C341567nA r5 = this.A0F;
        r5.Cjl(19, "recording_start_audio_started");
        r5.Cjv((C391719tX) null, "start_recording_audio_started", "AudioRecordingTrack", "", (String) null, (Map) null, (long) hashCode());
        this.A06 = a8w;
        this.A0J = false;
        C341687nM r3 = r20;
        if (this.A03 != null) {
            r1.A01("stAE");
            this.A03.EwW(this.A0A, new C40077AQh(r3, this));
            return;
        }
        r1.A01("stAEn");
        release();
        C391719tX r11 = new C391719tX(22000, "mAudioEncoder is null while starting");
        r5.Cjv(r11, "start_recording_audio_failed", "AudioRecordingTrack", "", "start", (Map) null, (long) hashCode());
        r3.DCg(r11);
    }

    public final void Ewx(A3P a3p) {
        A9N a9n = this.A04;
        if (a9n != null) {
            a9n.A00 = a3p;
        }
        this.A0J = true;
    }

    public final void release() {
        C341467mw r1 = this.A0C;
        r1.A01("rAT");
        this.A05 = null;
        this.A08 = false;
        r1.A01("rAP");
        this.A0B.release();
        this.A0I = 3;
        if (this.A04 != null) {
            this.A04 = null;
        }
        if (this.A03 != null) {
            r1.A01("rAE");
            this.A03.Ey7(this.A0A, A0K);
            this.A03 = null;
        }
        this.A0I = 4;
        C341447mt.A02(this.A00, true, false);
        this.A00 = null;
        this.A09 = true;
        this.A0I = 5;
    }

    public C341707nO(Handler handler, C341587nC r4, C343967r6 r5, C341417mq r6, C341567nA r7) {
        C341467mw r1 = new C341467mw();
        this.A0C = r1;
        this.A0A = handler;
        this.A0B = r4;
        this.A0F = r7;
        this.A0D = r5;
        this.A0G = r6;
        this.A09 = true;
        r1.A01("c");
    }
}
