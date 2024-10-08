package X;

import android.content.Context;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.TextView;
import com.instagram.android.R;

/* renamed from: X.3av  reason: invalid class name and case insensitive filesystem */
public final class C244273av {
    public static final C244273av A00 = new Object();

    public static final BitmapDrawable A00(Context context) {
        0qQ.A0B(context, 0);
        Drawable drawable = context.getDrawable(R.drawable.verified_profile);
        0qQ.A0C(drawable, "null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable");
        return (BitmapDrawable) drawable;
    }

    public static final SpannableStringBuilder A01(TextView textView, CharSequence charSequence) {
        0qQ.A0B(charSequence, 1);
        Context context = textView.getContext();
        0qQ.A0A(context);
        Drawable mutate = A00(context).mutate();
        0qQ.A07(mutate);
        int i = 0;
        mutate.setBounds(0, 0, mutate.getIntrinsicWidth(), mutate.getIntrinsicHeight());
        0qQ.A0B(context, 0);
        mutate.setColorFilter(AnonymousClass37O.A00(context.getColor(R.color.badge_color)));
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        RectF rectF = 0nA.A01;
        float applyDimension = TypedValue.applyDimension(1, 2.0f, displayMetrics);
        CharSequence ellipsize = TextUtils.ellipsize(charSequence, textView.getPaint(), (((float) textView.getWidth()) - applyDimension) - ((float) mutate.getIntrinsicWidth()), TextUtils.TruncateAt.END, false, (TextUtils.EllipsizeCallback) null);
        0qQ.A07(ellipsize);
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(ellipsize);
        valueOf.append(" ");
        C2606346l r3 = new C2606346l(mutate);
        if (ellipsize.length() >= charSequence.length()) {
            i = (int) applyDimension;
        }
        r3.A00 = i;
        valueOf.setSpan(r3, valueOf.length() - 1, valueOf.length(), 33);
        return valueOf;
    }

    public static final void A03(Context context, SpannableStringBuilder spannableStringBuilder, int i) {
        0qQ.A0B(context, 0);
        0qQ.A0B(spannableStringBuilder, 1);
        A00.A06(context, spannableStringBuilder, (Integer) null, i, true, 0mk.A02(context));
    }

    public static final void A04(Context context, SpannableStringBuilder spannableStringBuilder, int i) {
        int i2 = i;
        Context context2 = context;
        boolean A02 = 0mk.A02(context);
        SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
        spannableStringBuilder.insert(i, " ");
        C244273av r0 = A00;
        if (!A02) {
            i2 = i + 1;
        }
        r0.A06(context2, spannableStringBuilder2, (Integer) null, i2, true, A02);
    }

    public static final void A05(Context context, SpannableStringBuilder spannableStringBuilder, C244273av r7, Integer num, boolean z, boolean z2) {
        int length;
        SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
        boolean z3 = z2;
        if (z2) {
            length = 0;
        } else {
            length = spannableStringBuilder2.length();
        }
        r7.A06(context, spannableStringBuilder2, num, length, z, z3);
    }

    public static final void A08(Context context, SpannableStringBuilder spannableStringBuilder, boolean z) {
        Context context2 = context;
        0qQ.A0B(context, 0);
        boolean A02 = 0mk.A02(context);
        C244273av r4 = A00;
        SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
        if (A02) {
            spannableStringBuilder.insert(0, " ");
        } else {
            spannableStringBuilder.append(" ");
        }
        A05(context2, spannableStringBuilder2, r4, (Integer) null, z, A02);
    }

    public static final void A09(TextView textView, int i, int i2, int i3, boolean z) {
        Drawable drawable;
        0qQ.A0B(textView, 0);
        Context context = textView.getContext();
        boolean A02 = 0mk.A02(context);
        if (z) {
            0qQ.A0A(context);
            drawable = A00(context).mutate();
            int i4 = i2;
            if (A02) {
                i4 = 0;
            }
            int intrinsicWidth = drawable.getIntrinsicWidth();
            if (!A02) {
                intrinsicWidth += i2;
            }
            drawable.setBounds(i4, i, intrinsicWidth, drawable.getIntrinsicHeight() + i);
            if (A02) {
                0nA.A0Y(textView, drawable.getIntrinsicWidth());
            } else {
                0nA.A0a(textView, i2);
            }
            if (i3 != -1) {
                drawable.setColorFilter(AnonymousClass37O.A00(i3));
            }
        } else {
            drawable = null;
        }
        Drawable drawable2 = null;
        if (A02) {
            drawable2 = drawable;
            drawable = null;
        }
        textView.setCompoundDrawables(drawable2, (Drawable) null, drawable, (Drawable) null);
    }

    public static final void A0B(TextView textView, boolean z) {
        0qQ.A0B(textView, 0);
        Context context = textView.getContext();
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        RectF rectF = 0nA.A01;
        A09(textView, (int) TypedValue.applyDimension(1, 1.0f, displayMetrics), 0, context.getColor(R.color.badge_color), z);
    }

    public static final void A0C(TextView textView, boolean z) {
        0qQ.A0B(textView, 0);
        Context context = textView.getContext();
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        RectF rectF = 0nA.A01;
        A09(textView, (int) TypedValue.applyDimension(1, 1.0f, displayMetrics), 0, context.getColor(2Yu.A0H(context, R.attr.igds_color_gradient_blue)), z);
    }

    public static final void A07(Context context, SpannableStringBuilder spannableStringBuilder, boolean z) {
        A05(context, spannableStringBuilder, A00, (Integer) null, z, 0mk.A02(context));
    }

    public static final void A02(Context context, SpannableStringBuilder spannableStringBuilder) {
        Context context2 = context;
        boolean A02 = 0mk.A02(context);
        C244273av r4 = A00;
        SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
        if (A02) {
            spannableStringBuilder.insert(0, " ");
        } else {
            spannableStringBuilder.append(" ");
        }
        A05(context2, spannableStringBuilder2, r4, Integer.valueOf(R.color.design_dark_default_color_on_background), false, A02);
    }

    /* JADX WARNING: type inference failed for: r1v3, types: [android.text.style.CharacterStyle, java.lang.Object, X.4m1] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0045  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A06(android.content.Context r6, android.text.SpannableStringBuilder r7, java.lang.Integer r8, int r9, boolean r10, boolean r11) {
        /*
            r5 = this;
            android.graphics.drawable.BitmapDrawable r0 = A00(r6)
            android.graphics.drawable.Drawable r3 = r0.mutate()
            X.0qQ.A07(r3)
            if (r8 == 0) goto L_0x007f
            int r0 = r8.intValue()
        L_0x0011:
            int r0 = r6.getColor(r0)
            android.graphics.ColorFilter r0 = X.AnonymousClass37O.A00(r0)
            r3.setColorFilter(r0)
        L_0x001c:
            int r1 = r3.getIntrinsicWidth()
            int r0 = r3.getIntrinsicHeight()
            r4 = 0
            r3.setBounds(r4, r4, r1, r0)
            X.46l r2 = new X.46l
            r2.<init>(r3)
            int r0 = r7.length()
            java.lang.String r1 = " "
            if (r9 != r0) goto L_0x007b
            r7.append(r1)
        L_0x0038:
            int r0 = r9 + 1
            r3 = 33
            r7.setSpan(r2, r9, r0, r3)
            boolean r0 = X.2eO.A00(r6)
            if (r0 == 0) goto L_0x0072
            r2 = 0
            if (r11 == 0) goto L_0x0073
            r7.insert(r4, r1)
        L_0x004b:
            r0 = 2131976380(0x7f1360bc, float:1.9589879E38)
            java.lang.String r0 = r6.getString(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            if (r11 != 0) goto L_0x005d
            int r2 = r1.length()
        L_0x005d:
            java.lang.String r0 = " , "
            r1.insert(r2, r0)
            java.lang.String r0 = r1.toString()
            X.4m1 r1 = new X.4m1
            r1.<init>()
            r1.A00 = r0
            int r0 = r9 + 1
            r7.setSpan(r1, r9, r0, r3)
        L_0x0072:
            return
        L_0x0073:
            int r9 = r7.length()
            r7.append(r1)
            goto L_0x004b
        L_0x007b:
            r7.insert(r9, r1)
            goto L_0x0038
        L_0x007f:
            if (r10 == 0) goto L_0x001c
            r0 = 2131099701(0x7f060035, float:1.7811763E38)
            goto L_0x0011
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C244273av.A06(android.content.Context, android.text.SpannableStringBuilder, java.lang.Integer, int, boolean, boolean):void");
    }

    public static final void A0A(TextView textView, int i, boolean z) {
        Context context = textView.getContext();
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        RectF rectF = 0nA.A01;
        A09(textView, (int) TypedValue.applyDimension(1, 1.0f, displayMetrics), i, context.getColor(R.color.badge_color), z);
    }
}
