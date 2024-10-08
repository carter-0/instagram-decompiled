package X;

import com.facebook.systrace.Systrace;

/* renamed from: X.2RY  reason: invalid class name */
public final class AnonymousClass2RY implements AnonymousClass0SS, AnonymousClass0N2, AnonymousClass0f6 {
    public volatile Integer A00 = AnonymousClass05K.A0C;

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.2RY.CtZ(X.0SG):void, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public final void CtZ(X.0SG r1) {
        /*
        // Can't load method instructions: Load method exception: null in method: X.2RY.CtZ(X.0SG):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2RY.CtZ(X.0SG):void");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.2RY.D7t(X.0SG):void, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public final void D7t(X.0SG r1) {
        /*
        // Can't load method instructions: Load method exception: null in method: X.2RY.D7t(X.0SG):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2RY.D7t(X.0SG):void");
    }

    public final Integer C9K() {
        return this.A00;
    }

    public final void Dsp() {
        Integer num;
        if (Systrace.A0E(1)) {
            num = AnonymousClass05K.A00;
        } else {
            num = AnonymousClass05K.A0C;
        }
        this.A00 = num;
    }

    public final void Dsr() {
        this.A00 = AnonymousClass05K.A0C;
    }
}
