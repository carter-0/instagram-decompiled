package X;

import java.util.List;

/* renamed from: X.EHq  reason: case insensitive filesystem */
public final class C47804EHq extends 0ng {
    public final /* synthetic */ 0lg A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C47804EHq(0lg r5) {
        super(1073701796, 4, false, true);
        this.A00 = r5;
    }

    public final void run() {
        String str;
        C50305FXk fXk = C50305FXk.A03;
        0lg r4 = this.A00;
        if (Dbc.A12(r4, "BigBlueTokenHelper") || (str = C50305FXk.A02) == null || str.length() == 0) {
            List A02 = AJ0.A02(r4.getDeviceSession().A06(), r4, "ig_android_access_library_fx_fetch_active_msgr_token", "BigBlueTokenHelper", (String) null);
            String str2 = null;
            if (00k.A0J(A02) != null) {
                C376119Gp r1 = ((C376139Gr) 00k.A0I(A02)).A01;
                C50305FXk.A02 = r1.A00;
                C376109Go r12 = r1.A01;
                if (r12 != null) {
                    C50305FXk.A00 = r12.A02;
                    str2 = r12.A00;
                } else {
                    return;
                }
            } else {
                C50305FXk.A02 = null;
                C50305FXk.A00 = null;
            }
            C50305FXk.A01 = str2;
        }
    }
}
