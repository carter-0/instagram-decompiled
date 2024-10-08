package X;

import android.hardware.camera2.CameraAccessException;
import java.util.concurrent.Callable;

/* renamed from: X.Ard  reason: case insensitive filesystem */
public final /* synthetic */ class C41297Ard implements Callable {
    public final /* synthetic */ C340597lW A00;

    public /* synthetic */ C41297Ard(C340597lW r1) {
        this.A00 = r1;
    }

    public final Object call() {
        C340837lu r2 = this.A00.A0R;
        C340807lr r1 = r2.A0J;
        r1.A01("Can only check if is retrieving preview frames from the Optic thread");
        r1.A01("Can only check if the prepared on the Optic thread");
        if (r1.A00 && r2.A0T) {
            return null;
        }
        try {
            r2.A0B(true, false);
            return null;
        } catch (CameraAccessException | IllegalArgumentException unused) {
            return null;
        } catch (Exception e) {
            throw new RuntimeException(AnonymousClass7TF.A0m("Could not start preview: ", e));
        }
    }
}
