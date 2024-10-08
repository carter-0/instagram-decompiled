package X;

import android.content.Context;
import android.widget.ViewSwitcher;
import com.facebook.browser.lite.chrome.container.IGWatchAndBrowseLiteChrome;
import com.instagram.android.R;

public final class TFU implements Runnable {
    public final /* synthetic */ ViewSwitcher A00;
    public final /* synthetic */ IGWatchAndBrowseLiteChrome A01;

    public TFU(ViewSwitcher viewSwitcher, IGWatchAndBrowseLiteChrome iGWatchAndBrowseLiteChrome) {
        this.A00 = viewSwitcher;
        this.A01 = iGWatchAndBrowseLiteChrome;
    }

    public final void run() {
        ViewSwitcher viewSwitcher = this.A00;
        if (viewSwitcher != null) {
            Context context = this.A01.getContext();
            viewSwitcher.setInAnimation(context, R.anim.top_in);
            viewSwitcher.setOutAnimation(context, R.anim.bottom_out);
            viewSwitcher.showPrevious();
        }
    }
}
