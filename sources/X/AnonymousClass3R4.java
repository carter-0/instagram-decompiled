package X;

/* renamed from: X.3R4  reason: invalid class name */
public final class AnonymousClass3R4 implements C61110lV {
    public final Runnable A00 = new AnonymousClass3R5(this);
    public final /* synthetic */ AnonymousClass3R3 A01;

    public AnonymousClass3R4(AnonymousClass3R3 r2) {
        this.A01 = r2;
    }

    public final void onAppBackgrounded() {
        AnonymousClass0fD.A0A(-643571422, AnonymousClass0fD.A03(1892489));
    }

    public final void onAppForegrounded() {
        int A03 = AnonymousClass0fD.A03(1990762);
        if (((Boolean) C62000qj.A02.A03.invoke()).booleanValue()) {
            C61480nO A002 = 0nY.A00();
            Runnable runnable = this.A00;
            0qQ.A0B(runnable, 1);
            A002.ATE(new 0vX(373005541, runnable));
        } else {
            this.A00.run();
        }
        AnonymousClass0fD.A0A(2059867593, A03);
    }
}
