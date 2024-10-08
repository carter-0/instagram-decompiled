package X;

/* renamed from: X.0vw  reason: invalid class name */
public final class AnonymousClass0vw extends 01g {
    public int A00;

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.0vw.A02(X.0vw, int):void, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public static final void A02(X.AnonymousClass0vw r1, int r2) {
        /*
        // Can't load method instructions: Load method exception: null in method: X.0vw.A02(X.0vw, int):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0vw.A02(X.0vw, int):void");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.0vw.A04():void, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public final void A04() {
        /*
        // Can't load method instructions: Load method exception: null in method: X.0vw.A04():void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0vw.A04():void");
    }

    public static final int A00(AnonymousClass0vw r11, int i) {
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

    public static final void A01(AnonymousClass0vw r2) {
        int i;
        int i2 = r2.A00;
        0vr r0 = 01o.A01;
        if (i2 == 7) {
            i = 6;
        } else {
            i = i2 - (i2 / 8);
        }
        r2.A00 = i - r2.A01;
    }

    public AnonymousClass0vw() {
        0vr r0 = 01o.A01;
        A02(this, 6);
    }
}
