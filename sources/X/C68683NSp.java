package X;

/* renamed from: X.NSp  reason: case insensitive filesystem */
public final class C68683NSp extends 1QA {
    public static long A03 = -1;
    public long A00;
    public final String A01;
    public final String A02;

    public final synchronized long A03() {
        A07();
        return this.A00;
    }

    public final synchronized String A05() {
        A07();
        return this.A02;
    }

    public final synchronized void A07() {
        if (this.A00 == 0) {
            this.A00 = System.currentTimeMillis();
        }
    }

    public final String A06() {
        return this.A01;
    }

    public C68683NSp(String str, String str2) {
        this.A01 = str;
        this.A02 = str2;
        A03++;
    }
}
