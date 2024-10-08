package X;

import com.facebook.browser.lite.BrowserLiteFragment;

public final class AWE implements AnonymousClass2hV {
    public final /* synthetic */ C340017kY A00;

    public AWE(C340017kY r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        QL8 A05;
        String str = (String) obj;
        0qQ.A0B(str, 0);
        QLA C8U = this.A00.C8U();
        if (C8U == null || (A05 = BrowserLiteFragment.A05(C8U)) == null) {
            return null;
        }
        return A05.A04(str).A01;
    }
}
