package X;

/* renamed from: X.FTw  reason: case insensitive filesystem */
public final class C50216FTw implements C51895G6l {
    public final /* synthetic */ G7M A00;
    public final /* synthetic */ String A01;

    public C50216FTw(G7M g7m, String str) {
        this.A00 = g7m;
        this.A01 = str;
    }

    public final void Dp1(EV6 ev6) {
        this.A00.onAuthorizeSuccess(this.A01);
    }

    public final void onError(Throwable th) {
        this.A00.onAuthorizeFail();
    }
}
