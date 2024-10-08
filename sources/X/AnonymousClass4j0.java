package X;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: X.4j0  reason: invalid class name */
public abstract class AnonymousClass4j0 {
    public static JSONArray A01(List list) {
        JSONArray jSONArray = new JSONArray();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            1R4 r2 = (1R4) list.get(i);
            JSONArray jSONArray2 = new JSONArray();
            jSONArray2.put(r2.A00);
            jSONArray2.put(r2.A01);
            jSONArray.put(jSONArray2);
        }
        return jSONArray;
    }

    public static ArrayList A00(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList(jSONArray.length());
        int length = jSONArray.length();
        int i = 0;
        while (i < length) {
            JSONArray jSONArray2 = jSONArray.getJSONArray(i);
            try {
                arrayList.add(new 1R4(jSONArray2.getString(0), jSONArray2.getString(1)));
                i++;
            } catch (AnonymousClass1R2 unused) {
                throw new JSONException("Invalid pattern");
            }
        }
        return arrayList;
    }
}
