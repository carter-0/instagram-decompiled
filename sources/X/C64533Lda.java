package X;

/* renamed from: X.Lda  reason: case insensitive filesystem */
public final class C64533Lda implements X6K {
    public final int A00;
    public final Object A01;

    public C64533Lda(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void onError(Throwable th) {
        switch (this.A00) {
            case 3:
                if (th == null) {
                    throw AnonymousClass7TE.A0y();
                }
                break;
            case 4:
                if (th == null) {
                    throw AnonymousClass7TE.A0y();
                }
                break;
            default:
                return;
        }
        C45891D9u.A02((C46215DQt) this.A01, th);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        switch (this.A00) {
            case 3:
            case 4:
                C46215DQt dQt = (C46215DQt) this.A01;
                C45891D9u.A01(dQt, obj);
                C45891D9u.A00(dQt);
                return;
            default:
                C301205yj.A00(obj, (C249523jv) this.A01);
                return;
        }
    }
}
