package X;

import android.view.View;
import android.widget.TextView;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.737  reason: invalid class name */
public final class AnonymousClass737 implements View.OnClickListener {
    public final /* synthetic */ TextView A00;
    public final /* synthetic */ AnonymousClass0iw A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ 1Xj A03;
    public final /* synthetic */ AnonymousClass70J A04;
    public final /* synthetic */ AnonymousClass736 A05;
    public final /* synthetic */ User A06;
    public final /* synthetic */ List A07;
    public final /* synthetic */ boolean A08;
    public final /* synthetic */ boolean A09;
    public final /* synthetic */ boolean A0A;

    public AnonymousClass737(TextView textView, AnonymousClass0iw r2, UserSession userSession, 1Xj r4, AnonymousClass70J r5, AnonymousClass736 r6, User user, List list, boolean z, boolean z2, boolean z3) {
        this.A01 = r2;
        this.A09 = z;
        this.A04 = r5;
        this.A0A = z2;
        this.A06 = user;
        this.A08 = z3;
        this.A07 = list;
        this.A02 = userSession;
        this.A00 = textView;
        this.A03 = r4;
        this.A05 = r6;
    }

    /* JADX WARNING: type inference failed for: r2v6, types: [X.F2z, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0068, code lost:
        if (r18 != null) goto L_0x006a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x0189 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x01a9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r22) {
        /*
            r21 = this;
            r0 = -924601064(0xffffffffc8e3b518, float:-466344.75)
            int r20 = X.AnonymousClass0fD.A05(r0)
            r6 = r21
            X.0iw r4 = r6.A01
            boolean r0 = r6.A09
            java.lang.String r9 = "user_profile_header"
            if (r0 == 0) goto L_0x0027
            X.70J r0 = r6.A04
            if (r0 == 0) goto L_0x001e
            X.FgX r0 = r0.A02()
            if (r0 == 0) goto L_0x001e
            r0.A0F(r9, r4)
        L_0x001e:
            r1 = -1269494921(0xffffffffb4550b77, float:-1.9841342E-7)
            r0 = r20
            X.AnonymousClass0fD.A0C(r1, r0)
            return
        L_0x0027:
            boolean r0 = r6.A0A
            if (r0 == 0) goto L_0x003b
            X.70J r0 = r6.A04
            if (r0 == 0) goto L_0x001e
            X.FgX r1 = r0.A02()
            if (r1 == 0) goto L_0x001e
            com.instagram.user.model.User r0 = r6.A06
            r1.A09(r4, r0, r9)
            goto L_0x001e
        L_0x003b:
            boolean r0 = r6.A08
            if (r0 == 0) goto L_0x010b
            java.util.List r1 = r6.A07
            com.instagram.common.session.UserSession r10 = r6.A02
            android.widget.TextView r0 = r6.A00
            com.instagram.user.model.User r8 = r6.A06
            X.70J r7 = r6.A04
            X.1Xj r14 = r6.A03
            java.lang.String r6 = "profile"
            java.lang.Object r5 = X.00k.A0I(r1)
            X.3qn r5 = (X.C253443qn) r5
            android.content.Context r3 = r0.getContext()
            X.0qQ.A07(r3)
            java.lang.String r17 = X.C46427Deo.A00(r3, r5, r10)
            java.lang.String r18 = r5.BOm()
            r13 = r17
            if (r17 != 0) goto L_0x006a
            r13 = r18
            if (r18 == 0) goto L_0x001e
        L_0x006a:
            int r0 = r13.length()
            r19 = 1
            if (r0 <= 0) goto L_0x001e
            java.lang.String r0 = r8.getId()
            long r15 = java.lang.Long.parseLong(r0)
            boolean r0 = X.2R8.A04(r10, r8)
            if (r0 != 0) goto L_0x00af
            r2 = 0
            X.0Tu r11 = X.0Tu.A05
            r0 = 36323758193323469(0x810c4400052dcd, double:3.0346291732674826E-306)
            boolean r0 = X.182.A06(r11, r10, r0)
            if (r0 == 0) goto L_0x00af
            r0 = r3
            X.07Z r0 = (X.AnonymousClass07Z) r0
            X.07V r0 = r0.getLifecycle()
            java.lang.String r12 = r8.getId()
            X.0qQ.A0B(r0, r2)
            X.0xx r11 = X.C71772f0.A00(r0)
            r2 = 0
            r1 = 8
            X.9KX r0 = new X.9KX
            r0.<init>(r10, r12, r2, r1)
            X.19B r2 = X.19B.A00
            java.lang.Integer r1 = X.AnonymousClass05K.A00
            X.1Eo.A03(r1, r2, r0, r11)
        L_0x00af:
            X.0wc r2 = X.AnonymousClass0kN.A01(r4, r10)
            java.lang.String r1 = "instagram_link_clicks"
            X.0kJ r0 = r2.A00
            X.0Aj r1 = r2.A00(r0, r1)
            java.lang.Long r2 = java.lang.Long.valueOf(r15)
            java.lang.String r0 = "authorid"
            r1.A9F(r0, r2)
            java.lang.String r0 = "link_address"
            r1.AAJ(r0, r13)
            java.lang.String r0 = "link_type"
            r1.AAJ(r0, r6)
            r1.Cgf()
            X.F2z r2 = new X.F2z
            r2.<init>()
            java.lang.Integer r1 = X.AnonymousClass05K.A0N
            boolean r0 = r2.A01(r10, r8, r1)
            if (r0 == 0) goto L_0x00e7
            r4 = r10
            r5 = r8
            r6 = r1
            r7 = r13
            r2.A00(r3, r4, r5, r6, r7)
            goto L_0x001e
        L_0x00e7:
            if (r7 == 0) goto L_0x001e
            X.FgX r13 = r7.A02()
            if (r13 == 0) goto L_0x001e
            java.lang.String r0 = ""
            if (r17 != 0) goto L_0x00f5
            r17 = r0
        L_0x00f5:
            if (r18 != 0) goto L_0x00f9
            r18 = r0
        L_0x00f9:
            java.lang.Boolean r0 = r5.BYO()
            if (r0 == 0) goto L_0x0103
            boolean r19 = r0.booleanValue()
        L_0x0103:
            r15 = r8
            r16 = r9
            r13.A0D(r14, r15, r16, r17, r18, r19)
            goto L_0x001e
        L_0x010b:
            java.util.List r9 = r6.A07
            int r0 = r9.size()
            r5 = 1
            if (r0 <= r5) goto L_0x001e
            boolean r0 = r9.isEmpty()
            if (r0 == 0) goto L_0x01ba
            r3 = 0
        L_0x011b:
            com.instagram.user.model.User r12 = r6.A06
            X.4Cl r0 = r12.A03
            java.lang.Boolean r0 = r0.CS7()
            if (r0 == 0) goto L_0x032a
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x032a
            com.instagram.common.session.UserSession r7 = r6.A02
            X.0Tu r2 = X.0Tu.A05
            r0 = 36322821890451921(0x810b6a000529d1, double:3.0340370515613266E-306)
            boolean r0 = X.182.A06(r2, r7, r0)
            if (r0 == 0) goto L_0x032a
            X.70J r0 = r6.A04
            if (r0 == 0) goto L_0x001e
            X.FgX r2 = r0.A02()
            if (r2 == 0) goto L_0x001e
            X.1Xj r11 = r6.A03
            r10 = 0
            X.4Cl r0 = r12.A03
            java.lang.String r13 = r0.getFbidV2()
            if (r13 == 0) goto L_0x001e
            com.instagram.common.session.UserSession r1 = r2.A02
            X.3rB r19 = X.FRP.A00(r1, r12)
            com.instagram.profile.fragment.UserDetailFragment r0 = r2.A04
            android.content.Context r18 = r0.requireContext()
            r8 = 0
            java.util.HashMap r9 = new java.util.HashMap
            r9.<init>()
            java.util.HashMap r7 = new java.util.HashMap
            r7.<init>()
            java.util.HashMap r17 = new java.util.HashMap
            r17.<init>()
            java.util.BitSet r6 = new java.util.BitSet
            r6.<init>(r5)
            java.lang.String r0 = "bio_id"
            r9.put(r0, r13)
            r6.set(r10)
            X.4Cl r0 = r12.A03
            java.util.List r0 = r0.Afp()
            if (r0 == 0) goto L_0x021b
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            java.util.Iterator r16 = r0.iterator()
        L_0x0189:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x021d
            java.lang.Object r14 = r16.next()
            X.3qn r14 = (X.C253443qn) r14
            com.instagram.api.schemas.IgUserBioLinkTypeEnum r15 = r14.BMt()
            com.instagram.api.schemas.IgUserBioLinkTypeEnum r0 = com.instagram.api.schemas.IgUserBioLinkTypeEnum.FACEBOOK
            if (r15 != r0) goto L_0x01ad
            boolean r0 = X.C3250170s.A00(r14, r1, r12)
        L_0x01a1:
            if (r0 == 0) goto L_0x0189
        L_0x01a3:
            java.lang.String r0 = r14.BMn()
            if (r0 == 0) goto L_0x0189
            r13.add(r0)
            goto L_0x0189
        L_0x01ad:
            com.instagram.api.schemas.IgUserBioLinkTypeEnum r15 = r14.BMt()
            com.instagram.api.schemas.IgUserBioLinkTypeEnum r0 = com.instagram.api.schemas.IgUserBioLinkTypeEnum.FACEBOOK_PAGE
            if (r15 != r0) goto L_0x01a3
            boolean r0 = X.C46427Deo.A02(r1, r12)
            goto L_0x01a1
        L_0x01ba:
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            r3.<init>()
            java.util.Iterator r12 = r9.iterator()
            r11 = 0
            r10 = 0
        L_0x01c5:
            boolean r0 = r12.hasNext()
            java.lang.String r8 = "1"
            if (r0 == 0) goto L_0x01fa
            java.lang.Object r7 = r12.next()
            X.3qn r7 = (X.C253443qn) r7
            java.lang.String r2 = "has_"
            com.instagram.api.schemas.IgUserBioLinkTypeEnum r0 = r7.BMt()
            java.lang.String r1 = r0.A00
            java.lang.String r0 = "_link"
            java.lang.String r0 = X.002.A0g(r2, r1, r0)
            r3.put(r0, r8)
            boolean r0 = r7.CZA()
            if (r0 != r5) goto L_0x01eb
            r11 = 1
        L_0x01eb:
            java.lang.String r0 = r7.BGL()
            if (r0 == 0) goto L_0x01c5
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x01c5
            int r10 = r10 + 1
            goto L_0x01c5
        L_0x01fa:
            int r0 = r9.size()
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "num_of_link"
            r3.put(r0, r1)
            if (r11 != 0) goto L_0x020b
            java.lang.String r8 = "0"
        L_0x020b:
            java.lang.String r0 = "has_pinned_link"
            r3.put(r0, r8)
            java.lang.String r1 = java.lang.String.valueOf(r10)
            java.lang.String r0 = "num_of_images"
            r3.put(r0, r1)
            goto L_0x011b
        L_0x021b:
            X.0sn r13 = X.0sn.A00
        L_0x021d:
            boolean r0 = r13.isEmpty()
            if (r0 != 0) goto L_0x0228
            java.lang.String r0 = "link_ids"
            r9.put(r0, r13)
        L_0x0228:
            java.lang.String r14 = "name"
            if (r19 == 0) goto L_0x028a
            X.4EU r12 = r19.BMz()
            if (r12 == 0) goto L_0x0259
            java.lang.String r0 = r12.getName()
            X.0eP r15 = new X.0eP
            r15.<init>(r14, r0)
            java.lang.String r13 = r12.BhK()
            java.lang.String r12 = "url"
            X.0eP r0 = new X.0eP
            r0.<init>(r12, r13)
            X.0eP[] r0 = new X.0eP[]{r15, r0}
            java.util.LinkedHashMap r12 = X.0Yt.A06(r0)
            boolean r0 = r12.isEmpty()
            if (r0 != 0) goto L_0x0259
            java.lang.String r0 = "linked_fb_profile"
            r9.put(r0, r12)
        L_0x0259:
            X.5Bm r15 = r19.BMy()
            if (r15 == 0) goto L_0x028a
            java.lang.String r12 = r15.getId()
            java.lang.String r0 = "id"
            X.0eP r13 = new X.0eP
            r13.<init>(r0, r12)
            java.lang.String r12 = r15.getName()
            X.0eP r0 = new X.0eP
            r0.<init>(r14, r12)
            X.0eP[] r0 = new X.0eP[]{r13, r0}
            java.util.LinkedHashMap r12 = X.0Yt.A06(r0)
            boolean r0 = r12.isEmpty()
            if (r0 != 0) goto L_0x028a
            r0 = 3506(0xdb2, float:4.913E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r9.put(r0, r12)
        L_0x028a:
            java.lang.String r13 = "media_id_attribution"
            java.lang.String r12 = ""
            if (r11 == 0) goto L_0x031b
            boolean r0 = r11.CcK()
            if (r0 == 0) goto L_0x031b
            boolean r0 = X.C231122qu.A0S(r1, r11)
            if (r0 != 0) goto L_0x031b
            java.lang.String r0 = r2.A08
            if (r0 != 0) goto L_0x02a1
            r0 = r12
        L_0x02a1:
            X.0eP r14 = new X.0eP
            r14.<init>(r13, r0)
            java.lang.String r15 = X.C231122qu.A0F(r1, r11)
            if (r15 != 0) goto L_0x02ad
            r15 = r12
        L_0x02ad:
            java.lang.String r0 = "tracking_token"
            X.0eP r13 = new X.0eP
            r13.<init>(r0, r15)
            java.lang.String r0 = r11.getId()
            if (r0 == 0) goto L_0x02bb
            r12 = r0
        L_0x02bb:
            java.lang.String r11 = "media_id"
            X.0eP r0 = new X.0eP
            r0.<init>(r11, r12)
            X.0eP[] r0 = new X.0eP[]{r14, r13, r0}
            java.util.LinkedHashMap r11 = X.0Yt.A06(r0)
        L_0x02ca:
            boolean r0 = r11.isEmpty()
            if (r0 != 0) goto L_0x02d5
            java.lang.String r0 = "client_logging_data"
            r9.put(r0, r11)
        L_0x02d5:
            com.instagram.bloks.hosting.IgBloksScreenConfig r11 = new com.instagram.bloks.hosting.IgBloksScreenConfig
            r11.<init>((X.0lg) r1)
            int r0 = r6.nextClearBit(r10)
            if (r0 < r5) goto L_0x0354
            java.util.HashMap r6 = X.C359608dC.A01(r9)
            java.lang.String r0 = "com.bloks.www.nme.ig_bio.enhanced_link_sheet"
            X.DiU r9 = X.C46649DiU.A06(r0, r6, r7)
            r0 = 719983200(0x2aea1260, float:4.15795E-13)
            r9.A00 = r0
            r9.A05 = r8
            r6 = 0
            r9.A01 = r6
            r9.A06 = r8
            r9.A03 = r8
            r9.A02 = r8
            r9.A04 = r8
            r0 = r17
            r9.A0H(r0)
            r0 = r18
            r9.A0E(r0, r11)
            X.736 r6 = X.AnonymousClass736.A00
            X.Dc6 r0 = r2.A07
            java.lang.String r10 = r0.A03()
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r5)
            r7 = r4
            r8 = r1
            r11 = r3
            r6.A0D(r7, r8, r9, r10, r11)
            goto L_0x001e
        L_0x031b:
            java.lang.String r0 = r2.A08
            if (r0 == 0) goto L_0x0320
            r12 = r0
        L_0x0320:
            X.0eP r0 = new X.0eP
            r0.<init>(r13, r12)
            java.util.Map r11 = X.0se.A0M(r0)
            goto L_0x02ca
        L_0x032a:
            com.instagram.common.session.UserSession r5 = r6.A02
            java.lang.String r0 = r12.getId()
            X.AnonymousClass736.A06(r4, r5, r0)
            X.70J r0 = r6.A04
            if (r0 == 0) goto L_0x001e
            X.FgX r7 = r0.A02()
            if (r7 == 0) goto L_0x001e
            X.EVo r10 = X.C48096EVo.Links
            X.0Tu r2 = X.0Tu.A05
            r0 = 36316796051198603(0x8105ef0003128b, double:3.030226286553421E-306)
            boolean r12 = X.182.A06(r2, r5, r0)
            X.1Xj r0 = r6.A03
            r8 = r4
            r9 = r0
            r11 = r3
            r7.A08(r8, r9, r10, r11, r12)
            goto L_0x001e
        L_0x0354:
            r0 = 457(0x1c9, float:6.4E-43)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass737.onClick(android.view.View):void");
    }
}
