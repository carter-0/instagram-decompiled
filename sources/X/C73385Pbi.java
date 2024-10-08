package X;

import android.view.View;
import com.instagram.common.ui.base.IgSimpleImageView;

/* renamed from: X.Pbi  reason: case insensitive filesystem */
public final class C73385Pbi implements Runnable {
    public final /* synthetic */ float A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ IgSimpleImageView A02;
    public final /* synthetic */ Runnable A03;
    public final /* synthetic */ C62320sa A04;

    public C73385Pbi(View view, IgSimpleImageView igSimpleImageView, Runnable runnable, C62320sa r4, float f) {
        this.A01 = view;
        this.A02 = igSimpleImageView;
        this.A00 = f;
        this.A03 = runnable;
        this.A04 = r4;
    }

    public final void run() {
        int[] iArr = new int[2];
        this.A01.getLocationInWindow(iArr);
        int[] iArr2 = new int[2];
        IgSimpleImageView igSimpleImageView = this.A02;
        igSimpleImageView.getLocationInWindow(iArr2);
        float f = this.A00;
        C66580MXl.A1D(C66581MXm.A0E(igSimpleImageView.animate(), 0.0f).translationXBy(((float) (iArr[0] - iArr2[0])) - f).translationYBy(((float) (iArr[1] - iArr2[1])) - f).setDuration(250), new C73314PaZ(igSimpleImageView, this.A03, this.A04));
    }
}
