package X;

/* renamed from: X.QFm  reason: case insensitive filesystem */
public final class C7483QFm extends RRC {
    public final RJN A00;
    public final Integer A01;
    public final Object A02;
    public final String A03;
    public final String A04;
    public final TZk A05;

    /* JADX WARNING: type inference failed for: r6v0, types: [java.lang.Throwable, java.lang.Exception, X.RJN] */
    public C7483QFm(TZk tZk, Integer num, Object obj, String str, String str2) {
        0sn r2;
        0qQ.A0B(obj, 1);
        C51973G9u.A0r(2, str, tZk, num);
        this.A02 = obj;
        this.A04 = str;
        this.A03 = str2;
        this.A05 = tZk;
        this.A01 = num;
        String A0m = AnonymousClass7TG.A0m(obj, " value: ", AnonymousClass7TF.A0n(str2));
        0qQ.A0B(A0m, 1);
        ? exc = new Exception(A0m);
        StackTraceElement[] stackTrace = exc.getStackTrace();
        0qQ.A07(stackTrace);
        int length = stackTrace.length;
        int i = length - 2;
        if (i < 0 || i == 0) {
            r2 = 0sn.A00;
        } else if (i >= length) {
            r2 = 03t.A0J(stackTrace);
        } else if (i == 1) {
            r2 = AnonymousClass7TE.A1I(stackTrace[length - 1]);
        } else {
            r2 = DbS.A0v(i);
            for (int i2 = length - i; i2 < length; i2++) {
                r2.add(stackTrace[i2]);
            }
        }
        exc.setStackTrace((StackTraceElement[]) r2.toArray(new StackTraceElement[0]));
        this.A00 = exc;
    }
}
