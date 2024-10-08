package X;

import android.hardware.camera2.CameraAccessException;
import java.util.concurrent.Callable;

/* renamed from: X.AsS  reason: case insensitive filesystem */
public final class C41345AsS implements Callable {
    public final /* synthetic */ C340837lu A00;
    public final /* synthetic */ boolean A01;
    public final /* synthetic */ boolean A02;

    public C41345AsS(C340837lu r1, boolean z, boolean z2) {
        this.A00 = r1;
        this.A01 = z;
        this.A02 = z2;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        try {
            this.A00.A0B(this.A01, this.A02);
            return null;
        } catch (CameraAccessException | IllegalArgumentException unused) {
            return null;
        } catch (Exception e) {
            throw new RuntimeException(AnonymousClass7TF.A0m("Could not start preview: ", e));
        }
    }
}
