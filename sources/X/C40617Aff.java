package X;

/* renamed from: X.Aff  reason: case insensitive filesystem */
public final /* synthetic */ class C40617Aff implements X59 {
    public final /* synthetic */ C3496881i A00;

    public /* synthetic */ C40617Aff(C3496881i r1) {
        this.A00 = r1;
    }

    public final void Dba(C18078Vl7 vl7) {
        C3496881i r5 = this.A00;
        if (r5.A02 == null) {
            String str = C3496881i.A0Z;
            C363068j2 r1 = C363058j1.A02;
            0qQ.A0B(str, 0);
            r1.A06(str, "maybeSetupMediaStreamController null cameraController", (Throwable) null);
            return;
        }
        String str2 = C3496881i.A0Z;
        C363068j2 r3 = C363058j1.A02;
        r3.A01(str2, "running maybeSetupMediaStreamController");
        C340297l2 r2 = r5.A02;
        r2.A04 = new C19187WOt(vl7, r5);
        r3.A01(str2, 002.A1D("mCameraController isInitialised: ", r2.CVP()));
        if (r5.A02.CVP()) {
            r3.A01(str2, "Calling reinitializeInputToggleListener");
            C340297l2.A04(r5.A02);
        }
    }
}
