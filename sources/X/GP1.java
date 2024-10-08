package X;

import java.util.ArrayList;
import java.util.List;

public final class GP1 implements JQQ {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass49R A01;
    public final /* synthetic */ AnonymousClass3Y6 A02;
    public final /* synthetic */ boolean A03;

    public GP1(AnonymousClass49R r1, AnonymousClass3Y6 r2, int i, boolean z) {
        this.A01 = r1;
        this.A02 = r2;
        this.A03 = z;
        this.A00 = i;
    }

    public final /* bridge */ /* synthetic */ C254253sB B3L() {
        return null;
    }

    public final /* bridge */ /* synthetic */ C254253sB B3M() {
        1Ua A0j;
        String id;
        1Xj r0;
        AnonymousClass49R r4 = this.A01;
        AnonymousClass4DU r6 = r4.A01;
        C254523sc A0n = C51965G9l.A0n(r6, "IMPRESSION");
        AnonymousClass3Y6 r5 = this.A02;
        boolean z = this.A03;
        int i = this.A00;
        A0n.A4s = r6.getModuleName();
        A0n.A3W = DbV.A0q(r5.getId());
        A0n.A0d = C297375re.REELS_IN_FEED_UNIT;
        if (z) {
            C276014sL r02 = (C276014sL) 00k.A0O(r5.A0M, i);
            Long l = null;
            if (r02 == null || (r0 = r02.A00) == null) {
                id = null;
            } else {
                id = r0.A2n();
                if (id != null) {
                    l = DbV.A0q(id);
                }
            }
            A0n.A3X = l;
            A0j = C51971G9r.A0j(r4.A00);
        } else {
            A0n.A0T(Integer.valueOf(i));
            List<C276014sL> list = r5.A0M;
            ArrayList A0r = AnonymousClass7TG.A0r(list);
            for (C276014sL r03 : list) {
                A0r.add(r03.A00.getId());
            }
            A0n.A7V = C51970G9q.A0l(A0r);
            A0j = C51971G9r.A0j(r4.A00);
            id = r5.getId();
        }
        A0n.A14 = Boolean.valueOf(A0j.A03(id));
        return new C254563sg(A0n);
    }

    public final /* bridge */ /* synthetic */ C254253sB BqR() {
        return null;
    }
}
