package X;

import com.instagram.user.model.Product;

/* renamed from: X.Wnr  reason: case insensitive filesystem */
public final class C20252Wnr implements Runnable {
    public final /* synthetic */ C19560Wbk A00;
    public final /* synthetic */ Product A01;

    public C20252Wnr(C19560Wbk wbk, Product product) {
        this.A00 = wbk;
        this.A01 = product;
    }

    public final void run() {
        AnonymousClass3AS r2 = this.A00.A00.mRecyclerView.A0C;
        r2.getClass();
        WEV wev = new WEV(this);
        if (!r2.A0L()) {
            wev.CvT();
        } else {
            r2.A05.add(wev);
        }
    }
}
