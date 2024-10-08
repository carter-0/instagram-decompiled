package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.Pair;
import android.view.View;
import com.instagram.android.R;
import java.util.NoSuchElementException;

public final class U3X extends View {
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public C17729Vcy A05;
    public C17729Vcy A06;
    public C17729Vcy A07;
    public boolean A08;
    public float[] A09;
    public float[] A0A;
    public float[] A0B;
    public float[] A0C;
    public float[] A0D;
    public float[] A0E;
    public float[] A0F;
    public float[] A0G;
    public float[] A0H;
    public float[] A0I;
    public float[] A0J;
    public float[] A0K;
    public int A0L;
    public final Paint A0M;
    public final Paint A0N;
    public final Paint A0O;
    public final Paint A0P;
    public final Path A0Q;
    public final Path A0R;
    public final Path A0S = new Path();
    public final Path A0T = new Path();
    public final Path A0U;
    public final int A0V;
    public final int A0W;
    public final int A0X;
    public final Paint A0Y;

    private final float[] A02(float[] fArr, float f, float f2) {
        float f3;
        int i = 0;
        int length = fArr.length;
        if (length == 0) {
            return new float[0];
        }
        float[] fArr2 = new float[length];
        do {
            int i2 = this.A01;
            float f4 = fArr[i];
            if (f2 < f) {
                f3 = 0.0f;
            } else {
                f3 = ((float) i2) * (((f4 - f) * 1.0f) / (f2 - f));
            }
            fArr2[i] = f3;
            i++;
        } while (i < length);
        return fArr2;
    }

    private final float[] A03(float[] fArr, float f, float f2) {
        float f3;
        int i = 0;
        int length = fArr.length;
        if (length == 0) {
            return new float[0];
        }
        float[] fArr2 = new float[length];
        do {
            float f4 = (float) this.A0W;
            int i2 = this.A0L;
            float f5 = fArr[i];
            if (f2 < f) {
                f3 = 0.0f;
            } else {
                f3 = ((float) i2) * (((f2 - f5) * 1.0f) / (f2 - f));
            }
            fArr2[i] = f4 + f3;
            i++;
        } while (i < length);
        return fArr2;
    }

    public final void onDraw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        super.onDraw(canvas);
        C17729Vcy vcy = this.A07;
        if (!(vcy == null || this.A06 == null)) {
            Paint paint = this.A0Y;
            paint.setColor(vcy.A05);
            canvas.drawPath(this.A0U, paint);
        }
        if (this.A08) {
            canvas.drawPath(this.A0S, this.A0O);
            canvas.drawPath(this.A0Q, this.A0M);
        }
        canvas.drawPath(this.A0T, this.A0P);
        canvas.drawPath(this.A0R, this.A0N);
    }

    public static void A00(Path path, Pair pair) {
        Object obj = pair.first;
        0qQ.A06(obj);
        float floatValue = ((Number) obj).floatValue();
        Object obj2 = pair.second;
        0qQ.A06(obj2);
        path.lineTo(floatValue, ((Number) obj2).floatValue());
    }

    public static void A01(Path path, Pair pair) {
        Object obj = pair.first;
        0qQ.A06(obj);
        float floatValue = ((Number) obj).floatValue();
        Object obj2 = pair.second;
        0qQ.A06(obj2);
        path.moveTo(floatValue, ((Number) obj2).floatValue());
    }

    public final float[] getLowerXPositions() {
        float[] fArr = this.A09;
        if (fArr != null) {
            return fArr;
        }
        0qQ.A0F("lowerXPositions");
        throw AnonymousClass00P.createAndThrow();
    }

    public final float[] getUpperXPositions() {
        float[] fArr = this.A0D;
        if (fArr != null) {
            return fArr;
        }
        0qQ.A0F("upperXPositions");
        throw AnonymousClass00P.createAndThrow();
    }

    public final float[] getXPositions() {
        float[] fArr = this.A0H;
        if (fArr != null) {
            return fArr;
        }
        0qQ.A0F("xPositions");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onMeasure(int i, int i2) {
        float[] fArr;
        Path path;
        int i3;
        Pair pair;
        Path path2;
        float[] fArr2;
        float[] fArr3;
        super.onMeasure(i, i2);
        int measuredHeight = getMeasuredHeight();
        int i4 = this.A0W;
        this.A0L = (measuredHeight - i4) - this.A0V;
        int measuredWidth = getMeasuredWidth() - this.A0X;
        this.A01 = measuredWidth;
        float[] fArr4 = this.A0I;
        String str = "yValues";
        if (fArr4 != null) {
            C17729Vcy vcy = this.A05;
            if (vcy != null) {
                fArr = A02(fArr4, vcy.A02, vcy.A01);
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        } else {
            float[] fArr5 = this.A0K;
            if (fArr5 != null) {
                int length = fArr5.length;
                float f = (((float) measuredWidth) * 1.0f) / ((float) (length - 1));
                fArr = new float[length];
                for (int i5 = 0; i5 < length; i5++) {
                    fArr[i5] = ((float) i5) * f;
                }
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
        this.A0H = fArr;
        float[] fArr6 = this.A0K;
        if (fArr6 != null) {
            C17729Vcy vcy2 = this.A05;
            if (vcy2 != null) {
                float f2 = vcy2.A04;
                float f3 = vcy2.A03;
                this.A0J = A03(fArr6, f2, f3);
                float[] fArr7 = this.A0A;
                if (!(fArr7 == null || (fArr3 = this.A0C) == null)) {
                    C17729Vcy vcy3 = this.A06;
                    if (vcy3 != null) {
                        this.A09 = A02(fArr7, vcy3.A02, vcy3.A01);
                        this.A0B = A03(fArr3, vcy3.A04, vcy3.A03);
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                }
                float[] fArr8 = this.A0E;
                if (!(fArr8 == null || (fArr2 = this.A0G) == null)) {
                    C17729Vcy vcy4 = this.A07;
                    if (vcy4 != null) {
                        this.A0D = A02(fArr8, vcy4.A02, vcy4.A01);
                        this.A0F = A03(fArr2, vcy4.A04, vcy4.A03);
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                }
                this.A00 = ((float) i4) + (((f3 * 1.0f) / (f3 - f2)) * ((float) this.A0L));
                Path path3 = this.A0T;
                path3.reset();
                Path path4 = this.A0S;
                path4.reset();
                Path path5 = this.A0R;
                path5.reset();
                Path path6 = this.A0Q;
                path6.reset();
                float[] fArr9 = this.A0K;
                if (fArr9 != null) {
                    int i6 = 0;
                    int i7 = (fArr9[0] > 0.0f ? 1 : (fArr9[0] == 0.0f ? 0 : -1));
                    float[] xPositions = getXPositions();
                    if (i7 >= 0) {
                        float f4 = xPositions[0];
                        float[] fArr10 = this.A0J;
                        if (fArr10 != null) {
                            path3.moveTo(f4, fArr10[0]);
                            path = path4;
                        }
                        0qQ.A0F("yPositions");
                        throw AnonymousClass00P.createAndThrow();
                    }
                    float f5 = xPositions[0];
                    float[] fArr11 = this.A0J;
                    if (fArr11 != null) {
                        path5.moveTo(f5, fArr11[0]);
                        path = path6;
                    }
                    0qQ.A0F("yPositions");
                    throw AnonymousClass00P.createAndThrow();
                    path.moveTo(0.0f, this.A00);
                    int i8 = this.A03;
                    while (i6 < i8) {
                        float[] fArr12 = this.A0K;
                        if (fArr12 != null) {
                            int i9 = (fArr12[i6] > 0.0f ? 1 : (fArr12[i6] == 0.0f ? 0 : -1));
                            float f6 = getXPositions()[i6];
                            float[] fArr13 = this.A0J;
                            if (i9 >= 0) {
                                if (fArr13 != null) {
                                    path3.lineTo(f6, fArr13[i6]);
                                    float f7 = getXPositions()[i6];
                                    float[] fArr14 = this.A0J;
                                    if (fArr14 != null) {
                                        path4.lineTo(f7, fArr14[i6]);
                                        int i10 = i6 + 1;
                                        if (i10 >= this.A03) {
                                            continue;
                                        } else {
                                            float[] fArr15 = this.A0K;
                                            if (fArr15 != null) {
                                                if (fArr15[i10] < 0.0f) {
                                                    float f8 = getXPositions()[i6];
                                                    float[] fArr16 = this.A0J;
                                                    if (fArr16 != null) {
                                                        float f9 = fArr16[i6];
                                                        float f10 = getXPositions()[i10];
                                                        float[] fArr17 = this.A0J;
                                                        if (fArr17 != null) {
                                                            float f11 = (fArr17[i10] - f9) / (f10 - f8);
                                                            float f12 = this.A00;
                                                            pair = new Pair(Float.valueOf((f12 - (f9 - (f8 * f11))) / f11), Float.valueOf(f12));
                                                            A00(path3, pair);
                                                            A00(path4, pair);
                                                            A01(path5, pair);
                                                            path2 = path6;
                                                        }
                                                    }
                                                } else {
                                                    continue;
                                                }
                                            }
                                        }
                                        i6++;
                                    }
                                }
                                0qQ.A0F("yPositions");
                                throw AnonymousClass00P.createAndThrow();
                            }
                            if (fArr13 != null) {
                                path5.lineTo(f6, fArr13[i6]);
                                float f13 = getXPositions()[i6];
                                float[] fArr18 = this.A0J;
                                if (fArr18 != null) {
                                    path6.lineTo(f13, fArr18[i6]);
                                    int i11 = i6 + 1;
                                    if (i11 >= this.A03) {
                                        continue;
                                    } else {
                                        float[] fArr19 = this.A0K;
                                        if (fArr19 != null) {
                                            if (fArr19[i11] >= 0.0f) {
                                                float f14 = getXPositions()[i6];
                                                float[] fArr20 = this.A0J;
                                                if (fArr20 != null) {
                                                    float f15 = fArr20[i6];
                                                    float f16 = getXPositions()[i11];
                                                    float[] fArr21 = this.A0J;
                                                    if (fArr21 != null) {
                                                        float f17 = (fArr21[i11] - f15) / (f16 - f14);
                                                        float f18 = this.A00;
                                                        pair = new Pair(Float.valueOf((f18 - (f15 - (f14 * f17))) / f17), Float.valueOf(f18));
                                                        A00(path5, pair);
                                                        A00(path6, pair);
                                                        A01(path3, pair);
                                                        path2 = path4;
                                                    }
                                                }
                                            } else {
                                                continue;
                                            }
                                        }
                                    }
                                    i6++;
                                }
                            }
                            0qQ.A0F("yPositions");
                            throw AnonymousClass00P.createAndThrow();
                            A01(path2, pair);
                            i6++;
                        }
                    }
                    float[] xPositions2 = getXPositions();
                    int length2 = xPositions2.length;
                    if (length2 == 0) {
                        throw new NoSuchElementException(AnonymousClass000.A00(872));
                    }
                    path4.lineTo(xPositions2[length2 - 1], this.A00);
                    path6.lineTo((float) this.A01, this.A00);
                    if (this.A06 != null && this.A07 != null) {
                        Path path7 = this.A0U;
                        path7.reset();
                        path7.moveTo(0.0f, this.A00);
                        if (this.A02 > 0 && (i3 = this.A04) > 0) {
                            int i12 = 0;
                            while (true) {
                                float f19 = getUpperXPositions()[i12];
                                float[] fArr22 = this.A0F;
                                if (fArr22 == null) {
                                    str = "upperYPositions";
                                    break;
                                }
                                path7.lineTo(f19, fArr22[i12]);
                                i12++;
                                if (i12 >= i3) {
                                    int i13 = this.A02;
                                    while (true) {
                                        i13--;
                                        if (-1 < i13) {
                                            float f20 = getLowerXPositions()[i13];
                                            float[] fArr23 = this.A0B;
                                            if (fArr23 == null) {
                                                str = "lowerYPositions";
                                                break;
                                            }
                                            path7.lineTo(f20, fArr23[i13]);
                                        } else {
                                            return;
                                        }
                                    }
                                }
                            }
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                }
                0qQ.A0F(str);
                throw AnonymousClass00P.createAndThrow();
            }
            throw new IllegalStateException("Required value was null.");
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public U3X(Context context) {
        super(context);
        Paint paint = new Paint();
        this.A0P = paint;
        Paint paint2 = new Paint();
        this.A0O = paint2;
        Paint paint3 = new Paint();
        this.A0N = paint3;
        this.A0M = new Paint();
        this.A0R = new Path();
        this.A0Q = new Path();
        this.A0U = new Path();
        Paint paint4 = new Paint();
        this.A0Y = paint4;
        C13988Tno.A0u(context.getResources(), paint, R.dimen.abc_control_corner_material);
        AnonymousClass7TE.A1N(context, paint, R.color.badge_color);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        AnonymousClass7TE.A1N(context, paint2, R.color.badge_color);
        Paint.Style style2 = Paint.Style.FILL;
        paint2.setStyle(style2);
        AnonymousClass7TE.A1N(context, paint4, R.color.grey_1);
        paint4.setStyle(style2);
        paint3.setStrokeWidth((float) AnonymousClass7TF.A02(context, R.dimen.abc_control_corner_material));
        AnonymousClass7TE.A1N(context, paint3, R.color.blue_3);
        paint3.setStyle(style);
        this.A0W = C51972G9s.A08(context);
        this.A0V = AnonymousClass7TG.A06(getContext());
        this.A0X = C51972G9s.A08(context);
    }
}
