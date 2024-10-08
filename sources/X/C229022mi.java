package X;

/* renamed from: X.2mi  reason: invalid class name and case insensitive filesystem */
public abstract class C229022mi implements 2IR {
    public boolean A00;

    public void A00(AnonymousClass3JD r5) {
        C254583si r52 = (C254583si) r5;
        AnonymousClass3JC r3 = new AnonymousClass3JC(r52.A00, r52.A01);
        boolean isOk = r3.isOk();
        1P0 r2 = ((C229012mh) this).A00;
        if (!isOk) {
            r2.onFailInBackground(new C268674do(r3));
        } else {
            r2.onSuccessInBackground(r3);
        }
        1TZ.A00().A01(new C2593741l(r2, r3));
    }

    /* renamed from: A01 */
    public final synchronized void onSuccess(AnonymousClass3JD r3) {
        if (!this.A00) {
            this.A00 = true;
            if (r3 != null) {
                A00(r3);
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
    }

    public void A02(Throwable th) {
        1P0 r2 = ((C229012mh) this).A00;
        r2.onFailInBackground(new C268664dn(th));
        1TZ.A00().A01(new C51363Fsv(r2, th));
    }

    public final synchronized void onFailure(Throwable th) {
        0qQ.A0B(th, 0);
        if (!this.A00) {
            this.A00 = true;
            A02(th);
        }
    }
}
