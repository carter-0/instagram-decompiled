package X;

/* renamed from: X.46F  reason: invalid class name */
public final class AnonymousClass46F {
    public int A00;
    public short[] A01;

    public final void A00(short s) {
        short[] sArr = this.A01;
        int length = sArr.length;
        if (length == this.A00 + 1) {
            short[] sArr2 = new short[(length * 2)];
            System.arraycopy(sArr, 0, sArr2, 0, length);
            this.A01 = sArr2;
            sArr = sArr2;
        }
        int i = this.A00 + 1;
        this.A00 = i;
        sArr[i] = s;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("<ShortStack vector:[");
        int i = 0;
        while (true) {
            short[] sArr = this.A01;
            if (i < sArr.length) {
                if (i != 0) {
                    sb.append(" ");
                }
                int i2 = this.A00;
                if (i == i2) {
                    sb.append(">>");
                }
                sb.append(sArr[i]);
                if (i == i2) {
                    sb.append("<<");
                }
                i++;
            } else {
                sb.append("]>");
                return sb.toString();
            }
        }
    }
}
