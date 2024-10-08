package X;

import java.util.List;
import java.util.Map;
import java.util.Random;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.OYr  reason: case insensitive filesystem */
public final class C71016OYr {
    public List A00;
    public List A01;
    public List A02;
    public JSONObject A03;
    public boolean A04;
    public boolean A05;
    public final String A06;
    public final Random A07 = new Random();

    public C71016OYr(String str) {
        0qQ.A0B(str, 1);
        this.A06 = str;
        this.A04 = 00p.A0k(DbV.A12(str), "{", false);
    }

    public static final Double A00(C71016OYr oYr, List list, Map map, JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return null;
        }
        double d = 0.0d;
        int i = 0;
        int length = jSONArray.length() - 1;
        if (length >= 0) {
            while (true) {
                Double A012 = A01(oYr, list, map, jSONArray.optJSONObject(i));
                if (A012 != null) {
                    d += A012.doubleValue();
                    if (i == length) {
                        break;
                    }
                    i++;
                } else {
                    return null;
                }
            }
        }
        return Double.valueOf(d);
    }

    public static final Double A01(C71016OYr oYr, List list, Map map, JSONObject jSONObject) {
        char c;
        String str;
        if (jSONObject == null) {
            c = 'N';
        } else if (jSONObject.has("estimate")) {
            list.add(',');
            String optString = jSONObject.optString("estimate");
            0qQ.A07(optString);
            return Double.valueOf(Double.parseDouble(optString));
        } else if (!jSONObject.has("split_var") || !jSONObject.has("split_value")) {
            c = 'S';
        } else {
            Number A14 = C51966G9m.A14(jSONObject.optString("split_var"), map);
            String optString2 = jSONObject.optString("split_value");
            0qQ.A07(optString2);
            double parseDouble = Double.parseDouble(optString2);
            if (A14 == null) {
                c = 'I';
            } else {
                if (A14.doubleValue() <= parseDouble) {
                    list.add('L');
                    str = "left";
                } else {
                    list.add('R');
                    str = "right";
                }
                return A01(oYr, list, map, jSONObject.optJSONObject(str));
            }
        }
        list.add(Character.valueOf(c));
        return null;
    }
}
