package X;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: X.4ZI  reason: invalid class name */
public final class AnonymousClass4ZI implements AnonymousClass1Xn {
    public final AnonymousClass4ZG A00;
    public final String A01;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: X.4ZJ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: X.4ZJ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: X.4ZJ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: X.4ZJ} */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0007, code lost:
        if (r5.length() == 0) goto L_0x0009;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass4ZJ A00(java.lang.String r5) {
        /*
            r4 = this;
            if (r5 == 0) goto L_0x0009
            int r1 = r5.length()
            r0 = 0
            if (r1 != 0) goto L_0x000a
        L_0x0009:
            r0 = 1
        L_0x000a:
            r3 = 0
            if (r0 != 0) goto L_0x002d
            java.util.List r0 = r4.A01()
            java.util.Iterator r2 = r0.iterator()
        L_0x0015:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x002b
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.4ZJ r0 = (X.AnonymousClass4ZJ) r0
            java.lang.String r0 = r0.A03
            boolean r0 = X.0qQ.A0K(r5, r0)
            if (r0 == 0) goto L_0x0015
            r3 = r1
        L_0x002b:
            X.4ZJ r3 = (X.AnonymousClass4ZJ) r3
        L_0x002d:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4ZI.A00(java.lang.String):X.4ZJ");
    }

    public final List A01() {
        List<AnonymousClass4ZF> list = ((C272714lF) this.A00).A07;
        if (list == null || list.isEmpty()) {
            return 0sn.A00;
        }
        ArrayList arrayList = new ArrayList(0Yv.A1E(list, 10));
        for (AnonymousClass4ZF r1 : list) {
            arrayList.add(new AnonymousClass4ZJ(r1));
        }
        return arrayList;
    }

    public final boolean A02() {
        String str;
        AnonymousClass4ZJ A002 = A00(C242603Vd.FAVORITES.A00);
        if (A002 == null) {
            A002 = A00(C242603Vd.OLDER_POSTS.A00);
        }
        AnonymousClass4ZJ A003 = A00(C242603Vd.OLDER_POSTS.A00);
        if (!(A003 == null || !0qQ.A0K(A002, A003) || (str = A003.A04) == null || str.length() == 0)) {
            if (!A003.A06.isEmpty()) {
                return true;
            }
            String str2 = A003.A00;
            if (str2 == null || str2.length() == 0) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final 1UQ B5J() {
        return 1UQ.A0O;
    }

    public final Integer B9V() {
        return ((C272714lF) this.A00).A02;
    }

    public final C67241sS BJP() {
        C67241sS r0 = ((C272714lF) this.A00).A00;
        if (r0 != null) {
            return r0.F8M();
        }
        return null;
    }

    public final String C9L() {
        return ((C272714lF) this.A00).A06;
    }

    public final Integer CBd() {
        return AnonymousClass05K.A01;
    }

    public final Integer CEl() {
        return ((C272714lF) this.A00).A03;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        Class<?> cls = getClass();
        Map map = 0Yh.A03;
        0qQ.A0B(cls, 1);
        0qQ.A0B(obj.getClass(), 1);
        return false;
    }

    public final String getId() {
        return ((C272714lF) this.A00).A06;
    }

    public final int hashCode() {
        String str = ((C272714lF) this.A00).A06;
        if (str != null) {
            return str.hashCode();
        }
        return super.hashCode();
    }

    public AnonymousClass4ZI(AnonymousClass4ZG r2) {
        this.A00 = r2;
        this.A01 = ((C272714lF) r2).A04;
    }
}
