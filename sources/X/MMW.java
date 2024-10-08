package X;

public final class MMW extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;
    public final Object A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MMW(int i, Object obj, Object obj2) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    public static MMW A00(Object obj, Object obj2, int i) {
        return new MMW(i, obj, obj2);
    }

    /* JADX WARNING: type inference failed for: r9v0, types: [java.lang.Object, X.8In] */
    /* JADX WARNING: type inference failed for: r6v0, types: [java.lang.Object, X.Kpl] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x034f, code lost:
        r5[0] = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0352, code lost:
        X.C65329LrS.A00(r9, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0357, code lost:
        return X.C60340gF.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x0426, code lost:
        X.0qQ.A0F(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x042d, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00bf, code lost:
        r6 = X.AnonymousClass7TE.A1E();
        r0 = (X.C64808LiT) r14.A01;
        X.C64127LPb.A00(X.C61220JzD.A00(r0.A01, r6, r0.A00), r2, r3, (java.lang.String) null, (java.lang.String) null, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x014e, code lost:
        if (r13 == false) goto L_0x0150;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x01cb, code lost:
        if (r0 != null) goto L_0x01cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x01cd, code lost:
        r0.invoke();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0287, code lost:
        X.LYN.A00(r3, 8, new X.C51793G2c(r2, r0));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r14 = this;
            int r0 = r14.A00
            switch(r0) {
                case 0: goto L_0x007f;
                case 1: goto L_0x0005;
                case 2: goto L_0x0097;
                case 3: goto L_0x0005;
                case 4: goto L_0x0005;
                case 5: goto L_0x00ae;
                case 6: goto L_0x00b7;
                case 7: goto L_0x00d6;
                case 8: goto L_0x006c;
                case 9: goto L_0x018a;
                case 10: goto L_0x01bc;
                case 11: goto L_0x0005;
                case 12: goto L_0x0018;
                case 13: goto L_0x0005;
                case 14: goto L_0x0005;
                case 15: goto L_0x0018;
                case 16: goto L_0x0005;
                case 17: goto L_0x0018;
                case 18: goto L_0x0018;
                case 19: goto L_0x0005;
                case 20: goto L_0x0005;
                case 21: goto L_0x0406;
                case 22: goto L_0x01d2;
                case 23: goto L_0x020e;
                case 24: goto L_0x0239;
                case 25: goto L_0x024b;
                case 26: goto L_0x0276;
                case 27: goto L_0x0293;
                case 28: goto L_0x02dc;
                case 29: goto L_0x032d;
                case 30: goto L_0x0358;
                case 31: goto L_0x0369;
                case 32: goto L_0x037b;
                case 33: goto L_0x038d;
                case 34: goto L_0x0054;
                case 35: goto L_0x0018;
                case 36: goto L_0x0037;
                case 37: goto L_0x0018;
                case 38: goto L_0x0005;
                case 39: goto L_0x0018;
                case 40: goto L_0x03a0;
                case 41: goto L_0x0005;
                case 42: goto L_0x0005;
                case 43: goto L_0x0005;
                case 44: goto L_0x0005;
                case 45: goto L_0x0005;
                case 46: goto L_0x0005;
                case 47: goto L_0x0005;
                case 48: goto L_0x0018;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r14.A01
            X.0sa r0 = (X.C62320sa) r0
            if (r0 == 0) goto L_0x0011
            java.lang.Object r4 = r0.invoke()
            if (r4 != 0) goto L_0x0017
        L_0x0011:
            java.lang.Object r0 = r14.A02
            X.2YQ r4 = X.JTU.A08(r0)
        L_0x0017:
            return r4
        L_0x0018:
            java.lang.Object r0 = r14.A01
            X.0sa r0 = (X.C62320sa) r0
            if (r0 == 0) goto L_0x0024
            java.lang.Object r4 = r0.invoke()
            if (r4 != 0) goto L_0x0017
        L_0x0024:
            java.lang.Object r0 = r14.A02
            X.07g r1 = X.C51969G9p.A0c(r0)
            boolean r0 = r1 instanceof X.AnonymousClass07P
            if (r0 == 0) goto L_0x044e
            X.07P r1 = (X.AnonymousClass07P) r1
            if (r1 == 0) goto L_0x044e
            X.2YQ r4 = r1.getDefaultViewModelCreationExtras()
            return r4
        L_0x0037:
            java.lang.Object r0 = r14.A01
            X.07g r1 = X.C51969G9p.A0c(r0)
            boolean r0 = r1 instanceof X.AnonymousClass07P
            if (r0 == 0) goto L_0x004b
            X.07P r1 = (X.AnonymousClass07P) r1
            if (r1 == 0) goto L_0x004b
            X.2YM r4 = r1.getDefaultViewModelProviderFactory()
            if (r4 != 0) goto L_0x0017
        L_0x004b:
            java.lang.Object r0 = r14.A02
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            X.2YM r4 = r0.getDefaultViewModelProviderFactory()
            return r4
        L_0x0054:
            java.lang.Object r1 = r14.A01
            android.view.View r1 = (android.view.View) r1
            r0 = 2131433741(0x7f0b190d, float:1.8489276E38)
            androidx.recyclerview.widget.RecyclerView r1 = X.DbT.A0I(r1, r0)
            android.content.Context r0 = r1.getContext()
            X.DbV.A1A(r0, r1)
            int r0 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE
            java.lang.String r0 = "recyclerAdapter"
            goto L_0x0426
        L_0x006c:
            java.lang.Object r1 = r14.A02
            X.K6H r1 = (X.K6H) r1
            r0 = 0
            r1.A08 = r0
            X.0eM r0 = r1.A0N
            r0.getValue()
            java.lang.String r0 = "url"
            java.lang.NullPointerException r0 = X.AnonymousClass7TE.A11(r0)
            throw r0
        L_0x007f:
            java.lang.Object r3 = r14.A02
            com.instagram.common.session.UserSession r3 = (com.instagram.common.session.UserSession) r3
            java.lang.Object r2 = r14.A01
            X.LDW r2 = (X.LDW) r2
            com.instagram.mediakit.api.MediaKitApi r1 = new com.instagram.mediakit.api.MediaKitApi
            r1.<init>(r3, r2)
            com.instagram.mediakit.repository.upload.MediaKitUploadApi r0 = new com.instagram.mediakit.repository.upload.MediaKitUploadApi
            r0.<init>(r3)
            com.instagram.mediakit.repository.MediaKitRepository r4 = new com.instagram.mediakit.repository.MediaKitRepository
            r4.<init>(r3, r2, r1, r0)
            return r4
        L_0x0097:
            java.lang.Object r1 = r14.A02
            X.4DH r1 = (X.AnonymousClass4DH) r1
            boolean r0 = r1 instanceof com.instagram.igds.components.bottomsheet.BottomSheetFragment
            if (r0 == 0) goto L_0x00a8
            com.instagram.igds.components.bottomsheet.BottomSheetFragment r1 = (com.instagram.igds.components.bottomsheet.BottomSheetFragment) r1
            if (r1 == 0) goto L_0x00a8
            X.7Pu r0 = r1.A02
            X.DbW.A1K(r0)
        L_0x00a8:
            java.lang.Object r0 = r14.A01
            X.0sa r0 = (X.C62320sa) r0
            goto L_0x01cd
        L_0x00ae:
            java.lang.Object r0 = r14.A02
            X.KEk r0 = (X.C61608KEk) r0
            X.MXF r2 = r0.A00
            java.lang.Integer r3 = X.AnonymousClass05K.A0e
            goto L_0x00bf
        L_0x00b7:
            java.lang.Object r0 = r14.A02
            X.KEk r0 = (X.C61608KEk) r0
            X.MXF r2 = r0.A00
            java.lang.Integer r3 = X.AnonymousClass05K.A0f
        L_0x00bf:
            r4 = 0
            java.util.HashMap r6 = X.AnonymousClass7TE.A1E()
            java.lang.Object r0 = r14.A01
            X.LiT r0 = (X.C64808LiT) r0
            X.JzD r1 = r0.A01
            int r0 = r0.A00
            X.KkN r1 = X.C61220JzD.A00(r1, r6, r0)
            r5 = r4
            X.C64127LPb.A00(r1, r2, r3, r4, r5, r6)
            goto L_0x0355
        L_0x00d6:
            java.lang.Object r10 = r14.A02
            X.LiT r10 = (X.C64808LiT) r10
            X.LrS r9 = r10.A03
            java.lang.Object r0 = r14.A01
            X.Jpd r0 = (X.C60692Jpd) r0
            android.content.Context r7 = r0.A02
            r12 = 0
            r1 = 1
            X.Ltt r5 = X.C65471Ltt.A00
            java.lang.String r11 = r10.A05
            com.instagram.mediakit.config.MediaKitSectionActionSheetConfig r4 = new com.instagram.mediakit.config.MediaKitSectionActionSheetConfig
            r4.<init>(r11)
            r6 = 2131966635(0x7f133aab, float:1.9570114E38)
            int r3 = X.2Yu.A03(r7)
            r0 = 28
            X.MMW r2 = A00(r10, r9, r0)
            X.FYF r0 = new X.FYF
            r0.<init>(r2, r6, r3)
            java.util.List r6 = r4.A00
            r6.add(r0)
            X.JjW r0 = r9.A02
            com.instagram.mediakit.repository.MediaKitRepository r0 = r0.A07
            X.LFM r0 = r0.A02
            java.util.ArrayList r0 = r0.A04
            int r0 = r0.size()
            if (r0 <= r1) goto L_0x0127
            r3 = 2131966636(0x7f133aac, float:1.9570116E38)
            int r2 = X.2Yu.A07(r7)
            r0 = 29
            X.MMW r1 = A00(r10, r9, r0)
            X.FYF r0 = new X.FYF
            r0.<init>(r1, r3, r2)
            r6.add(r0)
        L_0x0127:
            com.instagram.mediakit.model.MediaKitSectionType r3 = r10.A02
            com.instagram.mediakit.model.MediaKitSectionType r0 = com.instagram.mediakit.model.MediaKitSectionType.MEDIA_POSTS
            if (r3 != r0) goto L_0x0164
            r8 = 2131966632(0x7f133aa8, float:1.9570108E38)
            int r2 = X.2Yu.A07(r7)
            r0 = 4
            X.Iw3 r1 = new X.Iw3
            r1.<init>(r11, r9, r0)
            X.FYF r0 = new X.FYF
            r0.<init>(r1, r8, r2)
            r6.add(r0)
            boolean r0 = r10 instanceof X.KUQ
            if (r0 == 0) goto L_0x0188
            r0 = r10
            X.KUQ r0 = (X.KUQ) r0
            boolean r13 = r0.A03
            r2 = 2131966634(0x7f133aaa, float:1.9570112E38)
            if (r13 != 0) goto L_0x0153
        L_0x0150:
            r2 = 2131966633(0x7f133aa9, float:1.957011E38)
        L_0x0153:
            int r1 = X.2Yu.A07(r7)
            X.MJC r8 = new X.MJC
            r8.<init>(r9, r10, r11, r12, r13)
            X.FYF r0 = new X.FYF
            r0.<init>(r8, r2, r1)
            r6.add(r0)
        L_0x0164:
            com.instagram.mediakit.model.MediaKitSectionType r0 = com.instagram.mediakit.model.MediaKitSectionType.ACCOUNTS
            if (r3 != r0) goto L_0x017d
            r3 = 2131966630(0x7f133aa6, float:1.9570104E38)
            int r2 = X.2Yu.A07(r7)
            r0 = 5
            X.Iw3 r1 = new X.Iw3
            r1.<init>(r11, r9, r0)
            X.FYF r0 = new X.FYF
            r0.<init>(r1, r3, r2)
            r6.add(r0)
        L_0x017d:
            X.Lto r0 = new X.Lto
            r0.<init>(r4)
            X.MQn[] r5 = new X.C66407MQn[]{r5, r0}
            goto L_0x0352
        L_0x0188:
            r13 = 0
            goto L_0x0150
        L_0x018a:
            java.lang.Object r0 = r14.A02
            X.K6H r0 = (X.K6H) r0
            X.0eM r0 = r0.A0O
            X.JjW r3 = X.JTT.A0a(r0)
            java.lang.Object r0 = r14.A01
            X.MQn r0 = (X.C66407MQn) r0
            X.Ltr r0 = (X.C65469Ltr) r0
            X.Khf r1 = r0.A01
            r0 = 0
            X.0qQ.A0B(r1, r0)
            java.lang.Integer r0 = r1.A00
            if (r0 == 0) goto L_0x0355
            int r2 = r0.intValue()
            r0 = 0
            X.LE6 r1 = new X.LE6
            r1.<init>(r0, r0, r2)
            r0 = 2131238110(0x7f081cde, float:1.809249E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A00 = r0
            X.C60327JjW.A00(r1, r3)
            goto L_0x0355
        L_0x01bc:
            java.lang.Object r1 = r14.A02
            X.K6H r1 = (X.K6H) r1
            r0 = 0
            r1.A08 = r0
            java.lang.Object r0 = r14.A01
            X.MQn r0 = (X.C66407MQn) r0
            X.Ltx r0 = (X.C65475Ltx) r0
            X.0sa r0 = r0.A00
            if (r0 == 0) goto L_0x0355
        L_0x01cd:
            r0.invoke()
            goto L_0x0355
        L_0x01d2:
            java.lang.Object r3 = r14.A02
            X.Jpd r3 = (X.C60692Jpd) r3
            int r0 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE
            X.0eM r0 = r3.A0A
            android.widget.TextView r2 = X.JTO.A0I(r0)
            if (r2 == 0) goto L_0x01f2
            java.lang.Object r0 = r14.A01
            X.L9F r0 = (X.L9F) r0
            int r1 = r0.A03
            android.text.InputFilter$LengthFilter r0 = new android.text.InputFilter$LengthFilter
            r0.<init>(r1)
            android.text.InputFilter$LengthFilter[] r0 = new android.text.InputFilter.LengthFilter[]{r0}
            r2.setFilters(r0)
        L_0x01f2:
            X.0eM r0 = r3.A04
            android.widget.TextView r2 = X.JTO.A0I(r0)
            if (r2 == 0) goto L_0x0355
            java.lang.Object r0 = r14.A01
            X.L9F r0 = (X.L9F) r0
            int r1 = r0.A01
            android.text.InputFilter$LengthFilter r0 = new android.text.InputFilter$LengthFilter
            r0.<init>(r1)
            android.text.InputFilter$LengthFilter[] r0 = new android.text.InputFilter.LengthFilter[]{r0}
            r2.setFilters(r0)
            goto L_0x0355
        L_0x020e:
            java.lang.Object r4 = r14.A02
            X.Jpd r4 = (X.C60692Jpd) r4
            int r0 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE
            X.0eM r2 = r4.A04
            android.widget.TextView r1 = X.JTO.A0I(r2)
            if (r1 == 0) goto L_0x0221
            android.text.TextWatcher r0 = r4.A00
            r1.removeTextChangedListener(r0)
        L_0x0221:
            android.widget.TextView r3 = X.JTO.A0I(r2)
            if (r3 == 0) goto L_0x0237
            java.lang.Object r2 = r14.A01
            r1 = 18
            X.LWP r0 = new X.LWP
            r0.<init>((java.lang.Object) r2, (int) r1)
            r3.addTextChangedListener(r0)
        L_0x0233:
            r4.A00 = r0
            goto L_0x0355
        L_0x0237:
            r0 = 0
            goto L_0x0233
        L_0x0239:
            java.lang.Object r1 = r14.A02
            X.Jpd r1 = (X.C60692Jpd) r1
            int r0 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE
            X.0eM r0 = r1.A04
            android.view.View r3 = X.AnonymousClass7TE.A0c(r0)
            if (r3 == 0) goto L_0x0355
            java.lang.Object r2 = r14.A01
            r0 = 4
            goto L_0x0287
        L_0x024b:
            java.lang.Object r4 = r14.A02
            X.Jpd r4 = (X.C60692Jpd) r4
            int r0 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE
            X.0eM r2 = r4.A0A
            android.widget.TextView r1 = X.JTO.A0I(r2)
            if (r1 == 0) goto L_0x025e
            android.text.TextWatcher r0 = r4.A01
            r1.removeTextChangedListener(r0)
        L_0x025e:
            android.widget.TextView r3 = X.JTO.A0I(r2)
            if (r3 == 0) goto L_0x0274
            java.lang.Object r2 = r14.A01
            r1 = 19
            X.LWP r0 = new X.LWP
            r0.<init>((java.lang.Object) r2, (int) r1)
            r3.addTextChangedListener(r0)
        L_0x0270:
            r4.A01 = r0
            goto L_0x0355
        L_0x0274:
            r0 = 0
            goto L_0x0270
        L_0x0276:
            java.lang.Object r1 = r14.A02
            X.Jpd r1 = (X.C60692Jpd) r1
            int r0 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE
            X.0eM r0 = r1.A0A
            android.view.View r3 = X.AnonymousClass7TE.A0c(r0)
            if (r3 == 0) goto L_0x0355
            java.lang.Object r2 = r14.A01
            r0 = 5
        L_0x0287:
            X.G2c r1 = new X.G2c
            r1.<init>(r2, r0)
            r0 = 8
            X.LYN.A00(r3, r0, r1)
            goto L_0x0355
        L_0x0293:
            java.lang.Object r4 = r14.A02
            X.LrS r4 = (X.C65329LrS) r4
            X.MXF r6 = r4.A00
            java.lang.Integer r7 = X.AnonymousClass05K.A0R
            r8 = 0
            java.util.HashMap r10 = X.AnonymousClass7TE.A1E()
            java.lang.Object r3 = r14.A01
            X.LiT r3 = (X.C64808LiT) r3
            X.JzD r2 = r3.A01
            int r0 = r3.A00
            r1 = 0
            X.KkN r5 = X.C61220JzD.A00(r2, r10, r0)
            r9 = r8
            X.C64127LPb.A00(r5, r6, r7, r8, r9, r10)
            X.JjW r0 = r4.A02
            java.lang.String r6 = r3.A05
            X.0qQ.A0B(r6, r1)
            com.instagram.mediakit.repository.MediaKitRepository r5 = r0.A07
            X.LFM r0 = r5.A02
            java.util.ArrayList r4 = r0.A04
            java.util.Iterator r3 = r4.iterator()
            r2 = 0
        L_0x02c3:
            boolean r0 = r3.hasNext()
            r1 = -1
            if (r0 == 0) goto L_0x02d5
            boolean r0 = X.C61220JzD.A01(r6, r3)
            if (r0 == 0) goto L_0x02d9
            if (r2 <= r1) goto L_0x02d5
            r4.remove(r2)
        L_0x02d5:
            com.instagram.mediakit.repository.MediaKitRepository.A05(r5)
            goto L_0x0355
        L_0x02d9:
            int r2 = r2 + 1
            goto L_0x02c3
        L_0x02dc:
            java.lang.Object r9 = r14.A02
            X.LrS r9 = (X.C65329LrS) r9
            X.MXF r4 = r9.A00
            java.lang.Integer r5 = X.AnonymousClass05K.A0Q
            r6 = 0
            java.util.HashMap r8 = X.AnonymousClass7TE.A1E()
            java.lang.Object r2 = r14.A01
            X.LiT r2 = (X.C64808LiT) r2
            X.JzD r1 = r2.A01
            int r0 = r2.A00
            X.KkN r3 = X.C61220JzD.A00(r1, r8, r0)
            r7 = r6
            X.C64127LPb.A00(r3, r4, r5, r6, r7, r8)
            r0 = 1
            X.MQn[] r5 = new X.C66407MQn[r0]
            r1 = 2131966621(0x7f133a9d, float:1.9570085E38)
            r0 = 2131966620(0x7f133a9c, float:1.9570083E38)
            X.LDu r4 = new X.LDu
            r4.<init>(r1, r0)
            r0 = 27
            X.MMW r2 = A00(r2, r9, r0)
            r1 = 2131971974(0x7f134f86, float:1.9580942E38)
            X.8ae r0 = X.C358278ae.RED_BOLD
            r4.A00(r0, r2, r1)
            X.8ae r3 = X.C358278ae.DEFAULT
            r2 = 2131954722(0x7f130c22, float:1.9545951E38)
            r0 = 3
            X.LU1 r1 = new X.LU1
            r1.<init>(r0)
            X.L6e r0 = new X.L6e
            r0.<init>(r1, r3, r2)
            r4.A00 = r0
            X.LtZ r1 = new X.LtZ
            r1.<init>(r4)
            goto L_0x034f
        L_0x032d:
            java.lang.Object r9 = r14.A02
            X.LrS r9 = (X.C65329LrS) r9
            X.MXF r2 = r9.A00
            java.lang.Integer r3 = X.AnonymousClass05K.A0S
            r4 = 0
            java.util.HashMap r6 = X.AnonymousClass7TE.A1E()
            java.lang.Object r0 = r14.A01
            X.LiT r0 = (X.C64808LiT) r0
            X.JzD r1 = r0.A01
            int r0 = r0.A00
            X.KkN r1 = X.C61220JzD.A00(r1, r6, r0)
            r5 = r4
            X.C64127LPb.A00(r1, r2, r3, r4, r5, r6)
            r0 = 1
            X.MQn[] r5 = new X.C66407MQn[r0]
            X.Ltv r1 = X.C65473Ltv.A00
        L_0x034f:
            r0 = 0
            r5[r0] = r1
        L_0x0352:
            X.C65329LrS.A00(r9, r5)
        L_0x0355:
            X.0gF r4 = X.C60340gF.A00
            return r4
        L_0x0358:
            java.lang.Object r1 = r14.A01
            android.content.Context r1 = (android.content.Context) r1
            X.0qQ.A0A(r1)
            java.lang.Object r0 = r14.A02
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.A6p r4 = new X.A6p
            r4.<init>(r1, r0)
            return r4
        L_0x0369:
            java.lang.Object r1 = r14.A02
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1
            java.lang.Object r0 = r14.A01
            android.content.Context r0 = (android.content.Context) r0
            android.content.Context r0 = X.DbT.A05(r0)
            com.instagram.ml.remotepresence.RpModelDownloadManager r4 = new com.instagram.ml.remotepresence.RpModelDownloadManager
            r4.<init>(r1, r0)
            return r4
        L_0x037b:
            java.lang.Object r0 = r14.A01
            android.content.Context r0 = (android.content.Context) r0
            android.content.Context r1 = X.DbT.A05(r0)
            java.lang.Object r0 = r14.A02
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.A7H r4 = new X.A7H
            r4.<init>(r1, r0)
            return r4
        L_0x038d:
            java.lang.Object r0 = r14.A02
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            com.instagram.monetization.api.MonetizationApi r1 = new com.instagram.monetization.api.MonetizationApi
            r1.<init>(r0)
            java.lang.Object r0 = r14.A01
            java.util.HashMap r0 = (java.util.HashMap) r0
            com.instagram.monetization.onboarding.repository.OnboardingRepository r4 = new com.instagram.monetization.onboarding.repository.OnboardingRepository
            r4.<init>(r1, r0)
            return r4
        L_0x03a0:
            java.lang.Object r5 = r14.A01
            android.content.Context r5 = (android.content.Context) r5
            java.lang.Object r3 = r14.A02
            com.instagram.common.session.UserSession r3 = (com.instagram.common.session.UserSession) r3
            X.2MY r2 = com.instagram.creation.persistence.CreationDatabase.A00
            java.lang.Class<com.instagram.creation.persistence.CreationDatabase> r0 = com.instagram.creation.persistence.CreationDatabase.class
            java.lang.Object r1 = r3.A00(r0)
            com.instagram.roomdb.IgRoomDatabase r1 = (com.instagram.roomdb.IgRoomDatabase) r1
            if (r1 != 0) goto L_0x03be
            monitor-enter(r2)
            com.instagram.roomdb.IgRoomDatabase r1 = X.JTT.A0h(r3, r2)     // Catch:{ all -> 0x03ba }
            goto L_0x03bd
        L_0x03ba:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x03bd:
            monitor-exit(r2)
        L_0x03be:
            com.instagram.creation.persistence.CreationDatabase r1 = (com.instagram.creation.persistence.CreationDatabase) r1
            com.instagram.creation.persistence.CreationDatabase_Impl r1 = (com.instagram.creation.persistence.CreationDatabase_Impl) r1
            X.2NR r0 = r1.A01
            if (r0 == 0) goto L_0x03f3
            X.2NR r7 = r1.A01
        L_0x03c8:
            X.8In r9 = new X.8In
            r9.<init>()
            X.Kpl r6 = new X.Kpl
            r6.<init>()
            X.454 r8 = X.AnonymousClass454.A00(r5)
            X.0qQ.A07(r8)
            r0 = 0
            X.0qQ.A0B(r5, r0)
            X.2Nn r10 = X.2Nm.A00(r5, r3)
            X.9TO r4 = new X.9TO
            r4.<init>(r5, r6, r7, r8, r9, r10)
            X.0nO r1 = X.0nY.A00()
            X.JYw r0 = new X.JYw
            r0.<init>(r4)
            r1.ATE(r0)
            return r4
        L_0x03f3:
            monitor-enter(r1)
            X.2NR r0 = r1.A01     // Catch:{ all -> 0x0403 }
            if (r0 != 0) goto L_0x03ff
            X.2NR r0 = new X.2NR     // Catch:{ all -> 0x0403 }
            r0.<init>(r1)     // Catch:{ all -> 0x0403 }
            r1.A01 = r0     // Catch:{ all -> 0x0403 }
        L_0x03ff:
            X.2NR r7 = r1.A01     // Catch:{ all -> 0x0403 }
            monitor-exit(r1)     // Catch:{ all -> 0x0403 }
            goto L_0x03c8
        L_0x0403:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0403 }
            throw r0
        L_0x0406:
            java.lang.Object r1 = r14.A01
            android.view.View r1 = (android.view.View) r1
            r0 = 2131436006(0x7f0b21e6, float:1.849387E38)
            android.view.View r4 = r1.requireViewById(r0)
            java.lang.Object r2 = r14.A02
            X.KUN r2 = (X.KUN) r2
            androidx.recyclerview.widget.RecyclerView r4 = (androidx.recyclerview.widget.RecyclerView) r4
            android.content.Context r0 = r4.getContext()
            X.DbV.A1A(r0, r4)
            int r0 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE
            X.2t9 r0 = r2.A00
            if (r0 != 0) goto L_0x042e
            java.lang.String r0 = "mediaAdapter"
        L_0x0426:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x042e:
            r4.setAdapter(r0)
            android.view.View r0 = r2.itemView
            android.content.res.Resources r1 = X.DbU.A05(r0)
            r0 = 2131165184(0x7f070000, float:1.7944578E38)
            int r1 = X.DbS.A03(r1, r0)
            X.Jlp r0 = new X.Jlp
            r0.<init>(r1, r1)
            r4.A11(r0)
            X.JmC r0 = new X.JmC
            r0.<init>(r2)
            r4.A13(r0)
            return r4
        L_0x044e:
            X.2YP r4 = X.AnonymousClass2YP.A00
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MMW.invoke():java.lang.Object");
    }
}
