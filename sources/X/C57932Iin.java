package X;

import android.app.Activity;
import com.instagram.ui.mediaactions.ScrubberWithKeyFrames;

/* renamed from: X.Iin  reason: case insensitive filesystem */
public final class C57932Iin implements Runnable {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ GFJ A01;
    public final /* synthetic */ Long A02;

    public C57932Iin(Activity activity, GFJ gfj, Long l) {
        this.A00 = activity;
        this.A01 = gfj;
        this.A02 = l;
    }

    public final void run() {
        C55910HpX hpX = C52222GJn.A0G;
        Activity activity = this.A00;
        C267324bN r0 = this.A01.A06;
        ScrubberWithKeyFrames A002 = hpX.A00(activity, r0);
        if (A002 != null) {
            A002.setupAdKeyFrameMarkers(activity, r0.getId(), C51966G9m.A0s(r0).A0C.CE2(), this.A02);
        }
    }
}
