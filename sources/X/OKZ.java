package X;

import android.app.Dialog;
import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

public final class OKZ {
    public final Context A00;
    public final 0xa A01;

    public final Dialog A00(C62320sa r5) {
        Context context = this.A00;
        C358248ab A0Y = DbS.A0Y(context);
        A0Y.A0r(true);
        A0Y.A0s(true);
        A0Y.A05 = AnonymousClass7TE.A16(context, 2131967731);
        A0Y.A0q(AnonymousClass7TE.A16(context, 2131963151));
        A0Y.A0J(new C71183Of1(28, r5, this), 2131956706);
        A0Y.A05();
        return A0Y.A02();
    }

    public OKZ(Context context) {
        this.A00 = context;
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        0qQ.A07(defaultSharedPreferences);
        this.A01 = new 0tX(defaultSharedPreferences, "RtcEffectPermissionDialogHelper");
    }
}
