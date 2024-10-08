package X;

import android.os.Build;
import java.util.Map;

/*  JADX ERROR: NullPointerException in pass: ExtractFieldInit
    java.lang.NullPointerException
    */
/* renamed from: X.0OX  reason: invalid class name */
public final class AnonymousClass0OX {
    public static AnonymousClass0OX A04;
    public static final boolean A05;
    public final 0HB A00;
    public final 0Pd A01;
    public final Map A02;
    public final 0Lp A03;

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.0OX.<init>(android.content.Context, X.0Pd):void, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public AnonymousClass0OX(android.content.Context r1, X.0Pd r2) {
        /*
        // Can't load method instructions: Load method exception: null in method: X.0OX.<init>(android.content.Context, X.0Pd):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0OX.<init>(android.content.Context, X.0Pd):void");
    }

    static {
        boolean z = false;
        if (Build.VERSION.SDK_INT < 29) {
            z = true;
        }
        A05 = z;
    }
}
