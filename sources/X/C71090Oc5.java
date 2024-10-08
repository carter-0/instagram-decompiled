package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.Shape;
import java.util.WeakHashMap;

/* renamed from: X.Oc5  reason: case insensitive filesystem */
public final class C71090Oc5 {
    public static final OJ0 A0C = new Object();
    public static final WeakHashMap A0D = new WeakHashMap();
    public float A00;
    public ValueAnimator A01;
    public boolean A02;
    public ValueAnimator A03 = new ValueAnimator();
    public ValueAnimator A04 = new ValueAnimator();
    public Integer A05 = AnonymousClass05K.A0C;
    public final Context A06;
    public final ShapeDrawable A07;
    public final ShapeDrawable A08;
    public final ShapeDrawable A09;
    public final Drawable A0A;
    public final Drawable A0B;

    public C71090Oc5(Context context, Drawable drawable, Drawable drawable2, ShapeDrawable shapeDrawable, ShapeDrawable shapeDrawable2, ShapeDrawable shapeDrawable3) {
        this.A06 = context;
        this.A07 = shapeDrawable;
        this.A08 = shapeDrawable2;
        this.A09 = shapeDrawable3;
        this.A0B = drawable;
        this.A0A = drawable2;
        ValueAnimator valueAnimator = new ValueAnimator();
        this.A01 = valueAnimator;
        valueAnimator.setDuration(15);
        C71170Oej.A00(this.A01, this, 3);
        this.A03.setDuration(100);
        C71170Oej.A00(this.A03, this, 4);
        this.A04.setRepeatCount(-1);
        this.A04.setRepeatMode(1);
        this.A04.setDuration(1000);
        this.A04.setFloatValues(new float[]{0.0f, 360.0f});
        C71170Oej.A00(this.A04, this, 5);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0028  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A00() {
        /*
            r3 = this;
            java.lang.Integer r1 = r3.A05
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r1 != r0) goto L_0x0040
            float r1 = r3.A00
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x0013
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x0040
        L_0x0013:
            android.content.Context r1 = r3.A06
            r0 = 2130971409(0x7f040b11, float:1.7551556E38)
        L_0x0018:
            int r2 = X.2Yu.A0F(r1, r0)
            android.graphics.drawable.ShapeDrawable r0 = r3.A08
            android.graphics.Paint r0 = r0.getPaint()
            int r0 = r0.getColor()
            if (r2 == r0) goto L_0x003f
            android.animation.ValueAnimator r1 = r3.A03
            r1.cancel()
            int[] r0 = new int[]{r0, r2}
            r1.setIntValues(r0)
            android.animation.ArgbEvaluator r0 = new android.animation.ArgbEvaluator
            r0.<init>()
            r1.setEvaluator(r0)
            r1.start()
        L_0x003f:
            return
        L_0x0040:
            android.content.Context r1 = r3.A06
            r0 = 2130971414(0x7f040b16, float:1.7551566E38)
            goto L_0x0018
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71090Oc5.A00():void");
    }

    public static final void A01(C71090Oc5 oc5, float f) {
        ShapeDrawable shapeDrawable = oc5.A07;
        Shape shape = shapeDrawable.getShape();
        0qQ.A0C(shape, "null cannot be cast to non-null type com.facebook.common.messagingui.roundedcornergradientdrawable.shape.MutableArcShape");
        C67652Mrf mrf = (C67652Mrf) shape;
        mrf.A00 = f;
        shapeDrawable.setShape(mrf);
        oc5.A00 = f;
        if (f == 0.0f || f == 1.0f) {
            shapeDrawable.mutate().setAlpha(0);
        } else {
            shapeDrawable.mutate().setAlpha(255);
        }
    }

    public final void A02() {
        Integer num = this.A05;
        Integer num2 = AnonymousClass05K.A01;
        if (num != num2) {
            this.A09.setAlpha(255);
            this.A05 = num2;
            this.A04.start();
        }
        A00();
    }

    public final void A03() {
        Integer num = this.A05;
        Integer num2 = AnonymousClass05K.A0C;
        if (num != num2) {
            this.A0B.mutate().setAlpha(255);
            this.A0A.mutate().setAlpha(0);
            this.A09.setAlpha(0);
            this.A05 = num2;
            this.A04.cancel();
        }
        A00();
    }

    public final void A04() {
        Integer num = this.A05;
        Integer num2 = AnonymousClass05K.A00;
        if (num != num2) {
            this.A0B.mutate().setAlpha(0);
            this.A0A.mutate().setAlpha(255);
            this.A09.setAlpha(0);
            this.A05 = num2;
            this.A04.cancel();
        }
        A00();
    }
}
