package X;

import android.media.CamcorderProfile;
import java.io.File;

/* renamed from: X.7mj  reason: invalid class name and case insensitive filesystem */
public final class C341347mj implements C341337mi {
    public C341047mF A00;
    public B2T A01;
    public C21986Xoh A02;
    public C341827na A03;
    public boolean A04;

    public final void ARW(boolean z) {
    }

    public final void Exp(B2T b2t, LOF lof) {
        File file;
        try {
            this.A04 = true;
            this.A01 = b2t;
            C341827na CEH = this.A00.CEH();
            CEH.getClass();
            this.A03 = CEH;
            CamcorderProfile camcorderProfile = CamcorderProfile.get(1);
            camcorderProfile.getClass();
            Object A002 = lof.A00(LOF.A09);
            if (A002 == null && (file = (File) lof.A00(LOF.A07)) != null) {
                A002 = file.getAbsolutePath();
            }
            A002.getClass();
            C21986Xoh Exn = CEH.Exn(camcorderProfile, (C342077o0) null, (String) A002, (String) null, 0, 0, false, true, false);
            this.A02 = Exn;
            b2t.DxC(Exn);
        } catch (Exception e) {
            b2t.DxB(e);
            this.A01 = null;
            this.A02 = null;
            this.A03 = null;
            this.A04 = false;
        }
    }

    public final void CMZ(C343837qt r2) {
        this.A00 = ((C344397rn) r2.Ape(C344397rn.A00)).C3L();
    }

    public final boolean CaT() {
        return this.A04;
    }

    public final void EyQ() {
        B2T b2t = this.A01;
        if (this.A04) {
            try {
                C341827na r0 = this.A03;
                r0.getClass();
                r0.EyQ();
                if (b2t != null) {
                    C21986Xoh xoh = this.A02;
                    xoh.getClass();
                    b2t.DxD(xoh);
                }
            } catch (Exception e) {
                if (b2t != null) {
                    b2t.DxB(e);
                }
            } catch (Throwable th) {
                this.A01 = null;
                this.A02 = null;
                this.A03 = null;
                this.A04 = false;
                throw th;
            }
            this.A01 = null;
            this.A02 = null;
            this.A03 = null;
            this.A04 = false;
        }
    }

    public final void release() {
        EyQ();
    }
}
