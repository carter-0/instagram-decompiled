package X;

import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Set;

/* renamed from: X.424  reason: invalid class name */
public final class AnonymousClass424 {
    public final SharedPreferences A00;
    public final AnonymousClass0JP A01;
    public final String A02;
    public final String A03;

    public final int A04(Integer num, String str) {
        Integer num2;
        int intValue = num.intValue();
        if (intValue == 0) {
            num2 = AnonymousClass05K.A0C;
        } else if (intValue == 1) {
            num2 = AnonymousClass05K.A0Y;
        } else if (intValue != 2) {
            num2 = AnonymousClass05K.A1F;
        } else {
            num2 = AnonymousClass05K.A0u;
        }
        return this.A00.getInt(A01(this, num2, str), 0);
    }

    public AnonymousClass424(SharedPreferences sharedPreferences, String str, String str2) {
        AnonymousClass0Gt r0 = AnonymousClass0Gt.A00;
        0qQ.A07(r0);
        this.A00 = sharedPreferences;
        this.A01 = r0;
        if (str2.length() == 0) {
            throw new IllegalStateException("surfaceId cannot be empty");
        }
        this.A03 = str;
        this.A02 = str2;
    }

    public static final String A00(AnonymousClass424 r3, Integer num) {
        return 002.A0T(r3.A03, 002.A0T(r3.A02, AnonymousClass5IU.A00(num), '/'), '/');
    }

    public static final void A02(AnonymousClass424 r9, Integer num) {
        String A0C = 002.A0C(r9.A03, '/');
        String A0D = 002.A0D(AnonymousClass5IU.A00(num), '/');
        SharedPreferences sharedPreferences = r9.A00;
        Set<String> keySet = sharedPreferences.getAll().keySet();
        ArrayList<String> arrayList = new ArrayList<>();
        for (String next : keySet) {
            String str = next;
            0qQ.A0A(str);
            if (00p.A0k(str, A0C, false) && 00p.A0i(str, A0D, false)) {
                arrayList.add(next);
            }
        }
        SharedPreferences.Editor edit = sharedPreferences.edit();
        for (String remove : arrayList) {
            edit.remove(remove);
        }
        edit.apply();
    }

    public static final String A01(AnonymousClass424 r3, Integer num, String str) {
        if (str.length() == 0) {
            throw new IllegalStateException("promotionId cannot be empty");
        }
        return 002.A0T(r3.A03, 002.A0T(str, AnonymousClass5IU.A00(num), '/'), '/');
    }

    public static final void A03(AnonymousClass424 r6, Integer num, Integer num2, Integer num3, String str) {
        String A012 = A01(r6, num, str);
        String A013 = A01(r6, num2, str);
        long now = r6.A01.now();
        SharedPreferences sharedPreferences = r6.A00;
        SharedPreferences.Editor putLong = sharedPreferences.edit().putInt(A012, sharedPreferences.getInt(A012, 0) + 1).putLong(A013, now);
        if (num3 != null) {
            putLong.putLong(A00(r6, num3), now);
        }
        putLong.apply();
    }
}
