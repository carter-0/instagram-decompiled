package X;

import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import com.facebook.cameracore.instagram.ardelivery.networkconsentmanager.IgNetworkConsentStorage;

public final class U4S extends FrameLayout {
    public double A00;
    public Integer A01;
    public boolean A02;
    public boolean A03;
    public ProgressBar A04;

    public final void A00() {
        ProgressBar progressBar = this.A04;
        if (progressBar != null) {
            progressBar.setIndeterminate(this.A03);
            setColor(progressBar);
            progressBar.setProgress((int) (this.A00 * 1000.0d));
            progressBar.setVisibility(JTQ.A00(this.A02 ? 1 : 0));
            return;
        }
        throw new RuntimeException("setStyle() not called");
    }

    public final boolean getAnimating$xplat_js_react_native_github_packages_react_native_ReactAndroid_src_main_java_com_facebook_react_views_progressbar_progressbarAndroid() {
        return this.A02;
    }

    public final Integer getColor$xplat_js_react_native_github_packages_react_native_ReactAndroid_src_main_java_com_facebook_react_views_progressbar_progressbarAndroid() {
        return this.A01;
    }

    public final boolean getIndeterminate$xplat_js_react_native_github_packages_react_native_ReactAndroid_src_main_java_com_facebook_react_views_progressbar_progressbarAndroid() {
        return this.A03;
    }

    public final double getProgress$xplat_js_react_native_github_packages_react_native_ReactAndroid_src_main_java_com_facebook_react_views_progressbar_progressbarAndroid() {
        return this.A00;
    }

    public final void setAnimating$xplat_js_react_native_github_packages_react_native_ReactAndroid_src_main_java_com_facebook_react_views_progressbar_progressbarAndroid(boolean z) {
        this.A02 = z;
    }

    public final void setColor$xplat_js_react_native_github_packages_react_native_ReactAndroid_src_main_java_com_facebook_react_views_progressbar_progressbarAndroid(Integer num) {
        this.A01 = num;
    }

    public final void setIndeterminate$xplat_js_react_native_github_packages_react_native_ReactAndroid_src_main_java_com_facebook_react_views_progressbar_progressbarAndroid(boolean z) {
        this.A03 = z;
    }

    public final void setProgress$xplat_js_react_native_github_packages_react_native_ReactAndroid_src_main_java_com_facebook_react_views_progressbar_progressbarAndroid(double d) {
        this.A00 = d;
    }

    private final void setColor(ProgressBar progressBar) {
        Drawable progressDrawable;
        if (progressBar.isIndeterminate()) {
            progressDrawable = progressBar.getIndeterminateDrawable();
        } else {
            progressDrawable = progressBar.getProgressDrawable();
        }
        if (progressDrawable != null) {
            Integer num = this.A01;
            if (num != null) {
                progressDrawable.setColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN);
            } else {
                progressDrawable.clearColorFilter();
            }
        }
    }

    public final void setStyle$xplat_js_react_native_github_packages_react_native_ReactAndroid_src_main_java_com_facebook_react_views_progressbar_progressbarAndroid(String str) {
        ProgressBar A012 = C18671VwU.A01(getContext(), C18671VwU.A00(str));
        A012.setMax(IgNetworkConsentStorage.MAX_ENTRIES);
        this.A04 = A012;
        removeAllViews();
        addView(this.A04, new ViewGroup.LayoutParams(-1, -1));
    }
}
