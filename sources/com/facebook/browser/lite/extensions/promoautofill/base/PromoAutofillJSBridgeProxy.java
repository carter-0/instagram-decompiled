package com.facebook.browser.lite.extensions.promoautofill.base;

import X.002;
import X.0Aj;
import X.0KC;
import X.0Tu;
import X.0Yh;
import X.0q1;
import X.0qQ;
import X.182;
import X.AnonymousClass0kN;
import X.AnonymousClass15Q;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C10947S2f;
import X.C51965G9l;
import X.C51970G9q;
import X.C51972G9s;
import X.C66580MXl;
import X.C7579QKu;
import X.C9223RUa;
import X.DbS;
import X.DbV;
import X.DbW;
import X.Pxe;
import X.Pxf;
import X.Pxh;
import X.QLA;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.webkit.JavascriptInterface;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.browser.lite.bridge.BrowserLiteJSBridgeProxy;
import com.facebook.browser.lite.ipc.BrowserLiteJSBridgeCall;
import com.facebook.businessextension.jscalls.BusinessExtensionJSBridgeCall;
import com.facebook.businessextension.jscalls.promoautofill.GetPromoExtensionNonceJSBridgeCall;
import com.facebook.businessextension.jscalls.promoautofill.RequestPromoExtensionPromoCodeAutofillJSBridgeCall;
import com.facebook.iabadscontext.IgPromoAdsExtension;
import com.facebook.iabadscontext.IgPromoAdsPromoCode;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import com.instagram.realtimeclient.RealtimeConstants;
import java.nio.charset.Charset;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class PromoAutofillJSBridgeProxy extends BrowserLiteJSBridgeProxy {
    public static final String A05;
    public String A00 = "";
    public String A01 = "";
    public final Intent A02;
    public final C7579QKu A03;
    public final QLA A04;

    @JavascriptInterface
    public final void getPromoExtensionNonce(String str) {
        String A07;
        byte[] bytes;
        String str2 = str;
        0qQ.A0B(str2, 0);
        Context A032 = A03();
        if (A032 != null && (A07 = A07()) != null) {
            String str3 = GetPromoExtensionNonceJSBridgeCall.A00;
            String A06 = A06();
            Bundle A042 = A04();
            Bundle A022 = BusinessExtensionJSBridgeCall.A02(C66580MXl.A17(str2));
            if (A042 == null) {
                A042 = AnonymousClass7TE.A0a();
            }
            BrowserLiteJSBridgeCall browserLiteJSBridgeCall = new BrowserLiteJSBridgeCall(A032, A042, A022, A06, "getPromoExtensionNonce", A07);
            this.A00 = C51972G9s.A0n();
            String str4 = (String) Pxh.A0d(browserLiteJSBridgeCall, "callbackID");
            String str5 = this.A00;
            C7579QKu qKu = this.A03;
            IgPromoAdsExtension igPromoAdsExtension = qKu.A01;
            boolean z = igPromoAdsExtension.A03;
            StringBuilder A1A = AnonymousClass7TE.A1A();
            A1A.append("\n        {\n          \"autofill\": {\n            \"enable\": ");
            A1A.append(z);
            A1A.append(",\n            \"shopifyBasedAutoApply\": {\n              \"promoCodes\": [\n                \"");
            A1A.append(qKu.A01());
            String A0l = AnonymousClass7TF.A0l("\"\n              ],\n              \"method\": \"URL\"\n            }\n          },\n          \"tasks\": {}\n        }\n        ", A1A);
            StringBuilder A1A2 = AnonymousClass7TE.A1A();
            A1A2.append("\n        {\n          \"logging\": {\n            \"context\": {\n            \"iab_session_id\": \"");
            A1A2.append(qKu.A04);
            A1A2.append("\",\n            \"offer_id\": \"");
            A1A2.append(((IgPromoAdsPromoCode) igPromoAdsExtension.A02.get(0)).A00);
            A1A2.append("\",\n            \"ad_id\": \"");
            A1A2.append(qKu.A03);
            A1A2.append("\",\n            \"user_id\": \"");
            UserSession userSession = qKu.A02;
            A1A2.append(userSession.A06);
            A1A2.append("\",\n            \"tracking_token\": \"");
            A1A2.append(qKu.A05);
            A1A2.append("\",\n            \"has_promo_experience\": true\n            }\n          },\n          \"autofill\": {\n            \"enable\": ");
            A1A2.append(z);
            A1A2.append(",\n            \"shopifyBasedAutoApply\": {\n              \"promoCodes\": [\n                \"");
            A1A2.append(qKu.A01());
            String A0l2 = AnonymousClass7TF.A0l("\"\n              ],\n              \"method\": \"URL\",\n              \"supported3rdPartyCheckouts\": [\"SHOP_PAY\"]\n            }\n          },\n          \"tasks\": {\n            \"extract_ocp\": [\n              {\n                \"name\": \"EXTRACT_OCP\"\n              }\n            ]\n          }\n        }\n        ", A1A2);
            boolean A062 = 182.A06(0Tu.A05, userSession, 36330046025122215L);
            Charset charset = AnonymousClass15Q.A05;
            if (A062) {
                bytes = A0l2.getBytes(charset);
            } else {
                bytes = A0l.getBytes(charset);
            }
            0qQ.A07(bytes);
            String A0p = Pxf.A0p(bytes, 2);
            0qQ.A0B(str5, 1);
            JSONObject A11 = DbS.A11();
            try {
                A11.put("nonce", str5);
                A11.put("isDebug", false);
                A11.put("performAutofillAction", z);
                A11.put("configsInJSON", A0p);
            } catch (JSONException e) {
                0KC.A0L(GetPromoExtensionNonceJSBridgeCall.A00, "Failed to set RETURN_PARM result", e, new Object[]{e});
            }
            A00(BusinessExtensionJSBridgeCall.A01(str4, A11), browserLiteJSBridgeCall);
        }
    }

    @JavascriptInterface
    public final void initializePromoExtensionCallbackHandler(String str) {
        0qQ.A0B(str, 0);
        try {
            this.A01 = Pxe.A0y(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, C66580MXl.A17(str));
        } catch (JSONException e) {
            0KC.A0F(A05, "PromoAutofillJSBridgeProxy - Exception parsing initializePromoExtensionCallbackHandler call", e);
        }
    }

    @JavascriptInterface
    public final void requestPromoExtensionPromoCodeAutofill(String str) {
        Context A032;
        String A07;
        0qQ.A0B(str, 0);
        try {
            if (0qQ.A0K(C66580MXl.A17(str).optString("nonce"), this.A00) && (A032 = A03()) != null && (A07 = A07()) != null) {
                String str2 = RequestPromoExtensionPromoCodeAutofillJSBridgeCall.A00;
                String A06 = A06();
                Bundle A042 = A04();
                Bundle A022 = BusinessExtensionJSBridgeCall.A02(C66580MXl.A17(str));
                if (A042 == null) {
                    A042 = AnonymousClass7TE.A0a();
                }
                BrowserLiteJSBridgeCall browserLiteJSBridgeCall = new BrowserLiteJSBridgeCall(A032, A042, A022, A06, "requestPromoExtensionPromoCodeAutofill", A07);
                String str3 = (String) Pxh.A0d(browserLiteJSBridgeCall, "callbackID");
                String A012 = this.A03.A01();
                0qQ.A0B(A012, 1);
                JSONObject A11 = DbS.A11();
                try {
                    A11.put("promoCode", A012);
                } catch (JSONException e) {
                    0KC.A0F(RequestPromoExtensionPromoCodeAutofillJSBridgeCall.A00, "Failed to set RETURN_PARM result", e);
                }
                A00(BusinessExtensionJSBridgeCall.A01(str3, A11), browserLiteJSBridgeCall);
            }
        } catch (JSONException e2) {
            0KC.A0F(A05, "PromoAutofillJSBridgeProxy - Request Param is NOT valid - ", e2);
        }
    }

    /* JADX WARNING: type inference failed for: r0v11, types: [X.0iw, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v26, types: [X.0iw, java.lang.Object] */
    @JavascriptInterface
    public final void sendPromoExtensionPromoCodeAutofillResult(String str) {
        String A012;
        String str2;
        0Aj A0e;
        Long l;
        String str3;
        String str4;
        Long l2;
        0qQ.A0B(str, 0);
        JSONObject A17 = C66580MXl.A17(str);
        C7579QKu qKu = this.A03;
        LinkedHashMap A002 = C9223RUa.A00(A17);
        Object obj = A002.get("result");
        if (0qQ.A0K(obj, RealtimeConstants.SEND_FAIL)) {
            Context context = qKu.A00;
            if (context != null) {
                str4 = DbW.A0h(context, qKu.A01(), 2131970095);
            } else {
                str4 = null;
            }
            C7579QKu.A00(qKu, str4);
            UserSession userSession = qKu.A02;
            String str5 = qKu.A03;
            String str6 = ((IgPromoAdsPromoCode) qKu.A01.A02.get(0)).A00;
            String A013 = qKu.A01();
            A012 = String.valueOf(A002.get(DevServerEntity.COLUMN_DESCRIPTION));
            str2 = qKu.A05;
            C51972G9s.A1D(A013, A012);
            A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(new Object(), userSession), "ig_promo_ads_autofill_fail");
            if (A0e.isSampled()) {
                C51970G9q.A17(A0e, Long.parseLong(str5));
                if (str6 != null) {
                    l2 = DbV.A0q(str6);
                } else {
                    l2 = null;
                }
                A0e.A9F("offer_id", l2);
                A0e.AAJ("promo_code", A013);
                str3 = "autofill_description";
            } else {
                return;
            }
        } else if (0qQ.A0K(obj, RealtimeConstants.SEND_SUCCESS)) {
            UserSession userSession2 = qKu.A02;
            String str7 = qKu.A03;
            String str8 = ((IgPromoAdsPromoCode) qKu.A01.A02.get(0)).A00;
            A012 = qKu.A01();
            str2 = qKu.A05;
            0qQ.A0B(A012, 3);
            A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(new Object(), userSession2), "autofill_success");
            if (A0e.isSampled()) {
                C51970G9q.A17(A0e, Long.parseLong(str7));
                if (str8 != null) {
                    l = DbV.A0q(str8);
                } else {
                    l = null;
                }
                A0e.A9F("offer_id", l);
                str3 = "promo_code";
            } else {
                return;
            }
        } else {
            return;
        }
        A0e.AAJ(str3, A012);
        C51965G9l.A1L(A0e, str2);
        A0e.Cgf();
    }

    static {
        Map map = 0Yh.A03;
        String A012 = 0q1.A01(PromoAutofillJSBridgeProxy.class);
        if (A012 == null) {
            A012 = "PromoAutofillJSBridgeProxy";
        }
        A05 = A012;
    }

    public PromoAutofillJSBridgeProxy(Intent intent, C7579QKu qKu, QLA qla) {
        this.A01 = "_PromoExtensions";
        this.A04 = qla;
        this.A03 = qKu;
        this.A02 = intent;
        A09(qla);
    }

    private final void A00(Bundle bundle, BrowserLiteJSBridgeCall browserLiteJSBridgeCall) {
        C10947S2f A032;
        String str = browserLiteJSBridgeCall.A04;
        if (0qQ.A0K(str, "getPromoExtensionNonce") || 0qQ.A0K(str, "requestPromoExtensionPromoCodeAutofill")) {
            A032 = BusinessExtensionJSBridgeCall.A03(bundle, this.A01);
        } else {
            0KC.A0C(A05, 002.A0S("PromoAutofillJSBridgeProxy - No valid callback found for call: ", str, ' '));
            A032 = null;
        }
        A08(A032, browserLiteJSBridgeCall, this.A01);
    }
}
