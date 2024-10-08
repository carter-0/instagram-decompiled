package X;

import android.content.Context;
import android.os.Handler;

/*  JADX ERROR: NullPointerException in pass: ExtractFieldInit
    java.lang.NullPointerException
    */
/* renamed from: X.18l  reason: invalid class name */
public final class AnonymousClass18l extends 0D3 {
    public final int A00;
    public final Context A01;
    public final Handler A02;
    public final boolean A03;
    public final boolean A04;

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.18l.<init>(X.0Rt):void, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public AnonymousClass18l(X.AnonymousClass0Rt r1) {
        /*
        // Can't load method instructions: Load method exception: null in method: X.18l.<init>(X.0Rt):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass18l.<init>(X.0Rt):void");
    }

    public final String getName() {
        return "PackageInfoCache";
    }

    public final void CMP() {
        if (this.A03) {
            A08();
            if (this.A04) {
                0JW.A00(this.A01);
                return;
            }
            Handler handler = this.A02;
            int i = this.A00;
            0JW.A02 = true;
            0JW.A01 = handler;
            0JW.A03.clear();
            0JW.A00 = i;
        }
    }
}
