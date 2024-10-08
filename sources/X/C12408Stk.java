package X;

/* renamed from: X.Stk  reason: case insensitive filesystem */
public final class C12408Stk implements 2FO {
    public final C58840Ae A00;

    /* JADX WARNING: Code restructure failed: missing block: B:139:0x046a, code lost:
        if (r16.isSampled() == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x046c, code lost:
        r16.AAJ(r59, r13);
        r0 = r16;
        r0.A8M(X.2M7.A0I, "product_type");
        X.JTU.A0t(X.C2818559v.ANDROID, r0, r15);
        r16.Cgf();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x0485, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x02ee, code lost:
        if (r2.isSampled() == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x02f0, code lost:
        r2.AAJ(r59, r13);
        r2.A8M(X.2M7.A0I, "product_type");
        X.JTU.A0t(X.C2818559v.ANDROID, r2, r1);
        r2.Cgf();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0305, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x035f, code lost:
        if (r15.isSampled() == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0361, code lost:
        r15.AAJ(r59, r13);
        r15.A8M(X.2M7.A0I, "product_type");
        X.JTU.A0t(X.C2818559v.ANDROID, r15, r1);
        r15.Cgf();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0376, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Cgl(java.lang.String r62, java.util.Map r63) {
        /*
            r61 = this;
            r0 = 0
            r1 = r62
            X.0qQ.A0B(r1, r0)
            java.lang.String r60 = "Required value was null."
            r15 = r63
            if (r63 == 0) goto L_0x04d4
            java.lang.String r59 = X.Py7.A00()
            r0 = r59
            java.lang.Object r13 = r15.get(r0)
            if (r13 == 0) goto L_0x04cf
            java.lang.String r13 = (java.lang.String) r13
            java.lang.String r0 = "financial_entity_id"
            java.lang.String r14 = X.DbU.A0r(r0, r15)
            java.lang.String r12 = "managed_merchant_account_id"
            java.lang.String r11 = X.DbU.A0r(r12, r15)
            java.lang.String r0 = "view_name"
            java.lang.String r2 = X.DbT.A11(r0, r15)
            if (r2 == 0) goto L_0x0486
            java.lang.String r10 = X.AnonymousClass7TF.A0j(r2)
        L_0x0034:
            java.lang.String r9 = "batch_item_id"
            java.lang.String r8 = X.DbT.A11(r9, r15)
            java.lang.String r58 = "payout_status"
            r2 = r58
            java.lang.String r57 = X.DbU.A0r(r2, r15)
            java.lang.String r56 = "target_name"
            r2 = r56
            java.lang.String r55 = X.DbU.A0r(r2, r15)
            java.lang.String r2 = "ref"
            java.lang.String r54 = X.DbU.A0r(r2, r15)
            java.lang.String r7 = "payout_record_id"
            java.lang.String r6 = X.DbU.A0r(r7, r15)
            java.lang.String r2 = "filter_type"
            java.lang.String r53 = X.DbU.A0r(r2, r15)
            java.lang.String r52 = "start_cursor"
            r2 = r52
            java.lang.String r5 = X.DbU.A0r(r2, r15)
            java.lang.String r51 = "end_cursor"
            r2 = r51
            java.lang.String r4 = X.DbU.A0r(r2, r15)
            java.lang.String r50 = "has_next_page"
            r2 = r50
            java.lang.Object r3 = r15.get(r2)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            java.lang.String r49 = "target_url"
            r2 = r49
            java.lang.String r48 = X.DbU.A0r(r2, r15)
            java.lang.String r47 = "notification_identifier"
            r2 = r47
            java.lang.String r46 = X.DbU.A0r(r2, r15)
            java.lang.String r45 = "notification_source"
            r2 = r45
            java.lang.String r44 = X.DbU.A0r(r2, r15)
            java.lang.String r43 = "cta_text"
            r2 = r43
            java.lang.String r42 = X.DbU.A0r(r2, r15)
            java.lang.String r41 = "cta_uri"
            r2 = r41
            java.lang.String r40 = X.DbU.A0r(r2, r15)
            java.lang.String r39 = "cta_title"
            r2 = r39
            java.lang.String r38 = X.DbU.A0r(r2, r15)
            java.lang.String r37 = "notification_id_list"
            r2 = r37
            java.util.List r36 = X.C66580MXl.A13(r2, r15)
            java.lang.String r35 = "holds_list"
            r2 = r35
            java.util.List r34 = X.C66580MXl.A13(r2, r15)
            java.lang.String r33 = "error_message"
            r2 = r33
            java.lang.String r32 = X.DbT.A11(r2, r15)
            java.lang.String r31 = "exception_class"
            r2 = r31
            java.lang.String r30 = X.DbT.A11(r2, r15)
            java.lang.String r29 = "error_stacktrace"
            r2 = r29
            java.lang.String r18 = X.DbU.A0r(r2, r15)
            java.lang.String r28 = "endpoint"
            r2 = r28
            java.lang.String r27 = X.DbT.A11(r2, r15)
            java.lang.String r26 = "earning_summary"
            r2 = r26
            java.lang.Object r25 = r15.get(r2)
            r2 = r25
            java.util.Map r2 = (java.util.Map) r2
            r25 = r2
            java.lang.String r24 = "earning_summary_breakdown"
            r2 = r24
            java.lang.Object r23 = r15.get(r2)
            r2 = r23
            java.util.Map r2 = (java.util.Map) r2
            r23 = r2
            java.lang.String r22 = "payout_summary"
            r2 = r22
            java.lang.Object r21 = r15.get(r2)
            r2 = r21
            java.util.Map r2 = (java.util.Map) r2
            r21 = r2
            java.lang.String r2 = "transactions_id_list"
            java.lang.Object r20 = r15.get(r2)
            r2 = r20
            java.util.Map r2 = (java.util.Map) r2
            r20 = r2
            java.lang.String r2 = "financial_entities_id_list"
            java.util.List r19 = X.C66580MXl.A13(r2, r15)
            java.lang.String r17 = "is_valid"
            r2 = r17
            java.lang.Object r2 = r15.get(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            int r16 = r1.hashCode()
            r15 = r61
            switch(r16) {
                case -559811674: goto L_0x0131;
                case -552250925: goto L_0x019c;
                case -552149051: goto L_0x01bf;
                case 201917415: goto L_0x020d;
                case 202019289: goto L_0x0287;
                case 375891437: goto L_0x0306;
                case 1131924782: goto L_0x0333;
                case 1587016346: goto L_0x0377;
                default: goto L_0x0130;
            }
        L_0x0130:
            return
        L_0x0131:
            java.lang.String r2 = "user_click_payouthub_atomic"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0130
            if (r55 == 0) goto L_0x0489
            X.0Ae r1 = r15.A00
            X.0Aj r16 = X.C51969G9p.A0d(r1, r2)
            X.QIi r15 = new X.QIi
            r15.<init>()
            r2 = r56
            r1 = r55
            A03(r15, r2, r1, r14)
            A02(r15, r11, r12)
            A02(r15, r8, r9)
            A02(r15, r6, r7)
            A01(r15, r10, r0)
            if (r53 == 0) goto L_0x0170
            int r0 = r53.length()
            if (r0 == 0) goto L_0x0170
            java.lang.String r0 = X.AnonymousClass7TF.A0k(r53)
            X.RIP r1 = X.RIP.valueOf(r0)
            java.lang.String r0 = "transaction_filter_type"
            r15.A01(r1, r0)
        L_0x0170:
            r1 = r48
            r0 = r49
            A01(r15, r1, r0)
            r1 = r46
            r0 = r47
            A01(r15, r1, r0)
            r1 = r44
            r0 = r45
            A01(r15, r1, r0)
            r1 = r42
            r0 = r43
            A01(r15, r1, r0)
            r1 = r40
            r0 = r41
            A01(r15, r1, r0)
            r1 = r38
            r0 = r39
            A01(r15, r1, r0)
            goto L_0x0466
        L_0x019c:
            java.lang.String r2 = "client_load_payouthub_fail"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0130
            if (r10 == 0) goto L_0x048e
            X.0Ae r1 = r15.A00
            X.0Aj r2 = X.C51969G9p.A0d(r1, r2)
            X.QIi r1 = new X.QIi
            r1.<init>()
            A03(r1, r0, r10, r14)
            A02(r1, r11, r12)
            A02(r1, r6, r7)
            A02(r1, r8, r9)
            goto L_0x02ea
        L_0x01bf:
            java.lang.String r3 = "client_load_payouthub_init"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0130
            if (r10 == 0) goto L_0x0493
            X.0Ae r1 = r15.A00
            X.0Aj r15 = X.C51969G9p.A0d(r1, r3)
            X.QIi r1 = new X.QIi
            r1.<init>()
            A03(r1, r0, r10, r14)
            A02(r1, r11, r12)
            if (r54 == 0) goto L_0x01f0
            int r0 = r54.length()
            if (r0 == 0) goto L_0x01f0
            java.lang.String r0 = X.AnonymousClass7TF.A0k(r54)
            X.EZD r3 = X.EZD.valueOf(r0)
            java.lang.String r0 = "referrer"
            r1.A01(r3, r0)
        L_0x01f0:
            A02(r1, r6, r7)
            A02(r1, r8, r9)
            r3 = r55
            r0 = r56
            A01(r1, r3, r0)
            r3 = r48
            r0 = r49
            A01(r1, r3, r0)
            if (r2 == 0) goto L_0x035b
            r0 = r17
            r1.A03(r0, r2)
            goto L_0x035b
        L_0x020d:
            java.lang.String r2 = "client_fetch_payouthub_fail"
            boolean r0 = r1.equals(r2)
            if (r0 == 0) goto L_0x0130
            if (r10 == 0) goto L_0x04a2
            if (r27 == 0) goto L_0x049d
            X.0Ae r0 = r15.A00
            X.0Aj r15 = X.C51969G9p.A0d(r0, r2)
            X.QIi r1 = A00(r10)
            java.lang.String r0 = X.AnonymousClass7TF.A0k(r27)
            X.RIy r2 = X.C8959RIy.valueOf(r0)
            r0 = r28
            r1.A01(r2, r0)
            if (r14 == 0) goto L_0x0241
            int r0 = r14.length()
            if (r0 == 0) goto L_0x0241
            java.lang.Long r2 = X.DbV.A0q(r14)
            java.lang.String r0 = "financial_id"
            r1.A05(r0, r2)
        L_0x0241:
            A02(r1, r11, r12)
            A02(r1, r6, r7)
            A02(r1, r8, r9)
            r2 = r32
            r0 = r33
            A01(r1, r2, r0)
            r2 = r30
            r0 = r31
            A01(r1, r2, r0)
            r2 = r18
            r0 = r29
            A01(r1, r2, r0)
            if (r5 == 0) goto L_0x035b
            int r0 = r5.length()
            if (r0 == 0) goto L_0x035b
            X.QIv r2 = new X.QIv
            r2.<init>()
            r0 = r52
            r2.A06(r0, r5)
            if (r4 == 0) goto L_0x0498
            r0 = r51
            r2.A06(r0, r4)
            if (r3 == 0) goto L_0x027f
            r0 = r50
            r2.A03(r0, r3)
        L_0x027f:
            java.lang.String r0 = "page_info"
            r1.A02(r2, r0)
            goto L_0x035b
        L_0x0287:
            java.lang.String r2 = "client_fetch_payouthub_init"
            boolean r0 = r1.equals(r2)
            if (r0 == 0) goto L_0x0130
            if (r10 == 0) goto L_0x04b1
            if (r27 == 0) goto L_0x04ac
            X.0Ae r0 = r15.A00
            X.0Aj r2 = X.C51969G9p.A0d(r0, r2)
            X.QIi r1 = A00(r10)
            java.lang.String r0 = X.AnonymousClass7TF.A0k(r27)
            X.RIy r10 = X.C8959RIy.valueOf(r0)
            r0 = r28
            r1.A01(r10, r0)
            if (r14 == 0) goto L_0x02bb
            int r0 = r14.length()
            if (r0 == 0) goto L_0x02bb
            java.lang.Long r10 = X.DbV.A0q(r14)
            java.lang.String r0 = "financial_id"
            r1.A05(r0, r10)
        L_0x02bb:
            A02(r1, r11, r12)
            A02(r1, r6, r7)
            A02(r1, r8, r9)
            if (r5 == 0) goto L_0x02ea
            int r0 = r5.length()
            if (r0 == 0) goto L_0x02ea
            X.QIv r6 = new X.QIv
            r6.<init>()
            r0 = r52
            r6.A06(r0, r5)
            if (r4 == 0) goto L_0x04a7
            r0 = r51
            r6.A06(r0, r4)
            if (r3 == 0) goto L_0x02e4
            r0 = r50
            r6.A03(r0, r3)
        L_0x02e4:
            java.lang.String r0 = "page_info"
            r1.A02(r6, r0)
        L_0x02ea:
            boolean r0 = r2.isSampled()
            if (r0 == 0) goto L_0x0130
            r0 = r59
            r2.AAJ(r0, r13)
            X.2M7 r3 = X.2M7.A0I
            java.lang.String r0 = "product_type"
            r2.A8M(r3, r0)
            X.59v r0 = X.C2818559v.ANDROID
            X.JTU.A0t(r0, r2, r1)
            r2.Cgf()
            return
        L_0x0306:
            java.lang.String r2 = "client_load_payouthub_display"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0130
            if (r10 == 0) goto L_0x04b6
            X.0Ae r1 = r15.A00
            X.0Aj r15 = X.C51969G9p.A0d(r1, r2)
            X.QIi r1 = new X.QIi
            r1.<init>()
            A03(r1, r0, r10, r14)
            A02(r1, r8, r9)
            A02(r1, r6, r7)
            r2 = r46
            r0 = r47
            A01(r1, r2, r0)
            r2 = r44
            r0 = r45
            A01(r1, r2, r0)
            goto L_0x035b
        L_0x0333:
            java.lang.String r2 = "client_load_payouthub_success"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0130
            if (r10 == 0) goto L_0x04bb
            X.0Ae r1 = r15.A00
            X.0Aj r15 = X.C51969G9p.A0d(r1, r2)
            X.QIi r1 = new X.QIi
            r1.<init>()
            A03(r1, r0, r10, r14)
            A02(r1, r11, r12)
            A02(r1, r6, r7)
            A02(r1, r8, r9)
            r2 = r57
            r0 = r58
            A01(r1, r2, r0)
        L_0x035b:
            boolean r0 = r15.isSampled()
            if (r0 == 0) goto L_0x0130
            r0 = r59
            r15.AAJ(r0, r13)
            X.2M7 r2 = X.2M7.A0I
            java.lang.String r0 = "product_type"
            r15.A8M(r2, r0)
            X.59v r0 = X.C2818559v.ANDROID
            X.JTU.A0t(r0, r15, r1)
            r15.Cgf()
            return
        L_0x0377:
            java.lang.String r18 = "client_fetch_payouthub_success"
            r0 = r18
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0130
            if (r10 == 0) goto L_0x04ca
            if (r27 == 0) goto L_0x04c5
            if (r36 == 0) goto L_0x039b
            java.util.ArrayList r17 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r1 = r36.iterator()
        L_0x038f:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x039d
            r0 = r17
            X.Pxj.A1T(r0, r1)
            goto L_0x038f
        L_0x039b:
            r17 = 0
        L_0x039d:
            if (r34 == 0) goto L_0x03b1
            java.util.ArrayList r2 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r1 = r34.iterator()
        L_0x03a7:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x03b2
            X.Pxj.A1T(r2, r1)
            goto L_0x03a7
        L_0x03b1:
            r2 = 0
        L_0x03b2:
            if (r19 == 0) goto L_0x03c8
            java.util.ArrayList r1 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r16 = r19.iterator()
        L_0x03bc:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x03c9
            r0 = r16
            X.Pxj.A1T(r1, r0)
            goto L_0x03bc
        L_0x03c8:
            r1 = 0
        L_0x03c9:
            X.0Ae r0 = r15.A00
            r15 = r0
            r0 = r18
            X.0Aj r16 = X.C51969G9p.A0d(r15, r0)
            X.QIi r15 = A00(r10)
            java.lang.String r0 = X.AnonymousClass7TF.A0k(r27)
            X.RIy r10 = X.C8959RIy.valueOf(r0)
            r0 = r28
            r15.A01(r10, r0)
            if (r14 == 0) goto L_0x03f4
            int r0 = r14.length()
            if (r0 == 0) goto L_0x03f4
            java.lang.Long r10 = X.DbV.A0q(r14)
            java.lang.String r0 = "financial_id"
            r15.A05(r0, r10)
        L_0x03f4:
            A02(r15, r11, r12)
            A02(r15, r6, r7)
            A02(r15, r8, r9)
            r6 = r57
            r0 = r58
            A01(r15, r6, r0)
            if (r17 == 0) goto L_0x040d
            r6 = r37
            r0 = r17
            r15.A07(r6, r0)
        L_0x040d:
            if (r2 == 0) goto L_0x0414
            r0 = r35
            r15.A07(r0, r2)
        L_0x0414:
            if (r25 == 0) goto L_0x041d
            r2 = r26
            r0 = r25
            r15.A08(r2, r0)
        L_0x041d:
            if (r23 == 0) goto L_0x0426
            r2 = r24
            r0 = r23
            r15.A08(r2, r0)
        L_0x0426:
            if (r21 == 0) goto L_0x042f
            r2 = r22
            r0 = r21
            r15.A08(r2, r0)
        L_0x042f:
            if (r20 == 0) goto L_0x0439
            java.lang.String r2 = "payout_record_list"
            r0 = r20
            r15.A08(r2, r0)
        L_0x0439:
            if (r5 == 0) goto L_0x045f
            int r0 = r5.length()
            if (r0 == 0) goto L_0x045f
            X.QIv r2 = new X.QIv
            r2.<init>()
            r0 = r52
            r2.A06(r0, r5)
            if (r4 == 0) goto L_0x04c0
            r0 = r51
            r2.A06(r0, r4)
            if (r3 == 0) goto L_0x0459
            r0 = r50
            r2.A03(r0, r3)
        L_0x0459:
            java.lang.String r0 = "page_info"
            r15.A02(r2, r0)
        L_0x045f:
            if (r1 == 0) goto L_0x0466
            java.lang.String r0 = "financial_id_list"
            r15.A07(r0, r1)
        L_0x0466:
            boolean r0 = r16.isSampled()
            if (r0 == 0) goto L_0x0130
            r1 = r16
            r0 = r59
            r1.AAJ(r0, r13)
            X.2M7 r2 = X.2M7.A0I
            java.lang.String r1 = "product_type"
            r0 = r16
            r0.A8M(r2, r1)
            X.59v r1 = X.C2818559v.ANDROID
            X.JTU.A0t(r1, r0, r15)
            r16.Cgf()
            return
        L_0x0486:
            r10 = 0
            goto L_0x0034
        L_0x0489:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r60)
            throw r0
        L_0x048e:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r60)
            throw r0
        L_0x0493:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r60)
            throw r0
        L_0x0498:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r60)
            throw r0
        L_0x049d:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r60)
            throw r0
        L_0x04a2:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r60)
            throw r0
        L_0x04a7:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r60)
            throw r0
        L_0x04ac:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r60)
            throw r0
        L_0x04b1:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r60)
            throw r0
        L_0x04b6:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r60)
            throw r0
        L_0x04bb:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r60)
            throw r0
        L_0x04c0:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r60)
            throw r0
        L_0x04c5:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r60)
            throw r0
        L_0x04ca:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r60)
            throw r0
        L_0x04cf:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r60)
            throw r0
        L_0x04d4:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r60)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12408Stk.Cgl(java.lang.String, java.util.Map):void");
    }

    public static void A01(0bb r1, String str, String str2) {
        if (str != null && str.length() != 0) {
            r1.A06(str2, str);
        }
    }

    public static void A02(0bb r2, String str, String str2) {
        if (str != null && str.length() != 0) {
            r2.A05(str2, Long.valueOf(Long.parseLong(str)));
        }
    }

    public C12408Stk(C58840Ae r1) {
        this.A00 = r1;
    }

    public static C7539QIi A00(String str) {
        String str2;
        0bb r2 = new 0bb();
        r2.A06("view_name", str);
        r2.A06("payout_interface_type", "IG_ANDROID");
        if ("IG_ANDROID".equals("IG_ANDROID")) {
            str2 = "IG_ONLY_LOGIN";
        } else {
            str2 = "FB_LOGIN";
        }
        r2.A06("login_mode", str2);
        return r2;
    }

    public static void A03(0bb r2, String str, String str2, String str3) {
        String str4;
        r2.A06(str, str2);
        r2.A06("payout_interface_type", "IG_ANDROID");
        if ("IG_ANDROID".equals("IG_ANDROID")) {
            str4 = "IG_ONLY_LOGIN";
        } else {
            str4 = "FB_LOGIN";
        }
        r2.A06("login_mode", str4);
        if (str3 != null && str3.length() != 0) {
            r2.A05("financial_id", Long.valueOf(Long.parseLong(str3)));
        }
    }
}
