package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.shapes.Shape;
import com.instagram.android.R;

/* renamed from: X.7FB  reason: invalid class name */
public abstract class AnonymousClass7FB {
    public static final int A00(AnonymousClass7L2 r1, boolean z) {
        0qQ.A0B(r1, 0);
        if (z) {
            return r1.A05.A04;
        }
        return r1.A06.A05;
    }

    public static final int A01(AnonymousClass7L2 r1, boolean z) {
        0qQ.A0B(r1, 0);
        return A04(r1, z).A04;
    }

    public static final LayerDrawable A02(AnonymousClass7L2 r2) {
        0qQ.A0B(r2, 0);
        C328047Df r22 = new C328047Df((C242553Us) null, 127);
        new Object();
        return (LayerDrawable) AnonymousClass762.A00(r22, true).A00;
    }

    public static final C242553Us A03(Context context, AnonymousClass7L2 r5, 2FW r6, boolean z, boolean z2, boolean z3) {
        float f;
        float f2;
        0qQ.A0B(context, 0);
        0qQ.A0B(r5, 1);
        0qQ.A0B(r6, 5);
        C329977Ky r3 = A04(r5, z).A0A;
        if (r6 == 2FW.A1T || r6 == 2FW.A1e) {
            C328637Fo r1 = C328637Fo.NONE;
            float f3 = r3.A02;
            return C329977Ky.A00(r1, r3, f3, f3);
        } else if (r6 == 2FW.A0z) {
            C242553Us r2 = new C242553Us();
            float f4 = r3.A02;
            r2.A07(f4, f4, 0.0f, 0.0f);
            return r2;
        } else {
            C328637Fo A01 = C328037De.A01(z2, z3);
            boolean A02 = 0mk.A02(context);
            if (!z ? !A02 : A02) {
                f = r3.A01;
                f2 = r3.A02;
            } else {
                f = r3.A02;
                f2 = r3.A01;
            }
            return C329977Ky.A00(A01, r3, f, f2);
        }
    }

    public static final C329987Kz A04(AnonymousClass7L2 r1, boolean z) {
        0qQ.A0B(r1, 0);
        if (z) {
            return r1.A05;
        }
        return r1.A06;
    }

    public static final void A05(Context context, Drawable drawable, AnonymousClass7L2 r8, boolean z) {
        float f;
        float f2;
        C328637Fo r0;
        0qQ.A0B(context, 0);
        0qQ.A0B(r8, 1);
        0qQ.A0B(drawable, 3);
        C329977Ky r5 = r8.A06.A0A;
        if (0mk.A02(context)) {
            f = r5.A02;
            f2 = r5.A01;
        } else {
            f = r5.A01;
            f2 = r5.A02;
        }
        C331277Qg r3 = (C331277Qg) C331277Qg.A06.get(drawable);
        if (r3 != null) {
            float f3 = r5.A00;
            if (f3 == 0.0f) {
                int i = r5.A04;
                if (i == 0) {
                    i = r5.A03;
                }
                r3.A01(i);
            } else {
                r3.A02(r5.A03, f3, true);
            }
            Shape shape = r3.A03;
            if (shape instanceof C308496Um) {
                C308496Um r1 = (C308496Um) shape;
                if (z) {
                    r0 = C328637Fo.GROUP_WITH_ABOVE;
                } else {
                    r0 = C328637Fo.NONE;
                }
                C329977Ky.A01(r1, r0, r5, f, f2);
            }
        }
    }

    public static final void A06(Drawable drawable, AnonymousClass5FV r6, C328637Fo r7, AnonymousClass7L2 r8, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        0qQ.A0B(r8, 0);
        0qQ.A0B(r7, 1);
        A04(r8, z).A00(drawable, r6, r7, z, z2, z3, z4, z5);
    }

    public static final void A07(Drawable drawable, AnonymousClass7L2 r6, boolean z) {
        0qQ.A0B(r6, 0);
        0qQ.A0B(drawable, 1);
        C329987Kz r0 = r6.A06;
        C329977Ky r3 = r0.A0A;
        Context context = r0.A09;
        0qQ.A0B(context, 0);
        C331277Qg r5 = (C331277Qg) C331277Qg.A06.get(drawable);
        if (r5 != null) {
            int i = r3.A04;
            int i2 = r3.A03;
            float f = r3.A00;
            if ((i == 0 || i == i2) && (!AnonymousClass3HA.A00(context) || r3.A0A)) {
                i = context.getColor(2Yu.A0H(context, R.attr.igds_color_primary_background));
            }
            if (z) {
                i2 = context.getColor(2Yu.A0H(context, R.attr.igds_color_highlight_background));
                f = (float) context.getResources().getDimensionPixelSize(R.dimen.account_recs_header_image_margin);
            }
            if (r3.A0A) {
                f = (float) context.getResources().getDimensionPixelSize(R.dimen.account_recs_header_image_margin);
            }
            r5.A03(i, i2, f);
            Shape shape = r5.A03;
            if (shape instanceof C308496Um) {
                0qQ.A0C(shape, "null cannot be cast to non-null type com.facebook.common.messagingui.roundedcornergradientdrawable.shape.RoundedRectShape");
                C328637Fo r1 = C328637Fo.NONE;
                float f2 = r3.A02;
                C329977Ky.A01((C308496Um) shape, r1, r3, f2, f2);
            }
        }
    }
}
