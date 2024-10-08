package X;

/* renamed from: X.AbG  reason: case insensitive filesystem */
public final class C40383AbG implements B22 {
    public final /* synthetic */ AnonymousClass4D7 A00;

    public final void onError(String str) {
        0qQ.A0B(str, 0);
        AnonymousClass4D7 r2 = this.A00;
        RuntimeException A15 = AnonymousClass7TE.A15(str);
        0qQ.A0B(A15, 0);
        r2.resumeWith(new 0eQ(A15));
    }

    public C40383AbG(AnonymousClass4D7 r1) {
        this.A00 = r1;
    }

    public final void DoK(C369988ve r2) {
        this.A00.resumeWith(r2);
    }
}
