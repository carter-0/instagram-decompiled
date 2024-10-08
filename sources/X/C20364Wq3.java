package X;

import android.graphics.Bitmap;
import android.util.SparseArray;
import java.util.Locale;

/* renamed from: X.Wq3  reason: case insensitive filesystem */
public final class C20364Wq3 implements Runnable {
    public final X9F A00;
    public final int A01;
    public final int A02;
    public final XBU A03;
    public final /* synthetic */ VZ6 A04;

    private final boolean A00(int i, int i2) {
        C249903kY r5;
        boolean z;
        int i3 = 2;
        C249903kY r7 = null;
        if (i2 != 1) {
            try {
                VZ6 vz6 = this.A04;
                AnonymousClass1TV r3 = vz6.A03;
                XBU xbu = this.A03;
                r5 = r3.A00(vz6.A00, xbu.BIg(), xbu.BId());
                r7 = r5;
                i3 = -1;
            } catch (RuntimeException e) {
                Class<VZ6> cls = VZ6.class;
                0I2 r1 = 0I1.A00;
                if (!r1.isLoggable(5)) {
                    return false;
                }
                r1.w(cls.getSimpleName(), "Failed to create frame bitmap", e);
                return false;
            } catch (Throwable th) {
                C249903kY.A01(r7);
                throw th;
            }
        } else {
            X9F x9f = this.A00;
            XBU xbu2 = this.A03;
            r5 = x9f.Afy(i, xbu2.BIg(), xbu2.BId());
            r7 = r5;
        }
        if (C249903kY.A02(r5) && r5 != null) {
            VZ6 vz62 = this.A04;
            if (vz62.A02.A00((Bitmap) r5.A05(), i)) {
                synchronized (vz62.A01) {
                    this.A00.DGs(r5, i, i2);
                }
                z = true;
                C249903kY.A01(r5);
                if (z && i3 != -1) {
                    return A00(i, i3);
                }
            }
        }
        z = false;
        C249903kY.A01(r5);
        return z ? z : z;
    }

    public C20364Wq3(XBU xbu, X9F x9f, VZ6 vz6, int i, int i2) {
        this.A04 = vz6;
        this.A03 = xbu;
        this.A00 = x9f;
        this.A02 = i;
        this.A01 = i2;
    }

    public final void run() {
        SparseArray sparseArray;
        VZ6 vz6;
        try {
            X9F x9f = this.A00;
            int i = this.A02;
            if (x9f.contains(i)) {
                sparseArray = this.A04.A01;
                synchronized (sparseArray) {
                    sparseArray.remove(this.A01);
                }
            } else {
                if (A00(i, 1)) {
                    vz6 = this.A04;
                } else {
                    vz6 = this.A04;
                    Class<VZ6> cls = VZ6.class;
                    Object[] objArr = {Integer.valueOf(i)};
                    0I2 r2 = 0I1.A00;
                    if (r2.isLoggable(6)) {
                        r2.e(cls.getSimpleName(), String.format((Locale) null, "Could not prepare frame %d.", objArr));
                    }
                }
                sparseArray = vz6.A01;
                synchronized (sparseArray) {
                    sparseArray.remove(this.A01);
                }
            }
        } catch (Throwable th) {
            SparseArray sparseArray2 = this.A04.A01;
            synchronized (sparseArray2) {
                sparseArray2.remove(this.A01);
                throw th;
            }
        }
    }
}
