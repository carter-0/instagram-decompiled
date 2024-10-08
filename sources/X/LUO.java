package X;

import android.content.DialogInterface;

public final class LUO implements DialogInterface.OnClickListener {
    public final /* synthetic */ 1Yh A00;
    public final /* synthetic */ C17945Via A01;
    public final /* synthetic */ C17744VdD A02;

    public LUO(1Yh r1, C17945Via via, C17744VdD vdD) {
        this.A02 = vdD;
        this.A00 = r1;
        this.A01 = via;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        WGU.A00(this.A02.A08).A0F(C16678UzE.AUDIO_SELECTION_DIALOG, "choose_new_audio_button");
        1Yh.A02(this.A00, this.A01, true);
    }
}
