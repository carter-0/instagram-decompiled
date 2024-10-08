package X;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Date;

/* renamed from: X.9cE  reason: invalid class name and case insensitive filesystem */
public final class C381729cE extends AnonymousClass0T0 {
    public int A00 = 0;
    public int A01 = 0;
    public int A02 = 0;
    public Date A03 = null;
    public Date A04 = null;
    public boolean A05 = false;
    public boolean A06 = false;

    public final void A00(Context context) {
        long j;
        SharedPreferences sharedPreferences = context.getSharedPreferences(context.getPackageName(), 0);
        0qQ.A07(sharedPreferences);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        Date date = this.A03;
        long j2 = -1;
        if (date != null) {
            j = date.getTime();
        } else {
            j = -1;
        }
        edit.putLong("APPIRATER_FIRST_USE_DATE", j);
        Date date2 = this.A04;
        if (date2 != null) {
            j2 = date2.getTime();
        }
        edit.putLong("APPIRATER_REMINDER_REQUEST_DATE", j2);
        edit.putInt(AnonymousClass000.A00(859), this.A02);
        edit.putInt("APPIRATER_SIG_EVENT_COUNT", this.A01);
        edit.putInt("APPIRATER_CURRENT_VERSION", this.A00);
        edit.putBoolean(C66579MXk.A00(198), this.A06);
        edit.putBoolean(C66579MXk.A00(197), this.A05);
        edit.apply();
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C381729cE) {
                C381729cE r5 = (C381729cE) obj;
                if (!(this.A02 == r5.A02 && this.A06 == r5.A06 && this.A05 == r5.A05 && 0qQ.A0K(this.A03, r5.A03) && 0qQ.A0K(this.A04, r5.A04) && this.A01 == r5.A01 && this.A00 == r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((AnonymousClass7TF.A09(this.A05, AnonymousClass7TF.A09(this.A06, this.A02 * 31)) + AnonymousClass7TG.A0C(this.A03)) * 31) + AnonymousClass7TE.A0L(this.A04)) * 31) + this.A01) * 31) + this.A00;
    }
}
