package X;

import com.instagram.comments.mvvm.data.MediaCommentListRepository;

/* renamed from: X.JUh  reason: case insensitive filesystem */
public final class C59700JUh extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public final int A06;
    public final Object A07;
    public final Object A08;
    public final Object A09;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59700JUh(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, AnonymousClass4D7 r10, int i) {
        super(2, r10);
        this.A06 = i;
        this.A04 = obj;
        this.A03 = obj2;
        this.A09 = obj3;
        this.A07 = obj4;
        this.A05 = obj5;
        this.A02 = obj6;
        this.A01 = obj7;
        this.A08 = obj8;
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [X.JUh, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v1, types: [X.JUh, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v2, types: [X.JUh, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v5, types: [X.JUh, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v7, types: [X.JUh, X.4D7] */
    /* JADX WARNING: type inference failed for: r5v17, types: [X.JUh] */
    /* JADX WARNING: type inference failed for: r5v18, types: [X.JUh] */
    /* JADX WARNING: type inference failed for: r5v19, types: [X.JUh] */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x011f, code lost:
        r4.A05 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0121, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0020, code lost:
        return new X.C59700JUh(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass4D7 create(java.lang.Object r16, X.AnonymousClass4D7 r17) {
        /*
            r15 = this;
            int r2 = r15.A06
            r1 = r16
            r13 = r17
            switch(r2) {
                case 0: goto L_0x00b6;
                case 1: goto L_0x0021;
                case 2: goto L_0x0033;
                case 3: goto L_0x00cf;
                case 4: goto L_0x0045;
                case 5: goto L_0x00ed;
                case 6: goto L_0x0057;
                case 7: goto L_0x0069;
                case 8: goto L_0x007b;
                case 9: goto L_0x0106;
                case 10: goto L_0x008e;
                case 11: goto L_0x0122;
                case 12: goto L_0x00a2;
                case 13: goto L_0x0134;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.Object r6 = r15.A03
            java.lang.Object r8 = r15.A07
            java.lang.Object r7 = r15.A09
            java.lang.Object r5 = r15.A04
            java.lang.Object r11 = r15.A01
            java.lang.Object r10 = r15.A02
            java.lang.Object r12 = r15.A08
            java.lang.Object r9 = r15.A05
            r14 = 14
        L_0x001b:
            X.JUh r4 = new X.JUh
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return r4
        L_0x0021:
            java.lang.Object r7 = r15.A09
            java.lang.Object r12 = r15.A08
            java.lang.Object r8 = r15.A07
            java.lang.Object r6 = r15.A03
            java.lang.Object r11 = r15.A01
            java.lang.Object r9 = r15.A05
            java.lang.Object r10 = r15.A02
            java.lang.Object r5 = r15.A04
            r14 = 1
            goto L_0x001b
        L_0x0033:
            java.lang.Object r12 = r15.A08
            java.lang.Object r9 = r15.A05
            java.lang.Object r8 = r15.A07
            java.lang.Object r11 = r15.A01
            java.lang.Object r6 = r15.A03
            java.lang.Object r7 = r15.A09
            java.lang.Object r5 = r15.A04
            java.lang.Object r10 = r15.A02
            r14 = 2
            goto L_0x001b
        L_0x0045:
            java.lang.Object r5 = r15.A04
            java.lang.Object r6 = r15.A03
            java.lang.Object r7 = r15.A09
            java.lang.Object r8 = r15.A07
            java.lang.Object r9 = r15.A05
            java.lang.Object r10 = r15.A02
            java.lang.Object r11 = r15.A01
            java.lang.Object r12 = r15.A08
            r14 = 4
            goto L_0x001b
        L_0x0057:
            java.lang.Object r7 = r15.A09
            java.lang.Object r12 = r15.A08
            java.lang.Object r6 = r15.A03
            java.lang.Object r11 = r15.A01
            java.lang.Object r5 = r15.A04
            java.lang.Object r8 = r15.A07
            java.lang.Object r9 = r15.A05
            java.lang.Object r10 = r15.A02
            r14 = 6
            goto L_0x001b
        L_0x0069:
            java.lang.Object r5 = r15.A04
            java.lang.Object r10 = r15.A02
            java.lang.Object r7 = r15.A09
            java.lang.Object r12 = r15.A08
            java.lang.Object r11 = r15.A01
            java.lang.Object r6 = r15.A03
            java.lang.Object r8 = r15.A07
            java.lang.Object r9 = r15.A05
            r14 = 7
            goto L_0x001b
        L_0x007b:
            java.lang.Object r9 = r15.A05
            java.lang.Object r5 = r15.A04
            java.lang.Object r7 = r15.A09
            java.lang.Object r6 = r15.A03
            java.lang.Object r10 = r15.A02
            java.lang.Object r8 = r15.A07
            java.lang.Object r11 = r15.A01
            java.lang.Object r12 = r15.A08
            r14 = 8
            goto L_0x001b
        L_0x008e:
            java.lang.Object r5 = r15.A04
            java.lang.Object r6 = r15.A03
            java.lang.Object r7 = r15.A09
            java.lang.Object r9 = r15.A05
            java.lang.Object r12 = r15.A08
            java.lang.Object r8 = r15.A07
            java.lang.Object r11 = r15.A01
            java.lang.Object r10 = r15.A02
            r14 = 10
            goto L_0x001b
        L_0x00a2:
            java.lang.Object r7 = r15.A09
            java.lang.Object r5 = r15.A04
            java.lang.Object r9 = r15.A05
            java.lang.Object r6 = r15.A03
            java.lang.Object r12 = r15.A08
            java.lang.Object r11 = r15.A01
            java.lang.Object r8 = r15.A07
            java.lang.Object r10 = r15.A02
            r14 = 12
            goto L_0x001b
        L_0x00b6:
            java.lang.Object r6 = r15.A09
            java.lang.Object r7 = r15.A07
            java.lang.Object r8 = r15.A03
            java.lang.Object r9 = r15.A02
            java.lang.Object r3 = r15.A01
            java.lang.Object r2 = r15.A04
            java.lang.Object r0 = r15.A08
            r14 = 0
            X.JUh r4 = new X.JUh
            r5 = r4
            r10 = r3
            r11 = r2
            r12 = r0
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14)
            goto L_0x011f
        L_0x00cf:
            java.lang.Object r8 = r15.A01
            X.7dj r8 = (X.C335907dj) r8
            java.lang.Object r7 = r15.A09
            com.instagram.comments.mvvm.data.MediaCommentListRepository r7 = (com.instagram.comments.mvvm.data.MediaCommentListRepository) r7
            java.lang.Object r2 = r15.A02
            X.1Xl r2 = (X.1Xl) r2
            java.lang.Object r6 = r15.A08
            X.B1F r6 = (X.B1F) r6
            java.lang.Object r5 = r15.A07
            X.MRk r5 = (X.C66430MRk) r5
            X.JUh r4 = new X.JUh
            r9 = r2
            r10 = r13
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r4.A03 = r1
            return r4
        L_0x00ed:
            java.lang.Object r6 = r15.A09
            java.lang.Object r3 = r15.A04
            java.lang.Object r9 = r15.A02
            java.lang.Object r8 = r15.A03
            java.lang.Object r7 = r15.A07
            java.lang.Object r2 = r15.A08
            java.lang.Object r0 = r15.A01
            r14 = 5
            X.JUh r4 = new X.JUh
            r5 = r4
            r10 = r0
            r11 = r3
            r12 = r2
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14)
            goto L_0x011f
        L_0x0106:
            java.lang.Object r6 = r15.A09
            java.lang.Object r3 = r15.A04
            java.lang.Object r8 = r15.A03
            java.lang.Object r2 = r15.A01
            java.lang.Object r7 = r15.A07
            java.lang.Object r9 = r15.A02
            java.lang.Object r0 = r15.A08
            r14 = 9
            X.JUh r4 = new X.JUh
            r5 = r4
            r10 = r2
            r11 = r3
            r12 = r0
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14)
        L_0x011f:
            r4.A05 = r1
            return r4
        L_0x0122:
            java.lang.Object r2 = r15.A09
            java.lang.Object r1 = r15.A07
            java.lang.Object r0 = r15.A08
            r9 = 11
            X.JUh r4 = new X.JUh
            r5 = r2
            r6 = r1
            r7 = r0
            r8 = r13
            r4.<init>(r5, r6, r7, r8, r9)
            return r4
        L_0x0134:
            java.lang.Object r2 = r15.A08
            java.lang.Object r1 = r15.A07
            java.lang.Object r0 = r15.A09
            r9 = 13
            X.JUh r4 = new X.JUh
            r5 = r0
            r6 = r1
            r7 = r2
            r8 = r13
            r4.<init>(r5, r6, r7, r8, r9)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59700JUh.create(java.lang.Object, X.4D7):X.4D7");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v173, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v16, resolved type: java.util.Iterator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v178, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v18, resolved type: java.util.Iterator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v186, resolved type: com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryImpl} */
    /* JADX WARNING: type inference failed for: r0v0, types: [X.JUh, X.4D7] */
    /* JADX WARNING: type inference failed for: r16v0, types: [X.0rl, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x0aec, code lost:
        if (r2.contains(r0.A08) != true) goto L_0x0aee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:278:0x0c71, code lost:
        if (X.182.A06(X.DbS.A0J(r2, 0), r2, 36327258593769773L) == false) goto L_0x0c73;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:279:0x0c73, code lost:
        r11 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:280:0x0c74, code lost:
        if (r11 != null) goto L_0x0c7a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:281:0x0c76, code lost:
        r11 = (com.instagram.reels.prompt.model.PromptStickerModel) r0.A04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:282:0x0c7a, code lost:
        r4 = (android.content.Context) r0.A07;
        r10 = X.DbT.A05(r4);
        r9 = (android.graphics.Bitmap) r6.A01;
        r5 = (X.C262224Cq) r0.A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:283:0x0c8f, code lost:
        if (r7.intValue() != 7) goto L_0x0d22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:284:0x0c91, code lost:
        r8 = X.28D.A3F;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:285:0x0c93, code lost:
        X.0qQ.A0B(r9, 1);
        r10 = X.0mb.A04(r10);
        X.1MF.A0M(r9, r10);
        X.0qQ.A0A(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:286:0x0ca1, code lost:
        if (r11 == null) goto L_0x0d20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:287:0x0ca3, code lost:
        r7 = r11.A02();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:288:0x0ca7, code lost:
        r6 = X.AnonymousClass7TE.A0a();
        r6.putString(X.AnonymousClass000.A00(1385), r1.A00.toString());
        r6.putString(X.AnonymousClass000.A00(614), r1.A03);
        r6.putString(X.AnonymousClass000.A00(1384), r1.A08);
        r6.putString(X.AnonymousClass000.A00(3189), r1.A09);
        r6.putString(X.AnonymousClass000.A00(3190), r1.A04);
        r6.putString(X.AnonymousClass000.A00(3191), r1.A05);
        r6.putString(X.AnonymousClass000.A00(3743), r10.getPath());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:289:0x0cfe, code lost:
        if (r8 == null) goto L_0x0d05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:290:0x0d00, code lost:
        r6.putSerializable("camera_entry_point", r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:291:0x0d05, code lost:
        if (r7 == null) goto L_0x0d0c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:292:0x0d07, code lost:
        r6.putParcelable("prompt_sticker_model", r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:293:0x0d0c, code lost:
        X.1Eo.A05(X.AnonymousClass12T.A00.A04, new X.C59819JZr(r6, r4, r2, (X.AnonymousClass4D7) null, 34), r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:294:0x0d20, code lost:
        r7 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:295:0x0d22, code lost:
        r8 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:296:0x0d25, code lost:
        r5 = r11.A02.intValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:297:0x0d2b, code lost:
        if (r5 == 0) goto L_0x0d3f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:298:0x0d2d, code lost:
        if (r5 == 1) goto L_0x0d3f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:299:0x0d2f, code lost:
        if (r5 == 3) goto L_0x0d3c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:301:0x0d32, code lost:
        if (r5 == 4) goto L_0x0d3c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:303:0x0d35, code lost:
        if (r5 == 2) goto L_0x0d3c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:305:0x0d3b, code lost:
        throw X.AnonymousClass7TE.A1K();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:306:0x0d3c, code lost:
        r4 = X.C59809JZd.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:307:0x0d3f, code lost:
        r4 = X.C59809JZd.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:309:0x0d45, code lost:
        if (r4.ordinal() == 0) goto L_0x0d8a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:310:0x0d47, code lost:
        r9 = X.LQu.A00;
        X.0qQ.A0B(r2, 0);
        X.0qQ.A0B(r1, 1);
        r11 = r1.A00;
        X.0qQ.A0B(r11, 0);
        r11 = new com.instagram.api.schemas.GenAIToolInfoDict(r11, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null).A00;
        r14 = r1.A08;
        r13 = r1.A03;
        r8 = r1.A05;
        r10 = com.instagram.api.schemas.CameraTool.A1A;
        r5 = r1.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:311:0x0d71, code lost:
        if (r5 == null) goto L_0x0d88;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:312:0x0d73, code lost:
        r4 = r5.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:313:0x0d75, code lost:
        r11 = X.LQu.A00(new com.instagram.api.schemas.GenAIToolInfoDict(r11, (java.lang.String) null, r13, r14, (java.lang.String) null, (java.lang.String) null, r8, (java.lang.String) null, r9.A01(r10, r4)), r2, r5, r1.A02);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:314:0x0d88, code lost:
        r4 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:315:0x0d8a, code lost:
        X.0qQ.A0B(r2, 0);
        X.0qQ.A0B(r1, 1);
        r10 = null;
        r12 = new com.instagram.api.schemas.GenAIToolInfoDict(com.instagram.api.schemas.CameraTool.A1B, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null).A00;
        r15 = r1.A08;
        r14 = r1.A03;
        r5 = r1.A05;
        r4 = r1.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:316:0x0dab, code lost:
        if (r4 == null) goto L_0x0daf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:317:0x0dad, code lost:
        r10 = r4.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:318:0x0daf, code lost:
        r11 = X.C63194Kt1.A00(new com.instagram.api.schemas.GenAIToolInfoDict(r12, (java.lang.String) null, r14, r15, (java.lang.String) null, (java.lang.String) null, r5, (java.lang.String) null, r10), r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:337:0x0f17, code lost:
        r0.A00 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:338:0x0f19, code lost:
        r0 = X.AnonymousClass3DM.A00(r1, r2, r0, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:339:0x0f1d, code lost:
        if (r0 != r7) goto L_0x115a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:340:0x0f1f, code lost:
        return r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:408:0x10ab, code lost:
        X.0eS.A00(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:425:0x1143, code lost:
        if (r1 != r7) goto L_0x115a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:426:0x1145, code lost:
        return r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:432:0x1158, code lost:
        if (X.19E.A07(r3) == false) goto L_0x0016;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:506:?, code lost:
        return X.C60340gF.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0016, code lost:
        throw r2;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x0951 A[LOOP:15: B:165:0x094b->B:167:0x0951, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x09a7  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x09ed  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x09f1 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:237:0x0b62  */
    /* JADX WARNING: Removed duplicated region for block: B:238:0x0b67  */
    /* JADX WARNING: Removed duplicated region for block: B:375:0x0fee  */
    /* JADX WARNING: Removed duplicated region for block: B:384:0x1019  */
    /* JADX WARNING: Removed duplicated region for block: B:392:0x103d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r47) {
        /*
            r46 = this;
            r0 = r46
            r1 = r47
            int r2 = r0.A06
            X.1Hj r7 = X.1Hj.A02
            switch(r2) {
                case 0: goto L_0x10c5;
                case 1: goto L_0x109f;
                case 2: goto L_0x105a;
                case 3: goto L_0x0f20;
                case 4: goto L_0x0ee8;
                case 5: goto L_0x0e0b;
                case 6: goto L_0x0c05;
                case 7: goto L_0x0bd4;
                case 8: goto L_0x0ba0;
                case 9: goto L_0x117e;
                case 10: goto L_0x0b6c;
                case 11: goto L_0x0a9c;
                case 12: goto L_0x0a5d;
                case 13: goto L_0x0043;
                default: goto L_0x000b;
            }
        L_0x000b:
            int r2 = r0.A00
            r6 = 1
            if (r2 == 0) goto L_0x0017
            if (r2 == r6) goto L_0x10ab
            java.lang.IllegalStateException r2 = X.AnonymousClass7TE.A0x()
        L_0x0016:
            throw r2
        L_0x0017:
            X.0eS.A00(r1)
            java.lang.Object r1 = r0.A03
            X.07V r5 = X.JTO.A0J(r1)
            java.lang.Object r4 = r0.A07
            X.07U r4 = (X.07U) r4
            r9 = 0
            java.lang.Object r10 = r0.A09
            java.lang.Object r12 = r0.A04
            java.lang.Object r3 = r0.A01
            java.lang.Object r2 = r0.A02
            java.lang.Object r1 = r0.A08
            java.lang.Object r11 = r0.A05
            r16 = 9
            X.JVZ r8 = new X.JVZ
            r13 = r1
            r14 = r2
            r15 = r3
            r8.<init>((X.AnonymousClass4D7) r9, (java.lang.Object) r10, (java.lang.Object) r11, (java.lang.Object) r12, (java.lang.Object) r13, (java.lang.Object) r14, (java.lang.Object) r15, (int) r16)
            r0.A00 = r6
            java.lang.Object r0 = X.AnonymousClass3DM.A00(r4, r5, r0, r8)
            goto L_0x0f1d
        L_0x0043:
            int r3 = r0.A00
            r5 = 2
            r16 = 1
            if (r3 == 0) goto L_0x09f2
            r2 = r16
            if (r3 == r2) goto L_0x08ec
            if (r3 != r5) goto L_0x115d
            java.lang.Object r4 = r0.A04
            X.LAP r4 = (X.LAP) r4
            java.lang.Object r2 = r0.A03
            r17 = r2
            r2 = r17
            java.util.Iterator r2 = (java.util.Iterator) r2
            r17 = r2
            java.lang.Object r3 = r0.A02
            X.LOH r3 = (X.LOH) r3
            java.lang.Object r2 = r0.A01
            r45 = r2
            X.0eS.A00(r1)
        L_0x0069:
            long r8 = java.lang.System.currentTimeMillis()
            X.9rz r1 = r4.A02
            int r2 = r1.ordinal()
            if (r2 == r5) goto L_0x08e3
            r1 = 3
            X.JY2 r6 = r4.A04
            if (r2 == r1) goto L_0x08dc
            X.0s0 r4 = r6.A02
            X.0YZ[] r2 = X.JY2.A05
            r1 = 0
        L_0x007f:
            r2 = r2[r1]
            java.lang.Long r1 = java.lang.Long.valueOf(r8)
            r4.Epx(r6, r1, r2)
        L_0x0088:
            boolean r1 = r17.hasNext()
            if (r1 == 0) goto L_0x115a
            java.lang.Object r4 = r17.next()
            X.LAP r4 = (X.LAP) r4
            X.9rz r11 = X.C390879rz.MAGIC_MEDIA_REMIX
            r1 = r45
            if (r1 != r11) goto L_0x08d4
            com.instagram.common.session.UserSession r8 = r3.A01
            r1 = r16
            X.0qQ.A0B(r8, r1)
            X.0Tu r6 = X.0Tu.A05
            r1 = 36609128705431331(0x820fcf00061723, double:3.215098634219314E-306)
            long r1 = X.182.A01(r6, r8, r1)
            int r6 = (int) r1
        L_0x00ad:
            android.content.Context r1 = r3.A00
            X.2U7 r8 = X.LOH.A00(r1, r3, r6)
            X.MOF r6 = X.MOF.A00
            r1 = 0
            X.0qQ.A0B(r8, r1)
            r1 = r16
            X.0qQ.A0B(r6, r1)
            X.MIg r1 = X.C66199MIg.A00
            X.Pe3 r2 = new X.Pe3
            r2.<init>(r6, r1, r8)
            X.MOG r1 = X.MOG.A00
            X.3T1 r8 = X.C242173Sx.A09(r1, r2)
            com.instagram.common.session.UserSession r6 = r3.A01
            X.GVG r1 = r3.A04
            r35 = r1
            X.2jA r2 = r3.A03
            r1 = r16
            X.0qQ.A0B(r6, r1)
            r1 = r35
            X.0qQ.A0B(r1, r5)
            r20 = 3
            r1 = r20
            X.0qQ.A0B(r2, r1)
            X.0Tu r10 = X.0Tu.A05
            r1 = 36318874815437353(0x8107d300041a29, double:3.0315409054285184E-306)
            boolean r2 = X.182.A06(r10, r6, r1)
            X.MOE r12 = X.MOE.A00
            r6 = 0
            X.0qQ.A0B(r8, r6)
            r1 = r16
            X.0qQ.A0B(r12, r1)
            X.3T1 r9 = new X.3T1
            r9.<init>(r12, r8, r6)
            r21 = 10
            X.GL4 r8 = new X.GL4
            r1 = r21
            r8.<init>(r2, r1)
            X.3T1 r9 = X.C242173Sx.A09(r8, r9)
            r8 = 48
            X.J6i r2 = new X.J6i
            r1 = r35
            r2.<init>(r1, r8)
            X.3T1 r8 = X.C242173Sx.A09(r2, r9)
            r9 = 49
            X.J6i r2 = new X.J6i
            r2.<init>(r1, r9)
            X.0qQ.A0B(r8, r6)
            X.3T1 r27 = new X.3T1
            r1 = r27
            r1.<init>(r2, r8, r6)
            r2 = r45
            r1 = r16
            X.0qQ.A0B(r2, r1)
            X.9rz r2 = X.C390879rz.SMART_ALBUMS
            r1 = r45
            if (r1 == r2) goto L_0x0189
            r14 = 0
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            java.util.Iterator r15 = r27.iterator()
        L_0x0141:
            boolean r1 = r15.hasNext()
            if (r1 == 0) goto L_0x0185
            java.lang.Object r12 = r15.next()
            com.instagram.common.gallery.Medium r12 = (com.instagram.common.gallery.Medium) r12
            boolean r1 = r12.CeS()
            if (r1 != 0) goto L_0x0179
            if (r14 == 0) goto L_0x0182
            long r1 = r14.A0D
        L_0x0157:
            long r8 = r12.A0D
            long r1 = r1 - r8
            long r18 = java.lang.Math.abs(r1)
            r8 = 10000(0x2710, double:4.9407E-320)
            int r1 = (r18 > r8 ? 1 : (r18 == r8 ? 0 : -1))
            if (r1 > 0) goto L_0x0179
            X.8gB r1 = r12.A0F
            if (r1 == 0) goto L_0x0180
            float r2 = r1.A00
        L_0x016a:
            if (r14 == 0) goto L_0x017e
            X.8gB r1 = r14.A0F
            if (r1 == 0) goto L_0x017e
            float r1 = r1.A00
        L_0x0172:
            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r1 <= 0) goto L_0x017c
            X.018.A15(r13)
        L_0x0179:
            r13.add(r12)
        L_0x017c:
            r14 = r12
            goto L_0x0141
        L_0x017e:
            r1 = 0
            goto L_0x0172
        L_0x0180:
            r2 = 0
            goto L_0x016a
        L_0x0182:
            r1 = 0
            goto L_0x0157
        L_0x0185:
            X.0jq r27 = X.00k.A0o(r13)
        L_0x0189:
            r1 = r45
            r0.A01 = r1
            r0.A02 = r3
            r1 = r17
            r0.A03 = r1
            r0.A04 = r4
            r0.A05 = r3
            r1 = r16
            r0.A00 = r1
            X.9rz r1 = r4.A02
            r44 = r1
            X.2jA r1 = r4.A03
            r34 = r1
            com.instagram.common.session.UserSession r1 = r4.A01
            r33 = r1
            r1 = 36599477914439196(0x820708000e0e1c, double:3.2089954351352714E-306)
            r8 = r33
            long r1 = X.182.A01(r10, r8, r1)
            int r9 = (int) r1
            r1 = 36599477914897951(0x82070800150e1f, double:3.20899543542539E-306)
            long r1 = X.182.A01(r10, r8, r1)
            int r10 = (int) r1
            X.0sL r2 = r4.A06
            X.LOB r8 = new X.LOB
            r1 = r44
            r8.<init>(r1, r2, r9, r10)
            r2 = r20
            r1 = r34
            X.0qQ.A0B(r1, r2)
            r1 = r44
            if (r1 != r11) goto L_0x0787
            java.util.Calendar r9 = X.C361828gs.A00()
            java.util.Date r2 = new java.util.Date
            r2.<init>()
            java.util.Calendar r1 = X.C361828gs.A00()
            java.util.Date r1 = X.C362978ip.A01(r1, r2)
            r9.setTime(r1)
        L_0x01e5:
            r24 = 7
            r1 = r24
            int r1 = r9.get(r1)
            r2 = 5
            if (r1 == r5) goto L_0x01f5
            r1 = -1
            r9.add(r2, r1)
            goto L_0x01e5
        L_0x01f5:
            long r18 = r9.getTimeInMillis()
            r1 = -2
            r9.add(r2, r1)
            long r13 = r9.getTimeInMillis()
            X.0sL r10 = r8.A04
            r1 = 2131974733(0x7f135a4d, float:1.9586538E38)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r1)
            r1 = 0
            java.lang.Object r12 = r10.invoke(r9, r1)
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Long r9 = java.lang.Long.valueOf(r13)
            java.lang.Long r1 = java.lang.Long.valueOf(r18)
            X.0eP r11 = new X.0eP
            r11.<init>(r9, r1)
            int r9 = r8.A02
            X.L6d r1 = new X.L6d
            r1.<init>(r12, r11, r9)
            java.util.List r11 = java.util.Collections.singletonList(r1)
            X.0qQ.A07(r11)
            X.L6d r1 = X.LOB.A00(r8)
            java.util.ArrayList r26 = X.00k.A0T(r1, r11)
            java.util.Calendar r13 = X.C361828gs.A00()
            java.util.Date r11 = new java.util.Date
            r11.<init>()
            java.util.Calendar r1 = X.C361828gs.A00()
            java.util.Date r1 = X.C362978ip.A01(r1, r11)
            r13.setTime(r1)
            java.util.ArrayList r25 = new java.util.ArrayList
            r25.<init>()
            r12 = 0
        L_0x024e:
            r1 = r24
            int r11 = r13.get(r1)
            java.util.Locale r1 = java.util.Locale.getDefault()
            java.lang.String r15 = r13.getDisplayName(r11, r5, r1)
            if (r15 == 0) goto L_0x0282
            long r18 = r13.getTimeInMillis()
            java.lang.Long r11 = java.lang.Long.valueOf(r18)
            long r22 = r13.getTimeInMillis()
            r18 = 86400000(0x5265c00, double:4.2687272E-316)
            long r22 = r22 + r18
            java.lang.Long r1 = java.lang.Long.valueOf(r22)
            X.0eP r14 = new X.0eP
            r14.<init>(r11, r1)
            X.L6d r11 = new X.L6d
            r11.<init>(r15, r14, r9)
            r1 = r25
            r1.add(r11)
        L_0x0282:
            r31 = 6
            r11 = -1
            r1 = r31
            r13.add(r1, r11)
            int r12 = r12 + 1
            r1 = r20
            if (r12 < r1) goto L_0x024e
            r11 = r26
            r1 = r25
            java.util.ArrayList r14 = X.00k.A0S(r1, r11)
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            java.util.Calendar r12 = X.C361828gs.A00()
            java.util.Date r11 = new java.util.Date
            r11.<init>()
            java.util.Calendar r1 = X.C361828gs.A00()
            java.util.Date r1 = X.C362978ip.A01(r1, r11)
            r12.setTime(r1)
            r1 = 9
            r12.set(r5, r1)
            r32 = 5
            r1 = 31
            r12.set(r2, r1)
            long r11 = r12.getTimeInMillis()
            r29 = 86400000(0x5265c00, double:4.2687272E-316)
            long r18 = r29 + r11
            java.lang.Long r11 = java.lang.Long.valueOf(r11)
            java.lang.Long r1 = java.lang.Long.valueOf(r18)
            X.0eP r15 = new X.0eP
            r15.<init>(r11, r1)
            r1 = 2131965709(0x7f13370d, float:1.9568236E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r12 = 0
            java.lang.Object r11 = r10.invoke(r1, r12)
            java.lang.String r11 = (java.lang.String) r11
            X.L6d r1 = new X.L6d
            r1.<init>(r11, r15, r9)
            r13.add(r1)
            java.util.Calendar r11 = X.C361828gs.A00()
            java.util.Date r1 = new java.util.Date
            r1.<init>()
            java.util.Date r1 = X.C362978ip.A01(r11, r1)
            r11.setTime(r1)
            r1 = 11
            r11.set(r5, r1)
            r28 = 25
            r1 = r28
            r11.set(r2, r1)
            long r22 = r11.getTimeInMillis()
            long r18 = r29 + r22
            java.lang.Long r11 = java.lang.Long.valueOf(r22)
            java.lang.Long r1 = java.lang.Long.valueOf(r18)
            X.0eP r15 = new X.0eP
            r15.<init>(r11, r1)
            r1 = 2131965715(0x7f133713, float:1.9568248E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r11 = r10.invoke(r1, r12)
            java.lang.String r11 = (java.lang.String) r11
            X.L6d r1 = new X.L6d
            r1.<init>(r11, r15, r9)
            r13.add(r1)
            java.util.Calendar r11 = X.C361828gs.A00()
            java.util.Date r1 = new java.util.Date
            r1.<init>()
            java.util.Date r1 = X.C362978ip.A01(r11, r1)
            r11.setTime(r1)
            r26 = 11
            r1 = r26
            r11.set(r5, r1)
            r25 = 31
            r1 = r25
            r11.set(r2, r1)
            long r22 = r11.getTimeInMillis()
            long r18 = r29 + r22
            java.lang.Long r11 = java.lang.Long.valueOf(r22)
            java.lang.Long r1 = java.lang.Long.valueOf(r18)
            X.0eP r15 = new X.0eP
            r15.<init>(r11, r1)
            r1 = 2131965725(0x7f13371d, float:1.9568268E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r11 = r10.invoke(r1, r12)
            java.lang.String r11 = (java.lang.String) r11
            X.L6d r1 = new X.L6d
            r1.<init>(r11, r15, r9)
            r13.add(r1)
            java.util.Calendar r11 = X.C361828gs.A00()
            java.util.Date r1 = new java.util.Date
            r1.<init>()
            java.util.Date r1 = X.C362978ip.A01(r11, r1)
            r11.setTime(r1)
            r1 = r21
            r11.set(r5, r1)
            r23 = 4
            r1 = r23
            r11.set(r1, r2)
            r1 = r24
            r11.set(r1, r2)
            long r18 = r11.getTimeInMillis()
            long r29 = r29 + r18
            java.lang.Long r11 = java.lang.Long.valueOf(r18)
            java.lang.Long r1 = java.lang.Long.valueOf(r29)
            X.0eP r15 = new X.0eP
            r15.<init>(r11, r1)
            r1 = 2131965729(0x7f133721, float:1.9568276E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r11 = r10.invoke(r1, r12)
            java.lang.String r11 = (java.lang.String) r11
            X.L6d r1 = new X.L6d
            r1.<init>(r11, r15, r9)
            r13.add(r1)
            java.util.ArrayList r1 = X.00k.A0S(r13, r14)
            r8.A00 = r1
            r13 = -1
            java.lang.Long r1 = java.lang.Long.valueOf(r13)
            X.0eP r14 = new X.0eP
            r14.<init>(r1, r1)
            r1 = 2131974735(0x7f135a4f, float:1.9586542E38)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r1)
            r1 = 2131965708(0x7f13370c, float:1.9568234E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Integer[] r1 = new java.lang.Integer[]{r11, r1}
            java.util.List r13 = X.0sr.A1P(r1)
            java.util.Random r11 = new java.util.Random
            r11.<init>()
            int r1 = r13.size()
            int r1 = r11.nextInt(r1)
            java.lang.Object r1 = r13.get(r1)
            java.lang.Number r1 = (java.lang.Number) r1
            int r18 = r1.intValue()
            X.KhF r13 = X.C62523KhF.FOOD
            r1 = 2131974740(0x7f135a54, float:1.9586553E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r1 = r10.invoke(r1, r12)
            java.lang.String r1 = (java.lang.String) r1
            X.L6d r11 = new X.L6d
            r11.<init>(r1, r14, r9)
            X.0eP r19 = new X.0eP
            r1 = r19
            r1.<init>(r13, r11)
            X.KhF r15 = X.C62523KhF.PEOPLE
            java.lang.Integer r1 = java.lang.Integer.valueOf(r18)
            java.lang.Object r11 = r10.invoke(r1, r12)
            java.lang.String r11 = (java.lang.String) r11
            X.L6d r1 = new X.L6d
            r1.<init>(r11, r14, r9)
            X.0eP r13 = new X.0eP
            r13.<init>(r15, r1)
            X.KhF r18 = X.C62523KhF.SCENIC
            r1 = 2131965730(0x7f133722, float:1.9568278E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r1 = r10.invoke(r1, r12)
            java.lang.String r1 = (java.lang.String) r1
            X.L6d r15 = new X.L6d
            r15.<init>(r1, r14, r9)
            X.0eP r11 = new X.0eP
            r1 = r18
            r11.<init>(r1, r15)
            X.KhF r15 = X.C62523KhF.PET
            r1 = 2131974748(0x7f135a5c, float:1.9586569E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r1 = r10.invoke(r1, r12)
            java.lang.String r1 = (java.lang.String) r1
            X.L6d r10 = new X.L6d
            r10.<init>(r1, r14, r9)
            X.0eP r9 = new X.0eP
            r9.<init>(r15, r10)
            r1 = r19
            X.0eP[] r1 = new X.0eP[]{r1, r13, r11, r9}
            java.util.LinkedHashMap r1 = X.0Yt.A07(r1)
            r8.A01 = r1
            X.IxF r10 = new X.IxF
            r11 = r21
            r12 = r35
            r13 = r8
            r14 = r33
            r15 = r34
            r10.<init>(r11, r12, r13, r14, r15)
            r1 = 23
            X.J6L r9 = new X.J6L
            r9.<init>(r10, r1)
            r1 = r27
            X.3Sz r10 = X.C242173Sx.A0E(r9, r1)
            X.JY2 r9 = r4.A04
            X.3T1 r1 = X.C63277KuM.A00(r12, r9, r10)
            java.util.List r14 = X.C242173Sx.A07(r1)
            android.content.Context r9 = r4.A00
            X.JY1 r1 = r4.A05
            android.location.Location r1 = r1.A00
            r10 = r1
            r11 = r33
            r12 = r44
            r13 = r15
            java.util.List r11 = X.LJ1.A01(r9, r10, r11, r12, r13, r14)
            r1 = r21
            int r10 = X.0Yv.A1E(r11, r1)
            java.util.ArrayList r22 = new java.util.ArrayList
            r1 = r22
            r1.<init>(r10)
            java.util.Iterator r18 = r11.iterator()
        L_0x04b1:
            boolean r1 = r18.hasNext()
            if (r1 == 0) goto L_0x051d
            java.lang.Object r15 = r18.next()
            X.Juu r15 = (X.C60998Juu) r15
            java.lang.String r1 = r15.A06
            r38 = r1
            java.lang.String r1 = r15.A05
            r39 = r1
            java.util.List r1 = r15.A07
            r30 = r1
            java.util.List r14 = r15.A09
            X.KhF r13 = r15.A01
            X.0eP r12 = r15.A08
            X.9rz r10 = r15.A00
            java.lang.Boolean r1 = r15.A03
            r29 = r1
            java.lang.String r1 = r15.A04
            r27 = r1
            X.Kh1 r1 = r15.A02
            r19 = r1
            r1 = r38
            X.0qQ.A0B(r1, r6)
            r15 = r16
            r1 = r39
            X.0qQ.A0B(r1, r15)
            r1 = r30
            X.0qQ.A0B(r1, r5)
            r1 = r20
            X.0qQ.A0B(r14, r1)
            r1 = r23
            X.0qQ.A0B(r13, r1)
            X.0qQ.A0B(r12, r2)
            r1 = r31
            X.0qQ.A0B(r10, r1)
            X.Juu r15 = new X.Juu
            r33 = r15
            r34 = r10
            r35 = r13
            r36 = r19
            r37 = r29
            r40 = r27
            r41 = r30
            r42 = r14
            r43 = r12
            r33.<init>(r34, r35, r36, r37, r38, r39, r40, r41, r42, r43)
            r1 = r22
            r1.add(r15)
            goto L_0x04b1
        L_0x051d:
            r1 = r44
            X.LTI.A02(r9, r1, r11)
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.util.Iterator r10 = r11.iterator()
        L_0x052b:
            boolean r1 = r10.hasNext()
            java.lang.String r11 = ""
            if (r1 == 0) goto L_0x0548
            java.lang.Object r2 = r10.next()
            r1 = r2
            X.Juu r1 = (X.C60998Juu) r1
            java.lang.String r1 = r1.A06
            boolean r1 = X.0qQ.A0K(r1, r11)
            r1 = r1 ^ 1
            if (r1 == 0) goto L_0x052b
            r12.add(r2)
            goto L_0x052b
        L_0x0548:
            java.util.Iterator r20 = r22.iterator()
        L_0x054c:
            boolean r1 = r20.hasNext()
            if (r1 == 0) goto L_0x067b
            java.lang.Object r10 = r20.next()
            X.Juu r10 = (X.C60998Juu) r10
            r1 = r16
            X.0qQ.A0B(r10, r1)
            r2 = r26
            r1 = r25
            boolean r1 = X.LTI.A06(r10, r2, r1)
            if (r1 == 0) goto L_0x0587
            r1 = 2131965725(0x7f13371d, float:1.9568268E38)
        L_0x056a:
            java.lang.String r13 = r9.getString(r1)
            X.Kh1 r1 = X.C62511Kh1.HOLIDAY
        L_0x0570:
            X.0eP r2 = new X.0eP
            r2.<init>(r13, r1)
        L_0x0575:
            java.lang.Object r1 = r2.A00
            java.lang.String r1 = (java.lang.String) r1
            X.0qQ.A0B(r1, r6)
            r10.A06 = r1
            r10.A05 = r11
            java.lang.Object r1 = r2.A01
            X.Kh1 r1 = (X.C62511Kh1) r1
            r10.A02 = r1
            goto L_0x054c
        L_0x0587:
            r1 = r28
            boolean r1 = X.LTI.A06(r10, r2, r1)
            if (r1 == 0) goto L_0x0593
            r1 = 2131965715(0x7f133713, float:1.9568248E38)
            goto L_0x056a
        L_0x0593:
            r2 = 9
            r1 = r25
            boolean r1 = X.LTI.A06(r10, r2, r1)
            if (r1 == 0) goto L_0x05a1
            r1 = 2131965709(0x7f13370d, float:1.9568236E38)
            goto L_0x056a
        L_0x05a1:
            java.util.Calendar r2 = java.util.Calendar.getInstance()
            r1 = r21
            r2.set(r5, r1)
            r13 = r32
            r1 = r23
            r2.set(r1, r13)
            r13 = r24
            r1 = r32
            r2.set(r13, r1)
            int r2 = r2.get(r1)
            r1 = r21
            boolean r1 = X.LTI.A06(r10, r1, r2)
            if (r1 == 0) goto L_0x05c8
            r1 = 2131965729(0x7f133721, float:1.9568276E38)
            goto L_0x056a
        L_0x05c8:
            java.util.Calendar r13 = X.C361828gs.A00()
            java.util.Date r1 = new java.util.Date
            r1.<init>()
            java.util.Date r1 = X.C362978ip.A01(r13, r1)
            r13.setTime(r1)
            r2 = -3
            r1 = r31
            r13.add(r1, r2)
            long r18 = r13.getTimeInMillis()
            X.0eP r1 = r10.A08
            java.lang.Object r2 = r1.A00
            java.lang.Number r2 = (java.lang.Number) r2
            long r13 = r2.longValue()
            int r1 = (r13 > r18 ? 1 : (r13 == r18 ? 0 : -1))
            if (r1 < 0) goto L_0x05fb
            r1 = 2131965733(0x7f133725, float:1.9568284E38)
            java.lang.String r13 = r9.getString(r1)
            X.Kh1 r1 = X.C62511Kh1.WEEKDAY
            goto L_0x0570
        L_0x05fb:
            boolean r1 = X.LTI.A05(r10)
            if (r1 == 0) goto L_0x061f
            r1 = 2131965734(0x7f133726, float:1.9568286E38)
            java.lang.String r2 = r9.getString(r1)
            r1 = 2131965735(0x7f133727, float:1.9568288E38)
            java.lang.String r1 = r9.getString(r1)
            java.lang.String[] r1 = new java.lang.String[]{r2, r1}
            java.util.List r1 = X.0sr.A1P(r1)
            java.lang.String r13 = X.LTI.A00(r1)
            X.Kh1 r1 = X.C62511Kh1.WEEKEND
            goto L_0x0570
        L_0x061f:
            boolean r1 = X.LTI.A04(r10)
            if (r1 == 0) goto L_0x0672
            java.util.Calendar r13 = java.util.Calendar.getInstance()
            long r1 = r2.longValue()
            r13.setTimeInMillis(r1)
            java.text.SimpleDateFormat r1 = X.LTI.A00
            java.lang.String r18 = r1.format(r13)
            r2 = 2131965723(0x7f13371b, float:1.9568264E38)
            java.lang.Object[] r1 = new java.lang.Object[]{r18}
            java.lang.String r14 = r9.getString(r2, r1)
            r2 = 2131965721(0x7f133719, float:1.956826E38)
            java.lang.Object[] r1 = new java.lang.Object[]{r18}
            java.lang.String r13 = r9.getString(r2, r1)
            r2 = 2131965722(0x7f13371a, float:1.9568262E38)
            java.lang.Object[] r1 = new java.lang.Object[]{r18}
            java.lang.String r2 = r9.getString(r2, r1)
            r15 = 2131965724(0x7f13371c, float:1.9568266E38)
            java.lang.Object[] r1 = new java.lang.Object[]{r18}
            java.lang.String r1 = r9.getString(r15, r1)
            java.lang.String[] r1 = new java.lang.String[]{r14, r13, r2, r1}
            java.util.List r1 = X.0sr.A1P(r1)
            java.lang.String r13 = X.LTI.A00(r1)
            X.Kh1 r1 = X.C62511Kh1.MONTHLY
            goto L_0x0570
        L_0x0672:
            X.Kh1 r1 = X.C62511Kh1.A04
            X.0eP r2 = new X.0eP
            r2.<init>(r11, r1)
            goto L_0x0575
        L_0x067b:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r9 = r22.iterator()
        L_0x0684:
            boolean r1 = r9.hasNext()
            if (r1 == 0) goto L_0x069f
            java.lang.Object r6 = r9.next()
            r1 = r6
            X.Juu r1 = (X.C60998Juu) r1
            java.lang.String r1 = r1.A06
            boolean r1 = X.0qQ.A0K(r1, r11)
            r1 = r1 ^ 1
            if (r1 == 0) goto L_0x0684
            r2.add(r6)
            goto L_0x0684
        L_0x069f:
            java.util.HashSet r9 = new java.util.HashSet
            r9.<init>()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r10 = r2.iterator()
        L_0x06ad:
            boolean r1 = r10.hasNext()
            if (r1 == 0) goto L_0x06c6
            java.lang.Object r2 = r10.next()
            r1 = r2
            X.Juu r1 = (X.C60998Juu) r1
            X.Kh1 r1 = r1.A02
            boolean r1 = r9.add(r1)
            if (r1 == 0) goto L_0x06ad
            r6.add(r2)
            goto L_0x06ad
        L_0x06c6:
            java.util.List r10 = X.00k.A0d(r6, r5)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r11 = r12.iterator()
        L_0x06d3:
            boolean r1 = r11.hasNext()
            if (r1 == 0) goto L_0x06eb
            java.lang.Object r9 = r11.next()
            r1 = r9
            X.Juu r1 = (X.C60998Juu) r1
            X.KhF r2 = r1.A01
            X.KhF r1 = X.C62523KhF.A04
            if (r2 != r1) goto L_0x06d3
            if (r9 == 0) goto L_0x06eb
            r6.add(r9)
        L_0x06eb:
            r6.addAll(r10)
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.Iterator r11 = r12.iterator()
        L_0x06f7:
            boolean r1 = r11.hasNext()
            if (r1 == 0) goto L_0x070e
            java.lang.Object r9 = r11.next()
            r1 = r9
            X.Juu r1 = (X.C60998Juu) r1
            X.KhF r2 = r1.A01
            X.KhF r1 = X.C62523KhF.A04
            if (r2 == r1) goto L_0x06f7
            r10.add(r9)
            goto L_0x06f7
        L_0x070e:
            java.util.LinkedHashMap r11 = new java.util.LinkedHashMap
            r11.<init>()
            java.util.Iterator r10 = r10.iterator()
        L_0x0717:
            boolean r1 = r10.hasNext()
            if (r1 == 0) goto L_0x073a
            java.lang.Object r9 = r10.next()
            r1 = r9
            X.Juu r1 = (X.C60998Juu) r1
            X.KhF r2 = r1.A01
            java.lang.Object r1 = r11.get(r2)
            if (r1 != 0) goto L_0x0734
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r11.put(r2, r1)
        L_0x0734:
            java.util.List r1 = (java.util.List) r1
            r1.add(r9)
            goto L_0x0717
        L_0x073a:
            java.util.Collection r1 = r11.values()
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Iterator r2 = r1.iterator()
        L_0x0747:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L_0x075b
            java.lang.Object r1 = r2.next()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.List r1 = X.00k.A0d(r1, r5)
            X.018.A16(r1, r9)
            goto L_0x0747
        L_0x075b:
            r6.addAll(r9)
            java.util.HashSet r10 = new java.util.HashSet
            r10.<init>()
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Iterator r6 = r6.iterator()
        L_0x076c:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L_0x090a
            java.lang.Object r2 = r6.next()
            r1 = r2
            X.Juu r1 = (X.C60998Juu) r1
            java.lang.String r1 = r1.A00()
            boolean r1 = r10.add(r1)
            if (r1 == 0) goto L_0x076c
            r9.add(r2)
            goto L_0x076c
        L_0x0787:
            java.util.Calendar r14 = X.C361828gs.A00()
            java.util.Date r2 = new java.util.Date
            r2.<init>()
            java.util.Calendar r1 = X.C361828gs.A00()
            java.util.Date r1 = X.C362978ip.A01(r1, r2)
            r14.setTime(r1)
            java.util.Locale r2 = X.13s.A06
            java.lang.String r1 = "MMMM"
            java.text.SimpleDateFormat r13 = new java.text.SimpleDateFormat
            r13.<init>(r1, r2)
        L_0x07a4:
            r1 = 7
            int r1 = r14.get(r1)
            r12 = 5
            if (r1 == r5) goto L_0x07b1
            r1 = -1
            r14.add(r12, r1)
            goto L_0x07a4
        L_0x07b1:
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            r10 = 3
        L_0x07b7:
            long r18 = r14.getTimeInMillis()
            r1 = -2
            r14.add(r12, r1)
            long r1 = r14.getTimeInMillis()
            X.0sL r9 = r8.A04
            r6 = r20
            if (r10 != r6) goto L_0x08c2
            r6 = 2131974733(0x7f135a4d, float:1.9586538E38)
            java.lang.Integer r15 = java.lang.Integer.valueOf(r6)
            r6 = 0
        L_0x07d1:
            java.lang.Object r6 = r9.invoke(r15, r6)
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Long r15 = java.lang.Long.valueOf(r1)
            java.lang.Long r1 = java.lang.Long.valueOf(r18)
            X.0eP r2 = new X.0eP
            r2.<init>(r15, r1)
            int r15 = r8.A02
            X.L6d r1 = new X.L6d
            r1.<init>(r6, r2, r15)
            r11.add(r1)
            int r10 = r10 + -1
            r1 = -5
            r14.add(r12, r1)
            if (r10 > 0) goto L_0x07b7
            X.L6d r1 = X.LOB.A00(r8)
            java.util.ArrayList r1 = X.00k.A0T(r1, r11)
            r8.A00 = r1
            r1 = -1
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            X.0eP r13 = new X.0eP
            r13.<init>(r1, r1)
            X.KhF r6 = X.C62523KhF.FOOD
            r1 = 2131974740(0x7f135a54, float:1.9586553E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r12 = 0
            java.lang.Object r2 = r9.invoke(r1, r12)
            java.lang.String r2 = (java.lang.String) r2
            X.L6d r1 = new X.L6d
            r1.<init>(r2, r13, r15)
            X.0eP r11 = new X.0eP
            r11.<init>(r6, r1)
            X.KhF r2 = X.C62523KhF.PEOPLE
            r1 = 2131974735(0x7f135a4f, float:1.9586542E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r6 = r9.invoke(r1, r12)
            java.lang.String r6 = (java.lang.String) r6
            X.L6d r1 = new X.L6d
            r1.<init>(r6, r13, r15)
            X.0eP r10 = new X.0eP
            r10.<init>(r2, r1)
            X.KhF r14 = X.C62523KhF.SCENIC
            r1 = 2131974744(0x7f135a58, float:1.958656E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r2 = r9.invoke(r1, r12)
            java.lang.String r2 = (java.lang.String) r2
            X.L6d r1 = new X.L6d
            r1.<init>(r2, r13, r15)
            X.0eP r6 = new X.0eP
            r6.<init>(r14, r1)
            X.KhF r2 = X.C62523KhF.PET
            r1 = 2131974748(0x7f135a5c, float:1.9586569E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r1 = r9.invoke(r1, r12)
            java.lang.String r1 = (java.lang.String) r1
            X.L6d r9 = new X.L6d
            r9.<init>(r1, r13, r15)
            X.0eP r1 = new X.0eP
            r1.<init>(r2, r9)
            X.0eP[] r1 = new X.0eP[]{r11, r10, r6, r1}
            java.util.LinkedHashMap r1 = X.0Yt.A06(r1)
            r8.A01 = r1
            r10 = 9
            X.IxF r6 = new X.IxF
            r9 = r6
            r11 = r35
            r12 = r8
            r13 = r33
            r14 = r34
            r9.<init>(r10, r11, r12, r13, r14)
            r1 = 23
            X.J6L r2 = new X.J6L
            r2.<init>(r6, r1)
            r1 = r27
            X.3Sz r6 = X.C242173Sx.A0E(r2, r1)
            X.JY2 r2 = r4.A04
            X.3T1 r1 = X.C63277KuM.A00(r11, r2, r6)
            java.util.List r14 = X.C242173Sx.A07(r1)
            android.content.Context r6 = r4.A00
            X.JY1 r1 = r4.A05
            android.location.Location r1 = r1.A00
            r9 = r6
            r10 = r1
            r11 = r13
            r12 = r44
            r13 = r34
            java.util.List r2 = X.LJ1.A01(r9, r10, r11, r12, r13, r14)
            X.LTI.A02(r6, r12, r2)
            java.util.ArrayList r6 = X.00k.A0U(r2)
            java.util.List r1 = r8.A01()
            r6.addAll(r1)
            r2 = 20
            goto L_0x0917
        L_0x08c2:
            r6 = 2131974731(0x7f135a4b, float:1.9586534E38)
            java.lang.Integer r15 = java.lang.Integer.valueOf(r6)
            java.util.Date r6 = new java.util.Date
            r6.<init>(r1)
            java.lang.String r6 = r13.format(r6)
            goto L_0x07d1
        L_0x08d4:
            com.instagram.common.session.UserSession r1 = r3.A01
            int r6 = X.C227382jA.A00(r1)
            goto L_0x00ad
        L_0x08dc:
            X.0s0 r4 = r6.A03
            X.0YZ[] r2 = X.JY2.A05
            r1 = 2
            goto L_0x007f
        L_0x08e3:
            X.JY2 r6 = r4.A04
            X.0s0 r4 = r6.A04
            X.0YZ[] r2 = X.JY2.A05
            r1 = 1
            goto L_0x007f
        L_0x08ec:
            java.lang.Object r6 = r0.A05
            X.LOH r6 = (X.LOH) r6
            java.lang.Object r4 = r0.A04
            X.LAP r4 = (X.LAP) r4
            java.lang.Object r2 = r0.A03
            r17 = r2
            r2 = r17
            java.util.Iterator r2 = (java.util.Iterator) r2
            r17 = r2
            java.lang.Object r3 = r0.A02
            X.LOH r3 = (X.LOH) r3
            java.lang.Object r2 = r0.A01
            r45 = r2
            X.0eS.A00(r1)
            goto L_0x0923
        L_0x090a:
            java.util.ArrayList r6 = X.00k.A0U(r9)
            java.util.List r1 = r8.A01()
            r6.addAll(r1)
            r2 = 21
        L_0x0917:
            X.MAY r1 = new X.MAY
            r1.<init>(r2)
            java.util.List r1 = X.00k.A0g(r6, r1)
            if (r1 == r7) goto L_0x115c
            r6 = r3
        L_0x0923:
            java.util.List r1 = (java.util.List) r1
            r2 = r45
            r0.A01 = r2
            r0.A02 = r3
            r2 = r17
            r0.A03 = r2
            r0.A04 = r4
            r2 = 0
            r0.A05 = r2
            r0.A00 = r5
            com.instagram.gallery.suggestions.database.SuggestionsDBHelper r2 = r6.A02
            r30 = r2
            com.instagram.common.session.UserSession r9 = r6.A01
            r8 = 10
            int r2 = X.0Yv.A1E(r1, r8)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>(r2)
            java.util.Iterator r14 = r1.iterator()
        L_0x094b:
            boolean r2 = r14.hasNext()
            if (r2 == 0) goto L_0x0994
            java.lang.Object r2 = r14.next()
            X.Juu r2 = (X.C60998Juu) r2
            java.lang.String r20 = r2.A00()
            java.lang.String r13 = r2.A06
            java.lang.String r12 = r2.A05
            X.KhF r10 = r2.A01
            java.lang.String r23 = r10.name()
            X.0eP r10 = r2.A08
            java.lang.Object r11 = r10.A00
            java.lang.Number r11 = (java.lang.Number) r11
            long r26 = r11.longValue()
            java.lang.Object r10 = r10.A01
            java.lang.Number r10 = (java.lang.Number) r10
            long r28 = r10.longValue()
            X.9rz r10 = r2.A00
            java.lang.String r24 = r10.name()
            java.lang.Boolean r11 = r2.A03
            java.lang.String r10 = r2.A04
            X.LAw r2 = new X.LAw
            r18 = r2
            r19 = r11
            r21 = r13
            r22 = r12
            r25 = r10
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r28)
            r6.add(r2)
            goto L_0x094b
        L_0x0994:
            int r2 = X.0Yv.A1E(r1, r8)
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>(r2)
            java.util.Iterator r19 = r1.iterator()
        L_0x09a1:
            boolean r1 = r19.hasNext()
            if (r1 == 0) goto L_0x09e1
            java.lang.Object r15 = r19.next()
            X.Juu r15 = (X.C60998Juu) r15
            java.util.List r2 = r15.A07
            int r1 = X.0Yv.A1E(r2, r8)
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>(r1)
            java.util.Iterator r18 = r2.iterator()
        L_0x09bc:
            boolean r1 = r18.hasNext()
            if (r1 == 0) goto L_0x09dd
            java.lang.Object r10 = r18.next()
            com.instagram.common.gallery.Medium r10 = (com.instagram.common.gallery.Medium) r10
            r1 = 0
            int r10 = r10.A05
            java.lang.String r12 = java.lang.String.valueOf(r10)
            java.lang.String r11 = r15.A00()
            X.L6c r10 = new X.L6c
            r10.<init>(r1, r12, r11)
            r13.add(r10)
            goto L_0x09bc
        L_0x09dd:
            r14.add(r13)
            goto L_0x09a1
        L_0x09e1:
            java.util.ArrayList r2 = X.0Yv.A1F(r14)
            r1 = r30
            java.lang.Object r1 = r1.A01(r9, r6, r2, r0)
            if (r1 == r7) goto L_0x09ef
            X.0gF r1 = X.C60340gF.A00
        L_0x09ef:
            if (r1 != r7) goto L_0x0069
            return r7
        L_0x09f2:
            X.0eS.A00(r1)
            java.lang.Object r1 = r0.A08
            java.util.List r1 = (java.util.List) r1
            java.util.ArrayList r4 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r11 = r1.iterator()
        L_0x0a01:
            boolean r1 = r11.hasNext()
            if (r1 == 0) goto L_0x0a4f
            java.lang.Object r6 = r11.next()
            r3 = r6
            X.LAP r3 = (X.LAP) r3
            long r9 = java.lang.System.currentTimeMillis()
            X.9rz r1 = r3.A02
            int r2 = r1.ordinal()
            if (r2 == r5) goto L_0x0a47
            r1 = 3
            X.JY2 r8 = r3.A04
            if (r2 == r1) goto L_0x0a41
            X.0s0 r3 = r8.A02
            X.0YZ[] r2 = X.JY2.A05
            r1 = 0
        L_0x0a24:
            r1 = r2[r1]
            java.lang.Object r1 = r3.CDM(r8, r1)
            java.lang.Number r1 = (java.lang.Number) r1
            long r1 = r1.longValue()
            long r9 = r9 - r1
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MINUTES
            r1 = 5
            long r2 = r3.toMillis(r1)
            int r1 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r1 <= 0) goto L_0x0a01
            r4.add(r6)
            goto L_0x0a01
        L_0x0a41:
            X.0s0 r3 = r8.A03
            X.0YZ[] r2 = X.JY2.A05
            r1 = 2
            goto L_0x0a24
        L_0x0a47:
            X.JY2 r8 = r3.A04
            X.0s0 r3 = r8.A04
            X.0YZ[] r2 = X.JY2.A05
            r1 = 1
            goto L_0x0a24
        L_0x0a4f:
            java.lang.Object r1 = r0.A07
            r45 = r1
            java.lang.Object r3 = r0.A09
            X.LOH r3 = (X.LOH) r3
            java.util.Iterator r17 = r4.iterator()
            goto L_0x0088
        L_0x0a5d:
            int r2 = r0.A00
            r9 = 1
            if (r2 == 0) goto L_0x0a69
            if (r2 == r9) goto L_0x10ab
            java.lang.IllegalStateException r2 = X.AnonymousClass7TE.A0x()
            throw r2
        L_0x0a69:
            X.0eS.A00(r1)
            java.lang.Object r6 = r0.A09
            X.E4g r6 = (X.C47481E4g) r6
            X.0eM r1 = r6.A05
            java.lang.Object r1 = r1.getValue()
            X.DlK r1 = (X.C46790DlK) r1
            X.0r6 r5 = r1.A09
            java.lang.Object r10 = r0.A04
            java.lang.Object r4 = r0.A05
            java.lang.Object r3 = r0.A03
            java.lang.Object r11 = r0.A08
            java.lang.Object r2 = r0.A01
            java.lang.Object r12 = r0.A07
            java.lang.Object r1 = r0.A02
            X.FxH r8 = new X.FxH
            r13 = r1
            r14 = r3
            r15 = r4
            r16 = r6
            r17 = r2
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r0.A00 = r9
            java.lang.Object r0 = r5.collect(r8, r0)
            goto L_0x0f1d
        L_0x0a9c:
            int r2 = r0.A00
            r9 = 2
            r5 = 0
            r11 = 0
            r8 = 1
            if (r2 == 0) goto L_0x0ad0
            if (r2 == r8) goto L_0x0ab8
            if (r2 != r9) goto L_0x1162
            java.lang.Object r2 = r0.A04
            java.lang.Object r6 = r0.A03
            com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryRegistrar r6 = (com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryRegistrar) r6
            java.lang.Object r4 = r0.A02
            X.136 r4 = (X.136) r4
            java.lang.Object r3 = r0.A01
            java.util.Set r3 = (java.util.Set) r3
            goto L_0x0b49
        L_0x0ab8:
            java.lang.Object r10 = r0.A05
            X.92L r10 = (X.AnonymousClass92L) r10
            java.lang.Object r2 = r0.A04
            com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryImpl r2 = (com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryImpl) r2
            java.lang.Object r6 = r0.A03
            com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryRegistrar r6 = (com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryRegistrar) r6
            java.lang.Object r4 = r0.A02
            X.136 r4 = (X.136) r4
            java.lang.Object r3 = r0.A01
            java.util.Set r3 = (java.util.Set) r3
            X.0eS.A00(r1)
            goto L_0x0b1a
        L_0x0ad0:
            X.0eS.A00(r1)
            java.lang.Object r6 = r0.A09
            com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryRegistrar r6 = (com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryRegistrar) r6
            java.util.concurrent.ConcurrentHashMap r1 = r6.A0C
            java.lang.Object r10 = r0.A07
            X.92L r10 = (X.AnonymousClass92L) r10
            java.lang.Object r2 = r1.get(r10)
            java.util.Set r2 = (java.util.Set) r2
            if (r2 == 0) goto L_0x0aee
            java.lang.Object r1 = r0.A08
            boolean r2 = r2.contains(r1)
            r1 = 1
            if (r2 == r8) goto L_0x0aef
        L_0x0aee:
            r1 = 0
        L_0x0aef:
            if (r1 == 0) goto L_0x115a
            java.util.concurrent.ConcurrentHashMap r1 = r6.A0B
            java.lang.Object r1 = r1.get(r10)
            if (r1 != 0) goto L_0x0afb
            X.0sl r1 = X.0sl.A00
        L_0x0afb:
            java.util.Set r1 = (java.util.Set) r1
            java.lang.Object r2 = r0.A08
            com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryImpl r2 = (com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryImpl) r2
            java.util.Set r3 = X.094.A03(r2, r1)
            X.136 r4 = r6.A0G
            r0.A01 = r3
            r0.A02 = r4
            r0.A03 = r6
            r0.A04 = r2
            r0.A05 = r10
            r0.A00 = r8
            java.lang.Object r1 = X.136.A00(r0, r4)
            if (r1 != r7) goto L_0x0b1a
            return r7
        L_0x0b1a:
            java.util.concurrent.ConcurrentHashMap r1 = r6.A0D     // Catch:{ all -> 0x116a }
            java.lang.Object r1 = r1.get(r2)     // Catch:{ all -> 0x116a }
            java.util.Set r1 = (java.util.Set) r1     // Catch:{ all -> 0x116a }
            if (r1 == 0) goto L_0x0b27
            r1.remove(r10)     // Catch:{ all -> 0x116a }
        L_0x0b27:
            r10.D8j(r2)     // Catch:{ all -> 0x116a }
            if (r1 == 0) goto L_0x0b33
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x116a }
            if (r1 != r8) goto L_0x0b33
            r11 = 1
        L_0x0b33:
            if (r11 == 0) goto L_0x0b51
            r0.A01 = r3     // Catch:{ all -> 0x116a }
            r0.A02 = r4     // Catch:{ all -> 0x116a }
            r0.A03 = r6     // Catch:{ all -> 0x116a }
            r0.A04 = r2     // Catch:{ all -> 0x116a }
            r0.A05 = r5     // Catch:{ all -> 0x116a }
            r0.A00 = r9     // Catch:{ all -> 0x116a }
            java.lang.Object r1 = r2.A01(r0)     // Catch:{ all -> 0x116a }
            if (r1 != r7) goto L_0x0b4c
            goto L_0x1167
        L_0x0b49:
            X.0eS.A00(r1)     // Catch:{ all -> 0x1168 }
        L_0x0b4c:
            java.util.concurrent.ConcurrentHashMap r1 = r6.A0D     // Catch:{ all -> 0x1168 }
            r1.remove(r2)     // Catch:{ all -> 0x1168 }
        L_0x0b51:
            r4.A05(r5)
            boolean r2 = r3.isEmpty()
            java.lang.Object r1 = r0.A09
            com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryRegistrar r1 = (com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryRegistrar) r1
            java.util.concurrent.ConcurrentHashMap r1 = r1.A0B
            java.lang.Object r0 = r0.A07
            if (r2 == 0) goto L_0x0b67
            r1.remove(r0)
            goto L_0x115a
        L_0x0b67:
            r1.put(r0, r3)
            goto L_0x115a
        L_0x0b6c:
            int r2 = r0.A00
            r6 = 1
            if (r2 == 0) goto L_0x0b78
            if (r2 == r6) goto L_0x10ab
            java.lang.IllegalStateException r2 = X.AnonymousClass7TE.A0x()
            throw r2
        L_0x0b78:
            X.0eS.A00(r1)
            java.lang.Object r1 = r0.A04
            X.07V r2 = X.JTO.A0J(r1)
            java.lang.Object r1 = r0.A03
            X.07U r1 = (X.07U) r1
            r9 = 0
            java.lang.Object r10 = r0.A09
            java.lang.Object r11 = r0.A05
            java.lang.Object r5 = r0.A08
            java.lang.Object r4 = r0.A07
            java.lang.Object r3 = r0.A01
            java.lang.Object r12 = r0.A02
            r16 = 8
            X.JVZ r8 = new X.JVZ
            r13 = r4
            r14 = r3
            r15 = r5
            r8.<init>((X.AnonymousClass4D7) r9, (java.lang.Object) r10, (java.lang.Object) r11, (java.lang.Object) r12, (java.lang.Object) r13, (java.lang.Object) r14, (java.lang.Object) r15, (int) r16)
            r0.A00 = r6
            goto L_0x0f19
        L_0x0ba0:
            int r2 = r0.A00
            r6 = 1
            if (r2 == 0) goto L_0x0bac
            if (r2 == r6) goto L_0x10ab
            java.lang.IllegalStateException r2 = X.AnonymousClass7TE.A0x()
            throw r2
        L_0x0bac:
            X.0eS.A00(r1)
            java.lang.Object r1 = r0.A05
            X.07V r2 = X.JTO.A0J(r1)
            java.lang.Object r1 = r0.A04
            X.07U r1 = (X.07U) r1
            r9 = 0
            java.lang.Object r10 = r0.A09
            java.lang.Object r11 = r0.A03
            java.lang.Object r12 = r0.A02
            java.lang.Object r5 = r0.A07
            java.lang.Object r4 = r0.A01
            java.lang.Object r3 = r0.A08
            r16 = 7
            X.JVZ r8 = new X.JVZ
            r13 = r5
            r14 = r4
            r15 = r3
            r8.<init>((X.AnonymousClass4D7) r9, (java.lang.Object) r10, (java.lang.Object) r11, (java.lang.Object) r12, (java.lang.Object) r13, (java.lang.Object) r14, (java.lang.Object) r15, (int) r16)
            r0.A00 = r6
            goto L_0x0f19
        L_0x0bd4:
            int r2 = r0.A00
            r5 = 1
            if (r2 == 0) goto L_0x0be0
            if (r2 == r5) goto L_0x10ab
            java.lang.IllegalStateException r2 = X.AnonymousClass7TE.A0x()
            throw r2
        L_0x0be0:
            X.0eS.A00(r1)
            java.lang.Object r1 = r0.A04
            X.07V r2 = X.JTO.A0J(r1)
            java.lang.Object r1 = r0.A02
            X.07U r1 = (X.07U) r1
            r15 = 0
            java.lang.Object r9 = r0.A09
            java.lang.Object r10 = r0.A08
            java.lang.Object r4 = r0.A01
            java.lang.Object r3 = r0.A03
            java.lang.Object r12 = r0.A07
            java.lang.Object r11 = r0.A05
            r16 = 2
            X.MGq r8 = new X.MGq
            r13 = r3
            r14 = r4
            r8.<init>((java.lang.Object) r9, (java.lang.Object) r10, (java.lang.Object) r11, (java.lang.Object) r12, (java.lang.Object) r13, (java.lang.Object) r14, (X.AnonymousClass4D7) r15, (int) r16)
            goto L_0x0f17
        L_0x0c05:
            int r2 = r0.A00
            r3 = 1
            r6 = 2
            if (r2 == 0) goto L_0x0c4a
            if (r2 != r3) goto L_0x1174
            X.0eS.A00(r1)
        L_0x0c10:
            X.3Ii r1 = (X.C239803Ii) r1
            boolean r2 = r1 instanceof X.C239793Ih
            if (r2 == 0) goto L_0x0dc0
            java.lang.Object r7 = r0.A03
            X.Kgo r7 = (X.C62498Kgo) r7
            int r2 = r7.ordinal()
            if (r2 == r6) goto L_0x0e04
            r10 = 3
            if (r2 == r10) goto L_0x0e04
            r8 = 0
            if (r2 == r8) goto L_0x0dc9
            if (r2 != r3) goto L_0x116f
            java.lang.Object r2 = r0.A09
            com.instagram.common.session.UserSession r2 = (com.instagram.common.session.UserSession) r2
            java.lang.Object r7 = r0.A01
            java.lang.Number r7 = (java.lang.Number) r7
            java.lang.Object r11 = r0.A08
            X.8Vp r11 = (X.C356888Vp) r11
            X.3Ih r1 = (X.C239793Ih) r1
            java.lang.Object r6 = r1.A00
            X.JwM r6 = (X.C61084JwM) r6
            java.lang.Object r1 = r6.A00
            X.JuX r1 = (X.C60975JuX) r1
            int r4 = r7.intValue()
            switch(r4) {
                case 0: goto L_0x0c64;
                case 1: goto L_0x0c73;
                case 2: goto L_0x0d25;
                case 3: goto L_0x0d25;
                case 4: goto L_0x0c73;
                case 5: goto L_0x0c73;
                case 6: goto L_0x0c73;
                case 7: goto L_0x0c64;
                case 8: goto L_0x0c73;
                case 9: goto L_0x0c73;
                case 10: goto L_0x0c73;
                case 11: goto L_0x0c73;
                default: goto L_0x0c45;
            }
        L_0x0c45:
            X.Wub r2 = X.AnonymousClass7TE.A1K()
            throw r2
        L_0x0c4a:
            X.0eS.A00(r1)
            com.instagram.creation.genai.mai.adapter.MetaAIIntentsGeneratedImageResultAdapter r5 = com.instagram.creation.genai.mai.adapter.MetaAIIntentsGeneratedImageResultAdapter.A00
            java.lang.Object r4 = r0.A09
            com.instagram.common.session.UserSession r4 = (com.instagram.common.session.UserSession) r4
            java.lang.Object r2 = r0.A08
            X.8Vp r2 = (X.C356888Vp) r2
            java.lang.Object r1 = r0.A03
            X.Kgo r1 = (X.C62498Kgo) r1
            r0.A00 = r3
            java.lang.Object r1 = r5.A00(r4, r1, r2, r0)
            if (r1 != r7) goto L_0x0c10
            return r7
        L_0x0c64:
            X.0Tu r9 = X.DbS.A0J(r2, r8)
            r4 = 36327258593769773(0x810f730025392d, double:3.0368428406047065E-306)
            boolean r4 = X.182.A06(r9, r2, r4)
            if (r4 != 0) goto L_0x0d25
        L_0x0c73:
            r11 = 0
        L_0x0c74:
            if (r11 != 0) goto L_0x0c7a
            java.lang.Object r11 = r0.A04
            com.instagram.reels.prompt.model.PromptStickerModel r11 = (com.instagram.reels.prompt.model.PromptStickerModel) r11
        L_0x0c7a:
            java.lang.Object r4 = r0.A07
            android.content.Context r4 = (android.content.Context) r4
            android.content.Context r10 = X.DbT.A05(r4)
            java.lang.Object r9 = r6.A01
            android.graphics.Bitmap r9 = (android.graphics.Bitmap) r9
            java.lang.Object r5 = r0.A05
            X.4Cq r5 = (X.C262224Cq) r5
            int r7 = r7.intValue()
            r6 = 7
            if (r7 != r6) goto L_0x0d22
            X.28D r8 = X.28D.A3F
        L_0x0c93:
            X.0qQ.A0B(r9, r3)
            java.io.File r10 = X.0mb.A04(r10)
            X.1MF.A0M(r9, r10)
            X.0qQ.A0A(r10)
            r12 = 0
            if (r11 == 0) goto L_0x0d20
            com.instagram.api.schemas.StoryPromptTappableData r7 = r11.A02()
        L_0x0ca7:
            android.os.Bundle r6 = X.AnonymousClass7TE.A0a()
            com.instagram.api.schemas.CameraTool r3 = r1.A00
            java.lang.String r9 = r3.toString()
            r3 = 1385(0x569, float:1.941E-42)
            java.lang.String r3 = X.AnonymousClass000.A00(r3)
            r6.putString(r3, r9)
            java.lang.String r9 = r1.A03
            r3 = 614(0x266, float:8.6E-43)
            java.lang.String r3 = X.AnonymousClass000.A00(r3)
            r6.putString(r3, r9)
            java.lang.String r9 = r1.A08
            r3 = 1384(0x568, float:1.94E-42)
            java.lang.String r3 = X.AnonymousClass000.A00(r3)
            r6.putString(r3, r9)
            java.lang.String r9 = r1.A09
            r3 = 3189(0xc75, float:4.469E-42)
            java.lang.String r3 = X.AnonymousClass000.A00(r3)
            r6.putString(r3, r9)
            java.lang.String r9 = r1.A04
            r3 = 3190(0xc76, float:4.47E-42)
            java.lang.String r3 = X.AnonymousClass000.A00(r3)
            r6.putString(r3, r9)
            java.lang.String r3 = r1.A05
            r1 = 3191(0xc77, float:4.472E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            r6.putString(r1, r3)
            java.lang.String r3 = r10.getPath()
            r1 = 3743(0xe9f, float:5.245E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            r6.putString(r1, r3)
            if (r8 == 0) goto L_0x0d05
            java.lang.String r1 = "camera_entry_point"
            r6.putSerializable(r1, r8)
        L_0x0d05:
            if (r7 == 0) goto L_0x0d0c
            java.lang.String r1 = "prompt_sticker_model"
            r6.putParcelable(r1, r7)
        L_0x0d0c:
            X.12T r1 = X.AnonymousClass12T.A00
            X.4CZ r3 = r1.A04
            r13 = 34
            X.JZr r1 = new X.JZr
            r8 = r1
            r9 = r6
            r10 = r4
            r11 = r2
            r8.<init>(r9, r10, r11, r12, r13)
            X.1Eo.A05(r3, r1, r5)
            goto L_0x0e04
        L_0x0d20:
            r7 = r12
            goto L_0x0ca7
        L_0x0d22:
            r8 = 0
            goto L_0x0c93
        L_0x0d25:
            java.lang.Integer r4 = r11.A02
            int r5 = r4.intValue()
            if (r5 == r8) goto L_0x0d3f
            if (r5 == r3) goto L_0x0d3f
            if (r5 == r10) goto L_0x0d3c
            r4 = 4
            if (r5 == r4) goto L_0x0d3c
            r4 = 2
            if (r5 == r4) goto L_0x0d3c
            X.Wub r2 = X.AnonymousClass7TE.A1K()
            throw r2
        L_0x0d3c:
            X.JZd r4 = X.C59809JZd.IMAGINE_ME
            goto L_0x0d41
        L_0x0d3f:
            X.JZd r4 = X.C59809JZd.IMAGINE
        L_0x0d41:
            int r4 = r4.ordinal()
            if (r4 == r8) goto L_0x0d8a
            X.LQu r9 = X.LQu.A00
            X.0qQ.A0B(r2, r8)
            X.0qQ.A0B(r1, r3)
            com.instagram.api.schemas.CameraTool r11 = r1.A00
            X.0qQ.A0B(r11, r8)
            r12 = 0
            com.instagram.api.schemas.GenAIToolInfoDict r10 = new com.instagram.api.schemas.GenAIToolInfoDict
            r13 = r12
            r14 = r12
            r15 = r12
            r16 = r12
            r17 = r12
            r18 = r12
            r19 = r12
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19)
            com.instagram.api.schemas.CameraTool r11 = r10.A00
            java.lang.String r14 = r1.A08
            java.lang.String r13 = r1.A03
            java.lang.String r8 = r1.A05
            com.instagram.api.schemas.CameraTool r10 = com.instagram.api.schemas.CameraTool.IMAGINE_ME_WITH_META_AI_INTENT
            X.LFv r5 = r1.A01
            if (r5 == 0) goto L_0x0d88
            java.lang.String r4 = r5.A02
        L_0x0d75:
            java.lang.String r19 = r9.A01(r10, r4)
            com.instagram.api.schemas.GenAIToolInfoDict r10 = new com.instagram.api.schemas.GenAIToolInfoDict
            r17 = r8
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19)
            X.LG4 r4 = r1.A02
            com.instagram.reels.prompt.model.PromptStickerModel r11 = X.LQu.A00(r10, r2, r5, r4)
            goto L_0x0c74
        L_0x0d88:
            r4 = 0
            goto L_0x0d75
        L_0x0d8a:
            X.0qQ.A0B(r2, r8)
            X.0qQ.A0B(r1, r3)
            com.instagram.api.schemas.CameraTool r9 = com.instagram.api.schemas.CameraTool.IMAGINE_WITH_META_AI_INTENT
            r10 = 0
            com.instagram.api.schemas.GenAIToolInfoDict r8 = new com.instagram.api.schemas.GenAIToolInfoDict
            r11 = r10
            r12 = r10
            r13 = r10
            r14 = r10
            r15 = r10
            r16 = r10
            r17 = r10
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17)
            com.instagram.api.schemas.CameraTool r12 = r8.A00
            java.lang.String r15 = r1.A08
            java.lang.String r14 = r1.A03
            java.lang.String r5 = r1.A05
            X.LFv r4 = r1.A01
            if (r4 == 0) goto L_0x0daf
            java.lang.String r10 = r4.A02
        L_0x0daf:
            com.instagram.api.schemas.GenAIToolInfoDict r11 = new com.instagram.api.schemas.GenAIToolInfoDict
            r18 = r5
            r19 = r13
            r20 = r10
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20)
            com.instagram.reels.prompt.model.PromptStickerModel r11 = X.C63194Kt1.A00(r11, r2)
            goto L_0x0c74
        L_0x0dc0:
            boolean r1 = r1 instanceof X.C297815sO
            if (r1 != 0) goto L_0x0e04
            X.Wub r2 = X.AnonymousClass7TE.A1K()
            throw r2
        L_0x0dc9:
            java.lang.Object r3 = r0.A09
            com.instagram.common.session.UserSession r3 = (com.instagram.common.session.UserSession) r3
            X.8ZA r2 = new X.8ZA
            r2.<init>(r3)
            X.8WA r6 = new X.8WA
            r6.<init>(r3)
            X.8Z0 r2 = r2.A00
            X.8Z1 r5 = r2.Bmt()
            java.lang.Class<X.8WC> r4 = X.AnonymousClass8WC.class
            r3 = 18
            X.MM9 r2 = new X.MM9
            r2.<init>(r6, r3)
            X.3pa r4 = r5.A00(r4, r2)
            X.8WC r4 = (X.AnonymousClass8WC) r4
            X.3Ih r1 = (X.C239793Ih) r1
            java.lang.Object r1 = r1.A00
            X.JwM r1 = (X.C61084JwM) r1
            java.lang.Object r3 = r1.A01
            android.graphics.Bitmap r3 = (android.graphics.Bitmap) r3
            java.lang.Object r1 = r1.A00
            X.JuX r1 = (X.C60975JuX) r1
            X.JwM r2 = new X.JwM
            r2.<init>((android.graphics.Bitmap) r3, (X.C60975JuX) r1, (X.C62498Kgo) r7)
            X.05G r1 = r4.A01
            r1.Epw(r2)
        L_0x0e04:
            java.lang.Object r0 = r0.A02
            X.DbS.A1U(r0)
            goto L_0x115a
        L_0x0e0b:
            int r2 = r0.A00
            r8 = 1
            if (r2 == 0) goto L_0x0e17
            if (r2 == r8) goto L_0x10ab
            java.lang.IllegalStateException r2 = X.AnonymousClass7TE.A0x()
            throw r2
        L_0x0e17:
            X.0eS.A00(r1)
            java.lang.Object r10 = r0.A05
            X.4Cq r10 = (X.C262224Cq) r10
            java.lang.Object r9 = r0.A09
            X.H3o r9 = (X.C54219H3o) r9
            X.GgO r1 = r9.A04()
            X.7a5 r1 = r1.A0B
            X.0Ud r3 = r1.A03
            java.lang.Object r6 = r0.A04
            X.7b2 r6 = (X.C334297b2) r6
            java.lang.Object r2 = r0.A02
            r32 = 0
            r12 = 9
            X.MGj r1 = new X.MGj
            r13 = r1
            r14 = r6
            r15 = r2
            r16 = r9
            r17 = r32
            r18 = r12
            r13.<init>(r14, r15, r16, r17, r18)
            X.C51968G9o.A1P(r1, r10, r3)
            X.0eM r2 = r9.A05
            java.lang.Object r4 = r2.getValue()
            X.7be r4 = (X.C334657be) r4
            java.lang.Object r13 = r0.A03
            r3 = 8
            X.Inh r1 = new X.Inh
            r1.<init>(r13, r3)
            r4.A03 = r1
            X.0eM r1 = r9.A04
            java.lang.Object r5 = r1.getValue()
            X.7an r5 = (X.C334177an) r5
            X.GgO r22 = r9.A04()
            androidx.fragment.app.FragmentActivity r16 = r9.requireActivity()
            com.instagram.common.session.UserSession r23 = r9.A05()
            X.0eM r1 = r9.A02
            java.lang.Object r4 = r1.getValue()
            X.32A r4 = (X.AnonymousClass32A) r4
            java.lang.String r26 = r9.getModuleName()
            X.0eM r1 = r9.A01
            java.lang.Object r3 = r1.getValue()
            X.7bg r3 = (X.C334677bg) r3
            X.0eM r1 = r9.A09
            java.lang.Object r1 = r1.getValue()
            X.I03 r1 = (X.I03) r1
            X.4DU r1 = r1.A00
            r24 = r1
            X.JNq r1 = r9.A01
            r33 = r1
            X.GmL r1 = r9.A03()
            boolean r1 = r1.A0e
            r17 = r1
            java.lang.Object r2 = r2.getValue()
            X.7be r2 = (X.C334657be) r2
            X.0sP r15 = r9.A0B
            X.0sa r14 = r9.A02
            java.lang.Object r11 = r0.A07
            X.Inh r1 = new X.Inh
            r1.<init>(r11, r12)
            r18 = r9
            r19 = r3
            r20 = r2
            r21 = r6
            r25 = r4
            r27 = r14
            r28 = r1
            r29 = r15
            r30 = r10
            r31 = r17
            r17 = r33
            r15 = r5
            r15.A01(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            X.GgO r1 = r9.A04()
            X.0Ud r4 = r1.A0X
            java.lang.Object r3 = r0.A08
            java.lang.Object r2 = r0.A01
            r33 = 2
            X.MGO r1 = new X.MGO
            r26 = r1
            r27 = r6
            r28 = r13
            r29 = r9
            r30 = r3
            r31 = r2
            r26.<init>(r27, r28, r29, r30, r31, r32, r33)
            r0.A00 = r8
            java.lang.Object r1 = X.AnonymousClass11O.A00(r0, r1, r4)
            goto L_0x1143
        L_0x0ee8:
            int r2 = r0.A00
            r5 = 1
            if (r2 == 0) goto L_0x0ef4
            if (r2 == r5) goto L_0x10ab
            java.lang.IllegalStateException r2 = X.AnonymousClass7TE.A0x()
            throw r2
        L_0x0ef4:
            X.0eS.A00(r1)
            java.lang.Object r1 = r0.A04
            X.07V r2 = X.JTO.A0J(r1)
            java.lang.Object r1 = r0.A03
            X.07U r1 = (X.07U) r1
            r15 = 0
            java.lang.Object r11 = r0.A09
            java.lang.Object r9 = r0.A07
            java.lang.Object r12 = r0.A05
            java.lang.Object r4 = r0.A02
            java.lang.Object r3 = r0.A01
            java.lang.Object r10 = r0.A08
            r16 = 6
            X.JVZ r8 = new X.JVZ
            r13 = r3
            r14 = r4
            r8.<init>((java.lang.Object) r9, (java.lang.Object) r10, (java.lang.Object) r11, (java.lang.Object) r12, (java.lang.Object) r13, (java.lang.Object) r14, (X.AnonymousClass4D7) r15, (int) r16)
        L_0x0f17:
            r0.A00 = r5
        L_0x0f19:
            java.lang.Object r0 = X.AnonymousClass3DM.A00(r1, r2, r0, r8)
        L_0x0f1d:
            if (r0 != r7) goto L_0x115a
            return r7
        L_0x0f20:
            int r4 = r0.A00
            r6 = 4
            r3 = 3
            r9 = 2
            r2 = 1
            r5 = 0
            if (r4 == 0) goto L_0x0f6c
            if (r4 == r2) goto L_0x0f62
            if (r4 == r9) goto L_0x0fd5
            if (r4 == r3) goto L_0x1022
            java.lang.Object r3 = r0.A05
            X.7fv r3 = (X.C337227fv) r3
            java.lang.Object r8 = r0.A04
            X.MRk r8 = (X.C66430MRk) r8
            java.lang.Object r4 = r0.A03
            X.GlX r4 = (X.C53285GlX) r4
            X.0eS.A00(r1)
        L_0x0f3e:
            if (r3 == 0) goto L_0x0f60
            boolean r7 = r3.A09
        L_0x0f42:
            java.lang.String r6 = r4.A04
            java.lang.String r4 = r4.A03
            if (r3 == 0) goto L_0x0f5c
            java.lang.String r2 = r3.A06
            java.lang.String r1 = r3.A05
            java.util.List r0 = r3.A08
            java.lang.Integer r5 = r3.A03
        L_0x0f50:
            r9 = r5
            r10 = r6
            r11 = r4
            r12 = r2
            r13 = r1
            r14 = r0
            r15 = r7
            r8.AUc(r9, r10, r11, r12, r13, r14, r15)
            goto L_0x115a
        L_0x0f5c:
            r2 = r5
            r1 = r5
            r0 = r5
            goto L_0x0f50
        L_0x0f60:
            r7 = 0
            goto L_0x0f42
        L_0x0f62:
            java.lang.Object r4 = r0.A03
            X.GlX r4 = (X.C53285GlX) r4
            X.0eS.A00(r1)
            X.3Ii r1 = (X.C239803Ii) r1
            goto L_0x0fde
        L_0x0f6c:
            X.0eS.A00(r1)
            java.lang.Object r11 = r0.A03
            X.4Cq r11 = (X.C262224Cq) r11
            java.lang.Object r1 = r0.A01
            X.7dj r1 = (X.C335907dj) r1
            java.lang.String r10 = r1.A0K
            java.lang.String r2 = r1.A0J
            if (r2 != 0) goto L_0x0f7f
            java.lang.String r2 = ""
        L_0x0f7f:
            r8 = 0
            r17 = 0
            r16 = 0
            X.GlX r4 = new X.GlX
            r12 = r4
            r13 = r5
            r14 = r10
            r15 = r2
            r19 = r16
            r12.<init>(r13, r14, r15, r16, r17, r19)
            java.lang.Object r13 = r0.A09
            com.instagram.comments.mvvm.data.MediaCommentListRepository r13 = (com.instagram.comments.mvvm.data.MediaCommentListRepository) r13
            r10 = 20
            X.MGz r2 = new X.MGz
            r2.<init>((java.lang.Object) r1, (java.lang.Object) r13, (X.AnonymousClass4D7) r5, (int) r10)
            X.AnonymousClass7TE.A1Z(r2, r11)
            com.instagram.common.session.UserSession r12 = r13.A0B
            java.lang.String r11 = r13.A0D
            java.lang.Object r10 = r0.A02
            X.1Xl r10 = (X.1Xl) r10
            X.GmL r14 = r13.A04
            X.7fv r2 = r1.A02
            if (r2 == 0) goto L_0x0fd3
            com.instagram.api.schemas.CommentGiphyMediaInfo r13 = r2.A00
        L_0x0fad:
            if (r2 == 0) goto L_0x0fb1
            X.571 r8 = r2.A01
        L_0x0fb1:
            if (r2 == 0) goto L_0x0fd1
            X.572 r2 = r2.A02
        L_0x0fb5:
            java.lang.String r1 = r1.A0N
            r0.A03 = r4
            r0.A00 = r9
            r15 = r4
            r16 = r12
            r17 = r8
            r18 = r2
            r19 = r10
            r20 = r11
            r21 = r1
            r22 = r0
            java.lang.Object r1 = com.instagram.comments.mvvm.data.network.CommentPostingRequestExtensionsKt.A02(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            if (r1 != r7) goto L_0x0fdc
            return r7
        L_0x0fd1:
            r2 = r5
            goto L_0x0fb5
        L_0x0fd3:
            r13 = r5
            goto L_0x0fad
        L_0x0fd5:
            java.lang.Object r4 = r0.A03
            X.GlX r4 = (X.C53285GlX) r4
            X.0eS.A00(r1)
        L_0x0fdc:
            X.3Ii r1 = (X.C239803Ii) r1
        L_0x0fde:
            java.lang.Object r12 = r0.A09
            com.instagram.comments.mvvm.data.MediaCommentListRepository r12 = (com.instagram.comments.mvvm.data.MediaCommentListRepository) r12
            java.lang.Object r8 = r0.A01
            X.7dj r8 = (X.C335907dj) r8
            java.lang.Object r11 = r0.A08
            X.B1F r11 = (X.B1F) r11
            boolean r2 = r1 instanceof X.C239793Ih
            if (r2 == 0) goto L_0x1019
            X.3Ih r1 = (X.C239793Ih) r1
            java.lang.Object r10 = r1.A00
            X.JwJ r10 = (X.C61081JwJ) r10
            if (r10 == 0) goto L_0x1029
            java.lang.String r9 = r4.A04
            java.lang.String r8 = r8.A0N
            X.GmL r1 = r12.A04
            boolean r2 = r1.A0b
            X.7a4 r1 = r4.A02
            if (r1 == 0) goto L_0x1017
            java.util.List r15 = r1.A00()
        L_0x1006:
            r0.A03 = r4
            r0.A00 = r3
            r13 = r9
            r14 = r8
            r16 = r0
            r17 = r2
            java.lang.Object r1 = com.instagram.comments.mvvm.data.MediaCommentListRepository.A01(r10, r11, r12, r13, r14, r15, r16, r17)
            if (r1 != r7) goto L_0x1029
            return r7
        L_0x1017:
            r15 = r5
            goto L_0x1006
        L_0x1019:
            boolean r2 = r1 instanceof X.C297815sO
            if (r2 != 0) goto L_0x102d
            X.Wub r2 = X.AnonymousClass7TE.A1K()
            throw r2
        L_0x1022:
            java.lang.Object r4 = r0.A03
            X.GlX r4 = (X.C53285GlX) r4
            X.0eS.A00(r1)
        L_0x1029:
            X.3Ih r1 = X.C51967G9n.A0d()
        L_0x102d:
            java.lang.Object r10 = r0.A09
            com.instagram.comments.mvvm.data.MediaCommentListRepository r10 = (com.instagram.comments.mvvm.data.MediaCommentListRepository) r10
            java.lang.Object r9 = r0.A01
            X.7dj r9 = (X.C335907dj) r9
            java.lang.Object r8 = r0.A07
            X.MRk r8 = (X.C66430MRk) r8
            boolean r2 = r1 instanceof X.C239793Ih
            if (r2 != 0) goto L_0x115a
            boolean r2 = r1 instanceof X.C297815sO
            if (r2 == 0) goto L_0x1179
            X.5sO r1 = (X.C297815sO) r1
            java.lang.Object r3 = r1.A00
            X.7fv r3 = (X.C337227fv) r3
            java.lang.String r2 = r4.A04
            java.lang.String r1 = r9.A0N
            r0.A03 = r4
            r0.A04 = r8
            r0.A05 = r3
            r0.A00 = r6
            java.lang.Object r0 = com.instagram.comments.mvvm.data.MediaCommentListRepository.A02(r10, r3, r2, r1, r0)
            if (r0 != r7) goto L_0x0f3e
            return r7
        L_0x105a:
            int r2 = r0.A00
            r9 = 1
            if (r2 == 0) goto L_0x1066
            if (r2 == r9) goto L_0x10ab
            java.lang.IllegalStateException r2 = X.AnonymousClass7TE.A0x()
            throw r2
        L_0x1066:
            X.0eS.A00(r1)
            com.facebook.browser.lite.extensions.autofill.base.actionhandler.vault.VaultActionHandler r10 = com.facebook.browser.lite.extensions.autofill.base.actionhandler.vault.VaultActionHandler.A00
            java.lang.Object r8 = r0.A08
            com.fbpay.w3c.CardDetails r8 = (com.fbpay.w3c.CardDetails) r8
            java.lang.Object r6 = r0.A05
            com.meta.vault.service.base.DefaultVaultService r6 = (com.meta.vault.service.base.DefaultVaultService) r6
            java.lang.Object r5 = r0.A07
            X.4gR r5 = (X.C270254gR) r5
            java.lang.Object r4 = r0.A01
            androidx.fragment.app.FragmentActivity r4 = (androidx.fragment.app.FragmentActivity) r4
            java.lang.Object r3 = r0.A03
            X.07Z r3 = (X.AnonymousClass07Z) r3
            java.lang.Object r2 = r0.A09
            X.S33 r2 = (X.S33) r2
            java.lang.Object r11 = r0.A04
            android.os.Bundle r11 = (android.os.Bundle) r11
            java.lang.Object r1 = r0.A02
            X.S0E r1 = (X.S0E) r1
            r0.A00 = r9
            r12 = r4
            r13 = r3
            r14 = r1
            r15 = r5
            r16 = r8
            r17 = r2
            r18 = r6
            r19 = r0
            java.lang.Object r1 = r10.A00(r11, r12, r13, r14, r15, r16, r17, r18, r19)
            goto L_0x1143
        L_0x109f:
            int r2 = r0.A00
            r6 = 1
            if (r2 == 0) goto L_0x10b0
            if (r2 == r6) goto L_0x10ab
            java.lang.IllegalStateException r2 = X.AnonymousClass7TE.A0x()
            throw r2
        L_0x10ab:
            X.0eS.A00(r1)
            goto L_0x115a
        L_0x10b0:
            X.0eS.A00(r1)
            java.lang.Object r9 = r0.A09
            X.Qcf r9 = (X.C7909Qcf) r9
            X.4CZ r5 = r9.A02
            if (r5 != 0) goto L_0x1115
            java.lang.String r0 = "ioDispatcher"
            X.0qQ.A0F(r0)
            X.00P r2 = X.AnonymousClass00P.createAndThrow()
            throw r2
        L_0x10c5:
            int r2 = r0.A00
            r6 = 1
            if (r2 == 0) goto L_0x10d5
            if (r2 != r6) goto L_0x11cc
            java.lang.Object r3 = r0.A05
            X.4Cq r3 = (X.C262224Cq) r3
            X.0eS.A00(r1)     // Catch:{ CancellationException -> 0x1146 }
            goto L_0x115a
        L_0x10d5:
            X.0eS.A00(r1)
            java.lang.Object r3 = r0.A05
            X.4Cq r3 = (X.C262224Cq) r3
            java.lang.Object r1 = r0.A09     // Catch:{ CancellationException -> 0x1146 }
            androidx.compose.foundation.gestures.DragGestureNode r1 = (androidx.compose.foundation.gestures.DragGestureNode) r1     // Catch:{ CancellationException -> 0x1146 }
            X.6Gj r9 = r1.A00     // Catch:{ CancellationException -> 0x1146 }
            java.lang.Object r5 = r0.A07     // Catch:{ CancellationException -> 0x1146 }
            X.6FR r5 = (X.AnonymousClass6FR) r5     // Catch:{ CancellationException -> 0x1146 }
            java.lang.Object r4 = r0.A03     // Catch:{ CancellationException -> 0x1146 }
            X.0sK r4 = (X.0sK) r4     // Catch:{ CancellationException -> 0x1146 }
            java.lang.Object r2 = r0.A02     // Catch:{ CancellationException -> 0x1146 }
            X.0sP r2 = (X.0sP) r2     // Catch:{ CancellationException -> 0x1146 }
            java.lang.Object r12 = r0.A01     // Catch:{ CancellationException -> 0x1146 }
            X.0sa r12 = (X.C62320sa) r12     // Catch:{ CancellationException -> 0x1146 }
            java.lang.Object r11 = r0.A04     // Catch:{ CancellationException -> 0x1146 }
            X.0sa r11 = (X.C62320sa) r11     // Catch:{ CancellationException -> 0x1146 }
            java.lang.Object r1 = r0.A08     // Catch:{ CancellationException -> 0x1146 }
            X.0sL r1 = (X.0sL) r1     // Catch:{ CancellationException -> 0x1146 }
            r0.A05 = r3     // Catch:{ CancellationException -> 0x1146 }
            r0.A00 = r6     // Catch:{ CancellationException -> 0x1146 }
            X.0rl r16 = new X.0rl     // Catch:{ CancellationException -> 0x1146 }
            r16.<init>()     // Catch:{ CancellationException -> 0x1146 }
            r10 = 0
            androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGestures$9 r8 = new androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGestures$9     // Catch:{ CancellationException -> 0x1146 }
            r13 = r2
            r14 = r1
            r15 = r4
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16)     // Catch:{ CancellationException -> 0x1146 }
            java.lang.Object r1 = androidx.compose.foundation.gestures.ForEachGestureKt.A01(r5, r0, r8)     // Catch:{ CancellationException -> 0x1146 }
            if (r1 == r7) goto L_0x1143
            X.0gF r1 = X.C60340gF.A00     // Catch:{ CancellationException -> 0x1146 }
            goto L_0x1143
        L_0x1115:
            java.lang.Object r11 = r0.A08
            X.SSw r11 = (X.C11420SSw) r11
            java.lang.Object r10 = r0.A07
            X.SFy r10 = (X.C11224SFy) r10
            java.lang.Object r4 = r0.A03
            X.4uI r4 = (X.C277014uI) r4
            java.lang.Object r12 = r0.A01
            X.6Rx r12 = (X.C307896Rx) r12
            java.lang.Object r3 = r0.A05
            java.io.File r3 = (java.io.File) r3
            java.lang.Object r2 = r0.A02
            X.4uI r2 = (X.C277014uI) r2
            java.lang.Object r1 = r0.A04
            X.4uI r1 = (X.C277014uI) r1
            r17 = 0
            X.Fy3 r8 = new X.Fy3
            r13 = r4
            r14 = r2
            r15 = r1
            r16 = r3
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r0.A00 = r6
            java.lang.Object r1 = X.1Eo.A00(r0, r5, r8)
        L_0x1143:
            if (r1 != r7) goto L_0x115a
            return r7
        L_0x1146:
            r2 = move-exception
            java.lang.Object r0 = r0.A09
            androidx.compose.foundation.gestures.DragGestureNode r0 = (androidx.compose.foundation.gestures.DragGestureNode) r0
            X.3ju r1 = r0.A02
            if (r1 == 0) goto L_0x1154
            X.GTu r0 = X.C52468GTu.A00
            r1.FIG(r0)
        L_0x1154:
            boolean r0 = X.19E.A07(r3)
            if (r0 == 0) goto L_0x0016
        L_0x115a:
            X.0gF r7 = X.C60340gF.A00
        L_0x115c:
            return r7
        L_0x115d:
            java.lang.IllegalStateException r2 = X.AnonymousClass7TE.A0x()
            throw r2
        L_0x1162:
            java.lang.IllegalStateException r2 = X.AnonymousClass7TE.A0x()
            throw r2
        L_0x1167:
            return r7
        L_0x1168:
            r2 = move-exception
            goto L_0x116b
        L_0x116a:
            r2 = move-exception
        L_0x116b:
            r4.A05(r5)
            throw r2
        L_0x116f:
            X.Wub r2 = X.AnonymousClass7TE.A1K()
            throw r2
        L_0x1174:
            java.lang.IllegalStateException r2 = X.AnonymousClass7TE.A0x()
            throw r2
        L_0x1179:
            X.Wub r2 = X.AnonymousClass7TE.A1K()
            throw r2
        L_0x117e:
            int r2 = r0.A00
            r5 = 1
            if (r2 == 0) goto L_0x118a
            if (r2 == r5) goto L_0x11c4
            java.lang.IllegalStateException r2 = X.AnonymousClass7TE.A0x()
            throw r2
        L_0x118a:
            X.0eS.A00(r1)
            java.lang.Object r4 = r0.A09
            X.E2s r4 = (X.C47446E2s) r4
            X.0eM r1 = r4.A03
            java.lang.Object r1 = r1.getValue()
            X.DlS r1 = (X.C46793DlS) r1
            X.0Ud r3 = r1.A05
            java.lang.Object r9 = r0.A04
            android.widget.TextView r9 = (android.widget.TextView) r9
            java.lang.Object r10 = r0.A03
            android.widget.TextView r10 = (android.widget.TextView) r10
            java.lang.Object r12 = r0.A01
            X.2t9 r12 = (X.AnonymousClass2t9) r12
            java.lang.Object r2 = r0.A07
            X.2t9 r2 = (X.AnonymousClass2t9) r2
            java.lang.Object r11 = r0.A02
            androidx.recyclerview.widget.GridLayoutManager r11 = (androidx.recyclerview.widget.GridLayoutManager) r11
            java.lang.Object r1 = r0.A08
            com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout r1 = (com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout) r1
            X.FxG r8 = new X.FxG
            r13 = r2
            r14 = r4
            r15 = r1
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
            r0.A00 = r5
            java.lang.Object r0 = r3.collect(r8, r0)
            if (r0 != r7) goto L_0x11c7
            return r7
        L_0x11c4:
            X.0eS.A00(r1)
        L_0x11c7:
            X.MCr r2 = X.C51965G9l.A0x()
            throw r2
        L_0x11cc:
            java.lang.IllegalStateException r2 = X.AnonymousClass7TE.A0x()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59700JUh.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C59700JUh) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59700JUh(Object obj, Object obj2, Object obj3, AnonymousClass4D7 r5, int i) {
        super(2, r5);
        this.A06 = i;
        this.A09 = obj;
        this.A07 = obj2;
        this.A08 = obj3;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59700JUh(C66430MRk mRk, B1F b1f, MediaCommentListRepository mediaCommentListRepository, C335907dj r5, 1Xl r6, AnonymousClass4D7 r7) {
        super(2, r7);
        this.A06 = 3;
        this.A01 = r5;
        this.A09 = mediaCommentListRepository;
        this.A02 = r6;
        this.A08 = b1f;
        this.A07 = mRk;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59700JUh(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, AnonymousClass4D7 r9, int i) {
        super(2, r9);
        this.A06 = i;
        this.A09 = obj;
        this.A07 = obj2;
        this.A03 = obj3;
        this.A02 = obj4;
        this.A01 = obj5;
        this.A04 = obj6;
        this.A08 = obj7;
    }
}
