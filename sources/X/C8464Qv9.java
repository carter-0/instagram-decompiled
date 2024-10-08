package X;

/* renamed from: X.Qv9  reason: case insensitive filesystem */
public final class C8464Qv9 extends C8465QvA {
    public final char[] A00;

    public C8464Qv9(SJF sjf) {
        super(sjf, (Character) null);
        char[] cArr = new char[512];
        this.A00 = cArr;
        char[] cArr2 = sjf.A07;
        int i = 0;
        if (cArr2.length != 16) {
            throw Pxe.A0g();
        }
        do {
            cArr[i] = cArr2[i >>> 4];
            Pxe.A1a(cArr2, cArr, i, i | 256);
            i++;
        } while (i < 256);
    }
}
