package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.user.model.User;
import java.util.ArrayList;

/* renamed from: X.4Ga  reason: invalid class name and case insensitive filesystem */
public final class C262794Ga {
    public final C252063oV A00;
    public final AnonymousClass0eM A01;
    public final AnonymousClass0eM A02;
    public final AnonymousClass0eM A03;
    public final AnonymousClass0eM A04;
    public final AnonymousClass0eM A05;
    public final AnonymousClass0eM A06;
    public final AnonymousClass0eM A07;
    public final AnonymousClass0eM A08;
    public final AnonymousClass0eM A09;
    public final AnonymousClass0eM A0A;
    public final AnonymousClass0eM A0B;
    public final AnonymousClass0eM A0C;
    public final AnonymousClass0eM A0D;
    public final AnonymousClass0eM A0E;
    public final AnonymousClass0eM A0F;

    public C262794Ga(ViewStub viewStub) {
        0qQ.A0B(viewStub, 1);
        this.A00 = 2b1.A01(viewStub, false, false);
        0eO r2 = 0eO.A04;
        this.A0F = AnonymousClass0eN.A00(r2, new AnonymousClass9LW(this, 17));
        this.A02 = AnonymousClass0eN.A00(r2, new AnonymousClass9LW(this, 4));
        this.A04 = AnonymousClass0eN.A00(r2, new AnonymousClass9LW(this, 6));
        this.A06 = AnonymousClass0eN.A00(r2, new AnonymousClass9LW(this, 8));
        this.A05 = AnonymousClass0eN.A00(r2, new AnonymousClass9LW(this, 7));
        this.A03 = AnonymousClass0eN.A00(r2, new AnonymousClass9LW(this, 5));
        this.A0E = AnonymousClass0eN.A00(r2, new AnonymousClass9LW(this, 16));
        this.A0D = AnonymousClass0eN.A00(r2, new AnonymousClass9LW(this, 15));
        this.A0B = AnonymousClass0eN.A00(r2, new AnonymousClass9LW(this, 13));
        this.A07 = AnonymousClass0eN.A00(r2, new AnonymousClass9LW(this, 9));
        this.A0A = AnonymousClass0eN.A00(r2, new AnonymousClass9LW(this, 12));
        this.A0C = AnonymousClass0eN.A00(r2, new AnonymousClass9LW(this, 14));
        this.A08 = AnonymousClass0eN.A00(r2, new AnonymousClass9LW(this, 10));
        this.A09 = AnonymousClass0eN.A00(r2, new AnonymousClass9LW(this, 11));
        this.A01 = AnonymousClass0eN.A00(r2, new AnonymousClass9LW(this, 3));
    }

    public static final C244303ay A00(ImageUrl imageUrl, C262794Ga r8, int i) {
        int intValue = ((Number) r8.A08.getValue()).intValue();
        AnonymousClass0eM r3 = r8.A0F;
        return new C244303ay(imageUrl, "OpenCarouselPromptRedesignViewBinder", i, intValue, ((View) r3.getValue()).getContext().getColor(2Yu.A0H(((View) r3.getValue()).getContext(), R.attr.igds_color_separator_or_stroke_on_media)), ((View) r3.getValue()).getContext().getColor(2Yu.A0H(((View) r3.getValue()).getContext(), R.attr.igds_color_secondary_icon)));
    }

    public static final C244323b0 A01(C262794Ga r7, User user, int i) {
        ArrayList arrayList = new ArrayList();
        int i2 = i;
        arrayList.add(A00(user.Bh3(), r7, i));
        AnonymousClass0eM r2 = r7.A0F;
        Drawable drawable = ((View) r2.getValue()).getContext().getDrawable(R.drawable.carousel_open_carousel_add_icon);
        if (drawable != null) {
            arrayList.add(drawable);
        }
        return new C244323b0(((View) r2.getValue()).getContext(), (Integer) null, AnonymousClass05K.A00, arrayList, 0.3f, i2, i, 1);
    }

    public final void A03(User user, String str, boolean z) {
        if (z) {
            Object value = this.A0E.getValue();
            0qQ.A07(value);
            ViewGroup.LayoutParams layoutParams = ((View) value).getLayoutParams();
            0qQ.A0C(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = ((View) this.A0F.getValue()).getResources().getDimensionPixelSize(R.dimen.abc_button_padding_horizontal_material);
        }
        if (str == null || str.length() == 0) {
            AnonymousClass0eM r0 = this.A0E;
            if (user != null) {
                Object value2 = r0.getValue();
                0qQ.A07(value2);
                ((TextView) value2).setText(((View) this.A0F.getValue()).getResources().getString(2131969003, new Object[]{user.getUsername()}));
                return;
            }
            Object value3 = r0.getValue();
            0qQ.A07(value3);
            ((View) value3).setVisibility(4);
            return;
        }
        Object value4 = this.A0E.getValue();
        0qQ.A07(value4);
        ((TextView) value4).setText(str);
    }

    public static final void A02(UserSession userSession, C262794Ga r4, boolean z) {
        if (!C56645I6a.A02(userSession) && 182.A06(0Tu.A05, userSession, 2342163288485798070L)) {
            AnonymousClass0eM r3 = r4.A02;
            Object value = r3.getValue();
            0qQ.A07(value);
            ((View) value).setElevation(((Number) r4.A01.getValue()).floatValue());
            if (!z) {
                Object value2 = r3.getValue();
                0qQ.A07(value2);
                ViewGroup.LayoutParams layoutParams = ((View) value2).getLayoutParams();
                0qQ.A0C(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                ((C71492dQ) layoutParams).A06 = 0.9f;
                Object value3 = r3.getValue();
                0qQ.A07(value3);
                ViewGroup.LayoutParams layoutParams2 = ((View) value3).getLayoutParams();
                0qQ.A0C(layoutParams2, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                ((C71492dQ) layoutParams2).A05 = 0.85f;
            }
        }
    }
}
