package X;

import android.view.WindowInsets;

/* renamed from: X.0uO  reason: invalid class name and case insensitive filesystem */
public class C62610uO extends AnonymousClass04g {
    public final WindowInsets.Builder A00;

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.0uO.A00():X.04k, dex: classes.dex
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
        // Can't load method instructions: Load method exception: null in method: X.0uO.A00():X.04k, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C62610uO.A00():X.04k");
    }

    public final void A02(02M r3) {
        this.A00.setMandatorySystemGestureInsets(r3.A03());
    }

    public final void A03(02M r3) {
        this.A00.setSystemGestureInsets(r3.A03());
    }

    public final void A04(02M r3) {
        this.A00.setTappableElementInsets(r3.A03());
    }

    public final void A05(02M r3) {
        this.A00.setStableInsets(r3.A03());
    }

    public final void A06(02M r3) {
        this.A00.setSystemWindowInsets(r3.A03());
    }

    public C62610uO(04k r3) {
        super(r3);
        WindowInsets.Builder builder;
        WindowInsets A03 = r3.A03();
        if (A03 == null) {
            builder = new WindowInsets.Builder();
        }
        this.A00 = builder;
    }

    public C62610uO() {
        this.A00 = new WindowInsets.Builder();
    }
}
