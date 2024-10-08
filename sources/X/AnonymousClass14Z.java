package X;

import com.instagram.common.session.UserSession;

/*  JADX ERROR: NullPointerException in pass: ExtractFieldInit
    java.lang.NullPointerException
    */
/* renamed from: X.14Z  reason: invalid class name */
public final class AnonymousClass14Z extends 122 {
    public final AnonymousClass11y A00;
    public final 0t9 A01;

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.14Z.<init>(X.11y, X.0t9):void, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at java.util.ArrayList.forEach(ArrayList.java:1259)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:59)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public AnonymousClass14Z(X.AnonymousClass11y r1, X.0t9 r2) {
        /*
        // Can't load method instructions: Load method exception: null in method: X.14Z.<init>(X.11y, X.0t9):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass14Z.<init>(X.11y, X.0t9):void");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.14Z.A00(X.14Z):void, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at java.util.ArrayList.forEach(ArrayList.java:1259)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:59)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public static final void A00(X.AnonymousClass14Z r1) {
        /*
        // Can't load method instructions: Load method exception: null in method: X.14Z.A00(X.14Z):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass14Z.A00(X.14Z):void");
    }

    public final String A06() {
        return "PulsarSchedulerInitializer";
    }

    public final void A07() {
        AnonymousClass2TM r1;
        0lg A08 = this.A00.A00().A08();
        if (A08 instanceof UserSession) {
            0Tu r2 = 0Tu.A05;
            if (182.A06(r2, A08, 36318505448052887L)) {
                int A012 = (int) 182.A01(r2, A08, 36599980424826527L);
                int i = 2;
                if (A012 != 0) {
                    if (A012 == 1) {
                        r1 = new AnonymousClass2TM(this, 3);
                        0nY.A00().ATE(r1);
                    } else if (A012 == 2) {
                        i = 4;
                    } else if (A012 == 3) {
                        AnonymousClass1HI.A02.Eym(new C387039lZ(this));
                        return;
                    } else {
                        return;
                    }
                }
                r1 = new AnonymousClass2TM(this, i);
                0nY.A00().ATE(r1);
            }
        }
    }
}
