package X;

import android.content.Context;
import android.view.ViewStub;
import android.widget.FrameLayout;
import com.facebook.browser.lite.BrowserLiteFragment;

/* renamed from: X.TFb  reason: case insensitive filesystem */
public final class C12942TFb implements Runnable {
    public final /* synthetic */ C10663Rvx A00;
    public final /* synthetic */ String A01;

    public C12942TFb(C10663Rvx rvx, String str) {
        this.A00 = rvx;
        this.A01 = str;
    }

    public final void run() {
        Context context;
        AnonymousClass3M8 r0;
        C10663Rvx rvx = this.A00;
        if (rvx != null) {
            String str = this.A01;
            Dc2 dc2 = rvx.A00;
            if (!(dc2 == null || (r0 = rvx.A01) == null)) {
                r0.A09(dc2);
            }
            if (rvx.A01 == null && (context = rvx.A02) != null) {
                ViewStub viewStub = new ViewStub(context);
                FrameLayout frameLayout = ((BrowserLiteFragment) rvx.A03).A0C;
                if (frameLayout != null) {
                    frameLayout.addView(viewStub);
                }
                AnonymousClass3M8 r1 = new AnonymousClass3M8(viewStub, false);
                rvx.A01 = r1;
                r1.A06(80);
            }
            C310336ap r12 = new C310336ap();
            r12.A04();
            r12.A0D = str;
            r12.A01 = 5000;
            Dc2 A002 = r12.A00();
            rvx.A00 = A002;
            AnonymousClass3M8 r02 = rvx.A01;
            if (r02 != null) {
                r02.A0A(A002);
            }
        }
    }
}
