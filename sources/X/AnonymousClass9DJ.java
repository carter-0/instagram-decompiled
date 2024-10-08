package X;

import android.content.Context;
import android.content.SharedPreferences;
import java.io.File;
import java.io.IOException;

/* renamed from: X.9DJ  reason: invalid class name */
public final class AnonymousClass9DJ {
    public Context A00;
    public SharedPreferences A01;
    public AnonymousClass95S A02;
    public AnonymousClass95S A03;
    public final String A04;

    public AnonymousClass9DJ(Context context, String str) {
        this.A04 = str;
        this.A00 = context;
    }

    public final void A00(File file) {
        try {
            String canonicalPath = file.getCanonicalPath();
            SharedPreferences sharedPreferences = this.A01;
            if (sharedPreferences == null) {
                sharedPreferences = this.A00.getSharedPreferences("asset_preferences", 0);
                this.A01 = sharedPreferences;
            }
            SharedPreferences.Editor edit = sharedPreferences.edit();
            AnonymousClass95S r0 = this.A02;
            if (r0 == null) {
                r0 = (AnonymousClass95S) AnonymousClass95R.A04.A00(this.A04).A00("location");
                this.A02 = r0;
            }
            edit.putString(r0.toString(), canonicalPath).apply();
        } catch (IOException e) {
            0wb.A06("FileStateStorage", "Failed to save path", e);
        }
    }
}
