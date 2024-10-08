package X;

import com.instagram.common.session.UserSession;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

/* renamed from: X.49O  reason: invalid class name */
public abstract class AnonymousClass49O {
    public boolean A00;
    public final AnonymousClass0iw A01;
    public final UserSession A02;
    public final Set A03 = new HashSet();
    public final Set A04 = new HashSet();
    public final Set A05 = new HashSet();
    public final Stack A06 = new Stack();

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0015, code lost:
        if ((!r7.A05.isEmpty()) == false) goto L_0x0017;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(X.AnonymousClass49O r7, X.AnonymousClass49M r8, java.lang.String r9) {
        /*
            r0 = r7
            X.49N r0 = (X.AnonymousClass49N) r0
            int r1 = r0.A00
            r0 = 0
            if (r1 != 0) goto L_0x0009
            r0 = 1
        L_0x0009:
            r2 = 0
            if (r0 == 0) goto L_0x0017
            java.util.Set r0 = r7.A05
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            r1 = 1
            if (r0 != 0) goto L_0x0018
        L_0x0017:
            r1 = 0
        L_0x0018:
            java.util.Set r4 = r7.A05
            int r0 = r4.size()
            r3 = 7
            if (r0 < r3) goto L_0x0022
            r2 = 1
        L_0x0022:
            if (r1 != 0) goto L_0x0026
            if (r2 == 0) goto L_0x0072
        L_0x0026:
            boolean r0 = r7.A00
            if (r0 != 0) goto L_0x0072
            r0 = 1
            r7.A00 = r0
            java.util.Set r2 = r7.A04
            r2.clear()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
        L_0x0037:
            java.util.Stack r1 = r7.A06
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0056
            int r0 = r2.size()
            if (r0 >= r3) goto L_0x0056
            java.lang.Object r0 = r1.pop()
            r4.remove(r0)
            X.0qQ.A0A(r0)
            r2.add(r0)
            r6.add(r0)
            goto L_0x0037
        L_0x0056:
            X.5ut r3 = new X.5ut
            r5 = r9
            r3.<init>(r7, r8, r9, r6)
            java.util.Set r0 = r7.A03
            r0.add(r3)
            com.instagram.common.session.UserSession r0 = r7.A02
            X.3BV r1 = X.1OP.A03(r0)
            X.0iw r0 = r7.A01
            java.lang.String r4 = r0.getModuleName()
            X.3BU r2 = X.AnonymousClass3BU.BUFFER_IN_VIEWER
            r1.A07(r2, r3, r4, r5, r6)
        L_0x0072:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass49O.A01(X.49O, X.49M, java.lang.String):void");
    }

    public AnonymousClass49O(AnonymousClass0iw r2, UserSession userSession) {
        this.A02 = userSession;
        this.A01 = r2;
    }
}
