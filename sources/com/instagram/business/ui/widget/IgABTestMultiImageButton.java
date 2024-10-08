package com.instagram.business.ui.widget;

import X.0qQ;
import X.C321486uG;
import X.C59983Jcs;
import X.JTT;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import com.instagram.igds.components.imagebutton.IgMultiImageButton;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class IgABTestMultiImageButton extends IgMultiImageButton {
    public String A00;
    public boolean A01;
    public boolean A02;
    public final C59983Jcs A03;
    public final C321486uG A04;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public IgABTestMultiImageButton(Context context) {
        this(context, (AttributeSet) null, 0);
        0qQ.A0B(context, 1);
    }

    public final void onDraw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        super.onDraw(canvas);
        if (this.A02) {
            C321486uG r3 = this.A04;
            int i = r3.A00 + r3.A06;
            float width = ((float) (canvas.getWidth() - i)) - ((float) r3.A07);
            r3.setBounds(0, 0, i, i);
            canvas.save();
            canvas.translate(width, width);
            r3.draw(canvas);
            canvas.restore();
        }
        if (this.A01) {
            C59983Jcs jcs = this.A03;
            int i2 = jcs.A00 + jcs.A01;
            float width2 = ((((float) canvas.getWidth()) * 1.0f) - ((float) i2)) - ((float) jcs.A02);
            jcs.setBounds(0, 0, i2, i2);
            canvas.save();
            canvas.translate((((float) (canvas.getWidth() - i2)) * 1.0f) / 2.0f, width2);
            jcs.draw(canvas);
            canvas.restore();
        }
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.instagram.business.ui.widget.IgABTestMultiImageButton, android.view.View] */
    public final void setAlphabet(String str) {
        C59983Jcs jcs;
        String str2;
        if (str != null) {
            this.A00 = str;
            C321486uG r1 = this.A04;
            r1.A03 = str;
            r1.invalidateSelf();
            r1.A04 = true;
            r1.invalidateSelf();
            jcs = this.A03;
            str2 = this.A00;
        } else {
            C321486uG r12 = this.A04;
            r12.A04 = false;
            r12.invalidateSelf();
            jcs = this.A03;
            str2 = null;
        }
        jcs.A03 = str2;
        invalidate();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.business.ui.widget.IgABTestMultiImageButton, android.view.View] */
    public final void setBottomCenterAlphabetCircleDrawableEnabled(boolean z) {
        this.A01 = z;
        invalidate();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.business.ui.widget.IgABTestMultiImageButton, android.view.View] */
    public final void setBottomRightAlphabetCircleDrawableEnabled(boolean z) {
        this.A02 = z;
        invalidate();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IgABTestMultiImageButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
        this.A04 = new C321486uG(context);
        this.A03 = new C59983Jcs(context);
        this.A00 = "";
    }

    public /* synthetic */ IgABTestMultiImageButton(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JTT.A0D(attributeSet, i2), JTT.A01(i2, i));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public IgABTestMultiImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        0qQ.A0B(context, 1);
    }
}
