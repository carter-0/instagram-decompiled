package X;

import android.content.Context;
import android.util.SparseBooleanArray;

/*  JADX ERROR: NullPointerException in pass: ExtractFieldInit
    java.lang.NullPointerException
    */
/* renamed from: X.2Qc  reason: invalid class name */
public final class AnonymousClass2Qc {
    public static AnonymousClass2Qc A01;
    public final SparseBooleanArray A00;

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.2Qc.<init>(android.content.Context):void, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public AnonymousClass2Qc(android.content.Context r1) {
        /*
        // Can't load method instructions: Load method exception: null in method: X.2Qc.<init>(android.content.Context):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2Qc.<init>(android.content.Context):void");
    }

    public static synchronized AnonymousClass2Qc A00(Context context) {
        AnonymousClass2Qc r1;
        synchronized (AnonymousClass2Qc.class) {
            r1 = A01;
            if (r1 == null) {
                r1 = new AnonymousClass2Qc(context.getApplicationContext());
                A01 = r1;
            }
        }
        return r1;
    }
}
