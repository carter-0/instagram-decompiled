package X;

/* renamed from: X.4U2  reason: invalid class name */
public final class AnonymousClass4U2 {
    public final double A00;
    public final double A01;
    public final AnonymousClass4U0 A02;
    public final C265474Tz A03;
    public final C256683wB A04;
    public final boolean A05;

    public final String toString() {
        String str;
        String str2;
        boolean A022 = C256933wa.A02(this.A04);
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (A022) {
            str = "audio, ";
        } else {
            str = "video, ";
        }
        sb.append(str);
        sb.append("bitrate=");
        C265474Tz r1 = this.A03;
        sb.append(r1.A03);
        sb.append(", risk=");
        sb.append(r1);
        sb.append(", reward=");
        sb.append(this.A02);
        sb.append(", risk thr=");
        sb.append(this.A01);
        sb.append(" (");
        sb.append("NORMAL");
        sb.append("), ratio=");
        sb.append(this.A00);
        if (this.A05) {
            str2 = ", too risky";
        } else {
            str2 = "";
        }
        sb.append(str2);
        sb.append('}');
        return sb.toString();
    }

    public AnonymousClass4U2(AnonymousClass4U0 r1, C265474Tz r2, C256683wB r3, double d, double d2, boolean z) {
        this.A04 = r3;
        this.A03 = r2;
        this.A02 = r1;
        this.A00 = d;
        this.A01 = d2;
        this.A05 = z;
    }
}
