package X;

import java.text.SimpleDateFormat;
import java.util.Locale;

/* renamed from: X.47y  reason: invalid class name and case insensitive filesystem */
public final class C2610247y {
    public String A00 = null;
    public String A01 = null;
    public String A02 = null;
    public String A03 = null;
    public String A04 = null;
    public String A05 = null;
    public String A06;

    public C2610247y() {
        String format = new SimpleDateFormat(AnonymousClass000.A00(1975), Locale.US).format(Long.valueOf(System.currentTimeMillis()));
        0qQ.A0B(format, 1);
        this.A06 = format;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("time: ");
        sb.append(this.A06);
        sb.append(" container_module: ");
        sb.append(this.A01);
        sb.append("  sessionId: ");
        sb.append(this.A05);
        sb.append("  action: ");
        sb.append(this.A02);
        sb.append(" ad_id: ");
        sb.append(this.A00);
        sb.append(" media_id: ");
        sb.append(this.A04);
        sb.append(" extraData: ");
        sb.append(this.A03);
        return sb.toString();
    }
}
