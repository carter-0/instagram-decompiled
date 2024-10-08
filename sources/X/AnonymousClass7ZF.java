package X;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.7ZF  reason: invalid class name */
public final class AnonymousClass7ZF extends AnonymousClass7ZD implements AnonymousClass0lh {
    public final Map A00 = new LinkedHashMap();
    public final Set A01 = new LinkedHashSet();

    public AnonymousClass7ZF() {
        super(91);
    }

    private final void A00(List list) {
        if (list != null) {
            ArrayList<AnonymousClass7LQ> arrayList = new ArrayList<>();
            for (Object next : list) {
                AnonymousClass7LQ r2 = (AnonymousClass7LQ) next;
                if (r2.getType() == this.A00 && r2.A0e.A1U()) {
                    arrayList.add(next);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (AnonymousClass7LQ r0 : arrayList) {
                String A0g = r0.A0e.A0g();
                if (A0g != null) {
                    arrayList2.add(A0g);
                }
            }
            this.A01.addAll(arrayList2);
        }
    }

    public final boolean A02(String str) {
        if (00k.A0u(this.A01, str) || !super.A02(str)) {
            return false;
        }
        return true;
    }

    public final boolean A03(String str) {
        Boolean bool;
        long j = 0;
        for (Map.Entry entry : this.A01.entrySet()) {
            if (0qQ.A0K(entry.getValue(), str)) {
                j = ((Number) entry.getKey()).longValue();
            }
        }
        if (!A02(str)) {
            return false;
        }
        Map map = this.A00;
        Long valueOf = Long.valueOf(j);
        if (!map.containsKey(valueOf) || (bool = (Boolean) map.get(valueOf)) == null || !bool.booleanValue()) {
            return false;
        }
        return true;
    }

    public final void onSessionWillEnd() {
        this.A01.clear();
        this.A00.clear();
        this.A01.clear();
    }

    public final List A01(List list, List list2) {
        A00(list);
        A00(list2);
        return super.A01(list, list2);
    }
}
