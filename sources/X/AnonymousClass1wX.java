package X;

/* renamed from: X.1wX  reason: invalid class name */
public final class AnonymousClass1wX implements C61110lV {
    public final /* synthetic */ 1wS A00;

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.1wX.onAppBackgrounded():void, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public final void onAppBackgrounded() {
        /*
        // Can't load method instructions: Load method exception: null in method: X.1wX.onAppBackgrounded():void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1wX.onAppBackgrounded():void");
    }

    public AnonymousClass1wX(1wS r1) {
        this.A00 = r1;
    }

    public final void onAppForegrounded() {
        29t r0;
        int A03 = AnonymousClass0fD.A03(-1358876196);
        274 r02 = this.A00.A00;
        if (!(r02 == null || (r0 = r02.A06) == null)) {
            r0.A03 = false;
        }
        1w8.A00().A02();
        AnonymousClass0fD.A0A(-891414082, A03);
    }
}
