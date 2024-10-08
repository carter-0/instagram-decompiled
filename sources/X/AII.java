package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;

public final class AII {
    public static final AII A00 = new Object();

    public static final C347017w8 A00(Context context, UserSession userSession, C387319m1 r7) {
        0qQ.A0B(r7, 0);
        ArrayList A1C = AnonymousClass7TE.A1C();
        int i = r7.A00;
        if (r7.A01) {
            A01(context, A1C, 0, 0, i);
            A01(context, A1C, 0, 1, i);
        }
        if (r7.A02) {
            A01(context, A1C, 1, 0, i);
            A01(context, A1C, 1, 1, i);
        }
        C347017w8 r0 = new C347017w8(context, userSession, A1C);
        r0.A03 = r7;
        return r0;
    }

    public static final void A01(Context context, List list, int i, int i2, int i3) {
        Drawable mutate;
        int[] iArr;
        int A01 = AnonymousClass7TH.A01(context);
        float A0I = (float) AnonymousClass7TE.A0I(context.getResources());
        boolean z = true;
        if (i2 != 0) {
            z = false;
        }
        Resources resources = context.getResources();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(" ");
        spannableStringBuilder.append(resources.getString(2131964450));
        int i4 = R.drawable.ig_logo;
        if (i != 0) {
            i4 = R.drawable.company_brand_meta_symbol_primary_24;
        }
        if (z) {
            if (i != 0) {
                iArr = AnonymousClass6LW.A0B;
            } else {
                iArr = AnonymousClass6LW.A0H;
            }
            AJB.A0A(resources, spannableStringBuilder, iArr, A01);
            if (i == 0) {
                int[] iArr2 = AnonymousClass6LW.A0H;
                int i5 = iArr2[0];
                int i6 = iArr2[1];
                Paint paint = AnonymousClass3JT.A00;
                Drawable drawable = context.getDrawable(i4);
                if (drawable != null) {
                    mutate = AnonymousClass3JT.A02(context, drawable, i5, i6);
                } else {
                    throw AnonymousClass7TE.A0z("Required value was null.");
                }
            } else {
                mutate = context.getDrawable(i4);
                if (mutate == null) {
                    throw AnonymousClass7TE.A0z("Required value was null.");
                }
            }
        } else {
            AJB.A04(context, spannableStringBuilder, A01);
            if (i == 0) {
                Paint paint2 = AnonymousClass3JT.A00;
                mutate = AnonymousClass3JT.A05(context, i4, context.getColor(R.color.design_dark_default_color_on_background));
            } else {
                Drawable drawable2 = context.getDrawable(i4);
                if (drawable2 != null) {
                    mutate = drawable2.mutate();
                    AnonymousClass7TE.A1R(mutate, -1);
                } else {
                    throw AnonymousClass7TE.A0z("Required value was null.");
                }
            }
        }
        C263324Kh.A01(resources, mutate, R.dimen.abc_dropdownitem_icon_width);
        C263324Kh.A03(mutate, spannableStringBuilder, AnonymousClass05K.A00, 0, 0, 0);
        C306386Ly r1 = new C306386Ly(context, i3);
        float f = (float) A01;
        AJB.A08(context, r1, A0I, f, f);
        r1.A0L(spannableStringBuilder);
        list.add(r1);
    }
}
