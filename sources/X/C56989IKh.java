package X;

/* renamed from: X.IKh  reason: case insensitive filesystem */
public final class C56989IKh implements AnonymousClass6NN {
    public final /* synthetic */ AnonymousClass6NN A00;
    public final /* synthetic */ HEV A01;

    public C56989IKh(AnonymousClass6NN r1, HEV hev) {
        this.A01 = hev;
        this.A00 = r1;
    }

    public final void onFailure(Throwable th) {
        this.A01.A05();
        AnonymousClass6NN r0 = this.A00;
        if (r0 != null) {
            r0.onFailure(th);
        }
    }

    public final void onSuccess() {
        this.A01.A04();
        AnonymousClass6NN r0 = this.A00;
        if (r0 != null) {
            r0.onSuccess();
        }
    }
}
