package X;

import com.facebook.react.modules.dialog.DialogModule;

public final class GFD implements C59616JQk {
    public 0sP A00;
    public 0sL A01;
    public final GKM A02;

    public final void DEn(C53581Gqw gqw) {
        0qQ.A0B(gqw, 0);
        if (this.A02.A01) {
            int ordinal = gqw.A00.ordinal();
            if (ordinal == 0) {
                0f9 AEf = 0wj.A01.AEf("onFanClubBadgeClick", 817902720);
                AEf.ABQ(DialogModule.KEY_MESSAGE, "default visibility");
                AEf.report();
                return;
            } else if (ordinal == 2) {
                0sL r2 = this.A01;
                if (r2 != null) {
                    r2.invoke(gqw.A01, gqw.A02);
                    return;
                }
                return;
            } else if (ordinal != 1) {
                throw AnonymousClass7TE.A1K();
            }
        }
        0sP r1 = this.A00;
        if (r1 != null) {
            r1.invoke(gqw.A02);
        }
    }

    public final void DEo() {
        0xa r4 = this.A02.A00.A01;
        AnonymousClass7TG.A1M(r4, "exclusive_content_animation_reels_count", DbT.A00(r4, "exclusive_content_animation_reels_count") + 1);
        long currentTimeMillis = System.currentTimeMillis();
        0xY AR4 = r4.AR4();
        AR4.E5c("exclusive_content_animation_reels_timestamp", currentTimeMillis);
        AR4.apply();
    }

    public GFD(GKM gkm) {
        this.A02 = gkm;
    }

    public final void EbJ(0sP r1) {
        this.A00 = r1;
    }

    public final void EbM(0sL r1) {
        this.A01 = r1;
    }
}
