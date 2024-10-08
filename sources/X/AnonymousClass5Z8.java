package X;

/* renamed from: X.5Z8  reason: invalid class name */
public final class AnonymousClass5Z8 {
    public static final /* synthetic */ AnonymousClass5Z8 A00 = new Object();

    public static final AnonymousClass5ZA A00(long j) {
        AnonymousClass5ZA r0;
        if (j != 16) {
            r0 = new C287125Zc(j);
        } else {
            r0 = AnonymousClass5Z9.A00;
        }
        return r0;
    }

    public final AnonymousClass5ZA A01(C304786Ff r4, float f) {
        AnonymousClass5ZA r0;
        if (r4 == null) {
            r0 = AnonymousClass5Z9.A00;
        } else if (r4 instanceof C304776Fe) {
            long j = ((C304776Fe) r4).A00;
            if (!Float.isNaN(f) && f < 1.0f) {
                j = C285595Rx.A02(AnonymousClass5RX.A0K[(int) (j & 63)], AnonymousClass5RW.A03(j), AnonymousClass5RW.A02(j), AnonymousClass5RW.A01(j), AnonymousClass5RW.A00(j) * f);
            }
            return A00(j);
        } else if (r4 instanceof C298605tj) {
            r0 = new C287145Ze((C298605tj) r4, f);
        } else {
            throw new RuntimeException();
        }
        return r0;
    }
}
