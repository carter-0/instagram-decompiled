package com.instagram.direct.voice.view;

import X.0eP;
import X.0qQ;
import X.AnonymousClass0eM;
import X.AnonymousClass1YB;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C13988Tno;
import X.C66582MXn;
import X.C73914Plp;
import X.JTT;
import X.Pxi;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import com.instagram.android.R;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class VoiceMessageTrimFrame extends View {
    public Bitmap A00;
    public final RectF A01;
    public final AnonymousClass0eM A02;
    public final AnonymousClass0eM A03;
    public final AnonymousClass0eM A04;
    public final Paint A05;
    public final AttributeSet A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public VoiceMessageTrimFrame(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
        this.A06 = attributeSet;
        this.A01 = new RectF();
        Paint paint = new Paint(5);
        C13988Tno.A0p(0, paint);
        Pxi.A0v(paint, PorterDuff.Mode.SRC_IN);
        this.A05 = paint;
        this.A02 = AnonymousClass1YB.A00(new C73914Plp(this, 0));
        this.A03 = AnonymousClass1YB.A00(new C73914Plp(this, 1));
        this.A04 = AnonymousClass1YB.A00(new C73914Plp(this, 2));
    }

    public final void onDraw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        super.onDraw(canvas);
        RectF rectF = this.A01;
        float width = rectF.width();
        AnonymousClass0eM r6 = this.A02;
        int A002 = (int) (width + (C66582MXn.A00(r6) * 2.0f));
        Bitmap bitmap = this.A00;
        if (bitmap == null || bitmap.getWidth() != A002) {
            Bitmap bitmap2 = this.A00;
            if (bitmap2 != null) {
                bitmap2.recycle();
            }
            Drawable drawable = getContext().getDrawable(R.drawable.trim_frame);
            if (drawable != null) {
                Bitmap A0B = AnonymousClass7TF.A0B(A002, getHeight());
                Canvas canvas2 = new Canvas(A0B);
                drawable.setBounds(new Rect(0, 0, A0B.getWidth(), A0B.getHeight()));
                drawable.draw(canvas2);
                float A003 = C66582MXn.A00(r6);
                AnonymousClass0eM r3 = this.A04;
                RectF rectF2 = new RectF(A003, C66582MXn.A00(r3), ((float) A0B.getWidth()) - C66582MXn.A00(r6), ((float) A0B.getHeight()) - C66582MXn.A00(r3));
                AnonymousClass0eM r0 = this.A03;
                canvas2.drawRoundRect(rectF2, C66582MXn.A00(r0), C66582MXn.A00(r0), this.A05);
                this.A00 = A0B;
            }
        }
        Bitmap bitmap3 = this.A00;
        if (bitmap3 != null) {
            canvas.drawBitmap(bitmap3, rectF.left - C66582MXn.A00(r6), 0.0f, (Paint) null);
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    private final float getTrimFrameHandleWidth() {
        return C66582MXn.A00(this.A02);
    }

    private final float getTrimFrameInnerCornerRadius() {
        return C66582MXn.A00(this.A03);
    }

    private final float getTrimFrameThickness() {
        return C66582MXn.A00(this.A04);
    }

    public final RectF getTrimWindowRect() {
        return this.A01;
    }

    public final 0eP getSelectionBoundsPercent() {
        Float valueOf;
        float f = 1.0f;
        if (AnonymousClass7TF.A1Q(getVisibility())) {
            RectF rectF = this.A01;
            float f2 = rectF.left;
            AnonymousClass0eM r5 = this.A02;
            valueOf = Float.valueOf(Math.max((f2 - C66582MXn.A00(r5)) / (((float) getWidth()) - (C66582MXn.A00(r5) * 2.0f)), 0.0f));
            f = Math.min((rectF.right - C66582MXn.A00(r5)) / (((float) getWidth()) - (C66582MXn.A00(r5) * 2.0f)), 1.0f);
        } else {
            valueOf = Float.valueOf(0.0f);
        }
        return new 0eP(valueOf, Float.valueOf(f));
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        RectF rectF = this.A01;
        if (rectF.isEmpty()) {
            AnonymousClass0eM r1 = this.A02;
            rectF.set(((float) getPaddingLeft()) + C66582MXn.A00(r1), (float) getPaddingTop(), (((float) (i3 - i)) - ((float) getPaddingRight())) - C66582MXn.A00(r1), ((float) (i4 - i2)) - ((float) getPaddingBottom()));
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public VoiceMessageTrimFrame(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        0qQ.A0B(context, 1);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public VoiceMessageTrimFrame(Context context) {
        this(context, (AttributeSet) null, 0);
        0qQ.A0B(context, 1);
    }

    public /* synthetic */ VoiceMessageTrimFrame(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JTT.A0D(attributeSet, i2), JTT.A01(i2, i));
    }
}
