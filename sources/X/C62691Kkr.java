package X;

/* renamed from: X.Kkr  reason: case insensitive filesystem */
public final class C62691Kkr extends IllegalStateException {
    public final Integer A00;
    public final String A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62691Kkr(Integer num, String str, String str2, Throwable th) {
        super(str2, th);
        0qQ.A0B(str, 2);
        this.A00 = num;
        this.A01 = str;
    }

    public static C297815sO A00(Integer num, String str, Throwable th) {
        0qQ.A0B(th, 3);
        return new C297815sO(new C62691Kkr(num, str, th.getMessage(), th));
    }
}
