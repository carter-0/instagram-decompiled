package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.77g  reason: invalid class name and case insensitive filesystem */
public abstract class C3265577g {
    public static void A06(Drawable drawable, View view, AnonymousClass7FE r4, boolean z) {
        A07(drawable, r4, z, false, r4.A07);
        view.setBackground(drawable);
    }

    public static int A00(AnonymousClass7FE r3) {
        AnonymousClass7L2 r2 = r3.A03;
        boolean z = r3.A07;
        0qQ.A0B(r2, 0);
        return AnonymousClass7FB.A04(r2, z).A07;
    }

    public static C242553Us A01(Context context, AnonymousClass7FE r7) {
        return AnonymousClass7FB.A03(context, r7.A03, r7.A04, r7.A07, r7.A00, r7.A01);
    }

    public static AnonymousClass77D A02(C242553Us r8) {
        C328047Df r6 = new C328047Df();
        float[] fArr = r8.A01;
        float f = fArr[6];
        float f2 = fArr[7];
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        fArr[4] = 0.0f;
        fArr[5] = 0.0f;
        fArr[6] = f;
        fArr[7] = f2;
        C242553Us.A01(r8);
        r6.A02(r8, AnonymousClass05K.A00);
        return new AnonymousClass77D(r6, AnonymousClass77E.A00);
    }

    public static AnonymousClass77D A03(C242553Us r8) {
        C328047Df r6 = new C328047Df();
        float[] fArr = r8.A01;
        float f = fArr[4];
        float f2 = fArr[5];
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        fArr[4] = f;
        fArr[5] = f2;
        fArr[6] = 0.0f;
        fArr[7] = 0.0f;
        C242553Us.A01(r8);
        r6.A02(r8, AnonymousClass05K.A00);
        return new AnonymousClass77D(r6, AnonymousClass77E.A00);
    }

    public static AnonymousClass77D A04(C242553Us r3, IgImageView igImageView) {
        AnonymousClass77D r2;
        C226642hc r22 = igImageView.A0I;
        if (r22 instanceof AnonymousClass77D) {
            r2 = (AnonymousClass77D) r22;
            C328047Df A00 = r2.A04.A00();
            if (A00 != null) {
                0qQ.A0B(r3, 0);
                A00.A02(r3, AnonymousClass05K.A00);
                igImageView.setImageRendererAndReset(r2);
                return r2;
            }
        }
        C328047Df r1 = new C328047Df();
        0qQ.A0B(r3, 0);
        r1.A02(r3, AnonymousClass05K.A00);
        r2 = new AnonymousClass77D(r1, AnonymousClass77E.A00);
        igImageView.setImageRendererAndReset(r2);
        return r2;
    }

    public static void A07(Drawable drawable, AnonymousClass7FE r8, boolean z, boolean z2, boolean z3) {
        AnonymousClass7L2 r3 = r8.A03;
        C328637Fo A01 = C328037De.A01(r8.A00, r8.A01);
        drawable.getClass();
        boolean z4 = z3;
        AnonymousClass7FB.A06(drawable, (AnonymousClass5FV) null, A01, r3, z4, z, z2, r8.A09, false);
    }

    public static AnonymousClass77D A05(IgImageView igImageView, AnonymousClass7FE r7) {
        return A04(AnonymousClass7FB.A03(igImageView.getContext(), r7.A03, r7.A04, r7.A07, r7.A00, r7.A01), igImageView);
    }
}
