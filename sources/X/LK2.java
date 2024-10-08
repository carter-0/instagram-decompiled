package X;

import android.view.View;
import com.instagram.android.R;

public abstract class LK2 {
    public static final boolean A01(View view, String str) {
        C294975nL r2;
        0qQ.A0B(view, 0);
        Object tag = view.getTag(R.id.view_animator);
        if (!(tag instanceof C294975nL) || (r2 = (C294975nL) tag) == null || !0qQ.A0K(r2.A08, str) || !r2.A0W()) {
            return false;
        }
        return true;
    }

    public static final C294975nL A00(View view, C315626kE r6) {
        0qQ.A0B(view, 0);
        C294975nL A01 = C294975nL.A01(view, 0);
        A01.A07 = r6;
        A01.A0G();
        return JTQ.A0P(A01.A0A(), 5.0d, 10.0d);
    }
}
