package X;

public final class WUS implements B1P, C41817B1x, B1Q {
    public C279284yO A00;
    public C17213VMr A01;
    public String A02;
    public boolean A03;
    public boolean A04;

    public final void DvT(C279284yO r2) {
        0qQ.A0B(r2, 0);
        if (this.A00 != r2) {
            this.A00 = r2;
            A00(this);
        }
    }

    public static final void A00(WUS wus) {
        String str;
        C279284yO r1 = wus.A00;
        if (r1 == AnonymousClass9QA.A00) {
            if (wus.A03) {
                str = "stories_gallery";
            } else {
                str = "stories_precapture_camera";
            }
        } else if (r1 instanceof AnonymousClass80O) {
            if (wus.A03) {
                str = "clips_gallery";
            } else {
                str = "clips_precapture_camera";
            }
        } else if (r1 == AnonymousClass80L.A00) {
            str = "live_precapture_camera";
        } else if (r1 == C363138jC.A00 && !wus.A03) {
            str = "feed_precapture_camera";
        } else {
            return;
        }
        wus.A02 = str;
        C17213VMr vMr = wus.A01;
        if (vMr != null) {
            vMr.A00.updateModuleNameV2_USE_WITH_CAUTION(str);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0017  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void D19(boolean r4) {
        /*
            r3 = this;
            if (r4 == 0) goto L_0x002a
            r0 = 1
            r3.A04 = r0
            X.4yO r1 = r3.A00
            boolean r0 = r1 instanceof X.AnonymousClass9QA
            if (r0 == 0) goto L_0x0023
            r0 = 4049(0xfd1, float:5.674E-42)
        L_0x000d:
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r3.A02 = r0
        L_0x0013:
            X.VMr r2 = r3.A01
            if (r2 == 0) goto L_0x0022
            java.lang.String r1 = r3.A02
            r0 = 0
            X.0qQ.A0B(r1, r0)
            X.UaZ r0 = r2.A00
            r0.updateModuleNameV2_USE_WITH_CAUTION(r1)
        L_0x0022:
            return
        L_0x0023:
            boolean r0 = r1 instanceof X.AnonymousClass80O
            if (r0 == 0) goto L_0x0013
            r0 = 4597(0x11f5, float:6.442E-42)
            goto L_0x000d
        L_0x002a:
            boolean r0 = r3.A04
            if (r0 == 0) goto L_0x0022
            java.lang.String r0 = "clips_precapture_camera"
            r3.A02 = r0
            A00(r3)
            r0 = 0
            r3.A04 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WUS.D19(boolean):void");
    }

    public final void DHb(boolean z) {
        if (z != this.A03) {
            this.A03 = z;
            A00(this);
        }
    }

    public final void DTa() {
        A00(this);
    }
}
