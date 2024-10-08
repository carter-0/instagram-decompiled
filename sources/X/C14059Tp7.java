package X;

import android.view.View;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

/* renamed from: X.Tp7  reason: case insensitive filesystem */
public final class C14059Tp7 implements X21 {
    public final int A00;

    public C14059Tp7(int i) {
        02V.A02(i, "Margin must be non-negative");
        this.A00 = i;
    }

    public final void FHo(View view, float f) {
        ViewParent parent = view.getParent();
        ViewParent parent2 = parent.getParent();
        if (!(parent instanceof RecyclerView) || !(parent2 instanceof ViewPager2)) {
            throw new IllegalStateException("Expected the page view to be managed by a ViewPager2 instance.");
        }
        ViewPager2 viewPager2 = (ViewPager2) parent2;
        float f2 = ((float) this.A00) * f;
        if (viewPager2.getOrientation() == 0) {
            if (viewPager2.A02.A07.getLayoutDirection() == 1) {
                f2 = -f2;
            }
            view.setTranslationX(f2);
            return;
        }
        view.setTranslationY(f2);
    }
}
