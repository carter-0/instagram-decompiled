package X;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.TypedValue;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.instagram.android.R;

/* renamed from: X.4kF  reason: invalid class name and case insensitive filesystem */
public final class C272164kF {
    public final Activity A00;
    public final boolean A01;
    public final boolean A02;

    public static final FrameLayout A00(C272164kF r13) {
        Activity activity = r13.A00;
        int color = activity.getResources().getColor(R.color.splash_screen_background);
        boolean z = r13.A02;
        Resources resources = activity.getResources();
        Drawable drawable = activity.getDrawable(R.drawable.f7instagram);
        FrameLayout frameLayout = new FrameLayout(activity);
        frameLayout.setBackgroundColor(color);
        frameLayout.setFitsSystemWindows(false);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2, 17);
        ImageView imageView = new ImageView(activity);
        imageView.setImageDrawable(drawable);
        imageView.setId(1);
        imageView.setPadding(0, 0, 0, (int) TypedValue.applyDimension(1, 64.0f, resources.getDisplayMetrics()));
        frameLayout.addView(imageView, layoutParams);
        ImageView imageView2 = new ImageView(activity);
        Bitmap decodeResource = BitmapFactory.decodeResource(resources, R.drawable.from_meta_gradient);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2, 81);
        imageView2.setImageBitmap(decodeResource);
        imageView2.setId(2);
        imageView2.setPadding(0, 0, 0, (int) TypedValue.applyDimension(1, 32.0f, resources.getDisplayMetrics()));
        frameLayout.addView(imageView2, layoutParams2);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2, 17);
        if (drawable != null) {
            int i = resources.getConfiguration().orientation;
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (i == 2) {
                intrinsicHeight /= 3;
            }
            layoutParams3.topMargin = intrinsicHeight;
        }
        if (z) {
            frameLayout.setPadding(0, 0, 0, (int) TypedValue.applyDimension(1, 48.0f, resources.getDisplayMetrics()));
        }
        AnonymousClass0B6.A00(imageView, imageView2);
        return frameLayout;
    }

    public final void A02() {
        Activity activity = this.A00;
        A01(activity, this);
        if (Build.VERSION.SDK_INT < 31) {
            C272204kJ.A00(activity, A00(this), this.A01);
        }
    }

    public C272164kF(Activity activity, boolean z, boolean z2) {
        this.A00 = activity;
        this.A01 = z;
        this.A02 = z2;
    }

    public static final void A01(Activity activity, C272164kF r5) {
        Window window = activity.getWindow();
        if (window != null) {
            Window window2 = activity.getWindow();
            0qQ.A07(window2);
            if (!window2.hasFeature(1)) {
                try {
                    window2.requestFeature(1);
                } catch (Exception e) {
                    0KC.A0I("FbMainActivitySplashHelper", "Unable to request FEATURE_NO_TITLE (setContentView already called?)", e);
                }
            }
        }
        activity.setContentView(A00(r5));
        if (window != null) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 30) {
                C272794lP.A01(window, r5.A01);
            } else if (i >= 29) {
                C273954nS.A00(window, r5.A01);
            } else {
                C272204kJ.A01(window, r5.A01);
            }
        }
    }
}
