package X;

import com.instagram.common.session.UserSession;

public final class HKB extends C52050GCw implements AnonymousClass32U {
    public final JRO A00;
    public final UserSession A01;
    public final GD6 A02;
    public final GCC A03;
    public final C52038GCk A04;
    public final GC3 A05;
    public final GD9 A06;

    public final /* synthetic */ void DVz(int i) {
    }

    public final /* synthetic */ void DW0(int i) {
    }

    public final /* synthetic */ void DW8(int i, int i2) {
    }

    public final /* synthetic */ void DWA(int i, int i2) {
    }

    public final /* synthetic */ void DWY() {
    }

    public final /* synthetic */ void DhU(Integer num) {
    }

    public final /* synthetic */ void Dpv() {
    }

    public final /* synthetic */ void Dpy(C267324bN r1, int i) {
    }

    private final void A00() {
        C267324bN A022 = this.A06.A02();
        if (A022 != null && JSx.A00(A022, this.A02).A0R) {
            this.A00.EaG(A022, false);
            this.A05.A05.A03();
            this.A03.A0C();
            this.A04.A00(AnonymousClass05K.A0j);
        }
    }

    public HKB(JRO jro, UserSession userSession, GD6 gd6, GCC gcc, GC3 gc3, GD9 gd9) {
        C51974G9v.A1M(gd9, userSession, jro);
        this.A02 = gd6;
        this.A06 = gd9;
        this.A01 = userSession;
        this.A00 = jro;
        this.A05 = gc3;
        this.A03 = gcc;
        this.A04 = new C52038GCk(userSession);
    }

    public final void DhG(float f, float f2) {
        A00();
    }

    public final void onDestroyView() {
        A00();
        super.onDestroyView();
    }
}
