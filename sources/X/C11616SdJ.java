package X;

/* renamed from: X.SdJ  reason: case insensitive filesystem */
public final class C11616SdJ implements C13683Tez {
    public final /* synthetic */ 1IX A00;

    public final /* bridge */ /* synthetic */ void onResult(Object obj) {
        0qQ.A0B(obj, 0);
        1IX r1 = this.A00;
        if (r1.isActive()) {
            r1.resumeWith(obj);
        }
    }

    public C11616SdJ(1IX r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ void DCo(Object obj) {
        Throwable th = (Throwable) obj;
        0qQ.A0B(th, 0);
        1IX r1 = this.A00;
        if (r1.isActive()) {
            r1.resumeWith(JTO.A1B(th));
        }
    }
}
