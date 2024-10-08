package X;

import android.content.Context;
import android.content.pm.PackageManager;

/* renamed from: X.1SF  reason: invalid class name */
public final class AnonymousClass1SF {
    public final AnonymousClass1SK A00;
    public final AnonymousClass1SH A01;
    public final AnonymousClass1SO A02;
    public final AnonymousClass1SS A03;
    public final AnonymousClass1SI A04;

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.1SF.A00():X.1TT, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public final X.1TT A00() {
        /*
        // Can't load method instructions: Load method exception: null in method: X.1SF.A00():X.1TT, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1SF.A00():X.1TT");
    }

    public final boolean A01(int i) {
        1Sx A002 = this.A00.A00();
        if (A002 == null || !A002.A05 || A002.A00 < i) {
            return false;
        }
        return true;
    }

    public AnonymousClass1SF(Context context, PackageManager packageManager) {
        this.A01 = new AnonymousClass1SH(packageManager);
        this.A04 = new AnonymousClass1SI(packageManager);
        this.A00 = new AnonymousClass1SK(packageManager);
        this.A02 = new AnonymousClass1SO(context, packageManager);
        this.A03 = new AnonymousClass1SS(packageManager);
    }
}
