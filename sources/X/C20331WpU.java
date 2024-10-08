package X;

import android.view.View;

/* renamed from: X.WpU  reason: case insensitive filesystem */
public final class C20331WpU implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ C14165Tr3 A02;
    public final /* synthetic */ C307786Rm A03;
    public final /* synthetic */ 2el A04;

    public C20331WpU(View view, C14165Tr3 tr3, C307786Rm r3, 2el r4, int i) {
        this.A04 = r4;
        this.A01 = view;
        this.A02 = tr3;
        this.A03 = r3;
        this.A00 = i;
    }

    public final void run() {
        this.A04.A05(this.A01, C14165Tr3.A00(this.A02, this.A03, this.A00));
    }
}
