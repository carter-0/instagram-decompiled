package X;

import java.util.Map;

/* renamed from: X.4u8  reason: invalid class name and case insensitive filesystem */
public final class C276924u8 implements C276934u9 {
    public final Map A00 = new 01r(0);

    public final void EFT(String str, String str2, Throwable th) {
        0qQ.A0B(str, 0);
        0qQ.A0B(str2, 1);
        Map map = this.A00;
        if (map.size() > 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("message:");
            sb.append(str2);
            sb.append("\n");
            for (Map.Entry entry : map.entrySet()) {
                sb.append((String) entry.getKey());
                sb.append(":");
                sb.append((String) entry.getValue());
                sb.append("\n");
            }
            1Kn.A00((C307786Rm) null, str, sb.toString(), th);
            map.clear();
            return;
        }
        1Kn.A00((C307786Rm) null, str, str2, th);
    }

    public final void E5V(String str, String str2) {
        this.A00.put(str, str2);
    }
}
