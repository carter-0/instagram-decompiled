package X;

import android.content.DialogInterface;
import androidx.fragment.app.FragmentActivity;

public final class LUM implements DialogInterface.OnClickListener {
    public final /* synthetic */ 1Yh A00;
    public final /* synthetic */ C17945Via A01;
    public final /* synthetic */ C17744VdD A02;

    public LUM(1Yh r1, C17945Via via, C17744VdD vdD) {
        this.A02 = vdD;
        this.A00 = r1;
        this.A01 = via;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C17744VdD vdD = this.A02;
        FragmentActivity fragmentActivity = vdD.A02;
        1ES.A00(fragmentActivity, AnonymousClass07i.A00(fragmentActivity), AnonymousClass738.A02(new KAR(0, vdD, this.A01, this.A00), vdD.A08, true, false));
    }
}
