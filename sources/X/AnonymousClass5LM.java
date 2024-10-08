package X;

/* renamed from: X.5LM  reason: invalid class name */
public final class AnonymousClass5LM implements AnonymousClass5LN {
    public final int A00;
    public final C284005Km A01;
    public final String A02;
    public final Object[] A03;

    public AnonymousClass5LM(C284005Km r6, String str, Object[] objArr) {
        char charAt;
        this.A01 = r6;
        this.A02 = str;
        this.A03 = objArr;
        char charAt2 = str.charAt(0);
        if (charAt2 >= 55296) {
            char c = charAt2 & 8191;
            int i = 13;
            int i2 = 1;
            while (true) {
                int i3 = i2 + 1;
                charAt = str.charAt(i2);
                if (charAt < 55296) {
                    break;
                }
                c |= (charAt & 8191) << i;
                i += 13;
                i2 = i3;
            }
            charAt2 = c | (charAt << i);
        }
        this.A00 = charAt2;
    }
}
