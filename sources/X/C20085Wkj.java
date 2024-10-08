package X;

import android.graphics.Rect;
import android.view.View;
import android.widget.ImageView;
import com.instagram.android.R;

/* renamed from: X.Wkj  reason: case insensitive filesystem */
public final class C20085Wkj implements Runnable {
    public final /* synthetic */ C17649Vbf A00;

    public C20085Wkj(C17649Vbf vbf) {
        this.A00 = vbf;
    }

    public final void run() {
        Rect rect = new Rect();
        C17649Vbf vbf = this.A00;
        ImageView imageView = vbf.A01;
        imageView.getHitRect(rect);
        View view = vbf.A00;
        int i = -view.getResources().getDimensionPixelSize(R.dimen.ad4ad_button_bottom_margin);
        rect.inset(i, i);
        C66581MXm.A18(rect, imageView, view);
    }
}
