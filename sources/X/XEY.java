package X;

import android.net.Uri;
import android.os.Looper;
import com.google.android.exoplayer2.Timeline;
import java.util.Map;

public final class XEY extends C265154St implements Y9T {
    public long A00 = -9223372036854775807L;
    public C250823m7 A01;
    public boolean A02;
    public boolean A03 = true;
    public boolean A04;
    public final AnonymousClass4RK A05;
    public final AnonymousClass4RL A06;
    public final C265114Sp A07;
    public final C22529Y8a A08;
    public final AnonymousClass4SX A09;
    public final C265084Sm A0A;

    public final void A0D() {
    }

    public final AnonymousClass4TH AMb(C264874Rq r14, AnonymousClass4QW r15, long j) {
        C257113ws ALo = this.A09.ALo();
        C250823m7 r0 = this.A01;
        if (r0 != null) {
            ALo.addTransferListener(r0);
        }
        Map map = XDJ.A0d;
        AnonymousClass4RK r2 = this.A05;
        Uri uri = r2.A00;
        C22529Y8a y8a = this.A08;
        C264894Rs r02 = C264894Rs.A03;
        XEZ xez = new XEZ(((C21094XEi) y8a).A00);
        C265114Sp r5 = this.A07;
        return new XDJ(uri, new C265184Sw(r14, this.A03.A02, 0), r5, A09(r14), xez, this, r15, ALo, this.A0A, r2.A03);
    }

    public final void Cnl() {
    }

    private void A00() {
        Timeline r1 = new C295955pB(this.A06, this.A00, this.A04, this.A02);
        if (this.A03) {
            r1 = new C21095XEj(r1, this);
        }
        A0C(r1);
    }

    public final void A0E(C250823m7 r4) {
        this.A01 = r4;
        C265114Sp r2 = this.A07;
        r2.E3m();
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        C264894Rs r0 = this.A00;
        C256703wD.A01(r0);
        r2.Eg4(myLooper, r0);
        A00();
    }

    public final void ECj(AnonymousClass4TH r5) {
        XDJ xdj = (XDJ) r5;
        if (xdj.A0E) {
            for (C265984Xc A082 : xdj.A0H) {
                A082.A08();
            }
        }
        xdj.A0S.A03(xdj);
        xdj.A0L.removeCallbacksAndMessages((Object) null);
        xdj.A06 = null;
        xdj.A0F = true;
    }

    public XEY(AnonymousClass4RL r3, C265114Sp r4, C22529Y8a y8a, AnonymousClass4SX r6, C265084Sm r7) {
        AnonymousClass4RK r0 = r3.A03;
        r0.getClass();
        this.A05 = r0;
        this.A06 = r3;
        this.A09 = r6;
        this.A08 = y8a;
        this.A07 = r4;
        this.A0A = r7;
    }

    public final AnonymousClass4RL BQS() {
        return this.A06;
    }

    public final void Dlp(long j, boolean z, boolean z2) {
        if (j == -9223372036854775807L) {
            j = this.A00;
        }
        if (this.A03 || this.A00 != j || this.A04 != z || this.A02 != z2) {
            this.A00 = j;
            this.A04 = z;
            this.A02 = z2;
            this.A03 = false;
            A00();
        }
    }
}
