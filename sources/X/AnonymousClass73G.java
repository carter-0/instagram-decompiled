package X;

import android.os.Handler;

/* renamed from: X.73G  reason: invalid class name */
public final class AnonymousClass73G implements 2IR {
    public final C324596za A00;
    public final C324366zA A01;
    public final 0sP A02;

    public final void onFailure(Throwable th) {
        0qQ.A0B(th, 0);
        this.A00.onFailInBackground(new C268664dn(th));
        ((Handler) B6A.A00.getValue()).post(new C20216WnG(this, th));
    }

    /* renamed from: A00 */
    public final void onSuccess(AnonymousClass3JD r4) {
        AnonymousClass3JC r42 = (AnonymousClass3JC) r4;
        if (r42 == null) {
            onFailure(new IllegalStateException("Unable to get data from response"));
            return;
        }
        AnonymousClass1XV r2 = (AnonymousClass1XV) this.A02.invoke(r42);
        this.A00.onSuccessInBackground(r2);
        ((Handler) B6A.A00.getValue()).post(new C14185TrP(r2, this, r42));
    }

    public AnonymousClass73G(C324596za r1, C324366zA r2, 0sP r3) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = r3;
    }
}
