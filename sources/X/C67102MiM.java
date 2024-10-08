package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.concurrent.TimeUnit;

/* renamed from: X.MiM  reason: case insensitive filesystem */
public final class C67102MiM implements C74565PxE {
    public final Context A00;
    public final AnonymousClass1aS A01 = 1aF.A00();
    public final UserSession A02;
    public final AnonymousClass1aS A03;
    public final AnonymousClass1aS A04;
    public final AnonymousClass1aS A05;
    public final AnonymousClass1aS A06;
    public final AnonymousClass1aS A07 = 1aF.A01(C60340gF.A00);
    public final 1aU A08;
    public final C269794fh A09;
    public final 1a8 A0A;

    public C67102MiM(Context context, 1aU r5, C269794fh r6, UserSession userSession, 2EM r8) {
        0qQ.A0B(r5, 4);
        this.A00 = context;
        this.A02 = userSession;
        this.A09 = r6;
        this.A08 = r5;
        this.A06 = 1aF.A01(r8);
        this.A04 = 1aF.A01(0);
        this.A05 = 1aF.A01(false);
        this.A03 = 1aF.A01(true);
        this.A0A = C66581MXm.A0P();
    }

    public final void AWs() {
        this.A07.accept(C60340gF.A00);
    }

    public final void Eih(int i, boolean z) {
        this.A04.accept(Integer.valueOf(i));
        C66580MXl.A1O(this.A05, z);
    }

    public final void Eji(2EM r2) {
        this.A06.accept(r2);
    }

    public final 1aU FN4() {
        return this.A01;
    }

    public final void cancel() {
        this.A0A.A01();
    }

    public final void setEnabled(boolean z) {
        C66580MXl.A1O(this.A03, z);
    }

    public final void start() {
        AnonymousClass1aS r6 = this.A07;
        1aU r5 = this.A08;
        1aU A0D = this.A04.A0D();
        1aU A0D2 = this.A05.A0D();
        1aU A0D3 = this.A03.A0D();
        1aU A0D4 = this.A06.A0D();
        O7X o7x = new O7X(this);
        1aJ r62 = r6.A00;
        1aJ r7 = r5.A00;
        1aJ r8 = A0D.A00;
        1aJ r9 = A0D2.A00;
        1aJ r10 = A0D3.A00;
        1aJ r11 = A0D4.A00;
        C70415O5s o5s = new C70415O5s(o7x);
        1aP.A01(r62, "source1 is null");
        1aP.A01(r7, "source2 is null");
        1aP.A01(r8, "source3 is null");
        1aP.A01(r9, "source4 is null");
        1aP.A01(r10, "source5 is null");
        1aP.A01(r11, "source6 is null");
        this.A0A.A02(new 1aU(1aJ.A00(new PUG(o5s), new C65071aK[]{r62, r7, r8, r9, r10, r11}, XCq.A00)).A0R(this.A09, TimeUnit.MILLISECONDS, 500), this.A01);
    }
}
