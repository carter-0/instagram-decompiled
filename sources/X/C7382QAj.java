package X;

import android.os.Bundle;
import org.json.JSONObject;

/* renamed from: X.QAj  reason: case insensitive filesystem */
public final class C7382QAj extends C10142RnJ {
    public final String A00;

    public C7382QAj(String str, Bundle bundle) {
        super(bundle);
        this.A00 = str;
        if (C66581MXm.A04(str) != 0) {
            try {
                new JSONObject(str);
                return;
            } catch (Exception unused) {
            }
        }
        throw AnonymousClass7TE.A0w("registrationResponseJson must not be empty, and must be a valid JSON");
    }
}
