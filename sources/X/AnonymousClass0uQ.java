package X;

import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/*  JADX ERROR: NullPointerException in pass: ExtractFieldInit
    java.lang.NullPointerException
    */
/* renamed from: X.0uQ  reason: invalid class name */
public final class AnonymousClass0uQ extends AnonymousClass04g {
    public static Constructor A02;
    public static Field A03;
    public static boolean A04;
    public static boolean A05;
    public WindowInsets A00;
    public 02M A01;

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.0uQ.A00():X.04k, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at java.util.ArrayList.forEach(ArrayList.java:1259)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:59)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public final X.04k A00() {
        /*
        // Can't load method instructions: Load method exception: null in method: X.0uQ.A00():X.04k, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0uQ.A00():X.04k");
    }

    public final void A05(02M r1) {
        this.A01 = r1;
    }

    public final void A06(02M r6) {
        WindowInsets windowInsets = this.A00;
        if (windowInsets != null) {
            this.A00 = windowInsets.replaceSystemWindowInsets(r6.A01, r6.A03, r6.A02, r6.A00);
        }
    }
}
