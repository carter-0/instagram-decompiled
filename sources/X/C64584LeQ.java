package X;

import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;

/* renamed from: X.LeQ  reason: case insensitive filesystem */
public final class C64584LeQ implements AnonymousClass0iw {
    public static boolean A06 = false;
    public static final String __redex_internal_original_name = "TagProductsRowNavigator";
    public final Fragment A00;
    public final UserSession A01;
    public final C3499682q A02;
    public final KO3 A03;
    public final LP7 A04;
    public final String A05;

    public C64584LeQ(Fragment fragment, UserSession userSession, C3499682q r4, KO3 ko3, LP7 lp7, String str) {
        DbW.A1N(userSession, 2, str);
        this.A03 = ko3;
        this.A01 = userSession;
        this.A02 = r4;
        this.A04 = lp7;
        this.A05 = str;
        this.A00 = fragment;
    }

    public final String getModuleName() {
        return "media_broadcast_share";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0055, code lost:
        if (r4.CKP() != false) goto L_0x0057;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0149, code lost:
        if (X.LRu.A02(r8, r4, r5.A00, r10.A04) != false) goto L_0x0063;
     */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0137 A[LOOP:0: B:29:0x0131->B:31:0x0137, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x015d  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0193  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(java.lang.String r20, java.lang.String r21, java.util.ArrayList r22, java.util.List r23, boolean r24) {
        /*
            r19 = this;
            boolean r9 = X.DbW.A1Y(r23)
            r10 = r19
            com.instagram.common.session.UserSession r8 = r10.A01
            boolean r0 = X.C367088qA.A01(r8)
            if (r0 != 0) goto L_0x003d
            X.KO3 r0 = r10.A03
            X.3Q2 r0 = r0.A04()
            java.util.ArrayList r0 = r0.A41
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x003d
            X.82q r0 = r10.A02
            boolean r0 = X.LTZ.A0I(r8, r0, r9)
            if (r0 != 0) goto L_0x003d
            A06 = r9
            X.0eE r0 = X.AnonymousClass0t1.A01
            r0.A01(r8)
            java.lang.String r2 = "media_broadcast_share"
            androidx.fragment.app.Fragment r0 = r10.A00
            androidx.fragment.app.FragmentActivity r1 = r0.requireActivity()
            r0 = 1237(0x4d5, float:1.733E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.C324476zN.A0P(r1, r8, r2, r0, r9)
            return
        L_0x003d:
            X.KO3 r5 = r10.A03
            X.3Q2 r0 = r5.A04()
            X.1iA r1 = r0.A1G
            X.1iA r0 = X.1iA.A0Q
            if (r1 == r0) goto L_0x0057
            X.82q r4 = r10.A02
            boolean r0 = r4.COf()
            if (r0 == 0) goto L_0x00f8
            boolean r0 = r4.CKP()
            if (r0 == 0) goto L_0x00f8
        L_0x0057:
            boolean r0 = X.AnonymousClass431.A00(r8)
            if (r0 == 0) goto L_0x013f
            boolean r0 = X.VH4.A00(r8)
            if (r0 == 0) goto L_0x013f
        L_0x0063:
            java.lang.String r15 = r10.A05
            X.82q r4 = r10.A02
            boolean r18 = r4.COf()
            X.3Q2 r0 = r5.A04()
            java.util.ArrayList r2 = r0.A43
            if (r2 != 0) goto L_0x0077
            java.util.ArrayList r2 = X.AnonymousClass7TE.A1C()
        L_0x0077:
            X.LBk r0 = X.C64832Lit.A04
            X.Lit r0 = r0.A00(r8)
            X.Jqt r13 = r0.A00(r15, r15)
            X.3Q2 r1 = r5.A00
            X.LP7 r0 = r10.A04
            boolean r0 = X.LRu.A02(r8, r4, r1, r0)
            if (r0 == 0) goto L_0x013b
            java.lang.String r14 = "opt"
        L_0x008d:
            java.lang.String r12 = "feed"
            java.util.HashMap r3 = X.LTQ.A03(r2)
            java.lang.String r0 = "high_confidence_count"
            java.lang.Number r0 = X.JTO.A0z(r0, r3)
            r6 = 0
            long r16 = X.JTU.A05(r0)
            java.lang.String r0 = "medium_confidence_count"
            java.lang.Number r0 = X.JTO.A0z(r0, r3)
            long r1 = X.JTU.A05(r0)
            java.lang.String r0 = "low_confidence_count"
            java.lang.Number r0 = X.JTO.A0z(r0, r3)
            if (r0 == 0) goto L_0x00b6
            int r0 = r0.intValue()
            long r6 = (long) r0
        L_0x00b6:
            X.0wc r3 = X.AnonymousClass0kN.A01(r10, r8)
            java.lang.String r0 = "ig_suggested_tags_open_tagging"
            X.0Aj r11 = X.AnonymousClass7TE.A0e(r3, r0)
            java.lang.String r3 = r8.A06
            X.LTQ.A06(r11, r3, r15)
            java.lang.String r0 = X.AnonymousClass9PN.A01()
            r11.AAJ(r0, r15)
            java.lang.Long r3 = X.AnonymousClass7TE.A10(r3)
            java.lang.String r0 = "ig_user_id"
            r11.A9F(r0, r3)
            java.lang.String r0 = "user_tag_type"
            r11.AAJ(r0, r14)
            r0 = r18
            X.JTQ.A17(r11, r0)
            java.lang.Long r3 = java.lang.Long.valueOf(r16)
            java.lang.String r0 = "high_confidence_suggestions_count"
            r11.A9F(r0, r3)
            X.JTU.A0w(r11, r1, r6)
            java.lang.String r0 = "suggested_tags_info"
            r11.AAK(r13, r0)
            java.lang.String r0 = "media_format"
            r11.AAJ(r0, r12)
            r11.Cgf()
        L_0x00f8:
            X.2cc r1 = X.C71342cb.A00(r8)
            androidx.fragment.app.Fragment r3 = r10.A00
            androidx.fragment.app.FragmentActivity r0 = r3.requireActivity()
            r1.A06(r0)
            android.content.Context r1 = r3.requireContext()
            X.Kj1 r0 = X.C62630Kj1.PRODUCT
            X.LRj r6 = new X.LRj
            r6.<init>(r1, r0)
            r0 = r21
            r6.A05 = r0
            r6.A03(r8)
            java.lang.Boolean r0 = X.AnonymousClass7TE.A0u()
            r6.A02 = r0
            r6.A0H = r9
            X.3Q2 r1 = r5.A00
            X.LP7 r0 = r10.A04
            boolean r0 = X.LRu.A03(r8, r4, r1, r0)
            r6.A0J = r0
            java.util.ArrayList r2 = X.AnonymousClass7TG.A0r(r23)
            java.util.Iterator r1 = r23.iterator()
        L_0x0131:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x014d
            X.DbY.A1W(r2, r1)
            goto L_0x0131
        L_0x013b:
            java.lang.String r14 = "seller"
            goto L_0x008d
        L_0x013f:
            X.82q r4 = r10.A02
            X.3Q2 r1 = r5.A00
            X.LP7 r0 = r10.A04
            boolean r0 = X.LRu.A02(r8, r4, r1, r0)
            if (r0 == 0) goto L_0x00f8
            goto L_0x0063
        L_0x014d:
            java.util.ArrayList r0 = X.AnonymousClass7TE.A1D(r2)
            r6.A07 = r0
            r0 = r22
            r6.A08 = r0
            boolean r0 = r4.COf()
            if (r0 == 0) goto L_0x0193
            java.util.ArrayList r8 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r7 = X.JTP.A0w(r4)
        L_0x0165:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x018b
            com.instagram.creation.base.MediaSession r0 = X.JTO.A0Z(r7)
            java.lang.String r2 = r0.BbR()
            X.4cI r1 = r5.A03
            X.3Q2 r0 = r1.BbQ(r2)
            if (r0 == 0) goto L_0x0181
            com.instagram.shopping.model.taggingfeed.ProductCollectionFeedTaggingMeta r0 = r0.A1o
            if (r0 == 0) goto L_0x0181
            r6.A00 = r0
        L_0x0181:
            X.3Q2 r0 = r1.BbQ(r2)
            if (r0 == 0) goto L_0x0165
            r8.add(r0)
            goto L_0x0165
        L_0x018b:
            r6.A05(r4, r8)
            r0 = r20
            r6.A03 = r0
            goto L_0x01a6
        L_0x0193:
            X.3Q2 r0 = r5.A04()
            com.instagram.shopping.model.taggingfeed.ProductCollectionFeedTaggingMeta r0 = r0.A1o
            r6.A00 = r0
            X.3Q2 r0 = r5.A04()
            r6.A04(r4, r0)
            r0 = r24
            r6.A0A = r0
        L_0x01a6:
            android.content.Intent r1 = r6.A02()
            r0 = 1001(0x3e9, float:1.403E-42)
            X.0kR.A05(r3, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64584LeQ.A00(java.lang.String, java.lang.String, java.util.ArrayList, java.util.List, boolean):void");
    }
}
