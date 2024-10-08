package X;

import android.content.Context;
import android.content.pm.PackageManager;

/* renamed from: X.1SO  reason: invalid class name */
public final class AnonymousClass1SO {
    public final Context A00;
    public final PackageManager A01;

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.1SO.A00():X.RxK, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at java.util.ArrayList.forEach(ArrayList.java:1259)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:59)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public final X.C10741RxK A00() {
        /*
        // Can't load method instructions: Load method exception: null in method: X.1SO.A00():X.RxK, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1SO.A00():X.RxK");
    }

    public AnonymousClass1SO(Context context, PackageManager packageManager) {
        this.A01 = packageManager;
        this.A00 = context;
    }
}
