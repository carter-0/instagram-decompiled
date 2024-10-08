package X;

import java.util.Map;

/* renamed from: X.6Nm  reason: invalid class name and case insensitive filesystem */
public final class C306786Nm implements AnonymousClass62J {
    public final C306776Nl A00;

    public final void Cgh(C306066Kq r9) {
        String str;
        0qQ.A0B(r9.A00, 0);
        if (0KC.A01.isLoggable(3)) {
            StringBuilder sb = new StringBuilder();
            if (r9.A01.intValue() != 0) {
                str = "Bloks";
            } else {
                str = "Native";
            }
            sb.append(002.A0E(str, '[', ']'));
            sb.append(002.A0E(r9.A03, '[', ']'));
            sb.append(002.A0E(r9.A02, '[', ']'));
            for (String A0E : r9.A04) {
                sb.append(002.A0E(A0E, '[', ']'));
            }
            sb.append(002.A0D((String) r9.A06.invoke(), ' '));
            Map map = r9.A05;
            if (!map.isEmpty()) {
                sb.append(" extras=[");
            }
            for (Map.Entry entry : map.entrySet()) {
                String str2 = (String) entry.getKey();
                Object value = entry.getValue();
                0qQ.A0B(str2, 0);
                if (!str2.equals("SRLog#errorKey")) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append('{');
                    sb2.append(str2);
                    sb2.append('=');
                    sb2.append(value);
                    sb2.append('}');
                    sb.append(sb2.toString());
                }
            }
            if (!map.isEmpty()) {
                sb.append("]");
            }
            0qQ.A07(sb.toString());
        }
    }

    public C306786Nm(C306776Nl r1) {
        this.A00 = r1;
    }
}
