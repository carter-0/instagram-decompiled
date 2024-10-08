package X;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Date;

/* renamed from: X.A4u  reason: case insensitive filesystem */
public final class C39678A4u {
    public final Context A00;
    public final C381729cE A01;

    /* JADX WARNING: type inference failed for: r1v1, types: [X.9cE, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v3, types: [X.9cE, java.lang.Object] */
    public C39678A4u(Context context) {
        C381729cE r1;
        Date date;
        this.A00 = context;
        SharedPreferences sharedPreferences = context.getSharedPreferences(context.getPackageName(), 0);
        0qQ.A07(sharedPreferences);
        if (sharedPreferences.contains("APPIRATER_FIRST_USE_DATE")) {
            int i = sharedPreferences.getInt(AnonymousClass000.A00(859), 0);
            boolean z = sharedPreferences.getBoolean(C66579MXk.A00(198), false);
            boolean z2 = sharedPreferences.getBoolean(C66579MXk.A00(197), false);
            long j = sharedPreferences.getLong("APPIRATER_FIRST_USE_DATE", -1);
            Date date2 = null;
            if (-1 != j) {
                date = new Date(j);
            } else {
                date = null;
            }
            long j2 = sharedPreferences.getLong("APPIRATER_REMINDER_REQUEST_DATE", -1);
            date2 = -1 != j2 ? new Date(j2) : date2;
            int i2 = sharedPreferences.getInt("APPIRATER_SIG_EVENT_COUNT", 0);
            int i3 = sharedPreferences.getInt("APPIRATER_CURRENT_VERSION", 0);
            ? obj = new Object();
            obj.A02 = i;
            obj.A06 = z;
            obj.A05 = z2;
            obj.A03 = date;
            obj.A04 = date2;
            obj.A01 = i2;
            obj.A00 = i3;
            r1 = obj;
        } else {
            ? obj2 = new Object();
            obj2.A02 = 0;
            obj2.A06 = false;
            obj2.A05 = false;
            obj2.A03 = null;
            obj2.A04 = null;
            obj2.A01 = 0;
            obj2.A00 = 0;
            r1 = obj2;
        }
        this.A01 = r1;
    }
}
