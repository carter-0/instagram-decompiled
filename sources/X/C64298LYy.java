package X;

import android.view.ViewTreeObserver;
import com.instagram.common.ui.widget.imageview.RoundedCornerImageView;

/* renamed from: X.LYy  reason: case insensitive filesystem */
public final class C64298LYy implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ float A00;
    public final /* synthetic */ float A01;
    public final /* synthetic */ float A02;
    public final /* synthetic */ RoundedCornerImageView A03;

    public C64298LYy(RoundedCornerImageView roundedCornerImageView, float f, float f2, float f3) {
        this.A03 = roundedCornerImageView;
        this.A00 = f;
        this.A01 = f2;
        this.A02 = f3;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.instagram.common.ui.widget.imageview.RoundedCornerImageView, android.view.View] */
    public final void onGlobalLayout() {
        ? r1 = this.A03;
        C51967G9n.A0y(r1, this);
        r1.setPivotX((float) r1.getMeasuredWidth());
        r1.setPivotY((float) r1.getMeasuredHeight());
        r1.setRotation(this.A00);
        float f = this.A01;
        r1.setScaleX(f);
        r1.setScaleY(f);
        r1.setTranslationX(this.A02);
    }
}
