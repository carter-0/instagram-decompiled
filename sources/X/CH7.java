package X;

public final class CH7 extends 1P0 {
    public final /* synthetic */ 0sP A00;

    public CH7(0sP r1) {
        this.A00 = r1;
    }

    public final void onFail(C268654dm r4) {
        int A0D = AnonymousClass7TG.A0D(r4, -579704926);
        CH7.super.onFail(r4);
        this.A00.invoke((Object) null);
        AnonymousClass0fD.A0A(-1306173542, A0D);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = AnonymousClass0fD.A03(-679600576);
        CE6 ce6 = (CE6) obj;
        int A0D = AnonymousClass7TG.A0D(ce6, -920990460);
        CH7.super.onSuccess(ce6);
        0sP r1 = this.A00;
        C60915JtZ jtZ = ce6.A00;
        if (jtZ == null) {
            C41845B3m.A0v();
            throw AnonymousClass00P.createAndThrow();
        }
        r1.invoke(jtZ);
        AnonymousClass0fD.A0A(-578944553, A0D);
        AnonymousClass0fD.A0A(901332954, A03);
    }
}
