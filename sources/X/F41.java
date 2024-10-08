package X;

import android.content.Intent;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;

public final class F41 {
    public static final List A00(Intent intent, String str) {
        String stringExtra;
        if (!intent.hasExtra(str) || (stringExtra = intent.getStringExtra(str)) == null) {
            return 0sn.A00;
        }
        try {
            JSONArray jSONArray = new JSONArray(stringExtra);
            ArrayList A1C = AnonymousClass7TE.A1C();
            int i = 0;
            int length = stringExtra.length();
            if (length < 0) {
                return A1C;
            }
            while (true) {
                String string = jSONArray.getString(i);
                0qQ.A07(string);
                A1C.add(string);
                if (i == length) {
                    return A1C;
                }
                i++;
            }
        } catch (JSONException unused) {
            return 0sn.A00;
        }
    }
}
