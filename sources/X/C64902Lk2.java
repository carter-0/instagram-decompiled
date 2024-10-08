package X;

import android.graphics.drawable.ColorDrawable;
import android.view.View;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.Lk2  reason: case insensitive filesystem */
public final class C64902Lk2 implements C66522MVa {
    public float A00;
    public float A01;
    public Float A02;
    public Integer A03;
    public final OI6 A04;
    public final UserSession A05;
    public final C63965LFq A06;
    public final C62320sa A07;
    public final boolean A08;

    public final void ABM(04a r2) {
        0qQ.A0B(r2, 0);
        A00(r2.A00.A05());
        this.A02 = Float.valueOf(r2.A00.A05());
    }

    private final void A00(float f) {
        float f2 = 1.0f - f;
        float f3 = (this.A01 - this.A00) * f2;
        OI6 oi6 = this.A04;
        View view = oi6.A04;
        if (view == null) {
            view = oi6.A09;
        }
        view.setTranslationY(f3);
        oi6.A00.setTranslationY(f3);
        oi6.A01.setAlpha(1.0f - f2);
        if (this.A08) {
            int i = (int) (255.0f * f);
            View view2 = oi6.A05;
            if (view2 == null) {
                view2 = oi6.A03;
            }
            view2.getBackground().setAlpha(i);
            this.A06.A02(f);
        }
    }

    public final void ABL() {
        OI6 oi6 = this.A04;
        View view = oi6.A04;
        if (view == null) {
            view = oi6.A09;
        }
        view.setTranslationY(0.0f);
        oi6.A00.setTranslationY(0.0f);
        oi6.A01.setAlpha(1.0f);
        if (this.A08) {
            View view2 = oi6.A05;
            if (view2 == null) {
                view2 = oi6.A03;
            }
            view2.getBackground().setAlpha(255);
            this.A06.A00();
        }
        this.A07.invoke();
    }

    public final void CMy() {
        OI6 oi6 = this.A04;
        View view = oi6.A04;
        if (view == null) {
            view = oi6.A09;
        }
        this.A01 = (float) view.getBottom();
        if (this.A08) {
            View view2 = oi6.A05;
            if (view2 == null) {
                view2 = oi6.A03;
            }
            ColorDrawable colorDrawable = new ColorDrawable(AnonymousClass7TF.A03(view2.getContext(), R.attr.igds_color_dimmer));
            colorDrawable.setAlpha(0);
            view2.setBackground(colorDrawable);
            this.A06.A01();
        }
    }

    public final void CNa() {
        OI6 oi6 = this.A04;
        View view = oi6.A04;
        if (view == null) {
            view = oi6.A09;
        }
        this.A00 = (float) view.getBottom();
    }

    public final void E4J(int i) {
        OI6 oi6 = this.A04;
        OOp.A01(oi6.A02, i);
        this.A03 = Integer.valueOf(i);
        View view = oi6.A01;
        view.setVisibility(0);
        view.setAlpha(0.0f);
    }

    public final void FJm(int i) {
        int intValue;
        Integer num = this.A03;
        if (num != null && (intValue = i - num.intValue()) > 0) {
            OI6 oi6 = this.A04;
            View view = oi6.A04;
            if (view == null) {
                view = oi6.A09;
            }
            OOp.A01(view, intValue);
            Float f = this.A02;
            if (f != null) {
                A00(f.floatValue());
            }
            this.A00 = (float) view.getBottom();
            DbT.A1Q(0wj.A01, 002.A0O("ImmersiveCreationAnimationEffectHandler: Unexpected additional keyboard height change of ", intValue), 817892647);
        }
    }

    public C64902Lk2(UserSession userSession, OI6 oi6, C63965LFq lFq, C62320sa r7) {
        this.A05 = userSession;
        this.A04 = oi6;
        this.A06 = lFq;
        this.A07 = r7;
        this.A08 = 182.A06(0Tu.A05, userSession, 36323161193393080L);
    }
}
