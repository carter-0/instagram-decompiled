package X;

import android.content.Context;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.1Ub  reason: invalid class name and case insensitive filesystem */
public final class C64791Ub {
    public int A00 = 0;
    public Context A01;
    public Set A02 = new HashSet();
    public boolean A03 = false;

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.1Ub.A00():X.1Uf, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public final X.1Uf A00() {
        /*
        // Can't load method instructions: Load method exception: null in method: X.1Ub.A00():X.1Uf, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64791Ub.A00():X.1Uf");
    }

    public C64791Ub(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.A01 = applicationContext;
        if (applicationContext == null) {
            this.A01 = context;
        }
    }
}
