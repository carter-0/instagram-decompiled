package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.5pt  reason: invalid class name and case insensitive filesystem */
public final class C296335pt implements C282125Bt {
    public final C233162v9 A00;
    public final C230432pc A01;
    public final List A02;

    public final List ELC(List list) {
        0qQ.A0B(list, 0);
        ArrayList arrayList = new ArrayList();
        for (Object next : list) {
            AnonymousClass9J4 r2 = (AnonymousClass9J4) ((AnonymousClass9IV) next).A01;
            if (r2.A04 == this.A00 && r2.A05 == this.A01 && this.A02.contains(r2.A01)) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public C296335pt(C233162v9 r1, C230432pc r2, List list) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = list;
    }
}
