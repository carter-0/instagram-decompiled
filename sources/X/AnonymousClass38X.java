package X;

import android.content.Context;

/* renamed from: X.38X  reason: invalid class name */
public final class AnonymousClass38X extends AnonymousClass1VF {
    public final Context A00;

    public final void migrate(1W6 r6) {
        0qQ.A0B(r6, 0);
        if (this.endVersion >= 10) {
            r6.AT7("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", 1});
        } else {
            this.A00.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
        }
    }

    public AnonymousClass38X(Context context, int i, int i2) {
        super(i, i2);
        this.A00 = context;
    }
}
