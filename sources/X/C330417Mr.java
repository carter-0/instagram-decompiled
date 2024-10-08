package X;

import android.content.Context;
import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import android.graphics.PorterDuff;
import android.os.Build;
import android.view.View;

/* renamed from: X.7Mr  reason: invalid class name and case insensitive filesystem */
public final class C330417Mr {
    public final View A00;
    public final AnonymousClass0eM A01 = AnonymousClass1YB.A00(new C377109Ko(this, 45));

    public static final C66800Mcm A00(C330417Mr r5) {
        Context context = r5.A00.getContext();
        0qQ.A0A(context);
        C66800Mcm mcm = new C66800Mcm((int) 0nA.A00(context, 6.0f), (int) 0nA.A00(context, 3.0f), (int) 0nA.A00(context, 3.0f));
        int i = Build.VERSION.SDK_INT;
        int A08 = 2Yu.A08(context);
        if (i < 29) {
            mcm.setColorFilter(context.getColor(A08), PorterDuff.Mode.SRC_ATOP);
            return mcm;
        }
        mcm.setColorFilter(new BlendModeColorFilter(context.getColor(A08), BlendMode.SRC_ATOP));
        return mcm;
    }

    public C330417Mr(View view) {
        this.A00 = view;
    }
}
