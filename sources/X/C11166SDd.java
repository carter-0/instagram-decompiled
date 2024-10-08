package X;

/* renamed from: X.SDd  reason: case insensitive filesystem */
public final class C11166SDd {
    public final String A00;

    public static C11166SDd A00(AnonymousClass4XV r6) {
        String str;
        r6.A0H(2);
        int A02 = r6.A02();
        int i = A02 >> 1;
        int A022 = ((r6.A02() >> 3) & 31) | ((A02 & 1) << 5);
        if (i == 4 || i == 5 || i == 7) {
            str = "dvhe";
        } else if (i == 8) {
            str = "hev1";
        } else if (i != 9) {
            return null;
        } else {
            str = "avc3";
        }
        String str2 = ".0";
        String str3 = str2;
        if (A022 >= 10) {
            str2 = ".";
        }
        return new C11166SDd(002.A0o(str, str3, str2, i, A022));
    }

    public C11166SDd(String str) {
        this.A00 = str;
    }
}
