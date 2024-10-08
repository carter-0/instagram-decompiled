package X;

import android.content.Context;

/* renamed from: X.2Yw  reason: invalid class name and case insensitive filesystem */
public final class C70942Yw {
    public static C70942Yw A05;
    public C277344ux A00;
    public C14004To6 A01;
    public boolean A02;
    public C69649NpX A03;
    public final AnonymousClass2Yx A04 = new AnonymousClass2Yx(this);

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.2Yw.A00(android.content.Context, X.0lg, X.2Yw):void, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public static void A00(android.content.Context r1, X.0lg r2, X.C70942Yw r3) {
        /*
        // Can't load method instructions: Load method exception: null in method: X.2Yw.A00(android.content.Context, X.0lg, X.2Yw):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70942Yw.A00(android.content.Context, X.0lg, X.2Yw):void");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.2Yw.A02():void, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public final void A02() {
        /*
        // Can't load method instructions: Load method exception: null in method: X.2Yw.A02():void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70942Yw.A02():void");
    }

    public final void A01() {
        C70635OEg oEg;
        C277344ux r1 = this.A00;
        if (r1 != null) {
            r1.A02 = false;
        }
        C14004To6 to6 = this.A01;
        if (to6 != null) {
            to6.A01 = false;
        }
        C69649NpX npX = this.A03;
        if (npX != null && (oEg = npX.A00) != null) {
            C66979MgD mgD = oEg.A02;
            mgD.sendMessage(mgD.obtainMessage(2));
        }
    }

    public C70942Yw(Context context, 0lg r3) {
        if (r3 != null) {
            A00(context, r3, this);
        }
    }
}
