package X;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.secure.securewebview.SecureWebView;

/* renamed from: X.TDd  reason: case insensitive filesystem */
public final class C12914TDd implements Runnable {
    public final /* synthetic */ C11377SQo A00;

    public C12914TDd(C11377SQo sQo) {
        this.A00 = sQo;
    }

    public final void run() {
        C11377SQo sQo = this.A00;
        ViewGroup viewGroup = sQo.A01;
        if (viewGroup != null) {
            while (viewGroup.getChildCount() > 0) {
                View childAt = viewGroup.getChildAt(0);
                if (childAt instanceof SecureWebView) {
                    SAG.A00((SecureWebView) childAt);
                }
                viewGroup.removeView(childAt);
            }
            if (!sQo.A02) {
                sQo.A02 = true;
            }
            sQo.A01 = null;
        }
    }
}
