package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.instagram.android.R;

public final class GDJ implements Runnable {
    public final /* synthetic */ GCC A00;

    public GDJ(GCC gcc) {
        this.A00 = gcc;
    }

    public final void run() {
        int i;
        int i2;
        ViewPager2 viewPager2;
        int i3;
        float f;
        GCC gcc = this.A00;
        FrameLayout frameLayout = gcc.A03;
        if (frameLayout != null) {
            View view = gcc.A01;
            if (view == null) {
                view = new View(AnonymousClass7TE.A0S(frameLayout));
                view.setBackground((Drawable) null);
                View view2 = gcc.A02;
                if (view2 != null) {
                    f = view2.getElevation();
                } else {
                    f = 0.0f;
                }
                view.setElevation(f + 1.0f);
                view.setVisibility(8);
                C56815IDm.A00(view, 12, gcc);
            }
            gcc.A01 = view;
            if (!view.isLaidOut() || view.isLayoutRequested()) {
                view.addOnLayoutChangeListener(new C52181GHx());
            } else {
                03v.A0H(view, G9w.A0l(view, DbS.A02(AnonymousClass7TE.A0S(view), 16), view.getHeight()));
            }
            FrameLayout frameLayout2 = gcc.A03;
            if (frameLayout2 != null) {
                frameLayout2.removeView(gcc.A01);
            }
            View view3 = gcc.A01;
            Context A0S = AnonymousClass7TE.A0S(frameLayout);
            int dimensionPixelSize = A0S.getResources().getDimensionPixelSize(R.dimen.abc_dialog_padding_top_material);
            boolean z = gcc.A0B;
            if (!z) {
                i = A0S.getResources().getDimensionPixelOffset(2Yu.A0H(A0S, 0Pn.A01(gcc.A08))) / 4;
            } else if (gcc.A0A) {
                i = AnonymousClass7TG.A02(A0S);
            } else {
                i = 0;
            }
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, dimensionPixelSize + i);
            layoutParams.gravity = 80;
            C52012GBj gBj = gcc.A02;
            if (gBj == null || (viewPager2 = gBj.A00) == null) {
                i2 = 0;
            } else {
                int[] iArr = new int[2];
                int[] iArr2 = new int[2];
                viewPager2.getLocationOnScreen(iArr);
                frameLayout.getLocationOnScreen(iArr2);
                int height = (frameLayout.getHeight() - (iArr[1] - iArr2[1])) - viewPager2.getHeight();
                if (!z) {
                    i3 = A0S.getResources().getDimensionPixelOffset(2Yu.A0H(A0S, 0Pn.A01(gcc.A08))) / 4;
                } else if (gcc.A0A) {
                    i3 = AnonymousClass7TG.A02(A0S);
                } else {
                    i3 = 0;
                }
                i2 = height - i3;
            }
            layoutParams.bottomMargin = i2;
            frameLayout.addView(view3, 0, layoutParams);
        }
        GCC.A00(gcc);
    }
}
