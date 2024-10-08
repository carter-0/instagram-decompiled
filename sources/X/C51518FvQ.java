package X;

import android.view.View;
import com.instagram.common.ui.base.IgFrameLayout;

/* renamed from: X.FvQ  reason: case insensitive filesystem */
public final class C51518FvQ implements Runnable {
    public final /* synthetic */ View A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ IgFrameLayout A02;
    public final /* synthetic */ C2367234v A03;

    public C51518FvQ(View view, View view2, IgFrameLayout igFrameLayout, C2367234v r4) {
        this.A03 = r4;
        this.A00 = view;
        this.A02 = igFrameLayout;
        this.A01 = view2;
    }

    public final void run() {
        C2367234v r1 = this.A03;
        if (r1.A02) {
            r1.A02 = false;
            View view = this.A00;
            view.setOnClickListener((View.OnClickListener) null);
            this.A02.removeView(view);
            C294975nL A012 = C294975nL.A01(this.A01, 0);
            A012.A0G();
            C294975nL A0E = A012.A0A().A0E(C71392co.A03(4.0d, 15.0d));
            A0E.A0J(0.0f);
            A0E.A0H();
        }
    }
}
