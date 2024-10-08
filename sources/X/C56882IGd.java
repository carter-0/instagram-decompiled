package X;

/* renamed from: X.IGd  reason: case insensitive filesystem */
public abstract class C56882IGd implements JPB {
    public String A00;
    public final int[] A01 = new int[2];

    public final String A02() {
        String str = this.A00;
        if (str != null) {
            return str;
        }
        0qQ.A0F("text");
        throw AnonymousClass00P.createAndThrow();
    }

    public final int[] A04(int i, int i2) {
        if (i < 0 || i2 < 0 || i == i2) {
            return null;
        }
        int[] iArr = this.A01;
        iArr[0] = i;
        iArr[1] = i2;
        return iArr;
    }

    public static int A01(C56882IGd iGd) {
        return iGd.A02().length();
    }

    public void A03(String str) {
        this.A00 = str;
    }
}
