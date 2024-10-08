package X;

import android.content.Intent;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: X.EcI  reason: case insensitive filesystem */
public abstract class C48299EcI {
    public static final ArrayList A00(Intent intent, String str) {
        String str2;
        if (intent != null) {
            str2 = intent.getStringExtra(str);
        } else {
            str2 = null;
        }
        ArrayList A1C = AnonymousClass7TE.A1C();
        if (str2 != null) {
            try {
                JSONArray jSONArray = new JSONArray(str2);
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    String string = jSONArray.getString(i);
                    0qQ.A07(string);
                    A1C.add(string);
                }
            } catch (JSONException unused) {
            }
        }
        return A1C;
    }
}
