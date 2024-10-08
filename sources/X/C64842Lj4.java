package X;

import java.io.IOException;

/* renamed from: X.Lj4  reason: case insensitive filesystem */
public final class C64842Lj4 implements 1NU {
    public final 15p A00;
    public final C66431MRl A01;

    public final 1XR A00(2ZL r5) {
        IOException iOException;
        0qQ.A0B(r5, 0);
        16F r3 = null;
        1Qb A002 = r5.A00();
        if (A002 != null) {
            try {
                16F A012 = this.A00.A01(A002.AjD());
                A012.A1J();
                if (A012.A11() != null) {
                    1XR E1s = this.A01.E1s(A012);
                    E1s.setStatusCode(r5.A02);
                    try {
                        A012.close();
                    } catch (IOException unused) {
                    }
                    A002.AI7();
                    return E1s;
                }
                iOException = JTO.A0u(C273654mx.A00(1362));
            } catch (Throwable th) {
                if (r3 != null) {
                    try {
                        r3.close();
                    } catch (IOException unused2) {
                    }
                }
                if (A002 != null) {
                    A002.AI7();
                }
                throw th;
            }
        } else {
            iOException = JTO.A0u("Response body is missing");
        }
        throw iOException;
    }

    public final /* bridge */ /* synthetic */ Object then(Object obj) {
        2ZL r2 = (2ZL) obj;
        0qQ.A0B(r2, 0);
        return A00(r2);
    }

    public C64842Lj4(15p r1, C66431MRl mRl) {
        this.A01 = mRl;
        this.A00 = r1;
    }
}
