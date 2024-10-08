package X;

/* renamed from: X.01t  reason: invalid class name */
public abstract class AnonymousClass01t {
    public static final Object A00 = new Object();

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.01t.A00(X.01s, int):java.lang.Object, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public static final java.lang.Object A00(X.01s r1, int r2) {
        /*
        // Can't load method instructions: Load method exception: null in method: X.01t.A00(X.01s, int):java.lang.Object, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass01t.A00(X.01s, int):java.lang.Object");
    }

    public static final void A01(01s r8) {
        int i = r8.A00;
        int[] iArr = r8.A02;
        Object[] objArr = r8.A03;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != A00) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        r8.A01 = false;
        r8.A00 = i2;
    }
}
