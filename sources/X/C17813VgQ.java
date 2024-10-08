package X;

/* renamed from: X.VgQ  reason: case insensitive filesystem */
public final class C17813VgQ {
    public final /* synthetic */ XBR A00;
    public final /* synthetic */ C18660VwH A01;
    public final /* synthetic */ C14965UHd A02;

    public C17813VgQ(XBR xbr, C18660VwH vwH, C14965UHd uHd) {
        this.A01 = vwH;
        this.A00 = xbr;
        this.A02 = uHd;
    }

    public final void A00(Throwable th) {
        C18660VwH vwH = this.A01;
        vwH.A0L.DD3(7);
        vwH.A0J.A04(this.A02);
        vwH.A0G.post(new C20129Wlp(this, th));
        vwH.A0W = false;
    }
}
