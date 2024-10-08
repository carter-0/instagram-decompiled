package X;

import android.net.Uri;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: X.Rh4  reason: case insensitive filesystem */
public abstract class C9808Rh4 {
    public static final Map A00(AnonymousClass6Tm r6) {
        Uri A09 = DbT.A09(DbY.A0h(r6, 0));
        String host = A09.getHost();
        String path = A09.getPath();
        Set<String> queryParameterNames = A09.getQueryParameterNames();
        0qQ.A07(queryParameterNames);
        LinkedHashMap A0x = DbS.A0x(JTT.A08(queryParameterNames));
        for (String next : queryParameterNames) {
            A0x.put(next, A09.getQueryParameter(next));
        }
        return DbY.A0q("url_params", A0x, AnonymousClass7TE.A1L("host", host), AnonymousClass7TE.A1L("path", path));
    }
}
