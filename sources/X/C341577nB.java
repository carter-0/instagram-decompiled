package X;

import android.os.Handler;
import android.os.SystemClock;
import com.facebook.cameracore.mediapipeline.services.audio.implementation.AudioPlatformComponentHostImpl;
import com.facebook.cameracore.mediapipeline.services.audio.interfaces.AudioPlatformComponentHost;
import com.facebook.cameracore.mediapipeline.services.audio.interfaces.AudioRenderCallback;
import com.facebook.common.time.AwakeTimeSinceBootClock;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: X.7nB  reason: invalid class name and case insensitive filesystem */
public final class C341577nB implements C341587nC {
    public long A00;
    public long A01 = 0;
    public boolean A02 = false;
    public byte[] A03 = new byte[4096];
    public final C341607nE A04 = new C341597nD(this);
    public final C341427mr A05;
    public final C341417mq A06;
    public final WeakReference A07;
    public final WeakHashMap A08 = new WeakHashMap();
    public final byte[] A09 = new byte[4096];
    public final C341507n0 A0A;
    public final C341617nF A0B = new C341617nF(this);
    public final C344037rD A0C;
    public volatile Handler A0D;
    public volatile C39897ADz A0E;
    public volatile A9M A0F;
    public volatile AudioRenderCallback A0G;
    public volatile C341747nS A0H;
    public volatile C343497qJ A0I;

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002e, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized boolean A03(X.C341577nB r4) {
        /*
            monitor-enter(r4)
            java.lang.ref.WeakReference r0 = r4.A07     // Catch:{ all -> 0x002f }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x002f }
            X.7t6 r0 = (X.C345207t6) r0     // Catch:{ all -> 0x002f }
            r3 = 0
            if (r0 == 0) goto L_0x002d
            com.facebook.cameracore.mediapipeline.services.audio.interfaces.AudioPlatformComponentHost r2 = r0.A00()     // Catch:{ all -> 0x002f }
            if (r2 == 0) goto L_0x002d
            java.util.WeakHashMap r1 = r4.A08     // Catch:{ all -> 0x002f }
            java.lang.Object r0 = r1.get(r2)     // Catch:{ all -> 0x002f }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x002f }
            if (r0 == 0) goto L_0x0022
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x002f }
            if (r0 != 0) goto L_0x002d
        L_0x0022:
            r2.startRecording(r3)     // Catch:{ all -> 0x002f }
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x002f }
            r1.put(r2, r0)     // Catch:{ all -> 0x002f }
            r0 = 1
            monitor-exit(r4)
            return r0
        L_0x002d:
            monitor-exit(r4)
            return r3
        L_0x002f:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C341577nB.A03(X.7nB):boolean");
    }

    public final void E3s(Handler handler, Handler handler2, C343487qI r10, C341687nM r11) {
        this.A0D = handler;
        this.A0I = r10.A05;
        Handler handler3 = handler2;
        this.A05.A06(new ATS(handler, handler3, r10, this, r11), handler2);
    }

    public final void EEP(Handler handler, C341687nM r7, C341747nS r8) {
        AudioPlatformComponentHost A002;
        this.A0H = null;
        A9M a9m = this.A0F;
        if (a9m != null) {
            C39732A6y a6y = a9m.A02;
            a6y.A03 = 0;
            C39731A6x a6x = a9m.A00;
            a6y.A03 = a6x.A02;
            a6y.A00 = 0;
            a6y.A00 = a6x.A01;
        }
        this.A0E = null;
        this.A0F = null;
        if (!this.A02) {
            synchronized (this) {
                C345207t6 r0 = (C345207t6) this.A07.get();
                if (!(r0 == null || (A002 = r0.A00()) == null)) {
                    A002.stopRecording();
                    ((AudioPlatformComponentHostImpl) A002).mRenderCallback = null;
                }
            }
        }
        C341427mr r2 = this.A05;
        r2.A0I.A05.A01("rO");
        if (!r2.A0B.post(new C41103AoP(handler, r2, r7))) {
            handler.post(new C40932Ale(r2, r7));
        }
        this.A0G = null;
    }

    public final void release() {
        this.A0D = null;
        this.A0I = null;
        this.A08.clear();
    }

    public static void A00(C341577nB r6) {
        long j = 0;
        if (r6.A00 <= 0) {
            C343497qJ r0 = r6.A0I;
            if (r0 == null) {
                C341747nS r2 = r6.A0H;
                if (r2 != null) {
                    r2.A00(new C382299dT("Presentation Time Strategy not set"));
                    return;
                }
                return;
            }
            int ordinal = r0.ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    j = AwakeTimeSinceBootClock.INSTANCE.nowNanos() / 1000;
                } else {
                    return;
                }
            }
            r6.A00 = j;
        }
    }

    public static void A01(C341577nB r6) {
        C39897ADz aDz = r6.A0E;
        if (aDz != null && r6.A01 > 0) {
            long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos() - r6.A01;
            aDz.A07 += elapsedRealtimeNanos;
            if (elapsedRealtimeNanos > aDz.A0C) {
                aDz.A01++;
            }
        }
    }

    public static void A02(C341577nB r8, byte[] bArr, int i, int i2, int i3, int i4) {
        C341747nS r2 = r8.A0H;
        if (r2 != null) {
            r2.A02(bArr, i4, r8.A00);
        }
        if (i4 > 0 && i > 0) {
            int i5 = i2;
            if (i2 > 0) {
                int i6 = i3;
                if (i3 > 0) {
                    r8.A00 += C39902AIk.A01(i5, i6, (long) i4, (long) i);
                }
            }
        }
    }

    public final void A9l(Handler handler, C39897ADz aDz, C39732A6y a6y, C341687nM r8, C341747nS r9) {
        boolean z;
        this.A0H = r9;
        r9.A00 = this.A0A;
        if (aDz != null) {
            aDz.A02();
        }
        this.A0E = aDz;
        if (a6y != null) {
            A9M a9m = new A9M(a6y);
            a9m.A00();
            this.A0F = a9m;
        }
        if (this.A0I == null) {
            r8.DCg(new C382299dT("Presentation Time Strategy not set"));
            return;
        }
        this.A00 = 0;
        this.A01 = 0;
        this.A0G = new C380969ao(this);
        C341427mr r3 = this.A05;
        C3730593v r0 = r3.A03;
        if (r0 != null) {
            z = r0.isSubgraphInserted();
        } else {
            z = false;
        }
        this.A02 = z;
        if (!z) {
            A03(this);
        }
        C341617nF r2 = this.A0B;
        r3.A0I.A05.A01("a");
        if (!r3.A0B.post(new C41193Apr(handler, r3, r2, r8))) {
            handler.post(new C40931Ald(r3, r8));
        }
    }

    public final Map AvY() {
        return this.A05.A03();
    }

    public C341577nB(C341507n0 r4, C341427mr r5, C345207t6 r6, C344037rD r7, C341417mq r8) {
        this.A07 = new WeakReference(r6);
        this.A05 = r5;
        this.A06 = r8;
        this.A0G = null;
        this.A0A = r4;
        this.A0C = r7;
    }
}
