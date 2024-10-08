package X;

/* renamed from: X.TQk  reason: case insensitive filesystem */
public class C13219TQk extends RuntimeException {
    public final int A00;
    public final String A01;
    public final String A02;

    public final String toString() {
        StringBuilder A16 = Pxe.A16("Code: ");
        A16.append(this.A00);
        A16.append("Title: ");
        A16.append(this.A02);
        A16.append("Description: ");
        String A0l = AnonymousClass7TF.A0l(this.A01, A16);
        0qQ.A07(A0l);
        return A0l;
    }

    public C13219TQk(int i, String str, String str2) {
        super(str2);
        this.A00 = i;
        this.A02 = str;
        this.A01 = str2;
    }
}
