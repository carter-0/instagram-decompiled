package X;

import android.content.ComponentName;

/* renamed from: X.02B  reason: invalid class name */
public abstract class AnonymousClass02B {
    public int A00;
    public boolean A01;
    public final ComponentName A02;

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.02B.A00(int):void, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public final void A00(int r1) {
        /*
        // Can't load method instructions: Load method exception: null in method: X.02B.A00(int):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass02B.A00(int):void");
    }

    public AnonymousClass02B(ComponentName componentName) {
        this.A02 = componentName;
    }
}
