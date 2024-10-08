package X;

import java.util.Map;

/* renamed from: X.2P7  reason: invalid class name */
public final class AnonymousClass2P7 implements AnonymousClass0TL {
    public final long[] A00 = new long[4];
    public final 0TJ[] A01;

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.2P7.getDataPoints():java.util.Collection, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public final java.util.Collection getDataPoints() {
        /*
        // Can't load method instructions: Load method exception: null in method: X.2P7.getDataPoints():java.util.Collection, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2P7.getDataPoints():java.util.Collection");
    }

    public final boolean shouldCollectMetrics(int i) {
        return (i & 1) != 0;
    }

    public final boolean shouldCollectMetrics(int i, 0TA r4) {
        return (i & 1) != 0;
    }

    public final /* synthetic */ Map getIndexedDataPoints() {
        return null;
    }

    public final /* synthetic */ boolean supportsIndexedDataPoints() {
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: X.0TJ[]} */
    /* JADX WARNING: type inference failed for: r1v1, types: [java.lang.Object, X.0TJ] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass2P7() {
        /*
            r9 = this;
            r9.<init>()
            r8 = 4
            long[] r0 = new long[r8]
            r9.A00 = r0
            X.0TJ[] r7 = new X.0TJ[r8]
            r9.A01 = r7
            r6 = 0
        L_0x000d:
            X.0TJ r1 = X.0TJ.A0I
            if (r6 == 0) goto L_0x0047
            r0 = 1
            if (r6 == r0) goto L_0x0043
            r0 = 2
            if (r6 == r0) goto L_0x003f
            r0 = 3
            if (r6 == r0) goto L_0x003b
            java.lang.String r5 = "unknown_gc_stat"
        L_0x001d:
            java.lang.String r4 = r1.A02
            java.lang.Integer r3 = r1.A01
            java.lang.Integer r2 = r1.A00
            X.0TJ r1 = new X.0TJ
            r1.<init>()
            java.lang.String r0 = ""
            r1.A03 = r0
            r1.A02 = r4
            r1.A01 = r3
            r1.A00 = r2
            r1.A03 = r5
            r7[r6] = r1
            int r6 = r6 + 1
            if (r6 < r8) goto L_0x000d
            return
        L_0x003b:
            java.lang.String r5 = "total_time_in_blocking_gc"
            goto L_0x001d
        L_0x003f:
            java.lang.String r5 = "total_time_in_gc"
            goto L_0x001d
        L_0x0043:
            java.lang.String r5 = "total_blocking_gc_count"
            goto L_0x001d
        L_0x0047:
            java.lang.String r5 = "total_gc_count"
            goto L_0x001d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2P7.<init>():void");
    }
}
