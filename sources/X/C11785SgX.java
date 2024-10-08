package X;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.List;

/* renamed from: X.SgX  reason: case insensitive filesystem */
public final class C11785SgX implements C13913TlF, C13518Tbn, C13912TlE, C13517Tbm, C13914TlG {
    public C11790Sgc A00;
    public final Matrix A01 = AnonymousClass7TE.A0U();
    public final Path A02 = C51965G9l.A0C();
    public final Q6Y A03;
    public final C11388SRb A04;
    public final C11388SRb A05;
    public final S7O A06;
    public final C11796Sgi A07;
    public final String A08;
    public final boolean A09;

    /* JADX WARNING: Removed duplicated region for block: B:3:0x0005 A[LOOP:0: B:3:0x0005->B:6:0x000f, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A6y(java.util.ListIterator r8) {
        /*
            r7 = this;
            X.Sgc r0 = r7.A00
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            boolean r0 = r8.hasPrevious()
            if (r0 == 0) goto L_0x0012
            java.lang.Object r0 = r8.previous()
            if (r0 == r7) goto L_0x0012
            goto L_0x0005
        L_0x0012:
            java.util.ArrayList r5 = X.AnonymousClass7TE.A1C()
        L_0x0016:
            boolean r0 = r8.hasPrevious()
            if (r0 == 0) goto L_0x0027
            java.lang.Object r0 = r8.previous()
            r5.add(r0)
            r8.remove()
            goto L_0x0016
        L_0x0027:
            java.util.Collections.reverse(r5)
            X.Q6Y r1 = r7.A03
            X.Sgi r3 = r7.A07
            boolean r6 = r7.A09
            r2 = 0
            java.lang.String r4 = "Repeater"
            X.Sgc r0 = new X.Sgc
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.A00 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11785SgX.A6y(java.util.ListIterator):void");
    }

    public final void AAd(SIR sir, Object obj) {
        C11388SRb sRb;
        if (!this.A06.A04(sir, obj)) {
            if (obj == C13881Tj4.A0N) {
                sRb = this.A04;
            } else if (obj == C13881Tj4.A0O) {
                sRb = this.A05;
            } else {
                return;
            }
            sRb.A0A(sir);
        }
    }

    public final void AQI(Canvas canvas, Matrix matrix, int i) {
        float A012 = C11388SRb.A01(this.A04);
        float A013 = C11388SRb.A01(this.A05);
        S7O s7o = this.A06;
        float A014 = C11388SRb.A01(s7o.A06) / 100.0f;
        float A015 = C11388SRb.A01(s7o.A01) / 100.0f;
        int i2 = (int) A012;
        while (true) {
            i2--;
            if (i2 >= 0) {
                Matrix matrix2 = this.A01;
                matrix2.set(matrix);
                float f = (float) i2;
                matrix2.preConcat(s7o.A01(f + A013));
                this.A00.AQI(canvas, matrix2, (int) (((float) i) * Pxh.A00(A015, A014, f / A012)));
            } else {
                return;
            }
        }
    }

    public final void Aha(Matrix matrix, RectF rectF, boolean z) {
        this.A00.Aha(matrix, rectF, z);
    }

    public final Path Bar() {
        Path Bar = this.A00.Bar();
        Path path = this.A02;
        path.reset();
        float A012 = C11388SRb.A01(this.A04);
        float A013 = C11388SRb.A01(this.A05);
        int i = (int) A012;
        while (true) {
            i--;
            if (i < 0) {
                return path;
            }
            Matrix matrix = this.A01;
            matrix.set(this.A06.A01(((float) i) + A013));
            path.addPath(Bar, matrix);
        }
    }

    public final void Dwx() {
        this.A03.invalidateSelf();
    }

    public final void ESm(List list, List list2) {
        this.A00.ESm(list, list2);
    }

    public final String getName() {
        return this.A08;
    }

    public C11785SgX(Q6Y q6y, C11805Sgr sgr, C11796Sgi sgi) {
        this.A03 = q6y;
        this.A07 = sgi;
        this.A08 = sgr.A03;
        this.A09 = sgr.A04;
        QGR A002 = C11802Sgo.A00(sgr.A00);
        this.A04 = A002;
        sgi.A0C(A002);
        A002.A09(this);
        QGR A003 = C11802Sgo.A00(sgr.A01);
        this.A05 = A003;
        sgi.A0C(A003);
        A003.A09(this);
        S7O s7o = new S7O(sgr.A02);
        this.A06 = s7o;
        s7o.A03(sgi);
        s7o.A02(this);
    }

    public final void EIb(SPM spm, SPM spm2, List list, int i) {
        SQL.A02(this, spm, spm2, list, i);
        for (int i2 = 0; i2 < this.A00.A04.size(); i2++) {
            C13687Tf4 tf4 = (C13687Tf4) this.A00.A04.get(i2);
            if (tf4 instanceof C13914TlG) {
                SQL.A02((C13914TlG) tf4, spm, spm2, list, i);
            }
        }
    }
}
