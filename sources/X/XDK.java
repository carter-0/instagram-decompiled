package X;

import com.google.android.exoplayer2.util.Util;
import java.util.Map;
import java.util.UUID;

public final class XDK implements AnonymousClass4TD, C265384Tq {
    public final int A00;
    public final /* synthetic */ XDJ A01;

    public XDK(XDJ xdj, int i) {
        this.A01 = xdj;
        this.A00 = i;
    }

    public final long C96(int i) {
        XDJ xdj = this.A01;
        Map map = XDJ.A0d;
        AnonymousClass4YO r0 = xdj.A05;
        if (r0 == null) {
            return -9223372036854775807L;
        }
        long C9E = r0.C9E(i);
        UUID uuid = AnonymousClass4T7.A04;
        return Util.A08(C9E);
    }

    public final boolean CaO() {
        XDJ xdj = this.A01;
        int i = this.A00;
        if (xdj.A0C || XDJ.A05(xdj) || !xdj.A0H[i].A0E(xdj.A0B)) {
            return false;
        }
        return true;
    }

    public final void Cnj() {
        XDJ xdj = this.A01;
        xdj.A0H[this.A00].A07();
        xdj.A06();
    }

    public final int E6J(AnonymousClass4PO r6, AnonymousClass4PQ r7, int i) {
        XDJ xdj = this.A01;
        int i2 = this.A00;
        if (xdj.A0C || XDJ.A05(xdj)) {
            return -3;
        }
        XDJ.A03(xdj, i2);
        int A04 = xdj.A0H[i2].A04(r6, r7, i, xdj.A0B);
        if (A04 == -3) {
            XDJ.A04(xdj, i2);
        }
        return A04;
    }

    public final int Evj(long j) {
        XDJ xdj = this.A01;
        int i = this.A00;
        if (xdj.A0C || XDJ.A05(xdj)) {
            return 0;
        }
        XDJ.A03(xdj, i);
        C265984Xc r1 = xdj.A0H[i];
        int A03 = r1.A03(j, xdj.A0B);
        r1.A0A(A03);
        if (A03 == 0) {
            XDJ.A04(xdj, i);
        }
        return A03;
    }
}
