package X;

import android.graphics.drawable.ColorDrawable;
import android.view.View;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.contentnotes.data.immersive.params.ContentNotesCoordinates;

/* renamed from: X.Lk3  reason: case insensitive filesystem */
public final class C64903Lk3 implements C66522MVa {
    public float A00;
    public float A01;
    public int A02;
    public ContentNotesCoordinates A03;
    public Float A04;
    public Integer A05;
    public final float A06;
    public final UserSession A07;
    public final ContentNotesCoordinates A08;
    public final LD2 A09;
    public final C63890LAt A0A;
    public final C63965LFq A0B;
    public final boolean A0C;
    public final boolean A0D;

    public C64903Lk3(UserSession userSession, ContentNotesCoordinates contentNotesCoordinates, LD2 ld2, C63890LAt lAt, C63965LFq lFq, boolean z) {
        DbW.A1N(userSession, 1, ld2);
        this.A07 = userSession;
        this.A0A = lAt;
        this.A08 = contentNotesCoordinates;
        this.A0B = lFq;
        this.A09 = ld2;
        this.A0C = z;
        0Tu r2 = 0Tu.A05;
        this.A0D = 182.A06(r2, userSession, 36323161193393080L);
        this.A06 = (182.A06(r2, userSession, 36326713130629050L) ? 32.0f : 48.0f) / 96.0f;
    }

    public final void ABM(04a r2) {
        0qQ.A0B(r2, 0);
        A00(r2.A00.A05());
        this.A04 = Float.valueOf(r2.A00.A05());
    }

    private final void A00(float f) {
        ContentNotesCoordinates contentNotesCoordinates;
        float f2 = 1.0f - f;
        float f3 = (this.A01 - this.A00) * f2;
        C63890LAt lAt = this.A0A;
        View view = lAt.A06;
        view.setTranslationY(f3);
        lAt.A01.setTranslationY(f3);
        lAt.A03.setTranslationY(f3);
        if (this.A0D) {
            int i = (int) (255.0f * f);
            View view2 = lAt.A05;
            if (view2 == null) {
                view2 = lAt.A02;
            }
            view2.getBackground().setAlpha(i);
            view.setVisibility(0);
            view.setAlpha(f);
            this.A0B.A02(f);
        }
        ContentNotesCoordinates contentNotesCoordinates2 = this.A03;
        if (contentNotesCoordinates2 == null || (contentNotesCoordinates = this.A08) == null) {
            lAt.A07.setAlpha(f);
            return;
        }
        View view3 = lAt.A07;
        view3.setPivotX(0.0f);
        view3.setPivotY(0.0f);
        view3.setTranslationX(((float) (contentNotesCoordinates.A00 - contentNotesCoordinates2.A00)) * f2);
        view3.setTranslationY(((float) (contentNotesCoordinates.A01 - (contentNotesCoordinates2.A01 - this.A02))) * f2);
        float f4 = this.A06;
        float f5 = f4 + ((1.0f - f4) * f);
        view3.setScaleX(f5);
        view3.setScaleY(f5);
    }

    public final void ABL() {
        C63890LAt lAt = this.A0A;
        View view = lAt.A06;
        view.setTranslationY(0.0f);
        lAt.A01.setTranslationY(0.0f);
        lAt.A03.setTranslationY(0.0f);
        if (this.A0D) {
            View view2 = lAt.A05;
            if (view2 == null) {
                view2 = lAt.A02;
            }
            view2.getBackground().setAlpha(255);
            view.setAlpha(1.0f);
            this.A0B.A00();
        }
        if (this.A03 == null || this.A08 == null) {
            lAt.A07.setAlpha(1.0f);
        } else {
            View view3 = lAt.A07;
            view3.setTranslationX(0.0f);
            view3.setTranslationY(0.0f);
            view3.setScaleX(1.0f);
            view3.setScaleY(1.0f);
        }
        View view4 = lAt.A02;
        LD2 ld2 = this.A09;
        SAJ.A00(view4, ld2);
        ld2.A00();
    }

    public final void CMy() {
        C63890LAt lAt = this.A0A;
        View view = lAt.A06;
        this.A01 = (float) view.getBottom();
        if (this.A0D) {
            View view2 = lAt.A05;
            if (view2 == null) {
                view2 = lAt.A02;
            }
            ColorDrawable colorDrawable = new ColorDrawable(AnonymousClass7TF.A03(view2.getContext(), R.attr.igds_color_dimmer));
            colorDrawable.setAlpha(0);
            view2.setBackground(colorDrawable);
            view.setAlpha(0.0f);
            view.setVisibility(4);
            this.A0B.A01();
        }
    }

    public final void CNa() {
        C63890LAt lAt = this.A0A;
        this.A00 = (float) lAt.A06.getBottom();
        if (this.A08 != null) {
            View view = lAt.A07;
            int[] iArr = new int[2];
            view.getLocationInWindow(iArr);
            this.A03 = new ContentNotesCoordinates(iArr[0], iArr[1]);
        }
    }

    public final void E4J(int i) {
        C63890LAt lAt = this.A0A;
        0nA.A0T(lAt.A06, i);
        this.A05 = Integer.valueOf(i);
        if (!this.A0C) {
            lAt.A07.setVisibility(0);
        }
    }

    public final void FJm(int i) {
        int intValue;
        Integer num = this.A05;
        if (num != null && (intValue = i - num.intValue()) > 0) {
            View view = this.A0A.A06;
            0nA.A0T(view, i);
            this.A00 = (float) view.getBottom();
            this.A02 = intValue;
            Float f = this.A04;
            if (f != null) {
                A00(f.floatValue());
            }
            DbT.A1Q(0wj.A01, 002.A0O("ImmersiveCreationAnimationEffectHandler: Unexpected additional keyboard height change of ", intValue), 817892647);
        }
    }
}
