package X;

/* renamed from: X.ViJ  reason: case insensitive filesystem */
public final class C17928ViJ {
    public int A00 = -1;
    public long A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public boolean A08;

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("{userId='");
        String str2 = this.A07;
        if (str2 != null) {
            sb.append(str2);
            sb.append("', surfaceId='");
            String str3 = this.A06;
            if (str3 != null) {
                sb.append(str3);
                sb.append("', isUserPresentInClipsTogether=");
                sb.append(this.A08);
                sb.append(AnonymousClass000.A00(402));
                sb.append(this.A04);
                return Pxg.A0x(sb);
            }
            str = "surfaceId";
        } else {
            str = "userId";
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }
}
