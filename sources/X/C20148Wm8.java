package X;

import android.content.SharedPreferences;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.Wm8  reason: case insensitive filesystem */
public final class C20148Wm8 implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ AnonymousClass4CG A01;

    public C20148Wm8(AnonymousClass4CG r1, long j) {
        this.A01 = r1;
        this.A00 = j;
    }

    public final void run() {
        long currentTimeMillis = System.currentTimeMillis() - this.A00;
        AnonymousClass4CG r6 = this.A01;
        SharedPreferences sharedPreferences = r6.A00;
        Iterator A0u = AnonymousClass7TF.A0u(sharedPreferences.getAll());
        while (A0u.hasNext()) {
            Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
            String A13 = DbT.A13(A1J);
            if (A13.startsWith("__data__/")) {
                String str = (String) A1J.getValue();
                if (str == null) {
                    C13989Tnp.A10(sharedPreferences, A13);
                    r6.A02.remove(A13);
                } else {
                    try {
                        C18590Vuh A002 = C18590Vuh.A00(new JSONObject(str));
                        if (currentTimeMillis > A002.A0C) {
                            r6.A01.A01(A002);
                            C13989Tnp.A10(sharedPreferences, A13);
                            r6.A02.remove(A13);
                        }
                    } catch (JSONException unused) {
                        C13989Tnp.A10(sharedPreferences, A13);
                        r6.A02.remove(A13);
                    }
                }
            }
        }
    }
}
