package X;

/* renamed from: X.2nC  reason: invalid class name and case insensitive filesystem */
public final class C229322nC {
    public final float A00;
    public final 01r A01 = new 01r(0);

    public final long A00(String str, long j) {
        Number number = (Number) this.A01.get(str);
        if (number == null) {
            return -2147483648L;
        }
        return j - number.longValue();
    }

    public final void A01(String str, float f, long j) {
        01r r1 = this.A01;
        if (!r1.containsKey(str) && f >= this.A00) {
            r1.put(str, Long.valueOf(j));
        }
    }

    public C229322nC(float f) {
        this.A00 = f;
    }
}
