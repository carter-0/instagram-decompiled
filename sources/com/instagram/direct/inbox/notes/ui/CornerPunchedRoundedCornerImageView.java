package com.instagram.direct.inbox.notes.ui;

import X.0mk;
import X.0qQ;
import X.AnonymousClass00P;
import X.AnonymousClass0fD;
import X.AnonymousClass7TE;
import X.C51965G9l;
import X.C71382cm;
import X.C71622eP;
import X.JTT;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Region;
import android.util.AttributeSet;
import com.instagram.common.ui.widget.imageview.RoundedCornerImageView;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class CornerPunchedRoundedCornerImageView extends RoundedCornerImageView {
    public boolean A00;
    public int A01;
    public int A02;
    public int A03;
    public Path A04;
    public final String A05;
    public final boolean A06;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CornerPunchedRoundedCornerImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        0qQ.A0B(context, 1);
    }

    public final void onDraw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        if (this.A00) {
            Path path = this.A04;
            if (path == null) {
                0qQ.A0F("path");
                throw AnonymousClass00P.createAndThrow();
            }
            canvas.clipPath(path, Region.Op.DIFFERENCE);
        }
        super.onDraw(canvas);
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [android.view.View, com.instagram.direct.inbox.notes.ui.CornerPunchedRoundedCornerImageView] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int[] getPunchCenter() {
        /*
            r5 = this;
            boolean r0 = r5.A06
            if (r0 == 0) goto L_0x0051
            int r1 = r5.getWidth()
            r4 = 0
        L_0x0009:
            java.lang.String r3 = r5.A05
            int r0 = r3.hashCode()
            r2 = 2
            switch(r0) {
                case -1698351794: goto L_0x0019;
                case -1682225977: goto L_0x0026;
                case -1364013995: goto L_0x0034;
                case -1139554575: goto L_0x0047;
                default: goto L_0x0013;
            }
        L_0x0013:
            r0 = 0
        L_0x0014:
            int[] r0 = new int[]{r1, r0}
            return r0
        L_0x0019:
            java.lang.String r0 = "bottom_start"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0013
            int r0 = r5.getHeight()
            goto L_0x0014
        L_0x0026:
            java.lang.String r0 = "bottom_end"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0013
            int r0 = r5.getHeight()
            r1 = r4
            goto L_0x0014
        L_0x0034:
            java.lang.String r0 = "center"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0013
            int r1 = r5.getWidth()
            int r1 = r1 / r2
            int r0 = r5.getHeight()
            int r0 = r0 / r2
            goto L_0x0014
        L_0x0047:
            java.lang.String r0 = "top_end"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0013
            r1 = r4
            goto L_0x0013
        L_0x0051:
            r1 = 0
            int r4 = r5.getWidth()
            goto L_0x0009
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.inbox.notes.ui.CornerPunchedRoundedCornerImageView.getPunchCenter():int[]");
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [android.view.View, com.instagram.direct.inbox.notes.ui.CornerPunchedRoundedCornerImageView] */
    public final void setPunchOffsetX(int i) {
        this.A01 = i;
        A00();
        invalidate();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [android.view.View, com.instagram.direct.inbox.notes.ui.CornerPunchedRoundedCornerImageView] */
    public final void setPunchOffsetY(int i) {
        this.A02 = i;
        A00();
        invalidate();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [android.view.View, com.instagram.direct.inbox.notes.ui.CornerPunchedRoundedCornerImageView] */
    public final void setPunchRadius(int i) {
        this.A03 = i;
        A00();
        invalidate();
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [android.view.View, com.instagram.direct.inbox.notes.ui.CornerPunchedRoundedCornerImageView] */
    private final void A00() {
        Path A0C = C51965G9l.A0C();
        this.A04 = A0C;
        A0C.setFillType(Path.FillType.EVEN_ODD);
        int[] punchCenter = getPunchCenter();
        int i = this.A03;
        if (i == -1) {
            i = getWidth() / 2;
        }
        Path path = this.A04;
        if (path == null) {
            0qQ.A0F("path");
            throw AnonymousClass00P.createAndThrow();
        } else {
            path.addCircle((float) (punchCenter[0] + this.A01), (float) (punchCenter[1] + this.A02), (float) i, Path.Direction.CW);
        }
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int A062 = AnonymousClass0fD.A06(-340460960);
        super.onSizeChanged(i, i2, i3, i4);
        A00();
        AnonymousClass0fD.A0D(-1457582284, A062);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CornerPunchedRoundedCornerImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
        this.A00 = true;
        boolean A022 = 0mk.A02(context);
        this.A06 = A022;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C71382cm.A0N);
        0qQ.A07(obtainStyledAttributes);
        this.A03 = obtainStyledAttributes.getDimensionPixelSize(3, -1);
        String A002 = C71622eP.A00(context, obtainStyledAttributes, 0);
        if (A002 != null) {
            this.A05 = A002;
            this.A01 = obtainStyledAttributes.getDimensionPixelSize(1, 0);
            this.A02 = obtainStyledAttributes.getDimensionPixelSize(2, 0);
            int i2 = this.A01;
            this.A01 = A022 ? -i2 : i2;
            obtainStyledAttributes.recycle();
            A00();
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public /* synthetic */ CornerPunchedRoundedCornerImageView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JTT.A0D(attributeSet, i2), JTT.A01(i2, i));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CornerPunchedRoundedCornerImageView(Context context) {
        this(context, (AttributeSet) null);
        0qQ.A0B(context, 1);
    }
}
