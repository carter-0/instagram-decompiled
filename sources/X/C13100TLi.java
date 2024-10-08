package X;

import java.util.Comparator;
import java.util.Map;

/* renamed from: X.TLi  reason: case insensitive filesystem */
public final class C13100TLi implements Comparator {
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        Map.Entry entry = (Map.Entry) obj;
        Map.Entry entry2 = (Map.Entry) obj2;
        AnonymousClass7TG.A1N(entry, entry2);
        return 0qQ.A01(AnonymousClass7TE.A0R(entry2.getValue()), AnonymousClass7TE.A0R(entry.getValue()));
    }
}
