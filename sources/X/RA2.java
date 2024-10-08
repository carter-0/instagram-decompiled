package X;

import android.content.Context;

public final class RA2 extends 0ng {
    public final /* synthetic */ Context A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RA2(Context context) {
        super(176, 4, false, false);
        this.A00 = context;
    }

    public final void run() {
        try {
            Context context = this.A00;
            C9271RVw.A00(context, C9272RVx.A00(context).A01);
        } catch (RJT e) {
            0wb.A07("omvp_tos_display_manager: error communicating tos acceptance to appmanager", e);
            0KC.A0F("TosNoticeDisplayManager", "Error communicating with appmanager", e);
        }
    }
}
