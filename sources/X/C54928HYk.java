package X;

import android.os.Bundle;
import java.util.List;

/* renamed from: X.HYk  reason: case insensitive filesystem */
public abstract class C54928HYk {
    public static final H0P A00(Boolean bool, String str, String str2, List list) {
        H0P h0p = new H0P();
        Bundle A0a = AnonymousClass7TE.A0a();
        A0a.putString("entrypoint", str);
        A0a.putString("challenge_id", str2);
        A0a.putBoolean("show_challenge_as_earned", AnonymousClass7TG.A1X(bool));
        A0a.putStringArrayList("achievement_ids", AnonymousClass7TE.A1D(list));
        h0p.setArguments(A0a);
        return h0p;
    }
}
