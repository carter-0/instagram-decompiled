package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.39g  reason: invalid class name and case insensitive filesystem */
public final class C2377939g {
    public final List A00;

    public C2377939g(AnonymousClass397 r10) {
        0qQ.A0B(r10, 1);
        AnonymousClass39B r0 = r10.A01;
        0qQ.A0B(r0, 1);
        C2378139i r2 = new C2378139i(r0);
        AnonymousClass39F r02 = r10.A00;
        0qQ.A0B(r02, 1);
        C2378139i r3 = new C2378139i(r02);
        AnonymousClass39B r03 = r10.A03;
        0qQ.A0B(r03, 1);
        C2378139i r4 = new C2378139i(r03);
        AnonymousClass39B r04 = r10.A02;
        0qQ.A0B(r04, 1);
        this.A00 = 0sr.A1P(new C2378139i[]{r2, r3, r4, new C2378139i(r04), new C2378139i(r04), new C2378139i(r04), new C2378139i(r04)});
    }

    public final boolean A00(AnonymousClass3DG r6) {
        List list = this.A00;
        ArrayList arrayList = new ArrayList();
        for (Object next : list) {
            C2378139i r1 = (C2378139i) next;
            if (r1.A01(r6) && r1.A02(r1.A00.A00())) {
                arrayList.add(next);
            }
        }
        if (!arrayList.isEmpty()) {
            AnonymousClass389.A00();
            00k.A0P(", ", "", "", arrayList, C41679AyW.A00);
        }
        return arrayList.isEmpty();
    }
}
