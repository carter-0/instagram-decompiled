package com.facebook.browser.lite.extensions.autofill.base.jsbridge;

import X.002;
import X.01V;
import X.0Tu;
import X.0qQ;
import X.182;
import X.1yd;
import X.AnonymousClass05K;
import X.AnonymousClass0fD;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C10062Rlz;
import X.C10860RzL;
import X.C10947S2f;
import X.C11288SJh;
import X.C11429STt;
import X.C270254gR;
import X.C51968G9o;
import X.C66580MXl;
import X.C7580QKv;
import X.DbS;
import X.DbY;
import X.Dba;
import X.Pxe;
import X.Pxf;
import X.Pxg;
import X.Pxh;
import X.QJx;
import X.QLA;
import X.RF6;
import X.RRP;
import X.S0F;
import X.S5W;
import X.S8K;
import X.SQO;
import X.SRY;
import X.SUR;
import X.TFS;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.JavascriptInterface;
import android.widget.Toast;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.browser.lite.bridge.BrowserLiteJSBridgeProxy;
import com.facebook.browser.lite.extensions.autofill.model.AutofillData;
import com.facebook.browser.lite.ipc.BrowserLiteJSBridgeCall;
import com.facebook.browser.lite.ipc.BrowserLiteJSBridgeCallback;
import com.facebook.browser.lite.webview.SystemWebView;
import com.facebook.businessextension.jscalls.BusinessExtensionJSBridgeCall;
import com.facebook.businessextension.jscalls.RequestAutofillJSBridgeCall;
import com.facebook.businessextension.jscalls.SaveAutofillDataJSBridgeCall;
import com.facebook.businessextension.jscalls.SaveAutofillDataJSBridgeCallData;
import com.google.common.collect.ImmutableMap;
import com.instagram.common.session.UserSession;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class AutofillSharedJSBridgeProxy extends BrowserLiteJSBridgeProxy {
    public int A00;
    public Long A01;
    public String A02;
    public String A03;
    public final Intent A04;
    public final S5W A05;
    public final C270254gR A06;
    public final S0F A07;
    public final WeakReference A08;
    public final BrowserLiteJSBridgeCallback A09 = new AutofillJSBridgeCallback();

    public final class AutofillJSBridgeCallback extends BrowserLiteJSBridgeCallback.Stub {
        public /* synthetic */ AutofillJSBridgeCallback() {
            AnonymousClass0fD.A0A(1344741880, AnonymousClass0fD.A03(2070390607));
            AnonymousClass0fD.A0A(-1278671524, AnonymousClass0fD.A03(1494410591));
        }

        /* JADX WARNING: Removed duplicated region for block: B:111:0x01ce A[SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:51:0x0154  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void Czv(android.os.Bundle r24, com.facebook.browser.lite.ipc.BrowserLiteJSBridgeCall r25, int r26) {
            /*
                r23 = this;
                r0 = -976148486(0xffffffffc5d127fa, float:-6692.997)
                int r14 = X.AnonymousClass0fD.A03(r0)
                r0 = r23
                com.facebook.browser.lite.extensions.autofill.base.jsbridge.AutofillSharedJSBridgeProxy r11 = com.facebook.browser.lite.extensions.autofill.base.jsbridge.AutofillSharedJSBridgeProxy.this
                java.lang.ref.WeakReference r0 = r11.A08
                r22 = r0
                X.QKv r10 = X.Pxe.A0Q(r22)
                if (r10 != 0) goto L_0x001c
                r0 = -779279474(0xffffffffd18d238e, float:-7.5773362E10)
            L_0x0018:
                X.AnonymousClass0fD.A0A(r0, r14)
                return
            L_0x001c:
                r6 = r25
                java.lang.String r1 = r6.A04
                java.lang.String r5 = "requestAutoFill"
                boolean r0 = r1.equals(r5)
                if (r0 == 0) goto L_0x0243
                android.content.Context r4 = r6.A00
                java.lang.String r3 = r6.A03
                android.os.Bundle r2 = r6.A01
                java.lang.String r1 = r6.A05
                android.os.Bundle r0 = r6.A02
                if (r2 != 0) goto L_0x0039
                android.os.Bundle r2 = X.AnonymousClass7TE.A0a()
            L_0x0039:
                com.facebook.businessextension.jscalls.RequestAutofillJSBridgeCall r9 = new com.facebook.businessextension.jscalls.RequestAutofillJSBridgeCall
                r15 = r9
                r16 = r4
                r17 = r2
                r18 = r0
                r19 = r3
                r20 = r5
                r21 = r1
                r15.<init>(r16, r17, r18, r19, r20, r21)
                X.4gR r8 = r11.A06
                X.RzL r13 = r8.A00
                X.QP6 r7 = r13.A06
                java.lang.String r0 = "requestAutofillData"
                java.lang.Object r0 = X.Pxh.A0d(r9, r0)
                com.facebook.businessextension.jscalls.RequestAutofillJSBridgeCallData r0 = (com.facebook.businessextension.jscalls.RequestAutofillJSBridgeCallData) r0
                if (r0 != 0) goto L_0x00ac
                r0 = 0
            L_0x005d:
                r7.A05 = r0
                java.util.LinkedHashSet r0 = r9.A01()
                r7.A04 = r0
                android.os.Bundle r1 = r9.A01
                java.lang.String r0 = "instanceKey"
                r12 = 0
                int r0 = r1.getInt(r0, r12)
                java.lang.Integer r6 = java.lang.Integer.valueOf(r0)
                java.util.ArrayList r5 = X.AnonymousClass7TE.A1C()
                java.lang.String r0 = "BrowserLiteIntent.EXTRA_AUTOFILL_ENTRY_JSON_STRINGS"
                r1 = r24
                java.util.ArrayList r0 = r1.getStringArrayList(r0)
                java.util.ArrayList r15 = X.SUR.A05(r0)
                boolean r0 = r15.isEmpty()
                if (r0 != 0) goto L_0x0106
                java.util.ArrayList r1 = X.AnonymousClass7TE.A1C()
                java.util.Iterator r2 = r15.iterator()
            L_0x0090:
                boolean r0 = r2.hasNext()
                if (r0 == 0) goto L_0x00af
                java.lang.Object r0 = r2.next()
                com.facebook.browser.lite.extensions.autofill.model.AutofillData r0 = (com.facebook.browser.lite.extensions.autofill.model.AutofillData) r0
                java.util.Map r0 = r0.A00
                java.util.Map r0 = X.Pxf.A0x(r0)
                X.JwB r0 = X.S8L.A00(r0)
                if (r0 == 0) goto L_0x0090
                r1.add(r0)
                goto L_0x0090
            L_0x00ac:
                java.lang.String r0 = r0.A00
                goto L_0x005d
            L_0x00af:
                X.JwI r0 = r13.A0B
                r0.A00 = r1
                X.1yd r4 = r8.A04
                com.instagram.common.session.UserSession r3 = r4.A00
                X.0Tu r2 = X.0Tu.A05
                r0 = 36885810499814050(0x830b73001802a2, double:3.3900733150951065E-306)
                java.lang.String r0 = X.182.A04(r2, r3, r0)
                X.0qQ.A0A(r0)
                java.lang.Object r15 = r15.get(r12)
                com.facebook.browser.lite.extensions.autofill.model.AutofillData r15 = (com.facebook.browser.lite.extensions.autofill.model.AutofillData) r15
                X.JwM r1 = r13.A0M
                java.lang.Object r0 = r1.A00
                if (r0 != 0) goto L_0x00d5
                java.lang.Object r0 = r1.A02
                if (r0 == 0) goto L_0x00ea
            L_0x00d5:
                r0 = 36885810504729262(0x830b73006302ae, double:3.3900733182035063E-306)
                java.lang.String r1 = X.Pxe.A0w(r2, r3, r0)
                java.lang.String r0 = "control"
                boolean r0 = r1.equals(r0)
                if (r0 != 0) goto L_0x00ea
                com.facebook.browser.lite.extensions.autofill.model.AutofillData r15 = X.SKH.A00(r13, r4)
            L_0x00ea:
                java.lang.String r1 = r7.A05
                X.0qQ.A0B(r15, r12)
                java.util.Map r0 = r15.A00
                java.util.Map r0 = java.util.Collections.unmodifiableMap(r0)
                java.lang.Object r0 = r0.get(r1)
                java.lang.CharSequence r0 = (java.lang.CharSequence) r0
                if (r0 == 0) goto L_0x0106
                int r0 = r0.length()
                if (r0 == 0) goto L_0x0106
                r5.add(r15)
            L_0x0106:
                android.content.Context r13 = r11.A03()
                boolean r0 = r5.isEmpty()
                if (r0 != 0) goto L_0x013c
                if (r13 == 0) goto L_0x013c
                X.QKv r4 = X.Pxe.A0Q(r22)
                if (r4 == 0) goto L_0x013c
                java.lang.Object r3 = r5.get(r12)
                com.facebook.browser.lite.extensions.autofill.model.AutofillData r3 = (com.facebook.browser.lite.extensions.autofill.model.AutofillData) r3
                X.0qQ.A0B(r3, r12)
                java.util.Map r1 = r3.A00
                java.lang.String r0 = "email"
                java.lang.String r2 = X.DbT.A11(r0, r1)
                r1 = 1
                if (r2 == 0) goto L_0x01d0
                java.util.regex.Pattern r0 = android.util.Patterns.EMAIL_ADDRESS
                boolean r0 = X.DbV.A1b(r2, r0)
                if (r0 != r1) goto L_0x01d0
            L_0x0134:
                r4.A0U = r1
                boolean r0 = X.RUO.A00(r13, r3)
                r4.A0V = r0
            L_0x013c:
                android.content.Context r0 = r11.A03()
                if (r0 == 0) goto L_0x0212
                boolean r0 = r5.isEmpty()
                if (r0 != 0) goto L_0x0212
                X.1yd r2 = r8.A04
                java.util.Iterator r3 = r5.iterator()
            L_0x014e:
                boolean r0 = r3.hasNext()
                if (r0 == 0) goto L_0x01ce
                java.lang.Object r0 = r3.next()
                com.facebook.browser.lite.extensions.autofill.model.AutofillData r0 = (com.facebook.browser.lite.extensions.autofill.model.AutofillData) r0
                java.util.Map r1 = r0.A00
                java.lang.String r0 = "email"
                java.lang.Object r0 = r1.get(r0)
                if (r0 != 0) goto L_0x016d
                java.lang.String r0 = "tel"
                java.lang.Object r0 = r1.get(r0)
                if (r0 == 0) goto L_0x014e
            L_0x016d:
                r0 = 1
            L_0x016e:
                com.instagram.common.session.UserSession r3 = r2.A00
                if (r0 == 0) goto L_0x01cb
                X.0Tu r2 = X.0Tu.A05
            L_0x0174:
                r0 = 36322860546337336(0x810b7300172a38, double:3.034061497698918E-306)
                boolean r0 = X.DbY.A1Z(r2, r3, r0)
                if (r0 == 0) goto L_0x0212
                android.content.Context r12 = r11.A03()
                java.util.Iterator r16 = r5.iterator()
            L_0x0187:
                boolean r0 = r16.hasNext()
                if (r0 == 0) goto L_0x01d3
                java.lang.Object r13 = r16.next()
                com.facebook.browser.lite.extensions.autofill.model.AutofillData r13 = (com.facebook.browser.lite.extensions.autofill.model.AutofillData) r13
                java.util.LinkedHashSet r1 = r9.A01()
                if (r1 == 0) goto L_0x0187
                if (r13 == 0) goto L_0x0187
                java.lang.String r4 = "tel"
                boolean r0 = r1.contains(r4)
                if (r0 == 0) goto L_0x0187
                java.lang.String r3 = "email"
                boolean r0 = r1.contains(r3)
                if (r0 == 0) goto L_0x0187
                java.util.Map r2 = r13.A00
                java.lang.String r15 = X.DbT.A11(r3, r2)
                r1 = 1
                if (r15 == 0) goto L_0x01c7
                java.util.regex.Pattern r0 = android.util.Patterns.EMAIL_ADDRESS
                boolean r0 = X.DbV.A1b(r15, r0)
                if (r0 != r1) goto L_0x01c7
            L_0x01bd:
                boolean r0 = X.RUO.A00(r12, r13)
                if (r0 != 0) goto L_0x0187
                r2.remove(r4)
                goto L_0x0187
            L_0x01c7:
                r2.remove(r3)
                goto L_0x01bd
            L_0x01cb:
                X.0Tu r2 = X.0Tu.A06
                goto L_0x0174
            L_0x01ce:
                r0 = 0
                goto L_0x016e
            L_0x01d0:
                r1 = 0
                goto L_0x0134
            L_0x01d3:
                java.util.ListIterator r4 = r5.listIterator()
            L_0x01d7:
                boolean r0 = r4.hasNext()
                if (r0 == 0) goto L_0x0212
                java.lang.Object r0 = r4.next()
                com.facebook.browser.lite.extensions.autofill.model.AutofillData r0 = (com.facebook.browser.lite.extensions.autofill.model.AutofillData) r0
                if (r0 == 0) goto L_0x01d7
                java.util.Map r1 = r0.A00
                boolean r0 = r1.isEmpty()
                if (r0 != 0) goto L_0x020e
                java.util.Set r0 = r1.keySet()
                java.util.TreeSet r3 = new java.util.TreeSet
                r3.<init>(r0)
                java.lang.String r2 = "id"
                java.lang.String r1 = "ent_id"
                java.lang.String r0 = "usage_frequency"
                java.lang.String[] r0 = new java.lang.String[]{r2, r1, r0}
                java.util.List r0 = java.util.Arrays.asList(r0)
                r3.removeAll(r0)
                boolean r0 = X.DbT.A1b(r3)
                if (r0 != 0) goto L_0x01d7
            L_0x020e:
                r4.remove()
                goto L_0x01d7
            L_0x0212:
                boolean r0 = r5.isEmpty()
                if (r0 != 0) goto L_0x021c
                r10.A0A(r11, r9, r6, r5)
                goto L_0x0258
            L_0x021c:
                X.S5W r3 = r11.A05
                java.lang.Integer r2 = X.AnonymousClass05K.A0u
                java.lang.String r1 = r7.A05
                android.os.Bundle r0 = r10.A02()
                r3.A02(r0, r2, r1)
                X.TBI r0 = new X.TBI
                r0.<init>(r10)
                X.SB5.A00(r0)
                X.SJh r3 = r8.A02
                r2 = 772805755(0x2e10147b, float:3.276E-11)
                java.lang.String r1 = "prompt_name"
                java.lang.String r0 = "NO_PROMPTED_AUTOFILL"
                r3.A03(r6, r1, r0, r2)
                r0 = 0
                r3.A01(r6, r0, r2)
                goto L_0x0258
            L_0x0243:
                java.lang.String r0 = "saveAutofillData"
                boolean r0 = r1.equals(r0)
                if (r0 == 0) goto L_0x025d
                boolean r0 = r10.A0W
                if (r0 == 0) goto L_0x0258
                X.TBK r0 = new X.TBK
                r0.<init>(r10)
            L_0x0255:
                X.SB5.A00(r0)
            L_0x0258:
                r0 = -1262187364(0xffffffffb4c48c9c, float:-3.6610152E-7)
                goto L_0x0018
            L_0x025d:
                java.lang.String r0 = "hideAutoFillBar"
                boolean r0 = r1.equals(r0)
                if (r0 == 0) goto L_0x0258
                X.TBI r0 = new X.TBI
                r0.<init>(r10)
                goto L_0x0255
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.browser.lite.extensions.autofill.base.jsbridge.AutofillSharedJSBridgeProxy.AutofillJSBridgeCallback.Czv(android.os.Bundle, com.facebook.browser.lite.ipc.BrowserLiteJSBridgeCall, int):void");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0017 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0018 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private org.json.JSONObject A00(java.lang.String r5) {
        /*
            r4 = this;
            r3 = 0
            org.json.JSONObject r2 = X.C66580MXl.A17(r5)     // Catch:{ JSONException -> 0x0013 }
            java.lang.String r0 = "nonce"
            java.lang.String r1 = r2.optString(r0)     // Catch:{ JSONException -> 0x0014 }
            java.lang.String r0 = r4.A02     // Catch:{ JSONException -> 0x0014 }
            boolean r0 = r1.equals(r0)     // Catch:{ JSONException -> 0x0014 }
            goto L_0x0015
        L_0x0013:
            r2 = r3
        L_0x0014:
            r0 = 0
        L_0x0015:
            if (r0 == 0) goto L_0x0018
            return r2
        L_0x0018:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.browser.lite.extensions.autofill.base.jsbridge.AutofillSharedJSBridgeProxy.A00(java.lang.String):org.json.JSONObject");
    }

    @JavascriptInterface
    public void selectedContactFieldTag(String str) {
    }

    public AutofillSharedJSBridgeProxy(Intent intent, S5W s5w, C270254gR r4, S0F s0f, QLA qla, WeakReference weakReference) {
        this.A01 = "_AutofillExtensions";
        A09(qla);
        this.A08 = weakReference;
        this.A04 = intent;
        this.A05 = s5w;
        this.A06 = r4;
        this.A07 = s0f;
    }

    private void A02(String str) {
        C7580QKv A0Q = Pxe.A0Q(this.A08);
        if (A0Q != null) {
            SUR.A0A(A0Q.A02(), this.A06, this.A05.A00(str, false).A00());
        }
    }

    /* JADX WARNING: type inference failed for: r9v0, types: [com.facebook.businessextension.jscalls.SaveAutofillDataJSBridgeCall, com.facebook.browser.lite.ipc.BrowserLiteJSBridgeCall] */
    public final SaveAutofillDataJSBridgeCall A0B(JSONObject jSONObject) {
        C7580QKv A0Q = Pxe.A0Q(this.A08);
        JSONObject jSONObject2 = jSONObject;
        if (A0Q != null) {
            A0Q.A0h.put(C11429STt.A02(A0Q.A0b.A00.A0P.A03), SUR.A00(jSONObject2));
        }
        Context A032 = A03();
        String A062 = A06();
        Bundle A042 = A04();
        String A072 = A07();
        Bundle A022 = BusinessExtensionJSBridgeCall.A02(jSONObject2);
        JSONObject jSONObject3 = jSONObject2.getJSONObject("raw_autofill_data");
        ImmutableMap immutableMap = null;
        if (jSONObject3 != null) {
            HashMap A1E = AnonymousClass7TE.A1E();
            Iterator<String> keys = jSONObject3.keys();
            while (keys.hasNext()) {
                try {
                    String A18 = AnonymousClass7TE.A18(keys);
                    JSONArray jSONArray = jSONObject3.getJSONArray(A18);
                    ArrayList A1C = AnonymousClass7TE.A1C();
                    int i = 0;
                    while (i < jSONArray.length()) {
                        Object obj = jSONArray.get(i);
                        if (obj instanceof String) {
                            A1C.add(obj);
                            i++;
                        } else {
                            StringBuilder A1A = AnonymousClass7TE.A1A();
                            Pxg.A1R(A1A, "Value was not a String, was ", obj);
                            throw new JSONException(A1A.toString());
                        }
                    }
                    A1E.put(A18, A1C);
                } catch (JSONException e) {
                    SQO.A00("SaveAutofillDataJSBridgeCall", "Failed to parse raw autofill data", e, e);
                }
            }
            immutableMap = ImmutableMap.copyOf(A1E);
        }
        A022.putParcelable("saveAutofillDataData", new SaveAutofillDataJSBridgeCallData(immutableMap));
        if (A042 == null) {
            A042 = AnonymousClass7TE.A0a();
        }
        return new BrowserLiteJSBridgeCall(A032, A042, A022, A062, "saveAutofillData", A072);
    }

    public final void A0C(Bundle bundle, BrowserLiteJSBridgeCall browserLiteJSBridgeCall) {
        C10947S2f s2f;
        String str = browserLiteJSBridgeCall.A04;
        if (str.equals("getNonce")) {
            s2f = BusinessExtensionJSBridgeCall.A03(bundle, this.A03);
        } else if (str.equals("requestAutoFill")) {
            s2f = BusinessExtensionJSBridgeCall.A03(bundle, this.A03);
            A0E(AnonymousClass05K.A01, bundle.getString("callback_result"));
        } else {
            Log.e("AutofillSharedJSBridgeProxy", 002.A0R("No valid callback found for call: ", str));
            s2f = null;
        }
        A08(s2f, browserLiteJSBridgeCall, this.A03);
    }

    public final void A0D(BrowserLiteJSBridgeCall browserLiteJSBridgeCall) {
        BrowserLiteJSBridgeCallback browserLiteJSBridgeCallback = this.A09;
        SRY A002 = SRY.A00();
        SRY.A02(new QJx(A002, browserLiteJSBridgeCall, browserLiteJSBridgeCallback), A002, false);
    }

    @JavascriptInterface
    public void initializeCallbackHandler(String str) {
        String str2 = str;
        try {
            this.A03 = C66580MXl.A17(str2).getString(PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
            A01(str2);
            Integer num = AnonymousClass05K.A00;
            HashMap A1E = AnonymousClass7TE.A1E();
            ArrayList A1C = AnonymousClass7TE.A1C();
            HashMap A1E2 = AnonymousClass7TE.A1E();
            A1E2.put("jsExperimentName", "set_autofill_notify_focus_event_enabled");
            C270254gR r14 = this.A06;
            UserSession userSession = r14.A04.A00;
            0Tu r2 = 0Tu.A06;
            Boolean A0R = AnonymousClass7TF.A0R(r2, userSession, 36322860545616431L);
            0qQ.A0A(A0R);
            A1E2.put("jsExperimentValue", A0R);
            HashMap A1E3 = AnonymousClass7TE.A1E();
            A1E3.put("jsExperimentName", "set_autofill_contact_dropdowns_enabled");
            A1E3.put("jsExperimentValue", AnonymousClass7TE.A0v());
            HashMap A1E4 = AnonymousClass7TE.A1E();
            A1E4.put("jsExperimentName", "use_contact_js_autofill_input_setter_v2");
            Boolean A0R2 = AnonymousClass7TF.A0R(r2, userSession, 36322860545550894L);
            0qQ.A0A(A0R2);
            A1E4.put("jsExperimentValue", A0R2);
            HashMap A1E5 = AnonymousClass7TE.A1E();
            A1E5.put("jsExperimentName", "enable_contact_softkeyboard");
            A1E5.put("jsExperimentValue", AnonymousClass7TE.A0u());
            HashMap A1E6 = AnonymousClass7TE.A1E();
            A1E6.put("jsExperimentName", "enable_autofill_perf_js_qpl");
            0Tu r22 = 0Tu.A05;
            Boolean A0R3 = AnonymousClass7TF.A0R(r22, userSession, 36322860550728303L);
            0qQ.A0A(A0R3);
            A1E6.put("jsExperimentValue", A0R3);
            HashMap A1E7 = AnonymousClass7TE.A1E();
            A1E7.put("jsExperimentName", "autofill_prompts_only_at_field_tapped_enabled_shopify");
            Boolean A0R4 = AnonymousClass7TF.A0R(r22, userSession, 36322860551383671L);
            0qQ.A0A(A0R4);
            A1E7.put("jsExperimentValue", A0R4);
            HashMap A1E8 = AnonymousClass7TE.A1E();
            A1E8.put("jsExperimentName", "autofill_prompts_only_at_field_tapped_enabled_shopify_checkout");
            Boolean A0R5 = AnonymousClass7TF.A0R(r22, userSession, 36322860551449208L);
            0qQ.A0A(A0R5);
            A1E8.put("jsExperimentValue", A0R5);
            A1C.add(A1E2);
            A1C.add(A1E3);
            A1C.add(A1E4);
            A1C.add(A1E5);
            A1C.add(A1E6);
            A1C.add(A1E7);
            A1C.add(A1E8);
            A1E.put("jsExperiments", A1C);
            A0E(num, Pxf.A0f(A1E));
            if (!182.A06(r22, userSession, 36322860547582537L) && DbY.A1Z(r22, userSession, 36322860546665019L)) {
                Integer num2 = AnonymousClass05K.A0C;
                HashMap A1E9 = AnonymousClass7TE.A1E();
                A1E9.put("instanceKey", String.valueOf(r14.A02.A00((Long) null, 772803488, 0)));
                A0E(num2, Pxf.A0f(A1E9));
            }
        } catch (JSONException e) {
            Log.e("AutofillSharedJSBridgeProxy", "Exception parsing initializeCallbackHandler call", e);
        }
    }

    @JavascriptInterface
    public void requestAutoFill(String str) {
        C7580QKv A0Q;
        Bundle bundle;
        String str2;
        C270254gR r11 = this.A06;
        1yd r1 = r11.A04;
        if (!r1.A07(false) && (A0Q = Pxe.A0Q(this.A08)) != null) {
            A02("JS_REQUEST_AUTOFILL");
            C11288SJh sJh = r11.A02;
            int i = 0;
            Integer A002 = sJh.A00((Long) null, 772805755, 0);
            sJh.A03(A002, "prompt_type", "CONTACT_AUTOFILL", 772805755);
            String str3 = str;
            JSONObject A003 = A00(str3);
            if (A003 == null) {
                this.A05.A02(A0Q.A02(), AnonymousClass05K.A01, (String) null);
                sJh.A03(A002, "prompt_name", "NO_PROMPTED_AUTOFILL", 772805755);
                sJh.A01(A002, (Long) null, 772805755);
                S0F s0f = this.A07;
                String A0g = 002.A0g(str3, ";\n nonce: ", this.A02);
                0qQ.A0B(A0g, 0);
                s0f.A00.AEf(A0g, 772816852).report();
                return;
            }
            if (this.A01 == null) {
                this.A01 = C51968G9o.A0u();
                RRP A004 = this.A05.A00("FIRST_FORM_INTERACTION", false);
                A004.A0A = r11.A00.A05.A06;
                try {
                    JSONArray jSONArray = new JSONArray(A003.getString("allFields"));
                    ArrayList A1C = AnonymousClass7TE.A1C();
                    int length = jSONArray.length();
                    for (int i2 = 0; i2 < length; i2 = Pxg.A09(A1C, jSONArray, i2)) {
                    }
                    01V.A1C(A1C);
                    str2 = TextUtils.join(", ", A1C);
                } catch (JSONException e) {
                    SQO.A00("AutofillSharedUtil", "Failed to parseAllFields", e, e);
                    str2 = null;
                }
                A004.A06 = str2;
                A004.A0F = SUR.A03(A003);
                A004.A0G = SUR.A04(A003);
                A004.A08 = A07();
                SUR.A0B(r11, A0Q, A004);
                A0Q.A0I = this.A01;
                0qQ.A0A(AnonymousClass7TF.A0R(0Tu.A05, r1.A00, 36322860549286495L));
            }
            Intent intent = this.A04;
            if (intent != null && intent.getBooleanExtra("BrowserLiteIntent.EXTRA_AUTOFILL_DEBUG_KEY", false)) {
                Toast.makeText(A03(), "requestAutofill", 0).show();
            }
            C10860RzL rzL = r11.A00;
            0qQ.A0B(rzL, 0);
            if (!AnonymousClass7TF.A1W(rzL.A0J.A03, RF6.OPT_IN)) {
                this.A05.A02(A0Q.A02(), AnonymousClass05K.A0C, SUR.A04(A003));
                sJh.A03(A002, "prompt_name", "NO_PROMPTED_AUTOFILL", 772805755);
                sJh.A01(A002, (Long) null, 772805755);
                return;
            }
            if (A04() == null) {
                bundle = AnonymousClass7TE.A0a();
            } else {
                bundle = (Bundle) A04().clone();
            }
            if (A002 != null) {
                i = A002.intValue();
            }
            bundle.putInt("instanceKey", i);
            A0D(new BrowserLiteJSBridgeCall(A03(), bundle, RequestAutofillJSBridgeCall.A00(A003), A06(), "requestAutoFill", A07()));
        }
    }

    @JavascriptInterface
    public void saveAutofillData(String str) {
        long currentTimeMillis;
        Bundle bundle;
        C7580QKv A0Q = Pxe.A0Q(this.A08);
        if (A0Q != null) {
            A02("JS_SAVE_AUTOFILL_DATA");
            C270254gR r7 = this.A06;
            C11288SJh sJh = r7.A02;
            Integer A002 = sJh.A00((Long) null, 772805755, 0);
            sJh.A03(A002, "prompt_type", "SAVE_CONTACT_AUTOFILL", 772805755);
            JSONObject A003 = A00(str);
            if (A003 == null) {
                sJh.A03(A002, "prompt_name", "NO_PROMPTED_AUTOFILL", 772805755);
                sJh.A01(A002, (Long) null, 772805755);
                return;
            }
            Long l = this.A01;
            if (l == null) {
                currentTimeMillis = 0;
            } else {
                currentTimeMillis = System.currentTimeMillis() - l.longValue();
            }
            Long valueOf = Long.valueOf(currentTimeMillis);
            RRP A004 = this.A05.A00("FORM_COMPLETION", false);
            A004.A02 = valueOf.longValue();
            int i = this.A00 + 1;
            this.A00 = i;
            A004.A00 = i;
            C10860RzL rzL = r7.A00;
            A004.A0A = rzL.A05.A06;
            A004.A08 = A07();
            A004.A06 = SUR.A03(A003);
            A004.A0F = SUR.A03(A003);
            A004.A0G = SUR.A04(A003);
            SUR.A0B(r7, A0Q, A004);
            Intent intent = this.A04;
            if (intent != null && intent.getBooleanExtra("BrowserLiteIntent.EXTRA_AUTOFILL_DEBUG_KEY", false)) {
                Toast.makeText(A03(), "saveAutofillData", 0).show();
            }
            if (!AnonymousClass7TF.A1W(rzL.A0J.A03, RF6.OPT_IN)) {
                sJh.A03(A002, "prompt_name", "NO_PROMPTED_AUTOFILL", 772805755);
                sJh.A01(A002, (Long) null, 772805755);
                return;
            }
            AutofillData A005 = SUR.A00(A003);
            A0Q.A0C = A005;
            if (A003.has("autofillFields")) {
                try {
                    bundle = RequestAutofillJSBridgeCall.A00(A003);
                } catch (JSONException unused) {
                    bundle = Bundle.EMPTY;
                }
            } else {
                bundle = Bundle.EMPTY;
            }
            A0Q.A08(bundle, this, S8K.A00(r7.A04, A005, SUR.A03(A003), false), A002);
        }
    }

    private void A01(String str) {
        if (A03() != null) {
            this.A02 = AnonymousClass7TF.A0c();
            Context A032 = A03();
            String A062 = A06();
            Bundle A042 = A04();
            String A072 = A07();
            Bundle A022 = BusinessExtensionJSBridgeCall.A02(C66580MXl.A17(str));
            if (A042 == null) {
                A042 = AnonymousClass7TE.A0a();
            }
            BrowserLiteJSBridgeCall browserLiteJSBridgeCall = new BrowserLiteJSBridgeCall(A032, A042, A022, A062, "getNonce", A072);
            String str2 = (String) Pxh.A0d(browserLiteJSBridgeCall, "callbackID");
            String str3 = this.A02;
            JSONObject A11 = DbS.A11();
            try {
                A11.put("nonce", str3);
            } catch (JSONException e) {
                SQO.A00("GetNonceJSBridgeCall", "Failed to set nonce result", e, e);
            }
            A0C(BusinessExtensionJSBridgeCall.A01(str2, A11), browserLiteJSBridgeCall);
            C7580QKv A0Q = Pxe.A0Q(this.A08);
            if (A0Q != null) {
                this.A01 = null;
                this.A00 = 0;
                this.A06.A00.A05.A06 = AnonymousClass7TF.A0c();
                A0Q.A0O = null;
                A0Q.A0E = null;
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v8, types: [X.QcV, android.view.View] */
    public final void A0E(Integer num, String str) {
        String str2;
        QLA A052;
        try {
            Bundle A012 = BusinessExtensionJSBridgeCall.A01((String) null, C66580MXl.A17(str));
            String str3 = this.A03;
            String string = A012.getString("callback_result");
            switch (num.intValue()) {
                case 0:
                    str2 = "setJsExperimentValues";
                    break;
                case 1:
                    str2 = "setContactAutofillValueInAllFramesForIABIOS";
                    break;
                default:
                    str2 = "sendJsPing";
                    break;
            }
            C10947S2f s2f = new C10947S2f(str3, "", string, str2, true);
            String str4 = this.A03;
            0qQ.A0B(str4, 0);
            if (C10062Rlz.A00.contains(str4) && (A052 = A05()) != null) {
                ((SystemWebView) A052).A04.post(new TFS(s2f, A052));
            }
        } catch (JSONException unused) {
        }
    }

    @JavascriptInterface
    public void autofillAppliedStatusesV2(String str) {
        JSONObject A002 = A00(str);
        if (A002 != null) {
            HashMap A1E = AnonymousClass7TE.A1E();
            HashMap A1E2 = AnonymousClass7TE.A1E();
            A1E2.put("DETECTION_SOURCE", "jsSdk");
            JSONArray jSONArray = A002.getJSONArray("autofillAppliedStatuses");
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                A1E2.put(jSONObject.getString("autoCompleteTag"), jSONObject.getString("autofillStatus"));
            }
            A1E.put("autofillAppliedStatuses", Pxf.A0f(A1E2));
            S5W s5w = this.A05;
            C7580QKv A0Q = Pxe.A0Q(s5w.A00);
            if (A0Q != null) {
                RRP A003 = s5w.A00("AUTOFILL_APPLY_COMPLETED", false);
                A003.A02(A1E);
                A003.A06 = A0Q.A0L;
                A003.A07 = A0Q.A0M;
                A003.A0F = A0Q.A0N;
                SRY.A00().A07((Bundle) null, A003.A00().A01());
            }
        }
    }

    @JavascriptInterface
    public void hideAutoFillBar(String str) {
        JSONObject A002 = A00(str);
        if (A002 != null) {
            Context A032 = A03();
            String A062 = A06();
            Bundle A042 = A04();
            String A072 = A07();
            Bundle A022 = BusinessExtensionJSBridgeCall.A02(A002);
            if (A042 == null) {
                A042 = AnonymousClass7TE.A0a();
            }
            A0D(new BrowserLiteJSBridgeCall(A032, A042, A022, A062, "hideAutoFillBar", A072));
        }
    }

    @JavascriptInterface
    public void jsPing(String str) {
        JSONObject A002 = A00(str);
        if (A002 != null) {
            this.A06.A02.A04(A002);
        }
    }

    @JavascriptInterface
    public void jsQPL(String str) {
        JSONObject A002 = A00(str);
        if (A002 != null) {
            this.A06.A02.A04(A002);
        }
    }

    @JavascriptInterface
    public void notifyAutofillFocusoutEventV2(String str) {
        JSONObject A002 = A00(str);
        if (A002 != null) {
            String optString = A002.optString("action");
            HashMap A0f = Dba.A0f(A002.optString("fieldName"), A002.optString("fieldNameScenario"));
            String str2 = "FILL_FIELD_END";
            if (!optString.equals(str2)) {
                str2 = "EDIT_FIELD_END";
                if (!optString.equals(str2)) {
                    throw AnonymousClass7TE.A0w("Notify focus out event action is not supported");
                }
            }
            RRP A003 = this.A05.A00(str2, false);
            A003.A02(A0f);
            SRY.A00().A07((Bundle) null, A003.A00().A01());
        }
    }

    @JavascriptInterface
    public void getNonce(String str) {
        A01(str);
    }
}
