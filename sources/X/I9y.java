package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;

public final class I9y implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener {
    public final View A00;
    public final ImageView A01;

    public final void onGlobalLayout() {
        View view = this.A00;
        C51967G9n.A0y(view, this);
        ImageView imageView = this.A01;
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        int height = view.getHeight();
        Drawable drawable = imageView.getDrawable();
        drawable.getClass();
        int min = Math.min(height, drawable.getIntrinsicHeight());
        int width = view.getWidth();
        Drawable drawable2 = imageView.getDrawable();
        drawable2.getClass();
        int min2 = Math.min(Math.min(width, drawable2.getIntrinsicWidth()), min);
        layoutParams.height = min2;
        layoutParams.width = min2;
        imageView.setLayoutParams(layoutParams);
        imageView.setVisibility(0);
    }

    public final void onViewAttachedToWindow(View view) {
        this.A00.getViewTreeObserver().addOnGlobalLayoutListener(this);
    }

    public final void onViewDetachedFromWindow(View view) {
        C51967G9n.A0y(this.A00, this);
    }

    public I9y(View view, ImageView imageView) {
        this.A00 = view;
        this.A01 = imageView;
    }
}
