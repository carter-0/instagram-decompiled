package X;

import android.text.TextUtils;
import com.facebook.android.instantexperiences.autofill.model.BrowserExtensionsAutofillData;
import com.facebook.android.instantexperiences.autofill.model.TelephoneAutofillData;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.S6n  reason: case insensitive filesystem */
public final class C11035S6n {
    public final 1Av A00;

    public C11035S6n(UserSession userSession) {
        this.A00 = 1Au.A00(userSession);
    }

    public final ArrayList A00() {
        ArrayList A1C = AnonymousClass7TE.A1C();
        String string = this.A00.A01.getString("ix_autofill_address", "");
        0qQ.A07(string);
        if (!TextUtils.isEmpty(string)) {
            try {
                JSONArray jSONArray = new JSONArray(string);
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    0qQ.A0B(jSONObject, 1);
                    A1C.add(new BrowserExtensionsAutofillData(jSONObject));
                }
            } catch (JSONException e) {
                0KC.A0F("IgAutofillDataStore", e.toString(), e);
            }
        }
        return A1C;
    }

    public final ArrayList A01() {
        ArrayList A1C = AnonymousClass7TE.A1C();
        String string = this.A00.A01.getString("ix_autofill_email", "");
        0qQ.A07(string);
        if (!TextUtils.isEmpty(string)) {
            try {
                JSONArray jSONArray = new JSONArray(string);
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    0qQ.A0B(jSONObject, 1);
                    A1C.add(new BrowserExtensionsAutofillData(jSONObject));
                }
            } catch (JSONException e) {
                0KC.A0F("IgAutofillDataStore", e.toString(), e);
            }
        }
        return A1C;
    }

    public final ArrayList A02() {
        ArrayList A1C = AnonymousClass7TE.A1C();
        String string = this.A00.A01.getString("ix_autofill_name", "");
        0qQ.A07(string);
        if (!TextUtils.isEmpty(string)) {
            try {
                JSONArray jSONArray = new JSONArray(string);
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    0qQ.A0B(jSONObject, 1);
                    A1C.add(new BrowserExtensionsAutofillData(jSONObject));
                }
            } catch (JSONException e) {
                0KC.A0F("IgAutofillDataStore", e.toString(), e);
            }
        }
        return A1C;
    }

    public final ArrayList A03() {
        ArrayList A1C = AnonymousClass7TE.A1C();
        String string = this.A00.A01.getString("ix_autofill_phone", "");
        0qQ.A07(string);
        if (!TextUtils.isEmpty(string)) {
            try {
                JSONArray jSONArray = new JSONArray(string);
                for (int i = 0; i < jSONArray.length(); i++) {
                    A1C.add(new TelephoneAutofillData(jSONArray.getJSONObject(i)));
                }
            } catch (JSONException e) {
                0KC.A0F("IgAutofillDataStore", e.toString(), e);
            }
        }
        return A1C;
    }
}
