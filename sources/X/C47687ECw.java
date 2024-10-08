package X;

/* renamed from: X.ECw  reason: case insensitive filesystem */
public final class C47687ECw extends 1P0 {
    public final String A00;
    public final String A01;

    public C47687ECw(String str, String str2) {
        this.A01 = str;
        this.A00 = str2;
    }

    public final void onFail(C268654dm r7) {
        int A03 = AnonymousClass0fD.A03(-2031911770);
        1xC.A01.A00(new C50262FVt(this.A01, AnonymousClass05K.A15, Dbb.A0b(r7)));
        AnonymousClass0fD.A0A(-2108915216, A03);
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.1xE, java.lang.Object] */
    public final void onFinish() {
        int A03 = AnonymousClass0fD.A03(950062563);
        1xC.A01.A00(new Object());
        AnonymousClass0fD.A0A(277773874, A03);
    }

    public final void onStart() {
        int A03 = AnonymousClass0fD.A03(-1832178710);
        1xC.A01.A00(new C50255FVm(this.A00));
        AnonymousClass0fD.A0A(-1587972338, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        1xC r4;
        C67841xE fVu;
        int A03 = AnonymousClass0fD.A03(-937154622);
        DwX dwX = (DwX) obj;
        int A032 = AnonymousClass0fD.A03(566002071);
        if ((dwX instanceof EM6) || dwX.A04) {
            r4 = 1xC.A01;
            fVu = new C50263FVu((C47325Dus) null, this.A01, this.A00);
        } else {
            r4 = 1xC.A01;
            fVu = new C50262FVt(this.A01, AnonymousClass05K.A15, dwX.getErrorMessage());
        }
        r4.A00(fVu);
        AnonymousClass0fD.A0A(-506244053, A032);
        AnonymousClass0fD.A0A(885593177, A03);
    }
}
