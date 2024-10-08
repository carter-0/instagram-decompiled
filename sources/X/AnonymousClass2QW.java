package X;

import android.content.Context;
import android.util.SparseArray;

/*  JADX ERROR: NullPointerException in pass: ExtractFieldInit
    java.lang.NullPointerException
    */
/* renamed from: X.2QW  reason: invalid class name */
public final class AnonymousClass2QW {
    public static AnonymousClass2QW A05;
    public static AnonymousClass2QW A06;
    public boolean A00;
    public final Context A01;
    public final SparseArray A02;
    public final Class A03;
    public final String A04;

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.2QW.<init>(android.content.Context, int):void, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at java.util.ArrayList.forEach(ArrayList.java:1259)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:59)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public AnonymousClass2QW(android.content.Context r1, int r2) {
        /*
        // Can't load method instructions: Load method exception: null in method: X.2QW.<init>(android.content.Context, int):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2QW.<init>(android.content.Context, int):void");
    }

    public static synchronized AnonymousClass2QW A00(Context context, int i) {
        AnonymousClass2QW r2;
        synchronized (AnonymousClass2QW.class) {
            if (i != 0) {
                r2 = A05;
                if (r2 == null) {
                    r2 = new AnonymousClass2QW(context.getApplicationContext(), 1);
                    A05 = r2;
                }
            } else {
                r2 = A06;
                if (r2 == null) {
                    r2 = new AnonymousClass2QW(context.getApplicationContext(), 0);
                    A06 = r2;
                }
            }
        }
        return r2;
    }
}
