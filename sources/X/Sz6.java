package X;

public final class Sz6 implements C3736596k {
    public final /* synthetic */ Ri7 A00;
    public final /* synthetic */ String A01;

    public Sz6(Ri7 ri7, String str) {
        this.A00 = ri7;
        this.A01 = str;
    }

    public final void onFailure(Exception exc) {
        0qQ.A0B(exc, 0);
        StringBuilder A1A = AnonymousClass7TE.A1A();
        Pxg.A1R(A1A, "API_ERROR: ", exc);
        A1A.append(':');
        String A0l = AnonymousClass7TF.A0l(exc.getMessage(), A1A);
        String str = this.A01;
        0qQ.A0A(str);
        0qQ.A0B(A0l, 0);
        1xC.A01.A00(new C50261FVs(A0l, AnonymousClass05K.A0C, str));
    }
}
