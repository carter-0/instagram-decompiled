package X;

import android.graphics.Path;
import android.graphics.PointF;
import java.util.List;

/* renamed from: X.SgZ  reason: case insensitive filesystem */
public final class C11787SgZ implements C13913TlF, C13518Tbn, C13914TlG {
    public boolean A00;
    public final Q6Y A01;
    public final Path A02 = C51965G9l.A0C();
    public final S05 A03 = new S05();
    public final C11388SRb A04;
    public final C11388SRb A05;
    public final C11804Sgq A06;
    public final String A07;

    public final void Dwx() {
        this.A00 = false;
        this.A01.invalidateSelf();
    }

    public final void ESm(List list, List list2) {
        for (int i = 0; i < list.size(); i++) {
            C13687Tf4 tf4 = (C13687Tf4) list.get(i);
            if (tf4 instanceof C11783SgV) {
                C11783SgV sgV = (C11783SgV) tf4;
                if (sgV.A03 == AnonymousClass05K.A00) {
                    this.A03.A00.add(sgV);
                    sgV.A04.add(this);
                }
            }
        }
    }

    public final void AAd(SIR sir, Object obj) {
        C11388SRb sRb;
        if (obj == C13881Tj4.A03) {
            sRb = this.A05;
        } else if (obj == C13881Tj4.A04) {
            sRb = this.A04;
        } else {
            return;
        }
        sRb.A0A(sir);
    }

    public final Path Bar() {
        boolean z = this.A00;
        Path path = this.A02;
        if (!z) {
            path.reset();
            C11804Sgq sgq = this.A06;
            if (!sgq.A03) {
                PointF A032 = C11388SRb.A03(this.A05);
                float f = A032.x / 2.0f;
                float f2 = A032.y / 2.0f;
                float f3 = f * 0.55228f;
                float f4 = 0.55228f * f2;
                path.reset();
                if (sgq.A04) {
                    float f5 = -f2;
                    path.moveTo(0.0f, f5);
                    float f6 = 0.0f - f3;
                    float f7 = -f;
                    float f8 = 0.0f - f4;
                    path.cubicTo(f6, f5, f7, f8, f7, 0.0f);
                    float f9 = f4 + 0.0f;
                    Path path2 = path;
                    path2.cubicTo(f7, f9, f6, f2, 0.0f, f2);
                    float f10 = f3 + 0.0f;
                    path.cubicTo(f10, f2, f, f9, f, 0.0f);
                    path2.cubicTo(f, f8, f10, f5, 0.0f, f5);
                } else {
                    float f11 = -f2;
                    path.moveTo(0.0f, f11);
                    float f12 = f3 + 0.0f;
                    float f13 = 0.0f - f4;
                    path.cubicTo(f12, f11, f, f13, f, 0.0f);
                    float f14 = f4 + 0.0f;
                    path.cubicTo(f, f14, f12, f2, 0.0f, f2);
                    float f15 = 0.0f - f3;
                    float f16 = -f;
                    path.cubicTo(f15, f2, f16, f14, f16, 0.0f);
                    path.cubicTo(f16, f13, f15, f11, 0.0f, f11);
                }
                PointF A033 = C11388SRb.A03(this.A04);
                path.offset(A033.x, A033.y);
                path.close();
                this.A03.A00(path);
            }
            this.A00 = true;
        }
        return path;
    }

    public final String getName() {
        return this.A07;
    }

    public C11787SgZ(Q6Y q6y, C11804Sgq sgq, C11796Sgi sgi) {
        this.A07 = sgq.A02;
        this.A01 = q6y;
        QGV qgv = new QGV(sgq.A00.A00);
        this.A05 = qgv;
        C11388SRb ALS = sgq.A01.ALS();
        this.A04 = ALS;
        this.A06 = sgq;
        sgi.A0C(qgv);
        sgi.A0C(ALS);
        qgv.A09(this);
        ALS.A09(this);
    }

    public final void EIb(SPM spm, SPM spm2, List list, int i) {
        SQL.A02(this, spm, spm2, list, i);
    }
}
