package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import com.instagram.common.session.UserSession;

/* renamed from: X.JpW  reason: case insensitive filesystem */
public final class C60685JpW extends C249703kE {
    public final UserSession A00;
    public final C60065Jeo A01;

    public final void A00(Drawable drawable, View.OnClickListener onClickListener, C296235pj r8, AnonymousClass5Gv r9, CharSequence charSequence, CharSequence charSequence2, float f, boolean z, boolean z2, boolean z3) {
        0qQ.A0B(r8, 4);
        AnonymousClass0fU.A00(onClickListener, this.itemView);
        C60065Jeo jeo = this.A01;
        if (drawable == null) {
            ImageView imageView = jeo.A01;
            if (imageView == null) {
                0qQ.A0F("iconImageView");
                throw AnonymousClass00P.createAndThrow();
            } else if (jeo.indexOfChild(imageView) != -1) {
                jeo.removeView(imageView);
                jeo.A00 = null;
            }
        } else {
            jeo.setIcon(drawable);
        }
        jeo.setLabel(charSequence);
        if (charSequence2 != null) {
            charSequence = charSequence2;
        }
        jeo.setContentDescription(charSequence);
        jeo.setButtonStyle(r8);
        jeo.setVisibility(DbW.A01(z ? 1 : 0));
        jeo.setEnabled(z2);
        jeo.setActivated(z3);
        jeo.setAlpha(f);
        if (r9 != null) {
            jeo.postDelayed(new M6Q(this, r9), 500);
        }
        jeo.A02();
    }

    public C60685JpW(View view, UserSession userSession, C60065Jeo jeo) {
        super(view);
        this.A01 = jeo;
        this.A00 = userSession;
    }
}
