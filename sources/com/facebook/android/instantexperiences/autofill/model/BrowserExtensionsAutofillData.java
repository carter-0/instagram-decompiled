package com.facebook.android.instantexperiences.autofill.model;

import X.002;
import X.0qQ;
import X.0u4;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C66584MXp;
import X.DbS;
import X.DbT;
import X.DbV;
import X.DbY;
import X.Dba;
import X.Dbb;
import X.Pxe;
import X.Pxj;
import X.S8B;
import android.os.Parcel;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

public abstract class BrowserExtensionsAutofillData implements FbAutofillData {
    public Map A00;

    public final boolean Ccl(FbAutofillData fbAutofillData) {
        BrowserExtensionsAutofillData browserExtensionsAutofillData;
        0qQ.A0B(fbAutofillData, 0);
        if (DbY.A1b(this, fbAutofillData) && (fbAutofillData instanceof BrowserExtensionsAutofillData) && (browserExtensionsAutofillData = (BrowserExtensionsAutofillData) fbAutofillData) != null && this.A00.size() <= browserExtensionsAutofillData.A00.size()) {
            Iterator A0u = AnonymousClass7TF.A0u(this.A00);
            while (A0u.hasNext()) {
                Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
                Object key = A1J.getKey();
                Object value = A1J.getValue();
                Object obj = browserExtensionsAutofillData.A00.get(key);
                if (value == null || (obj != null && value.equals(obj))) {
                }
            }
            return true;
        }
        return false;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj != null && DbY.A1b(this, obj)) {
            BrowserExtensionsAutofillData browserExtensionsAutofillData = (BrowserExtensionsAutofillData) obj;
            if (this.A00.size() == browserExtensionsAutofillData.A00.size()) {
                Iterator A0u = AnonymousClass7TF.A0u(this.A00);
                while (true) {
                    boolean z = true;
                    if (A0u.hasNext()) {
                        Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
                        Object key = A1J.getKey();
                        Object value = A1J.getValue();
                        Object obj2 = browserExtensionsAutofillData.A00.get(key);
                        boolean A1V = AnonymousClass7TF.A1V(value);
                        if (obj2 == null) {
                            z = false;
                        }
                        if ((z ^ A1V) || (value != null && obj2 != null && !value.equals(obj2))) {
                            break;
                        }
                    } else {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeMap(this.A00);
    }

    public final String A00() {
        String A11;
        if (this instanceof TelephoneAutofillData) {
            A11 = ((TelephoneAutofillData) this).A00;
        } else if (this instanceof NameAutofillData) {
            CharSequence charSequence = (CharSequence) this.A00.get(PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
            if (charSequence == null || charSequence.length() == 0) {
                String A0T = 002.A0T(Pxj.A0r("given-name", this.A00), Pxj.A0r("family-name", this.A00), ' ');
                int length = A0T.length() - 1;
                int i = 0;
                boolean z = false;
                while (i <= length) {
                    int i2 = length;
                    if (!z) {
                        i2 = i;
                    }
                    boolean A1a = Dbb.A1a(A0T, i2);
                    if (z) {
                        if (!A1a) {
                            break;
                        }
                        length--;
                    } else if (!A1a) {
                        z = true;
                    } else {
                        i++;
                    }
                }
                return Dba.A0c(A0T, length, i);
            }
            Object obj = this.A00.get(PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
            0qQ.A0A(obj);
            return (String) obj;
        } else if (this instanceof EmailAutofillData) {
            Map map = this.A00;
            A11 = DbT.A11(DbV.A16(map).next(), map);
        } else {
            StringBuilder A1A = AnonymousClass7TE.A1A();
            if (!S8B.A01(DbT.A11("street-address", this.A00), A1A)) {
                S8B.A00("address-line1", A1A, this.A00);
                S8B.A00("address-line2", A1A, this.A00);
                S8B.A00("address-line3", A1A, this.A00);
            }
            S8B.A00("address-level4", A1A, this.A00);
            S8B.A00("address-level3", A1A, this.A00);
            S8B.A00("address-level2", A1A, this.A00);
            S8B.A00("address-level1", A1A, this.A00);
            S8B.A00("postal-code", A1A, this.A00);
            if (!S8B.A01(DbT.A11("country", this.A00), A1A)) {
                S8B.A00("country-name", A1A, this.A00);
            }
            return DbT.A10(A1A);
        }
        if (A11 == null) {
            return "";
        }
        return A11;
    }

    public final Map Ae5() {
        if (this instanceof TelephoneAutofillData) {
            return Pxe.A19(this.A00);
        }
        if (!(this instanceof NameAutofillData)) {
            return Pxe.A19(this.A00);
        }
        HashMap A19 = Pxe.A19(this.A00);
        for (Object next : new LinkedList(A19.keySet())) {
            String A0r = DbS.A0r(next, A19);
            if (A0r == null || A0r.length() == 0) {
                A19.remove(next);
            }
        }
        return A19;
    }

    public BrowserExtensionsAutofillData(JSONObject jSONObject) {
        this();
        JSONObject optJSONObject = jSONObject.optJSONObject("autocomplete_data");
        if (optJSONObject != null) {
            Iterator<String> keys = optJSONObject.keys();
            while (keys.hasNext()) {
                String A18 = AnonymousClass7TE.A18(keys);
                this.A00.put(A18, optJSONObject.optString(A18));
            }
        }
    }

    public final HashMap A01(Set set) {
        HashMap A1E = AnonymousClass7TE.A1E();
        Iterator A0u = AnonymousClass7TF.A0u(this.A00);
        while (A0u.hasNext()) {
            Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
            Object key = A1J.getKey();
            Object value = A1J.getValue();
            if (set.contains(key)) {
                A1E.put(key, value);
            }
        }
        return A1E;
    }

    public JSONObject A02() {
        JSONObject A11 = DbS.A11();
        Iterator A0u = AnonymousClass7TF.A0u(Ae5());
        while (A0u.hasNext()) {
            C66584MXp.A18(A0u, A11);
        }
        JSONObject A112 = DbS.A11();
        A112.put("autocomplete_data", A11);
        return A112;
    }

    public BrowserExtensionsAutofillData(Parcel parcel) {
        HashMap readHashMap = parcel.readHashMap(String.class.getClassLoader());
        0qQ.A0C(readHashMap, "null cannot be cast to non-null type kotlin.collections.MutableMap<kotlin.String, kotlin.String>");
        this.A00 = 0u4.A03(readHashMap);
    }

    public BrowserExtensionsAutofillData() {
        this.A00 = AnonymousClass7TE.A1E();
    }
}
