package X;

import java.util.Arrays;

/* renamed from: X.9Gp  reason: invalid class name and case insensitive filesystem */
public final class C376119Gp {
    public String A00;
    public C376109Go A01;
    public C376129Gq A02;

    public final boolean equals(Object obj) {
        if (!(obj instanceof C376119Gp)) {
            return false;
        }
        C376119Gp r4 = (C376119Gp) obj;
        if (!this.A01.equals(r4.A01) || !this.A00.equals(r4.A00)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.deepHashCode(new Object[]{this.A01, this.A00});
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.9Gq, java.lang.Object] */
    public C376119Gp(String str, C376109Go r4) {
        this.A01 = r4;
        this.A00 = str;
        ? obj = new Object();
        obj.A01 = "2";
        obj.A00 = "2";
        this.A02 = obj;
    }

    public C376119Gp() {
        this("", new C376109Go());
    }
}
