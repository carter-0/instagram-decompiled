package X;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.TQp  reason: case insensitive filesystem */
public final class C13224TQp extends RuntimeException {
    public final int A00;
    public final boolean A01;

    public static C13224TQp A00(String str, Throwable e) {
        boolean z = false;
        int i = Integer.MAX_VALUE;
        try {
            str.getClass();
            JSONObject A17 = C66580MXl.A17(str);
            A17.optInt("num_current_attempts", 0);
            i = A17.optInt("num_remaining_attempts", Integer.MAX_VALUE);
            z = A17.optBoolean("auth_factor_expired", false);
        } catch (NullPointerException | JSONException e2) {
            e = e2;
        }
        return new C13224TQp(e, i, z);
    }

    public C13224TQp(Throwable th, int i, boolean z) {
        super(th);
        this.A00 = i;
        this.A01 = z;
    }
}
