package X;

import android.content.Intent;
import com.instagram.model.reels.Reel;

/* renamed from: X.6k4  reason: invalid class name */
public final class AnonymousClass6k4 implements AnonymousClass6Z1 {
    public final C273384mU A00;
    public final C317206mt A01;

    public final /* synthetic */ void D7Q(C255773uh r1, C250973mM r2, C316026kz r3, C309426Yf r4) {
    }

    public final /* synthetic */ void DLs(Reel reel) {
    }

    public final /* synthetic */ void DMq(int i) {
    }

    public final /* synthetic */ void DNx() {
    }

    public final /* synthetic */ void DNy() {
    }

    public final /* synthetic */ void DVL() {
    }

    public final void DWT(String str) {
        C255773uh Au5;
        0qQ.A0B(str, 0);
        if (str.equals("fragment_paused") && (Au5 = this.A00.Au5()) != null && Au5.A1k()) {
            C250963mL r0 = Au5.A0e;
            0qQ.A07(r0);
            C308586Uv A002 = A00(r0);
            if (A002 != null) {
                A002.A06 = true;
            }
        }
    }

    public final /* synthetic */ void Dfe() {
    }

    public final /* synthetic */ void DiL(int i) {
    }

    public final /* synthetic */ void DiM(int i, int i2) {
    }

    public final /* synthetic */ void DiO(int i, int i2) {
    }

    public final /* synthetic */ void DiP() {
    }

    public final /* synthetic */ void DxN() {
    }

    public final void DyN(C255773uh r4, C316036l0 r5) {
        0qQ.A0B(r4, 0);
        0qQ.A0B(r5, 1);
        if (r4.A1k()) {
            C250963mL r0 = r4.A0e;
            0qQ.A07(r0);
            C308586Uv A002 = A00(r0);
            if (A002 != null) {
                A002.A03 = new MIR(this.A00);
                C317206mt r1 = this.A01;
                A002.A04 = new C20602Wvj(r1);
                A002.A05 = new C20603Wvk(r1);
            }
        }
    }

    public final /* synthetic */ void onActivityResult(int i, int i2, Intent intent) {
    }

    public final /* synthetic */ void onDestroy() {
    }

    public final /* synthetic */ void onDestroyView() {
    }

    private final C308586Uv A00(C250963mL r4) {
        C316006kx r2;
        C316026kz Aui = this.A00.Aui();
        if (!(Aui instanceof C316006kx) || (r2 = (C316006kx) Aui) == null) {
            return null;
        }
        AnonymousClass6V7 r0 = (AnonymousClass6V7) ((C308566Ut) r2.A1u.getValue()).A08.get(r4);
        if (r0 != null) {
            return r0.A00;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Expecting SuperlativeItemType : Actual ");
        sb.append(r4);
        throw new IllegalStateException(sb.toString());
    }

    public final /* synthetic */ boolean BVb() {
        return false;
    }

    public final /* synthetic */ int BrB() {
        return 0;
    }

    public final /* synthetic */ boolean Bu3() {
        return false;
    }

    public final /* synthetic */ boolean Cau() {
        return false;
    }

    public final /* synthetic */ boolean Dpr() {
        return false;
    }

    public final /* synthetic */ boolean Dq0() {
        return false;
    }

    public final boolean Dqd() {
        C255773uh Au5 = this.A00.Au5();
        if (Au5 == null || !Au5.A1k()) {
            return false;
        }
        C250963mL r0 = Au5.A0e;
        0qQ.A07(r0);
        C308586Uv A002 = A00(r0);
        if (A002 == null) {
            return false;
        }
        A002.A06 = false;
        return false;
    }

    public final void DxL() {
        C255773uh Au5 = this.A00.Au5();
        if (Au5 != null && Au5.A1k()) {
            C250963mL r0 = Au5.A0e;
            0qQ.A07(r0);
            C308586Uv A002 = A00(r0);
            if (A002 != null) {
                A002.A06 = false;
            }
        }
    }

    public final void DxU() {
        C273384mU r6 = this.A00;
        C255773uh Au5 = r6.Au5();
        if (Au5 != null && Au5.A1k()) {
            C250963mL r4 = Au5.A0e;
            0qQ.A07(r4);
            C308586Uv A002 = A00(r4);
            if (A002 != null) {
                0s0 r2 = A002.A0D;
                AnonymousClass0YZ[] r1 = C308586Uv.A0I;
                if (!((Boolean) r2.CDM(A002, r1[1])).booleanValue()) {
                    r6.EHY("superlative_loading");
                    C308586Uv A003 = A00(r4);
                    if (A003 != null) {
                        A003.A0D.Epx(A003, true, r1[1]);
                    }
                }
            }
        }
    }

    public AnonymousClass6k4(C273384mU r1, C317206mt r2) {
        this.A00 = r1;
        this.A01 = r2;
    }
}
