package X;

import com.instagram.camera.effect.mq.IgCameraEffectsController;

/* renamed from: X.82J  reason: invalid class name */
public final class AnonymousClass82J implements C3496381d {
    public final /* synthetic */ IgCameraEffectsController A00;

    public AnonymousClass82J(IgCameraEffectsController igCameraEffectsController) {
        this.A00 = igCameraEffectsController;
    }

    public final void onPaused() {
        IgCameraEffectsController igCameraEffectsController = this.A00;
        igCameraEffectsController.A07 = null;
        igCameraEffectsController.A0T.clear();
    }

    public final void onResumed() {
        IgCameraEffectsController igCameraEffectsController = this.A00;
        igCameraEffectsController.A0D = true;
        IgCameraEffectsController.A01(C312596el.SYSTEM, igCameraEffectsController, "newMediaPipelineControllerListener onResumed()", false, true);
    }
}
