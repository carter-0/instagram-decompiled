package X;

public final class RR9 {
    public float A00;
    public int A01;
    public int A02;
    public String A03;
    public String A04;
    public boolean A05;

    public final String toString() {
        String A0R;
        String A0C = 002.A0C(this.A03, ':');
        int i = this.A02;
        StringBuilder A1A = AnonymousClass7TE.A1A();
        switch (i) {
            case 900:
                A1A.append(A0C);
                A1A.append(this.A01);
                break;
            case 901:
            case 905:
                A1A.append(A0C);
                A1A.append(this.A00);
                break;
            case 902:
                A1A.append(A0C);
                String A0R2 = 002.A0R("00000000", Integer.toHexString(this.A01));
                A0R = 002.A0R("#", A0R2.substring(A0R2.length() - 8));
                break;
            case 903:
                A1A.append(A0C);
                A0R = this.A04;
                break;
            case 904:
                A1A.append(A0C);
                A1A.append(Boolean.valueOf(this.A05));
                break;
            default:
                A1A.append(A0C);
                A0R = "????";
                break;
        }
        A1A.append(A0R);
        return A1A.toString();
    }
}
