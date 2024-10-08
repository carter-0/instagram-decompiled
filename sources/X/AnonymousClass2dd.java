package X;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.Pair;

/* renamed from: X.2dd  reason: invalid class name */
public abstract class AnonymousClass2dd {
    public static final 2de A00 = new 2de();

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.2dd.A01(android.content.res.Resources, int):java.lang.String, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public static java.lang.String A01(android.content.res.Resources r1, int r2) {
        /*
        // Can't load method instructions: Load method exception: null in method: X.2dd.A01(android.content.res.Resources, int):java.lang.String, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2dd.A01(android.content.res.Resources, int):java.lang.String");
    }

    public static Drawable A00(Resources resources, int i) {
        Pair A05 = A00.A05(resources, i);
        Object obj = A05.first;
        if (obj != null) {
            return (Drawable) obj;
        }
        return ((Drawable.ConstantState) A05.second).newDrawable(resources);
    }
}
