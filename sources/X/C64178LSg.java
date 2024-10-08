package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.LSg  reason: case insensitive filesystem */
public abstract class C64178LSg {
    public static boolean A00;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0017, code lost:
        if (java.lang.Boolean.valueOf(r1) == null) goto L_0x0019;
     */
    static {
        /*
            X.0ob r0 = X.0ob.A03
            if (r0 == 0) goto L_0x0019
            com.instagram.common.session.UserSession r3 = X.0ob.A00(r0)
            X.0Tu r2 = X.0Tu.A05
            r0 = 36320330809942328(0x810926000d2138, double:3.032461682216284E-306)
            boolean r1 = X.182.A06(r2, r3, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            if (r0 != 0) goto L_0x001a
        L_0x0019:
            r1 = 0
        L_0x001a:
            A00 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64178LSg.<clinit>():void");
    }

    public static void A01(ImageView imageView, boolean z) {
        int i;
        boolean z2 = A00;
        int i2 = R.drawable.tag_carrot;
        if (z2) {
            i2 = R.drawable.prism_tag_carrot;
        }
        Context context = imageView.getContext();
        Drawable mutate = context.getDrawable(i2).mutate();
        if (A00) {
            DbX.A11(context, mutate, R.color.igds_prism_gray_10);
            i = 230;
        } else {
            DbX.A11(context, mutate, R.color.grey_10);
            i = 179;
        }
        mutate.setAlpha(i);
        imageView.setBackground(mutate);
        imageView.setPadding(0, 0, 0, 0);
        if (!z) {
            imageView.setRotation(180.0f);
        }
    }

    public static void A00(View view, UserSession userSession, 1Xj r7, Boolean bool) {
        GradientDrawable gradientDrawable;
        int i;
        int A02;
        Context context = view.getContext();
        boolean z = A00;
        if (z) {
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setCornerRadius((float) C51972G9s.A08(context));
            gradientDrawable = gradientDrawable2;
        } else {
            gradientDrawable = context.getDrawable(R.drawable.tag_bubble_new).mutate();
        }
        if (A00) {
            DbX.A11(context, gradientDrawable, R.color.igds_prism_gray_10);
            i = 230;
        } else {
            DbX.A11(context, gradientDrawable, R.color.grey_10);
            i = 179;
        }
        gradientDrawable.setAlpha(i);
        view.setBackground(gradientDrawable);
        boolean booleanValue = bool.booleanValue();
        if (z) {
            int A01 = DbY.A01(context);
            int A022 = AnonymousClass7TG.A02(context);
            view.setPadding(A022, A01, A022, A01);
        }
        if (!booleanValue) {
            0qQ.A0B(userSession, 1);
            if (r7 != null) {
                0Tu r2 = 0Tu.A05;
                if (!182.A06(r2, userSession, 36327743923108509L)) {
                    return;
                }
                if ((r7.CcK() || 182.A06(r2, userSession, 2342170753137195679L)) && (A02 = DbS.A02(context, (int) 182.A00(r2, userSession, 37172168853422647L))) > 0) {
                    0nA.A0i(view, A02, A02);
                }
            }
        }
    }

    public static void A02(TextView textView) {
        Context context = textView.getContext();
        textView.setTextSize(2, (float) context.getResources().getInteger(R.integer.tag_text_size));
        textView.setGravity(17);
        DbT.A17(context, textView, 17170443);
    }

    public static void A03(TextView textView, int i, boolean z) {
        Context context = textView.getContext();
        Resources resources = context.getResources();
        int i2 = R.dimen.ad_tag_max_width;
        if (z) {
            i2 = R.dimen.avatar_powerups_avatar_height;
        }
        int dimensionPixelSize = resources.getDimensionPixelSize(i2);
        int dimensionPixelSize2 = i - context.getResources().getDimensionPixelSize(R.dimen.bubble_external_padding);
        if (z) {
            textView.setTextAppearance(R.style.igds_emphasized_body_2);
            textView.setLineSpacing(6.0f, 1.2f);
        } else {
            textView.setTextSize(2, (float) context.getResources().getInteger(R.integer.tag_text_size));
        }
        textView.setMinimumWidth(AnonymousClass7TG.A06(context));
        if (A00) {
            DbT.A17(context, textView, R.color.igds_prism_gray_03);
        }
        textView.setMaxWidth(dimensionPixelSize - (dimensionPixelSize2 * 2));
        textView.setGravity(16);
    }
}
