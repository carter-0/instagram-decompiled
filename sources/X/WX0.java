package X;

import java.util.ArrayList;
import java.util.Collection;

public final class WX0 implements JPQ {
    public final /* synthetic */ C15465UdG A00;

    public final void DIG(1Xj r7) {
        0qQ.A0B(r7, 0);
        C60101Jfh jfh = this.A00.A03;
        Collection collection = (Collection) jfh.A01.A04.getValue();
        if (collection != null) {
            05G r5 = jfh.A08;
            Collection collection2 = (Collection) r5.getValue();
            if (collection2 != null) {
                collection = collection2;
            }
            ArrayList arrayList = new ArrayList(collection);
            String A2n = r7.A2n();
            if (00k.A0u(arrayList, A2n)) {
                0u4.A00(arrayList).remove(A2n);
            } else if (arrayList.size() >= 3) {
                jfh.A09.Epw(new GKO(AnonymousClass7TF.A1b(3), 2131973048));
            } else if (A2n != null) {
                arrayList.add(A2n);
            } else {
                throw AnonymousClass7TE.A0y();
            }
            r5.Epw(arrayList);
        }
    }

    public final /* synthetic */ void Dit(1Xj r1) {
    }

    public WX0(C15465UdG udG) {
        this.A00 = udG;
    }
}
