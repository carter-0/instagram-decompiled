package X;

import android.view.View;
import com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;

/* renamed from: X.Amw  reason: case insensitive filesystem */
public final class C41012Amw implements Runnable {
    public final /* synthetic */ View A00;
    public final /* synthetic */ TargetViewSizeProvider A01;

    public C41012Amw(View view, TargetViewSizeProvider targetViewSizeProvider) {
        this.A00 = view;
        this.A01 = targetViewSizeProvider;
    }

    public final void run() {
        View view = this.A00;
        int height = view.getHeight();
        int i = ((NineSixteenLayoutConfigImpl) this.A01).A0A;
        if (i >= height) {
            0nA.A0T(view, (i - height) / 2);
        }
    }
}
