package X;

import android.content.res.Resources;

/* renamed from: X.041  reason: invalid class name */
public abstract class AnonymousClass041 {
    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.041.A00(android.content.Context, android.view.ViewConfiguration, int, int, int):int, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public static int A00(android.content.Context r1, android.view.ViewConfiguration r2, int r3, int r4, int r5) {
        /*
        // Can't load method instructions: Load method exception: null in method: X.041.A00(android.content.Context, android.view.ViewConfiguration, int, int, int):int, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass041.A00(android.content.Context, android.view.ViewConfiguration, int, int, int):int");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.041.A01(android.content.Context, android.view.ViewConfiguration, int, int, int):int, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public static int A01(android.content.Context r1, android.view.ViewConfiguration r2, int r3, int r4, int r5) {
        /*
        // Can't load method instructions: Load method exception: null in method: X.041.A01(android.content.Context, android.view.ViewConfiguration, int, int, int):int, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass041.A01(android.content.Context, android.view.ViewConfiguration, int, int, int):int");
    }

    public static int A02(Resources resources, C22545Y8u y8u, int i, int i2) {
        int dimensionPixelSize;
        if (i == -1) {
            return y8u.AXF().intValue();
        }
        if (i == 0 || (dimensionPixelSize = resources.getDimensionPixelSize(i)) < 0) {
            return i2;
        }
        return dimensionPixelSize;
    }
}
