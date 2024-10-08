package X;

import com.facebook.common.time.AwakeTimeSinceBootClock;
import com.facebook.commonavatarliveediting.PrefetchQueue;
import com.facebook.quicklog.QuickPerformanceLogger;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

public final class WF8 implements X27, X2N {
    public static WF8 A09;
    public String A00;
    public WeakReference A01;
    public WeakReference A02;
    public 1IX A03;
    public boolean A04;
    public final VLB A05;
    public final PrefetchQueue A06;
    public final AnonymousClass0JR A07;
    public final QuickPerformanceLogger A08;

    public final void CxI(V28 v28) {
        1IX r2;
        boolean z;
        0sP r0;
        WeakReference weakReference;
        C17973VjA vjA;
        if (v28 instanceof C14925UFl) {
            C14925UFl uFl = (C14925UFl) v28;
            if (0qQ.A0K(uFl.A01, this.A00)) {
                if (uFl.A00 == AnonymousClass05K.A00) {
                    if (!(!this.A04 || (weakReference = this.A01) == null || (vjA = (C17973VjA) weakReference.get()) == null)) {
                        VQW vqw = vjA.A00;
                        if (vqw == null) {
                            0qQ.A0F("aleBridge");
                            throw AnonymousClass00P.createAndThrow();
                        }
                        vqw.A00.saveCurrentAvatar();
                    }
                    r2 = this.A03;
                    if (r2 != null) {
                        z = AnonymousClass7TE.A0v();
                        r0 = C20712Wxl.A00;
                    }
                    this.A03 = null;
                    this.A00 = null;
                }
                r2 = this.A03;
                if (r2 != null) {
                    z = false;
                    r0 = C20713Wxm.A00;
                }
                this.A03 = null;
                this.A00 = null;
                r2.EJ1(r0, z);
                this.A03 = null;
                this.A00 = null;
            }
        }
    }

    public final Object A00(C18073Vl1 vl1, String str, Map map, AnonymousClass4D7 r12, boolean z, boolean z2) {
        MTM mtm;
        C17973VjA vjA;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = 1IW.A02;
        1IW r1 = new 1IW(1, 1Ey.A02(r12));
        r1.A0I();
        String str2 = str;
        if (z) {
            this.A00 = str;
            this.A04 = z2;
            this.A03 = r1;
            WeakReference weakReference = this.A01;
            if (!(weakReference == null || (vjA = (C17973VjA) weakReference.get()) == null)) {
                0qQ.A0B(str, 0);
                VQW vqw = vjA.A00;
                if (vqw == null) {
                    0qQ.A0F("aleBridge");
                    throw AnonymousClass00P.createAndThrow();
                }
                vqw.A00.prefetchAvatar(str, map);
            }
        } else {
            0qQ.A0B(str, 1);
            WeakReference weakReference2 = this.A02;
            if (weakReference2 == null || (mtm = (MTM) weakReference2.get()) == null) {
                0KC.A0D("PrefetchProvider", "Cannot run prefetch as no CDL instance has been registered");
            } else {
                mtm.AWc(Boolean.valueOf(map.containsKey("root")), (Integer) null, str2, new TreeMap(map), new C59819JZr((Object) r1, (Object) vl1, (AnonymousClass4D7) null, 6));
            }
        }
        return r1.A0E();
    }

    public final void Cv0(C17973VjA vjA) {
        WeakReference weakReference = this.A01;
        if (weakReference != null) {
            weakReference.clear();
        }
        if (vjA != null) {
            this.A01 = new WeakReference(vjA);
            vjA.A00(this);
        }
    }

    public WF8(VLB vlb, QuickPerformanceLogger quickPerformanceLogger) {
        PrefetchQueue prefetchQueue;
        this.A05 = vlb;
        this.A08 = quickPerformanceLogger;
        VJT.A00 = quickPerformanceLogger;
        AwakeTimeSinceBootClock awakeTimeSinceBootClock = AwakeTimeSinceBootClock.INSTANCE;
        0qQ.A07(awakeTimeSinceBootClock);
        this.A07 = awakeTimeSinceBootClock;
        synchronized (PrefetchQueue.A08) {
            prefetchQueue = PrefetchQueue.A07;
            if (prefetchQueue == null) {
                prefetchQueue = new PrefetchQueue(awakeTimeSinceBootClock);
                PrefetchQueue.A07 = prefetchQueue;
            }
        }
        this.A06 = prefetchQueue;
    }
}
