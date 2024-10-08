package X;

import android.text.TextUtils;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public final class S74 {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final List A04;
    public final JSONObject A05;
    public final String A06;
    public final String A07;
    public final List A08;

    public final C10768Rxm A00() {
        List list = this.A08;
        if (list == null || list.isEmpty()) {
            return null;
        }
        return (C10768Rxm) AnonymousClass7TE.A13(list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof S74)) {
            return false;
        }
        return TextUtils.equals(this.A06, ((S74) obj).A06);
    }

    public final int hashCode() {
        return this.A06.hashCode();
    }

    public final String toString() {
        List list = this.A04;
        String obj = this.A05.toString();
        String valueOf = String.valueOf(list);
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("ProductDetails{jsonString='");
        A1A.append(this.A06);
        A1A.append("', parsedJson=");
        A1A.append(obj);
        A1A.append(", productId='");
        A1A.append(this.A00);
        A1A.append("', productType='");
        A1A.append(this.A01);
        A1A.append("', title='");
        A1A.append(this.A07);
        A1A.append("', productDetailsToken='");
        A1A.append(this.A02);
        A1A.append("', subscriptionOfferDetails=");
        return C66584MXp.A0a(valueOf, A1A);
    }

    public S74(String str) {
        this.A06 = str;
        JSONObject A17 = C66580MXl.A17(str);
        this.A05 = A17;
        String optString = A17.optString("productId");
        this.A00 = optString;
        String optString2 = A17.optString(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
        this.A01 = optString2;
        if (TextUtils.isEmpty(optString)) {
            throw AnonymousClass7TE.A0w("Product id cannot be empty.");
        } else if (!TextUtils.isEmpty(optString2)) {
            this.A07 = A17.optString(DialogModule.KEY_TITLE);
            A17.optString(PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
            A17.optString(DevServerEntity.COLUMN_DESCRIPTION);
            A17.optString("packageDisplayName");
            A17.optString("iconUrl");
            this.A02 = A17.optString("skuDetailsToken");
            this.A03 = A17.optString("serializedDocid");
            JSONArray optJSONArray = A17.optJSONArray("subscriptionOfferDetails");
            ArrayList arrayList = null;
            if (optJSONArray != null) {
                arrayList = AnonymousClass7TE.A1C();
                for (int i = 0; i < optJSONArray.length(); i++) {
                    arrayList.add(new C10724Rx2(optJSONArray.getJSONObject(i)));
                }
            } else if (optString2.equals("subs") || optString2.equals("play_pass_subs")) {
                arrayList = AnonymousClass7TE.A1C();
            }
            this.A04 = arrayList;
            JSONObject optJSONObject = this.A05.optJSONObject("oneTimePurchaseOfferDetails");
            JSONArray optJSONArray2 = this.A05.optJSONArray("oneTimePurchaseOfferDetailsList");
            ArrayList A1C = AnonymousClass7TE.A1C();
            if (optJSONArray2 != null) {
                for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                    A1C.add(new C10768Rxm(optJSONArray2.getJSONObject(i2)));
                }
            } else if (optJSONObject != null) {
                A1C.add(new C10768Rxm(optJSONObject));
            } else {
                return;
            }
            this.A08 = A1C;
        } else {
            throw AnonymousClass7TE.A0w("Product type cannot be empty.");
        }
    }
}
