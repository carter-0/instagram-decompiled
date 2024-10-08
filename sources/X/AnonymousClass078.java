package X;

import android.view.View;

/* renamed from: X.078  reason: invalid class name */
public final class AnonymousClass078 {
    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.078.A00(int):java.lang.Integer, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at java.util.ArrayList.forEach(ArrayList.java:1259)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:59)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public static final java.lang.Integer A00(int r1) {
        /*
        // Can't load method instructions: Load method exception: null in method: X.078.A00(int):java.lang.Integer, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass078.A00(int):java.lang.Integer");
    }

    public final Integer A01(View view) {
        if (view.getAlpha() == 0.0f && view.getVisibility() == 0) {
            return AnonymousClass05K.A0N;
        }
        return A00(view.getVisibility());
    }
}
