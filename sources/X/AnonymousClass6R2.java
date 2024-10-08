package X;

import android.os.Handler;
import android.os.HandlerThread;
import com.facebook.common.time.RealtimeSinceBootClock;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.6R2  reason: invalid class name */
public final class AnonymousClass6R2 {
    public static final C64351Ki A06 = AnonymousClass6R3.A00;
    public final HandlerThread A00;
    public final AnonymousClass6R1 A01;
    public final AnonymousClass0JR A02;
    public final C307556Qo A03;
    public final Executor A04;
    public final AtomicReference A05 = new AtomicReference(0Yt.A0E());

    public AnonymousClass6R2(AnonymousClass6R1 r4, C307556Qo r5) {
        0qQ.A0B(r5, 2);
        Object obj = A06.get();
        0qQ.A07(obj);
        HandlerThread handlerThread = (HandlerThread) obj;
        RealtimeSinceBootClock realtimeSinceBootClock = RealtimeSinceBootClock.A00;
        0qQ.A07(realtimeSinceBootClock);
        0qQ.A0B(handlerThread, 2);
        this.A01 = r4;
        this.A00 = handlerThread;
        this.A03 = r5;
        this.A02 = realtimeSinceBootClock;
        this.A04 = new AnonymousClass6R4(new Handler(handlerThread.getLooper()));
        this.A04.execute(new FutureTask(new AnonymousClass6R5(this)));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0038, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        X.1zE.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003c, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.AnonymousClass6R2 r5, java.util.Map r6) {
        /*
            java.lang.String r2 = "BloksComponentQueryDiskCache"
            java.lang.String r1 = "flush_metadata"
            r0 = 58
            java.lang.String r0 = X.002.A0T(r2, r1, r0)     // Catch:{ all -> 0x003d }
            X.1KZ.A01(r0)     // Catch:{ all -> 0x003d }
            X.6R1 r4 = r5.A01     // Catch:{ all -> 0x003d }
            java.lang.String r3 = "__disk_metadata"
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream     // Catch:{ all -> 0x003d }
            r0.<init>()     // Catch:{ all -> 0x003d }
            java.io.ObjectOutputStream r2 = new java.io.ObjectOutputStream     // Catch:{ all -> 0x003d }
            r2.<init>(r0)     // Catch:{ all -> 0x003d }
            r2.writeObject(r6)     // Catch:{ all -> 0x0036 }
            r2.close()     // Catch:{ all -> 0x003d }
            byte[] r1 = r0.toByteArray()     // Catch:{ all -> 0x003d }
            X.0qQ.A07(r1)     // Catch:{ all -> 0x003d }
            com.facebook.stash.core.Stash r0 = r4.A00     // Catch:{ all -> 0x003d }
            r0.write(r3, r1)     // Catch:{ all -> 0x003d }
            java.util.concurrent.atomic.AtomicReference r0 = r5.A05     // Catch:{ all -> 0x003d }
            r0.set(r6)     // Catch:{ all -> 0x003d }
            X.1KZ.A00()
            return
        L_0x0036:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0038 }
        L_0x0038:
            r0 = move-exception
            X.1zE.A00(r2, r1)     // Catch:{ all -> 0x003d }
            throw r0     // Catch:{ all -> 0x003d }
        L_0x003d:
            r0 = move-exception
            X.1KZ.A00()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6R2.A00(X.6R2, java.util.Map):void");
    }
}
