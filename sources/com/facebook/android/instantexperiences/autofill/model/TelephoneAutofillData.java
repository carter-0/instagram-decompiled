package com.facebook.android.instantexperiences.autofill.model;

import X.0qQ;
import X.C7216Pzk;
import X.DbT;
import X.Q1I;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

public final class TelephoneAutofillData extends BrowserExtensionsAutofillData {
    public static final Set A01 = new Q1I(3);
    public static final Parcelable.Creator CREATOR = C7216Pzk.A00(94);
    public final String A00;

    public final /* bridge */ /* synthetic */ FbAutofillData AI0(Set set) {
        0qQ.A0B(set, 0);
        return new TelephoneAutofillData(A01(set), this.A00);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        super.writeToParcel(parcel, i);
        parcel.writeString(this.A00);
    }

    public TelephoneAutofillData(Map map, String str) {
        this.A00 = map;
        this.A00 = str;
    }

    public final JSONObject A02() {
        JSONObject A02 = super.A02();
        A02.put("display_number", this.A00);
        return A02;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TelephoneAutofillData(JSONObject jSONObject) {
        super(jSONObject);
        String str;
        0qQ.A0B(jSONObject, 1);
        try {
            str = jSONObject.getString("display_number");
        } catch (JSONException unused) {
            str = DbT.A11("tel", this.A00);
        }
        this.A00 = str;
    }

    public TelephoneAutofillData(Parcel parcel) {
        super(parcel);
        this.A00 = parcel.readString();
    }
}
