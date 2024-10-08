package X;

import android.content.Context;
import android.os.Build;

/*  JADX ERROR: NullPointerException in pass: ExtractFieldInit
    java.lang.NullPointerException
    */
/* renamed from: X.18Q  reason: invalid class name */
public final class AnonymousClass18Q extends 0D3 {
    public static final boolean A03;
    public final Context A00;
    public final 0Lp A01;
    public final boolean A02;

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.18Q.<init>(X.0Rt):void, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public AnonymousClass18Q(X.AnonymousClass0Rt r1) {
        /*
        // Can't load method instructions: Load method exception: null in method: X.18Q.<init>(X.0Rt):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass18Q.<init>(X.0Rt):void");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.18Q.CMP():void, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public final void CMP() {
        /*
        // Can't load method instructions: Load method exception: null in method: X.18Q.CMP():void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass18Q.CMP():void");
    }

    public final String getName() {
        return "ContentProviderFixer";
    }

    static {
        boolean z = false;
        if (Build.VERSION.SDK_INT < 29) {
            z = true;
        }
        A03 = z;
    }
}
