package X;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.List;

/* renamed from: X.Sgf  reason: case insensitive filesystem */
public abstract class C11793Sgf implements C13518Tbn, C13912TlE, C13914TlG {
    public float A00;
    public C11388SRb A01;
    public C11388SRb A02;
    public C11792Sge A03;
    public final Paint A04;
    public final Path A05 = C51965G9l.A0C();
    public final Path A06 = C51965G9l.A0C();
    public final PathMeasure A07 = new PathMeasure();
    public final C11388SRb A08;
    public final List A09;
    public final float[] A0A;
    public final RectF A0B = AnonymousClass7TE.A0Y();
    public final Q6Y A0C;
    public final C11388SRb A0D;
    public final C11388SRb A0E;
    public final List A0F = AnonymousClass7TE.A1C();
    public final C11796Sgi A0G;

    public void AAd(SIR sir, Object obj) {
        C11796Sgi sgi;
        C11388SRb sRb;
        C11792Sge sge;
        C11388SRb sRb2;
        C11792Sge sge2;
        C11792Sge sge3;
        C11792Sge sge4;
        C11792Sge sge5;
        if (obj == C13881Tj4.A0c) {
            sRb2 = this.A0D;
        } else if (obj == C13881Tj4.A0P) {
            sRb2 = this.A0E;
        } else {
            if (obj == C13881Tj4.A01) {
                C11388SRb sRb3 = this.A02;
                if (sRb3 != null) {
                    this.A0G.A0M.remove(sRb3);
                }
                if (sir == null) {
                    this.A02 = null;
                    return;
                }
                QGN A002 = QGN.A00(sir);
                this.A02 = A002;
                A002.A09(this);
                sgi = this.A0G;
                sRb = this.A02;
            } else if (obj == C13881Tj4.A0B) {
                sRb2 = this.A01;
                if (sRb2 == null) {
                    QGN A003 = QGN.A00(sir);
                    this.A01 = A003;
                    A003.A09(this);
                    sgi = this.A0G;
                    sRb = this.A01;
                }
            } else if (obj == C13881Tj4.A0b && (sge5 = this.A03) != null) {
                sRb2 = sge5.A01;
            } else if (obj == C13881Tj4.A0F && (sge4 = this.A03) != null) {
                sge4.A01(sir);
                return;
            } else if (obj == C13881Tj4.A0D && (sge3 = this.A03) != null) {
                sRb2 = sge3.A02;
            } else if (obj == C13881Tj4.A0E && (sge2 = this.A03) != null) {
                sRb2 = sge2.A03;
            } else if (obj == C13881Tj4.A0G && (sge = this.A03) != null) {
                sRb2 = sge.A04;
            } else {
                return;
            }
            sgi.A0C(sRb);
            return;
        }
        sRb2.A0A(sir);
    }

    public void AQI(Canvas canvas, Matrix matrix, int i) {
        float f;
        float f2;
        float f3;
        BlurMaskFilter blurMaskFilter;
        float A012;
        float[] fArr = (float[]) SSo.A00.get();
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        fArr[2] = 37394.73f;
        fArr[3] = 39575.234f;
        Matrix matrix2 = matrix;
        matrix2.mapPoints(fArr);
        if (fArr[0] != fArr[2] && fArr[1] != fArr[3]) {
            QGQ qgq = (QGQ) this.A0D;
            int A0B2 = (int) ((((((float) i) / 255.0f) * ((float) qgq.A0B(qgq.A06.Au7(), qgq.A04()))) / 100.0f) * 255.0f);
            Paint paint = this.A04;
            int i2 = 0;
            PointF pointF = SQL.A00;
            paint.setAlpha(Pxf.A01(255, A0B2, 0));
            paint.setStrokeWidth(((QGR) this.A0E).A0B() * SSo.A01(matrix2));
            if (paint.getStrokeWidth() > 0.0f) {
                List list = this.A09;
                if (!list.isEmpty()) {
                    float A013 = SSo.A01(matrix2);
                    for (int i3 = 0; i3 < list.size(); i3++) {
                        float[] fArr2 = this.A0A;
                        float A014 = C11388SRb.A01((C11388SRb) list.get(i3));
                        fArr2[i3] = A014;
                        float f4 = 0.1f;
                        if (i3 % 2 == 0) {
                            f4 = 1.0f;
                        }
                        if (A014 < f4) {
                            fArr2[i3] = f4;
                        }
                        fArr2[i3] = fArr2[i3] * A013;
                    }
                    C11388SRb sRb = this.A08;
                    if (sRb == null) {
                        A012 = 0.0f;
                    } else {
                        A012 = A013 * C11388SRb.A01(sRb);
                    }
                    paint.setPathEffect(new DashPathEffect(this.A0A, A012));
                }
                Pxj.A15(paint, this.A02);
                C11388SRb sRb2 = this.A01;
                if (sRb2 != null) {
                    float A015 = C11388SRb.A01(sRb2);
                    if (A015 == 0.0f) {
                        blurMaskFilter = null;
                    } else {
                        if (A015 != this.A00) {
                            C11796Sgi sgi = this.A0G;
                            if (sgi.A00 == A015) {
                                blurMaskFilter = sgi.A01;
                            } else {
                                blurMaskFilter = new BlurMaskFilter(A015 / 2.0f, BlurMaskFilter.Blur.NORMAL);
                                sgi.A01 = blurMaskFilter;
                                sgi.A00 = A015;
                            }
                        }
                        this.A00 = A015;
                    }
                    paint.setMaskFilter(blurMaskFilter);
                    this.A00 = A015;
                }
                C11792Sge sge = this.A03;
                if (sge != null) {
                    sge.A00(paint);
                }
                while (true) {
                    List list2 = this.A0F;
                    if (i2 < list2.size()) {
                        C10352Rqp rqp = (C10352Rqp) list2.get(i2);
                        Canvas canvas2 = canvas;
                        if (rqp.A00 != null) {
                            C11783SgV sgV = rqp.A00;
                            if (sgV != null) {
                                Path path = this.A05;
                                path.reset();
                                List list3 = rqp.A01;
                                int size = list3.size();
                                while (true) {
                                    size--;
                                    if (size < 0) {
                                        break;
                                    }
                                    C13913TlF.A00(matrix2, path, list3, size);
                                }
                                float A016 = C11388SRb.A01(sgV.A02) / 100.0f;
                                float A017 = C11388SRb.A01(sgV.A00) / 100.0f;
                                float A018 = C11388SRb.A01(sgV.A01) / 360.0f;
                                if (A016 >= 0.01f || A017 <= 0.99f) {
                                    PathMeasure pathMeasure = this.A07;
                                    pathMeasure.setPath(path, false);
                                    float length = pathMeasure.getLength();
                                    while (pathMeasure.nextContour()) {
                                        length += pathMeasure.getLength();
                                    }
                                    float f5 = A018 * length;
                                    float f6 = (A016 * length) + f5;
                                    float min = Math.min((A017 * length) + f5, (f6 + length) - 1.0f);
                                    float f7 = 0.0f;
                                    for (int A062 = C51966G9m.A06(list3); A062 >= 0; A062--) {
                                        Path path2 = this.A06;
                                        path2.set(((C13913TlF) list3.get(A062)).Bar());
                                        path2.transform(matrix2);
                                        pathMeasure.setPath(path2, false);
                                        float length2 = pathMeasure.getLength();
                                        if (min > length) {
                                            float f8 = min - length;
                                            if (f8 < f7 + length2 && f7 < f8) {
                                                if (f6 > length) {
                                                    f2 = (f6 - length) / length2;
                                                } else {
                                                    f2 = 0.0f;
                                                }
                                                f3 = Math.min(f8 / length2, 1.0f);
                                                SSo.A03(path2, f2, f3, 0.0f);
                                                canvas2.drawPath(path2, paint);
                                                f7 += length2;
                                            }
                                        }
                                        float f9 = f7 + length2;
                                        if (f9 >= f6 && f7 <= min) {
                                            if (f9 > min || f6 >= f7) {
                                                if (f6 < f7) {
                                                    f = 0.0f;
                                                } else {
                                                    f = (f6 - f7) / length2;
                                                }
                                                if (min > f9) {
                                                    f3 = 1.0f;
                                                } else {
                                                    f3 = (min - f7) / length2;
                                                }
                                                SSo.A03(path2, f2, f3, 0.0f);
                                            }
                                            canvas2.drawPath(path2, paint);
                                        }
                                        f7 += length2;
                                    }
                                } else {
                                    canvas2.drawPath(path, paint);
                                }
                            }
                        } else {
                            Path path3 = this.A05;
                            path3.reset();
                            int size2 = rqp.A01.size();
                            while (true) {
                                size2--;
                                if (size2 < 0) {
                                    break;
                                }
                                C13913TlF.A00(matrix2, path3, rqp.A01, size2);
                            }
                            canvas2.drawPath(path3, paint);
                        }
                        i2++;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public final void Aha(Matrix matrix, RectF rectF, boolean z) {
        Path path = this.A05;
        path.reset();
        int i = 0;
        while (true) {
            List list = this.A0F;
            if (i < list.size()) {
                C10352Rqp rqp = (C10352Rqp) list.get(i);
                for (int i2 = 0; i2 < rqp.A01.size(); i2++) {
                    C13913TlF.A00(matrix, path, rqp.A01, i2);
                }
                i++;
            } else {
                RectF rectF2 = this.A0B;
                path.computeBounds(rectF2, false);
                Pxj.A16(rectF2, rectF2.left, ((QGR) this.A0E).A0B() / 2.0f);
                rectF.set(rectF2);
                Pxj.A16(rectF, rectF.left, 1.0f);
                return;
            }
        }
    }

    public final void Dwx() {
        this.A0C.invalidateSelf();
    }

    public C11793Sgf(Paint.Cap cap, Paint.Join join, Q6Y q6y, QGY qgy, QGY qgy2, C7487QGa qGa, C11796Sgi sgi, List list, float f) {
        QGR A002;
        Paint paint = new Paint(1);
        this.A04 = paint;
        this.A00 = 0.0f;
        this.A0C = q6y;
        this.A0G = sgi;
        JTO.A1N(paint);
        paint.setStrokeCap(cap);
        paint.setStrokeJoin(join);
        paint.setStrokeMiter(f);
        this.A0D = new C11388SRb(qGa.A00);
        this.A0E = C11802Sgo.A00(qgy);
        if (qgy2 == null) {
            A002 = null;
        } else {
            A002 = C11802Sgo.A00(qgy2);
        }
        this.A08 = A002;
        this.A09 = C51970G9q.A0m(list);
        this.A0A = new float[list.size()];
        for (int i = 0; i < list.size(); i++) {
            this.A09.add(C11802Sgo.A00((C11802Sgo) list.get(i)));
        }
        sgi.A0C(this.A0D);
        sgi.A0C(this.A0E);
        for (int i2 = 0; i2 < this.A09.size(); i2++) {
            sgi.A0C((C11388SRb) this.A09.get(i2));
        }
        C11388SRb sRb = this.A08;
        if (sRb != null) {
            sgi.A0C(sRb);
        }
        this.A0D.A09(this);
        this.A0E.A09(this);
        for (int i3 = 0; i3 < list.size(); i3++) {
            ((C11388SRb) this.A09.get(i3)).A09(this);
        }
        C11388SRb sRb2 = this.A08;
        if (sRb2 != null) {
            sRb2.A09(this);
        }
        C10157RnY A082 = sgi.A08();
        if (A082 != null) {
            QGR A003 = C11802Sgo.A00(A082.A00);
            this.A01 = A003;
            A003.A09(this);
            sgi.A0C(this.A01);
        }
        C10723Rx1 A092 = sgi.A09();
        if (A092 != null) {
            this.A03 = new C11792Sge(this, sgi, A092);
        }
    }

    public final void ESm(List list, List list2) {
        C10352Rqp rqp = null;
        C11783SgV sgV = null;
        for (int A062 = C51966G9m.A06(list); A062 >= 0; A062--) {
            C13687Tf4 tf4 = (C13687Tf4) list.get(A062);
            if (tf4 instanceof C11783SgV) {
                C11783SgV sgV2 = (C11783SgV) tf4;
                if (sgV2.A03 == AnonymousClass05K.A01) {
                    sgV = sgV2;
                }
            }
        }
        if (sgV != null) {
            sgV.A04.add(this);
        }
        for (int A063 = C51966G9m.A06(list2); A063 >= 0; A063--) {
            C13687Tf4 tf42 = (C13687Tf4) list2.get(A063);
            if (tf42 instanceof C11783SgV) {
                C11783SgV sgV3 = (C11783SgV) tf42;
                if (sgV3.A03 == AnonymousClass05K.A01) {
                    if (rqp != null) {
                        this.A0F.add(rqp);
                    }
                    rqp = new C10352Rqp(sgV3);
                    sgV3.A04.add(this);
                }
            }
            if (tf42 instanceof C13913TlF) {
                if (rqp == null) {
                    rqp = new C10352Rqp(sgV);
                }
                rqp.A01.add(tf42);
            }
        }
        if (rqp != null) {
            this.A0F.add(rqp);
        }
    }

    public final void EIb(SPM spm, SPM spm2, List list, int i) {
        SQL.A02(this, spm, spm2, list, i);
    }
}
