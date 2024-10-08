package X;

import android.os.Process;

/* renamed from: X.0da  reason: invalid class name */
public abstract class AnonymousClass0da {
    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.0da.A01():java.lang.String[], dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public static java.lang.String[] A01() {
        /*
        // Can't load method instructions: Load method exception: null in method: X.0da.A01():java.lang.String[], dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0da.A01():java.lang.String[]");
    }

    public static boolean A00() {
        return Process.is64Bit();
    }
}
