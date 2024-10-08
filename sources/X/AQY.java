package X;

import android.os.Handler;
import com.facebook.cameracore.mediapipeline.services.audio.interfaces.AudioPlatformComponentHost;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.WeakHashMap;

@Deprecated
public final class AQY implements C341587nC {
    public static final C341687nM A0E = new ATF();
    public C22018Xss A00;
    public byte[] A01;
    public byte[] A02 = new byte[4096];
    public C40071AQb A03;
    public final C341567nA A04;
    public final WeakReference A05;
    public final WeakHashMap A06 = new WeakHashMap();
    public final Handler A07;
    public final C341507n0 A08 = new AQU(this);
    public final C341607nE A09 = new AQV(this);
    public final C343967r6 A0A;
    public volatile C39897ADz A0B;
    public volatile A9M A0C;
    public volatile C341747nS A0D;

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0032, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized boolean A00(X.AQY r5) {
        /*
            monitor-enter(r5)
            java.lang.ref.WeakReference r0 = r5.A05     // Catch:{ all -> 0x0033 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0033 }
            X.7t6 r0 = (X.C345207t6) r0     // Catch:{ all -> 0x0033 }
            r4 = 0
            if (r0 == 0) goto L_0x0031
            com.facebook.cameracore.mediapipeline.services.audio.interfaces.AudioPlatformComponentHost r3 = r0.A00()     // Catch:{ all -> 0x0033 }
            if (r3 == 0) goto L_0x0031
            java.util.WeakHashMap r2 = r5.A06     // Catch:{ all -> 0x0033 }
            java.lang.Object r1 = r2.get(r3)     // Catch:{ all -> 0x0033 }
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch:{ all -> 0x0033 }
            X.Xss r0 = r5.A00     // Catch:{ all -> 0x0033 }
            if (r0 == 0) goto L_0x0031
            if (r1 == 0) goto L_0x0026
            boolean r0 = r1.booleanValue()     // Catch:{ all -> 0x0033 }
            if (r0 != 0) goto L_0x0031
        L_0x0026:
            r3.startRecording(r4)     // Catch:{ all -> 0x0033 }
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x0033 }
            r2.put(r3, r0)     // Catch:{ all -> 0x0033 }
            r0 = 1
            monitor-exit(r5)
            return r0
        L_0x0031:
            monitor-exit(r5)
            return r4
        L_0x0033:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AQY.A00(X.AQY):boolean");
    }

    public final Map AvY() {
        return null;
    }

    public final void EEP(Handler handler, C341687nM r6, C341747nS r7) {
        AudioPlatformComponentHost A002;
        synchronized (this) {
            C345207t6 r0 = (C345207t6) this.A05.get();
            if (!(r0 == null || (A002 = r0.A00()) == null)) {
                A002.stopRecording();
            }
        }
        if (this.A0C != null) {
            A9M a9m = this.A0C;
            C39732A6y a6y = a9m.A02;
            a6y.A03 = 0;
            C39731A6x a6x = a9m.A00;
            a6y.A03 = a6x.A02;
            a6y.A00 = 0;
            a6y.A00 = a6x.A01;
        }
        C22018Xss xss = this.A00;
        if (xss != null) {
            xss.A06(r6, handler);
        } else {
            C18097VlR.A00(handler, new C382299dT("mAudioRecorder is null while stopping"), r6);
        }
        this.A0D = null;
        this.A0B = null;
        this.A0C = null;
    }

    public final void A9l(Handler handler, C39897ADz aDz, C39732A6y a6y, C341687nM r6, C341747nS r7) {
        this.A0D = r7;
        r7.A00 = this.A08;
        if (aDz != null) {
            aDz.A02();
        }
        this.A0B = aDz;
        if (a6y != null) {
            A9M a9m = new A9M(a6y);
            a9m.A00();
            this.A0C = a9m;
        }
        A00(this);
        C22018Xss xss = this.A00;
        if (xss != null) {
            xss.A05(r6, handler);
        } else {
            C18097VlR.A00(handler, new C382299dT("mAudioRecorder is null while starting"), r6);
        }
    }

    public final void E3s(Handler handler, Handler handler2, C343487qI r15, C341687nM r16) {
        C40071AQb aQb = new C40071AQb(handler, r15, this);
        this.A03 = aQb;
        C341607nE r4 = this.A09;
        C343967r6 r1 = this.A0A;
        C22018Xss xss = new C22018Xss(handler, r4, r15, aQb, 5, r1.Ar5(1004), r1.B4o(21), r1.CTP(68));
        this.A00 = xss;
        int length = this.A01.length;
        int i = xss.A00;
        if (length < i) {
            this.A01 = new byte[i];
        }
        xss.A04(r16, handler2);
    }

    public final void release() {
        C40071AQb aQb = this.A03;
        if (aQb != null) {
            aQb.A05 = true;
            this.A03 = null;
        }
        C22018Xss xss = this.A00;
        if (xss != null) {
            xss.A06(A0E, this.A07);
            this.A00 = null;
        }
        this.A06.clear();
    }

    public AQY(Handler handler, C345207t6 r4, C343967r6 r5, C341567nA r6) {
        this.A04 = r6;
        this.A07 = handler;
        this.A01 = new byte[4096];
        this.A05 = new WeakReference(r4);
        this.A0A = r5;
    }
}
