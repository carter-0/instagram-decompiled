package X;

import android.os.Handler;
import android.os.HandlerThread;
import android.util.Log;
import com.facebook.videolite.transcoder.base.composition.MediaComposition;
import java.lang.Thread;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.webrtc.MediaStreamTrack;

public class STM {
    public static final long A0P = JTR.A0N(TimeUnit.SECONDS);
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public C266724aF A04;
    public MediaComposition A05;
    public Q14 A06;
    public Q14 A07;
    public C10862RzN A08;
    public HashSet A09;
    public boolean A0A;
    public C266724aF[] A0B;
    public final long A0C;
    public final Handler A0D;
    public final SNJ A0E;
    public final C10794RyG A0F;
    public final C13725Tfv A0G;
    public final S0X A0H;
    public final S30 A0I;
    public final List A0J;
    public final Map A0K;
    public final Map A0L;
    public final ExecutorService A0M;
    public final Handler.Callback A0N;
    public final Thread.UncaughtExceptionHandler A0O;

    /* JADX WARNING: type inference failed for: r4v0, types: [X.Q1b, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v10, types: [java.lang.Object, X.RQJ] */
    public static void A01(STM stm) {
        List list;
        stm.A00 = 0;
        ? obj = new Object();
        SNJ snj = stm.A0E;
        if (snj != null) {
            SNJ.A00(snj, "audio_pipeline_release", (Map) null);
        }
        while (true) {
            list = stm.A0J;
            if (list.isEmpty()) {
                break;
            }
            try {
                ((Future) list.remove(0)).get();
            } catch (Exception e) {
                C7254Q1b.A00(obj, e);
            }
        }
        list.clear();
        Map map = stm.A0K;
        Iterator A15 = Pxg.A15(map.keySet());
        while (A15.hasNext()) {
            C7948Qdp qdp = new C7948Qdp((C7254Q1b) obj, A00(stm, AnonymousClass7TG.A0F(A15)));
            new Object().A00 = qdp;
            qdp.A00();
        }
        map.clear();
        stm.A0M.shutdown();
        Handler handler = stm.A0D;
        handler.removeCallbacksAndMessages((Object) null);
        handler.getLooper().quit();
        stm.A0F.A02.release();
        obj.A01();
    }

    public static C13855Tia A00(STM stm, int i) {
        Map map = stm.A0K;
        Integer valueOf = Integer.valueOf(i);
        Future future = (Future) map.get(valueOf);
        if (future != null) {
            try {
                return (C13855Tia) future.get();
            } catch (Exception e) {
                map.remove(valueOf);
                stm.A0F.A01.disableTrack(i);
                Integer num = AnonymousClass05K.A01;
                S0X s0x = stm.A0H;
                if (s0x != null) {
                    s0x.A00(num, e);
                }
            }
        }
        return null;
    }

    public static void A02(STM stm) {
        boolean z;
        STM stm2 = stm;
        Q14 q14 = stm2.A06;
        int i = 0;
        if (q14 != null) {
            q14.A00();
            z = true;
        } else {
            z = false;
        }
        HashMap A1E = AnonymousClass7TE.A1E();
        Iterator A0s = AnonymousClass7TF.A0s(stm2.A05.A06(C266714aE.AUDIO));
        while (A0s.hasNext()) {
            Map.Entry A1J = AnonymousClass7TE.A1J(A0s);
            Integer num = (Integer) A1J.getKey();
            Iterator A1H = C51966G9m.A1H(A1J.getValue());
            while (A1H.hasNext()) {
                A1E.put(Integer.toString(i), new C10569RuO((SIO) A1H.next(), num));
                i++;
            }
        }
        HashMap A1E2 = AnonymousClass7TE.A1E();
        Iterator A0s2 = AnonymousClass7TF.A0s(A1E);
        while (A0s2.hasNext()) {
            Map.Entry A1J2 = AnonymousClass7TE.A1J(A0s2);
            C266724aF r6 = ((C10569RuO) A1J2.getValue()).A00;
            TimeUnit timeUnit = TimeUnit.MICROSECONDS;
            long max = Math.max(0, r6.A03(timeUnit));
            long A022 = r6.A02(timeUnit);
            if (A022 < 0) {
                A022 = Long.MAX_VALUE;
            }
            A1E2.put(A1J2.getKey(), Pxe.A0V(timeUnit, max, A022));
        }
        C7962QeA qeA = new C7962QeA(stm2.A08.A0B, stm2, A1E, A1E2, 0);
        stm2.A06 = qeA;
        if (z) {
            qeA.A01(stm2.A02);
        }
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [X.Q1b, java.lang.Object] */
    public static void A03(STM stm, Throwable th) {
        ? obj = new Object();
        C7254Q1b.A00(obj, th);
        try {
            A01(stm);
        } catch (Throwable unused) {
            C7254Q1b.A00(obj, th);
        }
        SNJ snj = stm.A0E;
        if (snj != null) {
            Throwable th2 = obj.A01;
            HashMap A0x = C66582MXn.A0x(th2);
            String stackTraceString = Log.getStackTraceString(th2);
            0qQ.A0A(stackTraceString);
            A0x.put("error_trace", stackTraceString);
            SNJ.A00(snj, "audio_pipeline_error", A0x);
        }
        Integer num = AnonymousClass05K.A01;
        Throwable th3 = obj.A01;
        S0X s0x = stm.A0H;
        if (s0x != null) {
            s0x.A00(num, th3);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000c, code lost:
        if (r8.A0A != false) goto L_0x000e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A04(X.STM r8) {
        /*
            long r2 = r8.A02
            long r6 = r8.A03
            r5 = 0
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 <= 0) goto L_0x000e
            boolean r0 = r8.A0A
            r4 = 0
            if (r0 == 0) goto L_0x000f
        L_0x000e:
            r4 = 1
        L_0x000f:
            int r1 = r8.A00
            r0 = 2
            if (r1 != r0) goto L_0x0026
            if (r4 == 0) goto L_0x0025
            X.4aF r4 = r8.A04
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MICROSECONDS
            X.RzN r0 = r8.A08
            X.Q4k r0 = r0.A0B
            boolean r0 = X.C7334Q4k.A00(r4, r0, r1, r2)
            if (r0 == 0) goto L_0x0025
            r5 = 1
        L_0x0025:
            return r5
        L_0x0026:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.STM.A04(X.STM):boolean");
    }

    public final void A05() {
        Pxf.A15(this.A0D, 5);
    }

    public STM(C7255Q1d q1d, SNJ snj, C10794RyG ryG, C13725Tfv tfv, S0X s0x, C10862RzN rzN, S30 s30, Integer num) {
        Integer num2;
        C11457SVv sVv = new C11457SVv(this, 2);
        this.A0N = sVv;
        TLI tli = new TLI(this, 1);
        this.A0O = tli;
        C10862RzN rzN2 = rzN;
        this.A08 = rzN2;
        this.A05 = rzN2.A08;
        this.A0G = tfv;
        this.A0I = s30;
        if (num == AnonymousClass05K.A00) {
            num2 = AnonymousClass05K.A03;
        } else {
            num2 = AnonymousClass05K.A04;
        }
        this.A0M = q1d.A03(num2, (Thread.UncaughtExceptionHandler) null);
        this.A0J = Pxe.A1A();
        this.A0K = AnonymousClass7TE.A1E();
        this.A0L = AnonymousClass7TE.A1E();
        this.A0F = ryG;
        this.A0H = s0x;
        this.A0E = snj;
        int i = rzN2.A0C.A04;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.A0C = (timeUnit.toMicros(1) * 1024) / ((long) i);
        this.A04 = new C266724aF(timeUnit, -1, -1);
        this.A09 = AnonymousClass7TE.A1F();
        HandlerThread A0J2 = Pxf.A0J(MediaStreamTrack.AUDIO_TRACK_KIND, -16);
        A0J2.start();
        this.A0D = new Q1X(sVv, A0J2.getLooper(), tli);
    }
}
