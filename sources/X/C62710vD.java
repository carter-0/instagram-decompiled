package X;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.0vD  reason: invalid class name and case insensitive filesystem */
public final class C62710vD implements C61480nO {
    public boolean A00;
    public final AtomicLong A01 = new AtomicLong();
    public final C61410nE A02;
    public final C61480nO A03;
    public final Queue A04 = new ConcurrentLinkedQueue();

    public C62710vD(C61410nE r2, C61480nO r3) {
        this.A02 = r2;
        this.A03 = r3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002a, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C62710vD r5) {
        /*
            monitor-enter(r5)
            boolean r0 = r5.A00     // Catch:{ all -> 0x002b }
            if (r0 == 0) goto L_0x0015
            java.util.concurrent.atomic.AtomicLong r0 = r5.A01     // Catch:{ all -> 0x002b }
            long r3 = r0.get()     // Catch:{ all -> 0x002b }
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0029
            android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x002b }
            goto L_0x0029
        L_0x0015:
            java.util.Queue r0 = r5.A04     // Catch:{ all -> 0x002b }
            java.lang.Object r1 = r0.poll()     // Catch:{ all -> 0x002b }
            if (r1 == 0) goto L_0x0029
            r0 = 1
            r5.A00 = r0     // Catch:{ all -> 0x002b }
            monitor-exit(r5)
            X.0nO r0 = r5.A03
            X.0ng r1 = (X.0ng) r1
            r0.ATE(r1)
            return
        L_0x0029:
            monitor-exit(r5)
            return
        L_0x002b:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C62710vD.A00(X.0vD):void");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.0vD.ATE(X.0ng):void, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public final void ATE(X.0ng r1) {
        /*
        // Can't load method instructions: Load method exception: null in method: X.0vD.ATE(X.0ng):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C62710vD.ATE(X.0ng):void");
    }

    public final void ATD(0nc r2) {
        throw new UnsupportedOperationException();
    }
}
