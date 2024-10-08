package X;

public final class M1O implements 1aV {
    public final /* synthetic */ C66487MTq A00;
    public final /* synthetic */ AnonymousClass630 A01;

    public M1O(C66487MTq mTq, AnonymousClass630 r2) {
        this.A00 = mTq;
        this.A01 = r2;
    }

    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        Boolean bool = (Boolean) obj;
        if (bool == null || !bool.booleanValue()) {
            this.A00.onFailure();
            return;
        }
        1Av r0 = this.A01.A03;
        long currentTimeMillis = System.currentTimeMillis();
        0xY A0p = AnonymousClass7TE.A0p(r0);
        A0p.E5c(AnonymousClass000.A00(5092), currentTimeMillis);
        A0p.apply();
        this.A00.onSuccess();
    }
}
