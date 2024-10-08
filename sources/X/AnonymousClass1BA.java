package X;

import android.content.Context;

/* renamed from: X.1BA  reason: invalid class name */
public final class AnonymousClass1BA extends AnonymousClass1BB {
    public static AnonymousClass1BA A01;
    public final 1BD A00;

    public final String Bpm() {
        return null;
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.1BA.CGg(X.1LJ, int):java.io.File, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public final java.io.File CGg(X.1LJ r1, int r2) {
        /*
        // Can't load method instructions: Load method exception: null in method: X.1BA.CGg(X.1LJ, int):java.io.File, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1BA.CGg(X.1LJ, int):java.io.File");
    }

    public static AnonymousClass1BA A00(Context context) {
        AnonymousClass1BA r1 = A01;
        if (r1 != null) {
            return r1;
        }
        AnonymousClass1BA r12 = new AnonymousClass1BA(context.getApplicationContext());
        A01 = r12;
        return r12;
    }

    public final 1BD A01() {
        return this.A00;
    }

    public AnonymousClass1BA(Context context) {
        1BD r0;
        synchronized (1BD.class) {
            r0 = 1BD.A03;
            if (r0 == null) {
                r0 = new 1BD(context);
                1BD.A03 = r0;
            }
        }
        this.A00 = r0;
    }
}
