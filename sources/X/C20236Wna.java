package X;

/* renamed from: X.Wna  reason: case insensitive filesystem */
public final class C20236Wna implements Runnable {
    public final /* synthetic */ C15613Uff A00;
    public final /* synthetic */ C273664mz A01;

    public C20236Wna(C15613Uff uff, C273664mz r2) {
        this.A00 = uff;
        this.A01 = r2;
    }

    public final void run() {
        C15613Uff uff = this.A00;
        Dda dda = uff.A03;
        if (dda != null) {
            dda.A0E("profile_on_data");
        }
        C324366zA r2 = uff.A01.A03;
        r2.A00(AnonymousClass05K.A0C);
        C273664mz r1 = this.A01;
        r2.A07 = r1.A04;
        r2.A0A = r1.A07;
        uff.A02.A00(r1);
    }
}
