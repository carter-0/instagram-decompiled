package X;

import android.widget.ListView;
import com.instagram.ui.widget.refresh.RefreshableListView;

/* renamed from: X.HAt  reason: case insensitive filesystem */
public final class C54378HAt extends C324596za {
    public final int A00;
    public final Object A01;

    public C54378HAt(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void onFail(C268654dm r7) {
        int A03;
        int i;
        String str;
        switch (this.A00) {
            case 0:
                A03 = AnonymousClass0fD.A03(-108859313);
                H15 h15 = (H15) this.A01;
                h15.A03.A00.A01();
                if (h15.isResumed()) {
                    C59689JTv.A0F(h15.requireActivity(), AnonymousClass000.A00(275), 2131956760);
                }
                H15.A08(h15);
                i = 730379685;
                break;
            case 1:
                A03 = AnonymousClass0fD.A03(-681644647);
                C59689JTv.A08(DbZ.A0E(this.A01), 2131956760, 0);
                i = -586670458;
                break;
            case 2:
                A03 = AnonymousClass0fD.A03(95370720);
                ((C54600HKj) this.A01).A01.DeI();
                i = 1931948624;
                break;
            case 3:
                A03 = AnonymousClass0fD.A03(-551958406);
                ((C54373HAo) this.A01).A03.DeI();
                i = 2130112384;
                break;
            default:
                A03 = AnonymousClass0fD.A03(-1242091227);
                0qQ.A0B(r7, 0);
                C54174H1u h1u = (C54174H1u) this.A01;
                C2366634p r1 = h1u.A00;
                if (r1 != null) {
                    Throwable A012 = r7.A01();
                    if (A012 != null) {
                        str = A012.getMessage();
                    } else {
                        str = "Feed request failed";
                    }
                    r1.A07(str);
                }
                if (h1u.isAdded()) {
                    C59689JTv.A01(h1u.getActivity(), AnonymousClass000.A00(275), 2131956760, 0);
                    HDB hdb = h1u.A04;
                    if (hdb != null) {
                        hdb.notifyDataSetChanged();
                        i = -1582053310;
                        break;
                    } else {
                        DbS.A13();
                        throw AnonymousClass00P.createAndThrow();
                    }
                } else {
                    i = 1193814263;
                    break;
                }
        }
        AnonymousClass0fD.A0A(i, A03);
    }

    public final void onFinish() {
        int A03;
        int i;
        switch (this.A00) {
            case 0:
                A03 = AnonymousClass0fD.A03(948350511);
                i = 1534387288;
                break;
            case 1:
                A03 = AnonymousClass0fD.A03(1485128365);
                0S7 r0 = (0S7) this.A01;
                0S7.A00(r0);
                ((RefreshableListView) r0.A04).setIsLoading(false);
                i = -1777152787;
                break;
            case 2:
                A03 = AnonymousClass0fD.A03(151034416);
                ((C54600HKj) this.A01).A01.DeS();
                i = -933858949;
                break;
            case 3:
                A03 = AnonymousClass0fD.A03(-2136657807);
                ((C54373HAo) this.A01).A03.DeS();
                i = -884712737;
                break;
            default:
                A03 = AnonymousClass0fD.A03(-658164883);
                AnonymousClass32G r1 = (AnonymousClass32G) this.A01;
                if (r1.A0X() != null) {
                    ListView A0X = r1.A0X();
                    0qQ.A0C(A0X, AnonymousClass000.A00(31));
                    ((RefreshableListView) A0X).setIsLoading(false);
                }
                i = -1559923070;
                break;
        }
        AnonymousClass0fD.A0A(i, A03);
    }

    public final void onStart() {
        int A03;
        int i;
        switch (this.A00) {
            case 0:
                A03 = AnonymousClass0fD.A03(2000707662);
                ((H15) this.A01).A03.A00.A04();
                i = -1270561184;
                break;
            case 1:
                A03 = AnonymousClass0fD.A03(1244086763);
                i = 551115030;
                break;
            case 2:
                A03 = AnonymousClass0fD.A03(1027706533);
                ((C54600HKj) this.A01).A01.Dei();
                i = -737918514;
                break;
            case 3:
                A03 = AnonymousClass0fD.A03(2070703852);
                ((C54373HAo) this.A01).A03.Dei();
                i = -1309952749;
                break;
            default:
                A03 = AnonymousClass0fD.A03(-1219045111);
                AnonymousClass32G r1 = (AnonymousClass32G) this.A01;
                if (r1.A0X() != null) {
                    ListView A0X = r1.A0X();
                    0qQ.A0C(A0X, AnonymousClass000.A00(31));
                    ((RefreshableListView) A0X).setIsLoading(true);
                }
                i = -1956643191;
                break;
        }
        AnonymousClass0fD.A0A(i, A03);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: java.lang.Object} */
    /* JADX WARNING: type inference failed for: r17v4, types: [X.IXT] */
    /* JADX WARNING: type inference failed for: r17v5, types: [X.IXS] */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x0401, code lost:
        if (X.I31.A02(r7.A05) == false) goto L_0x0403;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0064, code lost:
        if (r2 == false) goto L_0x0066;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0174  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x018e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r26) {
        /*
            r25 = this;
            r9 = r25
            r8 = r26
            int r0 = r9.A00
            switch(r0) {
                case 0: goto L_0x0288;
                case 1: goto L_0x0215;
                case 2: goto L_0x01cb;
                case 3: goto L_0x01a1;
                default: goto L_0x0009;
            }
        L_0x0009:
            r0 = -1762453891(0xffffffff96f3167d, float:-3.927296E-25)
            int r0 = X.AnonymousClass0fD.A03(r0)
            X.1XO r8 = (X.1XO) r8
            r1 = 365496153(0x15c90759, float:8.1194846E-26)
            int r7 = X.AnonymousClass0fD.A03(r1)
            r6 = 0
            X.0qQ.A0B(r8, r6)
            java.lang.Object r5 = r9.A01
            X.H1u r5 = (X.C54174H1u) r5
            X.34p r1 = r5.A00
            if (r1 == 0) goto L_0x0028
            r1.A05()
        L_0x0028:
            boolean r1 = r5.isAdded()
            if (r1 != 0) goto L_0x003b
            r1 = 1323894238(0x4ee905de, float:1.95473792E9)
        L_0x0031:
            X.AnonymousClass0fD.A0A(r1, r7)
            r1 = 1551417682(0x5c78c152, float:2.80073409E17)
        L_0x0037:
            X.AnonymousClass0fD.A0A(r1, r0)
            return
        L_0x003b:
            java.util.List r1 = r8.A06
            X.1Xj r4 = X.DbZ.A0T(r1, r6)
            com.instagram.user.model.User r1 = X.C51966G9m.A11(r4)
            if (r1 == 0) goto L_0x004a
            r1.getId()
        L_0x004a:
            X.0eM r3 = r5.A0J
            X.0lg r10 = X.DbT.A0X(r3)
            X.0Tu r9 = X.0Tu.A05
            r1 = 36326275043964585(0x810e8e000236a9, double:3.0362208397474684E-306)
            boolean r2 = X.182.A06(r9, r10, r1)
            java.util.List r1 = r8.A06
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x0066
            r1 = 1
            if (r2 != 0) goto L_0x0067
        L_0x0066:
            r1 = 0
        L_0x0067:
            java.lang.String r13 = "sessionId"
            if (r1 == 0) goto L_0x009c
            java.util.List r1 = r8.A06
            r12 = 0
            X.1Xj r11 = X.DbZ.A0T(r1, r6)
            java.lang.String r10 = r5.A05
            r9 = 0
            if (r10 != 0) goto L_0x0081
            java.lang.String r13 = "carouselChildMediaId"
        L_0x0079:
            X.0qQ.A0F(r13)
        L_0x007c:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0081:
            java.util.List r1 = r8.A06
            X.0qQ.A07(r1)
            java.util.Iterator r2 = r1.iterator()
        L_0x008a:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L_0x013f
            X.1Xj r1 = X.C51966G9m.A0t(r2)
            int r1 = r1.A16(r10)
            if (r1 <= 0) goto L_0x008a
            r12 = r1
            goto L_0x008a
        L_0x009c:
            X.36D r1 = r5.A02
            if (r1 != 0) goto L_0x00a6
            java.lang.String r11 = "mediaUpdateListener"
        L_0x00a2:
            X.0qQ.A0F(r11)
            goto L_0x007c
        L_0x00a6:
            r1.A00()
            X.HDB r1 = r5.A04
            java.lang.String r11 = "adapter"
            if (r1 == 0) goto L_0x00a2
            r1.A05()
            X.HDB r2 = r5.A04
            if (r2 == 0) goto L_0x00a2
            java.util.List r1 = r8.A06
            X.0qQ.A07(r1)
            r2.A0B(r1)
            java.lang.String r10 = r5.A05
            if (r10 != 0) goto L_0x00c5
            java.lang.String r11 = "carouselChildMediaId"
            goto L_0x00a2
        L_0x00c5:
            X.HDB r1 = r5.A04
            if (r1 == 0) goto L_0x00a2
            java.util.List r1 = r1.A04()
            if (r1 == 0) goto L_0x00f1
            java.util.Iterator r9 = r1.iterator()
        L_0x00d3:
            boolean r1 = r9.hasNext()
            if (r1 == 0) goto L_0x00f1
            X.1Xj r8 = X.C51966G9m.A0t(r9)
            int r2 = r8.A16(r10)
            if (r2 <= 0) goto L_0x00d3
            X.HDB r1 = r5.A04
            if (r1 == 0) goto L_0x00a2
            X.3W1 r1 = r1.BQr(r8)
            if (r1 == 0) goto L_0x00d3
            r1.A0A(r2)
            goto L_0x00d3
        L_0x00f1:
            java.lang.String r1 = r5.A07
            if (r1 == 0) goto L_0x010d
            java.lang.String r8 = r5.A08
            androidx.fragment.app.FragmentActivity r14 = r5.requireActivity()
            java.lang.String r2 = r5.A07
            java.lang.String r1 = r5.A09
            if (r1 == 0) goto L_0x0079
            r15 = r4
            r16 = r5
            r17 = r8
            r18 = r2
            r19 = r1
            X.C54174H1u.A01(r14, r15, r16, r17, r18, r19)
        L_0x010d:
            java.lang.String r2 = r5.A06
            if (r2 == 0) goto L_0x0170
            java.lang.String r1 = "accept"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x0125
            android.content.Context r2 = r5.requireContext()
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r3)
            X.AnonymousClass3YV.A01(r2, r1, r4)
            goto L_0x0170
        L_0x0125:
            java.lang.String r1 = "review_dialog"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x0170
            android.content.Context r8 = r5.requireContext()
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r3)
            java.lang.String r1 = r5.A08
            if (r1 != 0) goto L_0x013b
            java.lang.String r1 = ""
        L_0x013b:
            X.AnonymousClass3YV.A03(r8, r2, r5, r1)
            goto L_0x0170
        L_0x013f:
            android.content.Context r14 = r5.requireContext()
            com.instagram.common.session.UserSession r15 = X.AnonymousClass7TE.A0l(r3)
            java.lang.String r18 = X.C51970G9q.A0j(r11)
            X.1iA r16 = r11.BR7()
            java.lang.String r1 = r11.getId()
            if (r1 == 0) goto L_0x0283
            java.lang.String r19 = X.1Xv.A04(r1)
            java.lang.Integer r17 = java.lang.Integer.valueOf(r12)
            r20 = r9
            X.GUf r2 = X.C54961HZr.A00(r14, r15, r16, r17, r18, r19, r20)
            X.6Yo r1 = X.DbZ.A0P(r5, r3)
            r1.A0C(r5)
            r1.A0B(r9, r2)
            r1.A04()
        L_0x0170:
            boolean r1 = r5.A0B
            if (r1 == 0) goto L_0x018a
            java.lang.String r8 = r5.A08
            androidx.fragment.app.FragmentActivity r9 = r5.requireActivity()
            java.lang.String r2 = r5.A07
            java.lang.String r1 = r5.A09
            if (r1 == 0) goto L_0x0079
            r10 = r4
            r11 = r5
            r12 = r8
            r13 = r2
            r14 = r1
            X.C54174H1u.A01(r9, r10, r11, r12, r13, r14)
            r5.A0B = r6
        L_0x018a:
            boolean r1 = r5.A0C
            if (r1 == 0) goto L_0x019c
            X.1Ng r2 = X.DbX.A0R(r3)
            X.3Kh r1 = new X.3Kh
            r1.<init>(r4)
            r2.A00(r1)
            r5.A0C = r6
        L_0x019c:
            r1 = 962830882(0x3963a222, float:2.1708806E-4)
            goto L_0x0031
        L_0x01a1:
            r0 = -374024375(0xffffffffe9b4d749, float:-2.7327913E25)
            int r0 = X.AnonymousClass0fD.A03(r0)
            X.1XO r8 = (X.1XO) r8
            r1 = 172991954(0xa4fa5d2, float:9.997875E-33)
            int r2 = X.AnonymousClass7TG.A0D(r8, r1)
            java.lang.Object r1 = r9.A01
            X.HAo r1 = (X.C54373HAo) r1
            X.JRI r3 = r1.A03
            java.util.List r6 = r8.A06
            r7 = 1
            r4 = 0
            r5 = r4
            r8 = r7
            r3.Dex(r4, r5, r6, r7, r8)
            r1 = -2130855155(0xffffffff80fdbb0d, float:-2.3301482E-38)
            X.AnonymousClass0fD.A0A(r1, r2)
            r1 = -651750824(0xffffffffd9271258, float:-2.93915564E15)
            goto L_0x0037
        L_0x01cb:
            r0 = 333150130(0x13db77b2, float:5.54014E-27)
            int r0 = X.AnonymousClass0fD.A03(r0)
            X.1XO r8 = (X.1XO) r8
            r1 = -1703256964(0xffffffff9a7a5c7c, float:-5.1773497E-23)
            int r4 = X.AnonymousClass7TG.A0D(r8, r1)
            java.lang.Object r3 = r9.A01
            X.HKj r3 = (X.C54600HKj) r3
            X.JRI r5 = r3.A01
            java.util.List r1 = r8.A06
            X.0qQ.A07(r1)
            java.util.ArrayList r8 = X.AnonymousClass7TG.A0r(r1)
            java.util.Iterator r2 = r1.iterator()
        L_0x01ee:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L_0x0203
            X.1Xj r1 = X.C51966G9m.A0t(r2)
            X.0qQ.A0A(r1)
            X.1Xj r1 = X.C54600HKj.A02(r1, r3)
            r8.add(r1)
            goto L_0x01ee
        L_0x0203:
            r9 = 1
            r6 = 0
            r7 = r6
            r10 = r9
            r5.Dex(r6, r7, r8, r9, r10)
            r1 = -426323669(0xffffffffe696d12b, float:-3.5610672E23)
            X.AnonymousClass0fD.A0A(r1, r4)
            r1 = 382049259(0x16c59beb, float:3.1925465E-25)
            goto L_0x0037
        L_0x0215:
            r0 = 374924455(0x1658e4a7, float:1.7520491E-25)
            int r0 = X.AnonymousClass0fD.A03(r0)
            X.1XO r8 = (X.1XO) r8
            r1 = 283689735(0x10e8c307, float:9.180835E-29)
            int r5 = X.AnonymousClass0fD.A03(r1)
            java.util.List r1 = r8.A06
            int r1 = r1.size()
            r6 = 0
            r3 = 1
            if (r1 == r3) goto L_0x0230
            r3 = 0
        L_0x0230:
            java.lang.String r2 = "Invalid number of items in response for PromotionPreviewFragment, size::"
            java.util.List r1 = r8.A06
            int r1 = r1.size()
            java.lang.String r1 = X.002.A0O(r2, r1)
            X.17k.A0H(r3, r1)
            java.lang.Object r3 = r9.A01
            X.H1t r3 = (X.C54173H1t) r3
            java.util.List r1 = r8.A06
            X.1Xj r1 = X.DbZ.A0T(r1, r6)
            X.1Xj r4 = X.C54173H1t.A01(r1, r3)
            X.H3y r2 = r3.A02
            X.4n0 r1 = r2.A04
            r1.A04()
            java.util.Map r1 = r2.A07
            r1.clear()
            X.C54229H3y.A00(r2)
            X.H3y r1 = r3.A02
            X.3W1 r2 = r1.BQr(r4)
            X.1sy r1 = X.1sy.A0O
            r2.A0O(r1)
            X.H3y r3 = r3.A02
            java.util.List r2 = java.util.Collections.singletonList(r4)
            X.0qQ.A0B(r2, r6)
            X.4n0 r1 = r3.A04
            r1.A0A(r2)
            X.C54229H3y.A00(r3)
            r1 = -1236159618(0xffffffffb651b37e, float:-3.1247905E-6)
            X.AnonymousClass0fD.A0A(r1, r5)
            r1 = -301892551(0xffffffffee017c39, float:-1.0018436E28)
            goto L_0x0037
        L_0x0283:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0288:
            r0 = -1078820237(0xffffffffbfb28273, float:-1.394606)
            int r11 = X.AnonymousClass0fD.A03(r0)
            X.HE9 r8 = (X.HE9) r8
            r0 = 692419365(0x29457b25, float:4.3849598E-14)
            int r10 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r7 = r9.A01
            X.H15 r7 = (X.H15) r7
            r6 = 0
            r7.A0T = r6
            X.Dbx r0 = r7.A03
            X.34p r0 = r0.A00
            r0.A05()
            com.instagram.save.model.SavedCollection r0 = r8.A04
            r5 = 1
            if (r0 == 0) goto L_0x02dd
            r7.A0C = r0
            boolean r0 = X.H15.A0A(r7)
            if (r0 == 0) goto L_0x02b6
            X.H15.A06(r7)
        L_0x02b6:
            androidx.fragment.app.FragmentActivity r0 = r7.requireActivity()
            boolean r0 = r0 instanceof com.instagram.base.activity.BaseFragmentActivity
            if (r0 == 0) goto L_0x02c7
            androidx.fragment.app.FragmentActivity r0 = r7.requireActivity()
            com.instagram.base.activity.BaseFragmentActivity r0 = (com.instagram.base.activity.BaseFragmentActivity) r0
            r0.A0Z()
        L_0x02c7:
            X.H15.A04(r7)
            boolean r0 = r7.A0Q
            if (r0 != 0) goto L_0x02dd
            com.instagram.common.session.UserSession r3 = r7.A05
            java.lang.String r2 = r7.getModuleName()
            java.lang.String r1 = r7.A0M
            com.instagram.save.model.SavedCollection r0 = r7.A0C
            X.I34.A02(r3, r0, r2, r1)
            r7.A0Q = r5
        L_0x02dd:
            boolean r0 = X.H15.A0A(r7)
            if (r0 == 0) goto L_0x035b
            com.instagram.save.model.SavedCollection r2 = r7.A0C
            if (r2 == 0) goto L_0x0303
            X.1Xj r1 = r8.A01
            if (r1 == 0) goto L_0x0303
            android.content.Context r0 = r7.requireContext()
            int r0 = X.0nA.A09(r0)
            com.instagram.model.mediasize.ExtendedImageUrl r0 = r1.A1m(r0)
            r2.A02 = r0
            com.instagram.save.model.SavedCollection r1 = r7.A0C
            X.1Xj r0 = r8.A01
            java.lang.String r0 = r0.getId()
            r1.A0I = r0
        L_0x0303:
            com.instagram.save.model.SavedCollection r0 = r8.A04
            if (r0 == 0) goto L_0x046d
            java.lang.Integer r0 = r0.A0E
            int r0 = X.AnonymousClass7TG.A0A(r0)
        L_0x030d:
            r7.A00 = r0
            X.H15.A05(r7)
            java.util.List r0 = r8.A05
            int r0 = r0.size()
            if (r0 != r5) goto L_0x0469
            r7.A0N = r5
            X.H15.A05(r7)
        L_0x031f:
            r7.A0O = r5
            androidx.fragment.app.FragmentActivity r0 = r7.requireActivity()
            boolean r0 = r0 instanceof com.instagram.base.activity.BaseFragmentActivity
            if (r0 == 0) goto L_0x0332
            androidx.fragment.app.FragmentActivity r0 = r7.requireActivity()
            com.instagram.base.activity.BaseFragmentActivity r0 = (com.instagram.base.activity.BaseFragmentActivity) r0
            r0.A0Z()
        L_0x0332:
            X.H15.A07(r7)
            boolean r0 = r7.isResumed()
            if (r0 == 0) goto L_0x035b
            android.view.View r0 = r7.mView
            if (r0 == 0) goto L_0x035b
            com.instagram.common.session.UserSession r0 = r7.A05
            X.0xa r1 = X.AnonymousClass7TE.A0q(r0)
            r0 = 3231(0xc9f, float:4.528E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r1.getBoolean(r0, r6)
            if (r0 != 0) goto L_0x035b
            com.instagram.save.model.SavedCollection r0 = r7.A0C
            if (r0 == 0) goto L_0x0417
            com.instagram.api.schemas.CollectionPrivacyModeEnum r1 = r0.A00
            com.instagram.api.schemas.CollectionPrivacyModeEnum r0 = com.instagram.api.schemas.CollectionPrivacyModeEnum.PRIVATE
            if (r1 == r0) goto L_0x0417
        L_0x035b:
            com.instagram.common.session.UserSession r2 = r7.A05
            X.0qQ.A0B(r2, r6)
            java.lang.Class<X.IOj> r1 = X.C57095IOj.class
            X.Ish r0 = X.C58486Ish.A00
            java.lang.Object r2 = r2.A01(r1, r0)
            X.IOj r2 = (X.C57095IOj) r2
            java.util.List r0 = r8.A05
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x038e
            java.util.List r0 = r8.A05
            java.lang.Object r0 = r0.get(r6)
            X.Hj7 r0 = (X.C55525Hj7) r0
            X.HMV r1 = r0.A00
            X.HMV r0 = X.HMV.POSTS
            if (r1 != r0) goto L_0x038e
            X.HE8 r1 = r8.A03
            if (r1 == 0) goto L_0x04d1
            r2.A00 = r5
            java.util.LinkedList r0 = r2.A01
            r0.clear()
            r0.add(r1)
        L_0x038e:
            X.IaN r12 = r7.A0B
            java.util.List r1 = r8.A05
            android.content.Context r18 = r7.requireContext()
            java.util.ArrayList r13 = X.AnonymousClass7TE.A1C()
            if (r1 == 0) goto L_0x0470
            com.instagram.save.model.SavedCollection r0 = r7.A0C
            if (r0 == 0) goto L_0x0470
            java.util.Iterator r16 = r1.iterator()
            r15 = 0
        L_0x03a5:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x0470
            java.lang.Object r8 = r16.next()
            X.Hj7 r8 = (X.C55525Hj7) r8
            if (r8 == 0) goto L_0x03a5
            X.HMV r4 = r8.A00
            if (r4 == 0) goto L_0x03a5
            int r0 = r4.ordinal()
            if (r0 == r6) goto L_0x03e5
            if (r0 != r5) goto L_0x03d7
            com.instagram.common.session.UserSession r2 = r7.A05
            com.instagram.save.model.SavedCollection r1 = r7.A0C
            java.lang.String r0 = r7.A0M
            X.IXS r3 = new X.IXS
            r21 = r8
            r22 = r0
            r19 = r2
            r20 = r1
            r17 = r3
            r17.<init>(r18, r19, r20, r21, r22)
        L_0x03d4:
            r13.add(r3)
        L_0x03d7:
            X.IaN r0 = r7.A0B
            java.lang.Integer r1 = java.lang.Integer.valueOf(r15)
            java.util.HashMap r0 = r0.A04
            r0.put(r4, r1)
            int r15 = r15 + 1
            goto L_0x03a5
        L_0x03e5:
            com.instagram.common.session.UserSession r14 = r7.A05
            com.instagram.save.model.SavedCollection r2 = r7.A0C
            X.HMH r1 = r7.A0A
            java.lang.String r0 = r7.A0M
            boolean r3 = r2.A06()
            if (r3 == 0) goto L_0x0403
            boolean r3 = X.H15.A0A(r7)
            if (r3 == 0) goto L_0x0403
            com.instagram.common.session.UserSession r3 = r7.A05
            boolean r3 = X.I31.A02(r3)
            r24 = 1
            if (r3 != 0) goto L_0x0405
        L_0x0403:
            r24 = 0
        L_0x0405:
            X.IXT r3 = new X.IXT
            r21 = r2
            r22 = r8
            r23 = r0
            r19 = r14
            r20 = r1
            r17 = r3
            r17.<init>(r18, r19, r20, r21, r22, r23, r24)
            goto L_0x03d4
        L_0x0417:
            android.view.View r1 = r7.mView
            r0 = 2131443886(0x7f0b40ae, float:1.8509853E38)
            android.view.View r3 = r1.findViewById(r0)
            if (r3 == 0) goto L_0x035b
            r0 = 2131972630(0x7f135216, float:1.9582273E38)
            X.6jx r1 = new X.6jx
            r1.<init>((int) r0)
            android.app.Activity r0 = r7.getRootActivity()
            r0.getClass()
            X.5Gt r4 = new X.5Gt
            r4.<init>(r0, r1)
            android.content.Context r1 = r7.requireContext()
            r0 = 56
            int r2 = X.DbS.A02(r1, r0)
            android.content.Context r0 = r7.requireContext()
            r1 = 8
            int r0 = X.DbS.A02(r0, r1)
            r4.A04(r3, r2, r0, r5)
            r4.A01()
            r4.A0F = r5
            X.KSO r0 = new X.KSO
            r0.<init>(r7, r1)
            r4.A04 = r0
            android.os.Handler r3 = X.AnonymousClass7TF.A0D()
            X.Ift r2 = new X.Ift
            r2.<init>(r4)
            r0 = 450(0x1c2, double:2.223E-321)
            r3.postDelayed(r2, r0)
            goto L_0x035b
        L_0x0469:
            r7.A0N = r6
            goto L_0x031f
        L_0x046d:
            r0 = 0
            goto L_0x030d
        L_0x0470:
            X.Gg7 r1 = r12.A06
            android.util.SparseArray r0 = r1.A00
            r0.clear()
            java.util.List r0 = r1.A01
            r0.clear()
            r0.addAll(r13)
            r1.notifyDataSetChanged()
            X.C57417IaN.A00(r12)
            android.view.View r1 = r7.mView
            if (r1 == 0) goto L_0x0491
            X.Ifv r0 = new X.Ifv
            r0.<init>(r9)
            r1.post(r0)
        L_0x0491:
            X.HMw r1 = r7.A0E
            X.HMw r0 = X.C54665HMw.ALL_MEDIA_AUTO_COLLECTION
            if (r1 != r0) goto L_0x04a2
            X.IaN r0 = r7.A0B
            boolean r0 = r0.A03()
            if (r0 == 0) goto L_0x04a2
            X.Dbb.A0u(r7)
        L_0x04a2:
            X.HMV r1 = r7.A0D
            if (r1 == 0) goto L_0x04c4
            X.IaN r0 = r7.A0B
            if (r0 == 0) goto L_0x04c4
            java.util.HashMap r0 = r0.A04
            java.lang.Object r0 = r0.get(r1)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x04c4
            int r1 = r0.intValue()
            r0 = -1
            if (r1 == r0) goto L_0x04c4
            X.IaN r0 = r7.A0B
            androidx.viewpager.widget.ViewPager r0 = r0.A02
            if (r0 == 0) goto L_0x04c4
            r0.setCurrentItem(r1)
        L_0x04c4:
            r0 = 979509637(0x3a622185, float:8.6262106E-4)
            X.AnonymousClass0fD.A0A(r0, r10)
            r0 = 1196291203(0x474df483, float:52724.51)
            X.AnonymousClass0fD.A0A(r0, r11)
            return
        L_0x04d1:
            java.lang.String r0 = "Saved tabbed post response is null"
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C54378HAt.onSuccess(java.lang.Object):void");
    }

    public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
        int A03;
        int i;
        switch (this.A00) {
            case 0:
                A03 = AnonymousClass0fD.A03(749746100);
                AnonymousClass0fD.A0A(-1281154141, AnonymousClass0fD.A03(2107837666));
                i = 1541587334;
                break;
            case 1:
                A03 = AnonymousClass0fD.A03(1948228223);
                AnonymousClass0fD.A0A(-1206871333, AnonymousClass0fD.A03(642910786));
                i = -1508664460;
                break;
            case 2:
                A03 = AnonymousClass0fD.A03(1554218392);
                AnonymousClass0fD.A0A(-1995084574, AnonymousClass0fD.A03(-1529983582));
                i = -678069334;
                break;
            case 3:
                A03 = AnonymousClass0fD.A03(871345500);
                AnonymousClass0fD.A0A(46890423, AnonymousClass0fD.A03(-2004202826));
                i = -870330968;
                break;
            default:
                A03 = AnonymousClass0fD.A03(1554796287);
                AnonymousClass0fD.A0A(-2009221406, AnonymousClass0fD.A03(-660327147));
                i = -1688168231;
                break;
        }
        AnonymousClass0fD.A0A(i, A03);
    }
}
