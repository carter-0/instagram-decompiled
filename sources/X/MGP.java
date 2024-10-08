package X;

import com.facebook.proxygen.TraceFieldType;

public final class MGP extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public int A01;
    public Object A02;
    public boolean A03;
    public final int A04 = 1;
    public final Object A05;
    public final String A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MGP(KXg kXg, String str, AnonymousClass4D7 r4) {
        super(2, r4);
        this.A05 = kXg;
        this.A06 = str;
    }

    public static void A00(0Aj r4, String str, boolean z) {
        r4.AAJ(TraceFieldType.AdhocEventName, str);
        0bb r2 = new 0bb();
        r2.A03("from_search", Boolean.valueOf(z));
        r2.A03("from_select_all", false);
        r2.A03("from_profile", false);
        r4.AAK(r2, "event_data");
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.4D7, X.MGP] */
    /* JADX WARNING: type inference failed for: r2v1, types: [X.4D7, X.MGP] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r11) {
        AnonymousClass4D7 r6 = r11;
        if (this.A04 == 0) {
            return new MGP((KXg) this.A05, this.A06, r11);
        }
        String str = this.A06;
        int i = this.A00;
        return new MGP((C61076JwE) this.A02, (C52968GgL) this.A05, str, r6, i, this.A03);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.4D7, X.MGP] */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0196, code lost:
        if (r5 == r11) goto L_0x0198;
     */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x02e7  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x012a  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x012e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            r19 = this;
            r2 = r19
            r5 = r20
            int r0 = r2.A04
            if (r0 == 0) goto L_0x005f
            X.1Hj r11 = X.1Hj.A02
            int r0 = r2.A01
            r6 = 1
            if (r0 == 0) goto L_0x0150
            if (r0 != r6) goto L_0x01e4
            X.0eS.A00(r5)
        L_0x0014:
            X.3Ii r5 = (X.C239803Ii) r5
            java.lang.Object r3 = r2.A05
            X.GgL r3 = (X.C52968GgL) r3
            boolean r0 = r5 instanceof X.C239793Ih
            if (r0 != 0) goto L_0x002f
            boolean r0 = r5 instanceof X.C297815sO
            if (r0 == 0) goto L_0x01df
            X.5sO r5 = (X.C297815sO) r5
            java.lang.Object r0 = r5.A00
            X.Hir r0 = (X.C55509Hir) r0
            X.C52968GgL.A02(r3, r0)
            X.5sO r5 = X.DbU.A0f()
        L_0x002f:
            boolean r6 = r2.A03
            boolean r0 = r5 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x01d6
            X.3Ih r5 = (X.C239793Ih) r5
            java.lang.Object r0 = r5.A00
            X.JwG r0 = (X.C61078JwG) r0
            java.lang.Object r0 = r0.A00
            java.util.List r0 = (java.util.List) r0
            java.util.ArrayList r5 = X.AnonymousClass7TG.A0r(r0)
            java.util.Iterator r4 = r0.iterator()
        L_0x0047:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0199
            java.lang.Object r2 = r4.next()
            X.Gn6 r2 = (X.C53376Gn6) r2
            X.HpS r1 = X.I12.A07
            com.instagram.api.schemas.CameraTool r0 = com.instagram.api.schemas.CameraTool.RESTYLE
            X.I12 r0 = r1.A00(r2, r0)
            r5.add(r0)
            goto L_0x0047
        L_0x005f:
            X.1Hj r11 = X.1Hj.A02
            int r0 = r2.A01
            r10 = 2
            r8 = 1
            r3 = 0
            r9 = 0
            if (r0 == 0) goto L_0x00d9
            if (r0 == r8) goto L_0x0108
            boolean r1 = r2.A03
            int r7 = r2.A00
            java.lang.Object r6 = r2.A02
            X.3Ii r6 = (X.C239803Ii) r6
            X.0eS.A00(r5)
        L_0x0076:
            X.3Ii r5 = (X.C239803Ii) r5
        L_0x0078:
            if (r7 == 0) goto L_0x007e
            boolean r0 = r6 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x00d4
        L_0x007e:
            if (r1 == 0) goto L_0x0084
            boolean r0 = r5 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x00d4
        L_0x0084:
            X.3Ih r1 = X.C41845B3m.A0d(r9)
        L_0x0088:
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x02e7
            android.content.Intent r1 = X.DbS.A09()
            r0 = 0
            boolean r4 = r6 instanceof X.C239793Ih
            if (r4 == 0) goto L_0x01f6
            X.3Ih r6 = (X.C239793Ih) r6
            java.lang.Object r4 = r6.A00
            X.PwO r4 = (X.C74529PwO) r4
            X.JxQ r4 = (X.C61114JxQ) r4
            java.util.List r4 = r4.A00
            java.util.ArrayList r9 = X.AnonymousClass7TF.A0p(r4)
            java.util.Iterator r10 = r4.iterator()
        L_0x00a7:
            boolean r4 = r10.hasNext()
            if (r4 == 0) goto L_0x01e9
            java.lang.Object r4 = r10.next()
            X.MWK r4 = (X.MWK) r4
            X.JxP r4 = (X.C61113JxP) r4
            long r6 = r4.A01
            java.lang.String r12 = java.lang.String.valueOf(r6)
            java.lang.String r13 = r4.A04
            int r15 = r4.A00
            java.util.List r14 = r4.A05
            boolean r6 = r4.A07
            boolean r4 = r4.A08
            com.instagram.closefriends.audiencelists.model.AudienceListViewModel r11 = new com.instagram.closefriends.audiencelists.model.AudienceListViewModel
            r18 = r3
            r16 = r6
            r17 = r4
            r11.<init>(r12, r13, r14, r15, r16, r17, r18)
            r9.add(r11)
            goto L_0x00a7
        L_0x00d4:
            X.5sO r1 = X.C41845B3m.A0c(r9)
            goto L_0x0088
        L_0x00d9:
            X.0eS.A00(r5)
            java.lang.Object r6 = r2.A05
            X.KXg r6 = (X.KXg) r6
            java.lang.String r1 = r6.A03
            java.lang.String r0 = X.KXg.A05(r6)
            boolean r7 = X.C51966G9m.A1a(r1, r0)
            if (r7 == 0) goto L_0x0111
            X.12T r1 = X.AnonymousClass12T.A00
            r0 = -18
            X.0nV r5 = X.JTP.A0U(r1, r0)
            java.lang.String r4 = r2.A06
            r1 = 32
            X.MGE r0 = new X.MGE
            r0.<init>(r6, r4, r9, r1)
            r2.A00 = r7
            r2.A01 = r8
            java.lang.Object r5 = X.1Eo.A00(r2, r5, r0)
            if (r5 != r11) goto L_0x010d
            return r11
        L_0x0108:
            int r7 = r2.A00
            X.0eS.A00(r5)
        L_0x010d:
            r6 = r5
            X.3Ii r6 = (X.C239803Ii) r6
            goto L_0x0112
        L_0x0111:
            r6 = r9
        L_0x0112:
            java.lang.Object r12 = r2.A05
            X.K6S r12 = (X.K6S) r12
            X.LRl r0 = r12.A03
            X.L55 r1 = r0.A02
            java.util.Set r0 = r1.A00
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x012e
            java.util.Set r0 = r1.A01
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x012e
            r1 = 0
            r5 = r9
            goto L_0x0078
        L_0x012e:
            X.12T r1 = X.AnonymousClass12T.A00
            r0 = -18
            X.0nV r5 = X.JTP.A0U(r1, r0)
            java.lang.String r4 = r2.A06
            r1 = 33
            X.MGE r0 = new X.MGE
            r0.<init>(r12, r4, r9, r1)
            r2.A02 = r6
            r2.A00 = r7
            r2.A03 = r8
            r2.A01 = r10
            java.lang.Object r5 = X.1Eo.A00(r2, r5, r0)
            if (r5 == r11) goto L_0x0198
            r1 = 1
            goto L_0x0076
        L_0x0150:
            X.0eS.A00(r5)
            java.lang.String r1 = r2.A06
            r0 = 23
            X.BBV r8 = new X.BBV
            r8.<init>(r1, r0)
            java.lang.Object r7 = r2.A05
            X.GgL r7 = (X.C52968GgL) r7
            X.I4e r0 = r7.A05
            X.GnY r0 = r0.A00
            java.lang.String r5 = r0.A03
            int r4 = r2.A00
            X.0eM r0 = r7.A07
            X.05G r0 = X.JTU.A0d(r0)
            java.lang.Object r0 = r0.getValue()
            int r1 = X.DbS.A05(r0)
            r0 = 16
            X.Gms r3 = new X.Gms
            r3.<init>(r4, r1, r0)
            java.lang.Object r0 = r2.A02
            X.JwE r0 = (X.C61076JwE) r0
            X.KS4 r1 = new X.KS4
            r1.<init>(r3, r8, r0, r5)
            X.0eM r0 = r7.A06
            java.lang.Object r0 = r0.getValue()
            com.instagram.creation.genai.magicmod.data.MagicModImageGenerationDataSource r0 = (com.instagram.creation.genai.magicmod.data.MagicModImageGenerationDataSource) r0
            r2.A01 = r6
            X.MTt r0 = r0.A01
            java.lang.Object r5 = r0.AWg(r1, r2)
            if (r5 != r11) goto L_0x0014
        L_0x0198:
            return r11
        L_0x0199:
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L_0x01a6
            X.HBS r0 = X.HBS.A00
            X.C52968GgL.A02(r3, r0)
            goto L_0x031f
        L_0x01a6:
            if (r6 != 0) goto L_0x01b3
            X.0eM r0 = r3.A07
            java.lang.Object r0 = r0.getValue()
            X.HDl r0 = (X.C54436HDl) r0
            r0.A03()
        L_0x01b3:
            X.0eM r0 = r3.A07
            java.lang.Object r1 = r0.getValue()
            X.HDl r1 = (X.C54436HDl) r1
            r0 = 0
            r1.A04(r0, r5)
            X.05G r3 = r3.A09
        L_0x01c1:
            java.lang.Object r2 = r3.getValue()
            r1 = r2
            X.GnW r1 = (X.C53399GnW) r1
            X.HLZ r0 = X.HLZ.GENERATED_IMAGE_SELECTION
            X.GnW r0 = X.C53399GnW.A01(r1, (X.C59494JLs) null, (X.I12) null, r0, (X.AnonymousClass62O) null, 47, false)
            boolean r0 = r3.AIY(r2, r0)
            if (r0 == 0) goto L_0x01c1
            goto L_0x031f
        L_0x01d6:
            boolean r0 = r5 instanceof X.C297815sO
            if (r0 != 0) goto L_0x031f
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x01df:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x01e4:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x01e9:
            java.util.ArrayList r9 = X.AnonymousClass7TE.A1D(r9)
            r4 = 4000(0xfa0, float:5.605E-42)
            java.lang.String r4 = X.AnonymousClass000.A00(r4)
            r1.putExtra(r4, r8)
        L_0x01f6:
            boolean r4 = r5 instanceof X.C239793Ih
            if (r4 == 0) goto L_0x02a7
            X.3Ih r5 = (X.C239793Ih) r5
            java.lang.Object r4 = r5.A00
            X.MWL r4 = (X.MWL) r4
            X.JxR r4 = (X.C61115JxR) r4
            X.JxP r10 = r4.A00
            if (r10 == 0) goto L_0x02a7
            java.lang.Object r5 = r2.A05
            X.KXg r5 = (X.KXg) r5
            X.0eM r4 = r5.A0A
            com.instagram.common.session.UserSession r4 = X.AnonymousClass7TE.A0l(r4)
            X.LFo r8 = new X.LFo
            r8.<init>(r5, r4)
            X.LRl r4 = r5.A03
            X.L55 r11 = r4.A02
            java.util.Set r4 = r11.A00
            java.lang.String r7 = r2.A06
            java.util.Iterator r12 = r4.iterator()
        L_0x0221:
            boolean r4 = r12.hasNext()
            if (r4 == 0) goto L_0x0252
            java.lang.Object r4 = r12.next()
            X.LEs r4 = (X.C63950LEs) r4
            java.lang.Integer r5 = r4.A01
            java.lang.Integer r4 = X.AnonymousClass05K.A00
            boolean r6 = X.AnonymousClass7TF.A1W(r5, r4)
            X.0qQ.A0B(r7, r3)
            X.0wc r5 = r8.A00
            java.lang.String r4 = "instagram_action_private_list"
            X.0Aj r5 = X.AnonymousClass7TE.A0e(r5, r4)
            boolean r4 = r5.isSampled()
            if (r4 == 0) goto L_0x0221
            java.lang.String r4 = "add_user"
            A00(r5, r4, r6)
            X.DbS.A1F(r0, r5)
            X.JTU.A0z(r5, r7, r0)
            goto L_0x0221
        L_0x0252:
            java.util.Set r4 = r11.A01
            java.util.Iterator r11 = r4.iterator()
        L_0x0258:
            boolean r4 = r11.hasNext()
            if (r4 == 0) goto L_0x0289
            java.lang.Object r4 = r11.next()
            X.LEs r4 = (X.C63950LEs) r4
            java.lang.Integer r5 = r4.A01
            java.lang.Integer r4 = X.AnonymousClass05K.A00
            boolean r6 = X.AnonymousClass7TF.A1W(r5, r4)
            X.0qQ.A0B(r7, r3)
            X.0wc r5 = r8.A00
            java.lang.String r4 = "instagram_action_private_list"
            X.0Aj r5 = X.AnonymousClass7TE.A0e(r5, r4)
            boolean r4 = r5.isSampled()
            if (r4 == 0) goto L_0x0258
            java.lang.String r4 = "remove_user"
            A00(r5, r4, r6)
            X.DbS.A1F(r0, r5)
            X.JTU.A0z(r5, r7, r0)
            goto L_0x0258
        L_0x0289:
            long r4 = r10.A01
            java.lang.String r11 = java.lang.String.valueOf(r4)
            java.lang.String r8 = r10.A04
            int r7 = r10.A00
            java.util.List r6 = r10.A05
            boolean r5 = r10.A07
            boolean r4 = r10.A08
            com.instagram.closefriends.audiencelists.model.AudienceListViewModel r0 = new com.instagram.closefriends.audiencelists.model.AudienceListViewModel
            r12 = r8
            r13 = r6
            r14 = r7
            r15 = r5
            r16 = r4
            r17 = r3
            r10 = r0
            r10.<init>(r11, r12, r13, r14, r15, r16, r17)
        L_0x02a7:
            if (r9 == 0) goto L_0x02dd
            if (r0 == 0) goto L_0x030d
            java.util.ArrayList r6 = X.AnonymousClass7TF.A0p(r9)
            java.util.Iterator r5 = r9.iterator()
        L_0x02b3:
            boolean r4 = r5.hasNext()
            if (r4 == 0) goto L_0x030c
            java.lang.Object r7 = r5.next()
            com.instagram.closefriends.audiencelists.model.AudienceListViewModel r7 = (com.instagram.closefriends.audiencelists.model.AudienceListViewModel) r7
            java.lang.String r4 = r7.A01
            java.lang.String r8 = r0.A01
            boolean r4 = X.0qQ.A0K(r4, r8)
            if (r4 == 0) goto L_0x02d9
            java.lang.String r9 = r7.A02
            int r11 = r0.A00
            java.util.List r10 = r0.A03
            boolean r12 = r0.A05
            boolean r13 = r0.A06
            com.instagram.closefriends.audiencelists.model.AudienceListViewModel r7 = new com.instagram.closefriends.audiencelists.model.AudienceListViewModel
            r14 = r3
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
        L_0x02d9:
            r6.add(r7)
            goto L_0x02b3
        L_0x02dd:
            r3 = 1911(0x777, float:2.678E-42)
            java.lang.String r3 = X.AnonymousClass000.A00(r3)
            r1.putExtra(r3, r0)
            goto L_0x0316
        L_0x02e7:
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 == 0) goto L_0x0322
            java.lang.Object r2 = r2.A05
            X.KXg r2 = (X.KXg) r2
            X.KXg.A08(r2, r3)
            boolean r0 = r6 instanceof X.C297815sO
            if (r0 == 0) goto L_0x0308
            boolean r0 = r5 instanceof X.C297815sO
            r1 = 2131965093(0x7f1334a5, float:1.9566986E38)
            if (r0 == 0) goto L_0x0300
            r1 = 2131965092(0x7f1334a4, float:1.9566984E38)
        L_0x0300:
            android.content.Context r0 = r2.requireContext()
            X.C59689JTv.A07(r0, r1)
            goto L_0x031f
        L_0x0308:
            r1 = 2131965103(0x7f1334af, float:1.9567006E38)
            goto L_0x0300
        L_0x030c:
            r9 = r6
        L_0x030d:
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1D(r9)
            java.lang.String r0 = "audience_list_view_models"
            r1.putParcelableArrayListExtra(r0, r3)
        L_0x0316:
            java.lang.Object r0 = r2.A05
            androidx.fragment.app.FragmentActivity r0 = X.DbT.A0E(r0)
            X.Dba.A0k(r0, r1)
        L_0x031f:
            X.0gF r11 = X.C60340gF.A00
            return r11
        L_0x0322:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MGP.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((MGP) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MGP(C61076JwE jwE, C52968GgL ggL, String str, AnonymousClass4D7 r5, int i, boolean z) {
        super(2, r5);
        this.A06 = str;
        this.A05 = ggL;
        this.A00 = i;
        this.A02 = jwE;
        this.A03 = z;
    }
}
