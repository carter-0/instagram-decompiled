package X;

/* renamed from: X.4ax  reason: invalid class name and case insensitive filesystem */
public final class C267094ax {
    public long A00;
    public String A01;
    public String A02;
    public String A03;
    public boolean A04 = false;
    public boolean A05 = false;

    public final String A00() {
        String str;
        StringBuilder sb;
        String str2;
        String str3 = this.A02;
        if ("ignore".equals(str3) || C273654mx.A00(543).equals(str3)) {
            str = this.A03;
            sb = new StringBuilder();
            str2 = "request-";
        } else if ("block".equals(str3) || "unblock".equals(str3)) {
            str = this.A03;
            sb = new StringBuilder();
            str2 = "block-";
        } else {
            boolean equals = C273654mx.A00(937).equals(str3);
            str = this.A03;
            if (equals) {
                str2 = "remove-";
            } else {
                sb = new StringBuilder();
                str2 = "follow-";
            }
        }
        sb.append(str2);
        sb.append(str);
        return sb.toString();
    }
}
