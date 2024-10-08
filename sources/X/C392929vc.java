package X;

/* renamed from: X.9vc  reason: invalid class name and case insensitive filesystem */
public abstract /* synthetic */ class C392929vc {
    public static int A00(C344557s3 r1, int i) {
        int Apq = r1.Apq();
        if ((Apq & 4096) != 0) {
            return i | 4096;
        }
        if ((Apq & C249703kE.FLAG_MOVED) != 0) {
            return i | C249703kE.FLAG_MOVED;
        }
        if ((Apq & 512) != 0) {
            return i | 512;
        }
        if ((Apq & 1024) != 0) {
            return i | 1024;
        }
        if ((Apq & 256) != 0) {
            return i | 256;
        }
        return i;
    }
}
