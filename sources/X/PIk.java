package X;

import android.content.Context;
import android.content.SharedPreferences;

public final class PIk implements AnonymousClass5IX {
    public final Context A00;

    public final boolean E1z(AnonymousClass5IY r4) {
        Context context = this.A00;
        SharedPreferences sharedPreferences = context.getSharedPreferences(context.getPackageName(), 0);
        0qQ.A07(sharedPreferences);
        return !sharedPreferences.getBoolean("APPIRATER_DECLINED_TO_RATE", false);
    }

    public PIk(Context context) {
        this.A00 = context;
    }
}
