package X;

public abstract class JZJ extends C324596za {
    public int A00 = hashCode();
    public final Object A01;
    public final /* synthetic */ JZH A02;

    public JZJ(JZH jzh, Object obj) {
        this.A02 = jzh;
        this.A01 = obj;
    }

    public final void onFailInBackground(C268654dm r6) {
        String str;
        Throwable A012;
        int A0D = AnonymousClass7TG.A0D(r6, -1654507659);
        C66542MVw mVw = this.A02.A03;
        Object obj = this.A01;
        int i = this.A00;
        AnonymousClass1XV r0 = (AnonymousClass1XV) r6.A00();
        if ((r0 == null || (str = ((AnonymousClass1XT) r0).getErrorMessage()) == null) && ((A012 = r6.A01()) == null || (str = A012.getMessage()) == null)) {
            str = "null_response";
        }
        mVw.DTq(str, obj, i);
        AnonymousClass0fD.A0A(-2129168281, A0D);
    }

    public final void onFinish() {
        int A03 = AnonymousClass0fD.A03(1395896285);
        this.A02.A03.DeV(this.A01, this.A00);
        AnonymousClass0fD.A0A(-471316677, A03);
    }

    public final void onStart() {
        int A03 = AnonymousClass0fD.A03(588008764);
        this.A02.A03.Del(this.A01, this.A00);
        AnonymousClass0fD.A0A(-734480273, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
        int A03 = AnonymousClass0fD.A03(491710892);
        1XU r7 = (AnonymousClass1XV) obj;
        int A0D = AnonymousClass7TG.A0D(r7, -1136066491);
        this.A02.A03.DTr(this.A00, this.A01, r7.CPt());
        AnonymousClass0fD.A0A(-1709567310, A0D);
        AnonymousClass0fD.A0A(1945203860, A03);
    }
}
