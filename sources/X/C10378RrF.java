package X;

import android.content.Context;
import android.view.ViewStub;
import android.widget.FrameLayout;
import com.facebook.browser.lite.BrowserLiteFragment;
import com.instagram.android.R;

/* renamed from: X.RrF  reason: case insensitive filesystem */
public final class C10378RrF {
    public final Context A00;
    public final AnonymousClass3M8 A01;

    public C10378RrF(Context context, C340027ka r5) {
        this.A00 = context;
        ViewStub viewStub = new ViewStub(context);
        viewStub.setId(R.id.bwp_snack_bar_stub);
        FrameLayout frameLayout = ((BrowserLiteFragment) r5).A0C;
        if (frameLayout != null) {
            frameLayout.addView(viewStub);
        }
        AnonymousClass3M8 r1 = new AnonymousClass3M8(viewStub, false);
        this.A01 = r1;
        r1.A06(80);
    }
}
