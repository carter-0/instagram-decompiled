package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.5C4  reason: invalid class name */
public final class AnonymousClass5C4 implements C282125Bt {
    public final C230432pc A00;

    public final List ELC(List list) {
        0qQ.A0B(list, 0);
        ArrayList arrayList = new ArrayList();
        for (Object next : list) {
            AnonymousClass9J4 r2 = (AnonymousClass9J4) ((AnonymousClass9IV) next).A01;
            if (r2.A04 == C233162v9.LIKE_CLICK && r2.A05 == this.A00) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public AnonymousClass5C4(C230432pc r1) {
        this.A00 = r1;
    }
}
