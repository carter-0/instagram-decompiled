package X;

public final class Y00 implements C225882f4 {
    public final /* synthetic */ YAE A00;
    public final /* synthetic */ C279254yK A01;
    public final /* synthetic */ String A02;

    public Y00(YAE yae, C279254yK r2, String str) {
        this.A01 = r2;
        this.A00 = yae;
        this.A02 = str;
    }

    public final void DCn(Exception exc) {
        this.A01.A02.post(new C22385Y1q(this));
    }

    public final /* bridge */ /* synthetic */ void onResult(Object obj) {
        this.A01.A02.post(new C22409Y2r(this, (C17731Vd0) obj));
    }
}
