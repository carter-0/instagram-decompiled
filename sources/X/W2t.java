package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.widget.TextView;
import com.instagram.android.R;

public abstract class W2t {
    public static final SpannableStringBuilder A01(Context context, int i) {
        0qQ.A0B(context, 0);
        return A03(context, context.getDrawable(R.drawable.chevron_right_double_outline_12), i, 0, true, false);
    }

    public static final SpannableStringBuilder A02(Context context, int i, boolean z) {
        Context context2 = context;
        0qQ.A0B(context, 0);
        int i2 = R.drawable.instagram_chevron_right_pano_outline_12;
        int i3 = R.attr.glyphColorSecondary;
        if (z) {
            i2 = R.drawable.instagram_chevron_right_pano_filled_12;
            i3 = R.attr.igds_color_primary_text_on_media;
        }
        return A03(context2, AnonymousClass4Ed.A01(context, i2, 2Yu.A0H(context, i3)), i, 0, true, false);
    }

    public static final SpannableStringBuilder A03(Context context, Drawable drawable, int i, int i2, boolean z, boolean z2) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (z) {
            spannableStringBuilder.append("﻿");
        }
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append("cc");
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.add_payment_bottom_sheet_row_subtitle_size);
        if (drawable != null) {
            drawable.setBounds(0, 0, (drawable.getIntrinsicWidth() * dimensionPixelSize) / drawable.getIntrinsicHeight(), dimensionPixelSize);
            C2606346l r2 = new C2606346l(drawable);
            r2.A02 = AnonymousClass05K.A00;
            r2.A00 = i;
            r2.A01 = i2;
            spannableStringBuilder.setSpan(r2, length, length + 2, 33);
        }
        if (z2) {
            spannableStringBuilder.append("﻿");
        }
        return spannableStringBuilder;
    }

    public static final CharSequence A04(Context context, 0rN r5, String str, int i, int i2) {
        CharSequence[] charSequenceArr;
        0qQ.A0B(str, 1);
        SpannableStringBuilder A01 = A01(context, i);
        StaticLayout A00 = r5.A00(new SpannableStringBuilder(AnonymousClass7TG.A0m(A01, str, new StringBuilder())));
        0qQ.A07(A00);
        if (A00.getLineCount() > i2) {
            StringBuilder sb = new StringBuilder(str);
            SpannableStringBuilder append = new SpannableStringBuilder("…").append(A01);
            0qQ.A07(append);
            StaticLayout A002 = r5.A00(str);
            0qQ.A07(A002);
            charSequenceArr = new CharSequence[]{VH5.A00(A002, append, r5, sb, i2), "…", A01};
        } else {
            charSequenceArr = new CharSequence[]{str, A01};
        }
        CharSequence concat = TextUtils.concat(charSequenceArr);
        0qQ.A0A(concat);
        return concat;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: java.lang.String} */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004e, code lost:
        if (r9 != 1) goto L_0x0050;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0057, code lost:
        if (r9 != 1) goto L_0x0059;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.CharSequence A05(android.content.Context r19, java.util.List r20, int r21, int r22, int r23) {
        /*
            r6 = 2
            r1 = r22
            r0 = r23
            int[] r12 = new int[]{r1, r0}
            r5 = -1001(0xfffffffffffffc17, float:NaN)
            r4 = 1
            int[] r11 = new int[]{r5, r5}
            if (r20 == 0) goto L_0x00a1
            int r0 = r20.size()
            if (r0 == r4) goto L_0x001f
            int r1 = r20.size()
            r0 = 5
            if (r1 != r0) goto L_0x00a1
        L_0x001f:
            android.text.SpannableStringBuilder r0 = new android.text.SpannableStringBuilder
            r0.<init>()
            java.util.Iterator r10 = r20.iterator()
        L_0x0028:
            boolean r1 = r10.hasNext()
            if (r1 == 0) goto L_0x00a3
            java.lang.Object r1 = r10.next()
            com.instagram.api.schemas.AdsRatingAndReviewStarType r1 = (com.instagram.api.schemas.AdsRatingAndReviewStarType) r1
            if (r1 == 0) goto L_0x009e
            int r9 = r1.ordinal()
            r8 = -1003(0xfffffffffffffc15, float:NaN)
            if (r9 == r6) goto L_0x009a
            r1 = 3
            if (r9 == r1) goto L_0x0096
            if (r9 != r4) goto L_0x0046
            r8 = 2131238842(0x7f081fba, float:1.8093974E38)
        L_0x0046:
            r7 = 3
            r3 = -1002(0xfffffffffffffc16, float:NaN)
            r1 = 1
            if (r9 == r6) goto L_0x0092
            if (r9 == r7) goto L_0x0092
            if (r9 == r4) goto L_0x0093
        L_0x0050:
            r2 = -1001(0xfffffffffffffc17, float:NaN)
            r1 = 1
            if (r9 == r6) goto L_0x008e
            if (r9 == r7) goto L_0x008e
            if (r9 == r4) goto L_0x008f
        L_0x0059:
            r1 = -1003(0xfffffffffffffc15, float:NaN)
            if (r8 == r1) goto L_0x009e
            r1 = -1002(0xfffffffffffffc16, float:NaN)
            r13 = r19
            if (r3 == r1) goto L_0x0078
            android.graphics.drawable.Drawable r14 = X.AnonymousClass4Ed.A01(r13, r8, r3)
        L_0x0067:
            if (r14 == 0) goto L_0x009e
            r15 = 0
            r16 = r21
            r17 = r15
            r18 = r4
            android.text.SpannableStringBuilder r1 = A03(r13, r14, r15, r16, r17, r18)
        L_0x0074:
            r0.append(r1)
            goto L_0x0028
        L_0x0078:
            if (r2 == r5) goto L_0x009e
            android.util.TypedValue r1 = X.AnonymousClass4Ed.A00
            r14 = 0
            android.graphics.drawable.Drawable r1 = r13.getDrawable(r8)     // Catch:{ NotFoundException -> 0x0067 }
            if (r1 == 0) goto L_0x0067
            android.graphics.drawable.Drawable r14 = r1.mutate()
            X.0qQ.A07(r14)
            X.AnonymousClass7TE.A1R(r14, r2)
            goto L_0x0067
        L_0x008e:
            r1 = 0
        L_0x008f:
            r2 = r11[r1]
            goto L_0x0059
        L_0x0092:
            r1 = 0
        L_0x0093:
            r3 = r12[r1]
            goto L_0x0050
        L_0x0096:
            r8 = 2131238835(0x7f081fb3, float:1.809396E38)
            goto L_0x0046
        L_0x009a:
            r8 = 2131238839(0x7f081fb7, float:1.8093968E38)
            goto L_0x0046
        L_0x009e:
            java.lang.String r1 = ""
            goto L_0x0074
        L_0x00a1:
            java.lang.String r0 = ""
        L_0x00a3:
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.W2t.A05(android.content.Context, java.util.List, int, int, int):java.lang.CharSequence");
    }

    public static SpannableStringBuilder A00(Context context) {
        return A01(context, context.getResources().getDimensionPixelSize(R.dimen.call_peek_promo_bottom_sheet_label_bottom_padding));
    }

    public static final CharSequence A06(TextView textView, String str, int i, int i2) {
        AnonymousClass7TG.A1N(textView, str);
        0rN r3 = new 0rN(Layout.Alignment.ALIGN_NORMAL, textView.getPaint(), (String) null, textView.getLineSpacingExtra(), textView.getLineSpacingMultiplier(), i2, textView.getIncludeFontPadding());
        Context A0S = AnonymousClass7TE.A0S(textView);
        return A04(A0S, r3, str, AnonymousClass7TF.A02(A0S, i), textView.getMaxLines());
    }
}
