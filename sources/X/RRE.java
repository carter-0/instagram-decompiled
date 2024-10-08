package X;

import android.content.Context;
import android.view.autofill.AutofillManager;
import android.webkit.WebBackForwardList;
import android.webkit.WebHistoryItem;
import com.facebook.browser.lite.webview.SystemWebView;
import java.util.ArrayList;

public abstract class RRE {
    /* JADX WARNING: type inference failed for: r0v2, types: [X.QcV, android.webkit.WebView] */
    public final T9q A01() {
        WebBackForwardList copyBackForwardList = ((SystemWebView) this).A04.copyBackForwardList();
        int size = copyBackForwardList.getSize();
        ArrayList A1C = AnonymousClass7TE.A1C();
        for (int i = 0; i < size; i++) {
            WebHistoryItem itemAtIndex = copyBackForwardList.getItemAtIndex(i);
            A1C.add(new TA1(itemAtIndex.getFavicon(), itemAtIndex.getUrl(), itemAtIndex.getOriginalUrl(), itemAtIndex.getTitle()));
        }
        return new T9q(A1C, copyBackForwardList.getCurrentIndex());
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [X.QcV, android.view.View, android.webkit.WebView] */
    public final void A02() {
        AutofillManager.AutofillCallback autofillCallback;
        SystemWebView systemWebView = (SystemWebView) this;
        ? r4 = systemWebView.A04;
        Context context = r4.getContext();
        Class cls = AutofillManager.class;
        if (!(context.getSystemService(cls) == null || (autofillCallback = systemWebView.A00) == null)) {
            ((AutofillManager) context.getSystemService(cls)).unregisterCallback(autofillCallback);
        }
        r4.destroy();
    }
}
