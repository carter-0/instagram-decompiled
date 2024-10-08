package X;

/* renamed from: X.IkG  reason: case insensitive filesystem */
public final class C58023IkG implements C61910qF, 02o {
    public final int A00;
    public final Object A01;

    public C58023IkG(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x02da, code lost:
        X.C54555HIq.A00(r2).A0F(X.HIU.A00);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00f8, code lost:
        if (r8.A02 == null) goto L_0x001c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0200, code lost:
        if (((X.C56145HtX) r1.A03.getValue()).A09 != false) goto L_0x0202;
     */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x0307  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x0322  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object emit(java.lang.Object r17, X.AnonymousClass4D7 r18) {
        /*
            r16 = this;
            r2 = r16
            r0 = r17
            int r1 = r2.A00
            switch(r1) {
                case 0: goto L_0x03b4;
                case 1: goto L_0x0336;
                case 2: goto L_0x0009;
                case 3: goto L_0x0009;
                case 4: goto L_0x032b;
                case 5: goto L_0x02e5;
                case 6: goto L_0x0251;
                case 7: goto L_0x01ea;
                case 8: goto L_0x01b0;
                case 9: goto L_0x015e;
                default: goto L_0x0009;
            }
        L_0x0009:
            X.HQ3 r0 = (X.HQ3) r0
            java.lang.Object r8 = r2.A01
            X.HIr r8 = (X.C54556HIr) r8
            boolean r1 = r0 instanceof X.HIK
            if (r1 == 0) goto L_0x0024
            X.C54556HIr.A01(r8)
        L_0x0016:
            X.GgP r2 = r8.A01
            if (r2 != 0) goto L_0x013d
            java.lang.String r3 = "viewModel"
        L_0x001c:
            X.0qQ.A0F(r3)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0024:
            boolean r1 = r0 instanceof X.HIJ
            if (r1 != 0) goto L_0x003d
            boolean r1 = r0 instanceof X.HIF
            if (r1 == 0) goto L_0x0041
            X.0sP r3 = r8.A0I
            r1 = r0
            X.HIF r1 = (X.HIF) r1
            X.HsD r2 = r1.A00
            if (r2 == 0) goto L_0x0159
            X.HIm r1 = new X.HIm
            r1.<init>(r2)
            r3.invoke(r1)
        L_0x003d:
            r8.A0D()
            goto L_0x0016
        L_0x0041:
            boolean r1 = r0 instanceof X.HIG
            if (r1 != 0) goto L_0x0068
            boolean r1 = r0 instanceof X.HIN
            if (r1 == 0) goto L_0x0089
            X.Di6 r5 = X.C46626Di6.WRAP_CONTENT_SHEET
            java.lang.Integer r4 = X.AnonymousClass05K.A0C
            java.lang.Integer r3 = r8.A0F
            int r2 = r8.A07
            r1 = 28
            X.Ivm r1 = X.C58677Ivm.A00(r8, r1)
            X.I4X r3 = X.I4X.A00(r5, r3, r4, r1, r2)
            r1 = 42
            X.J6T r2 = new X.J6T
            r2.<init>((int) r1, (java.lang.Object) r0, (java.lang.Object) r8)
            java.lang.String r1 = "ImagineBadOptionsFeedbackBottomSheetFlow"
        L_0x0064:
            r8.A0E(r3, r1, r2)
            goto L_0x0016
        L_0x0068:
            X.4Co r1 = r8.A05
            if (r1 == 0) goto L_0x0087
            boolean r6 = r1.isActive()
        L_0x0070:
            X.Di6 r5 = X.C46626Di6.WRAP_CONTENT_SHEET
            java.lang.Integer r4 = X.AnonymousClass05K.A0C
            java.lang.Integer r3 = r8.A0F
            int r2 = r8.A07
            r1 = 0
            X.I4X r3 = X.I4X.A00(r5, r3, r4, r1, r2)
            r1 = 23
            X.GN2 r2 = new X.GN2
            r2.<init>(r1, r8, r0, r6)
            java.lang.String r1 = "ImagineMoreBottomSheet"
            goto L_0x0064
        L_0x0087:
            r6 = 0
            goto L_0x0070
        L_0x0089:
            boolean r1 = r0 instanceof X.HII
            if (r1 == 0) goto L_0x009d
            r1 = r0
            X.HII r1 = (X.HII) r1
            java.lang.String r9 = r1.A01
            java.lang.String r10 = r1.A00
            boolean r11 = r1.A02
            r12 = 0
            r13 = r12
            X.C54556HIr.A06(r8, r9, r10, r11, r12, r13)
            goto L_0x0016
        L_0x009d:
            boolean r1 = r0 instanceof X.HIO
            if (r1 == 0) goto L_0x00d0
            r7 = r0
            X.HIO r7 = (X.HIO) r7
            boolean r1 = r8.A0I()
            if (r1 == 0) goto L_0x0016
            androidx.fragment.app.Fragment r1 = X.C56604I4d.A09(r8)
            android.view.View r6 = r1.mView
            if (r6 == 0) goto L_0x0016
            X.0sa r1 = r7.A01
            if (r1 == 0) goto L_0x00ce
            android.content.Context r2 = r8.A00
            r1 = 2131966330(0x7f13397a, float:1.9569495E38)
            java.lang.String r5 = r2.getString(r1)
        L_0x00bf:
            X.JRz r4 = r8.A08
            r3 = 0
            r2 = 42
            X.PmT r1 = new X.PmT
            r1.<init>(r8, r7, r5, r2)
            r4.Etm(r3, r6, r1)
            goto L_0x0016
        L_0x00ce:
            r5 = 0
            goto L_0x00bf
        L_0x00d0:
            boolean r1 = r0 instanceof X.HIH
            if (r1 == 0) goto L_0x011c
            r2 = r0
            X.HIH r2 = (X.HIH) r2
            X.C54556HIr.A03(r8)
            X.HtY r11 = r2.A00
            if (r11 == 0) goto L_0x00fc
            X.GgI r1 = r8.A02
            java.lang.String r3 = "editViewModel"
            if (r1 == 0) goto L_0x001c
            r10 = 0
            r14 = 0
            X.I1n r9 = new X.I1n
            r12 = r10
            r13 = r10
            r9.<init>(r10, r11, r12, r13, r14)
            com.meta.metaai.imagine.creation.impl.data.ImagineEditRepository r1 = r1.A05
            r1.A04(r9)
            boolean r1 = r2.A01
            if (r1 == 0) goto L_0x00fc
            X.GgI r1 = r8.A02
            if (r1 != 0) goto L_0x00fc
            goto L_0x001c
        L_0x00fc:
            java.lang.Integer r5 = r8.A0F
            java.lang.Integer r4 = X.AnonymousClass05K.A01
            int r3 = r8.A07
            r1 = 37
            X.Ivw r2 = X.C58687Ivw.A00(r11, r8, r1)
            X.Di6 r1 = X.C46626Di6.FULL_SHEET
            X.I4X r3 = X.I4X.A00(r1, r5, r4, r2, r3)
            r1 = 41
            X.J6T r2 = new X.J6T
            r2.<init>((int) r1, (java.lang.Object) r11, (java.lang.Object) r8)
            java.lang.String r1 = "ImagineEditFlow"
            r8.A0E(r3, r1, r2)
            goto L_0x0016
        L_0x011c:
            boolean r1 = r0 instanceof X.HIM
            if (r1 == 0) goto L_0x0016
            X.4Co r1 = r8.A06
            X.4D7 r4 = X.C51975G9x.A0t(r1)
            androidx.fragment.app.Fragment r1 = X.C56604I4d.A09(r8)
            X.0xx r3 = X.AnonymousClass07a.A00(r1)
            r2 = 37
            X.MGC r1 = new X.MGC
            r1.<init>(r8, r4, r2)
            X.1Er r1 = X.C51966G9m.A1L(r1, r3)
            r8.A06 = r1
            goto L_0x0016
        L_0x013d:
            r1 = 0
            X.0qQ.A0B(r0, r1)
            X.HQ3 r1 = r2.A02
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x03f0
            X.05G r2 = r2.A0J
        L_0x014b:
            java.lang.Object r1 = r2.getValue()
            X.HIL r0 = X.HIL.A00
            boolean r0 = r2.AIY(r1, r0)
            if (r0 == 0) goto L_0x014b
            goto L_0x03f0
        L_0x0159:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x015e:
            X.JNK r0 = (X.JNK) r0
            java.lang.Object r2 = r2.A01
            X.K74 r2 = (X.K74) r2
            boolean r1 = r0 instanceof X.C57697If0
            if (r1 == 0) goto L_0x0181
            X.If0 r0 = (X.C57697If0) r0
            java.lang.String r5 = r0.A02
            java.lang.String r6 = r0.A01
            X.3gp r4 = r0.A00
            androidx.fragment.app.FragmentActivity r1 = r2.getActivity()
            if (r1 == 0) goto L_0x03f0
            X.0eM r0 = r2.A03
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r0)
            X.C39571A0n.A00(r1, r2, r3, r4, r5, r6)
            goto L_0x03f0
        L_0x0181:
            boolean r1 = r0 instanceof X.C57696Iez
            if (r1 == 0) goto L_0x0196
            X.Iez r0 = (X.C57696Iez) r0
            X.Tzd r1 = r0.A00
            X.0eM r0 = r2.A05
            java.lang.Object r0 = r0.getValue()
            X.FnN r0 = (X.C51031FnN) r0
            r0.A02(r1)
            goto L_0x03f0
        L_0x0196:
            boolean r1 = r0 instanceof X.C57695Iey
            if (r1 == 0) goto L_0x01ab
            X.Iey r0 = (X.C57695Iey) r0
            java.lang.String r1 = r0.A00
            X.0eM r0 = r2.A05
            java.lang.Object r0 = r0.getValue()
            X.FnN r0 = (X.C51031FnN) r0
            r0.A05(r1)
            goto L_0x03f0
        L_0x01ab:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x01b0:
            X.Jvs r0 = (X.C61054Jvs) r0
            java.lang.Object r1 = r2.A01
            X.K4o r1 = (X.C61370K4o) r1
            X.0eM r1 = r1.A00
            java.lang.Object r4 = r1.getValue()
            X.2t9 r4 = (X.AnonymousClass2t9) r4
            if (r4 == 0) goto L_0x03f0
            java.lang.Object r0 = r0.A00
            java.util.List r0 = (java.util.List) r0
            java.util.ArrayList r3 = X.AnonymousClass7TG.A0r(r0)
            java.util.Iterator r2 = r0.iterator()
        L_0x01cc:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x01e5
            java.lang.Object r0 = r2.next()
            X.Jvs r0 = (X.C61054Jvs) r0
            java.lang.Object r1 = r0.A00
            com.instagram.user.model.User r1 = (com.instagram.user.model.User) r1
            X.IOT r0 = new X.IOT
            r0.<init>(r1)
            r3.add(r0)
            goto L_0x01cc
        L_0x01e5:
            r4.A08(r3)
            goto L_0x03f0
        L_0x01ea:
            X.HLM r0 = (X.HLM) r0
            java.lang.Object r1 = r2.A01
            X.HIq r1 = (X.C54555HIq) r1
            X.HLM r5 = X.HLM.LIGHT_MODE
            r3 = 0
            if (r0 == r5) goto L_0x0202
            X.05G r2 = r1.A03
            java.lang.Object r2 = r2.getValue()
            X.HtX r2 = (X.C56145HtX) r2
            boolean r2 = r2.A09
            r14 = 0
            if (r2 == 0) goto L_0x0203
        L_0x0202:
            r14 = 1
        L_0x0203:
            X.05G r2 = r1.A03
            java.lang.Object r2 = r2.getValue()
            X.HtX r2 = (X.C56145HtX) r2
            int r4 = r0.ordinal()
            if (r4 == r3) goto L_0x024a
            r3 = 1
            if (r4 != r3) goto L_0x024c
            r3 = -1
            android.graphics.drawable.ColorDrawable r3 = X.C51965G9l.A0D(r3)
        L_0x0219:
            if (r0 != r5) goto L_0x023e
            java.lang.Integer r10 = X.AnonymousClass05K.A01
        L_0x021d:
            java.lang.CharSequence r7 = r2.A06
            java.lang.Integer r9 = r2.A08
            long r11 = r2.A00
            boolean r13 = r2.A0B
            X.I1u r6 = r2.A04
            X.HtV r5 = r2.A03
            X.2WX r4 = r2.A02
            java.lang.CharSequence r8 = r2.A05
            boolean r15 = r2.A0A
            r0 = 9
            X.0qQ.A0B(r10, r0)
            X.HtX r2 = new X.HtX
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r13, r14, r15)
            r1.A0G(r2)
            goto L_0x03f0
        L_0x023e:
            X.HtW r0 = r1.A06
            boolean r0 = r0.A09
            if (r0 == 0) goto L_0x0247
            java.lang.Integer r10 = X.AnonymousClass05K.A00
            goto L_0x021d
        L_0x0247:
            java.lang.Integer r10 = X.AnonymousClass05K.A0C
            goto L_0x021d
        L_0x024a:
            r3 = 0
            goto L_0x0219
        L_0x024c:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0251:
            X.HMO r0 = (X.HMO) r0
            java.lang.Object r2 = r2.A01
            X.HIq r2 = (X.C54555HIq) r2
            int r1 = r0.ordinal()
            r7 = 0
            r10 = 1
            switch(r1) {
                case 0: goto L_0x02da;
                case 1: goto L_0x0265;
                case 2: goto L_0x0265;
                case 3: goto L_0x026e;
                case 4: goto L_0x026e;
                case 5: goto L_0x0292;
                case 6: goto L_0x026e;
                case 7: goto L_0x02b5;
                case 8: goto L_0x02b9;
                default: goto L_0x0260;
            }
        L_0x0260:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0265:
            X.HMO r1 = X.HMO.CAPTURE_CONSENT
            if (r0 == r1) goto L_0x026a
            r10 = 0
        L_0x026a:
            X.C54555HIq.A03(r2, r10)
            goto L_0x02da
        L_0x026e:
            X.0sP r1 = r2.A0C
            X.HIl r0 = new X.HIl
            r0.<init>()
            r1.invoke(r0)
            r2.A03 = r10
            X.HtW r0 = r2.A06
            boolean r0 = r0.A08
            if (r0 == 0) goto L_0x02b1
            X.I0l r0 = X.C56604I4d.A0A(r2)
            X.HtS r1 = r0.A00
            if (r1 == 0) goto L_0x02da
            r0 = 11
            X.IwH r0 = X.C58708IwH.A01(r1, r0)
            r1.A01(r0)
            goto L_0x02da
        L_0x0292:
            X.GgN r0 = X.C54555HIq.A00(r2)
            X.62P r1 = r0.A02
            X.0sP r3 = r2.A0C
            if (r1 != 0) goto L_0x02a2
            X.0sn r0 = X.0sn.A00
            X.62P r1 = X.AnonymousClass62Q.A00(r0)
        L_0x02a2:
            X.I1Y r0 = new X.I1Y
            r0.<init>(r1)
            X.HIm r1 = new X.HIm
            r1.<init>(r0)
            r3.invoke(r1)
            r2.A03 = r10
        L_0x02b1:
            r2.A0D()
            goto L_0x02da
        L_0x02b5:
            X.C54555HIq.A01(r2)
            goto L_0x02da
        L_0x02b9:
            X.C54555HIq.A02(r2)
            r0 = 23
            X.IwN r8 = X.C58714IwN.A01(r2, r0)
            X.Di6 r5 = X.C46626Di6.FULL_SHEET
            java.lang.Integer r6 = X.AnonymousClass05K.A0C
            r9 = 48
            com.meta.foa.cds.CdsBottomSheetDimmingBehaviour$Default r4 = com.meta.foa.cds.CdsBottomSheetDimmingBehaviour.Default.A00
            X.I4X r3 = new X.I4X
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            r0 = 19
            X.J6n r1 = X.C59105J6n.A02(r2, r0)
            java.lang.String r0 = "MEmuPrivacySettingsScreen"
            r2.A0E(r3, r0, r1)
        L_0x02da:
            X.GgN r1 = X.C54555HIq.A00(r2)
            X.HIU r0 = X.HIU.A00
            r1.A0F(r0)
            goto L_0x03f0
        L_0x02e5:
            java.lang.Object r3 = r2.A01
            X.HIr r3 = (X.C54556HIr) r3
            boolean r2 = r0 instanceof X.I1K
            r1 = 0
            if (r2 == 0) goto L_0x030f
            boolean r0 = r3.A0K
            if (r0 != 0) goto L_0x02f5
            r3.A0H(r1)
        L_0x02f5:
            android.content.Context r1 = r3.A00
            r0 = 2131966390(0x7f1339b6, float:1.9569617E38)
            java.lang.String r1 = X.AnonymousClass7TE.A16(r1, r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A01
        L_0x0300:
            X.C54556HIr.A05(r3, r0, r1)
        L_0x0303:
            X.GgP r0 = r3.A01
            if (r0 != 0) goto L_0x0322
            X.C51965G9l.A15()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x030f:
            boolean r0 = r0 instanceof X.I1J
            if (r0 == 0) goto L_0x0303
            X.C54556HIr.A02(r3)
            android.content.Context r1 = r3.A00
            r0 = 2131966353(0x7f133991, float:1.9569542E38)
            java.lang.String r1 = X.AnonymousClass7TE.A16(r1, r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            goto L_0x0300
        L_0x0322:
            X.05G r1 = r0.A0I
            X.I1I r0 = X.I1I.A00
            r1.Epw(r0)
            goto L_0x03f0
        L_0x032b:
            X.HQ2 r0 = (X.HQ2) r0
            java.lang.Object r1 = r2.A01
            X.HIr r1 = (X.C54556HIr) r1
            X.C54556HIr.A04(r1, r0)
            goto L_0x03f0
        L_0x0336:
            X.HsX r0 = (X.C56084HsX) r0
            java.lang.Object r3 = r2.A01
            X.NJ8 r3 = (X.NJ8) r3
            if (r0 == 0) goto L_0x03f0
            com.meta.metaai.components.animation.ui.view.SpeechIndicatorView r5 = r3.A0A
            if (r5 == 0) goto L_0x0398
            float r2 = r0.A00
            r1 = 1043207291(0x3e2e147b, float:0.17)
            float r2 = r2 - r1
            r1 = 1062501089(0x3f547ae1, float:0.83)
            float r2 = r2 / r1
            r6 = 0
            float r1 = java.lang.Math.max(r2, r6)
            r7 = 1065353216(0x3f800000, float:1.0)
            float r4 = java.lang.Math.min(r1, r7)
            java.util.LinkedList r8 = r5.A0U
            int r2 = r8.size()
            int r1 = r5.A0O
            if (r2 < r1) goto L_0x0371
            java.lang.Object r1 = X.00k.A0K(r8)
            float r2 = X.AnonymousClass7TE.A04(r1)
            float r1 = r5.A03
            float r1 = r1 - r2
            r5.A03 = r1
            r8.removeLast()
        L_0x0371:
            java.lang.Float r1 = java.lang.Float.valueOf(r4)
            r8.addFirst(r1)
            float r2 = r5.A03
            float r2 = r2 + r4
            r5.A03 = r2
            int r1 = r8.size()
            float r1 = (float) r1
            float r2 = r2 / r1
            float r1 = java.lang.Math.max(r2, r6)
            float r1 = java.lang.Math.min(r1, r7)
            float r1 = r4 - r1
            float r1 = java.lang.Math.max(r1, r6)
            r5.A09 = r1
            r5.A02 = r4
            r5.invalidate()
        L_0x0398:
            com.meta.metaai.components.animation.ui.view.ListeningIndicatorView r2 = r3.A09
            if (r2 == 0) goto L_0x03f0
            float r1 = r0.A01
            X.0eM r0 = r3.A0N
            java.lang.Object r0 = r0.getValue()
            X.GhO r0 = (X.C53033GhO) r0
            X.0Ud r0 = r0.A0B
            java.lang.Object r0 = r0.getValue()
            X.I4Z r0 = (X.I4Z) r0
            X.HMJ r0 = r0.A01
            r2.A01(r0, r1)
            goto L_0x03f0
        L_0x03b4:
            X.JMP r0 = (X.JMP) r0
            java.lang.Object r4 = r2.A01
            X.NJ8 r4 = (X.NJ8) r4
            boolean r1 = r0 instanceof X.C57562Icp
            if (r1 == 0) goto L_0x03f3
            r1 = 4
            java.lang.String r2 = X.C66579MXk.A00(r1)
            r1 = 2591(0xa1f, float:3.631E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            X.0eP r2 = X.AnonymousClass7TE.A1L(r2, r1)
            X.Icp r0 = (X.C57562Icp) r0
            java.lang.String r1 = r0.A00
            r0 = 3481(0xd99, float:4.878E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            android.os.Bundle r5 = X.AnonymousClass7TG.A0P(r0, r1, r2)
            X.0eM r0 = r4.A0Q
            X.0lg r3 = X.DbT.A0X(r0)
            java.lang.Class<com.instagram.modal.TransparentBackgroundModalActivity> r2 = com.instagram.modal.TransparentBackgroundModalActivity.class
            androidx.fragment.app.FragmentActivity r1 = r4.getActivity()
            java.lang.String r0 = "bottom_sheet"
            X.6W8 r0 = X.DbS.A0b(r1, r5, r3, r2, r0)
            X.DbT.A1M(r4, r0)
        L_0x03f0:
            X.0gF r0 = X.C60340gF.A00
            return r0
        L_0x03f3:
            boolean r1 = r0 instanceof X.C57561Ico
            if (r1 == 0) goto L_0x040b
            android.content.Context r3 = r4.requireContext()
            X.0eM r1 = r4.A0Q
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r1)
            X.Ico r0 = (X.C57561Ico) r0
            java.lang.String r1 = r0.A00
            X.2EG r0 = X.2EG.A0I
            X.Dbb.A0k(r3, r2, r0, r1)
            goto L_0x03f0
        L_0x040b:
            boolean r1 = r0 instanceof X.C57560Icn
            if (r1 == 0) goto L_0x03f0
            X.Icn r0 = (X.C57560Icn) r0
            java.lang.String r3 = r0.A00
            X.14C r0 = X.AnonymousClass14B.A03
            X.14B r2 = r0.A00()
            android.content.Context r1 = r4.requireContext()
            android.net.Uri r0 = X.DbT.A09(r3)
            android.content.Intent r1 = r2.A04(r1, r0)
            X.0b6 r0 = X.0kR.A00
            boolean r0 = r4.isAdded()
            if (r0 == 0) goto L_0x03f0
            androidx.fragment.app.FragmentActivity r0 = r4.getActivity()
            if (r0 == 0) goto L_0x03f0
            X.0kR.A0B(r0, r1)
            goto L_0x03f0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58023IkG.emit(java.lang.Object, X.4D7):java.lang.Object");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof 02o) || !(obj instanceof C61910qF)) {
            return false;
        }
        return AnonymousClass7TG.A1Y(obj, getFunctionDelegate());
    }

    public final AnonymousClass0eL getFunctionDelegate() {
        Class cls;
        int i;
        String A002;
        String str;
        int i2 = this.A00;
        Object obj = this.A01;
        switch (i2) {
            case 0:
                cls = NJ8.class;
                i = 2;
                A002 = AnonymousClass000.A00(4809);
                str = "handleUiEffect(Lcom/meta/metaai/components/voice/uieffect/MetaAIMultimodalComponentUIEffect;)V";
                break;
            case 1:
                cls = NJ8.class;
                i = 2;
                A002 = "handleAudioLevelEffect";
                str = "handleAudioLevelEffect(Lcom/meta/metaai/components/voice/uieffect/MetaAIVoiceAudioLevelEffect;)V";
                break;
            case 4:
                cls = C54556HIr.class;
                i = 2;
                A002 = "handleCreationHeader";
                str = "handleCreationHeader(Lcom/meta/metaai/imagine/creation/impl/viewmodel/ImagineScreenNavigationState;)V";
                break;
            case 5:
                cls = C54556HIr.class;
                i = 2;
                A002 = "handleFeedbackUiEffect";
                str = "handleFeedbackUiEffect(Lcom/meta/metaai/imagine/creation/impl/viewmodel/FeedbackUiEffect;)V";
                break;
            case 6:
                cls = C54555HIq.class;
                i = 2;
                A002 = "handleNavigation";
                str = "handleNavigation(Lcom/meta/metaai/imagine/memu/impl/viewmodel/MEmuOnboardingNavigationState;)V";
                break;
            case 7:
                cls = C54555HIq.class;
                i = 2;
                A002 = "handleBackgroundConfig";
                str = "handleBackgroundConfig(Lcom/meta/metaai/imagine/memu/impl/viewmodel/BackgroundConfig;)V";
                break;
            case 8:
                cls = C61370K4o.class;
                i = 2;
                A002 = "updateView";
                str = "updateView(Linstagram/features/stories/fragment/userlist/comments/viewmodel/StoryCommentLikesViewModel$ViewState;)V";
                break;
            case 9:
                cls = K74.class;
                i = 2;
                A002 = AnonymousClass000.A00(3208);
                str = "handleViewEffect(Linstagram/features/stories/fragment/userlist/comments/viewmodel/StoryCommentsDashboardViewModel$ViewEffect;)V";
                break;
            default:
                cls = C54556HIr.class;
                i = 2;
                A002 = "handleNavigation";
                str = "handleNavigation(Lcom/meta/metaai/imagine/creation/impl/viewmodel/ImagineTopLevelNavigationState;)V";
                break;
        }
        return new 0Yk(i, obj, cls, A002, str, 4);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
