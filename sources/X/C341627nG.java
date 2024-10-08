package X;

import android.os.Handler;
import android.os.SystemClock;
import java.lang.Thread;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import org.webrtc.HardwareVideoEncoderFactory;

/* renamed from: X.7nG  reason: invalid class name and case insensitive filesystem */
public final class C341627nG {
    public int A00;
    public long A01 = 0;
    public Handler A02;
    public C341667nK A03;
    public Integer A04 = AnonymousClass05K.A0u;
    public Map A05;
    public final Handler A06;
    public final C343967r6 A07;
    public final C341567nA A08;
    public final C341637nH A09 = new Object();
    public volatile C41827B2i A0A;

    public static void A00(C341737nR r4, C341627nG r5, List list) {
        Integer num = r5.A04;
        if (num == AnonymousClass05K.A0u) {
            for (C341717nP release : r5.A05.values()) {
                release.release();
            }
        } else if (num != AnonymousClass05K.A01) {
            r5.A06(new AUQ(r4, r5));
            return;
        }
        A01(r5, AnonymousClass05K.A00);
        A9U a9u = new A9U(r5.A02, new AQn(new C40078AQi(r4, r5), r4, r5, list));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C343477qH r2 = (C343477qH) it.next();
            C341717nP r1 = (C341717nP) r5.A05.get(r2.CAE());
            if (r1 != null) {
                r1.Ep5(r5.A03);
                r1.E3u(a9u.A00(new C40961Am7(r1, r5)), r2);
            }
        }
        a9u.A01();
    }

    public static void A01(C341627nG r1, Integer num) {
        r1.A04 = num;
        r1.A08.Eht(C378729Qz.A00(num));
    }

    public final String A02() {
        StringBuilder sb = new StringBuilder();
        for (Object append : this.A05.keySet()) {
            sb.append(append);
            sb.append(",");
        }
        return sb.toString();
    }

    public final HashMap A03() {
        HashMap hashMap = new HashMap();
        for (C341717nP AvW : this.A05.values()) {
            Map AvW2 = AvW.AvW();
            if (AvW2 != null) {
                hashMap.putAll(AvW2);
            }
        }
        C341667nK r1 = this.A03;
        HashMap hashMap2 = new HashMap(1);
        hashMap2.put("recording_muxer_stop_progress", String.valueOf(r1.A0F[0]));
        hashMap.putAll(hashMap2);
        hashMap.put("recording_contrl_stop_progress", String.valueOf(this.A00));
        return hashMap;
    }

    public final void A04(C391719tX r12) {
        C41827B2i b2i = this.A0A;
        C391719tX r3 = r12;
        if (b2i != null) {
            this.A0A = null;
            r12.A01(A03());
            this.A06.post(new C41114Aoa(r12, b2i, this));
            return;
        }
        this.A08.Cjv(r3, "recording_controller_error", "RecordingThreadController", A02(), "notifyOnDifferentThreadCaptureFailed", (Map) null, (long) hashCode());
    }

    public final void A05(AD9 ad9, C41827B2i b2i, B16 b16) {
        this.A08.Cjl(19, "recording_start_requested");
        Integer num = this.A04;
        if (num == AnonymousClass05K.A0Y) {
            A04(new C391719tX((int) HardwareVideoEncoderFactory.QCOM_VP8_KEY_FRAME_INTERVAL_ANDROID_M_MS, "Recording video has already started"));
            b16.onFinished();
        } else if (num != AnonymousClass05K.A01) {
            A06(new AUR(b16, this, num));
        } else {
            A01(this, AnonymousClass05K.A0C);
            this.A01 = 0;
            this.A0A = b2i;
            A9T a9t = new A9T(new ATN(b16, this), this.A02);
            this.A03.A05(a9t.A00(), ad9, new C39676A4s(b16, this));
            Map map = this.A05;
            int i = 0;
            for (C341717nP CQQ : map.values()) {
                if (CQQ.CQQ()) {
                    i++;
                }
            }
            AtomicInteger atomicInteger = new AtomicInteger(i);
            for (C341717nP r2 : map.values()) {
                if (r2.CQQ()) {
                    r2.EwK(a9t.A00(), new C39777A8w(r2, b16, this, atomicInteger));
                }
            }
            a9t.A01();
        }
    }

    public final void A06(B16 b16) {
        A07(new AnonymousClass9R0(b16, this));
    }

    public final void A07(B16 b16) {
        Integer num;
        long j;
        Integer num2 = this.A04;
        if (num2 == AnonymousClass05K.A0u || num2 == (num = AnonymousClass05K.A0j)) {
            b16.onFinished();
        } else if (num2 == AnonymousClass05K.A01) {
            A01(this, num);
            A06(new AUO(b16));
        } else {
            C341637nH r3 = this.A09;
            r3.A00 = this.A03;
            Thread currentThread = Thread.currentThread();
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = currentThread.getUncaughtExceptionHandler();
            if (!r3.equals(uncaughtExceptionHandler)) {
                r3.A01 = uncaughtExceptionHandler;
                currentThread.setUncaughtExceptionHandler(r3);
            }
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.A01;
            C343967r6 r4 = this.A07;
            if (r4 instanceof C343947r4) {
                C343947r4 r2 = (C343947r4) r4;
                try {
                    if (((C344037rD) r2.A00.Apf(C344037rD.A00)).BgN().equals("instagram_note")) {
                        j = 1000;
                    }
                } catch (RuntimeException unused) {
                }
                j = 182.A01(0Tu.A06, r2.A00, 36598829373984039L);
            } else {
                j = 0;
            }
            if (this.A01 > 0 && elapsedRealtime > 0 && elapsedRealtime < j && r4.CTO(118) && j > 0) {
                if (j <= 86400000) {
                    try {
                        Thread.sleep(j - elapsedRealtime);
                    } catch (InterruptedException unused2) {
                    }
                } else {
                    throw new RuntimeException("VideoRecording_Min_Duration_Ms > 86400000");
                }
            }
            this.A00 = 0;
            A01(this, num);
            if (r4.CTO(116)) {
                C341667nK r22 = this.A03;
                r22.A0F[0] = -1;
                r22.A08.removeCallbacks(r22.A0B);
            }
            A9T a9t = new A9T(new ATL(b16, this), this.A02);
            Map map = this.A05;
            for (C341717nP r1 : map.values()) {
                if (r1.CQQ()) {
                    r1.Ey4(a9t.A00());
                }
            }
            Iterator it = map.values().iterator();
            while (it.hasNext()) {
                it.next();
            }
            this.A00 = 1;
            a9t.A01();
        }
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [X.7nH, java.lang.Object] */
    public C341627nG(Handler handler, C343967r6 r4, C341567nA r5) {
        this.A06 = handler;
        this.A08 = r5;
        this.A07 = r4;
        this.A05 = new HashMap();
    }
}
