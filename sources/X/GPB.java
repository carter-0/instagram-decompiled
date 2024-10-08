package X;

public final class GPB extends AnonymousClass1Ek implements 0sP {
    public int A00;
    public Object A01;
    public final int A02;
    public final Object A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GPB(NJR njr, AnonymousClass4D7 r3) {
        super(1, r3);
        this.A02 = 6;
        this.A03 = njr;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.4D7, X.GPB] */
    /* JADX WARNING: type inference failed for: r3v1, types: [X.4D7, X.GPB] */
    /* JADX WARNING: type inference failed for: r3v2, types: [X.4D7, X.GPB] */
    public final AnonymousClass4D7 create(AnonymousClass4D7 r5) {
        Object obj;
        Object obj2;
        int i;
        switch (this.A02) {
            case 0:
                obj = this.A03;
                obj2 = this.A01;
                i = 0;
                break;
            case 1:
                obj = this.A03;
                obj2 = this.A01;
                i = 1;
                break;
            case 2:
                obj = this.A03;
                obj2 = this.A01;
                i = 2;
                break;
            case 3:
                return new GPB(this.A03, this.A01, r5, 3);
            case 4:
                obj = this.A03;
                obj2 = this.A01;
                i = 4;
                break;
            case 5:
                obj = this.A03;
                obj2 = this.A01;
                i = 5;
                break;
            case 6:
                return new GPB((NJR) this.A03, r5);
            case 7:
                obj = this.A03;
                obj2 = this.A01;
                i = 7;
                break;
            case 8:
                obj = this.A03;
                obj2 = this.A01;
                i = 8;
                break;
            case 9:
                obj = this.A03;
                obj2 = this.A01;
                i = 9;
                break;
            case 10:
                obj = this.A03;
                obj2 = this.A01;
                i = 10;
                break;
            default:
                obj = this.A03;
                obj2 = this.A01;
                i = 11;
                break;
        }
        return new GPB(obj, obj2, r5, i);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((GPB) create((AnonymousClass4D7) obj)).invokeSuspend(C60340gF.A00);
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [X.1qK, java.lang.Object] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0333, code lost:
        r4 = r5.A02(r15, 985100686, 2, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x033c, code lost:
        if (r4 != r1) goto L_0x0342;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x033e, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x033f, code lost:
        X.0eS.A00(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0342, code lost:
        r4 = (X.C239803Ii) r4;
        r2 = ((X.GLR) r15.A03).A08;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x034c, code lost:
        if ((r4 instanceof X.C239793Ih) == false) goto L_0x037a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x034e, code lost:
        r0 = ((X.C54057Gyg) ((X.C239793Ih) r4).A00).A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0356, code lost:
        if (r0 == null) goto L_0x0386;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0358, code lost:
        r0 = X.AnonymousClass7TE.A1I(X.C295375o3.A02(r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0360, code lost:
        X.0qQ.A0B(r0, 0);
        r2 = r2.A00.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x036e, code lost:
        if (r2.hasNext() == false) goto L_0x0459;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0370, code lost:
        ((X.GBE) r2.next()).A0O(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x037c, code lost:
        if ((r4 instanceof X.C297815sO) != false) goto L_0x0383;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0382, code lost:
        throw X.AnonymousClass7TE.A1K();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0383, code lost:
        r0 = X.0sn.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x0386, code lost:
        X.0qQ.A0F("clipsMedia");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x038f, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:?, code lost:
        return X.C60340gF.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:?, code lost:
        return X.C60340gF.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x022d, code lost:
        X.0eS.A00(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x024f, code lost:
        if (r0 != r1) goto L_0x005c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0251, code lost:
        return r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r16) {
        /*
            r15 = this;
            r4 = r16
            int r1 = r15.A02
            switch(r1) {
                case 0: goto L_0x021f;
                case 1: goto L_0x040d;
                case 2: goto L_0x03dc;
                case 3: goto L_0x01cc;
                case 4: goto L_0x0390;
                case 5: goto L_0x00df;
                case 6: goto L_0x0439;
                case 7: goto L_0x00b2;
                case 8: goto L_0x0308;
                case 9: goto L_0x02da;
                case 10: goto L_0x025c;
                default: goto L_0x0007;
            }
        L_0x0007:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r15.A00
            r5 = 1
            if (r2 == 0) goto L_0x0084
            if (r2 != r5) goto L_0x0257
            X.0eS.A00(r4)
        L_0x0013:
            X.3Ii r4 = (X.C239803Ii) r4
            boolean r1 = r4 instanceof X.C239793Ih
            if (r1 == 0) goto L_0x005f
            java.lang.Object r3 = r15.A03
            X.GLR r3 = (X.GLR) r3
            X.3Ih r4 = (X.C239793Ih) r4
            java.lang.Object r5 = r4.A00
            X.5u7 r5 = (X.C298835u7) r5
            X.4sa r2 = r5.BaP()
            java.lang.Object r0 = r15.A01
            X.GLa r0 = (X.C52259GLa) r0
            java.lang.String r1 = r0.A02
            r7 = 0
            X.GLa r0 = X.GLR.A00(r2, r1, r7, r7)
            r3.A01 = r0
            java.util.List r0 = X.C51973G9u.A0m(r5)
            java.util.List r6 = X.GLR.A05(r3, r0)
            X.GLR.A07(r5, r3, r6, r7, r7)
            X.GLd r4 = r3.A08
            r4.A00()
            r8 = r7
            r9 = r7
            r10 = r7
            r11 = r7
            r12 = r7
            r13 = r7
            r14 = r7
            r4.A02(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            java.lang.String r0 = r5.BaG()
            X.GLR.A08(r3, r0)
            X.4sa r0 = r5.BaP()
            X.GLR.A06(r0, r3, r1, r6, r7)
        L_0x005c:
            X.0gF r1 = X.C60340gF.A00
        L_0x005e:
            return r1
        L_0x005f:
            boolean r1 = r4 instanceof X.C297815sO
            if (r1 == 0) goto L_0x0252
            java.lang.Object r1 = r15.A03
            X.GLR r1 = (X.GLR) r1
            X.GLa r0 = r1.A01
            X.GLa r0 = X.G9w.A0d(r0, r1)
            r1.A01 = r0
            X.GLd r0 = r1.A08
            r0.A00()
            X.5sO r4 = (X.C297815sO) r4
            java.lang.Object r1 = r4.A00
            X.4dm r1 = (X.C268654dm) r1
            r2 = 0
            r3 = r2
            r4 = r2
            r5 = r2
            r6 = r2
            r7 = r2
            r0.A03(r1, r2, r3, r4, r5, r6, r7)
            goto L_0x005c
        L_0x0084:
            X.0eS.A00(r4)
            java.lang.Object r2 = r15.A03
            X.GLR r2 = (X.GLR) r2
            X.GLd r6 = r2.A08
            java.lang.Integer r7 = X.AnonymousClass05K.A0C
            r8 = 0
            r9 = r8
            r10 = r8
            r11 = r8
            r6.A04(r7, r8, r9, r10, r11)
            X.4hF r4 = r2.A04
            X.JSp r4 = (X.JSp) r4
            com.instagram.common.session.UserSession r3 = r2.A06
            java.lang.Object r2 = r15.A01
            X.GLa r2 = (X.C52259GLa) r2
            java.lang.String r2 = r2.A03
            X.1OC r3 = r4.Aez(r3, r2)
            r15.A00 = r5
            r2 = 985100686(0x3ab7718e, float:0.0013995634)
            java.lang.Object r4 = r3.A00(r2, r15)
            if (r4 != r1) goto L_0x0013
            return r1
        L_0x00b2:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r15.A00
            r3 = 1
            if (r2 == 0) goto L_0x00c0
            if (r2 == r3) goto L_0x022d
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x00c0:
            X.0eS.A00(r4)
            java.lang.Object r6 = r15.A03
            r2 = 29
            X.Ivv r2 = X.C58686Ivv.A00(r6, r2)
            java.lang.Object r5 = r15.A01
            r7 = 0
            r8 = 35
            r9 = 42
            X.MHK r4 = new X.MHK
            r4.<init>((java.lang.Object) r5, (java.lang.Object) r6, (X.AnonymousClass4D7) r7, (int) r8, (int) r9)
            r15.A00 = r3
            java.lang.Object r0 = com.meta.compose.material.bottomsheet.AnchoredDraggableKt.A01(r15, r2, r4)
            goto L_0x024f
        L_0x00df:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r15.A00
            r5 = 2
            r11 = 1
            if (r2 == 0) goto L_0x0135
            X.0eS.A00(r4)
        L_0x00ea:
            X.3Ii r4 = (X.C239803Ii) r4
            java.lang.Object r1 = r15.A01
            X.4Cq r1 = (X.C262224Cq) r1
            boolean r1 = X.19E.A07(r1)
            if (r1 == 0) goto L_0x005c
            boolean r1 = r4 instanceof X.C239793Ih
            if (r1 == 0) goto L_0x01a5
            java.lang.Object r0 = r15.A03
            X.GhN r0 = (X.C53032GhN) r0
            X.05G r7 = r0.A0H
        L_0x0100:
            java.lang.Object r8 = r7.getValue()
            r6 = r8
            X.GnN r6 = (X.C53390GnN) r6
            java.util.List r1 = r6.A03
            r0 = r4
            X.3Ih r0 = (X.C239793Ih) r0
            java.lang.Object r0 = r0.A00
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r5 = X.00k.A0S(r0, r1)
            X.HM3 r3 = X.HM3.Success
            r0 = 0
            X.0qQ.A0B(r5, r0)
            int r0 = r5.size()
            int r0 = r0 + -1
            java.lang.Integer r2 = new java.lang.Integer
            r2.<init>(r0)
            float r1 = r6.A00
            boolean r0 = r6.A04
            X.GnN r0 = X.C53390GnN.A01(r3, r2, r5, r1, r0)
            boolean r0 = r7.AIY(r8, r0)
            if (r0 == 0) goto L_0x0100
            goto L_0x005c
        L_0x0135:
            X.0eS.A00(r4)
            java.lang.Object r4 = r15.A03
            X.GhN r4 = (X.C53032GhN) r4
            com.google.common.collect.ImmutableList r2 = X.C55328Hfv.A00
            X.3kO r2 = r2.iterator()
            r4.A05 = r2
            X.05G r10 = r4.A0H
        L_0x0146:
            java.lang.Object r9 = r10.getValue()
            r2 = r9
            X.GnN r2 = (X.C53390GnN) r2
            X.HM3 r8 = X.HM3.Loading
            java.util.List r7 = r2.A03
            float r6 = r2.A00
            boolean r3 = r2.A04
            java.lang.Integer r2 = r2.A02
            X.GnN r2 = X.C53390GnN.A01(r8, r2, r7, r6, r3)
            boolean r2 = r10.AIY(r9, r2)
            if (r2 == 0) goto L_0x0146
            java.lang.String r2 = X.C53032GhN.A00(r4)
            r4.A04 = r2
            X.HzS r2 = r4.A0C
            boolean r2 = X.C56496HzS.A00(r2)
            X.9qE r7 = r4.A0B
            java.lang.String r8 = X.C53032GhN.A00(r4)
            if (r2 == 0) goto L_0x0190
            int r10 = r4.A00
            int r2 = r10 + 1
            r4.A00 = r2
            r15.A00 = r11
            X.4Cq r2 = r7.A01
            X.4Cc r4 = r2.ArX()
            r9 = 0
            X.MFb r6 = new X.MFb
            r6.<init>(r7, r8, r9, r10, r11)
        L_0x0189:
            java.lang.Object r4 = X.1Eo.A00(r15, r4, r6)
            if (r4 != r1) goto L_0x00ea
            return r1
        L_0x0190:
            int r3 = r4.A00
            int r2 = r3 + 1
            r4.A00 = r2
            r15.A00 = r5
            X.4Cq r2 = r7.A01
            X.4Cc r4 = r2.ArX()
            r2 = 0
            X.MGQ r6 = new X.MGQ
            r6.<init>((X.C389799qE) r7, (java.lang.String) r8, (X.AnonymousClass4D7) r2, (int) r3)
            goto L_0x0189
        L_0x01a5:
            boolean r1 = r4 instanceof X.C297815sO
            if (r1 == 0) goto L_0x0475
            java.lang.Object r0 = r15.A03
            X.GhN r0 = (X.C53032GhN) r0
            X.05G r6 = r0.A0H
        L_0x01af:
            java.lang.Object r5 = r6.getValue()
            r0 = r5
            X.GnN r0 = (X.C53390GnN) r0
            X.HM3 r4 = X.HM3.Failed
            java.util.List r3 = r0.A03
            float r2 = r0.A00
            boolean r1 = r0.A04
            java.lang.Integer r0 = r0.A02
            X.GnN r0 = X.C53390GnN.A01(r4, r0, r3, r2, r1)
            boolean r0 = r6.AIY(r5, r0)
            if (r0 == 0) goto L_0x01af
            goto L_0x005c
        L_0x01cc:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r15.A00
            r6 = 2
            r7 = 1
            if (r2 == 0) goto L_0x0203
            if (r2 != r7) goto L_0x022d
            X.0eS.A00(r4)
        L_0x01d9:
            X.HyW r2 = X.C56438HyW.A00
            boolean r2 = X.0qQ.A0K(r4, r2)
            if (r2 != 0) goto L_0x005c
            X.HyV r2 = X.C56437HyV.A00
            boolean r2 = X.0qQ.A0K(r4, r2)
            if (r2 != 0) goto L_0x005c
            boolean r2 = r4 instanceof X.C53247Gkv
            if (r2 == 0) goto L_0x047a
            java.lang.Object r5 = r15.A03
            com.instagram.comments.mvvm.data.MediaCommentListRepository r5 = (com.instagram.comments.mvvm.data.MediaCommentListRepository) r5
            r15.A00 = r6
            r3 = 22
            X.J6O r2 = new X.J6O
            r2.<init>(r4, r3)
            java.lang.Object r0 = com.instagram.comments.mvvm.data.MediaCommentListRepository.A09(r5, r15, r2)
            if (r0 == r1) goto L_0x005e
            X.0gF r0 = X.C60340gF.A00
            goto L_0x024f
        L_0x0203:
            X.0eS.A00(r4)
            java.lang.Object r5 = r15.A01
            X.7aF r5 = (X.C333847aF) r5
            java.lang.Object r2 = r15.A03
            com.instagram.comments.mvvm.data.MediaCommentListRepository r2 = (com.instagram.comments.mvvm.data.MediaCommentListRepository) r2
            com.instagram.common.session.UserSession r4 = r2.A0B
            X.GmL r2 = r2.A04
            boolean r3 = r2.A0e
            java.lang.String r2 = r2.A0E
            r15.A00 = r7
            java.lang.Object r4 = com.instagram.comments.mvvm.data.network.MediaHiddenCommentNetworkFetcherKt.A00(r5, r4, r2, r15, r3)
            if (r4 != r1) goto L_0x01d9
            return r1
        L_0x021f:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r15.A00
            r7 = 1
            if (r2 == 0) goto L_0x0232
            if (r2 == r7) goto L_0x022d
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x022d:
            X.0eS.A00(r4)
            goto L_0x005c
        L_0x0232:
            X.0eS.A00(r4)
            java.lang.Object r6 = r15.A03
            androidx.paging.AsyncPagingDataDiffer$differBase$1 r6 = (androidx.paging.AsyncPagingDataDiffer$differBase$1) r6
            java.lang.Object r5 = r15.A01
            X.Hzs r5 = (X.C56521Hzs) r5
            X.MTH r2 = r5.A01
            r6.A02 = r2
            X.0r6 r4 = r5.A03
            r3 = 4
            X.MCn r2 = new X.MCn
            r2.<init>((int) r3, (java.lang.Object) r5, (java.lang.Object) r6)
            r15.A00 = r7
            java.lang.Object r0 = r4.collect(r2, r15)
        L_0x024f:
            if (r0 != r1) goto L_0x005c
            return r1
        L_0x0252:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0257:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x025c:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r15.A00
            r5 = 1
            if (r2 == 0) goto L_0x0280
            if (r2 != r5) goto L_0x02d5
            X.0eS.A00(r4)
        L_0x0268:
            X.3Ii r4 = (X.C239803Ii) r4
            java.lang.Object r0 = r15.A03
            X.GLR r0 = (X.GLR) r0
            X.GLd r2 = r0.A08
            boolean r0 = r4 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x02cc
            X.3Ih r4 = (X.C239793Ih) r4
            java.lang.Object r0 = r4.A00
            X.5u7 r0 = (X.C298835u7) r0
            java.util.List r0 = r0.Ao4()
            goto L_0x0360
        L_0x0280:
            X.0eS.A00(r4)
            java.lang.Object r3 = r15.A03
            X.GLR r3 = (X.GLR) r3
            X.0eM r2 = r3.A0D
            r2.getValue()
            com.instagram.common.session.UserSession r8 = r3.A06
            java.lang.Object r2 = r15.A01
            X.BJ4 r2 = (X.BJ4) r2
            java.lang.String r7 = r2.A02
            r15.A00 = r5
            org.json.JSONArray r6 = new org.json.JSONArray
            r6.<init>()
            char[] r3 = new char[r5]
            r5 = 0
            r2 = 44
            r3[r5] = r2
            r4 = 0
            java.util.List r2 = X.00l.A0Q(r7, r3, r5)
            java.util.Iterator r3 = r2.iterator()
        L_0x02ab:
            boolean r2 = r3.hasNext()
            if (r2 == 0) goto L_0x02b9
            java.lang.Object r2 = r3.next()
            r6.put(r2)
            goto L_0x02ab
        L_0x02b9:
            java.lang.String r2 = X.DbT.A10(r6)
            X.1OC r4 = X.AnonymousClass93V.A03(r4, r8, r2)
            r3 = 985100686(0x3ab7718e, float:0.0013995634)
            r2 = 2
            java.lang.Object r4 = r4.A02(r15, r3, r2, r5)
            if (r4 != r1) goto L_0x0268
            return r1
        L_0x02cc:
            boolean r0 = r4 instanceof X.C297815sO
            if (r0 != 0) goto L_0x0383
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x02d5:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x02da:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r15.A00
            r6 = 1
            if (r2 == 0) goto L_0x02e8
            if (r2 == r6) goto L_0x033f
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x02e8:
            X.0eS.A00(r4)
            java.lang.Object r3 = r15.A03
            X.GLR r3 = (X.GLR) r3
            X.0eM r2 = r3.A0D
            r2.getValue()
            com.instagram.common.session.UserSession r5 = r3.A06
            java.lang.Object r2 = r15.A01
            X.BJ4 r2 = (X.BJ4) r2
            java.lang.String r4 = r2.A02
            java.lang.String r3 = X.C70282O0m.A00(r4)
            r2 = 0
            r15.A00 = r6
            X.1OC r5 = X.AnonymousClass93V.A04(r5, r3, r4, r2)
            goto L_0x0333
        L_0x0308:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r15.A00
            r6 = 1
            if (r2 == 0) goto L_0x0316
            if (r2 == r6) goto L_0x033f
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0316:
            X.0eS.A00(r4)
            java.lang.Object r3 = r15.A03
            X.GLR r3 = (X.GLR) r3
            X.0eM r2 = r3.A0D
            r2.getValue()
            com.instagram.common.session.UserSession r5 = r3.A06
            java.lang.Object r2 = r15.A01
            X.GPD r2 = (X.GPD) r2
            java.lang.String r4 = r2.A00
            r3 = 0
            java.lang.String r2 = r2.A01
            r15.A00 = r6
            X.1OC r5 = X.AnonymousClass93V.A04(r5, r4, r3, r2)
        L_0x0333:
            r4 = 985100686(0x3ab7718e, float:0.0013995634)
            r3 = 2
            r2 = 0
            java.lang.Object r4 = r5.A02(r15, r4, r3, r2)
            if (r4 != r1) goto L_0x0342
            return r1
        L_0x033f:
            X.0eS.A00(r4)
        L_0x0342:
            X.3Ii r4 = (X.C239803Ii) r4
            java.lang.Object r0 = r15.A03
            X.GLR r0 = (X.GLR) r0
            X.GLd r2 = r0.A08
            boolean r0 = r4 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x037a
            X.3Ih r4 = (X.C239793Ih) r4
            java.lang.Object r0 = r4.A00
            X.Gyg r0 = (X.C54057Gyg) r0
            X.1Xj r0 = r0.A00
            if (r0 == 0) goto L_0x0386
            X.4bN r0 = X.C295375o3.A02(r0)
            java.util.List r0 = X.AnonymousClass7TE.A1I(r0)
        L_0x0360:
            r1 = 0
            X.0qQ.A0B(r0, r1)
            java.util.Set r1 = r2.A00
            java.util.Iterator r2 = r1.iterator()
        L_0x036a:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L_0x0459
            java.lang.Object r1 = r2.next()
            X.GBE r1 = (X.GBE) r1
            r1.A0O(r0)
            goto L_0x036a
        L_0x037a:
            boolean r0 = r4 instanceof X.C297815sO
            if (r0 != 0) goto L_0x0383
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0383:
            X.0sn r0 = X.0sn.A00
            goto L_0x0360
        L_0x0386:
            java.lang.String r0 = "clipsMedia"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0390:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r15.A00
            r3 = 1
            if (r2 == 0) goto L_0x03b7
            if (r2 != r3) goto L_0x03d7
            X.0eS.A00(r4)
        L_0x039c:
            X.0eP r4 = (X.0eP) r4
            java.lang.Object r5 = r4.A00
            java.lang.Object r3 = r4.A01
            X.19S r1 = X.AnonymousClass1HX.A00()
            r7 = 0
            java.lang.Object r4 = r15.A03
            java.lang.Object r6 = r15.A01
            r8 = 12
            X.MGj r2 = new X.MGj
            r2.<init>((java.lang.Object) r3, (java.lang.Object) r4, (java.lang.Object) r5, (java.lang.Object) r6, (X.AnonymousClass4D7) r7, (int) r8)
            X.1Er r4 = X.C51966G9m.A1L(r2, r1)
            return r4
        L_0x03b7:
            X.0eS.A00(r4)
            java.lang.Object r6 = r15.A03
            java.lang.Object r2 = r15.A01
            X.7kC r2 = (X.C339807kC) r2
            android.view.View r2 = r2.A04
            android.content.Context r5 = X.AnonymousClass7TE.A0S(r2)
            r15.A00 = r3
            r4 = 0
            r3 = 49
            X.MH4 r2 = new X.MH4
            r2.<init>((X.AnonymousClass4D7) r4, (java.lang.Object) r5, (java.lang.Object) r6, (int) r3)
            java.lang.Object r4 = X.19E.A00(r15, r2)
            if (r4 != r1) goto L_0x039c
            return r1
        L_0x03d7:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x03dc:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r15.A00
            r5 = 1
            if (r2 == 0) goto L_0x03ee
            if (r2 != r5) goto L_0x0408
            X.0eS.A00(r4)
        L_0x03e8:
            java.lang.String r0 = "null cannot be cast to non-null type androidx.credentials.CreatePublicKeyCredentialResponse"
            X.0qQ.A0C(r4, r0)
            return r4
        L_0x03ee:
            X.0eS.A00(r4)
            java.lang.Object r3 = r15.A03
            com.facebook.caa.shared.passkey.PasskeyService r3 = (com.facebook.caa.shared.passkey.PasskeyService) r3
            X.QOu r2 = com.facebook.caa.shared.passkey.PasskeyService.A08
            X.JS4 r4 = r3.A01
            android.content.Context r3 = r3.A00
            java.lang.Object r2 = r15.A01
            X.Rvh r2 = (X.C10648Rvh) r2
            r15.A00 = r5
            java.lang.Object r4 = r4.ALk(r3, r2, r15)
            if (r4 != r1) goto L_0x03e8
            return r1
        L_0x0408:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x040d:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r15.A00
            r5 = 1
            if (r2 == 0) goto L_0x041f
            if (r2 != r5) goto L_0x041a
            X.0eS.A00(r4)
            return r4
        L_0x041a:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x041f:
            X.0eS.A00(r4)
            java.lang.Object r3 = r15.A03
            com.facebook.caa.shared.passkey.PasskeyService r3 = (com.facebook.caa.shared.passkey.PasskeyService) r3
            X.QOu r2 = com.facebook.caa.shared.passkey.PasskeyService.A08
            X.JS4 r4 = r3.A01
            android.content.Context r3 = r3.A00
            java.lang.Object r2 = r15.A01
            X.Rqc r2 = (X.C10339Rqc) r2
            r15.A00 = r5
            java.lang.Object r4 = r4.Asl(r3, r2, r15)
            if (r4 != r1) goto L_0x045b
            return r1
        L_0x0439:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r15.A00
            r6 = 1
            if (r2 == 0) goto L_0x045c
            if (r2 != r6) goto L_0x0470
            java.lang.Object r5 = r15.A01
            X.NJR r5 = (X.NJR) r5
            X.0eS.A00(r4)
        L_0x0449:
            com.instagram.common.session.UserSession r0 = r5.A05()
            X.1Ng r1 = X.AnonymousClass1Nd.A00(r0)
            X.7MQ r0 = new X.7MQ
            r0.<init>()
            r1.A00(r0)
        L_0x0459:
            X.0gF r4 = X.C60340gF.A00
        L_0x045b:
            return r4
        L_0x045c:
            X.0eS.A00(r4)
            java.lang.Object r5 = r15.A03
            X.NJR r5 = (X.NJR) r5
            r2 = 5000(0x1388, double:2.4703E-320)
            r15.A01 = r5
            r15.A00 = r6
            java.lang.Object r0 = X.C241603Pv.A01(r15, r2)
            if (r0 != r1) goto L_0x0449
            return r1
        L_0x0470:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0475:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x047a:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GPB.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GPB(Object obj, Object obj2, AnonymousClass4D7 r4, int i) {
        super(1, r4);
        this.A02 = i;
        this.A03 = obj;
        this.A01 = obj2;
    }
}
