package X;

public final class I0g {
    public static final I0g A03;
    public static final I0g A04;
    public final C56544I0y A00;
    public final boolean A01;
    public final C56543I0u A02;

    static {
        C56543I0u i0u = C56543I0u.A00;
        C56544I0y i0y = C56544I0y.A03;
        A03 = new I0g(i0u, i0y, false);
        A04 = new I0g(i0u, i0y, true);
    }

    public I0g(C56543I0u i0u, C56544I0y i0y, boolean z) {
        AnonymousClass7TG.A1Q(i0u, i0y);
        this.A01 = z;
        this.A02 = i0u;
        this.A00 = i0y;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("HexFormat(");
        A1A.append(10);
        A1A.append("    upperCase = ");
        A1A.append(this.A01);
        A1A.append(",");
        A1A.append(10);
        A1A.append("    bytes = BytesHexFormat(");
        A1A.append(10);
        this.A02.A00(A1A, "        ");
        A1A.append(10);
        A1A.append("    ),");
        A1A.append(10);
        A1A.append("    number = NumberHexFormat(");
        A1A.append(10);
        this.A00.A00(A1A, "        ");
        A1A.append(10);
        A1A.append("    )");
        A1A.append(10);
        String A0l = AnonymousClass7TF.A0l(")", A1A);
        0qQ.A07(A0l);
        return A0l;
    }
}
