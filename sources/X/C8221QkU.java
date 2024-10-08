package X;

import java.util.BitSet;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.QkU  reason: case insensitive filesystem */
public final class C8221QkU extends C8222QkV {
    public static final BitSet A02 = DbS.A0w(0);
    public final Map A00;
    public final Map A01;

    public C8221QkU(C13901TjO tjO, C8221QkU qkU) {
        super(tjO, qkU);
        this.A00 = qkU.A00;
        this.A01 = qkU.A01;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8221QkU(C269454f9 r19, C268894eF r20, C268894eF r21, C13805ThU thU, Collection collection) {
        super((REQ) null, r20, r21, thU, (String) null, false);
        this.A00 = AnonymousClass7TE.A1E();
        C269454f9 r7 = r19;
        boolean A09 = r7.A09(C269354ez.ACCEPT_CASE_INSENSITIVE_PROPERTIES);
        HashMap A1E = AnonymousClass7TE.A1E();
        Iterator it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            C269024eS r3 = r7.A01;
            AnonymousClass4eE r0 = r3.A07;
            Class cls = ((T9Y) it.next()).A01;
            List<SK8> A03 = r3.A03.A01(r7, r0.A09(cls), r7).A03();
            BitSet A0w = DbS.A0w(A03.size() + i);
            for (SK8 A0L : A03) {
                String A0L2 = A0L.A0L();
                A0L2 = A09 ? A0L2.toLowerCase() : A0L2;
                Map map = this.A00;
                Number A14 = C51966G9m.A14(A0L2, map);
                if (A14 == null) {
                    A14 = Integer.valueOf(i);
                    i++;
                    map.put(A0L2, A14);
                }
                A0w.set(A14.intValue());
            }
            String name = cls.getName();
            Object put = A1E.put(A0w, name);
            if (put != null) {
                throw Pxf.A0Y("Subtypes %s and %s have the same signature and cannot be uniquely deduced.", new Object[]{put, name});
            }
        }
        this.A01 = A1E;
    }
}
