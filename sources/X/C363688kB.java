package X;

/* renamed from: X.8kB  reason: invalid class name and case insensitive filesystem */
public final class C363688kB implements C363768kJ {
    public final /* synthetic */ C363398jf A00;
    public final /* synthetic */ C363678kA A01;

    public C363688kB(C363398jf r1, C363678kA r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void onFailure() {
        11Z.A02(new C41067Anp(this.A00, this.A01));
    }

    public final void onSuccess() {
        11Z.A02(new AnonymousClass5w7(this.A00, this.A01));
    }
}
