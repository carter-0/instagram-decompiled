package X;

import java.util.Comparator;
import java.util.Map;

/* renamed from: X.TLl  reason: case insensitive filesystem */
public final /* synthetic */ class C13102TLl implements Comparator {
    public final /* synthetic */ Comparator A00;

    public /* synthetic */ C13102TLl(Comparator comparator) {
        this.A00 = comparator;
    }

    public final int compare(Object obj, Object obj2) {
        Map.Entry entry = (Map.Entry) obj;
        Map.Entry entry2 = (Map.Entry) obj2;
        entry.getClass();
        entry2.getClass();
        return this.A00.compare(entry.getKey(), entry2.getKey());
    }
}
