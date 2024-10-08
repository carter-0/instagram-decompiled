package X;

import java.util.Map;

/* renamed from: X.SIz  reason: case insensitive filesystem */
public final class C11281SIz {
    public final Map A00 = AnonymousClass7TE.A1H();

    public static void A00(C11281SIz sIz, Object obj, Object obj2) {
        Map map = sIz.A00;
        if (obj != null) {
            map.remove(obj2);
        } else if (map.containsKey(obj2)) {
            AnonymousClass2gB A02 = sIz.A02(obj2);
            if (SUj.A0S((SUj) A02.A02())) {
                A02.A0B(SUj.A08((Object) null));
            }
        }
    }

    public final AnonymousClass2gB A01(SUj sUj, Object obj) {
        Map map = this.A00;
        Object obj2 = map.get(obj);
        AnonymousClass2gB r0 = obj2;
        if (obj2 == null) {
            AnonymousClass2gB A0M = Pxh.A0M();
            A0M.A0B(sUj);
            map.put(obj, A0M);
            r0 = A0M;
        }
        return (AnonymousClass2gB) r0;
    }

    public final AnonymousClass2gB A02(Object obj) {
        Object obj2 = this.A00.get(obj);
        if (obj2 != null) {
            return (AnonymousClass2gB) obj2;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final AnonymousClass2gB A03(Object obj) {
        SUj A0W;
        AnonymousClass2gB r3 = (AnonymousClass2gB) this.A00.get(obj);
        if (r3 == null || (A0W = Pxe.A0W(r3)) == null || SUj.A0S(A0W) || (SUj.A0V(A0W) && A0W.A01 == null)) {
            return null;
        }
        return r3;
    }
}
