package X;

import java.util.Map;
import java.util.Set;

public final class GXL {
    public final Map A00 = AnonymousClass7TE.A1E();

    public final Set A00(String str, String str2) {
        0qQ.A0B(str, 0);
        String A0T = 002.A0T(str, str2, '_');
        Map map = this.A00;
        Object obj = map.get(A0T);
        if (obj == null) {
            obj = AnonymousClass7TE.A1F();
            map.put(A0T, obj);
        }
        return (Set) obj;
    }
}
