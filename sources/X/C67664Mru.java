package X;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.Mru  reason: case insensitive filesystem */
public final class C67664Mru extends Handler {
    public final C263624Ms A00;
    public final AtomicReference A01 = new AtomicReference(C69269NiV.UNKNOWN_OR_UNSET);
    public final C263624Ms A02;
    public volatile int A03;

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0030, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        X.1zE.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0034, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void handleMessage(android.os.Message r5) {
        /*
            r4 = this;
            r2 = 0
            X.0qQ.A0B(r5, r2)
            java.lang.String r1 = "PlayedForThreeSecondsDetectingHandler"
            X.4PU r0 = X.AnonymousClass4PU.A02
            X.0SG r3 = X.0NT.A02(r1, r2)     // Catch:{ all -> 0x0035 }
            int r1 = r5.what     // Catch:{ all -> 0x002e }
            r0 = 2
            if (r1 != r0) goto L_0x0027
            A00(r4)     // Catch:{ all -> 0x002e }
            java.util.concurrent.atomic.AtomicReference r0 = r4.A01     // Catch:{ all -> 0x002e }
            java.lang.Object r1 = r0.get()     // Catch:{ all -> 0x002e }
            X.NiV r0 = X.C69269NiV.TIMER_STARTED     // Catch:{ all -> 0x002e }
            if (r1 != r0) goto L_0x0027
            r2 = 2
            r4.removeMessages(r2)     // Catch:{ all -> 0x002e }
            r0 = 200(0xc8, double:9.9E-322)
            r4.sendEmptyMessageDelayed(r2, r0)     // Catch:{ all -> 0x002e }
        L_0x0027:
            r3.close()     // Catch:{ all -> 0x0035 }
            X.AnonymousClass4PS.A00()
            return
        L_0x002e:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0030 }
        L_0x0030:
            r0 = move-exception
            X.1zE.A00(r3, r1)     // Catch:{ all -> 0x0035 }
            throw r0     // Catch:{ all -> 0x0035 }
        L_0x0035:
            r0 = move-exception
            X.AnonymousClass4PS.A00()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67664Mru.handleMessage(android.os.Message):void");
    }

    public static final void A00(C67664Mru mru) {
        AtomicReference atomicReference = mru.A01;
        if (atomicReference.get() == C69269NiV.UNKNOWN_OR_UNSET) {
            27B.A02("PlayedForThreeSecondsDetectingHandler", "PlayedForThreeSeconds status shouldn't be unknown when attempting to send event", new Object[0]);
            return;
        }
        Object obj = atomicReference.get();
        C69269NiV niV = C69269NiV.EVENT_PUBLISHED;
        if (obj != niV && ((long) (((int) mru.A02.A0I.A08()) - mru.A03)) >= 3000) {
            atomicReference.set(niV);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C67664Mru(Looper looper, C263624Ms r4, C263624Ms r5) {
        super(looper);
        0qQ.A0A(looper);
        this.A02 = r4;
        this.A00 = r5;
    }
}
