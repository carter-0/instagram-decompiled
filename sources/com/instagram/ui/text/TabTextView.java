package com.instagram.ui.text;

import X.0ok;
import X.0qQ;
import X.2Yu;
import X.AnonymousClass0fD;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C61380mr;
import X.C61670oa;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.TextView;
import com.instagram.android.R;

public final class TabTextView extends TextView {
    public int A00;
    public final Paint A01 = new Paint();
    public final Rect A02 = new Rect();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TabTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
        A00();
    }

    public final void onDraw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        super.onDraw(canvas);
        if (isSelected()) {
            canvas.drawRect(this.A02, this.A01);
        }
    }

    private final void A00() {
        this.A00 = getResources().getDimensionPixelSize(R.dimen.account_recs_header_image_margin);
        Context context = getContext();
        AnonymousClass7TE.A1N(context, this.A01, 2Yu.A0H(context, R.attr.textColorSelected));
        if (C61670oa.A0E()) {
            this.A00 = AnonymousClass7TG.A04(context);
            0ok.A03(this);
        }
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int A06 = AnonymousClass0fD.A06(101637289);
        super.onSizeChanged(i, i2, i3, i4);
        if (C61670oa.A0E()) {
            Context A0S = AnonymousClass7TE.A0S(this);
            int max = Math.max(i - ((((int) getPaint().measureText(getText().toString())) + C61380mr.A01(A0S, 20)) + C61380mr.A01(A0S, 20)), 0) / 2;
            this.A02.set(max, i2 - this.A00, i - max, i2);
        } else {
            this.A02.set(0, i2 - this.A00, i, i2);
        }
        AnonymousClass0fD.A0D(-690833775, A06);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TabTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        0qQ.A0B(context, 1);
        A00();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TabTextView(Context context) {
        super(context);
        0qQ.A0B(context, 1);
        A00();
    }
}
