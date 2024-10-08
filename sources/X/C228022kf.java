package X;

import android.os.Bundle;
import java.util.UUID;

/* renamed from: X.2kf  reason: invalid class name and case insensitive filesystem */
public abstract class C228022kf {
    public static final String A00(Bundle bundle) {
        String string;
        if (bundle != null && (string = bundle.getString("shopping_session_id")) != null) {
            return string;
        }
        String obj = UUID.randomUUID().toString();
        0qQ.A07(obj);
        return obj;
    }
}
