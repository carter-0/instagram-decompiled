package X;

import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Map;

public final class GMD implements 0lm {
    public int A00;
    public List A01;
    public List A02;
    public final List A03 = AnonymousClass7TE.A1C();
    public final Map A04 = AnonymousClass7TE.A1E();

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: X.9JD} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: X.9JD} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: X.9JD} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: X.9JD} */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0036, code lost:
        if (r2 == null) goto L_0x0038;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.GMD r7) {
        /*
            java.util.Map r0 = r7.A04
            java.util.Iterator r6 = X.AnonymousClass7TF.A0u(r0)
        L_0x0006:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0069
            java.lang.Object r4 = r6.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.util.List r0 = r7.A01
            r5 = 0
            if (r0 == 0) goto L_0x0038
            java.util.Iterator r3 = r0.iterator()
        L_0x001b:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0067
            java.lang.Object r2 = r3.next()
            r0 = r2
            X.9JD r0 = (X.AnonymousClass9JD) r0
            java.lang.String r1 = r0.A03
            java.lang.Object r0 = r4.getKey()
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x001b
        L_0x0034:
            X.9JD r2 = (X.AnonymousClass9JD) r2
            if (r2 != 0) goto L_0x005d
        L_0x0038:
            java.util.List r0 = r7.A03
            java.util.Iterator r3 = r0.iterator()
        L_0x003e:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0058
            java.lang.Object r2 = r3.next()
            r0 = r2
            X.9JD r0 = (X.AnonymousClass9JD) r0
            java.lang.String r1 = r0.A03
            java.lang.Object r0 = r4.getKey()
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x003e
            r5 = r2
        L_0x0058:
            r2 = r5
            X.9JD r2 = (X.AnonymousClass9JD) r2
            if (r2 == 0) goto L_0x0006
        L_0x005d:
            java.lang.Object r0 = r4.getValue()
            r2.A00 = r0
            r6.remove()
            goto L_0x0006
        L_0x0067:
            r2 = r5
            goto L_0x0034
        L_0x0069:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GMD.A00(X.GMD):void");
    }

    public final void A04(List list) {
        List list2 = this.A01;
        if (list2 == null) {
            list2 = AnonymousClass7TE.A1C();
            this.A01 = list2;
        }
        list2.clear();
        List list3 = this.A01;
        if (list3 != null) {
            list3.addAll(list);
        }
    }

    public final void A05(List list) {
        List list2 = this.A01;
        if (list2 == null) {
            list2 = AnonymousClass7TE.A1C();
            this.A01 = list2;
        }
        list2.addAll(list);
    }

    public final void onUserSessionWillEnd(boolean z) {
        List list = this.A01;
        if (list != null) {
            list.clear();
        }
    }

    public final AnonymousClass9JD A01(int i) {
        List list;
        Object obj;
        A00(this);
        List list2 = this.A03;
        if (!AnonymousClass7TE.A1b(list2)) {
            list = this.A01;
            if (list == null || i < 0 || i >= list.size()) {
                return null;
            }
            obj = list.get(i);
        } else if (i < 0) {
            return null;
        } else {
            if (i < list2.size()) {
                obj = list2.get(i);
            } else {
                if (i >= DbT.A01(A03(), list2.size())) {
                    return null;
                }
                list = A03();
                i -= list2.size();
                obj = list.get(i);
            }
        }
        return (AnonymousClass9JD) obj;
    }

    public final AnonymousClass9JD A02(C267324bN r5) {
        List list;
        Object obj;
        A00(this);
        List list2 = this.A02;
        if (list2 == null || (list = this.A01) == null) {
            return null;
        }
        int indexOf = list2.indexOf(r5);
        List list3 = this.A03;
        if (!AnonymousClass7TE.A1b(list3)) {
            if (indexOf < 0 || indexOf >= list.size()) {
                return null;
            }
            obj = list.get(indexOf);
        } else if (indexOf < 0) {
            return null;
        } else {
            if (indexOf < list3.size()) {
                obj = list3.get(indexOf);
            } else {
                indexOf -= list3.size();
                obj = list.get(indexOf);
            }
        }
        return (AnonymousClass9JD) obj;
    }

    public final ImmutableList A03() {
        A00(this);
        List list = this.A01;
        if (list == null) {
            list = AnonymousClass7TE.A1C();
            this.A01 = list;
        }
        return DbU.A0K(list);
    }
}
