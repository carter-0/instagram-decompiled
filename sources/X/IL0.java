package X;

public final class IL0 implements 2IR {
    public final /* synthetic */ AnonymousClass59N A00;
    public final /* synthetic */ WKI A01;
    public final /* synthetic */ AnonymousClass59P A02;
    public final /* synthetic */ AnonymousClass59L A03;

    public IL0(AnonymousClass59N r1, WKI wki, AnonymousClass59P r3, AnonymousClass59L r4) {
        this.A03 = r4;
        this.A01 = wki;
        this.A02 = r3;
        this.A00 = r1;
    }

    public final void onFailure(Throwable th) {
        this.A00.DIa();
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        if (obj == null) {
            String A002 = Pxd.A00(29);
            0qQ.A0B(A002, 1);
            new Exception(A002, (Throwable) null);
            this.A00.DIa();
            return;
        }
        this.A03.A0N.put(this.A01.A00, obj);
        this.A02.D7S();
    }
}
