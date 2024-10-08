package X;

import android.view.ViewGroup;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;

/* renamed from: X.PbX  reason: case insensitive filesystem */
public final class C73374PbX implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C68079Mzk A02;
    public final /* synthetic */ boolean A03;

    public C73374PbX(C68079Mzk mzk, int i, int i2, boolean z) {
        this.A02 = mzk;
        this.A01 = i;
        this.A00 = i2;
        this.A03 = z;
    }

    public final void run() {
        MediaFrameLayout mediaFrameLayout = this.A02.A0D;
        0qQ.A07(mediaFrameLayout);
        int i = this.A01;
        int i2 = this.A00;
        boolean z = this.A03;
        ViewGroup.LayoutParams layoutParams = mediaFrameLayout.getLayoutParams();
        0qQ.A0C(layoutParams, AnonymousClass000.A00(18));
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        int i3 = marginLayoutParams.topMargin;
        if (i3 != i || marginLayoutParams.bottomMargin != i2) {
            if (!z) {
                marginLayoutParams.bottomMargin = i2;
                marginLayoutParams.topMargin = i;
                mediaFrameLayout.setLayoutParams(marginLayoutParams);
                return;
            }
            C67683MsL msL = new C67683MsL(mediaFrameLayout, marginLayoutParams, i3, i, marginLayoutParams.bottomMargin, i2);
            msL.setDuration(300);
            mediaFrameLayout.startAnimation(msL);
        }
    }
}
