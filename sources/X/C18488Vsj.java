package X;

import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;

/* renamed from: X.Vsj  reason: case insensitive filesystem */
public final class C18488Vsj {
    public boolean A00 = true;
    public final View A01;
    public final View A02;
    public final View A03;
    public final boolean A04;

    public C18488Vsj(View view, View view2, View view3, boolean z) {
        this.A04 = z;
        this.A01 = view;
        this.A02 = view2;
        this.A03 = view3;
    }

    public static final ValueAnimator A00(X7D x7d, C18488Vsj vsj, int i, int i2, int i3, int i4) {
        ValueAnimator ofPropertyValuesHolder = ValueAnimator.ofPropertyValuesHolder(new PropertyValuesHolder[]{PropertyValuesHolder.ofInt(IgReactMediaPickerNativeModule.WIDTH, new int[]{i, i2}), PropertyValuesHolder.ofInt("margin", new int[]{i3, i4})});
        ofPropertyValuesHolder.setDuration(400);
        ofPropertyValuesHolder.setInterpolator(new DecelerateInterpolator(1.5f));
        W4Q.A00(ofPropertyValuesHolder, vsj, 18);
        ofPropertyValuesHolder.addListener(new U0F(3, x7d, vsj));
        return ofPropertyValuesHolder;
    }
}
