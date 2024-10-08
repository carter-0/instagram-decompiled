package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager2.widget.ViewPager2;

/* renamed from: X.Tp3  reason: case insensitive filesystem */
public final class C14055Tp3 implements C2366234l {
    public final /* synthetic */ ViewPager2 A00;

    public final void D1m(View view) {
    }

    public C14055Tp3(ViewPager2 viewPager2) {
        this.A00 = viewPager2;
    }

    public final void D1l(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams.width != -1 || layoutParams.height != -1) {
            throw new IllegalStateException("Pages must fill the whole ViewPager2 (use match_parent)");
        }
    }
}
