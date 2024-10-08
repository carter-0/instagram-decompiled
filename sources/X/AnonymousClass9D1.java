package X;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: X.9D1  reason: invalid class name */
public final class AnonymousClass9D1 {
    public final SharedPreferences.Editor A00;
    public final String A01;

    public AnonymousClass9D1(Context context, String str) {
        this.A01 = str;
        this.A00 = context.getApplicationContext().getSharedPreferences("hpke_key_storage", 0).edit();
    }
}
