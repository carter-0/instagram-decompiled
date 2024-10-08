package X;

import android.content.Context;
import android.view.View;
import com.instagram.android.R;

/* renamed from: X.8PR  reason: invalid class name */
public final class AnonymousClass8PR extends AnonymousClass3NK {
    public final /* synthetic */ C355048Oj A00;

    public AnonymousClass8PR(C355048Oj r1) {
        this.A00 = r1;
    }

    public final boolean Dqe(View view) {
        C355048Oj r5 = this.A00;
        27r A01 = 27p.A01(r5.A0d);
        C59725JVj jVj = C59725JVj.POST_CAPTURE;
        if (A01.A0Q("logPostCapOverflowMenuTap()")) {
            A01.A1Q(jVj, "HEADER_OVERFLOW_BUTTON");
        }
        Context context = r5.A0F;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.abc_star_medium);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.abc_button_padding_horizontal_material);
        C355148Ov r2 = r5.A0u;
        if (r2.getContentView() == null) {
            return true;
        }
        r2.getContentView().measure(0, 0);
        r2.showAsDropDown(r5.A0J, (-r2.getContentView().getMeasuredWidth()) + dimensionPixelSize, dimensionPixelSize2);
        return true;
    }
}
