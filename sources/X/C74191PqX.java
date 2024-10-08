package X;

import java.util.List;

/* renamed from: X.PqX  reason: case insensitive filesystem */
public final class C74191PqX extends 0Yg implements 0sP {
    public final int A00;
    public final Object A01;
    public final Object A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C74191PqX(AnonymousClass62P r2, 0sP r3, int i) {
        super(1);
        this.A00 = i;
        if (46 - i != 0) {
            this.A02 = r2;
            this.A01 = r3;
        } else {
            this.A01 = r2;
            this.A02 = r3;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v6, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v12, resolved type: X.9IB} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v29, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v31, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v92, resolved type: X.MtR} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v93, resolved type: X.MtT} */
    /* JADX WARNING: type inference failed for: r4v12, types: [java.lang.Object, X.0rk] */
    /* JADX WARNING: type inference failed for: r1v87, types: [X.1aK, X.66l] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0431, code lost:
        X.0qQ.A0F(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0438, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0476, code lost:
        r1.setText(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0097, code lost:
        r6.CfA((X.0sP) null, r5, X.AnonymousClass5PI.A03(r4, r0), r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x064a, code lost:
        if (r0 != null) goto L_0x064c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x07f3, code lost:
        r13[1] = r0;
        r13[2] = X.AnonymousClass7TE.A1L(r10, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x081f, code lost:
        r0 = X.DbS.A0M(r3, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x0855, code lost:
        X.DbT.A1N(r4, r1);
        r4 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x085a, code lost:
        r0.A0D(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x0874, code lost:
        X.DbT.A1N(r2, r13);
        r0 = X.DbS.A0M(r3, r5);
        r0.A0D(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x0880, code lost:
        r0.A04();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x08ce, code lost:
        return X.C60340gF.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x001d, code lost:
        return r1.invoke(((java.util.List) r0).get(r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0391, code lost:
        r3 = new X.C71515OmC(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x03a9, code lost:
        r13.A04(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0068, code lost:
        r4 = new X.C52637GaB(r0, r3, r2);
        r0 = -632812321;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r38) {
        /*
            r37 = this;
            r0 = r37
            r15 = r38
            int r1 = r0.A00
            switch(r1) {
                case 1: goto L_0x0884;
                case 2: goto L_0x001e;
                case 3: goto L_0x0009;
                case 4: goto L_0x001e;
                case 5: goto L_0x0009;
                case 6: goto L_0x074a;
                case 7: goto L_0x001e;
                case 8: goto L_0x0009;
                case 9: goto L_0x073f;
                case 10: goto L_0x001e;
                case 11: goto L_0x0009;
                case 12: goto L_0x001e;
                case 13: goto L_0x0009;
                case 14: goto L_0x0713;
                case 15: goto L_0x06ac;
                case 16: goto L_0x06ac;
                case 17: goto L_0x044a;
                case 18: goto L_0x06c9;
                case 19: goto L_0x06ac;
                case 20: goto L_0x0683;
                case 21: goto L_0x065f;
                case 22: goto L_0x0623;
                case 23: goto L_0x05f4;
                case 24: goto L_0x05ce;
                case 25: goto L_0x04d5;
                case 26: goto L_0x04c8;
                case 27: goto L_0x04b5;
                case 28: goto L_0x0494;
                case 29: goto L_0x047b;
                case 30: goto L_0x03d1;
                case 31: goto L_0x03ae;
                case 32: goto L_0x0397;
                case 33: goto L_0x0383;
                case 34: goto L_0x0347;
                case 35: goto L_0x0306;
                case 36: goto L_0x0266;
                case 37: goto L_0x023c;
                case 38: goto L_0x03f6;
                case 39: goto L_0x0203;
                case 40: goto L_0x0190;
                case 41: goto L_0x00b9;
                case 42: goto L_0x00a1;
                case 43: goto L_0x0029;
                case 44: goto L_0x0071;
                case 45: goto L_0x0009;
                case 46: goto L_0x004d;
                case 47: goto L_0x0009;
                case 48: goto L_0x0031;
                case 49: goto L_0x0029;
                default: goto L_0x0009;
            }
        L_0x0009:
            int r2 = X.AnonymousClass7TE.A0M(r15)
            java.lang.Object r1 = r0.A01
            X.0sP r1 = (X.0sP) r1
            java.lang.Object r0 = r0.A02
        L_0x0013:
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r0 = r0.get(r2)
            java.lang.Object r1 = r1.invoke(r0)
            return r1
        L_0x001e:
            int r2 = X.AnonymousClass7TE.A0M(r15)
            java.lang.Object r1 = r0.A02
            X.0sP r1 = (X.0sP) r1
            java.lang.Object r0 = r0.A01
            goto L_0x0013
        L_0x0029:
            java.lang.Object r2 = r0.A01
            X.0sP r2 = (X.0sP) r2
            java.lang.Object r0 = r0.A02
            goto L_0x08c9
        L_0x0031:
            X.6Gb r6 = X.C51968G9o.A0L(r15)
            java.lang.Object r3 = r0.A02
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r2 = r0.A01
            X.0sP r2 = (X.0sP) r2
            X.Po6 r1 = X.C74041Po6.A00
            int r7 = r3.size()
            r0 = 47
            X.PqX r5 = new X.PqX
            r5.<init>((int) r0, (java.util.List) r3, (X.0sP) r1)
            r0 = 14
            goto L_0x0068
        L_0x004d:
            X.6Gb r6 = X.C51968G9o.A0L(r15)
            java.lang.Object r3 = r0.A01
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r2 = r0.A02
            X.0sP r2 = (X.0sP) r2
            X.Po5 r1 = X.C74040Po5.A00
            int r7 = r3.size()
            r0 = 45
            X.PqX r5 = new X.PqX
            r5.<init>((int) r0, (java.util.List) r3, (X.0sP) r1)
            r0 = 13
        L_0x0068:
            X.GaB r4 = new X.GaB
            r4.<init>((int) r0, (java.util.List) r3, (X.0sP) r2)
            r0 = -632812321(0xffffffffda480cdf, float:-1.40772868E16)
            goto L_0x0097
        L_0x0071:
            X.6Gb r6 = X.C51968G9o.A0L(r15)
            java.lang.Object r3 = r0.A01
            r1 = 28
            X.PqQ r2 = new X.PqQ
            r2.<init>(r3, r1)
            java.lang.Object r1 = r0.A02
            java.util.List r1 = (java.util.List) r1
            int r7 = r1.size()
            r0 = 29
            X.PqQ r5 = new X.PqQ
            r5.<init>(r1, r0)
            r0 = 9
            X.JK1 r4 = new X.JK1
            r4.<init>((int) r0, (java.lang.Object) r3, (java.lang.Object) r2, (java.lang.Object) r1)
            r0 = -1091073711(0xffffffffbef78951, float:-0.48346952)
        L_0x0097:
            X.5PJ r1 = X.AnonymousClass5PI.A03(r4, r0)
            r0 = 0
            r6.CfA(r0, r5, r1, r7)
            goto L_0x08cc
        L_0x00a1:
            java.lang.Boolean r15 = (java.lang.Boolean) r15
            java.lang.Object r2 = r0.A01
            android.view.View r2 = (android.view.View) r2
            boolean r1 = r15.booleanValue()
            r2.setEnabled(r1)
            java.lang.Object r0 = r0.A02
            X.E4V r0 = (X.E4V) r0
            r0.A08 = r1
            X.Dbb.A0v(r0)
            goto L_0x08cc
        L_0x00b9:
            X.N2Z r15 = (X.N2Z) r15
            X.N3F r14 = r15.A00
            if (r14 == 0) goto L_0x017b
            java.lang.Object r1 = r0.A02
            X.NIh r1 = (X.C68444NIh) r1
            X.0eM r11 = r1.A0I
            com.instagram.common.session.UserSession r26 = X.AnonymousClass7TE.A0l(r11)
            android.content.res.Resources r24 = X.JTR.A0R(r1)
            com.google.common.collect.ImmutableList r25 = X.OQ3.A00(r14)
            java.lang.String r10 = r14.A05
            android.os.Bundle r3 = r1.mArguments
            r13 = 0
            if (r3 == 0) goto L_0x00ea
            java.lang.String r2 = "surface"
            java.lang.String r32 = r3.getString(r2)
        L_0x00de:
            java.lang.String r12 = "Required value was null."
            if (r32 == 0) goto L_0x0129
            com.instagram.model.direct.DirectThreadKey r2 = r1.A0C
            if (r2 != 0) goto L_0x00ed
            java.lang.String r4 = "threadKey"
            goto L_0x0431
        L_0x00ea:
            r32 = r13
            goto L_0x00de
        L_0x00ed:
            java.lang.String r9 = r2.A00
            java.lang.String r34 = X.DbU.A0u(r11)
            X.7L2 r2 = r1.A09
            if (r2 != 0) goto L_0x00fb
            java.lang.String r4 = "threadTheme"
            goto L_0x0431
        L_0x00fb:
            X.7Kx r8 = r2.A04
            com.instagram.user.model.User r4 = r14.A02
            if (r4 == 0) goto L_0x0115
            java.lang.String r3 = r4.getId()
        L_0x0105:
            java.lang.String r2 = X.DbU.A0u(r11)
            boolean r36 = X.0qQ.A0K(r3, r2)
            X.9HC r5 = r1.A08
            if (r5 != 0) goto L_0x0117
            java.lang.String r4 = "experiments"
            goto L_0x0431
        L_0x0115:
            r3 = r13
            goto L_0x0105
        L_0x0117:
            X.Mtz r2 = r1.A04
            if (r2 != 0) goto L_0x011f
            java.lang.String r4 = "viewModel"
            goto L_0x0431
        L_0x011f:
            java.lang.String r6 = r2.A05
            X.2Ep r2 = r1.A0A
            if (r2 != 0) goto L_0x012e
            java.lang.String r4 = "thread"
            goto L_0x0431
        L_0x0129:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r12)
            throw r0
        L_0x012e:
            r2.C6a()
            X.NVH r2 = r1.A03
            if (r2 == 0) goto L_0x0188
            long r2 = r2.A00
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r2 = r7.toMicros(r2)
            java.lang.Long r30 = java.lang.Long.valueOf(r2)
        L_0x0141:
            r23 = 0
            X.2FW r29 = X.2FW.A0a
            r27 = r5
            r28 = r8
            r31 = r10
            r33 = r9
            r35 = r6
            X.Nbe r16 = X.OQ3.A01(r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36)
            android.os.Bundle r3 = r1.mArguments
            if (r3 == 0) goto L_0x018b
            java.lang.String r2 = "client_context"
            java.lang.String r21 = r3.getString(r2)
            if (r21 == 0) goto L_0x018b
            java.lang.String r22 = X.DbU.A0u(r11)
            java.lang.Integer r2 = r14.A03
            X.NVH r12 = new X.NVH
            r15 = r13
            r17 = r13
            r18 = r13
            r19 = r13
            r24 = r23
            r25 = r23
            r20 = r2
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            r1.A03 = r12
            r1.A0D = r4
        L_0x017b:
            java.lang.Object r1 = r0.A02
            X.NIh r1 = (X.C68444NIh) r1
            java.lang.Object r0 = r0.A01
            android.view.View r0 = (android.view.View) r0
            X.C68444NIh.A00(r0, r1)
            goto L_0x08cc
        L_0x0188:
            r30 = r13
            goto L_0x0141
        L_0x018b:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r12)
            throw r0
        L_0x0190:
            X.N3R r15 = (X.N3R) r15
            X.Nil r3 = r15.A03
            X.Nil r1 = X.C69285Nil.LOADING
            java.lang.Object r2 = r0.A01
            com.instagram.ui.widget.spinner.SpinnerImageView r2 = (com.instagram.ui.widget.spinner.SpinnerImageView) r2
            if (r3 != r1) goto L_0x01dc
            X.3uy r1 = X.C255943uy.LOADING
        L_0x019e:
            r2.setLoadingStatus(r1)
            java.util.List r1 = r15.A0C
            java.lang.Object r3 = r0.A02
            X.NKo r3 = (X.C68495NKo) r3
            java.util.ArrayList r5 = X.AnonymousClass7TG.A0r(r1)
            java.util.Iterator r4 = r1.iterator()
        L_0x01af:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x01df
            java.lang.Object r2 = r4.next()
            X.NVH r2 = (X.NVH) r2
            java.lang.Boolean r0 = r15.A06
            java.lang.Boolean r1 = X.AnonymousClass7TE.A0v()
            boolean r0 = X.0qQ.A0K(r0, r1)
            if (r0 != 0) goto L_0x01d8
            java.lang.Boolean r0 = r3.A0F
            boolean r0 = X.0qQ.A0K(r0, r1)
            if (r0 == 0) goto L_0x01d8
            r1 = 39
            X.PqX r0 = new X.PqX
            r0.<init>((int) r1, (java.lang.Object) r2, (java.lang.Object) r3)
            r2.A00 = r0
        L_0x01d8:
            r5.add(r2)
            goto L_0x01af
        L_0x01dc:
            X.3uy r1 = X.C255943uy.SUCCESS
            goto L_0x019e
        L_0x01df:
            java.util.ArrayList r2 = X.00k.A0U(r5)
            X.N5i r1 = r15.A02
            if (r1 == 0) goto L_0x01eb
            r0 = 0
            r2.add(r0, r1)
        L_0x01eb:
            X.MuF r0 = r3.A0E()
            boolean r0 = r0.A0E()
            if (r0 == 0) goto L_0x01fe
            X.2ms r0 = r3.A0Q
            X.Toc r0 = X.C14036Toc.A00(r0)
            r2.add(r0)
        L_0x01fe:
            r3.A0B(r2)
            goto L_0x08cc
        L_0x0203:
            java.lang.Object r1 = r0.A01
            X.NVH r1 = (X.NVH) r1
            X.N3F r1 = r1.A01
            java.lang.String r5 = r1.A05
            if (r5 == 0) goto L_0x08cc
            java.lang.Object r4 = r0.A02
            X.NKo r4 = (X.C68495NKo) r4
            androidx.fragment.app.FragmentActivity r1 = r4.requireActivity()
            X.0eM r0 = r4.A0S
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.6Yo r3 = X.DbS.A0M(r1, r0)
            X.NIh r2 = new X.NIh
            r2.<init>()
            android.os.Bundle r1 = r4.requireArguments()
            java.lang.String r0 = "card_gallery_currently_viewing_item_id"
            r1.putString(r0, r5)
            r3.A0B(r1, r2)
            r3.A04()
            X.MuF r0 = r4.A0E()
            r0.A06()
            goto L_0x08cc
        L_0x023c:
            android.graphics.Bitmap r15 = (android.graphics.Bitmap) r15
            if (r15 == 0) goto L_0x0255
            java.lang.Object r2 = r0.A01
            X.77D r2 = (X.AnonymousClass77D) r2
            java.lang.Object r1 = r0.A02
            X.MzC r1 = (X.C68045MzC) r1
            int r0 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE
            X.0eM r0 = r1.A01
            com.instagram.common.ui.widget.imageview.IgImageView r0 = X.C66580MXl.A0R(r0)
            r2.EF5(r15, r0)
            goto L_0x08cc
        L_0x0255:
            java.lang.Object r1 = r0.A02
            X.MzC r1 = (X.C68045MzC) r1
            int r0 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE
            X.0eM r0 = r1.A01
            com.instagram.common.ui.widget.imageview.IgImageView r0 = X.C66580MXl.A0R(r0)
            r0.A09()
            goto L_0x08cc
        L_0x0266:
            java.lang.String r15 = (java.lang.String) r15
            java.lang.Object r12 = r0.A01
            X.OYu r12 = (X.C71019OYu) r12
            java.lang.Object r2 = r0.A02
            X.MtT r2 = (X.C67714MtT) r2
            X.05G r0 = r2.A0P
            java.lang.Object r14 = r0.getValue()
            java.lang.String r14 = (java.lang.String) r14
            X.Nja r0 = r2.A02
            X.0qQ.A0A(r15)
            X.AnonymousClass7TG.A1N(r14, r0)
            r6 = 2
            X.0qQ.A0B(r15, r6)
            X.OML r5 = r12.A01
            r4 = 178991798(0xaab32b6, float:1.6485776E-32)
            int r7 = r5.A00(r0, r4)
            com.facebook.quicklog.QuickPerformanceLogger r0 = r12.A04
            X.OWR r11 = new X.OWR
            r11.<init>(r0)
            com.facebook.quicklog.LightweightQuickPerformanceLogger r3 = r11.A01
            r1 = 1021649468(0x3ce5223c, float:0.027970426)
            int r0 = r11.A00
            java.util.concurrent.TimeUnit r22 = java.util.concurrent.TimeUnit.NANOSECONDS
            r18 = 0
            r20 = -1
            r16 = r3
            r17 = r1
            r19 = r0
            r16.markerStartWithCancelPolicy(r17, r18, r19, r20, r22)
            java.util.concurrent.Executor r8 = r12.A05
            java.lang.String r9 = X.C51968G9o.A16(r8)
            X.0qQ.A07(r9)
            java.lang.String r8 = "executor_priority_type"
            r3.markerAnnotate(r1, r0, r8, r9)
            X.ObS r13 = X.C71087ObS.A00()
            java.lang.String r8 = "GRAPHQL"
            java.lang.String r9 = "transportType"
            com.facebook.quicklog.QuickPerformanceLogger r5 = r5.A00
            r5.markerAnnotate(r4, r7, r9, r8)
            java.lang.String r4 = "transport_type"
            r3.markerAnnotate(r1, r0, r4, r8)
            X.OOB r0 = r12.A00
            X.OZI r1 = r0.A00
            X.ObS r8 = X.C71087ObS.A00()
            X.O5P r0 = r1.A01
            X.0sa r0 = r0.A00
            boolean r0 = X.C51971G9r.A1b(r0)
            if (r0 != 0) goto L_0x02ed
            X.OZI.A01(r8)
        L_0x02df:
            X.OmS r10 = new X.OmS
            r16 = r7
            r10.<init>(r11, r12, r13, r14, r15, r16)
            r8.A04(r10)
            r0 = 22
            goto L_0x0391
        L_0x02ed:
            X.NAX r5 = r1.A02
            X.Opg r0 = X.C71722Opg.A00(r8, r6)
            X.68L r4 = X.C66580MXl.A0F(r5, r6)
            com.facebook.msys.mca.MailboxFutureImpl r3 = X.C66581MXm.A0J(r4, r0)
            r1 = 25
            X.Oph r0 = new X.Oph
            r0.<init>((X.NAX) r5, (com.facebook.msys.mca.MailboxFutureImpl) r3, (int) r1)
            X.C66582MXn.A1E(r4, r0, r3)
            goto L_0x02df
        L_0x0306:
            java.lang.String r15 = (java.lang.String) r15
            java.lang.Object r3 = r0.A01
            X.OMK r3 = (X.OMK) r3
            java.lang.Object r2 = r0.A02
            X.MtR r2 = (X.C67712MtR) r2
            X.05G r0 = r2.A0G
            java.lang.Object r4 = r0.getValue()
            java.lang.String r4 = (java.lang.String) r4
            X.0qQ.A0A(r15)
            r1 = 0
            int r0 = X.DbW.A02(r1, r4, r15)
            X.ObS r13 = X.C71087ObS.A00()
            X.NAS r3 = r3.A01
            java.lang.Integer r7 = java.lang.Integer.valueOf(r1)
            X.68L r0 = X.C66580MXl.A0F(r3, r0)
            com.facebook.msys.mca.MailboxFutureImpl r1 = X.C66580MXl.A0G(r0)
            r11 = 1
            X.Op0 r5 = new X.Op0
            r6 = r3
            r8 = r1
            r9 = r4
            r10 = r15
            r5.<init>(r6, r7, r8, r9, r10, r11)
            X.C66582MXn.A1E(r0, r5, r1)
            r0 = 15
            X.C71722Opg.A01(r1, r13, r0)
            r0 = 21
            goto L_0x0391
        L_0x0347:
            java.lang.String r15 = (java.lang.String) r15
            java.lang.Object r5 = r0.A01
            X.OMK r5 = (X.OMK) r5
            X.0qQ.A0A(r15)
            r1 = 1
            X.0qQ.A0B(r15, r1)
            X.ObS r13 = X.C71087ObS.A00()
            X.NAS r3 = r5.A01
            r1 = 0
            java.lang.Integer r9 = java.lang.Integer.valueOf(r1)
            X.68J r1 = r3.mMailboxApiHandleMetaProvider
            r4 = 2
            X.68L r1 = r1.ASa(r4)
            com.facebook.msys.mca.MailboxFutureImpl r2 = X.C66580MXl.A0G(r1)
            X.Opd r6 = new X.Opd
            r7 = r2
            r8 = r3
            r10 = r15
            r11 = r4
            r6.<init>((com.facebook.msys.mca.MailboxFutureImpl) r7, (X.NAS) r8, (java.lang.Number) r9, (java.lang.String) r10, (int) r11)
            X.C66582MXn.A1E(r1, r6, r2)
            r1 = 17
            X.C71722Opg.A01(r2, r13, r1)
            java.lang.Object r0 = r0.A02
            X.OmM r3 = new X.OmM
            r3.<init>(r5, r0, r15, r4)
            goto L_0x03a9
        L_0x0383:
            java.lang.String r15 = (java.lang.String) r15
            java.lang.Object r1 = r0.A01
            X.OMK r1 = (X.OMK) r1
            X.ObS r13 = r1.A00(r15)
            java.lang.Object r2 = r0.A02
            r0 = 19
        L_0x0391:
            X.OmC r3 = new X.OmC
            r3.<init>(r2, r0)
            goto L_0x03a9
        L_0x0397:
            java.lang.String r15 = (java.lang.String) r15
            java.lang.Object r2 = r0.A01
            X.OMK r2 = (X.OMK) r2
            X.ObS r13 = r2.A00(r15)
            java.lang.Object r1 = r0.A02
            r0 = 0
            X.OmM r3 = new X.OmM
            r3.<init>(r2, r1, r15, r0)
        L_0x03a9:
            r13.A04(r3)
            goto L_0x08cc
        L_0x03ae:
            X.Njy r15 = (X.C69358Njy) r15
            r1 = 0
            X.0qQ.A0B(r15, r1)
            java.lang.Object r2 = r0.A02
            X.NIL r2 = (X.NIL) r2
            X.0eM r1 = r2.A00
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r1)
            X.OW5 r3 = X.C69900Nu2.A00(r1)
            androidx.fragment.app.FragmentActivity r2 = r2.requireActivity()
            java.lang.Integer r1 = X.AnonymousClass05K.A0Y
            java.lang.Object r0 = r0.A01
            X.NiX r0 = (X.C69271NiX) r0
            X.OW5.A00(r2, r15, r0, r3, r1)
            goto L_0x08cc
        L_0x03d1:
            X.Ew4 r15 = (X.C49463Ew4) r15
            java.lang.Object r3 = r0.A02
            X.E12 r3 = (X.E12) r3
            java.lang.Object r2 = r0.A01
            androidx.recyclerview.widget.RecyclerView r2 = (androidx.recyclerview.widget.RecyclerView) r2
            java.util.List r0 = r15.A00
            com.instagram.common.recyclerview.ViewModelListUpdate r1 = X.DbS.A0R()
            r1.A01(r0)
            X.2t9 r0 = r3.A00
            java.lang.String r4 = "adapter"
            if (r0 == 0) goto L_0x0431
            r0.A05(r1)
            X.2t9 r0 = r3.A00
            if (r0 == 0) goto L_0x0431
            r2.setAdapter(r0)
            goto L_0x08cc
        L_0x03f6:
            X.N2Z r15 = (X.N2Z) r15
            java.lang.String r3 = r15.A02
            com.instagram.user.model.User r1 = r15.A01
            java.lang.String r2 = X.C51971G9r.A0t(r1)
            if (r3 == 0) goto L_0x040e
            int r1 = r3.length()
            if (r1 == 0) goto L_0x040e
            java.lang.Object r1 = r0.A02
            X.NJ4 r1 = (X.NJ4) r1
            r1.A09 = r3
        L_0x040e:
            if (r2 == 0) goto L_0x041c
            int r1 = r2.length()
            if (r1 == 0) goto L_0x041c
            java.lang.Object r1 = r0.A02
            X.NJ4 r1 = (X.NJ4) r1
            r1.A08 = r2
        L_0x041c:
            java.lang.Object r3 = r0.A02
            X.NJ4 r3 = (X.NJ4) r3
            java.lang.Object r2 = r0.A01
            android.view.View r2 = (android.view.View) r2
            r0 = 2131438795(0x7f0b2ccb, float:1.8499527E38)
            android.widget.TextView r1 = X.AnonymousClass7TG.A0R(r2, r0)
            java.lang.String r0 = r3.A09
            if (r0 != 0) goto L_0x0439
            java.lang.String r4 = "promptTitle"
        L_0x0431:
            X.0qQ.A0F(r4)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0439:
            r1.setText(r0)
            r0 = 2131431017(0x7f0b0e69, float:1.8483751E38)
            android.widget.TextView r1 = X.AnonymousClass7TG.A0R(r2, r0)
            java.lang.String r0 = r3.A08
            if (r0 != 0) goto L_0x0476
            java.lang.String r4 = "creatorUsername"
            goto L_0x0431
        L_0x044a:
            java.lang.Boolean r15 = (java.lang.Boolean) r15
            java.lang.Object r5 = r0.A02
            androidx.fragment.app.Fragment r5 = (androidx.fragment.app.Fragment) r5
            java.lang.Object r4 = r0.A01
            android.view.View r4 = (android.view.View) r4
            X.0qQ.A0A(r15)
            boolean r3 = r15.booleanValue()
            r2 = 2131436524(0x7f0b23ec, float:1.849492E38)
            android.view.View r1 = X.AnonymousClass7TE.A0b(r4, r2)
            r0 = 0
            r1.setVisibility(r0)
            android.widget.TextView r1 = X.AnonymousClass7TE.A0d(r4, r2)
            r0 = 2131957144(0x7f131598, float:1.9550864E38)
            if (r3 == 0) goto L_0x0472
            r0 = 2131957143(0x7f131597, float:1.9550862E38)
        L_0x0472:
            java.lang.String r0 = r5.getString(r0)
        L_0x0476:
            r1.setText(r0)
            goto L_0x08cc
        L_0x047b:
            java.lang.Object r1 = r0.A02
            X.Guv r1 = (X.C53828Guv) r1
            X.JjH r1 = r1.A03
            java.lang.Object r0 = r0.A01
            X.7dj r0 = (X.C335907dj) r0
            com.instagram.user.model.User r0 = r0.A0C
            java.lang.String r2 = r0.getId()
            X.05G r3 = r1.A0D
            r0 = 0
            X.Jyu r1 = new X.Jyu
            r1.<init>(r2, r0)
            goto L_0x04b0
        L_0x0494:
            java.lang.String r2 = X.C41847B3o.A1E(r15)
            java.lang.Object r1 = r0.A01
            X.Gwa r1 = (X.C53930Gwa) r1
            X.Jdj r1 = r1.A00
            boolean r1 = r1.A01
            if (r1 != 0) goto L_0x08cc
            java.lang.Object r0 = r0.A02
            X.Gw3 r0 = (X.C53897Gw3) r0
            X.JjH r0 = r0.A03
            X.05G r3 = r0.A0D
            r0 = 0
            X.Jyu r1 = new X.Jyu
            r1.<init>(r0, r2)
        L_0x04b0:
            r3.Epw(r1)
            goto L_0x08cc
        L_0x04b5:
            java.lang.Object r1 = r0.A02
            X.Gw1 r1 = (X.C53896Gw1) r1
            X.JjH r2 = r1.A02
            java.lang.Object r0 = r0.A01
            X.7dj r0 = (X.C335907dj) r0
            java.lang.String r1 = r0.A0K
            java.lang.String r0 = r0.A0N
            r2.A04(r1, r0)
            goto L_0x08cc
        L_0x04c8:
            java.lang.Object r1 = r0.A02
            X.MYk r1 = (X.C66598MYk) r1
            java.lang.Object r0 = r0.A01
            X.MYb r0 = (X.MYb) r0
            X.1aU r1 = X.C66598MYk.A00(r1, r0)
            return r1
        L_0x04d5:
            com.facebook.msys.mca.MailboxNullable r15 = (com.facebook.msys.mca.MailboxNullable) r15
            java.lang.Object r10 = r15.value
            if (r10 == 0) goto L_0x05c9
            X.6AH r10 = (X.AnonymousClass6AH) r10
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1C()
            X.0rk r4 = new X.0rk
            r4.<init>()
            r14 = 0
            int r5 = X.C66580MXl.A04(r10)
        L_0x04eb:
            if (r14 >= r5) goto L_0x0590
            java.lang.Object r7 = r0.A02
            java.lang.Object r8 = r0.A01
            X.MYb r8 = (X.MYb) r8
            com.facebook.msys.mci.CQLResultSet r2 = r10.mResultSet
            r1 = 4
            java.lang.Integer r1 = X.C66581MXm.A0o(r2, r14, r1)
            com.instagram.direct.msys.subtype.MsysThreadSubtype r11 = X.C70116NxW.A00(r1)
            com.facebook.msys.mci.CQLResultSet r2 = r10.mResultSet
            r1 = 0
            long r1 = r2.getLong(r14, r1)
            com.facebook.msys.mci.CQLResultSet r9 = r10.mResultSet
            r6 = 1
            java.lang.Long r6 = X.C66581MXm.A0q(r9, r14, r6)
            com.instagram.model.direct.threadkey.impl.MsysThreadId r12 = X.C66580MXl.A0j(r6, r1)
            com.facebook.msys.mci.CQLResultSet r1 = r10.mResultSet
            r6 = 3
            boolean r15 = r1.getBoolean(r14, r6)
            com.facebook.msys.mci.CQLResultSet r2 = r10.mResultSet
            r1 = 5
            java.lang.Integer r13 = r2.getNullableInteger(r14, r1)
            boolean r1 = r11.A01
            if (r1 == 0) goto L_0x0589
            if (r15 == 0) goto L_0x0589
            X.1aU r8 = r8.A01(r12)
            r1 = 19
            X.PqZ r2 = new X.PqZ
            r2.<init>(r7, r1)
            X.MZl r1 = new X.MZl
            r1.<init>(r2)
            X.1aU r8 = r8.A0K(r1)
            r1 = 18
            X.PqZ r2 = new X.PqZ
            r2.<init>(r7, r1)
            X.MZl r1 = new X.MZl
            r1.<init>(r2)
            X.1aU r2 = r8.A0K(r1)
            X.Ove r1 = X.C72065Ove.A00
            X.1aU r1 = r2.A0L(r1)
            X.48z r2 = X.C2612848z.A00
            X.1aJ r7 = r1.A00
            java.lang.String r1 = "defaultItem is null"
            X.1aP.A01(r2, r1)
            java.lang.String r1 = "The item is null"
            X.1aP.A01(r2, r1)
            X.66l r1 = new X.66l
            r1.<init>(r2)
            X.XQM r2 = new X.XQM
            r2.<init>(r7, r1)
            X.1aU r1 = new X.1aU
            r1.<init>(r2)
        L_0x056b:
            X.0qQ.A0A(r1)
            X.OvI r9 = new X.OvI
            r9.<init>(r10, r11, r12, r13, r14, r15)
            X.1aU r1 = r1.A0L(r9)
            r3.add(r1)
            int r2 = r4.A00
            com.facebook.msys.mci.CQLResultSet r1 = r10.mResultSet
            boolean r1 = r1.getBoolean(r14, r6)
            int r2 = r2 + r1
            r4.A00 = r2
            int r14 = r14 + 1
            goto L_0x04eb
        L_0x0589:
            X.48z r1 = X.C2612848z.A00
            X.1aU r1 = X.1aU.A09(r1)
            goto L_0x056b
        L_0x0590:
            r1 = 17
            X.PqZ r0 = new X.PqZ
            r0.<init>(r4, r1)
            X.MZl r2 = new X.MZl
            r2.<init>(r0)
            java.util.ArrayList r4 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r1 = r3.iterator()
        L_0x05a4:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x05b6
            java.lang.Object r0 = r1.next()
            X.1aU r0 = (X.1aU) r0
            X.1aJ r0 = r0.A00
            r4.add(r0)
            goto L_0x05a4
        L_0x05b6:
            X.5nI r3 = new X.5nI
            r3.<init>(r2)
            int r2 = X.XCq.A00
            r1 = 0
            X.5nJ r0 = new X.5nJ
            r0.<init>(r3, r4, r1, r2)
            X.1aU r1 = new X.1aU
            r1.<init>(r0)
            return r1
        L_0x05c9:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x05ce:
            X.9IB r15 = (X.AnonymousClass9IB) r15
            r1 = 0
            X.0qQ.A0B(r15, r1)
            boolean r1 = r15.A01
            if (r1 == 0) goto L_0x05ef
            java.lang.Object r1 = r0.A02
            X.75p r1 = (X.C3261575p) r1
            r1.A00 = r15
            X.26t r1 = r1.A03
            X.0xa r1 = r1.A00
            X.0xY r2 = r1.AR4()
            r1 = 2960(0xb90, float:4.148E-42)
            java.lang.String r1 = X.C273654mx.A00(r1)
            X.DbW.A1L(r2, r1)
        L_0x05ef:
            java.lang.Object r0 = r0.A01
            X.0sP r0 = (X.0sP) r0
            goto L_0x064c
        L_0x05f4:
            java.lang.String r15 = (java.lang.String) r15
            r2 = 0
            X.0qQ.A0B(r15, r2)
            java.lang.Object r1 = r0.A02
            X.75s r1 = (X.C3261875s) r1
            X.26t r1 = r1.A01
            java.lang.Object r3 = r0.A01
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            X.0qQ.A0B(r3, r2)
            X.0xa r0 = r1.A00
            X.0xY r2 = r0.AR4()
            java.lang.String r1 = "key_social_stickers_combined_config_hash_"
            java.util.Set r0 = X.00k.A0k(r3)
            int r0 = r0.hashCode()
            java.lang.String r0 = X.002.A0O(r1, r0)
            r2.E5g(r0, r15)
            r2.apply()
            goto L_0x08cc
        L_0x0623:
            X.9IB r15 = (X.AnonymousClass9IB) r15
            r1 = 0
            X.0qQ.A0B(r15, r1)
            boolean r1 = r15.A01
            if (r1 != 0) goto L_0x08cc
            java.lang.Object r2 = r0.A01
            X.Kmb r2 = (X.C62799Kmb) r2
            boolean r1 = r2 instanceof X.KQE
            if (r1 == 0) goto L_0x0651
            boolean r1 = r15.A04
        L_0x0637:
            if (r1 == 0) goto L_0x08cc
            boolean r1 = r2 instanceof X.NTH
            r15 = 0
            if (r1 == 0) goto L_0x0644
            X.NTH r2 = (X.NTH) r2
            if (r2 == 0) goto L_0x0644
            java.lang.String r15 = r2.A00
        L_0x0644:
            java.lang.Object r0 = r0.A02
            X.75o r0 = (X.C3261475o) r0
            X.0sP r0 = r0.A00
            if (r0 == 0) goto L_0x08cc
        L_0x064c:
            r0.invoke(r15)
            goto L_0x08cc
        L_0x0651:
            boolean r1 = r2 instanceof X.KQD
            if (r1 == 0) goto L_0x0658
            boolean r1 = r15.A03
            goto L_0x0637
        L_0x0658:
            boolean r1 = r2 instanceof X.NTH
            if (r1 == 0) goto L_0x08cc
            boolean r1 = r15.A02
            goto L_0x0637
        L_0x065f:
            com.facebook.msys.mca.MailboxFeature r15 = (com.facebook.msys.mca.MailboxFeature) r15
            r1 = 0
            X.0qQ.A0B(r15, r1)
            java.lang.Object r4 = r0.A01
            java.lang.Object r1 = r0.A02
            r0 = 31
            X.Opg r0 = X.C71722Opg.A00(r1, r0)
            X.68L r3 = X.C66581MXm.A0I(r15)
            com.facebook.msys.mca.MailboxFutureImpl r2 = X.C66581MXm.A0J(r3, r0)
            r1 = 10
            X.OoW r0 = new X.OoW
            r0.<init>(r1, r4, r2, r15)
            X.C66582MXn.A1E(r3, r0, r2)
            goto L_0x08cc
        L_0x0683:
            r1 = 0
            X.0qQ.A0B(r15, r1)
            java.lang.Object r3 = r0.A02
            X.0lg r3 = (X.0lg) r3
            X.0qQ.A0B(r3, r1)
            r1 = 31
            X.Pm0 r2 = new X.Pm0
            r2.<init>(r3, r1)
            java.lang.Class<X.65f> r1 = X.C3027765f.class
            java.lang.Object r3 = r3.A01(r1, r2)
            X.65f r3 = (X.C3027765f) r3
            java.lang.Object r2 = r0.A01
            r0 = 22
            X.Phd r1 = new X.Phd
            r1.<init>(r0, r15, r2)
            r0 = 5
            r3.A00(r1, r0)
            goto L_0x08cc
        L_0x06ac:
            java.lang.Boolean r15 = (java.lang.Boolean) r15
            java.lang.Object r1 = r0.A01
            android.view.View r1 = (android.view.View) r1
            X.0qQ.A0A(r15)
            boolean r2 = r15.booleanValue()
            r0 = 2131435629(0x7f0b206d, float:1.8493106E38)
            android.view.View r1 = X.AnonymousClass7TE.A0b(r1, r0)
            int r0 = X.DbW.A01(r2)
            r1.setVisibility(r0)
            goto L_0x08cc
        L_0x06c9:
            java.lang.String r15 = (java.lang.String) r15
            java.lang.Object r1 = r0.A02
            X.E2L r1 = (X.E2L) r1
            java.lang.Object r3 = r0.A01
            android.view.View r3 = (android.view.View) r3
            X.0qQ.A0A(r15)
            X.0eM r0 = r1.A03
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r0)
            X.0eM r0 = r1.A02
            java.lang.Object r1 = r0.getValue()
            X.AnonymousClass7TG.A1N(r2, r1)
            com.instagram.user.model.User r0 = X.AnonymousClass7TF.A0Q(r2)
            boolean r0 = r0.A2L()
            if (r0 == 0) goto L_0x08cc
            com.instagram.creatortools.api.schemas.ValuePropsFlow r0 = com.instagram.creatortools.api.schemas.ValuePropsFlow.SUBSCRIPTION
            java.lang.String r0 = r0.A00
            boolean r0 = X.0qQ.A0K(r0, r1)
            if (r0 != 0) goto L_0x0703
            com.instagram.creatortools.api.schemas.ValuePropsFlow r0 = com.instagram.creatortools.api.schemas.ValuePropsFlow.BADGES
            java.lang.String r0 = r0.A00
            boolean r0 = X.0qQ.A0K(r0, r1)
            if (r0 == 0) goto L_0x08cc
        L_0x0703:
            r0 = 2131443642(0x7f0b3fba, float:1.8509358E38)
            android.view.View r0 = r3.findViewById(r0)
            com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout r0 = (com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout) r0
            if (r0 == 0) goto L_0x08cc
            r0.setFooterText(r15)
            goto L_0x08cc
        L_0x0713:
            boolean r1 = X.AnonymousClass7TE.A1a(r15)
            if (r1 == 0) goto L_0x0730
            java.lang.Object r0 = r0.A01
            androidx.fragment.app.FragmentActivity r0 = (androidx.fragment.app.FragmentActivity) r0
            if (r0 == 0) goto L_0x08cc
            X.0hq r2 = r0.getSupportFragmentManager()
            if (r2 == 0) goto L_0x08cc
            android.os.Bundle r1 = X.AnonymousClass7TE.A0a()
            java.lang.String r0 = "KEY_FRAGMENT_RESULT_REFRESH_AFTER_OPT_IN"
            r2.A0z(r0, r1)
            goto L_0x08cc
        L_0x0730:
            java.lang.Object r0 = r0.A02
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            android.content.Context r1 = r0.getContext()
            java.lang.String r0 = "comments_summary_error_could_not_opt_in"
            X.C59689JTv.A0B(r1, r0)
            goto L_0x08cc
        L_0x073f:
            java.lang.Object r1 = r0.A01
            X.0sL r1 = (X.0sL) r1
            java.lang.Object r0 = r0.A02
            r1.invoke(r15, r0)
            goto L_0x08cc
        L_0x074a:
            X.HMx r15 = (X.C54666HMx) r15
            r4 = 0
            X.0qQ.A0B(r15, r4)
            java.lang.Object r14 = r0.A02
            X.H0G r14 = (X.H0G) r14
            androidx.fragment.app.FragmentActivity r3 = r14.requireActivity()
            X.0eM r1 = r14.A04
            com.instagram.common.session.UserSession r5 = X.AnonymousClass7TE.A0l(r1)
            java.lang.Object r0 = r0.A01
            X.4gU r0 = (X.C270284gU) r0
            java.lang.Object r0 = r0.getValue()
            X.GnI r0 = (X.C53386GnI) r0
            java.lang.String r9 = r0.A05
            X.0eM r0 = r14.A01
            java.lang.String r8 = X.DbS.A0t(r0)
            X.0eM r0 = r14.A02
            java.lang.String r7 = X.DbS.A0t(r0)
            r12 = 1
            r11 = 2
            X.0qQ.A0B(r5, r11)
            r13 = 3
            X.C51973G9u.A0r(r13, r9, r8, r7)
            X.GPq r2 = new X.GPq
            r2.<init>(r5, r7)
            int r15 = r15.ordinal()
            r0 = 42
            java.lang.String r10 = X.C273654mx.A00(r0)
            r0 = 136(0x88, float:1.9E-43)
            java.lang.String r6 = X.C273654mx.A00(r0)
            java.lang.String r1 = "creator_ai_creator_fbid"
            switch(r15) {
                case 0: goto L_0x07ab;
                case 1: goto L_0x079e;
                case 2: goto L_0x08cc;
                case 3: goto L_0x085e;
                case 4: goto L_0x0837;
                case 5: goto L_0x0824;
                case 6: goto L_0x080e;
                case 7: goto L_0x07fc;
                case 8: goto L_0x07d9;
                case 9: goto L_0x07c2;
                case 10: goto L_0x08cc;
                default: goto L_0x0799;
            }
        L_0x0799:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x079e:
            java.lang.String r0 = "target_id"
            java.util.HashMap r1 = X.DbY.A0m(r0, r8)
            java.lang.String r0 = "com.instagram.insights.account.creator_ai_breakout.container"
            X.3M3 r4 = X.C46649DiU.A02(r5, r0, r1)
            goto L_0x081f
        L_0x07ab:
            X.6ST r2 = new X.6ST
            r2.<init>(r3, r12)
            X.AnonymousClass0fN.A00(r2)
            X.F3E r1 = new X.F3E
            r1.<init>(r3, r5)
            X.FZi r0 = new X.FZi
            r0.<init>(r2, r12)
            r1.A00(r14, r0, r8)
            goto L_0x08cc
        L_0x07c2:
            X.HOi r0 = X.C54677HOi.KEYWORD_RESPONSES
            r2.A04(r0)
            X.GzX r2 = new X.GzX
            r2.<init>()
            X.0eP[] r13 = new X.0eP[r13]
            X.0eP r0 = X.AnonymousClass7TE.A1L(r1, r9)
            r13[r4] = r0
            X.0eP r0 = X.AnonymousClass7TE.A1L(r6, r8)
            goto L_0x07f3
        L_0x07d9:
            X.HOi r0 = X.C54677HOi.LINKS
            r2.A04(r0)
            X.GzV r2 = new X.GzV
            r2.<init>()
            X.0eP[] r13 = new X.0eP[r13]
            java.lang.String r6 = "creator_ai_add_fact_content_type"
            java.lang.String r0 = "AFFILIATE_LINKS"
            X.0eP r0 = X.AnonymousClass7TE.A1L(r6, r0)
            r13[r4] = r0
            X.0eP r0 = X.AnonymousClass7TE.A1L(r1, r9)
        L_0x07f3:
            r13[r12] = r0
            X.0eP r0 = X.AnonymousClass7TE.A1L(r10, r7)
            r13[r11] = r0
            goto L_0x0874
        L_0x07fc:
            java.lang.Class<com.instagram.modal.ModalActivity> r2 = com.instagram.modal.ModalActivity.class
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>(r4)
            java.lang.String r0 = "creator_ai_embodiment_capture"
            X.6W8 r0 = X.AnonymousClass6W8.A02(r3, r1, r5, r2, r0)
            r0.A0C(r3)
            goto L_0x08cc
        L_0x080e:
            X.HOi r0 = X.C54677HOi.SUMMARY
            r2.A04(r0)
            android.os.Bundle r0 = X.DbY.A0B(r6, r8)
            X.Gzj r4 = new X.Gzj
            r4.<init>()
            r4.setArguments(r0)
        L_0x081f:
            X.6Yo r0 = X.DbS.A0M(r3, r5)
            goto L_0x085a
        L_0x0824:
            X.HOi r0 = X.C54677HOi.TOPICS_TO_AVOID
            r2.A04(r0)
            X.6Yo r0 = X.DbS.A0M(r3, r5)
            X.H0V r4 = new X.H0V
            r4.<init>()
            X.0eP[] r1 = X.DbW.A1b(r1, r9)
            goto L_0x0855
        L_0x0837:
            X.HOi r0 = X.C54677HOi.YOUR_INFORMATION
            r2.A04(r0)
            X.6Yo r0 = X.DbS.A0M(r3, r5)
            X.H20 r4 = new X.H20
            r4.<init>()
            X.0eP r3 = X.AnonymousClass7TE.A1L(r1, r9)
            X.0eP r2 = X.AnonymousClass7TE.A1L(r6, r8)
            X.0eP r1 = X.AnonymousClass7TE.A1L(r10, r7)
            X.0eP[] r1 = new X.0eP[]{r3, r2, r1}
        L_0x0855:
            X.DbT.A1N(r4, r1)
            androidx.fragment.app.Fragment r4 = (androidx.fragment.app.Fragment) r4
        L_0x085a:
            r0.A0D(r4)
            goto L_0x0880
        L_0x085e:
            X.HOi r0 = X.C54677HOi.CONTENT
            r2.A04(r0)
            X.H0R r2 = new X.H0R
            r2.<init>()
            X.0eP r1 = X.AnonymousClass7TE.A1L(r1, r9)
            X.0eP r0 = X.AnonymousClass7TE.A1L(r6, r8)
            X.0eP[] r13 = new X.0eP[]{r1, r0}
        L_0x0874:
            X.DbT.A1N(r2, r13)
            X.6Yo r0 = X.DbS.A0M(r3, r5)
            androidx.fragment.app.Fragment r2 = (androidx.fragment.app.Fragment) r2
            r0.A0D(r2)
        L_0x0880:
            r0.A04()
            goto L_0x08cc
        L_0x0884:
            int r5 = X.AnonymousClass7TE.A0M(r15)
            java.lang.Object r4 = r0.A01
            X.5Tq r4 = (X.C286025Tq) r4
            java.lang.String r1 = "community_guidelines"
            java.util.List r1 = r4.A06(r1, r5, r5)
            java.lang.Object r1 = X.00k.A0J(r1)
            if (r1 == 0) goto L_0x08ae
            java.lang.Object r3 = r0.A02
            X.0sP r3 = (X.0sP) r3
            r1 = 78
            java.lang.String r2 = X.C273654mx.A00(r1)
            android.util.LruCache r1 = X.0cp.A00
            android.net.Uri r1 = android.net.Uri.parse(r2)
            X.0qQ.A07(r1)
            r3.invoke(r1)
        L_0x08ae:
            java.lang.String r1 = "learn_more"
            java.util.List r1 = r4.A06(r1, r5, r5)
            java.lang.Object r1 = X.00k.A0J(r1)
            if (r1 == 0) goto L_0x08cc
            java.lang.Object r2 = r0.A02
            X.0sP r2 = (X.0sP) r2
            java.lang.String r1 = "https://about.fb.com/news/2023/09/building-generative-ai-features-responsibly/"
            android.util.LruCache r0 = X.0cp.A00
            android.net.Uri r0 = android.net.Uri.parse(r1)
            X.0qQ.A07(r0)
        L_0x08c9:
            r2.invoke(r0)
        L_0x08cc:
            X.0gF r1 = X.C60340gF.A00
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C74191PqX.invoke(java.lang.Object):java.lang.Object");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C74191PqX(int i, Object obj, Object obj2) {
        super(1);
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C74191PqX(int i, List list, 0sP r4) {
        super(1);
        this.A00 = i;
        switch (i) {
            case 0:
            case 3:
            case 5:
            case 8:
            case 11:
            case 13:
            case 45:
            case 47:
                this.A01 = r4;
                this.A02 = list;
                break;
            default:
                this.A02 = r4;
                this.A01 = list;
                break;
        }
    }
}
