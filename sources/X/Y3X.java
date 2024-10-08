package X;

import com.google.common.collect.ImmutableList;

public final /* synthetic */ class Y3X implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ C21406XaE A03;

    public /* synthetic */ Y3X(C21406XaE xaE, int i, long j, long j2) {
        this.A03 = xaE;
        this.A00 = i;
        this.A01 = j;
        this.A02 = j2;
    }

    public final void run() {
        C21484Xcb xcb;
        C21406XaE xaE = this.A03;
        int i = this.A00;
        long j = this.A01;
        long j2 = this.A02;
        C22080Xv6 xv6 = (C22080Xv6) xaE.A02;
        ImmutableList immutableList = xv6.A06.A01;
        if (immutableList.isEmpty()) {
            xcb = null;
        } else {
            xcb = (C21484Xcb) SA7.A00(immutableList);
        }
        C21490Xch A012 = C22080Xv6.A01(xv6, xcb);
        xv6.A02(new C22065Xur(A012, i, j, j2), A012, 1006);
    }
}
