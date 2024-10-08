package X;

import android.util.LongSparseArray;
import com.facebook.react.bridge.queue.MessageQueueThread;
import com.facebook.react.uimanager.events.ReactEventEmitter;
import com.facebook.systrace.Systrace;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public final class WJb implements C20877X2e, C13773Tgo {
    public static final Comparator A0G = new C20373WqD(3);
    public int A00 = 0;
    public short A01 = 0;
    public W0S[] A02 = new W0S[16];
    public final LongSparseArray A03 = new LongSparseArray();
    public final QZK A04;
    public final C19946WiJ A05 = new C19946WiJ(this);
    public final W82 A06 = new W82(this);
    public final Object A07 = new Object();
    public final Object A08 = new Object();
    public final ArrayList A09 = new ArrayList();
    public final Map A0A = new HashMap();
    public final CopyOnWriteArrayList A0B = new CopyOnWriteArrayList();
    public final CopyOnWriteArrayList A0C = new CopyOnWriteArrayList();
    public final AtomicInteger A0D = new AtomicInteger();
    public volatile ReactEventEmitter A0E;
    public volatile boolean A0F = false;

    private void A00() {
        if (this.A0E != null) {
            W82 w82 = this.A06;
            if (!w82.A01) {
                QZK qzk = w82.A02.A04;
                MessageQueueThread messageQueueThread = qzk.A05;
                0Sd.A00(messageQueueThread);
                if (messageQueueThread.isOnThread()) {
                    w82.A00();
                    return;
                }
                C19947WiK wiK = new C19947WiK(w82);
                MessageQueueThread messageQueueThread2 = qzk.A05;
                0Sd.A00(messageQueueThread2);
                messageQueueThread2.runOnQueue(wiK);
            }
        }
    }

    public final void APe(W0S w0s) {
        0Sd.A03(w0s.A04, "Dispatched event hasn't been initialized");
        Iterator it = this.A0B.iterator();
        while (it.hasNext()) {
            C11404SSb sSb = (C11404SSb) it.next();
            if (C18773W0w.A02()) {
                C11404SSb.A02(sSb, w0s);
            } else {
                C18773W0w.A01(new C20141Wm1(sSb, w0s));
            }
        }
        synchronized (this.A07) {
            this.A09.add(w0s);
            Systrace.A07(8192, w0s.A07(), w0s.A01);
        }
        A00();
    }

    public final void onHostDestroy() {
        this.A06.A00 = true;
    }

    public final void onHostPause() {
        this.A06.A00 = true;
    }

    public WJb(QZK qzk) {
        this.A04 = qzk;
        qzk.A09(this);
        this.A0E = new ReactEventEmitter(qzk);
    }

    public final void onHostResume() {
        A00();
    }
}
