package X;

/* renamed from: X.0B8  reason: invalid class name */
public final class AnonymousClass0B8 {
    public static final String[] A07 = {"rchar:", "wchar:", "syscr:", "syscw:", "read_bytes:", "write_bytes:", "cancelled_write_bytes:"};
    public final long A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final long A04;
    public final long A05;
    public final long A06;

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.0B8.A00():X.0B8, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public static X.AnonymousClass0B8 A00() {
        /*
        // Can't load method instructions: Load method exception: null in method: X.0B8.A00():X.0B8, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0B8.A00():X.0B8");
    }

    public final AnonymousClass0B8 A01(AnonymousClass0B8 r19) {
        AnonymousClass0B8 r2 = r19;
        return new AnonymousClass0B8(this.A02 - r2.A02, this.A05 - r2.A05, this.A03 - r2.A03, this.A06 - r2.A06, this.A01 - r2.A01, this.A04 - r2.A04, this.A00 - r2.A00);
    }

    public AnonymousClass0B8(long j, long j2, long j3, long j4, long j5, long j6, long j7) {
        this.A02 = j;
        this.A05 = j2;
        this.A03 = j3;
        this.A06 = j4;
        this.A01 = j5;
        this.A04 = j6;
        this.A00 = j7;
    }
}
