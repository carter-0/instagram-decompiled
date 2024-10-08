package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.model.direct.HighlightRange;
import java.util.List;

/* renamed from: X.79o  reason: invalid class name and case insensitive filesystem */
public abstract class C3271479o {
    public static final void A01(Spannable spannable) {
        0qQ.A0B(spannable, 0);
        Object[] spans = spannable.getSpans(0, spannable.length(), C255733ud.class);
        0qQ.A07(spans);
        for (C255733ud r1 : (C255733ud[]) spans) {
            r1.A00 = null;
            r1.A01 = null;
        }
    }

    public static final void A02(Spannable spannable, C255763ug r7, C255763ug r8, C255763ug r9, C255763ug r10, C255763ug r11, C255763ug r12, C3270679g r13) {
        0qQ.A0B(spannable, 0);
        Object[] spans = spannable.getSpans(0, spannable.length(), C255733ud.class);
        0qQ.A07(spans);
        for (C255733ud r1 : (C255733ud[]) spans) {
            switch (r1.A02.intValue()) {
                case 0:
                    r1.A00 = r8;
                    break;
                case 1:
                    r1.A00 = r9;
                    break;
                case 4:
                    r1.A00 = r10;
                    break;
                case 5:
                    r1.A00 = r7;
                    break;
                case 6:
                    r1.A00 = r12;
                    break;
                case 7:
                    r1.A00 = r11;
                    break;
            }
            r1.A01 = r13;
        }
        Object[] spans2 = spannable.getSpans(0, spannable.length(), C3271579p.class);
        0qQ.A07(spans2);
        if (0 < ((C3271579p[]) spans2).length) {
            throw new NullPointerException("onClickListener");
        }
    }

    public static final void A00(Drawable drawable, TextView textView, AnonymousClass5FV r24, AnonymousClass79c r25) {
        int i;
        int i2;
        int i3;
        2eN r0;
        AnonymousClass79c r3 = r25;
        Drawable drawable2 = drawable;
        AnonymousClass7FE r2 = r3.A03;
        CharSequence charSequence = r3.A04;
        boolean z = r3.A0B;
        AnonymousClass7L2 r12 = r2.A03;
        C328637Fo A01 = C328037De.A01(r2.A00, r2.A01);
        boolean CU2 = r3.A00.CU2();
        boolean z2 = r2.A06;
        boolean z3 = r2.A09;
        List<HighlightRange> list = r3.A08;
        boolean z4 = r3.A0G;
        boolean z5 = r3.A0A;
        TextView textView2 = textView;
        Context context = textView2.getContext();
        0qQ.A0A(context);
        AnonymousClass5FV r13 = r24;
        if (!z) {
            i = (int) 0nA.A04(context, 12);
            i2 = (int) 0nA.A04(context, 10);
            AnonymousClass5FV r17 = r13;
            AnonymousClass7FB.A06(drawable2, r17, A01, r12, CU2, false, z2, z3, z5);
        } else {
            i = 0;
            i2 = 0;
            drawable2 = null;
        }
        int i4 = 8388611;
        if (CU2) {
            i4 = 8388613;
        }
        if (textView2.getLayoutParams() instanceof LinearLayout.LayoutParams) {
            ViewGroup.LayoutParams layoutParams = textView2.getLayoutParams();
            0qQ.A0C(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            layoutParams2.gravity = i4;
            textView2.setLayoutParams(layoutParams2);
        }
        textView2.setBackground(drawable2);
        if (00k.A0u(0sr.A1P(new AnonymousClass5FV[]{AnonymousClass5FV.GiftWrap, AnonymousClass5FV.Fire}), r13) || (r13 != null && r13.A01)) {
            i3 = -1;
        } else if (z2 || z5) {
            i3 = AnonymousClass7FB.A00(r12, CU2);
        } else {
            i3 = AnonymousClass7FB.A01(r12, CU2);
        }
        textView2.setTextColor(i3);
        textView2.setPadding(i, i2, i, i2);
        if ((textView2 instanceof 2eN) && (r0 = (2eN) textView2) != null) {
            r0.setTransformText(false);
        }
        if (z) {
            textView2.setTextSize(0, textView2.getResources().getDimension(R.dimen.direct_row_message_emoji_text_size));
        } else {
            float f = 16.0f;
            if (z2) {
                f = 14.0f;
            }
            textView2.setTextSize(f);
        }
        0qQ.A0A(context);
        float f2 = 20.0f;
        if (z) {
            f2 = 36.0f;
        }
        0mq.A03(textView2, (int) 0nA.A03(context, f2));
        textView2.setMinimumWidth((int) (0nA.A04(context, 20) + 0nA.A03(context, 20.0f)));
        if (!z4) {
            CharSequence A00 = C2364433t.A00(textView2, charSequence);
            if (!(list == null || A00 == null)) {
                SpannableString spannableString = new SpannableString(A00);
                for (HighlightRange highlightRange : list) {
                    int i5 = highlightRange.A02;
                    int i6 = highlightRange.A00 + 1;
                    if (i5 >= 0 && i5 <= A00.length() && i6 >= 0 && i6 <= A00.length() && i6 >= i5) {
                        spannableString.setSpan(new ForegroundColorSpan(context.getColor(2Yu.A0H(context, R.attr.igds_color_highlight_background))), i5, i6, 33);
                        spannableString.setSpan(new BackgroundColorSpan(context.getColor(2Yu.A0H(context, R.attr.igds_color_primary_text))), i5, i6, 33);
                    }
                }
                A00 = spannableString;
            }
            textView2.setText(A00);
        }
        03v.A0B(textView2, new C3271679r());
    }
}
