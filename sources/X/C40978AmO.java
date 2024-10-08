package X;

/* renamed from: X.AmO  reason: case insensitive filesystem */
public final class C40978AmO implements Runnable {
    public final /* synthetic */ AWD A00;
    public final /* synthetic */ AnonymousClass9GD A01;

    public C40978AmO(AWD awd, AnonymousClass9GD r2) {
        this.A00 = awd;
        this.A01 = r2;
    }

    public final void run() {
        AnonymousClass9GD r1 = this.A01;
        if (r1.A05) {
            this.A00.A01.A07();
            return;
        }
        try {
            AWD awd = this.A00;
            awd.A01.A0C(awd.A00.Ezj(r1));
        } catch (AnonymousClass9GG e) {
            e = e;
            boolean z = e.getCause() instanceof Exception;
            AnonymousClass9GD r12 = this.A00.A01;
            if (z) {
                e = (Exception) e.getCause();
            }
            r12.A0B(e);
        } catch (Exception e2) {
            this.A00.A01.A0B(e2);
        }
    }
}
