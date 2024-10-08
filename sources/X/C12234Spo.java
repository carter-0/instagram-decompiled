package X;

import android.content.SharedPreferences;

/* renamed from: X.Spo  reason: case insensitive filesystem */
public final class C12234Spo implements C13849TiS {
    public final SharedPreferences.Editor A00;

    public final C13849TiS E5R(String str, boolean z) {
        0qQ.A0B(str, 0);
        this.A00.putBoolean(str, z);
        return this;
    }

    public final C13849TiS E5X(String str, int i) {
        0qQ.A0B(str, 0);
        this.A00.putInt(str, i);
        return this;
    }

    public final C13849TiS E5a(String str, long j) {
        0qQ.A0B(str, 0);
        this.A00.putLong(str, j);
        return this;
    }

    public final C13849TiS ED1(String str) {
        0qQ.A0B(str, 0);
        this.A00.remove(str);
        return this;
    }

    public final C13849TiS AHK() {
        this.A00.clear();
        return this;
    }

    public final void AIO() {
        this.A00.apply();
    }

    public final void AIP() {
        this.A00.apply();
    }

    public final void AIQ(C10558RuC ruC) {
        this.A00.apply();
        C12254Sq8 sq8 = ruC.A01;
        sq8.A00 = ruC.A00;
        sq8.A01 = true;
        ruC.A02.countDown();
    }

    public final void AIR(String str, String str2) {
        this.A00.apply();
    }

    public C12234Spo(SharedPreferences.Editor editor) {
        this.A00 = editor;
    }

    public final C13849TiS E5e(String str, String str2) {
        AnonymousClass7TG.A1N(str, str2);
        this.A00.putString(str, str2);
        return this;
    }
}
