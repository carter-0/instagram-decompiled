package X;

import com.facebook.litho.widget.LithoScrollView;

/* renamed from: X.Igm  reason: case insensitive filesystem */
public final /* synthetic */ class C57807Igm implements Runnable {
    public final /* synthetic */ GIM A00;
    public final /* synthetic */ LithoScrollView A01;

    public /* synthetic */ C57807Igm(GIM gim, LithoScrollView lithoScrollView) {
        this.A01 = lithoScrollView;
        this.A00 = gim;
    }

    public final void run() {
        this.A01.setScrollY(this.A00.A00);
    }
}
