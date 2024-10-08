package X;

import android.os.Binder;

/* renamed from: X.0Dk  reason: invalid class name and case insensitive filesystem */
public final class C59010Dk {
    public final Binder A00;
    public final AnonymousClass0Dm A01;

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.0Dk.toString():java.lang.String, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public final java.lang.String toString() {
        /*
        // Can't load method instructions: Load method exception: null in method: X.0Dk.toString():java.lang.String, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59010Dk.toString():java.lang.String");
    }

    public /* synthetic */ C59010Dk(Binder binder, long j) {
        AnonymousClass0Dm r0;
        this.A00 = binder;
        if (j != 0) {
            r0 = new AnonymousClass0Dm(j);
        } else {
            r0 = null;
        }
        this.A01 = r0;
    }
}
