package X;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ImageView;

/* renamed from: X.LYz  reason: case insensitive filesystem */
public final class C64299LYz implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ float A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ ImageView A02;
    public final /* synthetic */ AnonymousClass4WO A03;
    public final /* synthetic */ C255783ui A04;

    public C64299LYz(View view, ImageView imageView, AnonymousClass4WO r3, C255783ui r4, float f) {
        this.A03 = r3;
        this.A02 = imageView;
        this.A01 = view;
        this.A04 = r4;
        this.A00 = f;
    }

    public final void onGlobalLayout() {
        AnonymousClass4WN A012 = AnonymousClass4WO.A01(this.A03);
        if (A012.A00()) {
            ImageView imageView = this.A02;
            C51967G9n.A0y(imageView, this);
            View view = this.A01;
            0qQ.A0A(view);
            AnonymousClass4WO.A02(imageView, view, A012, this.A04, this.A00);
        }
    }
}
