package X;

import android.os.Handler;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;

/* renamed from: X.7sA  reason: invalid class name and case insensitive filesystem */
public final class C344627sA implements C344637sB {
    public boolean A00;
    public final /* synthetic */ C344457rt A01;

    public final void DQG(C344647sC r10) {
        C344457rt r2 = this.A01;
        r2.A00 = 0;
        C344037rD r3 = r2.A04;
        if (r3 != null) {
            r3.CjJ((long) r10.hashCode(), "media_pipeline_pause", "MediaGraphControllerImpl", (Map) null);
        }
        C344607s8 r0 = r2.A06.A04.A06;
        0qQ.A07(r0);
        Handler handler = r0.A01;
        if (handler != null) {
            handler.removeMessages(1, r2);
            handler.sendEmptyMessage(3);
        }
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.9tX, X.9dQ] */
    public final void DQJ(C344647sC r6, Exception exc) {
        C344457rt r3 = this.A01;
        C344037rD r2 = r3.A04;
        if (r2 != null) {
            C344457rt.A00(r3, new C391719tX(31000, (Throwable) exc));
            if (!this.A00) {
                this.A00 = true;
                r2.Ew8("MediaGraphControllerImpl:onMediaGraphRenderError", exc, true);
            }
        }
        C344497rx r22 = r3.A02;
        if (r22 != null) {
            r22.DQF(new C391719tX(31000, (Throwable) exc));
        }
    }

    public C344627sA(C344457rt r1) {
        this.A01 = r1;
    }

    public final void DQE(C344647sC r10) {
        String str;
        C344457rt r0 = this.A01;
        C344037rD r3 = r0.A04;
        if (r3 != null) {
            HashMap hashMap = new HashMap();
            LinkedHashMap linkedHashMap = C344457rt.A0B;
            synchronized (linkedHashMap) {
                String obj = r0.toString();
                String BgN = r3.BgN();
                0qQ.A07(BgN);
                if (BgN.length() > 0) {
                    str = r3.BgN();
                } else {
                    str = "unknown";
                }
                0qQ.A0A(str);
                linkedHashMap.put(obj, str);
                hashMap.put("active_media_pipelines", linkedHashMap.values().toString());
            }
            r3.CjJ((long) r10.hashCode(), "media_pipeline_start", "MediaGraphControllerImpl", hashMap);
        }
    }

    public final void DQH(C344647sC r5) {
        C344457rt r2 = this.A01;
        CountDownLatch countDownLatch = r2.A0A;
        r2.A0A = null;
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
        C343837qt r3 = r2.A00;
        r3.getClass();
        C343917r1 Apf = r3.Apf(C343927r2.A00);
        0qQ.A07(Apf);
        C343927r2 r22 = (C343927r2) Apf;
        String str = (String) r3.Apu(C343737qi.A0J);
        if (str != null) {
            r22.E63(str);
        }
        if (0qQ.A0K(r3.Apu(C343737qi.A0M), true)) {
            r22.E63(002.A0O("OC-", r3.hashCode()));
        }
    }

    public final void DQI(C344647sC r11) {
        C344457rt r2 = this.A01;
        C344037rD r4 = r2.A04;
        if (r4 != null) {
            HashMap hashMap = new HashMap();
            LinkedHashMap linkedHashMap = C344457rt.A0B;
            synchronized (linkedHashMap) {
                linkedHashMap.remove(r2.toString());
                hashMap.put("active_media_pipelines", linkedHashMap.values().toString());
            }
            hashMap.put("frame_render_noop_counter", String.valueOf(r2.A00));
            r4.CjJ((long) r11.hashCode(), "media_pipeline_stop", "MediaGraphControllerImpl", hashMap);
        }
        C344607s8 r0 = r2.A06.A04.A06;
        0qQ.A07(r0);
        Handler handler = r0.A01;
        if (handler != null) {
            handler.removeMessages(1, r2);
        }
    }

    public final void DQK(C344647sC r6, Long l) {
        C344457rt r4 = this.A01;
        C344037rD r3 = r4.A04;
        if (r3 != null) {
            r3.EAo(System.nanoTime(), true);
        }
        C345537tg r0 = r4.A08;
        if (r0 != null) {
            r0.DQO(l);
        }
        C344607s8 r02 = r4.A06.A04.A06;
        0qQ.A07(r02);
        r02.A00(r4);
    }

    public final void DQL(C344647sC r3) {
        this.A01.A00++;
    }

    public final void DQM(C344647sC r2, Long l) {
        if (this.A01.A04 != null) {
            System.nanoTime();
        }
    }

    public final void DQN(C344647sC r4, Long l) {
        C344037rD r2 = this.A01.A04;
        if (r2 != null) {
            r2.EAp(System.nanoTime());
        }
    }

    public final void DQP(C344647sC r8) {
        C344037rD r1 = this.A01.A04;
        if (r1 != null) {
            r1.CjJ((long) r8.hashCode(), "media_pipeline_resume", "MediaGraphControllerImpl", (Map) null);
        }
    }
}
