package X;

import android.view.View;

/* renamed from: X.6Mb  reason: invalid class name and case insensitive filesystem */
public final class C306416Mb implements Runnable {
    public final /* synthetic */ float A00;
    public final /* synthetic */ float A01;
    public final /* synthetic */ View A02;
    public final /* synthetic */ boolean A03;

    public C306416Mb(View view, float f, float f2, boolean z) {
        this.A02 = view;
        this.A00 = f;
        this.A01 = f2;
        this.A03 = z;
    }

    public final void run() {
        View view = this.A02;
        view.setX(this.A00);
        view.setY(this.A01);
        if (this.A03) {
            view.setRotation(0.0f);
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
        }
    }
}
