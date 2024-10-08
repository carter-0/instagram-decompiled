package X;

import com.instagram.common.session.UserSession;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.30R  reason: invalid class name */
public final class AnonymousClass30R implements C250603lj {
    public final UserSession A00;
    public final Map A01 = new LinkedHashMap();
    public final AnonymousClass30Q A02;
    public final List A03;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: X.3lj} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: X.3lj} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: X.3lj} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0065 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00ba A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void ATF(X.AnonymousClass30Y r9, X.C252093oY r10) {
        /*
            r8 = this;
            r0 = 0
            X.0qQ.A0B(r9, r0)
            r7 = 1
            X.0qQ.A0B(r10, r7)
            java.util.List r0 = r8.A03
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r2 = r0.iterator()
        L_0x0013:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x002a
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.30I r0 = (X.AnonymousClass30I) r0
            boolean r0 = r0.CRp(r9, r10)
            if (r0 == 0) goto L_0x0013
            r5.add(r1)
            goto L_0x0013
        L_0x002a:
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L_0x004f
            com.instagram.common.session.UserSession r1 = r8.A00
            java.lang.Object r0 = r9.A03
            X.1Xj r0 = (X.1Xj) r0
            java.lang.String r4 = X.C231122qu.A07(r1, r0)
            if (r4 == 0) goto L_0x004f
            java.util.Map r3 = r8.A01
            java.lang.Object r2 = r3.get(r4)
            X.3lj r2 = (X.C250603lj) r2
            if (r2 == 0) goto L_0x0050
            boolean r0 = r5.contains(r2)
            if (r0 == 0) goto L_0x004f
        L_0x004c:
            r2.ATF(r9, r10)
        L_0x004f:
            return
        L_0x0050:
            boolean r0 = r5.isEmpty()
            r6 = 0
            if (r0 != 0) goto L_0x004f
            int r0 = r5.size()
            if (r0 != r7) goto L_0x0066
            java.lang.Object r2 = X.00k.A0J(r5)
        L_0x0061:
            X.3lj r2 = (X.C250603lj) r2
        L_0x0063:
            if (r2 != 0) goto L_0x00b5
            return
        L_0x0066:
            java.util.Iterator r1 = r5.iterator()
        L_0x006a:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00b3
            java.lang.Object r2 = r1.next()
            boolean r0 = r2 instanceof X.AnonymousClass30P
            if (r0 == 0) goto L_0x006a
        L_0x0078:
            X.3lj r2 = (X.C250603lj) r2
            if (r2 != 0) goto L_0x00b5
            java.util.Iterator r1 = r5.iterator()
        L_0x0080:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00b1
            java.lang.Object r2 = r1.next()
            boolean r0 = r2 instanceof X.AnonymousClass4KV
            if (r0 == 0) goto L_0x0080
        L_0x008e:
            X.3lj r2 = (X.C250603lj) r2
            if (r2 != 0) goto L_0x00b5
            java.util.Iterator r2 = r5.iterator()
        L_0x0096:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00a5
            java.lang.Object r1 = r2.next()
            boolean r0 = r1 instanceof X.IPP
            if (r0 == 0) goto L_0x0096
            r6 = r1
        L_0x00a5:
            r2 = r6
            X.3lj r2 = (X.C250603lj) r2
            if (r2 != 0) goto L_0x0063
            X.2SQ r0 = X.2SP.A00
            java.lang.Object r2 = X.00k.A0H(r5, r0)
            goto L_0x0061
        L_0x00b1:
            r2 = r6
            goto L_0x008e
        L_0x00b3:
            r2 = r6
            goto L_0x0078
        L_0x00b5:
            r3.put(r4, r2)
            if (r2 != 0) goto L_0x004c
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass30R.ATF(X.30Y, X.3oY):void");
    }

    public AnonymousClass30R(UserSession userSession, AnonymousClass30Q r3, List list) {
        this.A00 = userSession;
        this.A03 = list;
        this.A02 = r3;
    }
}
