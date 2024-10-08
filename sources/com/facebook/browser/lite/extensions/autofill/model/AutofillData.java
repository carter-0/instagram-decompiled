package com.facebook.browser.lite.extensions.autofill.model;

import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.DbS;
import X.DbT;
import X.DbV;
import X.Pxe;
import X.Pxg;
import X.SWS;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class AutofillData implements Parcelable {
    public static final Parcelable.Creator CREATOR = SWS.A00(15);
    public final Map A00;

    public final int describeContents() {
        return 0;
    }

    private void A00() {
        Map map = this.A00;
        Iterator A0u = AnonymousClass7TF.A0u(map);
        while (A0u.hasNext()) {
            Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
            if (A1J.getValue() == null) {
                A0u.remove();
            } else {
                A1J.setValue(DbS.A0s(A1J).trim());
            }
        }
        Object obj = map.get("given-name");
        Object obj2 = map.get("family-name");
        if (obj == null && obj2 == null) {
            String A11 = DbT.A11(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, map);
            if (A11 != null) {
                int lastIndexOf = A11.lastIndexOf(32);
                if (lastIndexOf > 0) {
                    map.put("given-name", Pxe.A0x(A11, lastIndexOf));
                    map.put("family-name", Pxe.A0v(lastIndexOf, A11));
                    return;
                }
                map.put("given-name", A11);
                return;
            }
            return;
        }
        ArrayList A1C = AnonymousClass7TE.A1C();
        if (map.containsKey("given-name")) {
            A1C.add(map.get("given-name"));
        }
        if (map.containsKey("family-name")) {
            A1C.add(map.get("family-name"));
        }
        map.put(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, TextUtils.join(" ", A1C));
    }

    public final boolean A02() {
        Map map = this.A00;
        if (!TextUtils.isEmpty(DbT.A11("given-name", map)) || !TextUtils.isEmpty(DbT.A11("family-name", map)) || !TextUtils.isEmpty(DbT.A11("address-line1", map))) {
            return true;
        }
        return false;
    }

    public final boolean A03() {
        Map map = this.A00;
        if ((!TextUtils.isEmpty(DbT.A11("given-name", map)) || !TextUtils.isEmpty(DbT.A11("family-name", map))) && !TextUtils.isEmpty(DbT.A11("address-line1", map)) && !TextUtils.isEmpty(DbT.A11("address-level1", map)) && !TextUtils.isEmpty(DbT.A11("address-level2", map)) && !TextUtils.isEmpty(DbT.A11("postal-code", map))) {
            return true;
        }
        return false;
    }

    public final String toString() {
        Map map = this.A00;
        if (map == null) {
            return "";
        }
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("AutofillData{mAutofillValues=");
        A1A.append(map.keySet());
        A1A.append(":");
        return Pxg.A0p(map.values(), A1A);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeMap(this.A00);
    }

    public AutofillData(JSONObject jSONObject) {
        this.A00 = AnonymousClass7TE.A1E();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String A18 = AnonymousClass7TE.A18(keys);
            this.A00.put(A18, jSONObject.optString(A18));
        }
        A00();
    }

    public final JSONObject A01() {
        JSONObject A11 = DbS.A11();
        Map unmodifiableMap = Collections.unmodifiableMap(this.A00);
        Iterator A16 = DbV.A16(unmodifiableMap);
        while (A16.hasNext()) {
            String A18 = AnonymousClass7TE.A18(A16);
            try {
                A11.put(A18, unmodifiableMap.get(A18));
            } catch (JSONException unused) {
            }
        }
        return A11;
    }

    public AutofillData(Parcel parcel) {
        this.A00 = parcel.readHashMap(String.class.getClassLoader());
        A00();
    }

    public AutofillData(Map map) {
        this.A00 = Pxe.A19(map);
        A00();
    }
}
