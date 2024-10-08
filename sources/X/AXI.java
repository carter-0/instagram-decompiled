package X;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import com.instagram.common.session.UserSession;
import java.util.HashMap;

public final class AXI implements C340307l3 {
    public C343367q6 A00;
    public int A01 = 1;
    public int A02;
    public int A03;
    public SurfaceTexture A04;
    public C340167ko A05;
    public final C340607lX A06;
    public final C344037rD A07;
    public final C340557lS A08;
    public final UserSession A09;
    public final String A0A;

    public final void A9b(B17 b17, int i) {
        this.A06.A9b(b17, 1);
    }

    public final boolean CPy() {
        try {
            return this.A06.Ajk() == 1;
        } catch (C352928Fp unused) {
            return false;
        }
    }

    public final void Dza() {
    }

    public final /* synthetic */ void EI4(Boolean bool) {
    }

    public final void EdB(boolean z) {
        this.A06.EdB(true);
    }

    public final boolean Esr() {
        return false;
    }

    public final void EyH(AnonymousClass8GD r3) {
        this.A06.E24((AnonymousClass8GD) null);
    }

    public final void AJI(AnonymousClass8GD r13, C341047mF r14, C279284yO r15) {
        this.A07.Egs(AnonymousClass7TF.A0g(this.A09));
        C340607lX r3 = this.A06;
        String str = this.A0A;
        int i = this.A01;
        C340167ko r6 = this.A05;
        r6.getClass();
        int i2 = this.A03;
        int i3 = this.A02;
        if (r14 == null) {
            r14 = new AV5(this.A04);
        }
        C342067nz r8 = new C342067nz(r14, (HashMap) null, i3, i2);
        r3.AJH((C342077o0) null, new C382579dv(1, r13, this), r6, this.A08, r8, str, i, 0);
    }

    public final C352718Eo ALQ() {
        return this.A07.ALQ();
    }

    public final void ARP(HashMap hashMap, boolean z) {
        C340607lX r3 = this.A06;
        C342757p7 r2 = new C342757p7();
        r2.A01(C342717p3.A0M, Boolean.valueOf(z));
        r2.A01(C342717p3.A02, hashMap);
        r3.CoY(new C382569du(this, 6), r2.A00());
    }

    public final C344037rD B46() {
        return this.A07;
    }

    public final void CJd(AnonymousClass8GD r2) {
        this.A06.CJd(r2);
    }

    public final void CJq(AnonymousClass8GD r2) {
        this.A06.CJq(r2);
    }

    public final boolean CJr() {
        return this.A06.CJf(1);
    }

    public final boolean CVP() {
        return this.A06.isConnected();
    }

    public final void EEJ(B17 b17) {
        this.A06.EEJ(b17);
    }

    public final void EWw(AnonymousClass8GD r3) {
        C340607lX r1 = this.A06;
        if (r1.isConnected()) {
            r1.ARl(r3);
        }
    }

    public final void EXA(boolean z) {
        C340607lX r3 = this.A06;
        C342757p7 r2 = new C342757p7();
        r2.A01(C342717p3.A0U, Boolean.valueOf(z));
        r3.CoY(new C382569du(this, 5), r2.A00());
    }

    public final void Egd(SurfaceTexture surfaceTexture, int i, int i2) {
        this.A04 = surfaceTexture;
        this.A03 = i;
        this.A02 = i2;
    }

    public final void Er8(float f) {
        C340607lX r3 = this.A06;
        if (r3.isConnected()) {
            if (AnonymousClass7TG.A1V(C342687p0.A0f, r3.AlD())) {
                int A0M = AnonymousClass7TE.A0M(r3.AlD().A01(C342687p0.A0j));
                int min = Math.min(A0M, (int) Math.max(((float) A0M) * f, (float) AnonymousClass7TE.A0M(r3.AlD().A01(C342687p0.A0l))));
                if (r3.isConnected()) {
                    r3.Er9((AnonymousClass8GD) null, min);
                }
            }
        }
    }

    public final void EzI(AnonymousClass8GD r4) {
        this.A06.EzI(new C382579dv(2, r4, this));
    }

    public final void disconnect() {
        this.A06.APU((AnonymousClass8GD) null);
    }

    public AXI(Context context, C344037rD r5, C340277l0 r6, C340557lS r7, UserSession userSession, String str) {
        this.A09 = userSession;
        this.A06 = C340587lV.A00(context.getApplicationContext(), (Handler) null, r6, false);
        this.A0A = str;
        this.A07 = r5;
        this.A08 = r7;
    }

    public final void Ej6(C340167ko r1) {
        this.A05 = r1;
    }

    public final void setInitialCameraFacing(int i) {
        this.A01 = i;
    }
}
