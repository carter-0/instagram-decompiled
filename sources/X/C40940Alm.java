package X;

import android.graphics.Matrix;
import android.view.TextureView;

/* renamed from: X.Alm  reason: case insensitive filesystem */
public final /* synthetic */ class C40940Alm implements Runnable {
    public final /* synthetic */ Matrix A00;
    public final /* synthetic */ C345707tx A01;

    public /* synthetic */ C40940Alm(Matrix matrix, C345707tx r2) {
        this.A01 = r2;
        this.A00 = matrix;
    }

    public final void run() {
        C345707tx r0 = this.A01;
        Matrix matrix = this.A00;
        TextureView textureView = r0.A06;
        if (textureView != null) {
            textureView.setTransform(matrix);
        }
    }
}
