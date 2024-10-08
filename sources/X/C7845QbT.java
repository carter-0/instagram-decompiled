package X;

import android.view.View;
import com.facebook.browser.lite.views.BrowserLiteWrapperView;

/* renamed from: X.QbT  reason: case insensitive filesystem */
public final class C7845QbT extends C232922uf {
    public final int A00;
    public final Object A01;

    public C7845QbT(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void DmE(2cs r9) {
        if (this.A00 != 0) {
            BrowserLiteWrapperView browserLiteWrapperView = (BrowserLiteWrapperView) this.A01;
            View view = browserLiteWrapperView.A04;
            C71412ct r3 = r9.A09;
            view.setTranslationY((float) r3.A00);
            browserLiteWrapperView.A03.setAlpha(((float) (1.0d - (r3.A00 / ((double) browserLiteWrapperView.getHeight())))) * 0.7f);
            return;
        }
        C11508SbV sbV = (C11508SbV) this.A01;
        float f = (float) r9.A09.A00;
        if (Float.compare(f, 0.0f) == 0) {
            sbV.A00 = AnonymousClass05K.A0N;
        }
        sbV.A01.setTranslationY(f);
    }
}
