package X;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.UAh  reason: case insensitive filesystem */
public final class C14811UAh extends AnonymousClass3B3 {
    public float A00;
    public C14820UAz A01;
    public boolean A02 = false;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final Rect A07;
    public final C17557VaB A08;
    public final boolean A09;
    public final boolean A0A;
    public final int A0B;
    public final int A0C;
    public final Paint A0D = new Paint();
    public final RectF A0E = new RectF();
    public final RectF A0F = new RectF();

    public final void onDrawOver(Canvas canvas, RecyclerView recyclerView, AnonymousClass3AW r14) {
        RectF rectF;
        RectF rectF2;
        float f;
        int i;
        Rect rect;
        int width;
        C14820UAz uAz = this.A01;
        if (uAz != null && !this.A02 && !uAz.A04 && uAz.A02) {
            C20124Wlk wlk = new C20124Wlk(recyclerView, uAz);
            uAz.A01 = wlk;
            recyclerView.postDelayed(wlk, 1500);
        }
        boolean z = true;
        this.A02 = true;
        if (this.A00 != 0.0f) {
            C252553pI r8 = recyclerView.A0D;
            if (r8 instanceof LinearLayoutManager) {
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) r8;
                boolean A1S = AnonymousClass7TF.A1S(linearLayoutManager.A07.getLayoutDirection(), 1);
                if (linearLayoutManager.A01 == 1) {
                    int A14 = linearLayoutManager.A14(r14);
                    int A16 = linearLayoutManager.A16(r14);
                    int height = recyclerView.getHeight();
                    boolean z2 = this.A0A;
                    if (z2) {
                        Rect rect2 = this.A07;
                        height = (height - rect2.top) - rect2.bottom;
                    }
                    int A15 = linearLayoutManager.A15(r14);
                    if (A16 != A14) {
                        int A042 = JTO.A04(((float) height) * ((float) A14), (float) A16);
                        int i2 = height / 2;
                        if (A042 > i2) {
                            A042 = i2;
                        }
                        int A043 = JTO.A04(((float) (height - A042)) * ((float) A15), (float) (A16 - A14));
                        rectF = this.A0F;
                        if (A1S) {
                            rect = this.A07;
                            int i3 = rect.right;
                            rectF.left = (float) i3;
                            width = this.A06 + i3;
                        } else {
                            rect = this.A07;
                            rectF.left = (float) ((recyclerView.getWidth() - this.A06) - rect.right);
                            width = recyclerView.getWidth() - rect.right;
                        }
                        float f2 = (float) width;
                        rectF.right = f2;
                        rectF.top = (float) A043;
                        rectF.bottom = (float) (A043 + A042);
                        rectF2 = this.A0E;
                        rectF2.left = rectF.left;
                        rectF2.right = f2;
                        rectF2.top = 0.0f;
                        rectF2.bottom = (float) recyclerView.getHeight();
                        if (z2) {
                            float f3 = rectF.top;
                            float f4 = (float) rect.top;
                            rectF.top = f3 + f4;
                            rectF.bottom += f4;
                            rectF2.top += f4;
                            rectF2.bottom -= (float) rect.bottom;
                        }
                    } else {
                        return;
                    }
                } else {
                    int A11 = linearLayoutManager.A11(r14);
                    int A13 = linearLayoutManager.A13(r14);
                    int width2 = recyclerView.getWidth();
                    boolean z3 = this.A0A;
                    if (z3) {
                        Rect rect3 = this.A07;
                        width2 = (width2 - rect3.left) - rect3.right;
                    }
                    int A12 = linearLayoutManager.A12(r14);
                    if (A13 != A11) {
                        int A044 = JTO.A04(((float) width2) * ((float) A11), (float) A13);
                        int i4 = width2 / 2;
                        if (A044 > i4) {
                            A044 = i4;
                        }
                        int A045 = JTO.A04(((float) (width2 - A044)) * ((float) A12), (float) (A13 - A11));
                        rectF = this.A0F;
                        rectF.left = (float) A045;
                        rectF.right = (float) (A045 + A044);
                        Rect rect4 = this.A07;
                        rectF.top = (float) ((recyclerView.getHeight() - this.A06) - rect4.bottom);
                        rectF.bottom = (float) (recyclerView.getHeight() - rect4.bottom);
                        rectF2 = this.A0E;
                        rectF2.left = 0.0f;
                        rectF2.top = rectF.top;
                        rectF2.right = (float) recyclerView.getWidth();
                        rectF2.bottom = rectF.bottom;
                        if (z3) {
                            float f5 = rectF.left;
                            if (A1S) {
                                float f6 = (float) rect4.right;
                                rectF.left = f5 + f6;
                                rectF.right += f6;
                                rectF2.left += f6;
                                f = rectF2.right;
                                i = rect4.left;
                            } else {
                                float f7 = (float) rect4.left;
                                rectF.left = f5 + f7;
                                rectF.right += f7;
                                rectF2.left += f7;
                                f = rectF2.right;
                                i = rect4.right;
                            }
                            rectF2.right = f - ((float) i);
                        }
                    } else {
                        return;
                    }
                }
                int i5 = this.A03;
                if (i5 != 0) {
                    C17557VaB vaB = this.A08;
                    float f8 = vaB.A03;
                    if (f8 == 0.0f || !canvas.isHardwareAccelerated()) {
                        z = false;
                    } else {
                        this.A0D.setShadowLayer(f8, vaB.A01, vaB.A00, vaB.A05);
                    }
                    Paint paint = this.A0D;
                    paint.setColor(i5);
                    C13988Tno.A0o(this.A00, (float) this.A0B, paint);
                    float f9 = (float) this.A05;
                    canvas.drawRoundRect(rectF2, f9, f9, paint);
                    if (z) {
                        paint.clearShadowLayer();
                    }
                }
                Paint paint2 = this.A0D;
                paint2.setColor(this.A04);
                C13988Tno.A0o(this.A00, (float) this.A0C, paint2);
                float f10 = (float) this.A05;
                canvas.drawRoundRect(rectF, f10, f10, paint2);
            }
        }
    }

    public C14811UAh(Rect rect, C17557VaB vaB, int i, int i2, int i3, int i4, boolean z, boolean z2) {
        this.A03 = i2;
        this.A04 = i;
        this.A0C = Color.alpha(i);
        this.A0B = Color.alpha(i2);
        this.A06 = i3;
        this.A05 = i4;
        this.A09 = z;
        if (z) {
            this.A00 = 1.0f;
        }
        this.A07 = rect;
        this.A0A = z2;
        this.A08 = vaB;
    }
}
