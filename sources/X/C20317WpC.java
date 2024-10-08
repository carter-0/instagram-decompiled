package X;

import java.util.List;

/* renamed from: X.WpC  reason: case insensitive filesystem */
public final class C20317WpC implements Runnable {
    public final /* synthetic */ C13919TlL A00;
    public final /* synthetic */ WIM A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ List A03;

    public C20317WpC(C13919TlL tlL, WIM wim, String str, List list) {
        this.A01 = wim;
        this.A02 = str;
        this.A03 = list;
        this.A00 = tlL;
    }

    public final void run() {
        WIM wim = this.A01;
        wim.A00.FMd(new C18978WFf(this.A00, wim.A01), this.A02, this.A03);
    }
}
