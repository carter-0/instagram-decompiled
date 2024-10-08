package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.Hrp  reason: case insensitive filesystem */
public final class C56042Hrp {
    public Fragment A00;
    public FragmentActivity A01;
    public UserSession A02;
    public C331157Pu A03;
    public C273414mX A04 = new C57385IZq(this, 14);
    public C227232is A05;
    public C55948HqC A06;
    public CharSequence A07;
    public boolean A08;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: X.7Pu} */
    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v2, types: [X.4mf] */
    /* JADX WARNING: type inference failed for: r3v7 */
    /* JADX WARNING: type inference failed for: r3v8 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(android.view.View r7, androidx.fragment.app.Fragment r8, java.lang.CharSequence r9, boolean r10) {
        /*
            r6 = this;
            r1 = 0
            r2 = 5
            X.IZe r0 = new X.IZe
            r0.<init>(r2, r7, r6)
            r6.A04 = r0
            X.2is r4 = r6.A05
            if (r4 == 0) goto L_0x0068
            X.GBE r0 = r4.A09
            java.lang.String r5 = "clipsViewerFragmentViewModel"
            if (r0 == 0) goto L_0x005d
            X.GKU r0 = r0.A0I
            if (r0 == 0) goto L_0x001e
            X.5Gv r0 = r0.A00
            if (r0 == 0) goto L_0x001e
            r0.A08(r1)
        L_0x001e:
            X.GBE r0 = r4.A09
            if (r0 == 0) goto L_0x005d
            X.GNH r0 = r0.A0B
            if (r0 == 0) goto L_0x002b
            android.view.View r0 = r0.A02
            X.AnonymousClass7TH.A0R(r0)
        L_0x002b:
            X.GBE r0 = r4.A09
            if (r0 == 0) goto L_0x005d
            X.GME r0 = r0.A0H
            if (r0 == 0) goto L_0x0036
            r0.A0F()
        L_0x0036:
            X.GBE r0 = r4.A09
            if (r0 == 0) goto L_0x005d
            X.GME r0 = r0.A0H
            if (r0 == 0) goto L_0x0041
            r0.A0D()
        L_0x0041:
            X.GCp r0 = r4.A0H
            if (r0 == 0) goto L_0x004e
            X.2js r3 = r0.A03
            X.3Ar r2 = r0.A00
            int r0 = X.C249383je.DEFAULT_FIRST_VISIBLE_ITEM_POSITION
            r3.A09(r2)
        L_0x004e:
            X.GBE r0 = r4.A09
            if (r0 == 0) goto L_0x005d
            X.GE2 r0 = r0.A12
            X.GE2.A03(r0, r1)
            X.HrW r0 = r4.A0K
            if (r0 != 0) goto L_0x0065
            java.lang.String r5 = "drawerEventsDispatcher"
        L_0x005d:
            X.0qQ.A0F(r5)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0065:
            r0.A01()
        L_0x0068:
            r6.A00 = r8
            r6.A07 = r9
            com.instagram.common.session.UserSession r4 = r6.A02
            r3 = 0
            if (r4 == 0) goto L_0x00a6
            X.7Pr r2 = X.DbS.A0W(r4)
            r2.A1G = r10
            r0 = r10 ^ 1
            X.DbS.A1S(r2, r0)
            r0 = 1059984507(0x3f2e147b, float:0.68)
            r2.A03 = r0
            X.4mX r0 = r6.A04
            r2.A0U = r0
            r0 = 1
            r2.A1O = r0
            boolean r0 = r8 instanceof X.C273494mf
            if (r0 == 0) goto L_0x008f
            r3 = r8
            X.4mf r3 = (X.C273494mf) r3
        L_0x008f:
            r2.A0T = r3
            java.lang.Boolean r0 = X.F8J.A00(r4)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x00bd
            r0 = 2132017856(0x7f1402c0, float:1.9674002E38)
            r2.A0d = r9
            r2.A0D = r0
        L_0x00a2:
            X.7Pu r3 = r2.A00()
        L_0x00a6:
            r6.A03 = r3
            X.HqC r0 = r6.A06
            if (r0 == 0) goto L_0x00b1
            X.GE2 r0 = r0.A00
            X.GE2.A03(r0, r1)
        L_0x00b1:
            androidx.fragment.app.FragmentActivity r1 = r6.A01
            if (r1 == 0) goto L_0x00bc
            X.7Pu r0 = r6.A03
            if (r0 == 0) goto L_0x00bc
            r0.A02(r1, r8)
        L_0x00bc:
            return
        L_0x00bd:
            r2.A0d = r9
            goto L_0x00a2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56042Hrp.A00(android.view.View, androidx.fragment.app.Fragment, java.lang.CharSequence, boolean):void");
    }

    public final void A01(Fragment fragment, String str) {
        C331157Pu r1;
        UserSession userSession = this.A02;
        if (userSession != null && (r1 = this.A03) != null) {
            C331127Pr A0W = DbS.A0W(userSession);
            A0W.A0d = str;
            A0W.A1G = true;
            r1.A0F(fragment, A0W);
        }
    }
}
