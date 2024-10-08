package X;

import android.util.Pair;

/* renamed from: X.Vug  reason: case insensitive filesystem */
public final class C18589Vug {
    public double A00 = -1.0d;
    public double A01 = -1.0d;
    public int A02 = -1;
    public long A03 = 0;
    public Pair A04 = null;
    public Pair A05 = null;
    public Pair A06 = null;
    public Pair A07 = null;
    public Integer A08 = null;
    public Integer A09 = null;
    public Integer A0A = null;
    public String A0B = null;
    public String A0C = null;
    public String A0D = null;
    public String A0E = null;
    public String A0F = null;
    public String A0G = null;

    public static void A00(Pair pair, String str, StringBuilder sb) {
        sb.append(str);
        Object obj = pair.first;
        0qQ.A06(obj);
        sb.append(((Number) obj).intValue());
        sb.append("x");
        Object obj2 = pair.second;
        0qQ.A06(obj2);
        sb.append(((Number) obj2).intValue());
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        String str2 = this.A0B;
        if (str2 != null) {
            Pxg.A1P("Type: ", str2, "\n", sb);
        }
        Pair pair = this.A04;
        if (pair != null) {
            A00(pair, "Camera: ", sb);
            sb.append("\n");
        }
        Pair pair2 = this.A06;
        if (pair2 != null) {
            String str3 = this.A0F;
            if (str3 == null) {
                str3 = "Screen";
            }
            sb.append(str3);
            A00(pair2, ": ", sb);
            Integer num = this.A0A;
            if (num != null) {
                C13988Tno.A1Q(" @ ", " fps", sb, num.intValue());
            }
            sb.append("\n");
        }
        Pair pair3 = this.A07;
        if (pair3 != null) {
            A00(pair3, "Live Encoder: ", sb);
            Integer num2 = this.A09;
            if (num2 != null) {
                C13988Tno.A1Q(" @ ", " fps", sb, num2.intValue());
            }
            sb.append(" (");
            String str4 = this.A0D;
            if (str4 != null) {
                sb.append(str4);
                sb.append(": ");
            }
            sb.append(this.A0E);
            sb.append(")\n");
        }
        Pair pair4 = this.A05;
        if (pair4 != null) {
            A00(pair4, "DVR Encoder: ", sb);
            Integer num3 = this.A08;
            if (num3 != null) {
                C13988Tno.A1Q(" @ ", " fps", sb, num3.intValue());
            }
            sb.append(" (");
            sb.append(this.A0C);
            sb.append(")\n");
        }
        double d = this.A01;
        if (Pxf.A1R((d > 0.0d ? 1 : (d == 0.0d ? 0 : -1)))) {
            sb.append(0mp.A06("Live Bitrate: %.1f kbps\n", new Object[]{Double.valueOf(d)}));
        }
        if (this.A00 >= 0.0d) {
            int i = this.A02;
            if (i >= 0) {
                str = 0mp.A06(" (lag: %d)", AnonymousClass7TF.A1b(i));
            } else {
                str = "";
            }
            sb.append(0mp.A06("Throughput: %.1f kbps%s\n", new Object[]{Double.valueOf(this.A00), str}));
        }
        return DbT.A10(sb);
    }
}
