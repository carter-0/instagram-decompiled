package X;

import android.view.Surface;

/* renamed from: X.WOt  reason: case insensitive filesystem */
public final class C19187WOt implements C41842B2x {
    public final /* synthetic */ C18078Vl7 A00;
    public final /* synthetic */ C3496881i A01;

    public final void Dq4() {
    }

    public C19187WOt(C18078Vl7 vl7, C3496881i r2) {
        this.A01 = r2;
        this.A00 = vl7;
    }

    public final int BHR() {
        return this.A00.A04;
    }

    public final int BHc() {
        return this.A00.A05;
    }

    public final void D5c() {
        if (1Au.A00(this.A01.A0L).A1q()) {
            C363058j1.A02.A01(C3496881i.A0Z, "onStartInputComponent");
            this.A00.A0B.connect();
        }
    }

    public final void DKa(Surface surface) {
        String str = C3496881i.A0Z;
        StringBuilder sb = new StringBuilder();
        sb.append("MediaStreamStateListener:onInit - mCameraController: ");
        C363058j1.A02.A01(str, AnonymousClass7TF.A0i(this.A01.A02, sb));
        C18078Vl7 vl7 = this.A00;
        vl7.A01();
        String A002 = AnonymousClass000.A00(882);
        vl7.A07(A002);
        vl7.A07(AnonymousClass000.A00(4362));
        vl7.A07(AnonymousClass000.A00(1863));
        vl7.A04(surface);
        vl7.A05(new UUj(this, 1), A002);
    }

    public final void Dcz() {
        C363058j1.A02.A01(C3496881i.A0Z, "onRelease");
        this.A00.A0B.release();
    }

    public final void Dq3() {
        C363058j1.A02.A01(C3496881i.A0Z, "onSwitchToCamera");
        this.A00.A02();
    }

    public final void Egc(Surface surface) {
        this.A00.A04(surface);
    }
}
