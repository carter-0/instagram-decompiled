package X;

/* renamed from: X.I0u  reason: case insensitive filesystem */
public final class C56543I0u {
    public static final C56543I0u A00 = new C56543I0u();

    public C56543I0u() {
        if (!C55284HfD.A00("  ") && !C55284HfD.A00("") && !C55284HfD.A00("")) {
            C55284HfD.A00("");
        }
    }

    public final void A00(StringBuilder sb, String str) {
        sb.append(str);
        sb.append("bytesPerLine = ");
        sb.append(Integer.MAX_VALUE);
        sb.append(",");
        sb.append(10);
        sb.append(str);
        sb.append("bytesPerGroup = ");
        sb.append(Integer.MAX_VALUE);
        sb.append(",");
        sb.append(10);
        sb.append(str);
        sb.append("groupSeparator = \"");
        sb.append("  ");
        sb.append("\",");
        sb.append(10);
        sb.append(str);
        sb.append("byteSeparator = \"");
        sb.append("");
        sb.append("\",");
        sb.append(10);
        sb.append(str);
        sb.append("bytePrefix = \"");
        sb.append("");
        sb.append("\",");
        sb.append(10);
        sb.append(str);
        sb.append("byteSuffix = \"");
        sb.append("");
        sb.append("\"");
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("BytesHexFormat(");
        A1A.append(10);
        A00(A1A, "    ");
        A1A.append(10);
        String A0l = AnonymousClass7TF.A0l(")", A1A);
        0qQ.A07(A0l);
        return A0l;
    }
}
