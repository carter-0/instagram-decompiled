package X;

import android.graphics.Bitmap;
import android.view.View;
import com.instagram.common.ui.widget.imageview.IgImageView;

public final class JYQ implements View.OnLayoutChangeListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Bitmap A01;
    public final /* synthetic */ C376529Ii A02;
    public final /* synthetic */ IgImageView A03;
    public final /* synthetic */ C59738JVw A04;
    public final /* synthetic */ C62320sa A05;

    public JYQ(Bitmap bitmap, C376529Ii r2, IgImageView igImageView, C59738JVw jVw, C62320sa r5, int i) {
        this.A03 = igImageView;
        this.A04 = jVw;
        this.A01 = bitmap;
        this.A00 = i;
        this.A02 = r2;
        this.A05 = r5;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        IgImageView igImageView = this.A03;
        igImageView.removeOnLayoutChangeListener(this);
        C59738JVw jVw = this.A04;
        jVw.A02 = null;
        Bitmap bitmap = this.A01;
        int i9 = this.A00;
        JXQ.A01(bitmap, this.A02, jVw, this.A05, i9, igImageView.getWidth(), igImageView.getHeight());
    }
}
