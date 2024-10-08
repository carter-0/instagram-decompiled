package X;

/* renamed from: X.3L1  reason: invalid class name */
public final class AnonymousClass3L1 implements 0lm, AnonymousClass3L2 {
    public final AnonymousClass3L4 A00;
    public final 0lg A01;
    public final AnonymousClass3L7 A02;
    public final AnonymousClass3L5 A03;
    public final AnonymousClass3L6 A04;

    public final String Ara() {
        return this.A04.Ara();
    }

    public final void DTd() {
        AnonymousClass3L6 r1 = this.A04;
        r1.A01++;
        r1.A00 = 0;
    }

    public AnonymousClass3L1(0lg r5) {
        this.A01 = r5;
        AnonymousClass3L4 r3 = new AnonymousClass3L4();
        this.A00 = r3;
        0qQ.A0B(r5, 0);
        AnonymousClass3L5 r1 = new AnonymousClass3L5((int) 182.A01(0Tu.A05, r5, 36598683344833785L));
        this.A03 = r1;
        this.A04 = new AnonymousClass3L6(r1, r3);
        AnonymousClass3L7 r12 = new AnonymousClass3L7(this);
        this.A02 = r12;
        AnonymousClass1J9.A00().A01(r12);
    }

    public final void onUserSessionWillEnd(boolean z) {
        AnonymousClass1J9.A00().A02(this.A02);
    }
}
