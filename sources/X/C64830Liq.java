package X;

/* renamed from: X.Liq  reason: case insensitive filesystem */
public abstract class C64830Liq implements AnonymousClass0lh {
    public final 05G A00;
    public final 05G A01;
    public final 05G A02;
    public final AnonymousClass0Ud A03;
    public final AnonymousClass0Ud A04;
    public final AnonymousClass0Ud A05;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: com.instagram.direct.reactions.repository.CollectionItemEmojiReactionsListRepository} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v12, resolved type: com.instagram.direct.reactions.repository.CollectionItemEmojiReactionsListRepository} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v15, resolved type: com.instagram.direct.reactions.repository.DirectEmojiReactionsListRepository} */
    /* JADX WARNING: type inference failed for: r9v1, types: [X.JUN, X.4D7] */
    /* JADX WARNING: type inference failed for: r5v6, types: [X.MDh, X.4D7] */
    /* JADX WARNING: type inference failed for: r9v7 */
    /* JADX WARNING: type inference failed for: r9v8 */
    /* JADX WARNING: type inference failed for: r5v10 */
    /* JADX WARNING: type inference failed for: r5v11 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0123  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x01e3  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x022a  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A01(X.AnonymousClass4D7 r22, boolean r23) {
        /*
            r21 = this;
            r1 = r21
            r8 = r23
            boolean r0 = r1 instanceof com.instagram.direct.reactions.repository.DirectEmojiReactionsListRepository
            r6 = r22
            if (r0 == 0) goto L_0x00bf
            r2 = r1
            com.instagram.direct.reactions.repository.DirectEmojiReactionsListRepository r2 = (com.instagram.direct.reactions.repository.DirectEmojiReactionsListRepository) r2
            r4 = 34
            boolean r0 = X.C66129MDh.A01(r4, r6)
            if (r0 == 0) goto L_0x0082
            r5 = r6
            X.MDh r5 = (X.C66129MDh) r5
            int r3 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto L_0x0082
            int r3 = r3 - r1
            r5.A00 = r3
        L_0x0023:
            java.lang.Object r1 = r5.A02
            X.1Hj r4 = X.1Hj.A02
            int r0 = r5.A00
            r3 = 1
            if (r0 == 0) goto L_0x006d
            if (r0 != r3) goto L_0x00ba
            java.lang.Object r2 = r5.A01
            com.instagram.direct.reactions.repository.DirectEmojiReactionsListRepository r2 = (com.instagram.direct.reactions.repository.DirectEmojiReactionsListRepository) r2
            X.0eS.A00(r1)
        L_0x0035:
            X.3Ii r1 = (X.C239803Ii) r1
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0088
            X.3Ih r1 = (X.C239793Ih) r1
            java.lang.Object r7 = r1.A00
            X.371 r7 = (X.AnonymousClass371) r7
            X.05G r6 = r2.A02
            java.util.Collection r5 = X.JTO.A13(r6)
            java.lang.Object r0 = r7.FH3()
            X.JtO r0 = (X.C60904JtO) r0
            java.util.List r0 = r0.A01
            java.util.ArrayList r4 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r3 = r0.iterator()
        L_0x0057:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0091
            java.lang.Object r1 = r3.next()
            X.JwJ r1 = (X.C61081JwJ) r1
            com.instagram.common.session.UserSession r0 = r2.A00
            com.instagram.direct.messagethread.reactions.model.ReactionViewModel r0 = X.C61081JwJ.A00(r1, r0)
            r4.add(r0)
            goto L_0x0057
        L_0x006d:
            X.0eS.A00(r1)
            X.05G r1 = r2.A01
            X.KRA r0 = X.KRA.A00
            r1.Epw(r0)
            r5.A01 = r2
            r5.A00 = r3
            java.lang.Object r1 = com.instagram.direct.reactions.repository.DirectEmojiReactionsListRepository.A00(r2, r5)
            if (r1 != r4) goto L_0x0035
            return r4
        L_0x0082:
            X.MDh r5 = new X.MDh
            r5.<init>(r2, r6, r4)
            goto L_0x0023
        L_0x0088:
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 != 0) goto L_0x00ad
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0091:
            java.util.ArrayList r0 = X.00k.A0S(r4, r5)
            r6.Epw(r0)
            X.05G r1 = r2.A00
            java.lang.Object r0 = r7.FH3()
            X.JtO r0 = (X.C60904JtO) r0
            java.lang.String r0 = r0.A00
            r1.Epw(r0)
            X.05G r1 = r2.A01
            X.KR7 r0 = X.KR7.A00
            X.3Ih r1 = X.Dba.A0S(r0, r1)
        L_0x00ad:
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 != 0) goto L_0x02aa
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 != 0) goto L_0x0233
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x00ba:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x00bf:
            r2 = r1
            com.instagram.direct.reactions.repository.CollectionItemEmojiReactionsListRepository r2 = (com.instagram.direct.reactions.repository.CollectionItemEmojiReactionsListRepository) r2
            r4 = 3
            boolean r0 = X.JUN.A00(r4, r6)
            if (r0 == 0) goto L_0x018d
            r9 = r6
            X.JUN r9 = (X.JUN) r9
            int r3 = r9.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto L_0x018d
            int r3 = r3 - r1
            r9.A00 = r3
        L_0x00d7:
            java.lang.Object r3 = r9.A02
            X.1Hj r4 = X.1Hj.A02
            int r0 = r9.A00
            r1 = 1
            if (r0 == 0) goto L_0x0123
            if (r0 != r1) goto L_0x0238
            boolean r8 = r9.A04
            java.lang.Object r2 = r9.A01
            com.instagram.direct.reactions.repository.CollectionItemEmojiReactionsListRepository r2 = (com.instagram.direct.reactions.repository.CollectionItemEmojiReactionsListRepository) r2
            X.0eS.A00(r3)
        L_0x00eb:
            X.3Ii r3 = (X.C239803Ii) r3
            boolean r0 = r3 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x01e3
            X.3Ih r3 = (X.C239793Ih) r3
            java.lang.Object r3 = r3.A00
            X.371 r3 = (X.AnonymousClass371) r3
            X.05G r4 = r2.A02
            java.util.Collection r5 = X.JTO.A13(r4)
            java.lang.Object r0 = r3.FH3()
            X.JtP r0 = (X.C60905JtP) r0
            java.util.List r0 = r0.A01
            java.util.LinkedHashSet r7 = X.DbS.A0y()
            java.util.Iterator r9 = r0.iterator()
        L_0x010d:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x0194
            java.lang.Object r6 = r9.next()
            X.JwJ r6 = (X.C61081JwJ) r6
            com.instagram.common.session.UserSession r0 = r2.A00
            com.instagram.direct.messagethread.reactions.model.ReactionViewModel r0 = X.C61081JwJ.A00(r6, r0)
            r7.add(r0)
            goto L_0x010d
        L_0x0123:
            X.0eS.A00(r3)
            com.instagram.common.session.UserSession r7 = r2.A00
            X.2Dm r3 = X.2L2.A00(r7)
            java.lang.String r0 = r2.A04
            X.3U9 r0 = r3.C60(r0)
            r12 = 0
            if (r0 == 0) goto L_0x0177
            com.instagram.model.direct.DirectThreadKey r5 = r0.BJz()
            X.2Dm r3 = X.2L2.A00(r7)
            java.lang.String r0 = r2.A01
            X.3su r3 = r3.BRz(r5, r0)
            r6 = 0
            if (r3 == 0) goto L_0x0177
            boolean r0 = r3.A1S()
            if (r0 != r1) goto L_0x0177
            X.3sw r0 = r3.A0m
            if (r0 != 0) goto L_0x0157
            X.3sw r0 = new X.3sw
            r0.<init>()
            r3.A0m = r0
        L_0x0157:
            java.util.ArrayList r0 = r0.A00
            java.util.Iterator r8 = X.AnonymousClass7TE.A1G(r0)
            r0 = r12
        L_0x015e:
            boolean r3 = r8.hasNext()
            if (r3 == 0) goto L_0x023d
            java.lang.Object r5 = X.AnonymousClass7TF.A0a(r8)
            X.N2T r5 = (X.N2T) r5
            java.lang.String r4 = r5.A00
            java.lang.String r3 = r2.A02
            boolean r3 = X.00p.A0j(r4, r3, r6)
            if (r3 == 0) goto L_0x015e
            java.util.ArrayList r0 = r5.A01
            goto L_0x015e
        L_0x0177:
            X.05G r3 = r2.A01
            X.KRA r0 = X.KRA.A00
            r3.Epw(r0)
            r9.A01 = r2
            r9.A04 = r8
            r9.A00 = r1
            r0 = 20
            java.lang.Object r3 = com.instagram.direct.reactions.repository.CollectionItemEmojiReactionsListRepository.A00(r2, r9, r0)
            if (r3 != r4) goto L_0x00eb
            return r4
        L_0x018d:
            X.JUN r9 = new X.JUN
            r9.<init>(r2, r6, r4)
            goto L_0x00d7
        L_0x0194:
            if (r8 == 0) goto L_0x0200
            com.instagram.common.session.UserSession r12 = r2.A00
            java.lang.Class<X.OKH> r8 = X.OKH.class
            r6 = 20
            X.Ay7 r0 = new X.Ay7
            r0.<init>(r12, r6)
            java.lang.Object r11 = r12.A01(r8, r0)
            X.OKH r11 = (X.OKH) r11
            java.lang.String r10 = r2.A02
            java.lang.String r9 = r2.A03
            r0 = 0
            java.lang.String r15 = r11.A00(r10, r9, r0)
            java.util.Iterator r8 = r7.iterator()
        L_0x01b4:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x01cb
            java.lang.Object r6 = r8.next()
            com.instagram.direct.messagethread.reactions.model.ReactionViewModel r6 = (com.instagram.direct.messagethread.reactions.model.ReactionViewModel) r6
            boolean r0 = r6.A08
            if (r0 == 0) goto L_0x01b4
            java.lang.String r0 = r6.A04
            java.lang.String r15 = r11.A00(r10, r9, r0)
            goto L_0x01b4
        L_0x01cb:
            java.util.Iterator r6 = r7.iterator()
        L_0x01cf:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x01ec
            java.lang.Object r0 = r6.next()
            com.instagram.direct.messagethread.reactions.model.ReactionViewModel r0 = (com.instagram.direct.messagethread.reactions.model.ReactionViewModel) r0
            boolean r0 = r0.A08
            if (r0 == 0) goto L_0x01cf
            r6.remove()
            goto L_0x01cf
        L_0x01e3:
            boolean r0 = r3 instanceof X.C297815sO
            if (r0 != 0) goto L_0x0226
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x01ec:
            if (r15 == 0) goto L_0x0200
            com.instagram.user.model.User r14 = X.DbT.A0j(r12)
            r13 = 0
            r18 = 0
            r16 = r1
            r17 = r1
            com.instagram.direct.messagethread.reactions.model.ReactionViewModel r0 = X.AnonymousClass50m.A00(r12, r13, r14, r15, r16, r17, r18)
            r7.add(r0)
        L_0x0200:
            java.util.ArrayList r1 = X.00k.A0U(r7)
            r0 = 17
            java.util.List r0 = X.MAY.A00(r1, r0)
            java.util.ArrayList r0 = X.00k.A0S(r0, r5)
            r4.Epw(r0)
            X.05G r1 = r2.A00
            java.lang.Object r0 = r3.FH3()
            X.JtP r0 = (X.C60905JtP) r0
            java.lang.String r0 = r0.A00
            r1.Epw(r0)
            X.05G r1 = r2.A01
            X.KR7 r0 = X.KR7.A00
            X.3Ih r3 = X.Dba.A0S(r0, r1)
        L_0x0226:
            boolean r0 = r3 instanceof X.C239793Ih
            if (r0 != 0) goto L_0x02aa
            boolean r0 = r3 instanceof X.C297815sO
            if (r0 != 0) goto L_0x0233
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0233:
            X.05G r1 = r2.A01
            X.KR8 r0 = X.KR8.A00
            goto L_0x02a7
        L_0x0238:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x023d:
            if (r0 == 0) goto L_0x029e
            X.05G r5 = r2.A02
            java.util.ArrayList r4 = X.AnonymousClass7TG.A0r(r0)
            java.util.Iterator r9 = r0.iterator()
        L_0x0249:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x0297
            java.lang.Object r8 = r9.next()
            X.N49 r8 = (X.N49) r8
            X.17i r3 = X.17h.A00(r7)
            java.lang.String r0 = r8.A01
            com.instagram.user.model.User r3 = r3.A02(r0)
            if (r3 == 0) goto L_0x0295
            java.lang.String r0 = r3.getId()
        L_0x0265:
            boolean r18 = X.C51966G9m.A1W(r7, r0)
            r17 = 0
            if (r18 == 0) goto L_0x0270
            r17 = 2131959228(0x7f131dbc, float:1.955509E38)
        L_0x0270:
            java.lang.String r14 = r8.A01
            java.lang.String r15 = ""
            if (r14 != 0) goto L_0x0277
            r14 = r15
        L_0x0277:
            if (r3 == 0) goto L_0x0293
            java.lang.String r15 = r3.getUsername()
            com.instagram.common.typedurl.ImageUrl r11 = r3.Bh3()
        L_0x0281:
            java.lang.String r0 = r8.A00
            com.instagram.direct.messagethread.reactions.model.ReactionViewModel r10 = new com.instagram.direct.messagethread.reactions.model.ReactionViewModel
            r13 = r12
            r19 = r1
            r20 = r6
            r16 = r0
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            r4.add(r10)
            goto L_0x0249
        L_0x0293:
            r11 = r12
            goto L_0x0281
        L_0x0295:
            r0 = r12
            goto L_0x0265
        L_0x0297:
            java.util.List r0 = X.00k.A0a(r4)
            r5.Epw(r0)
        L_0x029e:
            X.05G r0 = r2.A00
            r0.Epw(r12)
            X.05G r1 = r2.A01
            X.KR7 r0 = X.KR7.A00
        L_0x02a7:
            r1.Epw(r0)
        L_0x02aa:
            X.0gF r4 = X.C60340gF.A00
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64830Liq.A01(X.4D7, boolean):java.lang.Object");
    }

    public final void onSessionWillEnd() {
        this.A02.Epw(0sn.A00);
        this.A01.Epw(KR9.A00);
        this.A00.Epw((Object) null);
    }

    public C64830Liq() {
        02z A1J = JTO.A1J();
        this.A02 = A1J;
        02z A012 = 106.A01(KR9.A00);
        this.A01 = A012;
        02z A0u = C51967G9n.A0u();
        this.A00 = A0u;
        this.A05 = 10b.A03(A1J);
        this.A04 = 10b.A03(A012);
        this.A03 = 10b.A03(A0u);
    }
}
