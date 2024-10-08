package X;

import java.util.Comparator;
import java.util.Map;

/* renamed from: X.3Pg  reason: invalid class name and case insensitive filesystem */
public final class C241453Pg implements Comparator {
    public static final C241453Pg A00 = new C241453Pg();

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        int i;
        Map.Entry entry = (Map.Entry) obj;
        Map.Entry entry2 = (Map.Entry) obj2;
        if (!((AnonymousClass4HX) entry.getValue()).A07 || (i = -Float.compare(((AnonymousClass4HX) entry.getValue()).A00, ((AnonymousClass4HX) entry2.getValue()).A00)) == 0) {
            return C241423Pd.A00.compare(entry, entry2);
        }
        return i;
    }
}
