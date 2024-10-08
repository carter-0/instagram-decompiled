package X;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.view.ViewGroup;
import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.6MI  reason: invalid class name */
public abstract class AnonymousClass6MI {
    public static final int A00(IgTextView igTextView, int i) {
        int i2;
        0qQ.A0B(igTextView, 0);
        int A0B = i - 0nA.A0B(igTextView);
        if (igTextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.LayoutParams layoutParams = igTextView.getLayoutParams();
            0qQ.A0C(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            i2 = ((ViewGroup.MarginLayoutParams) layoutParams).getMarginEnd();
        } else {
            i2 = 0;
        }
        return ((A0B - i2) - igTextView.getPaddingLeft()) - igTextView.getPaddingRight();
    }

    public static final int A01(0rN r2, CharSequence charSequence, int i) {
        0qQ.A0B(charSequence, 0);
        0qQ.A0B(r2, 1);
        StaticLayout A00 = r2.A00(charSequence);
        0qQ.A07(A00);
        int lineCount = A00.getLineCount();
        for (int i2 = 0; i2 < lineCount; i2++) {
            if (A00.getLineBottom(i2) > i) {
                return i2;
            }
        }
        return A00.getLineCount();
    }

    public static final int A02(0rN r1, CharSequence charSequence, int i) {
        0qQ.A0B(charSequence, 0);
        0qQ.A0B(r1, 1);
        StaticLayout A00 = r1.A00(charSequence);
        0qQ.A07(A00);
        if (A00.getLineCount() > i) {
            return A00.getLineBottom(i - 1);
        }
        return A00.getHeight();
    }

    public static final int A03(0rN r6, CharSequence charSequence, int i) {
        0qQ.A0B(charSequence, 0);
        0qQ.A0B(r6, 1);
        StaticLayout A00 = r6.A00(charSequence);
        0qQ.A07(A00);
        int i2 = new int[]{A00.getLineCount(), i}[0];
        if (i < i2) {
            i2 = i;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            int lineWidth = (int) A00.getLineWidth(i4);
            i3 = new int[]{i3, lineWidth}[0];
            if (lineWidth > i3) {
                i3 = lineWidth;
            }
        }
        return i3;
    }

    public static final SpannableStringBuilder A04(SpannableString spannableString, 0rN r7, CharSequence charSequence, int i) {
        0qQ.A0B(charSequence, 0);
        CharSequence A01 = C252993q2.A01(r7, "", charSequence, spannableString, i, false);
        0qQ.A07(A01);
        SpannableStringBuilder append = new SpannableStringBuilder(A01).append(spannableString);
        0qQ.A07(append);
        return append;
    }

    public static final 0rN A05(Layout.Alignment alignment, IgTextView igTextView, int i) {
        0qQ.A0B(igTextView, 0);
        return new 0rN(alignment, igTextView.getPaint(), (String) null, igTextView.getLineSpacingExtra(), igTextView.getLineSpacingMultiplier(), i, false);
    }

    public static final void A06(IgTextView igTextView, float f) {
        igTextView.setTextSize(1, f);
        int textSize = (int) (igTextView.getTextSize() * 0.3f);
        int textSize2 = (int) (igTextView.getTextSize() * 0.2f);
        0nA.A0h(igTextView, textSize, textSize);
        0nA.A0i(igTextView, textSize2, textSize2);
        igTextView.setLineSpacing((float) textSize2, 1.0f);
    }

    public static final void A08(IgTextView igTextView, 0rN r13, CharSequence charSequence, int i) {
        SpannableString spannableString = new SpannableString(charSequence);
        float paddingLeft = (float) igTextView.getPaddingLeft();
        float paddingTop = (float) igTextView.getPaddingTop();
        float textSize = igTextView.getTextSize() / 4.0f;
        StaticLayout A00 = r13.A00(charSequence);
        0qQ.A07(A00);
        C306486Mi.A00(igTextView, textSize, false);
        AnonymousClass6MO r2 = new AnonymousClass6MO(C306496Mj.A02(A00, paddingLeft, paddingTop, paddingTop, textSize, 1.0f), textSize, i);
        spannableString.setSpan(r2, 0, spannableString.length(), 18);
        r2.A03 = true;
        igTextView.setText(spannableString);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0060, code lost:
        r0 = r2.getContext();
        X.0qQ.A07(r0);
        r0 = X.AnonymousClass0qo.A00(r0).A02(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006f, code lost:
        r2.setTypeface(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0072, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x003e, code lost:
        r0 = r1.A02(r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A07(com.instagram.common.ui.base.IgTextView r2, int r3) {
        /*
            switch(r3) {
                case 1: goto L_0x0031;
                case 2: goto L_0x0023;
                case 3: goto L_0x0073;
                case 4: goto L_0x0015;
                case 5: goto L_0x0007;
                case 6: goto L_0x005e;
                case 7: goto L_0x005b;
                case 8: goto L_0x0058;
                case 9: goto L_0x0055;
                case 10: goto L_0x0052;
                case 11: goto L_0x004f;
                case 12: goto L_0x004c;
                case 13: goto L_0x0049;
                case 14: goto L_0x0046;
                case 15: goto L_0x0043;
                default: goto L_0x0003;
            }
        L_0x0003:
            X.C306466Mg.A01(r2)
            return
        L_0x0007:
            android.content.Context r0 = r2.getContext()
            X.0qQ.A07(r0)
            X.0qq r1 = X.AnonymousClass0qo.A00(r0)
            X.0qm r0 = X.0qm.A0C
            goto L_0x003e
        L_0x0015:
            android.content.Context r0 = r2.getContext()
            X.0qQ.A07(r0)
            X.0qq r1 = X.AnonymousClass0qo.A00(r0)
            X.0qm r0 = X.0qm.A08
            goto L_0x003e
        L_0x0023:
            android.content.Context r0 = r2.getContext()
            X.0qQ.A07(r0)
            X.0qq r1 = X.AnonymousClass0qo.A00(r0)
            X.0qm r0 = X.0qm.A0g
            goto L_0x003e
        L_0x0031:
            android.content.Context r0 = r2.getContext()
            X.0qQ.A07(r0)
            X.0qq r1 = X.AnonymousClass0qo.A00(r0)
            X.0qm r0 = X.0qm.A0c
        L_0x003e:
            android.graphics.Typeface r0 = r1.A02(r0)
            goto L_0x006f
        L_0x0043:
            X.0qm r1 = X.0qm.A0s
            goto L_0x0060
        L_0x0046:
            X.0qm r1 = X.0qm.A0G
            goto L_0x0060
        L_0x0049:
            X.0qm r1 = X.0qm.A0y
            goto L_0x0060
        L_0x004c:
            X.0qm r1 = X.0qm.A15
            goto L_0x0060
        L_0x004f:
            X.0qm r1 = X.0qm.A0d
            goto L_0x0060
        L_0x0052:
            X.0qm r1 = X.0qm.A07
            goto L_0x0060
        L_0x0055:
            X.0qm r1 = X.0qm.A0L
            goto L_0x0060
        L_0x0058:
            X.0qm r1 = X.0qm.A0o
            goto L_0x0060
        L_0x005b:
            X.0qm r1 = X.0qm.A0f
            goto L_0x0060
        L_0x005e:
            X.0qm r1 = X.0qm.A0b
        L_0x0060:
            android.content.Context r0 = r2.getContext()
            X.0qQ.A07(r0)
            X.0qq r0 = X.AnonymousClass0qo.A00(r0)
            android.graphics.Typeface r0 = r0.A02(r1)
        L_0x006f:
            r2.setTypeface(r0)
            return
        L_0x0073:
            X.C306466Mg.A00(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6MI.A07(com.instagram.common.ui.base.IgTextView, int):void");
    }
}
