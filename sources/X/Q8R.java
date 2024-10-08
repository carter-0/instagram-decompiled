package X;

import android.view.GestureDetector;
import android.view.MotionEvent;
import com.facebook.browser.lite.BrowserLiteFragment;
import com.facebook.browser.lite.views.BrowserLiteErrorScreen;
import com.facebook.browser.lite.views.BrowserLiteGestureDelegateView;

public final class Q8R extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ BrowserLiteGestureDelegateView A00;

    public Q8R(BrowserLiteGestureDelegateView browserLiteGestureDelegateView) {
        this.A00 = browserLiteGestureDelegateView;
    }

    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        BrowserLiteGestureDelegateView browserLiteGestureDelegateView = this.A00;
        if ((browserLiteGestureDelegateView.A04 == AnonymousClass05K.A0C && browserLiteGestureDelegateView.A03.getWebViewScrollY() > 0) || f2 > 0.0f) {
            return false;
        }
        browserLiteGestureDelegateView.A03.A05((Runnable) null, (double) f2, 0.0f, true);
        browserLiteGestureDelegateView.A06 = true;
        return true;
    }

    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        BrowserLiteErrorScreen browserLiteErrorScreen;
        BrowserLiteGestureDelegateView browserLiteGestureDelegateView = this.A00;
        int webViewScrollY = browserLiteGestureDelegateView.A03.getWebViewScrollY();
        if (browserLiteGestureDelegateView.A04 == AnonymousClass05K.A0C && browserLiteGestureDelegateView.A02.getTranslationY() == 0.0f) {
            if (webViewScrollY <= 0 || browserLiteGestureDelegateView.A05) {
                BrowserLiteFragment browserLiteFragment = (BrowserLiteFragment) browserLiteGestureDelegateView.A03.A05;
                BrowserLiteErrorScreen browserLiteErrorScreen2 = browserLiteFragment.A0a;
                if ((browserLiteErrorScreen2 == null || browserLiteErrorScreen2.getVisibility() != 0) && (((browserLiteErrorScreen = browserLiteFragment.A0b) == null || browserLiteErrorScreen.getVisibility() != 0) && browserLiteGestureDelegateView.A05 && (f2 > 0.0f || webViewScrollY > 0))) {
                    browserLiteGestureDelegateView.A03.setWebViewScrollY((int) Math.max(((float) webViewScrollY) + f2, 0.0f));
                    browserLiteGestureDelegateView.A05 = true;
                    return false;
                }
            }
            return false;
        }
        browserLiteGestureDelegateView.A05 = true;
        if (!browserLiteGestureDelegateView.A07) {
            float translationY = browserLiteGestureDelegateView.A02.getTranslationY() - (f2 * 0.5f);
            browserLiteGestureDelegateView.A03.A05((Runnable) null, 0.0d, translationY, false);
            if (translationY <= ((float) browserLiteGestureDelegateView.A00)) {
                return false;
            }
            return true;
        }
        return false;
    }
}
