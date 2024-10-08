package X;

import android.content.Context;

/* renamed from: X.1RL  reason: invalid class name */
public final class AnonymousClass1RL {
    public final Context A00;
    public final 0gM A01;
    public final AnonymousClass1SC A02;

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.1RL.A00(android.content.Context, X.0lg):X.1RO, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public static X.1RO A00(android.content.Context r1, X.0lg r2) {
        /*
        // Can't load method instructions: Load method exception: null in method: X.1RL.A00(android.content.Context, X.0lg):X.1RO, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1RL.A00(android.content.Context, X.0lg):X.1RO");
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [X.1SC, java.lang.Object] */
    public AnonymousClass1RL(Context context, 0lg r3) {
        this.A00 = context;
        this.A01 = AnonymousClass1RY.A00(context).A03;
        ? obj = new Object();
        obj.A00 = r3;
        this.A02 = obj;
    }

    public AnonymousClass1RL() {
    }
}
