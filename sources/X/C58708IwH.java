package X;

import android.content.Context;

/* renamed from: X.IwH  reason: case insensitive filesystem */
public final class C58708IwH extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58708IwH(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    public static C58708IwH A01(Object obj, int i) {
        return new C58708IwH(obj, i);
    }

    /* JADX WARNING: type inference failed for: r0v134, types: [X.2VW, java.lang.Object] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0333, code lost:
        if (r0 == null) goto L_0x000e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x0427, code lost:
        if (r10 != 3) goto L_0x0429;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x045f, code lost:
        if (r10 != 3) goto L_0x0461;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x048a, code lost:
        if (r2 != 3) goto L_0x048c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:0x0633, code lost:
        return new X.AnonymousClass3XA();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x0642, code lost:
        return X.C51965G9l.A0D(X.I61.A00(r1, r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x0669, code lost:
        if (r1.equals(r0) == false) goto L_0x065b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:247:0x066b, code lost:
        r1 = r2.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:0x066d, code lost:
        if (r1 == null) goto L_0x0686;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:0x066f, code lost:
        r1.A01(r2.A0C());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:253:0x0680, code lost:
        if (r1.equals(r0) == false) goto L_0x065b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x0682, code lost:
        r2.A0D();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:0x0686, code lost:
        r6 = "feedbackViewModel";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x0693, code lost:
        X.0qQ.A0F(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:260:0x069a, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000b, code lost:
        r0.invoke();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0010, code lost:
        return X.C60340gF.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x02ac, code lost:
        if (r1 == null) goto L_0x000e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x02ae, code lost:
        r0 = r0.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x02b0, code lost:
        r1.invoke(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002d, code lost:
        X.I45.A00((X.C54674HOf) null, X.C54675HOg.A06, r3, (java.lang.Long) null, r5, (java.lang.String) null, (java.lang.String) null, r3.A03.A02.A03);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r20 = this;
            r4 = r20
            int r0 = r4.A00
            switch(r0) {
                case 0: goto L_0x032d;
                case 1: goto L_0x0634;
                case 2: goto L_0x0325;
                case 3: goto L_0x0601;
                case 4: goto L_0x0643;
                case 5: goto L_0x0007;
                case 6: goto L_0x05f1;
                case 7: goto L_0x05e1;
                case 8: goto L_0x05da;
                case 9: goto L_0x05cf;
                case 10: goto L_0x02e0;
                case 11: goto L_0x02bc;
                case 12: goto L_0x05c5;
                case 13: goto L_0x05b2;
                case 14: goto L_0x02b5;
                case 15: goto L_0x02a6;
                case 16: goto L_0x029f;
                case 17: goto L_0x0298;
                case 18: goto L_0x057c;
                case 19: goto L_0x0288;
                case 20: goto L_0x025f;
                case 21: goto L_0x024f;
                case 22: goto L_0x0238;
                case 23: goto L_0x022c;
                case 24: goto L_0x0221;
                case 25: goto L_0x039a;
                case 26: goto L_0x0218;
                case 27: goto L_0x038f;
                case 28: goto L_0x0384;
                case 29: goto L_0x0379;
                case 30: goto L_0x036e;
                case 31: goto L_0x0363;
                case 32: goto L_0x020d;
                case 33: goto L_0x064a;
                case 34: goto L_0x0689;
                case 35: goto L_0x01b5;
                case 36: goto L_0x0177;
                case 37: goto L_0x0045;
                case 38: goto L_0x016e;
                case 39: goto L_0x0164;
                case 40: goto L_0x0155;
                case 41: goto L_0x0136;
                case 42: goto L_0x011d;
                case 43: goto L_0x034c;
                case 44: goto L_0x003d;
                case 45: goto L_0x0023;
                case 46: goto L_0x0018;
                case 47: goto L_0x0007;
                case 48: goto L_0x0337;
                case 49: goto L_0x0011;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r0 = r4.A01
            X.0sa r0 = (X.C62320sa) r0
        L_0x000b:
            r0.invoke()
        L_0x000e:
            X.0gF r4 = X.C60340gF.A00
            return r4
        L_0x0011:
            java.lang.Object r0 = r4.A01
            X.Gw9 r0 = (X.C53903Gw9) r0
            X.0sa r0 = r0.A02
            goto L_0x000b
        L_0x0018:
            java.lang.Object r0 = r4.A01
            X.Gte r0 = (X.C53749Gte) r0
            com.meta.metaai.writewithai.creation.impl.viewmodel.WriteWithAICreationViewModel r0 = r0.A00
            X.I45 r3 = r0.A04
            java.lang.String r5 = "prompt_suggestion_pill_impression"
            goto L_0x002d
        L_0x0023:
            java.lang.Object r0 = r4.A01
            X.Gte r0 = (X.C53749Gte) r0
            com.meta.metaai.writewithai.creation.impl.viewmodel.WriteWithAICreationViewModel r0 = r0.A00
            X.I45 r3 = r0.A04
            java.lang.String r5 = "composer_impression"
        L_0x002d:
            r1 = 0
            X.HOg r2 = X.C54675HOg.SUGGESTED_PROMPT
            X.I1x r0 = r3.A03
            X.HtJ r0 = r0.A02
            java.lang.String r8 = r0.A03
            r4 = r1
            r6 = r1
            r7 = r1
            X.I45.A00(r1, r2, r3, r4, r5, r6, r7, r8)
            goto L_0x000e
        L_0x003d:
            java.lang.Object r0 = r4.A01
            X.7cD r0 = (X.C334997cD) r0
            r0.A00()
            goto L_0x000e
        L_0x0045:
            java.lang.Object r0 = r4.A01
            X.HIp r0 = (X.C54554HIp) r0
            X.I4X r3 = X.C54554HIp.A00(r0)
            r1 = 9
            X.J6f r2 = X.C59097J6f.A01(r0, r1)
            java.lang.String r5 = "WriteWithAIBadReasonBottomSheet"
            r7 = 0
            r0.A0E(r3, r5, r2)
            java.lang.String r4 = r0.A0C()
            if (r4 == 0) goto L_0x000e
            int r3 = r4.hashCode()
            r2 = -1408769476(0xffffffffac07e23c, float:-1.931024E-12)
            if (r3 == r2) goto L_0x0108
            r2 = -1071416520(0xffffffffc0237b38, float:-2.5543957)
            java.lang.String r6 = "feedbackViewModel"
            if (r3 == r2) goto L_0x00e5
            r2 = 1322647522(0x4ed5ffe2, float:1.79515827E9)
            if (r3 != r2) goto L_0x000e
            java.lang.String r2 = "WriteWithAIFeedbackBottomSheet"
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L_0x000e
            X.Gh8 r4 = r0.A00
            if (r4 == 0) goto L_0x0693
            android.app.Application r3 = r4.A00
            r2 = 2131966431(0x7f1339df, float:1.95697E38)
            java.lang.String r11 = X.AnonymousClass7TE.A16(r3, r2)
            r2 = 2131966430(0x7f1339de, float:1.9569698E38)
            java.lang.String r18 = X.AnonymousClass7TE.A16(r3, r2)
            X.HNN r13 = X.HNN.A0E
            r2 = 40
            X.J6n r19 = X.C59105J6n.A02(r4, r2)
        L_0x0098:
            X.HNN r14 = X.HNN.A0F
            X.HNO r15 = X.HNO.A0W
            java.lang.Integer r17 = X.AnonymousClass05K.A00
            X.I1u r10 = new X.I1u
            r12 = r10
            r16 = r7
            r12.<init>(r13, r14, r15, r16, r17, r18, r19)
            java.lang.Integer r13 = X.AnonymousClass05K.A05
            long r15 = X.C51970G9q.A0J()
            r17 = 0
            r18 = 1
            java.lang.Integer r14 = X.AnonymousClass05K.A0C
            X.HtX r6 = new X.HtX
            r8 = r7
            r9 = r7
            r12 = r7
            r19 = r18
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r17, r18, r19)
        L_0x00bc:
            java.lang.Integer r14 = r0.A03
            java.lang.CharSequence r11 = r6.A06
            java.lang.Integer r13 = r6.A08
            long r15 = r6.A00
            boolean r3 = r6.A0B
            X.I1u r10 = r6.A04
            X.HtV r9 = r6.A03
            boolean r2 = r6.A09
            X.2WX r8 = r6.A02
            android.graphics.drawable.Drawable r7 = r6.A01
            java.lang.CharSequence r12 = r6.A05
            r19 = 1
            X.0qQ.A0B(r14, r1)
            X.HtX r6 = new X.HtX
            r17 = r3
            r18 = r2
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r17, r18, r19)
            r0.A0G(r6)
            goto L_0x000e
        L_0x00e5:
            boolean r2 = r4.equals(r5)
            if (r2 == 0) goto L_0x000e
            X.Gh8 r4 = r0.A00
            if (r4 == 0) goto L_0x0693
            android.app.Application r3 = r4.A00
            r2 = 2131966439(0x7f1339e7, float:1.9569716E38)
            java.lang.String r11 = X.AnonymousClass7TE.A16(r3, r2)
            r2 = 2131966438(0x7f1339e6, float:1.9569714E38)
            java.lang.String r18 = X.AnonymousClass7TE.A16(r3, r2)
            X.HNN r13 = X.HNN.A0E
            r2 = 41
            X.J6n r19 = X.C59105J6n.A02(r4, r2)
            goto L_0x0098
        L_0x0108:
            java.lang.String r2 = "WriteWithAIActivity"
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L_0x000e
            com.meta.metaai.writewithai.creation.impl.viewmodel.WriteWithAICreationViewModel r2 = r0.A02
            if (r2 != 0) goto L_0x0118
            java.lang.String r6 = "viewModel"
            goto L_0x0693
        L_0x0118:
            X.HtX r6 = r2.A08()
            goto L_0x00bc
        L_0x011d:
            java.lang.Object r0 = r4.A01
            X.HIp r0 = (X.C54554HIp) r0
            com.meta.metaai.writewithai.creation.impl.viewmodel.WriteWithAICreationViewModel r1 = r0.A02
            java.lang.String r6 = "viewModel"
            if (r1 == 0) goto L_0x0693
            X.0Ud r0 = r1.A0D
            java.lang.Object r0 = r0.getValue()
            X.HtT r0 = (X.C56141HtT) r0
            java.lang.String r0 = r0.A06
            r1.A0A(r0)
            goto L_0x000e
        L_0x0136:
            java.lang.Object r0 = r4.A01
            X.HIp r0 = (X.C54554HIp) r0
            X.0eM r0 = r0.A09
            java.lang.Object r1 = r0.getValue()
            X.Hmm r1 = (X.C55751Hmm) r1
            android.app.Application r0 = r1.A00
            android.content.Context r2 = r0.getApplicationContext()
            com.meta.foa.session.FoaUserSession r1 = r1.A02
            r0 = 299(0x12b, float:4.19E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.C250563lf.A0T(r2, r1, r0)
            goto L_0x000e
        L_0x0155:
            java.lang.Object r0 = r4.A01
            X.HIp r0 = (X.C54554HIp) r0
            X.0sP r1 = r0.A04
            if (r1 == 0) goto L_0x000e
            X.HIl r0 = new X.HIl
            r0.<init>()
            goto L_0x02b0
        L_0x0164:
            java.lang.Object r1 = r4.A01
            X.I4d r1 = (X.C56604I4d) r1
            r0 = 0
            r1.A0H(r0)
            goto L_0x000e
        L_0x016e:
            java.lang.Object r0 = r4.A01
            X.I4d r0 = (X.C56604I4d) r0
            r0.A0D()
            goto L_0x000e
        L_0x0177:
            java.lang.Object r0 = r4.A01
            X.HIp r0 = (X.C54554HIp) r0
            X.Gh8 r5 = r0.A00
            if (r5 == 0) goto L_0x0686
            X.Hml r0 = r5.A01
            X.Hzd r4 = r0.A00
            X.HQ8 r0 = r0.A01
            X.HIn r0 = (X.C54552HIn) r0
            java.lang.Integer r0 = r0.A00
            X.XSJ r3 = X.XXw.A00(r0)
            X.HOe r2 = X.C54673HOe.WRITE
            X.DbY.A1S(r3, r2)
            java.lang.String r1 = "negative_feedback_click"
            r0 = 0
            X.C56507Hzd.A00(r2, r3, r4, r1, r0)
            X.05G r3 = r5.A03
            java.lang.Object r0 = r3.getValue()
            X.I1d r0 = (X.C56549I1d) r0
            java.lang.String r2 = "WriteWithAIBadReasonBottomSheet"
            X.Hsu r1 = r0.A00
            X.I1d r0 = new X.I1d
            r0.<init>(r1, r2)
            r3.Epw(r0)
            X.05G r1 = r5.A04
            X.I1P r0 = X.I1P.A00
            r1.Epw(r0)
            goto L_0x000e
        L_0x01b5:
            java.lang.Object r0 = r4.A01
            X.HIp r0 = (X.C54554HIp) r0
            X.Gh8 r5 = r0.A00
            if (r5 == 0) goto L_0x0686
            java.lang.String r8 = X.C54554HIp.A01(r0)
            java.lang.String r7 = X.C54554HIp.A02(r0)
            X.AnonymousClass7TG.A1N(r8, r7)
            X.Hml r0 = r5.A01
            X.Hzd r4 = r0.A00
            X.HQ8 r0 = r0.A01
            X.HIn r0 = (X.C54552HIn) r0
            java.lang.Integer r0 = r0.A00
            X.XSJ r3 = X.XXw.A00(r0)
            X.HOe r2 = X.C54673HOe.WRITE
            X.DbY.A1S(r3, r2)
            java.lang.String r1 = "feedback_submitted"
            java.lang.String r0 = "thumbs_up"
            X.C56507Hzd.A00(r2, r3, r4, r1, r0)
            X.HMN r6 = X.HMN.GOOD_CHIP
            X.1tE r0 = X.C67391tE.A00
            r9 = 0
            r10 = 22
            X.MGN r4 = new X.MGN
            r4.<init>(r5, r6, r7, r8, r9, r10)
            X.AnonymousClass7TE.A1Z(r4, r0)
            X.05G r2 = r5.A04
        L_0x01f3:
            java.lang.Object r1 = r2.getValue()
            X.I1R r0 = X.I1R.A00
            boolean r0 = r2.AIY(r1, r0)
            if (r0 == 0) goto L_0x01f3
        L_0x01ff:
            java.lang.Object r1 = r2.getValue()
            X.I1L r0 = X.I1L.A00
            boolean r0 = r2.AIY(r1, r0)
            if (r0 == 0) goto L_0x01ff
            goto L_0x000e
        L_0x020d:
            java.lang.Object r0 = r4.A01
            X.GvY r0 = (X.C53867GvY) r0
            X.GbJ r0 = r0.A00
            r0.A03()
            goto L_0x000e
        L_0x0218:
            java.lang.Object r0 = r4.A01
            X.1TY r0 = (X.1TY) r0
            r0.A04()
            goto L_0x000e
        L_0x0221:
            java.lang.Object r0 = r4.A01
            X.Gt0 r0 = (X.C53709Gt0) r0
            X.GhS r0 = r0.A01
            r0.A03()
            goto L_0x000e
        L_0x022c:
            java.lang.Object r0 = r4.A01
            X.Gt0 r0 = (X.C53709Gt0) r0
            X.GhS r1 = r0.A01
            r0 = 1
            r1.A05(r0)
            goto L_0x000e
        L_0x0238:
            java.lang.Object r2 = r4.A01
            X.U4M r2 = (X.U4M) r2
            X.WKh r1 = r2.A00
            if (r1 == 0) goto L_0x024a
            X.W1V r0 = r1.A00
            if (r0 == 0) goto L_0x0247
            r0.A03()
        L_0x0247:
            r0 = 0
            r1.A00 = r0
        L_0x024a:
            r0 = 0
            r2.A00 = r0
            goto L_0x000e
        L_0x024f:
            java.lang.Object r2 = r4.A01
            X.Gdd r2 = (X.C52847Gdd) r2
            X.4Co r1 = r2.A00
            r0 = 0
            if (r1 == 0) goto L_0x025b
            r1.AG7(r0)
        L_0x025b:
            r2.A00 = r0
            goto L_0x000e
        L_0x025f:
            java.lang.Object r3 = r4.A01
            X.QAQ r3 = (X.QAQ) r3
            r2 = 0
            r3.A02 = r2
            java.util.Set r1 = r3.A09
            X.RET r0 = X.RET.PLAY_OPTION
            r1.add(r0)
            X.Q6Y r1 = r3.A08
            java.util.ArrayList r0 = r1.A0e
            r0.clear()
            X.Q50 r0 = r1.A0c
            r0.cancel()
            boolean r0 = r1.isVisible()
            if (r0 != 0) goto L_0x0283
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            r1.A0M = r0
        L_0x0283:
            r3.setImageResource(r2)
            goto L_0x000e
        L_0x0288:
            java.lang.Object r2 = r4.A01
            X.Ge2 r2 = (X.C52869Ge2) r2
            X.HlT r1 = r2.A00
            if (r1 == 0) goto L_0x0293
            r0 = 0
            r1.A00 = r0
        L_0x0293:
            r0 = 0
            r2.A00 = r0
            goto L_0x000e
        L_0x0298:
            java.lang.Object r0 = r4.A01
            X.Gw0 r0 = (X.C53895Gw0) r0
            X.0sP r1 = r0.A02
            goto L_0x02ae
        L_0x029f:
            java.lang.Object r0 = r4.A01
            X.Gw0 r0 = (X.C53895Gw0) r0
            X.0sP r1 = r0.A03
            goto L_0x02ac
        L_0x02a6:
            java.lang.Object r0 = r4.A01
            X.Gw0 r0 = (X.C53895Gw0) r0
            X.0sP r1 = r0.A01
        L_0x02ac:
            if (r1 == 0) goto L_0x000e
        L_0x02ae:
            X.Hsu r0 = r0.A00
        L_0x02b0:
            r1.invoke(r0)
            goto L_0x000e
        L_0x02b5:
            java.lang.Object r0 = r4.A01
            X.Gvn r0 = (X.C53882Gvn) r0
            X.0sa r0 = r0.A00
            goto L_0x0333
        L_0x02bc:
            java.lang.Object r3 = r4.A01
            X.HtS r3 = (X.C56140HtS) r3
            X.F3q r2 = r3.A02
            X.G9A r0 = r2.A00
            if (r0 == 0) goto L_0x02d9
            android.view.Window r0 = r0.CGd()
            if (r0 == 0) goto L_0x02d9
            android.view.View r1 = r0.getDecorView()
            if (r1 == 0) goto L_0x02d9
            r0 = 0
            X.AnonymousClass03j.A00(r1, r0)
            X.04a.A01(r1, r0)
        L_0x02d9:
            r0 = 0
            r2.A03(r0)
            X.01W r5 = r3.A04
            goto L_0x0320
        L_0x02e0:
            java.lang.Object r4 = r4.A01
            X.HtS r4 = (X.C56140HtS) r4
            X.01W r5 = r4.A04
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L_0x000e
            java.lang.Object r0 = r5.A0Q()
            X.Hsw r0 = (X.C56109Hsw) r0
            java.lang.String r3 = r0.A00
            if (r3 == 0) goto L_0x0303
            r2 = 0
            r1 = 37
            X.Phm r0 = new X.Phm
            r0.<init>(r2, r4, r3, r1)
            r4.A01(r0)
            goto L_0x000e
        L_0x0303:
            X.F3q r2 = r4.A02
            X.G9A r0 = r2.A00
            if (r0 == 0) goto L_0x031c
            android.view.Window r0 = r0.CGd()
            if (r0 == 0) goto L_0x031c
            android.view.View r1 = r0.getDecorView()
            if (r1 == 0) goto L_0x031c
            r0 = 0
            X.AnonymousClass03j.A00(r1, r0)
            X.04a.A01(r1, r0)
        L_0x031c:
            r0 = 0
            r2.A03(r0)
        L_0x0320:
            r5.clear()
            goto L_0x000e
        L_0x0325:
            java.lang.Object r0 = r4.A01
            X.Gui r0 = (X.C53815Gui) r0
            X.0sa r0 = r0.A02
            goto L_0x000b
        L_0x032d:
            java.lang.Object r0 = r4.A01
            X.5tc r0 = (X.C298535tc) r0
            X.0sa r0 = r0.A06
        L_0x0333:
            if (r0 == 0) goto L_0x000e
            goto L_0x000b
        L_0x0337:
            java.lang.Object r0 = r4.A01
            X.GbJ r0 = (X.C52706GbJ) r0
            java.lang.CharSequence r0 = r0.A00()
            java.lang.CharSequence r0 = X.00l.A0B(r0)
            boolean r0 = X.00l.A0W(r0)
            java.lang.Boolean r4 = X.DbT.A0l(r0)
            return r4
        L_0x034c:
            java.lang.String r1 = "meta_ai_wwai_response_"
            java.lang.Object r0 = r4.A01
            X.Gul r0 = (X.C53818Gul) r0
            int r0 = r0.A00
            java.lang.String r1 = X.002.A0O(r1, r0)
            X.2VW r0 = new X.2VW
            r0.<init>()
            X.Hse r4 = new X.Hse
            r4.<init>(r0, r1)
            return r4
        L_0x0363:
            java.lang.Object r1 = r4.A01
            X.3Y5 r1 = (X.AnonymousClass3Y5) r1
            X.HNN r0 = X.HNN.A0S
            android.graphics.drawable.Drawable r4 = X.I61.A03(r1, r0)
            return r4
        L_0x036e:
            java.lang.Object r1 = r4.A01
            X.3Y5 r1 = (X.AnonymousClass3Y5) r1
            X.HNN r0 = X.HNN.A0R
            android.graphics.drawable.Drawable r4 = X.I61.A03(r1, r0)
            return r4
        L_0x0379:
            java.lang.Object r0 = r4.A01
            X.Gt1 r0 = (X.C53710Gt1) r0
            int r0 = r0.A00
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            return r4
        L_0x0384:
            java.lang.Object r0 = r4.A01
            X.IdB r0 = (X.C57584IdB) r0
            android.content.Context r0 = r0.A00
            android.content.Context r4 = X.2Yn.A02(r0)
            return r4
        L_0x038f:
            java.lang.Object r0 = r4.A01
            X.IdB r0 = (X.C57584IdB) r0
            android.content.Context r0 = r0.A00
            android.content.Context r4 = X.2Yn.A01(r0)
            return r4
        L_0x039a:
            java.lang.Object r0 = r4.A01
            X.Gt0 r0 = (X.C53709Gt0) r0
            X.GhS r7 = r0.A01
            X.HLw r0 = r7.A07
            int r1 = r0.ordinal()
            r5 = 0
            if (r1 == r5) goto L_0x04e7
            r0 = 3
            if (r1 == r0) goto L_0x04a1
            r0 = 1
            if (r1 == r0) goto L_0x03ba
            r0 = 2
            if (r1 == r0) goto L_0x03ba
            X.0sn r0 = X.0sn.A00
            X.Hsg r4 = new X.Hsg
            r4.<init>(r0, r5)
            return r4
        L_0x03ba:
            java.lang.String r0 = r7.A08
            java.lang.Integer r11 = X.I3J.A00(r0)
            java.util.ArrayList r6 = X.AnonymousClass7TE.A1C()
            boolean r3 = r7.A0B
            if (r3 == 0) goto L_0x049d
            X.HNN r10 = X.HNN.A0d
        L_0x03ca:
            android.app.Application r4 = r7.A01
            r0 = 2131966359(0x7f133997, float:1.9569554E38)
            java.lang.String r9 = X.AnonymousClass7TE.A16(r4, r0)
            if (r3 == 0) goto L_0x047a
            r0 = 2131966381(0x7f1339ad, float:1.9569599E38)
            java.lang.String r0 = r4.getString(r0)
        L_0x03dc:
            X.0qQ.A0A(r0)
            r8 = 0
            X.Hsh r1 = new X.Hsh
            r1.<init>(r0, r8)
            X.Hsx r0 = new X.Hsx
            r0.<init>(r10, r1, r9)
            r6.add(r0)
            X.HNN r9 = X.HNN.A04
            r0 = 2131966358(0x7f133996, float:1.9569552E38)
            java.lang.String r2 = X.AnonymousClass7TE.A16(r4, r0)
            if (r3 == 0) goto L_0x044f
            r0 = 2131966380(0x7f1339ac, float:1.9569596E38)
            java.lang.String r1 = X.AnonymousClass7TE.A16(r4, r0)
            X.Hsh r0 = new X.Hsh
            r0.<init>(r1, r8)
        L_0x0404:
            X.Hsx r1 = new X.Hsx
            r1.<init>(r9, r0, r2)
            r6.add(r1)
            if (r3 != 0) goto L_0x043c
            X.HNN r9 = X.HNN.A02
            r0 = 2131966372(0x7f1339a4, float:1.956958E38)
            java.lang.String r2 = X.AnonymousClass7TE.A16(r4, r0)
            int r10 = r11.intValue()
            r0 = 1
            if (r10 == r0) goto L_0x0442
            if (r10 == r5) goto L_0x0429
            r0 = 4
            if (r10 == r0) goto L_0x0429
            r1 = 3
            r0 = 2131966385(0x7f1339b1, float:1.9569607E38)
            if (r10 == r1) goto L_0x042c
        L_0x0429:
            r0 = 2131966376(0x7f1339a8, float:1.9569588E38)
        L_0x042c:
            java.lang.String r0 = X.AnonymousClass7TE.A16(r4, r0)
            X.Hsh r1 = A00(r4, r7, r0)
        L_0x0434:
            X.Hsx r0 = new X.Hsx
            r0.<init>(r9, r1, r2)
            r6.add(r0)
        L_0x043c:
            java.util.List r0 = X.00k.A0a(r6)
            goto L_0x04e1
        L_0x0442:
            r0 = 2131966384(0x7f1339b0, float:1.9569605E38)
            java.lang.String r0 = X.AnonymousClass7TE.A16(r4, r0)
            X.Hsh r1 = new X.Hsh
            r1.<init>(r0, r8)
            goto L_0x0434
        L_0x044f:
            int r10 = r11.intValue()
            r0 = 1
            if (r10 == r0) goto L_0x046e
            if (r10 == r5) goto L_0x0461
            r0 = 4
            if (r10 == r0) goto L_0x0461
            r1 = 3
            r0 = 2131966377(0x7f1339a9, float:1.956959E38)
            if (r10 == r1) goto L_0x0464
        L_0x0461:
            r0 = 2131966375(0x7f1339a7, float:1.9569586E38)
        L_0x0464:
            java.lang.String r1 = X.AnonymousClass7TE.A16(r4, r0)
            X.Hsh r0 = new X.Hsh
            r0.<init>(r1, r8)
            goto L_0x0404
        L_0x046e:
            r0 = 2131966382(0x7f1339ae, float:1.95696E38)
            java.lang.String r0 = X.AnonymousClass7TE.A16(r4, r0)
            X.Hsh r0 = A00(r4, r7, r0)
            goto L_0x0404
        L_0x047a:
            int r2 = r11.intValue()
            r0 = 1
            if (r2 == r0) goto L_0x048c
            if (r2 == r5) goto L_0x0499
            r0 = 4
            if (r2 == r0) goto L_0x0495
            r1 = 3
            r0 = 2131966378(0x7f1339aa, float:1.9569592E38)
            if (r2 == r1) goto L_0x048f
        L_0x048c:
            r0 = 2131966383(0x7f1339af, float:1.9569603E38)
        L_0x048f:
            java.lang.String r0 = X.AnonymousClass7TE.A16(r4, r0)
            goto L_0x03dc
        L_0x0495:
            r0 = 2131966379(0x7f1339ab, float:1.9569594E38)
            goto L_0x048f
        L_0x0499:
            r0 = 2131966374(0x7f1339a6, float:1.9569584E38)
            goto L_0x048f
        L_0x049d:
            X.HNN r10 = X.HNN.A0Q
            goto L_0x03ca
        L_0x04a1:
            X.HNN r3 = X.HNN.A0d
            android.app.Application r6 = r7.A01
            r0 = 2131966359(0x7f133997, float:1.9569554E38)
            java.lang.String r2 = X.AnonymousClass7TE.A16(r6, r0)
            r0 = 2131966361(0x7f133999, float:1.9569558E38)
            java.lang.String r1 = X.AnonymousClass7TE.A16(r6, r0)
            r5 = 0
            X.Hsh r0 = new X.Hsh
            r0.<init>(r1, r5)
            X.Hsx r4 = new X.Hsx
            r4.<init>(r3, r0, r2)
            X.HNN r3 = X.HNN.A04
            r0 = 2131966358(0x7f133996, float:1.9569552E38)
            java.lang.String r2 = X.AnonymousClass7TE.A16(r6, r0)
            r0 = 2131966366(0x7f13399e, float:1.9569568E38)
            java.lang.String r0 = X.AnonymousClass7TE.A16(r6, r0)
            X.Hsh r1 = new X.Hsh
            r1.<init>(r0, r5)
            X.Hsx r0 = new X.Hsx
            r0.<init>(r3, r1, r2)
            r3 = 1
            X.Hsx[] r0 = new X.C56110Hsx[]{r4, r0}
            java.util.List r0 = X.0sr.A1P(r0)
        L_0x04e1:
            X.Hsg r4 = new X.Hsg
            r4.<init>(r0, r3)
            return r4
        L_0x04e7:
            java.lang.String r0 = r7.A08
            X.Nky r0 = X.C69416Nky.valueOf(r0)
            int r9 = r0.ordinal()
            switch(r9) {
                case 15: goto L_0x0578;
                case 16: goto L_0x04f4;
                case 17: goto L_0x04f4;
                case 18: goto L_0x0578;
                case 19: goto L_0x04f4;
                case 20: goto L_0x0578;
                case 21: goto L_0x0578;
                case 22: goto L_0x0578;
                case 23: goto L_0x0578;
                case 24: goto L_0x04f4;
                case 25: goto L_0x0578;
                case 26: goto L_0x04f4;
                case 27: goto L_0x0578;
                default: goto L_0x04f4;
            }
        L_0x04f4:
            X.HNN r3 = X.HNN.A0d
        L_0x04f6:
            android.app.Application r8 = r7.A01
            r0 = 2131966359(0x7f133997, float:1.9569554E38)
            java.lang.String r2 = X.AnonymousClass7TE.A16(r8, r0)
            switch(r9) {
                case 2: goto L_0x0564;
                case 3: goto L_0x0568;
                case 4: goto L_0x056c;
                case 5: goto L_0x0570;
                case 6: goto L_0x0570;
                case 7: goto L_0x0502;
                case 8: goto L_0x0502;
                case 9: goto L_0x0502;
                case 10: goto L_0x0502;
                case 11: goto L_0x0502;
                case 12: goto L_0x0502;
                case 13: goto L_0x0502;
                case 14: goto L_0x0568;
                case 15: goto L_0x0502;
                case 16: goto L_0x0570;
                case 17: goto L_0x0570;
                case 18: goto L_0x0502;
                case 19: goto L_0x0564;
                case 20: goto L_0x0568;
                case 21: goto L_0x0568;
                case 22: goto L_0x0568;
                case 23: goto L_0x0568;
                case 24: goto L_0x0502;
                case 25: goto L_0x0568;
                case 26: goto L_0x0502;
                case 27: goto L_0x0568;
                case 28: goto L_0x0502;
                case 29: goto L_0x0502;
                case 30: goto L_0x0574;
                case 31: goto L_0x0502;
                case 32: goto L_0x0502;
                case 33: goto L_0x0570;
                case 34: goto L_0x0570;
                default: goto L_0x0502;
            }
        L_0x0502:
            r0 = 2131966370(0x7f1339a2, float:1.9569576E38)
        L_0x0505:
            java.lang.String r1 = X.AnonymousClass7TE.A16(r8, r0)
            r4 = 0
            X.Hsh r0 = new X.Hsh
            r0.<init>(r1, r4)
            X.Hsx r6 = new X.Hsx
            r6.<init>(r3, r0, r2)
            switch(r9) {
                case 0: goto L_0x055e;
                case 1: goto L_0x0561;
                case 2: goto L_0x0517;
                case 3: goto L_0x0561;
                case 4: goto L_0x0517;
                case 5: goto L_0x0561;
                case 6: goto L_0x0561;
                case 7: goto L_0x0517;
                case 8: goto L_0x0517;
                case 9: goto L_0x0517;
                case 10: goto L_0x0517;
                case 11: goto L_0x0517;
                case 12: goto L_0x0517;
                case 13: goto L_0x0517;
                case 14: goto L_0x0561;
                case 15: goto L_0x0561;
                case 16: goto L_0x055e;
                case 17: goto L_0x055e;
                case 18: goto L_0x0561;
                case 19: goto L_0x0517;
                case 20: goto L_0x0561;
                case 21: goto L_0x0561;
                case 22: goto L_0x0561;
                case 23: goto L_0x0561;
                case 24: goto L_0x0517;
                case 25: goto L_0x0561;
                case 26: goto L_0x0517;
                case 27: goto L_0x0561;
                case 28: goto L_0x0517;
                case 29: goto L_0x0517;
                case 30: goto L_0x055e;
                case 31: goto L_0x0517;
                case 32: goto L_0x0517;
                case 33: goto L_0x055e;
                case 34: goto L_0x055e;
                default: goto L_0x0517;
            }
        L_0x0517:
            X.HNN r3 = X.HNN.A04
        L_0x0519:
            r0 = 2131966358(0x7f133996, float:1.9569552E38)
            java.lang.String r2 = X.AnonymousClass7TE.A16(r8, r0)
            r1 = 4
            r0 = 2131966368(0x7f1339a0, float:1.9569572E38)
            if (r9 != r1) goto L_0x0529
            r0 = 2131966360(0x7f133998, float:1.9569556E38)
        L_0x0529:
            java.lang.String r1 = X.AnonymousClass7TE.A16(r8, r0)
            X.Hsh r0 = new X.Hsh
            r0.<init>(r1, r4)
            X.Hsx r4 = new X.Hsx
            r4.<init>(r3, r0, r2)
            X.HNN r3 = X.HNN.A02
            r0 = 2131966372(0x7f1339a4, float:1.956958E38)
            java.lang.String r2 = X.AnonymousClass7TE.A16(r8, r0)
            r0 = 2131966369(0x7f1339a1, float:1.9569574E38)
            java.lang.String r0 = X.AnonymousClass7TE.A16(r8, r0)
            X.Hsh r1 = A00(r8, r7, r0)
            X.Hsx r0 = new X.Hsx
            r0.<init>(r3, r1, r2)
            X.Hsx[] r0 = new X.C56110Hsx[]{r6, r4, r0}
            java.util.List r0 = X.0sr.A1P(r0)
            X.Hsg r4 = new X.Hsg
            r4.<init>(r0, r5)
            return r4
        L_0x055e:
            X.HNN r3 = X.HNN.A04
            goto L_0x0519
        L_0x0561:
            X.HNN r3 = X.HNN.A0P
            goto L_0x0519
        L_0x0564:
            r0 = 2131966362(0x7f13399a, float:1.956956E38)
            goto L_0x0505
        L_0x0568:
            r0 = 2131966363(0x7f13399b, float:1.9569562E38)
            goto L_0x0505
        L_0x056c:
            r0 = 2131966364(0x7f13399c, float:1.9569564E38)
            goto L_0x0505
        L_0x0570:
            r0 = 2131966367(0x7f13399f, float:1.956957E38)
            goto L_0x0505
        L_0x0574:
            r0 = 2131966365(0x7f13399d, float:1.9569566E38)
            goto L_0x0505
        L_0x0578:
            X.HNN r3 = X.HNN.A0D
            goto L_0x04f6
        L_0x057c:
            java.lang.Object r3 = r4.A01
            X.GsO r3 = (X.C53671GsO) r3
            java.lang.Integer r0 = r3.A01
            int r2 = r0.intValue()
            r1 = 1
            r0 = 2
            if (r2 == r1) goto L_0x0599
            if (r2 != r0) goto L_0x062e
            X.HtI r0 = r3.A00
            java.lang.String r2 = r0.A02
            java.lang.String r1 = r0.A01
            r0 = 0
            X.Gwk r4 = new X.Gwk
            r4.<init>(r0, r2, r1)
            return r4
        L_0x0599:
            X.HtI r0 = r3.A00
            java.lang.String r0 = r0.A02
            r5 = 0
            X.2he r10 = X.AnonymousClass6QK.A01(r0)
            android.widget.ImageView$ScaleType r7 = android.widget.ImageView.ScaleType.CENTER_CROP
            java.lang.String r13 = "FeedbackImagePreviewComponent"
            r14 = 0
            X.Gx2 r4 = new X.Gx2
            r6 = r5
            r8 = r5
            r9 = r5
            r11 = r5
            r12 = r5
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return r4
        L_0x05b2:
            java.lang.Object r2 = r4.A01
            X.3Y5 r2 = (X.AnonymousClass3Y5) r2
            X.HNO r0 = X.C56493HzP.A07
            r0 = 4622945017495814144(0x4028000000000000, double:12.0)
            int r0 = X.C51972G9s.A0B(r2, r0)
            float r0 = (float) r0
            X.Gdr r4 = new X.Gdr
            r4.<init>(r0)
            return r4
        L_0x05c5:
            java.lang.Object r0 = r4.A01
            X.DbS.A1U(r0)
            java.lang.Boolean r4 = X.AnonymousClass7TE.A0v()
            return r4
        L_0x05cf:
            java.lang.Object r1 = r4.A01
            X.3Y5 r1 = (X.AnonymousClass3Y5) r1
            X.HNN r0 = X.HNN.A0H
            android.graphics.drawable.Drawable r4 = X.I61.A03(r1, r0)
            return r4
        L_0x05da:
            java.lang.Object r1 = r4.A01
            X.3Y5 r1 = (X.AnonymousClass3Y5) r1
            X.HNO r0 = X.HNO.A0m
            goto L_0x063a
        L_0x05e1:
            java.lang.Object r2 = r4.A01
            X.3Y5 r2 = (X.AnonymousClass3Y5) r2
            r0 = 4628011567076605952(0x403a000000000000, double:26.0)
            int r0 = X.C51972G9s.A0B(r2, r0)
            float r0 = (float) r0
            java.lang.Float r4 = java.lang.Float.valueOf(r0)
            return r4
        L_0x05f1:
            java.lang.Object r2 = r4.A01
            X.3Y5 r2 = (X.AnonymousClass3Y5) r2
            r0 = 4627448617123184640(0x4038000000000000, double:24.0)
            int r0 = X.C51972G9s.A0B(r2, r0)
            float r0 = (float) r0
            java.lang.Float r4 = java.lang.Float.valueOf(r0)
            return r4
        L_0x0601:
            X.3XV r0 = X.2WX.A02
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            r3 = 1120403456(0x42c80000, float:100.0)
            r2 = 0
            X.9JQ r1 = X.C51965G9l.A0b(r0, r3, r2)
            r0 = 0
            X.2WX r7 = X.C51974G9v.A0D(r0, r1, r3, r2)
            java.lang.Object r1 = r4.A01
            X.Gui r1 = (X.C53815Gui) r1
            android.graphics.drawable.Drawable r5 = r1.A01
            X.0sP r0 = r1.A03
            if (r5 == 0) goto L_0x0627
            android.widget.ImageView$ScaleType r6 = android.widget.ImageView.ScaleType.CENTER_CROP
            boolean r9 = r1.A04
            int r8 = r1.A00
            X.Gu8 r4 = new X.Gu8
            r4.<init>(r5, r6, r7, r8, r9)
            return r4
        L_0x0627:
            if (r0 == 0) goto L_0x062e
            java.lang.Object r4 = r0.invoke(r7)
            return r4
        L_0x062e:
            X.3XA r4 = new X.3XA
            r4.<init>()
            return r4
        L_0x0634:
            java.lang.Object r1 = r4.A01
            X.3Y5 r1 = (X.AnonymousClass3Y5) r1
            X.HNO r0 = X.HNO.A0l
        L_0x063a:
            int r0 = X.I61.A00(r1, r0)
            android.graphics.drawable.ColorDrawable r4 = X.C51965G9l.A0D(r0)
            return r4
        L_0x0643:
            java.lang.Object r0 = r4.A01
            X.Gu8 r0 = (X.C53779Gu8) r0
            android.graphics.drawable.Drawable r4 = r0.A00
            return r4
        L_0x064a:
            java.lang.Object r2 = r4.A01
            X.HIp r2 = (X.C54554HIp) r2
            java.lang.String r1 = r2.A0C()
            if (r1 == 0) goto L_0x065b
            int r0 = r1.hashCode()
            switch(r0) {
                case -1641379632: goto L_0x067a;
                case -1408769476: goto L_0x0677;
                case -1071416520: goto L_0x0663;
                case 1322647522: goto L_0x0660;
                default: goto L_0x065b;
            }
        L_0x065b:
            java.lang.Boolean r4 = X.AnonymousClass7TE.A0v()
            return r4
        L_0x0660:
            java.lang.String r0 = "WriteWithAIFeedbackBottomSheet"
            goto L_0x0665
        L_0x0663:
            java.lang.String r0 = "WriteWithAIBadReasonBottomSheet"
        L_0x0665:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x065b
            X.Gh8 r1 = r2.A00
            if (r1 == 0) goto L_0x0686
            java.lang.String r0 = r2.A0C()
            r1.A01(r0)
            goto L_0x065b
        L_0x0677:
            java.lang.String r0 = "WriteWithAIActivity"
            goto L_0x067c
        L_0x067a:
            java.lang.String r0 = "MetaAINuxScreen"
        L_0x067c:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x065b
            r2.A0D()
            goto L_0x065b
        L_0x0686:
            java.lang.String r6 = "feedbackViewModel"
            goto L_0x0693
        L_0x0689:
            java.lang.Object r0 = r4.A01
            X.HIp r0 = (X.C54554HIp) r0
            X.GhS r1 = r0.A01
            if (r1 != 0) goto L_0x069b
            java.lang.String r6 = "nuxViewModel"
        L_0x0693:
            X.0qQ.A0F(r6)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x069b:
            r0 = 0
            r1.A05(r0)
            java.lang.Boolean r4 = X.AnonymousClass7TE.A0v()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58708IwH.invoke():java.lang.Object");
    }

    public static C56094Hsh A00(Context context, C53036GhS ghS, String str) {
        return new C56094Hsh(str, new 0eP(context.getString(2131966373), ghS.A03.A04));
    }
}
