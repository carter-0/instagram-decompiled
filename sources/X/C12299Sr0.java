package X;

import android.graphics.RectF;
import android.net.Uri;
import android.opengl.Matrix;
import java.nio.FloatBuffer;

/* renamed from: X.Sr0  reason: case insensitive filesystem */
public final class C12299Sr0 implements C361868gx {
    public C10682RwM A00;
    public boolean A01 = false;
    public final Sr2 A02;

    public final void EOi(C13586TdE tdE) {
    }

    @Deprecated
    public final boolean EtX() {
        return false;
    }

    public final Integer BHb() {
        return AnonymousClass05K.A0N;
    }

    public final boolean DAo(C368538so r20, long j) {
        Uri A03;
        C368538so r2 = r20;
        if (!this.A01) {
            C10682RwM rwM = this.A00;
            float[] fArr = new float[4];
            Matrix.multiplyMV(fArr, 0, r2.A02, 0, new float[]{-1.0f, 1.0f, 0.0f, 0.0f}, 0);
            float f = fArr[1];
            float[] fArr2 = new float[4];
            Matrix.multiplyMV(fArr2, 0, r2.A02, 0, new float[]{-1.0f, 1.0f, 0.0f, 0.0f}, 0);
            float f2 = fArr2[1];
            float A002 = ((1.0f - f) / AnonymousClass7TE.A00(1.0f, -1.0f)) + (0.0f * f2);
            float f3 = (rwM.A00 * f2) + A002;
            float A003 = AnonymousClass7TE.A00(1.0f, -1.0f);
            float f4 = ((0.0f * A003) - 4.0f) + 0.0f;
            float f5 = ((1.0f - A002) * A003) - 4.0f;
            float f6 = (((0.0f + 1.0f) * A003) - 4.0f) + 0.0f;
            float f7 = ((1.0f - f3) * A003) - 4.0f;
            Sr2 sr2 = this.A02;
            String str = rwM.A02;
            if (str == null) {
                A03 = null;
            } else {
                A03 = 0cp.A03(str);
            }
            Uri uri = sr2.A03;
            if (uri == null || !uri.equals(A03)) {
                Sr2.A00(sr2, DbW.A1a(A03));
                sr2.A08.A00 = A03;
                sr2.A03 = A03;
            }
            float[] fArr3 = C9954Rk9.A00;
            fArr3[0] = f4;
            fArr3[1] = f7;
            fArr3[2] = f6;
            fArr3[3] = f7;
            fArr3[4] = f4;
            fArr3[5] = f5;
            fArr3[6] = f6;
            fArr3[7] = f5;
            sr2.A08.A02 = fArr3;
            FloatBuffer floatBuffer = sr2.A0G.A01;
            floatBuffer.put(fArr3);
            floatBuffer.position(0);
            this.A01 = true;
        }
        return this.A02.DAo(r2, j);
    }

    public final void DpY(C345557ti r2) {
        this.A02.DpY(r2);
    }

    public final void DpZ(RectF rectF) {
        this.A02.DpZ(rectF);
    }

    public final void Dpb() {
        this.A02.Dpb();
    }

    public final boolean isEnabled() {
        return this.A02.isEnabled();
    }

    public C12299Sr0(C13724Tfu tfu, C10682RwM rwM) {
        Uri uri;
        String str;
        if (rwM == null || (str = rwM.A02) == null) {
            uri = null;
        } else {
            uri = 0cp.A03(str);
        }
        Sr2 sr2 = new Sr2(uri, tfu);
        this.A02 = sr2;
        if (rwM == null) {
            Uri uri2 = sr2.A03;
            if (uri2 == null || !uri2.equals((Object) null)) {
                Sr2.A00(sr2, true);
                sr2.A08.A00 = null;
                sr2.A03 = null;
                return;
            }
            return;
        }
        this.A00 = rwM;
    }

    public final void DpU(int i, int i2) {
    }
}
