package X;

import android.os.Handler;
import android.view.Surface;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.7nV  reason: invalid class name and case insensitive filesystem */
public final class C341777nV implements C341717nP {
    public static final C341687nM A0H = new C341787nW();
    public Handler A00;
    public Surface A01;
    public C39777A8w A02;
    public C341667nK A03;
    public A9O A04;
    public AUM A05;
    public B3V A06;
    public Object A07;
    public boolean A08;
    public boolean A09;
    public final Handler A0A;
    public final C343967r6 A0B;
    public final C341417mq A0C;
    public final C341567nA A0D;
    public final C341797nX A0E = new C341797nX();
    public final WeakReference A0F;
    public volatile int A0G;

    public final Map AvW() {
        HashMap hashMap = new HashMap(2);
        String str = "True";
        hashMap.put("recording_video_received_data", str);
        C346027uT r0 = (C346027uT) this.A07;
        if (r0 == null || !r0.A04()) {
            str = "False";
        }
        hashMap.put("recording_video_encoding_enabled", str);
        hashMap.put("recording_video_stop_progress", String.valueOf(this.A0G));
        return hashMap;
    }

    public final synchronized void Ep5(C341667nK r2) {
        this.A03 = r2;
    }

    public final void Ey4(C341687nM r13) {
        Object obj;
        this.A0G = 0;
        if (!this.A09) {
            C341567nA r3 = this.A0D;
            r3.Cjl(19, "recording_stop_video_started");
            r3.Cjv((C391719tX) null, "stop_recording_video_started", "AbstractVideoRecordingTrack", "", (String) null, (Map) null, (long) hashCode());
        }
        C346027uT r0 = (C346027uT) this.A07;
        if (r0 != null) {
            r0.A0D = false;
        }
        C341537n7 r1 = (C341537n7) this.A0F.get();
        if (!(r1 == null || (obj = this.A07) == null)) {
            r1.EEO(obj);
        }
        this.A01 = null;
        this.A07 = null;
        this.A0G = 1;
        B3V b3v = this.A06;
        if (b3v != null) {
            b3v.Ey5(new ATO(r13, this), this.A0A);
            return;
        }
        C391719tX r2 = null;
        if (!this.A09) {
            r2 = new C391719tX(23000, "mVideoEncoder is null while stopping");
            this.A0D.Cjv(r2, "stop_recording_video_failed", "AbstractVideoRecordingTrack", "", "stop", (Map) null, (long) hashCode());
        }
        release();
        if (r2 != null) {
            r13.DCg(r2);
        } else {
            r13.onSuccess();
        }
    }

    public final void release() {
        Object obj;
        this.A0G = 3;
        this.A05 = null;
        this.A08 = false;
        C341537n7 r1 = (C341537n7) this.A0F.get();
        if (!(r1 == null || (obj = this.A07) == null)) {
            r1.EEO(obj);
        }
        this.A01 = null;
        this.A07 = null;
        if (this.A04 != null) {
            this.A04 = null;
        }
        B3V b3v = this.A06;
        if (b3v != null) {
            b3v.Ey5(A0H, this.A0A);
            this.A06 = null;
        }
        this.A0G = 4;
        C341447mt.A02(this.A00, true, false);
        this.A00 = null;
        this.A09 = true;
        this.A0G = 5;
    }

    public final Map Apr() {
        AUM aum = this.A05;
        if (aum == null) {
            return null;
        }
        HashMap hashMap = new HashMap(1);
        hashMap.put("recording_video_encoder_config_bitrate", String.valueOf(aum.A01.A00));
        return hashMap;
    }

    public final B15 BZW() {
        return this.A06;
    }

    public final Map BiV() {
        HashMap hashMap = new HashMap();
        C341797nX r5 = this.A0E;
        hashMap.put("recording_video_encoder_mimetype", r5.A08);
        hashMap.put("recording_video_encoder_config_bitrate", String.valueOf(r5.A00));
        hashMap.put("perf_frame_count", String.valueOf(r5.A03));
        hashMap.put("recording_video_avg_fps", String.valueOf((int) ((((long) r5.A03) * 1000) / (System.currentTimeMillis() - r5.A04))));
        hashMap.put("frame_drop_count", String.valueOf(Long.valueOf(r5.A05)));
        hashMap.put("frame_drop_count_per_bucket", r5.A09.toString());
        return hashMap;
    }

    public final C341767nU CAE() {
        return C341767nU.VIDEO;
    }

    public final boolean CQQ() {
        return this.A08;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x007c, code lost:
        if (r7.CTO(124) == false) goto L_0x007e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00b3, code lost:
        if ((X.182.A01(X.0Tu.A06, r4, 36593314635449439L) + X.182.A01(X.0Tu.A05, r4, 36593314635646048L)) > 100) goto L_0x00b5;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0100  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void E3u(X.C341737nR r23, X.C343477qH r24) {
        /*
            r22 = this;
            r3 = r24
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            r2 = r22
            X.AUM r0 = r2.A05
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x003f
            java.lang.String r1 = "true"
        L_0x0013:
            java.lang.String r0 = "recording_prepare_with_same_config"
            r4.put(r0, r1)
            X.7nA r13 = r2.A0D
            java.lang.String r16 = "AbstractVideoRecordingTrack"
            int r0 = r2.hashCode()
            long r0 = (long) r0
            r14 = 0
            java.lang.String r15 = "prepare_recording_video_started"
            java.lang.String r17 = ""
            r18 = r14
            r19 = r4
            r20 = r0
            r13.Cjv(r14, r15, r16, r17, r18, r19, r20)
            X.AUM r0 = r2.A05
            boolean r0 = r3.equals(r0)
            r6 = r23
            if (r0 == 0) goto L_0x0042
            android.os.Handler r0 = r2.A0A
            X.C18091VlL.A00(r0, r6)
            return
        L_0x003f:
            java.lang.String r1 = "false"
            goto L_0x0013
        L_0x0042:
            r1 = 19
            java.lang.String r0 = "recording_prepare_video_started"
            r13.Cjl(r1, r0)
            r2.release()
            r9 = 0
            r2.A09 = r9
            X.AUM r3 = (X.AUM) r3
            r2.A05 = r3
            java.lang.String r0 = "VideoRecordingThread"
            android.os.Handler r0 = X.C341447mt.A01(r0)
            r2.A00 = r0
            X.AUM r8 = r2.A05
            X.A9O r0 = new X.A9O
            r0.<init>(r2)
            r2.A04 = r0
            X.A9v r1 = r8.A01
            X.7r6 r7 = r2.A0B
            r0 = 125(0x7d, float:1.75E-43)
            boolean r0 = r7.CTO(r0)
            boolean r0 = X.C346447vB.A02(r1, r0)
            r12 = 1
            if (r0 == 0) goto L_0x007e
            r0 = 124(0x7c, float:1.74E-43)
            boolean r0 = r7.CTO(r0)
            r5 = 1
            if (r0 != 0) goto L_0x007f
        L_0x007e:
            r5 = 0
        L_0x007f:
            r0 = 123(0x7b, float:1.72E-43)
            boolean r1 = r7.CTO(r0)
            X.A9v r0 = r8.A01
            boolean r0 = X.C346447vB.A01(r7, r0)
            if (r0 == 0) goto L_0x0108
            if (r1 != 0) goto L_0x00b5
            boolean r0 = r7 instanceof X.C343947r4
            if (r0 == 0) goto L_0x0108
            r0 = r7
            X.7r4 r0 = (X.C343947r4) r0
            com.instagram.common.session.UserSession r4 = r0.A00
            X.0Tu r3 = X.0Tu.A06
            r0 = 36593314635449439(0x82016d0000045f, double:3.2050977526846166E-306)
            long r10 = X.182.A01(r3, r4, r0)
            X.0Tu r3 = X.0Tu.A05
            r0 = 36593314635646048(0x82016d00030460, double:3.205097752808953E-306)
            long r0 = X.182.A01(r3, r4, r0)
            long r10 = r10 + r0
            r3 = 100
            int r0 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x0108
        L_0x00b5:
            if (r5 == 0) goto L_0x0100
            java.lang.String r5 = "video/av01"
        L_0x00b9:
            X.7nX r1 = r2.A0E
            r1.A08 = r5
            X.A9v r0 = r8.A01
            int r0 = r0.A00
            r1.A00 = r0
            r3 = 0
            r1.A04 = r3
            r1.A03 = r9
            java.util.List r0 = r1.A09
            r0.clear()
            r1.A05 = r3
            r0 = 90
            boolean r1 = r7.CTO(r0)
            r0 = 1006(0x3ee, float:1.41E-42)
            X.A9v r15 = r8.A01
            X.A9O r14 = r2.A04
            android.os.Handler r12 = r2.A00
            int r17 = r7.Ar5(r0)
            if (r1 == 0) goto L_0x00f8
            X.XyC r11 = new X.XyC
            r16 = r5
            r11.<init>(r12, r13, r14, r15, r16, r17)
        L_0x00eb:
            r2.A06 = r11
            X.ATQ r1 = new X.ATQ
            r1.<init>(r6, r2, r5)
            android.os.Handler r0 = r2.A0A
            r11.E3o(r1, r0)
            return
        L_0x00f8:
            X.XyB r11 = new X.XyB
            r16 = r5
            r11.<init>(r12, r13, r14, r15, r16, r17)
            goto L_0x00eb
        L_0x0100:
            if (r12 == 0) goto L_0x0105
            java.lang.String r5 = "video/hevc"
            goto L_0x00b9
        L_0x0105:
            java.lang.String r5 = "video/avc"
            goto L_0x00b9
        L_0x0108:
            r12 = 0
            goto L_0x00b5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C341777nV.E3u(X.7nR, X.7qH):void");
    }

    public final void EwK(C341687nM r20, C39777A8w a8w) {
        C341567nA r5 = this.A0D;
        r5.Cjl(19, "recording_start_video_started");
        r5.Cjv((C391719tX) null, "start_recording_video_started", "AbstractVideoRecordingTrack", "", (String) null, (Map) null, (long) hashCode());
        this.A02 = a8w;
        B3V b3v = this.A06;
        C341687nM r4 = r20;
        if (b3v != null) {
            b3v.EwJ(new ATT(r4, this), this.A0A);
            return;
        }
        C391719tX r11 = new C391719tX(23000, "mVideoEncoder is null while starting");
        r5.Cjv(r11, "start_recording_video_failed", "AbstractVideoRecordingTrack", "", "start", (Map) null, (long) hashCode());
        release();
        r4.DCg(r11);
    }

    public final void Ewx(A3P a3p) {
        A9O a9o = this.A04;
        if (a9o != null) {
            a9o.A00 = a3p;
        }
        C346027uT r1 = (C346027uT) this.A07;
        if (r1 != null) {
            r1.A0D = true;
        }
    }

    public C341777nV(Handler handler, C341537n7 r3, C343967r6 r4, C341417mq r5, C341567nA r6) {
        this.A0A = handler;
        this.A0F = new WeakReference(r3);
        this.A0D = r6;
        this.A0B = r4;
        this.A0C = r5;
        this.A09 = true;
    }
}
