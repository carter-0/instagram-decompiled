package X;

import java.io.StringWriter;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.9yA  reason: invalid class name and case insensitive filesystem */
public abstract class C394469yA {
    public static final JSONObject A00(List list) {
        JSONArray jSONArray = new JSONArray();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C15092UOk uOk = (C15092UOk) it.next();
                if (uOk != null) {
                    StringWriter stringWriter = new StringWriter();
                    17W A0A = AnonymousClass15o.A00.A0A(stringWriter);
                    C18191Vn5.A00(A0A, uOk);
                    A0A.close();
                    jSONArray.put(new JSONObject(stringWriter.toString()));
                }
            }
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("textCaptionData", jSONArray);
            return jSONObject;
        } catch (JSONException unused) {
            return new JSONObject();
        }
    }
}
