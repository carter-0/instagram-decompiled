package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.HKj  reason: case insensitive filesystem */
public final class C54600HKj extends C54373HAo {
    public final UserSession A00;
    public final JRI A01;
    public final List A02;
    public final C53352Gmc A03;
    public final String A04;

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0017, code lost:
        r0 = r1.getString(2131965975);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C54600HKj(androidx.fragment.app.Fragment r9, com.instagram.common.session.UserSession r10, X.JRI r11, X.C53352Gmc r12, java.util.List r13) {
        /*
            r8 = this;
            r7 = 0
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r13
            r2.<init>(r3, r4, r5, r6, r7)
            r8.A00 = r10
            r8.A01 = r11
            r8.A02 = r13
            r8.A03 = r12
            androidx.fragment.app.FragmentActivity r1 = r9.getActivity()
            if (r1 == 0) goto L_0x0020
            r0 = 2131965975(0x7f133817, float:1.9568775E38)
            java.lang.String r0 = r1.getString(r0)
            if (r0 != 0) goto L_0x0022
        L_0x0020:
            java.lang.String r0 = ""
        L_0x0022:
            r8.A04 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C54600HKj.<init>(androidx.fragment.app.Fragment, com.instagram.common.session.UserSession, X.JRI, X.Gmc, java.util.List):void");
    }

    public static final 1Xj A02(1Xj r10, C54600HKj hKj) {
        String str = null;
        ArrayList arrayList = null;
        1Xj r4 = r10;
        0qQ.A0B(r10, 1);
        String str2 = hKj.A04;
        C53352Gmc gmc = hKj.A03;
        String str3 = gmc.A01;
        if (str3 != null) {
            str = str3;
        }
        if (r10.A5D()) {
            arrayList = AnonymousClass7TE.A1C();
            int A0o = r10.A0o();
            for (int i = 0; i < A0o; i++) {
                1Xj A1c = r10.A1c(i);
                if (A1c != null) {
                    arrayList.add(A02(A1c, hKj));
                }
            }
        }
        return C54993HaQ.A00(hKj.A00, gmc, r4, str, (String) null, str2, arrayList, true, true);
    }
}
