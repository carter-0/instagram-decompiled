package X;

/* renamed from: X.Epq  reason: case insensitive filesystem */
public abstract class C49127Epq {
    public static final String A00(C298905uE r5) {
        String Bpk = r5.Bpk();
        if (Bpk == null) {
            Bpk = r5.Bpj();
        }
        String valueOf = String.valueOf(r5.B9j());
        0qQ.A0B(valueOf, 0);
        int length = valueOf.length();
        int i = 2;
        if (2 > length) {
            i = length;
        }
        String substring = valueOf.substring(length - i);
        0qQ.A07(substring);
        return 002.A0g(Bpk, " '", substring);
    }
}
