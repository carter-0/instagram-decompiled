package X;

public final class NM5 extends 1P0 {
    public final /* synthetic */ C74551Pwk A00;
    public final /* synthetic */ C74551Pwk A01;
    public final /* synthetic */ 1kR A02;
    public final /* synthetic */ C66171kO A03;
    public final /* synthetic */ AnonymousClass3Q2 A04;

    public NM5(C74551Pwk pwk, C74551Pwk pwk2, 1kR r3, C66171kO r4, AnonymousClass3Q2 r5) {
        this.A00 = pwk;
        this.A03 = r4;
        this.A02 = r3;
        this.A04 = r5;
        this.A01 = pwk2;
    }

    public final void onFail(C268654dm r5) {
        int A0D = AnonymousClass7TG.A0D(r5, 559883455);
        C74551Pwk pwk = this.A00;
        C74551Pwk.A01(pwk);
        pwk.DTM(C71115Od8.A01(r5, C71115Od8.A00), (String) null);
        AnonymousClass0fD.A0A(852918018, A0D);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A032 = AnonymousClass0fD.A03(1851569455);
        NHV nhv = (NHV) obj;
        int A0D = AnonymousClass7TG.A0D(nhv, 1313865032);
        String str = nhv.A01;
        if (str != null) {
            C66171kO r3 = this.A03;
            r3.A03 = str;
            r3.A01 = null;
            1kR.A00(this.A01, this.A02, r3, this.A04, str);
            AnonymousClass0fD.A0A(-843382564, A0D);
            AnonymousClass0fD.A0A(507810892, A032);
            return;
        }
        0qQ.A0F("collectionId");
        throw AnonymousClass00P.createAndThrow();
    }
}
