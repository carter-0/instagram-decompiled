package X;

import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import com.instagram.android.R;

/* renamed from: X.THs  reason: case insensitive filesystem */
public final class C13010THs implements Runnable {
    public final /* synthetic */ ViewStub A00;
    public final /* synthetic */ R8R A01;

    public C13010THs(ViewStub viewStub, R8R r8r) {
        this.A00 = viewStub;
        this.A01 = r8r;
    }

    public final void run() {
        try {
            View A0H = JTP.A0H(this.A00, R.layout.simple_web_view);
            0qQ.A0C(A0H, C273654mx.A00(2));
            R8R r8r = this.A01;
            R8R.A01((FrameLayout) A0H, r8r);
            if (r8r.A03 != null) {
                0f9 AEf = 0wj.A01.AEf(R8R.__redex_internal_original_name, 817904145);
                AEf.ABQ(R8R.__redex_internal_original_name, "Inflate SimpleWebViewFragment's Layout succeeded after retry");
                AEf.report();
            }
        } catch (Exception unused) {
            R8R r8r2 = this.A01;
            if (r8r2.A03 != null) {
                0f9 AEf2 = 0wj.A01.AEf(R8R.__redex_internal_original_name, 817904145);
                AEf2.ABQ(R8R.__redex_internal_original_name, "Unable to inflate SimpleWebViewFragment's Layout");
                AEf2.report();
            }
            C59689JTv.A0F(r8r2.requireActivity(), "open_link_generic_error", 2131969037);
        }
    }
}
