package X;

import android.graphics.Matrix;
import android.graphics.RectF;
import com.instagram.common.ui.base.IgSimpleImageView;

/* renamed from: X.M6p  reason: case insensitive filesystem */
public final class C65978M6p implements Runnable {
    public final /* synthetic */ IgSimpleImageView A00;
    public final /* synthetic */ C60006JdF A01;

    public C65978M6p(IgSimpleImageView igSimpleImageView, C60006JdF jdF) {
        this.A00 = igSimpleImageView;
        this.A01 = jdF;
    }

    public final void run() {
        IgSimpleImageView igSimpleImageView = this.A00;
        Matrix A0U = AnonymousClass7TE.A0U();
        C60006JdF jdF = this.A01;
        float intrinsicWidth = (float) jdF.getIntrinsicWidth();
        float f = (float) jdF.A04;
        A0U.setRectToRect(new RectF(0.0f, 0.0f, intrinsicWidth, f), new RectF(0.0f, 0.0f, AnonymousClass7TE.A02(igSimpleImageView), f), Matrix.ScaleToFit.CENTER);
        igSimpleImageView.setImageMatrix(A0U);
        igSimpleImageView.setImageDrawable(jdF);
    }
}
