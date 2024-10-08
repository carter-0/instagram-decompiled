package X;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.Spannable;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.Log;

/* renamed from: X.3cU  reason: invalid class name and case insensitive filesystem */
public final class C245203cU {
    public static final 01e A07 = new 01e(100);
    public int A00 = Integer.MAX_VALUE;
    public int A01 = 2;
    public int A02 = 0;
    public int A03 = 2;
    public Layout A04 = null;
    public boolean A05 = true;
    public final C245213cV A06 = new C245213cV();

    public final Layout A00() {
        int i;
        int i2;
        int ceil;
        int i3;
        TextDirectionHeuristic textDirectionHeuristic;
        Layout build;
        Layout layout;
        if (this.A05 && (layout = this.A04) != null) {
            return layout;
        }
        C245213cV r5 = this.A06;
        CharSequence charSequence = r5.A0I;
        BoringLayout.Metrics metrics = null;
        if (charSequence == null || (charSequence.length() == 0 && !r5.A0L)) {
            return null;
        }
        boolean z = false;
        if (this.A05) {
            CharSequence charSequence2 = r5.A0I;
            if ((charSequence2 instanceof Spannable) && ((ClickableSpan[]) ((Spanned) charSequence2).getSpans(0, charSequence2.length() - 1, ClickableSpan.class)).length > 0) {
                z = true;
            }
        }
        if (!this.A05 || z) {
            i = -1;
        } else {
            i = r5.hashCode();
            Layout layout2 = (Layout) A07.A02(Integer.valueOf(i));
            if (layout2 != null) {
                return layout2;
            }
        }
        if (r5.A0M) {
            i2 = 1;
        } else {
            i2 = r5.A0A;
        }
        if (i2 == 1) {
            try {
                metrics = BoringLayout.isBoring(r5.A0I, r5.A0F);
            } catch (NullPointerException e) {
                throw e;
            }
        }
        int i4 = r5.A0B;
        if (i4 == 0) {
            ceil = (int) Math.ceil((double) Layout.getDesiredWidth(r5.A0I, r5.A0F));
        } else if (i4 != 1) {
            ceil = Math.min((int) Math.ceil((double) Layout.getDesiredWidth(r5.A0I, r5.A0F)), r5.A0C);
        } else {
            ceil = r5.A0C;
        }
        float f = r5.A05;
        float f2 = r5.A04;
        int round = Math.round((((float) r5.A0F.getFontMetricsInt((Paint.FontMetricsInt) null)) * f) + f2);
        int i5 = this.A01;
        int i6 = this.A00;
        if (i5 == 1) {
            i6 *= round;
        }
        int min = Math.min(ceil, i6);
        if (this.A03 == 1) {
            i3 = this.A02 * round;
        } else {
            i3 = this.A02;
        }
        int max = Math.max(min, i3);
        if (metrics != null) {
            build = BoringLayout.make(r5.A0I, r5.A0F, max, r5.A0E, f, f2, metrics, r5.A0J, r5.A0G, max);
        } else {
            while (true) {
                try {
                    CharSequence charSequence3 = r5.A0I;
                    CharSequence charSequence4 = charSequence3;
                    int length = charSequence3.length();
                    TextPaint textPaint = r5.A0F;
                    Layout.Alignment alignment = r5.A0E;
                    float f3 = r5.A05;
                    float f4 = r5.A04;
                    boolean z2 = r5.A0J;
                    TextUtils.TruncateAt truncateAt = r5.A0G;
                    C245253cZ r12 = r5.A0H;
                    int i7 = r5.A06;
                    int i8 = r5.A07;
                    int i9 = r5.A08;
                    StaticLayout.Builder maxLines = StaticLayout.Builder.obtain(charSequence4, 0, length, textPaint, max).setAlignment(alignment).setLineSpacing(f4, f3).setIncludePad(z2).setEllipsize(truncateAt).setEllipsizedWidth(max).setMaxLines(i2);
                    if (r12 == C245223cW.A04) {
                        textDirectionHeuristic = TextDirectionHeuristics.LTR;
                    } else if (r12 == C245223cW.A05) {
                        textDirectionHeuristic = TextDirectionHeuristics.RTL;
                    } else {
                        if (r12 != C245223cW.A01) {
                            if (r12 == C245223cW.A02) {
                                textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                            } else if (r12 == C245223cW.A00) {
                                textDirectionHeuristic = TextDirectionHeuristics.ANYRTL_LTR;
                            } else if (r12 == C245223cW.A03) {
                                textDirectionHeuristic = TextDirectionHeuristics.LOCALE;
                            }
                        }
                        textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
                    }
                    StaticLayout.Builder indents = maxLines.setTextDirection(textDirectionHeuristic).setBreakStrategy(i7).setHyphenationFrequency(i8).setIndents((int[]) null, (int[]) null);
                    indents.setJustificationMode(i9);
                    indents.setUseLineSpacingFromFallbacks(true);
                    build = indents.build();
                } catch (IndexOutOfBoundsException e2) {
                    if (!(r5.A0I instanceof String)) {
                        Log.e("TextLayoutBuilder", "Hit bug #35412, retrying with Spannables removed", e2);
                        r5.A0I = r5.A0I.toString();
                    } else {
                        throw e2;
                    }
                }
            }
        }
        if (this.A05 && !z) {
            this.A04 = build;
            A07.A05(Integer.valueOf(i), build);
        }
        r5.A0K = true;
        return build;
    }

    public final void A01(float f) {
        C245213cV r2 = this.A06;
        if (r2.A00 != f) {
            r2.A00 = f;
            r2.A04 = f - r2.A0F.getFontMetrics((Paint.FontMetrics) null);
            r2.A05 = 1.0f;
            this.A04 = null;
        }
    }

    public final void A02(int i) {
        C245213cV r0 = this.A06;
        r0.A00();
        r0.A0D = null;
        r0.A0F.setColor(i);
        this.A04 = null;
    }

    public final void A03(int i) {
        C245213cV r2 = this.A06;
        float f = (float) i;
        if (r2.A0F.getTextSize() != f) {
            r2.A00();
            r2.A0F.setTextSize(f);
            this.A04 = null;
        }
    }

    public final void A04(ColorStateList colorStateList) {
        int i;
        C245213cV r0 = this.A06;
        r0.A00();
        r0.A0D = colorStateList;
        TextPaint textPaint = r0.A0F;
        if (colorStateList != null) {
            i = colorStateList.getDefaultColor();
        } else {
            i = -16777216;
        }
        textPaint.setColor(i);
        this.A04 = null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0017, code lost:
        if (r4 != null) goto L_0x0019;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A05(java.lang.CharSequence r4) {
        /*
            r3 = this;
            X.3cV r1 = r3.A06
            java.lang.CharSequence r0 = r1.A0I
            if (r4 == r0) goto L_0x0027
            boolean r0 = r4 instanceof android.text.SpannableStringBuilder
            if (r0 == 0) goto L_0x0017
            r4.hashCode()     // Catch:{ NullPointerException -> 0x000e }
            goto L_0x0019
        L_0x000e:
            r2 = move-exception
            java.lang.String r1 = "The given text contains a null span. Due to an Android framework bug, this will cause an exception later down the line."
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1, r2)
            throw r0
        L_0x0017:
            if (r4 == 0) goto L_0x0022
        L_0x0019:
            java.lang.CharSequence r0 = r1.A0I
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0022
            return
        L_0x0022:
            r1.A0I = r4
            r0 = 0
            r3.A04 = r0
        L_0x0027:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C245203cU.A05(java.lang.CharSequence):void");
    }
}
