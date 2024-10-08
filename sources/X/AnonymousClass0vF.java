package X;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: X.0vF  reason: invalid class name */
public final class AnonymousClass0vF implements C61480nO {
    public boolean A00;
    public final int A01;
    public final String A02;
    public final C61410nE A03;
    public final C61480nO A04;
    public final Queue A05 = new ConcurrentLinkedQueue();

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001a, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.AnonymousClass0vF r2) {
        /*
            monitor-enter(r2)
            boolean r0 = r2.A00     // Catch:{ all -> 0x001b }
            if (r0 != 0) goto L_0x0019
            java.util.Queue r0 = r2.A05     // Catch:{ all -> 0x001b }
            java.lang.Object r1 = r0.poll()     // Catch:{ all -> 0x001b }
            if (r1 == 0) goto L_0x0019
            r0 = 1
            r2.A00 = r0     // Catch:{ all -> 0x001b }
            monitor-exit(r2)
            X.0nO r0 = r2.A04
            X.0ng r1 = (X.0ng) r1
            r0.ATE(r1)
            return
        L_0x0019:
            monitor-exit(r2)
            return
        L_0x001b:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0vF.A00(X.0vF):void");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.0vF.ATE(X.0ng):void, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at java.util.ArrayList.forEach(ArrayList.java:1259)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:59)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public final void ATE(X.0ng r1) {
        /*
        // Can't load method instructions: Load method exception: null in method: X.0vF.ATE(X.0ng):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0vF.ATE(X.0ng):void");
    }

    public final void ATD(0nc r2) {
        throw new UnsupportedOperationException();
    }

    public AnonymousClass0vF(C61620nx r2) {
        this.A03 = r2.A02;
        this.A02 = r2.A01;
        this.A04 = r2.A03;
        this.A01 = r2.A00;
    }
}
