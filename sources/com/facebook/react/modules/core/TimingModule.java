package com.facebook.react.modules.core;

import X.0qQ;
import X.AnonymousClass7TG;
import X.C12216SpG;
import X.C13946Tlt;
import X.C13947Tm7;
import X.C9540Rcd;
import X.Pxe;
import X.QZK;
import X.RFI;
import X.S9B;
import X.SNf;
import com.facebook.fbreact.specs.NativeTimingSpec;
import com.facebook.react.bridge.WritableNativeArray;
import com.facebook.react.module.annotations.ReactModule;
import java.util.Iterator;

@ReactModule(name = "Timing")
public final class TimingModule extends NativeTimingSpec {
    public static final C9540Rcd Companion = new Object();
    public static final String NAME = "Timing";
    public final C12216SpG javaTimerManager;

    public void callTimers(C13947Tm7 tm7) {
        JSTimers jSTimers;
        0qQ.A0B(tm7, 0);
        QZK reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn();
        if (reactApplicationContextIfActiveOrWarn != null && (jSTimers = (JSTimers) reactApplicationContextIfActiveOrWarn.A02(JSTimers.class)) != null) {
            jSTimers.callTimers(tm7);
        }
    }

    public void createTimer(double d, double d2, double d3, boolean z) {
        int i = (int) d;
        int i2 = (int) d2;
        C12216SpG spG = this.javaTimerManager;
        long max = Math.max(0, (((long) d3) - System.currentTimeMillis()) + ((long) i2));
        boolean z2 = z;
        if (i2 != 0 || z) {
            spG.createTimer(i, max, z2);
            return;
        }
        WritableNativeArray writableNativeArray = new WritableNativeArray();
        writableNativeArray.pushInt(i);
        spG.A09.callTimers(writableNativeArray);
    }

    public void deleteTimer(double d) {
        this.javaTimerManager.deleteTimer((int) d);
    }

    public void emitTimeDriftWarning(String str) {
        JSTimers jSTimers;
        0qQ.A0B(str, 0);
        QZK reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn();
        if (reactApplicationContextIfActiveOrWarn != null && (jSTimers = (JSTimers) reactApplicationContextIfActiveOrWarn.A02(JSTimers.class)) != null) {
            jSTimers.emitTimeDriftWarning(str);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003a, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003d, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean hasActiveTimersInRange(long r6) {
        /*
            r5 = this;
            X.SpG r0 = r5.javaTimerManager
            java.lang.Object r4 = r0.A0B
            monitor-enter(r4)
            java.util.PriorityQueue r3 = r0.A0C     // Catch:{ all -> 0x003f }
            java.lang.Object r1 = r3.peek()     // Catch:{ all -> 0x003f }
            X.RwD r1 = (X.C10674RwD) r1     // Catch:{ all -> 0x003f }
            if (r1 == 0) goto L_0x003c
            boolean r0 = r1.A03     // Catch:{ all -> 0x003f }
            if (r0 != 0) goto L_0x001b
            int r0 = r1.A01     // Catch:{ all -> 0x003f }
            long r1 = (long) r0     // Catch:{ all -> 0x003f }
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 >= 0) goto L_0x001b
            goto L_0x0039
        L_0x001b:
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x003f }
        L_0x001f:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x003f }
            if (r0 == 0) goto L_0x003c
            java.lang.Object r1 = r3.next()     // Catch:{ all -> 0x003f }
            X.RwD r1 = (X.C10674RwD) r1     // Catch:{ all -> 0x003f }
            X.0qQ.A0A(r1)     // Catch:{ all -> 0x003f }
            boolean r0 = r1.A03     // Catch:{ all -> 0x003f }
            if (r0 != 0) goto L_0x001f
            int r0 = r1.A01     // Catch:{ all -> 0x003f }
            long r1 = (long) r0     // Catch:{ all -> 0x003f }
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 >= 0) goto L_0x001f
        L_0x0039:
            monitor-exit(r4)
            r0 = 1
            return r0
        L_0x003c:
            monitor-exit(r4)
            r0 = 0
            return r0
        L_0x003f:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.modules.core.TimingModule.hasActiveTimersInRange(long):boolean");
    }

    public void setSendIdleEvents(boolean z) {
        this.javaTimerManager.setSendIdleEvents(z);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TimingModule(QZK qzk, C13946Tlt tlt) {
        super(qzk);
        AnonymousClass7TG.A1O(qzk, tlt);
        this.javaTimerManager = new C12216SpG(qzk, tlt, S9B.A00(), this);
    }

    public void callIdleCallbacks(double d) {
        JSTimers jSTimers;
        QZK reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn();
        if (reactApplicationContextIfActiveOrWarn != null && (jSTimers = (JSTimers) reactApplicationContextIfActiveOrWarn.A02(JSTimers.class)) != null) {
            jSTimers.callIdleCallbacks(d);
        }
    }

    public void initialize() {
        SNf A00 = SNf.A00(Pxe.A0T(this));
        C12216SpG spG = this.javaTimerManager;
        synchronized (A00) {
            A00.A03.add(spG);
            Iterator it = A00.A02.iterator();
            while (it.hasNext()) {
                it.next();
                if (!spG.A0E.getAndSet(true)) {
                    if (!spG.A01) {
                        spG.A08.A02(spG.A07, RFI.TIMERS_EVENTS);
                        spG.A01 = true;
                    }
                    C12216SpG.A02(spG);
                }
            }
        }
    }

    public void invalidate() {
        SNf A00 = SNf.A00(Pxe.A0T(this));
        A00.A03.remove(this.javaTimerManager);
        C12216SpG spG = this.javaTimerManager;
        spG.A05.A0A(spG);
        C12216SpG.A00(spG);
        if (spG.A02) {
            spG.A08.A03(spG.A06, RFI.IDLE_EVENT);
            spG.A02 = false;
        }
    }
}
