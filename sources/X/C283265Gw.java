package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.instagram.android.R;

/* renamed from: X.5Gw  reason: invalid class name and case insensitive filesystem */
public final class C283265Gw extends Drawable {
    public int A00;
    public Integer A01;
    public int A02;
    public Drawable A03;
    public Drawable A04;
    public Drawable A05;
    public Drawable A06;
    public final int A07;
    public final int A08;
    public final Paint A09;
    public final RectF A0A;
    public final Drawable A0B;
    public final boolean A0C;
    public final int[] A0D;

    public C283265Gw(Context context, C283255Gu r7, boolean z, boolean z2) {
        int color;
        0qQ.A0B(context, 1);
        0qQ.A0B(r7, 2);
        this.A0C = z;
        Drawable drawable = context.getDrawable(R.drawable.tooltip_nub_top);
        if (drawable != null) {
            Drawable mutate = drawable.mutate();
            0qQ.A07(mutate);
            this.A06 = mutate;
            Drawable drawable2 = context.getDrawable(R.drawable.tooltip_nub_bottom);
            if (drawable2 != null) {
                Drawable mutate2 = drawable2.mutate();
                0qQ.A07(mutate2);
                this.A03 = mutate2;
                Drawable drawable3 = context.getDrawable(R.drawable.tooltip_nub_right);
                if (drawable3 != null) {
                    Drawable mutate3 = drawable3.mutate();
                    0qQ.A07(mutate3);
                    this.A05 = mutate3;
                    Drawable drawable4 = context.getDrawable(R.drawable.tooltip_nub_left);
                    if (drawable4 != null) {
                        Drawable mutate4 = drawable4.mutate();
                        0qQ.A07(mutate4);
                        this.A04 = mutate4;
                        Drawable drawable5 = context.getDrawable(r7.A01);
                        if (drawable5 != null) {
                            Drawable mutate5 = drawable5.mutate();
                            0qQ.A07(mutate5);
                            this.A0B = mutate5;
                            this.A09 = new Paint(1);
                            this.A0A = new RectF();
                            this.A08 = context.getResources().getDimensionPixelSize(R.dimen.abc_button_inset_vertical_material);
                            this.A0D = new int[4];
                            this.A02 = context.getResources().getDimensionPixelSize(R.dimen.abc_edit_text_inset_top_material);
                            Integer num = r7.A04;
                            if (num != null) {
                                color = num.intValue();
                            } else {
                                color = context.getColor(r7.A00);
                            }
                            this.A07 = color;
                            this.A01 = AnonymousClass05K.A01;
                            if (C61670oa.A0G()) {
                                this.A02 = context.getResources().getDimensionPixelSize(R.dimen.account_discovery_bottom_gap);
                                Drawable drawable6 = context.getDrawable(R.drawable.prism_tooltip_nub_top);
                                if (drawable6 != null) {
                                    this.A06 = drawable6.mutate();
                                    Drawable drawable7 = context.getDrawable(R.drawable.prism_tooltip_nub_bottom);
                                    if (drawable7 != null) {
                                        this.A03 = drawable7.mutate();
                                        Drawable drawable8 = context.getDrawable(R.drawable.prism_tooltip_nub_right);
                                        if (drawable8 != null) {
                                            this.A05 = drawable8.mutate();
                                            Drawable drawable9 = context.getDrawable(R.drawable.prism_tooltip_nub_left);
                                            if (drawable9 != null) {
                                                this.A04 = drawable9.mutate();
                                            } else {
                                                throw new IllegalStateException("Required value was null.");
                                            }
                                        } else {
                                            throw new IllegalStateException("Required value was null.");
                                        }
                                    } else {
                                        throw new IllegalStateException("Required value was null.");
                                    }
                                } else {
                                    throw new IllegalStateException("Required value was null.");
                                }
                            }
                            if (z2) {
                                this.A02 = context.getResources().getDimensionPixelSize(R.dimen.abc_select_dialog_padding_start_material);
                            }
                            int i = 0;
                            do {
                                this.A0D[i] = context.getResources().getDimensionPixelSize(r7.A05[i]);
                                i++;
                            } while (i < 4);
                            setColorFilter(AnonymousClass37O.A00(this.A07));
                            return;
                        }
                        throw new IllegalStateException("Required value was null.");
                    }
                    throw new IllegalStateException("Required value was null.");
                }
                throw new IllegalStateException("Required value was null.");
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final void draw(Canvas canvas) {
        Drawable drawable;
        0qQ.A0B(canvas, 0);
        if (this.A0C) {
            this.A0B.draw(canvas);
        }
        Paint paint = this.A09;
        paint.setColor(this.A07);
        RectF rectF = this.A0A;
        float f = (float) this.A02;
        canvas.drawRoundRect(rectF, f, f, paint);
        int intValue = this.A01.intValue();
        if (intValue == 0) {
            drawable = this.A06;
        } else if (intValue == 1) {
            drawable = this.A03;
        } else if (intValue == 2) {
            drawable = this.A05;
        } else if (intValue == 3) {
            drawable = this.A04;
        } else {
            throw new RuntimeException();
        }
        drawable.draw(canvas);
    }

    public final int getOpacity() {
        return -3;
    }

    public final void onBoundsChange(Rect rect) {
        0qQ.A0B(rect, 0);
        A00(rect, this);
    }

    public static final void A00(Rect rect, C283265Gw r12) {
        RectF rectF;
        Drawable drawable;
        int i;
        int i2;
        int intrinsicWidth;
        int i3;
        int intrinsicHeight;
        int i4;
        int intValue = r12.A01.intValue();
        if (intValue == 0) {
            rectF = r12.A0A;
            int i5 = rect.left;
            int i6 = r12.A08;
            int i7 = rect.top;
            drawable = r12.A06;
            rectF.set((float) (i5 + i6), (float) ((i7 + drawable.getIntrinsicHeight()) - 1), (float) (rect.right - i6), (float) (rect.bottom - i6));
            int intrinsicWidth2 = r12.A00 - (drawable.getIntrinsicWidth() / 2);
            if (intrinsicWidth2 < 0) {
                intrinsicWidth2 = 0;
            }
            i2 = rect.top;
            intrinsicWidth = drawable.getIntrinsicWidth() + i;
            i3 = rect.top;
            intrinsicHeight = drawable.getIntrinsicHeight();
        } else if (intValue != 1) {
            if (intValue == 2) {
                rectF = r12.A0A;
                int i8 = rect.left;
                int i9 = r12.A08;
                int i10 = rect.right;
                drawable = r12.A05;
                rectF.set((float) (i8 + i9), (float) (rect.top + i9), (float) ((i10 - drawable.getIntrinsicWidth()) + 1), (float) (rect.bottom - i9));
                i = rect.right - drawable.getIntrinsicWidth();
            } else if (intValue == 3) {
                rectF = r12.A0A;
                int i11 = rect.left;
                drawable = r12.A04;
                float intrinsicWidth3 = (float) (i11 + drawable.getIntrinsicWidth() + 1);
                int i12 = rect.top;
                int i13 = r12.A08;
                rectF.set(intrinsicWidth3, (float) (i12 + i13), (float) (rect.right - i13), (float) (rect.bottom - i13));
                i = rect.left + 1;
            } else {
                throw new RuntimeException();
            }
            if (i < 0) {
                i = 0;
            }
            i2 = rect.centerY() - (drawable.getIntrinsicHeight() / 2);
            intrinsicWidth = drawable.getIntrinsicWidth() + i;
            i3 = rect.centerY();
            intrinsicHeight = drawable.getIntrinsicHeight() / 2;
        } else {
            rectF = r12.A0A;
            int i14 = rect.left;
            int i15 = r12.A08;
            int i16 = rect.bottom;
            drawable = r12.A03;
            rectF.set((float) (i14 + i15), (float) (rect.top + i15), (float) (rect.right - i15), (float) ((i16 - drawable.getIntrinsicHeight()) + 1));
            int intrinsicWidth4 = r12.A00 - (drawable.getIntrinsicWidth() / 2);
            if (intrinsicWidth4 < 0) {
                intrinsicWidth4 = 0;
            }
            i2 = rect.bottom - drawable.getIntrinsicHeight();
            intrinsicWidth = drawable.getIntrinsicWidth() + i;
            i4 = rect.bottom;
            drawable.setBounds(i, i2, intrinsicWidth, i4);
            Drawable drawable2 = r12.A0B;
            float f = rectF.left;
            int[] iArr = r12.A0D;
            drawable2.setBounds(AnonymousClass1GB.A01(f - ((float) iArr[0])), AnonymousClass1GB.A01(rectF.top - ((float) iArr[1])), AnonymousClass1GB.A01(rectF.right + ((float) iArr[2])), AnonymousClass1GB.A01(rectF.bottom + ((float) iArr[3])));
            r12.invalidateSelf();
        }
        i4 = i3 + intrinsicHeight;
        drawable.setBounds(i, i2, intrinsicWidth, i4);
        Drawable drawable22 = r12.A0B;
        float f2 = rectF.left;
        int[] iArr2 = r12.A0D;
        drawable22.setBounds(AnonymousClass1GB.A01(f2 - ((float) iArr2[0])), AnonymousClass1GB.A01(rectF.top - ((float) iArr2[1])), AnonymousClass1GB.A01(rectF.right + ((float) iArr2[2])), AnonymousClass1GB.A01(rectF.bottom + ((float) iArr2[3])));
        r12.invalidateSelf();
    }

    public final void setAlpha(int i) {
        this.A06.setAlpha(i);
        this.A03.setAlpha(i);
        this.A05.setAlpha(i);
        this.A04.setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.A06.setColorFilter(colorFilter);
        this.A03.setColorFilter(colorFilter);
        this.A05.setColorFilter(colorFilter);
        this.A04.setColorFilter(colorFilter);
    }
}
