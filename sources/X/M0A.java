package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;

public final class M0A implements C51923G7r {
    public final int A00;
    public final Object A01;

    public M0A(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0032, code lost:
        X.DbS.A13();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0039, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0013, code lost:
        return !r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean CJz() {
        /*
            r1 = this;
            int r0 = r1.A00
            switch(r0) {
                case 2: goto L_0x0014;
                case 3: goto L_0x0023;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r1.A01
            X.K6S r0 = (X.K6S) r0
            X.K9H r0 = r0.A09()
            boolean r0 = r0.isEmpty()
        L_0x0011:
            r0 = r0 ^ 1
            return r0
        L_0x0014:
            java.lang.Object r0 = r1.A01
            X.H07 r0 = (X.H07) r0
            X.H3w r0 = r0.A01
            if (r0 == 0) goto L_0x0032
            java.util.ArrayList r0 = r0.A03
            boolean r0 = r0.isEmpty()
            goto L_0x0011
        L_0x0023:
            java.lang.Object r0 = r1.A01
            X.E6d r0 = (X.C47519E6d) r0
            X.E9N r0 = r0.A00
            if (r0 == 0) goto L_0x0032
            java.util.List r0 = r0.A0R
            boolean r0 = r0.isEmpty()
            goto L_0x0011
        L_0x0032:
            X.DbS.A13()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.M0A.CJz():boolean");
    }

    public final void CgO() {
        String str;
        switch (this.A00) {
            case 0:
                Fragment fragment = (KXg) this.A01;
                C46434Dew dew = fragment.A01;
                str = "suggestedUsersPaginationHelper";
                if (dew != null) {
                    dew.A02 = true;
                    String str2 = fragment.A02;
                    if (str2 != null) {
                        MGE.A01(fragment, str2, DbW.A0E(fragment), 30);
                        return;
                    }
                    Context requireContext = fragment.requireContext();
                    0gy A002 = AnonymousClass07i.A00(fragment);
                    AnonymousClass0eM r1 = fragment.A0A;
                    UserSession A0l = AnonymousClass7TE.A0l(r1);
                    C46434Dew dew2 = fragment.A01;
                    if (dew2 != null) {
                        1OC A003 = LHo.A00(A0l, 40, dew2.A00, true, 182.A06(0Tu.A05, DbT.A0X(r1), 36319901312949971L));
                        C61500KAf.A00(A003, fragment, 4);
                        1ES.A00(requireContext, A002, A003);
                        return;
                    }
                }
                break;
            case 1:
                Fragment fragment2 = (C62040KXc) this.A01;
                C46434Dew dew3 = fragment2.A02;
                str = "suggestedUsersPaginationHelper";
                if (dew3 != null) {
                    dew3.A02 = true;
                    Context requireContext2 = fragment2.requireContext();
                    0gy A004 = AnonymousClass07i.A00(fragment2);
                    UserSession A0l2 = AnonymousClass7TE.A0l(fragment2.A06);
                    C46434Dew dew4 = fragment2.A02;
                    if (dew4 != null) {
                        1OC A005 = LHo.A00(A0l2, 40, dew4.A00, false, true);
                        C61500KAf.A00(A005, fragment2, 6);
                        1ES.A00(requireContext2, A004, A005);
                        return;
                    }
                }
                break;
            case 2:
                H07 h07 = (H07) this.A01;
                C53010Gh1 gh1 = (C53010Gh1) h07.A0B.getValue();
                C46434Dew dew5 = h07.A03;
                if (dew5 != null) {
                    gh1.A00(dew5.A00);
                    return;
                }
                break;
            default:
                C47519E6d e6d = (C47519E6d) this.A01;
                C60254JiB jiB = (C60254JiB) e6d.A09.getValue();
                String A0t = DbS.A0t(e6d.A02);
                String A0t2 = DbS.A0t(e6d.A04);
                C46434Dew dew6 = e6d.A01;
                if (dew6 != null) {
                    jiB.A00(dew6, A0t, A0t2);
                    return;
                }
                break;
        }
        str = "paginationHelper";
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void DhN() {
    }
}
