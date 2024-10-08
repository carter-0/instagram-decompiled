package X;

import android.view.View;
import android.view.ViewTreeObserver;
import com.facebook.browser.lite.webview.SystemWebView;

/* renamed from: X.Sbg  reason: case insensitive filesystem */
public final class C11519Sbg implements ViewTreeObserver.OnPreDrawListener {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C11519Sbg(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.QcV, android.view.View] */
    public final boolean onPreDraw() {
        ? r3;
        C13822Ths ths;
        View B7F;
        switch (this.A00) {
            case 0:
                View view = (View) this.A01;
                view.setScrollY(((GIM) this.A02).A00);
                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                if (!viewTreeObserver.isAlive()) {
                    return true;
                }
                viewTreeObserver.removeOnPreDrawListener(this);
                return true;
            case 1:
                ((View) this.A02).getViewTreeObserver().removeOnPreDrawListener(this);
                DbS.A1U(this.A01);
                return true;
            default:
                ((View) this.A01).getViewTreeObserver().removeOnPreDrawListener(this);
                SlJ slJ = ((C12810T7x) this.A02).A06.A00;
                QLA qla = slJ.A00;
                if (qla == null || (r3 = ((SystemWebView) qla).A04) == 0 || (ths = slJ.A01) == null || (B7F = ths.B7F()) == null) {
                    return true;
                }
                SlJ.A01(r3, B7F, slJ, 250);
                return true;
        }
    }
}
