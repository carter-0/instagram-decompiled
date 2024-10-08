package X;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.preference.PreferenceScreen;

/* renamed from: X.Vi6  reason: case insensitive filesystem */
public final class C17915Vi6 {
    public long A00 = 0;
    public SharedPreferences A01;
    public X07 A02;
    public X08 A03;
    public X09 A04;
    public PreferenceScreen A05;
    public String A06;
    public final Context A07;

    public final SharedPreferences A00() {
        SharedPreferences sharedPreferences = this.A01;
        if (sharedPreferences != null) {
            return sharedPreferences;
        }
        SharedPreferences sharedPreferences2 = this.A07.getSharedPreferences(this.A06, 0);
        this.A01 = sharedPreferences2;
        return sharedPreferences2;
    }

    public C17915Vi6(Context context) {
        this.A07 = context;
        this.A06 = 002.A0R(context.getPackageName(), Pxd.A00(621));
        this.A01 = null;
    }
}
