package X;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.MeteringRectangle;
import android.os.Handler;
import com.facebook.cameracore.instagram.ardelivery.networkconsentmanager.IgNetworkConsentStorage;
import java.util.concurrent.Callable;

/* renamed from: X.90v  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C3724390v implements Callable {
    public final /* synthetic */ Rect A00;
    public final /* synthetic */ C340597lW A01;

    public /* synthetic */ C3724390v(Rect rect, C340597lW r2) {
        this.A01 = r2;
        this.A00 = rect;
    }

    public final Object call() {
        C340837lu r0;
        C343297pz r3;
        long j;
        C340597lW r4 = this.A01;
        Rect rect = this.A00;
        float[] fArr = {(float) rect.centerX(), (float) rect.centerY()};
        if (r4.A04 != null) {
            Matrix matrix = new Matrix();
            r4.A04.invert(matrix);
            matrix.mapPoints(fArr);
        }
        C340827lt r10 = r4.A0P;
        boolean z = r4.A0H;
        CaptureRequest.Builder builder = r4.A06;
        C341897nh r32 = r4.A0C;
        C343187po r11 = r4.A0k;
        C340807lr r1 = r10.A0A;
        r1.A01("Cannot perform focus, not on Optic thread.");
        r1.A01("Can only check if the prepared on the Optic thread");
        if (!r1.A00) {
            return null;
        }
        C343157pl r02 = r10.A03;
        r02.getClass();
        if (!r02.A00.isConnected() || (r0 = r10.A04) == null || !r0.A0S || builder == null || r11 == null) {
            return null;
        }
        C342687p0 r12 = r10.A07;
        r12.getClass();
        if (!((Boolean) r12.A01(C342687p0.A0V)).booleanValue() || r32 == null) {
            return null;
        }
        if ((r32.isCameraSessionActivated() && r32.isARCoreEnabled()) || r10.A05 == null || !r10.A0D || (r3 = r10.A04.A09) == null) {
            return null;
        }
        r10.A00();
        r10.A05(AnonymousClass05K.A00, fArr);
        MeteringRectangle[] meteringRectangleArr = {new MeteringRectangle(r10.A05.A08(rect), IgNetworkConsentStorage.MAX_ENTRIES)};
        r11.A05 = null;
        r11.A06 = new C3724590x(builder, r10, r11, fArr, z);
        builder.set(CaptureRequest.CONTROL_AF_MODE, 1);
        builder.set(CaptureRequest.CONTROL_AF_REGIONS, meteringRectangleArr);
        r10.A0C = true;
        CaptureRequest.Key key = CaptureRequest.CONTROL_AF_TRIGGER;
        builder.set(key, 2);
        r3.AGa(builder.build(), (Handler) null, r11);
        builder.set(key, 0);
        r3.Eia(builder.build(), (Handler) null, r11);
        builder.set(key, 1);
        r3.AGa(builder.build(), (Handler) null, r11);
        if (z) {
            j = 6000;
        } else {
            j = 4000;
        }
        r10.A02(builder, r11, j);
        return null;
    }
}
