package X;

import android.content.Context;
import android.content.SharedPreferences;

public final class PIl implements AnonymousClass5IX {
    public final Context A00;

    public final boolean E1z(AnonymousClass5IY r4) {
        Context context = this.A00;
        SharedPreferences sharedPreferences = context.getSharedPreferences(context.getPackageName(), 0);
        0qQ.A07(sharedPreferences);
        return !sharedPreferences.getBoolean("APPIRATER_RATED_CURRENT_VERSION", false);
    }

    public PIl(Context context) {
        this.A00 = context;
    }
}
