package X;

/* renamed from: X.AhK  reason: case insensitive filesystem */
public final class C40700AhK implements G83 {
    public final /* synthetic */ AnonymousClass6ST A00;
    public final /* synthetic */ C62320sa A01;
    public final /* synthetic */ C62320sa A02;

    public C40700AhK(AnonymousClass6ST r1, C62320sa r2, C62320sa r3) {
        this.A00 = r1;
        this.A02 = r2;
        this.A01 = r3;
    }

    public final void DEH(Integer num) {
        this.A01.invoke();
    }

    public final void onFinish() {
        this.A00.dismiss();
    }

    public final void onStart() {
        AnonymousClass0fN.A00(this.A00);
    }

    public final void onSuccess() {
        this.A02.invoke();
    }
}
