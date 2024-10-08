package X;

/* renamed from: X.ECo  reason: case insensitive filesystem */
public final class C47679ECo extends 1P0 {
    public final /* synthetic */ C46656Dib A00;

    public C47679ECo(C46656Dib dib) {
        this.A00 = dib;
    }

    public final void onFail(C268654dm r3) {
        int A03 = AnonymousClass0fD.A03(1272237474);
        C49952FGh.A07(this.A00, r3);
        AnonymousClass0fD.A0A(-504620455, A03);
    }

    public final void onFinish() {
        int A03 = AnonymousClass0fD.A03(-6956792);
        Dbb.A0x(this.A00);
        AnonymousClass0fD.A0A(-1399182636, A03);
    }

    public final void onStart() {
        int A03 = AnonymousClass0fD.A03(405000851);
        Dbb.A0y(this.A00);
        AnonymousClass0fD.A0A(1124345773, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = AnonymousClass0fD.A03(-1842443580);
        int A032 = AnonymousClass0fD.A03(-896140017);
        this.A00.requireView().post(new C51394FtQ((DwW) obj, this));
        AnonymousClass0fD.A0A(596130800, A032);
        AnonymousClass0fD.A0A(-1141741925, A03);
    }
}
