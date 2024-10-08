package X;

import android.view.ViewTreeObserver;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.IDx  reason: case insensitive filesystem */
public final class C56826IDx implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ float A00;
    public final /* synthetic */ float A01;
    public final /* synthetic */ IgImageView A02;

    public C56826IDx(IgImageView igImageView, float f, float f2) {
        this.A02 = igImageView;
        this.A00 = f;
        this.A01 = f2;
    }

    public final void onGlobalLayout() {
        IgImageView igImageView = this.A02;
        C51967G9n.A0y(igImageView, this);
        igImageView.setPivotX((float) igImageView.getMeasuredWidth());
        igImageView.setPivotY((float) igImageView.getMeasuredHeight());
        igImageView.setRotation(this.A00);
        float f = this.A01;
        igImageView.setScaleX(f);
        igImageView.setScaleY(f);
    }
}
