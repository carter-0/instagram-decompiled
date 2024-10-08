package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.sundial.reshare.model.ClipsCelebrationReshareViewModel;
import com.instagram.ui.widget.interactive.InteractiveDrawableContainer;

/* renamed from: X.Aow  reason: case insensitive filesystem */
public final /* synthetic */ class C41136Aow implements Runnable {
    public final /* synthetic */ AnonymousClass8BA A00;
    public final /* synthetic */ ClipsCelebrationReshareViewModel A01;
    public final /* synthetic */ 1Xj A02;

    public /* synthetic */ C41136Aow(AnonymousClass8BA r1, ClipsCelebrationReshareViewModel clipsCelebrationReshareViewModel, 1Xj r3) {
        this.A00 = r1;
        this.A02 = r3;
        this.A01 = clipsCelebrationReshareViewModel;
    }

    public final void run() {
        AnonymousClass8BA r4 = this.A00;
        1Xj r5 = this.A02;
        ClipsCelebrationReshareViewModel clipsCelebrationReshareViewModel = this.A01;
        try {
            AnonymousClass8BA.A01(r4.A18.A0Q, r4, r5, 0.5f, r4.A00);
        } catch (IllegalArgumentException e) {
            0kD.A07("QuickCaptureEditController", "Error creating video sticker for reshare.", e);
            Activity activity = r4.A0n;
            C59689JTv.A0B(activity, "failed_to_create_video_sticker_for_reshare");
            if (activity != null) {
                activity.finish();
            }
        }
        if (clipsCelebrationReshareViewModel != null) {
            InteractiveDrawableContainer interactiveDrawableContainer = r4.A1s;
            String str = clipsCelebrationReshareViewModel.A00;
            UserSession userSession = r4.A0v;
            AEG.A02(userSession, interactiveDrawableContainer, str);
            if (clipsCelebrationReshareViewModel.A01) {
                AEG.A01(userSession, r4.A1B, interactiveDrawableContainer);
            }
        }
    }
}
