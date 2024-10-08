package com.instagram.common.ui.text;

import X.0qQ;
import X.AnonymousClass7TF;
import X.C229632nm;
import X.C66580MXl;
import X.DbS;
import X.DbT;
import X.JTT;
import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.AttributeSet;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class ExpandableTextView extends IgTextView {
    public int A00;
    public int A01;
    public boolean A02;
    public boolean A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ExpandableTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        0qQ.A0B(context, 1);
        this.A00 = 3;
        this.A01 = Integer.MAX_VALUE;
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [android.widget.TextView, com.instagram.common.ui.text.ExpandableTextView, android.view.View] */
    public final SpannableStringBuilder A00(CharSequence charSequence, String str, int i) {
        int A032;
        0qQ.A0B(charSequence, 1);
        TextPaint paint = getPaint();
        0qQ.A07(paint);
        int i2 = this.A00;
        int length = str.length();
        CharSequence charSequence2 = charSequence;
        if (i > 0) {
            StaticLayout build = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), paint, i).build();
            0qQ.A07(build);
            if (build.getLineCount() > i2 && (A032 = C229632nm.A03(build.getLineEnd(i2 - 1) - (length + 5), 0, charSequence.length() - 1)) > 0 && A032 < charSequence.length()) {
                this.A03 = true;
                charSequence2 = charSequence.subSequence(0, A032);
            }
        }
        SpannableStringBuilder A0C = DbS.A0C(charSequence2);
        if (A0C.length() < charSequence.length()) {
            SpannableString A0D = C66580MXl.A0D(str);
            A0D.setSpan(C66580MXl.A0E(AnonymousClass7TF.A03(getContext(), R.attr.igdsSecondaryText)), 0, length, 17);
            A0C.append(A0D);
        }
        return A0C;
    }

    public final void setCollapsedLines(int i) {
        if (1 > i || i > this.A01) {
            throw DbT.A0m();
        }
        this.A00 = i;
    }

    public final void setExpandedLines(int i) {
        if (i >= this.A01) {
            this.A01 = i;
            return;
        }
        throw DbT.A0m();
    }

    public final void setAnimating(boolean z) {
        this.A02 = z;
    }

    public final void setTruncated(boolean z) {
        this.A03 = z;
    }

    public /* synthetic */ ExpandableTextView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JTT.A0D(attributeSet, i));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ExpandableTextView(Context context) {
        this(context, (AttributeSet) null);
        0qQ.A0B(context, 1);
    }
}
