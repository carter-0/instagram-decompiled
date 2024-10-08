package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;

public final class IE0 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C3254872q A02;
    public final /* synthetic */ C232712uI A03;

    public IE0(C3254872q r1, C232712uI r2, int i, int i2) {
        this.A03 = r2;
        this.A02 = r1;
        this.A01 = i;
        this.A00 = i2;
    }

    public final void onGlobalLayout() {
        float f;
        C3254872q r9 = this.A02;
        C51967G9n.A0y(r9.A03, this);
        C232712uI r1 = this.A03;
        int i = this.A01;
        int i2 = this.A00;
        MediaFrameLayout mediaFrameLayout = r9.A0G.A0T;
        float A022 = AnonymousClass7TE.A02(mediaFrameLayout) / AnonymousClass7TE.A03(mediaFrameLayout);
        View view = r9.A03;
        int width = view.getWidth();
        int height = view.getHeight();
        int i3 = r1.A05;
        int i4 = i3;
        int i5 = i3 * 2;
        int i6 = width - i5;
        int i7 = ((height - i) - i2) - i5;
        float f2 = (((float) i6) / A022) + ((float) r1.A04) + ((float) r1.A03);
        float f3 = f2 - ((float) i7);
        if (f3 > 0.0f) {
            if (2Y9.A01(width)) {
                f = C51967G9n.A00((float) width, ((float) (i6 * i7)) / f2);
            } else {
                f = A022 * f3;
            }
            i3 = (int) f;
        }
        View view2 = r9.A02;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
        marginLayoutParams.setMargins(i3, (i / 2) + i4, i3, i4 + (i2 / 2));
        view2.setLayoutParams(marginLayoutParams);
    }
}
