package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.IYt  reason: case insensitive filesystem */
public final class C57362IYt implements C282125Bt {
    public final C230432pc A00;

    public final List ELC(List list) {
        ArrayList A0q = AnonymousClass7TF.A0q(list, 0);
        for (Object next : list) {
            AnonymousClass9J4 r2 = (AnonymousClass9J4) ((AnonymousClass9IV) next).A01;
            if (r2.A04 == C233162v9.AFI && r2.A05 == this.A00) {
                A0q.add(next);
            }
        }
        return A0q;
    }

    public C57362IYt(C230432pc r1) {
        this.A00 = r1;
    }
}
