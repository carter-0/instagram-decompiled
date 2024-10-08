package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

/* renamed from: X.SbV  reason: case insensitive filesystem */
public final class C11508SbV implements View.OnTouchListener {
    public Integer A00 = AnonymousClass05K.A0N;
    public final View A01;
    public final 0SM A02;
    public final GestureDetector A03;
    public final 2cs A04;

    public static void A00(C11508SbV sbV, double d) {
        double d2;
        int i;
        View view = sbV.A01;
        float translationY = view.getTranslationY();
        2cs r4 = sbV.A04;
        JTP.A1K(r4, translationY);
        if (sbV.A00 == AnonymousClass05K.A00) {
            r4.A0A(new C15165UTq(sbV, 0));
            r4.A07(d);
            Resources resources = sbV.A02.requireActivity().getResources();
            int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
            if (identifier > 0) {
                i = resources.getDimensionPixelSize(identifier);
            } else {
                i = 150;
            }
            d2 = (double) (i + view.getHeight());
        } else {
            r4.A07(d);
            d2 = 0.0d;
        }
        r4.A06(d2);
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        Integer num;
        double d;
        if (!this.A03.onTouchEvent(motionEvent)) {
            if (motionEvent.getAction() != 1 || (num = this.A00) == AnonymousClass05K.A0N) {
                return false;
            }
            if (num == AnonymousClass05K.A0C) {
                d = -2000.0d;
            } else {
                d = 2000.0d;
            }
            A00(this, d);
        }
        return true;
    }

    public C11508SbV(Context context, View view, 0SM r6) {
        this.A02 = r6;
        this.A01 = view;
        2cs A022 = 2cp.A00().A02();
        A022.A06 = true;
        this.A04 = A022;
        A022.A0A(new C7845QbT(this, 0));
        this.A03 = new GestureDetector(context, new Q8S(this));
    }
}
