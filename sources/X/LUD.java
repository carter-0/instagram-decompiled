package X;

import android.content.DialogInterface;

public final class LUD implements DialogInterface.OnClickListener {
    public final /* synthetic */ 1Yh A00;
    public final /* synthetic */ C17744VdD A01;

    public LUD(1Yh r1, C17744VdD vdD) {
        this.A01 = vdD;
        this.A00 = r1;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C17744VdD vdD = this.A01;
        WGU.A00(vdD.A08).A0R(C16678UzE.AUDIO_SWAP_BOOST_AGAIN_DIALOG.toString(), "proceed_to_boost");
        1Yh.A03(this.A00, vdD);
    }
}
