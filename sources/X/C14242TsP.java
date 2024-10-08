package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;

/* renamed from: X.TsP  reason: case insensitive filesystem */
public final class C14242TsP extends C71572e9 {
    public float A00;
    public Paint A01;
    public Path A02;
    public Path A03;
    public PathMeasure A04;
    public boolean A05;
    public boolean A06;
    public Path A07;
    public Path A08;

    /* JADX WARNING: type inference failed for: r0v46, types: [java.lang.Object, X.2dn] */
    public final void A09(float f) {
        2dy r8 = this.A04;
        2dt r12 = r8.A0f;
        AnonymousClass6B0 r11 = r8.A0a;
        AnonymousClass2e5 r5 = this.A0B;
        AnonymousClass2e6 r9 = r5.A03;
        2dt A002 = r9.A00();
        Path path = this.A07;
        AnonymousClass2e2 r7 = r5.A0E;
        float f2 = r7.A00;
        float f3 = r5.A00;
        float f4 = f;
        Path A032 = AnonymousClass3JX.A03(path, r11, r12, A002, f4, f2, f3, f3);
        this.A07 = A032;
        if (A032 != null) {
            Path path2 = this.A08;
            if (!this.A06 || path2 == null || path2.isEmpty()) {
                float f5 = r8.A0H;
                AnonymousClass6B4 r0 = r8.A0o;
                float f6 = r7.A00;
                float A003 = AnonymousClass3JU.A00(r0, f5, f4, f6) / 100.0f;
                float A004 = AnonymousClass3JU.A00(r8.A0m, r8.A0F, f4, f6) / 100.0f;
                float A005 = AnonymousClass3JU.A00(r8.A0n, r8.A0G, f4, f6) / 360.0f;
                PathMeasure pathMeasure = this.A04;
                if (pathMeasure == null) {
                    this.A04 = new PathMeasure(A032, false);
                } else {
                    pathMeasure.setPath(A032, false);
                }
                float length = this.A04.getLength();
                if (length < 1.0f) {
                    path2 = null;
                } else {
                    if (path2 == null) {
                        path2 = new Path();
                    } else if (!path2.isEmpty()) {
                        path2.reset();
                    }
                    if (((double) AnonymousClass7TE.A00(A004, A003)) >= 0.0015d) {
                        if ((A003 == 0.0f && A004 == 1.0f) || (A003 == 1.0f && A004 == 0.0f)) {
                            path2.set(A032);
                        } else {
                            float f7 = A003 * length;
                            float f8 = A004 * length;
                            if (f7 > f8) {
                                float f9 = f8;
                                f8 = f7;
                                f7 = f9;
                            }
                            float f10 = A005 * length;
                            float f11 = f7 + f10;
                            float f12 = f8 + f10;
                            if (f11 < 0.0f) {
                                f11 = (f11 % length) + length;
                            }
                            if (f12 < 0.0f) {
                                f12 = (f12 % length) + length;
                            }
                            if (f11 > length || f12 > length) {
                                f11 %= length;
                                f12 %= length;
                            }
                            if (f11 > f12) {
                                Path path3 = this.A02;
                                if (path3 == null) {
                                    path3 = new Path();
                                } else if (!path3.isEmpty()) {
                                    path3.reset();
                                }
                                this.A02 = path3;
                                Path path4 = this.A03;
                                if (path4 == null) {
                                    path4 = new Path();
                                } else if (!path4.isEmpty()) {
                                    path4.reset();
                                }
                                this.A03 = path4;
                                this.A04.getSegment(0.0f, f12, this.A02, true);
                                this.A04.getSegment(f11, length, this.A03, true);
                                path2.addPath(this.A02);
                                path2.addPath(this.A03);
                            } else {
                                this.A04.getSegment(f11, f12, path2, true);
                            }
                        }
                    }
                }
            }
            this.A08 = path2;
            if (path2 == null) {
                return;
            }
            if (r8.A0T != null || r8.A0d != null || r8.A09 != 0.0f || r8.A0l != null) {
                this.A05 = false;
                float A006 = AnonymousClass3JU.A00(r8.A0l, r8.A09, f4, r7.A00) * r5.A00;
                this.A00 = A006;
                if (A006 == 0.0f) {
                    this.A05 = true;
                    return;
                }
                if (this.A01 == null) {
                    Paint paint = new Paint(1);
                    this.A01 = paint;
                    JTO.A1N(paint);
                    this.A01.setStrokeCap(Paint.Cap.values()[r8.A00]);
                    this.A01.setStrokeJoin(Paint.Join.values()[r8.A01]);
                }
                this.A01.setStrokeWidth(this.A00);
                2dn r3 = r8.A0T;
                AnonymousClass6B0 r2 = r8.A0d;
                float f13 = r7.A00;
                2do r02 = r9.A04;
                2do r03 = r02;
                if (r02 == null) {
                    ? obj = new Object();
                    r9.A04 = obj;
                    r03 = obj;
                }
                2dn A007 = AnonymousClass3JW.A00(r3, r03, r2, f4, f13);
                if (A007 != null) {
                    this.A01.setARGB((A007.A00 * this.A01) / 255, A007.A03, A007.A02, A007.A01);
                }
                float A008 = AnonymousClass3JU.A00(r8.A0i, r8.A05, f4, r7.A00) * r5.A00;
                if (A008 >= 0.0f) {
                    this.A01.setStrokeMiter(A008);
                }
            }
        }
    }

    public final void A0A(Canvas canvas) {
        Paint paint;
        Path path = this.A08;
        if (path != null && (paint = this.A01) != null && !this.A05) {
            canvas.drawPath(path, paint);
        }
    }

    public final void A0E(RectF rectF) {
        Path path = this.A08;
        if (path != null) {
            path.computeBounds(rectF, false);
            float f = rectF.left;
            float f2 = this.A00 / 2.0f;
            rectF.set((f - f2) - 1.0f, (rectF.top - f2) - 1.0f, rectF.right + f2 + 1.0f, rectF.bottom + f2 + 1.0f);
        }
    }

    public final void A07() {
        super.A07();
        Path path = this.A07;
        if (path != null) {
            path.rewind();
        }
        Path path2 = this.A08;
        if (path2 != null) {
            path2.rewind();
        }
    }
}
