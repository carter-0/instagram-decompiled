package X;

import android.content.Context;
import android.view.View;

/* renamed from: X.Vmt  reason: case insensitive filesystem */
public abstract class C18179Vmt {
    public static final int A00(Context context, C18554Vu6 vu6) {
        float f;
        int intValue = vu6.A01.intValue();
        if (intValue == 1) {
            f = vu6.A00;
        } else if (intValue != 2) {
            f = 0.0f;
        } else {
            f = 0nA.A00(context, vu6.A00);
        }
        return AnonymousClass1GB.A01(f);
    }

    public static final void A01(View view, C18563VuF vuF) {
        AnonymousClass7TG.A1N(view, vuF);
        C18554Vu6 vu6 = vuF.A01;
        Context context = view.getContext();
        0qQ.A07(context);
        int A00 = A00(context, vu6);
        C18554Vu6 vu62 = vuF.A02;
        0qQ.A07(context);
        view.setPadding(A00, A00(context, vuF.A03), A00(context, vu62), A00(context, vuF.A00));
    }
}
