package X;

import android.os.SystemClock;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: X.1G3  reason: invalid class name */
public abstract class AnonymousClass1G3 {
    public static long A00;
    public static 1G4 A01;
    public static long A02;
    public static 1G4 A03;
    public static Set A04;
    public static final long A05 = TimeUnit.SECONDS.toMillis(15);

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.1G3.A01(X.1G4):X.1G4, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public static X.1G4 A01(X.1G4 r1) {
        /*
        // Can't load method instructions: Load method exception: null in method: X.1G3.A01(X.1G4):X.1G4, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1G3.A01(X.1G4):X.1G4");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.1G3.A02():java.util.Set, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public static java.util.Set A02() {
        /*
        // Can't load method instructions: Load method exception: null in method: X.1G3.A02():java.util.Set, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1G3.A02():java.util.Set");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.1G3.A04(android.content.Context):boolean, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public static boolean A04(android.content.Context r1) {
        /*
        // Can't load method instructions: Load method exception: null in method: X.1G3.A04(android.content.Context):boolean, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1G3.A04(android.content.Context):boolean");
    }

    public static 1G4 A00() {
        if (SystemClock.elapsedRealtime() - A02 > A05) {
            1G4 A012 = A01(A03);
            if (A012 == null || !A012.A02) {
                A012 = null;
            }
            A03 = A012;
            A02 = SystemClock.elapsedRealtime();
        }
        return A03;
    }

    public static boolean A03() {
        if (A00() != null) {
            return true;
        }
        return false;
    }
}
