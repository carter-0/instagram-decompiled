package X;

import android.os.Bundle;
import com.instagram.common.session.UserSession;
import java.util.AbstractCollection;

/* renamed from: X.UsH  reason: case insensitive filesystem */
public final class C16297UsH extends C47518E6c {
    public static final String __redex_internal_original_name = "UpsellsBottomSheetFragment";
    public W1B A00;
    public final AnonymousClass0eM A01 = C227642jf.A02(this);
    public final 1Xj A02;
    public final AnonymousClass4DU A03;
    public final AnonymousClass3W1 A04;
    public final C54660HMr A05;
    public final String A06;

    public final String getModuleName() {
        return "upsells_bottomsheet_fragment";
    }

    public final boolean isElevated() {
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00f6, code lost:
        if (r2 != 5) goto L_0x00f8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01d1, code lost:
        if (r0 != 4) goto L_0x00f8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01e7, code lost:
        r1 = r4.A04;
        r0 = 2131973404;
     */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0168  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r16, android.os.Bundle r17) {
        /*
            r15 = this;
            r7 = 0
            r1 = r16
            X.0qQ.A0B(r1, r7)
            r0 = r17
            super.onViewCreated(r1, r0)
            X.0eM r0 = r15.A01
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.Hs7 r3 = new X.Hs7
            r3.<init>(r15, r0)
            java.lang.String r2 = r15.A06
            X.HMr r0 = r15.A05
            java.lang.String r1 = r0.A00
            java.lang.String r0 = "upsell_bottom_sheet"
            r3.A01(r0, r2, r1)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            X.W1B r4 = r15.A00
            if (r4 != 0) goto L_0x0034
            java.lang.String r0 = "upsellsBottomSheetOptionsController"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0034:
            X.HMr r6 = r4.A05
            X.HMr r0 = X.C54660HMr.BC_COMMENTS_CONTROLS
            if (r6 != r0) goto L_0x008f
            X.1Xj r7 = r4.A01
            if (r7 == 0) goto L_0x008b
            java.util.List r0 = r7.A0U
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x008b
            X.4DU r6 = r4.A02
            if (r6 == 0) goto L_0x008b
            com.instagram.common.session.UserSession r3 = r4.A00
            X.0Tu r2 = X.0Tu.A06
            r0 = 36312148896383926(0x8101b5000003b6, double:3.027287407136029E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x008b
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            java.lang.String r1 = r7.getId()
            java.lang.String r0 = "media_id"
            r3.putString(r0, r1)
            boolean r1 = r6.isOrganicEligible()
            java.lang.String r0 = "insightHost_is_Organic_Eligible"
            r3.putBoolean(r0, r1)
            boolean r1 = r6.isSponsoredEligible()
            java.lang.String r0 = "insightHost_is_Sponsored_Eligible"
            r3.putBoolean(r0, r1)
            r2 = 2131976122(0x7f135fba, float:1.9589356E38)
            r0 = 41
            X.WBE r1 = new X.WBE
            r1.<init>((int) r0, (java.lang.Object) r3, (java.lang.Object) r4)
        L_0x0083:
            X.Oak r0 = new X.Oak
            r0.<init>(r1, r2)
            r5.add(r0)
        L_0x008b:
            r15.setBottomSheetMenuItems(r5)
            return
        L_0x008f:
            r1 = 2131976119(0x7f135fb7, float:1.958935E38)
            X.DfA r0 = new X.DfA
            r0.<init>((int) r1)
            r5.add(r0)
            X.1Xj r3 = r4.A01
            if (r3 == 0) goto L_0x00bb
            com.instagram.common.session.UserSession r8 = r4.A00
            com.instagram.user.model.User r1 = r3.A2A(r8)
            com.instagram.user.model.User r0 = X.DbT.A0j(r8)
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x01f2
            X.0Tu r2 = X.0Tu.A05
            r0 = 36319042319031162(0x8107fa00021b7a, double:3.031646835375726E-306)
            boolean r0 = X.182.A06(r2, r8, r0)
            if (r0 != 0) goto L_0x01f2
        L_0x00bb:
            com.instagram.common.session.UserSession r8 = r4.A00
            X.0eE r13 = X.AnonymousClass0t1.A01
            com.instagram.user.model.User r0 = r13.A01(r8)
            boolean r0 = X.2R8.A06(r0)
            if (r0 == 0) goto L_0x0123
            X.0Tu r2 = X.0Tu.A05
            r0 = 36324020186001074(0x810c8100002eb2, double:3.03479485849176E-306)
            boolean r0 = X.182.A06(r2, r8, r0)
            if (r0 == 0) goto L_0x0123
            if (r3 == 0) goto L_0x0123
            java.lang.String r12 = r3.A2n()
            if (r12 == 0) goto L_0x0123
            X.1Xy r0 = r3.A0C
            com.instagram.api.schemas.MediaCommentAudienceControlType r11 = r0.BQV()
            r14 = 0
            r0 = 5
            r10 = 4
            r9 = 3
            r2 = 2
            r1 = 1
            if (r11 == 0) goto L_0x01bb
            int r2 = r11.ordinal()
            if (r2 == r1) goto L_0x01e1
            if (r2 == r10) goto L_0x01db
            if (r2 == r9) goto L_0x01d5
            if (r2 == r0) goto L_0x01e7
        L_0x00f8:
            java.util.HashMap r9 = new java.util.HashMap
            r9.<init>()
            java.lang.String r0 = "media_id"
            r9.put(r0, r12)
            if (r11 == 0) goto L_0x010b
            java.lang.String r1 = r11.A00
            java.lang.String r0 = "current_media_level_setting"
            r9.put(r0, r1)
        L_0x010b:
            X.E6c r1 = r4.A04
            r0 = 2131976114(0x7f135fb2, float:1.958934E38)
            java.lang.String r2 = X.DbU.A0m(r1, r0)
            r0 = 40
            X.WBE r1 = new X.WBE
            r1.<init>((int) r0, (java.lang.Object) r9, (java.lang.Object) r4)
            X.Oak r0 = new X.Oak
            r0.<init>((android.view.View.OnClickListener) r1, (java.lang.CharSequence) r2, (java.lang.String) r14, (boolean) r7)
            r5.add(r0)
        L_0x0123:
            X.HMr r0 = X.C54660HMr.COMMENT_OFF
            if (r6 != r0) goto L_0x017c
            if (r3 == 0) goto L_0x013c
            X.E6c r0 = r4.A04
            android.content.Context r6 = r0.requireContext()
            r3 = 2131976126(0x7f135fbe, float:1.9589364E38)
            r1 = 57
        L_0x0134:
            X.WB0 r0 = new X.WB0
            r0.<init>(r4, r1)
            X.C50989Fmc.A02(r6, r0, r5, r3)
        L_0x013c:
            r0 = 1
            X.DbV.A1W(r5, r0)
            r1 = 2131976118(0x7f135fb6, float:1.9589347E38)
            X.DfA r0 = new X.DfA
            r0.<init>((int) r1)
            r5.add(r0)
            r1 = 2131976120(0x7f135fb8, float:1.9589352E38)
            r0 = 53
            A06(r4, r5, r0, r1)
            r1 = 2131976117(0x7f135fb5, float:1.9589345E38)
            r0 = 52
            A06(r4, r5, r0, r1)
            X.0Tu r2 = X.0Tu.A05
            r0 = 36324020186001074(0x810c8100002eb2, double:3.03479485849176E-306)
            boolean r0 = X.182.A06(r2, r8, r0)
            if (r0 != 0) goto L_0x0170
            r1 = 2131976114(0x7f135fb2, float:1.958934E38)
            r0 = 58
            A06(r4, r5, r0, r1)
        L_0x0170:
            r2 = 2131976123(0x7f135fbb, float:1.9589358E38)
            r0 = 59
            X.WB0 r1 = new X.WB0
            r1.<init>(r4, r0)
            goto L_0x0083
        L_0x017c:
            if (r3 == 0) goto L_0x013c
            java.util.List r0 = r3.A0U
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x019f
            X.4DU r0 = r4.A02
            if (r0 == 0) goto L_0x019f
            X.0Tu r2 = X.0Tu.A06
            r0 = 36312148896383926(0x8101b5000003b6, double:3.027287407136029E-306)
            boolean r0 = X.182.A06(r2, r8, r0)
            if (r0 == 0) goto L_0x019f
            r1 = 2131976121(0x7f135fb9, float:1.9589354E38)
            r0 = 54
            A06(r4, r5, r0, r1)
        L_0x019f:
            X.3W1 r0 = r4.A03
            if (r0 == 0) goto L_0x013c
            boolean r2 = r3.A4c()
            X.E6c r0 = r4.A04
            android.content.Context r6 = r0.requireContext()
            r3 = 2131976125(0x7f135fbd, float:1.9589362E38)
            r1 = 56
            if (r2 == 0) goto L_0x0134
            r3 = 2131976126(0x7f135fbe, float:1.9589364E38)
            r1 = 55
            goto L_0x0134
        L_0x01bb:
            com.instagram.user.model.User r0 = r13.A01(r8)
            X.4Cl r0 = r0.A03
            com.instagram.api.schemas.CommentAudienceControlType r0 = r0.AbB()
            if (r0 == 0) goto L_0x00f8
            int r0 = r0.ordinal()
            if (r0 == r1) goto L_0x01e1
            if (r0 == r9) goto L_0x01db
            if (r0 == r2) goto L_0x01d5
            if (r0 == r10) goto L_0x01e7
            goto L_0x00f8
        L_0x01d5:
            X.E6c r1 = r4.A04
            r0 = 2131973402(0x7f13551a, float:1.9583839E38)
            goto L_0x01ec
        L_0x01db:
            X.E6c r1 = r4.A04
            r0 = 2131973403(0x7f13551b, float:1.958384E38)
            goto L_0x01ec
        L_0x01e1:
            X.E6c r1 = r4.A04
            r0 = 2131973401(0x7f135519, float:1.9583837E38)
            goto L_0x01ec
        L_0x01e7:
            X.E6c r1 = r4.A04
            r0 = 2131973404(0x7f13551c, float:1.9583843E38)
        L_0x01ec:
            java.lang.String r14 = r1.getString(r0)
            goto L_0x00f8
        L_0x01f2:
            X.E6c r0 = r4.A04
            android.content.Context r8 = r0.requireContext()
            r2 = 2131976115(0x7f135fb3, float:1.9589341E38)
            r1 = 51
            X.WB0 r0 = new X.WB0
            r0.<init>(r4, r1)
            X.C50989Fmc.A02(r8, r0, r5, r2)
            goto L_0x00bb
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16297UsH.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public static void A06(Object obj, AbstractCollection abstractCollection, int i, int i2) {
        abstractCollection.add(new C71065Oak(new WB0(obj, i), i2));
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A01);
    }

    public C16297UsH(1Xj r2, AnonymousClass4DU r3, AnonymousClass3W1 r4, C54660HMr hMr, String str) {
        this.A05 = hMr;
        this.A06 = str;
        this.A02 = r2;
        this.A04 = r4;
        this.A03 = r3;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(245804643);
        super.onCreate(bundle);
        UserSession A0l = AnonymousClass7TE.A0l(this.A01);
        String str = this.A06;
        C54660HMr hMr = this.A05;
        1Xj r4 = this.A02;
        AnonymousClass3W1 r6 = this.A04;
        this.A00 = new W1B(A0l, r4, this.A03, r6, this, hMr, str);
        AnonymousClass0fD.A09(1595959267, A022);
    }
}
