package X;

public final class EEB extends C252233om {
    public final C47491E4v A00;
    public final 1wn A01 = FXZ.A00(this, 48);
    public final 1wn A02 = FXZ.A00(this, 49);
    public final 0lg A03;
    public final C46634DiE A04;

    public final void onPause() {
        1xC r3 = 1xC.A01;
        r3.A03(this.A01, C50249FVg.class);
        if (1AW.A06(0Tu.A05, 18302754023936812L)) {
            r3.A03(this.A02, C50250FVh.class);
        }
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [X.1xE, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v10, types: [X.1xE, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v14, types: [X.1xE, java.lang.Object] */
    public final void onResume() {
        String str;
        1xC r3 = 1xC.A01;
        r3.A02(this.A01, C50249FVg.class);
        FV8 A002 = FV8.A00();
        0lg r2 = this.A03;
        if (!A002.A04(r2, "ig_android_growth_fx_access_fb_ig_sso", "BigBlueTokenHelper")) {
            FV8.A00().A03(r2, this.A04);
        } else {
            r3.A00(new Object());
        }
        if (1AW.A06(0Tu.A05, 18302754023936812L)) {
            r3.A02(this.A02, C50250FVh.class);
            C50305FXk fXk = C50305FXk.A03;
            0qQ.A0B(r2, 2);
            if (Dbc.A12(r2, "BigBlueTokenHelper") || (str = C50305FXk.A02) == null || str.length() == 0) {
                r3.A00(new Object());
                0nY.A00().ATE(new C47804EHq(r2));
                return;
            }
            r3.A00(new Object());
        }
    }

    public EEB(0lg r2, C47491E4v e4v, C46634DiE diE) {
        this.A03 = r2;
        this.A00 = e4v;
        this.A04 = diE;
    }
}
