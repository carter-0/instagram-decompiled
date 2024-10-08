package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class LRu {
    public static final boolean A01(UserSession userSession, C3499682q r5, 1iA r6, String str, ArrayList arrayList) {
        int ordinal;
        0qQ.A0B(userSession, 0);
        AnonymousClass7TF.A1C(arrayList, 2, r5);
        if (r6 == null) {
            0wb.A03(str, "MediaType is null");
            ordinal = -1;
        } else {
            ordinal = r6.ordinal();
        }
        if (!(ordinal == 0 || ordinal == 1)) {
            if (!r5.COf()) {
                return false;
            }
            if (!r5.CKP() && !r5.CL3()) {
                return false;
            }
        }
        if (C367088qA.A01(userSession) || C367088qA.A04(userSession) || DbT.A1b(arrayList) || LTZ.A0I(userSession, r5, true)) {
            return true;
        }
        return false;
    }

    public static final boolean A02(UserSession userSession, C3499682q r2, AnonymousClass3Q2 r3, LP7 lp7) {
        0qQ.A0B(userSession, 0);
        if (C367088qA.A03(userSession) || !A03(userSession, r2, r3, lp7)) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0019, code lost:
        if (r8.A03() == false) goto L_0x001b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A03(com.instagram.common.session.UserSession r5, X.C3499682q r6, X.AnonymousClass3Q2 r7, X.LP7 r8) {
        /*
            r4 = 1
            if (r7 == 0) goto L_0x0028
            X.JxB r0 = r7.A0v
            if (r0 == 0) goto L_0x0028
            java.lang.Integer r0 = r0.A00
        L_0x0009:
            r3 = 0
            boolean r2 = X.AnonymousClass7TF.A1V(r0)
            boolean r0 = r8.A04()
            if (r0 == 0) goto L_0x001b
            boolean r1 = r8.A03()
            r0 = 1
            if (r1 != 0) goto L_0x001c
        L_0x001b:
            r0 = 0
        L_0x001c:
            if (r2 != 0) goto L_0x0027
            if (r0 != 0) goto L_0x0026
            boolean r0 = X.LTZ.A0I(r5, r6, r4)
            if (r0 == 0) goto L_0x0027
        L_0x0026:
            r3 = 1
        L_0x0027:
            return r3
        L_0x0028:
            r0 = 0
            goto L_0x0009
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LRu.A03(com.instagram.common.session.UserSession, X.82q, X.3Q2, X.LP7):boolean");
    }

    public static final List A00(List list) {
        String A00;
        Long A10;
        ArrayList A1C = AnonymousClass7TE.A1C();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            User user = JTS.A0Y(it).A0B;
            if (!(user == null || (A00 = AnonymousClass3ZA.A00(user)) == null || (A10 = AnonymousClass7TE.A10(A00)) == null)) {
                A1C.add(A10);
            }
        }
        return A1C;
    }
}
