package X;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.instagram.android.R;

/* renamed from: X.MzA  reason: case insensitive filesystem */
public final class C68043MzA extends C249703kE {
    public final C67645MrY A00;
    public final int A01;
    public final int A02;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0020, code lost:
        if (r4.getRight() > r5) goto L_0x0022;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00() {
        /*
            r7 = this;
            X.MrY r6 = r7.A00
            int r0 = r7.A02
            int r5 = r7.A01
            android.view.View r4 = X.JTO.A0F(r7)
            int r0 = r0 - r5
            double r2 = (double) r0
            r0 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r2 = r2 / r0
            double r2 = java.lang.Math.ceil(r2)
            int r1 = (int) r2
            int r5 = r5 + r1
            int r0 = r4.getLeft()
            if (r1 > r0) goto L_0x0022
            int r0 = r4.getRight()
            r1 = 1
            if (r0 <= r5) goto L_0x0023
        L_0x0022:
            r1 = 0
        L_0x0023:
            boolean r0 = r6.A01
            if (r0 == r1) goto L_0x002c
            r6.A01 = r1
            X.C67645MrY.A00(r6)
        L_0x002c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C68043MzA.A00():void");
    }

    public C68043MzA(View view) {
        super(view);
        Context context = view.getContext();
        0qQ.A0A(context);
        this.A02 = 0nA.A09(context);
        this.A01 = context.getResources().getDimensionPixelSize(R.dimen.messaging_ads_multi_suggestions_thumbnail_height);
        C67645MrY mrY = new C67645MrY(context);
        this.A00 = mrY;
        ((ImageView) view).setImageDrawable(mrY);
    }
}
