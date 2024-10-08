package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;

/* renamed from: X.Rgo  reason: case insensitive filesystem */
public abstract class C9792Rgo {
    public static Object A00(C307896Rx r6, AnonymousClass6Tm r7) {
        Context context = C308206Td.A09(r6).A00;
        AnonymousClass6Tm r5 = r7;
        if (1DL.A07(context, "android.permission.READ_EXTERNAL_STORAGE")) {
            0qQ.A0A(r7);
            SS4.A01(context, r6, r7);
            return null;
        }
        FragmentActivity activity = DbU.A0H(r6).getActivity();
        if (activity == null) {
            0qQ.A0A(r7);
            SS4.A04(r6, r7, AnonymousClass7TE.A1C());
            return null;
        }
        JTP.A11(activity, new T7I(0, activity, context, r5, r6), SL9.A00(context));
        return null;
    }
}
