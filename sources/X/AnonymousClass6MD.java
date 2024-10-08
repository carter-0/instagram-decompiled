package X;

import android.view.View;
import android.view.ViewGroup;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;

/* renamed from: X.6MD  reason: invalid class name */
public abstract class AnonymousClass6MD {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public final AnonymousClass6ME A04;

    public int A03() {
        if (this instanceof AnonymousClass6MC) {
            return ((AnonymousClass6MC) this).A00;
        }
        if (this instanceof AnonymousClass6MF) {
            return ((AnonymousClass6MF) this).A02;
        }
        return this.A00;
    }

    public int A04() {
        if (this instanceof AnonymousClass6MC) {
            return ((AnonymousClass6MC) this).A01;
        }
        return this.A01;
    }

    public int A05() {
        if (this instanceof AnonymousClass6MC) {
            return ((AnonymousClass6MC) this).A02;
        }
        if (this instanceof AnonymousClass6MF) {
            return ((AnonymousClass6MF) this).A04;
        }
        return this.A02;
    }

    public int A06() {
        if (this instanceof AnonymousClass6MC) {
            return ((AnonymousClass6MC) this).A03;
        }
        return this.A03;
    }

    public void A07(AnonymousClass6MH r8) {
        if (this instanceof AnonymousClass6MC) {
            AnonymousClass6MC r5 = (AnonymousClass6MC) this;
            MediaFrameLayout mediaFrameLayout = r5.A08;
            ViewGroup.LayoutParams layoutParams = mediaFrameLayout.getLayoutParams();
            0qQ.A0C(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            int i = r8.A01;
            layoutParams.width = i;
            int i2 = r8.A00;
            layoutParams.height = i2;
            mediaFrameLayout.setLayoutParams(layoutParams);
            int i3 = r8.A03;
            mediaFrameLayout.setTranslationY((float) i3);
            AnonymousClass6MA r3 = r5.A07;
            r3.A00("media_width", i);
            r3.A00("media_height", i2);
            r3.A00("media_position_start_y", i3);
            1Xj r2 = r5.A05.A0b;
            r2.getClass();
            r3.A01("background_color_top", String.valueOf(r2.A2u()));
            r3.A01("background_color_bottom", String.valueOf(r2.A2t()));
        } else if (this instanceof AnonymousClass6MF) {
            AnonymousClass6MF r4 = (AnonymousClass6MF) this;
            boolean z = r8.A04;
            C252063oV r0 = r4.A0G;
            if (z) {
                r0.setVisibility(8);
                r4.A0F.setVisibility(8);
            } else {
                r0.setVisibility(0);
                IgTextView igTextView = r4.A0E;
                float f = (float) r8.A03;
                igTextView.setTranslationY(f);
                AnonymousClass6MF.A01(r4, r8.A00);
                AnonymousClass6MF.A00(r4);
                if (r4.A0Q) {
                    C252063oV r02 = r4.A0F;
                    r02.setVisibility(0);
                    View view = r02.getView();
                    String str = r4.A0P;
                    0rN r1 = r4.A05;
                    if (r1 == null) {
                        0qQ.A0F("textLayoutParams");
                        throw AnonymousClass00P.createAndThrow();
                    }
                    view.setTranslationX((((float) (r4.A06() - ((AnonymousClass6MI.A03(r1, str, igTextView.getMaxLines()) + igTextView.getPaddingLeft()) + igTextView.getPaddingRight()))) * 0.5f) - ((float) 0nA.A0B(view)));
                    view.setTranslationY(f + ((float) r4.A03) + ((float) r4.A0M.A0G));
                }
            }
            AnonymousClass6MF.A02(r4, r8);
        }
    }

    public AnonymousClass6MD(AnonymousClass6M6 r2, AnonymousClass6ME r3) {
        this.A04 = r3;
        int i = r2.A0G;
        this.A02 = i;
        this.A00 = i;
        this.A03 = r2.A0F;
    }
}
