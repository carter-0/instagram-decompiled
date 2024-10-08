package X;

import java.util.HashMap;
import java.util.Iterator;

/* renamed from: X.RfI  reason: case insensitive filesystem */
public abstract class C9699RfI {
    public static void A00(StringBuilder sb, HashMap hashMap) {
        sb.append("{");
        Iterator A0u = Pxf.A0u(hashMap);
        boolean z = true;
        while (A0u.hasNext()) {
            String A18 = AnonymousClass7TE.A18(A0u);
            if (!z) {
                sb.append(",");
            }
            String A0r = DbS.A0r(A18, hashMap);
            String str = "\"";
            sb.append(str);
            sb.append(A18);
            sb.append("\":");
            if (A0r == null) {
                str = "null";
            } else {
                sb.append(str);
                sb.append(A0r);
            }
            sb.append(str);
            z = false;
        }
        sb.append("}");
    }
}
