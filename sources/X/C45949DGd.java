package X;

/* renamed from: X.DGd  reason: case insensitive filesystem */
public final class C45949DGd implements 2IR {
    public boolean A00;
    public final /* synthetic */ 1IX A01;

    public final synchronized void onFailure(Throwable th) {
        0qQ.A0B(th, 0);
        if (!this.A00) {
            this.A00 = true;
            1IX r2 = this.A01;
            C297815sO A0c = C41845B3m.A0c(new CTf(th));
            if (r2 != null && r2.isActive()) {
                r2.resumeWith(A0c);
            }
        }
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        synchronized (this) {
            if (!this.A00) {
                this.A00 = true;
                if (obj != null) {
                    1IX r2 = this.A01;
                    C239793Ih A0d = C41845B3m.A0d(obj);
                    if (r2 != null && r2.isActive()) {
                        r2.resumeWith(A0d);
                    }
                } else {
                    throw AnonymousClass7TE.A0y();
                }
            }
        }
    }

    public C45949DGd(1IX r1) {
        this.A01 = r1;
    }

    public C45949DGd() {
    }
}
