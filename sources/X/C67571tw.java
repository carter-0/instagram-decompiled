package X;

/*  JADX ERROR: NullPointerException in pass: ExtractFieldInit
    java.lang.NullPointerException
    */
/* renamed from: X.1tw  reason: invalid class name and case insensitive filesystem */
public final class C67571tw {
    public static C67571tw A0A;
    public static final Object A0B = new Object();
    public int A00;
    public int A01;
    public int A02;
    public C67571tw A03;
    public boolean A04;
    public boolean A05;
    public final long[] A06;
    public final long[] A07;
    public final 0Df[] A08;
    public final 0Df[] A09;

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.1tw.<init>(int):void, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public C67571tw(int r1) {
        /*
        // Can't load method instructions: Load method exception: null in method: X.1tw.<init>(int):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67571tw.<init>(int):void");
    }

    public final void A00() {
        for (int i = 0; i < this.A02; i++) {
            AnonymousClass0Jz r0 = this.A08[i];
            if (r0 != null) {
                r0.A02();
                this.A07[i] = -3;
            }
        }
        for (int i2 = 0; i2 < this.A01; i2++) {
            AnonymousClass0Jz r02 = this.A09[i2];
            if (r02 != null) {
                r02.A02();
                this.A06[i2] = -3;
            }
        }
        this.A02 = 0;
        this.A01 = 0;
        this.A03 = null;
        this.A00 = 0;
        this.A05 = false;
        this.A04 = false;
        synchronized (A0B) {
            C67571tw r2 = A0A;
            if (r2 == null || 15 > r2.A00) {
                this.A03 = r2;
                int i3 = 1;
                if (r2 != null) {
                    i3 = 1 + r2.A00;
                }
                this.A00 = i3;
                A0A = this;
            }
        }
    }
}
