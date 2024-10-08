package com.instagram.quicksnap.emitter;

import X.0qQ;
import X.19E;
import X.1Hj;
import X.AnonymousClass0fD;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C13988Tno;
import X.C14086Tpc;
import X.C15160UTl;
import X.C17726Vcv;
import X.C330607Nm;
import X.C60340gF;
import X.C63793L6z;
import X.C66411MQr;
import X.JTT;
import X.MHL;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class QuickSnapReactionEmitterView extends View {
    public long A00;
    public long A01;
    public final AccelerateInterpolator A02;
    public final C330607Nm A03;
    public final List A04;
    public final List A05;
    public final List A06;
    public final Matrix A07;
    public final Paint A08;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public QuickSnapReactionEmitterView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
        setVisibility(8);
        setClickable(false);
        setFocusable(false);
        setFocusableInTouchMode(false);
        this.A06 = new ArrayList(20);
        this.A05 = new ArrayList(20);
        this.A04 = new ArrayList(20);
        this.A08 = new Paint();
        this.A07 = new Matrix();
        this.A02 = new AccelerateInterpolator(2.0f);
        this.A03 = new C15160UTl(this);
    }

    public final Object A00(C63793L6z l6z, C66411MQr mQr, AnonymousClass4D7 r9) {
        C63793L6z l6z2 = l6z;
        if (AnonymousClass7TE.A1b(l6z.A02)) {
            setVisibility(0);
            Object A002 = 19E.A00(r9, new MHL(l6z2, this, mQr, (AnonymousClass4D7) null, 22));
            if (A002 == 1Hj.A02) {
                return A002;
            }
        }
        return C60340gF.A00;
    }

    public final void A01() {
        C14086Tpc.A01.A01(this.A03);
        this.A00 = 0;
        this.A06.clear();
        List<C17726Vcv> list = this.A05;
        for (C17726Vcv vcv : list) {
            vcv.A09 = null;
        }
        setVisibility(8);
        list.clear();
        this.A04.clear();
    }

    public final void draw(Canvas canvas) {
        int i;
        int A0D = AnonymousClass7TG.A0D(canvas, 1553989786);
        if (canvas.getDensity() != 0) {
            i = canvas.getDensity();
        } else {
            i = C13988Tno.A0F(this).densityDpi;
        }
        for (C17726Vcv vcv : this.A05) {
            Bitmap bitmap = vcv.A09;
            if (bitmap != null) {
                Matrix matrix = this.A07;
                PointF pointF = vcv.A0B;
                matrix.setTranslate(pointF.x, pointF.y);
                float f = vcv.A02;
                matrix.preScale(f, f);
                matrix.preRotate((float) ((((double) vcv.A05) / 3.141592653589793d) * 180.0d));
                matrix.preTranslate(((float) (-bitmap.getScaledWidth(i))) * 0.5f, ((float) (-bitmap.getScaledHeight(i))) * 0.5f);
                Paint paint = this.A08;
                C13988Tno.A0o(vcv.A01, 255.0f, paint);
                canvas.drawBitmap(bitmap, matrix, paint);
            }
        }
        AnonymousClass0fD.A0A(-2063641073, A0D);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public QuickSnapReactionEmitterView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        0qQ.A0B(context, 1);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public QuickSnapReactionEmitterView(Context context) {
        this(context, (AttributeSet) null, 0);
        0qQ.A0B(context, 1);
    }

    public /* synthetic */ QuickSnapReactionEmitterView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JTT.A0D(attributeSet, i2), JTT.A01(i2, i));
    }
}
