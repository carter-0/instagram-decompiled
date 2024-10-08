package com.facebook.businessextension.jscalls;

import X.AnonymousClass7TE;
import X.C13905TkY;
import X.Pxg;
import X.Pxh;
import X.SQO;
import X.SWa;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class RequestAutofillJSBridgeCall extends BusinessExtensionJSBridgeCall {
    public static final C13905TkY CREATOR = new SWa(4);

    public static Bundle A00(JSONObject jSONObject) {
        String str;
        LinkedHashSet linkedHashSet;
        LinkedHashSet linkedHashSet2;
        Bundle A02 = BusinessExtensionJSBridgeCall.A02(jSONObject);
        try {
            str = jSONObject.getString("selectedAutoCompleteTag");
        } catch (JSONException e) {
            SQO.A00("RequestAutofillJSBridgeCall", "Failed to get autofill tag", e, e);
            str = null;
        }
        try {
            JSONArray jSONArray = new JSONArray(jSONObject.getString("autofillFields"));
            ArrayList A1C = AnonymousClass7TE.A1C();
            for (int i = 0; i < jSONArray.length(); i = Pxg.A09(A1C, jSONArray, i)) {
            }
            Collections.sort(A1C);
            linkedHashSet = new LinkedHashSet(A1C);
        } catch (JSONException e2) {
            SQO.A00("RequestAutofillJSBridgeCall", "Failed to parseRequestedFields", e2, e2);
            linkedHashSet = null;
        }
        try {
            JSONArray jSONArray2 = new JSONArray(jSONObject.getString("allFields"));
            ArrayList A1C2 = AnonymousClass7TE.A1C();
            for (int i2 = 0; i2 < jSONArray2.length(); i2 = Pxg.A09(A1C2, jSONArray2, i2)) {
            }
            Collections.sort(A1C2);
            linkedHashSet2 = new LinkedHashSet(A1C2);
        } catch (JSONException e3) {
            SQO.A00("RequestAutofillJSBridgeCall", "Failed to parseAllFields", e3, e3);
            linkedHashSet2 = null;
        }
        A02.putParcelable("requestAutofillData", new RequestAutofillJSBridgeCallData(str, linkedHashSet, linkedHashSet2));
        return A02;
    }

    public final LinkedHashSet A01() {
        RequestAutofillJSBridgeCallData requestAutofillJSBridgeCallData = (RequestAutofillJSBridgeCallData) Pxh.A0d(this, "requestAutofillData");
        if (requestAutofillJSBridgeCallData == null) {
            return null;
        }
        return requestAutofillJSBridgeCallData.A02;
    }
}
