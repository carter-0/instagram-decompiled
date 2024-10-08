package com.instagram.ui.widget.expandingtextview;

import X.AnonymousClass0fD;
import X.C66580MXl;
import X.C66582MXn;
import X.C71382cm;
import X.C71622eP;
import X.DbS;
import X.DbT;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.Html;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.TextView;
import com.instagram.common.ui.base.IgTextView;
import java.text.BreakIterator;

public class EllipsizingTextView extends IgTextView {
    public int A00;
    public CharSequence A01;
    public CharSequence A02 = "";
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public int A06;
    public boolean A07;
    public boolean A08;

    /* JADX WARNING: type inference failed for: r6v0, types: [android.widget.TextView, com.instagram.ui.widget.expandingtextview.EllipsizingTextView] */
    private void A01(Context context, AttributeSet attributeSet) {
        CharSequence charSequence;
        EllipsizingTextView.super.setEllipsize((TextUtils.TruncateAt) null);
        DbT.A1H(this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C71382cm.A0U);
        this.A03 = obtainStyledAttributes.getBoolean(2, true);
        if (this.A00 == 0) {
            this.A00 = Integer.MAX_VALUE;
        }
        this.A04 = obtainStyledAttributes.getBoolean(3, false);
        this.A05 = obtainStyledAttributes.getBoolean(4, false);
        if (obtainStyledAttributes.getString(0) != null) {
            String A002 = C71622eP.A00(context, obtainStyledAttributes, 0);
            if (A002 == null) {
                A002 = "";
            }
            charSequence = Html.fromHtml(A002);
        } else {
            charSequence = "…";
        }
        this.A01 = charSequence;
        int color = obtainStyledAttributes.getColor(1, getCurrentTextColor());
        if (color != getCurrentTextColor()) {
            SpannableStringBuilder A0C = DbS.A0C(this.A01);
            A0C.setSpan(C66580MXl.A0E(color), 0, this.A01.length(), 17);
            this.A01 = A0C;
        }
        obtainStyledAttributes.recycle();
    }

    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
    }

    public CharSequence getFullText() {
        return this.A02;
    }

    public int getMaxLines() {
        return this.A00;
    }

    public EllipsizingTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A01(context, attributeSet);
    }

    /* JADX WARNING: type inference failed for: r8v0, types: [android.widget.TextView, com.instagram.ui.widget.expandingtextview.EllipsizingTextView, android.view.View] */
    private StaticLayout A00(CharSequence charSequence) {
        return new StaticLayout(charSequence, getPaint(), C66582MXn.A04(this, getMeasuredWidth()), Layout.Alignment.ALIGN_NORMAL, getLineSpacingMultiplier(), getLineSpacingExtra(), getIncludeFontPadding());
    }

    /* JADX WARNING: type inference failed for: r8v0, types: [android.widget.TextView, com.instagram.ui.widget.expandingtextview.EllipsizingTextView, android.view.View] */
    public final void onMeasure(int i, int i2) {
        CharSequence charSequence;
        int lastIndexOf;
        int previous;
        CharSequence charSequence2;
        int i3;
        int A062 = AnonymousClass0fD.A06(1573248470);
        EllipsizingTextView.super.onMeasure(i, i2);
        if (this.A08 || this.A06 != getMeasuredWidth()) {
            this.A07 = true;
            CharSequence charSequence3 = this.A02;
            StaticLayout A002 = A00(charSequence3);
            int lineCount = A002.getLineCount();
            int i4 = this.A00;
            if (lineCount > i4) {
                charSequence3 = this.A02.subSequence(0, A002.getLineEnd(i4 - 1));
                if (this.A03 || charSequence3.charAt(charSequence3.length() - 1) != 10) {
                    while (!TextUtils.isEmpty(charSequence) && Character.isWhitespace(charSequence.charAt(charSequence.length() - 1))) {
                        charSequence3 = charSequence.subSequence(0, charSequence.length() - 1);
                    }
                    if (this.A05) {
                        SpannableStringBuilder A0C = DbS.A0C(charSequence);
                        loop1:
                        while (true) {
                            charSequence3 = DbS.A0C(A0C).append(this.A01);
                            while (A00(charSequence3).getLineCount() > this.A00) {
                                if (A0C.length() > 1) {
                                    A0C.delete(A0C.length() - 1, A0C.length());
                                }
                            }
                            break loop1;
                        }
                    } else {
                        if (this.A04) {
                            CharSequence charSequence4 = charSequence;
                            if (charSequence == null) {
                                charSequence4 = "";
                            }
                            BreakIterator wordInstance = BreakIterator.getWordInstance();
                            wordInstance.setText(charSequence4.toString());
                            wordInstance.last();
                            while (A00(TextUtils.concat(new CharSequence[]{charSequence, this.A01})).getLineCount() > this.A00) {
                                while (true) {
                                    previous = wordInstance.previous();
                                    if (previous == -1) {
                                        charSequence2 = "";
                                        break;
                                    } else if (!(!Character.isLetterOrDigit(charSequence4.charAt(previous))) || (previous - 1 != -1 && (!Character.isLetterOrDigit(charSequence4.charAt(i3))))) {
                                    }
                                }
                                charSequence2 = charSequence4.subSequence(0, previous);
                                if (TextUtils.isEmpty(charSequence2)) {
                                    break;
                                }
                                charSequence = charSequence2;
                            }
                        } else {
                            while (A00(TextUtils.concat(new CharSequence[]{charSequence, this.A01})).getLineCount() > this.A00 && (lastIndexOf = charSequence.toString().lastIndexOf(32)) != -1) {
                                charSequence = charSequence.subSequence(0, lastIndexOf);
                                while (!TextUtils.isEmpty(charSequence) && Character.isWhitespace(charSequence.charAt(charSequence.length() - 1))) {
                                    charSequence = charSequence.subSequence(0, charSequence.length() - 1);
                                }
                            }
                        }
                        charSequence3 = TextUtils.concat(new CharSequence[]{charSequence, this.A01});
                    }
                }
            }
            setText(charSequence3, TextView.BufferType.SPANNABLE);
            this.A07 = false;
            this.A08 = false;
            this.A06 = getMeasuredWidth();
            EllipsizingTextView.super.onMeasure(i, i2);
        }
        AnonymousClass0fD.A0D(751669498, A062);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [android.widget.TextView, com.instagram.ui.widget.expandingtextview.EllipsizingTextView, android.view.View] */
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        EllipsizingTextView.super.onTextChanged(charSequence, i, i2, i3);
        if (!this.A07) {
            this.A02 = charSequence;
            this.A08 = true;
            requestLayout();
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.instagram.ui.widget.expandingtextview.EllipsizingTextView, android.view.View, com.instagram.common.ui.base.IgTextView] */
    public void setMaxLines(int i) {
        EllipsizingTextView.super.setMaxLines(i);
        this.A00 = i;
        this.A08 = true;
        requestLayout();
    }

    public EllipsizingTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A01(context, attributeSet);
    }

    public EllipsizingTextView(Context context) {
        super(context);
        A01(context, (AttributeSet) null);
    }
}
