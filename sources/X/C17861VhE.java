package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.VhE  reason: case insensitive filesystem */
public final class C17861VhE {
    public final Context A00;
    public final ImageView A01;
    public final TextView A02;
    public final TextView A03;

    public C17861VhE(View view) {
        this.A00 = view.getContext();
        this.A03 = DbU.A0G(view, R.id.slider_results_summary_emoji);
        this.A01 = DbU.A0F(view, R.id.slider_results_summary_slider);
        this.A02 = DbU.A0G(view, R.id.slider_results_summary_description);
    }

    public final void A00(UserSession userSession, 1Xj r12) {
        float A05;
        String A0d;
        C42139BIu bIu;
        C19472WaK A002 = AnonymousClass6UJ.A00(r12);
        A002.getClass();
        0qQ.A0B(userSession, 1);
        C45419Cvz A0L = C225972fF.A00(userSession).A0L(A002);
        if (A0L == null || (bIu = A0L.A01) == null) {
            A05 = C13989Tnp.A05(A002.A00.A02);
        } else {
            int A012 = A002.A01();
            float A052 = C13989Tnp.A05(A002.A00.A02);
            A05 = ((A052 * ((float) A012)) + C13989Tnp.A05(bIu.A01)) / ((float) (A012 + 1));
        }
        C45419Cvz A0L2 = C225972fF.A00(userSession).A0L(A002);
        int A013 = A002.A01();
        if (A0L2 != null) {
            A013++;
        }
        String str = A002.A00.A06;
        if (str == null) {
            str = "😍";
        }
        Context context = this.A00;
        Resources resources = context.getResources();
        int A09 = 0nA.A09(context) / 2;
        int A0G = AnonymousClass7TE.A0G(resources);
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.browser_error_screen_description_width) / 2;
        int i = A09 - dimensionPixelSize;
        int i2 = A09 + dimensionPixelSize;
        float f = ((float) A0G) / 2.0f;
        float dimensionPixelSize2 = ((float) resources.getDimensionPixelSize(R.dimen.abc_star_medium)) / 2.0f;
        float A014 = 0mi.A01(A05, 0.0f, 1.0f, (((float) i) + f) - dimensionPixelSize2, (((float) i2) - f) - dimensionPixelSize2);
        TextView textView = this.A03;
        textView.setText(str);
        0nA.A0q(textView, new C20240Wnf(this, A014));
        Resources resources2 = context.getResources();
        int A0G2 = AnonymousClass7TE.A0G(resources2);
        int A0C = AnonymousClass7TE.A0C(resources2);
        U1V u1v = new U1V(context, userSession);
        u1v.A09 = true;
        u1v.invalidateSelf();
        u1v.A02(A0G2);
        u1v.A04(AnonymousClass05K.A01);
        u1v.A01(A05);
        u1v.A03(A0C);
        this.A01.setImageDrawable(u1v);
        Resources resources3 = context.getResources();
        if (A013 == 0) {
            A0d = resources3.getString(2131971507);
        } else {
            A0d = DbY.A0d(resources3, A013, R.plurals.reel_dashboard_slider_results_summary);
        }
        this.A02.setText(A0d);
    }
}
