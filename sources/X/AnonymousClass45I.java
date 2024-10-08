package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.DeadObjectException;
import java.util.Map;

/* renamed from: X.45I  reason: invalid class name */
public final class AnonymousClass45I implements AnonymousClass45J {
    public final Context A00;
    public final SharedPreferences A01;

    public final boolean contains(String str) {
        0qQ.A0B(str, 0);
        SharedPreferences sharedPreferences = this.A01;
        if (sharedPreferences != null) {
            return sharedPreferences.contains(str);
        }
        0KC.A0D("SharedPreferencesManager", "sharedPreferences is null, returning false");
        return false;
    }

    public final long getLong(String str, long j) {
        0qQ.A0B(str, 0);
        SharedPreferences sharedPreferences = this.A01;
        if (sharedPreferences != null) {
            return sharedPreferences.getLong(str, j);
        }
        0KC.A0D("SharedPreferencesManager", "sharedPreferences is null, returning default long value");
        return j;
    }

    public final String getString(String str, String str2) {
        0qQ.A0B(str, 0);
        SharedPreferences sharedPreferences = this.A01;
        if (sharedPreferences == null) {
            0KC.A0D("SharedPreferencesManager", "sharedPreferences is null, returning default string value");
        } else {
            String string = sharedPreferences.getString(str, str2);
            if (string != null) {
                return string;
            }
        }
        return str2;
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [X.TiS, java.lang.Object] */
    public final C13849TiS AR1() {
        SharedPreferences sharedPreferences = this.A01;
        if (sharedPreferences == null) {
            0KC.A0D("SharedPreferencesManager", "sharedPreferences is null, returning NoOpEditorImpl");
            return new Object();
        }
        SharedPreferences.Editor edit = sharedPreferences.edit();
        0qQ.A07(edit);
        return new C12234Spo(edit);
    }

    public final Map getAll() {
        SharedPreferences sharedPreferences = this.A01;
        if (sharedPreferences == null) {
            0KC.A0D("SharedPreferencesManager", "sharedPreferences is null, returning empty map");
            return 0Yt.A0E();
        }
        Map<String, ?> all = sharedPreferences.getAll();
        0qQ.A07(all);
        return all;
    }

    public final boolean getBoolean(String str, boolean z) {
        SharedPreferences sharedPreferences = this.A01;
        if (sharedPreferences != null) {
            return sharedPreferences.getBoolean(str, z);
        }
        0KC.A0D("SharedPreferencesManager", "sharedPreferences is null, returning default boolean value");
        return z;
    }

    public final int getInt(String str, int i) {
        SharedPreferences sharedPreferences = this.A01;
        if (sharedPreferences != null) {
            return sharedPreferences.getInt(str, i);
        }
        0KC.A0D("SharedPreferencesManager", "sharedPreferences is null, returning default int value");
        return i;
    }

    public AnonymousClass45I(Context context, String str, boolean z) {
        SharedPreferences sharedPreferences;
        this.A00 = context;
        try {
            sharedPreferences = context.getSharedPreferences(str, z ? 4 : 0);
            0qQ.A07(sharedPreferences);
        } catch (DeadObjectException e) {
            0KC.A0H("SharedPreferencesManager", "DeadObjectException initializing SharedPreferences", e);
            sharedPreferences = null;
        }
        this.A01 = sharedPreferences;
    }
}
