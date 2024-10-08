package X;

import android.graphics.Bitmap;
import android.graphics.Matrix;

/* renamed from: X.AXo  reason: case insensitive filesystem */
public final class C40250AXo implements AnonymousClass1MK {
    public final int A00;
    public final Object A01;

    public C40250AXo(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void CyF(C226952iF r9, AnonymousClass3LX r10) {
        int i;
        if (this.A00 != 0) {
            0qQ.A0B(r10, 1);
            Bitmap bitmap = r10.A01;
            if (bitmap != null) {
                C386069k0 r6 = (C386069k0) this.A01;
                int i2 = r6.A02;
                Float f = r6.A05;
                if (f != null) {
                    i = (int) f.floatValue();
                } else {
                    i = 0;
                }
                Bitmap A002 = 0fO.A00(bitmap, i2, i, true);
                if (A002 != null) {
                    C59985Jcu jcu = new C59985Jcu(A002, (Matrix) null, 0nA.A04(r6.A03, 12), 12);
                    jcu.setBounds(0, 0, A002.getWidth(), A002.getHeight());
                    r6.A01 = jcu;
                    r6.A00 = A002.getHeight();
                    return;
                }
                return;
            }
            return;
        }
        0qQ.A0B(r10, 1);
        Bitmap bitmap2 = r10.A01;
        if (bitmap2 != null) {
            C317876nz r62 = C317876nz.A1O;
            C39890ADo A003 = C39890ADo.A00();
            A003.A00 = 1.5f;
            A003.A01 = 0.3f;
            A003.A0Q = false;
            A003.A0F = false;
            A77 a77 = (A77) this.A01;
            C3498882g r0 = a77.A01;
            AnonymousClass9XO r3 = new AnonymousClass9XO(bitmap2, a77.A02, r0.A01, r0.A02);
            a77.A04.invoke(A003, r3, r62);
            a77.A00.A01(new C40328AaN(2, (Object) r3, (Object) a77));
        }
    }

    public final void DJx(C226952iF r1, C254673sr r2) {
    }

    public final void DK4(C226952iF r1, int i) {
    }
}
