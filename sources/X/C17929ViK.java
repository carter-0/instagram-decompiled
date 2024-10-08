package X;

/* renamed from: X.ViK  reason: case insensitive filesystem */
public final class C17929ViK {
    public long A00;
    public String A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public boolean A07;
    public boolean A08;

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("{userId='");
        String str2 = this.A06;
        if (str2 != null) {
            sb.append(str2);
            sb.append("', threadFbid='");
            String str3 = this.A05;
            if (str3 != null) {
                sb.append(str3);
                sb.append("', presentInThread=");
                sb.append(this.A08);
                sb.append(", presentInClipsTogether=");
                sb.append(this.A07);
                sb.append(", mutationId=");
                sb.append(this.A02);
                sb.append(", realtimeUpdateId=");
                sb.append(this.A04);
                sb.append(AnonymousClass000.A00(402));
                sb.append(this.A03);
                sb.append(C66579MXk.A00(190));
                sb.append(this.A01);
                return Pxg.A0x(sb);
            }
            str = "threadFbid";
        } else {
            str = "userId";
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }
}
