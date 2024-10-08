package X;

import com.instagram.camera.effect.models.CameraAREffect;

/* renamed from: X.85C  reason: invalid class name */
public final class AnonymousClass85C implements AnonymousClass85D {
    public final boolean A00;

    public final boolean CmT(CameraAREffect cameraAREffect) {
        0qQ.A0B(cameraAREffect, 0);
        if (!this.A00) {
            return false;
        }
        if (cameraAREffect.A0J() || cameraAREffect.A0Z.get("audioFBA") != null || cameraAREffect.A0I()) {
            return true;
        }
        return false;
    }

    public AnonymousClass85C(boolean z) {
        this.A00 = z;
    }
}
