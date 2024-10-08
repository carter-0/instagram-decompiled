package com.facebook.android.instantexperiences.autofill.save;

import X.0KC;
import X.AnonymousClass7TE;
import X.C66580MXl;
import X.C7216Pzk;
import X.C8910RFd;
import X.DbU;
import X.Pxe;
import X.RKR;
import android.os.Parcelable;
import com.facebook.android.instantexperiences.jscall.InstantExperiencesJSBridgeCall;
import com.facebook.common.stringformat.StringFormatUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class SaveAutofillDataJSBridgeCall extends InstantExperiencesJSBridgeCall {
    public static final Parcelable.Creator CREATOR = C7216Pzk.A00(95);

    public final void A02() {
        super.A02();
        Object A00 = A00("raw_autofill_data");
        if (!(A00 instanceof String) || A00 == null) {
            throw new RKR(C8910RFd.INVALID_PARAM, Pxe.A12(Locale.US, "The raw autofill data must be a string", Arrays.copyOf(new Object[0], 0)));
        }
    }

    public final HashMap A04() {
        String valueOf = String.valueOf(A00("raw_autofill_data"));
        HashMap A1E = AnonymousClass7TE.A1E();
        try {
            JSONObject A17 = C66580MXl.A17(valueOf);
            Iterator<String> keys = A17.keys();
            while (keys.hasNext()) {
                String A18 = AnonymousClass7TE.A18(keys);
                JSONArray jSONArray = A17.getJSONArray(A18);
                ArrayList A1C = AnonymousClass7TE.A1C();
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    Object obj = jSONArray.get(i);
                    if (obj != null) {
                        DbU.A1X(obj, A1C);
                    }
                }
                A1E.put(A18, A1C);
            }
            return A1E;
        } catch (JSONException e) {
            0KC.A0F("SaveAutofillDataJSBridgeCall", StringFormatUtil.formatStrLocaleSafe("Failed to getRawAutofillData."), e);
            return A1E;
        }
    }
}
