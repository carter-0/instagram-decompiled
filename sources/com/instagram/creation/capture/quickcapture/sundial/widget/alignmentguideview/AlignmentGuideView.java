package com.instagram.creation.capture.quickcapture.sundial.widget.alignmentguideview;

import X.0nA;
import X.0qQ;
import X.0sn;
import X.AnonymousClass7TE;
import X.C51965G9l;
import X.DbW;
import X.JTO;
import X.JTT;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.util.AttributeSet;
import com.instagram.common.ui.base.IgView;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class AlignmentGuideView extends IgView {
    public List A00;
    public final Paint A01;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AlignmentGuideView(Context context) {
        this(context, (AttributeSet) null);
        0qQ.A0B(context, 1);
    }

    public final void onDraw(Canvas canvas) {
        Canvas canvas2 = canvas;
        0qQ.A0B(canvas, 0);
        super.onDraw(canvas);
        for (Object A04 : this.A00) {
            float A042 = AnonymousClass7TE.A04(A04);
            canvas2.drawLine(A042, (float) getPaddingTop(), A042, AnonymousClass7TE.A03(this) - ((float) getPaddingBottom()), this.A01);
        }
    }

    public final void setVerticalPositionsList(List list) {
        0qQ.A0B(list, 0);
        if (!0qQ.A0K(this.A00, list)) {
            this.A00 = list;
            setVisibility(DbW.A00(list.isEmpty() ? 1 : 0));
            invalidate();
        }
    }

    public final List getVerticalPositionsList() {
        return this.A00;
    }

    public final void setVerticalAlignmentGuideColor(int i) {
        this.A01.setColor(i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AlignmentGuideView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        0qQ.A0B(context, 1);
        this.A00 = 0sn.A00;
        Paint A0C = JTO.A0C();
        JTO.A1N(A0C);
        A0C.setStrokeWidth(0nA.A04(context, 1));
        float[] A1b = C51965G9l.A1b();
        // fill-array-data instruction
        A1b[0] = 1101004800;
        A1b[1] = 1092616192;
        A0C.setPathEffect(new DashPathEffect(A1b, 0.0f));
        this.A01 = A0C;
    }

    public /* synthetic */ AlignmentGuideView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JTT.A0D(attributeSet, i));
    }
}
