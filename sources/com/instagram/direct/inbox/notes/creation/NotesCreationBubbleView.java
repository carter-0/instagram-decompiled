package com.instagram.direct.inbox.notes.creation;

import X.0mk;
import X.0qQ;
import X.2Yu;
import X.AnonymousClass1GD;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass972;
import X.C61380mr;
import X.DbT;
import X.JTO;
import android.animation.LayoutTransition;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgLinearLayout;

public final class NotesCreationBubbleView extends IgLinearLayout {
    public CardView A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public int A07;
    public View A08;
    public ConstraintLayout A09;
    public boolean A0A;
    public final float A0B;
    public final Paint A0C;
    public final RectF A0D;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public NotesCreationBubbleView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        0qQ.A0B(context, 1);
    }

    public final void dispatchDraw(Canvas canvas) {
        float paddingEnd;
        float f;
        Canvas canvas2 = canvas;
        0qQ.A0B(canvas, 0);
        super.dispatchDraw(canvas);
        if (!this.A01) {
            boolean z = this.A0A;
            if (z) {
                paddingEnd = ((float) (this.A00.getWidth() + this.A09.getPaddingStart())) - getBubbleXOffset();
            } else {
                paddingEnd = ((float) this.A09.getPaddingEnd()) + getBubbleXOffset();
            }
            float height = ((float) this.A00.getHeight()) - (getLargeThoughtBubbleRadius() / 2.0f);
            float f2 = 180.0f - (2.0f * 15.0f);
            if (!this.A01) {
                RectF rectF = this.A0D;
                rectF.left = paddingEnd - getLargeThoughtBubbleRadius();
                rectF.right = getLargeThoughtBubbleRadius() + paddingEnd;
                rectF.top = height - getLargeThoughtBubbleRadius();
                rectF.bottom = getLargeThoughtBubbleRadius() + height;
                Paint paint = this.A0C;
                canvas2.drawArc(rectF, 15.0f, f2, false, paint);
                float smallThoughtBubbleXOffset = getSmallThoughtBubbleXOffset();
                if (z) {
                    f = paddingEnd - smallThoughtBubbleXOffset;
                } else {
                    f = paddingEnd + smallThoughtBubbleXOffset;
                }
                canvas.drawCircle(f, height + getSmallThoughtBubbleYOffset(), getSmallThoughtBubbleRadius(), paint);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x002e, code lost:
        if (r11.A05 != false) goto L_0x0030;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setIconicRedesignLayout(androidx.cardview.widget.CardView r12) {
        /*
            r11 = this;
            r8 = 0
            X.0qQ.A0B(r12, r8)
            boolean r0 = r11.A01
            if (r0 == 0) goto L_0x003f
            android.view.View r2 = r11.A08
            android.content.Context r3 = r11.getContext()
            int r1 = X.JTR.A05(r3)
            int r0 = X.C51972G9s.A08(r3)
            X.0nA.A0j(r2, r8, r1, r8, r0)
            r12.setClipToOutline(r8)
            int r4 = r11.A07
            r0 = 2131099902(0x7f0600fe, float:1.781217E38)
            int r5 = r3.getColor(r0)
            boolean r0 = X.AnonymousClass1GD.A03()
            if (r0 != 0) goto L_0x0030
            boolean r0 = r11.A05
            r7 = 0
            if (r0 == 0) goto L_0x0031
        L_0x0030:
            r7 = 1
        L_0x0031:
            boolean r9 = r11.A04
            boolean r10 = r11.A03
            r6 = 882(0x372, float:1.236E-42)
            X.JUm r2 = new X.JUm
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            r12.setBackground(r2)
        L_0x003f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.inbox.notes.creation.NotesCreationBubbleView.setIconicRedesignLayout(androidx.cardview.widget.CardView):void");
    }

    private final float getBubbleXOffset() {
        float f;
        if (this.A06) {
            f = this.A0B + 5.0f;
        } else {
            f = 47.0f;
        }
        return C61380mr.A00(AnonymousClass7TE.A0S(this), f);
    }

    private final float getLargeThoughtBubbleRadius() {
        float f = 7.0f;
        if (this.A02) {
            f = 10.0f;
        }
        return C61380mr.A00(AnonymousClass7TE.A0S(this), f);
    }

    private final float getSmallThoughtBubbleRadius() {
        float f = 2.5f;
        if (this.A02) {
            f = 3.5f;
        }
        return C61380mr.A00(AnonymousClass7TE.A0S(this), f);
    }

    private final float getSmallThoughtBubbleXOffset() {
        float f = 5.0f;
        if (this.A02) {
            f = 8.0f;
        }
        return C61380mr.A00(AnonymousClass7TE.A0S(this), f);
    }

    private final float getSmallThoughtBubbleYOffset() {
        float f = 10.0f;
        if (this.A02) {
            f = 15.0f;
        }
        return C61380mr.A00(AnonymousClass7TE.A0S(this), f);
    }

    public final void onMeasure(int i, int i2) {
        float f = 90.0f;
        if (this.A01) {
            f = 160.0f;
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec((int) C61380mr.A00(AnonymousClass7TE.A0S(this), f), AnonymousClass972.MUTABLE_FLAG_MASK));
    }

    public final void setBubbleBackgroundColor(int i) {
        this.A07 = i;
        setIconicRedesignLayout(this.A00);
        invalidate();
    }

    public final void setIsImmersiveMode(boolean z) {
        this.A05 = z;
    }

    public final void setWysiwyg(boolean z) {
        this.A06 = z;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NotesCreationBubbleView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
        this.A0B = 22.0f;
        this.A0D = AnonymousClass7TE.A0Y();
        Paint A0C2 = JTO.A0C();
        A0C2.setStyle(Paint.Style.FILL);
        AnonymousClass7TE.A1N(context, A0C2, 2Yu.A02(context));
        this.A0C = A0C2;
        this.A07 = AnonymousClass7TF.A03(context, AnonymousClass1GD.A03() ? R.attr.igds_color_elevated_background : R.attr.igds_color_primary_background);
        setWillNotDraw(false);
        View A0D2 = DbT.A0D(LayoutInflater.from(context), this, R.layout.notes_creation_bubble_view, false);
        this.A09 = (ConstraintLayout) A0D2.requireViewById(R.id.pog_note_bubble_root_view);
        this.A00 = (CardView) A0D2.requireViewById(R.id.pog_note_bubble_card_view);
        this.A08 = A0D2.requireViewById(R.id.bubble_nested_scroll_view);
        if (!this.A01) {
            this.A00.setRadius(C61380mr.A00(context, 22.0f));
        }
        this.A00.setLayoutTransition(new LayoutTransition());
        this.A0A = 0mk.A02(getContext());
        addView(A0D2);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public NotesCreationBubbleView(Context context) {
        this(context, (AttributeSet) null);
        0qQ.A0B(context, 1);
    }
}
