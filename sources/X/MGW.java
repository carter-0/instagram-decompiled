package X;

public final class MGW extends AnonymousClass1Ek implements 0sL {
    public Object A00;
    public final int A01;
    public final Object A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MGW(Object obj, Object obj2, AnonymousClass4D7 r4, int i) {
        super(2, r4);
        this.A01 = i;
        this.A02 = obj;
        this.A00 = obj2;
    }

    public static MGW A01(Object obj, AnonymousClass4D7 r2, int i) {
        return new MGW(obj, r2, i);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.MGW, X.4D7] */
    /* JADX WARNING: type inference failed for: r3v1, types: [X.MGW, X.4D7] */
    /* JADX WARNING: type inference failed for: r3v2, types: [X.MGW, X.4D7] */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0009, code lost:
        r3 = A01(r1, r6, r0);
        r3.A00 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000f, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00ff, code lost:
        return new X.MGW(r1, r2, r6, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0127, code lost:
        return new X.MGW(r2, r1, r6, r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass4D7 create(java.lang.Object r5, X.AnonymousClass4D7 r6) {
        /*
            r4 = this;
            int r0 = r4.A01
            switch(r0) {
                case 0: goto L_0x0010;
                case 1: goto L_0x0014;
                case 2: goto L_0x0018;
                case 3: goto L_0x001c;
                case 4: goto L_0x0020;
                case 5: goto L_0x0024;
                case 6: goto L_0x0028;
                case 7: goto L_0x002c;
                case 8: goto L_0x0030;
                case 9: goto L_0x0035;
                case 10: goto L_0x003a;
                case 11: goto L_0x003f;
                case 12: goto L_0x0044;
                case 13: goto L_0x0049;
                case 14: goto L_0x004e;
                case 15: goto L_0x0053;
                case 16: goto L_0x0058;
                case 17: goto L_0x005d;
                case 18: goto L_0x00d8;
                case 19: goto L_0x0062;
                case 20: goto L_0x00df;
                case 21: goto L_0x0067;
                case 22: goto L_0x006c;
                case 23: goto L_0x00e6;
                case 24: goto L_0x00ed;
                case 25: goto L_0x00f4;
                case 26: goto L_0x0071;
                case 27: goto L_0x0076;
                case 28: goto L_0x007b;
                case 29: goto L_0x0080;
                case 30: goto L_0x0085;
                case 31: goto L_0x008a;
                case 32: goto L_0x0090;
                case 33: goto L_0x0096;
                case 34: goto L_0x009c;
                case 35: goto L_0x0100;
                case 36: goto L_0x0107;
                case 37: goto L_0x010e;
                case 38: goto L_0x0115;
                case 39: goto L_0x011c;
                case 40: goto L_0x00a2;
                case 41: goto L_0x00a8;
                case 42: goto L_0x00ae;
                case 43: goto L_0x00b4;
                case 44: goto L_0x00ba;
                case 45: goto L_0x00c0;
                case 46: goto L_0x00c6;
                case 47: goto L_0x00cc;
                case 48: goto L_0x00d2;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r1 = r4.A02
            r0 = 49
        L_0x0009:
            X.MGW r3 = A01(r1, r6, r0)
            r3.A00 = r5
            return r3
        L_0x0010:
            java.lang.Object r1 = r4.A02
            r0 = 0
            goto L_0x0009
        L_0x0014:
            java.lang.Object r1 = r4.A02
            r0 = 1
            goto L_0x0009
        L_0x0018:
            java.lang.Object r1 = r4.A02
            r0 = 2
            goto L_0x0009
        L_0x001c:
            java.lang.Object r1 = r4.A02
            r0 = 3
            goto L_0x0009
        L_0x0020:
            java.lang.Object r1 = r4.A02
            r0 = 4
            goto L_0x0009
        L_0x0024:
            java.lang.Object r1 = r4.A02
            r0 = 5
            goto L_0x0009
        L_0x0028:
            java.lang.Object r1 = r4.A02
            r0 = 6
            goto L_0x0009
        L_0x002c:
            java.lang.Object r1 = r4.A02
            r0 = 7
            goto L_0x0009
        L_0x0030:
            java.lang.Object r1 = r4.A02
            r0 = 8
            goto L_0x0009
        L_0x0035:
            java.lang.Object r1 = r4.A02
            r0 = 9
            goto L_0x0009
        L_0x003a:
            java.lang.Object r1 = r4.A02
            r0 = 10
            goto L_0x0009
        L_0x003f:
            java.lang.Object r1 = r4.A02
            r0 = 11
            goto L_0x0009
        L_0x0044:
            java.lang.Object r1 = r4.A02
            r0 = 12
            goto L_0x0009
        L_0x0049:
            java.lang.Object r1 = r4.A02
            r0 = 13
            goto L_0x0009
        L_0x004e:
            java.lang.Object r1 = r4.A02
            r0 = 14
            goto L_0x0009
        L_0x0053:
            java.lang.Object r1 = r4.A02
            r0 = 15
            goto L_0x0009
        L_0x0058:
            java.lang.Object r1 = r4.A02
            r0 = 16
            goto L_0x0009
        L_0x005d:
            java.lang.Object r1 = r4.A02
            r0 = 17
            goto L_0x0009
        L_0x0062:
            java.lang.Object r1 = r4.A02
            r0 = 19
            goto L_0x0009
        L_0x0067:
            java.lang.Object r1 = r4.A02
            r0 = 21
            goto L_0x0009
        L_0x006c:
            java.lang.Object r1 = r4.A02
            r0 = 22
            goto L_0x0009
        L_0x0071:
            java.lang.Object r1 = r4.A02
            r0 = 26
            goto L_0x0009
        L_0x0076:
            java.lang.Object r1 = r4.A02
            r0 = 27
            goto L_0x0009
        L_0x007b:
            java.lang.Object r1 = r4.A02
            r0 = 28
            goto L_0x0009
        L_0x0080:
            java.lang.Object r1 = r4.A02
            r0 = 29
            goto L_0x0009
        L_0x0085:
            java.lang.Object r1 = r4.A02
            r0 = 30
            goto L_0x0009
        L_0x008a:
            java.lang.Object r1 = r4.A02
            r0 = 31
            goto L_0x0009
        L_0x0090:
            java.lang.Object r1 = r4.A02
            r0 = 32
            goto L_0x0009
        L_0x0096:
            java.lang.Object r1 = r4.A02
            r0 = 33
            goto L_0x0009
        L_0x009c:
            java.lang.Object r1 = r4.A02
            r0 = 34
            goto L_0x0009
        L_0x00a2:
            java.lang.Object r1 = r4.A02
            r0 = 40
            goto L_0x0009
        L_0x00a8:
            java.lang.Object r1 = r4.A02
            r0 = 41
            goto L_0x0009
        L_0x00ae:
            java.lang.Object r1 = r4.A02
            r0 = 42
            goto L_0x0009
        L_0x00b4:
            java.lang.Object r1 = r4.A02
            r0 = 43
            goto L_0x0009
        L_0x00ba:
            java.lang.Object r1 = r4.A02
            r0 = 44
            goto L_0x0009
        L_0x00c0:
            java.lang.Object r1 = r4.A02
            r0 = 45
            goto L_0x0009
        L_0x00c6:
            java.lang.Object r1 = r4.A02
            r0 = 46
            goto L_0x0009
        L_0x00cc:
            java.lang.Object r1 = r4.A02
            r0 = 47
            goto L_0x0009
        L_0x00d2:
            java.lang.Object r1 = r4.A02
            r0 = 48
            goto L_0x0009
        L_0x00d8:
            java.lang.Object r2 = r4.A00
            java.lang.Object r1 = r4.A02
            r0 = 18
            goto L_0x00fa
        L_0x00df:
            java.lang.Object r2 = r4.A02
            java.lang.Object r1 = r4.A00
            r0 = 20
            goto L_0x0122
        L_0x00e6:
            java.lang.Object r2 = r4.A00
            java.lang.Object r1 = r4.A02
            r0 = 23
            goto L_0x00fa
        L_0x00ed:
            java.lang.Object r2 = r4.A00
            java.lang.Object r1 = r4.A02
            r0 = 24
            goto L_0x00fa
        L_0x00f4:
            java.lang.Object r2 = r4.A00
            java.lang.Object r1 = r4.A02
            r0 = 25
        L_0x00fa:
            X.MGW r3 = new X.MGW
            r3.<init>(r1, r2, r6, r0)
            return r3
        L_0x0100:
            java.lang.Object r2 = r4.A02
            java.lang.Object r1 = r4.A00
            r0 = 35
            goto L_0x0122
        L_0x0107:
            java.lang.Object r2 = r4.A02
            java.lang.Object r1 = r4.A00
            r0 = 36
            goto L_0x0122
        L_0x010e:
            java.lang.Object r2 = r4.A02
            java.lang.Object r1 = r4.A00
            r0 = 37
            goto L_0x0122
        L_0x0115:
            java.lang.Object r2 = r4.A02
            java.lang.Object r1 = r4.A00
            r0 = 38
            goto L_0x0122
        L_0x011c:
            java.lang.Object r2 = r4.A02
            java.lang.Object r1 = r4.A00
            r0 = 39
        L_0x0122:
            X.MGW r3 = new X.MGW
            r3.<init>(r2, r1, r6, r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MGW.create(java.lang.Object, X.4D7):X.4D7");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        if (49 - this.A01 != 0) {
            return ((MGW) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
        }
        ((MGW) AnonymousClass7TE.A1M(obj2, (Object) null, this)).invokeSuspend(C60340gF.A00);
        throw null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: X.DfA} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: X.GmF} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v8, resolved type: X.3UM} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v10, resolved type: X.GmF} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v167, resolved type: X.DfA} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v168, resolved type: X.DfA} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v32, resolved type: X.3UM} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v33, resolved type: X.3UM} */
    /* JADX WARNING: type inference failed for: r1v222 */
    /* JADX WARNING: type inference failed for: r1v223, types: [X.0sa, java.lang.Integer] */
    /* JADX WARNING: type inference failed for: r1v224 */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0043, code lost:
        r6 = androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility.JSON_KEY_RESPONSE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x05e3, code lost:
        r6 = "mediaKitAutoPlayManager";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x05e7, code lost:
        r6 = "mediaKitViewPointHelper";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:0x05eb, code lost:
        r6 = "mediaKitActionBarHolder";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:288:0x076b, code lost:
        r6 = "titleTextView";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:484:0x0d04, code lost:
        X.0qQ.A0F(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:485:0x0d0b, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:513:0x0dd3, code lost:
        r0 = ((X.KVQ) r1).A00;
        r1 = 2131975986;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:514:0x0dda, code lost:
        if (r0 == false) goto L_0x0ddf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:515:0x0ddc, code lost:
        r1 = 2131972506;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:516:0x0ddf, code lost:
        X.C59689JTv.A0F(r2, "SaveUnsaveAudioRequestFailed", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:682:0x154b, code lost:
        if (r2 == null) goto L_0x1719;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:683:0x154d, code lost:
        r2.setEnabled(r0);
        r0 = 0.35f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:684:0x1557, code lost:
        if (r2.isEnabled() == false) goto L_0x155b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:685:0x1559, code lost:
        r0 = 1.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:686:0x155b, code lost:
        r2.setAlpha(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:699:0x15d7, code lost:
        X.C59689JTv.A0D(X.DbT.A0E(r3.A02), "follow_requests_failed_to_load");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:700:0x15e4, code lost:
        r2 = X.DbV.A05((androidx.fragment.app.Fragment) r3.A02).getQuantityString(com.instagram.android.R.plurals.batch_fr_confirmation_failed, ((X.C61259Jzr) r0).A01);
        X.0qQ.A07(r2);
        r1 = "batch_follow_request_confirmation_failed";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:701:0x15fd, code lost:
        r2 = X.DbV.A05((androidx.fragment.app.Fragment) r3.A02).getQuantityString(com.instagram.android.R.plurals.batch_fr_deletion_failed, ((X.C61259Jzr) r0).A01);
        X.0qQ.A07(r2);
        r1 = "batch_follow_request_deletion_failed";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:702:0x1615, code lost:
        r0 = X.DbV.A0X();
        r0.A0H = r1;
        r0.A0D = r2;
        r0.A06();
        X.DbY.A1N(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:741:0x171b, code lost:
        return X.C60340gF.A00;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r30) {
        /*
            r29 = this;
            r3 = r29
            int r0 = r3.A01
            r1 = r30
            switch(r0) {
                case 0: goto L_0x0013;
                case 1: goto L_0x0e48;
                case 2: goto L_0x0027;
                case 3: goto L_0x0047;
                case 4: goto L_0x0061;
                case 5: goto L_0x0080;
                case 6: goto L_0x00fb;
                case 7: goto L_0x0537;
                case 8: goto L_0x0546;
                case 9: goto L_0x05ef;
                case 10: goto L_0x0686;
                case 11: goto L_0x06df;
                case 12: goto L_0x06ee;
                case 13: goto L_0x076f;
                case 14: goto L_0x07e0;
                case 15: goto L_0x0877;
                case 16: goto L_0x08a8;
                case 17: goto L_0x091f;
                case 18: goto L_0x0949;
                case 19: goto L_0x0961;
                case 20: goto L_0x0ad3;
                case 21: goto L_0x0ae3;
                case 22: goto L_0x0b18;
                case 23: goto L_0x0b32;
                case 24: goto L_0x0ba9;
                case 25: goto L_0x0c17;
                case 26: goto L_0x0cf4;
                case 27: goto L_0x0cc0;
                case 28: goto L_0x0ccf;
                case 29: goto L_0x0d16;
                case 30: goto L_0x0d2d;
                case 31: goto L_0x0d66;
                case 32: goto L_0x0d84;
                case 33: goto L_0x0da9;
                case 34: goto L_0x0dbf;
                case 35: goto L_0x0deb;
                case 36: goto L_0x0dfb;
                case 37: goto L_0x0e66;
                case 38: goto L_0x0eb2;
                case 39: goto L_0x0ecf;
                case 40: goto L_0x0eef;
                case 41: goto L_0x0f1a;
                case 42: goto L_0x1191;
                case 43: goto L_0x11a1;
                case 44: goto L_0x11d2;
                case 45: goto L_0x13e6;
                case 46: goto L_0x1560;
                case 47: goto L_0x1591;
                case 48: goto L_0x1625;
                default: goto L_0x0009;
            }
        L_0x0009:
            X.0eS.A00(r1)
            java.lang.String r0 = "comment"
            java.lang.NullPointerException r0 = X.AnonymousClass7TE.A11(r0)
            throw r0
        L_0x0013:
            java.lang.Object r0 = A00(r1, r3)
            X.K0s r0 = (X.C61281K0s) r0
            X.Jz9 r5 = r0.A00
            if (r5 == 0) goto L_0x0043
            java.lang.Object r0 = r3.A02
            com.instagram.mediakit.api.MediaKitApi r0 = (com.instagram.mediakit.api.MediaKitApi) r0
            com.instagram.common.session.UserSession r0 = r0.A00
            X.1E4.A00(r0)
            return r5
        L_0x0027:
            java.lang.Object r0 = A00(r1, r3)
            X.K0q r0 = (X.C61279K0q) r0
            X.JtX r5 = r0.A00
            if (r5 == 0) goto L_0x0043
            java.lang.Object r0 = r3.A02
            com.instagram.mediakit.api.MediaKitApi r0 = (com.instagram.mediakit.api.MediaKitApi) r0
            com.instagram.common.session.UserSession r0 = r0.A00
            X.1E5 r3 = X.1E4.A00(r0)
            r2 = 0
            r1 = 6
            X.1E9 r0 = new X.1E9
            r0.<init>(r3, r1, r2)
            return r5
        L_0x0043:
            java.lang.String r6 = "response"
            goto L_0x0d04
        L_0x0047:
            java.lang.Object r2 = A00(r1, r3)
            X.4dm r2 = (X.C268654dm) r2
            java.lang.Object r1 = r3.A02
            com.instagram.mediakit.api.MediaKitApi r1 = (com.instagram.mediakit.api.MediaKitApi) r1
            java.lang.Integer r0 = X.AnonymousClass05K.A09
            com.instagram.mediakit.api.MediaKitApi.A02(r2, r1, r0)
            java.lang.String r1 = r2.toString()
            java.lang.String r0 = "media_kit_api"
            X.0wb.A03(r0, r1)
            goto L_0x1719
        L_0x0061:
            java.lang.Object r5 = A00(r1, r3)
            X.4Cq r5 = (X.C262224Cq) r5
            java.lang.Object r4 = r3.A02
            X.K78 r4 = (X.K78) r4
            X.0eM r0 = r4.A0D
            X.JjW r0 = X.JTT.A0a(r0)
            X.0r6 r3 = r0.A0F
            r2 = 0
            r1 = 34
            X.MG9 r0 = new X.MG9
            r0.<init>(r4, r2, r1)
            X.C51968G9o.A1P(r0, r5, r3)
            goto L_0x1719
        L_0x0080:
            java.lang.Object r5 = A00(r1, r3)
            X.KgG r5 = (X.C62466KgG) r5
            java.lang.Object r3 = r3.A02
            X.K6H r3 = (X.K6H) r3
            X.LtB r0 = r3.A0A
            r2 = 0
            if (r0 == 0) goto L_0x05eb
            r4 = 0
            X.0qQ.A0B(r5, r4)
            r0.A0C = r5
            X.2dZ r1 = r0.A0B
            if (r1 == 0) goto L_0x009e
            X.4DS r0 = r0.A0L
            r1.A0X(r0)
        L_0x009e:
            X.K6H.A04(r3)
            X.K6H.A02(r5, r3)
            X.0eM r0 = r3.A0O
            X.JjW r0 = X.JTT.A0a(r0)
            X.0Ud r0 = r0.A0N
            java.util.List r0 = X.JTO.A17(r0)
            X.K6H.A05(r3, r0)
            X.LDE r0 = r3.A0D
            if (r0 == 0) goto L_0x05e7
            r0.A00()
            androidx.recyclerview.widget.RecyclerView r0 = r3.A02
            java.lang.String r6 = "recyclerView"
            if (r0 == 0) goto L_0x0d04
            X.3pI r0 = r0.A0D
            if (r0 == 0) goto L_0x00c8
            android.os.Parcelable r2 = r0.A1M()
        L_0x00c8:
            androidx.recyclerview.widget.RecyclerView r1 = r3.A02
            if (r1 == 0) goto L_0x0d04
            X.2t9 r0 = r3.A03
            if (r0 != 0) goto L_0x00d4
            java.lang.String r6 = "recyclerAdapter"
            goto L_0x0d04
        L_0x00d4:
            r1.setAdapter(r0)
            X.LS8 r1 = r3.A0C
            if (r1 == 0) goto L_0x05e3
            X.LS8.A00(r1)
            java.util.Map r0 = r1.A06
            r0.clear()
            X.LS8.A01(r1)
            android.os.Handler r0 = r1.A01
            r0.sendEmptyMessage(r4)
            androidx.recyclerview.widget.RecyclerView r0 = r3.A02
            if (r0 == 0) goto L_0x0d04
            X.3pI r0 = r0.A0D
            if (r0 == 0) goto L_0x00f6
            r0.A1P(r2)
        L_0x00f6:
            X.K6H.A03(r3)
            goto L_0x1719
        L_0x00fb:
            java.lang.Object r1 = A00(r1, r3)
            X.MQn r1 = (X.C66407MQn) r1
            java.lang.Object r8 = r3.A02
            X.K6H r8 = (X.K6H) r8
            boolean r0 = r1 instanceof X.C65466Lto
            if (r0 == 0) goto L_0x0132
            X.7Pr r2 = X.K6H.A00(r8)
            androidx.fragment.app.FragmentActivity r4 = r8.requireActivity()
            X.Lto r1 = (X.C65466Lto) r1
            com.instagram.mediakit.config.MediaKitSectionActionSheetConfig r5 = r1.A00
            r3 = 0
            r0 = 1
            X.7Pu r6 = r2.A00()
            X.K4C r2 = new X.K4C
            r2.<init>()
            X.0eP[] r1 = new X.0eP[r0]
            java.lang.String r0 = "mk_section_action_sheet_config"
        L_0x0124:
            X.JTP.A1P(r0, r5, r1, r3)
            X.DbT.A1N(r2, r1)
            X.7Pu r6 = r6.A02(r4, r2)
        L_0x012e:
            r8.A08 = r6
            goto L_0x1719
        L_0x0132:
            boolean r0 = r1 instanceof X.C65454Ltc
            if (r0 == 0) goto L_0x0149
            X.Ltc r1 = (X.C65454Ltc) r1
            X.LE6 r2 = r1.A00
            X.1xC r1 = X.1xC.A01
            android.content.Context r0 = r8.requireContext()
            X.3GP r0 = r2.A00(r0)
            r1.A00(r0)
            goto L_0x1719
        L_0x0149:
            boolean r0 = r1 instanceof X.C65451LtZ
            if (r0 == 0) goto L_0x0156
            X.LtZ r1 = (X.C65451LtZ) r1
            X.LDu r0 = r1.A00
            X.K6H.A01(r0)
            goto L_0x1719
        L_0x0156:
            boolean r0 = r1 instanceof X.C65456Lte
            if (r0 == 0) goto L_0x0184
            X.Lte r1 = (X.C65456Lte) r1
            X.LDu r2 = r1.A00
            androidx.fragment.app.FragmentActivity r1 = r8.requireActivity()
            X.8ab r5 = X.DbS.A0X(r1)
            r0 = 2131966624(0x7f133aa0, float:1.9570091E38)
            X.DbT.A19(r1, r5, r0)
            java.lang.String r0 = r2.A03
            if (r0 != 0) goto L_0x0177
            r0 = 2131966587(0x7f133a7b, float:1.9570016E38)
            java.lang.String r0 = X.AnonymousClass7TE.A16(r1, r0)
        L_0x0177:
            r5.A0q(r0)
            X.LUs r0 = X.C64228LUs.A00
            r5.A0E(r0)
        L_0x017f:
            X.DbT.A1V(r5)
            goto L_0x1719
        L_0x0184:
            boolean r0 = r1 instanceof X.C65453Ltb
            if (r0 == 0) goto L_0x01dd
            X.Ltb r1 = (X.C65453Ltb) r1
            X.LDu r4 = r1.A00
            androidx.fragment.app.FragmentActivity r3 = r8.requireActivity()
            X.8ab r5 = X.DbS.A0X(r3)
            r0 = 2131966612(0x7f133a94, float:1.9570067E38)
            r5.A09(r0)
            r0 = 2131966611(0x7f133a93, float:1.9570065E38)
            r5.A08(r0)
            r0 = 0
            r5.A0s(r0)
            X.L6e r0 = r4.A01
            if (r0 == 0) goto L_0x01b5
            int r2 = r0.A00
            android.content.DialogInterface$OnClickListener r1 = r0.A01
            X.8ae r0 = r0.A02
            if (r0 != 0) goto L_0x01b2
            X.8ae r0 = X.C358278ae.BLUE_BOLD
        L_0x01b2:
            r5.A0S(r1, r0, r2, r2)
        L_0x01b5:
            X.L6e r0 = r4.A00
            if (r0 == 0) goto L_0x01d1
            int r1 = r0.A00
            android.content.DialogInterface$OnClickListener r6 = r0.A01
            X.8ae r7 = r0.A02
            if (r7 != 0) goto L_0x01c3
            X.8ae r7 = X.C358278ae.BLUE_BOLD
        L_0x01c3:
            android.content.Context r0 = r5.A0Q
            java.lang.String r8 = X.AnonymousClass7TE.A16(r0, r1)
            java.lang.String r9 = r0.getString(r1)
            r10 = 1
            r5.A0U(r6, r7, r8, r9, r10)
        L_0x01d1:
            java.lang.Integer r0 = r4.A02
            if (r0 == 0) goto L_0x017f
            android.graphics.drawable.Drawable r0 = X.JTP.A0E(r3, r0)
            r5.A0j(r0)
            goto L_0x017f
        L_0x01dd:
            boolean r0 = r1 instanceof X.C65452Lta
            if (r0 == 0) goto L_0x01f7
            X.Lta r1 = (X.C65452Lta) r1
            int r1 = r1.A00
            android.content.Context r0 = r8.requireContext()
            X.6ST r0 = X.DbV.A0h(r0)
            X.DbU.A1L(r8, r0, r1)
            X.AnonymousClass0fN.A00(r0)
            r8.A0E = r0
            goto L_0x1719
        L_0x01f7:
            boolean r0 = r1 instanceof X.C65455Ltd
            if (r0 == 0) goto L_0x0207
            X.Ltd r1 = (X.C65455Ltd) r1
            X.KhQ r4 = r1.A00
            android.view.View r3 = r8.A01
            if (r3 != 0) goto L_0x0432
            java.lang.String r6 = "mediaKitHeaderContainer"
            goto L_0x0d04
        L_0x0207:
            boolean r0 = r1 instanceof X.C65470Lts
            if (r0 == 0) goto L_0x0210
            X.DbT.A1K(r8)
            goto L_0x1719
        L_0x0210:
            boolean r0 = r1 instanceof X.C65471Ltt
            if (r0 == 0) goto L_0x021d
            boolean r0 = r8.A0G
            if (r0 != 0) goto L_0x1719
            X.K6H.A03(r8)
            goto L_0x1719
        L_0x021d:
            boolean r0 = r1 instanceof X.C65472Ltu
            if (r0 == 0) goto L_0x022a
            X.6ST r0 = r8.A0E
            if (r0 == 0) goto L_0x1719
            r0.dismiss()
            goto L_0x1719
        L_0x022a:
            boolean r0 = r1 instanceof X.C65457Ltf
            if (r0 == 0) goto L_0x0256
            X.Ltf r1 = (X.C65457Ltf) r1
            X.LMc r4 = r1.A00
            X.0eM r0 = r8.A0N
            X.0lg r3 = X.DbT.A0X(r0)
            X.AnonymousClass7TG.A1O(r4, r3)
            r0 = 556(0x22c, float:7.79E-43)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            java.util.HashMap r0 = r4.A00
            X.8ey r2 = X.C359988do.A05(r3, r1, r0)
            r1 = 10
            X.E85 r0 = new X.E85
            r0.<init>(r1, r4, r8, r3)
            r2.A00(r0)
            X.1ES.A03(r2)
            goto L_0x1719
        L_0x0256:
            boolean r0 = r1 instanceof X.C65473Ltv
            if (r0 == 0) goto L_0x0271
            androidx.fragment.app.FragmentActivity r1 = r8.requireActivity()
            X.0eM r0 = r8.A0N
            X.6Yo r4 = X.DbX.A0N(r1, r0)
            X.K5A r0 = new X.K5A
            r0.<init>()
            r4.A0D(r0)
        L_0x026c:
            r4.A04()
            goto L_0x1719
        L_0x0271:
            boolean r0 = r1 instanceof X.C65464Ltm
            if (r0 == 0) goto L_0x029a
            X.Ltm r1 = (X.C65464Ltm) r1
            java.lang.String r2 = r1.A00
            androidx.fragment.app.FragmentActivity r1 = r8.requireActivity()
            X.0eM r0 = r8.A0N
            X.6Yo r4 = X.DbX.A0N(r1, r0)
            X.C46447Df9.A03()
            X.F3W r1 = new X.F3W
            r1.<init>()
            r1.A0B = r2
            r0 = 1
            r1.A0K = r0
            r1.A0J = r0
            X.32F r0 = r1.A01()
        L_0x0296:
            r4.A0D(r0)
            goto L_0x026c
        L_0x029a:
            boolean r0 = r1 instanceof X.C65461Ltj
            if (r0 == 0) goto L_0x02cd
            androidx.fragment.app.FragmentActivity r2 = r8.requireActivity()
            X.0eM r0 = r8.A0N
            X.6Yo r4 = X.DbX.A0N(r2, r0)
            X.Ltj r1 = (X.C65461Ltj) r1
            java.lang.String r2 = r1.A00
            r1 = 0
            X.K5B r5 = new X.K5B
            r5.<init>()
            r0 = 2
            X.0eP[] r3 = new X.0eP[r0]
            java.lang.String r0 = "section_id"
            X.JTP.A1P(r0, r2, r3, r1)
            r2 = 1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            java.lang.String r0 = "mk_select_entry_point"
        L_0x02c1:
            X.JTP.A1P(r0, r1, r3, r2)
            X.DbT.A1N(r5, r3)
            androidx.fragment.app.Fragment r5 = (androidx.fragment.app.Fragment) r5
            r4.A0D(r5)
            goto L_0x026c
        L_0x02cd:
            boolean r0 = r1 instanceof X.C65463Ltl
            if (r0 == 0) goto L_0x02f6
            X.0eM r0 = r8.A0N
            com.instagram.common.session.UserSession r5 = X.AnonymousClass7TE.A0l(r0)
            X.Ltl r1 = (X.C65463Ltl) r1
            java.lang.String r4 = r1.A00
            r0 = 1
            X.0qQ.A0B(r5, r0)
            X.6Yo r3 = X.DbW.A0H(r8, r5)
            X.1a1 r2 = X.C46447Df9.A02()
            java.lang.String r1 = r8.getModuleName()
            java.lang.String r0 = "media_kit"
            X.Dfc r0 = X.C46548Dgp.A02(r5, r4, r0, r1)
            X.C46474Dfc.A03(r3, r5, r2, r0)
            goto L_0x1719
        L_0x02f6:
            boolean r0 = r1 instanceof X.C65458Ltg
            if (r0 == 0) goto L_0x0314
            androidx.fragment.app.FragmentActivity r2 = r8.requireActivity()
            X.0eM r0 = r8.A0N
            X.6Yo r4 = X.DbX.A0N(r2, r0)
            X.Ltg r1 = (X.C65458Ltg) r1
            java.lang.String r1 = r1.A00
            r2 = 0
            X.KXh r5 = new X.KXh
            r5.<init>()
            r0 = 1
            X.0eP[] r3 = new X.0eP[r0]
            java.lang.String r0 = "section_id"
            goto L_0x02c1
        L_0x0314:
            boolean r0 = r1 instanceof X.C65462Ltk
            if (r0 == 0) goto L_0x032e
            X.0eM r0 = r8.A0N
            com.instagram.common.session.UserSession r11 = X.AnonymousClass7TE.A0l(r0)
            X.Ltk r1 = (X.C65462Ltk) r1
            java.lang.String r12 = r1.A00
            androidx.fragment.app.FragmentActivity r9 = r8.requireActivity()
            java.lang.String r13 = "media_kit"
            r10 = r8
            X.C48856ElI.A00(r8, r9, r10, r11, r12, r13)
            goto L_0x1719
        L_0x032e:
            boolean r0 = r1 instanceof X.C65460Lti
            if (r0 == 0) goto L_0x0352
            X.0eM r0 = r8.A0N
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r0)
            X.Lti r1 = (X.C65460Lti) r1
            java.lang.String r1 = r1.A00
            r0 = 1
            X.0qQ.A0B(r3, r0)
            X.6Yo r4 = X.DbW.A0H(r8, r3)
            com.instagram.model.hashtag.HashtagImpl r2 = X.C281965Ag.A00(r1)
            java.lang.String r1 = "MediaKitFragment"
            java.lang.String r0 = "media_kit"
            androidx.fragment.app.Fragment r0 = X.W0l.A02(r3, r2, r1, r0)
            goto L_0x0296
        L_0x0352:
            boolean r0 = r1 instanceof X.C65459Lth
            if (r0 == 0) goto L_0x0382
            X.0eM r0 = r8.A0N
            X.0lg r3 = X.DbT.A0X(r0)
            X.Lth r1 = (X.C65459Lth) r1
            X.LMc r0 = r1.A00
            X.AnonymousClass7TG.A1O(r3, r0)
            X.6Yo r4 = X.DbW.A0H(r8, r3)
            java.lang.String r1 = r0.A02
            java.util.HashMap r0 = r0.A00
            X.DiU r2 = X.C46649DiU.A04(r1, r0)
            com.instagram.bloks.hosting.IgBloksScreenConfig r1 = X.DbS.A0N(r3)
            r0 = 2131966617(0x7f133a99, float:1.9570077E38)
            java.lang.String r0 = r8.getString(r0)
            r1.A0U = r0
            X.3M3 r0 = X.C49891FBs.A02(r1, r2)
            goto L_0x0296
        L_0x0382:
            boolean r0 = r1 instanceof X.C65465Ltn
            if (r0 == 0) goto L_0x03e9
            X.7Pr r2 = X.K6H.A00(r8)
            androidx.fragment.app.FragmentActivity r4 = r8.requireActivity()
            X.Ltn r1 = (X.C65465Ltn) r1
            com.instagram.mediakit.config.MediaKitInfoSheetConfig r5 = r1.A00
            r3 = 0
            boolean r1 = X.DbW.A1Y(r5)
            java.lang.Float r0 = r5.A01
            if (r0 == 0) goto L_0x03e4
            float r0 = r0.floatValue()
            r2.A03 = r0
        L_0x03a1:
            java.lang.Integer r0 = r5.A07
            if (r0 == 0) goto L_0x03b7
            int r0 = r0.intValue()
            java.lang.String r0 = r4.getString(r0)
            r2.A0g = r0
            android.view.View$OnClickListener r0 = r5.A00
            if (r0 == 0) goto L_0x03e1
            r2.A0K = r0
            r2.A1J = r1
        L_0x03b7:
            java.lang.Integer r0 = r5.A08
            if (r0 == 0) goto L_0x03c7
            int r0 = r0.intValue()
            java.lang.String r0 = r4.getString(r0)
            r2.A0h = r0
            r2.A0w = r1
        L_0x03c7:
            java.lang.Integer r0 = r5.A0B
            if (r0 == 0) goto L_0x03d2
            int r0 = r0.intValue()
            X.DbZ.A0z(r4, r2, r0)
        L_0x03d2:
            X.7Pu r6 = r2.A00()
            X.K77 r2 = new X.K77
            r2.<init>()
            X.0eP[] r1 = new X.0eP[r1]
            java.lang.String r0 = "mk_info_sheet_config"
            goto L_0x0124
        L_0x03e1:
            r2.A0v = r1
            goto L_0x03b7
        L_0x03e4:
            boolean r0 = r5.A0A
            r2.A1G = r0
            goto L_0x03a1
        L_0x03e9:
            boolean r0 = r1 instanceof X.C65467Ltp
            if (r0 == 0) goto L_0x0464
            X.7Pr r7 = X.K6H.A00(r8)
            X.7Pu r6 = r8.A08
            X.Ltp r1 = (X.C65467Ltp) r1
            com.instagram.mediakit.analytics.VisibilitySheetOrigin r5 = r1.A00
            androidx.fragment.app.FragmentActivity r4 = r8.requireActivity()
            r0 = 10
            X.MMD r3 = new X.MMD
            r3.<init>(r8, r0)
            java.lang.String r2 = "origin"
            r0 = 2
            X.0qQ.A0B(r5, r0)
            r0 = 1
            r7.A0x = r0
            r0 = 2131966666(0x7f133aca, float:1.9570177E38)
            X.DbZ.A0z(r4, r7, r0)
            X.K78 r1 = new X.K78
            r1.<init>()
            r0 = 46
            X.MML r0 = X.MML.A00(r3, r0)
            r1.A01 = r0
            X.DbZ.A1B(r1, r2, r5)
            if (r6 == 0) goto L_0x0428
            r6.A0F(r1, r7)
            goto L_0x012e
        L_0x0428:
            X.7Pu r0 = r7.A00()
            X.7Pu r6 = r0.A02(r4, r1)
            goto L_0x012e
        L_0x0432:
            X.5Gv r2 = r8.A09
            r1 = 1
            if (r2 == 0) goto L_0x0440
            boolean r0 = r2.A09()
            if (r0 != r1) goto L_0x0440
            r2.A08(r1)
        L_0x0440:
            androidx.fragment.app.FragmentActivity r1 = r8.requireActivity()
            r0 = 2131966651(0x7f133abb, float:1.9570146E38)
            X.5Gt r1 = X.AnonymousClass7TG.A0e(r1, r0)
            r1.A03(r3)
            X.2fy r0 = r4.A00
            r1.A06(r0)
            X.5Gv r1 = r1.A00()
            r8.A09 = r1
            X.0eM r0 = r8.A0N
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            r1.A07(r0)
            goto L_0x1719
        L_0x0464:
            boolean r0 = r1 instanceof X.C65469Ltr
            if (r0 == 0) goto L_0x048e
            X.0eM r0 = r8.A0N
            com.instagram.common.session.UserSession r9 = X.AnonymousClass7TE.A0l(r0)
            r0 = r1
            X.Ltr r0 = (X.C65469Ltr) r0
            X.Khf r12 = r0.A01
            X.Khe r11 = r0.A00
            X.JzE r13 = r0.A02
            java.util.List r14 = r0.A03
            r0 = 15
            X.MP7 r2 = new X.MP7
            r2.<init>(r8, r0)
            r0 = 9
            X.MMW r15 = X.MMW.A00(r1, r8, r0)
            r10 = r8
            r16 = r2
            X.C63325Kv8.A00(r8, r9, r10, r11, r12, r13, r14, r15, r16)
            goto L_0x1719
        L_0x048e:
            boolean r0 = r1 instanceof X.C65468Ltq
            if (r0 == 0) goto L_0x04fa
            java.lang.Integer r2 = X.AnonymousClass05K.A0q
            X.Ttm r0 = r8.A07
            java.lang.String r6 = "discoveryVideoPlayer"
            if (r0 == 0) goto L_0x0d04
            X.TuM r0 = r0.A04
            r3 = 1
            if (r0 == 0) goto L_0x04e6
            boolean r0 = r0.A00
            if (r0 != r3) goto L_0x04e6
        L_0x04a3:
            X.C64127LPb.A01(r8, r2)
            X.Ttm r4 = r8.A07
            if (r4 == 0) goto L_0x0d04
            X.Ltq r1 = (X.C65468Ltq) r1
            X.1Xj r2 = r1.A00
            boolean r0 = r4.A06
            if (r0 == 0) goto L_0x1719
            X.Tol r1 = r4.A05
            if (r1 == 0) goto L_0x1719
            X.TuM r0 = r4.A04
            if (r0 == 0) goto L_0x1719
            boolean r0 = r1.A0F()
            if (r0 != r3) goto L_0x1719
            X.TuM r0 = r4.A04
            if (r0 == 0) goto L_0x1719
            java.lang.Object r0 = r0.A03
            X.1Xj r0 = (X.1Xj) r0
            if (r0 == 0) goto L_0x1719
            java.lang.String r1 = r0.getId()
            java.lang.String r0 = r2.getId()
            if (r1 != r0) goto L_0x1719
            X.TuM r2 = r4.A04
            if (r2 == 0) goto L_0x1719
            boolean r0 = r2.A00
            boolean r0 = X.AnonymousClass7TF.A1S(r0, r3)
            r1 = -1
            if (r0 == 0) goto L_0x04e9
            X.C14312Ttm.A05(r4, r1)
            goto L_0x1719
        L_0x04e6:
            java.lang.Integer r2 = X.AnonymousClass05K.A0p
            goto L_0x04a3
        L_0x04e9:
            java.lang.Object r0 = r2.A03
            X.1Xj r0 = (X.1Xj) r0
            if (r0 == 0) goto L_0x1719
            boolean r0 = r0.A4Y()
            if (r0 != r3) goto L_0x1719
            X.C14312Ttm.A06(r4, r1)
            goto L_0x1719
        L_0x04fa:
            boolean r0 = r1 instanceof X.C65474Ltw
            if (r0 == 0) goto L_0x0514
            X.LtB r0 = r8.A0A
            if (r0 == 0) goto L_0x05eb
            X.2dZ r1 = r0.A0B
            if (r1 == 0) goto L_0x050b
            X.4DS r0 = r0.A0L
            r1.A0X(r0)
        L_0x050b:
            X.K6H.A04(r8)
            r0 = 1
            X.K6H.A06(r8, r0)
            goto L_0x1719
        L_0x0514:
            boolean r0 = r1 instanceof X.C65475Ltx
            if (r0 == 0) goto L_0x1719
            r0 = 10
            X.MMW r1 = X.MMW.A00(r1, r8, r0)
            r0 = 0
            X.0qQ.A0B(r8, r0)
            X.37D r2 = X.DbX.A0i(r8)
            if (r2 == 0) goto L_0x1719
            r0 = 2
            X.MMW r1 = X.MMW.A00(r1, r8, r0)
            X.Lz0 r0 = new X.Lz0
            r0.<init>(r1)
            X.DbU.A1U(r0, r2, r2)
            goto L_0x1719
        L_0x0537:
            java.lang.Object r1 = A00(r1, r3)
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r0 = r3.A02
            X.K6H r0 = (X.K6H) r0
            X.K6H.A05(r0, r1)
            goto L_0x1719
        L_0x0546:
            java.lang.Object r0 = A00(r1, r3)
            java.lang.Object r3 = r3.A02
            X.K6H r3 = (X.K6H) r3
            if (r0 == 0) goto L_0x1719
            X.LtB r0 = r3.A0A
            if (r0 == 0) goto L_0x05eb
            X.2dZ r1 = r0.A0B
            if (r1 == 0) goto L_0x055d
            X.4DS r0 = r0.A0L
            r1.A0X(r0)
        L_0x055d:
            X.K6H.A04(r3)
            r8 = 1
            X.K6H.A06(r3, r8)
            X.LDE r0 = r3.A0D
            if (r0 == 0) goto L_0x05e7
            r0.A00()
            X.LS8 r1 = r3.A0C
            if (r1 == 0) goto L_0x05e3
            X.LS8.A00(r1)
            java.util.Map r0 = r1.A06
            r0.clear()
            X.LS8.A01(r1)
            android.os.Handler r0 = r1.A01
            r2 = 0
            r0.sendEmptyMessage(r2)
            X.0eM r0 = r3.A0O
            X.JjW r7 = X.JTT.A0a(r0)
            r0 = 16
            X.MP7 r6 = new X.MP7
            r6.<init>(r3, r0)
            boolean r0 = r7.A01
            if (r0 != 0) goto L_0x1719
            X.0Ud r0 = r7.A0M
            java.lang.Object r0 = r0.getValue()
            X.JzE r0 = (X.C61221JzE) r0
            if (r0 == 0) goto L_0x1719
            java.util.List r0 = r0.A06
            if (r0 == 0) goto L_0x1719
            java.util.Iterator r1 = r0.iterator()
        L_0x05a3:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x1719
            java.lang.Object r5 = r1.next()
            r0 = r5
            X.1Xj r0 = (X.1Xj) r0
            boolean r0 = r0.A4Y()
            if (r0 == 0) goto L_0x05a3
            if (r5 == 0) goto L_0x1719
            X.05G r0 = r7.A0H
            java.lang.Object r1 = r0.getValue()
            X.0qQ.A0B(r1, r2)
            X.KgG r0 = X.C62466KgG.VIEW
            if (r1 != r0) goto L_0x05df
            com.instagram.common.session.UserSession r4 = r7.A03
            X.0Tu r3 = X.0Tu.A05
            r0 = 36316289245450443(0x810579000910cb, double:3.029905780557542E-306)
            boolean r2 = X.182.A06(r3, r4, r0)
            r0 = 36316289244991690(0x810579000210ca, double:3.0299057802674246E-306)
            X.182.A06(r3, r4, r0)
            if (r2 == 0) goto L_0x05df
            r6.invoke(r5)
        L_0x05df:
            r7.A01 = r8
            goto L_0x1719
        L_0x05e3:
            java.lang.String r6 = "mediaKitAutoPlayManager"
            goto L_0x0d04
        L_0x05e7:
            java.lang.String r6 = "mediaKitViewPointHelper"
            goto L_0x0d04
        L_0x05eb:
            java.lang.String r6 = "mediaKitActionBarHolder"
            goto L_0x0d04
        L_0x05ef:
            java.lang.Object r2 = A00(r1, r3)
            X.MQl r2 = (X.C66405MQl) r2
            java.lang.Object r1 = r3.A02
            X.HC2 r1 = (X.HC2) r1
            boolean r0 = r2 instanceof X.C65447LtV
            if (r0 == 0) goto L_0x066d
            X.0eM r0 = r1.A05
            java.lang.Object r5 = r0.getValue()
            X.JjV r5 = (X.C60326JjV) r5
            X.0eM r0 = r1.A00
            java.lang.Object r0 = r0.getValue()
            X.KUV r0 = (X.KUV) r0
            X.Lzh r0 = r0.A01
            X.8XW r6 = r0.A00
            java.util.Map r0 = r6.A04
            java.util.Collection r0 = r0.values()
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r2 = r0.iterator()
        L_0x061f:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x063a
            java.lang.Object r1 = r2.next()
            r0 = r1
            com.instagram.ui.widget.mediapicker.Folder r0 = (com.instagram.ui.widget.mediapicker.Folder) r0
            java.util.List r0 = r0.A01()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x061f
            r3.add(r1)
            goto L_0x061f
        L_0x063a:
            java.util.List r0 = X.00k.A0a(r3)
            java.util.ArrayList r4 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r3 = r0.iterator()
        L_0x0646:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x065f
            java.lang.Object r2 = r3.next()
            r0 = r2
            com.instagram.ui.widget.mediapicker.Folder r0 = (com.instagram.ui.widget.mediapicker.Folder) r0
            int r1 = r0.A02
            com.instagram.ui.widget.mediapicker.Folder r0 = r6.A02
            int r0 = r0.A02
            if (r1 == r0) goto L_0x0646
            r4.add(r2)
            goto L_0x0646
        L_0x065f:
            X.LtT r0 = new X.LtT
            r0.<init>(r4)
            X.MQl[] r0 = new X.C66405MQl[]{r0}
            r5.A03(r0)
            goto L_0x1719
        L_0x066d:
            boolean r0 = r2 instanceof X.C65446LtU
            if (r0 == 0) goto L_0x1719
            X.0eM r0 = r1.A00
            java.lang.Object r0 = r0.getValue()
            X.KUV r0 = (X.KUV) r0
            X.LtU r2 = (X.C65446LtU) r2
            int r1 = r2.A00
            X.Lzh r0 = r0.A01
            X.8XW r0 = r0.A00
            r0.A0D(r1)
            goto L_0x1719
        L_0x0686:
            java.lang.Object r5 = A00(r1, r3)
            X.KgG r5 = (X.C62466KgG) r5
            java.lang.Object r4 = r3.A02
            X.K6i r4 = (X.C61411K6i) r4
            android.widget.TextView r1 = r4.A05
            if (r1 == 0) goto L_0x076b
            r0 = 0
            X.0qQ.A0B(r5, r0)
            X.KgG r3 = X.C62466KgG.EDIT
            boolean r0 = X.AnonymousClass7TF.A1W(r5, r3)
            r0 = r0 ^ 1
            r2 = 0
            int r0 = X.DbW.A01(r0)
            r1.setVisibility(r0)
            android.widget.EditText r1 = r4.A03
            java.lang.String r6 = "titleEditText"
            if (r1 == 0) goto L_0x0d04
            boolean r0 = X.AnonymousClass7TF.A1W(r5, r3)
            if (r0 != 0) goto L_0x06b6
            r2 = 8
        L_0x06b6:
            r1.setVisibility(r2)
            boolean r0 = X.AnonymousClass7TF.A1W(r5, r3)
            android.widget.EditText r2 = r4.A03
            if (r0 == 0) goto L_0x06d7
            if (r2 == 0) goto L_0x0d04
            r1 = 16
            X.LWP r0 = new X.LWP
            r0.<init>((java.lang.Object) r4, (int) r1)
            r2.addTextChangedListener(r0)
            r4.A00 = r0
        L_0x06cf:
            X.C61411K6i.A00(r4)
            X.C61411K6i.A01(r4)
            goto L_0x1719
        L_0x06d7:
            if (r2 == 0) goto L_0x0d04
            android.text.TextWatcher r0 = r4.A00
            r2.removeTextChangedListener(r0)
            goto L_0x06cf
        L_0x06df:
            java.lang.Object r1 = A00(r1, r3)
            X.MQm r1 = (X.C66406MQm) r1
            java.lang.Object r0 = r3.A02
            X.K6i r0 = (X.C61411K6i) r0
            X.C61411K6i.A02(r0, r1)
            goto L_0x1719
        L_0x06ee:
            java.lang.Object r4 = A00(r1, r3)
            X.JzE r4 = (X.C61221JzE) r4
            java.lang.Object r6 = r3.A02
            X.K6i r6 = (X.C61411K6i) r6
            if (r4 == 0) goto L_0x1719
            X.LtY r0 = X.C65450LtY.A00
            X.C61411K6i.A02(r6, r0)
            android.widget.EditText r2 = r6.A03
            if (r2 != 0) goto L_0x0707
            java.lang.String r6 = "titleEditText"
            goto L_0x0d04
        L_0x0707:
            java.lang.String r1 = r4.A05
            android.widget.TextView$BufferType r0 = android.widget.TextView.BufferType.EDITABLE
            r2.setText(r1, r0)
            android.widget.TextView r0 = r6.A05
            if (r0 == 0) goto L_0x076b
            r0.setText(r1)
            com.instagram.common.ui.widget.imageview.CircularImageView r0 = r6.A06
            if (r0 != 0) goto L_0x071d
            java.lang.String r6 = "ownerAvatar"
            goto L_0x0d04
        L_0x071d:
            com.instagram.user.model.User r2 = r4.A01
            X.DbU.A1S(r6, r0, r2)
            android.widget.TextView r5 = r6.A04
            if (r5 != 0) goto L_0x072a
            java.lang.String r6 = "ownerName"
            goto L_0x0d04
        L_0x072a:
            X.0eM r0 = r6.A0D
            com.instagram.common.session.UserSession r4 = X.AnonymousClass7TE.A0l(r0)
            r1 = 64
            java.lang.String r0 = r2.getUsername()
            java.lang.String r3 = X.002.A0D(r0, r1)
            android.content.Context r0 = r6.getContext()
            int r1 = X.2Yu.A0A(r0)
            r0 = 1
            X.0qQ.A0B(r4, r0)
            android.content.Context r0 = r5.getContext()
            int r2 = r0.getColor(r1)
            android.text.SpannableStringBuilder r1 = X.DbS.A0C(r3)
            X.3q3 r0 = new X.3q3
            r0.<init>(r1, r4)
            r0.A01 = r2
            r0.A03(r6)
            android.text.SpannableStringBuilder r0 = r0.A00()
            X.DbX.A1G(r5, r0)
            X.C61411K6i.A00(r6)
            r6.A03()
            goto L_0x1719
        L_0x076b:
            java.lang.String r6 = "titleTextView"
            goto L_0x0d04
        L_0x076f:
            java.lang.Object r0 = A00(r1, r3)
            java.util.AbstractMap r0 = (java.util.AbstractMap) r0
            java.lang.Object r4 = r3.A02
            X.K5B r4 = (X.K5B) r4
            java.util.Collection r0 = r0.values()
            X.0qQ.A07(r0)
            java.util.List r3 = X.00k.A0a(r0)
            X.0eM r5 = r4.A07
            java.lang.Object r0 = r5.getValue()
            X.2dZ r0 = (X.2dZ) r0
            if (r0 == 0) goto L_0x07a7
            com.instagram.common.ui.base.IgTextView r2 = r0.C7y()
            if (r2 == 0) goto L_0x07a7
            X.0eM r0 = r4.A08
            java.lang.Object r1 = r0.getValue()
            X.KhP r1 = (X.C62533KhP) r1
            int r0 = r3.size()
            java.lang.String r0 = X.K5B.A00(r1, r4, r0)
            r2.setText(r0)
        L_0x07a7:
            java.lang.Object r1 = r5.getValue()
            X.2dZ r1 = (X.2dZ) r1
            r2 = 0
            if (r1 == 0) goto L_0x07bb
            X.JjV r0 = X.JTT.A0Z(r4)
            boolean r0 = r0.A04()
            r1.ARb(r2, r0)
        L_0x07bb:
            X.JjV r1 = X.JTT.A0Z(r4)
            X.KhP r0 = r1.A02
            int r1 = X.C60326JjV.A00(r0, r1)
            r0 = 1
            if (r1 <= r0) goto L_0x1719
            X.2t9 r0 = r4.A03
            if (r0 == 0) goto L_0x07cf
            X.JTR.A1L(r0, r3)
        L_0x07cf:
            android.view.View r1 = r4.A00
            if (r1 == 0) goto L_0x1719
            boolean r0 = X.AnonymousClass7TE.A1b(r3)
            if (r0 != 0) goto L_0x07db
            r2 = 8
        L_0x07db:
            r1.setVisibility(r2)
            goto L_0x1719
        L_0x07e0:
            java.lang.Object r1 = A00(r1, r3)
            X.MQl r1 = (X.C66405MQl) r1
            java.lang.Object r10 = r3.A02
            X.K5B r10 = (X.K5B) r10
            boolean r0 = r1 instanceof X.C65444LtS
            if (r0 == 0) goto L_0x0801
            X.LtS r1 = (X.C65444LtS) r1
            X.LE6 r2 = r1.A00
            X.1xC r1 = X.1xC.A01
            android.content.Context r0 = r10.requireContext()
            X.3GP r0 = r2.A00(r0)
            r1.A00(r0)
            goto L_0x1719
        L_0x0801:
            boolean r0 = r1 instanceof X.C65446LtU
            if (r0 == 0) goto L_0x0812
            X.LtU r1 = (X.C65446LtU) r1
            java.lang.String r1 = r1.A01
            X.6zy r0 = r10.A06
            if (r0 == 0) goto L_0x1719
            r0.setTitle(r1)
            goto L_0x1719
        L_0x0812:
            boolean r0 = r1 instanceof X.C65445LtT
            if (r0 == 0) goto L_0x1719
            X.0eM r0 = r10.A0A
            X.7Pr r9 = X.DbX.A0f(r0)
            r0 = 2131100175(0x7f06020f, float:1.7812724E38)
            r9.A0B = r0
            androidx.fragment.app.FragmentActivity r8 = r10.requireActivity()
            X.LtT r1 = (X.C65445LtT) r1
            java.util.List r0 = r1.A00
            java.util.ArrayList r7 = X.AnonymousClass7TG.A0r(r0)
            java.util.Iterator r6 = r0.iterator()
        L_0x0831:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x085f
            java.lang.Object r5 = r6.next()
            com.instagram.ui.widget.mediapicker.Folder r5 = (com.instagram.ui.widget.mediapicker.Folder) r5
            int r4 = r5.A02
            java.lang.String r3 = r5.A03
            if (r3 != 0) goto L_0x0845
            java.lang.String r3 = ""
        L_0x0845:
            java.util.List r0 = r5.A01()
            java.lang.Object r2 = X.00k.A0I(r0)
            com.instagram.common.gallery.Medium r2 = (com.instagram.common.gallery.Medium) r2
            r0 = 30
            X.MPB r1 = new X.MPB
            r1.<init>((int) r0, (java.lang.Object) r5, (java.lang.Object) r10)
            com.instagram.mediakit.ui.model.MediaKitFolderSheetItemModel r0 = new com.instagram.mediakit.ui.model.MediaKitFolderSheetItemModel
            r0.<init>(r2, r3, r1, r4)
            r7.add(r0)
            goto L_0x0831
        L_0x085f:
            com.instagram.mediakit.config.MediaKitGalleryFoldersSheetConfig r3 = new com.instagram.mediakit.config.MediaKitGalleryFoldersSheetConfig
            r3.<init>(r7)
            X.7Pu r2 = r9.A00()
            X.K3x r1 = new X.K3x
            r1.<init>()
            java.lang.String r0 = "mk_gallery_folders_argument"
            X.DbZ.A1B(r1, r0, r3)
            r2.A02(r8, r1)
            goto L_0x1719
        L_0x0877:
            java.lang.Object r5 = A00(r1, r3)
            X.4Cq r5 = (X.C262224Cq) r5
            java.lang.Object r4 = r3.A02
            X.KXh r4 = (X.KXh) r4
            X.0eM r3 = r4.A03
            java.lang.Object r0 = r3.getValue()
            X.Ji2 r0 = (X.C60245Ji2) r0
            X.0r6 r1 = r0.A09
            r2 = 0
            r0 = 16
            X.MGW r0 = A01(r4, r2, r0)
            X.C51968G9o.A1P(r0, r5, r1)
            java.lang.Object r0 = r3.getValue()
            X.Ji2 r0 = (X.C60245Ji2) r0
            X.0r6 r1 = r0.A0A
            r0 = 17
            X.MGW r0 = A01(r4, r2, r0)
            X.C51968G9o.A1P(r0, r5, r1)
            goto L_0x1719
        L_0x08a8:
            java.lang.Object r7 = A00(r1, r3)
            X.L6q r7 = (X.C63784L6q) r7
            java.lang.Object r6 = r3.A02
            X.KXh r6 = (X.KXh) r6
            X.0eM r3 = r6.A01
            java.lang.Object r0 = r3.getValue()
            X.2dZ r0 = (X.2dZ) r0
            if (r0 == 0) goto L_0x08db
            com.instagram.common.ui.base.IgTextView r2 = r0.C7y()
            if (r2 == 0) goto L_0x08db
            java.util.List r0 = r7.A01
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x0917
            r1 = 2131966574(0x7f133a6e, float:1.956999E38)
            java.lang.Object[] r0 = X.AnonymousClass7TF.A1b(r0)
            java.lang.String r0 = r6.getString(r1, r0)
        L_0x08d5:
            X.0qQ.A07(r0)
            r2.setText(r0)
        L_0x08db:
            java.lang.Object r5 = r3.getValue()
            X.2dZ r5 = (X.2dZ) r5
            if (r5 == 0) goto L_0x08f8
            r4 = 0
            X.L1v r0 = r7.A00
            int r3 = r0.A00
            java.util.List r0 = r7.A01
            int r2 = r0.size()
            r1 = 0
            r0 = 1
            if (r0 > r2) goto L_0x08f5
            if (r2 > r3) goto L_0x08f5
            r1 = 1
        L_0x08f5:
            r5.ARb(r4, r1)
        L_0x08f8:
            X.K9H r1 = r6.A09()
            java.util.List r2 = r7.A01
            java.util.List r0 = r7.A02
            r1.A05(r2, r0)
            X.K9H r0 = r6.A09()
            r0.A02()
            X.K9H r1 = r6.A09()
            int r0 = r2.size()
            r1.A03(r0)
            goto L_0x1719
        L_0x0917:
            r0 = 2131966563(0x7f133a63, float:1.9569968E38)
            java.lang.String r0 = r6.getString(r0)
            goto L_0x08d5
        L_0x091f:
            java.lang.Object r0 = A00(r1, r3)
            X.L1w r0 = (X.C63660L1w) r0
            java.lang.Object r2 = r3.A02
            androidx.fragment.app.Fragment r2 = (androidx.fragment.app.Fragment) r2
            if (r0 == 0) goto L_0x0944
            r1 = 2131966561(0x7f133a61, float:1.9569964E38)
            int r0 = r0.A00
            java.lang.Object[] r0 = X.AnonymousClass7TF.A1b(r0)
            java.lang.String r1 = r2.getString(r1, r0)
            X.0qQ.A07(r1)
            android.content.Context r0 = r2.requireContext()
            X.C59689JTv.A09(r0, r1)
            goto L_0x1719
        L_0x0944:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0949:
            java.lang.Object r5 = A00(r1, r3)
            X.MQl[] r5 = (X.C66405MQl[]) r5
            java.lang.Object r4 = r3.A02
            X.JjV r4 = (X.C60326JjV) r4
            r3 = 0
            int r2 = r5.length
        L_0x0955:
            if (r3 >= r2) goto L_0x1719
            r1 = r5[r3]
            X.0V2 r0 = r4.A05
            r0.FIA(r1)
            int r3 = r3 + 1
            goto L_0x0955
        L_0x0961:
            java.lang.Object r4 = A00(r1, r3)
            X.MQk r4 = (X.C66404MQk) r4
            java.lang.Object r3 = r3.A02
            X.JjW r3 = (X.C60327JjW) r3
            boolean r0 = r4 instanceof X.C65431LtF
            if (r0 == 0) goto L_0x0987
            X.LtX r6 = X.C65449LtX.A00
        L_0x0971:
            X.6oS r5 = X.C318116oQ.A00(r3)
            r2 = 0
            r1 = 20
            X.MGW r0 = new X.MGW
            r0.<init>(r3, r6, r2, r1)
            X.AnonymousClass7TE.A1Z(r0, r5)
        L_0x0980:
            X.05G r0 = r3.A0I
            r0.Epw(r4)
            goto L_0x1719
        L_0x0987:
            boolean r0 = r4 instanceof X.C65430LtE
            if (r0 == 0) goto L_0x0998
            java.lang.Integer r0 = X.AnonymousClass05K.A1F
            X.C64127LPb.A01(r3, r0)
            X.KiA r0 = X.C62577KiA.TEMPLATE_LOADED
            X.C60327JjW.A01(r0, r3)
            X.LtY r6 = X.C65450LtY.A00
            goto L_0x0971
        L_0x0998:
            boolean r0 = r4 instanceof X.C65440LtO
            if (r0 == 0) goto L_0x09c3
            r8 = 2131966608(0x7f133a90, float:1.9570059E38)
            r0 = r4
            X.LtO r0 = (X.C65440LtO) r0
            java.lang.String r7 = r0.A00
            X.LtW r6 = new X.LtW
            r6.<init>()
            X.6oS r2 = X.C318116oQ.A00(r3)
            r5 = 0
            r1 = 20
            X.MGW r0 = new X.MGW
            r0.<init>(r3, r6, r5, r1)
            X.AnonymousClass7TE.A1Z(r0, r2)
            X.LE6 r2 = new X.LE6
            r2.<init>(r5, r5, r8)
            r2.A01 = r7
        L_0x09bf:
            X.C60327JjW.A00(r2, r3)
            goto L_0x0980
        L_0x09c3:
            boolean r0 = r4 instanceof X.C65434LtI
            if (r0 == 0) goto L_0x09d1
            r1 = 0
            r0 = 2131966610(0x7f133a92, float:1.9570063E38)
        L_0x09cb:
            X.LE6 r2 = new X.LE6
            r2.<init>(r1, r1, r0)
            goto L_0x09bf
        L_0x09d1:
            boolean r0 = r4 instanceof X.C65433LtH
            if (r0 == 0) goto L_0x09da
            r1 = 0
            r0 = 2131966609(0x7f133a91, float:1.957006E38)
            goto L_0x09cb
        L_0x09da:
            boolean r0 = r4 instanceof X.C65438LtM
            r6 = 1
            r8 = 0
            if (r0 != 0) goto L_0x0a13
            boolean r0 = r4 instanceof X.C65436LtK
            if (r0 != 0) goto L_0x0a13
            boolean r7 = r4 instanceof X.C65437LtL
            r1 = 2
            if (r7 != 0) goto L_0x0a8a
            boolean r0 = r4 instanceof X.C65435LtJ
            if (r0 != 0) goto L_0x0a8a
            boolean r0 = r4 instanceof X.C65441LtP
            if (r0 == 0) goto L_0x0a19
            X.MQn[] r5 = new X.C66407MQn[r1]
            X.Ltu r0 = X.C65472Ltu.A00
            r5[r8] = r0
            r1 = 2131972502(0x7f135196, float:1.9582013E38)
            r0 = -1
            X.LDu r2 = new X.LDu
            r2.<init>(r1, r0)
            r0 = r4
            X.LtP r0 = (X.C65441LtP) r0
            java.lang.String r0 = r0.A00
            r2.A03 = r0
            X.Lte r1 = new X.Lte
            r1.<init>(r2)
        L_0x0a0c:
            r5[r6] = r1
        L_0x0a0e:
            r3.A05(r5)
            goto L_0x0980
        L_0x0a13:
            X.MQn[] r5 = new X.C66407MQn[r6]
            r1 = 2131966619(0x7f133a9b, float:1.9570081E38)
            goto L_0x0a22
        L_0x0a19:
            boolean r0 = r4 instanceof X.C50540FeB
            if (r0 == 0) goto L_0x0a2a
            X.MQn[] r5 = new X.C66407MQn[r6]
            r1 = 2131966583(0x7f133a77, float:1.9570008E38)
        L_0x0a22:
            X.Lta r0 = new X.Lta
            r0.<init>(r1)
        L_0x0a27:
            r5[r8] = r0
            goto L_0x0a0e
        L_0x0a2a:
            boolean r0 = r4 instanceof X.C50539FeA
            if (r0 == 0) goto L_0x0a55
            X.05G r1 = r3.A0H
            X.KgG r0 = X.C62466KgG.VIEW
            r1.Epw(r0)
            X.Ltu r6 = X.C65472Ltu.A00
            X.Lts r5 = X.C65470Lts.A00
            r2 = 0
            r0 = 2131966584(0x7f133a78, float:1.957001E38)
            X.LE6 r1 = new X.LE6
            r1.<init>(r2, r2, r0)
            r0 = 2131238110(0x7f081cde, float:1.809249E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A00 = r0
            X.Ltc r0 = new X.Ltc
            r0.<init>(r1)
            X.MQn[] r5 = new X.C66407MQn[]{r6, r5, r0}
            goto L_0x0a0e
        L_0x0a55:
            boolean r0 = r4 instanceof X.Fe9
            if (r0 == 0) goto L_0x0a6e
            X.MQn[] r5 = new X.C66407MQn[r1]
            X.Ltu r0 = X.C65472Ltu.A00
            r5[r8] = r0
            r2 = 0
            r1 = 2131966581(0x7f133a75, float:1.9570004E38)
            X.LE6 r0 = new X.LE6
            r0.<init>(r2, r2, r1)
            X.Ltc r1 = new X.Ltc
            r1.<init>(r0)
            goto L_0x0a0c
        L_0x0a6e:
            boolean r0 = r4 instanceof X.C65439LtN
            if (r0 == 0) goto L_0x0ac6
            X.MQn[] r5 = new X.C66407MQn[r6]
            r2 = 0
            r0 = 2131966587(0x7f133a7b, float:1.9570016E38)
            X.LE6 r1 = new X.LE6
            r1.<init>(r2, r2, r0)
            r0 = r4
            X.LtN r0 = (X.C65439LtN) r0
            java.lang.String r0 = r0.A00
            r1.A01 = r0
            X.Ltc r0 = new X.Ltc
            r0.<init>(r1)
            goto L_0x0a27
        L_0x0a8a:
            X.05G r1 = r3.A0H
            X.KgG r0 = X.C62466KgG.VIEW
            r1.Epw(r0)
            X.Ltu r5 = X.C65472Ltu.A00
            r2 = 0
            r0 = 2131966625(0x7f133aa1, float:1.9570093E38)
            X.LE6 r1 = new X.LE6
            r1.<init>(r2, r2, r0)
            r0 = 2131238110(0x7f081cde, float:1.809249E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A00 = r0
            X.Ltc r0 = new X.Ltc
            r0.<init>(r1)
            X.MQn[] r0 = new X.C66407MQn[]{r5, r0}
            r3.A05(r0)
            boolean r0 = r4 instanceof X.C65435LtJ
            if (r0 == 0) goto L_0x0ac1
            X.KiA r0 = X.C62577KiA.READY_TO_SHARE
            X.C60327JjW.A01(r0, r3)
            java.lang.Integer r0 = X.AnonymousClass05K.A0I
        L_0x0abc:
            X.C64127LPb.A01(r3, r0)
            goto L_0x0980
        L_0x0ac1:
            if (r7 == 0) goto L_0x0980
            java.lang.Integer r0 = X.AnonymousClass05K.A0J
            goto L_0x0abc
        L_0x0ac6:
            boolean r0 = r4 instanceof X.C65429LtD
            if (r0 == 0) goto L_0x0980
            r0 = r4
            X.LtD r0 = (X.C65429LtD) r0
            X.LML r0 = r0.A00
            r3.A00 = r0
            goto L_0x0980
        L_0x0ad3:
            X.0eS.A00(r1)
            java.lang.Object r0 = r3.A02
            X.JjW r0 = (X.C60327JjW) r0
            X.05G r1 = r0.A0G
            java.lang.Object r0 = r3.A00
            r1.Epw(r0)
            goto L_0x1719
        L_0x0ae3:
            java.lang.Object r4 = A00(r1, r3)
            X.JzE r4 = (X.C61221JzE) r4
            if (r4 == 0) goto L_0x0afa
            java.lang.String r0 = r4.A03
            if (r0 != 0) goto L_0x0afa
            java.lang.Object r0 = r3.A02
            X.JjW r0 = (X.C60327JjW) r0
            X.05G r1 = r0.A0H
            X.KgG r0 = X.C62466KgG.EDIT
            r1.Epw(r0)
        L_0x0afa:
            java.lang.Object r0 = r3.A02
            X.JjW r0 = (X.C60327JjW) r0
            X.L9D r2 = r0.A05
            com.instagram.common.session.UserSession r0 = r2.A03
            java.lang.String r1 = r0.A06
            if (r4 == 0) goto L_0x0b16
            com.instagram.user.model.User r0 = r4.A01
            if (r0 == 0) goto L_0x0b16
            java.lang.String r0 = r0.getId()
        L_0x0b0e:
            boolean r0 = X.0qQ.A0K(r1, r0)
            r2.A01 = r0
            goto L_0x1719
        L_0x0b16:
            r0 = 0
            goto L_0x0b0e
        L_0x0b18:
            java.lang.Object r1 = A00(r1, r3)
            X.2o7 r0 = X.AnonymousClass2o7.LOADING
            if (r1 == r0) goto L_0x1719
            X.2o7 r0 = X.AnonymousClass2o7.ERROR
            if (r1 == r0) goto L_0x1719
            java.lang.Object r1 = r3.A02
            X.JjW r1 = (X.C60327JjW) r1
            r1.A03()
            X.Ltw r0 = X.C65474Ltw.A00
            X.C60327JjW.A02(r0, r1)
            goto L_0x1719
        L_0x0b32:
            java.lang.Object r0 = A00(r1, r3)
            java.io.File r0 = (java.io.File) r0
            java.io.File[] r4 = r0.listFiles()
            java.lang.Object r0 = r3.A02
            X.3IP r0 = (X.AnonymousClass3IP) r0
            java.util.List r0 = r0.A02
            if (r0 == 0) goto L_0x1719
            java.util.List r0 = X.00k.A0a(r0)
            java.util.LinkedHashSet r5 = X.DbS.A0y()
            java.util.Iterator r3 = r0.iterator()
        L_0x0b50:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0b91
            java.lang.Object r1 = r3.next()
            X.BHe r1 = (X.C42101BHe) r1
            X.LOR r0 = X.LOR.A01
            java.lang.String r0 = r1.A04
            X.UwR r0 = X.C18241Vo8.A00(r0)
            java.lang.String r2 = r1.A02
            if (r2 != 0) goto L_0x0b6a
            java.lang.String r2 = ""
        L_0x0b6a:
            java.lang.StringBuilder r1 = X.JTQ.A0d(r0)
            r0 = 95
            r1.append(r0)
            r1.append(r2)
            r1.append(r0)
            java.util.Locale r0 = java.util.Locale.getDefault()
            java.lang.String r0 = r0.getLanguage()
            X.0qQ.A07(r0)
            r1.append(r0)
            java.lang.String r0 = ".png"
            java.lang.String r0 = X.AnonymousClass7TF.A0l(r0, r1)
            r5.add(r0)
            goto L_0x0b50
        L_0x0b91:
            if (r4 == 0) goto L_0x1719
            r3 = 0
            int r2 = r4.length
        L_0x0b95:
            if (r3 >= r2) goto L_0x1719
            r1 = r4[r3]
            java.lang.String r0 = r1.getName()
            boolean r0 = r5.contains(r0)
            if (r0 != 0) goto L_0x0ba6
            r1.delete()
        L_0x0ba6:
            int r3 = r3 + 1
            goto L_0x0b95
        L_0x0ba9:
            java.lang.Object r1 = A00(r1, r3)
            X.EaQ r1 = (X.C48184EaQ) r1
            boolean r0 = r1 instanceof X.EN7
            if (r0 == 0) goto L_0x0bfb
            java.lang.Object r2 = r3.A02
            X.E4S r2 = (X.E4S) r2
            X.DlI r1 = r2.A01()
            androidx.fragment.app.FragmentActivity r3 = r2.requireActivity()
            X.0eM r0 = r2.A04
            com.instagram.common.session.UserSession r4 = X.AnonymousClass7TE.A0l(r0)
            X.DlI r0 = r2.A01()
            int r0 = r0.A01()
            java.lang.String r0 = r2.getString(r0)
            X.0qQ.A07(r0)
            r0 = 4390(0x1126, float:6.152E-42)
            java.lang.String r5 = X.AnonymousClass000.A00(r0)
            r6 = 0
            r1.A06(r2, r3, r4, r5, r6)
            X.DlI r0 = r2.A01()
            com.instagram.monetization.onboarding.repository.OnboardingRepository r1 = r0.A05
            com.instagram.api.schemas.UserMonetizationProductType r0 = r0.A02()
            com.instagram.monetization.onboarding.model.ProductOnboardingNextStepInfo r0 = X.C49904FEc.A00(r0, r1)
            if (r0 != 0) goto L_0x1719
            java.lang.String r1 = "finished"
            r0 = 5094(0x13e6, float:7.138E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r2.A02(r1, r0, r6)
            goto L_0x1719
        L_0x0bfb:
            boolean r0 = r1 instanceof X.EN8
            if (r0 == 0) goto L_0x1719
            java.lang.Object r3 = r3.A02
            X.E4S r3 = (X.E4S) r3
            X.EN8 r1 = (X.EN8) r1
            int r2 = r1.A00
            androidx.fragment.app.FragmentActivity r1 = r3.getActivity()
            if (r1 == 0) goto L_0x1719
            X.M7i r0 = new X.M7i
            r0.<init>(r3, r2)
            r1.runOnUiThread(r0)
            goto L_0x1719
        L_0x0c17:
            java.lang.Object r1 = A00(r1, r3)
            X.EaQ r1 = (X.C48184EaQ) r1
            boolean r0 = r1 instanceof X.C61979KUc
            if (r0 == 0) goto L_0x0c56
            java.lang.Object r2 = r3.A02
            X.E4f r2 = (X.C47480E4f) r2
            X.KUc r1 = (X.C61979KUc) r1
            com.instagram.monetization.onboarding.repository.OnboardingRepository r6 = r1.A01
            com.instagram.api.schemas.UserMonetizationProductType r4 = r1.A00
            java.lang.String r8 = r1.A03
            java.lang.String r10 = r1.A02
            java.lang.String r9 = r1.A04
            androidx.fragment.app.FragmentActivity r3 = r2.getActivity()
            if (r3 == 0) goto L_0x1719
            r0 = 1
            r2.A02 = r0
            X.C47480E4f.A01(r2)
            X.FEc r1 = X.C49283EsS.A00
            com.instagram.common.session.UserSession r5 = r2.A05()
            java.lang.String r7 = r2.getModuleName()
            java.lang.String r11 = r2.A07()
            r0 = 4391(0x1127, float:6.153E-42)
            java.lang.String r12 = X.AnonymousClass000.A00(r0)
            r1.A02(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            goto L_0x1719
        L_0x0c56:
            boolean r0 = r1 instanceof X.C61978KUb
            if (r0 == 0) goto L_0x0cb3
            java.lang.Object r7 = r3.A02
            X.E4f r7 = (X.C47480E4f) r7
            X.KUb r1 = (X.C61978KUb) r1
            X.EN3 r2 = r1.A00
            java.lang.String r1 = r1.A01
            if (r1 != 0) goto L_0x0c6b
            X.C47480E4f.A02(r7)
            goto L_0x1719
        L_0x0c6b:
            r0 = 1
            r7.A02 = r0
            X.C47480E4f.A01(r7)
            r0 = 5114(0x13fa, float:7.166E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0c8a
            java.lang.String r0 = "deferred_onboarding_payouts"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0c8a
            X.C47480E4f.A03(r7, r2)
            goto L_0x1719
        L_0x0c8a:
            java.lang.String r11 = r7.getModuleName()
            androidx.fragment.app.FragmentActivity r8 = r7.requireActivity()
            com.instagram.common.session.UserSession r10 = r7.A05()
            X.DlI r0 = r7.A01
            java.lang.String r6 = "productOnboardingViewModel"
            if (r0 == 0) goto L_0x0d04
            com.instagram.api.schemas.UserMonetizationProductType r9 = r0.A02()
            X.DlI r0 = r7.A01
            if (r0 == 0) goto L_0x0d04
            java.lang.String r12 = r0.A04()
            r13 = 0
            java.lang.String r15 = r7.A07()
            r14 = r13
            X.F6T.A01(r7, r8, r9, r10, r11, r12, r13, r14, r15)
            goto L_0x1719
        L_0x0cb3:
            boolean r0 = r1 instanceof X.C61977KUa
            if (r0 == 0) goto L_0x1719
            java.lang.Object r0 = r3.A02
            X.E4f r0 = (X.C47480E4f) r0
            X.C47480E4f.A02(r0)
            goto L_0x1719
        L_0x0cc0:
            java.lang.Object r1 = A00(r1, r3)
            X.Kh4 r1 = (X.C62514Kh4) r1
            java.lang.Object r0 = r3.A02
            X.K70 r0 = (X.K70) r0
            X.K70.A01(r0, r1)
            goto L_0x1719
        L_0x0ccf:
            java.lang.Object r4 = A00(r1, r3)
            java.util.List r4 = (java.util.List) r4
            java.lang.Object r3 = r3.A02
            X.K70 r3 = (X.K70) r3
            X.JkY r2 = r3.A06
            java.lang.String r6 = "adapter"
            if (r2 == 0) goto L_0x0d04
            X.0eM r0 = r3.A0P
            com.instagram.music.common.model.MusicBrowseCategory r1 = X.JTT.A0b(r0)
            r0 = 0
            X.0qQ.A0B(r1, r0)
            r2.A00 = r1
            X.JkY r0 = r3.A06
            if (r0 == 0) goto L_0x0d04
            r0.submitList(r4)
            goto L_0x1719
        L_0x0cf4:
            java.lang.Object r1 = A00(r1, r3)
            X.Juo r1 = (X.C60992Juo) r1
            java.lang.Object r0 = r3.A02
            X.K70 r0 = (X.K70) r0
            X.LFN r2 = r0.A07
            if (r2 != 0) goto L_0x0d0c
            java.lang.String r6 = "musicTrackStateDelegate"
        L_0x0d04:
            X.0qQ.A0F(r6)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0d0c:
            X.KgW r1 = r1.A00
            r0 = 0
            X.0qQ.A0B(r1, r0)
            r2.A00 = r1
            goto L_0x1719
        L_0x0d16:
            java.lang.Object r1 = A00(r1, r3)
            X.KnI r1 = (X.C62842KnI) r1
            boolean r0 = r1 instanceof X.KVQ
            if (r0 == 0) goto L_0x0d28
            java.lang.Object r0 = r3.A02
            android.content.Context r2 = X.DbT.A08(r0)
            goto L_0x0dd3
        L_0x0d28:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0d2d:
            java.lang.Object r1 = A00(r1, r3)
            X.HPF r1 = (X.HPF) r1
            boolean r0 = r1 instanceof X.C61463K8s
            if (r0 == 0) goto L_0x1719
            X.K8s r1 = (X.C61463K8s) r1
            X.Uq6 r0 = r1.A00
            com.instagram.clips.model.metadata.AudioPageMetadata r0 = r0.A00
            com.instagram.music.common.config.MusicAttributionConfig r0 = r0.A04
            r5 = 0
            if (r0 == 0) goto L_0x1719
            com.instagram.music.common.model.MusicAssetModel r0 = r0.A02
            if (r0 == 0) goto L_0x1719
            X.MWx r4 = X.JVW.A00(r0)
            java.lang.Object r1 = r3.A02
            X.K6w r1 = (X.C61423K6w) r1
            X.MSb r3 = r1.A05
            if (r3 == 0) goto L_0x1719
            r0 = 2131975535(0x7f135d6f, float:1.9588165E38)
            java.lang.String r2 = X.DbU.A0m(r1, r0)
            java.lang.String r1 = "playlists"
            java.lang.String r0 = "trending"
            com.instagram.music.common.model.MusicBrowseCategory r0 = X.C64181LSn.A03(r1, r0, r2)
            r3.Dt4(r4, r0, r5)
            goto L_0x1719
        L_0x0d66:
            java.lang.Object r0 = A00(r1, r3)
            boolean r0 = r0 instanceof X.KMv
            if (r0 == 0) goto L_0x1719
            java.lang.Object r0 = r3.A02
            X.K6w r0 = (X.C61423K6w) r0
            X.C61423K6w.A02(r0)
            X.0eM r0 = r0.A0R
            X.27r r2 = X.C51971G9r.A0g(r0)
            X.JVj r1 = X.C59725JVj.PRE_CAPTURE
            java.lang.String r0 = "DESTINATION_TOOLBAR_TRENDING_AUDIO"
            r2.A1Q(r1, r0)
            goto L_0x1719
        L_0x0d84:
            java.lang.Object r2 = A00(r1, r3)
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r1 = r3.A02
            com.instagram.music.search.MusicOverlayResultsListController r1 = (com.instagram.music.search.MusicOverlayResultsListController) r1
            X.JkY r0 = r1.A0E
            r0.submitList(r2)
            androidx.recyclerview.widget.RecyclerView r0 = r1.recyclerView
            if (r0 == 0) goto L_0x1719
            X.Ji3 r2 = r1.A0G
            boolean r0 = r2.A05
            if (r0 == 0) goto L_0x1719
            androidx.recyclerview.widget.RecyclerView r1 = r1.A05()
            r0 = 0
            r1.A0o(r0)
            r2.A05 = r0
            goto L_0x1719
        L_0x0da9:
            java.lang.Object r1 = A00(r1, r3)
            X.Juo r1 = (X.C60992Juo) r1
            java.lang.Object r0 = r3.A02
            com.instagram.music.search.MusicOverlayResultsListController r0 = (com.instagram.music.search.MusicOverlayResultsListController) r0
            X.LFN r2 = r0.A0F
            X.KgW r1 = r1.A00
            r0 = 0
            X.0qQ.A0B(r1, r0)
            r2.A00 = r1
            goto L_0x1719
        L_0x0dbf:
            java.lang.Object r1 = A00(r1, r3)
            X.KnI r1 = (X.C62842KnI) r1
            boolean r0 = r1 instanceof X.KVQ
            if (r0 == 0) goto L_0x0de6
            java.lang.Object r0 = r3.A02
            com.instagram.music.search.MusicOverlayResultsListController r0 = (com.instagram.music.search.MusicOverlayResultsListController) r0
            X.4DH r0 = r0.A0A
            android.content.Context r2 = r0.getContext()
        L_0x0dd3:
            X.KVQ r1 = (X.KVQ) r1
            boolean r0 = r1.A00
            r1 = 2131975986(0x7f135f32, float:1.958908E38)
            if (r0 == 0) goto L_0x0ddf
            r1 = 2131972506(0x7f13519a, float:1.9582021E38)
        L_0x0ddf:
            java.lang.String r0 = "SaveUnsaveAudioRequestFailed"
            X.C59689JTv.A0F(r2, r0, r1)
            goto L_0x1719
        L_0x0de6:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0deb:
            X.0eS.A00(r1)
            java.lang.Object r1 = r3.A02
            com.instagram.music.search.MusicOverlayResultsListController r1 = (com.instagram.music.search.MusicOverlayResultsListController) r1
            java.lang.Object r0 = r3.A00
            android.view.View r0 = (android.view.View) r0
            com.instagram.music.search.MusicOverlayResultsListController.A01(r0, r1)
            goto L_0x1719
        L_0x0dfb:
            X.0eS.A00(r1)
            java.lang.Object r6 = r3.A02
            X.5GM r6 = (X.AnonymousClass5GM) r6
            X.0eK r0 = r6.A03
            X.5GY r5 = X.JTR.A0q(r0)
            java.lang.Object r4 = r3.A00
            java.util.List r4 = (java.util.List) r4
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r2 = r4.iterator()
        L_0x0e14:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0e2e
            java.lang.Object r1 = r2.next()
            X.5Gi r1 = (X.C283155Gi) r1
            com.instagram.common.session.UserSession r0 = r6.A01
            java.lang.String r0 = r0.A06
            X.5Gg r0 = X.C63355Kvc.A00(r1, r0)
            if (r0 == 0) goto L_0x0e14
            r3.add(r0)
            goto L_0x0e14
        L_0x0e2e:
            r5.A02(r3)
            X.0gF r5 = X.C60340gF.A00
            boolean r0 = X.AnonymousClass7TE.A1b(r4)
            if (r0 == 0) goto L_0x0e65
            r0 = 1
            r6.A00 = r0
            X.0eK r0 = r6.A02
            java.lang.Object r0 = r0.get()
            X.2aO r0 = (X.C71082aO) r0
            r0.A03()
            return r5
        L_0x0e48:
            java.lang.Object r2 = A00(r1, r3)
            X.4dm r2 = (X.C268654dm) r2
            java.lang.Object r1 = r3.A02
            com.instagram.mediakit.api.MediaKitApi r1 = (com.instagram.mediakit.api.MediaKitApi) r1
            java.lang.Integer r0 = X.AnonymousClass05K.A09
            com.instagram.mediakit.api.MediaKitApi.A02(r2, r1, r0)
            java.lang.String r1 = r2.toString()
            java.lang.String r0 = "media_kit_api"
            X.0wb.A03(r0, r1)
            X.L4n r5 = new X.L4n
            r5.<init>(r2)
        L_0x0e65:
            return r5
        L_0x0e66:
            X.0eS.A00(r1)
            java.lang.Object r0 = r3.A02
            X.5GM r0 = (X.AnonymousClass5GM) r0
            X.0eK r2 = r0.A03
            X.5GY r1 = X.JTR.A0q(r2)
            java.lang.Object r0 = r3.A00
            X.5Gi r0 = (X.C283155Gi) r0
            java.lang.String r0 = r0.A09
            X.0qQ.A07(r0)
            X.5Gg r1 = r1.A00(r0)
            if (r1 == 0) goto L_0x1719
            X.5GY r0 = X.JTR.A0q(r2)
            java.lang.String r4 = r1.A05
            X.3oI r3 = r0.A00
            r3.assertNotSuspendingTransaction()
            X.1Vg r2 = r0.A03
            X.1WV r1 = r2.acquire()
            r0 = 1
            r1.ADh(r0, r4)
            r3.beginTransaction()     // Catch:{ all -> 0x0ead }
            r1.ATQ()     // Catch:{ all -> 0x0ea8 }
            r3.setTransactionSuccessful()     // Catch:{ all -> 0x0ea8 }
            r3.endTransaction()     // Catch:{ all -> 0x0ead }
            r2.release(r1)
            goto L_0x1719
        L_0x0ea8:
            r0 = move-exception
            r3.endTransaction()     // Catch:{ all -> 0x0ead }
            throw r0     // Catch:{ all -> 0x0ead }
        L_0x0ead:
            r0 = move-exception
            r2.release(r1)
            throw r0
        L_0x0eb2:
            X.0eS.A00(r1)
            java.lang.Object r4 = r3.A02
            X.5GM r4 = (X.AnonymousClass5GM) r4
            X.0eK r0 = r4.A03
            java.lang.Object r2 = r0.get()
            X.3oI r2 = (X.C251983oI) r2
            java.lang.Object r1 = r3.A00
            java.util.List r1 = (java.util.List) r1
            X.M7m r0 = new X.M7m
            r0.<init>(r4, r1)
            r2.runInTransaction((java.lang.Runnable) r0)
            goto L_0x1719
        L_0x0ecf:
            X.0eS.A00(r1)
            java.lang.Object r0 = r3.A02
            X.E7a r0 = (X.C47537E7a) r0
            X.05G r2 = r0.A08
            java.lang.Object r1 = r2.getValue()
            java.util.Set r1 = (java.util.Set) r1
            java.lang.Object r0 = r3.A00
            X.17B r0 = (X.AnonymousClass17B) r0
            java.lang.String r0 = r0.getId()
            java.util.LinkedHashSet r0 = X.094.A01(r0, r1)
            r2.Epw(r0)
            goto L_0x1719
        L_0x0eef:
            java.lang.Object r4 = A00(r1, r3)
            X.4Cq r4 = (X.C262224Cq) r4
            java.lang.Object r3 = r3.A02
            X.E2q r3 = (X.C47444E2q) r3
            X.E7c r0 = X.C47444E2q.A00(r3)
            X.0r6 r1 = r0.A07
            r2 = 0
            r0 = 41
            X.MGW r0 = A01(r3, r2, r0)
            X.C51968G9o.A1P(r0, r4, r1)
            X.E7c r0 = X.C47444E2q.A00(r3)
            X.0Ud r1 = r0.A0A
            r0 = 42
            X.MGW r0 = A01(r3, r2, r0)
            X.C51968G9o.A1P(r0, r4, r1)
            goto L_0x1719
        L_0x0f1a:
            java.lang.Object r0 = A00(r1, r3)
            X.MRK r0 = (X.MRK) r0
            r12 = 0
            boolean r1 = X.C61259Jzr.A00(r12, r0)
            if (r1 != 0) goto L_0x15e4
            r4 = 1
            boolean r1 = X.C61259Jzr.A00(r4, r0)
            if (r1 != 0) goto L_0x15fd
            boolean r1 = r0 instanceof X.M07
            if (r1 != 0) goto L_0x15d7
            boolean r1 = X.C61260Jzs.A00(r12, r0)
            if (r1 == 0) goto L_0x0f8b
            java.lang.Object r5 = r3.A02
            X.E2q r5 = (X.C47444E2q) r5
            X.Jzs r0 = (X.C61260Jzs) r0
            r1 = 409(0x199, float:5.73E-43)
            java.lang.String r2 = X.AnonymousClass000.A00(r1)
            r1 = 97
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            X.0eP r3 = X.AnonymousClass7TE.A1L(r2, r1)
            java.lang.Object r0 = r0.A01
            java.util.Collection r0 = (java.util.Collection) r0
            java.util.ArrayList r1 = X.AnonymousClass7TE.A1D(r0)
            r0 = 410(0x19a, float:5.75E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.0eP r2 = X.AnonymousClass7TE.A1L(r0, r1)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r4)
            r0 = 414(0x19e, float:5.8E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            android.os.Bundle r4 = X.DbY.A0C(r0, r1, r3, r2)
            X.0eM r0 = r5.A07
            X.0lg r3 = X.DbT.A0X(r0)
            java.lang.Class<com.instagram.modal.ModalActivity> r2 = com.instagram.modal.ModalActivity.class
            androidx.fragment.app.FragmentActivity r1 = r5.requireActivity()
            r0 = 240(0xf0, float:3.36E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            X.6W8 r1 = X.DbW.A0W(r1, r4, r3, r2, r0)
            r0 = 277(0x115, float:3.88E-43)
            r1.A0D(r5, r0)
            goto L_0x1719
        L_0x0f8b:
            boolean r1 = X.C61260Jzs.A00(r4, r0)
            if (r1 == 0) goto L_0x0fb4
            java.lang.Object r2 = r3.A02
            X.E2q r2 = (X.C47444E2q) r2
            X.Jzs r0 = (X.C61260Jzs) r0
            android.content.Context r3 = r2.requireContext()
            X.0eM r1 = r2.A07
            r1.getValue()
            java.lang.Object r8 = r0.A01
            com.instagram.user.model.User r8 = (com.instagram.user.model.User) r8
            X.0iw r6 = r2.A01
            r1 = 34
            X.FJk r4 = new X.FJk
            r4.<init>((X.C61260Jzs) r0, (X.C47444E2q) r2, (int) r1)
            r5 = 0
            r7 = r5
            X.FH6.A06(r3, r4, r5, r6, r7, r8)
            goto L_0x1719
        L_0x0fb4:
            r1 = 2
            boolean r1 = X.C61260Jzs.A00(r1, r0)
            if (r1 == 0) goto L_0x0ff1
            java.lang.Object r3 = r3.A02
            X.E2q r3 = (X.C47444E2q) r3
            X.Jzs r0 = (X.C61260Jzs) r0
            java.lang.Object r9 = r0.A01
            com.instagram.user.model.User r9 = (com.instagram.user.model.User) r9
            X.0eM r1 = r3.A07
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r1)
            X.AnonymousClass7TF.A1H(r9, r2)
            r1 = 786(0x312, float:1.101E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            X.C49173Eqe.A00(r2, r9, r1)
            android.content.Context r4 = r3.requireContext()
            X.0iw r7 = r3.A01
            r1 = 35
            X.FJk r5 = new X.FJk
            r5.<init>((X.C61260Jzs) r0, (X.C47444E2q) r3, (int) r1)
            r1 = 36
            X.FJk r6 = new X.FJk
            r6.<init>((X.C61260Jzs) r0, (X.C47444E2q) r3, (int) r1)
            r8 = 0
            X.FH6.A05(r4, r5, r6, r7, r8, r9)
            goto L_0x1719
        L_0x0ff1:
            r1 = 4
            boolean r1 = X.C61260Jzs.A00(r1, r0)
            if (r1 == 0) goto L_0x1019
            java.lang.Object r2 = r3.A02
            X.E2q r2 = (X.C47444E2q) r2
            X.Jzs r0 = (X.C61260Jzs) r0
            X.0eM r1 = r2.A07
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r1)
            X.5mt r3 = X.C294695ms.A00(r1)
            androidx.fragment.app.FragmentActivity r2 = r2.requireActivity()
            java.lang.Object r1 = r0.A01
            X.DwR r1 = (X.DwR) r1
            X.0qQ.A0B(r1, r4)
            r0 = 0
            X.C294705mt.A02(r2, r0, r1, r3)
            goto L_0x1719
        L_0x1019:
            boolean r1 = r0 instanceof X.C61258Jzq
            if (r1 == 0) goto L_0x1066
            java.lang.Object r5 = r3.A02
            X.E2q r5 = (X.C47444E2q) r5
            X.Jzq r0 = (X.C61258Jzq) r0
            androidx.fragment.app.FragmentActivity r1 = r5.requireActivity()
            X.6ST r4 = X.DbV.A0h(r1)
            r1 = 2131965491(0x7f133633, float:1.9567793E38)
            X.DbU.A1L(r5, r4, r1)
            X.AnonymousClass0fN.A00(r4)
            java.lang.String r2 = r0.A00
            java.lang.String r1 = "connected_user_id"
            X.0eP r3 = X.AnonymousClass7TE.A1L(r1, r2)
            java.lang.String r2 = r0.A02
            java.lang.String r1 = "requester_user_id"
            X.0eP r2 = X.AnonymousClass7TE.A1L(r1, r2)
            java.lang.String r1 = r0.A01
            java.lang.String r0 = "position"
            java.util.LinkedHashMap r2 = X.JTS.A0p(r0, r1, r3, r2)
            X.0eM r0 = r5.A07
            X.0lg r1 = X.DbT.A0X(r0)
            r0 = 1193(0x4a9, float:1.672E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.8ey r1 = X.C359988do.A05(r1, r0, r2)
            r0 = 8
            X.E86.A01(r1, r4, r5, r0)
            r5.schedule(r1)
            goto L_0x1719
        L_0x1066:
            boolean r1 = r0 instanceof X.C61257Jzp
            if (r1 == 0) goto L_0x10ae
            java.lang.Object r4 = r3.A02
            X.E2q r4 = (X.C47444E2q) r4
            X.Jzp r0 = (X.C61257Jzp) r0
            androidx.fragment.app.FragmentActivity r1 = r4.requireActivity()
            X.6ST r3 = X.DbV.A0h(r1)
            r1 = 2131965491(0x7f133633, float:1.9567793E38)
            X.DbU.A1L(r4, r3, r1)
            X.AnonymousClass0fN.A00(r3)
            java.lang.String r2 = r0.A01
            java.lang.String r1 = "requester_user_id"
            X.0eP r2 = X.AnonymousClass7TE.A1L(r1, r2)
            java.lang.String r1 = r0.A00
            java.lang.String r0 = "harm_type"
            X.0eP[] r0 = X.JTQ.A1b(r0, r1, r2)
            java.util.LinkedHashMap r2 = X.0Yt.A07(r0)
            X.0eM r0 = r4.A07
            X.0lg r1 = X.DbT.A0X(r0)
            r0 = 1187(0x4a3, float:1.663E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.8ey r1 = X.C359988do.A05(r1, r0, r2)
            r0 = 7
            X.E86.A01(r1, r3, r4, r0)
            r4.schedule(r1)
            goto L_0x1719
        L_0x10ae:
            r1 = 5
            boolean r1 = X.C61260Jzs.A00(r1, r0)
            if (r1 == 0) goto L_0x10dd
            java.lang.Object r2 = r3.A02
            X.E2q r2 = (X.C47444E2q) r2
            X.Jzs r0 = (X.C61260Jzs) r0
            X.1Z4 r3 = X.1Z4.A00
            android.content.Context r4 = r2.requireContext()
            X.0eM r1 = r2.A07
            com.instagram.common.session.UserSession r6 = X.AnonymousClass7TE.A0l(r1)
            X.0iw r1 = r2.A01
            java.lang.String r9 = r1.getModuleName()
            java.lang.Object r7 = r0.A01
            com.instagram.user.model.User r7 = (com.instagram.user.model.User) r7
            java.lang.String r11 = r7.getUsername()
            r5 = 0
            r8 = r5
            r10 = r5
            r3.A00(r4, r5, r6, r7, r8, r9, r10, r11)
            goto L_0x1719
        L_0x10dd:
            r1 = 3
            boolean r1 = X.C61260Jzs.A00(r1, r0)
            if (r1 == 0) goto L_0x1109
            java.lang.Object r2 = r3.A02
            X.E2q r2 = (X.C47444E2q) r2
            X.Jzs r0 = (X.C61260Jzs) r0
            X.0eM r1 = r2.A05
            java.lang.Object r3 = r1.getValue()
            X.F2z r3 = (X.C49714F2z) r3
            android.content.Context r4 = r2.requireContext()
            X.0eM r1 = r2.A07
            com.instagram.common.session.UserSession r5 = X.AnonymousClass7TE.A0l(r1)
            java.lang.Object r6 = r0.A01
            com.instagram.user.model.User r6 = (com.instagram.user.model.User) r6
            java.lang.Integer r7 = X.AnonymousClass05K.A00
            java.lang.String r8 = ""
            r3.A00(r4, r5, r6, r7, r8)
            goto L_0x1719
        L_0x1109:
            boolean r1 = r0 instanceof X.M06
            if (r1 == 0) goto L_0x118c
            java.lang.Object r3 = r3.A02
            X.E2q r3 = (X.C47444E2q) r3
            X.M06 r0 = (X.M06) r0
            r7 = 0
            java.util.LinkedHashMap r6 = X.AnonymousClass7TE.A1H()
            r5 = 2
            java.util.BitSet r4 = new java.util.BitSet
            r4.<init>(r5)
            com.instagram.user.model.User r2 = r0.A00
            java.lang.String r1 = r2.getId()
            java.lang.String r0 = "ig_user_id"
            r6.put(r0, r1)
            r4.set(r12)
            java.lang.String r1 = r2.getUsername()
            r0 = 134(0x86, float:1.88E-43)
            java.lang.String r0 = X.C66579MXk.A00(r0)
            r6.put(r0, r1)
            r15 = 1
            r4.set(r15)
            int r0 = r4.nextClearBit(r12)
            if (r0 < r5) goto L_0x1185
            X.0sm r21 = X.0Yt.A0E()
            java.util.Map r20 = X.0Yt.A0B(r6)
            r23 = 0
            r22 = 719983200(0x2aea1260, float:4.15795E-13)
            r0 = 1188(0x4a4, float:1.665E-42)
            java.lang.String r17 = X.AnonymousClass000.A00(r0)
            X.ShW r2 = new X.ShW
            r16 = r2
            r18 = r7
            r19 = r7
            r25 = r15
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r25)
            android.content.Context r1 = r3.requireContext()
            X.0eM r0 = r3.A07
            X.0lg r0 = X.DbT.A0X(r0)
            X.6Qj r0 = X.C48721Ej6.A00(r0, r12)
            r11 = 1065353216(0x3f800000, float:1.0)
            X.FRI r6 = new X.FRI
            r8 = r7
            r9 = r7
            r10 = r7
            r13 = r12
            r14 = r12
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15)
            X.0qQ.A0B(r0, r15)
            r2.E0s(r1, r6, r0)
            goto L_0x1719
        L_0x1185:
            java.lang.String r0 = "Missing required params"
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        L_0x118c:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x1191:
            java.lang.Object r0 = A00(r1, r3)
            X.LMY r0 = (X.LMY) r0
            java.lang.Object r1 = r3.A02
            X.E2q r1 = (X.C47444E2q) r1
            boolean r0 = r0.A02
            android.widget.TextView r2 = r1.A00
            goto L_0x154b
        L_0x11a1:
            java.lang.Object r5 = A00(r1, r3)
            X.4Cq r5 = (X.C262224Cq) r5
            java.lang.Object r4 = r3.A02
            X.E6l r4 = (X.C47525E6l) r4
            X.0eM r3 = r4.A0H
            java.lang.Object r0 = r3.getValue()
            X.E7c r0 = (X.C47539E7c) r0
            X.0r6 r1 = r0.A07
            r2 = 0
            r0 = 44
            X.MGW r0 = A01(r4, r2, r0)
            X.C51968G9o.A1P(r0, r5, r1)
            java.lang.Object r0 = r3.getValue()
            X.E7c r0 = (X.C47539E7c) r0
            X.0Ud r1 = r0.A0A
            r0 = 45
            X.MGW r0 = A01(r4, r2, r0)
            X.C51968G9o.A1P(r0, r5, r1)
            goto L_0x1719
        L_0x11d2:
            java.lang.Object r0 = A00(r1, r3)
            X.MRK r0 = (X.MRK) r0
            r12 = 0
            boolean r1 = X.C61259Jzr.A00(r12, r0)
            if (r1 != 0) goto L_0x15e4
            r15 = 1
            boolean r1 = X.C61259Jzr.A00(r15, r0)
            if (r1 != 0) goto L_0x15fd
            boolean r1 = r0 instanceof X.M07
            if (r1 != 0) goto L_0x15d7
            boolean r1 = X.C61260Jzs.A00(r12, r0)
            if (r1 == 0) goto L_0x125f
            java.lang.Object r5 = r3.A02
            X.E6l r5 = (X.C47525E6l) r5
            X.Jzs r0 = (X.C61260Jzs) r0
            r1 = 409(0x199, float:5.73E-43)
            java.lang.String r2 = X.AnonymousClass000.A00(r1)
            r1 = 97
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            X.0eP r4 = X.AnonymousClass7TE.A1L(r2, r1)
            java.lang.Object r0 = r0.A01
            java.util.Collection r0 = (java.util.Collection) r0
            java.util.ArrayList r1 = X.AnonymousClass7TE.A1D(r0)
            r0 = 410(0x19a, float:5.75E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.0eP r3 = X.AnonymousClass7TE.A1L(r0, r1)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r15)
            r0 = 414(0x19e, float:5.8E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.0eP r2 = X.AnonymousClass7TE.A1L(r0, r1)
            android.os.Bundle r1 = r5.requireArguments()
            r0 = 415(0x19f, float:5.82E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.Boolean r1 = X.DbU.A0g(r1, r0)
            r0 = 2094(0x82e, float:2.934E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.0eP[] r0 = X.AnonymousClass7TH.A0h(r0, r1, r4, r3, r2)
            android.os.Bundle r4 = X.Q21.A00(r0)
            X.0eM r0 = r5.A0C
            X.0lg r3 = X.DbT.A0X(r0)
            java.lang.Class<com.instagram.modal.ModalActivity> r2 = com.instagram.modal.ModalActivity.class
            androidx.fragment.app.FragmentActivity r1 = r5.requireActivity()
            r0 = 240(0xf0, float:3.36E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            X.6W8 r1 = X.DbW.A0W(r1, r4, r3, r2, r0)
            r0 = 277(0x115, float:3.88E-43)
            r1.A0D(r5, r0)
            goto L_0x1719
        L_0x125f:
            r1 = 4
            boolean r1 = X.C61260Jzs.A00(r1, r0)
            if (r1 == 0) goto L_0x1287
            java.lang.Object r2 = r3.A02
            X.E6l r2 = (X.C47525E6l) r2
            X.Jzs r0 = (X.C61260Jzs) r0
            X.0eM r1 = r2.A0C
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r1)
            X.5mt r3 = X.C294695ms.A00(r1)
            androidx.fragment.app.FragmentActivity r2 = r2.requireActivity()
            java.lang.Object r1 = r0.A01
            X.DwR r1 = (X.DwR) r1
            X.0qQ.A0B(r1, r15)
            r0 = 0
            X.C294705mt.A02(r2, r0, r1, r3)
            goto L_0x1719
        L_0x1287:
            boolean r1 = r0 instanceof X.C61258Jzq
            if (r1 == 0) goto L_0x12d5
            java.lang.Object r4 = r3.A02
            X.E6l r4 = (X.C47525E6l) r4
            X.Jzq r0 = (X.C61258Jzq) r0
            androidx.fragment.app.FragmentActivity r1 = r4.requireActivity()
            X.6ST r3 = new X.6ST
            r3.<init>(r1, r15)
            r1 = 2131965491(0x7f133633, float:1.9567793E38)
            X.DbU.A1L(r4, r3, r1)
            X.AnonymousClass0fN.A00(r3)
            java.lang.String r2 = r0.A00
            java.lang.String r1 = "connected_user_id"
            X.0eP r5 = X.AnonymousClass7TE.A1L(r1, r2)
            java.lang.String r2 = r0.A02
            java.lang.String r1 = "requester_user_id"
            X.0eP r2 = X.AnonymousClass7TE.A1L(r1, r2)
            java.lang.String r1 = r0.A01
            java.lang.String r0 = "position"
            java.util.LinkedHashMap r2 = X.JTS.A0p(r0, r1, r5, r2)
            X.0eM r0 = r4.A0C
            X.0lg r1 = X.DbT.A0X(r0)
            r0 = 1193(0x4a9, float:1.672E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.8ey r1 = X.C359988do.A05(r1, r0, r2)
            r0 = 10
            X.E86.A01(r1, r3, r4, r0)
            r4.schedule(r1)
            goto L_0x1719
        L_0x12d5:
            boolean r1 = r0 instanceof X.C61257Jzp
            if (r1 == 0) goto L_0x131f
            java.lang.Object r4 = r3.A02
            X.E6l r4 = (X.C47525E6l) r4
            X.Jzp r0 = (X.C61257Jzp) r0
            androidx.fragment.app.FragmentActivity r1 = r4.requireActivity()
            X.6ST r3 = new X.6ST
            r3.<init>(r1, r15)
            r1 = 2131965491(0x7f133633, float:1.9567793E38)
            X.DbU.A1L(r4, r3, r1)
            X.AnonymousClass0fN.A00(r3)
            java.lang.String r2 = r0.A01
            java.lang.String r1 = "requester_user_id"
            X.0eP r2 = X.AnonymousClass7TE.A1L(r1, r2)
            java.lang.String r1 = r0.A00
            java.lang.String r0 = "harm_type"
            X.0eP[] r0 = X.JTQ.A1b(r0, r1, r2)
            java.util.LinkedHashMap r2 = X.0Yt.A07(r0)
            X.0eM r0 = r4.A0C
            X.0lg r1 = X.DbT.A0X(r0)
            r0 = 1187(0x4a3, float:1.663E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.8ey r1 = X.C359988do.A05(r1, r0, r2)
            r0 = 9
            X.E86.A01(r1, r3, r4, r0)
            r4.schedule(r1)
            goto L_0x1719
        L_0x131f:
            r1 = 3
            boolean r1 = X.C61260Jzs.A00(r1, r0)
            if (r1 == 0) goto L_0x134b
            java.lang.Object r2 = r3.A02
            X.E6l r2 = (X.C47525E6l) r2
            X.Jzs r0 = (X.C61260Jzs) r0
            X.0eM r1 = r2.A09
            java.lang.Object r3 = r1.getValue()
            X.F2z r3 = (X.C49714F2z) r3
            android.content.Context r4 = r2.requireContext()
            X.0eM r1 = r2.A0C
            com.instagram.common.session.UserSession r5 = X.AnonymousClass7TE.A0l(r1)
            java.lang.Object r6 = r0.A01
            com.instagram.user.model.User r6 = (com.instagram.user.model.User) r6
            java.lang.Integer r7 = X.AnonymousClass05K.A00
            java.lang.String r8 = ""
            r3.A00(r4, r5, r6, r7, r8)
            goto L_0x1719
        L_0x134b:
            boolean r1 = r0 instanceof X.M06
            if (r1 == 0) goto L_0x13cd
            java.lang.Object r3 = r3.A02
            X.E6l r3 = (X.C47525E6l) r3
            X.M06 r0 = (X.M06) r0
            r7 = 0
            java.util.LinkedHashMap r6 = X.AnonymousClass7TE.A1H()
            r5 = 2
            java.util.BitSet r4 = new java.util.BitSet
            r4.<init>(r5)
            com.instagram.user.model.User r2 = r0.A00
            java.lang.String r1 = r2.getId()
            java.lang.String r0 = "ig_user_id"
            r6.put(r0, r1)
            r4.set(r12)
            java.lang.String r1 = r2.getUsername()
            r0 = 134(0x86, float:1.88E-43)
            java.lang.String r0 = X.C66579MXk.A00(r0)
            r6.put(r0, r1)
            r4.set(r15)
            int r0 = r4.nextClearBit(r12)
            if (r0 < r5) goto L_0x13c6
            X.0sm r21 = X.0Yt.A0E()
            java.util.Map r20 = X.0Yt.A0B(r6)
            r23 = 0
            r22 = 719983200(0x2aea1260, float:4.15795E-13)
            r0 = 1188(0x4a4, float:1.665E-42)
            java.lang.String r17 = X.AnonymousClass000.A00(r0)
            X.ShW r2 = new X.ShW
            r16 = r2
            r18 = r7
            r19 = r7
            r25 = r15
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r25)
            android.content.Context r1 = r3.requireContext()
            X.0eM r0 = r3.A0C
            X.0lg r0 = X.DbT.A0X(r0)
            X.6Qj r0 = X.C48721Ej6.A00(r0, r12)
            r11 = 1065353216(0x3f800000, float:1.0)
            X.FRI r6 = new X.FRI
            r8 = r7
            r9 = r7
            r10 = r7
            r13 = r12
            r14 = r12
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15)
            X.0qQ.A0B(r0, r15)
            r2.E0s(r1, r6, r0)
            goto L_0x1719
        L_0x13c6:
            java.lang.String r0 = "Missing required params"
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        L_0x13cd:
            r1 = 2
            boolean r1 = X.C61260Jzs.A00(r1, r0)
            if (r1 != 0) goto L_0x1719
            boolean r1 = X.C61260Jzs.A00(r15, r0)
            if (r1 != 0) goto L_0x1719
            r1 = 5
            boolean r0 = X.C61260Jzs.A00(r1, r0)
            if (r0 != 0) goto L_0x1719
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x13e6:
            java.lang.Object r5 = A00(r1, r3)
            X.LMY r5 = (X.LMY) r5
            X.MQp r7 = r5.A00
            X.Luh r6 = X.C65518Luh.A00
            boolean r4 = X.0qQ.A0K(r7, r6)
            java.lang.Object r3 = r3.A02
            X.E6l r3 = (X.C47525E6l) r3
            X.0eM r0 = r3.A01
            java.lang.Object r2 = r0.getValue()
            X.K9F r2 = (X.K9F) r2
            r0 = 36
            X.GA1 r1 = new X.GA1
            r1.<init>(r0, r3, r4)
            r2.A06()
            X.Lui r0 = X.C65519Lui.A00
            boolean r0 = X.0qQ.A0K(r7, r0)
            if (r0 != 0) goto L_0x1523
            boolean r0 = r7 instanceof X.Ff1
            if (r0 != 0) goto L_0x1523
            boolean r0 = X.0qQ.A0K(r7, r6)
            if (r0 == 0) goto L_0x1516
            X.62P r0 = r5.A01
            java.util.Iterator r10 = r0.iterator()
        L_0x1422:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x1532
            java.lang.Object r9 = r10.next()
            X.JPS r9 = (X.JPS) r9
            r6 = 0
            boolean r0 = X.C47261Dtp.A00(r6, r9)
            if (r0 == 0) goto L_0x1449
            X.Dtp r9 = (X.C47261Dtp) r9
            java.lang.Object r7 = r9.A01
            X.GmF r7 = (X.C53329GmF) r7
            int r0 = r7.A00
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)
            X.Uez r0 = r2.A0G
        L_0x1443:
            X.2s0 r0 = (X.C231642s0) r0
            r2.A09(r0, r7, r6)
            goto L_0x1422
        L_0x1449:
            r7 = 1
            boolean r0 = X.C47261Dtp.A00(r7, r9)
            if (r0 == 0) goto L_0x1463
            java.lang.Integer r6 = X.AnonymousClass05K.A01
            X.Dtp r9 = (X.C47261Dtp) r9
            java.lang.Object r0 = r9.A01
            java.lang.Integer r0 = (java.lang.Integer) r0
            X.EwU r11 = new X.EwU
            r11.<init>(r6, r0)
            X.EA0 r0 = r2.A03
        L_0x145f:
            r2.A08(r0, r11)
            goto L_0x1422
        L_0x1463:
            boolean r0 = r9 instanceof X.C53550GqL
            if (r0 == 0) goto L_0x146c
            X.F0f r11 = r2.A08
            X.2tm r0 = r2.A09
            goto L_0x145f
        L_0x146c:
            boolean r0 = r9 instanceof X.C50588Fex
            if (r0 == 0) goto L_0x1475
            X.FGF r11 = r2.A0F
            X.E9j r0 = r2.A0B
            goto L_0x145f
        L_0x1475:
            r0 = 3
            boolean r0 = X.C47261Dtp.A00(r0, r9)
            if (r0 == 0) goto L_0x148d
            X.Dtp r9 = (X.C47261Dtp) r9
            java.lang.Object r0 = r9.A01
            X.GmA r0 = (X.C53324GmA) r0
            X.3UM r7 = r0.A01
            int r0 = r0.A00
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)
            X.DfD r0 = r2.A02
            goto L_0x1443
        L_0x148d:
            boolean r0 = r9 instanceof X.C50590Fez
            if (r0 == 0) goto L_0x149b
            X.DfA r7 = r2.A0A
            X.A5l r6 = r2.A0C
            X.7fR r0 = r2.A0D
            r2.A09(r0, r7, r6)
            goto L_0x1422
        L_0x149b:
            boolean r0 = r9 instanceof X.C50591Ff0
            r13 = 0
            if (r0 == 0) goto L_0x14aa
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            X.EwU r11 = new X.EwU
            r11.<init>(r0, r13)
            X.EA0 r0 = r2.A03
            goto L_0x145f
        L_0x14aa:
            r0 = 2
            boolean r0 = X.C47261Dtp.A00(r0, r9)
            if (r0 == 0) goto L_0x14b8
            X.Dtp r9 = (X.C47261Dtp) r9
            java.lang.Object r11 = r9.A01
            X.2sj r0 = r2.A05
            goto L_0x145f
        L_0x14b8:
            boolean r0 = r9 instanceof X.C50587Few
            if (r0 == 0) goto L_0x14c3
            X.K9u r0 = r2.A07
        L_0x14be:
            r2.A08(r0, r13)
            goto L_0x1422
        L_0x14c3:
            boolean r0 = X.C53551GqM.A00(r6, r9)
            if (r0 == 0) goto L_0x150f
            android.content.Context r0 = X.C60960kU.A00
            android.content.res.Resources r6 = r0.getResources()
            r0 = 2131974105(0x7f1357d9, float:1.9585265E38)
            java.lang.String r24 = X.AnonymousClass7TF.A0d(r6, r0)
            android.content.Context r0 = X.C60960kU.A00
            android.content.res.Resources r8 = r0.getResources()
            r6 = 2131820971(0x7f1101ab, float:1.9274672E38)
            X.GqM r9 = (X.C53551GqM) r9
            int r0 = r9.A01
            java.lang.String r26 = X.DbY.A0d(r8, r0, r6)
            android.view.View$OnClickListener r12 = r2.A00
            X.Njo r16 = X.C69349Njo.TYPE_CHEVRON
            r0 = 2131239007(0x7f08205f, float:1.8094309E38)
            java.lang.Integer r17 = java.lang.Integer.valueOf(r0)
            X.OIM r11 = new X.OIM
            r14 = r13
            r15 = r13
            r18 = r13
            r19 = r13
            r20 = r13
            r21 = r13
            r22 = r13
            r23 = r13
            r25 = r13
            r27 = r7
            r28 = r7
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            X.NLN r0 = r2.A0E
            goto L_0x145f
        L_0x150f:
            boolean r0 = r9 instanceof X.C50586Fev
            if (r0 == 0) goto L_0x1422
            X.EAi r0 = r2.A01
            goto L_0x14be
        L_0x1516:
            X.Luj r0 = X.C65520Luj.A00
            boolean r0 = X.0qQ.A0K(r7, r0)
            if (r0 != 0) goto L_0x1532
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x1523:
            X.LCq r0 = r2.A04
            X.KGC r0 = r0.A00(r7)
            X.72b r7 = r0.A00
            X.6rr r6 = r0.A01
            X.71T r0 = r2.A06
            r2.A09(r0, r7, r6)
        L_0x1532:
            r1.invoke()
            r2.A07()
            if (r4 == 0) goto L_0x1547
            X.0eM r0 = r3.A08
            java.lang.Object r0 = r0.getValue()
            X.DuI r0 = (X.C47289DuI) r0
            X.34p r0 = r0.A01
            r0.A04()
        L_0x1547:
            boolean r0 = r5.A02
            android.widget.TextView r2 = r3.A00
        L_0x154b:
            if (r2 == 0) goto L_0x1719
            r2.setEnabled(r0)
            boolean r1 = r2.isEnabled()
            r0 = 1051931443(0x3eb33333, float:0.35)
            if (r1 == 0) goto L_0x155b
            r0 = 1065353216(0x3f800000, float:1.0)
        L_0x155b:
            r2.setAlpha(r0)
            goto L_0x1719
        L_0x1560:
            java.lang.Object r5 = A00(r1, r3)
            X.4Cq r5 = (X.C262224Cq) r5
            java.lang.Object r4 = r3.A02
            X.E6k r4 = (X.C47524E6k) r4
            X.0eM r3 = r4.A09
            java.lang.Object r0 = r3.getValue()
            X.E7c r0 = (X.C47539E7c) r0
            X.0r6 r1 = r0.A07
            r2 = 0
            r0 = 47
            X.MGW r0 = A01(r4, r2, r0)
            X.C51968G9o.A1P(r0, r5, r1)
            java.lang.Object r0 = r3.getValue()
            X.E7c r0 = (X.C47539E7c) r0
            X.0Ud r1 = r0.A0A
            r0 = 48
            X.MGW r0 = A01(r4, r2, r0)
            X.C51968G9o.A1P(r0, r5, r1)
            goto L_0x1719
        L_0x1591:
            java.lang.Object r0 = A00(r1, r3)
            X.MRK r0 = (X.MRK) r0
            r2 = 0
            boolean r1 = X.C61259Jzr.A00(r2, r0)
            if (r1 != 0) goto L_0x15e4
            r4 = 1
            boolean r1 = X.C61259Jzr.A00(r4, r0)
            if (r1 != 0) goto L_0x15fd
            boolean r1 = r0 instanceof X.M07
            if (r1 != 0) goto L_0x15d7
            boolean r1 = X.C61260Jzs.A00(r2, r0)
            if (r1 != 0) goto L_0x1719
            r1 = 4
            boolean r1 = X.C61260Jzs.A00(r1, r0)
            if (r1 == 0) goto L_0x1719
            java.lang.Object r2 = r3.A02
            X.E6k r2 = (X.C47524E6k) r2
            X.Jzs r0 = (X.C61260Jzs) r0
            X.0eM r1 = r2.A07
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r1)
            X.5mt r3 = X.C294695ms.A00(r1)
            androidx.fragment.app.FragmentActivity r2 = r2.requireActivity()
            java.lang.Object r1 = r0.A01
            X.DwR r1 = (X.DwR) r1
            X.0qQ.A0B(r1, r4)
            r0 = 0
            X.C294705mt.A02(r2, r0, r1, r3)
            goto L_0x1719
        L_0x15d7:
            java.lang.Object r0 = r3.A02
            androidx.fragment.app.FragmentActivity r1 = X.DbT.A0E(r0)
            java.lang.String r0 = "follow_requests_failed_to_load"
            X.C59689JTv.A0D(r1, r0)
            goto L_0x1719
        L_0x15e4:
            java.lang.Object r1 = r3.A02
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            X.Jzr r0 = (X.C61259Jzr) r0
            android.content.res.Resources r2 = X.DbV.A05(r1)
            r1 = 2131820575(0x7f11001f, float:1.9273869E38)
            int r0 = r0.A01
            java.lang.String r2 = r2.getQuantityString(r1, r0)
            X.0qQ.A07(r2)
            java.lang.String r1 = "batch_follow_request_confirmation_failed"
            goto L_0x1615
        L_0x15fd:
            java.lang.Object r1 = r3.A02
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            X.Jzr r0 = (X.C61259Jzr) r0
            android.content.res.Resources r2 = X.DbV.A05(r1)
            r1 = 2131820576(0x7f110020, float:1.927387E38)
            int r0 = r0.A01
            java.lang.String r2 = r2.getQuantityString(r1, r0)
            X.0qQ.A07(r2)
            java.lang.String r1 = "batch_follow_request_deletion_failed"
        L_0x1615:
            X.6ap r0 = X.DbV.A0X()
            r0.A0H = r1
            r0.A0D = r2
            r0.A06()
            X.DbY.A1N(r0)
            goto L_0x1719
        L_0x1625:
            java.lang.Object r7 = A00(r1, r3)
            X.LMY r7 = (X.LMY) r7
            X.MQp r2 = r7.A00
            X.Luh r1 = X.C65518Luh.A00
            boolean r6 = X.0qQ.A0K(r2, r1)
            java.lang.Object r5 = r3.A02
            X.E6k r5 = (X.C47524E6k) r5
            X.0eM r0 = r5.A00
            java.lang.Object r4 = r0.getValue()
            X.K9E r4 = (X.K9E) r4
            r0 = 37
            X.GA1 r3 = new X.GA1
            r3.<init>(r0, r5, r6)
            r4.A06()
            X.Lui r0 = X.C65519Lui.A00
            boolean r0 = X.0qQ.A0K(r2, r0)
            if (r0 != 0) goto L_0x16f5
            boolean r0 = r2 instanceof X.Ff1
            if (r0 != 0) goto L_0x16f5
            boolean r0 = X.0qQ.A0K(r2, r1)
            if (r0 == 0) goto L_0x16e8
            X.62P r1 = r7.A01
            X.LCq r0 = r4.A00
            X.KGC r7 = r0.A00(r2)
            java.util.Iterator r9 = r1.iterator()
        L_0x1667:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x1704
            java.lang.Object r8 = r9.next()
            X.JPS r8 = (X.JPS) r8
            boolean r0 = r8 instanceof X.C53550GqL
            if (r0 == 0) goto L_0x1681
            X.72b r2 = r4.A01
            X.6rr r1 = r7.A01
            X.71T r0 = r4.A02
            r4.A09(r0, r2, r1)
            goto L_0x1667
        L_0x1681:
            r0 = 0
            boolean r0 = X.C47261Dtp.A00(r0, r8)
            if (r0 == 0) goto L_0x169c
            X.Dtp r8 = (X.C47261Dtp) r8
            java.lang.Object r2 = r8.A01
            X.GmF r2 = (X.C53329GmF) r2
            int r0 = r2.A00
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            X.Uez r0 = r4.A07
        L_0x1696:
            X.2s0 r0 = (X.C231642s0) r0
            r4.A09(r0, r2, r1)
            goto L_0x1667
        L_0x169c:
            boolean r0 = r8 instanceof X.C47260Dto
            if (r0 == 0) goto L_0x16b7
            X.Dto r8 = (X.C47260Dto) r8
            boolean r1 = r8.A00
            r0 = 2131974106(0x7f1357da, float:1.9585267E38)
            if (r1 == 0) goto L_0x16ac
            r0 = 2131974107(0x7f1357db, float:1.9585269E38)
        L_0x16ac:
            X.FGF r1 = new X.FGF
            r1.<init>((int) r0)
            X.E9j r0 = r4.A03
        L_0x16b3:
            r4.A08(r0, r1)
            goto L_0x1667
        L_0x16b7:
            boolean r0 = r8 instanceof X.C50589Fey
            if (r0 == 0) goto L_0x16c0
            X.FGF r1 = r4.A06
            X.Mg4 r0 = r4.A05
            goto L_0x16b3
        L_0x16c0:
            r0 = 1
            boolean r0 = X.C53551GqM.A00(r0, r8)
            if (r0 == 0) goto L_0x1667
            android.content.Context r0 = X.C60960kU.A00
            android.content.res.Resources r2 = r0.getResources()
            r1 = 2131820971(0x7f1101ab, float:1.9274672E38)
            X.GqM r8 = (X.C53551GqM) r8
            int r0 = r8.A01
            java.lang.String r0 = X.DbY.A0d(r2, r0, r1)
            X.0qQ.A07(r0)
            X.DfA r2 = new X.DfA
            r2.<init>((java.lang.CharSequence) r0)
            X.A5l r1 = new X.A5l
            r1.<init>()
            X.7fR r0 = r4.A04
            goto L_0x1696
        L_0x16e8:
            X.Luj r0 = X.C65520Luj.A00
            boolean r0 = X.0qQ.A0K(r2, r0)
            if (r0 != 0) goto L_0x1704
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x16f5:
            X.LCq r0 = r4.A00
            X.KGC r0 = r0.A00(r2)
            X.72b r2 = r0.A00
            X.6rr r1 = r0.A01
            X.71T r0 = r4.A02
            r4.A09(r0, r2, r1)
        L_0x1704:
            r3.invoke()
            r4.A07()
            if (r6 == 0) goto L_0x1719
            X.0eM r0 = r5.A05
            java.lang.Object r0 = r0.getValue()
            X.DuI r0 = (X.C47289DuI) r0
            X.34p r0 = r0.A01
            r0.A04()
        L_0x1719:
            X.0gF r5 = X.C60340gF.A00
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MGW.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public static Object A00(Object obj, MGW mgw) {
        0eS.A00(obj);
        return mgw.A00;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MGW(Object obj, AnonymousClass4D7 r3, int i) {
        super(2, r3);
        this.A01 = i;
        this.A02 = obj;
    }
}
