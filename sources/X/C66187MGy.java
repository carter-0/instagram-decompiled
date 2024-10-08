package X;

import android.text.TextUtils;

/* renamed from: X.MGy  reason: case insensitive filesystem */
public final class C66187MGy extends AnonymousClass1Ek implements 0sL {
    public Object A00;
    public final int A01;
    public final String A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66187MGy(Object obj, String str, AnonymousClass4D7 r4, int i) {
        super(2, r4);
        this.A01 = i;
        this.A00 = obj;
        this.A02 = str;
    }

    public static void A01(JVE jve, Throwable th) {
        jve.A02("client_reg_query_verifier_failed", "exception when getting enc verifier from feo2 client", "registration_flow", (String) null, th.getMessage(), TextUtils.join("\n", th.getStackTrace()), (String) null);
    }

    public static void A02(JVE jve, Throwable th) {
        jve.A02("client_auth_response_not_found", "auto_conf_client_authenticate_failed", "optimistic_authentication_flow", (String) null, th.getMessage(), TextUtils.join("\n", th.getStackTrace()), "authenticate_exception_caught");
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.MGy, X.4D7] */
    /* JADX WARNING: type inference failed for: r3v1, types: [X.MGy, X.4D7] */
    /* JADX WARNING: type inference failed for: r3v2, types: [X.MGy, X.4D7] */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0145, code lost:
        return new X.C66187MGy(r1, r2, r6, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        return new X.C66187MGy(r2, r1, r6, r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass4D7 create(java.lang.Object r5, X.AnonymousClass4D7 r6) {
        /*
            r4 = this;
            int r0 = r4.A01
            switch(r0) {
                case 0: goto L_0x0011;
                case 1: goto L_0x0017;
                case 2: goto L_0x001d;
                case 3: goto L_0x0023;
                case 4: goto L_0x0029;
                case 5: goto L_0x002f;
                case 6: goto L_0x0035;
                case 7: goto L_0x003b;
                case 8: goto L_0x0041;
                case 9: goto L_0x00ff;
                case 10: goto L_0x0048;
                case 11: goto L_0x004f;
                case 12: goto L_0x0056;
                case 13: goto L_0x0106;
                case 14: goto L_0x005d;
                case 15: goto L_0x0064;
                case 16: goto L_0x006b;
                case 17: goto L_0x0072;
                case 18: goto L_0x010d;
                case 19: goto L_0x0079;
                case 20: goto L_0x0080;
                case 21: goto L_0x0087;
                case 22: goto L_0x008f;
                case 23: goto L_0x0097;
                case 24: goto L_0x0114;
                case 25: goto L_0x009f;
                case 26: goto L_0x011b;
                case 27: goto L_0x0122;
                case 28: goto L_0x00a7;
                case 29: goto L_0x00af;
                case 30: goto L_0x0129;
                case 31: goto L_0x00b7;
                case 32: goto L_0x00bf;
                case 33: goto L_0x00c7;
                case 34: goto L_0x00cf;
                case 35: goto L_0x0130;
                case 36: goto L_0x00d7;
                case 37: goto L_0x00df;
                case 38: goto L_0x00e7;
                case 39: goto L_0x013a;
                case 40: goto L_0x00ef;
                case 41: goto L_0x00f7;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r2 = r4.A00
            java.lang.String r1 = r4.A02
            r0 = 42
        L_0x000b:
            X.MGy r3 = new X.MGy
            r3.<init>(r2, r1, r6, r0)
            return r3
        L_0x0011:
            java.lang.Object r2 = r4.A00
            java.lang.String r1 = r4.A02
            r0 = 0
            goto L_0x000b
        L_0x0017:
            java.lang.Object r2 = r4.A00
            java.lang.String r1 = r4.A02
            r0 = 1
            goto L_0x000b
        L_0x001d:
            java.lang.Object r2 = r4.A00
            java.lang.String r1 = r4.A02
            r0 = 2
            goto L_0x000b
        L_0x0023:
            java.lang.Object r2 = r4.A00
            java.lang.String r1 = r4.A02
            r0 = 3
            goto L_0x000b
        L_0x0029:
            java.lang.Object r2 = r4.A00
            java.lang.String r1 = r4.A02
            r0 = 4
            goto L_0x000b
        L_0x002f:
            java.lang.Object r2 = r4.A00
            java.lang.String r1 = r4.A02
            r0 = 5
            goto L_0x000b
        L_0x0035:
            java.lang.Object r2 = r4.A00
            java.lang.String r1 = r4.A02
            r0 = 6
            goto L_0x000b
        L_0x003b:
            java.lang.Object r2 = r4.A00
            java.lang.String r1 = r4.A02
            r0 = 7
            goto L_0x000b
        L_0x0041:
            java.lang.Object r2 = r4.A00
            java.lang.String r1 = r4.A02
            r0 = 8
            goto L_0x000b
        L_0x0048:
            java.lang.Object r2 = r4.A00
            java.lang.String r1 = r4.A02
            r0 = 10
            goto L_0x000b
        L_0x004f:
            java.lang.Object r2 = r4.A00
            java.lang.String r1 = r4.A02
            r0 = 11
            goto L_0x000b
        L_0x0056:
            java.lang.Object r2 = r4.A00
            java.lang.String r1 = r4.A02
            r0 = 12
            goto L_0x000b
        L_0x005d:
            java.lang.Object r2 = r4.A00
            java.lang.String r1 = r4.A02
            r0 = 14
            goto L_0x000b
        L_0x0064:
            java.lang.Object r2 = r4.A00
            java.lang.String r1 = r4.A02
            r0 = 15
            goto L_0x000b
        L_0x006b:
            java.lang.Object r2 = r4.A00
            java.lang.String r1 = r4.A02
            r0 = 16
            goto L_0x000b
        L_0x0072:
            java.lang.Object r2 = r4.A00
            java.lang.String r1 = r4.A02
            r0 = 17
            goto L_0x000b
        L_0x0079:
            java.lang.Object r2 = r4.A00
            java.lang.String r1 = r4.A02
            r0 = 19
            goto L_0x000b
        L_0x0080:
            java.lang.Object r2 = r4.A00
            java.lang.String r1 = r4.A02
            r0 = 20
            goto L_0x000b
        L_0x0087:
            java.lang.Object r2 = r4.A00
            java.lang.String r1 = r4.A02
            r0 = 21
            goto L_0x000b
        L_0x008f:
            java.lang.Object r2 = r4.A00
            java.lang.String r1 = r4.A02
            r0 = 22
            goto L_0x000b
        L_0x0097:
            java.lang.Object r2 = r4.A00
            java.lang.String r1 = r4.A02
            r0 = 23
            goto L_0x000b
        L_0x009f:
            java.lang.Object r2 = r4.A00
            java.lang.String r1 = r4.A02
            r0 = 25
            goto L_0x000b
        L_0x00a7:
            java.lang.Object r2 = r4.A00
            java.lang.String r1 = r4.A02
            r0 = 28
            goto L_0x000b
        L_0x00af:
            java.lang.Object r2 = r4.A00
            java.lang.String r1 = r4.A02
            r0 = 29
            goto L_0x000b
        L_0x00b7:
            java.lang.Object r2 = r4.A00
            java.lang.String r1 = r4.A02
            r0 = 31
            goto L_0x000b
        L_0x00bf:
            java.lang.Object r2 = r4.A00
            java.lang.String r1 = r4.A02
            r0 = 32
            goto L_0x000b
        L_0x00c7:
            java.lang.Object r2 = r4.A00
            java.lang.String r1 = r4.A02
            r0 = 33
            goto L_0x000b
        L_0x00cf:
            java.lang.Object r2 = r4.A00
            java.lang.String r1 = r4.A02
            r0 = 34
            goto L_0x000b
        L_0x00d7:
            java.lang.Object r2 = r4.A00
            java.lang.String r1 = r4.A02
            r0 = 36
            goto L_0x000b
        L_0x00df:
            java.lang.Object r2 = r4.A00
            java.lang.String r1 = r4.A02
            r0 = 37
            goto L_0x000b
        L_0x00e7:
            java.lang.Object r2 = r4.A00
            java.lang.String r1 = r4.A02
            r0 = 38
            goto L_0x000b
        L_0x00ef:
            java.lang.Object r2 = r4.A00
            java.lang.String r1 = r4.A02
            r0 = 40
            goto L_0x000b
        L_0x00f7:
            java.lang.Object r2 = r4.A00
            java.lang.String r1 = r4.A02
            r0 = 41
            goto L_0x000b
        L_0x00ff:
            java.lang.String r2 = r4.A02
            java.lang.Object r1 = r4.A00
            r0 = 9
            goto L_0x0140
        L_0x0106:
            java.lang.String r2 = r4.A02
            java.lang.Object r1 = r4.A00
            r0 = 13
            goto L_0x0140
        L_0x010d:
            java.lang.String r2 = r4.A02
            java.lang.Object r1 = r4.A00
            r0 = 18
            goto L_0x0140
        L_0x0114:
            java.lang.String r2 = r4.A02
            java.lang.Object r1 = r4.A00
            r0 = 24
            goto L_0x0140
        L_0x011b:
            java.lang.String r2 = r4.A02
            java.lang.Object r1 = r4.A00
            r0 = 26
            goto L_0x0140
        L_0x0122:
            java.lang.String r2 = r4.A02
            java.lang.Object r1 = r4.A00
            r0 = 27
            goto L_0x0140
        L_0x0129:
            java.lang.String r2 = r4.A02
            java.lang.Object r1 = r4.A00
            r0 = 30
            goto L_0x0140
        L_0x0130:
            java.lang.String r0 = r4.A02
            X.MGy r3 = new X.MGy
            r3.<init>(r0, r6)
            r3.A00 = r5
            return r3
        L_0x013a:
            java.lang.String r2 = r4.A02
            java.lang.Object r1 = r4.A00
            r0 = 39
        L_0x0140:
            X.MGy r3 = new X.MGy
            r3.<init>(r1, r2, r6, r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66187MGy.create(java.lang.Object, X.4D7):X.4D7");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x0545, code lost:
        r3 = r6.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x0547, code lost:
        r2 = r4.getValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0556, code lost:
        if (X.JTU.A1Z(r3, X.AnonymousClass7TE.A0u(), r2, (java.util.Map) r2, r4) == false) goto L_0x0547;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x0640, code lost:
        r3.Epw(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x06c2, code lost:
        X.AnonymousClass7TE.A1Z(r3, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:346:0x09be, code lost:
        X.0qQ.A0F(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:347:0x09c5, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0124, code lost:
        X.JTP.A1P(r3, r7, r4, r0);
        r6.A0x(X.0Yt.A06(r4));
        X.LRW.A01(r6, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0011, code lost:
        r2.A00(r6.A02, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:464:?, code lost:
        return X.C60340gF.A00;
     */
    /* JADX WARNING: Removed duplicated region for block: B:214:0x06b4  */
    /* JADX WARNING: Removed duplicated region for block: B:216:0x06c7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            r16 = this;
            r6 = r16
            int r0 = r6.A01
            r1 = r17
            switch(r0) {
                case 0: goto L_0x001a;
                case 1: goto L_0x002f;
                case 2: goto L_0x075a;
                case 3: goto L_0x0051;
                case 4: goto L_0x00a6;
                case 5: goto L_0x00d3;
                case 6: goto L_0x00fc;
                case 7: goto L_0x0133;
                case 8: goto L_0x078b;
                case 9: goto L_0x0816;
                case 10: goto L_0x0832;
                case 11: goto L_0x08fa;
                case 12: goto L_0x0140;
                case 13: goto L_0x0158;
                case 14: goto L_0x09c6;
                case 15: goto L_0x0171;
                case 16: goto L_0x09da;
                case 17: goto L_0x017b;
                case 18: goto L_0x018a;
                case 19: goto L_0x01ec;
                case 20: goto L_0x028d;
                case 21: goto L_0x029e;
                case 22: goto L_0x035a;
                case 23: goto L_0x0391;
                case 24: goto L_0x03cc;
                case 25: goto L_0x03f3;
                case 26: goto L_0x0412;
                case 27: goto L_0x0453;
                case 28: goto L_0x052a;
                case 29: goto L_0x053d;
                case 30: goto L_0x055a;
                case 31: goto L_0x05a9;
                case 32: goto L_0x05b8;
                case 33: goto L_0x062c;
                case 34: goto L_0x0645;
                case 35: goto L_0x0a99;
                case 36: goto L_0x0664;
                case 37: goto L_0x0b14;
                case 38: goto L_0x0676;
                case 39: goto L_0x06e2;
                case 40: goto L_0x0721;
                case 41: goto L_0x0750;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.Object r0 = A00(r1, r6)
            X.Ggx r0 = (X.C53006Ggx) r0
            X.KWh r2 = r0.A00
        L_0x0011:
            java.lang.String r1 = r6.A02
            r0 = 1
            r2.A00(r1, r0)
        L_0x0017:
            X.0gF r12 = X.C60340gF.A00
        L_0x0019:
            return r12
        L_0x001a:
            java.lang.Object r0 = A00(r1, r6)
            X.S1Z r0 = (X.S1Z) r0
            com.facebook.quicklog.QuickPerformanceLogger r3 = r0.A01
            if (r3 == 0) goto L_0x0017
            r2 = 571286288(0x220d2310, float:1.9127625E-18)
            int r1 = r0.A00
            java.lang.String r0 = r6.A02
            r3.markerPoint(r2, r1, r0)
            goto L_0x0017
        L_0x002f:
            java.lang.Object r5 = A00(r1, r6)
            X.S1Z r5 = (X.S1Z) r5
            com.facebook.quicklog.QuickPerformanceLogger r4 = r5.A01
            if (r4 == 0) goto L_0x0045
            r3 = 571286288(0x220d2310, float:1.9127625E-18)
            int r2 = r5.A00
            java.lang.String r1 = r6.A02
            java.lang.String r0 = "error"
            r4.markerAnnotate(r3, r2, r0, r1)
        L_0x0045:
            if (r4 == 0) goto L_0x0017
            r2 = 571286288(0x220d2310, float:1.9127625E-18)
            int r1 = r5.A00
            r0 = 3
            r4.markerEnd(r2, r1, r0)
            goto L_0x0017
        L_0x0051:
            java.lang.Object r0 = A00(r1, r6)
            X.41x r0 = (X.C2594941x) r0
            X.0eM r7 = r0.A01
            java.lang.Object r0 = r7.getValue()
            X.1LQ r0 = (X.1LQ) r0
            java.util.Set r0 = r0.getAllKeys()
            X.0qQ.A07(r0)
            java.lang.String r5 = r6.A02
            java.util.ArrayList r4 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r3 = r0.iterator()
        L_0x0070:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x008b
            java.lang.Object r2 = r3.next()
            r1 = r2
            java.lang.String r1 = (java.lang.String) r1
            X.0qQ.A0A(r1)
            r0 = 0
            boolean r0 = X.00p.A0k(r1, r5, r0)
            if (r0 == 0) goto L_0x0070
            r4.add(r2)
            goto L_0x0070
        L_0x008b:
            java.util.Iterator r2 = r4.iterator()
        L_0x008f:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0017
            java.lang.String r1 = X.AnonymousClass7TE.A18(r2)
            java.lang.Object r0 = r7.getValue()
            X.1LQ r0 = (X.1LQ) r0
            X.0qQ.A0A(r1)
            r0.remove(r1)
            goto L_0x008f
        L_0x00a6:
            java.lang.Object r5 = A00(r1, r6)
            X.K5t r5 = (X.C61399K5t) r5
            X.2da r4 = r5.A00
            if (r4 == 0) goto L_0x0017
            java.lang.String r1 = r6.A02
            r3 = 1
            r2 = 0
            if (r1 == 0) goto L_0x00d1
            boolean r0 = X.00l.A0W(r1)
            if (r0 != 0) goto L_0x00d1
            int r1 = r1.length()
            X.0eM r0 = r5.A03
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            int r0 = X.LST.A00(r0)
            if (r1 > r0) goto L_0x00d1
        L_0x00cc:
            r4.ARb(r2, r3)
            goto L_0x0017
        L_0x00d1:
            r3 = 0
            goto L_0x00cc
        L_0x00d3:
            java.lang.Object r5 = A00(r1, r6)
            X.LRW r5 = (X.LRW) r5
            java.lang.String r7 = r6.A02
            r2 = 0
            X.0qQ.A0B(r7, r2)
            X.1Ln r6 = X.LRW.A00(r5)
            boolean r0 = X.DbT.A1Y(r6)
            if (r0 == 0) goto L_0x0017
            java.lang.String r0 = "ai_home_see_all_button_shown"
            r6.A0l(r0)
            r0 = 2
            X.0eP[] r4 = new X.0eP[r0]
            java.lang.String r1 = r5.A01
            java.lang.String r0 = "entry_point"
            X.JTP.A1P(r0, r1, r4, r2)
            r0 = 1
            java.lang.String r3 = "section_name"
            goto L_0x0124
        L_0x00fc:
            java.lang.Object r5 = A00(r1, r6)
            X.LRW r5 = (X.LRW) r5
            java.lang.String r7 = r6.A02
            java.lang.String r3 = "screen"
            r2 = 0
            X.0qQ.A0B(r7, r2)
            X.1Ln r6 = X.LRW.A00(r5)
            boolean r0 = X.DbT.A1Y(r6)
            if (r0 == 0) goto L_0x0017
            java.lang.String r0 = "search_bar_impression"
            r6.A0l(r0)
            r0 = 2
            X.0eP[] r4 = new X.0eP[r0]
            java.lang.String r1 = r5.A01
            java.lang.String r0 = "entry_point"
            X.JTP.A1P(r0, r1, r4, r2)
            r0 = 1
        L_0x0124:
            X.JTP.A1P(r3, r7, r4, r0)
            java.util.LinkedHashMap r0 = X.0Yt.A06(r4)
            r6.A0x(r0)
            X.LRW.A01(r6, r5)
            goto L_0x0017
        L_0x0133:
            java.lang.Object r1 = A00(r1, r6)
            X.0sP r1 = (X.0sP) r1
            java.lang.String r0 = r6.A02
            r1.invoke(r0)
            goto L_0x0017
        L_0x0140:
            java.lang.Object r0 = A00(r1, r6)
            com.instagram.comments.mvvm.data.MediaCommentListRepository r0 = (com.instagram.comments.mvvm.data.MediaCommentListRepository) r0
            java.util.Map r2 = r0.A0E
            java.lang.String r1 = r6.A02
            java.lang.Object r0 = r2.get(r1)
            X.4Co r0 = (X.C262204Co) r0
            X.C51970G9q.A1S(r0)
            r2.remove(r1)
            goto L_0x0017
        L_0x0158:
            X.0eS.A00(r1)
            java.lang.String r3 = r6.A02
            java.lang.Object r0 = r6.A00
            X.GgO r0 = (X.C52971GgO) r0
            com.instagram.common.session.UserSession r2 = r0.A0E
            X.ISr r1 = new X.ISr
            r1.<init>(r0, r3)
            X.1ET r0 = X.1ES.A01()
            X.C48898Ely.A00(r2, r0, r1, r3)
            goto L_0x0017
        L_0x0171:
            java.lang.Object r0 = A00(r1, r6)
            X.KWl r0 = (X.C62033KWl) r0
            X.05G r4 = r0.A06
            goto L_0x0545
        L_0x017b:
            java.lang.Object r2 = A00(r1, r6)
            X.0sL r2 = (X.0sL) r2
            X.0sn r1 = X.0sn.A00
            java.lang.String r0 = r6.A02
            r2.invoke(r1, r0)
            goto L_0x0017
        L_0x018a:
            X.0eS.A00(r1)
            java.lang.String r4 = r6.A02
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeFile(r4)
            java.lang.Object r5 = r6.A00
            com.instagram.creation.ml.VisualFeatureStore r5 = (com.instagram.creation.ml.VisualFeatureStore) r5
            X.83i r6 = r5.A00
            if (r6 != 0) goto L_0x019f
            X.83i r6 = com.instagram.creation.ml.VisualFeatureStore.A01(r5)
        L_0x019f:
            if (r0 == 0) goto L_0x0017
            if (r6 == 0) goto L_0x0017
            android.graphics.Bitmap r2 = X.C392369uh.A00(r0)
            X.ADa r1 = X.C39879ADa.A02
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.RGB_565
            android.graphics.Bitmap r3 = r1.A00(r0, r2)
            android.media.ExifInterface r2 = new android.media.ExifInterface     // Catch:{ FileNotFoundException -> 0x01e1 }
            r2.<init>(r4)     // Catch:{ FileNotFoundException -> 0x01e1 }
            java.lang.String r1 = "Orientation"
            r0 = 1
            int r2 = r2.getAttributeInt(r1, r0)     // Catch:{ FileNotFoundException -> 0x01e1 }
            r0 = 3
            if (r2 == r0) goto L_0x01db
            r0 = 6
            if (r2 == r0) goto L_0x01d4
            r0 = 7
            r1 = 1132920832(0x43870000, float:270.0)
            if (r2 == r0) goto L_0x01cf
            r0 = 8
            if (r2 != r0) goto L_0x01e1
            android.graphics.Bitmap r3 = com.instagram.creation.ml.VisualFeatureStore.A00(r3, r1)     // Catch:{ FileNotFoundException -> 0x01e1 }
            goto L_0x01e1
        L_0x01cf:
            android.graphics.Bitmap r3 = com.instagram.creation.ml.VisualFeatureStore.A00(r3, r1)     // Catch:{ FileNotFoundException -> 0x01e1 }
            goto L_0x01e1
        L_0x01d4:
            r0 = 1119092736(0x42b40000, float:90.0)
            android.graphics.Bitmap r3 = com.instagram.creation.ml.VisualFeatureStore.A00(r3, r0)     // Catch:{ FileNotFoundException -> 0x01e1 }
            goto L_0x01e1
        L_0x01db:
            r0 = 1127481344(0x43340000, float:180.0)
            android.graphics.Bitmap r3 = com.instagram.creation.ml.VisualFeatureStore.A00(r3, r0)     // Catch:{ FileNotFoundException -> 0x01e1 }
        L_0x01e1:
            X.AyZ r0 = X.C41682AyZ.A00
            X.9ta r0 = r6.A02(r3, r0)
            com.instagram.creation.ml.VisualFeatureStore.A02(r0, r5, r4)
            goto L_0x0017
        L_0x01ec:
            X.0eS.A00(r1)
            X.FB5 r0 = X.FB5.A00
            java.lang.Object r3 = r6.A00
            X.KQO r3 = (X.KQO) r3
            com.instagram.common.session.UserSession r4 = r3.A01
            java.lang.String r8 = r6.A02
            java.lang.String r10 = r3.A03
            r0.A00(r4, r8)
            X.6gx r9 = X.C313746gw.A00(r4)
            java.lang.String r7 = r3.A03()
            int r6 = r3.A01()
            boolean r11 = r3.A07
            X.1Ln r5 = X.DbT.A0J(r9)
            boolean r0 = X.DbT.A1Y(r5)
            if (r0 == 0) goto L_0x025a
            java.util.HashMap r2 = X.AnonymousClass7TE.A1E()
            java.lang.String r1 = "False"
            r0 = 343(0x157, float:4.8E-43)
            java.lang.String r0 = X.C66579MXk.A00(r0)
            r2.put(r0, r1)
            java.lang.String r0 = "previously_joined"
            r2.put(r0, r1)
            if (r11 == 0) goto L_0x022e
            java.lang.String r1 = "True"
        L_0x022e:
            r0 = 837(0x345, float:1.173E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            r2.put(r0, r1)
            java.lang.String r1 = X.C313756gx.A03(r10)
            java.lang.String r0 = "entrypoint"
            r2.put(r0, r1)
            X.DbW.A17(r5, r9)
            r0 = 404(0x194, float:5.66E-43)
            java.lang.String r0 = X.C66579MXk.A00(r0)
            X.Dba.A1D(r5, r0)
            java.lang.String r0 = "join_broadcast_chat"
            r5.A0p(r0)
            java.lang.String r0 = "thread_view"
            java.lang.Long r0 = X.DbZ.A0b(r5, r0, r8, r7, r6)
            X.JTQ.A1C(r5, r0, r2)
        L_0x025a:
            X.0Tu r2 = X.0Tu.A05
            r0 = 36319407396101469(0x81084f004c1d5d, double:3.0318777115850356E-306)
            boolean r0 = X.182.A06(r2, r4, r0)
            if (r0 == 0) goto L_0x0275
            X.2cc r2 = X.C71342cb.A00(r4)
            X.AXh r1 = new X.AXh
            r1.<init>(r3)
            java.lang.String r0 = "intentional_double_logging"
            r2.A0E(r0, r1)
        L_0x0275:
            X.0eM r0 = r3.A06
            java.lang.Object r3 = r0.getValue()
            X.OTV r3 = (X.OTV) r3
            X.02m r2 = r3.A00
            r1 = 31786177(0x1e504c1, float:8.4128136E-38)
            java.lang.String r0 = "Join_Channel_Success"
            r2.markerPoint(r1, r0)
            r0 = 2
            X.OTV.A00(r3, r0)
            goto L_0x0017
        L_0x028d:
            java.lang.Object r0 = A00(r1, r6)
            X.NVl r0 = (X.C68751NVl) r0
            X.OMD r1 = r0.A03
            if (r1 == 0) goto L_0x0017
            java.lang.String r0 = r6.A02
            r1.A01(r0)
            goto L_0x0017
        L_0x029e:
            java.lang.Object r4 = A00(r1, r6)
            X.Mu6 r4 = (X.C67752Mu6) r4
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            r4.A00 = r0
            java.util.LinkedHashSet r3 = X.DbS.A0y()
            X.05G r0 = r4.A06
            java.lang.Iterable r0 = X.JTO.A0x(r0)
            java.util.Iterator r2 = r0.iterator()
        L_0x02b6:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x02d0
            java.lang.Object r0 = r2.next()
            X.6nL r0 = (X.C317486nL) r0
            r3.add(r0)
            java.lang.String r1 = r0.A02
            r0 = 0
            X.6nL[] r0 = X.C337097fg.A02(r1, r0)
            X.018.A18(r3, r0)
            goto L_0x02b6
        L_0x02d0:
            X.KWW r4 = r4.A03
            java.lang.String r8 = r6.A02
            monitor-enter(r4)
            r7 = 0
            X.0qQ.A0B(r8, r7)     // Catch:{ all -> 0x0b33 }
            X.4Co r1 = r4.A00     // Catch:{ all -> 0x0b33 }
            if (r1 == 0) goto L_0x02e7
            boolean r0 = r1.isActive()     // Catch:{ all -> 0x0b33 }
            if (r0 == 0) goto L_0x02e7
            r0 = 0
            r1.AG7(r0)     // Catch:{ all -> 0x0b33 }
        L_0x02e7:
            r5 = 0
            r4.A00 = r5     // Catch:{ all -> 0x0b33 }
            java.util.List r0 = X.00k.A0a(r3)     // Catch:{ all -> 0x0b33 }
            X.HzX r6 = X.C56501HzX.A01     // Catch:{ all -> 0x0b33 }
            java.util.ArrayList r2 = X.AnonymousClass7TG.A0r(r0)     // Catch:{ all -> 0x0b33 }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x0b33 }
        L_0x02f8:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0b33 }
            if (r0 == 0) goto L_0x030a
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x0b33 }
            X.6nL r0 = (X.C317486nL) r0     // Catch:{ all -> 0x0b33 }
            java.lang.String r0 = r0.A02     // Catch:{ all -> 0x0b33 }
            r2.add(r0)     // Catch:{ all -> 0x0b33 }
            goto L_0x02f8
        L_0x030a:
            int r0 = r8.length()     // Catch:{ all -> 0x0b33 }
            if (r0 == 0) goto L_0x0315
            java.util.concurrent.ConcurrentMap r0 = r6.A00     // Catch:{ all -> 0x0b33 }
            r0.put(r8, r2)     // Catch:{ all -> 0x0b33 }
        L_0x0315:
            com.instagram.common.session.UserSession r2 = r4.A01     // Catch:{ all -> 0x0b33 }
            java.util.ArrayList r6 = X.AnonymousClass7TE.A1C()     // Catch:{ all -> 0x0b33 }
            java.util.Iterator r1 = r3.iterator()     // Catch:{ all -> 0x0b33 }
        L_0x031f:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0b33 }
            if (r0 == 0) goto L_0x0331
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x0b33 }
            X.6nL r0 = (X.C317486nL) r0     // Catch:{ all -> 0x0b33 }
            java.lang.String r0 = r0.A02     // Catch:{ all -> 0x0b33 }
            r6.add(r0)     // Catch:{ all -> 0x0b33 }
            goto L_0x031f
        L_0x0331:
            java.lang.String r3 = "emojis"
            X.1NY r2 = X.AnonymousClass7TG.A0a(r2)     // Catch:{ all -> 0x0b33 }
            java.lang.Object[] r1 = new java.lang.Object[]{r8}     // Catch:{ all -> 0x0b33 }
            java.lang.String r0 = "direct_v2/threads/%s/update_hidden_emojis/"
            r2.A0K(r0, r1)     // Catch:{ all -> 0x0b33 }
            java.lang.String r0 = X.C51970G9q.A0k(r6)     // Catch:{ all -> 0x0b33 }
            X.1OC r3 = X.JTU.A0H(r2, r3, r0, r7)     // Catch:{ all -> 0x0b33 }
            X.4Cq r2 = r4.A01     // Catch:{ all -> 0x0b33 }
            r1 = 17
            X.MGe r0 = new X.MGe     // Catch:{ all -> 0x0b33 }
            r0.<init>((java.lang.Object) r4, (java.lang.Object) r3, (X.AnonymousClass4D7) r5, (int) r1)     // Catch:{ all -> 0x0b33 }
            X.1Er r0 = X.C51966G9m.A1L(r0, r2)     // Catch:{ all -> 0x0b33 }
            r4.A00 = r0     // Catch:{ all -> 0x0b33 }
            monitor-exit(r4)
            goto L_0x0017
        L_0x035a:
            java.lang.Object r4 = A00(r1, r6)
            X.KX6 r4 = (X.KX6) r4
            java.lang.String r3 = r6.A02
            r10 = 1
            java.lang.String r1 = ""
            java.lang.String r8 = "coefficient_direct_recipients_ranking_variant_2"
            android.content.Context r6 = r4.A01
            com.instagram.common.session.UserSession r7 = r4.A02
            r0 = 11
            X.MBH r9 = new X.MBH
            r9.<init>(r4, r0)
            X.Dg5 r5 = new X.Dg5
            r11 = r10
            r12 = r10
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            if (r3 == 0) goto L_0x037c
            r1 = r3
        L_0x037c:
            r5.A04(r1)
            r4.A00 = r5
            X.7fy r2 = r4.A03
            r2.EhX(r3)
            r1 = 2
            X.Lwo r0 = new X.Lwo
            r0.<init>(r4, r1)
            r2.EcJ(r0)
            goto L_0x0017
        L_0x0391:
            java.lang.Object r5 = A00(r1, r6)
            X.Ne9 r5 = (X.C69070Ne9) r5
            X.OLO r0 = r5.A02
            r0.A00()
            java.lang.String r2 = r6.A02
            r4 = r2
            if (r2 != 0) goto L_0x03a3
            java.lang.String r2 = ""
        L_0x03a3:
            X.Mjr r1 = r0.A03
            X.PCk r0 = new X.PCk
            r0.<init>(r2)
            r1.A01(r0)
            r0 = 0
            X.1a8 r3 = new X.1a8
            r3.<init>(r0)
            X.1aU r1 = r1.A01
            X.OwC r0 = X.C72099OwC.A00
            X.1aU r1 = r1.A0L(r0)
            X.4fh r0 = X.C318146oT.A01
            X.1aU r2 = r1.A0P(r0)
            r1 = 3
            X.PUA r0 = new X.PUA
            r0.<init>((java.lang.String) r4, (java.lang.Object) r5, (int) r1)
            r3.A02(r2, r0)
            goto L_0x0017
        L_0x03cc:
            X.0eS.A00(r1)
            java.lang.String r3 = r6.A02
            if (r3 == 0) goto L_0x0017
            int r0 = r3.length()
            if (r0 == 0) goto L_0x0017
            java.lang.Object r2 = r6.A00
            X.NeA r2 = (X.C69071NeA) r2
            X.7eL r1 = r2.A06
            r1.EhX(r3)
            X.7eL r0 = r2.A05
            if (r0 == 0) goto L_0x03e9
            r0.EhX(r3)
        L_0x03e9:
            r1.EcJ(r2)
            if (r0 == 0) goto L_0x0017
            r0.EcJ(r2)
            goto L_0x0017
        L_0x03f3:
            java.lang.Object r2 = A00(r1, r6)
            X.KX8 r2 = (X.KX8) r2
            X.DkJ r1 = r2.A00
            java.lang.String r0 = r6.A02
            if (r0 != 0) goto L_0x0401
            java.lang.String r0 = ""
        L_0x0401:
            r1.A0F(r0)
            X.6oS r5 = X.C318116oQ.A00(r1)
            r1 = 0
            r0 = 24
            X.MGt r3 = new X.MGt
            r3.<init>((java.lang.Object) r2, (X.AnonymousClass4D7) r1, (int) r0)
            goto L_0x06c2
        L_0x0412:
            X.0eS.A00(r1)
            java.lang.String r0 = r6.A02
            java.util.List r3 = X.I3s.A00(r0)
            java.lang.Object r6 = r6.A00
            X.JiT r6 = (X.C60272JiT) r6
            java.util.ArrayList r5 = X.C60272JiT.A00(r6)
            X.LEd r2 = r6.A05
            int r1 = r3.size()
            int r0 = r5.size()
            r2.A01(r1, r0)
            boolean r0 = X.AnonymousClass7TE.A1b(r3)
            if (r0 == 0) goto L_0x0017
            com.instagram.direct.wellbeing.safetyecosystem.mutedwords.dictionary.data.DictionaryRepository r0 = r6.A04
            java.util.ArrayList r0 = r0.A02(r3)
            r3 = 0
            java.util.ArrayList r2 = X.AnonymousClass7TG.A0r(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x0445:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x044f
            X.C61209Jz2.A00(r2, r1)
            goto L_0x0445
        L_0x044f:
            r5.addAll(r3, r2)
            goto L_0x04ab
        L_0x0453:
            X.0eS.A00(r1)
            java.lang.String r0 = r6.A02
            java.util.List r10 = X.I3s.A00(r0)
            java.lang.Object r6 = r6.A00
            X.JiT r6 = (X.C60272JiT) r6
            java.util.ArrayList r5 = X.C60272JiT.A00(r6)
            int r0 = r6.A00
            java.lang.Object r3 = r5.get(r0)
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.direct.wellbeing.safetyecosystem.mutedwords.dictionary.ui.list.EditableMutedWordItemModel"
            X.0qQ.A0C(r3, r0)
            X.Jz1 r3 = (X.C61208Jz1) r3
            X.LEd r4 = r6.A05
            X.0wc r1 = r4.A00
            java.lang.String r0 = "mwb_muted_words_settings_event"
            X.0Aj r2 = X.AnonymousClass7TE.A0e(r1, r0)
            r1 = 9
            java.lang.String r0 = "action"
            X.AnonymousClass7TE.A1W(r2, r0, r1)
            r2.Cgf()
            boolean r0 = r10.isEmpty()
            r11 = 1
            if (r0 == 0) goto L_0x04b2
            int r0 = r6.A00
            r5.remove(r0)
            com.instagram.direct.wellbeing.safetyecosystem.mutedwords.dictionary.data.DictionaryRepository r1 = r6.A04
            java.lang.String r0 = r3.A00
            r1.A03(r0)
            int r0 = r5.size()
            r4.A00(r0)
        L_0x049f:
            r0 = -1
            r6.A00 = r0
            X.2Fj r1 = r6.A01
            java.lang.Boolean r0 = X.AnonymousClass7TE.A0u()
            r1.A0A(r0)
        L_0x04ab:
            X.2Fj r0 = r6.A03
            r0.A0A(r5)
            goto L_0x0017
        L_0x04b2:
            java.lang.Object r12 = X.00k.A0I(r10)
            java.lang.String r12 = (java.lang.String) r12
            int r1 = r6.A00
            java.lang.String r2 = r3.A00
            X.Jz2 r0 = new X.Jz2
            r0.<init>(r2, r12)
            r5.set(r1, r0)
            com.instagram.direct.wellbeing.safetyecosystem.mutedwords.dictionary.data.DictionaryRepository r9 = r6.A04
            boolean r7 = X.DbW.A1S(r11, r2, r12)
            java.util.List r8 = r9.A00
            java.util.Iterator r1 = r8.iterator()
            r3 = 0
        L_0x04d1:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x04e8
            java.lang.Object r0 = r1.next()
            X.N49 r0 = (X.N49) r0
            java.lang.String r0 = r0.A00
            boolean r0 = X.0qQ.A0K(r0, r2)
            if (r0 != 0) goto L_0x04e9
            int r3 = r3 + 1
            goto L_0x04d1
        L_0x04e8:
            r3 = -1
        L_0x04e9:
            java.lang.Object r0 = r8.get(r3)
            X.N49 r0 = (X.N49) r0
            java.lang.String r2 = r0.A00
            X.0qQ.A0B(r2, r7)
            r1 = 44
            X.N49 r0 = new X.N49
            r0.<init>(r2, r12, r1)
            r8.set(r3, r0)
            int r0 = r10.size()
            if (r0 <= r11) goto L_0x049f
            java.util.ArrayList r3 = r9.A02(r10)
            java.util.ArrayList r2 = X.AnonymousClass7TG.A0r(r3)
            java.util.Iterator r1 = r3.iterator()
        L_0x0510:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x051a
            X.C61209Jz2.A00(r2, r1)
            goto L_0x0510
        L_0x051a:
            r5.addAll(r7, r2)
            int r1 = r3.size()
            int r0 = r5.size()
            r4.A01(r1, r0)
            goto L_0x049f
        L_0x052a:
            java.lang.Object r0 = A00(r1, r6)
            X.JiU r0 = (X.C60273JiU) r0
            X.05G r3 = r0.A05
            com.instagram.api.schemas.UserMonetizationProductType r2 = com.instagram.api.schemas.UserMonetizationProductType.FAN_CLUB_CREATOR
            java.lang.String r1 = r6.A02
            X.EKv r0 = new X.EKv
            r0.<init>(r2, r1)
            goto L_0x0640
        L_0x053d:
            java.lang.Object r0 = A00(r1, r6)
            X.KWm r0 = (X.C62034KWm) r0
            X.05G r4 = r0.A06
        L_0x0545:
            java.lang.String r3 = r6.A02
        L_0x0547:
            java.lang.Object r2 = r4.getValue()
            r1 = r2
            java.util.Map r1 = (java.util.Map) r1
            java.lang.Boolean r0 = X.AnonymousClass7TE.A0u()
            boolean r0 = X.JTU.A1Z(r3, r0, r2, r1, r4)
            if (r0 == 0) goto L_0x0547
            goto L_0x0017
        L_0x055a:
            X.0eS.A00(r1)
            java.lang.String r1 = r6.A02
            if (r1 == 0) goto L_0x0582
            int r0 = r1.length()
            if (r0 == 0) goto L_0x0582
            java.lang.Object r0 = r6.A00
            X.Jgy r0 = (X.C60179Jgy) r0
            X.LlB r2 = r0.A03
            java.lang.String r0 = r2.A00
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0017
            java.lang.String r1 = X.DbV.A12(r1)
            r2.A00 = r1
            X.MsV r0 = r2.A02
            r0.filter(r1)
            goto L_0x0017
        L_0x0582:
            java.lang.Object r7 = r6.A00
            X.Jgy r7 = (X.C60179Jgy) r7
            X.05G r6 = r7.A04
        L_0x0588:
            java.lang.Object r5 = r6.getValue()
            r0 = r5
            X.Jw8 r0 = (X.C61070Jw8) r0
            java.util.List r4 = r7.A00
            java.lang.Integer r3 = X.AnonymousClass05K.A0C
            java.lang.Object r2 = r0.A01
            java.util.List r2 = (java.util.List) r2
            java.lang.String r1 = r0.A03
            X.DbY.A1S(r2, r1)
            X.Jw8 r0 = new X.Jw8
            r0.<init>((java.lang.Integer) r3, (java.lang.String) r1, (java.util.List) r2, (java.util.List) r4)
            boolean r0 = r6.AIY(r5, r0)
            if (r0 == 0) goto L_0x0588
            goto L_0x0017
        L_0x05a9:
            java.lang.Object r0 = A00(r1, r6)
            X.JY3 r0 = (X.JY3) r0
            com.instagram.common.session.UserSession r1 = r0.A01
            java.lang.String r0 = r6.A02
            com.instagram.gallery.suggestions.database.SuggestionsDBHelper.A00(r1, r0)
            goto L_0x0017
        L_0x05b8:
            java.lang.Object r7 = A00(r1, r6)
            X.5GM r7 = (X.AnonymousClass5GM) r7
            java.lang.String r4 = r6.A02
            X.0eK r3 = r7.A03
            X.5GY r0 = X.JTR.A0q(r3)
            X.5Gg r5 = r0.A00(r4)
            java.util.ArrayList r1 = X.AnonymousClass5GM.A00(r7)
            r0 = 0
            if (r5 == 0) goto L_0x05d7
            int r0 = r5.A02
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x05d7:
            boolean r0 = X.00k.A0u(r1, r0)
            if (r0 == 0) goto L_0x0608
            if (r5 == 0) goto L_0x0608
            int r2 = r5.A02
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            r0 = 1520(0x5f0, float:2.13E-42)
            if (r1 == 0) goto L_0x0608
            if (r2 == r0) goto L_0x05ef
            r0 = 1519(0x5ef, float:2.129E-42)
            if (r2 != r0) goto L_0x0608
        L_0x05ef:
            X.5Gi r1 = r5.A00()
            if (r1 == 0) goto L_0x0608
            java.lang.String r0 = "ids"
            java.lang.String r2 = r1.A09(r0)
            if (r2 == 0) goto L_0x0608
            com.instagram.common.session.UserSession r1 = r7.A01
            X.JaB r0 = com.instagram.direct.securityalert.data.SecurityAlertRepository.A04
            com.instagram.direct.securityalert.data.SecurityAlertRepository r0 = r0.A00(r1)
            r0.A01(r2)
        L_0x0608:
            X.5GY r0 = X.JTR.A0q(r3)
            X.3oI r3 = r0.A00
            r3.assertNotSuspendingTransaction()
            X.1Vg r2 = r0.A02
            X.1WV r1 = r2.acquire()
            r0 = 1
            r1.ADh(r0, r4)
            r3.beginTransaction()     // Catch:{ all -> 0x0b3b }
            r1.ATQ()     // Catch:{ all -> 0x0b36 }
            r3.setTransactionSuccessful()     // Catch:{ all -> 0x0b36 }
            r3.endTransaction()     // Catch:{ all -> 0x0b3b }
            r2.release(r1)
            goto L_0x0017
        L_0x062c:
            java.lang.Object r0 = A00(r1, r6)
            X.E7a r0 = (X.C47537E7a) r0
            X.05G r3 = r0.A08
            java.lang.Object r1 = r3.getValue()
            java.util.Set r1 = (java.util.Set) r1
            java.lang.String r0 = r6.A02
            java.util.LinkedHashSet r0 = X.094.A01(r0, r1)
        L_0x0640:
            r3.Epw(r0)
            goto L_0x0017
        L_0x0645:
            java.lang.Object r0 = A00(r1, r6)
            com.instagram.profilecard.domain.ProfileCardViewModel r0 = (com.instagram.profilecard.domain.ProfileCardViewModel) r0
            com.instagram.profilecard.data.ProfileCardRepository r1 = r0.A0G
            X.LvL r3 = r0.A09
            java.lang.String r0 = r6.A02
            X.AnonymousClass7TG.A1N(r3, r0)
            android.graphics.Bitmap r2 = android.graphics.BitmapFactory.decodeFile(r0)
            X.LOx r1 = r1.A01
            X.1ua r0 = r1.A06
            r0.A0J(r3)
            r1.A01(r2)
            goto L_0x0017
        L_0x0664:
            java.lang.Object r0 = A00(r1, r6)
            X.JgQ r0 = (X.C60145JgQ) r0
            com.instagram.wellbeing.limitsplus.data.LimitsPlusRepository r2 = r0.A02
            java.lang.String r1 = r6.A02
            r0 = 0
            X.0qQ.A0B(r1, r0)
            r2.A00 = r1
            goto L_0x0017
        L_0x0676:
            java.lang.Object r4 = A00(r1, r6)
            X.Jgs r4 = (X.C60173Jgs) r4
            java.lang.String r5 = r6.A02
            r0 = 0
            X.0qQ.A0B(r5, r0)
            X.05G r1 = r4.A03
        L_0x0684:
            boolean r0 = X.JTP.A1b(r5, r1)
            if (r0 == 0) goto L_0x0684
            int r3 = r5.length()
            r0 = 1
            int r3 = r3 - r0
            r2 = 0
            r1 = 0
        L_0x0692:
            if (r2 > r3) goto L_0x06aa
            r0 = r3
            if (r1 != 0) goto L_0x0698
            r0 = r2
        L_0x0698:
            boolean r0 = X.Dbc.A13(r5, r0)
            if (r1 != 0) goto L_0x06a5
            if (r0 != 0) goto L_0x06a2
            r1 = 1
            goto L_0x0692
        L_0x06a2:
            int r2 = r2 + 1
            goto L_0x0692
        L_0x06a5:
            if (r0 == 0) goto L_0x06aa
            int r3 = r3 + -1
            goto L_0x0692
        L_0x06aa:
            java.lang.String r0 = X.Dba.A0c(r5, r3, r2)
            int r0 = r0.length()
            if (r0 != 0) goto L_0x06c7
            java.lang.String r2 = ""
            X.6oS r5 = X.C318116oQ.A00(r4)
            r1 = 0
            r0 = 46
            X.MFV r3 = new X.MFV
            r3.<init>(r4, r2, r1, r0)
        L_0x06c2:
            X.AnonymousClass7TE.A1Z(r3, r5)
            goto L_0x0017
        L_0x06c7:
            r3 = 0
            X.4Co r0 = r4.A00
            if (r0 == 0) goto L_0x06cf
            r0.AG7(r3)
        L_0x06cf:
            X.6oS r2 = X.C318116oQ.A00(r4)
            r1 = 19
            X.ImS r0 = new X.ImS
            r0.<init>((java.lang.Object) r4, (X.AnonymousClass4D7) r3, (int) r1)
            X.1Er r0 = X.C51966G9m.A1L(r0, r2)
            r4.A00 = r0
            goto L_0x0017
        L_0x06e2:
            X.0eS.A00(r1)
            java.lang.String r0 = r6.A02
            if (r0 == 0) goto L_0x0b40
            java.lang.Object r3 = r6.A00
            X.0lg r3 = (X.0lg) r3
            X.1NK r2 = X.1NK.A00()
            com.instagram.common.typedurl.SimpleImageUrl r1 = X.DbS.A0V(r0)
            java.lang.String r0 = "wall_music_preview"
            X.3LX r0 = r2.A0K(r3, r1, r0)
            if (r0 == 0) goto L_0x0b40
            android.graphics.Bitmap r1 = r0.A01
            if (r1 == 0) goto L_0x0b40
            X.TqF r0 = new X.TqF
            r0.<init>(r1)
            X.TqI r0 = r0.A00()
            r4 = -1
            int[] r3 = X.LTL.A08(r0, r4)
            java.util.ArrayList r12 = X.AnonymousClass7TE.A1C()
            r2 = 2
            r1 = 0
        L_0x0715:
            if (r1 >= r2) goto L_0x0019
            r0 = r3[r1]
            if (r0 == r4) goto L_0x071e
            X.JTT.A1S(r12, r0)
        L_0x071e:
            int r1 = r1 + 1
            goto L_0x0715
        L_0x0721:
            java.lang.Object r3 = A00(r1, r6)
            X.HIr r3 = (X.C54556HIr) r3
            java.lang.String r1 = r6.A02
            java.lang.Integer r2 = r3.A0F
            r0 = 1
            X.HtX r0 = X.C56365HxI.A01(r2, r1, r0)
            r3.A0G(r0)
            r1 = 30
            X.Ivm r0 = new X.Ivm
            r0.<init>(r3, r1)
            X.I4X r2 = X.C56365HxI.A00(r2, r0)
            r0 = 46
            X.J6g r1 = new X.J6g
            r1.<init>(r3, r0)
            r0 = 4375(0x1117, float:6.13E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r3.A0E(r2, r0, r1)
            goto L_0x0017
        L_0x0750:
            java.lang.Object r0 = A00(r1, r6)
            X.Ggf r0 = (X.C52988Ggf) r0
            X.KWh r2 = r0.A00
            goto L_0x0011
        L_0x075a:
            java.lang.Object r1 = A00(r1, r6)
            java.io.File r1 = (java.io.File) r1
            boolean r0 = r1.exists()
            if (r0 == 0) goto L_0x0772
            java.nio.charset.Charset r0 = X.AnonymousClass15Q.A05
            java.lang.String r0 = X.C272134kB.A00(r1, r0)
            org.json.JSONObject r12 = new org.json.JSONObject
            r12.<init>(r0)
            return r12
        L_0x0772:
            java.lang.String r3 = com.facebook.avatar.expresso.odr.asset.ODRAssetManager.A01
            java.lang.String r2 = r6.A02
            java.lang.Object[] r1 = new java.lang.Object[]{r2}
            java.lang.String r0 = "Scene file not found for %s"
            X.0KC.A0O(r3, r0, r1)
            java.lang.String r0 = "Scene file not found for "
            java.lang.String r1 = X.002.A0R(r0, r2)
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException
            r0.<init>(r1)
            throw r0
        L_0x078b:
            java.lang.Object r7 = A00(r1, r6)
            X.0lg r7 = (X.0lg) r7
            java.util.ArrayList r2 = X.AnonymousClass7TE.A1C()
            X.8s5 r1 = X.C368108s5.A03
            X.Kfx r9 = X.C62447Kfx.DEVICE_ID
            libraries.access.src.main.base.common.FXAccessLibraryDeviceRequestItem r0 = new libraries.access.src.main.base.common.FXAccessLibraryDeviceRequestItem
            r0.<init>(r1, r9)
            r2.add(r0)
            X.Kfx r8 = X.C62447Kfx.MACHINE_ID
            libraries.access.src.main.base.common.FXAccessLibraryDeviceRequestItem r0 = new libraries.access.src.main.base.common.FXAccessLibraryDeviceRequestItem
            r0.<init>(r1, r8)
            r2.add(r0)
            libraries.access.src.main.base.common.FXAccessLibraryDeviceRequest r0 = new libraries.access.src.main.base.common.FXAccessLibraryDeviceRequest
            r0.<init>((java.util.List) r2)
            java.lang.String r6 = r6.A02
            java.lang.String r5 = "DeviceLibraryDebugTool"
            java.util.ArrayList r4 = X.A0R.A00(r7, r6, r5, r0)
            java.util.ArrayList r2 = X.AnonymousClass7TE.A1C()
            X.8s5 r1 = X.C368108s5.A08
            libraries.access.src.main.base.common.FXAccessLibraryDeviceRequestItem r0 = new libraries.access.src.main.base.common.FXAccessLibraryDeviceRequestItem
            r0.<init>(r1, r9)
            r2.add(r0)
            libraries.access.src.main.base.common.FXAccessLibraryDeviceRequestItem r0 = new libraries.access.src.main.base.common.FXAccessLibraryDeviceRequestItem
            r0.<init>(r1, r8)
            r2.add(r0)
            libraries.access.src.main.base.common.FXAccessLibraryDeviceRequest r0 = new libraries.access.src.main.base.common.FXAccessLibraryDeviceRequest
            r0.<init>((java.util.List) r2)
            java.util.ArrayList r3 = X.A0R.A00(r7, r6, r5, r0)
            java.util.ArrayList r2 = X.AnonymousClass7TE.A1C()
            X.8s5 r1 = X.C368108s5.A06
            libraries.access.src.main.base.common.FXAccessLibraryDeviceRequestItem r0 = new libraries.access.src.main.base.common.FXAccessLibraryDeviceRequestItem
            r0.<init>(r1, r9)
            r2.add(r0)
            libraries.access.src.main.base.common.FXAccessLibraryDeviceRequestItem r0 = new libraries.access.src.main.base.common.FXAccessLibraryDeviceRequestItem
            r0.<init>(r1, r8)
            r2.add(r0)
            libraries.access.src.main.base.common.FXAccessLibraryDeviceRequest r0 = new libraries.access.src.main.base.common.FXAccessLibraryDeviceRequest
            r0.<init>((java.util.List) r2)
            java.util.ArrayList r1 = X.A0R.A00(r7, r6, r5, r0)
            java.util.ArrayList r12 = X.AnonymousClass7TE.A1C()
            java.lang.String r0 = "Facebook"
            java.util.ArrayList r0 = X.C49741F4g.A01(r0, r4)
            r12.addAll(r0)
            java.lang.String r0 = "Messenger"
            java.util.ArrayList r0 = X.C49741F4g.A01(r0, r3)
            r12.addAll(r0)
            java.lang.String r0 = "Instagram"
            java.util.ArrayList r0 = X.C49741F4g.A01(r0, r1)
            r12.addAll(r0)
            return r12
        L_0x0816:
            X.0eS.A00(r1)
            java.lang.String r2 = r6.A02
            java.lang.Object r0 = r6.A00
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            android.content.res.Resources r1 = X.DbV.A05(r0)
            r0 = 2131165219(0x7f070023, float:1.7944649E38)
            int r1 = r1.getDimensionPixelSize(r0)
            r0 = 2147483647(0x7fffffff, float:NaN)
            android.graphics.Bitmap r12 = X.1MF.A0E(r2, r1, r0)
            return r12
        L_0x0832:
            r12 = 0
            java.lang.String r9 = "logger"
            X.0eS.A00(r1)
            java.lang.Object r7 = r6.A00     // Catch:{ RemoteException -> 0x08ed, SecurityException -> 0x08e0, 6GV -> 0x08d3 }
            X.L8q r7 = (X.C63835L8q) r7     // Catch:{ RemoteException -> 0x08ed, SecurityException -> 0x08e0, 6GV -> 0x08d3 }
            X.JVE r5 = r7.A02     // Catch:{ RemoteException -> 0x08ed, SecurityException -> 0x08e0, 6GV -> 0x08d3 }
            if (r5 != 0) goto L_0x0848
            X.0qQ.A0F(r9)     // Catch:{ RemoteException -> 0x08ed, SecurityException -> 0x08e0, 6GV -> 0x08d3 }
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0     // Catch:{ RemoteException -> 0x08ed, SecurityException -> 0x08e0, 6GV -> 0x08d3 }
        L_0x0848:
            java.lang.String r1 = "client_auth_request_generate_auth_response"
            java.lang.String r0 = "authenticate query called to feo2 client"
            java.lang.String r4 = "optimistic_authentication_flow"
            r5.A01(r1, r0, r4)     // Catch:{ RemoteException -> 0x08ed, SecurityException -> 0x08e0, 6GV -> 0x08d3 }
            X.KzR r8 = new X.KzR     // Catch:{ RemoteException -> 0x08ed, SecurityException -> 0x08e0, 6GV -> 0x08d3 }
            r8.<init>()     // Catch:{ RemoteException -> 0x08ed, SecurityException -> 0x08e0, 6GV -> 0x08d3 }
            X.S6k r3 = r7.A04     // Catch:{ RemoteException -> 0x08ed, SecurityException -> 0x08e0, 6GV -> 0x08d3 }
            java.lang.String r0 = r6.A02     // Catch:{ RemoteException -> 0x08ed, SecurityException -> 0x08e0, 6GV -> 0x08d3 }
            byte[] r2 = r3.A03(r0)     // Catch:{ RemoteException -> 0x08ed, SecurityException -> 0x08e0, 6GV -> 0x08d3 }
            android.os.Bundle r1 = r8.A00     // Catch:{ RemoteException -> 0x08ed, SecurityException -> 0x08e0, 6GV -> 0x08d3 }
            java.lang.String r0 = "challenge"
            r1.putByteArray(r0, r2)     // Catch:{ RemoteException -> 0x08ed, SecurityException -> 0x08e0, 6GV -> 0x08d3 }
            r2 = 0
            android.os.Bundle r1 = r8.A00     // Catch:{ RemoteException -> 0x08ed, SecurityException -> 0x08e0, 6GV -> 0x08d3 }
            java.lang.String r0 = "useDebugKey"
            r1.putBoolean(r0, r2)     // Catch:{ RemoteException -> 0x08ed, SecurityException -> 0x08e0, 6GV -> 0x08d3 }
            X.LQW r7 = r7.A01     // Catch:{ RemoteException -> 0x08ed, SecurityException -> 0x08e0, 6GV -> 0x08d3 }
            if (r7 != 0) goto L_0x087b
            java.lang.String r0 = "feO2Client"
            X.0qQ.A0F(r0)     // Catch:{ RemoteException -> 0x08ed, SecurityException -> 0x08e0, 6GV -> 0x08d3 }
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0     // Catch:{ RemoteException -> 0x08ed, SecurityException -> 0x08e0, 6GV -> 0x08d3 }
        L_0x087b:
            android.os.Bundle r2 = r8.A00     // Catch:{ RemoteException -> 0x08ed, SecurityException -> 0x08e0, 6GV -> 0x08d3 }
            java.lang.Class r1 = X.LSS.A00(r2)     // Catch:{ RemoteException -> 0x08ed, SecurityException -> 0x08e0, 6GV -> 0x08d3 }
            X.LSS.A02(r2, r1, r0)     // Catch:{ RemoteException -> 0x08ed, SecurityException -> 0x08e0, 6GV -> 0x08d3 }
            java.lang.String r0 = "allowMultiSession"
            X.LSS.A02(r2, r1, r0)     // Catch:{ RemoteException -> 0x08ed, SecurityException -> 0x08e0, 6GV -> 0x08d3 }
            android.os.Bundle r0 = new android.os.Bundle     // Catch:{ RemoteException -> 0x08ed, SecurityException -> 0x08e0, 6GV -> 0x08d3 }
            r0.<init>()     // Catch:{ RemoteException -> 0x08ed, SecurityException -> 0x08e0, 6GV -> 0x08d3 }
            android.os.Bundle r0 = X.LQW.A00(r2, r7)     // Catch:{ Exception -> 0x08d1 }
            if (r0 != 0) goto L_0x0895
            goto L_0x08a2
        L_0x0895:
            android.os.Bundle r2 = r0.deepCopy()     // Catch:{ Exception -> 0x08d1 }
            if (r2 == 0) goto L_0x08ca
            java.lang.String r0 = "response"
            X.LSS.A04(r0, r2)     // Catch:{ Exception -> 0x08d1 }
            r0 = 1
            goto L_0x08a4
        L_0x08a2:
            r2 = 0
            r0 = 0
        L_0x08a4:
            if (r0 != 0) goto L_0x08ae
            java.lang.String r1 = "client_auth_response_not_found"
            java.lang.String r0 = "empty_auto_conf_authenticate_result"
            r5.A01(r1, r0, r4)     // Catch:{ RemoteException -> 0x08ed, SecurityException -> 0x08e0, 6GV -> 0x08d3 }
            return r12
        L_0x08ae:
            java.lang.String r0 = "client_auth_response_found"
            r5.A01(r0, r12, r4)     // Catch:{ RemoteException -> 0x08ed, SecurityException -> 0x08e0, 6GV -> 0x08d3 }
            java.lang.String r1 = "response"
            boolean r0 = r2.containsKey(r1)     // Catch:{ RemoteException -> 0x08ed, SecurityException -> 0x08e0, 6GV -> 0x08d3 }
            if (r0 == 0) goto L_0x08c4
            byte[] r0 = r2.getByteArray(r1)     // Catch:{ RemoteException -> 0x08ed, SecurityException -> 0x08e0, 6GV -> 0x08d3 }
            java.lang.String r12 = r3.A02(r0)     // Catch:{ RemoteException -> 0x08ed, SecurityException -> 0x08e0, 6GV -> 0x08d3 }
            return r12
        L_0x08c4:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ RemoteException -> 0x08ed, SecurityException -> 0x08e0, 6GV -> 0x08d3 }
            r0.<init>()     // Catch:{ RemoteException -> 0x08ed, SecurityException -> 0x08e0, 6GV -> 0x08d3 }
            throw r0     // Catch:{ RemoteException -> 0x08ed, SecurityException -> 0x08e0, 6GV -> 0x08d3 }
        L_0x08ca:
            java.lang.String r0 = "Bundle is null"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)     // Catch:{ Exception -> 0x08d1 }
            throw r0     // Catch:{ Exception -> 0x08d1 }
        L_0x08d1:
            r0 = move-exception
            throw r0     // Catch:{ RemoteException -> 0x08ed, SecurityException -> 0x08e0, 6GV -> 0x08d3 }
        L_0x08d3:
            r1 = move-exception
            java.lang.Object r0 = r6.A00
            X.L8q r0 = (X.C63835L8q) r0
            X.JVE r0 = r0.A02
            if (r0 == 0) goto L_0x09be
            A02(r0, r1)
            return r12
        L_0x08e0:
            r1 = move-exception
            java.lang.Object r0 = r6.A00
            X.L8q r0 = (X.C63835L8q) r0
            X.JVE r0 = r0.A02
            if (r0 == 0) goto L_0x09be
            A02(r0, r1)
            return r12
        L_0x08ed:
            r1 = move-exception
            java.lang.Object r0 = r6.A00
            X.L8q r0 = (X.C63835L8q) r0
            X.JVE r0 = r0.A02
            if (r0 == 0) goto L_0x09be
            A02(r0, r1)
            return r12
        L_0x08fa:
            r12 = 0
            java.lang.Object r7 = A00(r1, r6)
            X.L8q r7 = (X.C63835L8q) r7
            X.JVE r8 = r7.A02
            java.lang.String r9 = "logger"
            if (r8 == 0) goto L_0x09be
            java.lang.String r11 = "registration_flow"
            java.lang.String r0 = "client_reg_request_create_and_acquire_verifier"
            r8.A01(r0, r12, r11)
            X.Et7 r5 = new X.Et7
            r5.<init>()
            X.S6k r3 = r7.A04
            java.lang.String r0 = r6.A02
            byte[] r1 = r3.A03(r0)
            android.os.Bundle r0 = r5.A00
            java.lang.String r4 = "requestMessage"
            r0.putByteArray(r4, r1)
            r1 = 0
            android.os.Bundle r0 = r5.A00
            java.lang.String r2 = "useDebugKey"
            r0.putBoolean(r2, r1)
            X.LQW r6 = r7.A01     // Catch:{ RemoteException -> 0x09b9, SecurityException -> 0x09b4, 6GV -> 0x09af }
            if (r6 != 0) goto L_0x0938
            java.lang.String r0 = "feO2Client"
            X.0qQ.A0F(r0)     // Catch:{ RemoteException -> 0x09b9, SecurityException -> 0x09b4, 6GV -> 0x09af }
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0     // Catch:{ RemoteException -> 0x09b9, SecurityException -> 0x09b4, 6GV -> 0x09af }
        L_0x0938:
            android.os.Bundle r7 = r5.A00     // Catch:{ RemoteException -> 0x09b9, SecurityException -> 0x09b4, 6GV -> 0x09af }
            X.LSS.A04(r4, r7)     // Catch:{ RemoteException -> 0x09b9, SecurityException -> 0x09b4, 6GV -> 0x09af }
            java.lang.Class<android.os.Bundle> r1 = android.os.Bundle.class
            java.lang.String r0 = "auxAttributes"
            X.LSS.A02(r7, r1, r0)     // Catch:{ RemoteException -> 0x09b9, SecurityException -> 0x09b4, 6GV -> 0x09af }
            java.lang.Class<java.lang.Boolean> r1 = java.lang.Boolean.class
            X.LSS.A02(r7, r1, r2)     // Catch:{ RemoteException -> 0x09b9, SecurityException -> 0x09b4, 6GV -> 0x09af }
            java.lang.String r0 = "backupAttributes"
            X.LSS.A02(r7, r1, r0)     // Catch:{ RemoteException -> 0x09b9, SecurityException -> 0x09b4, 6GV -> 0x09af }
            android.os.Bundle r0 = new android.os.Bundle     // Catch:{ RemoteException -> 0x09b9, SecurityException -> 0x09b4, 6GV -> 0x09af }
            r0.<init>()     // Catch:{ RemoteException -> 0x09b9, SecurityException -> 0x09b4, 6GV -> 0x09af }
            android.net.Uri r5 = r6.A01     // Catch:{ Exception -> 0x09ad }
            X.Ru3 r4 = r6.A02     // Catch:{ Exception -> 0x09ad }
            android.content.ContentResolver r1 = r6.A00     // Catch:{ Exception -> 0x09ad }
            java.lang.String r2 = "register"
            android.os.Bundle r0 = r7.deepCopy()     // Catch:{ Exception -> 0x09ad }
            android.os.Bundle r1 = X.S92.A00(r1, r5, r0, r4, r2)     // Catch:{ Exception -> 0x09ad }
            X.LLu r0 = X.C64076LLu.A01     // Catch:{ Exception -> 0x09ad }
            X.1Tr r0 = r6.A03     // Catch:{ Exception -> 0x09ad }
            X.S92.A01(r1, r0, r2)     // Catch:{ Exception -> 0x09ad }
            if (r1 != 0) goto L_0x0971
            r2 = 0
            r0 = 0
        L_0x096e:
            if (r0 != 0) goto L_0x098a
            goto L_0x097e
        L_0x0971:
            android.os.Bundle r2 = r1.deepCopy()     // Catch:{ Exception -> 0x09ad }
            if (r2 == 0) goto L_0x09a6
            java.lang.String r0 = "verifier"
            X.LSS.A04(r0, r2)     // Catch:{ Exception -> 0x09ad }
            r0 = 1
            goto L_0x096e
        L_0x097e:
            java.lang.String r9 = "client_reg_query_verifier_failed"
            java.lang.String r10 = "empty enc verifier from feo2 client"
            java.lang.String r15 = "null enc verifier from feo2 client"
            r13 = r12
            r14 = r12
            r8.A02(r9, r10, r11, r12, r13, r14, r15)     // Catch:{ RemoteException -> 0x09b9, SecurityException -> 0x09b4, 6GV -> 0x09af }
            return r12
        L_0x098a:
            java.lang.String r0 = "client_reg_query_verifier_success"
            r8.A01(r0, r12, r11)     // Catch:{ RemoteException -> 0x09b9, SecurityException -> 0x09b4, 6GV -> 0x09af }
            java.lang.String r1 = "verifier"
            boolean r0 = r2.containsKey(r1)     // Catch:{ RemoteException -> 0x09b9, SecurityException -> 0x09b4, 6GV -> 0x09af }
            if (r0 == 0) goto L_0x09a0
            byte[] r0 = r2.getByteArray(r1)     // Catch:{ RemoteException -> 0x09b9, SecurityException -> 0x09b4, 6GV -> 0x09af }
            java.lang.String r12 = r3.A02(r0)     // Catch:{ RemoteException -> 0x09b9, SecurityException -> 0x09b4, 6GV -> 0x09af }
            return r12
        L_0x09a0:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ RemoteException -> 0x09b9, SecurityException -> 0x09b4, 6GV -> 0x09af }
            r0.<init>()     // Catch:{ RemoteException -> 0x09b9, SecurityException -> 0x09b4, 6GV -> 0x09af }
            throw r0     // Catch:{ RemoteException -> 0x09b9, SecurityException -> 0x09b4, 6GV -> 0x09af }
        L_0x09a6:
            java.lang.String r0 = "Bundle is null"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)     // Catch:{ Exception -> 0x09ad }
            throw r0     // Catch:{ Exception -> 0x09ad }
        L_0x09ad:
            r0 = move-exception
            throw r0     // Catch:{ RemoteException -> 0x09b9, SecurityException -> 0x09b4, 6GV -> 0x09af }
        L_0x09af:
            r0 = move-exception
            A01(r8, r0)
            return r12
        L_0x09b4:
            r0 = move-exception
            A01(r8, r0)
            return r12
        L_0x09b9:
            r0 = move-exception
            A01(r8, r0)
            return r12
        L_0x09be:
            X.0qQ.A0F(r9)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x09c6:
            java.lang.Object r0 = A00(r1, r6)
            com.instagram.common.uigraph.UiGraph r0 = (com.instagram.common.uigraph.UiGraph) r0
            java.util.Map r1 = r0.A04
            java.lang.String r0 = r6.A02
            java.lang.Object r0 = r1.get(r0)
            boolean r0 = X.DbW.A1a(r0)
            goto L_0x0b2e
        L_0x09da:
            java.lang.Object r0 = A00(r1, r6)
            X.2Nn r0 = (X.2Nn) r0
            java.io.File r7 = r0.C4W()
            java.lang.String r8 = r6.A02
            r3 = 60
            r5 = 0
            X.AnonymousClass7TF.A1C(r7, r5, r8)
            r4 = 0
            r6 = r4
            r13 = 2
        L_0x09ef:
            if (r4 != 0) goto L_0x0a6b
            if (r13 <= 0) goto L_0x0a6b
            java.lang.String r2 = "bitrate"
            r0 = 882(0x372, float:1.236E-42)
            java.lang.String r0 = X.Pxd.A00(r0)     // Catch:{ IOException -> 0x0a65 }
            java.lang.String r0 = X.002.A03(r3, r0)     // Catch:{ IOException -> 0x0a65 }
            java.io.File r11 = X.JTO.A0s(r7, r0)     // Catch:{ IOException -> 0x0a65 }
            boolean r0 = r11.exists()     // Catch:{ IOException -> 0x0a65 }
            if (r0 != 0) goto L_0x0a67
            java.lang.String r0 = "clip_voice_stitch_helper"
            X.Q0V r9 = X.Q0V.A00(r0)     // Catch:{ IOException -> 0x0a65 }
            r9.ETt(r8)     // Catch:{ IOException -> 0x0a5e, IllegalArgumentException -> 0x0a5c }
            android.media.MediaExtractor r0 = r9.A00     // Catch:{ IOException -> 0x0a5e, IllegalArgumentException -> 0x0a5c }
            android.media.MediaFormat r1 = r0.getTrackFormat(r5)     // Catch:{ IOException -> 0x0a5e, IllegalArgumentException -> 0x0a5c }
            X.0qQ.A07(r1)     // Catch:{ IOException -> 0x0a5e, IllegalArgumentException -> 0x0a5c }
            boolean r0 = r1.containsKey(r2)     // Catch:{ IOException -> 0x0a5e, IllegalArgumentException -> 0x0a5c }
            if (r0 == 0) goto L_0x0a54
            int r12 = r1.getInteger(r2)     // Catch:{ IOException -> 0x0a5e, IllegalArgumentException -> 0x0a5c }
        L_0x0a25:
            r0 = 264(0x108, float:3.7E-43)
            java.lang.String r0 = X.Pxd.A00(r0)     // Catch:{ IOException -> 0x0a5e, IllegalArgumentException -> 0x0a5c }
            int r2 = r1.getInteger(r0)     // Catch:{ IOException -> 0x0a5e, IllegalArgumentException -> 0x0a5c }
            r0 = 78
            java.lang.String r0 = X.Pxd.A00(r0)     // Catch:{ IOException -> 0x0a5e, IllegalArgumentException -> 0x0a5c }
            int r1 = r1.getInteger(r0)     // Catch:{ IOException -> 0x0a5e, IllegalArgumentException -> 0x0a5c }
            X.STP r10 = new X.STP     // Catch:{ IOException -> 0x0a5e, IllegalArgumentException -> 0x0a5c }
            r10.<init>()     // Catch:{ IOException -> 0x0a5e, IllegalArgumentException -> 0x0a5c }
            X.SF8 r0 = new X.SF8     // Catch:{ IOException -> 0x0a5e, IllegalArgumentException -> 0x0a5c }
            r0.<init>()     // Catch:{ IOException -> 0x0a5e, IllegalArgumentException -> 0x0a5c }
            r0.A00 = r12     // Catch:{ IOException -> 0x0a5e, IllegalArgumentException -> 0x0a5c }
            r0.A01 = r1     // Catch:{ IOException -> 0x0a5e, IllegalArgumentException -> 0x0a5c }
            r0.A02 = r2     // Catch:{ IOException -> 0x0a5e, IllegalArgumentException -> 0x0a5c }
            X.SFQ r2 = new X.SFQ     // Catch:{ IOException -> 0x0a5e, IllegalArgumentException -> 0x0a5c }
            r2.<init>(r0)     // Catch:{ IOException -> 0x0a5e, IllegalArgumentException -> 0x0a5c }
            r0 = 60
            r10.A06(r2, r11, r0)     // Catch:{ IOException -> 0x0a5e, IllegalArgumentException -> 0x0a5c }
            goto L_0x0a58
        L_0x0a54:
            r12 = 95000(0x17318, float:1.33123E-40)
            goto L_0x0a25
        L_0x0a58:
            r9.release()     // Catch:{ IOException -> 0x0a65 }
            goto L_0x0a67
        L_0x0a5c:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0a60 }
        L_0x0a5e:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0a60 }
        L_0x0a60:
            r0 = move-exception
            r9.release()     // Catch:{ IOException -> 0x0a65 }
            throw r0     // Catch:{ IOException -> 0x0a65 }
        L_0x0a65:
            r6 = move-exception
            goto L_0x0a68
        L_0x0a67:
            r4 = r11
        L_0x0a68:
            int r13 = r13 + -1
            goto L_0x09ef
        L_0x0a6b:
            if (r4 != 0) goto L_0x0a78
            java.lang.String r2 = "Error while generating silent Clips voiceover audio."
            java.lang.String r1 = "ClipsVoiceoverStitchingHelper"
            X.0kg r0 = X.0kg.A06
            if (r6 == 0) goto L_0x0a93
            X.0wb.A02(r0, r1, r2, r6)
        L_0x0a78:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            android.util.Pair r0 = new android.util.Pair
            r0.<init>(r1, r4)
            java.lang.Object r0 = r0.second
            java.io.File r0 = (java.io.File) r0
            if (r0 == 0) goto L_0x0a97
            java.lang.String r1 = X.JTP.A0t(r0)
            java.lang.String r0 = ""
            X.9cM r12 = new X.9cM
            r12.<init>(r1, r0, r0, r3)
            return r12
        L_0x0a93:
            X.0wb.A01(r0, r1, r2)
            goto L_0x0a78
        L_0x0a97:
            r12 = 0
            return r12
        L_0x0a99:
            java.lang.Object r1 = A00(r1, r6)
            X.MQ0 r1 = (X.MQ0) r1
            r5 = 1
            boolean r0 = X.C59678JTj.A01(r5, r1)
            if (r0 == 0) goto L_0x0af2
            X.JTj r1 = (X.C59678JTj) r1
            java.lang.Object r0 = r1.A01
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.lang.String r3 = r6.A02
            java.util.ArrayList r4 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r2 = r0.iterator()
        L_0x0ab6:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0ad1
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.VvF r0 = (X.C18622VvF) r0
            com.instagram.user.model.User r0 = r0.A05
            if (r0 == 0) goto L_0x0acf
            java.lang.String r0 = X.AnonymousClass3ZA.A00(r0)
        L_0x0acb:
            X.JTR.A1P(r0, r3, r1, r4)
            goto L_0x0ab6
        L_0x0acf:
            r0 = 0
            goto L_0x0acb
        L_0x0ad1:
            java.util.ArrayList r3 = X.AnonymousClass7TG.A0r(r4)
            java.util.Iterator r2 = r4.iterator()
        L_0x0ad9:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0aec
            java.lang.Object r1 = r2.next()
            X.JTj r0 = new X.JTj
            r0.<init>(r1, r5)
            r3.add(r0)
            goto L_0x0ad9
        L_0x0aec:
            X.0ic r12 = new X.0ic
            r12.<init>(r3, r5)
            return r12
        L_0x0af2:
            r2 = 0
            boolean r0 = X.C59678JTj.A01(r2, r1)
            if (r0 == 0) goto L_0x0b08
            X.JTj r1 = (X.C59678JTj) r1
            java.lang.Object r1 = r1.A01
            X.JTj r0 = new X.JTj
            r0.<init>(r1, r2)
        L_0x0b02:
            X.0rr r12 = new X.0rr
            r12.<init>(r0)
            return r12
        L_0x0b08:
            boolean r0 = r1 instanceof X.C59702JUj
            if (r0 == 0) goto L_0x0b0f
            X.JUj r0 = X.C59702JUj.A00
            goto L_0x0b02
        L_0x0b0f:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0b14:
            X.0eS.A00(r1)
            java.lang.Object r1 = r6.A00     // Catch:{ IllegalArgumentException -> 0x0b2d }
            android.media.MediaMetadataRetriever r1 = (android.media.MediaMetadataRetriever) r1     // Catch:{ IllegalArgumentException -> 0x0b2d }
            java.lang.String r0 = r6.A02     // Catch:{ IllegalArgumentException -> 0x0b2d }
            r1.setDataSource(r0)     // Catch:{ IllegalArgumentException -> 0x0b2d }
            r0 = 16
            java.lang.String r1 = r1.extractMetadata(r0)     // Catch:{ IllegalArgumentException -> 0x0b2d }
            java.lang.String r0 = "yes"
            boolean r0 = X.0qQ.A0K(r1, r0)     // Catch:{ IllegalArgumentException -> 0x0b2d }
            goto L_0x0b2e
        L_0x0b2d:
            r0 = 0
        L_0x0b2e:
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r0)
            return r12
        L_0x0b33:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L_0x0b36:
            r0 = move-exception
            r3.endTransaction()     // Catch:{ all -> 0x0b3b }
            throw r0     // Catch:{ all -> 0x0b3b }
        L_0x0b3b:
            r0 = move-exception
            r2.release(r1)
            throw r0
        L_0x0b40:
            X.0sn r12 = X.0sn.A00
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66187MGy.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public static Object A00(Object obj, C66187MGy mGy) {
        0eS.A00(obj);
        return mGy.A00;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C66187MGy) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66187MGy(String str, AnonymousClass4D7 r3) {
        super(2, r3);
        this.A01 = 35;
        this.A02 = str;
    }
}
