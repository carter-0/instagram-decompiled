package X;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: X.PIh  reason: case insensitive filesystem */
public final class C72749PIh implements AnonymousClass5IX {
    public final Context A00;

    public final boolean E1z(AnonymousClass5IY r4) {
        Context context = this.A00;
        SharedPreferences sharedPreferences = context.getSharedPreferences(context.getPackageName(), 0);
        0qQ.A07(sharedPreferences);
        if (sharedPreferences.getInt(AnonymousClass000.A00(859), 0) <= 1) {
            return false;
        }
        return true;
    }

    public C72749PIh(Context context) {
        this.A00 = context;
    }
}
