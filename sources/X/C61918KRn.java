package X;

/* renamed from: X.KRn  reason: case insensitive filesystem */
public final class C61918KRn extends C324596za {
    public final /* synthetic */ int A00;
    public final /* synthetic */ LFH A01;
    public final /* synthetic */ C63866L9v A02;

    public C61918KRn(LFH lfh, C63866L9v l9v, int i) {
        this.A02 = l9v;
        this.A01 = lfh;
        this.A00 = i;
    }

    public final void onFail(C268654dm r7) {
        int A0D = AnonymousClass7TG.A0D(r7, -255566046);
        this.A02.A00.A0B(new C63736L4u(4, new JV5((CGO) r7.A00(), this.A01)));
        AnonymousClass0fD.A0A(1967959154, A0D);
    }

    public final void onFailInBackground(C268654dm r8) {
        String str;
        Throwable A012;
        int A03 = AnonymousClass0fD.A03(760440158);
        0qQ.A0B(r8, 0);
        L22 l22 = this.A02.A04;
        String str2 = this.A01.A01;
        int i = this.A00;
        1XP r0 = (1XP) r8.A00();
        if ((r0 == null || (str = r0.getErrorMessage()) == null) && ((A012 = r8.A01()) == null || (str = A012.getMessage()) == null)) {
            str = "null_response";
        }
        AnonymousClass7TF.A1B(str2, 0, str);
        JTS.A0K(l22.A00.A0A).A0C(str2, i, str);
        AnonymousClass0fD.A0A(20633977, A03);
    }

    public final void onFinish() {
        int A03 = AnonymousClass0fD.A03(1564932732);
        this.A02.A00.A0B(new C63736L4u(2, new JV5((CGO) null, this.A01)));
        AnonymousClass0fD.A0A(1518863576, A03);
    }

    public final void onStart() {
        int A03 = AnonymousClass0fD.A03(-1939911754);
        this.A02.A00.A0B(new C63736L4u(1, new JV5((CGO) null, this.A01)));
        AnonymousClass0fD.A0A(-683928513, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = AnonymousClass0fD.A03(1957328321);
        CGO cgo = (CGO) obj;
        int A032 = AnonymousClass0fD.A03(1797045994);
        0qQ.A0B(cgo, 0);
        C63866L9v l9v = this.A02;
        L22 l22 = l9v.A04;
        LFH lfh = this.A01;
        String str = lfh.A01;
        boolean CPt = cgo.CPt();
        int size = cgo.A05.size();
        0qQ.A0B(str, 0);
        JTS.A0K(l22.A00.A0A).A0H(str, CPt, size);
        l9v.A00.A0B(new C63736L4u(3, new JV5(cgo, lfh)));
        AnonymousClass0fD.A0A(-2013200579, A032);
        AnonymousClass0fD.A0A(1857749932, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
        int A03 = AnonymousClass0fD.A03(-1830028495);
        CGO cgo = (CGO) obj;
        int A032 = AnonymousClass0fD.A03(1751366673);
        0qQ.A0B(cgo, 0);
        L22 l22 = this.A02.A04;
        String str = this.A01.A01;
        int i = this.A00;
        boolean CPt = cgo.CPt();
        0qQ.A0B(str, 0);
        JTS.A0K(l22.A00.A0A).A0D(str, i, CPt);
        AnonymousClass0fD.A0A(1912590059, A032);
        AnonymousClass0fD.A0A(-1759180950, A03);
    }
}
