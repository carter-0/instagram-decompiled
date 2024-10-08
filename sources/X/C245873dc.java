package X;

import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: X.3dc  reason: invalid class name and case insensitive filesystem */
public final class C245873dc implements Runnable, Choreographer.FrameCallback {
    public static C245873dc A06;
    public static final long A07 = TimeUnit.MILLISECONDS.toNanos(AnonymousClass2SZ.A00);
    public long A00;
    public boolean A01;
    public final Handler A02 = new Handler(Looper.getMainLooper());
    public final C249753kJ A03;
    public final AnonymousClass0eM A04 = AnonymousClass0eN.A01(C245883dd.A00);
    public final long A05;

    public final void doFrame(long j) {
        this.A00 = j;
        if (!((Set) this.A04.getValue()).isEmpty()) {
            C249753kJ r2 = this.A03;
            boolean isTracing = r2.isTracing();
            if (isTracing) {
                r2.ADG("IncrementalMountGapWorker::doFrame");
            }
            this.A02.post(this);
            Choreographer.getInstance().postFrameCallback(this);
            if (isTracing) {
                r2.ASS();
                return;
            }
            return;
        }
        this.A01 = false;
    }

    public final void run() {
        boolean isTracing;
        long j = (this.A00 + this.A05) - A07;
        C249753kJ r7 = this.A03;
        boolean isTracing2 = r7.isTracing();
        if (isTracing2) {
            r7.ADG("premount");
        }
        try {
            Iterator it = ((Set) this.A04.getValue()).iterator();
            while (it.hasNext() && System.nanoTime() < j) {
                C245743dP r10 = (C245743dP) it.next();
                isTracing = r7.isTracing();
                if (isTracing) {
                    r7.ADG("premount-item");
                }
                while (r10.A08() && System.nanoTime() < j) {
                    r10.A03();
                    List list = r10.A08;
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        if (((C245753dQ) list.get(i)).A01 instanceof C245643dF) {
                            Object obj = list.get(i);
                            0qQ.A0C(obj, "null cannot be cast to non-null type com.facebook.rendercore.extensions.ExtensionState<kotlin.Any>");
                            C245753dQ r12 = (C245753dQ) obj;
                            C245793dU r5 = (C245793dU) r12.A02;
                            2T4 r0 = r5.A02;
                            if (r0 != null) {
                                ArrayList arrayList = r0.A0O;
                                ArrayList arrayList2 = r0.A0N;
                                int size2 = r0.A0W.size();
                                int i2 = r5.A01;
                                if (i2 >= size2 || i2 < 0) {
                                    int i3 = r5.A00;
                                    if (i3 > 0 && i3 <= size2) {
                                        long j2 = ((C245523d3) arrayList2.get(i3 - 1)).A03;
                                        if (!r12.A03.contains(Long.valueOf(j2))) {
                                            r12.A01(j2, true);
                                        }
                                        r5.A00--;
                                    }
                                } else {
                                    long j3 = ((C245523d3) arrayList.get(i2)).A03;
                                    if (!r12.A03.contains(Long.valueOf(j3))) {
                                        r12.A01(j3, true);
                                    }
                                    r5.A01++;
                                }
                            }
                        }
                    }
                    r10.A02();
                }
                if (isTracing) {
                    r7.ASS();
                }
                if (!r10.A08()) {
                    it.remove();
                }
            }
            if (isTracing2) {
                r7.ASS();
            }
        } catch (Throwable th) {
            if (isTracing2) {
                r7.ASS();
            }
            throw th;
        }
    }

    public C245873dc(C249753kJ r3, long j) {
        this.A05 = j;
        this.A03 = r3;
    }
}
