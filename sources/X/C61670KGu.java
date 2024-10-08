package X;

/* renamed from: X.KGu  reason: case insensitive filesystem */
public final class C61670KGu extends 2Cn {
    public final /* synthetic */ 1IX A00;

    public final void onFail(Exception exc) {
        0qQ.A0B(exc, 0);
        this.A00.resumeWith(C41845B3m.A0c(exc));
        0wb.A03(C273654mx.A00(1218), "Failed converting Media to Medium");
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        0qQ.A0B(obj, 0);
        this.A00.resumeWith(C41845B3m.A0d(obj));
    }

    public C61670KGu(1IX r1) {
        this.A00 = r1;
    }
}
