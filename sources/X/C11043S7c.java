package X;

import android.webkit.JavascriptInterface;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.android.instantexperiences.jscall.InstantExperiencesJSBridgeCall;
import com.instagram.business.instantexperiences.IGInstantExperiencesParameters;
import com.instagram.realtimeclient.RealtimeConstants;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.S7c  reason: case insensitive filesystem */
public final class C11043S7c {
    public String A00;
    public String A01;
    public final IGInstantExperiencesParameters A02;
    public final C11241SHb A03;

    public C11043S7c(Q93 q93, IGInstantExperiencesParameters iGInstantExperiencesParameters, C11241SHb sHb) {
        0qQ.A0B(iGInstantExperiencesParameters, 2);
        this.A03 = sHb;
        this.A02 = iGInstantExperiencesParameters;
        q93.A05.add(new C12023Skk(this));
    }

    @JavascriptInterface
    public final void canMakePayment(String str) {
        try {
            C11241SHb sHb = this.A03;
            String str2 = this.A01;
            0qQ.A0A(str2);
            IGInstantExperiencesParameters iGInstantExperiencesParameters = this.A02;
            String str3 = this.A00;
            if (str3 == null) {
                0qQ.A0F("hostUrl");
                throw AnonymousClass00P.createAndThrow();
            } else {
                sHb.A01(new InstantExperiencesJSBridgeCall(iGInstantExperiencesParameters, str2, str3, C66580MXl.A17(str)));
            }
        } catch (JSONException e) {
            0KC.A0F("InstantExperiencesJSBridge", "Failed to canMakePayment", e);
            throw e;
        }
    }

    @JavascriptInterface
    public final void paymentsCheckout(String str) {
        try {
            C11241SHb sHb = this.A03;
            String str2 = this.A01;
            IGInstantExperiencesParameters iGInstantExperiencesParameters = this.A02;
            String str3 = this.A00;
            if (str3 == null) {
                0qQ.A0F("hostUrl");
                throw AnonymousClass00P.createAndThrow();
            } else {
                sHb.A01(new InstantExperiencesJSBridgeCall(iGInstantExperiencesParameters, str2, str3, C66580MXl.A17(str)));
            }
        } catch (JSONException e) {
            0KC.A0F("InstantExperiencesJSBridge", "Failed to paymentsCheckout", e);
            throw e;
        }
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [com.facebook.android.instantexperiences.payment.chargerequest.PaymentsChargeRequestCall, com.facebook.android.instantexperiences.jscall.InstantExperiencesJSBridgeCall] */
    @JavascriptInterface
    public final void paymentsCheckoutChargeRequestErrorReturn(String str) {
        try {
            C11241SHb sHb = this.A03;
            String str2 = this.A01;
            0qQ.A0A(str2);
            IGInstantExperiencesParameters iGInstantExperiencesParameters = this.A02;
            String str3 = this.A00;
            if (str3 == null) {
                0qQ.A0F("hostUrl");
                throw AnonymousClass00P.createAndThrow();
            }
            ? instantExperiencesJSBridgeCall = new InstantExperiencesJSBridgeCall(iGInstantExperiencesParameters, str2, str3, C66580MXl.A17(str));
            instantExperiencesJSBridgeCall.A00 = "error";
            sHb.A01(instantExperiencesJSBridgeCall);
        } catch (JSONException e) {
            0KC.A0F("InstantExperiencesJSBridge", "Failed to paymentsCheckoutChargeRequestErrorReturn", e);
            throw e;
        }
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [com.facebook.android.instantexperiences.payment.chargerequest.PaymentsChargeRequestCall, com.facebook.android.instantexperiences.jscall.InstantExperiencesJSBridgeCall] */
    @JavascriptInterface
    public final void paymentsCheckoutChargeRequestSuccessReturn(String str) {
        try {
            C11241SHb sHb = this.A03;
            String str2 = this.A01;
            0qQ.A0A(str2);
            IGInstantExperiencesParameters iGInstantExperiencesParameters = this.A02;
            String str3 = this.A00;
            if (str3 == null) {
                0qQ.A0F("hostUrl");
                throw AnonymousClass00P.createAndThrow();
            }
            ? instantExperiencesJSBridgeCall = new InstantExperiencesJSBridgeCall(iGInstantExperiencesParameters, str2, str3, C66580MXl.A17(str));
            instantExperiencesJSBridgeCall.A00 = RealtimeConstants.SEND_SUCCESS;
            sHb.A01(instantExperiencesJSBridgeCall);
        } catch (JSONException e) {
            0KC.A0F("InstantExperiencesJSBridge", "Failed to paymentsCheckoutChargeRequestSuccessReturn", e);
            throw e;
        }
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [com.facebook.android.instantexperiences.payment.chargerequest.PaymentsChargeRequestCall, com.facebook.android.instantexperiences.jscall.InstantExperiencesJSBridgeCall] */
    @JavascriptInterface
    public final void paymentsCheckoutChargeRequestUnknownReturn(String str) {
        try {
            C11241SHb sHb = this.A03;
            String str2 = this.A01;
            0qQ.A0A(str2);
            IGInstantExperiencesParameters iGInstantExperiencesParameters = this.A02;
            String str3 = this.A00;
            if (str3 == null) {
                0qQ.A0F("hostUrl");
                throw AnonymousClass00P.createAndThrow();
            }
            ? instantExperiencesJSBridgeCall = new InstantExperiencesJSBridgeCall(iGInstantExperiencesParameters, str2, str3, C66580MXl.A17(str));
            instantExperiencesJSBridgeCall.A00 = "unknown";
            sHb.A01(instantExperiencesJSBridgeCall);
        } catch (JSONException e) {
            0KC.A0F("InstantExperiencesJSBridge", "Failed to paymentsCheckoutChargeRequestUnknownReturn", e);
            throw e;
        }
    }

    @JavascriptInterface
    public final void requestAutoFill(String str) {
        try {
            C11241SHb sHb = this.A03;
            String str2 = this.A01;
            0qQ.A0A(str2);
            IGInstantExperiencesParameters iGInstantExperiencesParameters = this.A02;
            String str3 = this.A00;
            if (str3 == null) {
                0qQ.A0F("hostUrl");
                throw AnonymousClass00P.createAndThrow();
            }
            JSONObject A17 = C66580MXl.A17(str);
            0qQ.A0B(str2, 1);
            sHb.A01(new InstantExperiencesJSBridgeCall(iGInstantExperiencesParameters, str2, str3, A17));
        } catch (JSONException e) {
            0KC.A0F("InstantExperiencesJSBridge", "Failed to requestAutoFill", e);
        }
    }

    @JavascriptInterface
    public final void saveAutofillData(String str) {
        try {
            C11241SHb sHb = this.A03;
            String str2 = this.A01;
            0qQ.A0A(str2);
            IGInstantExperiencesParameters iGInstantExperiencesParameters = this.A02;
            String str3 = this.A00;
            if (str3 == null) {
                0qQ.A0F("hostUrl");
                throw AnonymousClass00P.createAndThrow();
            }
            JSONObject A17 = C66580MXl.A17(str);
            0qQ.A0B(str2, 1);
            sHb.A01(new InstantExperiencesJSBridgeCall(iGInstantExperiencesParameters, str2, str3, A17));
        } catch (JSONException e) {
            0KC.A0F("InstantExperiencesJSBridge", "Failed to saveAutofillData", e);
        }
    }

    @JavascriptInterface
    public final void initializeCallbackHandler(String str) {
        try {
            this.A01 = C66580MXl.A17(str).getString(PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
        } catch (JSONException e) {
            0KC.A0F("InstantExperiencesJSBridge", "Failed to initializeCallbackHandler", e);
        }
    }
}
