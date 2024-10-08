package X;

import java.util.Set;

public final class IPE implements C250603lj {
    public final C56524Hzv A00;
    public final Set A01 = AnonymousClass7TE.A1F();
    public final C18383Vqj A02;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: X.5qy} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: X.Ncn} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: X.5qy} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v10, resolved type: X.5qy} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void ATF(X.AnonymousClass30Y r10, X.C252093oY r11) {
        /*
            r9 = this;
            r2 = 0
            X.AnonymousClass7TF.A1H(r10, r11)
            java.lang.Object r4 = r10.A03
            X.0qQ.A06(r4)
            X.5qt r4 = (X.C296935qt) r4
            java.lang.Integer r1 = r11.CEk(r10)
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            if (r1 != r0) goto L_0x003c
            java.util.Set r1 = r9.A01
            java.lang.String r0 = r4.getKey()
            boolean r0 = r1.add(r0)
            if (r0 == 0) goto L_0x003c
            boolean r0 = r4 instanceof X.C69011Ncn
            if (r0 == 0) goto L_0x003d
            X.Ncn r4 = (X.C69011Ncn) r4
            java.lang.Object r0 = r10.A04
            X.0qQ.A06(r0)
            X.GWf r0 = (X.C52528GWf) r0
            X.Hzv r5 = r9.A00
            X.5qz r0 = r0.A00
            int r3 = r0.A01
            int r1 = r0.A00
            X.0qQ.A0B(r4, r2)
            X.1Xj r0 = r4.A03
        L_0x0039:
            X.C56524Hzv.A00(r4, r5, r0, r3, r1)
        L_0x003c:
            return
        L_0x003d:
            boolean r0 = r4 instanceof X.C296985qy
            if (r0 == 0) goto L_0x0058
            X.5qy r4 = (X.C296985qy) r4
            java.lang.Object r0 = r10.A04
            X.0qQ.A06(r0)
            X.GWf r0 = (X.C52528GWf) r0
            X.Hzv r5 = r9.A00
            X.5qz r0 = r0.A00
            int r3 = r0.A01
            int r1 = r0.A00
            X.0qQ.A0B(r4, r2)
            X.1Xj r0 = r4.A01
            goto L_0x0039
        L_0x0058:
            boolean r0 = r4 instanceof X.HAS
            if (r0 == 0) goto L_0x00e3
            X.HAS r4 = (X.HAS) r4
            java.lang.Integer r0 = r4.A02
            int r0 = r0.intValue()
            if (r0 == r2) goto L_0x0220
            java.lang.String r8 = r4.A03
            X.1Xj r2 = r4.A01
            java.lang.Object r0 = r10.A04
            X.0qQ.A06(r0)
            X.GWf r0 = (X.C52528GWf) r0
            X.Hzv r3 = r9.A00
            X.5qz r0 = r0.A00
            int r6 = r0.A01
            int r5 = r0.A00
            com.instagram.common.session.UserSession r1 = r3.A01
            X.0iw r0 = r3.A00
            X.0Aj r7 = X.C51972G9s.A0N(r0, r1)
            boolean r0 = r7.isSampled()
            if (r0 == 0) goto L_0x003c
            java.lang.String r0 = r3.A03
            if (r0 == 0) goto L_0x008e
            X.C51967G9n.A18(r7, r0)
        L_0x008e:
            r0 = 1315(0x523, float:1.843E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r7.AAJ(r0, r8)
            java.lang.String r1 = r2.getId()
            java.lang.String r0 = "id"
            X.G9t.A1I(r7, r2, r0, r1)
            java.lang.String r1 = X.C320166rs.A01(r6, r5)
            java.lang.String r0 = "position"
            r7.AAJ(r0, r1)
            r0 = 1
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "type"
            r7.A9F(r0, r1)
            java.lang.String r1 = "CHANNEL"
            java.lang.String r0 = "endpoint_type"
            r7.AAJ(r0, r1)
            X.JPM r0 = r3.A02
            if (r0 == 0) goto L_0x00df
            X.0xF r2 = r0.E4v(r4, r2)
        L_0x00c3:
            X.GkC r1 = new X.GkC
            r1.<init>()
            java.lang.String r0 = "search_session_id"
            X.C51971G9r.A18(r7, r2, r0)
            java.lang.String r0 = "rank_token"
            X.C51971G9r.A18(r7, r2, r0)
            java.lang.String r0 = "query_text"
            X.C51971G9r.A18(r7, r2, r0)
            X.C51974G9v.A0w(r1, r2)
            java.lang.String r0 = "search_context"
            r7.AAK(r1, r0)
        L_0x00df:
            X.G9w.A17(r7)
            return
        L_0x00e3:
            boolean r0 = r4 instanceof X.C296925qs
            if (r0 == 0) goto L_0x01b1
            X.5qs r4 = (X.C296925qs) r4
            java.lang.Object r0 = r10.A04
            X.0qQ.A06(r0)
            X.GWf r0 = (X.C52528GWf) r0
            X.Hzv r3 = r9.A00
            X.5qz r0 = r0.A00
            int r8 = r0.A01
            int r5 = r0.A00
            X.0qQ.A0B(r4, r2)
            com.instagram.common.session.UserSession r1 = r3.A01
            X.0iw r0 = r3.A00
            X.0Aj r7 = X.C51972G9s.A0N(r0, r1)
            boolean r0 = r7.isSampled()
            if (r0 == 0) goto L_0x003c
            X.5oy r1 = r4.A01
            X.4bN r0 = r1.A00()
            X.1Xj r6 = r0.A02
            if (r6 == 0) goto L_0x0235
            java.lang.String r0 = X.DbT.A0x(r6)
            if (r0 == 0) goto L_0x011c
            X.C51965G9l.A1Q(r7, r0)
        L_0x011c:
            java.lang.String r0 = r3.A03
            if (r0 == 0) goto L_0x0123
            X.C51967G9n.A18(r7, r0)
        L_0x0123:
            java.lang.String r1 = r1.A0A
            java.lang.String r0 = "id"
            X.G9t.A1I(r7, r6, r0, r1)
            java.lang.String r1 = X.C320166rs.A01(r8, r5)
            java.lang.String r0 = "position"
            r7.AAJ(r0, r1)
            X.G9t.A1H(r7, r6)
            r0 = 24
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "type"
            r7.A9F(r0, r1)
            X.JPM r3 = r3.A02
            if (r3 == 0) goto L_0x00df
            X.0xF r2 = r3.E4v(r4, r6)
            X.GkC r1 = new X.GkC
            r1.<init>()
            java.lang.String r0 = "search_session_id"
            X.C51971G9r.A18(r7, r2, r0)
            java.lang.String r0 = "rank_token"
            X.C51971G9r.A18(r7, r2, r0)
            java.lang.String r5 = "query_text"
            X.C51971G9r.A18(r7, r2, r5)
            X.C51974G9v.A0w(r1, r2)
            java.lang.String r0 = "search_context"
            r7.AAK(r1, r0)
            X.0xF r3 = r3.E4v(r4, r6)
            java.lang.String r1 = "hashtag_id"
            java.lang.String r0 = r3.A05(r1)
            if (r0 == 0) goto L_0x0181
            java.lang.Long r0 = X.AnonymousClass7TE.A10(r0)     // Catch:{ NumberFormatException -> 0x0179 }
            r7.A9F(r1, r0)     // Catch:{ NumberFormatException -> 0x0179 }
            goto L_0x0181
        L_0x0179:
            r2 = move-exception
            java.lang.String r1 = "DiscoveryImpressionHelper"
            java.lang.String r0 = "Failed to convert hashtag id to long"
            X.0KC.A0G(r1, r0, r2)
        L_0x0181:
            java.lang.String r0 = "hashtag_name"
            X.C51971G9r.A18(r7, r3, r0)
            java.lang.String r0 = "hashtag_follow_status"
            X.C51971G9r.A18(r7, r3, r0)
            java.lang.String r0 = r3.A05(r5)
            if (r0 == 0) goto L_0x019e
            boolean r0 = X.C253063q9.A02(r0)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "is_tag"
            r7.A7p(r0, r1)
        L_0x019e:
            r0 = 956(0x3bc, float:1.34E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String r1 = r3.A05(r0)
            if (r1 == 0) goto L_0x00df
            java.lang.String r0 = "tag_navigation_source"
            r7.AAJ(r0, r1)
            goto L_0x00df
        L_0x01b1:
            boolean r0 = r4 instanceof X.HAT
            if (r0 == 0) goto L_0x020e
            X.HAT r4 = (X.HAT) r4
            X.5ty r4 = r4.A01
            java.lang.Object r0 = r10.A04
            X.0qQ.A06(r0)
            X.GWf r0 = (X.C52528GWf) r0
            X.Hzv r6 = r9.A00
            X.5qz r0 = r0.A00
            int r5 = r0.A01
            int r3 = r0.A00
            com.instagram.common.session.UserSession r1 = r6.A01
            X.0iw r0 = r6.A00
            X.0Aj r7 = X.C51972G9s.A0N(r0, r1)
            boolean r0 = r7.isSampled()
            if (r0 == 0) goto L_0x003c
            java.util.List r0 = r4.A03
            java.lang.Object r2 = r0.get(r2)
            X.0qQ.A07(r2)
            X.1Xj r2 = (X.1Xj) r2
            java.lang.String r0 = r6.A03
            if (r0 == 0) goto L_0x01e8
            X.C51967G9n.A18(r7, r0)
        L_0x01e8:
            java.lang.String r0 = r2.getId()
            X.C51965G9l.A1I(r7, r0)
            java.lang.String r1 = X.C320166rs.A01(r5, r3)
            java.lang.String r0 = "position"
            r7.AAJ(r0, r1)
            X.G9t.A1H(r7, r2)
            java.lang.Long r1 = X.C51971G9r.A0m()
            java.lang.String r0 = "type"
            r7.A9F(r0, r1)
            X.JPM r0 = r6.A02
            if (r0 == 0) goto L_0x00df
            X.0xF r2 = r0.E4u(r4)
            goto L_0x00c3
        L_0x020e:
            boolean r0 = r4 instanceof X.C69009Ncl
            if (r0 != 0) goto L_0x021a
            boolean r0 = r4 instanceof X.HAU
            if (r0 != 0) goto L_0x021a
            boolean r0 = r4 instanceof X.C69008Nck
            if (r0 == 0) goto L_0x003c
        L_0x021a:
            java.lang.Object r0 = r10.A04
            X.0qQ.A06(r0)
            return
        L_0x0220:
            java.lang.Object r0 = r10.A04
            X.0qQ.A06(r0)
            X.GWf r0 = (X.C52528GWf) r0
            X.Hzv r3 = r9.A00
            X.5qz r0 = r0.A00
            int r2 = r0.A01
            int r1 = r0.A00
            X.1Xj r0 = r4.A01
            X.C56524Hzv.A00(r4, r3, r0, r2, r1)
            return
        L_0x0235:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.IPE.ATF(X.30Y, X.3oY):void");
    }

    public IPE(C56524Hzv hzv, C18383Vqj vqj) {
        this.A00 = hzv;
        this.A02 = vqj;
    }
}
