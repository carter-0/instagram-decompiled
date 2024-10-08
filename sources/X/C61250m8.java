package X;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;

/* renamed from: X.0m8  reason: invalid class name and case insensitive filesystem */
public final class C61250m8 {
    public static Integer A05;
    public static boolean A06;
    public final Context A00;
    public final Handler A01;
    public final LayoutInflater A02;
    public final C61240m5 A03;
    public final Handler.Callback A04;

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.0m8.A00(X.0m6, int):void, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at java.util.ArrayList.forEach(ArrayList.java:1259)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:59)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public final void A00(X.AnonymousClass0m6 r1, int r2) {
        /*
        // Can't load method instructions: Load method exception: null in method: X.0m8.A00(X.0m6, int):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61250m8.A00(X.0m6, int):void");
    }

    public C61250m8(Context context, int i) {
        C251383n1 r2;
        int intValue;
        C61240m5 r4 = C61240m5.A02;
        this.A03 = r4;
        AnonymousClass0m7 r3 = new AnonymousClass0m7(this);
        this.A04 = r3;
        if (i != 0) {
            r2 = new C251383n1(context, i);
        } else {
            r2 = new C251383n1(context.getApplicationContext(), context.getTheme());
        }
        this.A00 = r2;
        this.A02 = new 0m1(r2);
        this.A01 = new Handler(Looper.getMainLooper(), r3);
        Integer num = A05;
        if (num != null && r4.getPriority() != (intValue = num.intValue())) {
            r4.setPriority(intValue);
        }
    }
}
