package X;

import android.graphics.Point;
import android.view.View;
import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.OQt  reason: case insensitive filesystem */
public abstract class C70901OQt {
    public static final void A00(View view, 0sP r5, boolean z) {
        Point point = new Point();
        view.setOnTouchListener(new WBs(1, point, new int[2], z));
        C71409Ok8.A01(view, 23, point, r5);
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [com.instagram.common.ui.widget.imageview.RoundedCornerImageView, android.view.View] */
    /* JADX WARNING: type inference failed for: r0v5, types: [com.instagram.common.ui.widget.imageview.RoundedCornerImageView, android.view.View] */
    public static final void A01(AnonymousClass6PF r3) {
        String str;
        r3.A01().setVisibility(8);
        r3.A01().setOnTouchListener((View.OnTouchListener) null);
        r3.A01().setOnClickListener((View.OnClickListener) null);
        r3.A00().setVisibility(8);
        r3.A00().A04 = null;
        r3.A00().setOnClickListener((View.OnClickListener) null);
        IgTextView igTextView = r3.A01;
        if (igTextView != null) {
            igTextView.setVisibility(8);
            IgTextView igTextView2 = r3.A02;
            if (igTextView2 != null) {
                igTextView2.setVisibility(8);
                IgTextView igTextView3 = r3.A00;
                if (igTextView3 != null) {
                    igTextView3.setVisibility(8);
                    return;
                }
                str = "cta";
            } else {
                str = "secondaryText";
            }
        } else {
            str = "primaryText";
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }
}
