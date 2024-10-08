package X;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.graphics.drawable.Drawable;
import android.view.ViewTreeObserver;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;

public final class WCA implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ IgSimpleImageView A00;
    public final /* synthetic */ AZU A01;

    public WCA(IgSimpleImageView igSimpleImageView, AZU azu) {
        this.A00 = igSimpleImageView;
        this.A01 = azu;
    }

    public final void onGlobalLayout() {
        int i;
        int i2;
        int i3;
        IgSimpleImageView igSimpleImageView = this.A00;
        ViewTreeObserver viewTreeObserver = igSimpleImageView.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeOnGlobalLayoutListener(this);
        }
        Drawable drawable = igSimpleImageView.getDrawable();
        int i4 = 0;
        if (drawable != null) {
            i = drawable.getIntrinsicWidth();
        } else {
            i = 0;
        }
        Drawable drawable2 = igSimpleImageView.getDrawable();
        if (drawable2 != null) {
            i4 = drawable2.getIntrinsicHeight();
        }
        AZU azu = this.A01;
        if (i < i4) {
            i2 = AnonymousClass7TE.A06((float) azu.A0G, 0.6666667f);
            i3 = AnonymousClass7TE.A06((float) azu.A0F, 1.2f);
        } else {
            i2 = azu.A0G;
            i3 = azu.A0F;
        }
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(igSimpleImageView, new PropertyValuesHolder[]{PropertyValuesHolder.ofInt(IgReactMediaPickerNativeModule.WIDTH, new int[]{igSimpleImageView.getWidth(), i2}), PropertyValuesHolder.ofInt(IgReactMediaPickerNativeModule.HEIGHT, new int[]{igSimpleImageView.getHeight(), i3})});
        0qQ.A07(ofPropertyValuesHolder);
        ofPropertyValuesHolder.addUpdateListener(new C61200lu(igSimpleImageView));
        ofPropertyValuesHolder.setDuration(200);
        ofPropertyValuesHolder.start();
    }
}
