package X;

import android.view.View;

/* renamed from: X.SbK  reason: case insensitive filesystem */
public final class C11497SbK implements View.OnClickListener {
    public final int A00;
    public final Object A01;

    public C11497SbK(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A01(View view, int i, Object obj) {
        AnonymousClass0fU.A00(new C11497SbK(obj, i), view);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v60, resolved type: X.SHz} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v62, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r1v17, types: [com.facebook.fxcropapp.ig.IgCropActivity, android.app.Activity] */
    /* JADX WARNING: type inference failed for: r3v20, types: [com.facebook.smartcapture.view.PhotoReviewActivity, android.app.Activity] */
    /* JADX WARNING: type inference failed for: r3v22, types: [com.facebook.smartcapture.view.BaseSelfieCaptureActivity, android.app.Activity] */
    /* JADX WARNING: type inference failed for: r3v24, types: [com.facebook.smartcapture.view.BaseSelfieCaptureActivity, android.app.Activity] */
    /* JADX WARNING: type inference failed for: r2v59 */
    /* JADX WARNING: type inference failed for: r2v83 */
    /* JADX WARNING: type inference failed for: r2v84 */
    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x00b4: MOVE  (r1v154 X.TaY) = (r1v153 X.TaY)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x04d8  */
    public final void onClick(android.view.View r19) {
        /*
            r18 = this;
            r1 = r18
            int r0 = r1.A00
            r8 = r19
            switch(r0) {
                case 0: goto L_0x0594;
                case 1: goto L_0x0549;
                case 2: goto L_0x0f93;
                case 3: goto L_0x0531;
                case 4: goto L_0x0f75;
                case 5: goto L_0x0f57;
                case 6: goto L_0x051b;
                case 7: goto L_0x0f45;
                case 8: goto L_0x0495;
                case 9: goto L_0x0f2f;
                case 10: goto L_0x0e6d;
                case 11: goto L_0x0dfb;
                case 12: goto L_0x0173;
                case 13: goto L_0x0de4;
                case 14: goto L_0x0155;
                case 15: goto L_0x0052;
                case 16: goto L_0x0dca;
                case 17: goto L_0x0d94;
                case 18: goto L_0x0d74;
                case 19: goto L_0x0d61;
                case 20: goto L_0x0d1c;
                case 21: goto L_0x0cfe;
                case 22: goto L_0x0c95;
                case 23: goto L_0x0c78;
                case 24: goto L_0x0c67;
                case 25: goto L_0x0c17;
                case 26: goto L_0x084f;
                case 27: goto L_0x0125;
                case 28: goto L_0x00ee;
                case 29: goto L_0x0c0b;
                case 30: goto L_0x081d;
                case 31: goto L_0x0bfa;
                case 32: goto L_0x0735;
                case 33: goto L_0x0be9;
                case 34: goto L_0x0b6c;
                case 35: goto L_0x0b4f;
                case 36: goto L_0x0b1e;
                case 37: goto L_0x0af8;
                case 38: goto L_0x0ae7;
                case 39: goto L_0x0085;
                case 40: goto L_0x0adb;
                case 41: goto L_0x0aca;
                case 42: goto L_0x0a9f;
                case 43: goto L_0x0a74;
                case 44: goto L_0x0a1c;
                case 45: goto L_0x0a10;
                case 46: goto L_0x09ff;
                case 47: goto L_0x09db;
                case 48: goto L_0x09b6;
                case 49: goto L_0x099c;
                case 50: goto L_0x0989;
                case 51: goto L_0x0969;
                case 52: goto L_0x095d;
                case 53: goto L_0x0023;
                case 54: goto L_0x094c;
                case 55: goto L_0x0939;
                case 56: goto L_0x032e;
                case 57: goto L_0x090b;
                case 58: goto L_0x08ff;
                case 59: goto L_0x0706;
                case 60: goto L_0x08e8;
                case 61: goto L_0x061e;
                case 62: goto L_0x08dc;
                case 63: goto L_0x08cb;
                case 64: goto L_0x08b6;
                case 65: goto L_0x031d;
                case 66: goto L_0x08a1;
                case 67: goto L_0x088c;
                case 68: goto L_0x0877;
                case 69: goto L_0x005d;
                default: goto L_0x0009;
            }
        L_0x0009:
            r0 = 1200458409(0x478d8aa9, float:72469.32)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.Q9w r0 = (X.Q9w) r0
            X.Qfd r0 = r0.A00
            if (r0 != 0) goto L_0x0fa5
            java.lang.String r8 = "viewModel"
        L_0x001b:
            X.0qQ.A0F(r8)
        L_0x001e:
            X.00P r1 = X.AnonymousClass00P.createAndThrow()
            throw r1
        L_0x0023:
            r0 = -1005321357(0xffffffffc4140373, float:-592.0539)
            int r5 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r1.A01
            X.Qcz r3 = (X.C7928Qcz) r3
            java.util.List r0 = r3.A01
            X.0qQ.A0A(r0)
            java.util.Iterator r2 = r0.iterator()
        L_0x0037:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0048
            java.lang.Object r1 = r2.next()
            android.view.View r1 = (android.view.View) r1
            r0 = 0
            r1.setVisibility(r0)
            goto L_0x0037
        L_0x0048:
            android.widget.FrameLayout r0 = r3.A00
            X.Pxi.A18(r0)
            r0 = -1700476068(0xffffffff9aa4cb5c, float:-6.8157355E-23)
            goto L_0x00ea
        L_0x0052:
            r0 = 1197494822(0x47605226, float:57426.15)
            X.AnonymousClass0fD.A05(r0)
            r0 = 0
            X.0qQ.A0A(r0)
            goto L_0x001e
        L_0x005d:
            r0 = -40647583(0xfffffffffd93c461, float:-2.4552022E37)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.Q9y r0 = (X.Q9y) r0
            X.Qfg r3 = r0.A00
            java.lang.String r8 = "viewModel"
            if (r3 == 0) goto L_0x001b
            java.lang.Object r0 = X.SRc.A0A(r3)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = X.AnonymousClass7TG.A1X(r0)
            r1 = r0 ^ 1
            X.2gB r0 = r3.A05
            X.JTP.A1B(r0, r1)
            r0 = -1229049064(0xffffffffb6be3318, float:-5.6683893E-6)
            goto L_0x0fb3
        L_0x0085:
            r0 = -495338023(0xffffffffe279bdd9, float:-1.1517298E21)
            int r5 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r7 = r1.A01
            X.Qcy r7 = (X.C7927Qcy) r7
            com.facebook.smartcapture.logging.SelfieCaptureLogger r1 = r7.A00
            if (r1 == 0) goto L_0x009a
            java.lang.String r0 = "show_photo_requirements"
            r1.logButtonClick(r0)
        L_0x009a:
            android.view.animation.Interpolator r0 = X.C7927Qcy.A0S
            androidx.fragment.app.FragmentActivity r6 = r7.getActivity()
            if (r6 == 0) goto L_0x00e7
            android.widget.FrameLayout r0 = r7.A01
            java.lang.String r8 = "overlayContainer"
            if (r0 == 0) goto L_0x001b
            r0.removeAllViews()
            androidx.fragment.app.FragmentActivity r1 = r7.getActivity()
            boolean r0 = r1 instanceof X.C13445TaY
            if (r0 == 0) goto L_0x00e7
            X.TaY r1 = (X.C13445TaY) r1
            if (r1 == 0) goto L_0x00e7
            com.facebook.smartcapture.view.BaseSelfieCaptureActivity r1 = (com.facebook.smartcapture.view.BaseSelfieCaptureActivity) r1
            com.facebook.smartcapture.ui.SelfieCaptureUi r2 = r1.A05
            if (r2 == 0) goto L_0x00e7
            r0 = 2130970982(0x7f040966, float:1.755069E38)
            int r4 = X.C11408SSf.A01(r6, r0)
            X.Tic r1 = r7.A00
            boolean r0 = r7.A0H
            X.Q9o r3 = new X.Q9o
            r3.<init>(r6, r1, r2, r0)
            r0 = 0
            X.Q9N r2 = new X.Q9N
            r2.<init>(r6, r3, r4, r0)
            android.widget.FrameLayout r0 = r7.A01
            if (r0 == 0) goto L_0x001b
            r0.addView(r2)
            r2.A01()
            r1 = 40
            X.SbK r0 = new X.SbK
            r0.<init>(r2, r1)
            r3.A00 = r0
        L_0x00e7:
            r0 = 1135103533(0x43a84e2d, float:336.61075)
        L_0x00ea:
            X.AnonymousClass0fD.A0C(r0, r5)
            return
        L_0x00ee:
            r0 = 473630102(0x1c3b0596, float:6.188033E-22)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.Qcm r0 = (X.C7915Qcm) r0
            java.lang.ref.WeakReference r0 = r0.A00
            if (r0 == 0) goto L_0x0120
            java.lang.Object r0 = r0.get()
            X.Td9 r0 = (X.C13583Td9) r0
            if (r0 == 0) goto L_0x0120
            com.facebook.smartcapture.view.IdCaptureActivity r0 = (com.facebook.smartcapture.view.IdCaptureActivity) r0
            X.SoH r3 = r0.A03
            if (r3 == 0) goto L_0x0150
            X.SOi r0 = r3.A0C
            r0.A02()
            com.facebook.smartcapture.docauth.CaptureState r0 = com.facebook.smartcapture.docauth.CaptureState.DOWNLOADING_DEPS
            r3.A04 = r0
            r1 = 0
            r0 = 0
            X.C12166SoH.A01(r1, r3, r0)
            com.facebook.smartcapture.logging.IdCaptureLogger r1 = r3.A0E
            com.facebook.smartcapture.logging.IdCaptureButton r0 = com.facebook.smartcapture.logging.IdCaptureButton.DOWNLOAD_RETRY
            r1.logButtonClick(r0)
        L_0x0120:
            r0 = -1621561001(0xffffffff9f58f157, float:-4.593941E-20)
            goto L_0x0fb3
        L_0x0125:
            r0 = -1463379264(0xffffffffa8c69ac0, float:-2.2049528E-14)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.Qcm r0 = (X.C7915Qcm) r0
            java.lang.ref.WeakReference r0 = r0.A00
            if (r0 == 0) goto L_0x014b
            java.lang.Object r0 = r0.get()
            X.Td9 r0 = (X.C13583Td9) r0
            if (r0 == 0) goto L_0x014b
            com.facebook.smartcapture.view.IdCaptureActivity r0 = (com.facebook.smartcapture.view.IdCaptureActivity) r0
            X.SoH r3 = r0.A03
            if (r3 == 0) goto L_0x0150
            com.facebook.smartcapture.docauth.CaptureState r0 = com.facebook.smartcapture.docauth.CaptureState.CAPTURING_MANUAL
            r3.A04 = r0
            r1 = 0
            r0 = 1
            X.C12166SoH.A01(r1, r3, r0)
        L_0x014b:
            r0 = -1754001883(0xffffffff97740e25, float:-7.8858505E-25)
            goto L_0x0fb3
        L_0x0150:
            java.lang.String r8 = "presenter"
            goto L_0x001b
        L_0x0155:
            r0 = -679327440(0xffffffffd7824930, float:-2.86501699E14)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r7 = r1.A01
            X.QKw r7 = (X.C7581QKw) r7
            X.0qQ.A0A(r8)
            r9 = 0
            X.0qQ.A0B(r8, r9)
            r10 = 1
            r7.A05 = r10
            X.S4r r0 = r7.A02
            r6 = 0
            if (r0 != 0) goto L_0x05ba
            java.lang.String r8 = "logger"
            goto L_0x001b
        L_0x0173:
            r0 = 1701962201(0x6571e1d9, float:7.139103E22)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.QKG r0 = (X.QKG) r0
            X.STY r1 = r0.A01
            if (r1 == 0) goto L_0x01fe
            java.lang.Object r6 = X.Pxj.A0k(r0)
            com.fbpay.w3c.CardDetails r6 = (com.fbpay.w3c.CardDetails) r6
            android.os.Bundle r3 = r0.requireArguments()
            java.lang.String r1 = "contact_info"
            android.os.Parcelable r4 = r3.getParcelable(r1)
            java.lang.Class<com.facebook.browser.lite.extensions.autofill.model.AutofillData> r3 = com.facebook.browser.lite.extensions.autofill.model.AutofillData.class
            android.os.Parcelable$Creator r1 = com.facebook.browser.lite.extensions.autofill.model.AutofillData.CREATOR
            java.lang.Object r1 = X.0B0.A01(r1, r4, r3)
            com.facebook.browser.lite.extensions.autofill.model.AutofillData r1 = (com.facebook.browser.lite.extensions.autofill.model.AutofillData) r1
            boolean r3 = r0.A03
            if (r3 == 0) goto L_0x01ea
            if (r6 == 0) goto L_0x01ea
            if (r1 == 0) goto L_0x01ea
            r8 = 0
            java.util.Map r4 = r1.A00
            java.lang.String r3 = "name"
            java.lang.String r10 = X.DbT.A11(r3, r4)
            java.lang.String r3 = "address-line1"
            java.lang.String r15 = X.DbT.A11(r3, r4)
            java.lang.String r3 = "address-line2"
            java.lang.String r16 = X.DbT.A11(r3, r4)
            java.lang.String r3 = "address-level2"
            java.lang.String r11 = X.DbT.A11(r3, r4)
            java.lang.String r3 = "address-level1"
            java.lang.String r14 = X.DbT.A11(r3, r4)
            java.lang.String r3 = "postal-code"
            java.lang.String r17 = X.DbT.A11(r3, r4)
            com.fbpay.w3c.Address r7 = new com.fbpay.w3c.Address
            r9 = r7
            r12 = r8
            r13 = r8
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17)
            java.lang.String r14 = r6.A07
            java.lang.String r12 = r6.A05
            java.lang.String r3 = r6.A09
            java.lang.Integer r10 = r6.A03
            java.lang.Integer r11 = r6.A04
            com.fbpay.w3c.CardDetails r6 = new com.fbpay.w3c.CardDetails
            r9 = r8
            r15 = r8
            r16 = r3
            r17 = r8
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
        L_0x01ea:
            X.4gR r3 = r0.A00
            if (r3 == 0) goto L_0x01f8
            X.1yd r4 = r3.A04
            r3 = 0
            boolean r3 = r4.A0C(r3)
            if (r3 == 0) goto L_0x01f8
            r1 = 0
        L_0x01f8:
            X.STY r13 = r0.A01
            if (r1 != 0) goto L_0x0211
            if (r6 != 0) goto L_0x0211
        L_0x01fe:
            X.4gR r1 = r0.A00
            if (r1 == 0) goto L_0x0209
            X.RzL r1 = r1.A00
            X.Tnz r3 = r1.A0A
            r1 = 1
            r3.A03 = r1
        L_0x0209:
            r0.A07()
            r0 = 285427079(0x11034587, float:1.0355503E-28)
            goto L_0x0fb3
        L_0x0211:
            X.SGp r5 = new X.SGp
            r5.<init>(r1, r6)
            com.fbpay.w3c.CardDetails r10 = r5.A01
            if (r10 == 0) goto L_0x02b1
            X.4gR r6 = r13.A0T
            X.1yd r1 = r6.A04
            r9 = 1
            boolean r3 = r1.A0E(r9)
            X.0JP r1 = r13.A08
            long r14 = r1.now()
            if (r3 == 0) goto L_0x0257
            X.S33 r3 = r13.A09
            if (r3 == 0) goto L_0x02b1
            X.2Fj r11 = X.JTO.A0K()
            X.C9680Rey.A00(r10)     // Catch:{ IllegalArgumentException -> 0x028a }
            android.content.Context r1 = r3.A01
            r1.getApplicationContext()
            X.AnonymousClass2E0.A0D()
            X.S7C r1 = r3.A00
            if (r1 != 0) goto L_0x0247
            java.lang.String r8 = "w3cAppRepo"
            goto L_0x001b
        L_0x0247:
            X.5A6 r7 = r1.A01(r10)
            X.07Z r4 = r3.A02
            r3 = 3
            X.MMr r1 = new X.MMr
            r1.<init>(r11, r3)
            X.C9678Rew.A00(r4, r7, r1)
            goto L_0x028e
        L_0x0257:
            X.2Fg r8 = r13.A0A
            if (r8 == 0) goto L_0x02b1
            X.2Fj r11 = X.JTO.A0K()
            android.content.Context r3 = r8.A04
            android.content.Context r7 = r3.getApplicationContext()
            X.SVY r4 = new X.SVY
            r4.<init>(r7, r11, r10, r8)
            java.lang.String r1 = "com.fbpay.w3c.FB_EXTENSIONS"
            android.content.Intent r3 = X.2Fg.A01(r3, r8, r1)
            if (r3 == 0) goto L_0x0287
            X.0R3 r1 = X.Pxf.A0O()
            boolean r1 = r1.A04(r7, r3, r4, r9)
            if (r1 != 0) goto L_0x028e
            java.lang.String r3 = "Couldn't bind to service"
        L_0x027e:
            java.lang.Throwable r1 = new java.lang.Throwable
            r1.<init>(r3)
            X.SEH.A00(r11, r1)
            goto L_0x028e
        L_0x0287:
            java.lang.String r3 = "Couldn't find intent for service"
            goto L_0x027e
        L_0x028a:
            r1 = move-exception
            X.SEH.A00(r11, r1)
        L_0x028e:
            X.RzL r1 = r6.A00
            X.JV5 r1 = r1.A0J
            java.lang.Object r12 = r1.A00
            X.RF6 r12 = (X.RF6) r12
            X.07Z r1 = X.STY.A00(r13)
            if (r1 == 0) goto L_0x02a9
            X.07Z r4 = X.STY.A00(r13)
            r3 = 0
            X.Sdq r1 = new X.Sdq
            r1.<init>((int) r3, (java.lang.Object) r11, (java.lang.Object) r13)
            r11.A06(r4, r1)
        L_0x02a9:
            X.Sdc r10 = new X.Sdc
            r10.<init>(r11, r12, r13, r14)
            r11.A09(r10)
        L_0x02b1:
            com.facebook.browser.lite.extensions.autofill.model.AutofillData r1 = r5.A00
            X.QKv r11 = r13.A04
            r11.A0B(r1)
            X.4gR r10 = r13.A0T
            X.RzL r1 = r10.A00
            X.JV5 r6 = r1.A0J
            java.lang.Object r3 = r6.A00
            X.RF6 r1 = X.RF6.NOT_OPT_IN
            if (r3 != r1) goto L_0x031a
            java.lang.String r8 = "ACCEPTED_SAVE"
        L_0x02c6:
            r12 = 1
            r13.A0L = r12
            r9 = 0
            X.RRP r7 = r13.A06(r8)
            boolean r3 = r11.A0H()
            X.1yd r1 = r10.A04
            X.0qQ.A0B(r1, r12)
            if (r3 != 0) goto L_0x0314
            com.instagram.common.session.UserSession r13 = r1.A00
            X.0Tu r1 = X.0Tu.A06
            r3 = 36322860550400618(0x810b7300552a6a, double:3.034061500268554E-306)
            boolean r3 = X.DbY.A1Z(r1, r13, r3)
            if (r3 != 0) goto L_0x02f3
            r3 = 36322860550335081(0x810b7300542a69, double:3.034061500227108E-306)
            boolean r1 = X.DbY.A1Z(r1, r13, r3)
            if (r1 == 0) goto L_0x0314
        L_0x02f3:
            r7.A0P = r9
        L_0x02f5:
            java.lang.String r1 = X.S8J.A00(r5)
            r7.A07 = r1
            X.SUR.A0B(r10, r11, r7)
            java.lang.String r1 = "ACCEPTED_SAVE"
            boolean r1 = r8.equals(r1)
            if (r1 != 0) goto L_0x030e
            java.lang.String r1 = "ACCEPTED_PARTIAL_SAVE"
            boolean r1 = r8.equals(r1)
            if (r1 == 0) goto L_0x01fe
        L_0x030e:
            X.RF6 r1 = X.RF6.OPT_IN
            r6.A00 = r1
            goto L_0x01fe
        L_0x0314:
            X.C11364SPc.A03(r11, r7)
            r6.A01 = r12
            goto L_0x02f5
        L_0x031a:
            java.lang.String r8 = "ACCEPTED_ADD_NEW_CARD"
            goto L_0x02c6
        L_0x031d:
            r0 = 1686858732(0x648b6bec, float:2.0574992E22)
            X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.Qeg r0 = (X.C7993Qeg) r0
            X.0sa r0 = r0.A00
            r0.invoke()
            r1 = 0
            throw r1
        L_0x032e:
            r0 = -1297865537(0xffffffffb2a424bf, float:-1.9108823E-8)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r1.A01
            X.Qd0 r5 = (X.C7929Qd0) r5
            java.lang.String r0 = r5.A0A
            if (r0 == 0) goto L_0x0477
            boolean r0 = r5.A0I
            if (r0 == 0) goto L_0x0354
            com.instagram.common.session.UserSession r2 = r5.A06
            if (r2 == 0) goto L_0x048a
            java.lang.String r1 = r5.A09
            java.lang.String r0 = r5.A0D
            java.lang.String r8 = "av_fbap"
            java.lang.String r9 = "submit_video_selfie"
            r6 = r2
            r7 = r1
            r10 = r0
            X.STD.A05(r5, r6, r7, r8, r9, r10)
        L_0x0354:
            java.lang.String r13 = r5.A0A
            X.0qQ.A0A(r13)
            android.content.Context r11 = r5.requireContext()
            java.lang.String r14 = r5.A0C
            java.lang.String r15 = r5.A0G
            java.lang.String r1 = r5.A0F
            java.lang.String r0 = r5.A0B
            X.S3v r12 = new X.S3v
            r12.<init>(r5)
            X.SFi r10 = new X.SFi
            r17 = r0
            r16 = r1
            r10.<init>(r11, r12, r13, r14, r15, r16, r17)
            com.instagram.common.session.UserSession r3 = r5.A06
            java.lang.String r2 = r5.A0E
            r0 = 1
            X.0qQ.A0B(r2, r0)
            if (r3 == 0) goto L_0x0391
            java.lang.String r1 = r10.A04
            if (r1 == 0) goto L_0x0471
            java.lang.String r0 = "ig_account_access"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0391
            java.lang.String r0 = "ig_hacked_lock"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0471
        L_0x0391:
            X.SIZ r8 = new X.SIZ
            r8.<init>()
            java.lang.String r0 = "authenticity_uploads"
            r8.A03 = r0
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            r8.A01 = r0
            java.lang.Class<X.SAh> r0 = X.C11106SAh.class
            r8.A02(r0)
            java.lang.String r0 = "124024574287414|84a456d620314b6e92a16d8ff1c792dc"
            r8.A02 = r0
            java.lang.String r1 = "id_or_cuid"
            java.lang.String r0 = "cuid_unused"
            X.1Fc r9 = r8.A04
            r9.A05(r1, r0)
            java.lang.String r0 = "ig_id"
            r9.A05(r0, r2)
            android.content.Context r3 = r10.A00
            java.lang.String r2 = X.0qv.A00(r3)
            r1 = 0
            r7 = 9
            r0 = 120(0x78, float:1.68E-43)
            java.lang.String r0 = X.Py0.A01(r1, r7, r0)
            r9.A05(r0, r2)
            X.0qv r0 = X.0qv.A02
            java.lang.String r1 = r0.A05(r3)
            java.lang.String r0 = "machine_id"
            r9.A05(r0, r1)
            java.lang.String r1 = r10.A03
            java.lang.String r0 = "selfie_submission_id"
            r9.A05(r0, r1)
            java.lang.String r0 = X.Py0.A00()
            r9.A05(r0, r0)
            java.lang.String r0 = "return_file_handles"
            java.lang.String r2 = "false"
            r9.A05(r0, r2)
            java.lang.String r1 = "submit_to_authenticity_platform"
            java.lang.String r0 = "true"
            r9.A05(r1, r0)
            java.lang.String r1 = "upload_medium"
            java.lang.String r0 = "SELFIE_VIDEO_NATIVE"
            r9.A05(r1, r0)
            java.lang.String r0 = "use_sync_feedback"
            r9.A05(r0, r2)
            java.lang.String r1 = r10.A04
            if (r1 == 0) goto L_0x0411
            int r0 = r1.length()
            if (r0 == 0) goto L_0x0411
            java.lang.String r0 = "product"
            r9.A05(r0, r1)
        L_0x0411:
            java.lang.String r1 = r10.A05
            if (r1 == 0) goto L_0x0420
            int r0 = r1.length()
            if (r0 == 0) goto L_0x0420
            java.lang.String r0 = "authenticity_entity_id"
            r9.A05(r0, r1)
        L_0x0420:
            java.lang.String r1 = r10.A07
            int r0 = r1.length()
            if (r0 <= 0) goto L_0x0442
            java.io.File r6 = X.AnonymousClass7TE.A0t(r1)
            boolean r0 = r6.exists()
            if (r0 == 0) goto L_0x0442
            java.lang.String r3 = "upload1"
            java.lang.String r2 = "video/mp4"
            java.util.Map r1 = r9.A00
            X.T6D r0 = new X.T6D
            r0.<init>(r6, r2)
            r1.put(r3, r0)
        L_0x0442:
            X.1OC r1 = r8.A01()
            X.R8p r0 = new X.R8p
            r0.<init>((java.lang.Object) r10, (int) r7)
            r1.A00 = r0
            X.1ES.A03(r1)
        L_0x0450:
            X.RBT r2 = new X.RBT
            r2.<init>()
            X.0hq r1 = r5.getParentFragmentManager()
            java.lang.String r0 = "progressDialog"
            r2.A0L(r1, r0)
            X.T6A r3 = r5.A08
            if (r3 == 0) goto L_0x046c
            X.RDG r2 = X.RDG.A02
            X.RDI r1 = X.RDI.A05
            java.lang.String r0 = r5.A0B
            r3.A00(r2, r1, r0)
        L_0x046c:
            r0 = 476235870(0x1c62c85e, float:7.5036096E-22)
            goto L_0x0590
        L_0x0471:
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            X.C11208SFi.A00(r3, r10, r0)
            goto L_0x0450
        L_0x0477:
            java.lang.ref.WeakReference r0 = r5.A00
            java.lang.Object r2 = r0.get()
            X.TaZ r2 = (X.C13446TaZ) r2
            if (r2 == 0) goto L_0x046c
            r1 = 0
            com.facebook.smartcapture.view.SelfieReviewActivity r2 = (com.facebook.smartcapture.view.SelfieReviewActivity) r2
            com.facebook.smartcapture.capture.SelfieEvidence r0 = r2.A00
            r2.A04(r0, r1)
            goto L_0x046c
        L_0x048a:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0y()
            r0 = -813239256(0xffffffffcf86f428, float:-4.5282959E9)
            X.AnonymousClass0fD.A0C(r0, r4)
            throw r1
        L_0x0495:
            r0 = 463967847(0x1ba79667, float:2.7725028E-22)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r1.A01
            X.QKB r3 = (X.QKB) r3
            X.S5W r5 = r3.A01
            r2 = 0
            if (r5 == 0) goto L_0x0506
            java.lang.String r0 = "CLICK_AUTOFILL_DIALOG_NOT_NOW"
            r1 = 0
            X.RRP r5 = r5.A00(r0, r1)
            java.lang.String r0 = r3.A07
            r5.A0A = r0
            java.lang.String r0 = r3.A06
            r5.A08 = r0
            java.util.List r0 = r3.A08
            r6 = 0
            java.lang.Object r0 = r0.get(r1)
            java.util.Set r0 = X.Pxj.A10(r0)
            java.lang.String r0 = X.SUR.A02(r0)
            r5.A07 = r0
            boolean r0 = r3.A01
            if (r0 != 0) goto L_0x04d1
            boolean r1 = r3.A0A
            boolean r0 = r3.A09
            if (r1 == 0) goto L_0x04d2
            if (r0 != 0) goto L_0x04d2
        L_0x04d1:
            r6 = 1
        L_0x04d2:
            r5.A0P = r6
            com.facebook.businessextension.jscalls.RequestAutofillJSBridgeCall r1 = r3.A05
            if (r1 == 0) goto L_0x0502
            X.4gR r0 = r3.A02
            if (r0 == 0) goto L_0x04e2
            X.RzL r0 = r0.A00
            X.QP6 r0 = r0.A06
            java.lang.String r2 = r0.A05
        L_0x04e2:
            r5.A0G = r2
            java.lang.String r0 = "requestAutofillData"
            java.lang.Object r0 = X.Pxh.A0d(r1, r0)
            com.facebook.businessextension.jscalls.RequestAutofillJSBridgeCallData r0 = (com.facebook.businessextension.jscalls.RequestAutofillJSBridgeCallData) r0
            if (r0 != 0) goto L_0x0518
            r0 = 0
        L_0x04f0:
            java.lang.String r0 = X.SUR.A02(r0)
            r5.A06 = r0
            com.facebook.businessextension.jscalls.RequestAutofillJSBridgeCall r0 = r3.A05
            java.util.LinkedHashSet r0 = r0.A01()
            java.lang.String r0 = X.SUR.A02(r0)
            r5.A0F = r0
        L_0x0502:
            X.SHz r2 = r5.A00()
        L_0x0506:
            android.os.Bundle r1 = r3.mArguments
            X.4gR r0 = r3.A02
            X.SUR.A0A(r1, r0, r2)
            android.app.Dialog r0 = r3.A06()
            r0.cancel()
            r0 = -1565007681(0xffffffffa2b7e0bf, float:-4.984021E-18)
            goto L_0x0590
        L_0x0518:
            java.util.LinkedHashSet r0 = r0.A01
            goto L_0x04f0
        L_0x051b:
            r0 = -869936760(0xffffffffcc25d188, float:-4.346832E7)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.0SM r0 = (X.0SM) r0
            android.app.Dialog r0 = r0.A01
            if (r0 == 0) goto L_0x052d
            r0.cancel()
        L_0x052d:
            r0 = 1462966018(0x57331702, float:1.96911399E14)
            goto L_0x0590
        L_0x0531:
            r0 = -1206922813(0xffffffffb80fd1c3, float:-3.4289213E-5)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            com.facebook.browser.lite.chrome.container.defaultchrome.DefaultBrowserLiteChrome r0 = (com.facebook.browser.lite.chrome.container.defaultchrome.DefaultBrowserLiteChrome) r0
            X.7ka r2 = r0.A0D
            if (r2 == 0) goto L_0x0545
            r1 = 1
            r0 = 0
            r2.AI4(r1, r0)
        L_0x0545:
            r0 = -1005662993(0xffffffffc40eccef, float:-571.2021)
            goto L_0x0590
        L_0x0549:
            r0 = -162787374(0xfffffffff64c0fd2, float:-1.03471624E33)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.7ka r0 = (X.C340027ka) r0
            com.facebook.browser.lite.BrowserLiteFragment r0 = (com.facebook.browser.lite.BrowserLiteFragment) r0
            X.RvU r1 = r0.A0f
            if (r1 == 0) goto L_0x058d
            X.SUL r7 = r1.A01
            boolean r0 = r7.A0f
            if (r0 == 0) goto L_0x058d
            X.37D r0 = r1.A02
            java.lang.Integer r6 = X.AnonymousClass05K.A0u
            r0.A0T(r6)
            X.7kY r5 = r1.A00
            boolean r0 = r7.A0n
            if (r0 == 0) goto L_0x0570
            X.SUL.A03(r5, r7)
        L_0x0570:
            X.S6e r3 = r7.A0K
            if (r3 == 0) goto L_0x057e
            java.lang.String r2 = "full"
            java.lang.String r1 = "expand"
            java.lang.String r0 = "tap"
            r3.A02(r2, r1, r0)
        L_0x057e:
            boolean r0 = r7.A0x
            if (r0 == 0) goto L_0x058d
            boolean r0 = X.SUL.A08(r7)
            if (r0 != 0) goto L_0x058d
            X.REW r0 = X.REW.FULL_SCREEN
            r5.FMM(r0, r6)
        L_0x058d:
            r0 = 1836849952(0x6d7c1b20, float:4.8764384E27)
        L_0x0590:
            X.AnonymousClass0fD.A0C(r0, r4)
            return
        L_0x0594:
            java.lang.Object r0 = r1.A01
            android.view.View r0 = (android.view.View) r0
            android.content.Context r0 = r0.getContext()
            X.8ab r3 = new X.8ab
            r3.<init>((android.content.Context) r0)
            r0 = 2131972951(0x7f135357, float:1.9582924E38)
            r3.A09(r0)
            r0 = 2131972950(0x7f135356, float:1.9582922E38)
            r3.A08(r0)
            r2 = 2131972949(0x7f135355, float:1.958292E38)
            r1 = 0
            X.FHc r0 = new X.FHc
            r0.<init>(r1)
            X.Dba.A0t(r0, r3, r2)
            return
        L_0x05ba:
            X.A9z r4 = r0.A03
            if (r4 == 0) goto L_0x05d3
            long r0 = java.lang.System.currentTimeMillis()
            boolean r3 = r4.A0p
            if (r3 == 0) goto L_0x05d3
            java.util.ArrayList r3 = r4.A0b
            if (r3 != 0) goto L_0x05d0
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1C()
            r4.A0b = r3
        L_0x05d0:
            X.AnonymousClass7TE.A1Y(r3, r0)
        L_0x05d3:
            boolean r0 = r7.A04
            if (r0 == 0) goto L_0x05e3
            boolean r0 = r7.A0F
            if (r0 == 0) goto L_0x05e3
        L_0x05db:
            r7.A02()
        L_0x05de:
            r0 = 202984513(0xc194c41, float:1.1809638E-31)
            goto L_0x0fb3
        L_0x05e3:
            android.content.Context r5 = r8.getContext()
            com.instagram.api.schemas.IGAdsIABScreenshotDataDict r4 = r7.A0A
            com.instagram.api.schemas.IABScreenshotEffectOnUserAction r3 = r4.Bpw()
            if (r3 == 0) goto L_0x05de
            int r1 = r3.ordinal()
            if (r1 == r10) goto L_0x0609
            r0 = 2
            if (r1 == r0) goto L_0x0609
            r0 = 4
            if (r1 == r0) goto L_0x05ff
            r0 = 3
            if (r1 == r0) goto L_0x05db
            goto L_0x05de
        L_0x05ff:
            java.lang.String r0 = r4.C5A()
            if (r0 == 0) goto L_0x05de
            X.C59689JTv.A03(r5, r0, r6, r9)
            goto L_0x05de
        L_0x0609:
            boolean r0 = r7.A06
            if (r0 != 0) goto L_0x05de
            r7.A06 = r10
            X.0qQ.A0A(r5)
            java.lang.Float r0 = r4.Bpx()
            X.4dx r0 = X.C7581QKw.A00(r5, r3, r6, r0)
            r7.A03(r8, r0)
            goto L_0x05de
        L_0x061e:
            r0 = -355347608(0xffffffffead1d368, float:-1.2683192E26)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            java.lang.ref.Reference r0 = (java.lang.ref.Reference) r0
            java.lang.Object r9 = r0.get()
            X.Slo r9 = (X.C12061Slo) r9
            if (r9 == 0) goto L_0x0701
            java.lang.ref.WeakReference r0 = r9.A0P
            java.lang.Object r1 = r0.get()
            X.Td6 r1 = (X.C13580Td6) r1
            if (r1 == 0) goto L_0x0701
            r4 = 1
            r9.A0E = r4
            com.facebook.smartcapture.config.ChallengeProvider r0 = r9.A0I
            java.util.List r0 = r0.A03
            java.util.List r10 = java.util.Collections.unmodifiableList(r0)
            X.0qQ.A07(r10)
            com.facebook.smartcapture.view.SelfieCaptureActivity r1 = (com.facebook.smartcapture.view.SelfieCaptureActivity) r1
            X.QCN r0 = r1.A01
            X.0qQ.A0A(r0)
            android.view.View r0 = r0.mView
            if (r0 != 0) goto L_0x06eb
            r11 = 0
        L_0x0655:
            X.QCN r0 = r1.A01
            X.0qQ.A0A(r0)
            android.view.View r0 = r0.mView
            if (r0 != 0) goto L_0x06e5
            r12 = 0
        L_0x065f:
            int r13 = r9.A05
            int r14 = r9.A04
            X.Rxz r8 = new X.Rxz
            r8.<init>(r9, r10, r11, r12, r13, r14)
            X.SFX r6 = new X.SFX
            r6.<init>(r8)
            r0 = 1140457472(0x43fa0000, float:500.0)
            r6.A00 = r0
            r6.A01 = r0
            r0 = 1000(0x3e8, double:4.94E-321)
            r5 = 2
            float[] r3 = new float[r5]
            r3 = {0, 1065353216} // fill-array
            android.animation.ValueAnimator r3 = android.animation.ValueAnimator.ofFloat(r3)
            r3.setDuration(r0)
            java.util.List r7 = r6.A04
            r7.add(r3)
            r1 = -1007026176(0xffffffffc3fa0000, float:-500.0)
            r0 = 0
            X.SFX.A00(r6, r1, r1, r0, r0)
            java.util.List r0 = r8.A05
            java.util.Iterator r8 = r0.iterator()
        L_0x0693:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x06f6
            java.lang.Object r0 = r8.next()
            X.RFH r0 = (X.RFH) r0
            int r1 = r0.ordinal()
            r0 = 0
            if (r1 == r0) goto L_0x06d7
            if (r1 == r5) goto L_0x06c9
            if (r1 == r4) goto L_0x06bb
            r0 = 3
            if (r1 != r0) goto L_0x06f1
            r3 = 1041865114(0x3e19999a, float:0.15)
            r1 = -1105618534(0xffffffffbe19999a, float:-0.15)
            r0 = 0
            X.SFX.A00(r6, r0, r0, r1, r0)
            X.SFX.A00(r6, r0, r0, r3, r0)
            goto L_0x0693
        L_0x06bb:
            r0 = 1041865114(0x3e19999a, float:0.15)
            r1 = 0
            X.SFX.A00(r6, r1, r1, r0, r1)
            r0 = -1105618534(0xffffffffbe19999a, float:-0.15)
            X.SFX.A00(r6, r1, r1, r0, r1)
            goto L_0x0693
        L_0x06c9:
            r0 = 1041865114(0x3e19999a, float:0.15)
            r1 = 0
            X.SFX.A00(r6, r1, r1, r1, r0)
            r0 = -1105618534(0xffffffffbe19999a, float:-0.15)
            X.SFX.A00(r6, r1, r1, r1, r0)
            goto L_0x0693
        L_0x06d7:
            r3 = 1041865114(0x3e19999a, float:0.15)
            r1 = -1105618534(0xffffffffbe19999a, float:-0.15)
            r0 = 0
            X.SFX.A00(r6, r0, r0, r0, r1)
            X.SFX.A00(r6, r0, r0, r0, r3)
            goto L_0x0693
        L_0x06e5:
            int r12 = r0.getHeight()
            goto L_0x065f
        L_0x06eb:
            int r11 = r0.getWidth()
            goto L_0x0655
        L_0x06f1:
            X.Wub r1 = X.AnonymousClass7TE.A1K()
            throw r1
        L_0x06f6:
            android.animation.AnimatorSet r0 = new android.animation.AnimatorSet
            r0.<init>()
            r0.playSequentially(r7)
            r0.start()
        L_0x0701:
            r0 = 163200191(0x9ba3cbf, float:4.4834997E-33)
            goto L_0x0fb3
        L_0x0706:
            r0 = 1166583198(0x4588a59e, float:4372.702)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r1.A01
            X.Qd0 r4 = (X.C7929Qd0) r4
            java.util.List r0 = r4.A0H
            X.0qQ.A0A(r0)
            java.util.Iterator r3 = r0.iterator()
        L_0x071a:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x072b
            java.lang.Object r1 = r3.next()
            android.view.View r1 = (android.view.View) r1
            r0 = 0
            r1.setVisibility(r0)
            goto L_0x071a
        L_0x072b:
            com.instagram.common.ui.base.IgFrameLayout r0 = r4.A07
            X.AnonymousClass7TH.A0R(r0)
            r0 = 1718295483(0x666b1bbb, float:2.7756692E23)
            goto L_0x0fb3
        L_0x0735:
            r0 = 909722139(0x3639421b, float:2.7605627E-6)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r7 = r1.A01
            X.Qcw r7 = (X.C7925Qcw) r7
            r0 = 31
            X.SbK r5 = new X.SbK
            r5.<init>(r7, r0)
            android.content.Context r3 = r7.requireContext()
            java.lang.String r0 = "null cannot be cast to non-null type android.app.Activity"
            X.0qQ.A0C(r3, r0)
            android.view.View r9 = r7.A08
            r0 = 5
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.0qQ.A0C(r9, r0)
            android.view.ViewGroup r9 = (android.view.ViewGroup) r9
            java.util.ArrayList r0 = r7.A0W
            if (r0 == 0) goto L_0x0764
            r0.clear()
        L_0x0764:
            int r8 = r9.getChildCount()
            r6 = 0
            r4 = 0
        L_0x076a:
            if (r4 >= r8) goto L_0x0785
            android.view.View r1 = r9.getChildAt(r4)
            int r0 = r1.getVisibility()
            if (r0 != 0) goto L_0x0782
            r0 = 8
            r1.setVisibility(r0)
            java.util.ArrayList r0 = r7.A0W
            if (r0 == 0) goto L_0x0782
            r0.add(r1)
        L_0x0782:
            int r4 = r4 + 1
            goto L_0x076a
        L_0x0785:
            X.Q9n r0 = r7.A0S
            if (r0 != 0) goto L_0x07cf
            boolean r0 = r7 instanceof X.C7914Qcl
            if (r0 == 0) goto L_0x0817
            r9 = 1
            X.QdG r8 = new X.QdG
            r8.<init>(r3)
            android.content.Context r4 = r8.getContext()
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r4)
            r0 = 2131629889(0x7f0e1741, float:1.8887112E38)
            r1.inflate(r0, r8, r9)
            X.0qQ.A07(r4)
            r8.A00(r4)
        L_0x07a7:
            r7.A0S = r8
            r0 = 2131963526(0x7f132e86, float:1.9563808E38)
            java.lang.String r0 = X.DbU.A0m(r7, r0)
            r8.setTitleText(r0)
            X.Q9n r1 = r7.A0S
            if (r1 == 0) goto L_0x07c1
            r0 = 2131963525(0x7f132e85, float:1.9563806E38)
            java.lang.String r0 = X.DbU.A0m(r7, r0)
            r1.setSubtitleText(r0)
        L_0x07c1:
            X.Q9n r1 = r7.A0S
            if (r1 == 0) goto L_0x07cf
            r0 = 2131963524(0x7f132e84, float:1.9563804E38)
            java.lang.String r0 = X.DbU.A0m(r7, r0)
            r1.setupDestructiveButton(r0, r5)
        L_0x07cf:
            X.Q9n r1 = r7.A0S
            java.lang.String r0 = "null cannot be cast to non-null type com.facebook.smartcapture.view.BaseCancelActionSheetView"
            X.0qQ.A0C(r1, r0)
            r0 = 2130970982(0x7f040966, float:1.755069E38)
            int r0 = X.C11408SSf.A01(r3, r0)
            X.Q9N r5 = new X.Q9N
            r5.<init>(r3, r1, r0, r6)
            X.Q9n r4 = r7.A0S
            if (r4 == 0) goto L_0x07f8
            r0 = 2131963523(0x7f132e83, float:1.9563802E38)
            java.lang.String r3 = X.DbU.A0m(r7, r0)
            r1 = 29
            X.SbK r0 = new X.SbK
            r0.<init>(r5, r1)
            r4.setupCancelButton(r3, r0)
        L_0x07f8:
            android.widget.FrameLayout r0 = r7.A0A
            if (r0 == 0) goto L_0x07ff
            r0.addView(r5)
        L_0x07ff:
            r1 = 30
            X.SbK r0 = new X.SbK
            r0.<init>(r7, r1)
            r5.A00 = r0
            android.widget.FrameLayout r0 = r7.A0A
            if (r0 == 0) goto L_0x080f
            r0.setVisibility(r6)
        L_0x080f:
            r5.A01()
            r0 = -469289531(0xffffffffe40735c5, float:-9.97674E21)
            goto L_0x0fb3
        L_0x0817:
            X.QdH r8 = new X.QdH
            r8.<init>(r3)
            goto L_0x07a7
        L_0x081d:
            r0 = -1615920521(0xffffffff9faf0277, float:-7.411946E-20)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r1.A01
            X.Qcw r4 = (X.C7925Qcw) r4
            java.util.ArrayList r1 = r4.A0W
            java.lang.String r0 = "null cannot be cast to non-null type java.util.ArrayList<android.view.View>"
            X.0qQ.A0C(r1, r0)
            java.util.Iterator r3 = X.AnonymousClass7TE.A1G(r1)
        L_0x0834:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0845
            java.lang.Object r1 = X.AnonymousClass7TF.A0a(r3)
            android.view.View r1 = (android.view.View) r1
            r0 = 0
            r1.setVisibility(r0)
            goto L_0x0834
        L_0x0845:
            android.widget.FrameLayout r0 = r4.A0A
            X.AnonymousClass7TH.A0R(r0)
            r0 = 724665610(0x2b31850a, float:6.306766E-13)
            goto L_0x0fb3
        L_0x084f:
            r0 = -1264370739(0xffffffffb4a33bcd, float:-3.0404627E-7)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r1.A01
            X.Qcm r3 = (X.C7915Qcm) r3
            com.facebook.smartcapture.logging.IdCaptureLogger r1 = r3.A01
            if (r1 == 0) goto L_0x0863
            com.facebook.smartcapture.logging.IdCaptureButton r0 = com.facebook.smartcapture.logging.IdCaptureButton.CAPTURE_STEP_BACK_BUTTON
            r1.logButtonClick(r0)
        L_0x0863:
            java.lang.ref.WeakReference r0 = r3.A00
            if (r0 == 0) goto L_0x0872
            java.lang.Object r0 = r0.get()
            X.Td9 r0 = (X.C13583Td9) r0
            if (r0 == 0) goto L_0x0872
            r0.D14()
        L_0x0872:
            r0 = -39137022(0xfffffffffdaad102, float:-2.838175E37)
            goto L_0x0fb3
        L_0x0877:
            r0 = -766100583(0xffffffffd2563b99, float:-2.30030721E11)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.QEW r0 = (X.QEW) r0
            android.view.View$OnClickListener r0 = r0.A00
            r0.onClick(r8)
            r0 = -2145227255(0xffffffff80226e09, float:-3.16188E-39)
            goto L_0x0fb3
        L_0x088c:
            r0 = -1444080105(0xffffffffa9ed1617, float:-1.0528746E-13)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.QEW r0 = (X.QEW) r0
            android.view.View$OnClickListener r0 = r0.A00
            r0.onClick(r8)
            r0 = 698587585(0x29a399c1, float:7.265326E-14)
            goto L_0x0fb3
        L_0x08a1:
            r0 = -15952460(0xffffffffff0c95b4, float:-1.8686922E38)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.Qem r0 = (X.C7999Qem) r0
            X.0sa r0 = r0.A01
            r0.invoke()
            r0 = 723337512(0x2b1d4128, float:5.5868027E-13)
            goto L_0x0fb3
        L_0x08b6:
            r0 = 1398966173(0x5362879d, float:9.7293782E11)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.QeW r0 = (X.C7983QeW) r0
            X.0sa r0 = r0.A00
            r0.invoke()
            r0 = -910849953(0xffffffffc9b5885f, float:-1487115.9)
            goto L_0x0fb3
        L_0x08cb:
            r0 = 542442569(0x20550449, float:1.804322E-19)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.DbS.A1U(r0)
            r0 = -635747903(0xffffffffda1b41c1, float:-1.09252296E16)
            goto L_0x0fb3
        L_0x08dc:
            r0 = -391282134(0xffffffffe8ad822a, float:-6.554964E24)
            int r2 = A00(r1, r0)
            r0 = -854803508(0xffffffffcd0cbbcc, float:-1.47569856E8)
            goto L_0x0fb3
        L_0x08e8:
            r0 = 493069204(0x1d63a394, float:3.0127768E-21)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.Q9o r0 = (X.C7377Q9o) r0
            android.view.View$OnClickListener r0 = r0.A00
            if (r0 == 0) goto L_0x08fa
            r0.onClick(r8)
        L_0x08fa:
            r0 = 1148014788(0x446d50c4, float:949.26196)
            goto L_0x0fb3
        L_0x08ff:
            r0 = -775685073(0xffffffffd1c3fc2f, float:-1.05218695E11)
            int r2 = A00(r1, r0)
            r0 = -1720576815(0xffffffff997214d1, float:-1.25153106E-23)
            goto L_0x0fb3
        L_0x090b:
            r0 = 1334804173(0x4f8f7ecd, float:4.8149038E9)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r1.A01
            X.Qcq r4 = (X.C7919Qcq) r4
            java.lang.ref.WeakReference r0 = r4.A00
            java.lang.Object r3 = r0.get()
            X.TaZ r3 = (X.C13446TaZ) r3
            if (r3 == 0) goto L_0x092b
            android.app.Activity r3 = (android.app.Activity) r3
            r1 = 1002(0x3ea, float:1.404E-42)
            r0 = 0
            r3.setResult(r1, r0)
            r3.finish()
        L_0x092b:
            X.08y r1 = X.09i.A0A
            android.os.Bundle r0 = r4.requireArguments()
            r1.A04(r0)
            r0 = 1621113249(0x60a039a1, float:9.236349E19)
            goto L_0x0fb3
        L_0x0939:
            r0 = -1802145696(0xffffffff94957060, float:-1.508948E-26)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.Qd0 r0 = (X.C7929Qd0) r0
            X.C7929Qd0.A01(r0)
            r0 = 872384887(0x33ff8977, float:1.18993675E-7)
            goto L_0x0fb3
        L_0x094c:
            r0 = -700171694(0xffffffffd6443a52, float:-5.3938691E13)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.Dba.A1Q(r0)
            r0 = 463557207(0x1ba15257, float:2.6688427E-22)
            goto L_0x0fb3
        L_0x095d:
            r0 = 825459775(0x3133843f, float:2.6123101E-9)
            int r2 = A00(r1, r0)
            r0 = 1697065976(0x65272bf8, float:4.9340393E22)
            goto L_0x0fb3
        L_0x0969:
            r0 = -2050221202(0xffffffff85cc1b6e, float:-1.9194144E-35)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r1.A01
            X.Qcz r4 = (X.C7928Qcz) r4
            androidx.fragment.app.FragmentActivity r3 = r4.getActivity()
            if (r3 == 0) goto L_0x0984
            r1 = 50
            X.SbK r0 = new X.SbK
            r0.<init>(r3, r1)
            X.C7928Qcz.A00(r0, r4)
        L_0x0984:
            r0 = 1355012223(0x50c3d87f, float:2.62859633E10)
            goto L_0x0fb3
        L_0x0989:
            r0 = -527354576(0xffffffffe0913530, float:-8.370658E19)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            androidx.activity.ComponentActivity r0 = (androidx.activity.ComponentActivity) r0
            r0.onBackPressed()
            r0 = -1469221493(0xffffffffa86d758b, float:-1.3181631E-14)
            goto L_0x0fb3
        L_0x099c:
            r0 = 1390404073(0x52dfe1e9, float:4.80783925E11)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r1.A01
            X.Qcz r3 = (X.C7928Qcz) r3
            r1 = 48
            X.SbK r0 = new X.SbK
            r0.<init>(r3, r1)
            X.C7928Qcz.A00(r0, r3)
            r0 = -1313045215(0xffffffffb1bc8521, float:-5.486655E-9)
            goto L_0x0fb3
        L_0x09b6:
            r0 = -571610804(0xffffffffddede94c, float:-2.14291463E18)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.Qcq r0 = (X.C7919Qcq) r0
            java.lang.ref.WeakReference r0 = r0.A00
            java.lang.Object r3 = r0.get()
            X.TaZ r3 = (X.C13446TaZ) r3
            if (r3 == 0) goto L_0x09d6
            android.app.Activity r3 = (android.app.Activity) r3
            r1 = 1003(0x3eb, float:1.406E-42)
            r0 = 0
            r3.setResult(r1, r0)
            r3.finish()
        L_0x09d6:
            r0 = -1941141567(0xffffffff8c4c87c1, float:-1.575644E-31)
            goto L_0x0fb3
        L_0x09db:
            r0 = 1637522627(0x619a9cc3, float:3.565118E20)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.Qcq r0 = (X.C7919Qcq) r0
            java.lang.ref.WeakReference r0 = r0.A00
            r3 = 0
            if (r0 == 0) goto L_0x09fa
            java.lang.Object r1 = r0.get()
            X.TaZ r1 = (X.C13446TaZ) r1
            if (r1 == 0) goto L_0x09fa
            com.facebook.smartcapture.view.SelfieReviewActivity r1 = (com.facebook.smartcapture.view.SelfieReviewActivity) r1
            com.facebook.smartcapture.capture.SelfieEvidence r0 = r1.A00
            r1.A04(r0, r3)
        L_0x09fa:
            r0 = -1851286170(0xffffffff91a79d66, float:-2.6444959E-28)
            goto L_0x0fb3
        L_0x09ff:
            r0 = -1622305205(0xffffffff9f4d964b, float:-4.3534758E-20)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.Dba.A1Q(r0)
            r0 = 111225177(0x6a12959, float:6.0622224E-35)
            goto L_0x0fb3
        L_0x0a10:
            r0 = -751965209(0xffffffffd32debe7, float:-7.4698713E11)
            int r2 = A00(r1, r0)
            r0 = -2094049064(0xffffffff832f58d8, float:-5.1529865E-37)
            goto L_0x0fb3
        L_0x0a1c:
            r0 = -1875546104(0xffffffff90357008, float:-3.5782262E-29)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r7 = r1.A01
            X.Qct r7 = (X.C7922Qct) r7
            androidx.fragment.app.FragmentActivity r6 = r7.getActivity()
            if (r6 == 0) goto L_0x0a6f
            android.widget.FrameLayout r0 = r7.A00
            if (r0 == 0) goto L_0x0a34
            r0.removeAllViews()
        L_0x0a34:
            androidx.fragment.app.FragmentActivity r1 = r7.getActivity()
            boolean r0 = r1 instanceof X.C13445TaY
            if (r0 == 0) goto L_0x0a6f
            java.lang.String r0 = "null cannot be cast to non-null type com.facebook.smartcapture.ui.SelfieCaptureUiActivity"
            X.0qQ.A0C(r1, r0)
            X.TaY r1 = (X.C13445TaY) r1
            com.facebook.smartcapture.view.BaseSelfieCaptureActivity r1 = (com.facebook.smartcapture.view.BaseSelfieCaptureActivity) r1
            com.facebook.smartcapture.ui.SelfieCaptureUi r3 = r1.A05
            r0 = 2130970982(0x7f040966, float:1.755069E38)
            int r5 = X.C11408SSf.A01(r6, r0)
            X.Tic r1 = r7.A00
            r0 = 0
            X.Q9o r4 = new X.Q9o
            r4.<init>(r6, r1, r3, r0)
            X.Q9N r3 = new X.Q9N
            r3.<init>(r6, r4, r5, r0)
            android.widget.FrameLayout r0 = r7.A00
            if (r0 == 0) goto L_0x0a63
            r0.addView(r3)
        L_0x0a63:
            r3.A01()
            r1 = 45
            X.SbK r0 = new X.SbK
            r0.<init>(r3, r1)
            r4.A00 = r0
        L_0x0a6f:
            r0 = 1883215685(0x703f9745, float:2.3717804E29)
            goto L_0x0fb3
        L_0x0a74:
            r0 = 1685125142(0x6470f816, float:1.778038E22)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.Qct r0 = (X.C7922Qct) r0
            X.Taa r3 = r0.A01
            if (r3 == 0) goto L_0x0a9a
            com.facebook.smartcapture.view.BaseSelfieCaptureActivity r3 = (com.facebook.smartcapture.view.BaseSelfieCaptureActivity) r3
            com.facebook.smartcapture.logging.SelfieCaptureLogger r1 = r3.getLogger()
            if (r1 == 0) goto L_0x0a91
            java.lang.String r0 = "selfie_timer_start_again"
            r1.logButtonClick(r0)
        L_0x0a91:
            r1 = 1002(0x3ea, float:1.404E-42)
            r0 = 0
            r3.setResult(r1, r0)
            r3.finish()
        L_0x0a9a:
            r0 = 1888695260(0x709333dc, float:3.6445592E29)
            goto L_0x0fb3
        L_0x0a9f:
            r0 = 730279323(0x2b872d9b, float:9.604985E-13)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.Qct r0 = (X.C7922Qct) r0
            X.Taa r3 = r0.A01
            if (r3 == 0) goto L_0x0ac5
            com.facebook.smartcapture.view.BaseSelfieCaptureActivity r3 = (com.facebook.smartcapture.view.BaseSelfieCaptureActivity) r3
            com.facebook.smartcapture.logging.SelfieCaptureLogger r1 = r3.getLogger()
            if (r1 == 0) goto L_0x0abc
            java.lang.String r0 = "selfie_timer_start_again"
            r1.logButtonClick(r0)
        L_0x0abc:
            r1 = 1002(0x3ea, float:1.404E-42)
            r0 = 0
            r3.setResult(r1, r0)
            r3.finish()
        L_0x0ac5:
            r0 = -314451675(0xffffffffed41d925, float:-3.74957E27)
            goto L_0x0fb3
        L_0x0aca:
            r0 = -159092103(0xfffffffff6847279, float:-1.3431738E33)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.Dbb.A1S(r0)
            r0 = -767693383(0xffffffffd23dedb9, float:-2.03934286E11)
            goto L_0x0fb3
        L_0x0adb:
            r0 = 1682005197(0x64415ccd, float:1.4267634E22)
            int r2 = A00(r1, r0)
            r0 = -1744284847(0xffffffff98085351, float:-1.7619652E-24)
            goto L_0x0fb3
        L_0x0ae7:
            r0 = -303470485(0xffffffffede9686b, float:-9.02953E27)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.Dbb.A1S(r0)
            r0 = -187954342(0xfffffffff4cc0b5a, float:-1.2932847E32)
            goto L_0x0fb3
        L_0x0af8:
            r0 = 100045982(0x5f6949e, float:2.3188322E-35)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.Qcn r0 = (X.C7916Qcn) r0
            java.lang.ref.WeakReference r0 = r0.A00
            X.0qQ.A0A(r0)
            java.lang.Object r0 = r0.get()
            X.TaX r0 = (X.C13444TaX) r0
            if (r0 == 0) goto L_0x0b19
            com.facebook.smartcapture.logging.IdCaptureLogger r1 = X.Pxj.A0V(r0)
            com.facebook.smartcapture.logging.IdCaptureButton r0 = com.facebook.smartcapture.logging.IdCaptureButton.RETAKE_PHOTO
            r1.logButtonClick(r0)
        L_0x0b19:
            r0 = -123008014(0xfffffffff8ab0bf2, float:-2.7753908E34)
            goto L_0x0fb3
        L_0x0b1e:
            r0 = 227202350(0xd8ad52e, float:8.556228E-31)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.Qcn r0 = (X.C7916Qcn) r0
            java.lang.ref.WeakReference r0 = r0.A00
            X.0qQ.A0A(r0)
            java.lang.Object r3 = r0.get()
            X.TaX r3 = (X.C13444TaX) r3
            if (r3 == 0) goto L_0x0b4a
            com.facebook.smartcapture.view.PhotoReviewActivity r3 = (com.facebook.smartcapture.view.PhotoReviewActivity) r3
            android.content.Intent r1 = X.DbS.A09()
            java.lang.String r0 = r3.A01
            if (r0 == 0) goto L_0x0b47
            android.net.Uri r0 = X.JTQ.A09(r0)
            r1.setData(r0)
        L_0x0b47:
            X.Dba.A0k(r3, r1)
        L_0x0b4a:
            r0 = -1284266191(0xffffffffb373a731, float:-5.6729906E-8)
            goto L_0x0fb3
        L_0x0b4f:
            r0 = 425999602(0x19643cf2, float:1.17996315E-23)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.Qcw r1 = (X.C7925Qcw) r1
            X.Q9N r0 = r1.A0T
            if (r0 == 0) goto L_0x0b64
            r0.A00()
            r0 = 0
            r1.A0T = r0
        L_0x0b64:
            r0 = 0
            r1.A0Y = r0
            r0 = 1247126845(0x4a55a53d, float:3500367.2)
            goto L_0x0fb3
        L_0x0b6c:
            r0 = 1687143280(0x648fc370, float:2.1215737E22)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r6 = r1.A01
            X.Qcw r6 = (X.C7925Qcw) r6
            r1 = 1065353216(0x3f800000, float:1.0)
            r6.A04 = r1
            android.widget.ImageView r0 = r6.A0G
            X.0qQ.A0A(r0)
            r0.setScaleX(r1)
            android.widget.ImageView r0 = r6.A0G
            X.0qQ.A0A(r0)
            r0.setScaleY(r1)
            android.widget.ImageView r0 = r6.A0G
            X.0qQ.A0A(r0)
            r1 = 0
            r0.setTranslationX(r1)
            android.widget.ImageView r0 = r6.A0G
            X.0qQ.A0A(r0)
            r0.setTranslationY(r1)
            java.lang.ref.WeakReference r0 = r6.A00
            X.0qQ.A0A(r0)
            java.lang.Object r0 = r0.get()
            X.TaX r0 = (X.C13444TaX) r0
            if (r0 == 0) goto L_0x0bb4
            com.facebook.smartcapture.view.IdCaptureBaseActivity r0 = (com.facebook.smartcapture.view.IdCaptureBaseActivity) r0
            com.facebook.smartcapture.logging.IdCaptureLogger r1 = r0.A02()
            com.facebook.smartcapture.logging.IdCaptureButton r0 = com.facebook.smartcapture.logging.IdCaptureButton.EXPAND_FULL_PHOTO
            r1.logButtonClick(r0)
        L_0x0bb4:
            r5 = 1
            r6.A0Y = r5
            android.view.ViewGroup r1 = r6.A09
            X.0qQ.A0A(r1)
            android.widget.FrameLayout r0 = r6.A0B
            r1.removeView(r0)
            android.content.Context r4 = r6.requireContext()
            android.widget.FrameLayout r3 = r6.A0B
            X.0qQ.A0A(r3)
            r1 = 0
            X.Q9N r0 = new X.Q9N
            r0.<init>(r4, r3, r1, r5)
            r6.A0T = r0
            android.view.ViewGroup r1 = r6.A09
            X.0qQ.A0A(r1)
            X.Q9N r0 = r6.A0T
            r1.addView(r0)
            X.Q9N r0 = r6.A0T
            X.0qQ.A0A(r0)
            r0.A01()
            r0 = 1670766565(0x6395dfe5, float:5.5293963E21)
            goto L_0x0fb3
        L_0x0be9:
            r0 = 1776772819(0x69e766d3, float:3.496843E25)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.Dba.A1Q(r0)
            r0 = 53396786(0x32ec532, float:5.1360373E-37)
            goto L_0x0fb3
        L_0x0bfa:
            r0 = -323631049(0xffffffffecb5c837, float:-1.7580885E27)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.Dba.A1Q(r0)
            r0 = 1510345719(0x5a060bf7, float:9.4327006E15)
            goto L_0x0fb3
        L_0x0c0b:
            r0 = -1032372612(0xffffffffc2773e7c, float:-61.81102)
            int r2 = A00(r1, r0)
            r0 = -1388299285(0xffffffffad403beb, float:-1.0927241E-11)
            goto L_0x0fb3
        L_0x0c17:
            r0 = -1139093045(0xffffffffbc1ad1cb, float:-0.009449433)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r7 = r1.A01
            X.Qcj r7 = (X.C7913Qcj) r7
            com.facebook.smartcapture.ui.PhotoRequirementsView r6 = r7.A0C
            X.0qQ.A0A(r6)
            r0 = 1
            r6.A02 = r0
            r6.removeAllViews()
            android.content.Context r5 = r6.getContext()
            X.0qQ.A0A(r5)
            r0 = 2130970957(0x7f04094d, float:1.7550639E38)
            int r1 = X.C11408SSf.A01(r5, r0)
            r0 = 120(0x78, float:1.68E-43)
            int r4 = X.2eL.A06(r1, r0)
            android.view.View r3 = r6.A00
            X.0qQ.A0A(r3)
            r1 = 0
            X.Q9N r0 = new X.Q9N
            r0.<init>(r5, r3, r4, r1)
            r6.A01 = r0
            r6.addView(r0)
            X.Q9N r0 = r6.A01
            X.0qQ.A0A(r0)
            r0.A01()
            com.facebook.smartcapture.logging.IdCaptureLogger r1 = r7.A01
            if (r1 == 0) goto L_0x0c62
            com.facebook.smartcapture.logging.IdCaptureButton r0 = com.facebook.smartcapture.logging.IdCaptureButton.SHOW_PHOTO_REQUIREMENTS
            r1.logButtonClick(r0)
        L_0x0c62:
            r0 = -155879823(0xfffffffff6b57671, float:-1.84025E33)
            goto L_0x0fb3
        L_0x0c67:
            r0 = 24027936(0x16ea320, float:4.3830733E-38)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.Dbb.A1S(r0)
            r0 = -1012639262(0xffffffffc3a459e2, float:-328.7022)
            goto L_0x0fb3
        L_0x0c78:
            r0 = 412632009(0x189843c9, float:3.9359525E-24)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            androidx.fragment.app.Fragment r1 = r0.mParentFragment
            boolean r0 = r1 instanceof X.C8607Qxo
            if (r0 == 0) goto L_0x0c90
            X.Qxo r1 = (X.C8607Qxo) r1
            if (r1 == 0) goto L_0x0c90
            r1.A0H()
        L_0x0c90:
            r0 = -1366151642(0xffffffffae922e26, float:-6.647509E-11)
            goto L_0x0fb3
        L_0x0c95:
            r0 = -783666316(0xffffffffd14a3374, float:-5.4277915E10)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r6 = r1.A01
            X.QBz r6 = (X.C7415QBz) r6
            X.0eM r4 = r6.A01
            X.Jfk r0 = X.Pxh.A0O(r4)
            X.2Fk r0 = r0.A05
            java.lang.Object r0 = r0.A02()
            X.KgM r0 = (X.C62471KgM) r0
            if (r0 == 0) goto L_0x0cda
            int r3 = r0.ordinal()
            r1 = 2
            r0 = 0
            if (r3 == r1) goto L_0x0cdf
            r7 = 1
            if (r3 != r7) goto L_0x0cda
            java.lang.Integer r3 = X.AnonymousClass05K.A0u
            java.lang.Integer r1 = X.AnonymousClass05K.A00
            X.0eP[] r0 = new X.0eP[r0]
            X.C7415QBz.A00(r6, r3, r1, r0)
            X.Jfk r5 = X.Pxh.A0O(r4)
            X.0r1 r4 = new X.0r1
            r4.<init>()
            r5.A02 = r7
            X.2Fk r3 = r5.A06
            r1 = 4
            X.Sdq r0 = new X.Sdq
            r0.<init>((int) r1, (java.lang.Object) r5, (java.lang.Object) r4)
            r3.A06(r6, r0)
        L_0x0cda:
            r0 = 73592296(0x462ede8, float:2.6675414E-36)
            goto L_0x0fb3
        L_0x0cdf:
            java.lang.Integer r3 = X.AnonymousClass05K.A0j
            java.lang.Integer r1 = X.AnonymousClass05K.A00
            X.0eP[] r0 = new X.0eP[r0]
            X.C7415QBz.A00(r6, r3, r1, r0)
            X.0b6 r0 = X.0b6.A00()
            X.0Qv r3 = r0.A0A()
            java.lang.String r0 = "android.settings.WIFI_SETTINGS"
            android.content.Intent r1 = X.Pxe.A0G(r0)
            android.content.Context r0 = r6.requireContext()
            r3.A0G(r0, r1)
            goto L_0x0cda
        L_0x0cfe:
            r0 = 324312710(0x13549e86, float:2.683632E-27)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            X.QBu r3 = new X.QBu
            r3.<init>()
            X.0hq r1 = r0.getChildFragmentManager()
            java.lang.String r0 = "CancelDialogFragment"
            r3.A0B(r1, r0)
            r0 = -758759336(0xffffffffd2c64058, float:-4.25741517E11)
            goto L_0x0fb3
        L_0x0d1c:
            r0 = 55680958(0x3519fbe, float:6.1602955E-37)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r1.A01
            X.QBy r4 = (X.C7414QBy) r4
            java.lang.Integer r3 = X.AnonymousClass05K.A0C
            java.lang.Integer r1 = X.AnonymousClass05K.A00
            r0 = 0
            X.0eP[] r0 = new X.0eP[r0]
            X.C7414QBy.A00(r4, r3, r1, r0)
            androidx.fragment.app.Fragment r1 = r4.mParentFragment
            boolean r0 = r1 instanceof X.C8607Qxo
            if (r0 == 0) goto L_0x0d5c
            X.Qxo r1 = (X.C8607Qxo) r1
            if (r1 == 0) goto L_0x0d5c
            X.0hq r0 = r1.getChildFragmentManager()
            int r3 = X.Pxj.A0B(r0, r1)
            androidx.fragment.app.Fragment r0 = r0.A0P(r3)
            boolean r0 = r0 instanceof X.QC0
            if (r0 != 0) goto L_0x0d5c
            X.0s1 r1 = X.Pxj.A0O(r1)
            java.lang.Class<X.QC0> r0 = X.QC0.class
            r1.A0G(r0, r3)
            java.lang.String r0 = "javaClass"
            r1.A0I(r0)
            r1.A00()
        L_0x0d5c:
            r0 = -412919112(0xffffffffe7635ab8, float:-1.07365066E24)
            goto L_0x0fb3
        L_0x0d61:
            r0 = 2059732405(0x7ac505b5, float:5.114991E35)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            android.app.Dialog r0 = (android.app.Dialog) r0
            r0.cancel()
            r0 = -307205447(0xffffffffedb06ab9, float:-6.8247977E27)
            goto L_0x0fb3
        L_0x0d74:
            r0 = 1929902423(0x7307f957, float:1.0772969E31)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            com.facebook.fxcropapp.ig.IgCropActivity r1 = (com.facebook.fxcropapp.ig.IgCropActivity) r1
            float r0 = com.facebook.fxcropapp.ig.IgCropActivity.A02
            com.facebook.fxcrop.SimpleCropView r0 = r1.A00
            if (r0 == 0) goto L_0x0d8f
            java.lang.String r0 = "ON_ROTATE_PHOTO"
            X.SCZ.A01(r0)
            com.facebook.fxcrop.SimpleCropView r0 = r1.A00
            r0.A02()
        L_0x0d8f:
            r0 = -173945459(0xfffffffff5a1cd8d, float:-4.1021917E32)
            goto L_0x0fb3
        L_0x0d94:
            r0 = 1131125608(0x436b9b68, float:235.60706)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            com.facebook.fxcropapp.ig.IgCropActivity r1 = (com.facebook.fxcropapp.ig.IgCropActivity) r1
            float r0 = com.facebook.fxcropapp.ig.IgCropActivity.A02
            com.facebook.fxcrop.SimpleCropView r0 = r1.A00
            if (r0 == 0) goto L_0x0dc2
            java.lang.String r0 = "ON_SAVE_CROPPING"
            X.SCZ.A01(r0)
            com.facebook.fxcrop.SimpleCropView r0 = r1.A00
            android.net.Uri r5 = r0.A08
            if (r5 == 0) goto L_0x0dc2
            X.SOG r3 = X.SOG.A06
            android.content.Context r4 = r0.getContext()
            r8 = 0
            X.Smc r6 = new X.Smc
            r6.<init>(r0)
            java.lang.String r7 = "LOAD_FULL_SIZE_BITMAP_FOR_SAVING"
            r9 = r8
            r3.A01(r4, r5, r6, r7, r8, r9)
        L_0x0dc2:
            r1.finish()
            r0 = 1473193344(0x57cf2580, float:4.55519936E14)
            goto L_0x0fb3
        L_0x0dca:
            r0 = -1723853993(0xffffffff99401357, float:-9.930073E-24)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            android.app.Activity r1 = (android.app.Activity) r1
            float r0 = com.facebook.fxcropapp.ig.IgCropActivity.A02
            java.lang.String r0 = "ON_CANCEL_CROPPING"
            X.SCZ.A01(r0)
            r1.finish()
            r0 = 874338617(0x341d5939, float:1.4654223E-7)
            goto L_0x0fb3
        L_0x0de4:
            r0 = 1763326823(0x691a3b67, float:1.1653443E25)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.0SM r0 = (X.0SM) r0
            android.app.Dialog r0 = r0.A06()
            r0.cancel()
            r0 = -14395622(0xffffffffff24571a, float:-2.1844565E38)
            goto L_0x0fb3
        L_0x0dfb:
            r0 = -292401556(0xffffffffee924e6c, float:-2.263981E28)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r1.A01
            X.QKH r4 = (X.QKH) r4
            int r0 = r4.A00
            r5 = 1
            if (r0 != r5) goto L_0x0e5e
            X.QKv r0 = r4.A05
            if (r0 == 0) goto L_0x0e5e
            boolean r1 = r4.A0D
            boolean r0 = r4.A0C
            if (r1 == 0) goto L_0x0e18
            r6 = 1
            if (r0 == 0) goto L_0x0e19
        L_0x0e18:
            r6 = 0
        L_0x0e19:
            if (r6 == 0) goto L_0x0e28
            X.4gR r0 = r4.A04
            if (r0 == 0) goto L_0x0e28
            X.1yd r0 = r0.A04
            boolean r0 = X.RUP.A00(r0, r5)
            if (r0 == 0) goto L_0x0e28
            r6 = 0
        L_0x0e28:
            X.S5W r3 = r4.A0E
            java.lang.String r1 = "NOT_NOW_CLICK"
            r0 = 0
            X.RRP r3 = r3.A00(r1, r0)
            java.lang.String r0 = r4.A0A
            r3.A08 = r0
            com.facebook.businessextension.jscalls.RequestAutofillJSBridgeCall r1 = r4.A09
            java.lang.String r0 = "requestAutofillData"
            java.lang.Object r0 = X.Pxh.A0d(r1, r0)
            com.facebook.businessextension.jscalls.RequestAutofillJSBridgeCallData r0 = (com.facebook.businessextension.jscalls.RequestAutofillJSBridgeCallData) r0
            if (r0 != 0) goto L_0x0e6a
            r0 = 0
        L_0x0e43:
            X.SUR.A0E(r4, r3, r0)
            boolean r0 = r4.A01
            if (r0 != 0) goto L_0x0e4d
            if (r6 != 0) goto L_0x0e4d
            r5 = 0
        L_0x0e4d:
            r3.A0P = r5
            X.SHz r3 = r3.A00()
            X.QKv r0 = r4.A05
            android.os.Bundle r1 = r0.A02()
            X.4gR r0 = r4.A04
            X.SUR.A0A(r1, r0, r3)
        L_0x0e5e:
            android.app.Dialog r0 = r4.A06()
            r0.cancel()
            r0 = 572191005(0x221af11d, float:2.0998536E-18)
            goto L_0x0fb3
        L_0x0e6a:
            java.lang.String r0 = r0.A00
            goto L_0x0e43
        L_0x0e6d:
            r0 = 954401584(0x38e30330, float:1.0824797E-4)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r1.A01
            X.QKH r4 = (X.QKH) r4
            com.facebook.browser.lite.extensions.autofill.base.jsbridge.AutofillSharedJSBridgeProxy r0 = r4.A03
            r0.getClass()
            X.QKv r0 = r4.A05
            r0.getClass()
            com.facebook.browser.lite.extensions.autofill.base.jsbridge.AutofillSharedJSBridgeProxy r1 = r4.A03     // Catch:{ JSONException -> 0x0f18 }
            com.facebook.browser.lite.extensions.autofill.model.AutofillData r0 = r4.A07     // Catch:{ JSONException -> 0x0f18 }
            org.json.JSONObject r0 = X.SUR.A09(r0)     // Catch:{ JSONException -> 0x0f18 }
            com.facebook.businessextension.jscalls.SaveAutofillDataJSBridgeCall r0 = r1.A0B(r0)     // Catch:{ JSONException -> 0x0f18 }
            r1.A0D(r0)     // Catch:{ JSONException -> 0x0f18 }
            int r1 = r4.A00     // Catch:{ JSONException -> 0x0f18 }
            r3 = 1
            if (r1 != r3) goto L_0x0f0b
            java.lang.String r5 = "ACCEPTED_SAVE"
            boolean r1 = r4.A0D     // Catch:{ JSONException -> 0x0f18 }
            boolean r0 = r4.A0C     // Catch:{ JSONException -> 0x0f18 }
            if (r1 == 0) goto L_0x0ea1
            r9 = 1
            if (r0 == 0) goto L_0x0ea2
        L_0x0ea1:
            r9 = 0
        L_0x0ea2:
            if (r9 == 0) goto L_0x0eb1
            X.4gR r0 = r4.A04     // Catch:{ JSONException -> 0x0f18 }
            if (r0 == 0) goto L_0x0eb1
            X.1yd r0 = r0.A04     // Catch:{ JSONException -> 0x0f18 }
            boolean r0 = X.RUP.A00(r0, r3)     // Catch:{ JSONException -> 0x0f18 }
            if (r0 == 0) goto L_0x0eb1
            r9 = 0
        L_0x0eb1:
            X.S5W r1 = r4.A0E     // Catch:{ JSONException -> 0x0f18 }
            r0 = 0
            X.RRP r1 = r1.A00(r5, r0)     // Catch:{ JSONException -> 0x0f18 }
            java.lang.String r0 = r4.A0A     // Catch:{ JSONException -> 0x0f18 }
            r1.A08 = r0     // Catch:{ JSONException -> 0x0f18 }
            long r5 = java.lang.System.currentTimeMillis()     // Catch:{ JSONException -> 0x0f18 }
            long r7 = r4.A01     // Catch:{ JSONException -> 0x0f18 }
            long r5 = r5 - r7
            int r0 = (int) r5     // Catch:{ JSONException -> 0x0f18 }
            r1.A01 = r0     // Catch:{ JSONException -> 0x0f18 }
            X.4gR r0 = r4.A04     // Catch:{ JSONException -> 0x0f18 }
            if (r0 == 0) goto L_0x0eed
            X.RzL r0 = r0.A00     // Catch:{ JSONException -> 0x0f18 }
            X.QP6 r0 = r0.A06     // Catch:{ JSONException -> 0x0f18 }
            java.lang.String r0 = r0.A05     // Catch:{ JSONException -> 0x0f18 }
        L_0x0ed0:
            X.SUR.A0E(r4, r1, r0)     // Catch:{ JSONException -> 0x0f18 }
            com.facebook.browser.lite.extensions.autofill.model.AutofillData r0 = r4.A08     // Catch:{ JSONException -> 0x0f18 }
            java.util.Map r0 = r0.A00     // Catch:{ JSONException -> 0x0f18 }
            java.util.Map r0 = java.util.Collections.unmodifiableMap(r0)     // Catch:{ JSONException -> 0x0f18 }
            java.util.Set r0 = r0.keySet()     // Catch:{ JSONException -> 0x0f18 }
            java.lang.String r0 = X.SUR.A02(r0)     // Catch:{ JSONException -> 0x0f18 }
            r1.A07 = r0     // Catch:{ JSONException -> 0x0f18 }
            X.SUR.A0D(r4, r1)     // Catch:{ JSONException -> 0x0f18 }
            boolean r0 = r4.A01     // Catch:{ JSONException -> 0x0f18 }
            if (r0 != 0) goto L_0x0ef2
            goto L_0x0eef
        L_0x0eed:
            r0 = 0
            goto L_0x0ed0
        L_0x0eef:
            if (r9 != 0) goto L_0x0ef2
            r3 = 0
        L_0x0ef2:
            r1.A0P = r3     // Catch:{ JSONException -> 0x0f18 }
            X.SHz r3 = r1.A00()     // Catch:{ JSONException -> 0x0f18 }
            X.QKv r0 = r4.A05     // Catch:{ JSONException -> 0x0f18 }
            android.os.Bundle r1 = r0.A02()     // Catch:{ JSONException -> 0x0f18 }
            X.4gR r0 = r4.A04     // Catch:{ JSONException -> 0x0f18 }
            X.SUR.A0A(r1, r0, r3)     // Catch:{ JSONException -> 0x0f18 }
            r4.A07()     // Catch:{ JSONException -> 0x0f18 }
            r0 = -550343187(0xffffffffdf326ded, float:-1.2857193E19)
            goto L_0x0fb3
        L_0x0f0b:
            java.lang.String r0 = "Invalid reason for opening save autofill bottom sheet: "
            java.lang.IllegalArgumentException r1 = X.DbW.A0a(r0, r1)     // Catch:{ JSONException -> 0x0f18 }
            r0 = -19096637(0xfffffffffedc9bc3, float:-1.4661946E38)
            X.AnonymousClass0fD.A0C(r0, r2)     // Catch:{ JSONException -> 0x0f18 }
            throw r1     // Catch:{ JSONException -> 0x0f18 }
        L_0x0f18:
            android.content.Context r1 = r4.requireContext()
            r0 = 2131972527(0x7f1351af, float:1.9582064E38)
            X.C59689JTv.A07(r1, r0)
            java.lang.String r0 = "Illegal JSON for autofill save"
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0z(r0)
            r0 = 1404432981(0x53b5f255, float:1.56290947E12)
            X.AnonymousClass0fD.A0C(r0, r2)
            throw r1
        L_0x0f2f:
            r0 = 1940822120(0x73ae9868, float:2.7665735E31)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.0SM r0 = (X.0SM) r0
            android.app.Dialog r0 = r0.A06()
            r0.cancel()
            r0 = 287441621(0x112202d5, float:1.2780419E-28)
            goto L_0x0fb3
        L_0x0f45:
            r0 = -1374884427(0xffffffffae0cedb5, float:-3.204344E-11)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.QA1 r0 = (X.QA1) r0
            r0.toggle()
            r0 = 61527273(0x3aad4e9, float:1.0040584E-36)
            goto L_0x0fb3
        L_0x0f57:
            r0 = -1396191910(0xffffffffacc7cd5a, float:-5.6787188E-12)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.QKE r0 = (X.QKE) r0
            X.QCj r0 = r0.A0D
            if (r0 == 0) goto L_0x0f6d
            r0.A0E()
            r0 = -1710054740(0xffffffff9a12a2ac, float:-3.0323498E-23)
            goto L_0x0fb3
        L_0x0f6d:
            X.C51965G9l.A15()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0f75:
            r0 = -1120742912(0xffffffffbd32d200, float:-0.043657303)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.QKL r0 = (X.QKL) r0
            X.QCi r0 = r0.A0C
            if (r0 == 0) goto L_0x0f8b
            r0.A0E()
            r0 = -1645726486(0xffffffff9de834ea, float:-6.14646E-21)
            goto L_0x0fb3
        L_0x0f8b:
            X.C51965G9l.A15()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0f93:
            r0 = -572912332(0xffffffffddda0d34, float:-1.96403398E18)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            com.facebook.browser.lite.chrome.container.IGWatchAndBrowseLiteChrome r0 = (com.facebook.browser.lite.chrome.container.IGWatchAndBrowseLiteChrome) r0
            com.facebook.browser.lite.chrome.container.IGWatchAndBrowseLiteChrome.A03(r0)
            r0 = 890834051(0x35190c83, float:5.701515E-7)
            goto L_0x0fb3
        L_0x0fa5:
            X.2Fj r1 = r0.A06
            java.lang.String r0 = "fbpay.intent.action.CLICK_APM"
            android.content.Intent r0 = X.Pxe.A0G(r0)
            X.SR4.A01(r1, r0)
            r0 = 2088860290(0x7c817a82, float:5.3783284E36)
        L_0x0fb3:
            X.AnonymousClass0fD.A0C(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11497SbK.onClick(android.view.View):void");
    }

    public static int A00(C11497SbK sbK, int i) {
        int A05 = AnonymousClass0fD.A05(i);
        ((Q9N) sbK.A01).A00();
        return A05;
    }
}
