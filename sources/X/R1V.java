package X;

public final class R1V extends R1W {
    public final char[] A00 = new char[512];

    public R1V(C11285SJd sJd) {
        super(sJd, (Character) null);
        char[] cArr = sJd.A07;
        int i = 0;
        17k.A0E(AnonymousClass7TF.A1S(cArr.length, 16));
        do {
            char[] cArr2 = this.A00;
            cArr2[i] = cArr[i >>> 4];
            Pxe.A1a(cArr, cArr2, i, i | 256);
            i++;
        } while (i < 256);
    }
}
