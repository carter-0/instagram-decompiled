package com.instagram.direct.messagethread.util.text;

import X.0qQ;
import X.0rN;
import X.0sP;
import X.AnonymousClass0fD;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C252993q2;
import X.C51967G9n;
import X.C66580MXl;
import X.C67669Ms0;
import X.C71399Ojy;
import X.DbS;
import X.DbT;
import android.content.Context;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.instagram.common.ui.base.IgTextView;

public final class ExpandableTextView extends IgTextView {
    public int A00;
    public CharSequence A01 = "";

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ExpandableTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        0qQ.A0B(context, 1);
    }

    /* JADX WARNING: type inference failed for: r11v0, types: [android.widget.TextView, com.instagram.direct.messagethread.util.text.ExpandableTextView, android.view.View, java.lang.Object] */
    public final void setText(Spanned spanned, CharSequence charSequence, int i, int i2, Integer num, 0sP r17) {
        int width;
        AnonymousClass7TF.A1H(spanned, charSequence);
        this.A01 = spanned;
        C71399Ojy ojy = new C71399Ojy(21, spanned, this, r17);
        SpannableString A0D = C66580MXl.A0D(charSequence);
        A0D.setSpan(new C67669Ms0(ojy, i), 0, charSequence.length(), 17);
        this.A00 = A0D.length() + 2;
        SpannableString A0D2 = C66580MXl.A0D(spanned);
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("…");
        SpannableStringBuilder append = DbS.A0C(C51967G9n.A0r(A1A, ' ')).append(A0D);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        TextPaint paint = getPaint();
        float lineSpacingExtra = getLineSpacingExtra();
        float lineSpacingMultiplier = getLineSpacingMultiplier();
        if (getWidth() != 0 || num == null) {
            width = getWidth();
        } else {
            width = num.intValue();
        }
        setText(DbS.A0C(C252993q2.A00(A0D2, new 0rN(alignment, paint, (String) null, lineSpacingExtra, lineSpacingMultiplier, width, false), append, i2)));
        if ((getMovementMethod() == null || !(getMovementMethod() instanceof LinkMovementMethod)) && getLinksClickable()) {
            DbT.A1H(this);
        }
    }

    public static /* synthetic */ void setText$default(ExpandableTextView expandableTextView, Spanned spanned, CharSequence charSequence, int i, int i2, Integer num, 0sP r7, int i3, Object obj) {
        if ((i3 & 32) != 0) {
            r7 = null;
        }
        expandableTextView.setText(spanned, charSequence, i, i2, num, r7);
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [android.widget.TextView, com.instagram.direct.messagethread.util.text.ExpandableTextView] */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i;
        int A05 = AnonymousClass0fD.A05(-1844213353);
        ExpandableTextView.super.onTouchEvent(motionEvent);
        boolean z = false;
        if (motionEvent == null) {
            i = -68444441;
        } else {
            if (!0qQ.A0K(getText(), this.A01) && getOffsetForPosition(motionEvent.getX(), motionEvent.getY()) >= getText().length() - this.A00) {
                z = true;
            }
            i = 1380071163;
        }
        AnonymousClass0fD.A0C(i, A05);
        return z;
    }
}
