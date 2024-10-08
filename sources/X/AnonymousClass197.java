package X;

import android.app.Activity;
import android.app.ActivityThread;
import android.os.Build;
import com.facebook.fixie.fixes.common.ContentCaptureManagerFixer$1;

/*  JADX ERROR: NullPointerException in pass: ExtractFieldInit
    java.lang.NullPointerException
    */
/* renamed from: X.197  reason: invalid class name */
public final class AnonymousClass197 extends 0D3 {
    public static final boolean A01;
    public final boolean A00;

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.197.<init>(X.0Rt):void, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public AnonymousClass197(X.AnonymousClass0Rt r1) {
        /*
        // Can't load method instructions: Load method exception: null in method: X.197.<init>(X.0Rt):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass197.<init>(X.0Rt):void");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.197.A00(android.content.Context):void, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public static void A00(android.content.Context r1) {
        /*
        // Can't load method instructions: Load method exception: null in method: X.197.A00(android.content.Context):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass197.A00(android.content.Context):void");
    }

    public final String getName() {
        return "ContentCaptureManagerFixer";
    }

    static {
        boolean z = false;
        if (Build.VERSION.SDK_INT >= 29) {
            z = true;
        }
        A01 = z;
    }

    public final void CMP() {
        if (this.A00 && Build.VERSION.SDK_INT >= 29) {
            ActivityThread.currentActivityThread().getApplication().registerActivityLifecycleCallbacks(new ContentCaptureManagerFixer$1(this));
            Activity A002 = AnonymousClass0Cr.A00();
            if (A002 != null) {
                A00(A002);
            }
        }
    }
}
