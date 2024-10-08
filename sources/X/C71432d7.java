package X;

import java.util.ArrayList;

/* renamed from: X.2d7  reason: invalid class name and case insensitive filesystem */
public final class C71432d7 {
    public 2d1 A00;
    public AnonymousClass2d8 A01 = new Object();
    public final ArrayList A02 = new ArrayList();

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.2d7.A01(X.2d1):void, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public final void A01(X.2d1 r1) {
        /*
        // Can't load method instructions: Load method exception: null in method: X.2d7.A01(X.2d1):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71432d7.A01(X.2d1):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003a, code lost:
        if (r7.A01 <= 0.0f) goto L_0x003c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0030, code lost:
        if (r7.A01 <= 0.0f) goto L_0x0032;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A00(X.2d3 r7, X.C71472dN r8, X.C71432d7 r9, int r10) {
        /*
            X.2d8 r3 = r9.A01
            java.lang.Integer[] r0 = r7.A14
            r2 = 0
            r4 = r0[r2]
            r3.A06 = r4
            r6 = 1
            r5 = r0[r6]
            r3.A07 = r5
            int r0 = r7.A07()
            r3.A00 = r0
            int r0 = r7.A06()
            r3.A05 = r0
            r3.A09 = r2
            r3.A01 = r10
            java.lang.Integer r1 = X.AnonymousClass05K.A0C
            r0 = 0
            if (r4 != r1) goto L_0x0024
            r0 = 1
        L_0x0024:
            r4 = 0
            if (r5 != r1) goto L_0x0028
            r4 = 1
        L_0x0028:
            r1 = 0
            if (r0 == 0) goto L_0x0032
            float r0 = r7.A01
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r5 = 1
            if (r0 > 0) goto L_0x0033
        L_0x0032:
            r5 = 0
        L_0x0033:
            if (r4 == 0) goto L_0x003c
            float r0 = r7.A01
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r4 = 1
            if (r0 > 0) goto L_0x003d
        L_0x003c:
            r4 = 0
        L_0x003d:
            r1 = 4
            if (r5 == 0) goto L_0x004a
            int[] r0 = r7.A10
            r0 = r0[r2]
            if (r0 != r1) goto L_0x004a
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            r3.A06 = r0
        L_0x004a:
            if (r4 == 0) goto L_0x0056
            int[] r0 = r7.A10
            r0 = r0[r6]
            if (r0 != r1) goto L_0x0056
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            r3.A07 = r0
        L_0x0056:
            r8.Cnt(r7, r3)
            int r0 = r3.A04
            r7.A0I(r0)
            int r0 = r3.A03
            r7.A0H(r0)
            boolean r0 = r3.A08
            r7.A0q = r0
            int r0 = r3.A02
            r7.A0G(r0)
            r3.A01 = r2
            boolean r0 = r3.A09
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71432d7.A00(X.2d3, X.2dN, X.2d7, int):boolean");
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Object, X.2d8] */
    public C71432d7(2d1 r2) {
        this.A00 = r2;
    }
}
