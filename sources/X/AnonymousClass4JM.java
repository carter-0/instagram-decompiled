package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.4JM  reason: invalid class name */
public final class AnonymousClass4JM extends C252733pa {
    public final 05G A00;
    public final AnonymousClass0Ud A01;

    public final void A00(String str, String str2) {
        Object value;
        LinkedHashMap linkedHashMap;
        0qQ.A0B(str, 0);
        0qQ.A0B(str2, 1);
        05G r4 = this.A00;
        do {
            value = r4.getValue();
            linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : ((Map) value).entrySet()) {
                if (!0qQ.A0K(entry.getKey(), str) || !0qQ.A0K(((C2809254t) ((AnonymousClass9IP) entry.getValue()).A01).A07, str2)) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
        } while (!r4.AIY(value, linkedHashMap));
    }

    public final boolean A01(String str) {
        0qQ.A0B(str, 0);
        for (Object next : ((Map) this.A01.getValue()).entrySet()) {
            Map.Entry entry = (Map.Entry) next;
            if (0qQ.A0K(((C2809254t) ((AnonymousClass9IP) entry.getValue()).A01).A07, str) && ((AnonymousClass9IP) entry.getValue()).A02) {
                if (next != null) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    public AnonymousClass4JM() {
        super("ContentNotesOptimisticPosting", AnonymousClass43D.A01(1196867702, 3));
        02z A012 = 106.A01(0Yt.A0E());
        this.A00 = A012;
        this.A01 = 10b.A03(A012);
    }
}
