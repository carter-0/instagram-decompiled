package X;

import java.util.ArrayList;
import org.json.JSONArray;

/* renamed from: X.Enr  reason: case insensitive filesystem */
public abstract class C49015Enr {
    public static ArrayList A00(String str) {
        ArrayList A1C = AnonymousClass7TE.A1C();
        JSONArray jSONArray = new JSONArray(str);
        for (int i = 0; i < jSONArray.length(); i++) {
            A1C.add(jSONArray.getString(i));
        }
        return A1C;
    }
}
