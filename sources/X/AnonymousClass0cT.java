package X;

import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;

/*  JADX ERROR: NullPointerException in pass: ExtractFieldInit
    java.lang.NullPointerException
    */
/* renamed from: X.0cT  reason: invalid class name */
public final class AnonymousClass0cT {
    public final long A00;
    public final 0Pj A01;
    public final ArrayList A02;
    public final ArrayList A03;

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.0cT.<init>(X.0cS):void, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public AnonymousClass0cT(X.0cS r1) {
        /*
        // Can't load method instructions: Load method exception: null in method: X.0cT.<init>(X.0cS):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0cT.<init>(X.0cS):void");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.0cT.A01(android.content.Context, X.0bY, X.0RJ, X.0cT):void, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public static void A01(android.content.Context r1, X.0bY r2, X.0RJ r3, X.AnonymousClass0cT r4) {
        /*
        // Can't load method instructions: Load method exception: null in method: X.0cT.A01(android.content.Context, X.0bY, X.0RJ, X.0cT):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0cT.A01(android.content.Context, X.0bY, X.0RJ, X.0cT):void");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.0cT.A03(android.content.Context, android.content.Intent, X.0bY):boolean, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public final boolean A03(android.content.Context r1, android.content.Intent r2, X.0bY r3) {
        /*
        // Can't load method instructions: Load method exception: null in method: X.0cT.A03(android.content.Context, android.content.Intent, X.0bY):boolean, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0cT.A03(android.content.Context, android.content.Intent, X.0bY):boolean");
    }

    public static AnonymousClass0Pr A00(Context context) {
        AnonymousClass0Pr r0;
        AnonymousClass0Pr r02 = AnonymousClass0Pr.A03;
        if (r02 != null) {
            return r02;
        }
        synchronized (AnonymousClass0Pr.class) {
            r0 = AnonymousClass0Pr.A03;
            if (r0 == null) {
                r0 = new AnonymousClass0Pr(context);
                AnonymousClass0Pr.A03 = r0;
            }
        }
        return r0;
    }

    public final void A02(Context context, Intent intent, 0bY r10) {
        long j = this.A00;
        int i = 86400000;
        if ((16 & j) != 0) {
            i = Integer.MAX_VALUE;
        }
        A01(context, r10, C59950cE.A01(context, intent, r10, i, j), this);
    }
}
