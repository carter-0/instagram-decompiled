package X;

/* renamed from: X.VhX  reason: case insensitive filesystem */
public final class C17880VhX {
    public int A00 = -1;
    public C16681UzH A01;
    public C18811W3o A02;
    public C17824Vgd A03;
    public Integer A04;

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder(200);
        sb.append("<<\n");
        sb.append(" mode: ");
        sb.append(this.A01);
        sb.append("\n ecLevel: ");
        Integer num = this.A04;
        if (num != null) {
            str = C18298VpM.A00(num);
        } else {
            str = "null";
        }
        sb.append(str);
        sb.append("\n version: ");
        sb.append(this.A02);
        sb.append("\n maskPattern: ");
        sb.append(this.A00);
        C17824Vgd vgd = this.A03;
        if (vgd == null) {
            sb.append("\n matrix: null\n");
        } else {
            sb.append("\n matrix:\n");
            sb.append(vgd);
        }
        return AnonymousClass7TF.A0l(">>\n", sb);
    }
}
