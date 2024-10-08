package X;

import android.content.Context;

/* renamed from: X.146  reason: invalid class name */
public abstract class AnonymousClass146 extends 122 {
    public final Context A00;
    public final AnonymousClass11y A01;

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.146.A07():void, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at java.util.ArrayList.forEach(ArrayList.java:1259)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:59)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public void A07() {
        /*
        // Can't load method instructions: Load method exception: null in method: X.146.A07():void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass146.A07():void");
    }

    public final String A06() {
        return "PushNotificationInitializer";
    }

    public AnonymousClass146(Context context, AnonymousClass11y r2) {
        this.A00 = context;
        this.A01 = r2;
    }
}
