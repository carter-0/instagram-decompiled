package X;

import android.util.Pair;

/* renamed from: X.5r5  reason: invalid class name and case insensitive filesystem */
public final class C297045r5 implements C242713Vq {
    public Pair A00;
    public boolean A01;

    public final boolean equals(Object obj) {
        if (!(obj instanceof C297045r5)) {
            return false;
        }
        C297045r5 r4 = (C297045r5) obj;
        if (!0qQ.A0K(r4.A00, this.A00) || r4.A01 != this.A01) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((527 + this.A00.hashCode()) * 31) + (this.A01 ? 1 : 0)) * 31;
    }

    public final String toString() {
        Pair pair = this.A00;
        Object obj = pair.first;
        0qQ.A06(obj);
        int intValue = ((Number) obj).intValue();
        Object obj2 = pair.second;
        0qQ.A06(obj2);
        String A0n = 002.A0n("[", ",", "] ", intValue, ((Number) obj2).intValue());
        0qQ.A07(A0n);
        return A0n;
    }
}
