package X;

import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;

/* renamed from: X.2nA  reason: invalid class name and case insensitive filesystem */
public final class C229302nA extends 1Bk {
    public final int A00 = 3;
    public final SharedPreferences A01;
    public final Object A02 = new Object();
    public volatile boolean A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C229302nA(SharedPreferences sharedPreferences, String str, boolean z) {
        super(str);
        0qQ.A0B(sharedPreferences, 1);
        this.A01 = sharedPreferences;
        if (z) {
            0nY.A00().ATE(new C46343Dcm(new AnonymousClass9LM(this, 12), this.A00));
        }
    }

    public final long A04(String str, long j) {
        0qQ.A0B(str, 0);
        long j2 = this.A01.getLong(str, j);
        this.A03 = true;
        return j2;
    }

    public final Set A06(String str, Set set) {
        0sl stringSet = this.A01.getStringSet(str, set);
        if (stringSet == null) {
            stringSet = 0sl.A00;
        }
        Set A0j = 00k.A0j(stringSet);
        this.A03 = true;
        return A0j;
    }

    public final void A09() {
    }

    public final void A0A(String str) {
        0qQ.A0B(str, 0);
        this.A01.edit().remove(str).apply();
        this.A03 = true;
    }

    public final void A0C(String str, long j) {
        0qQ.A0B(str, 0);
        this.A01.edit().putLong(str, j).apply();
        A07();
        this.A03 = true;
    }

    public final boolean A0F(String str) {
        0qQ.A0B(str, 0);
        boolean contains = this.A01.contains(str);
        this.A03 = true;
        return contains;
    }

    public final boolean A0G(String str, boolean z) {
        boolean z2 = this.A01.getBoolean(str, false);
        this.A03 = true;
        return z2;
    }

    public final float A02(String str, float f) {
        float f2 = this.A01.getFloat(str, -1.0f);
        this.A03 = true;
        return f2;
    }

    public final int A03() {
        int size = this.A01.getAll().size();
        this.A03 = true;
        return size;
    }

    /* JADX WARNING: type inference failed for: r0v10, types: [X.6Ki, java.lang.Object] */
    public final Set A05() {
        Set<Map.Entry<String, ?>> entrySet = this.A01.getAll().entrySet();
        ArrayList arrayList = new ArrayList(0Yv.A1E(entrySet, 10));
        for (Map.Entry next : entrySet) {
            Object key = next.getKey();
            0qQ.A07(key);
            String str = (String) key;
            Object value = next.getValue();
            0qQ.A0B(str, 1);
            ? obj = new Object();
            obj.A01 = str;
            obj.A00 = value;
            arrayList.add(obj);
        }
        this.A03 = true;
        return 00k.A0j(arrayList);
    }

    public final void A08() {
        this.A01.edit().clear().apply();
        this.A03 = true;
    }

    public final void A0B(String str, float f) {
        this.A01.edit().putFloat(str, f).apply();
        A07();
        this.A03 = true;
    }

    public final void A0D(String str, Set set) {
        this.A01.edit().putStringSet("cellar_captured_event_names", set).apply();
        A07();
        this.A03 = true;
    }

    public final void A0E(String str, boolean z) {
        this.A01.edit().putBoolean(str, z).apply();
        A07();
        this.A03 = true;
    }
}
