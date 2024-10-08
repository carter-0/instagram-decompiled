package X;

import android.util.Pair;
import com.facebook.common.stringformat.StringFormatUtil;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public abstract class VFF {
    public static final String A00(List list) {
        int i;
        if (!list.isEmpty()) {
            HashMap hashMap = new HashMap();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C17544VZx vZx = (C17544VZx) it.next();
                if (vZx.A03 == AnonymousClass05K.A0C) {
                    Pair A0K = Pxf.A0K(vZx.A04, vZx.A01);
                    if (hashMap.containsKey(A0K)) {
                        Object obj = hashMap.get(A0K);
                        if (obj != null) {
                            i = Integer.valueOf(AnonymousClass7TE.A0M(obj) + 1);
                        } else {
                            throw AnonymousClass7TE.A0y();
                        }
                    } else {
                        i = 1;
                    }
                    hashMap.put(A0K, i);
                }
            }
            StringWriter stringWriter = new StringWriter();
            if (!hashMap.isEmpty()) {
                17W A0A = AnonymousClass15o.A00.A0A(stringWriter);
                A0A.A0b();
                Iterator A0s = AnonymousClass7TF.A0s(hashMap);
                while (A0s.hasNext()) {
                    Map.Entry A1J = AnonymousClass7TE.A1J(A0s);
                    Pair pair = (Pair) A1J.getKey();
                    int A08 = C66582MXn.A08(A1J);
                    A0A.A0c();
                    A0A.A0R("brush_type", (String) pair.first);
                    Object obj2 = pair.second;
                    0qQ.A06(obj2);
                    A0A.A0R("brush_color", StringFormatUtil.formatStrLocaleSafe("#%06x", Integer.valueOf(AnonymousClass7TE.A0M(obj2) & 16777215)));
                    A0A.A0P("count", A08);
                    A0A.A0Z();
                }
                A0A.A0Y();
                A0A.close();
            }
            return DbT.A10(stringWriter);
        }
        throw DbT.A0m();
    }
}
