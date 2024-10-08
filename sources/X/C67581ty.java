package X;

import android.content.Context;
import com.facebook.analytics2.logger.legacy.uploader.AlarmBasedUploadService;

/* renamed from: X.1ty  reason: invalid class name and case insensitive filesystem */
public final class C67581ty {
    public static C67581ty A02;
    public static final String A03 = AlarmBasedUploadService.class.getName();
    public final Context A00;
    public volatile String A01;

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.1ty.A01():boolean, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public final boolean A01() {
        /*
        // Can't load method instructions: Load method exception: null in method: X.1ty.A01():boolean, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67581ty.A01():boolean");
    }

    public static synchronized C67581ty A00(Context context) {
        C67581ty r1;
        synchronized (C67581ty.class) {
            r1 = A02;
            if (r1 == null) {
                r1 = new C67581ty(context.getApplicationContext());
                A02 = r1;
            }
        }
        return r1;
    }

    public C67581ty(Context context) {
        this.A00 = context;
    }
}
