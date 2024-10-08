package X;

import java.util.Comparator;
import java.util.Map;

public final class MAW implements Comparator {
    public static final MAW A00 = new MAW();

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        Map.Entry entry = (Map.Entry) obj;
        Map.Entry entry2 = (Map.Entry) obj2;
        0qQ.A0A(entry);
        Object value = entry.getValue();
        0qQ.A0A(entry2);
        return LS8.A07.compare(value, entry2.getValue());
    }
}
