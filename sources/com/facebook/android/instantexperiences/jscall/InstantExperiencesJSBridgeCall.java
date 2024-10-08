package com.facebook.android.instantexperiences.jscall;

import X.0KC;
import X.0cp;
import X.AnonymousClass5He;
import X.AnonymousClass7TE;
import X.C41847B3o;
import X.C8910RFd;
import X.JTO;
import X.RKR;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.facebook.android.instantexperiences.autofill.save.SaveAutofillDataJSBridgeCall;
import com.facebook.android.instantexperiences.core.InstantExperiencesParameters;
import com.facebook.android.instantexperiences.payment.CanMakePaymentJSBridgeCall;
import com.facebook.android.instantexperiences.payment.CanShowPaymentModuleJSBridgeCall;
import com.facebook.android.instantexperiences.payment.PaymentsCheckoutJSBridgeCall;
import com.facebook.android.instantexperiences.payment.chargerequest.PaymentsChargeRequestCall;
import com.facebook.common.stringformat.StringFormatUtil;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public abstract class InstantExperiencesJSBridgeCall implements Parcelable {
    public InstantExperiencesCallResult A00;
    public final InstantExperiencesParameters A01;
    public final String A02;
    public final Bundle A03;
    public final String A04;
    public final String A05;

    public final int describeContents() {
        return 0;
    }

    public final Object A00(String str) {
        Bundle bundle = this.A03;
        if (!bundle.containsKey(str)) {
            return null;
        }
        return bundle.get(str);
    }

    public final String A01() {
        if (this instanceof PaymentsChargeRequestCall) {
            return "paymentsChargeRequst";
        }
        if (this instanceof PaymentsCheckoutJSBridgeCall) {
            return "paymentsCheckout";
        }
        if (this instanceof CanShowPaymentModuleJSBridgeCall) {
            return "canShowPaymentModule";
        }
        if (this instanceof CanMakePaymentJSBridgeCall) {
            return "canMakePayment";
        }
        if (this instanceof SaveAutofillDataJSBridgeCall) {
            return "saveAutofillData";
        }
        return "requestAutoFill";
    }

    public void A02() {
        Uri A032;
        String str = this.A02;
        if (!AnonymousClass5He.A00(str)) {
            Uri parse = Uri.parse(str);
            if (parse == null || parse.getHost() == null || parse.getScheme() == null) {
                throw new RKR(C8910RFd.URL_NOT_ALLOWED, (String) null);
            } else if (!parse.getScheme().equalsIgnoreCase("https") || !(parse.getPort() == 443 || parse.getPort() == -1)) {
                throw new RKR(C8910RFd.URL_NOT_ALLOWED, (String) null);
            } else if (TextUtils.isEmpty(str) || (A032 = 0cp.A03(str)) == null || A032.getHost() == null || A032.getScheme() == null) {
                throw new RKR(C8910RFd.URL_NOT_ALLOWED, "This url cannot make this call");
            }
        } else {
            throw new RKR(C8910RFd.URL_NOT_ALLOWED, (String) null);
        }
    }

    public final void A03(InstantExperiencesCallResult instantExperiencesCallResult) {
        this.A00 = instantExperiencesCallResult;
        instantExperiencesCallResult.A00 = this.A04;
        instantExperiencesCallResult.A01 = this.A05;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A01, i);
        parcel.writeString(this.A04);
        parcel.writeString(this.A05);
        parcel.writeString(this.A02);
        parcel.writeBundle(this.A03);
        parcel.writeParcelable(this.A00, i);
    }

    public InstantExperiencesJSBridgeCall(Parcel parcel) {
        this.A01 = (InstantExperiencesParameters) C41847B3o.A03(parcel, InstantExperiencesParameters.class);
        this.A04 = parcel.readString();
        this.A05 = parcel.readString();
        this.A02 = parcel.readString();
        this.A03 = parcel.readBundle();
        this.A00 = (InstantExperiencesCallResult) C41847B3o.A03(parcel, InstantExperiencesCallResult.class);
    }

    public InstantExperiencesJSBridgeCall(InstantExperiencesParameters instantExperiencesParameters, String str, String str2, JSONObject jSONObject) {
        this.A05 = str;
        this.A01 = instantExperiencesParameters;
        this.A02 = str2;
        this.A04 = jSONObject.getString("callbackID");
        Bundle A0a = AnonymousClass7TE.A0a();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String A18 = AnonymousClass7TE.A18(keys);
            try {
                Object obj = jSONObject.get(A18);
                if (obj != null) {
                    if (obj instanceof String) {
                        A0a.putString(A18, (String) obj);
                    } else if (obj instanceof Integer) {
                        A0a.putInt(A18, AnonymousClass7TE.A0M(obj));
                    } else if (obj instanceof Double) {
                        A0a.putDouble(A18, JTO.A00(obj));
                    } else if (obj instanceof Long) {
                        A0a.putLong(A18, AnonymousClass7TE.A0R(obj));
                    } else if (obj instanceof Boolean) {
                        A0a.putBoolean(A18, AnonymousClass7TE.A1a(obj));
                    } else if (obj instanceof JSONObject) {
                        A0a.putString(A18, obj.toString());
                    } else if (obj instanceof JSONArray) {
                        A0a.putString(A18, obj.toString());
                    } else if (obj == JSONObject.NULL) {
                        A0a.putString(A18, (String) null);
                    }
                }
            } catch (JSONException e) {
                0KC.A0F("InstantExperiencesJSBridgeCall", StringFormatUtil.formatStrLocaleSafe("JSONObject.keys() provided a problematic key : %s", A18), e);
            }
        }
        this.A03 = A0a;
    }
}
