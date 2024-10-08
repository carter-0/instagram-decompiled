package com.instagram.contentnotes.data;

public abstract class OptimisticNetworkOperation {
    /* JADX WARNING: type inference failed for: r1v1, types: [X.MDg, X.4D7] */
    /* JADX WARNING: type inference failed for: r1v39 */
    /* JADX WARNING: type inference failed for: r1v40 */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0429  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00a9 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x03ce  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(X.AnonymousClass4D7 r37) {
        /*
            r36 = this;
            r4 = 37
            r6 = r37
            boolean r0 = X.C66128MDg.A01(r4, r6)
            r5 = r36
            if (r0 == 0) goto L_0x003c
            r1 = r6
            X.MDg r1 = (X.C66128MDg) r1
            int r3 = r1.A00
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r2
            if (r0 == 0) goto L_0x003c
            int r3 = r3 - r2
            r1.A00 = r3
        L_0x001a:
            java.lang.Object r3 = r1.A02
            X.1Hj r21 = X.1Hj.A02
            int r2 = r1.A00
            r20 = 4
            r19 = 3
            r9 = 2
            r18 = 1
            if (r2 == 0) goto L_0x0052
            r0 = r18
            if (r2 == r0) goto L_0x004a
            if (r2 == r9) goto L_0x03c1
            r0 = r19
            if (r2 == r0) goto L_0x0042
            r0 = r20
            if (r2 == r0) goto L_0x0042
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x003c:
            X.MDg r1 = new X.MDg
            r1.<init>(r5, r6, r4)
            goto L_0x001a
        L_0x0042:
            java.lang.Object r0 = r1.A01
            r21 = r0
            X.0eS.A00(r3)
            return r21
        L_0x004a:
            java.lang.Object r0 = r1.A01
            com.instagram.contentnotes.data.OptimisticNetworkOperation r0 = (com.instagram.contentnotes.data.OptimisticNetworkOperation) r0
            X.0eS.A00(r3)
            goto L_0x0077
        L_0x0052:
            X.0eS.A00(r3)
            r1.A01 = r5
            r0 = r18
            r1.A00 = r0
            r6 = r5
            boolean r0 = r5 instanceof X.C54344H8q
            if (r0 == 0) goto L_0x028b
            X.H8q r6 = (X.C54344H8q) r6
            com.instagram.common.session.UserSession r4 = r6.A01
            java.lang.String r3 = r6.A08
            java.lang.String r2 = r6.A09
            boolean r0 = X.C51973G9u.A1b(r4, r3, r2)
            X.I2Z.A02(r4, r3, r2, r0)
            X.0sP r2 = r6.A0B
            r0 = r18
            X.C51968G9o.A1O(r2, r0)
        L_0x0076:
            r0 = r5
        L_0x0077:
            r1.A01 = r0
            r1.A00 = r9
            boolean r2 = r0 instanceof X.C54344H8q
            if (r2 == 0) goto L_0x00aa
            r3 = r0
            X.H8q r3 = (X.C54344H8q) r3
            com.instagram.direct.inbox.notes.NotesApi r4 = r3.A02
            java.lang.String r2 = r3.A09
            long r15 = java.lang.Long.parseLong(r2)
            X.GPK r2 = r3.A00
            java.lang.String r8 = r2.A00
            java.lang.String r9 = r3.A05
            java.lang.String r10 = X.DbS.A0k()
            java.lang.String r11 = r3.A07
            java.lang.String r12 = r3.A0A
            java.lang.Integer r5 = r3.A04
            java.lang.String r13 = r3.A06
            java.lang.Integer r6 = r3.A03
            java.lang.String r7 = "❤️"
            r14 = r1
            java.lang.Object r3 = r4.A01(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
        L_0x00a5:
            r2 = r21
            if (r3 != r2) goto L_0x03c8
            return r21
        L_0x00aa:
            boolean r2 = r0 instanceof X.C54347H8t
            if (r2 == 0) goto L_0x00d3
            r3 = r0
            X.H8t r3 = (X.C54347H8t) r3
            com.instagram.direct.inbox.notes.NotesApi r4 = r3.A02
            java.lang.String r2 = r3.A09
            long r14 = java.lang.Long.parseLong(r2)
            X.GPK r2 = r3.A00
            java.lang.String r7 = r2.A00
            java.lang.String r8 = r3.A05
            java.lang.String r9 = X.DbS.A0k()
            java.lang.String r10 = r3.A07
            java.lang.String r11 = r3.A0A
            java.lang.Integer r5 = r3.A04
            java.lang.String r12 = r3.A06
            java.lang.Integer r6 = r3.A03
            r13 = r1
            java.lang.Object r3 = r4.A02(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            goto L_0x00a5
        L_0x00d3:
            boolean r2 = r0 instanceof X.C54348H8u
            if (r2 == 0) goto L_0x01b5
            r6 = r0
            X.H8u r6 = (X.C54348H8u) r6
            java.lang.String r2 = r6.A0E
            r24 = r2
            boolean r2 = X.00l.A0W(r24)
            if (r2 == 0) goto L_0x00fe
            X.4JM r4 = r6.A03
            java.lang.String r3 = r6.A0B
            java.lang.String r2 = r6.A0C
            r4.A00(r3, r2)
            java.lang.String r2 = "Note text is empty"
            java.lang.RuntimeException r3 = new java.lang.RuntimeException
            r3.<init>(r2)
            X.4dn r2 = new X.4dn
            r2.<init>(r3)
            X.5sO r3 = X.C41845B3m.A0c(r2)
            goto L_0x00a5
        L_0x00fe:
            com.instagram.direct.inbox.notes.models.NoteAudience r12 = r6.A04
            java.lang.String r2 = r6.A0B
            r23 = r2
            com.instagram.common.session.UserSession r4 = r6.A02
            java.lang.String r11 = r6.A07
            X.GPK r5 = r6.A00
            java.lang.String r10 = r6.A0A
            java.lang.String r8 = r6.A0D
            java.lang.Integer r2 = r6.A06
            r17 = r2
            java.lang.String r7 = r6.A08
            java.lang.Integer r2 = r6.A05
            r16 = r2
            r6 = 0
            X.0qQ.A0B(r4, r6)
            r3 = r23
            r2 = r24
            X.C51974G9v.A1P(r3, r2, r12, r11)
            r2 = 5
            X.0qQ.A0B(r5, r2)
            int r2 = r12.A00
            r22 = r2
            java.lang.String r13 = X.DbS.A0k()
            java.lang.String r12 = r5.A00
            X.1NY r5 = X.DbU.A0M(r4)
            java.lang.String r15 = "api/"
            java.lang.String r14 = "v1/"
            java.lang.String r4 = "media/"
            java.lang.String r3 = "create_note/"
            java.lang.String r2 = "v2/"
            r5.A04()
            r5.A02()
            java.lang.String r2 = X.002.A11(r15, r14, r4, r3, r2)
            X.0qQ.A07(r2)
            r5.A0E = r2
            java.lang.Class<X.CEj> r3 = X.C43817CEj.class
            java.lang.Class<X.Cz2> r2 = X.C45590Cz2.class
            r5.A0Q(r3, r2)
            java.lang.String r3 = "text"
            r2 = r24
            r5.A9m(r3, r2)
            java.lang.String r3 = "audience"
            r2 = r22
            r5.A0C(r3, r2)
            java.lang.String r3 = "media_id"
            r2 = r23
            X.C51968G9o.A1L(r5, r3, r2, r11)
            if (r10 == 0) goto L_0x0171
            java.lang.String r2 = "inventory_source"
            r5.A9m(r2, r10)
        L_0x0171:
            if (r13 == 0) goto L_0x0178
            java.lang.String r2 = "nav_chain"
            r5.A9m(r2, r13)
        L_0x0178:
            if (r16 == 0) goto L_0x0183
            int r3 = r16.intValue()
            java.lang.String r2 = "carousel_index"
            r5.A0C(r2, r3)
        L_0x0183:
            if (r7 == 0) goto L_0x018a
            java.lang.String r2 = "carousel_media_id"
            r5.A9m(r2, r7)
        L_0x018a:
            if (r12 == 0) goto L_0x0191
            java.lang.String r2 = "event_source"
            r5.A9m(r2, r12)
        L_0x0191:
            if (r8 == 0) goto L_0x0198
            java.lang.String r2 = "ranking_info_token"
            r5.A9m(r2, r8)
        L_0x0198:
            if (r17 == 0) goto L_0x01a3
            int r3 = r17.intValue()
            java.lang.String r2 = "media_client_position"
            r5.A0C(r2, r3)
        L_0x01a3:
            X.1OC r3 = r5.A0M()
            java.lang.String r2 = "null cannot be cast to non-null type com.instagram.common.api.base.HttpRequestTask<com.instagram.api.response.IgApiResponse<com.instagram.api.schemas.MediaNoteResponse>, com.instagram.api.response.IgApiResponse<com.instagram.api.schemas.MediaNoteResponse>>"
            X.0qQ.A0C(r3, r2)
            r2 = 833760202(0x31b22bca, float:5.18546E-9)
            java.lang.Object r3 = r3.A02(r1, r2, r9, r6)
            goto L_0x00a5
        L_0x01b5:
            boolean r2 = r0 instanceof X.C54346H8s
            if (r2 == 0) goto L_0x01e1
            r3 = r0
            X.H8s r3 = (X.C54346H8s) r3
            com.instagram.direct.inbox.notes.NotesApi r4 = r3.A02
            java.lang.String r2 = r3.A09
            long r15 = java.lang.Long.parseLong(r2)
            X.GPK r2 = r3.A00
            java.lang.String r8 = r2.A00
            java.lang.String r9 = r3.A05
            java.lang.String r10 = X.DbS.A0k()
            java.lang.String r11 = r3.A07
            java.lang.String r12 = r3.A0A
            java.lang.Integer r5 = r3.A04
            java.lang.String r13 = r3.A06
            java.lang.Integer r6 = r3.A03
            java.lang.String r7 = "❤️"
            r14 = r1
            java.lang.Object r3 = r4.A00(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            goto L_0x00a5
        L_0x01e1:
            boolean r2 = r0 instanceof X.C54343H8p
            if (r2 == 0) goto L_0x0265
            r3 = r0
            X.H8p r3 = (X.C54343H8p) r3
            com.instagram.common.session.UserSession r2 = r3.A01
            java.lang.String r13 = r3.A08
            java.lang.String r12 = r3.A03
            java.lang.String r11 = r3.A06
            java.lang.String r6 = r3.A09
            java.lang.String r7 = r3.A04
            java.lang.Integer r10 = r3.A02
            r4 = 0
            X.AnonymousClass7TF.A1H(r2, r13)
            X.0qQ.A0B(r12, r9)
            java.lang.String r8 = X.DbS.A0k()
            X.1NY r5 = X.DbU.A0M(r2)
            java.lang.String r15 = "api/"
            java.lang.String r14 = "v1/"
            java.lang.String r3 = "media/"
            java.lang.String r2 = "delete_note/"
            r5.A04()
            r5.A02()
            java.lang.String r2 = X.002.A0u(r15, r14, r3, r2)
            X.0qQ.A07(r2)
            r5.A0E = r2
            java.lang.Class<X.CCt> r3 = X.C43775CCt.class
            java.lang.Class<X.CyG> r2 = X.C45542CyG.class
            r5.A0Q(r3, r2)
            java.lang.String r2 = "note_id"
            X.C51968G9o.A1L(r5, r2, r13, r12)
            if (r11 == 0) goto L_0x022f
            java.lang.String r2 = "inventory_source"
            r5.A9m(r2, r11)
        L_0x022f:
            if (r8 == 0) goto L_0x0236
            java.lang.String r2 = "nav_chain"
            r5.A9m(r2, r8)
        L_0x0236:
            if (r10 == 0) goto L_0x0241
            int r3 = r10.intValue()
            java.lang.String r2 = "carousel_index"
            r5.A0C(r2, r3)
        L_0x0241:
            if (r7 == 0) goto L_0x0248
            java.lang.String r2 = "carousel_media_id"
            r5.A9m(r2, r7)
        L_0x0248:
            if (r6 == 0) goto L_0x024f
            java.lang.String r2 = "ranking_info_token"
            r5.A9m(r2, r6)
        L_0x024f:
            X.1OC r3 = r5.A0M()
            r2 = 8
            java.lang.String r2 = X.AnonymousClass000.A00(r2)
            X.0qQ.A0C(r3, r2)
            r2 = 833760202(0x31b22bca, float:5.18546E-9)
            java.lang.Object r3 = r3.A02(r1, r2, r9, r4)
            goto L_0x00a5
        L_0x0265:
            r3 = r0
            X.H8r r3 = (X.C54345H8r) r3
            com.instagram.direct.inbox.notes.NotesApi r4 = r3.A02
            java.lang.String r2 = r3.A09
            long r14 = java.lang.Long.parseLong(r2)
            X.GPK r2 = r3.A00
            java.lang.String r7 = r2.A00
            java.lang.String r8 = r3.A05
            java.lang.String r9 = X.DbS.A0k()
            java.lang.String r10 = r3.A07
            java.lang.String r11 = r3.A0A
            java.lang.Integer r5 = r3.A04
            java.lang.String r12 = r3.A06
            java.lang.Integer r6 = r3.A03
            r13 = r1
            java.lang.Object r3 = r4.A03(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            goto L_0x00a5
        L_0x028b:
            boolean r0 = r5 instanceof X.C54347H8t
            if (r0 == 0) goto L_0x02a5
            X.H8t r6 = (X.C54347H8t) r6
            com.instagram.common.session.UserSession r4 = r6.A01
            java.lang.String r3 = r6.A08
            java.lang.String r0 = r6.A09
            r2 = 0
            X.C51973G9u.A1E(r4, r3, r0)
            X.I2Z.A02(r4, r3, r0, r2)
            X.0sP r0 = r6.A0B
            X.C51968G9o.A1O(r0, r2)
            goto L_0x0076
        L_0x02a5:
            boolean r0 = r5 instanceof X.C54348H8u
            if (r0 == 0) goto L_0x035c
            X.H8u r6 = (X.C54348H8u) r6
            java.lang.String r8 = r6.A0E
            boolean r0 = X.00l.A0W(r8)
            if (r0 != 0) goto L_0x0076
            r7 = 0
            X.1hu r3 = new X.1hu
            r3.<init>(r7)
            r4 = 0
            r2 = 6
            X.1E9 r0 = new X.1E9
            r0.<init>(r3, r2, r4)
            X.54t r0 = new X.54t
            r24 = r7
            r25 = r7
            r26 = r7
            r27 = r7
            r28 = r7
            r29 = r7
            r30 = r7
            r31 = r7
            r32 = r7
            r33 = r7
            r34 = r7
            r35 = r7
            r22 = r0
            r23 = r7
            r22.<init>(r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35)
            X.Gz3 r7 = new X.Gz3
            r7.<init>(r0)
            com.instagram.direct.inbox.notes.models.NoteAudience r0 = r6.A04
            int r2 = r0.A00
            java.lang.Integer r0 = new java.lang.Integer
            r0.<init>(r2)
            r7.A03 = r0
            r2 = 0
            java.lang.Long r0 = new java.lang.Long
            r0.<init>(r2)
            r7.A04 = r0
            r2 = -1
            java.lang.Long r0 = new java.lang.Long
            r0.<init>(r2)
            r7.A05 = r0
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r4)
            r7.A01 = r2
            java.lang.String r0 = r6.A0C
            r7.A06 = r0
            java.lang.String r10 = r6.A0B
            r7.A07 = r10
            r7.A08 = r8
            X.0eE r0 = X.AnonymousClass0t1.A01
            com.instagram.common.session.UserSession r8 = r6.A02
            com.instagram.user.model.User r0 = r0.A01(r8)
            r7.A00 = r0
            java.lang.String r0 = r8.A06
            r7.A09 = r0
            r7.A02 = r2
            X.0sn r0 = X.0sn.A00
            r7.A0B = r0
            r7.A0A = r0
            X.54t r7 = r7.A00()
            X.4JM r0 = r6.A03
            X.0qQ.A0B(r10, r4)
            X.05G r6 = r0.A00
        L_0x0334:
            java.lang.Object r4 = r6.getValue()
            r0 = r4
            java.util.Map r0 = (java.util.Map) r0
            X.0Ym r3 = new X.0Ym
            r3.<init>()
            r3.putAll(r0)
            X.9IP r2 = new X.9IP
            r0 = r18
            r2.<init>((X.C2809254t) r7, (boolean) r0)
            r3.put(r10, r2)
            X.0Ym r0 = X.0se.A0N(r3)
            boolean r0 = r6.AIY(r4, r0)
            if (r0 == 0) goto L_0x0334
            X.I2Z.A01(r7, r8, r10)
            goto L_0x0076
        L_0x035c:
            boolean r0 = r5 instanceof X.C54346H8s
            if (r0 == 0) goto L_0x0378
            X.H8s r6 = (X.C54346H8s) r6
            com.instagram.common.session.UserSession r4 = r6.A01
            java.lang.String r3 = r6.A08
            java.lang.String r2 = r6.A09
            boolean r0 = X.C51973G9u.A1b(r4, r3, r2)
            X.I2Z.A02(r4, r3, r2, r0)
            X.0sP r2 = r6.A0B
            r0 = r18
            X.C51968G9o.A1O(r2, r0)
            goto L_0x0076
        L_0x0378:
            boolean r0 = r5 instanceof X.C54343H8p
            if (r0 == 0) goto L_0x03ab
            X.H8p r6 = (X.C54343H8p) r6
            com.instagram.common.session.UserSession r7 = r6.A01
            java.lang.String r0 = r6.A07
            java.lang.String r6 = r6.A08
            X.AnonymousClass7TG.A1T(r7, r0, r6)
            X.1Xj r4 = X.I2Z.A00(r7, r0)
            if (r4 == 0) goto L_0x0076
            java.util.List r0 = r4.A3b()
            if (r0 != 0) goto L_0x0395
            X.0sn r0 = X.0sn.A00
        L_0x0395:
            java.util.ArrayList r3 = X.00k.A0U(r0)
            r2 = 22
            X.MYK r0 = new X.MYK
            r0.<init>(r6, r2)
            X.018.A1A(r3, r0)
            r4.A4I(r3)
            X.C51967G9n.A1K(r7, r4)
            goto L_0x0076
        L_0x03ab:
            X.H8r r6 = (X.C54345H8r) r6
            com.instagram.common.session.UserSession r4 = r6.A01
            java.lang.String r3 = r6.A08
            java.lang.String r0 = r6.A09
            r2 = 0
            X.C51973G9u.A1E(r4, r3, r0)
            X.I2Z.A02(r4, r3, r0, r2)
            X.0sP r0 = r6.A0B
            X.C51968G9o.A1O(r0, r2)
            goto L_0x0076
        L_0x03c1:
            java.lang.Object r0 = r1.A01
            com.instagram.contentnotes.data.OptimisticNetworkOperation r0 = (com.instagram.contentnotes.data.OptimisticNetworkOperation) r0
            X.0eS.A00(r3)
        L_0x03c8:
            X.3Ii r3 = (X.C239803Ii) r3
            boolean r2 = r3 instanceof X.C239793Ih
            if (r2 == 0) goto L_0x0429
            r2 = r3
            X.3Ih r2 = (X.C239793Ih) r2
            java.lang.Object r4 = r2.A00
            X.1XR r4 = (X.1XR) r4
            r1.A01 = r3
            r2 = r19
            r1.A00 = r2
            boolean r1 = r0 instanceof X.C54348H8u
            if (r1 == 0) goto L_0x0428
            X.H8u r0 = (X.C54348H8u) r0
            X.371 r4 = (X.AnonymousClass371) r4
            java.lang.Object r8 = r4.FH3()
            X.0qQ.A07(r8)
            X.54t r8 = (X.C2809254t) r8
            X.4JM r1 = r0.A03
            java.lang.String r7 = r0.A0B
            r6 = 0
            X.AnonymousClass7TF.A1H(r7, r8)
            X.05G r5 = r1.A00
        L_0x03f6:
            java.lang.Object r4 = r5.getValue()
            r1 = r4
            java.util.Map r1 = (java.util.Map) r1
            X.0Ym r2 = new X.0Ym
            r2.<init>()
            r2.putAll(r1)
            X.9IP r1 = new X.9IP
            r1.<init>((X.C2809254t) r8, (boolean) r6)
            r2.put(r7, r1)
            X.0Ym r1 = X.0se.A0N(r2)
            boolean r1 = r5.AIY(r4, r1)
            if (r1 == 0) goto L_0x03f6
            com.instagram.common.session.UserSession r0 = r0.A02
            X.I2Z.A01(r8, r0, r7)
            X.1Ng r1 = X.AnonymousClass1Nd.A00(r0)
            X.INc r0 = new X.INc
            r0.<init>(r7)
            r1.A00(r0)
        L_0x0428:
            return r3
        L_0x0429:
            boolean r2 = r3 instanceof X.C297815sO
            if (r2 == 0) goto L_0x0539
            r1.A01 = r3
            r2 = r20
            r1.A00 = r2
            boolean r1 = r0 instanceof X.C54347H8t
            if (r1 == 0) goto L_0x044e
            X.H8t r0 = (X.C54347H8t) r0
            com.instagram.common.session.UserSession r5 = r0.A01
            java.lang.String r4 = r0.A08
            java.lang.String r2 = r0.A09
            boolean r1 = X.C51973G9u.A1b(r5, r4, r2)
            X.I2Z.A02(r5, r4, r2, r1)
            X.0sP r1 = r0.A0B
            r0 = r18
            X.C51968G9o.A1O(r1, r0)
            return r3
        L_0x044e:
            boolean r1 = r0 instanceof X.C54348H8u
            if (r1 == 0) goto L_0x04bc
            X.H8u r0 = (X.C54348H8u) r0
            X.4JM r2 = r0.A03
            java.lang.String r4 = r0.A0B
            java.lang.String r1 = r0.A0C
            r2.A00(r4, r1)
            X.54u r2 = r0.A01
            if (r2 == 0) goto L_0x0487
            com.instagram.common.session.UserSession r1 = r0.A02
            X.I2Z.A01(r2, r1, r4)
        L_0x0466:
            X.0wj r4 = X.0wj.A01
            r2 = 817892647(0x30c00d27, float:1.3973577E-9)
            java.lang.String r1 = "android_post_note_failed"
            X.DbT.A1Q(r4, r1, r2)
            java.lang.String r2 = r0.A09
            r0 = 0
            X.0qQ.A0B(r2, r0)
            X.6ap r1 = X.DbV.A0X()
            java.lang.String r0 = "content_note_share_failure"
            r1.A0H = r0
            r1.A0D = r2
            r1.A06()
            X.DbY.A1N(r1)
            return r3
        L_0x0487:
            com.instagram.common.session.UserSession r5 = r0.A02
            X.AnonymousClass7TG.A1N(r5, r4)
            X.1Xj r4 = X.I2Z.A00(r5, r4)
            if (r4 == 0) goto L_0x0466
            java.util.List r1 = r4.A3b()
            if (r1 != 0) goto L_0x049a
            X.0sn r1 = X.0sn.A00
        L_0x049a:
            java.util.ArrayList r2 = X.00k.A0U(r1)
            java.lang.Object r1 = X.00k.A0J(r2)
            X.54u r1 = (X.C2809354u) r1
            if (r1 == 0) goto L_0x04ba
            java.lang.String r1 = r1.getUserId()
        L_0x04aa:
            boolean r1 = X.C51966G9m.A1W(r5, r1)
            if (r1 == 0) goto L_0x0466
            X.018.A13(r2)
            r4.A4I(r2)
            X.C51967G9n.A1K(r5, r4)
            goto L_0x0466
        L_0x04ba:
            r1 = 0
            goto L_0x04aa
        L_0x04bc:
            boolean r1 = r0 instanceof X.C54346H8s
            if (r1 == 0) goto L_0x04d5
            X.H8s r0 = (X.C54346H8s) r0
            com.instagram.common.session.UserSession r5 = r0.A01
            java.lang.String r4 = r0.A08
            java.lang.String r2 = r0.A09
            r1 = 0
            X.C51973G9u.A1E(r5, r4, r2)
            X.I2Z.A02(r5, r4, r2, r1)
            X.0sP r0 = r0.A0B
            X.C51968G9o.A1O(r0, r1)
            return r3
        L_0x04d5:
            boolean r1 = r0 instanceof X.C54343H8p
            if (r1 == 0) goto L_0x0509
            X.H8p r0 = (X.C54343H8p) r0
            X.54u r4 = r0.A00
            if (r4 == 0) goto L_0x04e6
            com.instagram.common.session.UserSession r2 = r0.A01
            java.lang.String r1 = r0.A07
            X.I2Z.A01(r4, r2, r1)
        L_0x04e6:
            X.0wj r4 = X.0wj.A01
            r2 = 817892647(0x30c00d27, float:1.3973577E-9)
            java.lang.String r1 = "android_delete_note_failed"
            X.DbT.A1Q(r4, r1, r2)
            java.lang.String r4 = r0.A05
            r0 = 0
            X.0qQ.A0B(r4, r0)
            X.1xC r2 = X.1xC.A01
            X.6ap r1 = X.DbV.A0X()
            java.lang.String r0 = "content_note_delete_failure"
            r1.A0H = r0
            r1.A0D = r4
            r1.A06()
            X.DbY.A1K(r2, r1)
            return r3
        L_0x0509:
            boolean r1 = r0 instanceof X.C54345H8r
            if (r1 == 0) goto L_0x0524
            X.H8r r0 = (X.C54345H8r) r0
            com.instagram.common.session.UserSession r5 = r0.A01
            java.lang.String r4 = r0.A08
            java.lang.String r2 = r0.A09
            boolean r1 = X.C51973G9u.A1b(r5, r4, r2)
            X.I2Z.A02(r5, r4, r2, r1)
            X.0sP r1 = r0.A0B
            r0 = r18
            X.C51968G9o.A1O(r1, r0)
            return r3
        L_0x0524:
            X.H8q r0 = (X.C54344H8q) r0
            com.instagram.common.session.UserSession r5 = r0.A01
            java.lang.String r4 = r0.A08
            java.lang.String r2 = r0.A09
            r1 = 0
            X.C51973G9u.A1E(r5, r4, r2)
            X.I2Z.A02(r5, r4, r2, r1)
            X.0sP r0 = r0.A0B
            X.C51968G9o.A1O(r0, r1)
            return r3
        L_0x0539:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.contentnotes.data.OptimisticNetworkOperation.A00(X.4D7):java.lang.Object");
    }
}
