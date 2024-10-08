package X;

import java.util.Comparator;
import java.util.List;
import java.util.Map;

/* renamed from: X.PcO  reason: case insensitive filesystem */
public final class C73425PcO implements Comparator {
    public final /* synthetic */ Map A00;

    public C73425PcO(Map map) {
        this.A00 = map;
    }

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        String str = (String) obj;
        String str2 = (String) obj2;
        AnonymousClass7TG.A1N(str, str2);
        Map map = this.A00;
        int i = 0;
        int A0H = C51971G9r.A0H(C66580MXl.A13(str2, map));
        List A13 = C66580MXl.A13(str, map);
        if (A13 != null) {
            i = A13.size();
        }
        int i2 = A0H - i;
        if (i2 == 0) {
            return str2.compareTo(str);
        }
        return i2;
    }
}
