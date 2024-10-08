package X;

/* renamed from: X.SGo  reason: case insensitive filesystem */
public final class C11230SGo {
    public int A00;
    public String A01;

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.SGo] */
    public static C11230SGo A00(String str, int i) {
        ? obj = new Object();
        obj.A00 = i;
        obj.A01 = str;
        return obj;
    }

    public final String toString() {
        return 002.A0u("Response Code: ", SUN.A06(this.A00), ", Debug Message: ", this.A01);
    }
}
