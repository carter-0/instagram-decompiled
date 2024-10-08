package X;

import com.instagram.react.modules.base.IgReactQEModule;

/* renamed from: X.0aL  reason: invalid class name and case insensitive filesystem */
public final class C59610aL implements AnonymousClass0NC {
    public final int A00;

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.0aL.CMX(X.0NJ):void, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public final void CMX(X.0NJ r1) {
        /*
        // Can't load method instructions: Load method exception: null in method: X.0aL.CMX(X.0NJ):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59610aL.CMX(X.0NJ):void");
    }

    public C59610aL(int i) {
        this.A00 = i;
    }

    public final Integer BVK() {
        switch (this.A00) {
            case 0:
                return AnonymousClass05K.A00;
            case 1:
                return AnonymousClass05K.A06;
            case 2:
                return AnonymousClass05K.A08;
            case 3:
                return AnonymousClass05K.A09;
            case 4:
                return AnonymousClass05K.A07;
            case 5:
                return AnonymousClass05K.A0A;
            case 6:
                return AnonymousClass05K.A0F;
            case 7:
                return AnonymousClass05K.A05;
            case 8:
                return AnonymousClass05K.A02;
            case 9:
                return AnonymousClass05K.A0c;
            case 10:
                return AnonymousClass05K.A0e;
            case 11:
                return AnonymousClass05K.A0w;
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                return AnonymousClass05K.A0o;
            default:
                return AnonymousClass05K.A0H;
        }
    }

    public final Integer CGT() {
        switch (this.A00) {
            case 11:
                return AnonymousClass05K.A01;
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                return AnonymousClass05K.A0N;
            default:
                return AnonymousClass05K.A0C;
        }
    }
}
