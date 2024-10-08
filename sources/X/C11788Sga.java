package X;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.List;

/* renamed from: X.Sga  reason: case insensitive filesystem */
public final class C11788Sga implements C13913TlF, C13518Tbn, C13914TlG {
    public boolean A00;
    public C11388SRb A01 = null;
    public final Q6Y A02;
    public final Path A03 = C51965G9l.A0C();
    public final RectF A04 = AnonymousClass7TE.A0Y();
    public final S05 A05 = new S05();
    public final C11388SRb A06;
    public final C11388SRb A07;
    public final C11388SRb A08;
    public final String A09;
    public final boolean A0A;

    public final void Dwx() {
        this.A00 = false;
        this.A02.invalidateSelf();
    }

    public final void ESm(List list, List list2) {
        for (int i = 0; i < list.size(); i++) {
            C13687Tf4 tf4 = (C13687Tf4) list.get(i);
            if (tf4 instanceof C11783SgV) {
                C11783SgV sgV = (C11783SgV) tf4;
                if (sgV.A03 == AnonymousClass05K.A00) {
                    this.A05.A00.add(sgV);
                    sgV.A04.add(this);
                }
            }
            if (tf4 instanceof C11782SgU) {
                this.A01 = ((C11782SgU) tf4).A01;
            }
        }
    }

    public final void AAd(SIR sir, Object obj) {
        C11388SRb sRb;
        if (obj == C13881Tj4.A05) {
            sRb = this.A08;
        } else if (obj == C13881Tj4.A04) {
            sRb = this.A07;
        } else if (obj == C13881Tj4.A0C) {
            sRb = this.A06;
        } else {
            return;
        }
        sRb.A0A(sir);
    }

    public final Path Bar() {
        C11388SRb sRb;
        boolean z = this.A00;
        Path path = this.A03;
        if (!z) {
            path.reset();
            if (!this.A0A) {
                PointF A032 = C11388SRb.A03(this.A08);
                float f = A032.x / 2.0f;
                float f2 = A032.y / 2.0f;
                float A0B = ((QGR) this.A06).A0B();
                if (A0B == 0.0f && (sRb = this.A01) != null) {
                    A0B = Math.min(C11388SRb.A01(sRb), Math.min(f, f2));
                }
                float min = Math.min(f, f2);
                if (A0B > min) {
                    A0B = min;
                }
                PointF A033 = C11388SRb.A03(this.A07);
                path.moveTo(A033.x + f, (A033.y - f2) + A0B);
                path.lineTo(A033.x + f, (A033.y + f2) - A0B);
                if (A0B > 0.0f) {
                    RectF rectF = this.A04;
                    float f3 = A033.x + f;
                    float f4 = A0B * 2.0f;
                    float f5 = A033.y + f2;
                    rectF.set(f3 - f4, f5 - f4, f3, f5);
                    path.arcTo(rectF, 0.0f, 90.0f, false);
                }
                path.lineTo((A033.x - f) + A0B, A033.y + f2);
                if (A0B > 0.0f) {
                    RectF rectF2 = this.A04;
                    float f6 = A033.x - f;
                    float f7 = A033.y + f2;
                    float f8 = A0B * 2.0f;
                    rectF2.set(f6, f7 - f8, f8 + f6, f7);
                    path.arcTo(rectF2, 90.0f, 90.0f, false);
                }
                path.lineTo(A033.x - f, (A033.y - f2) + A0B);
                if (A0B > 0.0f) {
                    RectF rectF3 = this.A04;
                    float f9 = A033.x - f;
                    float f10 = A033.y - f2;
                    float f11 = A0B * 2.0f;
                    rectF3.set(f9, f10, f9 + f11, f11 + f10);
                    path.arcTo(rectF3, 180.0f, 90.0f, false);
                }
                path.lineTo((A033.x + f) - A0B, A033.y - f2);
                if (A0B > 0.0f) {
                    RectF rectF4 = this.A04;
                    float f12 = A033.x + f;
                    float f13 = A0B * 2.0f;
                    float f14 = A033.y - f2;
                    rectF4.set(f12 - f13, f14, f12, f14 + f13);
                    path.arcTo(rectF4, 270.0f, 90.0f, false);
                }
                path.close();
                this.A05.A00(path);
            }
            this.A00 = true;
        }
        return path;
    }

    public final String getName() {
        return this.A09;
    }

    public C11788Sga(Q6Y q6y, C11813Sgz sgz, C11796Sgi sgi) {
        this.A09 = sgz.A03;
        this.A0A = sgz.A04;
        this.A02 = q6y;
        C11388SRb ALS = sgz.A01.ALS();
        this.A07 = ALS;
        C11388SRb ALS2 = sgz.A02.ALS();
        this.A08 = ALS2;
        QGR A002 = C11802Sgo.A00(sgz.A00);
        this.A06 = A002;
        sgi.A0C(ALS);
        sgi.A0C(ALS2);
        sgi.A0C(A002);
        ALS.A09(this);
        ALS2.A09(this);
        A002.A09(this);
    }

    public final void EIb(SPM spm, SPM spm2, List list, int i) {
        SQL.A02(this, spm, spm2, list, i);
    }
}
