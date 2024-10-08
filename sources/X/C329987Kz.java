package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.Shape;
import com.instagram.android.R;

/* renamed from: X.7Kz  reason: invalid class name and case insensitive filesystem */
public final class C329987Kz {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final Context A09;
    public final C329977Ky A0A;
    public final int[] A0B;
    public final int[] A0C;

    public C329987Kz(Context context, C329977Ky r3, int[] iArr, int[] iArr2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        0qQ.A0B(iArr, 6);
        0qQ.A0B(iArr2, 7);
        this.A09 = context;
        this.A04 = i;
        this.A05 = i2;
        this.A06 = i3;
        this.A08 = i4;
        this.A0C = iArr;
        this.A0B = iArr2;
        this.A02 = i5;
        this.A03 = i6;
        this.A01 = i7;
        this.A00 = i8;
        this.A07 = i9;
        this.A0A = r3;
    }

    public final void A00(Drawable drawable, AnonymousClass5FV r17, C328637Fo r18, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        float f;
        float f2;
        AnonymousClass763 r1;
        int i;
        float f3;
        float f4;
        int[] iArr;
        int i2;
        C328637Fo r3 = r18;
        boolean z6 = z2;
        boolean z7 = z3;
        boolean z8 = z4;
        boolean z9 = z5;
        AnonymousClass5FV r2 = r17;
        Drawable drawable2 = drawable;
        if (z) {
            C329977Ky r6 = this.A0A;
            Context context = this.A09;
            0qQ.A0A(r3);
            0qQ.A0B(context, 0);
            0qQ.A0B(r3, 2);
            if (0mk.A02(context)) {
                f3 = r6.A01;
                f4 = r6.A02;
            } else {
                f3 = r6.A02;
                f4 = r6.A01;
            }
            C331277Qg r0 = (C331277Qg) C331277Qg.A06.get(drawable2);
            if (r0 != null) {
                if (!C329977Ky.A02(context, r0, r2)) {
                    if (z4) {
                        iArr = r6.A0D;
                    } else if (z3 || z5) {
                        iArr = r6.A0C;
                    } else {
                        iArr = r6.A0B;
                    }
                    if (z2) {
                        if (z4) {
                            i2 = r6.A06;
                        } else {
                            i2 = r6.A05;
                            if (i2 == r6.A03 && C61670oa.A07()) {
                                i2 = r6.A07;
                            }
                        }
                        r0.A01(i2);
                    } else {
                        int length = iArr.length;
                        if (length == 0) {
                            r0.A01(context.getColor(R.color.grey_6));
                        } else if (length == 1) {
                            r0.A01(iArr[0]);
                        } else {
                            ShapeDrawable shapeDrawable = r0.A01;
                            Shape shape = r0.A03;
                            Paint.Style style = Paint.Style.FILL;
                            C308486Ul.A01((Bitmap) null, Paint.Cap.BUTT, style, shapeDrawable, shape, iArr, (float) r6.A08.A00(), 0.0f);
                            r0.A00.getPaint().setAlpha(0);
                        }
                    }
                }
                Shape shape2 = r0.A03;
                if (shape2 instanceof C308496Um) {
                    0qQ.A0C(shape2, "null cannot be cast to non-null type com.facebook.common.messagingui.roundedcornergradientdrawable.shape.RoundedRectShape");
                    C329977Ky.A01((C308496Um) shape2, r3, r6, f3, f4);
                }
                if (00k.A0u(0sr.A1P(new AnonymousClass5FV[]{AnonymousClass5FV.Celebration, AnonymousClass5FV.Fire, AnonymousClass5FV.AvatarAngry}), r2)) {
                    r1 = r0.A04;
                } else {
                    AnonymousClass763 r02 = r0.A04;
                    if (r02 != null) {
                        r02.setAlpha(0);
                        return;
                    }
                    return;
                }
            } else {
                return;
            }
        } else {
            C329977Ky r8 = this.A0A;
            Context context2 = this.A09;
            0qQ.A0A(r3);
            0qQ.A0B(context2, 0);
            0qQ.A0B(r3, 2);
            if (0mk.A02(context2)) {
                f = r8.A02;
                f2 = r8.A01;
            } else {
                f = r8.A01;
                f2 = r8.A02;
            }
            int A032 = r8.A03(z8, z7, z9, z6);
            C331277Qg r4 = (C331277Qg) C331277Qg.A06.get(drawable2);
            if (r4 != null) {
                if (!C329977Ky.A02(context2, r4, r2)) {
                    float f5 = r8.A00;
                    if (f5 == 0.0f) {
                        r4.A01(A032);
                    } else if (r8.A04 == 0) {
                        r4.A02(r8.A03, f5, true);
                    } else {
                        r4.A03(A032, r8.A03, f5);
                    }
                }
                Shape shape3 = r4.A03;
                if (shape3 instanceof C308496Um) {
                    0qQ.A0C(shape3, "null cannot be cast to non-null type com.facebook.common.messagingui.roundedcornergradientdrawable.shape.RoundedRectShape");
                    C329977Ky.A01((C308496Um) shape3, r3, r8, f, f2);
                }
                boolean A0u = 00k.A0u(0sr.A1P(new AnonymousClass5FV[]{AnonymousClass5FV.Celebration, AnonymousClass5FV.Fire, AnonymousClass5FV.AvatarAngry}), r2);
                r1 = r4.A04;
                if (!A0u) {
                    if (r1 != null) {
                        i = 0;
                        r1.setAlpha(i);
                    }
                    return;
                }
            } else {
                return;
            }
        }
        if (r1 != null) {
            i = 255;
            r1.setAlpha(i);
        }
    }
}
