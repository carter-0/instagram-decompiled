package X;

import android.os.Bundle;
import org.json.JSONObject;

/* renamed from: X.QAl  reason: case insensitive filesystem */
public final class C7384QAl extends C10143RnK {
    public final String A00;

    public C7384QAl(String str, Bundle bundle) {
        super(bundle);
        this.A00 = str;
        if (C66581MXm.A04(str) != 0) {
            try {
                new JSONObject(str);
                return;
            } catch (Exception unused) {
            }
        }
        throw AnonymousClass7TE.A0w("authenticationResponseJson must not be empty, and must be a valid JSON");
    }
}
