package X;

import android.content.DialogInterface;

/* renamed from: X.W4q  reason: case insensitive filesystem */
public final class C18829W4q implements DialogInterface.OnClickListener {
    public final /* synthetic */ 1Yh A00;
    public final /* synthetic */ C17744VdD A01;

    public C18829W4q(1Yh r1, C17744VdD vdD) {
        this.A01 = vdD;
        this.A00 = r1;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        WGU.A00(this.A01.A08).A0F(C16678UzE.AUDIO_SELECTION_DIALOG, "cancel_button");
        1Yh.A01(this.A00);
    }
}
