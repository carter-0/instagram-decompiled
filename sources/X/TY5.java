package X;

public final class TY5 extends 0Yg implements 0sP {
    public final int A00;
    public final Object A01;

    public static Object A00(Object obj, TY5 ty5) {
        0qQ.A0B(obj, 0);
        return ty5.A01;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TY5(Object obj, int i) {
        super(1);
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A01(0Aj r3, GMQ gmq) {
        SOK sok = (SOK) gmq.A07;
        r3.AAJ("package_name", ((RRG) gmq.A01).A00());
        r3.AAJ("utm_source", sok.A05);
        r3.AAJ("utm_medium", sok.A04);
        r3.AAJ("utm_campaign", sok.A00);
        r3.AAJ("utm_content", sok.A01);
        r3.AAJ("utm_impression_id", sok.A03);
    }

    /* JADX WARNING: type inference failed for: r1v12, types: [java.lang.Object, X.S1g] */
    /* JADX WARNING: type inference failed for: r1v14, types: [java.lang.Object, X.S1g] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x0393, code lost:
        r9.Cgf();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0185, code lost:
        A01(r9, r3);
        r9.A8M(r1, "action");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0190, code lost:
        A01(r9, r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r16) {
        /*
            r15 = this;
            r3 = r16
            int r0 = r15.A00
            switch(r0) {
                case 0: goto L_0x0010;
                case 1: goto L_0x06d8;
                case 2: goto L_0x06c6;
                case 3: goto L_0x06bc;
                case 4: goto L_0x0602;
                case 5: goto L_0x05f9;
                case 6: goto L_0x05c1;
                case 7: goto L_0x05a8;
                case 8: goto L_0x0593;
                case 9: goto L_0x057e;
                case 10: goto L_0x055d;
                case 11: goto L_0x0535;
                case 12: goto L_0x0515;
                case 13: goto L_0x04f8;
                case 14: goto L_0x04c9;
                case 15: goto L_0x04b4;
                case 16: goto L_0x0491;
                case 17: goto L_0x046e;
                case 18: goto L_0x045a;
                case 19: goto L_0x0448;
                case 20: goto L_0x0435;
                case 21: goto L_0x0423;
                case 22: goto L_0x0407;
                case 23: goto L_0x03d9;
                case 24: goto L_0x03c3;
                case 25: goto L_0x03b8;
                case 26: goto L_0x0398;
                case 27: goto L_0x031e;
                case 28: goto L_0x02bc;
                case 29: goto L_0x02b0;
                case 30: goto L_0x02a6;
                case 31: goto L_0x0296;
                case 32: goto L_0x019e;
                case 33: goto L_0x0104;
                case 34: goto L_0x0007;
                case 35: goto L_0x0007;
                case 36: goto L_0x0007;
                case 37: goto L_0x0007;
                case 38: goto L_0x0007;
                case 39: goto L_0x00f9;
                case 40: goto L_0x00ec;
                case 41: goto L_0x00df;
                case 42: goto L_0x00d2;
                case 43: goto L_0x00d2;
                case 44: goto L_0x00bc;
                case 45: goto L_0x00af;
                case 46: goto L_0x00a5;
                case 47: goto L_0x00a5;
                case 48: goto L_0x0098;
                case 49: goto L_0x008b;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r0 = r15.A01
            X.3lr r0 = (X.C250663lr) r0
            com.google.common.collect.ImmutableList r5 = r0.coerceList(r3)
        L_0x000f:
            return r5
        L_0x0010:
            java.util.List r3 = (java.util.List) r3
            java.util.ArrayList r5 = X.AnonymousClass7TE.A1C()
            if (r3 == 0) goto L_0x000f
            java.lang.Object r4 = r15.A01
            java.util.Set r4 = (java.util.Set) r4
            java.util.Iterator r7 = r3.iterator()
        L_0x0020:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x000f
            java.lang.Object r0 = r7.next()
            java.util.Iterator r6 = X.C51966G9m.A1H(r0)
        L_0x002e:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0020
            java.lang.Object r0 = r6.next()
            com.facebook.android.instantexperiences.autofill.model.FbAutofillData r0 = (com.facebook.android.instantexperiences.autofill.model.FbAutofillData) r0
            com.facebook.android.instantexperiences.autofill.model.FbAutofillData r3 = r0.AI0(r4)
            java.lang.String r0 = "null cannot be cast to non-null type T of com.facebook.android.instantexperiences.autofill.model.AutofillDataProvider.Companion.addDataToResultsWithWhitelistedFields"
            X.0qQ.A0C(r3, r0)
            r0 = r3
            com.facebook.android.instantexperiences.autofill.model.BrowserExtensionsAutofillData r0 = (com.facebook.android.instantexperiences.autofill.model.BrowserExtensionsAutofillData) r0
            java.util.Map r1 = r0.A00
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x002e
            java.util.Iterator r1 = X.AnonymousClass7TF.A0u(r1)
        L_0x0053:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x002e
            java.lang.Object r0 = X.C51971G9r.A0p(r1)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L_0x0053
            int r0 = r0.length()
            if (r0 == 0) goto L_0x0053
            java.util.Iterator r2 = r5.iterator()
        L_0x006b:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0080
            java.lang.Object r1 = r2.next()
            com.facebook.android.instantexperiences.autofill.model.FbAutofillData r1 = (com.facebook.android.instantexperiences.autofill.model.FbAutofillData) r1
            boolean r0 = r1.Ccl(r3)
            if (r0 == 0) goto L_0x0084
            r5.remove(r1)
        L_0x0080:
            r5.add(r3)
            goto L_0x002e
        L_0x0084:
            boolean r0 = r3.Ccl(r1)
            if (r0 == 0) goto L_0x006b
            goto L_0x002e
        L_0x008b:
            android.view.View r3 = (android.view.View) r3
            r0 = 0
            X.0qQ.A0B(r3, r0)
            java.lang.String r0 = "mOnApplyWindowInsetsListener"
            java.lang.Object r5 = X.OZJ.A00(r3, r0)
            return r5
        L_0x0098:
            android.view.View r3 = (android.view.View) r3
            r0 = 0
            X.0qQ.A0B(r3, r0)
            java.lang.String r0 = "mOnContextClickListener"
            java.lang.Object r5 = X.OZJ.A00(r3, r0)
            return r5
        L_0x00a5:
            java.lang.Object r0 = A00(r3, r15)
            X.0rm r0 = (X.0rm) r0
            r0.A00 = r3
            goto L_0x06c3
        L_0x00af:
            android.graphics.Matrix r3 = (android.graphics.Matrix) r3
            java.lang.Object r0 = A00(r3, r15)
            android.graphics.Path r0 = (android.graphics.Path) r0
            r0.transform(r3)
            goto L_0x06c3
        L_0x00bc:
            X.2WE r3 = (X.2WE) r3
            java.lang.Object r4 = A00(r3, r15)
            java.lang.Object[] r2 = new java.lang.Object[]{r4}
            r1 = 31
            X.JFw r0 = new X.JFw
            r0.<init>(r4, r1)
            r3.A02(r0, r2)
            goto L_0x06c3
        L_0x00d2:
            X.Tf6 r3 = (X.C13689Tf6) r3
            java.lang.Object r0 = A00(r3, r15)
            X.SGo r0 = (X.C11230SGo) r0
            r3.Cy1(r0)
            goto L_0x06c3
        L_0x00df:
            X.TcY r3 = (X.C13559TcY) r3
            java.lang.Object r0 = A00(r3, r15)
            X.SGo r0 = (X.C11230SGo) r0
            r3.DN0(r0)
            goto L_0x06c3
        L_0x00ec:
            X.Tbq r3 = (X.C13521Tbq) r3
            java.lang.Object r0 = A00(r3, r15)
            X.SGo r0 = (X.C11230SGo) r0
            r3.Ct9(r0)
            goto L_0x06c3
        L_0x00f9:
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r0 = r15.A01
            java.lang.Enum r0 = (java.lang.Enum) r0
            java.lang.Enum r5 = com.facebook.pando.TreeJNI.parseEnum(r3, r0)
            return r5
        L_0x0104:
            X.GMQ r3 = (X.GMQ) r3
            java.lang.Object r0 = A00(r3, r15)
            X.QQe r0 = (X.C7614QQe) r0
            X.0Ae r4 = r0.A00
            if (r4 == 0) goto L_0x06c3
            java.lang.Object r2 = r3.A04
            java.lang.Number r2 = (java.lang.Number) r2
            java.lang.Integer r0 = X.AnonymousClass05K.A15
            if (r2 != r0) goto L_0x013f
            java.lang.String r0 = "preloads_impression"
            X.0Aj r9 = X.C51969G9p.A0d(r4, r0)
            boolean r0 = r9.isSampled()
            if (r0 == 0) goto L_0x06c3
            java.lang.Object r0 = r3.A02
            int r0 = X.AnonymousClass7TE.A0M(r0)
            switch(r0) {
                case 0: goto L_0x018e;
                case 1: goto L_0x013c;
                case 2: goto L_0x0136;
                case 3: goto L_0x0133;
                case 4: goto L_0x0139;
                case 5: goto L_0x06c3;
                default: goto L_0x012e;
            }
        L_0x012e:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0133:
            X.RIo r2 = X.C8949RIo.BOTTOMSHEET_ERROR_DIALOG
            goto L_0x0190
        L_0x0136:
            X.RIo r2 = X.C8949RIo.BOTTOMSHEET_CANCEL_DIALOG
            goto L_0x0190
        L_0x0139:
            X.RIo r2 = X.C8949RIo.BOTTOMSHEET_PRODUCT_DETAILS
            goto L_0x0190
        L_0x013c:
            X.RIo r2 = X.C8949RIo.BOTTOMSHEET_INSTALL_FLOW_STARTED
            goto L_0x0190
        L_0x013f:
            java.lang.Object r1 = r3.A06
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            if (r1 != r0) goto L_0x06c3
            java.lang.String r0 = "preloads_tap"
            X.0Aj r9 = X.C51969G9p.A0d(r4, r0)
            boolean r0 = r9.isSampled()
            if (r0 == 0) goto L_0x06c3
            int r0 = r2.intValue()
            switch(r0) {
                case 0: goto L_0x0167;
                case 1: goto L_0x015e;
                case 2: goto L_0x0164;
                case 3: goto L_0x06c3;
                case 4: goto L_0x0161;
                case 5: goto L_0x06c3;
                case 6: goto L_0x06c3;
                case 7: goto L_0x06c3;
                case 8: goto L_0x06c3;
                case 9: goto L_0x06c3;
                case 10: goto L_0x06c3;
                case 11: goto L_0x06c3;
                case 12: goto L_0x06c3;
                case 13: goto L_0x06c3;
                default: goto L_0x0159;
            }
        L_0x0159:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x015e:
            X.RIm r1 = X.RIm.TAP_CANCEL
            goto L_0x0169
        L_0x0161:
            X.RIm r1 = X.RIm.TAP_GO_BACK
            goto L_0x0169
        L_0x0164:
            X.RIm r1 = X.RIm.TAP_VIEW_MORE
            goto L_0x0169
        L_0x0167:
            X.RIm r1 = X.RIm.TAP_INSTALL
        L_0x0169:
            java.lang.Object r0 = r3.A02
            int r0 = X.AnonymousClass7TE.A0M(r0)
            switch(r0) {
                case 0: goto L_0x0183;
                case 1: goto L_0x0180;
                case 2: goto L_0x017a;
                case 3: goto L_0x0177;
                case 4: goto L_0x017d;
                case 5: goto L_0x06c3;
                default: goto L_0x0172;
            }
        L_0x0172:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0177:
            X.RIp r2 = X.C8950RIp.BOTTOMSHEET_ERROR_DIALOG
            goto L_0x0185
        L_0x017a:
            X.RIp r2 = X.C8950RIp.BOTTOMSHEET_CANCEL_DIALOG
            goto L_0x0185
        L_0x017d:
            X.RIp r2 = X.C8950RIp.BOTTOMSHEET_PRODUCT_DETAILS
            goto L_0x0185
        L_0x0180:
            X.RIp r2 = X.C8950RIp.BOTTOMSHEET_INSTALL_FLOW_STARTED
            goto L_0x0185
        L_0x0183:
            X.RIp r2 = X.C8950RIp.BOTTOMSHEET_INSTALL
        L_0x0185:
            A01(r9, r3)
            java.lang.String r0 = "action"
            r9.A8M(r1, r0)
            goto L_0x0193
        L_0x018e:
            X.RIo r2 = X.C8949RIo.BOTTOMSHEET_INSTALL
        L_0x0190:
            A01(r9, r3)
        L_0x0193:
            r0 = 238(0xee, float:3.34E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r9.A8M(r2, r0)
            goto L_0x0393
        L_0x019e:
            X.TaB r3 = (X.C13425TaB) r3
            boolean r0 = r3 instanceof X.C13945Tlr     // Catch:{ all -> 0x0282 }
            if (r0 == 0) goto L_0x020c
            java.lang.Object r4 = r15.A01     // Catch:{ all -> 0x0282 }
            X.Qxo r4 = (X.C8607Qxo) r4     // Catch:{ all -> 0x0282 }
            X.Tlr r3 = (X.C13945Tlr) r3     // Catch:{ all -> 0x0282 }
            r6 = r4
            X.QQe r6 = (X.C7614QQe) r6     // Catch:{ all -> 0x0282 }
            X.Tfa r5 = r6.A05     // Catch:{ all -> 0x0282 }
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()     // Catch:{ all -> 0x0282 }
            java.lang.String r0 = "Error Type = "
            r1.append(r0)     // Catch:{ all -> 0x0282 }
            X.RFF r2 = r3.B2A()     // Catch:{ all -> 0x0282 }
            java.lang.String r1 = X.AnonymousClass7TF.A0i(r2, r1)     // Catch:{ all -> 0x0282 }
            java.lang.String r0 = "OxygenInstallSDK_ErrorState"
            r5.Ew0(r0, r1)     // Catch:{ all -> 0x0282 }
            X.RFF r0 = X.RFF.NETWORK_CONNECTION     // Catch:{ all -> 0x0282 }
            if (r2 == r0) goto L_0x0207
            boolean r0 = r3 instanceof X.C13941Tln     // Catch:{ all -> 0x0282 }
            if (r0 != 0) goto L_0x01d1
            boolean r0 = r3 instanceof X.C7622QQm     // Catch:{ all -> 0x0282 }
            if (r0 == 0) goto L_0x0207
        L_0x01d1:
            X.0hq r1 = r4.getChildFragmentManager()     // Catch:{ all -> 0x0282 }
            X.0qQ.A07(r1)     // Catch:{ all -> 0x0282 }
            X.GMQ r0 = r6.A02     // Catch:{ all -> 0x0282 }
            java.lang.Object r0 = r0.A02     // Catch:{ all -> 0x0282 }
            X.ULT r0 = (X.ULT) r0     // Catch:{ all -> 0x0282 }
            int r2 = r0.A01     // Catch:{ all -> 0x0282 }
            androidx.fragment.app.Fragment r0 = r1.A0P(r2)     // Catch:{ all -> 0x0282 }
            boolean r0 = r0 instanceof X.C7414QBy     // Catch:{ all -> 0x0282 }
            if (r0 != 0) goto L_0x01f4
            X.0s1 r1 = X.Pxj.A0O(r4)     // Catch:{ all -> 0x0282 }
            java.lang.Class<X.QBy> r0 = X.C7414QBy.class
            r1.A0G(r0, r2)     // Catch:{ all -> 0x0282 }
            r1.A00()     // Catch:{ all -> 0x0282 }
        L_0x01f4:
            X.0hq r2 = r4.getChildFragmentManager()     // Catch:{ all -> 0x0282 }
            X.0qQ.A07(r2)     // Catch:{ all -> 0x0282 }
            X.QBv r1 = new X.QBv     // Catch:{ all -> 0x0282 }
            r1.<init>()     // Catch:{ all -> 0x0282 }
            java.lang.String r0 = "CancelDialogFragment"
            r1.A0B(r2, r0)     // Catch:{ all -> 0x0282 }
            goto L_0x06c3
        L_0x0207:
            r4.A0G()     // Catch:{ all -> 0x0282 }
            goto L_0x06c3
        L_0x020c:
            boolean r0 = r3 instanceof X.C13941Tln     // Catch:{ all -> 0x0282 }
            if (r0 == 0) goto L_0x0232
            java.lang.Object r2 = r15.A01     // Catch:{ all -> 0x0282 }
            X.Qxo r2 = (X.C8607Qxo) r2     // Catch:{ all -> 0x0282 }
            X.0hq r0 = r2.getChildFragmentManager()     // Catch:{ all -> 0x0282 }
            int r1 = X.Pxj.A0B(r0, r2)     // Catch:{ all -> 0x0282 }
            androidx.fragment.app.Fragment r0 = r0.A0P(r1)     // Catch:{ all -> 0x0282 }
            boolean r0 = r0 instanceof X.C7414QBy     // Catch:{ all -> 0x0282 }
            if (r0 != 0) goto L_0x06c3
            X.0s1 r2 = X.Pxj.A0O(r2)     // Catch:{ all -> 0x0282 }
            java.lang.Class<X.QBy> r0 = X.C7414QBy.class
            r2.A0G(r0, r1)     // Catch:{ all -> 0x0282 }
        L_0x022d:
            r2.A00()     // Catch:{ all -> 0x0282 }
            goto L_0x06c3
        L_0x0232:
            boolean r0 = r3 instanceof X.C13944Tlq     // Catch:{ all -> 0x0282 }
            if (r0 == 0) goto L_0x0254
            java.lang.Object r2 = r15.A01     // Catch:{ all -> 0x0282 }
            X.Qxo r2 = (X.C8607Qxo) r2     // Catch:{ all -> 0x0282 }
            X.0hq r0 = r2.getChildFragmentManager()     // Catch:{ all -> 0x0282 }
            int r1 = X.Pxj.A0B(r0, r2)     // Catch:{ all -> 0x0282 }
            androidx.fragment.app.Fragment r0 = r0.A0P(r1)     // Catch:{ all -> 0x0282 }
            boolean r0 = r0 instanceof X.C7415QBz     // Catch:{ all -> 0x0282 }
            if (r0 != 0) goto L_0x06c3
            X.0s1 r2 = X.Pxj.A0O(r2)     // Catch:{ all -> 0x0282 }
            java.lang.Class<X.QBz> r0 = X.C7415QBz.class
            r2.A0G(r0, r1)     // Catch:{ all -> 0x0282 }
            goto L_0x022d
        L_0x0254:
            boolean r0 = r3 instanceof X.C7620QQk     // Catch:{ all -> 0x0282 }
            if (r0 == 0) goto L_0x0261
            java.lang.Object r0 = r15.A01     // Catch:{ all -> 0x0282 }
            X.Qxo r0 = (X.C8607Qxo) r0     // Catch:{ all -> 0x0282 }
            X.C8607Qxo.A01(r0)     // Catch:{ all -> 0x0282 }
            goto L_0x06c3
        L_0x0261:
            java.lang.Object r5 = r15.A01     // Catch:{ all -> 0x0282 }
            X.Qxo r5 = (X.C8607Qxo) r5     // Catch:{ all -> 0x0282 }
            r0 = r5
            X.QQe r0 = (X.C7614QQe) r0     // Catch:{ all -> 0x0282 }
            X.Tfa r4 = r0.A05     // Catch:{ all -> 0x0282 }
            java.lang.String r2 = "OxygenInstallSDK_UnknownState"
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()     // Catch:{ all -> 0x0282 }
            java.lang.String r0 = "state isn't supported = "
            X.Pxg.A1R(r1, r0, r3)     // Catch:{ all -> 0x0282 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0282 }
            r4.Ew0(r2, r0)     // Catch:{ all -> 0x0282 }
            r5.A07()     // Catch:{ all -> 0x0282 }
            goto L_0x06c3
        L_0x0282:
            r3 = move-exception
            java.lang.Object r2 = r15.A01
            X.Qxo r2 = (X.C8607Qxo) r2
            r0 = r2
            X.QQe r0 = (X.C7614QQe) r0
            X.Tfa r1 = r0.A05
            java.lang.String r0 = "OxygenInstallSDK_UnexpectedException"
            r1.Ew3(r0, r3)
            r2.A0G()
            goto L_0x06c3
        L_0x0296:
            java.lang.Object r0 = r15.A01
            X.Qxo r0 = (X.C8607Qxo) r0
            X.QQe r0 = (X.C7614QQe) r0
            X.0sP r0 = r0.A06
            X.0qQ.A0A(r3)
            r0.invoke(r3)
            goto L_0x06c3
        L_0x02a6:
            java.lang.Object r0 = r15.A01
            X.GMQ r0 = (X.GMQ) r0
            X.QD9 r5 = new X.QD9
            r5.<init>(r0)
            return r5
        L_0x02b0:
            java.lang.Object r1 = r15.A01
            X.0rk r1 = (X.0rk) r1
            int r0 = r1.A00
            int r0 = r0 + 1
            r1.A00 = r0
            goto L_0x06c3
        L_0x02bc:
            java.lang.String r2 = X.C41847B3o.A1E(r3)
            java.lang.Object r1 = r15.A01
            X.L33 r1 = (X.L33) r1
            r0 = 32
            java.lang.String r8 = X.002.A0E(r2, r0, r0)
            X.L5g r0 = r1.A00
            X.L5h r9 = r0.A00
            boolean r0 = r8.isEmpty()
            if (r0 != 0) goto L_0x06c3
            X.LMt r2 = r9.A00
            r7 = r2
            char[] r6 = r8.toCharArray()
            int r5 = r6.length
            r4 = 0
        L_0x02dd:
            if (r4 >= r5) goto L_0x0309
            char r1 = r6[r4]
            X.L35 r0 = r9.A01
            boolean r0 = r0.A00
            if (r0 == 0) goto L_0x02eb
            char r1 = java.lang.Character.toLowerCase(r1)
        L_0x02eb:
            java.lang.Character r3 = java.lang.Character.valueOf(r1)
            java.util.Map r1 = r2.A03
            java.lang.Object r2 = r1.get(r3)
            X.LMt r2 = (X.C64099LMt) r2
            if (r2 != 0) goto L_0x0305
            int r0 = r7.A02
            int r0 = r0 + 1
            X.LMt r2 = new X.LMt
            r2.<init>(r0)
            r1.put(r3, r2)
        L_0x0305:
            r7 = r2
            int r4 = r4 + 1
            goto L_0x02dd
        L_0x0309:
            X.M1X r1 = new X.M1X
            r1.<init>(r8)
            java.util.Set r0 = r2.A00
            if (r0 != 0) goto L_0x0319
            java.util.TreeSet r0 = new java.util.TreeSet
            r0.<init>()
            r2.A00 = r0
        L_0x0319:
            r0.add(r1)
            goto L_0x06c3
        L_0x031e:
            boolean r2 = X.AnonymousClass7TE.A1a(r3)
            java.lang.String r1 = "{\"should_continue_checkout\":\""
            java.lang.String r0 = "\"}"
            java.lang.String r4 = X.002.A1B(r1, r0, r2)
            java.lang.Object r0 = r15.A01
            X.QQ0 r0 = (X.QQ0) r0
            X.SUF r10 = r0.A01
            if (r10 == 0) goto L_0x06c3
            java.lang.String r8 = r0.A0B
            if (r8 != 0) goto L_0x0339
            java.lang.String r8 = ""
        L_0x0339:
            java.lang.String r12 = r0.A0A
            long r1 = r0.A06
            java.lang.String r3 = r0.A03
            java.lang.String r7 = r0.A09
            java.lang.String r11 = "2024-10"
            java.lang.String r6 = r0.A02
            X.C51974G9v.A1K(r8, r12, r3)
            r0 = 4
            X.DbW.A1O(r7, r0, r4)
            X.0wc r5 = r10.A0C()
            java.lang.String r0 = "client_load_metacheckoutsdk_warning"
            X.0Aj r9 = X.AnonymousClass7TE.A0e(r5, r0)
            boolean r0 = r9.isSampled()
            if (r0 == 0) goto L_0x06c3
            java.lang.String r0 = X.AnonymousClass9NF.A01()
            r9.AAJ(r0, r12)
            X.2M7 r0 = X.SUF.A03(r10)
            X.Pxh.A18(r0, r9)
            X.QIU r5 = new X.QIU
            r5.<init>()
            java.lang.String r0 = "continue_checkout_callback"
            X.SUF.A09(r5, r10, r0)
            java.lang.String r0 = "shopify_sdk_payload"
            X.0eP r4 = X.AnonymousClass7TE.A1L(r0, r4)
            X.0eP r3 = X.SUF.A08(r3)
            java.lang.String r0 = "csp_version"
            java.util.LinkedHashMap r0 = X.DbY.A0q(r0, r11, r4, r3)
            X.Pxi.A1B(r9, r5, r0)
            X.QHf r0 = new X.QHf
            r0.<init>()
            X.SUF.A0B(r0, r6, r8, r1)
            X.QKY.A00(r9, r0, r10, r8, r7)
        L_0x0393:
            r9.Cgf()
            goto L_0x06c3
        L_0x0398:
            boolean r0 = X.AnonymousClass7TE.A1a(r3)
            java.lang.Object r2 = r15.A01
            X.Oan r2 = (X.C71068Oan) r2
            r2.A07 = r0
            if (r0 != 0) goto L_0x06c3
            java.lang.Runnable r1 = r2.A05
            if (r1 == 0) goto L_0x03b3
            r0 = 619(0x26b, float:8.67E-43)
            java.lang.String r0 = X.C66579MXk.A00(r0)
            X.C71068Oan.A01(r2, r1, r0)
            goto L_0x06c3
        L_0x03b3:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x03b8:
            java.lang.Object r0 = r15.A01
            X.WJn r0 = (X.WJn) r0
            boolean r0 = r0.A0K
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r0)
            return r5
        L_0x03c3:
            X.2Uy r3 = (X.C70762Uy) r3
            java.lang.Object r1 = A00(r3, r15)
            X.TpD r1 = (X.C14065TpD) r1
            android.view.MotionEvent r0 = r3.A00
            X.0qQ.A06(r0)
            boolean r0 = r1.A00(r0)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r0)
            return r5
        L_0x03d9:
            android.view.View r3 = (android.view.View) r3
            r0 = 0
            X.0qQ.A0B(r3, r0)
            android.view.ViewGroup$LayoutParams r1 = r3.getLayoutParams()
            r0 = 9
            java.lang.String r0 = X.C273654mx.A00(r0)
            X.0qQ.A0C(r1, r0)
            X.3MX r1 = (X.AnonymousClass3MX) r1
            X.3kE r0 = r1.mViewHolder
            int r2 = r0.getLayoutPosition()
            java.lang.Object r0 = r15.A01
            X.7h8 r0 = (X.C337927h8) r0
            X.2Wg r0 = r0.A0A
            int r1 = r0.AnL(r2)
            int r0 = r0.AnL(r2)
            r3.measure(r1, r0)
            goto L_0x06c3
        L_0x0407:
            X.2WE r3 = (X.2WE) r3
            java.lang.Object r4 = A00(r3, r15)
            X.Gwi r4 = (X.C53938Gwi) r4
            android.graphics.drawable.Drawable r1 = r4.A00
            android.widget.ImageView$ScaleType r0 = r4.A01
            java.lang.Object[] r2 = new java.lang.Object[]{r1, r0}
            r1 = 14
            X.JJQ r0 = new X.JJQ
            r0.<init>(r4, r1)
            r3.A03(r0, r2)
            goto L_0x06c3
        L_0x0423:
            X.Hs3 r3 = (X.C56054Hs3) r3
            int r2 = r3.A00
            java.lang.Object r1 = r15.A01
            X.2Wa r1 = (X.2Wa) r1
            X.Hs3 r0 = new X.Hs3
            r0.<init>(r2)
            r1.A01(r0)
            goto L_0x06c3
        L_0x0435:
            X.HtL r3 = (X.C56133HtL) r3
            java.lang.Object r1 = A00(r3, r15)
            java.util.Set r1 = (java.util.Set) r1
            java.lang.String r0 = r3.A01
            boolean r0 = r1.contains(r0)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r0)
            return r5
        L_0x0448:
            X.Rra r3 = (X.C10398Rra) r3
            java.lang.Object r1 = A00(r3, r15)
            X.0sP r1 = (X.0sP) r1
            java.lang.Exception r0 = r3.A01
            X.0qQ.A06(r0)
            r1.invoke(r0)
            goto L_0x06c3
        L_0x045a:
            java.lang.Object r0 = A00(r3, r15)
            X.2Sg r0 = (X.2Sg) r0
            java.lang.Object r5 = r0.A00(r3)
            r0 = 39
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.0qQ.A0C(r5, r0)
            return r5
        L_0x046e:
            X.I4U r3 = (X.I4U) r3
            r2 = 0
            X.0qQ.A0B(r3, r2)
            java.lang.Object r1 = r3.A02
            android.view.View r1 = (android.view.View) r1
            boolean r0 = r1.isShown()
            if (r0 == 0) goto L_0x048c
            boolean r0 = r1.isAttachedToWindow()
            if (r0 == 0) goto L_0x048c
            java.lang.Object r0 = r15.A01
            X.0sP r0 = (X.0sP) r0
            r0.invoke(r3)
            r2 = 1
        L_0x048c:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r2)
            return r5
        L_0x0491:
            X.I4U r3 = (X.I4U) r3
            r0 = 0
            X.0qQ.A0B(r3, r0)
            boolean r0 = r3 instanceof X.C59650JRs
            if (r0 == 0) goto L_0x06c3
            r0 = r3
            X.JRs r0 = (X.C59650JRs) r0
            X.JwK r0 = r0.BMF()
            java.lang.Object r1 = r0.A00
            X.0eM r0 = r3.A04
            java.lang.Object r0 = r0.getValue()
            X.AnonymousClass7TF.A1H(r0, r1)
            java.lang.String r0 = "counts"
            java.lang.NullPointerException r0 = X.AnonymousClass7TE.A11(r0)
            throw r0
        L_0x04b4:
            X.29N r3 = (X.29N) r3
            double r0 = r3.A01
            java.lang.Double r1 = java.lang.Double.valueOf(r0)
            java.lang.Object r0 = r15.A01
            java.lang.Comparable r0 = (java.lang.Comparable) r0
            int r0 = X.29b.A00(r1, r0)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
            return r5
        L_0x04c9:
            X.Kl0 r3 = (X.C62700Kl0) r3
            r2 = 0
            X.0qQ.A0B(r3, r2)
            boolean r0 = r3 instanceof X.N1W
            if (r0 == 0) goto L_0x06c3
            X.N1W r3 = (X.N1W) r3
            com.facebook.cdl.gltfmemorypointerholder.LiveEditingRawMemoryPointerHolder r1 = r3.A00
            java.lang.Object r0 = r15.A01
            X.UIE r0 = (X.UIE) r0
            X.LZb r0 = r0.A06
            X.0qQ.A0B(r1, r2)
            X.LRf r0 = r0.A00
            if (r0 != 0) goto L_0x04ef
            java.lang.String r0 = "provider"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x04ef:
            X.Lab r0 = r0.A0E
            com.facebook.cameracore.mediapipeline.services.avatars.AvatarsNativeInputDelegate r0 = r0.A00
            r0.updateBlendWeightsForPrimitive(r1)
            goto L_0x06c3
        L_0x04f8:
            X.L7W r3 = (X.L7W) r3
            java.lang.Object r5 = A00(r3, r15)
            com.facebook.commonavatarliveediting.CdlProviderImpl r5 = (com.facebook.commonavatarliveediting.CdlProviderImpl) r5
            r5.A00 = r3
            X.UKz r0 = r5.A04
            X.Gms r4 = r0.A01
            if (r4 == 0) goto L_0x06c3
            com.facebook.cdl.native.ContentDeliveryLibrary r2 = r3.A00
            int r1 = r4.A00
            int r0 = r4.A01
            r2.setQualityOverride(r1, r0)
            r5.A01 = r4
            goto L_0x06c3
        L_0x0515:
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            java.lang.Object r2 = A00(r3, r15)
            com.facebook.cameracore.ardelivery.xplat.sparkvision.SparkVisionMetadataCallback r2 = (com.facebook.cameracore.ardelivery.xplat.sparkvision.SparkVisionMetadataCallback) r2
            X.S1g r1 = new X.S1g
            r1.<init>()
            java.lang.Integer r0 = X.AnonymousClass05K.A08
            r1.A00 = r0
            r1.A02 = r3
            X.RKl r0 = r1.A00()
            java.lang.String r0 = r0.toString()
            r2.onFailure(r0)
            goto L_0x06c3
        L_0x0535:
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            r0 = 0
            X.0qQ.A0B(r3, r0)
            X.S1g r1 = new X.S1g
            r1.<init>()
            java.lang.Integer r0 = X.AnonymousClass05K.A08
            r1.A00 = r0
            r1.A02 = r3
            X.RKl r2 = r1.A00()
            java.lang.Object r0 = r15.A01
            X.S0H r0 = (X.S0H) r0
            com.facebook.cameracore.ardelivery.xplat.async.XplatAsyncMetadataCompletionCallback r1 = r0.A00
            java.lang.String r0 = r2.getMessage()
            if (r0 != 0) goto L_0x0558
            java.lang.String r0 = "Failed to retrieve blockv5 metadata"
        L_0x0558:
            r1.onFailure(r0)
            goto L_0x06c3
        L_0x055d:
            if (r16 == 0) goto L_0x06c3
            java.lang.Object r0 = r15.A01
            X.S55 r0 = (X.S55) r0
            X.QKv r1 = r0.A0A
            android.os.Bundle r0 = r1.A02()
            if (r0 == 0) goto L_0x06c3
            android.content.Context r0 = r1.A00
            if (r0 == 0) goto L_0x06c3
            java.lang.Class<com.instagram.modal.ModalActivity> r3 = com.instagram.modal.ModalActivity.class
            android.os.Bundle r2 = r1.A02()
            android.content.Context r1 = r1.A00
            java.lang.String r0 = "browser_settings"
            X.AnonymousClass6W8.A06(r1, r2, r3, r0)
            goto L_0x06c3
        L_0x057e:
            java.lang.Object r0 = A00(r3, r15)
            X.QKE r0 = (X.QKE) r0
            X.QCj r0 = r0.A0D
            if (r0 == 0) goto L_0x058b
            X.2Fj r0 = r0.A0A
            goto L_0x05b4
        L_0x058b:
            X.C51965G9l.A15()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0593:
            java.lang.Object r0 = A00(r3, r15)
            X.QKE r0 = (X.QKE) r0
            X.QCj r0 = r0.A0D
            if (r0 == 0) goto L_0x05a0
            X.2Fj r0 = r0.A0B
            goto L_0x05b4
        L_0x05a0:
            X.C51965G9l.A15()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x05a8:
            java.lang.Object r0 = A00(r3, r15)
            X.QKL r0 = (X.QKL) r0
            X.QCi r0 = r0.A0C
            if (r0 == 0) goto L_0x05b9
            X.2Fj r0 = r0.A06
        L_0x05b4:
            r0.A0B(r3)
            goto L_0x06c3
        L_0x05b9:
            X.C51965G9l.A15()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x05c1:
            java.lang.Object r1 = r15.A01
            X.QKL r1 = (X.QKL) r1
            X.QCi r0 = r1.A0C
            if (r0 == 0) goto L_0x05f1
            X.2Fj r0 = r0.A05
            java.lang.Object r0 = r0.A02()
            com.fbpay.w3c.CardDetails r0 = (com.fbpay.w3c.CardDetails) r0
            if (r0 == 0) goto L_0x05ef
            java.lang.String r0 = r0.A05
        L_0x05d5:
            X.RGo r2 = X.C11334SNo.A01(r0)
            X.RGo r0 = X.C8946RGo.AMERICAN_EXPRESS
            android.widget.EditText r1 = r1.A05
            if (r2 != r0) goto L_0x05e9
            if (r1 == 0) goto L_0x06c3
            r0 = 2131951668(0x7f130034, float:1.9539757E38)
        L_0x05e4:
            r1.setHint(r0)
            goto L_0x06c3
        L_0x05e9:
            if (r1 == 0) goto L_0x06c3
            r0 = 2131951667(0x7f130033, float:1.9539755E38)
            goto L_0x05e4
        L_0x05ef:
            r0 = 0
            goto L_0x05d5
        L_0x05f1:
            X.C51965G9l.A15()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x05f9:
            java.lang.Object r0 = r15.A01
            X.TfN r0 = (X.C13704TfN) r0
            r0.onDecline()
            goto L_0x06c3
        L_0x0602:
            X.6Tm r3 = (X.AnonymousClass6Tm) r3
            if (r3 == 0) goto L_0x06c3
            r2 = 0
            java.lang.Object r0 = X.DbT.A0p(r3, r2)
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.collections.Map<*, *>"
            X.0qQ.A0C(r0, r1)
            java.util.Map r0 = (java.util.Map) r0
            java.lang.Object r1 = r15.A01
            X.S55 r1 = (X.S55) r1
            X.0qQ.A0B(r0, r2)
            java.lang.String r2 = "care_of"
            java.lang.String r5 = X.DbT.A11(r2, r0)
            java.lang.String r2 = "street1"
            java.lang.String r10 = X.DbT.A11(r2, r0)
            java.lang.String r2 = "street2"
            java.lang.String r11 = X.DbT.A11(r2, r0)
            java.lang.String r2 = "city"
            java.lang.String r6 = X.DbT.A11(r2, r0)
            java.lang.String r2 = "state"
            java.lang.String r9 = X.DbT.A11(r2, r0)
            java.lang.String r2 = "zip"
            java.lang.String r12 = X.DbT.A11(r2, r0)
            java.lang.String r2 = "country"
            java.lang.String r7 = X.DbT.A11(r2, r0)
            java.lang.String r2 = "id"
            java.lang.String r8 = X.DbT.A11(r2, r0)
            com.fbpay.w3c.Address r4 = new com.fbpay.w3c.Address
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
            r5 = 0
            java.lang.String r2 = "credential_id"
            java.lang.String r12 = X.DbT.A11(r2, r0)
            java.lang.String r2 = "card_association_name"
            java.lang.String r9 = X.DbT.A11(r2, r0)
            java.lang.String r2 = "expiry_month"
            java.lang.String r3 = X.DbT.A11(r2, r0)
            r8 = 0
            if (r3 == 0) goto L_0x06ba
            r2 = 10
            java.lang.Integer r7 = X.00y.A0m(r3, r2)
        L_0x066f:
            java.lang.String r2 = "expiry_year"
            java.lang.String r3 = X.DbT.A11(r2, r0)
            if (r3 == 0) goto L_0x067d
            r2 = 10
            java.lang.Integer r8 = X.00y.A0m(r3, r2)
        L_0x067d:
            java.lang.String r2 = "last_four_digits"
            java.lang.String r14 = X.DbT.A11(r2, r0)
            java.lang.String r2 = "card_image_url"
            java.lang.String r10 = X.DbT.A11(r2, r0)
            java.lang.String r2 = "csc"
            java.lang.String r13 = X.DbT.A11(r2, r0)
            java.lang.String r2 = "card_number"
            java.lang.String r11 = X.DbT.A11(r2, r0)
            java.lang.String r2 = "is_default"
            java.lang.Object r6 = r0.get(r2)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            com.fbpay.w3c.CardDetails r3 = new com.fbpay.w3c.CardDetails
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            X.STY r2 = r1.A0B
            X.SGp r0 = new X.SGp
            r0.<init>(r5, r3)
            r2.A0E(r0)
            X.4gR r0 = r1.A08
            X.RzL r0 = r0.A00
            X.JwM r2 = r0.A0L
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            r2.A02 = r0
            r1.A00()
            goto L_0x06c3
        L_0x06ba:
            r7 = r5
            goto L_0x066f
        L_0x06bc:
            java.lang.Object r0 = r15.A01
            X.1TA r0 = (X.AnonymousClass1TA) r0
            r0.cancel()
        L_0x06c3:
            X.0gF r5 = X.C60340gF.A00
            return r5
        L_0x06c6:
            float r2 = X.AnonymousClass7TE.A04(r3)
            java.lang.Object r1 = r15.A01
            X.4Cc r1 = (X.C262094Cc) r1
            r0 = 1148846080(0x447a0000, float:1000.0)
            float r2 = r2 * r0
            int r0 = (int) r2
            com.facebook.avatar.expresso.webp.WebPEncoderImpl r5 = new com.facebook.avatar.expresso.webp.WebPEncoderImpl
            r5.<init>(r1, r0)
            return r5
        L_0x06d8:
            java.lang.Object r1 = r15.A01
            X.Sln r1 = (X.C12060Sln) r1
            boolean r0 = r1.A01
            if (r0 == 0) goto L_0x06ec
            if (r16 == 0) goto L_0x06e5
            r0 = 0
            r1.A01 = r0
        L_0x06e5:
            r0 = 0
        L_0x06e7:
            java.lang.Long r5 = java.lang.Long.valueOf(r0)
            return r5
        L_0x06ec:
            r0 = 200(0xc8, double:9.9E-322)
            goto L_0x06e7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.TY5.invoke(java.lang.Object):java.lang.Object");
    }
}
