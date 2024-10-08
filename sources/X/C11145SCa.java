package X;

/* renamed from: X.SCa  reason: case insensitive filesystem */
public abstract class C11145SCa {
    public static final C62320sa A00 = TUB.A00;
    public static final C9553Rcq A01 = PzN.A04;

    public static final String A00() {
        String A10;
        StringBuilder A1A = AnonymousClass7TE.A1A();
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        0qQ.A07(stackTrace);
        int length = stackTrace.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            StackTraceElement stackTraceElement = stackTrace[i];
            int i3 = i2 + 1;
            if (i2 > 4) {
                if (i2 > 5) {
                    A1A.append(10);
                    StringBuilder A1A2 = AnonymousClass7TE.A1A();
                    A1A2.append('|');
                    A10 = AnonymousClass7TG.A0m(stackTraceElement, 00p.A0f(" ", 12), A1A2);
                } else {
                    A10 = DbT.A10(stackTraceElement);
                }
                A1A.append(A10);
            }
            i++;
            i2 = i3;
        }
        return DbT.A10(A1A);
    }
}
