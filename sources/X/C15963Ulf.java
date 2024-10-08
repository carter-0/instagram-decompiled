package X;

/* renamed from: X.Ulf  reason: case insensitive filesystem */
public final class C15963Ulf extends C324596za {
    public final C324596za A00;
    public final /* synthetic */ C18459Vs8 A01;

    public C15963Ulf(C324596za r1, C18459Vs8 vs8) {
        this.A01 = vs8;
        this.A00 = r1;
    }

    public final void onFail(C268654dm r3) {
        int A03 = AnonymousClass0fD.A03(-671151561);
        this.A00.onFail(r3);
        AnonymousClass0fD.A0A(1172234905, A03);
    }

    public final void onFailInBackground(C268654dm r3) {
        int A03 = AnonymousClass0fD.A03(-1924370006);
        this.A00.onFailInBackground(r3);
        AnonymousClass0fD.A0A(1091418131, A03);
    }

    public final void onFinish() {
        int A03 = AnonymousClass0fD.A03(-1955313401);
        this.A00.onFinish();
        AnonymousClass0fD.A0A(-1634637403, A03);
    }

    public final void onStart() {
        int A03 = AnonymousClass0fD.A03(-331932548);
        this.A00.onStart();
        AnonymousClass0fD.A0A(600694363, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = AnonymousClass0fD.A03(1353903062);
        UY7 uy7 = (UY7) obj;
        int A032 = AnonymousClass0fD.A03(1776177059);
        C18459Vs8 vs8 = this.A01;
        vs8.A01 = uy7.A05;
        vs8.A00 = uy7.A04;
        this.A00.onSuccess(uy7);
        AnonymousClass0fD.A0A(1580671326, A032);
        AnonymousClass0fD.A0A(-1854217297, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
        int A03 = AnonymousClass0fD.A03(-2015610747);
        int A032 = AnonymousClass0fD.A03(-1453076502);
        this.A00.onSuccessInBackground(obj);
        AnonymousClass0fD.A0A(234973500, A032);
        AnonymousClass0fD.A0A(1676821253, A03);
    }
}
