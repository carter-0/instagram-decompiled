package X;

/* renamed from: X.G2g  reason: case insensitive filesystem */
public final class C51797G2g extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C51797G2g(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    public static 0t0 A00(Object obj, int i) {
        return AnonymousClass0eN.A01(new C51797G2g(obj, i));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:123:?, code lost:
        return X.C60340gF.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0084, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00a0, code lost:
        r1.A07(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x017c, code lost:
        return r0.getValue();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r20 = this;
            r2 = r20
            int r0 = r2.A00
            switch(r0) {
                case 0: goto L_0x03c6;
                case 1: goto L_0x03bb;
                case 2: goto L_0x0383;
                case 3: goto L_0x0319;
                case 4: goto L_0x02e1;
                case 5: goto L_0x009b;
                case 6: goto L_0x0086;
                case 7: goto L_0x0080;
                case 8: goto L_0x006e;
                case 9: goto L_0x0060;
                case 10: goto L_0x0050;
                case 11: goto L_0x02b2;
                case 12: goto L_0x0298;
                case 13: goto L_0x028a;
                case 14: goto L_0x026d;
                case 15: goto L_0x03df;
                case 16: goto L_0x0266;
                case 17: goto L_0x025f;
                case 18: goto L_0x0251;
                case 19: goto L_0x020f;
                case 20: goto L_0x01b8;
                case 21: goto L_0x0007;
                case 22: goto L_0x0007;
                case 23: goto L_0x0007;
                case 24: goto L_0x01ae;
                case 25: goto L_0x01a4;
                case 26: goto L_0x019a;
                case 27: goto L_0x018c;
                case 28: goto L_0x001b;
                case 29: goto L_0x017d;
                case 30: goto L_0x016a;
                case 31: goto L_0x0161;
                case 32: goto L_0x0161;
                case 33: goto L_0x0152;
                case 34: goto L_0x0143;
                case 35: goto L_0x0139;
                case 36: goto L_0x0132;
                case 37: goto L_0x012b;
                case 38: goto L_0x03d8;
                case 39: goto L_0x0011;
                case 40: goto L_0x018a;
                case 41: goto L_0x0123;
                case 42: goto L_0x010f;
                case 43: goto L_0x00ff;
                case 44: goto L_0x00f5;
                case 45: goto L_0x00d1;
                case 46: goto L_0x00c4;
                case 47: goto L_0x00b7;
                case 48: goto L_0x00ae;
                case 49: goto L_0x00a5;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r0 = r2.A01
            com.instagram.newsfeed.viewmodel.ActivityFeedViewModel r0 = (com.instagram.newsfeed.viewmodel.ActivityFeedViewModel) r0
            r0.A0F()
        L_0x000e:
            X.0gF r4 = X.C60340gF.A00
        L_0x0010:
            return r4
        L_0x0011:
            java.lang.Object r1 = r2.A01
            X.FGY r1 = (X.FGY) r1
            java.lang.String r0 = "DISMISSAL"
            X.FGY.A04(r1, r0)
            goto L_0x000e
        L_0x001b:
            java.lang.Object r0 = r2.A01
            com.instagram.newsfeed.ui.InlineLinkUrn r0 = (com.instagram.newsfeed.ui.InlineLinkUrn) r0
            android.net.Uri r3 = r0.A00
            if (r3 == 0) goto L_0x03e2
            java.util.Set r1 = r3.getQueryParameterNames()
            if (r1 == 0) goto L_0x03e2
            r0 = 10
            int r0 = X.0Yv.A1E(r1, r0)
            int r0 = X.AnonymousClass7TG.A01(r0)
            java.util.LinkedHashMap r4 = X.DbS.A0x(r0)
            java.util.Iterator r2 = r1.iterator()
        L_0x003b:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0010
            java.lang.Object r1 = r2.next()
            r0 = r1
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = r3.getQueryParameter(r0)
            r4.put(r1, r0)
            goto L_0x003b
        L_0x0050:
            java.lang.Object r0 = r2.A01
            X.Dcv r0 = (X.C46352Dcv) r0
            X.0eM r0 = r0.A08
            java.lang.Object r0 = r0.getValue()
            X.Dbx r0 = (X.C46329Dbx) r0
            X.C46329Dbx.A00(r0)
            goto L_0x000e
        L_0x0060:
            java.lang.Object r1 = r2.A01
            X.Dcv r1 = (X.C46352Dcv) r1
            X.DdJ r0 = X.C46353Dcx.A01(r1)
            java.util.Map r0 = r0.A02
            r0.clear()
            goto L_0x0084
        L_0x006e:
            java.lang.Object r0 = r2.A01
            X.Dcv r0 = (X.C46352Dcv) r0
            X.0eM r0 = r0.A08
            java.lang.Object r0 = r0.getValue()
            X.Dbx r0 = (X.C46329Dbx) r0
            X.34p r0 = r0.A00
            r0.A01()
            goto L_0x000e
        L_0x0080:
            java.lang.Object r1 = r2.A01
            X.Dcv r1 = (X.C46352Dcv) r1
        L_0x0084:
            r0 = 1
            goto L_0x00a0
        L_0x0086:
            java.lang.Object r0 = r2.A01
            X.Dcv r0 = (X.C46352Dcv) r0
            X.0eM r0 = r0.A0L
            X.2YL r2 = X.DbS.A0H(r0)
            X.6oS r1 = X.C318116oQ.A00(r2)
            r0 = 36
            X.C51645Fy4.A01(r2, r1, r0)
            goto L_0x000e
        L_0x009b:
            java.lang.Object r1 = r2.A01
            X.Dcv r1 = (X.C46352Dcv) r1
            r0 = 0
        L_0x00a0:
            r1.A07(r0)
            goto L_0x000e
        L_0x00a5:
            java.lang.Object r0 = r2.A01
            X.CHf r0 = (X.C43891CHf) r0
            X.EM5 r0 = r0.A00
            java.lang.String r4 = r0.A07
            return r4
        L_0x00ae:
            java.lang.Object r0 = r2.A01
            X.CHf r0 = (X.C43891CHf) r0
            X.EM5 r0 = r0.A00
            java.lang.String r4 = r0.mErrorType
            return r4
        L_0x00b7:
            X.08y r1 = X.09i.A0A
            java.lang.Object r0 = r2.A01
            android.os.Bundle r0 = X.DbS.A0B(r0)
            X.0aP r4 = r1.A02(r0)
            return r4
        L_0x00c4:
            X.08y r1 = X.09i.A0A
            java.lang.Object r0 = r2.A01
            android.os.Bundle r0 = X.DbS.A0B(r0)
            X.0aP r4 = r1.A02(r0)
            return r4
        L_0x00d1:
            java.lang.Object r1 = r2.A01
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1
            java.lang.String r0 = "IgRxPushNotification"
            X.1aD r0 = X.1aD.A01(r1, r0)
            X.1aS r1 = r0.A02
            X.0qQ.A07(r1)
            java.lang.String r0 = "push_notifications"
            X.4fh r0 = X.AnonymousClass6F9.A00(r0)
            X.1aU r1 = r1.A0O(r0)
            X.EuO r0 = new X.EuO
            r0.<init>(r1)
            X.EuP r4 = new X.EuP
            r4.<init>(r0)
            return r4
        L_0x00f5:
            java.lang.Object r0 = r2.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.OMX r4 = new X.OMX
            r4.<init>(r0)
            return r4
        L_0x00ff:
            java.lang.Object r0 = r2.A01
            android.content.Context r0 = (android.content.Context) r0
            android.content.Context r1 = X.DbT.A05(r0)
            X.PiB r0 = X.C73688PiB.A00
            X.OTq r4 = new X.OTq
            r4.<init>(r1, r0)
            return r4
        L_0x010f:
            java.lang.Object r0 = r2.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.1Am r1 = X.1Al.A01(r0)
            X.1An r0 = X.1An.A27
            X.0xa r0 = r1.A03(r0)
            X.EuN r4 = new X.EuN
            r4.<init>(r0)
            return r4
        L_0x0123:
            java.lang.Object r0 = r2.A01
            X.0r6[] r0 = (X.AnonymousClass0r6[]) r0
            int r0 = r0.length
            X.0eP[] r4 = new X.0eP[r0]
            return r4
        L_0x012b:
            java.lang.Object r0 = r2.A01
            X.Dgy r0 = (X.C46556Dgy) r0
            X.0eM r0 = r0.A03
            goto L_0x0178
        L_0x0132:
            java.lang.Object r0 = r2.A01
            X.Dgy r0 = (X.C46556Dgy) r0
            X.0eM r0 = r0.A02
            goto L_0x0178
        L_0x0139:
            java.lang.Object r0 = r2.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.Dgy r4 = new X.Dgy
            r4.<init>(r0)
            return r4
        L_0x0143:
            java.lang.Object r0 = r2.A01
            com.instagram.nido.impl.explore.NidoExploreViewModel r0 = (com.instagram.nido.impl.explore.NidoExploreViewModel) r0
            X.0eM r0 = r0.A03
            java.lang.Object r0 = r0.getValue()
            X.Dgy r0 = (X.C46556Dgy) r0
            X.0eM r0 = r0.A06
            goto L_0x0178
        L_0x0152:
            java.lang.Object r0 = r2.A01
            com.instagram.nido.impl.explore.NidoExploreViewModel r0 = (com.instagram.nido.impl.explore.NidoExploreViewModel) r0
            X.0eM r0 = r0.A03
            java.lang.Object r0 = r0.getValue()
            X.Dgy r0 = (X.C46556Dgy) r0
            X.0eM r0 = r0.A05
            goto L_0x0178
        L_0x0161:
            java.lang.Object r0 = r2.A01
            X.8Z9 r0 = (X.AnonymousClass8Z9) r0
            X.3pa r4 = r0.A00()
            return r4
        L_0x016a:
            java.lang.Object r0 = r2.A01
            com.instagram.nido.impl.explore.NidoExploreViewModel r0 = (com.instagram.nido.impl.explore.NidoExploreViewModel) r0
            X.0eM r0 = r0.A03
            java.lang.Object r0 = r0.getValue()
            X.Dgy r0 = (X.C46556Dgy) r0
            X.0eM r0 = r0.A04
        L_0x0178:
            java.lang.Object r4 = r0.getValue()
            return r4
        L_0x017d:
            java.lang.Object r0 = r2.A01
            com.instagram.newsfeed.ui.InlineLinkUrn r0 = (com.instagram.newsfeed.ui.InlineLinkUrn) r0
            android.net.Uri r0 = r0.A00
            if (r0 == 0) goto L_0x018a
            java.lang.String r4 = r0.getHost()
            return r4
        L_0x018a:
            r4 = 0
            return r4
        L_0x018c:
            java.lang.Object r0 = r2.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.DgJ r0 = X.C46512DgF.A00(r0)
            X.DdJ r4 = new X.DdJ
            r4.<init>(r0)
            return r4
        L_0x019a:
            java.lang.Object r0 = r2.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.DgJ r4 = new X.DgJ
            r4.<init>(r0)
            return r4
        L_0x01a4:
            java.lang.Object r0 = r2.A01
            X.0lg r0 = (X.0lg) r0
            X.DgI r4 = new X.DgI
            r4.<init>(r0)
            return r4
        L_0x01ae:
            java.lang.Object r0 = r2.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.Dd0 r4 = new X.Dd0
            r4.<init>(r0)
            return r4
        L_0x01b8:
            java.lang.Object r1 = r2.A01
            X.Dcv r1 = (X.C46352Dcv) r1
            X.0eM r0 = r1.A0J
            java.lang.String r0 = X.DbS.A0t(r0)
            if (r0 == 0) goto L_0x01fb
            X.ENE r9 = new X.ENE
            r9.<init>(r0)
        L_0x01c9:
            android.app.Application r5 = X.DbY.A05(r1)
            com.instagram.common.session.UserSession r7 = r1.getSession()
            X.0eM r3 = r1.A05
            java.lang.Object r6 = r3.getValue()
            X.0xG r6 = (X.0xG) r6
            X.0eM r0 = r1.A0A
            java.lang.Object r8 = r0.getValue()
            X.G7E r8 = (X.G7E) r8
            android.app.Application r2 = X.DbY.A05(r1)
            com.instagram.common.session.UserSession r1 = r1.getSession()
            java.lang.Object r0 = r3.getValue()
            X.0xG r0 = (X.0xG) r0
            java.lang.String r0 = r0.A00
            X.7aQ r10 = X.C333947aP.A00(r2, r1, r0)
            X.DgE r4 = new X.DgE
            r4.<init>(r5, r6, r7, r8, r9, r10)
            return r4
        L_0x01fb:
            X.0eM r0 = r1.A0D
            java.lang.Object r0 = r0.getValue()
            com.instagram.newsfeed.model.PillsFilterCategory r0 = (com.instagram.newsfeed.model.PillsFilterCategory) r0
            if (r0 == 0) goto L_0x020d
            java.lang.String r0 = r0.A01
        L_0x0207:
            X.5mm r9 = new X.5mm
            r9.<init>(r0)
            goto L_0x01c9
        L_0x020d:
            r0 = 0
            goto L_0x0207
        L_0x020f:
            java.lang.Object r3 = r2.A01
            X.Dcv r3 = (X.C46352Dcv) r3
            X.0eM r0 = r3.A0D
            java.lang.Object r0 = r0.getValue()
            com.instagram.newsfeed.model.PillsFilterCategory r0 = (com.instagram.newsfeed.model.PillsFilterCategory) r0
            if (r0 == 0) goto L_0x0221
            java.lang.String r2 = r0.A01
            if (r2 != 0) goto L_0x0229
        L_0x0221:
            X.DdJ r0 = X.C46353Dcx.A01(r3)
            java.lang.String r2 = r0.A00()
        L_0x0229:
            X.0eM r0 = r3.A0J
            java.lang.String r1 = X.DbS.A0t(r0)
            if (r1 == 0) goto L_0x024b
            X.ENE r0 = new X.ENE
            r0.<init>(r1)
        L_0x0236:
            com.instagram.newsfeed.viewmodel.ActivityFeedViewModel r2 = X.DbV.A0Z(r3)
            r1 = 0
            X.0r6 r2 = r2.A0E(r0, r1, r1)
            X.5Or r1 = X.C289465dd.A00()
            X.0eM r0 = X.C284905Ot.A01
            androidx.compose.runtime.ParcelableSnapshotMutableState r4 = new androidx.compose.runtime.ParcelableSnapshotMutableState
            r4.<init>(r1, r2)
            return r4
        L_0x024b:
            X.5mm r0 = new X.5mm
            r0.<init>(r2)
            goto L_0x0236
        L_0x0251:
            java.lang.Object r1 = r2.A01
            X.Dcv r1 = (X.C46352Dcv) r1
            com.instagram.common.session.UserSession r0 = r1.getSession()
            X.VgC r4 = new X.VgC
            r4.<init>(r1, r0)
            return r4
        L_0x025f:
            java.lang.Object r0 = r2.A01
            X.07f r4 = X.DbY.A0I(r0)
            return r4
        L_0x0266:
            java.lang.Object r0 = r2.A01
            java.lang.Object r4 = X.DbT.A0r(r0)
            return r4
        L_0x026d:
            java.lang.Object r0 = r2.A01
            X.Dcv r0 = (X.C46352Dcv) r0
            com.instagram.common.session.UserSession r3 = r0.getSession()
            X.0Tu r2 = X.0Tu.A05
            r0 = 36601410649788588(0x8208ca000f10ac, double:3.2102177047527275E-306)
            long r2 = X.182.A01(r2, r3, r0)
            long r0 = java.lang.System.currentTimeMillis()
            X.DgC r4 = new X.DgC
            r4.<init>(r2, r0)
            return r4
        L_0x028a:
            java.lang.Object r0 = r2.A01
            X.Dcv r0 = (X.C46352Dcv) r0
            com.instagram.common.session.UserSession r0 = r0.getSession()
            X.DdG r4 = new X.DdG
            r4.<init>(r0)
            return r4
        L_0x0298:
            java.lang.Object r0 = r2.A01
            X.Dcv r0 = (X.C46352Dcv) r0
            androidx.fragment.app.FragmentActivity r2 = r0.requireActivity()
            com.instagram.common.session.UserSession r1 = r0.getSession()
            X.0eM r0 = r0.A05
            java.lang.Object r0 = r0.getValue()
            X.0xG r0 = (X.0xG) r0
            X.DdO r4 = new X.DdO
            r4.<init>(r2, r0, r1)
            return r4
        L_0x02b2:
            X.1YN r3 = X.AnonymousClass2bO.A00()
            java.lang.Object r4 = r2.A01
            X.Dcv r4 = (X.C46352Dcv) r4
            X.0eM r0 = r4.A05
            java.lang.Object r5 = r0.getValue()
            X.0xG r5 = (X.0xG) r5
            com.instagram.common.session.UserSession r6 = r4.getSession()
            com.instagram.quickpromotion.intf.QuickPromotionSlot r8 = com.instagram.quickpromotion.intf.QuickPromotionSlot.A05
            X.AnonymousClass2bO.A00()
            r0 = 8
            X.Fha r2 = new X.Fha
            r2.<init>(r4, r0)
            r1 = 7
            X.Fhb r0 = new X.Fhb
            r0.<init>(r4, r1)
            X.2bW r7 = X.2bV.A05(r2, r0)
            X.2qi r4 = r3.A01(r4, r5, r6, r7, r8)
            return r4
        L_0x02e1:
            java.lang.Object r2 = r2.A01
            X.Dcv r2 = (X.C46352Dcv) r2
            com.instagram.common.session.UserSession r5 = r2.getSession()
            com.instagram.newsfeed.viewmodel.ActivityFeedViewModel r8 = X.DbV.A0Z(r2)
            X.0eM r0 = r2.A0G
            java.lang.Object r9 = r0.getValue()
            X.DdG r9 = (X.DdG) r9
            X.0eM r0 = r2.A0B
            java.lang.Object r6 = r0.getValue()
            X.Dd4 r6 = (X.Dd4) r6
            X.0eM r0 = r2.A05
            java.lang.Object r1 = r0.getValue()
            X.0xG r1 = (X.0xG) r1
            com.instagram.common.session.UserSession r0 = r2.getSession()
            X.EwX r7 = new X.EwX
            r7.<init>(r1, r0)
            X.2S0 r10 = X.AnonymousClass2S0.A01
            X.0qQ.A07(r10)
            X.Feo r4 = new X.Feo
            r4.<init>(r5, r6, r7, r8, r9, r10)
            return r4
        L_0x0319:
            java.lang.Object r7 = r2.A01
            X.Dcv r7 = (X.C46352Dcv) r7
            androidx.fragment.app.FragmentActivity r5 = r7.requireActivity()
            com.instagram.common.session.UserSession r9 = r7.getSession()
            X.0hq r6 = r7.getChildFragmentManager()
            X.0eM r4 = r7.A05
            java.lang.Object r8 = r4.getValue()
            X.0xG r8 = (X.0xG) r8
            java.lang.String r2 = r7.getModuleName()
            r1 = 1
            r0 = 0
            X.2kQ r10 = X.C227942kP.A01(r2, r1, r0)
            int r0 = X.C46521DgO.A0A
            com.instagram.common.session.UserSession r17 = r7.getSession()
            java.lang.Object r3 = r4.getValue()
            X.0xG r3 = (X.0xG) r3
            com.instagram.common.session.UserSession r1 = r7.getSession()
            java.lang.Object r0 = r4.getValue()
            X.0xG r0 = (X.0xG) r0
            X.0wc r16 = X.AnonymousClass0kN.A01(r0, r1)
            X.DgN r2 = new X.DgN
            r2.<init>(r7)
            X.0eM r1 = r7.A0A
            java.lang.Object r0 = r1.getValue()
            X.G7E r0 = (X.G7E) r0
            X.DgO r13 = new X.DgO
            r14 = r7
            r15 = r3
            r18 = r0
            r19 = r2
            r13.<init>(r14, r15, r16, r17, r18, r19)
            java.lang.Object r12 = r1.getValue()
            X.G7E r12 = (X.G7E) r12
            X.DgP r14 = new X.DgP
            r14.<init>(r7)
            X.DgQ r11 = new X.DgQ
            r11.<init>(r7)
            X.Dd4 r4 = new X.Dd4
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return r4
        L_0x0383:
            java.lang.Object r1 = r2.A01
            X.Dcv r1 = (X.C46352Dcv) r1
            r0 = 1
            X.G2g r5 = new X.G2g
            r5.<init>(r1, r0)
            X.0eM r4 = r1.A0D
            java.lang.Object r0 = r4.getValue()
            if (r0 != 0) goto L_0x03ae
            com.instagram.common.session.UserSession r3 = r1.getSession()
            X.0Tu r2 = X.0Tu.A06
            r0 = 36321980076533628(0x810aa60000277c, double:3.0335046850496855E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x03ae
            java.lang.String r0 = "all"
        L_0x03a8:
            X.Dcz r4 = new X.Dcz
            r4.<init>(r0, r5)
            return r4
        L_0x03ae:
            java.lang.Object r0 = r4.getValue()
            com.instagram.newsfeed.model.PillsFilterCategory r0 = (com.instagram.newsfeed.model.PillsFilterCategory) r0
            if (r0 == 0) goto L_0x03b9
            java.lang.String r0 = r0.A01
            goto L_0x03a8
        L_0x03b9:
            r0 = 0
            goto L_0x03a8
        L_0x03bb:
            java.lang.Object r0 = r2.A01
            X.Dcv r0 = (X.C46352Dcv) r0
            X.DdJ r0 = X.C46353Dcx.A01(r0)
            java.util.List r4 = r0.A01
            return r4
        L_0x03c6:
            java.lang.Object r2 = r2.A01
            X.Dcv r2 = (X.C46352Dcv) r2
            androidx.fragment.app.FragmentActivity r1 = r2.requireActivity()
            com.instagram.common.session.UserSession r0 = r2.getSession()
            X.Dev r4 = new X.Dev
            r4.<init>(r1, r0, r2)
            return r4
        L_0x03d8:
            java.lang.Object r0 = r2.A01
            X.Dgy r0 = (X.C46556Dgy) r0
            X.05G r4 = r0.A07
            return r4
        L_0x03df:
            java.lang.Object r4 = r2.A01
            return r4
        L_0x03e2:
            X.0sm r4 = X.0Yt.A0E()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C51797G2g.invoke():java.lang.Object");
    }
}
