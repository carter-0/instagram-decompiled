package X;

import java.util.List;

/* renamed from: X.OrP  reason: case insensitive filesystem */
public final class C71822OrP implements 2IR {
    public final /* synthetic */ C55868Hop A00;
    public final /* synthetic */ C63869L9y A01;
    public final /* synthetic */ C71108Ocm A02;
    public final /* synthetic */ List A03;
    public final /* synthetic */ List A04;
    public final /* synthetic */ 0r1 A05;
    public final /* synthetic */ 0r1 A06;
    public final /* synthetic */ 0r1 A07;
    public final /* synthetic */ 0r1 A08;
    public final /* synthetic */ 0rm A09;

    public C71822OrP(C55868Hop hop, C63869L9y l9y, C71108Ocm ocm, List list, List list2, 0r1 r6, 0r1 r7, 0r1 r8, 0r1 r9, 0rm r10) {
        this.A01 = l9y;
        this.A02 = ocm;
        this.A08 = r6;
        this.A00 = hop;
        this.A06 = r7;
        this.A07 = r8;
        this.A09 = r10;
        this.A05 = r9;
        this.A03 = list;
        this.A04 = list2;
    }

    public final void onFailure(Throwable th) {
        C55868Hop hop = this.A00;
        0Aj A0e = AnonymousClass7TE.A0e(hop.A01, "ig_search_meta_ai_hcm_hidden_response_fail");
        if (A0e.isSampled()) {
            C51976G9y.A0Y(A0e, hop, C66584MXp.A0T(A0e, hop));
            A0e.Cgf();
        }
        C71108Ocm ocm = this.A02;
        C63869L9y l9y = this.A01;
        String str = l9y.A05;
        String str2 = l9y.A04;
        C71108Ocm.A03(ocm, str, str2, new C20705Wxc(C71108Ocm.A00(ocm, str, str2), 14));
    }

    /* JADX WARNING: Removed duplicated region for block: B:112:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x02d4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r48) {
        /*
            r47 = this;
            r0 = r48
            X.3JD r0 = (X.AnonymousClass3JD) r0
            if (r0 == 0) goto L_0x038b
            X.3lr r3 = X.C41845B3m.A0U(r0)
            if (r3 == 0) goto L_0x038b
            java.lang.Class<X.C4X> r2 = X.C4X.class
            r4 = 0
            java.lang.String r1 = "xdt_fbsearch__meta_ai_hcm_stream(request_data:{\"entrypoint\":$entrypoint,\"query\":$query,\"search_session_id\":$search_session_id})"
            r0 = -2061672926(0xffffffff851d5e22, float:-7.399394E-36)
            X.3lr r3 = r3.getRequiredTreeField(r4, r1, r2, r0)
            if (r3 == 0) goto L_0x038b
            java.lang.Class<X.C4W> r2 = X.C4W.class
            r0 = 2911(0xb5f, float:4.079E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            r0 = -956697872(0xffffffffc6f9f2f0, float:-31993.469)
            com.google.common.collect.ImmutableList r0 = r3.getRequiredCompactedTreeListField(r4, r1, r2, r0)
        L_0x0029:
            java.lang.StringBuilder r12 = X.AnonymousClass7TE.A1A()
            if (r0 == 0) goto L_0x0387
            java.lang.Object r4 = X.00k.A0J(r0)
            X.3lr r4 = (X.C250663lr) r4
            if (r4 == 0) goto L_0x0387
            X.Nka r3 = X.C69396Nka.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            r2 = 6
            java.lang.String r1 = "module_type"
            java.lang.Enum r18 = r4.getOptionalEnumField(r2, r1, r3)
        L_0x0040:
            r1 = r47
            X.L9y r4 = r1.A01
            java.lang.String r2 = r4.A03
            r21 = r2
            java.lang.String r42 = ""
            r46 = 14
            X.QP5 r35 = new X.QP5
            r41 = r35
            r43 = r2
            r44 = r42
            r45 = r42
            r41.<init>(r42, r43, r44, r45, r46)
            if (r0 == 0) goto L_0x026f
            X.Ocm r15 = r1.A02
            X.0r1 r2 = r1.A05
            r31 = r2
            X.0r1 r2 = r1.A06
            r30 = r2
            X.0r1 r2 = r1.A08
            r29 = r2
            X.0r1 r2 = r1.A07
            r28 = r2
            X.Hop r14 = r1.A00
            java.util.List r2 = r1.A03
            r27 = r2
            java.util.List r2 = r1.A04
            r26 = r2
            X.0rm r2 = r1.A09
            r25 = r2
            java.util.Iterator r17 = r0.iterator()
            r22 = r42
            r3 = 0
            r13 = 0
            r34 = 0
        L_0x0085:
            boolean r2 = r17.hasNext()
            if (r2 == 0) goto L_0x0274
            r17.next()
            int r16 = r3 + 1
            if (r3 < 0) goto L_0x038e
            java.lang.Object r2 = r0.get(r3)
            X.3lr r2 = (X.C250663lr) r2
            X.Nke r11 = X.C69400Nke.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            r5 = 0
            java.lang.String r10 = "status"
            java.lang.Enum r6 = r2.getRequiredEnumField(r5, r10, r11)
            X.Nke r2 = X.C69400Nke.REFUSAL
            if (r6 != r2) goto L_0x00b8
            java.lang.String r5 = r4.A05
            java.lang.String r3 = r4.A04
            java.lang.Object r2 = X.C71108Ocm.A00(r15, r5, r3)
            r1 = 15
            X.Wxc r0 = new X.Wxc
            r0.<init>(r2, r1)
            X.C71108Ocm.A03(r15, r5, r3, r0)
        L_0x00b7:
            return
        L_0x00b8:
            java.lang.Object r2 = r0.get(r3)
            X.3lr r2 = (X.C250663lr) r2
            java.lang.String r6 = "text"
            java.lang.String r2 = r2.A08(r6)
            if (r2 == 0) goto L_0x00c9
            r12.append(r2)
        L_0x00c9:
            java.lang.Object r2 = r0.get(r3)
            X.3lr r2 = (X.C250663lr) r2
            java.lang.String r7 = "replacement_text"
            java.lang.String r2 = r2.A09(r7)
            if (r2 == 0) goto L_0x00e7
            r12.setLength(r5)
            java.lang.Object r2 = r0.get(r3)
            X.3lr r2 = (X.C250663lr) r2
            java.lang.String r2 = r2.A09(r7)
            r12.append(r2)
        L_0x00e7:
            java.lang.Object r7 = r0.get(r3)
            X.3lr r7 = (X.C250663lr) r7
            java.lang.String r2 = "text_response_id"
            java.lang.String r8 = r7.A0B(r2)
            java.lang.Object r7 = r0.get(r3)
            X.3lr r7 = (X.C250663lr) r7
            java.lang.String r2 = "text_request_id"
            java.lang.String r23 = r7.A0A(r2)
            if (r8 == 0) goto L_0x0215
            boolean r2 = X.00l.A0W(r8)
            if (r2 != 0) goto L_0x0215
            r2 = r31
            boolean r7 = r2.A00
            r2 = 1
            if (r7 != 0) goto L_0x0112
            r7 = r31
            r7.A00 = r2
        L_0x0112:
            r22 = r8
        L_0x0114:
            java.lang.Object r9 = r0.get(r3)
            X.3lr r9 = (X.C250663lr) r9
            r8 = 5
            java.lang.String r7 = "is_final_text_chunk"
            boolean r7 = r9.getRequiredBooleanField(r8, r7)
            if (r7 == 0) goto L_0x0131
            r7 = r30
            boolean r7 = r7.A00
            if (r7 != 0) goto L_0x012d
            r7 = r29
            r7.A00 = r2
        L_0x012d:
            r7 = r30
            r7.A00 = r2
        L_0x0131:
            java.lang.Object r7 = r0.get(r3)
            X.3lr r7 = (X.C250663lr) r7
            java.lang.Enum r8 = r7.getRequiredEnumField(r5, r10, r11)
            X.Nke r7 = X.C69400Nke.STOPPED
            if (r8 != r7) goto L_0x0143
            r7 = r28
            r7.A00 = r2
        L_0x0143:
            java.lang.Object r11 = r0.get(r3)
            X.3lr r11 = (X.C250663lr) r11
            java.lang.Class<X.URU> r10 = X.URU.class
            r9 = 7
            java.lang.String r8 = "search_plugin_response"
            r7 = -1269398467(0xffffffffb456843d, float:-1.9978411E-7)
            X.3lr r7 = r11.getOptionalTreeField(r9, r8, r10, r7)
            if (r7 == 0) goto L_0x0188
            java.lang.String r8 = "attribution_link"
            java.lang.String r13 = r7.A09(r8)
            X.NkY r10 = X.C69394NkY.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r9 = "search_engine"
            java.lang.Enum r9 = r7.getOptionalEnumField(r5, r9, r10)
            java.lang.String r38 = java.lang.String.valueOf(r9)
            java.lang.String r9 = "search_query"
            java.lang.String r37 = r7.getOptionalStringField(r2, r9)
            java.lang.String r39 = r7.A09(r8)
            r9 = 3
            java.lang.String r8 = "search_result_uri"
            com.google.common.collect.ImmutableList r36 = r7.getRequiredCompactedStringListField(r9, r8)
            r9 = 4
            java.lang.String r8 = "references_title"
            com.google.common.collect.ImmutableList r35 = r7.getRequiredCompactedStringListField(r9, r8)
            r40 = 8
            X.Jw0 r34 = new X.Jw0
            r34.<init>(r35, r36, r37, r38, r39, r40)
        L_0x0188:
            java.lang.String r20 = X.DbT.A10(r12)
            X.QP5 r35 = new X.QP5
            r19 = r35
            r24 = r46
            r19.<init>(r20, r21, r22, r23, r24)
            java.lang.Object r11 = r0.get(r3)
            X.3lr r11 = (X.C250663lr) r11
            java.lang.Class<X.C4V> r10 = X.C4V.class
            r9 = 8
            java.lang.String r8 = "prompts"
            r7 = 1970796863(0x7577f93f, float:3.143439E32)
            com.google.common.collect.ImmutableList r11 = r11.getOptionalCompactedTreeListField(r9, r8, r10, r7)
            if (r11 == 0) goto L_0x026b
            java.lang.Object r3 = r0.get(r3)
            X.3lr r3 = (X.C250663lr) r3
            com.google.common.collect.ImmutableList r3 = r3.getOptionalCompactedTreeListField(r9, r8, r10, r7)
            if (r3 == 0) goto L_0x0238
            java.util.ArrayList r10 = X.AnonymousClass7TG.A0r(r3)
            java.util.Iterator r11 = r3.iterator()
            r8 = 0
        L_0x01bf:
            boolean r3 = r11.hasNext()
            if (r3 == 0) goto L_0x0218
            java.lang.Object r7 = r11.next()
            int r41 = r8 + 1
            if (r8 < 0) goto L_0x038e
            X.3lr r7 = (X.C250663lr) r7
            java.lang.String r3 = "prompt_id"
            java.lang.String r9 = r7.getOptionalStringField(r5, r3)
            if (r9 != 0) goto L_0x01d9
            r9 = r42
        L_0x01d9:
            r8 = r27
            r8.add(r9)
            java.lang.String r9 = r7.getRequiredStringField(r2, r6)
            X.0qQ.A07(r9)
            r8 = r26
            r8.add(r9)
            java.lang.String r37 = r7.getRequiredStringField(r2, r6)
            X.0qQ.A07(r37)
            java.lang.String r38 = r7.getRequiredStringField(r2, r6)
            X.0qQ.A07(r38)
            r9 = 2
            java.lang.String r8 = "source"
            java.lang.String r39 = r7.getRequiredStringField(r9, r8)
            X.0qQ.A07(r39)
            java.lang.String r40 = r7.getOptionalStringField(r5, r3)
            r36 = 0
            X.UO1 r3 = new X.UO1
            r33 = r3
            r33.<init>(r34, r35, r36, r37, r38, r39, r40, r41)
            r10.add(r3)
            r8 = r41
            goto L_0x01bf
        L_0x0215:
            r2 = 1
            goto L_0x0114
        L_0x0218:
            java.lang.Integer r8 = X.AnonymousClass05K.A0C
            java.lang.String r3 = r4.A05
            java.lang.String r2 = r4.A04
            java.lang.Object r2 = X.C71108Ocm.A00(r15, r3, r2)
            X.N4N r2 = (X.N4N) r2
            X.Jvf r2 = r2.A06
            boolean r2 = r2.A06
            X.N62 r3 = new X.N62
            r5 = r3
            r6 = r34
            r7 = r35
            r9 = r10
            r10 = r2
            r5.<init>(r6, r7, r8, r9, r10)
            r2 = r25
            r2.A00 = r3
        L_0x0238:
            java.util.List r6 = X.00k.A0a(r27)
            java.util.List r5 = X.00k.A0a(r26)
            X.0wc r3 = r14.A01
            java.lang.String r2 = "ig_search_meta_ai_hcm_prompt_response_complete"
            X.0Aj r3 = X.AnonymousClass7TE.A0e(r3, r2)
            boolean r2 = r3.isSampled()
            if (r2 == 0) goto L_0x026b
            X.0iw r2 = r14.A00
            X.C51969G9p.A1A(r3, r2)
            java.lang.String r2 = X.DbS.A0k()
            if (r2 != 0) goto L_0x025b
            r2 = r42
        L_0x025b:
            X.C66584MXp.A0s(r3, r14, r2)
            java.lang.String r2 = "prompt_id_list"
            r3.AAe(r2, r6)
            java.lang.String r2 = "prompt_text_list"
            r3.AAe(r2, r5)
            r3.Cgf()
        L_0x026b:
            r3 = r16
            goto L_0x0085
        L_0x026f:
            r13 = 0
            r34 = 0
        L_0x0272:
            r6 = 0
            goto L_0x028b
        L_0x0274:
            int r3 = r0.size()
            r2 = 1
            int r3 = r3 - r2
            java.lang.Object r5 = r0.get(r3)
            X.3lr r5 = (X.C250663lr) r5
            if (r5 == 0) goto L_0x0272
            X.Nke r3 = X.C69400Nke.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            r2 = 0
            java.lang.String r0 = "status"
            java.lang.Enum r6 = r5.getRequiredEnumField(r2, r0, r3)
        L_0x028b:
            android.text.Editable$Factory r0 = android.text.Editable.Factory.getInstance()
            android.text.Editable r7 = r0.newEditable(r12)
            X.Ocm r3 = r1.A02
            android.content.Context r5 = r3.A00
            r0 = 2130970129(0x7f040611, float:1.754896E38)
            int r22 = X.AnonymousClass7TF.A03(r5, r0)
            r0 = 2130970132(0x7f040614, float:1.7548965E38)
            int r23 = X.AnonymousClass7TF.A03(r5, r0)
            r0 = 2130971414(0x7f040b16, float:1.7551566E38)
            int r24 = X.AnonymousClass7TF.A03(r5, r0)
            r21 = 0
            r2 = 0
            r26 = 1
            r25 = -1
            X.Mhg r0 = new X.Mhg
            r19 = r0
            r20 = r5
            r27 = r25
            r28 = r26
            r29 = r26
            r30 = r26
            r31 = r26
            r32 = r2
            r33 = r2
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
            X.0qQ.A0A(r7)
            r0.A01(r7, r2)
            X.Nke r0 = X.C69400Nke.INELIGIBLE
            if (r6 == r0) goto L_0x00b7
            X.0r1 r8 = r1.A08
            boolean r0 = r8.A00
            if (r0 == 0) goto L_0x032a
            X.Hop r5 = r1.A00
            if (r13 != 0) goto L_0x02e0
            r13 = r42
        L_0x02e0:
            X.0wc r6 = r5.A01
            java.lang.String r0 = "ig_search_meta_ai_hcm_text_response_complete"
            X.0Aj r6 = X.AnonymousClass7TE.A0e(r6, r0)
            boolean r0 = r6.isSampled()
            if (r0 == 0) goto L_0x0328
            X.0iw r0 = r5.A00
            X.C51969G9p.A1A(r6, r0)
            java.lang.String r0 = X.DbS.A0k()
            if (r0 != 0) goto L_0x02fb
            r0 = r42
        L_0x02fb:
            X.C66584MXp.A0s(r6, r5, r0)
            X.OK9 r9 = r5.A03
            java.lang.String r5 = r9.A00()
            java.lang.String r0 = "text_response_id"
            r6.AAJ(r0, r5)
            X.UZq r0 = r9.A00
            X.MuC r0 = r0.A07()
            X.N4N r0 = X.C67757MuC.A01(r0)
            X.Jvf r0 = r0.A06
            java.lang.String r5 = r0.A03
            r0 = 4098(0x1002, float:5.743E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r6.AAJ(r0, r5)
            java.lang.String r0 = "third_party_link"
            r6.AAJ(r0, r13)
            r6.Cgf()
        L_0x0328:
            r8.A00 = r2
        L_0x032a:
            java.lang.Integer r38 = X.AnonymousClass05K.A0C
            X.0r1 r0 = r1.A06
            boolean r10 = r0.A00
            X.0r1 r0 = r1.A07
            boolean r9 = r0.A00
            X.0rm r5 = r1.A09
            java.lang.Object r6 = r5.A00
            boolean r41 = X.AnonymousClass7TF.A1V(r6)
            X.N62 r6 = (X.N62) r6
            X.0r1 r0 = r1.A05
            boolean r2 = r0.A00
            r1 = 12
            X.Jvg r0 = new X.Jvg
            r0.<init>((boolean) r2, (boolean) r10, (int) r1)
            X.N3A r8 = new X.N3A
            r32 = r8
            r33 = r0
            r36 = r6
            r37 = r7
            r39 = r10
            r40 = r9
            r32.<init>(r33, r34, r35, r36, r37, r38, r39, r40, r41)
            X.Nka r1 = X.C69396Nka.RESPONSE
            r0 = r18
            if (r0 != r1) goto L_0x0373
            java.lang.String r6 = r4.A05
            java.lang.String r4 = r4.A04
            java.lang.Object r1 = X.C71108Ocm.A00(r3, r6, r4)
            r0 = 28
            X.J6m r2 = new X.J6m
            r2.<init>((int) r0, (java.lang.Object) r5, (java.lang.Object) r8, (java.lang.Object) r1)
        L_0x036f:
            X.C71108Ocm.A03(r3, r6, r4, r2)
            return
        L_0x0373:
            X.Nka r1 = X.C69396Nka.PROMPTS_ONLY
            if (r0 != r1) goto L_0x00b7
            java.lang.String r6 = r4.A05
            java.lang.String r4 = r4.A04
            java.lang.Object r1 = X.C71108Ocm.A00(r3, r6, r4)
            r0 = 41
            X.PqS r2 = new X.PqS
            r2.<init>((int) r0, (java.lang.Object) r1, (java.lang.Object) r5)
            goto L_0x036f
        L_0x0387:
            r18 = 0
            goto L_0x0040
        L_0x038b:
            r0 = 0
            goto L_0x0029
        L_0x038e:
            X.0sr.A1T()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71822OrP.onSuccess(java.lang.Object):void");
    }
}
