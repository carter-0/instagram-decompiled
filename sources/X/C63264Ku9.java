package X;

import android.graphics.drawable.Drawable;
import com.instagram.ui.widget.slideouticon.SlideInAndOutIconView;

/* renamed from: X.Ku9  reason: case insensitive filesystem */
public abstract class C63264Ku9 {
    public static final void A00(Drawable drawable, SlideInAndOutIconView slideInAndOutIconView, String str, 0sP r6, 0sP r7, float f, float f2, int i) {
        int A0M = AnonymousClass7TE.A0M(r6.invoke(slideInAndOutIconView));
        int A0M2 = AnonymousClass7TE.A0M(r7.invoke(slideInAndOutIconView));
        slideInAndOutIconView.setTextSize(f);
        slideInAndOutIconView.A03(drawable, A0M, A0M);
        slideInAndOutIconView.A0B.setPadding(A0M2, A0M2, A0M2, A0M2);
        slideInAndOutIconView.setIconColor(i);
        slideInAndOutIconView.setIconScale(f2);
        slideInAndOutIconView.setText(str);
    }
}
