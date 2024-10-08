package X;

/*  JADX ERROR: NullPointerException in pass: ExtractFieldInit
    java.lang.NullPointerException
    */
/* renamed from: X.1U2  reason: invalid class name */
public abstract class AnonymousClass1U2 {
    public final 1UI A00;
    public final 1UK A01;
    public final String A02;

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.1U2.<init>(X.1U4):void, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public AnonymousClass1U2(X.AnonymousClass1U4 r1) {
        /*
        // Can't load method instructions: Load method exception: null in method: X.1U2.<init>(X.1U4):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1U2.<init>(X.1U4):void");
    }

    public int hashCode() {
        int i;
        int i2;
        1UI r0 = this.A00;
        int i3 = 0;
        if (r0 != null) {
            i = r0.hashCode();
        } else {
            i = 0;
        }
        int i4 = i * 31;
        1UK r02 = this.A01;
        if (r02 != null) {
            i2 = r02.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = (i4 + i2) * 31;
        String str = this.A02;
        if (str != null) {
            i3 = str.hashCode();
        }
        return i5 + i3;
    }
}
