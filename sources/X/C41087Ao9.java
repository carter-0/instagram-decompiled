package X;

import android.view.View;
import android.view.ViewGroup;
import com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;

/* renamed from: X.Ao9  reason: case insensitive filesystem */
public final class C41087Ao9 implements Runnable {
    public final /* synthetic */ View A00;
    public final /* synthetic */ TargetViewSizeProvider A01;

    public C41087Ao9(View view, TargetViewSizeProvider targetViewSizeProvider) {
        this.A00 = view;
        this.A01 = targetViewSizeProvider;
    }

    public final void run() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        View view = this.A00;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            NineSixteenLayoutConfigImpl nineSixteenLayoutConfigImpl = (NineSixteenLayoutConfigImpl) this.A01;
            int i = nineSixteenLayoutConfigImpl.A0H - nineSixteenLayoutConfigImpl.A0I;
            int A02 = AnonymousClass7TG.A02(view.getContext());
            int height = (i - view.getHeight()) - A02;
            if (height < 0) {
                height = 0;
            }
            marginLayoutParams.bottomMargin = height;
            view.setLayoutParams(marginLayoutParams);
            view.setPadding(0, A02, 0, 0);
        }
    }
}
