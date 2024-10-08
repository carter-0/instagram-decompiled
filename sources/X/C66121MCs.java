package X;

import com.facebook.msys.mcf.MsysError;

/* renamed from: X.MCs  reason: case insensitive filesystem */
public final class C66121MCs extends RuntimeException {
    public final MsysError A00;
    public final boolean A01;

    public C66121MCs(MsysError msysError, boolean z) {
        this.A00 = msysError;
        this.A01 = z;
    }
}
