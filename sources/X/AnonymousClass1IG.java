package X;

import android.content.Context;

/* renamed from: X.1IG  reason: invalid class name */
public final class AnonymousClass1IG {
    public Context A00;
    public final 1Hm A01;

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.1IG.A00(int, int):void, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public final void A00(int r1, int r2) {
        /*
        // Can't load method instructions: Load method exception: null in method: X.1IG.A00(int, int):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1IG.A00(int, int):void");
    }

    public AnonymousClass1IG(Context context, 1Hm r4) {
        this.A01 = r4;
        Context applicationContext = context.getApplicationContext();
        this.A00 = applicationContext;
        r4.A06.A00(applicationContext);
    }
}
