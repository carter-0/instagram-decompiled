package X;

import android.content.Context;
import android.view.ViewStub;
import android.widget.FrameLayout;
import com.facebook.browser.lite.BrowserLiteFragment;
import com.instagram.android.R;

public final class S14 {
    public final Context A00;
    public final AnonymousClass3M8 A01;

    public final void A00(RDE rde) {
        int i;
        C310346aq r0;
        String str;
        AnonymousClass3M8 r3 = this.A01;
        C310336ap r4 = new C310336ap();
        Context context = this.A00;
        boolean z = rde instanceof QKX;
        if (z) {
            i = R.string.f0nameremoved;
        } else if (rde instanceof QKW) {
            i = R.string.f0nameremoved;
        } else {
            i = R.string.f0nameremoved;
        }
        r4.A0D = context.getString(i);
        if (z) {
            r0 = ((QKX) rde).A00;
        } else if (rde instanceof QKW) {
            r0 = ((QKW) rde).A00;
        } else {
            r0 = ((QKV) rde).A00;
        }
        r4.A0C(r0);
        if (z) {
            str = "bwp_consent_denial";
        } else if (rde instanceof QKW) {
            str = "bwp_auth_flow_success";
        } else {
            str = "bwp_auth_flow_error";
        }
        r4.A0H = str;
        r3.A0A(r4.A00());
    }

    public S14(Context context, C340027ka r5) {
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
