package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

public final class MH6 extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public final int A04;
    public final String A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MH6(Context context, UserSession userSession, String str, AnonymousClass4D7 r5) {
        super(2, r5);
        this.A04 = 25;
        this.A05 = str;
        this.A02 = userSession;
        this.A01 = context;
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [X.MH6, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v1, types: [X.MH6, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v4, types: [X.MH6, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v5, types: [X.MH6, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v6, types: [X.MH6, X.4D7] */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x011f, code lost:
        r5 = new X.MH6(r6, r7, r8, r9, r10);
        r5.A02 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0127, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0136, code lost:
        return new X.MH6(r6, r7, r8, r9, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0015, code lost:
        return new X.MH6(r5, r6, r7, r8, r9, r10);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass4D7 create(java.lang.Object r12, X.AnonymousClass4D7 r13) {
        /*
            r11 = this;
            int r1 = r11.A04
            r9 = r13
            switch(r1) {
                case 0: goto L_0x0016;
                case 1: goto L_0x0020;
                case 2: goto L_0x002a;
                case 3: goto L_0x00d2;
                case 4: goto L_0x00da;
                case 5: goto L_0x0034;
                case 6: goto L_0x00e2;
                case 7: goto L_0x003e;
                case 8: goto L_0x0048;
                case 9: goto L_0x0053;
                case 10: goto L_0x00ea;
                case 11: goto L_0x005e;
                case 12: goto L_0x00f8;
                case 13: goto L_0x0101;
                case 14: goto L_0x0069;
                case 15: goto L_0x0074;
                case 16: goto L_0x007f;
                case 17: goto L_0x008a;
                case 18: goto L_0x0117;
                case 19: goto L_0x0096;
                case 20: goto L_0x0128;
                case 21: goto L_0x00a2;
                case 22: goto L_0x0137;
                case 23: goto L_0x00ae;
                case 24: goto L_0x00ba;
                case 25: goto L_0x0143;
                case 26: goto L_0x00c6;
                default: goto L_0x0006;
            }
        L_0x0006:
            java.lang.Object r6 = r11.A03
            java.lang.String r8 = r11.A05
            java.lang.Object r5 = r11.A01
            java.lang.Object r7 = r11.A02
            r10 = 27
        L_0x0010:
            X.MH6 r4 = new X.MH6
            r4.<init>((java.lang.Object) r5, (java.lang.Object) r6, (java.lang.Object) r7, (java.lang.String) r8, (X.AnonymousClass4D7) r9, (int) r10)
            return r4
        L_0x0016:
            java.lang.Object r5 = r11.A01
            java.lang.String r8 = r11.A05
            java.lang.Object r6 = r11.A03
            java.lang.Object r7 = r11.A02
            r10 = 0
            goto L_0x0010
        L_0x0020:
            java.lang.Object r5 = r11.A01
            java.lang.String r8 = r11.A05
            java.lang.Object r7 = r11.A02
            java.lang.Object r6 = r11.A03
            r10 = 1
            goto L_0x0010
        L_0x002a:
            java.lang.Object r7 = r11.A02
            java.lang.Object r6 = r11.A03
            java.lang.String r8 = r11.A05
            java.lang.Object r5 = r11.A01
            r10 = 2
            goto L_0x0010
        L_0x0034:
            java.lang.Object r6 = r11.A03
            java.lang.String r8 = r11.A05
            java.lang.Object r7 = r11.A02
            java.lang.Object r5 = r11.A01
            r10 = 5
            goto L_0x0010
        L_0x003e:
            java.lang.Object r6 = r11.A03
            java.lang.Object r7 = r11.A02
            java.lang.String r8 = r11.A05
            java.lang.Object r5 = r11.A01
            r10 = 7
            goto L_0x0010
        L_0x0048:
            java.lang.Object r6 = r11.A03
            java.lang.String r8 = r11.A05
            java.lang.Object r7 = r11.A02
            java.lang.Object r5 = r11.A01
            r10 = 8
            goto L_0x0010
        L_0x0053:
            java.lang.Object r5 = r11.A01
            java.lang.String r8 = r11.A05
            java.lang.Object r6 = r11.A03
            java.lang.Object r7 = r11.A02
            r10 = 9
            goto L_0x0010
        L_0x005e:
            java.lang.Object r7 = r11.A02
            java.lang.Object r5 = r11.A01
            java.lang.Object r6 = r11.A03
            java.lang.String r8 = r11.A05
            r10 = 11
            goto L_0x0010
        L_0x0069:
            java.lang.Object r7 = r11.A02
            java.lang.Object r6 = r11.A03
            java.lang.Object r5 = r11.A01
            java.lang.String r8 = r11.A05
            r10 = 14
            goto L_0x0010
        L_0x0074:
            java.lang.Object r6 = r11.A03
            java.lang.String r8 = r11.A05
            java.lang.Object r7 = r11.A02
            java.lang.Object r5 = r11.A01
            r10 = 15
            goto L_0x0010
        L_0x007f:
            java.lang.Object r6 = r11.A03
            java.lang.String r8 = r11.A05
            java.lang.Object r7 = r11.A02
            java.lang.Object r5 = r11.A01
            r10 = 16
            goto L_0x0010
        L_0x008a:
            java.lang.Object r6 = r11.A03
            java.lang.String r8 = r11.A05
            java.lang.Object r7 = r11.A02
            java.lang.Object r5 = r11.A01
            r10 = 17
            goto L_0x0010
        L_0x0096:
            java.lang.Object r6 = r11.A03
            java.lang.Object r5 = r11.A01
            java.lang.String r8 = r11.A05
            java.lang.Object r7 = r11.A02
            r10 = 19
            goto L_0x0010
        L_0x00a2:
            java.lang.Object r6 = r11.A03
            java.lang.Object r7 = r11.A02
            java.lang.Object r5 = r11.A01
            java.lang.String r8 = r11.A05
            r10 = 21
            goto L_0x0010
        L_0x00ae:
            java.lang.Object r6 = r11.A03
            java.lang.Object r7 = r11.A02
            java.lang.String r8 = r11.A05
            java.lang.Object r5 = r11.A01
            r10 = 23
            goto L_0x0010
        L_0x00ba:
            java.lang.Object r6 = r11.A03
            java.lang.Object r5 = r11.A01
            java.lang.Object r7 = r11.A02
            java.lang.String r8 = r11.A05
            r10 = 24
            goto L_0x0010
        L_0x00c6:
            java.lang.String r8 = r11.A05
            java.lang.Object r6 = r11.A03
            java.lang.Object r7 = r11.A02
            java.lang.Object r5 = r11.A01
            r10 = 26
            goto L_0x0010
        L_0x00d2:
            java.lang.Object r7 = r11.A01
            java.lang.Object r6 = r11.A03
            java.lang.String r8 = r11.A05
            r10 = 3
            goto L_0x0130
        L_0x00da:
            java.lang.Object r6 = r11.A03
            java.lang.Object r7 = r11.A01
            java.lang.String r8 = r11.A05
            r10 = 4
            goto L_0x011f
        L_0x00e2:
            java.lang.Object r6 = r11.A03
            java.lang.Object r7 = r11.A01
            java.lang.String r8 = r11.A05
            r10 = 6
            goto L_0x0130
        L_0x00ea:
            java.lang.Object r2 = r11.A03
            java.lang.String r1 = r11.A05
            r0 = 10
            X.MH6 r4 = new X.MH6
            r4.<init>((java.lang.Object) r2, (java.lang.String) r1, (X.AnonymousClass4D7) r13, (int) r0)
            r4.A01 = r12
            return r4
        L_0x00f8:
            java.lang.Object r6 = r11.A03
            java.lang.Object r7 = r11.A01
            java.lang.String r8 = r11.A05
            r10 = 12
            goto L_0x011f
        L_0x0101:
            java.lang.Object r7 = r11.A03
            X.JU5 r7 = (X.JU5) r7
            java.lang.Object r6 = r11.A01
            X.4bN r6 = (X.C267324bN) r6
            java.lang.String r8 = r11.A05
            int r10 = r11.A00
            java.lang.Object r5 = r11.A02
            X.07V r5 = (X.AnonymousClass07V) r5
            X.MH6 r4 = new X.MH6
            r4.<init>((X.AnonymousClass07V) r5, (X.C267324bN) r6, (X.JU5) r7, (java.lang.String) r8, (X.AnonymousClass4D7) r9, (int) r10)
            return r4
        L_0x0117:
            java.lang.Object r6 = r11.A03
            java.lang.String r8 = r11.A05
            java.lang.Object r7 = r11.A01
            r10 = 18
        L_0x011f:
            X.MH6 r4 = new X.MH6
            r5 = r4
            r5.<init>(r6, r7, r8, r9, r10)
            r4.A02 = r12
            return r4
        L_0x0128:
            java.lang.Object r6 = r11.A03
            java.lang.String r8 = r11.A05
            java.lang.Object r7 = r11.A01
            r10 = 20
        L_0x0130:
            X.MH6 r4 = new X.MH6
            r5 = r4
            r5.<init>(r6, r7, r8, r9, r10)
            return r4
        L_0x0137:
            java.lang.Object r2 = r11.A03
            java.lang.String r1 = r11.A05
            r0 = 22
            X.MH6 r4 = new X.MH6
            r4.<init>((java.lang.Object) r2, (java.lang.String) r1, (X.AnonymousClass4D7) r13, (int) r0)
            return r4
        L_0x0143:
            java.lang.String r2 = r11.A05
            java.lang.Object r1 = r11.A02
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1
            java.lang.Object r0 = r11.A01
            android.content.Context r0 = (android.content.Context) r0
            X.MH6 r4 = new X.MH6
            r4.<init>((android.content.Context) r0, (com.instagram.common.session.UserSession) r1, (java.lang.String) r2, (X.AnonymousClass4D7) r13)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MH6.create(java.lang.Object, X.4D7):X.4D7");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v116, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v118, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.MH6, X.4D7] */
    /* JADX WARNING: type inference failed for: r3v84, types: [com.instagram.model.direct.DirectSearchMetaAIResponse, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r3v115 */
    /* JADX WARNING: type inference failed for: r3v132 */
    /* JADX WARNING: type inference failed for: r3v133 */
    /* JADX WARNING: Code restructure failed: missing block: B:413:0x0a83, code lost:
        r1 = X.JTP.A0N(r4);
        X.AnonymousClass7TG.A1N(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:414:0x0a8c, code lost:
        if ((r1 instanceof X.C268674do) == false) goto L_0x0abb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:415:0x0a8e, code lost:
        r1 = (X.C268674do) r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:416:0x0a90, code lost:
        if (r1 == null) goto L_0x0abb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:417:0x0a92, code lost:
        r0 = (X.AnonymousClass1XT) r1.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:418:0x0a96, code lost:
        if (r0 == null) goto L_0x0abb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:419:0x0a98, code lost:
        r0 = r0.getErrorMessage();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:420:0x0a9c, code lost:
        if (r0 == null) goto L_0x0abb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:421:0x0a9e, code lost:
        r0 = X.GKS.A00(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:422:0x0aa2, code lost:
        r2 = X.DbV.A0X();
        X.DbS.A19(r3, r2, r0);
        r2.A02 = r3.getResources().getDimensionPixelOffset(com.instagram.android.R.dimen.abc_alert_dialog_button_dimen);
        X.DbY.A1N(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:423:0x0abb, code lost:
        r0 = 2131953203;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:564:0x0dc4, code lost:
        if (X.AnonymousClass7TE.A1a(r4) != false) goto L_0x0dc6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:596:0x0e76, code lost:
        X.0eS.A00(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:603:0x0ee2, code lost:
        if (r0 != r1) goto L_0x0f17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:604:0x0ee4, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:653:?, code lost:
        return X.C60340gF.A00;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x04d7 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x04ff  */
    /* JADX WARNING: Removed duplicated region for block: B:501:0x0c68  */
    /* JADX WARNING: Removed duplicated region for block: B:504:0x0c77  */
    /* JADX WARNING: Removed duplicated region for block: B:512:0x0ca2  */
    /* JADX WARNING: Removed duplicated region for block: B:539:0x0d51  */
    /* JADX WARNING: Removed duplicated region for block: B:654:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            r21 = this;
            r0 = r21
            r4 = r22
            int r1 = r0.A04
            switch(r1) {
                case 0: goto L_0x004e;
                case 1: goto L_0x0017;
                case 2: goto L_0x0090;
                case 3: goto L_0x00f6;
                case 4: goto L_0x0128;
                case 5: goto L_0x0162;
                case 6: goto L_0x0208;
                case 7: goto L_0x02ca;
                case 8: goto L_0x0374;
                case 9: goto L_0x03ec;
                case 10: goto L_0x0434;
                case 11: goto L_0x054e;
                case 12: goto L_0x057f;
                case 13: goto L_0x05ca;
                case 14: goto L_0x0821;
                case 15: goto L_0x08b5;
                case 16: goto L_0x0993;
                case 17: goto L_0x0a10;
                case 18: goto L_0x0ac9;
                case 19: goto L_0x0b36;
                case 20: goto L_0x0c1a;
                case 21: goto L_0x0cba;
                case 22: goto L_0x0cef;
                case 23: goto L_0x0d89;
                case 24: goto L_0x0ee5;
                case 25: goto L_0x0db0;
                case 26: goto L_0x0e65;
                default: goto L_0x0009;
            }
        L_0x0009:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r6 = 1
            if (r2 == 0) goto L_0x0ecb
            if (r2 == r6) goto L_0x0e76
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0017:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r5 = 1
            if (r2 == 0) goto L_0x003b
            if (r2 != r5) goto L_0x0049
            X.0eS.A00(r4)
        L_0x0023:
            java.lang.Object r3 = r0.A01
            X.0sL r3 = (X.0sL) r3
            java.lang.String r2 = r0.A05
            java.lang.Object r1 = r0.A02
            java.lang.Object r1 = X.C51966G9m.A17(r1)
            r3.invoke(r2, r1)
            java.lang.Object r0 = r0.A03
            X.5Oz r0 = (X.C284945Oz) r0
            X.C51967G9n.A16(r0, r5)
            goto L_0x0f17
        L_0x003b:
            X.0eS.A00(r4)
            r2 = 1000(0x3e8, double:4.94E-321)
            r0.A00 = r5
            java.lang.Object r2 = X.C241603Pv.A01(r0, r2)
            if (r2 != r1) goto L_0x0023
            return r1
        L_0x0049:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x004e:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r7 = 2
            r6 = 1
            if (r2 == 0) goto L_0x005f
            if (r2 == r6) goto L_0x0076
            if (r2 == r7) goto L_0x0e76
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x005f:
            X.0eS.A00(r4)
            java.lang.Object r4 = r0.A01
            X.0sL r4 = (X.0sL) r4
            java.lang.String r3 = r0.A05
            X.JrY r2 = new X.JrY
            r2.<init>(r3)
            r0.A00 = r6
            java.lang.Object r2 = r4.invoke(r2, r0)
            if (r2 != r1) goto L_0x0079
            return r1
        L_0x0076:
            X.0eS.A00(r4)
        L_0x0079:
            java.lang.Object r5 = r0.A01
            X.0sL r5 = (X.0sL) r5
            java.lang.String r4 = r0.A05
            java.lang.Object r3 = r0.A02
            com.facebook.cdl.gltfmemorypointerholder.GltfMemoryPointerWrapper r3 = (com.facebook.cdl.gltfmemorypointerholder.GltfMemoryPointerWrapper) r3
            X.JrX r2 = new X.JrX
            r2.<init>(r3, r4, r6)
            r0.A00 = r7
            java.lang.Object r0 = r5.invoke(r2, r0)
            goto L_0x0ee2
        L_0x0090:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r6 = 2
            r5 = 1
            if (r2 == 0) goto L_0x00a1
            if (r2 == r5) goto L_0x00e4
            if (r2 == r6) goto L_0x00e4
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x00a1:
            X.0eS.A00(r4)
            java.lang.Object r4 = r0.A02
            X.1Xo r4 = (X.AnonymousClass1Xo) r4
            boolean r3 = r4.CbC()
            java.lang.Object r2 = r0.A03
            X.GgS r2 = (X.C52975GgS) r2
            if (r3 == 0) goto L_0x00cc
            X.6dC r6 = r2.A00
            com.instagram.common.session.UserSession r3 = r2.A01
            java.lang.String r2 = r0.A05
            java.lang.Object r7 = r0.A01
            X.9tK r7 = (X.C391589tK) r7
            r8 = 0
            r0.A00 = r5
            java.lang.String r12 = "effect_page"
            r9 = r3
            r10 = r4
            r11 = r2
            r13 = r0
            java.lang.Object r2 = r6.A01(r7, r8, r9, r10, r11, r12, r13)
        L_0x00c9:
            if (r2 != r1) goto L_0x00e7
            return r1
        L_0x00cc:
            X.6dC r7 = r2.A00
            com.instagram.common.session.UserSession r10 = r2.A01
            java.lang.String r2 = r0.A05
            r9 = 0
            java.lang.Object r8 = r0.A01
            X.9tK r8 = (X.C391589tK) r8
            r0.A00 = r6
            java.lang.String r14 = "effect_page"
            r11 = r4
            r12 = r2
            r13 = r9
            r15 = r0
            java.lang.Object r2 = r7.A00(r8, r9, r10, r11, r12, r13, r14, r15)
            goto L_0x00c9
        L_0x00e4:
            X.0eS.A00(r4)
        L_0x00e7:
            java.lang.Object r0 = r0.A03
            X.GgS r0 = (X.C52975GgS) r0
            com.instagram.common.session.UserSession r0 = r0.A01
            X.1Av r0 = X.1Au.A00(r0)
            r0.A0R()
            goto L_0x0f17
        L_0x00f6:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r6 = 1
            if (r2 == 0) goto L_0x010b
            if (r2 != r6) goto L_0x0123
            java.lang.Object r5 = r0.A02
            X.0sP r5 = (X.0sP) r5
            X.0eS.A00(r4)
        L_0x0106:
            r5.invoke(r4)
            goto L_0x0f17
        L_0x010b:
            X.0eS.A00(r4)
            java.lang.Object r5 = r0.A01
            X.0sP r5 = (X.0sP) r5
            java.lang.Object r3 = r0.A03
            com.instagram.clips.drafts.model.validation.ClipsDraftValidator r3 = (com.instagram.clips.drafts.model.validation.ClipsDraftValidator) r3
            java.lang.String r2 = r0.A05
            r0.A02 = r5
            r0.A00 = r6
            java.lang.Object r4 = r3.A01(r2, r0)
            if (r4 != r1) goto L_0x0106
            return r1
        L_0x0123:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0128:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r8 = 1
            if (r2 == 0) goto L_0x0136
            if (r2 == r8) goto L_0x015a
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0136:
            X.0eS.A00(r4)
            java.lang.Object r7 = r0.A03
            X.E1H r7 = (X.E1H) r7
            X.0eM r2 = r7.A0E
            java.lang.Object r2 = r2.getValue()
            X.GhB r2 = (X.C53020GhB) r2
            X.0Ud r6 = r2.A02
            java.lang.Object r5 = r0.A01
            java.lang.String r4 = r0.A05
            r3 = 0
            X.FxF r2 = new X.FxF
            r2.<init>(r7, r5, r4, r3)
            r0.A00 = r8
            java.lang.Object r0 = r6.collect(r2, r0)
            if (r0 != r1) goto L_0x015d
            return r1
        L_0x015a:
            X.0eS.A00(r4)
        L_0x015d:
            X.MCr r0 = X.C51965G9l.A0x()
            throw r0
        L_0x0162:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r8 = 1
            if (r2 == 0) goto L_0x01cb
            if (r2 != r8) goto L_0x0203
            X.0eS.A00(r4)
            X.0eR r4 = (X.0eR) r4
            java.lang.Object r6 = r4.A00
        L_0x0172:
            boolean r2 = r6 instanceof X.0eQ
            r1 = r2 ^ 1
            r3 = 0
            if (r1 == 0) goto L_0x01a3
            if (r2 != 0) goto L_0x01a3
            if (r6 == 0) goto L_0x01a3
            X.1Xj r6 = (X.1Xj) r6
            if (r6 == 0) goto L_0x0185
            java.lang.String r3 = r6.A30()
        L_0x0185:
            java.lang.Object r2 = r0.A03
            X.8N2 r2 = (X.AnonymousClass8N2) r2
            X.0eM r1 = r2.A0F
            java.lang.Object r1 = r1.getValue()
            com.instagram.creation.capture.assetpicker.cutout.data.CutoutStickerRepository r1 = (com.instagram.creation.capture.assetpicker.cutout.data.CutoutStickerRepository) r1
            java.lang.Object r0 = r0.A02
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            r1.A00 = r0
            X.05G r5 = r2.A0A
            X.KK2 r1 = new X.KK2
            r1.<init>(r0, r3)
        L_0x019e:
            r5.Epw(r1)
            goto L_0x0f17
        L_0x01a3:
            java.lang.Object r1 = r0.A03
            X.8N2 r1 = (X.AnonymousClass8N2) r1
            X.05G r5 = r1.A0A
            java.lang.Object r4 = r0.A02
            android.graphics.Bitmap r4 = (android.graphics.Bitmap) r4
            java.lang.Throwable r2 = X.0eR.A00(r6)
            boolean r0 = r2 instanceof X.C62688Kko
            if (r0 == 0) goto L_0x01bc
            r0 = r2
            X.Kko r0 = (X.C62688Kko) r0
            if (r0 == 0) goto L_0x01bc
            java.lang.Integer r3 = r0.A00
        L_0x01bc:
            if (r2 != 0) goto L_0x01c5
            java.lang.String r0 = "Failed to upload cutout sticker"
            java.lang.Throwable r2 = new java.lang.Throwable
            r2.<init>(r0)
        L_0x01c5:
            X.KK3 r1 = new X.KK3
            r1.<init>(r4, r3, r2)
            goto L_0x019e
        L_0x01cb:
            X.0eS.A00(r4)
            java.lang.Object r7 = r0.A03
            X.8N2 r7 = (X.AnonymousClass8N2) r7
            X.05G r3 = r7.A0A
            X.KK4 r2 = X.KK4.A00
            r3.Epw(r2)
            X.0eM r2 = r7.A0F
            java.lang.Object r9 = r2.getValue()
            com.instagram.creation.capture.assetpicker.cutout.data.CutoutStickerRepository r9 = (com.instagram.creation.capture.assetpicker.cutout.data.CutoutStickerRepository) r9
            java.lang.String r6 = r0.A05
            java.lang.Object r5 = r0.A02
            android.graphics.Bitmap r5 = (android.graphics.Bitmap) r5
            java.lang.String r13 = X.JTQ.A0Z()
            X.1ud r4 = X.1ua.A0G
            java.lang.Object r3 = r0.A01
            android.content.Context r3 = (android.content.Context) r3
            com.instagram.common.session.UserSession r2 = r7.A0E
            X.1ua r11 = r4.A01(r3, r2)
            r0.A00 = r8
            r10 = r5
            r12 = r6
            r14 = r0
            java.lang.Object r6 = r9.A00(r10, r11, r12, r13, r14)
            if (r6 != r1) goto L_0x0172
            return r1
        L_0x0203:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0208:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r7 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L_0x021a
            if (r2 == r5) goto L_0x024e
            if (r2 == r7) goto L_0x0e76
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x021a:
            X.0eS.A00(r4)
            java.lang.Object r9 = r0.A03
            X.JcV r9 = (X.C59962JcV) r9
            java.lang.Object r2 = r0.A01
            android.view.View r2 = (android.view.View) r2
            android.content.Context r2 = r2.getContext()
            android.content.Context r3 = X.DbT.A05(r2)
            X.0eM r2 = r9.A0i
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r2)
            com.instagram.creation.ml.VisualFeatureStore r3 = X.C394989z1.A00(r3, r2)
            r9.A0K = r3
            if (r3 == 0) goto L_0x02b0
            java.lang.String r2 = r0.A05
            r0.A02 = r9
            r0.A00 = r5
            r15 = 0
            r10 = r3
            r11 = r6
            r12 = r2
            r13 = r0
            r14 = r5
            java.lang.Object r4 = r10.A03(r11, r12, r13, r14, r15)
            if (r4 != r1) goto L_0x0255
            return r1
        L_0x024e:
            java.lang.Object r9 = r0.A02
            X.JcV r9 = (X.C59962JcV) r9
            X.0eS.A00(r4)
        L_0x0255:
            java.util.List r4 = (java.util.List) r4
            if (r4 == 0) goto L_0x02b0
            java.util.LinkedHashMap r5 = X.AnonymousClass7TE.A1H()
            java.util.Iterator r4 = r4.iterator()
        L_0x0261:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L_0x027a
            java.lang.Object r3 = r4.next()
            r2 = r3
            X.Jvh r2 = (X.C61043Jvh) r2
            java.lang.String r2 = r2.A02
            java.lang.Object r2 = X.JTS.A0h(r2, r5)
            java.util.List r2 = (java.util.List) r2
            r2.add(r3)
            goto L_0x0261
        L_0x027a:
            java.util.LinkedHashMap r10 = X.C51975G9x.A0o(r5)
            java.util.Iterator r8 = X.AnonymousClass7TF.A0s(r5)
        L_0x0282:
            boolean r2 = r8.hasNext()
            if (r2 == 0) goto L_0x02b1
            java.util.Map$Entry r2 = X.AnonymousClass7TE.A1J(r8)
            java.lang.Object r5 = r2.getKey()
            java.lang.Object r3 = r2.getValue()
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            int r2 = X.JTT.A08(r3)
            java.util.LinkedHashMap r4 = X.DbS.A0x(r2)
            java.util.Iterator r3 = r3.iterator()
        L_0x02a2:
            boolean r2 = r3.hasNext()
            if (r2 == 0) goto L_0x02ac
            X.C61043Jvh.A00(r3, r4)
            goto L_0x02a2
        L_0x02ac:
            r10.put(r5, r4)
            goto L_0x0282
        L_0x02b0:
            r10 = r6
        L_0x02b1:
            r9.A0W = r10
            X.12T r2 = X.AnonymousClass12T.A00
            X.4CZ r5 = r2.A04
            java.lang.Object r4 = r0.A03
            r3 = 43
            X.MG0 r2 = new X.MG0
            r2.<init>(r4, r6, r3)
            r0.A02 = r6
            r0.A00 = r7
            java.lang.Object r0 = X.1Eo.A00(r0, r5, r2)
            goto L_0x0ee2
        L_0x02ca:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r6 = 1
            if (r2 == 0) goto L_0x0301
            if (r2 != r6) goto L_0x036f
            X.0eS.A00(r4)
        L_0x02d6:
            X.Kmi r4 = (X.C62806Kmi) r4
            boolean r1 = r4 instanceof X.C61899KQs
            if (r1 == 0) goto L_0x032f
            java.lang.Object r3 = r0.A03
            com.instagram.direct.fragment.sharesheet.viewmodel.DirectShareSheetFragmentViewModel r3 = (com.instagram.direct.fragment.sharesheet.viewmodel.DirectShareSheetFragmentViewModel) r3
            java.lang.Object r0 = r0.A02
            X.5g5 r0 = (X.C290865g5) r0
            java.lang.String r2 = r0.A01
            java.util.List r1 = r0.A02
            X.KQs r4 = (X.C61899KQs) r4
            java.util.List r0 = r4.A00
            com.instagram.direct.fragment.sharesheet.viewmodel.DirectShareSheetFragmentViewModel.A06(r3, r2, r1, r0)
            com.instagram.common.session.UserSession r0 = r3.A0L
            X.OC6 r0 = X.C70166NyK.A00(r0)
            X.02m r2 = r0.A00
            r1 = 145755797(0x8b00e95, float:1.0596043E-33)
            java.lang.String r0 = "FOLLOWING_THREADS_FETCH_SUCCESS"
            r2.markerPoint(r1, r0)
            goto L_0x0f17
        L_0x0301:
            X.0eS.A00(r4)
            java.lang.Object r5 = r0.A03
            com.instagram.direct.fragment.sharesheet.viewmodel.DirectShareSheetFragmentViewModel r5 = (com.instagram.direct.fragment.sharesheet.viewmodel.DirectShareSheetFragmentViewModel) r5
            com.instagram.common.session.UserSession r2 = r5.A0L
            X.OC6 r2 = X.C70166NyK.A00(r2)
            X.02m r4 = r2.A00
            r3 = 145755797(0x8b00e95, float:1.0596043E-33)
            java.lang.String r2 = "FOLLOWING_THREADS_FETCH_START"
            r4.markerPoint(r3, r2)
            com.instagram.direct.fragment.sharesheet.mvvm.data.DirectShareSheetRecipientRepository r5 = r5.A0N
            java.lang.Object r2 = r0.A02
            X.5g5 r2 = (X.C290865g5) r2
            java.util.List r4 = r2.A02
            java.lang.String r3 = r0.A05
            java.lang.Object r2 = r0.A01
            X.EVj r2 = (X.C48091EVj) r2
            r0.A00 = r6
            java.lang.Object r4 = r5.A00(r2, r3, r4, r0)
            if (r4 != r1) goto L_0x02d6
            return r1
        L_0x032f:
            boolean r1 = r4 instanceof X.C61898KQr
            if (r1 == 0) goto L_0x036a
            java.lang.Object r4 = r0.A03
            com.instagram.direct.fragment.sharesheet.viewmodel.DirectShareSheetFragmentViewModel r4 = (com.instagram.direct.fragment.sharesheet.viewmodel.DirectShareSheetFragmentViewModel) r4
            X.05G r2 = r4.A0g
            java.lang.Object r1 = r0.A02
            X.5g5 r1 = (X.C290865g5) r1
            java.lang.String r0 = r1.A01
            r2.Epw(r0)
            X.05G r0 = r4.A0l
            r0.Epw(r1)
            X.05G r0 = r4.A0Z
            r3 = 0
            X.AnonymousClass7TF.A1O(r0, r3)
            com.instagram.common.session.UserSession r0 = r4.A0L
            X.OC6 r0 = X.C70166NyK.A00(r0)
            X.02m r2 = r0.A00
            r1 = 145755797(0x8b00e95, float:1.0596043E-33)
            java.lang.String r0 = "FOLLOWING_THREADS_FETCH_FAILURE"
            r2.markerPoint(r1, r0)
            X.2Fk r0 = r4.A0E
            java.lang.Object r0 = r0.A02()
            java.lang.String r0 = (java.lang.String) r0
            r4.A0F(r0, r3)
            goto L_0x0f17
        L_0x036a:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x036f:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0374:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r6 = 1
            if (r2 == 0) goto L_0x0382
            if (r2 == r6) goto L_0x0e76
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0382:
            X.0eS.A00(r4)
            java.lang.Object r2 = r0.A03
            X.KWs r2 = (X.C62036KWs) r2
            com.instagram.common.session.UserSession r2 = r2.A00
            r5 = 0
            r7 = 0
            X.1NY r4 = X.AnonymousClass7TG.A0a(r2)
            java.lang.String r2 = r0.A05
            java.lang.Object[] r3 = new java.lang.Object[]{r2}
            java.lang.String r2 = "direct_v2/threads/%s/bulk_detect_and_translate/"
            r4.A0K(r2, r3)
            java.lang.Object r2 = r0.A02
            java.util.List r2 = (java.util.List) r2
            java.lang.String r3 = X.C62036KWs.A00(r2)
            java.lang.String r2 = "bulk_messages"
            r4.A9m(r2, r3)
            java.lang.String r3 = X.AnonymousClass1Q2.A00()
            java.lang.String r2 = "target_dialect_code"
            r4.A9m(r2, r3)
            java.lang.Class<X.CCz> r3 = X.C43781CCz.class
            java.lang.Class<X.Cxp> r2 = X.C45515Cxp.class
            X.1OC r3 = X.DbT.A0R(r7, r4, r3, r2, r5)
            r2 = 1790817603(0x6abdb543, float:1.1467148E26)
            X.032 r4 = r3.A03(r2)
            java.lang.Object r5 = r0.A01
            X.OHM r5 = (X.OHM) r5
            r3 = 20
            X.Pla r2 = new X.Pla
            r2.<init>(r5, r3)
            X.0pz r3 = X.JUM.A02(r2, r4)
            X.Pfn r2 = new X.Pfn
            r2.<init>(r5, r7)
            X.0pz r4 = X.JUM.A04(r2, r3)
            r3 = 44
            X.MFz r2 = new X.MFz
            r2.<init>(r5, r7, r3)
            X.0pz r2 = X.JUM.A03(r2, r4)
            r0.A00 = r6
            java.lang.Object r0 = X.AnonymousClass11O.A01(r0, r2)
            goto L_0x0ee2
        L_0x03ec:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r8 = 2
            r5 = 1
            if (r2 == 0) goto L_0x03fd
            if (r2 == r5) goto L_0x041b
            if (r2 == r8) goto L_0x0e76
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x03fd:
            X.0eS.A00(r4)
            java.lang.Object r2 = r0.A01
            android.content.Context r2 = (android.content.Context) r2
            android.content.ContentResolver r4 = X.JTP.A0B(r2)
            java.lang.String r2 = r0.A05
            android.net.Uri r3 = X.DbT.A09(r2)
            java.lang.Object r2 = r0.A03
            android.util.Size r2 = (android.util.Size) r2
            r0.A00 = r5
            java.lang.Object r4 = X.OZ4.A00(r4, r3, r2, r0)
            if (r4 != r1) goto L_0x041e
            return r1
        L_0x041b:
            X.0eS.A00(r4)
        L_0x041e:
            X.12T r2 = X.AnonymousClass12T.A00
            X.4CZ r7 = r2.A04
            java.lang.Object r6 = r0.A02
            r5 = 0
            r3 = 26
            X.Pfn r2 = new X.Pfn
            r2.<init>(r4, r6, r5, r3)
            r0.A00 = r8
            java.lang.Object r0 = X.1Eo.A00(r0, r7, r2)
            goto L_0x0ee2
        L_0x0434:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r10 = 3
            r8 = 2
            r5 = 1
            r11 = 0
            if (r2 == 0) goto L_0x04a0
            if (r2 == r5) goto L_0x04b2
            if (r2 == r8) goto L_0x04d8
            if (r2 != r10) goto L_0x0549
            java.lang.Object r1 = r0.A02
            X.3JC r1 = (X.AnonymousClass3JC) r1
            java.lang.Object r7 = r0.A01
            java.util.ArrayList r7 = (java.util.ArrayList) r7
            X.0eS.A00(r4)
        L_0x044f:
            X.3JC r4 = (X.AnonymousClass3JC) r4
            java.lang.Object r6 = r1.A01
            X.3lr r6 = (X.C250663lr) r6
            if (r6 == 0) goto L_0x0503
            java.lang.Class<X.Box> r3 = X.C42981Box.class
            r9 = 0
            r1 = 1961(0x7a9, float:2.748E-42)
            java.lang.String r2 = X.AnonymousClass000.A00(r1)
            r1 = 1954061238(0x74789bb6, float:7.87871E31)
            X.3lr r6 = r6.getOptionalTreeField(r9, r2, r3, r1)
            if (r6 == 0) goto L_0x0503
            java.lang.Class<X.Bow> r3 = X.C42980Bow.class
            r1 = 1905(0x771, float:2.67E-42)
            java.lang.String r2 = X.AnonymousClass000.A00(r1)
            r1 = 1298474816(0x4d652740, float:2.40284672E8)
            com.google.common.collect.ImmutableList r1 = r6.getRequiredCompactedTreeListField(r9, r2, r3, r1)
            if (r1 == 0) goto L_0x0503
            X.3kO r8 = r1.iterator()
            X.0qQ.A07(r8)
        L_0x0481:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L_0x0503
            X.3lr r2 = X.C41845B3m.A0V(r8)
            java.lang.String r1 = "suggestion"
            java.lang.String r6 = r2.getOptionalStringField(r9, r1)
            if (r6 == 0) goto L_0x0481
            X.9VB r3 = X.AnonymousClass9VB.TEXT
            java.lang.String r2 = ""
            com.instagram.model.direct.DirectSearchPrompt r1 = new com.instagram.model.direct.DirectSearchPrompt
            r1.<init>(r3, r6, r2, r2)
            r7.add(r1)
            goto L_0x0481
        L_0x04a0:
            X.0eS.A00(r4)
            java.lang.Object r9 = r0.A01
            X.4Cq r9 = (X.C262224Cq) r9
            r0.A01 = r9
            r0.A00 = r5
            java.lang.Object r2 = X.C241603Pv.A00(r0)
            if (r2 != r1) goto L_0x04b8
            return r1
        L_0x04b2:
            java.lang.Object r2 = r0.A01
            X.4Cq r9 = X.JTO.A1D(r2, r4)
        L_0x04b8:
            java.util.ArrayList r7 = X.AnonymousClass7TE.A1C()
            java.lang.Object r6 = r0.A03
            java.lang.String r4 = r0.A05
            r3 = 37
            X.MFW r2 = new X.MFW
            r2.<init>(r6, r4, r11, r3)
            X.2Q8 r2 = X.JTO.A1E(r2, r9)
            r0.A01 = r9
            r0.A02 = r7
            r0.A00 = r8
            java.lang.Object r4 = r2.A0E(r0)
            if (r4 != r1) goto L_0x04e2
            return r1
        L_0x04d8:
            java.lang.Object r7 = r0.A02
            java.util.ArrayList r7 = (java.util.ArrayList) r7
            java.lang.Object r2 = r0.A01
            X.4Cq r9 = X.JTO.A1D(r2, r4)
        L_0x04e2:
            X.3JC r4 = (X.AnonymousClass3JC) r4
            java.lang.Object r8 = r0.A03
            java.lang.String r6 = r0.A05
            r3 = 36
            X.MFW r2 = new X.MFW
            r2.<init>(r8, r6, r11, r3)
            X.2Q8 r2 = X.JTO.A1E(r2, r9)
            r0.A01 = r7
            r0.A02 = r4
            r0.A00 = r10
            java.lang.Object r2 = r2.A0E(r0)
            if (r2 == r1) goto L_0x0f19
            r1 = r4
            r4 = r2
            goto L_0x044f
        L_0x0503:
            java.lang.Object r6 = r4.A01
            X.3lr r6 = (X.C250663lr) r6
            if (r6 == 0) goto L_0x0527
            java.lang.Class<X.BoY> r3 = X.BoY.class
            r4 = 0
            r1 = 1960(0x7a8, float:2.747E-42)
            java.lang.String r2 = X.AnonymousClass000.A00(r1)
            r1 = 427598018(0x197ca0c2, float:1.30605594E-23)
            X.3lr r3 = r6.getOptionalTreeField(r4, r2, r3, r1)
            if (r3 == 0) goto L_0x0527
            X.NkX r2 = X.C69393NkX.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r1 = "destination"
            java.lang.Enum r1 = r3.getOptionalEnumField(r4, r1, r2)
            X.NkX r1 = (X.C69393NkX) r1
            if (r1 != 0) goto L_0x0529
        L_0x0527:
            X.NkX r1 = X.C69393NkX.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
        L_0x0529:
            X.0qQ.A0B(r7, r5)
            com.instagram.model.direct.DirectSearchMetaAIResponse r3 = new com.instagram.model.direct.DirectSearchMetaAIResponse
            r3.<init>()
            r3.A01 = r7
            r3.A00 = r1
            java.lang.Object r2 = r0.A03
            X.KX9 r2 = (X.KX9) r2
            X.05G r1 = r2.A02
            java.util.List r0 = X.AnonymousClass7TE.A1I(r3)
            r1.Epw(r0)
            X.05G r0 = r2.A01
            X.AnonymousClass7TF.A1O(r0, r5)
            goto L_0x0f17
        L_0x0549:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x054e:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r7 = 1
            if (r2 == 0) goto L_0x055c
            if (r2 == r7) goto L_0x0577
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x055c:
            X.0eS.A00(r4)
            java.lang.Object r6 = r0.A02
            X.0pa r6 = (X.C61770pa) r6
            java.lang.Object r5 = r0.A01
            java.lang.Object r4 = r0.A03
            java.lang.String r3 = r0.A05
            X.FxF r2 = new X.FxF
            r2.<init>(r4, r5, r3, r7)
            r0.A00 = r7
            java.lang.Object r0 = r6.collect(r2, r0)
            if (r0 != r1) goto L_0x057a
            return r1
        L_0x0577:
            X.0eS.A00(r4)
        L_0x057a:
            X.MCr r0 = X.C51965G9l.A0x()
            throw r0
        L_0x057f:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r8 = 1
            if (r2 == 0) goto L_0x058d
            if (r2 == r8) goto L_0x05c2
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x058d:
            X.0eS.A00(r4)
            java.lang.Object r7 = r0.A03
            X.E41 r7 = (X.E41) r7
            X.0eM r2 = r7.A05
            java.lang.Object r2 = r2.getValue()
            com.instagram.fanclub.gifting.FanClubGiftingViewModel r2 = (com.instagram.fanclub.gifting.FanClubGiftingViewModel) r2
            java.lang.Object r6 = r0.A01
            java.lang.String r5 = r0.A05
            X.Dba.A0j(r8, r6, r5)
            X.Lio r2 = r2.A01
            X.0eP r3 = X.AnonymousClass7TE.A1L(r6, r5)
            java.util.Map r2 = r2.A02
            java.lang.Object r4 = r2.get(r3)
            X.0pa r4 = (X.C61770pa) r4
            if (r4 == 0) goto L_0x0f17
            r3 = 2
            X.FxF r2 = new X.FxF
            r2.<init>(r7, r6, r5, r3)
            r0.A00 = r8
            java.lang.Object r0 = r4.collect(r2, r0)
            if (r0 != r1) goto L_0x05c5
            return r1
        L_0x05c2:
            X.0eS.A00(r4)
        L_0x05c5:
            X.MCr r0 = X.C51965G9l.A0x()
            throw r0
        L_0x05ca:
            X.0eS.A00(r4)
            java.lang.Object r7 = r0.A03
            X.JU5 r7 = (X.JU5) r7
            X.JU5.A00(r7)
            X.0eM r3 = r7.A0M
            int r1 = X.DbX.A07(r3)
            if (r1 <= 0) goto L_0x05eb
            java.util.Random r2 = new java.util.Random
            r2.<init>()
            int r1 = X.DbX.A07(r3)
            int r1 = r2.nextInt(r1)
            if (r1 == 0) goto L_0x05f3
        L_0x05eb:
            X.0eM r1 = r7.A0J
            boolean r1 = X.AnonymousClass7TF.A1Z(r1)
            if (r1 == 0) goto L_0x0819
        L_0x05f3:
            X.KSf r1 = r7.A05
            if (r1 == 0) goto L_0x0607
            java.lang.String r3 = "open_reel_comments"
            X.565 r2 = r1.A00
            if (r2 != 0) goto L_0x0609
            java.lang.String r0 = "productCore"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0607:
            r1 = 0
            goto L_0x0615
        L_0x0609:
            X.0sP r1 = r2.A06
            java.lang.Object r1 = r1.invoke(r3)
            X.LT2 r1 = (X.LT2) r1
            r1.A00 = r2
            X.KSX r1 = (X.KSX) r1
        L_0x0615:
            r7.A06 = r1
            java.lang.Object r6 = r0.A01
            X.4bN r6 = (X.C267324bN) r6
            X.1Xj r1 = r6.A02
            r3 = 0
            if (r1 == 0) goto L_0x06f1
            int r2 = r1.A0r()
        L_0x0624:
            X.KSX r1 = r7.A06
            if (r1 == 0) goto L_0x062d
            X.KSS r1 = r1.A0M
            X.KSS.A01(r1, r2)
        L_0x062d:
            X.1Xj r1 = r6.A02
            if (r1 == 0) goto L_0x0635
            int r3 = r1.A0v()
        L_0x0635:
            X.KSX r1 = r7.A06
            if (r1 == 0) goto L_0x063e
            X.KSS r1 = r1.A0N
            X.KSS.A01(r1, r3)
        L_0x063e:
            java.util.TimeZone r1 = java.util.TimeZone.getDefault()
            java.util.Calendar r2 = java.util.Calendar.getInstance(r1)
            r1 = 11
            int r1 = r2.get(r1)
            double r4 = (double) r1
            r1 = 7
            int r1 = r2.get(r1)
            double r2 = (double) r1
            X.KSX r1 = r7.A06
            if (r1 == 0) goto L_0x0664
            X.KSS r8 = r1.A0L
            java.lang.Double r1 = new java.lang.Double
            r1.<init>(r4)
            double r4 = r1.doubleValue()
            r8.A00 = r4
        L_0x0664:
            X.KSX r1 = r7.A06
            if (r1 == 0) goto L_0x0675
            X.KSS r4 = r1.A0K
            java.lang.Double r1 = new java.lang.Double
            r1.<init>(r2)
            double r1 = r1.doubleValue()
            r4.A00 = r1
        L_0x0675:
            X.KSX r1 = r7.A06
            if (r1 == 0) goto L_0x0680
            X.KSS r2 = r1.A0O
            int r1 = r7.A00
            X.KSS.A01(r2, r1)
        L_0x0680:
            X.KSX r1 = r7.A06
            if (r1 == 0) goto L_0x068b
            X.KSS r2 = r1.A0F
            int r1 = r7.A01
            X.KSS.A01(r2, r1)
        L_0x068b:
            X.KSX r8 = r7.A06
            if (r8 == 0) goto L_0x07f4
            java.util.List r1 = r7.A0A
            long r19 = java.lang.System.currentTimeMillis()
            java.util.Iterator r18 = X.JTP.A0x(r1)
            r10 = 0
            r9 = 0
            r5 = 0
            r4 = 0
        L_0x069d:
            boolean r1 = r18.hasNext()
            if (r1 == 0) goto L_0x06f4
            java.lang.Object r1 = r18.next()
            long r16 = X.AnonymousClass7TE.A0R(r1)
            r14 = 86400(0x15180, double:4.26873E-319)
            java.util.concurrent.TimeUnit r13 = java.util.concurrent.TimeUnit.SECONDS
            r1 = 1
            long r11 = r13.toMillis(r1)
            long r14 = r14 * r11
            long r11 = r19 - r14
            int r3 = (r16 > r11 ? 1 : (r16 == r11 ? 0 : -1))
            if (r3 <= 0) goto L_0x06c6
            int r10 = r10 + 1
        L_0x06bf:
            int r9 = r9 + 1
        L_0x06c1:
            int r5 = r5 + 1
        L_0x06c3:
            int r4 = r4 + 1
            goto L_0x069d
        L_0x06c6:
            r14 = 172800(0x2a300, double:8.53745E-319)
            long r11 = r13.toMillis(r1)
            long r14 = r14 * r11
            long r11 = r19 - r14
            int r3 = (r16 > r11 ? 1 : (r16 == r11 ? 0 : -1))
            if (r3 > 0) goto L_0x06bf
            r14 = 432000(0x69780, double:2.134364E-318)
            long r11 = r13.toMillis(r1)
            long r14 = r14 * r11
            long r11 = r19 - r14
            int r3 = (r16 > r11 ? 1 : (r16 == r11 ? 0 : -1))
            if (r3 > 0) goto L_0x06c1
            r11 = 604800(0x93a80, double:2.98811E-318)
            long r1 = r13.toMillis(r1)
            long r11 = r11 * r1
            long r2 = r19 - r11
            int r1 = (r16 > r2 ? 1 : (r16 == r2 ? 0 : -1))
            if (r1 <= 0) goto L_0x069d
            goto L_0x06c3
        L_0x06f1:
            r2 = 0
            goto L_0x0624
        L_0x06f4:
            X.KSS r1 = r8.A0P
            X.KSS.A00(r1, r10)
            X.KSS r1 = r8.A0Q
            X.KSS.A00(r1, r9)
            X.KSS r1 = r8.A0R
            X.KSS.A00(r1, r5)
            X.KSS r1 = r8.A0S
            X.KSS.A00(r1, r4)
            java.util.List r1 = r7.A0B
            long r19 = java.lang.System.currentTimeMillis()
            java.util.Iterator r18 = X.JTP.A0x(r1)
            r10 = 0
            r9 = 0
            r5 = 0
            r4 = 0
        L_0x0716:
            boolean r1 = r18.hasNext()
            if (r1 == 0) goto L_0x076a
            java.lang.Object r1 = r18.next()
            long r16 = X.AnonymousClass7TE.A0R(r1)
            r14 = 86400(0x15180, double:4.26873E-319)
            java.util.concurrent.TimeUnit r13 = java.util.concurrent.TimeUnit.SECONDS
            r1 = 1
            long r11 = r13.toMillis(r1)
            long r14 = r14 * r11
            long r11 = r19 - r14
            int r3 = (r16 > r11 ? 1 : (r16 == r11 ? 0 : -1))
            if (r3 <= 0) goto L_0x073f
            int r10 = r10 + 1
        L_0x0738:
            int r9 = r9 + 1
        L_0x073a:
            int r5 = r5 + 1
        L_0x073c:
            int r4 = r4 + 1
            goto L_0x0716
        L_0x073f:
            r14 = 172800(0x2a300, double:8.53745E-319)
            long r11 = r13.toMillis(r1)
            long r14 = r14 * r11
            long r11 = r19 - r14
            int r3 = (r16 > r11 ? 1 : (r16 == r11 ? 0 : -1))
            if (r3 > 0) goto L_0x0738
            r14 = 432000(0x69780, double:2.134364E-318)
            long r11 = r13.toMillis(r1)
            long r14 = r14 * r11
            long r11 = r19 - r14
            int r3 = (r16 > r11 ? 1 : (r16 == r11 ? 0 : -1))
            if (r3 > 0) goto L_0x073a
            r11 = 604800(0x93a80, double:2.98811E-318)
            long r1 = r13.toMillis(r1)
            long r11 = r11 * r1
            long r2 = r19 - r11
            int r1 = (r16 > r2 ? 1 : (r16 == r2 ? 0 : -1))
            if (r1 <= 0) goto L_0x0716
            goto L_0x073c
        L_0x076a:
            X.KSS r1 = r8.A0G
            X.KSS.A00(r1, r10)
            X.KSS r1 = r8.A0H
            X.KSS.A00(r1, r9)
            X.KSS r1 = r8.A0I
            X.KSS.A00(r1, r5)
            X.KSS r1 = r8.A0J
            X.KSS.A00(r1, r4)
            java.util.List r1 = r7.A09
            long r19 = java.lang.System.currentTimeMillis()
            java.util.Iterator r18 = X.JTP.A0x(r1)
            r10 = 0
            r9 = 0
            r5 = 0
            r4 = 0
        L_0x078c:
            boolean r1 = r18.hasNext()
            if (r1 == 0) goto L_0x07e0
            java.lang.Object r1 = r18.next()
            long r16 = X.AnonymousClass7TE.A0R(r1)
            r14 = 86400(0x15180, double:4.26873E-319)
            java.util.concurrent.TimeUnit r13 = java.util.concurrent.TimeUnit.SECONDS
            r1 = 1
            long r11 = r13.toMillis(r1)
            long r14 = r14 * r11
            long r11 = r19 - r14
            int r3 = (r16 > r11 ? 1 : (r16 == r11 ? 0 : -1))
            if (r3 <= 0) goto L_0x07b5
            int r10 = r10 + 1
        L_0x07ae:
            int r9 = r9 + 1
        L_0x07b0:
            int r5 = r5 + 1
        L_0x07b2:
            int r4 = r4 + 1
            goto L_0x078c
        L_0x07b5:
            r14 = 172800(0x2a300, double:8.53745E-319)
            long r11 = r13.toMillis(r1)
            long r14 = r14 * r11
            long r11 = r19 - r14
            int r3 = (r16 > r11 ? 1 : (r16 == r11 ? 0 : -1))
            if (r3 > 0) goto L_0x07ae
            r14 = 432000(0x69780, double:2.134364E-318)
            long r11 = r13.toMillis(r1)
            long r14 = r14 * r11
            long r11 = r19 - r14
            int r3 = (r16 > r11 ? 1 : (r16 == r11 ? 0 : -1))
            if (r3 > 0) goto L_0x07b0
            r11 = 604800(0x93a80, double:2.98811E-318)
            long r1 = r13.toMillis(r1)
            long r11 = r11 * r1
            long r2 = r19 - r11
            int r1 = (r16 > r2 ? 1 : (r16 == r2 ? 0 : -1))
            if (r1 <= 0) goto L_0x078c
            goto L_0x07b2
        L_0x07e0:
            X.KSS r1 = r8.A0B
            X.KSS.A00(r1, r10)
            X.KSS r1 = r8.A0C
            X.KSS.A00(r1, r9)
            X.KSS r1 = r8.A0D
            X.KSS.A00(r1, r5)
            X.KSS r1 = r8.A0E
            X.KSS.A00(r1, r4)
        L_0x07f4:
            java.lang.String r4 = r6.getId()
            r7.A08 = r4
            java.lang.String r1 = r0.A05
            r7.A07 = r1
            X.1Xj r1 = r6.A02
            r7.A04 = r1
            int r1 = r0.A00
            r7.A02 = r1
            java.lang.Object r0 = r0.A02
            X.07V r0 = (X.AnonymousClass07V) r0
            r7.A03 = r0
            X.4Cq r3 = r7.A0N
            r2 = 0
            r1 = 20
            X.JaI r0 = new X.JaI
            r0.<init>((java.lang.Object) r7, (java.lang.String) r4, (X.AnonymousClass4D7) r2, (int) r1)
            X.AnonymousClass7TE.A1Z(r0, r3)
        L_0x0819:
            int r0 = r7.A00
            int r0 = r0 + 1
            r7.A00 = r0
            goto L_0x0f17
        L_0x0821:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r8 = 3
            r9 = 2
            r5 = 1
            if (r2 == 0) goto L_0x0835
            if (r2 == r5) goto L_0x0852
            if (r2 == r9) goto L_0x0e76
            if (r2 == r8) goto L_0x0e76
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0835:
            X.0eS.A00(r4)
            java.lang.Object r2 = r0.A02
            X.0sP r2 = (X.0sP) r2
            X.C51968G9o.A1O(r2, r5)
            java.lang.Object r2 = r0.A03
            X.DlI r2 = (X.C46788DlI) r2
            com.instagram.monetization.onboarding.repository.OnboardingRepository r3 = r2.A05
            com.instagram.api.schemas.UserMonetizationProductType r2 = r2.A02()
            r0.A00 = r5
            java.lang.Object r4 = r3.A02(r2, r0)
            if (r4 != r1) goto L_0x0855
            return r1
        L_0x0852:
            X.0eS.A00(r4)
        L_0x0855:
            X.Drz r4 = (X.C47184Drz) r4
            java.lang.Object r7 = r0.A01
            X.EaO r7 = (X.C48182EaO) r7
            boolean r2 = r7 instanceof X.EN3
            r5 = 0
            java.lang.Object r6 = r0.A03
            X.DlI r6 = (X.C46788DlI) r6
            if (r2 == 0) goto L_0x0883
            com.instagram.monetization.onboarding.repository.OnboardingRepository r3 = r6.A05
            com.instagram.api.schemas.UserMonetizationProductType r2 = r6.A02()
            com.instagram.monetization.onboarding.model.ProductOnboardingNextStepInfo r2 = X.C49904FEc.A00(r2, r3)
            if (r2 == 0) goto L_0x0872
            java.lang.String r5 = r2.A02
        L_0x0872:
            X.3ju r3 = r6.A07
            X.EN3 r7 = (X.EN3) r7
            X.KUb r2 = new X.KUb
            r2.<init>(r7, r5)
            r0.A00 = r9
        L_0x087d:
            java.lang.Object r0 = r3.ELH(r2, r0)
            goto L_0x0ee2
        L_0x0883:
            X.2Fj r2 = r6.A02
            java.lang.Object r2 = r2.A02()
            X.Dr0 r2 = (X.Dr0) r2
            if (r2 == 0) goto L_0x0893
            if (r4 == 0) goto L_0x0891
            java.lang.String r5 = r4.A02
        L_0x0891:
            r2.A03 = r5
        L_0x0893:
            com.instagram.monetization.onboarding.repository.OnboardingRepository r3 = r6.A05
            com.instagram.api.schemas.UserMonetizationProductType r2 = r6.A02()
            com.instagram.monetization.onboarding.model.ProductOnboardingNextStepInfo r2 = X.C49904FEc.A00(r2, r3)
            if (r2 != 0) goto L_0x08a9
            X.3ju r3 = r6.A07
            X.KUa r2 = new X.KUa
            r2.<init>()
            r0.A00 = r8
            goto L_0x087d
        L_0x08a9:
            X.6oS r2 = X.C318116oQ.A00(r6)
            java.lang.String r1 = r0.A05
            r0 = 4
            X.DbX.A1W(r6, r1, r2, r0)
            goto L_0x0f17
        L_0x08b5:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r6 = 1
            if (r2 == 0) goto L_0x0947
            if (r2 != r6) goto L_0x0989
            X.0eS.A00(r4)
        L_0x08c1:
            X.3Ii r4 = (X.C239803Ii) r4
            java.lang.Object r3 = r0.A01
            android.content.Context r3 = (android.content.Context) r3
            java.lang.Object r7 = r0.A03
            com.instagram.common.session.UserSession r7 = (com.instagram.common.session.UserSession) r7
            java.lang.Object r5 = r0.A02
            X.1Xj r5 = (X.1Xj) r5
            boolean r0 = r4 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x093e
            r4 = 0
            X.0qQ.A0B(r3, r4)
            X.AnonymousClass7TF.A1B(r7, r6, r5)
            r1 = 2131953197(0x7f13062d, float:1.9542858E38)
            X.6ap r2 = X.DbS.A0a()
            X.6aq r0 = X.C310346aq.SUCCESS
            r2.A0C(r0)
            X.DbS.A19(r3, r2, r1)
            android.content.res.Resources r1 = r3.getResources()
            r0 = 2131165193(0x7f070009, float:1.7944596E38)
            int r0 = r1.getDimensionPixelOffset(r0)
            r2.A02 = r0
            X.DbY.A1N(r2)
            X.1Xy r1 = r5.A0C
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r6)
            r1.EOv(r0)
            X.1E8 r0 = X.1E7.A00(r7)
            r0.A01(r5, r6, r4)
            X.1Ng r1 = X.AnonymousClass1Nd.A00(r7)
            X.INj r0 = new X.INj
            r0.<init>(r5)
            r1.A00(r0)
            X.3Ih r4 = X.C51967G9n.A0d()
        L_0x0919:
            boolean r0 = r4 instanceof X.C239793Ih
            if (r0 != 0) goto L_0x0f17
            boolean r0 = r4 instanceof X.C297815sO
            if (r0 == 0) goto L_0x0984
            X.4dm r1 = X.JTP.A0N(r4)
            X.Dba.A0j(r6, r3, r1)
            boolean r0 = r1 instanceof X.C268674do
            if (r0 == 0) goto L_0x097f
            X.4do r1 = (X.C268674do) r1
            if (r1 == 0) goto L_0x097f
            java.lang.Object r0 = r1.A00
            X.1XT r0 = (X.AnonymousClass1XT) r0
            if (r0 == 0) goto L_0x097f
            java.lang.String r0 = r0.getErrorMessage()
            if (r0 == 0) goto L_0x097f
            goto L_0x0a9e
        L_0x093e:
            boolean r0 = r4 instanceof X.C297815sO
            if (r0 != 0) goto L_0x0919
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0947:
            X.0eS.A00(r4)
            java.lang.Object r4 = r0.A03
            X.0lg r4 = (X.0lg) r4
            java.lang.String r5 = r0.A05
            java.lang.Object r2 = r0.A02
            X.1Xj r2 = (X.1Xj) r2
            java.lang.String r3 = r2.A2n()
            if (r3 == 0) goto L_0x098e
            X.1NY r4 = X.AnonymousClass7TG.A0a(r4)
            java.lang.String r2 = "artists/pin_media/"
            r4.A0A(r2)
            java.lang.String r2 = "music_canonical_id"
            r4.A9m(r2, r5)
            X.JTO.A1W(r4, r3)
            java.lang.Class<X.Duj> r3 = X.C47316Duj.class
            java.lang.Class<X.F4P> r2 = X.F4P.class
            X.1OC r3 = X.DbU.A0S(r4, r3, r2)
            r0.A00 = r6
            r2 = 37310494(0x239501e, float:1.3614646E-37)
            java.lang.Object r4 = r3.A00(r2, r0)
            if (r4 != r1) goto L_0x08c1
            return r1
        L_0x097f:
            r0 = 2131953198(0x7f13062e, float:1.954286E38)
            goto L_0x0aa2
        L_0x0984:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0989:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x098e:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0993:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r6 = 1
            if (r2 == 0) goto L_0x09ce
            if (r2 != r6) goto L_0x0a06
            X.0eS.A00(r4)
        L_0x099f:
            X.3Ii r4 = (X.C239803Ii) r4
            java.lang.Object r3 = r0.A01
            android.content.Context r3 = (android.content.Context) r3
            java.lang.Object r2 = r0.A03
            com.instagram.common.session.UserSession r2 = (com.instagram.common.session.UserSession) r2
            java.lang.Object r1 = r0.A02
            X.1Xj r1 = (X.1Xj) r1
            boolean r0 = r4 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x09c5
            X.GKS.A01(r3, r2, r1)
            X.3Ih r4 = X.C51967G9n.A0d()
        L_0x09b8:
            boolean r0 = r4 instanceof X.C239793Ih
            if (r0 != 0) goto L_0x0f17
            boolean r0 = r4 instanceof X.C297815sO
            if (r0 != 0) goto L_0x0a83
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x09c5:
            boolean r0 = r4 instanceof X.C297815sO
            if (r0 != 0) goto L_0x09b8
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x09ce:
            X.0eS.A00(r4)
            java.lang.Object r4 = r0.A03
            X.0lg r4 = (X.0lg) r4
            java.lang.String r5 = r0.A05
            java.lang.Object r2 = r0.A02
            X.1Xj r2 = (X.1Xj) r2
            java.lang.String r3 = r2.A2n()
            if (r3 == 0) goto L_0x0a0b
            X.1NY r4 = X.AnonymousClass7TG.A0a(r4)
            java.lang.String r2 = "users/remove_artist_pinned_media/"
            r4.A0A(r2)
            java.lang.String r2 = "music_canonical_id"
            r4.A9m(r2, r5)
            X.JTO.A1W(r4, r3)
            java.lang.Class<X.Duj> r3 = X.C47316Duj.class
            java.lang.Class<X.F4P> r2 = X.F4P.class
            X.1OC r3 = X.DbU.A0S(r4, r3, r2)
            r0.A00 = r6
            r2 = 1502362245(0x598c3a85, float:4.933855E15)
            java.lang.Object r4 = r3.A00(r2, r0)
            if (r4 != r1) goto L_0x099f
            return r1
        L_0x0a06:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0a0b:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0a10:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r6 = 1
            if (r2 == 0) goto L_0x0a4b
            if (r2 != r6) goto L_0x0abf
            X.0eS.A00(r4)
        L_0x0a1c:
            X.3Ii r4 = (X.C239803Ii) r4
            java.lang.Object r3 = r0.A01
            android.content.Context r3 = (android.content.Context) r3
            java.lang.Object r2 = r0.A03
            com.instagram.common.session.UserSession r2 = (com.instagram.common.session.UserSession) r2
            java.lang.Object r1 = r0.A02
            X.1Xj r1 = (X.1Xj) r1
            boolean r0 = r4 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0a42
            X.GKS.A01(r3, r2, r1)
            X.3Ih r4 = X.C51967G9n.A0d()
        L_0x0a35:
            boolean r0 = r4 instanceof X.C239793Ih
            if (r0 != 0) goto L_0x0f17
            boolean r0 = r4 instanceof X.C297815sO
            if (r0 != 0) goto L_0x0a83
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0a42:
            boolean r0 = r4 instanceof X.C297815sO
            if (r0 != 0) goto L_0x0a35
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0a4b:
            X.0eS.A00(r4)
            java.lang.Object r4 = r0.A03
            X.0lg r4 = (X.0lg) r4
            java.lang.String r5 = r0.A05
            java.lang.Object r2 = r0.A02
            X.1Xj r2 = (X.1Xj) r2
            java.lang.String r3 = r2.A2n()
            if (r3 == 0) goto L_0x0ac4
            X.1NY r4 = X.AnonymousClass7TG.A0a(r4)
            java.lang.String r2 = "artists/unpin_media/"
            r4.A0A(r2)
            java.lang.String r2 = "music_canonical_id"
            r4.A9m(r2, r5)
            X.JTO.A1W(r4, r3)
            java.lang.Class<X.Duj> r3 = X.C47316Duj.class
            java.lang.Class<X.F4P> r2 = X.F4P.class
            X.1OC r3 = X.DbU.A0S(r4, r3, r2)
            r0.A00 = r6
            r2 = 1502362245(0x598c3a85, float:4.933855E15)
            java.lang.Object r4 = r3.A00(r2, r0)
            if (r4 != r1) goto L_0x0a1c
            return r1
        L_0x0a83:
            X.4dm r1 = X.JTP.A0N(r4)
            X.AnonymousClass7TG.A1N(r3, r1)
            boolean r0 = r1 instanceof X.C268674do
            if (r0 == 0) goto L_0x0abb
            X.4do r1 = (X.C268674do) r1
            if (r1 == 0) goto L_0x0abb
            java.lang.Object r0 = r1.A00
            X.1XT r0 = (X.AnonymousClass1XT) r0
            if (r0 == 0) goto L_0x0abb
            java.lang.String r0 = r0.getErrorMessage()
            if (r0 == 0) goto L_0x0abb
        L_0x0a9e:
            int r0 = X.GKS.A00(r0)
        L_0x0aa2:
            X.6ap r2 = X.DbV.A0X()
            X.DbS.A19(r3, r2, r0)
            android.content.res.Resources r1 = r3.getResources()
            r0 = 2131165193(0x7f070009, float:1.7944596E38)
            int r0 = r1.getDimensionPixelOffset(r0)
            r2.A02 = r0
            X.DbY.A1N(r2)
            goto L_0x0f17
        L_0x0abb:
            r0 = 2131953203(0x7f130633, float:1.954287E38)
            goto L_0x0aa2
        L_0x0abf:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0ac4:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0ac9:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r6 = 1
            if (r2 == 0) goto L_0x0aff
            if (r2 != r6) goto L_0x0b31
            java.lang.Object r1 = r0.A02
            X.4Cq r5 = X.JTO.A1D(r1, r4)
        L_0x0ad8:
            X.FGY r4 = (X.FGY) r4
            X.4Cc r1 = r5.ArX()
            boolean r1 = X.AnonymousClass5H8.A03(r1)
            if (r1 == 0) goto L_0x0f17
            if (r4 == 0) goto L_0x0f17
            java.lang.Object r1 = r0.A03
            androidx.fragment.app.FragmentActivity r1 = X.DbT.A0E(r1)
            android.view.View r2 = r4.A05(r1)
            if (r2 == 0) goto L_0x0f17
            java.lang.Object r1 = r0.A01
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            r1.addView(r2)
            r0 = 0
            r1.setVisibility(r0)
            goto L_0x0f17
        L_0x0aff:
            X.0eS.A00(r4)
            java.lang.Object r5 = r0.A02
            X.4Cq r5 = (X.C262224Cq) r5
            java.lang.Object r4 = r0.A03
            X.E62 r4 = (X.E62) r4
            X.0eM r2 = r4.A02
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r2)
            androidx.fragment.app.FragmentActivity r2 = r4.requireActivity()
            X.0xx r2 = X.AnonymousClass07a.A00(r2)
            com.instagram.nme.contextualpromo.ContextualPromoHelper r7 = new com.instagram.nme.contextualpromo.ContextualPromoHelper
            r7.<init>(r3, r2)
            X.Kiz r8 = X.C62628Kiz.INSET_BANNER
            java.lang.String r2 = r0.A05
            r11 = 0
            r0.A02 = r5
            r0.A00 = r6
            java.lang.String r9 = "IG_ADDRESSES_CONSUMPTION_BOTTOM_SHEET"
            r10 = r2
            r12 = r0
            java.lang.Object r4 = r7.A00(r8, r9, r10, r11, r12)
            if (r4 != r1) goto L_0x0ad8
            return r1
        L_0x0b31:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0b36:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r6 = 1
            if (r2 == 0) goto L_0x0b64
            if (r2 != r6) goto L_0x0c15
            X.0eS.A00(r4)
        L_0x0b42:
            X.3Ii r4 = (X.C239803Ii) r4
            java.lang.Object r3 = r0.A03
            X.Jhv r3 = (X.C60238Jhv) r3
            java.lang.String r8 = r0.A05
            java.lang.Object r5 = r0.A02
            X.0r1 r5 = (X.0r1) r5
            boolean r0 = r4 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0c0c
            X.3Ih r4 = (X.C239793Ih) r4
            java.lang.Object r0 = r4.A00
            X.CEJ r0 = (X.CEJ) r0
            X.Jtc r4 = r0.A00
            if (r4 != 0) goto L_0x0ba9
            X.C41845B3m.A0v()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0b64:
            X.0eS.A00(r4)
            java.lang.Object r2 = r0.A03
            X.Jhv r2 = (X.C60238Jhv) r2
            java.lang.String r7 = r2.A04
            com.instagram.common.session.UserSession r4 = r2.A03
            java.lang.Object r2 = r0.A01
            X.0rm r2 = (X.0rm) r2
            java.lang.Object r5 = r2.A00
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r3 = r0.A05
            r0.A00 = r6
            r2 = 2
            X.0qQ.A0B(r5, r2)
            X.1NY r4 = X.AnonymousClass7TG.A0b(r4)
            java.lang.String r2 = "discover/recs_from_friends_suggestions/"
            r4.A0A(r2)
            java.lang.String r2 = "target_id"
            r4.A9m(r2, r7)
            java.lang.String r2 = "max_id"
            r4.A9m(r2, r5)
            java.lang.String r2 = "query"
            r4.A0G(r2, r3)
            java.lang.Class<X.CEJ> r3 = X.CEJ.class
            java.lang.Class<X.CzQ> r2 = X.C45614CzQ.class
            X.1OC r3 = X.DbU.A0S(r4, r3, r2)
            r2 = 753017114(0x2ce2211a, float:6.4269813E-12)
            java.lang.Object r4 = r3.A00(r2, r0)
            if (r4 != r1) goto L_0x0b42
            return r1
        L_0x0ba9:
            java.util.List r0 = r4.A01
            if (r0 == 0) goto L_0x0f17
            if (r8 != 0) goto L_0x0bb0
            r6 = 0
        L_0x0bb0:
            java.util.ArrayList r9 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r7 = r0.iterator()
        L_0x0bb8:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0bdd
            java.lang.Object r2 = r7.next()
            X.YBK r2 = (X.YBK) r2
            if (r6 != 0) goto L_0x0bd3
            java.util.ArrayList r1 = r3.A05
            r0 = r2
            X.BGA r0 = (X.BGA) r0
            com.instagram.user.model.User r0 = r0.A00
            boolean r0 = X.00k.A0u(r1, r0)
            if (r0 != 0) goto L_0x0bb8
        L_0x0bd3:
            X.BGA r2 = (X.BGA) r2
            com.instagram.user.model.User r0 = r2.A00
            if (r0 == 0) goto L_0x0bb8
            r9.add(r0)
            goto L_0x0bb8
        L_0x0bdd:
            if (r8 != 0) goto L_0x0bec
            java.util.ArrayList r0 = r3.A05
            r0.addAll(r9)
            java.lang.String r0 = r4.A00
            r3.A00 = r0
            boolean r0 = r4.A02
            r3.A02 = r0
        L_0x0bec:
            X.05G r3 = r3.A06
            if (r8 == 0) goto L_0x0c00
            boolean r10 = r4.A02
            java.lang.String r7 = r4.A00
            boolean r11 = r5.A00
            X.JzK r6 = new X.JzK
            r6.<init>(r7, r8, r9, r10, r11)
        L_0x0bfb:
            r3.Epw(r6)
            goto L_0x0f17
        L_0x0c00:
            boolean r2 = r4.A02
            java.lang.String r1 = r4.A00
            boolean r0 = r5.A00
            X.JzJ r6 = new X.JzJ
            r6.<init>(r1, r9, r2, r0)
            goto L_0x0bfb
        L_0x0c0c:
            boolean r0 = r4 instanceof X.C297815sO
            if (r0 != 0) goto L_0x0f17
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0c15:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0c1a:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r6 = 4
            r5 = 3
            r8 = 2
            r7 = 1
            if (r2 == 0) goto L_0x0c31
            if (r2 == r7) goto L_0x0c45
            if (r2 == r8) goto L_0x0c5d
            if (r2 == r5) goto L_0x0c80
            if (r2 == r6) goto L_0x0e76
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0c31:
            X.0eS.A00(r4)
            java.lang.Object r2 = r0.A03
            X.JhQ r2 = (X.C60207JhQ) r2
            X.0V2 r3 = r2.A07
            X.LLm r2 = X.C64068LLm.A00
            r0.A00 = r7
            java.lang.Object r2 = r3.emit(r2, r0)
            if (r2 != r1) goto L_0x0c48
            return r1
        L_0x0c45:
            X.0eS.A00(r4)
        L_0x0c48:
            java.lang.Object r2 = r0.A03
            X.JhQ r2 = (X.C60207JhQ) r2
            com.instagram.reels.prompt.mvvm.data.PromptStickerViewerRepository r4 = r2.A06
            java.lang.String r3 = r0.A05
            java.lang.Object r2 = r0.A01
            com.instagram.api.schemas.MediaPromptPrefType r2 = (com.instagram.api.schemas.MediaPromptPrefType) r2
            r0.A00 = r8
            java.lang.Object r4 = r4.A00(r2, r3, r0)
            if (r4 != r1) goto L_0x0c60
            return r1
        L_0x0c5d:
            X.0eS.A00(r4)
        L_0x0c60:
            java.lang.Object r7 = r0.A03
            X.JhQ r7 = (X.C60207JhQ) r7
            boolean r2 = r4 instanceof X.C239793Ih
            if (r2 == 0) goto L_0x0c77
            X.0V2 r3 = r7.A07
            X.LLl r2 = X.C64067LLl.A00
            r0.A02 = r7
            r0.A00 = r5
            java.lang.Object r2 = r3.emit(r2, r0)
            if (r2 != r1) goto L_0x0c87
            return r1
        L_0x0c77:
            boolean r2 = r4 instanceof X.C297815sO
            if (r2 != 0) goto L_0x0c9a
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0c80:
            java.lang.Object r7 = r0.A02
            X.2YL r7 = (X.2YL) r7
            X.0eS.A00(r4)
        L_0x0c87:
            X.6oS r5 = X.C318116oQ.A00(r7)
            r4 = 0
            r3 = 26
            X.MG3 r2 = new X.MG3
            r2.<init>((java.lang.Object) r7, (X.AnonymousClass4D7) r4, (int) r3)
            X.AnonymousClass7TE.A1Z(r2, r5)
            X.3Ih r4 = X.C51967G9n.A0d()
        L_0x0c9a:
            java.lang.Object r3 = r0.A03
            X.JhQ r3 = (X.C60207JhQ) r3
            boolean r2 = r4 instanceof X.C239793Ih
            if (r2 != 0) goto L_0x0f17
            boolean r2 = r4 instanceof X.C297815sO
            if (r2 == 0) goto L_0x0cb5
            X.0V2 r4 = r3.A07
            X.LLl r3 = X.C64067LLl.A00
            r2 = 0
            r0.A02 = r2
            r0.A00 = r6
            java.lang.Object r0 = r4.emit(r3, r0)
            goto L_0x0ee2
        L_0x0cb5:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0cba:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r8 = 1
            if (r2 == 0) goto L_0x0cc8
            if (r2 == r8) goto L_0x0e76
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0cc8:
            X.0eS.A00(r4)
            java.lang.Object r7 = r0.A03
            X.Lix r7 = (X.C64835Lix) r7
            java.lang.Object r6 = r0.A02
            X.UzF r6 = (X.C16679UzF) r6
            java.lang.Object r3 = r0.A01
            java.util.List r3 = (java.util.List) r3
            java.lang.Integer r2 = X.AnonymousClass05K.A01
            X.0r6 r5 = X.C64835Lix.A04(r6, r7, r2, r3)
            if (r5 == 0) goto L_0x0f17
            java.lang.String r4 = r0.A05
            r3 = 3
            X.MCg r2 = new X.MCg
            r2.<init>((java.lang.Object) r6, (java.lang.Object) r7, (java.lang.String) r4, (int) r3)
            r0.A00 = r8
            java.lang.Object r0 = r5.collect(r2, r0)
            goto L_0x0ee2
        L_0x0cef:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r6 = 2
            r5 = 1
            if (r2 == 0) goto L_0x0d1b
            if (r2 == r5) goto L_0x0d4a
            if (r2 != r6) goto L_0x0d84
            java.lang.Object r2 = r0.A02
            X.N3L r2 = (X.N3L) r2
            java.lang.Object r7 = r0.A01
            X.U91 r7 = (X.U91) r7
            X.0eS.A00(r4)
        L_0x0d06:
            X.VgI r0 = r7.A0B
            r1 = 0
            X.0qQ.A0B(r2, r1)
            com.instagram.common.session.UserSession r0 = r0.A00
            boolean r0 = X.C70271O0b.A00(r0, r2, r1)
            if (r0 == 0) goto L_0x0f17
            X.Vj6 r0 = r7.A06
            r0.A01(r5)
            goto L_0x0f17
        L_0x0d1b:
            X.0eS.A00(r4)
            java.lang.Object r2 = r0.A03
            X.U91 r2 = (X.U91) r2
            X.VtC r2 = r2.A09
            java.lang.String r4 = r0.A05
            r0.A00 = r5
            X.3Pl r3 = X.JTQ.A0m(r0)
            com.instagram.common.session.UserSession r7 = r2.A00
            X.1Av r9 = r2.A03
            r2 = 0
            java.lang.Long r2 = X.C51971G9r.A0n(r2, r4)
            long r11 = X.JTS.A06(r2)
            X.Lr7 r8 = new X.Lr7
            r8.<init>(r3)
            java.lang.String r10 = ""
            X.C66832MdQ.A01(r7, r8, r9, r10, r11)
            java.lang.Object r4 = r3.A00()
            if (r4 != r1) goto L_0x0d4d
            return r1
        L_0x0d4a:
            X.0eS.A00(r4)
        L_0x0d4d:
            X.N3L r4 = (X.N3L) r4
            if (r4 == 0) goto L_0x0f17
            java.lang.Object r7 = r0.A03
            X.U91 r7 = (X.U91) r7
            java.lang.String r3 = r0.A05
            X.UOF r2 = X.U91.A00(r7)
            if (r2 == 0) goto L_0x0d82
            com.instagram.user.model.User r2 = X.C17103VHz.A00(r2)
            if (r2 == 0) goto L_0x0d82
            java.lang.String r2 = r2.getId()
        L_0x0d67:
            boolean r2 = X.0qQ.A0K(r2, r3)
            if (r2 == 0) goto L_0x0f17
            X.0V2 r3 = r7.A0D
            X.Jzn r2 = new X.Jzn
            r2.<init>(r4)
            r0.A01 = r7
            r0.A02 = r4
            r0.A00 = r6
            java.lang.Object r0 = r3.emit(r2, r0)
            if (r0 == r1) goto L_0x0f19
            r2 = r4
            goto L_0x0d06
        L_0x0d82:
            r2 = 0
            goto L_0x0d67
        L_0x0d84:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0d89:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r6 = 1
            if (r2 == 0) goto L_0x0d97
            if (r2 == r6) goto L_0x0e76
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0d97:
            X.0eS.A00(r4)
            java.lang.Object r5 = r0.A03
            com.instagram.xme.threed.repository.Xme3dMediaRepository r5 = (com.instagram.xme.threed.repository.Xme3dMediaRepository) r5
            java.lang.Object r4 = r0.A02
            com.instagram.common.session.UserSession r4 = (com.instagram.common.session.UserSession) r4
            java.lang.String r3 = r0.A05
            java.lang.Object r2 = r0.A01
            X.6WO r2 = (X.AnonymousClass6WO) r2
            r0.A00 = r6
            java.lang.Object r0 = com.instagram.xme.threed.repository.Xme3dMediaRepository.A00(r4, r2, r5, r3, r0)
            goto L_0x0ee2
        L_0x0db0:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r7 = 1
            r6 = 2
            r14 = 0
            if (r2 == 0) goto L_0x0dcb
            if (r2 == r7) goto L_0x0e45
            if (r2 != r6) goto L_0x0e60
            X.0eS.A00(r4)
        L_0x0dc0:
            boolean r0 = X.AnonymousClass7TE.A1a(r4)
            if (r0 == 0) goto L_0x0e5d
        L_0x0dc6:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r7)
            return r1
        L_0x0dcb:
            X.0eS.A00(r4)
            java.lang.String r2 = r0.A05
            java.util.LinkedHashMap r3 = X.C282435Db.A00(r2)
            X.2MU r2 = com.instagram.clips.drafts.model.ClipsDraftPreviewItemRepository.A09
            java.lang.Object r12 = r0.A02
            com.instagram.common.session.UserSession r12 = (com.instagram.common.session.UserSession) r12
            com.instagram.clips.drafts.model.ClipsDraftPreviewItemRepository r9 = r2.A01(r12)
            java.util.LinkedHashMap r10 = X.AnonymousClass7TE.A1H()
            java.util.Iterator r8 = X.AnonymousClass7TF.A0s(r3)
        L_0x0de6:
            boolean r2 = r8.hasNext()
            if (r2 == 0) goto L_0x0e05
            java.util.Map$Entry r5 = X.AnonymousClass7TE.A1J(r8)
            java.lang.String r4 = X.DbT.A13(r5)
            r2 = 3034(0xbda, float:4.252E-42)
            java.lang.String r3 = X.AnonymousClass000.A00(r2)
            r2 = 0
            boolean r2 = X.00l.A0d(r4, r3, r2)
            if (r2 == 0) goto L_0x0de6
            X.JTR.A1U(r10, r5)
            goto L_0x0de6
        L_0x0e05:
            java.util.Iterator r3 = X.AnonymousClass7TF.A0s(r10)
        L_0x0e09:
            boolean r2 = r3.hasNext()
            if (r2 == 0) goto L_0x0e5d
            java.lang.Object r13 = X.C51971G9r.A0p(r3)
            java.lang.String r13 = (java.lang.String) r13
            if (r13 == 0) goto L_0x0e09
            X.12T r3 = X.AnonymousClass12T.A00
            r2 = 875171464(0x342a0e88, float:1.583777E-7)
            X.19S r8 = X.DbY.A0r(r3, r2)
            java.lang.Object r11 = r0.A01
            r15 = 45
            X.MGk r10 = new X.MGk
            r10.<init>(r11, r12, r13, r14, r15)
            X.19B r5 = X.19B.A00
            X.2Q8 r4 = X.1Eo.A02(r5, r10, r8)
            r3 = 8
            X.IlT r2 = new X.IlT
            r2.<init>(r9, r13, r14, r3)
            X.2Q8 r3 = X.1Eo.A02(r5, r2, r8)
            r0.A03 = r3
            r0.A00 = r7
            java.lang.Object r4 = r4.A0E(r0)
            if (r4 != r1) goto L_0x0e4c
            return r1
        L_0x0e45:
            java.lang.Object r3 = r0.A03
            X.2Q9 r3 = (X.AnonymousClass2Q9) r3
            X.0eS.A00(r4)
        L_0x0e4c:
            boolean r2 = X.AnonymousClass7TE.A1a(r4)
            if (r2 == 0) goto L_0x0e5d
            r0.A03 = r14
            r0.A00 = r6
            java.lang.Object r4 = X.JTO.A10(r3, r0)
            if (r4 != r1) goto L_0x0dc0
            return r1
        L_0x0e5d:
            r7 = 0
            goto L_0x0dc6
        L_0x0e60:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0e65:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r9 = 2
            r8 = 1
            if (r2 == 0) goto L_0x0e7b
            if (r2 == r8) goto L_0x0e76
            if (r2 == r9) goto L_0x0e76
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0e76:
            X.0eS.A00(r4)
            goto L_0x0f17
        L_0x0e7b:
            X.0eS.A00(r4)
            java.lang.String r3 = r0.A05
            java.lang.String r2 = "saved"
            boolean r2 = X.0qQ.A0K(r3, r2)
            r7 = 0
            if (r2 == 0) goto L_0x0eb9
            java.lang.Object r2 = r0.A03
            X.H1I r2 = (X.H1I) r2
            X.0eM r2 = r2.A0L
            java.lang.Object r3 = r2.getValue()
            X.GhE r3 = (X.C53023GhE) r3
            java.lang.Object r4 = r0.A02
            X.0r6 r4 = (X.AnonymousClass0r6) r4
            r2 = 0
            X.0qQ.A0B(r4, r2)
            X.Hjg r2 = r3.A04
            X.05G r3 = r2.A00
            r2 = 49
            X.0pm r6 = X.C66193MHj.A01(r4, r3, r2)
            java.lang.Object r4 = r0.A01
            r3 = 24
            r2 = 42
            X.ImR r5 = new X.ImR
            r5.<init>((java.lang.Object) r4, (X.AnonymousClass4D7) r7, (int) r3, (int) r2)
            r0.A00 = r8
        L_0x0eb4:
            java.lang.Object r0 = X.AnonymousClass11O.A00(r0, r5, r6)
            goto L_0x0ee2
        L_0x0eb9:
            java.lang.Object r6 = r0.A02
            X.0r6 r6 = (X.AnonymousClass0r6) r6
            java.lang.Object r4 = r0.A01
            r3 = 25
            r2 = 42
            X.ImR r5 = new X.ImR
            r5.<init>((java.lang.Object) r4, (X.AnonymousClass4D7) r7, (int) r3, (int) r2)
            r0.A00 = r9
            goto L_0x0eb4
        L_0x0ecb:
            X.0eS.A00(r4)
            java.lang.Object r5 = r0.A03
            X.Ies r5 = (X.C57689Ies) r5
            java.lang.String r4 = r0.A05
            java.lang.Object r3 = r0.A01
            X.4bN r3 = (X.C267324bN) r3
            java.lang.Object r2 = r0.A02
            X.371 r2 = (X.AnonymousClass371) r2
            r0.A00 = r6
            java.lang.Object r0 = X.C57689Ies.A00(r2, r3, r5, r4, r0)
        L_0x0ee2:
            if (r0 != r1) goto L_0x0f17
            return r1
        L_0x0ee5:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r9 = 1
            if (r2 == 0) goto L_0x0f28
            if (r2 != r9) goto L_0x0f49
            X.0eS.A00(r4)
        L_0x0ef1:
            X.3Ii r4 = (X.C239803Ii) r4
            java.lang.Object r3 = r0.A03
            com.meta.metaai.imagine.creation.impl.data.ImagineEditRepository r3 = (com.meta.metaai.imagine.creation.impl.data.ImagineEditRepository) r3
            X.I25 r2 = r3.A00
            java.lang.String r1 = "query_end"
            r2.A04(r1)
            boolean r1 = r4 instanceof X.C239793Ih
            if (r1 == 0) goto L_0x0f1a
            X.3Ih r4 = (X.C239793Ih) r4
            java.lang.Object r6 = r4.A00
            X.HtY r6 = (X.C56146HtY) r6
            java.lang.String r8 = r0.A05
            java.lang.Object r7 = r0.A02
            X.HtY r7 = (X.C56146HtY) r7
            r5 = 0
            X.I1n r4 = new X.I1n
            r4.<init>(r5, r6, r7, r8, r9)
            r3.A04(r4)
        L_0x0f17:
            X.0gF r1 = X.C60340gF.A00
        L_0x0f19:
            return r1
        L_0x0f1a:
            boolean r0 = r4 instanceof X.C297815sO
            if (r0 == 0) goto L_0x0f44
            X.5sO r4 = (X.C297815sO) r4
            java.lang.Object r0 = r4.A00
            X.HQf r0 = (X.C54726HQf) r0
            com.meta.metaai.imagine.creation.impl.data.ImagineEditRepository.A01(r3, r0)
            goto L_0x0f17
        L_0x0f28:
            X.0eS.A00(r4)
            java.lang.Object r2 = r0.A03
            com.meta.metaai.imagine.creation.impl.data.ImagineEditRepository r2 = (com.meta.metaai.imagine.creation.impl.data.ImagineEditRepository) r2
            com.meta.metaai.imagine.service.ImagineNetworkService r5 = r2.A02
            java.lang.Object r4 = r0.A01
            X.HtY r4 = (X.C56146HtY) r4
            java.lang.Object r3 = r0.A02
            X.HtY r3 = (X.C56146HtY) r3
            X.HMY r2 = r2.A01
            r0.A00 = r9
            java.lang.Object r4 = com.meta.metaai.imagine.service.ImagineNetworkService.A00(r2, r5, r4, r3, r0)
            if (r4 != r1) goto L_0x0ef1
            return r1
        L_0x0f44:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0f49:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MH6.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((MH6) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MH6(Object obj, Object obj2, String str, AnonymousClass4D7 r5, int i) {
        super(2, r5);
        this.A04 = i;
        this.A03 = obj;
        this.A01 = obj2;
        this.A05 = str;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MH6(AnonymousClass07V r2, C267324bN r3, JU5 ju5, String str, AnonymousClass4D7 r6, int i) {
        super(2, r6);
        this.A04 = 13;
        this.A03 = ju5;
        this.A01 = r3;
        this.A05 = str;
        this.A00 = i;
        this.A02 = r2;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MH6(Object obj, Object obj2, Object obj3, String str, AnonymousClass4D7 r6, int i) {
        super(2, r6);
        this.A04 = i;
        this.A01 = obj;
        this.A05 = str;
        this.A03 = obj2;
        this.A02 = obj3;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MH6(Object obj, String str, AnonymousClass4D7 r4, int i) {
        super(2, r4);
        this.A04 = i;
        this.A03 = obj;
        this.A05 = str;
    }
}
