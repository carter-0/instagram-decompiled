package X;

/* renamed from: X.0wP  reason: invalid class name and case insensitive filesystem */
public final class C62870wP extends 01a {
    public int A00;

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.0wP.A01(X.0wP, int):void, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at java.util.ArrayList.forEach(ArrayList.java:1259)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:59)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public static final void A01(X.C62870wP r1, int r2) {
        /*
        // Can't load method instructions: Load method exception: null in method: X.0wP.A01(X.0wP, int):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C62870wP.A01(X.0wP, int):void");
    }

    public static final int A00(C62870wP r11, int i) {
        int i2 = r11.A00;
        int i3 = i & i2;
        int i4 = 0;
        while (true) {
            long[] jArr = r11.A03;
            int i5 = i3 >> 3;
            int i6 = (i3 & 7) << 3;
            long j = ((jArr[i5 + 1] << (64 - i6)) & ((-((long) i6)) >> 63)) | (jArr[i5] >>> i6);
            long j2 = j & ((-1 ^ j) << 7) & -9187201950435737472L;
            if (j2 != 0) {
                return (i3 + (Long.numberOfTrailingZeros(j2) >> 3)) & i2;
            }
            i4 += 8;
            i3 = (i3 + i4) & i2;
        }
    }

    public C62870wP() {
        0vr r0 = 01o.A01;
        A01(this, 6);
    }
}
