package com.facebook.browser.lite.extensions.autofill.instagram;

import X.AnonymousClass0fD;
import X.C7580QKv;
import com.facebook.browser.lite.extensions.autofill.base.jsbridge.AutofillSharedJSBridgeProxy;
import com.facebook.browser.lite.extensions.autofill.model.AutofillData;
import com.facebook.browser.lite.ipc.BrowserLiteJSBridgeCallback;
import com.facebook.businessextension.jscalls.RequestAutofillJSBridgeCall;

public final class AutofillController$5 extends BrowserLiteJSBridgeCallback.Stub {
    public final /* synthetic */ AutofillSharedJSBridgeProxy A00;
    public final /* synthetic */ C7580QKv A01;
    public final /* synthetic */ AutofillData A02;
    public final /* synthetic */ RequestAutofillJSBridgeCall A03;
    public final /* synthetic */ Integer A04;

    public AutofillController$5(AutofillSharedJSBridgeProxy autofillSharedJSBridgeProxy, C7580QKv qKv, AutofillData autofillData, RequestAutofillJSBridgeCall requestAutofillJSBridgeCall, Integer num) {
        this.A01 = qKv;
        this.A02 = autofillData;
        this.A04 = num;
        this.A03 = requestAutofillJSBridgeCall;
        this.A00 = autofillSharedJSBridgeProxy;
        AnonymousClass0fD.A0A(-1617120598, AnonymousClass0fD.A03(341118273));
    }

    /* JADX WARNING: type inference failed for: r1v8, types: [X.RRP, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x04c6, code lost:
        if (r18 != false) goto L_0x04c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x04e5, code lost:
        if (r0.length() > 0) goto L_0x04c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x04f5, code lost:
        if (r0.length() > 0) goto L_0x04c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0192, code lost:
        if (X.DbY.A1Z(r16, r22, 36322860550138470L) != false) goto L_0x0165;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01e2, code lost:
        if (r0 != false) goto L_0x01e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x02c1, code lost:
        if (X.DbY.A1Z(r16, r22, 36322860550466155L) != false) goto L_0x0284;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x02c8, code lost:
        if (X.RUR.A00(r6, r8) == false) goto L_0x02cb;
     */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x02b3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Czv(android.os.Bundle r31, com.facebook.browser.lite.ipc.BrowserLiteJSBridgeCall r32, int r33) {
        /*
            r30 = this;
            r0 = 2079909774(0x7bf8e78e, float:2.5847722E36)
            int r19 = X.AnonymousClass0fD.A03(r0)
            java.lang.String r0 = "BrowserLiteIntent.EXTRA_AUTOFILL_ENTRY_JSON_STRINGS"
            r1 = r31
            java.util.ArrayList r0 = r1.getStringArrayList(r0)
            java.util.ArrayList r23 = X.SUR.A05(r0)
            r9 = r30
            X.QKv r4 = r9.A01
            r0 = r23
            r4.A0O = r0
            com.facebook.browser.lite.extensions.autofill.model.AutofillData r2 = r9.A02
            java.lang.String r1 = r4.A0K
            java.lang.String r22 = "id"
            java.util.Map r10 = r2.A00
            r0 = r22
            if (r1 != 0) goto L_0x0507
            r10.remove(r0)
        L_0x002a:
            java.lang.String r0 = r4.A0J
            java.lang.String r14 = "ent_id"
            if (r0 != 0) goto L_0x0502
            r10.remove(r14)
        L_0x0033:
            X.4gR r5 = r4.A0b
            X.RzL r6 = r5.A00
            X.Jvc r7 = r6.A0P
            X.7kb r3 = r4.A04
            java.lang.String r1 = ""
            if (r3 == 0) goto L_0x04ff
            r0 = r3
            com.facebook.browser.lite.BrowserLiteFragment r0 = (com.facebook.browser.lite.BrowserLiteFragment) r0
            java.lang.String r0 = r0.A0l
        L_0x0044:
            r7.A03 = r0
            if (r3 == 0) goto L_0x04fc
            com.facebook.browser.lite.BrowserLiteFragment r3 = (com.facebook.browser.lite.BrowserLiteFragment) r3
            java.lang.String r12 = r3.A0l
            if (r12 == 0) goto L_0x04fc
        L_0x004e:
            java.util.Map r11 = r4.A0f
            java.util.Map r1 = r4.A0g
            java.lang.String r0 = r7.A02
            r24 = r0
            android.os.Bundle r20 = r4.A02()
            X.1yd r8 = r5.A04
            r21 = 0
            java.lang.String r13 = X.C11429STt.A02(r12)
            boolean r0 = r11.containsKey(r13)
            r3 = 0
            if (r0 != 0) goto L_0x03f5
            com.instagram.common.session.UserSession r13 = r8.A00
            X.0Tu r12 = X.0Tu.A06
            r0 = 36885810499814050(0x830b73001802a2, double:3.3900733150951065E-306)
            java.lang.String r14 = X.Pxe.A0w(r12, r13, r0)
            java.lang.String r11 = "single_pill"
            boolean r11 = r14.equals(r11)
            if (r11 != 0) goto L_0x0086
            java.lang.String r0 = X.182.A04(r12, r13, r0)
            X.0qQ.A0A(r0)
        L_0x0086:
            boolean r0 = r23.isEmpty()
            if (r0 == 0) goto L_0x03e3
            java.lang.Integer r13 = X.AnonymousClass05K.A01
        L_0x008e:
            android.content.Context r0 = r4.A00
            r18 = r0
            int r1 = r13.intValue()
            java.lang.String r17 = "NO_PROMPTED_AUTOFILL"
            java.lang.String r20 = "prompt_name"
            r11 = 772805755(0x2e10147b, float:3.276E-11)
            r12 = 1
            if (r1 == r12) goto L_0x00d4
            r0 = 2
            if (r1 == r0) goto L_0x00b0
            r0 = 3
            if (r1 == r0) goto L_0x0230
            r1 = 985118630(0x3ab7b7a6, float:0.0014016523)
        L_0x00aa:
            r0 = r19
            X.AnonymousClass0fD.A0A(r1, r0)
            return
        L_0x00b0:
            r0 = r23
            java.lang.Object r0 = r0.get(r3)
            com.facebook.browser.lite.extensions.autofill.model.AutofillData r0 = (com.facebook.browser.lite.extensions.autofill.model.AutofillData) r0
            java.util.Map r0 = r0.A00
            java.util.Map r0 = java.util.Collections.unmodifiableMap(r0)
            java.util.HashMap r1 = X.Pxe.A19(r0)
            java.util.Map r0 = java.util.Collections.unmodifiableMap(r10)
            r1.putAll(r0)
            com.facebook.browser.lite.extensions.autofill.model.AutofillData r2 = new com.facebook.browser.lite.extensions.autofill.model.AutofillData
            r2.<init>((java.util.Map) r1)
            r10 = r21
            r18 = 0
            goto L_0x024a
        L_0x00d4:
            X.S5W r0 = r4.A0a
            r26 = r0
            java.lang.String r1 = "PROMPTED_SAVE"
            X.RRP r1 = r0.A00(r1, r3)
            X.QP6 r0 = r6.A05
            java.lang.String r0 = r0.A06
            r1.A0A = r0
            java.lang.String r0 = r7.A03
            r1.A08 = r0
            X.SHz r10 = r1.A00()
            boolean r0 = r4.A0Q
            if (r0 == 0) goto L_0x010b
            X.STY r1 = r4.A07
            if (r1 == 0) goto L_0x010b
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            r1.A0D = r0
            java.lang.String r0 = r7.A03
            boolean r0 = r1.A0K(r2, r0, r3)
            if (r0 == 0) goto L_0x010b
            android.os.Bundle r0 = r4.A02()
            X.SUR.A0A(r0, r5, r10)
            r1 = 313356246(0x12ad6fd6, float:1.0945405E-27)
            goto L_0x00aa
        L_0x010b:
            boolean r0 = r7.A04
            if (r0 != 0) goto L_0x013d
            java.lang.Integer r14 = X.AnonymousClass05K.A01
            if (r13 != r14) goto L_0x013d
            boolean r0 = X.SPo.A01(r6, r8, r12)
            if (r0 == 0) goto L_0x013d
            X.STY r1 = r4.A07
            if (r1 == 0) goto L_0x0128
            X.JwI r0 = r6.A0H
            r0.A00 = r14
            java.lang.String r0 = X.RUH.A00(r13)
            r1.A0H(r0, r14)
        L_0x0128:
            X.SJh r3 = r5.A02
            java.lang.Integer r2 = r9.A04
            r1 = r20
            r0 = r17
            r3.A03(r2, r1, r0, r11)
            r0 = r21
            r3.A01(r2, r0, r11)
            r1 = -286651347(0xffffffffeeea0c2d, float:-3.6217106E28)
            goto L_0x00aa
        L_0x013d:
            X.0qQ.A0B(r8, r3)
            X.JwI r14 = r6.A0F
            X.0qQ.A0B(r14, r3)
            java.lang.Object r0 = r14.A00
            java.util.Map r0 = (java.util.Map) r0
            java.lang.Integer r1 = X.Pxe.A0n()
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L_0x0175
            java.lang.Object r0 = r14.A00
            java.util.Map r0 = (java.util.Map) r0
            java.lang.Number r0 = X.C51966G9m.A14(r1, r0)
            r1 = 16
            if (r0 == 0) goto L_0x0175
            int r0 = r0.intValue()
            if (r0 != r1) goto L_0x0175
        L_0x0165:
            android.os.Bundle r2 = r4.A02()
            java.lang.Integer r1 = X.AnonymousClass05K.A00
            r0 = r26
            r0.A01(r2, r13, r1)
            r1 = 910466493(0x36449dbd, float:2.9298092E-6)
            goto L_0x00aa
        L_0x0175:
            com.instagram.common.session.UserSession r0 = r8.A00
            r22 = r0
            X.0Tu r16 = X.0Tu.A05
            r1 = r0
            r0 = r16
            boolean r0 = X.Pxf.A1T(r0, r1)
            if (r0 != 0) goto L_0x0195
            r14 = 36322860550138470(0x810b7300512a66, double:3.03406150010277E-306)
            r0 = r14
            r15 = r22
            r14 = r16
            boolean r0 = X.DbY.A1Z(r14, r15, r0)
            if (r0 == 0) goto L_0x0195
            goto L_0x0165
        L_0x0195:
            boolean r0 = X.RUR.A00(r6, r8)
            if (r0 != 0) goto L_0x0165
            if (r18 == 0) goto L_0x022d
            X.Ro4 r14 = r5.A03
            r1 = 6
            X.TPH r0 = new X.TPH
            r0.<init>((java.lang.Object) r9, (int) r1)
            boolean r0 = X.RUL.A00(r14, r0)
            if (r0 == 0) goto L_0x022d
            android.os.Bundle r1 = r4.A02()
            java.lang.String r3 = "BLOKS_REQUEST_PROMPT_CONTACT_SAVE"
            r0 = r26
            X.RRP r0 = r0.A00(r3, r12)
            X.SHz r0 = r0.A00()
            X.SUR.A0A(r1, r5, r0)
            com.instagram.common.session.UserSession r3 = r4.A0d
            X.S0G r0 = new X.S0G
            r0.<init>(r3)
            X.QK9 r8 = new X.QK9
            r8.<init>(r5, r0)
            X.SJh r3 = r5.A02
            java.lang.Integer r9 = r9.A04
            java.lang.String r12 = "SaveContactBloksBottomSheet"
            r0 = r20
            r3.A03(r9, r0, r12, r11)
            java.util.HashMap r29 = X.SUR.A06(r1, r10)
            boolean r10 = r4.A0S
            boolean r0 = r4.A0H()
            if (r10 == 0) goto L_0x01e4
            r10 = 1
            if (r0 == 0) goto L_0x01e5
        L_0x01e4:
            r10 = 0
        L_0x01e5:
            boolean r0 = r4.A0J()
            X.S4q r25 = r4.A04(r10, r0)
            X.QP6 r0 = r6.A05
            java.lang.String r6 = r0.A06
            java.lang.String r0 = r7.A03
            android.os.Bundle r11 = r4.A02()
            X.SlG r24 = new X.SlG
            r10 = r24
            r12 = r26
            r13 = r5
            r14 = r6
            r15 = r0
            r16 = r23
            r10.<init>(r11, r12, r13, r14, r15, r16)
            X.SRY r6 = X.SRY.A00()
            X.7kb r0 = r4.A04
            r0.getClass()
            X.QLA r5 = r0.C8U()
            X.SlE r0 = new X.SlE
            r0.<init>(r1, r6, r4, r5)
            r21 = r18
            r22 = r1
            r23 = r0
            r26 = r3
            r27 = r2
            r28 = r9
            r20 = r8
            r20.A05(r21, r22, r23, r24, r25, r26, r27, r28, r29)
            r1 = 2073548273(0x7b97d5f1, float:1.5767521E36)
            goto L_0x00aa
        L_0x022d:
            r18 = 1
            goto L_0x024a
        L_0x0230:
            boolean r0 = r4.A0Q
            if (r0 == 0) goto L_0x0246
            X.STY r0 = r4.A07
            if (r0 == 0) goto L_0x0246
            X.4gR r0 = r0.A0T
            X.RzL r1 = r0.A00
            X.0qQ.A0B(r1, r3)
            X.QP6 r0 = new X.QP6
            r0.<init>()
            r1.A05 = r0
        L_0x0246:
            r18 = 0
            r10 = r21
        L_0x024a:
            com.facebook.businessextension.jscalls.RequestAutofillJSBridgeCall r0 = r9.A03
            r25 = r0
            boolean r0 = r4.A0H()
            if (r0 == 0) goto L_0x02cb
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r13 == r0) goto L_0x025c
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            if (r13 != r0) goto L_0x02cb
        L_0x025c:
            X.0qQ.A0B(r8, r3)
            X.JwI r14 = r6.A0F
            X.0qQ.A0B(r14, r3)
            java.lang.Object r0 = r14.A00
            java.util.Map r0 = (java.util.Map) r0
            java.lang.Integer r1 = X.Pxe.A0n()
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L_0x02a4
            java.lang.Object r0 = r14.A00
            java.util.Map r0 = (java.util.Map) r0
            java.lang.Number r0 = X.C51966G9m.A14(r1, r0)
            r1 = 18
            if (r0 == 0) goto L_0x02a4
            int r0 = r0.intValue()
            if (r0 != r1) goto L_0x02a4
        L_0x0284:
            X.S5W r1 = r4.A0a
            android.os.Bundle r2 = r4.A02()
            java.lang.String r0 = "SUPPRESSED_AUTOMATIC_UPDATE"
            X.RRP r0 = r1.A00(r0, r3)
            X.SRY r1 = X.SRY.A00()
            X.SHz r0 = r0.A00()
            java.util.HashMap r0 = r0.A01()
            r1.A07(r2, r0)
            r1 = -92734893(0xfffffffffa78fa53, float:-3.231917E35)
            goto L_0x00aa
        L_0x02a4:
            com.instagram.common.session.UserSession r0 = r8.A00
            r22 = r0
            X.0Tu r16 = X.0Tu.A05
            r1 = r0
            r0 = r16
            boolean r0 = X.Pxf.A1T(r0, r1)
            if (r0 != 0) goto L_0x02c4
            r14 = 36322860550466155(0x810b7300562a6b, double:3.0340615003099996E-306)
            r0 = r14
            r15 = r22
            r14 = r16
            boolean r0 = X.DbY.A1Z(r14, r15, r0)
            if (r0 == 0) goto L_0x02c4
            goto L_0x0284
        L_0x02c4:
            boolean r0 = X.RUR.A00(r6, r8)
            if (r0 == 0) goto L_0x02cb
            goto L_0x0284
        L_0x02cb:
            com.facebook.businessextension.jscalls.RequestAutofillJSBridgeCall r0 = r4.A0E
            if (r0 == 0) goto L_0x0324
            boolean r0 = r4.A0H()
            if (r0 == 0) goto L_0x0324
            java.lang.Integer r14 = X.AnonymousClass05K.A0C
            if (r13 == r14) goto L_0x02dd
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            if (r13 != r0) goto L_0x0324
        L_0x02dd:
            X.S5W r1 = r4.A0a
            android.os.Bundle r0 = r4.A02()
            r1.A01(r0, r13, r14)
            com.facebook.browser.lite.extensions.autofill.base.jsbridge.AutofillSharedJSBridgeProxy r3 = r9.A00
            r4.A0W = r12
            boolean r0 = r13.equals(r14)
            if (r0 == 0) goto L_0x02f7
            X.Ro2 r1 = r6.A08
            java.lang.Integer r0 = X.AnonymousClass05K.A00
        L_0x02f4:
            r1.A00 = r0
            goto L_0x0304
        L_0x02f7:
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L_0x0304
            X.Ro2 r1 = r6.A08
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            goto L_0x02f4
        L_0x0304:
            org.json.JSONObject r0 = X.SUR.A09(r2)     // Catch:{ JSONException -> 0x050c }
            com.facebook.businessextension.jscalls.SaveAutofillDataJSBridgeCall r0 = r3.A0B(r0)     // Catch:{ JSONException -> 0x050c }
            r3.A0D(r0)     // Catch:{ JSONException -> 0x050c }
            X.SJh r3 = r5.A02
            java.lang.Integer r2 = r9.A04
            r1 = r20
            r0 = r17
            r3.A03(r2, r1, r0, r11)
            r0 = r21
            r3.A01(r2, r0, r11)
            r1 = 450728032(0x1add9060, float:9.163671E-23)
            goto L_0x00aa
        L_0x0324:
            int r0 = r23.size()
            if (r0 <= 0) goto L_0x03d8
            r0 = r23
            java.lang.Object r12 = r0.get(r3)
            com.facebook.browser.lite.extensions.autofill.model.AutofillData r12 = (com.facebook.browser.lite.extensions.autofill.model.AutofillData) r12
        L_0x0332:
            com.instagram.common.session.UserSession r13 = r4.A0d
            X.0Tu r14 = X.0Tu.A05
            r0 = 36310430910382147(0x810025000e0043, double:3.0262009458707296E-306)
            boolean r17 = X.182.A06(r14, r13, r0)
            boolean r0 = r4.A0Q
            r24 = r0
            boolean r0 = r4.A0S
            r22 = r0
            boolean r16 = r4.A0H()
            X.0Tu r14 = X.0Tu.A06
            r0 = 36310430913593442(0x810025003f0062, double:3.0262009479015655E-306)
            boolean r15 = X.182.A06(r14, r13, r0)
            X.S5W r0 = r4.A0a
            X.QKH r1 = new X.QKH
            r1.<init>(r0)
            android.os.Bundle r13 = X.AnonymousClass7TE.A0a()
            java.lang.String r14 = "is_payment_enabled"
            r0 = r24
            r13.putBoolean(r14, r0)
            java.lang.String r14 = "is_reconsent_enabled"
            r0 = r22
            r13.putBoolean(r14, r0)
            java.lang.String r14 = "is_consent_accepted"
            r0 = r16
            r13.putBoolean(r14, r0)
            java.lang.String r14 = "should_always_show_ads_disclosure"
            r0 = r17
            r13.putBoolean(r14, r0)
            java.lang.String r14 = "disable_drag_and_bg_tap_to_dismiss"
            r13.putBoolean(r14, r15)
            r1.setArguments(r13)
            X.SVF r0 = new X.SVF
            r0.<init>(r9, r3)
            r1.A02 = r0
            com.facebook.browser.lite.extensions.autofill.base.jsbridge.AutofillSharedJSBridgeProxy r0 = r9.A00
            java.lang.String r7 = r7.A03
            r1.A05 = r4
            r1.A03 = r0
            r0 = r25
            r1.A09 = r0
            r1.A07 = r2
            r1.A08 = r12
            r0 = r18
            r1.A00 = r0
            r1.A0A = r7
            r0 = r23
            r1.A0B = r0
            r1.A06 = r8
            r1.A04 = r5
            if (r10 == 0) goto L_0x03b4
            android.os.Bundle r0 = r4.A02()
            X.SUR.A0A(r0, r5, r10)
        L_0x03b4:
            X.SJh r7 = r5.A02
            java.lang.Integer r5 = r9.A04
            java.lang.String r2 = "AutofillContactBottomSheetDialogFragment"
            r0 = r20
            r7.A03(r5, r0, r2, r11)
            java.lang.Integer r13 = X.AnonymousClass05K.A00
            r9 = r4
            r10 = r1
            r11 = r21
            r12 = r5
            r14 = r2
            r9.A09(r10, r11, r12, r13, r14)
            boolean r0 = X.SPo.A01(r6, r8, r3)
            if (r0 == 0) goto L_0x03d3
            X.RUJ.A00(r6)
        L_0x03d3:
            r1 = -818774655(0xffffffffcf327d81, float:-2.99456947E9)
            goto L_0x00aa
        L_0x03d8:
            java.util.HashMap r0 = X.AnonymousClass7TE.A1E()
            com.facebook.browser.lite.extensions.autofill.model.AutofillData r12 = new com.facebook.browser.lite.extensions.autofill.model.AutofillData
            r12.<init>((java.util.Map) r0)
            goto L_0x0332
        L_0x03e3:
            r0 = r23
            java.lang.Object r0 = r0.get(r3)
            com.facebook.browser.lite.extensions.autofill.model.AutofillData r0 = (com.facebook.browser.lite.extensions.autofill.model.AutofillData) r0
            boolean r0 = X.SUR.A0F(r0, r2)
            if (r0 == 0) goto L_0x04c8
            java.lang.Integer r13 = X.AnonymousClass05K.A00
            goto L_0x008e
        L_0x03f5:
            boolean r0 = r11.containsKey(r13)
            if (r0 == 0) goto L_0x04f8
            java.lang.Object r0 = r11.get(r13)
            boolean r0 = X.AnonymousClass7TE.A1a(r0)
            if (r0 == 0) goto L_0x04f8
            java.lang.Object r15 = r1.get(r12)
            com.facebook.browser.lite.extensions.autofill.model.AutofillData r15 = (com.facebook.browser.lite.extensions.autofill.model.AutofillData) r15
            com.instagram.common.session.UserSession r0 = r8.A00
            r13 = r0
            X.0Tu r11 = X.0Tu.A05
            r16 = 36322860545288747(0x810b7300072a2b, double:3.034061497035786E-306)
            r0 = r16
            boolean r18 = X.DbY.A1Z(r11, r13, r0)
            if (r15 == 0) goto L_0x04c8
            boolean r0 = X.SUR.A0F(r15, r2)
            if (r0 == 0) goto L_0x04c8
            java.lang.Integer r13 = X.AnonymousClass05K.A00
            java.util.Map r0 = r15.A00
            r17 = r0
            java.util.Map r16 = java.util.Collections.unmodifiableMap(r17)
            java.util.Map r0 = java.util.Collections.unmodifiableMap(r10)
            java.util.Iterator r15 = X.AnonymousClass7TF.A0u(r0)
        L_0x0435:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x04cc
            java.util.Map$Entry r11 = X.AnonymousClass7TE.A1J(r15)
            java.lang.String r0 = X.DbT.A13(r11)
            boolean r0 = r0.equals(r14)
            if (r0 != 0) goto L_0x0435
            java.lang.String r1 = X.DbT.A13(r11)
            r0 = r22
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0435
            java.lang.Object r1 = r11.getKey()
            r0 = r16
            java.lang.String r1 = X.DbT.A11(r1, r0)
            if (r1 == 0) goto L_0x0435
            java.lang.String r0 = X.DbS.A0s(r11)
            int r0 = r1.compareToIgnoreCase(r0)
            if (r0 == 0) goto L_0x0435
            java.lang.String r11 = "EDITED_AUTOFILLED_FIELD"
            r0 = r24
            X.AnonymousClass7TG.A1N(r11, r0)
            X.RRP r1 = new X.RRP
            r1.<init>()
            r1.A0I = r11
            r1.A0B = r0
            java.util.HashSet r14 = X.AnonymousClass7TE.A1F()
            java.util.Map r11 = java.util.Collections.unmodifiableMap(r17)
            java.util.Map r0 = java.util.Collections.unmodifiableMap(r10)
            java.util.Iterator r17 = X.AnonymousClass7TF.A0u(r0)
        L_0x048b:
            boolean r0 = r17.hasNext()
            if (r0 == 0) goto L_0x04b1
            java.util.Map$Entry r16 = X.AnonymousClass7TE.A1J(r17)
            java.lang.Object r0 = r16.getKey()
            java.lang.String r15 = X.DbT.A11(r0, r11)
            if (r15 == 0) goto L_0x048b
            java.lang.Object r0 = r16.getValue()
            boolean r0 = r15.equals(r0)
            if (r0 != 0) goto L_0x048b
            java.lang.Object r0 = r16.getKey()
            r14.add(r0)
            goto L_0x048b
        L_0x04b1:
            java.lang.String r0 = X.SUR.A02(r14)
            r1.A09 = r0
            r1.A08 = r12
            java.lang.String r0 = "CONTACT_AUTOFILL"
            r1.A0H = r0
            X.SHz r1 = r1.A00()
            r0 = r20
            X.SUR.A0A(r0, r5, r1)
            if (r18 == 0) goto L_0x04cc
        L_0x04c8:
            java.lang.Integer r13 = X.AnonymousClass05K.A0C
            goto L_0x008e
        L_0x04cc:
            java.util.Map r1 = X.SKH.A02(r6, r8)
            boolean r0 = r1.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x008e
            java.lang.String r0 = "supplemented_wallet_data_from_recent"
            java.lang.String r0 = X.DbT.A11(r0, r1)
            if (r0 == 0) goto L_0x04e8
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x04e8
            goto L_0x04c8
        L_0x04e8:
            java.lang.String r0 = "supplemented_wallet_data_from_crossapp"
            java.lang.String r0 = X.DbT.A11(r0, r1)
            if (r0 == 0) goto L_0x008e
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x008e
            goto L_0x04c8
        L_0x04f8:
            java.lang.Integer r13 = X.AnonymousClass05K.A0N
            goto L_0x008e
        L_0x04fc:
            r12 = r1
            goto L_0x004e
        L_0x04ff:
            r0 = r1
            goto L_0x0044
        L_0x0502:
            r10.put(r14, r0)
            goto L_0x0033
        L_0x0507:
            r10.put(r0, r1)
            goto L_0x002a
        L_0x050c:
            java.lang.String r0 = "Illegal JSON for autofill save"
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.browser.lite.extensions.autofill.instagram.AutofillController$5.Czv(android.os.Bundle, com.facebook.browser.lite.ipc.BrowserLiteJSBridgeCall, int):void");
    }
}
