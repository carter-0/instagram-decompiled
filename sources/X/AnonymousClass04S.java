package X;

import android.view.WindowInsetsAnimation;

/* renamed from: X.04S  reason: invalid class name */
public final class AnonymousClass04S {
    public final 02M A00;
    public final 02M A01;

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.04S.toString():java.lang.String, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public final java.lang.String toString() {
        /*
        // Can't load method instructions: Load method exception: null in method: X.04S.toString():java.lang.String, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass04S.toString():java.lang.String");
    }

    public static AnonymousClass04S A00(WindowInsetsAnimation.Bounds bounds) {
        return new AnonymousClass04S(bounds);
    }

    public AnonymousClass04S(WindowInsetsAnimation.Bounds bounds) {
        this.A00 = 0uS.A02(bounds);
        this.A01 = 0uS.A01(bounds);
    }

    public final WindowInsetsAnimation.Bounds A01() {
        return 0uS.A00(this);
    }

    public AnonymousClass04S(02M r1, 02M r2) {
        this.A00 = r1;
        this.A01 = r2;
    }
}
