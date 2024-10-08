package X;

import android.graphics.Rect;
import android.view.DisplayCutout;
import android.view.View;
import android.view.WindowInsets;
import java.util.Collections;
import java.util.List;

/* renamed from: X.0mR  reason: invalid class name and case insensitive filesystem */
public abstract class C61290mR {
    public static List A00;

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.0mR.A02(android.content.Context):int, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public static final int A02(android.content.Context r1) {
        /*
        // Can't load method instructions: Load method exception: null in method: X.0mR.A02(android.content.Context):int, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61290mR.A02(android.content.Context):int");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.0mR.A03(android.content.Context):void, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public static final void A03(android.content.Context r1) {
        /*
        // Can't load method instructions: Load method exception: null in method: X.0mR.A03(android.content.Context):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61290mR.A03(android.content.Context):void");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.0mR.A05(android.view.Window):void, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public static final void A05(android.view.Window r1) {
        /*
        // Can't load method instructions: Load method exception: null in method: X.0mR.A05(android.view.Window):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61290mR.A05(android.view.Window):void");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.0mR.A06(android.view.WindowManager$LayoutParams, int):void, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public static final void A06(android.view.WindowManager.LayoutParams r1, int r2) {
        /*
        // Can't load method instructions: Load method exception: null in method: X.0mR.A06(android.view.WindowManager$LayoutParams, int):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61290mR.A06(android.view.WindowManager$LayoutParams, int):void");
    }

    public static final int A00() {
        List<Rect> list = A00;
        int i = 0;
        if (list != null) {
            for (Rect rect : list) {
                if (rect.height() > i) {
                    i = rect.height();
                }
            }
        }
        return i;
    }

    public static final int A01() {
        List<Rect> list = A00;
        int i = 0;
        if (list != null) {
            for (Rect rect : list) {
                if (rect.top == 0 && rect.height() > i) {
                    i = rect.height();
                }
            }
        }
        return i;
    }

    public static final void A04(View view) {
        List<Rect> emptyList;
        DisplayCutout displayCutout;
        if (view.isAttachedToWindow()) {
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets == null || (displayCutout = rootWindowInsets.getDisplayCutout()) == null) {
                emptyList = Collections.emptyList();
            } else {
                emptyList = displayCutout.getBoundingRects();
            }
            A00 = emptyList;
            return;
        }
        view.addOnAttachStateChangeListener(new AnonymousClass0mQ());
    }

    public static final boolean A07() {
        if (A01() > 0) {
            return true;
        }
        return false;
    }
}
