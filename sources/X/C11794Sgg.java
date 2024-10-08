package X;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.List;

/* renamed from: X.Sgg  reason: case insensitive filesystem */
public final class C11794Sgg implements C13518Tbn, C13912TlE, C13914TlG {
    public float A00;
    public C11388SRb A01;
    public C11388SRb A02;
    public C11792Sge A03;
    public final Paint A04;
    public final Path A05;
    public final Q6Y A06;
    public final C11388SRb A07;
    public final C11388SRb A08;
    public final C11796Sgi A09;
    public final String A0A;
    public final List A0B = AnonymousClass7TE.A1C();
    public final boolean A0C;

    public final void ESm(List list, List list2) {
        for (int i = 0; i < list2.size(); i++) {
            Object obj = list2.get(i);
            if (obj instanceof C13913TlF) {
                this.A0B.add(obj);
            }
        }
    }

    public final void AAd(SIR sir, Object obj) {
        C11796Sgi sgi;
        C11388SRb sRb;
        C11792Sge sge;
        C11388SRb sRb2;
        C11792Sge sge2;
        C11792Sge sge3;
        C11792Sge sge4;
        C11792Sge sge5;
        if (obj == C13881Tj4.A0a) {
            sRb2 = this.A07;
        } else if (obj == C13881Tj4.A0c) {
            sRb2 = this.A08;
        } else {
            if (obj == C13881Tj4.A01) {
                C11388SRb sRb3 = this.A02;
                if (sRb3 != null) {
                    this.A09.A0M.remove(sRb3);
                }
                if (sir == null) {
                    this.A02 = null;
                    return;
                }
                QGN A002 = QGN.A00(sir);
                this.A02 = A002;
                A002.A09(this);
                sgi = this.A09;
                sRb = this.A02;
            } else if (obj == C13881Tj4.A0B) {
                sRb2 = this.A01;
                if (sRb2 == null) {
                    QGN A003 = QGN.A00(sir);
                    this.A01 = A003;
                    A003.A09(this);
                    sgi = this.A09;
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

    public final void AQI(Canvas canvas, Matrix matrix, int i) {
        BlurMaskFilter blurMaskFilter;
        if (!this.A0C) {
            QGP qgp = (QGP) this.A07;
            int A0B2 = qgp.A0B(qgp.A06.Au7(), qgp.A04());
            Paint paint = this.A04;
            int i2 = 0;
            PointF pointF = SQL.A00;
            paint.setColor((Pxf.A01(255, (int) ((((((float) i) / 255.0f) * ((float) AnonymousClass7TE.A0M(this.A08.A06()))) / 100.0f) * 255.0f), 0) << 24) | (A0B2 & 16777215));
            Pxj.A15(paint, this.A02);
            C11388SRb sRb = this.A01;
            if (sRb != null) {
                float A012 = C11388SRb.A01(sRb);
                if (A012 == 0.0f) {
                    blurMaskFilter = null;
                } else {
                    if (A012 != this.A00) {
                        C11796Sgi sgi = this.A09;
                        if (sgi.A00 == A012) {
                            blurMaskFilter = sgi.A01;
                        } else {
                            blurMaskFilter = new BlurMaskFilter(A012 / 2.0f, BlurMaskFilter.Blur.NORMAL);
                            sgi.A01 = blurMaskFilter;
                            sgi.A00 = A012;
                        }
                    }
                    this.A00 = A012;
                }
                paint.setMaskFilter(blurMaskFilter);
                this.A00 = A012;
            }
            C11792Sge sge = this.A03;
            if (sge != null) {
                sge.A00(paint);
            }
            Path path = this.A05;
            path.reset();
            while (true) {
                List list = this.A0B;
                if (i2 < list.size()) {
                    C13913TlF.A00(matrix, path, list, i2);
                    i2++;
                } else {
                    canvas.drawPath(path, paint);
                    return;
                }
            }
        }
    }

    public final void Aha(Matrix matrix, RectF rectF, boolean z) {
        Path path = this.A05;
        path.reset();
        int i = 0;
        while (true) {
            List list = this.A0B;
            if (i < list.size()) {
                C13913TlF.A00(matrix, path, list, i);
                i++;
            } else {
                path.computeBounds(rectF, false);
                Pxj.A16(rectF, rectF.left, 1.0f);
                return;
            }
        }
    }

    public final void Dwx() {
        this.A06.invalidateSelf();
    }

    public final String getName() {
        return this.A0A;
    }

    public C11794Sgg(Q6Y q6y, C11815Sh1 sh1, C11796Sgi sgi) {
        Integer num;
        Path A0C2 = C51965G9l.A0C();
        this.A05 = A0C2;
        Paint paint = new Paint(1);
        this.A04 = paint;
        this.A09 = sgi;
        this.A0A = sh1.A03;
        this.A0C = sh1.A04;
        this.A06 = q6y;
        C10157RnY A082 = sgi.A08();
        if (A082 != null) {
            QGR A002 = C11802Sgo.A00(A082.A00);
            this.A01 = A002;
            A002.A09(this);
            sgi.A0C(this.A01);
        }
        C10723Rx1 A092 = sgi.A09();
        if (A092 != null) {
            this.A03 = new C11792Sge(this, sgi, A092);
        }
        QGX qgx = sh1.A01;
        if (qgx != null) {
            C7487QGa qGa = sh1.A02;
            int intValue = sgi.A0L.A0G.intValue();
            if (intValue == 2) {
                num = AnonymousClass05K.A06;
            } else if (intValue == 3) {
                num = AnonymousClass05K.A07;
            } else if (intValue == 4) {
                num = AnonymousClass05K.A08;
            } else if (intValue == 5) {
                num = AnonymousClass05K.A09;
            } else if (intValue != 16) {
                num = null;
            } else {
                num = AnonymousClass05K.A04;
            }
            C11113SAq.A00(paint, num);
            A0C2.setFillType(sh1.A00);
            C11388SRb sRb = new C11388SRb(qgx.A00);
            this.A07 = sRb;
            sRb.A09(this);
            sgi.A0C(sRb);
            C11388SRb sRb2 = new C11388SRb(qGa.A00);
            this.A08 = sRb2;
            sRb2.A09(this);
            sgi.A0C(sRb2);
            return;
        }
        this.A07 = null;
        this.A08 = null;
    }

    public final void EIb(SPM spm, SPM spm2, List list, int i) {
        SQL.A02(this, spm, spm2, list, i);
    }
}
