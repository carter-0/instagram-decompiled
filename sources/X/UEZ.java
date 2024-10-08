package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

public final class UEZ extends C249703kE {
    public final View A00;
    public final ViewGroup A01;
    public final TextView A02;
    public final TextView A03;
    public final C68639NQs A04;
    public final ImageView A05;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000c, code lost:
        if (r10.A00 <= 0) goto L_0x000e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(android.content.Context r8, X.UEZ r9, X.C16725V3i r10) {
        /*
            r5 = 0
            if (r10 == 0) goto L_0x000e
            long r6 = r10.A00
            r2 = 0
            int r1 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            r6 = 1
            r0 = 360(0x168, float:5.04E-43)
            if (r1 > 0) goto L_0x0011
        L_0x000e:
            r6 = 0
            r0 = 270(0x10e, float:3.78E-43)
        L_0x0011:
            float r0 = X.0nA.A04(r8, r0)
            int r1 = (int) r0
            android.view.View r4 = r9.A00
            android.view.ViewGroup$LayoutParams r3 = r4.getLayoutParams()
            if (r3 == 0) goto L_0x002d
            int r0 = r3.height
            if (r1 == r0) goto L_0x002d
            double r0 = (double) r1
            double r1 = java.lang.Math.ceil(r0)
            int r0 = (int) r1
            r3.height = r0
            r4.setLayoutParams(r3)
        L_0x002d:
            android.widget.ImageView r0 = r9.A05
            if (r6 != 0) goto L_0x0033
            r5 = 8
        L_0x0033:
            r0.setVisibility(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.UEZ.A00(android.content.Context, X.UEZ, X.V3i):void");
    }

    public UEZ(View view, UserSession userSession) {
        super(view);
        this.A00 = view.requireViewById(R.id.vic_background_image);
        this.A01 = DbU.A0C(view, R.id.vic_text_container);
        this.A03 = DbU.A0G(view, R.id.vic_title);
        this.A02 = DbU.A0G(view, R.id.vic_subtitle);
        ImageView A0F = DbU.A0F(view, R.id.countdown_timer_image_view);
        this.A05 = A0F;
        Context context = view.getContext();
        int color = context.getColor(2Yu.A0E(context));
        int color2 = context.getColor(2Yu.A0E(context));
        0qQ.A0B(userSession, 1);
        C68639NQs nQs = new C68639NQs(userSession, context);
        nQs.A01 = color;
        nQs.A0B.A0F(color);
        nQs.A00 = color2;
        nQs.A0A.A0F(color2);
        this.A04 = nQs;
        A0F.setImageDrawable(nQs);
        A00(context, this, (C16725V3i) null);
    }
}
