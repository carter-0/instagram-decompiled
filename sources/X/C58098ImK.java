package X;

import com.instagram.barcelona.feed.post.data.PostViewStateRepository;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.ImK  reason: case insensitive filesystem */
public final class C58098ImK extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public Object A01;
    public final int A02 = 0;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;
    public final Object A08;
    public final String A09;
    public final String A0A;
    public final String A0B;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58098ImK(PostViewStateRepository postViewStateRepository, AnonymousClass0iw r3, C247733gp r4, C247733gp r5, C247733gp r6, 1Xj r7, String str, String str2, String str3, List list, AnonymousClass4D7 r12) {
        super(2, r12);
        this.A08 = postViewStateRepository;
        this.A0B = str;
        this.A05 = r7;
        this.A09 = str2;
        this.A03 = r3;
        this.A04 = list;
        this.A0A = str3;
        this.A07 = r4;
        this.A01 = r5;
        this.A06 = r6;
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [X.4D7, X.ImK] */
    /* JADX WARNING: type inference failed for: r6v1, types: [X.4D7, X.ImK] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r20) {
        AnonymousClass4D7 r17 = r20;
        if (this.A02 != 0) {
            String str = this.A0B;
            String str2 = this.A09;
            AnonymousClass0iw r8 = (AnonymousClass0iw) this.A03;
            String str3 = this.A0A;
            return new C58098ImK((PostViewStateRepository) this.A08, r8, (C247733gp) this.A07, (C247733gp) this.A01, (C247733gp) this.A06, (1Xj) this.A05, str, str2, str3, (List) this.A04, r17);
        }
        String str4 = this.A0B;
        String str5 = this.A09;
        String str6 = this.A0A;
        return new C58098ImK((C391589tK) this.A04, (28D) this.A06, (C311756dC) this.A08, (UserSession) this.A07, (AnonymousClass8Yi) this.A05, (AnonymousClass1Xo) this.A03, str4, str5, str6, r17);
    }

    /* JADX WARNING: type inference failed for: r12v0, types: [X.4D7, X.ImK] */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x0262 A[Catch:{ Exception -> 0x027c }] */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x026a A[Catch:{ Exception -> 0x027c }] */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0271 A[Catch:{ Exception -> 0x027c }] */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0258 A[Catch:{ Exception -> 0x027c }, RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r26) {
        /*
            r25 = this;
            r12 = r25
            r2 = r26
            int r0 = r12.A02
            if (r0 == 0) goto L_0x0154
            X.1Hj r0 = X.1Hj.A02
            int r1 = r12.A00
            r6 = 1
            if (r1 == 0) goto L_0x007b
            if (r1 != r6) goto L_0x0145
            X.0eS.A00(r2)
        L_0x0014:
            X.3Ii r2 = (X.C239803Ii) r2
            boolean r0 = r2 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x006a
            X.3Ih r2 = (X.C239793Ih) r2
            java.lang.Object r6 = r2.A00
            java.util.Map r6 = (java.util.Map) r6
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L_0x0073
            java.lang.String r0 = r12.A0A
            java.lang.String r5 = X.DbT.A11(r0, r6)
            r1 = 0
            if (r5 != 0) goto L_0x0037
            java.lang.Object r0 = r12.A07
            X.3gp r0 = (X.C247733gp) r0
            if (r0 == 0) goto L_0x0068
            java.lang.String r5 = r0.A0d
        L_0x0037:
            java.lang.Object r4 = r12.A08
            com.instagram.barcelona.feed.post.data.PostViewStateRepository r4 = (com.instagram.barcelona.feed.post.data.PostViewStateRepository) r4
            java.lang.String r3 = r12.A0B
            java.lang.Object r0 = r12.A01
            X.3gp r0 = (X.C247733gp) r0
            if (r0 == 0) goto L_0x0066
            java.lang.String r0 = r0.A0G
            if (r0 == 0) goto L_0x0066
            java.lang.String r2 = X.DbT.A11(r0, r6)
        L_0x004b:
            java.lang.Object r0 = r12.A06
            X.3gp r0 = (X.C247733gp) r0
            if (r0 == 0) goto L_0x005b
            java.lang.String r0 = r0.A0G
            if (r0 == 0) goto L_0x005b
            java.lang.Object r1 = r6.get(r0)
            java.lang.String r1 = (java.lang.String) r1
        L_0x005b:
            X.GpJ r0 = new X.GpJ
            r0.<init>(r5, r2, r1)
            com.instagram.barcelona.feed.post.data.PostViewStateRepository.A01(r4, r0, r3)
        L_0x0063:
            X.0gF r0 = X.C60340gF.A00
            return r0
        L_0x0066:
            r2 = r1
            goto L_0x004b
        L_0x0068:
            r5 = r1
            goto L_0x0037
        L_0x006a:
            boolean r0 = r2 instanceof X.C297815sO
            if (r0 != 0) goto L_0x0073
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0073:
            java.lang.Object r5 = r12.A08
            com.instagram.barcelona.feed.post.data.PostViewStateRepository r5 = (com.instagram.barcelona.feed.post.data.PostViewStateRepository) r5
            java.lang.String r4 = r12.A0B
            goto L_0x013c
        L_0x007b:
            X.0eS.A00(r2)
            java.lang.Object r5 = r12.A08
            com.instagram.barcelona.feed.post.data.PostViewStateRepository r5 = (com.instagram.barcelona.feed.post.data.PostViewStateRepository) r5
            X.05G r1 = r5.A03
            java.lang.Object r1 = r1.getValue()
            java.util.Map r1 = (java.util.Map) r1
            java.lang.String r4 = r12.A0B
            java.lang.Object r2 = r1.get(r4)
            if (r2 != 0) goto L_0x0094
            X.ILc r2 = X.C57010ILc.A00
        L_0x0094:
            boolean r1 = r2 instanceof X.C57010ILc
            if (r1 == 0) goto L_0x00f2
            java.lang.Object r9 = r12.A05
            X.1Xj r9 = (X.1Xj) r9
            java.lang.String r8 = r12.A09
            java.lang.Object r7 = r12.A03
            X.0iw r7 = (X.AnonymousClass0iw) r7
            com.instagram.common.session.UserSession r2 = r5.A00
            X.0wc r3 = X.AnonymousClass0kN.A01(r7, r2)
            java.lang.String r1 = "barcelona_translate_post_button_tap"
            X.0Aj r3 = X.AnonymousClass7TE.A0e(r3, r1)
            java.lang.String r1 = X.DbY.A0a()
            X.C51965G9l.A1K(r3, r1)
            java.util.concurrent.atomic.AtomicBoolean r1 = X.1Xj.A0i
            java.lang.String r1 = r9.getId()
            if (r1 == 0) goto L_0x014a
            java.lang.String r1 = X.1Xv.A06(r1)
            X.G9t.A1J(r3, r1)
            java.lang.String r1 = "target_language"
            r3.AAJ(r1, r8)
            X.C51969G9p.A19(r3, r7)
            com.instagram.user.model.User r1 = r9.A2A(r2)
            if (r1 == 0) goto L_0x00f0
            java.lang.Long r2 = X.C51972G9s.A0h(r1)
        L_0x00d6:
            java.lang.String r1 = "media_owner_id"
            r3.A9F(r1, r2)
            r3.Cgf()
            X.ILb r1 = X.C57009ILb.A00
            com.instagram.barcelona.feed.post.data.PostViewStateRepository.A01(r5, r1, r4)
            java.lang.Object r1 = r12.A04
            java.util.List r1 = (java.util.List) r1
            r12.A00 = r6
            java.lang.Object r2 = com.instagram.barcelona.feed.post.data.PostViewStateRepository.A00(r5, r1, r12)
            if (r2 != r0) goto L_0x0014
            return r0
        L_0x00f0:
            r2 = 0
            goto L_0x00d6
        L_0x00f2:
            boolean r0 = r2 instanceof X.C53487GpJ
            if (r0 == 0) goto L_0x0063
            java.lang.Object r8 = r12.A05
            X.1Xj r8 = (X.1Xj) r8
            java.lang.String r7 = r12.A09
            java.lang.Object r6 = r12.A03
            X.0iw r6 = (X.AnonymousClass0iw) r6
            com.instagram.common.session.UserSession r3 = r5.A00
            X.0wc r1 = X.AnonymousClass0kN.A01(r6, r3)
            java.lang.String r0 = "barcelona_translate_post_undo_button_tap"
            X.0Aj r2 = X.AnonymousClass7TE.A0e(r1, r0)
            java.lang.String r0 = X.DbY.A0a()
            X.C51965G9l.A1K(r2, r0)
            java.util.concurrent.atomic.AtomicBoolean r0 = X.1Xj.A0i
            java.lang.String r0 = r8.getId()
            if (r0 == 0) goto L_0x014f
            java.lang.String r0 = X.1Xv.A06(r0)
            X.G9t.A1J(r2, r0)
            java.lang.String r0 = "target_language"
            r2.AAJ(r0, r7)
            X.C51969G9p.A19(r2, r6)
            com.instagram.user.model.User r0 = r8.A2A(r3)
            if (r0 == 0) goto L_0x0143
            java.lang.Long r1 = X.C51972G9s.A0h(r0)
        L_0x0134:
            java.lang.String r0 = "media_owner_id"
            r2.A9F(r0, r1)
            r2.Cgf()
        L_0x013c:
            X.ILc r0 = X.C57010ILc.A00
            com.instagram.barcelona.feed.post.data.PostViewStateRepository.A01(r5, r0, r4)
            goto L_0x0063
        L_0x0143:
            r1 = 0
            goto L_0x0134
        L_0x0145:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x014a:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x014f:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0154:
            X.1Hj r0 = X.1Hj.A02
            int r1 = r12.A00
            r16 = 0
            r14 = 2
            r11 = 1
            if (r1 == 0) goto L_0x0166
            java.lang.Object r10 = r12.A01
            X.Hmz r10 = (X.C55764Hmz) r10
            if (r1 == r11) goto L_0x01c8
            goto L_0x0259
        L_0x0166:
            X.0eS.A00(r2)
            java.lang.Object r4 = r12.A05
            X.8Yi r4 = (X.AnonymousClass8Yi) r4
            X.3Ym r1 = r4.A00
            X.0qQ.A07(r1)
            java.lang.String r5 = r12.A0B
            X.Hmz r10 = new X.Hmz
            r10.<init>(r1, r5)
            X.02m r7 = r10.A01
            int r6 = r10.A00
            r3 = 17640248(0x10d2b38, float:2.5928618E-38)
            r7.markerStart(r3, r6)
            X.3Ym r1 = r10.A02
            java.lang.String r2 = r1.name()
            java.lang.String r1 = "updated_save_status"
            r7.markerAnnotate(r3, r6, r1, r2)
            java.lang.String r2 = r10.A03
            java.lang.String r1 = "effect_surface"
            r7.markerAnnotate(r3, r6, r1, r2)
            java.lang.Object r3 = r12.A08     // Catch:{ Exception -> 0x027c }
            X.6dC r3 = (X.C311756dC) r3     // Catch:{ Exception -> 0x027c }
            r12.A01 = r10     // Catch:{ Exception -> 0x027c }
            r12.A00 = r11     // Catch:{ Exception -> 0x027c }
            r1 = 1774(0x6ee, float:2.486E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)     // Catch:{ Exception -> 0x027c }
            boolean r1 = X.0qQ.A0K(r5, r1)     // Catch:{ Exception -> 0x027c }
            if (r1 != 0) goto L_0x01be
            r1 = 4188(0x105c, float:5.869E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)     // Catch:{ Exception -> 0x027c }
            boolean r1 = X.0qQ.A0K(r5, r1)     // Catch:{ Exception -> 0x027c }
            if (r1 != 0) goto L_0x01be
            X.84A r2 = X.AnonymousClass84A.STORIES     // Catch:{ Exception -> 0x027c }
        L_0x01b7:
            com.instagram.ar.core.effectcollection.EffectCollectionService r1 = r3.A01     // Catch:{ Exception -> 0x027c }
            java.lang.Object r1 = r1.A0C(r2, r4, r12)     // Catch:{ Exception -> 0x027c }
            goto L_0x01c1
        L_0x01be:
            X.84A r2 = X.AnonymousClass84A.DIRECT_RTC     // Catch:{ Exception -> 0x027c }
            goto L_0x01b7
        L_0x01c1:
            if (r1 == r0) goto L_0x01c5
            X.0gF r1 = X.C60340gF.A00     // Catch:{ Exception -> 0x027c }
        L_0x01c5:
            if (r1 != r0) goto L_0x01cb
            return r0
        L_0x01c8:
            X.0eS.A00(r2)     // Catch:{ Exception -> 0x027c }
        L_0x01cb:
            java.lang.Object r13 = r12.A08     // Catch:{ Exception -> 0x027c }
            X.6dC r13 = (X.C311756dC) r13     // Catch:{ Exception -> 0x027c }
            java.lang.Object r9 = r12.A07     // Catch:{ Exception -> 0x027c }
            com.instagram.common.session.UserSession r9 = (com.instagram.common.session.UserSession) r9     // Catch:{ Exception -> 0x027c }
            java.lang.Object r8 = r12.A05     // Catch:{ Exception -> 0x027c }
            X.8Yi r8 = (X.AnonymousClass8Yi) r8     // Catch:{ Exception -> 0x027c }
            java.lang.String r15 = r12.A0B     // Catch:{ Exception -> 0x027c }
            java.lang.String r7 = r12.A09     // Catch:{ Exception -> 0x027c }
            java.lang.String r6 = r12.A0A     // Catch:{ Exception -> 0x027c }
            java.lang.Object r5 = r12.A04     // Catch:{ Exception -> 0x027c }
            X.9tK r5 = (X.C391589tK) r5     // Catch:{ Exception -> 0x027c }
            java.lang.Object r4 = r12.A06     // Catch:{ Exception -> 0x027c }
            X.28D r4 = (X.28D) r4     // Catch:{ Exception -> 0x027c }
            X.4Om r17 = X.C264044Oj.A00(r9)     // Catch:{ Exception -> 0x027c }
            X.3Ym r3 = r8.A00     // Catch:{ Exception -> 0x027c }
            X.3Ym r2 = X.C243373Ym.SAVED     // Catch:{ Exception -> 0x027c }
            java.lang.String r1 = r8.A01     // Catch:{ Exception -> 0x027c }
            if (r3 != r2) goto L_0x0212
            r18 = r5
            r19 = r4
            r20 = r1
            r21 = r15
            r22 = r6
            r23 = r7
            r17.CkB(r18, r19, r20, r21, r22, r23)     // Catch:{ Exception -> 0x027c }
        L_0x0200:
            X.6dq r4 = r13.A02     // Catch:{ Exception -> 0x027c }
            java.lang.Object r3 = r12.A03     // Catch:{ Exception -> 0x027c }
            X.1Xo r3 = (X.AnonymousClass1Xo) r3     // Catch:{ Exception -> 0x027c }
            X.3Ym r5 = r8.A00     // Catch:{ Exception -> 0x027c }
            X.0qQ.A07(r5)     // Catch:{ Exception -> 0x027c }
            android.content.Context r6 = r13.A00     // Catch:{ Exception -> 0x027c }
            r12.A01 = r10     // Catch:{ Exception -> 0x027c }
            r12.A00 = r14     // Catch:{ Exception -> 0x027c }
            goto L_0x0220
        L_0x0212:
            r18 = r5
            r19 = r4
            r20 = r1
            r21 = r15
            r22 = r7
            r17.Cl0(r18, r19, r20, r21, r22)     // Catch:{ Exception -> 0x027c }
            goto L_0x0200
        L_0x0220:
            if (r5 != r2) goto L_0x0223
            goto L_0x0232
        L_0x0223:
            X.3Ym r1 = X.C243373Ym.NOT_SAVED     // Catch:{ Exception -> 0x027c }
            if (r5 != r1) goto L_0x0252
            X.12V r1 = r4.A00     // Catch:{ Exception -> 0x027c }
            X.12U r1 = (X.AnonymousClass12U) r1     // Catch:{ Exception -> 0x027c }
            X.4CZ r2 = r1.A04     // Catch:{ Exception -> 0x027c }
            r23 = 0
            r24 = 2
            goto L_0x023c
        L_0x0232:
            X.12V r1 = r4.A00     // Catch:{ Exception -> 0x027c }
            X.12U r1 = (X.AnonymousClass12U) r1     // Catch:{ Exception -> 0x027c }
            X.4CZ r2 = r1.A04     // Catch:{ Exception -> 0x027c }
            r23 = 0
            r24 = 1
        L_0x023c:
            X.AwF r1 = new X.AwF     // Catch:{ Exception -> 0x027c }
            r21 = r5
            r22 = r3
            r17 = r1
            r18 = r6
            r19 = r4
            r20 = r9
            r17.<init>(r18, r19, r20, r21, r22, r23, r24)     // Catch:{ Exception -> 0x027c }
            java.lang.Object r2 = X.1Eo.A00(r12, r2, r1)     // Catch:{ Exception -> 0x027c }
            goto L_0x0256
        L_0x0252:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r16)     // Catch:{ Exception -> 0x027c }
        L_0x0256:
            if (r2 != r0) goto L_0x025c
            return r0
        L_0x0259:
            X.0eS.A00(r2)     // Catch:{ Exception -> 0x027c }
        L_0x025c:
            boolean r5 = X.AnonymousClass7TE.A1a(r2)     // Catch:{ Exception -> 0x027c }
            if (r5 != 0) goto L_0x0263
            r11 = 0
        L_0x0263:
            r4 = 17640248(0x10d2b38, float:2.5928618E-38)
            X.02m r3 = r10.A01     // Catch:{ Exception -> 0x027c }
            if (r11 == 0) goto L_0x0271
            int r2 = r10.A00     // Catch:{ Exception -> 0x027c }
            r0 = 2
        L_0x026d:
            r3.markerEnd(r4, r2, r0)     // Catch:{ Exception -> 0x027c }
            goto L_0x029b
        L_0x0271:
            int r2 = r10.A00     // Catch:{ Exception -> 0x027c }
            java.lang.String r1 = "failure_reason"
            java.lang.String r0 = "api_error"
            r3.markerAnnotate(r4, r2, r1, r0)     // Catch:{ Exception -> 0x027c }
            r0 = 3
            goto L_0x026d
        L_0x027c:
            r2 = move-exception
            r0 = 2490(0x9ba, float:3.489E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            java.lang.String r0 = "Exception when changing effect save status"
            X.0wb.A06(r1, r0, r2)
            X.02m r4 = r10.A01
            int r3 = r10.A00
            r2 = 17640248(0x10d2b38, float:2.5928618E-38)
            java.lang.String r1 = "failure_reason"
            java.lang.String r0 = "exception"
            r4.markerAnnotate(r2, r3, r1, r0)
            r0 = 3
            r4.markerEnd(r2, r3, r0)
            goto L_0x029d
        L_0x029b:
            r16 = r5
        L_0x029d:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r16)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58098ImK.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C58098ImK) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58098ImK(C391589tK r2, 28D r3, C311756dC r4, UserSession userSession, AnonymousClass8Yi r6, AnonymousClass1Xo r7, String str, String str2, String str3, AnonymousClass4D7 r11) {
        super(2, r11);
        this.A07 = userSession;
        this.A05 = r6;
        this.A0B = str;
        this.A08 = r4;
        this.A09 = str2;
        this.A0A = str3;
        this.A04 = r2;
        this.A06 = r3;
        this.A03 = r7;
    }
}
