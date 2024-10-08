package X;

import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* renamed from: X.45u  reason: invalid class name and case insensitive filesystem */
public final class C2604745u {
    public final SharedPreferences A00;
    public final String A01;

    public final long A00(String str, long j) {
        0qQ.A0B(str, 0);
        return this.A00.getLong(002.A0T(this.A01, str, '_'), j);
    }

    public final void A03(String str) {
        0qQ.A0B(str, 0);
        this.A00.edit().remove(002.A0T(this.A01, str, '_')).apply();
    }

    public final void A04(String str, float f) {
        0qQ.A0B(str, 0);
        this.A00.edit().putFloat(002.A0T(this.A01, str, '_'), f).apply();
    }

    public final void A05(String str, long j) {
        0qQ.A0B(str, 0);
        this.A00.edit().putLong(002.A0T(this.A01, str, '_'), j).apply();
    }

    public final void A06(String str, String str2) {
        0qQ.A0B(str, 0);
        0qQ.A0B(str2, 1);
        this.A00.edit().putString(002.A0T(this.A01, str, '_'), str2).apply();
    }

    public final String A01(String str) {
        0qQ.A0B(str, 0);
        String string = this.A00.getString(002.A0T(this.A01, str, '_'), "");
        return string != null ? string : "";
    }

    public final List A02() {
        Set<String> keySet = this.A00.getAll().keySet();
        ArrayList<String> arrayList = new ArrayList<>();
        for (String next : keySet) {
            String str = next;
            0qQ.A0A(str);
            if (00p.A0k(str, 002.A0C(this.A01, '_'), false)) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(0Yv.A1E(arrayList, 10));
        for (String str2 : arrayList) {
            0qQ.A0C(str2, "null cannot be cast to non-null type kotlin.String");
            arrayList2.add(00l.A0F(002.A0C(this.A01, '_'), str2));
        }
        return arrayList2;
    }

    public C2604745u(SharedPreferences sharedPreferences, String str) {
        this.A00 = sharedPreferences;
        this.A01 = str;
    }
}
