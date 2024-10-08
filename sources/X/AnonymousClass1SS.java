package X;

import android.content.pm.PackageManager;

/* renamed from: X.1SS  reason: invalid class name */
public final class AnonymousClass1SS {
    public final PackageManager A00;
    public final 1SV A01 = new Object();

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.1SS.A00(X.1TK):java.util.HashSet, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at java.util.ArrayList.forEach(ArrayList.java:1259)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:59)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public final java.util.HashSet A00(X.1TK r1) {
        /*
        // Can't load method instructions: Load method exception: null in method: X.1SS.A00(X.1TK):java.util.HashSet, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1SS.A00(X.1TK):java.util.HashSet");
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.1SV, java.lang.Object] */
    public AnonymousClass1SS(PackageManager packageManager) {
        this.A00 = packageManager;
    }
}
