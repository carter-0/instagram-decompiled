package X;

public final class SHN {
    public final int A00;
    public final C8207QkG A01;
    public final C10581Rub[] A02;
    public final C268854eA A03;

    public final String toString() {
        return this.A01.toString();
    }

    public SHN(C268854eA r1, C8207QkG qkG, C10581Rub[] rubArr, int i) {
        this.A03 = r1;
        this.A01 = qkG;
        this.A02 = rubArr;
        this.A00 = i;
    }

    public static SHN A00(C268854eA r7, C8207QkG qkG, SK8[] sk8Arr) {
        SK8 sk8;
        int A0F = qkG.A0F();
        C10581Rub[] rubArr = new C10581Rub[A0F];
        for (int i = 0; i < A0F; i++) {
            C8202QkB A0H = qkG.A0H(i);
            C12834T9g A022 = r7.A02(A0H);
            if (sk8Arr == null) {
                sk8 = null;
            } else {
                sk8 = sk8Arr[i];
            }
            rubArr[i] = new C10581Rub(A022, A0H, sk8);
        }
        return new SHN(r7, qkG, rubArr, A0F);
    }
}
