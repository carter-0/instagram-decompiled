package X;

public final class NE6 extends C50185FSr implements C74562PxB {
    public final void EeE(C69336Njb njb) {
        G8K g8k;
        int A02 = DbU.A02(njb, 0);
        if (A02 != 0) {
            if (A02 == 1) {
                g8k = this.A00;
                g8k.Ey1("notif_removed");
            } else if (A02 == 2) {
                g8k = this.A00;
                g8k.Ey1("notif_displayed");
            }
            g8k.Ey1("incoming_call_screen_displayed");
        } else {
            this.A00.Ey1("notif_removed");
        }
        this.A00.CmF("notification_type", njb.A00);
    }

    public final void AIe(String str) {
        this.A00.Ey0(str);
    }

    public final void Ey1(String str) {
        this.A00.Ey1(str);
    }
}
