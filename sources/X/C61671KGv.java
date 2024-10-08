package X;

/* renamed from: X.KGv  reason: case insensitive filesystem */
public final class C61671KGv extends 2Cn {
    public final /* synthetic */ MTW A00;

    public final void onFail(Exception exc) {
        0qQ.A0B(exc, 0);
        this.A00.onFailure(exc);
    }

    public C61671KGv(MTW mtw) {
        this.A00 = mtw;
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        this.A00.Doh(JTQ.A0i(obj));
    }
}
