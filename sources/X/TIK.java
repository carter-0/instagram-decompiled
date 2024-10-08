package X;

import android.animation.ObjectAnimator;
import android.net.Uri;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.LinearInterpolator;
import android.webkit.WebView;
import android.widget.ProgressBar;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;

public final class TIK implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ WebView A01;
    public final /* synthetic */ C10373RrA A02;

    public TIK(WebView webView, C10373RrA rrA, int i) {
        this.A02 = rrA;
        this.A01 = webView;
        this.A00 = i;
    }

    public final void run() {
        C10373RrA rrA = this.A02;
        WebView webView = this.A01;
        int i = this.A00 * 10;
        int i2 = 100;
        if (i <= 100) {
            i = 100;
        }
        String url = webView.getUrl();
        if (AnonymousClass5He.A00(url) || !C11324SMy.A01(Uri.parse(url))) {
            i2 = i;
            if (i == 1000) {
                ProgressBar progressBar = rrA.A01;
                if (progressBar.getVisibility() == 0) {
                    AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
                    alphaAnimation.setInterpolator(new AccelerateInterpolator());
                    alphaAnimation.setDuration(300);
                    alphaAnimation.setAnimationListener(new IE5(progressBar, 0));
                    progressBar.startAnimation(alphaAnimation);
                    return;
                } else if (progressBar.getVisibility() == 4) {
                    progressBar.setVisibility(8);
                    return;
                } else {
                    return;
                }
            }
        }
        ProgressBar progressBar2 = rrA.A01;
        if (progressBar2.getVisibility() == 8) {
            progressBar2.setVisibility(0);
        }
        if (i2 < progressBar2.getProgress()) {
            progressBar2.setProgress(0);
        }
        if (i2 != progressBar2.getProgress()) {
            ObjectAnimator objectAnimator = rrA.A00;
            if (objectAnimator != null) {
                objectAnimator.cancel();
            }
            rrA.A00 = ObjectAnimator.ofInt(progressBar2, ReactProgressBarViewManager.PROP_PROGRESS, new int[]{progressBar2.getProgress(), i2});
            rrA.A00.setDuration((long) ((i2 - progressBar2.getProgress()) * 2));
            rrA.A00.setInterpolator(new LinearInterpolator());
            rrA.A00.start();
        }
    }
}
