package com.instagram.business.instantexperiences;

import X.002;
import X.0cp;
import X.AnonymousClass000;
import X.AnonymousClass5He;
import X.AnonymousClass7TE;
import X.C66580MXl;
import X.W6D;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.android.instantexperiences.core.InstantExperiencesParameters;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

public class IGInstantExperiencesParameters implements InstantExperiencesParameters {
    public static final Parcelable.Creator CREATOR = new W6D(10);
    public String A00;
    public String A01;
    public String A02;
    public final long A03;
    public final Uri A04;
    public final String A05;
    public final Set A06 = AnonymousClass7TE.A1F();

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A05);
        parcel.writeLong(this.A03);
    }

    public IGInstantExperiencesParameters(String str, Long l) {
        this.A05 = str;
        this.A03 = l.longValue();
        JSONObject A17 = C66580MXl.A17(str);
        for (String A032 : A00("whitelisted_domains", A17).split(",")) {
            Uri A033 = 0cp.A03(A032);
            if (A033 != null && !AnonymousClass5He.A00(A033.getHost())) {
                this.A06.add(A033.getHost());
            }
        }
        A00(AnonymousClass000.A00(3713), A17);
        A17.optString("app_name");
        A00("business_id", A17);
        this.A04 = 0cp.A03(A00("website_uri", A17));
    }

    public static String A00(String str, JSONObject jSONObject) {
        String string = jSONObject.getString(str);
        if (!string.equals("")) {
            return string;
        }
        throw new JSONException(002.A0R("Empty strings are not allowed for parameter key: ", str));
    }
}
