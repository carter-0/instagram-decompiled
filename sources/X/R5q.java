package X;

public final class R5q extends R5r {
    public final int A00;
    public final int A01;

    public R5q(byte[] bArr, int i, int i2) {
        super(bArr);
        int i3 = i + i2;
        int length = bArr.length;
        if ((i | i3 | (i3 - i) | (length - i3)) >= 0) {
            this.A01 = i;
            this.A00 = i2;
        } else if (i < 0) {
            throw Pxg.A0g(i);
        } else if (i3 < i) {
            throw C51969G9p.A0p("Beginning index larger than ending index: ", ", ", i, i3);
        } else {
            throw C51969G9p.A0p("End index: ", " >= ", i3, length);
        }
    }
}
