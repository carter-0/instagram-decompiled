package X;

import com.facebook.locationsharing.core.models.LiveLocationSharer;

/* renamed from: X.WpD  reason: case insensitive filesystem */
public final class C20318WpD implements Runnable {
    public final /* synthetic */ C13919TlL A00;
    public final /* synthetic */ WIM A01;
    public final /* synthetic */ LiveLocationSharer A02;
    public final /* synthetic */ String A03;

    public C20318WpD(C13919TlL tlL, WIM wim, LiveLocationSharer liveLocationSharer, String str) {
        this.A01 = wim;
        this.A03 = str;
        this.A02 = liveLocationSharer;
        this.A00 = tlL;
    }

    public final void run() {
        WIM wim = this.A01;
        C327267Ac r5 = wim.A00;
        String str = this.A03;
        r5.FMc(new C18978WFf(this.A00, wim.A01), this.A02, str);
    }
}
