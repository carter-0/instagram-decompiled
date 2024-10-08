package X;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: X.38f  reason: invalid class name and case insensitive filesystem */
public final class C2375638f extends AnonymousClass1VF {
    public final Context A00;

    public final void migrate(1W6 r12) {
        0qQ.A0B(r12, 0);
        r12.AT6("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
        Context context = this.A00;
        SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.preferences", 0);
        boolean contains = sharedPreferences.contains("reschedule_needed");
        String A002 = Pxd.A00(795);
        if (contains || sharedPreferences.contains(A002)) {
            long j = 0;
            long j2 = sharedPreferences.getLong(A002, 0);
            if (sharedPreferences.getBoolean("reschedule_needed", false)) {
                j = 1;
            }
            r12.ADK();
            try {
                r12.AT7("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{A002, Long.valueOf(j2)});
                r12.AT7("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", Long.valueOf(j)});
                sharedPreferences.edit().clear().apply();
                ((1W5) r12).A00.setTransactionSuccessful();
            } finally {
                r12.ASV();
            }
        }
        SharedPreferences sharedPreferences2 = context.getSharedPreferences("androidx.work.util.id", 0);
        if (sharedPreferences2.contains("next_job_scheduler_id") || sharedPreferences2.contains("next_job_scheduler_id")) {
            int i = sharedPreferences2.getInt("next_job_scheduler_id", 0);
            String A003 = Pxd.A00(812);
            int i2 = sharedPreferences2.getInt(A003, 0);
            r12.ADK();
            r12.AT7("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"next_job_scheduler_id", Integer.valueOf(i)});
            r12.AT7("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{A003, Integer.valueOf(i2)});
            sharedPreferences2.edit().clear().apply();
            ((1W5) r12).A00.setTransactionSuccessful();
            r12.ASV();
        }
    }

    public C2375638f(Context context) {
        super(9, 10);
        this.A00 = context;
    }
}
