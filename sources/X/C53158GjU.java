package X;

import androidx.viewpager.widget.ViewPager;
import com.facebook.litho.ComponentTree;
import com.facebook.litho.LithoView;
import java.lang.ref.WeakReference;

/* renamed from: X.GjU  reason: case insensitive filesystem */
public final class C53158GjU extends C60140do {
    public final WeakReference A00;
    public final WeakReference A01;

    public final void onPageScrolled(int i, float f, int i2) {
        LithoView lithoView;
        ComponentTree componentTree = (ComponentTree) this.A00.get();
        if (componentTree != null && (lithoView = componentTree.A08) != null) {
            lithoView.CsJ();
        }
    }

    public C53158GjU(ViewPager viewPager, ComponentTree componentTree) {
        AnonymousClass7TG.A1O(componentTree, viewPager);
        this.A00 = C51965G9l.A0v(componentTree);
        this.A01 = C51965G9l.A0v(viewPager);
    }
}
