package X;

import com.instagram.creation.capture.quickcapture.cameraspec.CameraSpec;

/* renamed from: X.9yP  reason: invalid class name and case insensitive filesystem */
public abstract class C394619yP {
    public static final 0eP findTargetVideoDimensions(int i, int i2, int i3, CameraSpec cameraSpec) {
        int min;
        int i4;
        Integer valueOf;
        Object obj;
        0qQ.A0B(cameraSpec, 3);
        float f = ((float) i) / ((float) i2);
        if (i >= i2) {
            i4 = Math.min(i, cameraSpec.A03);
            min = (int) (((float) i4) / f);
        } else {
            min = Math.min(i2, cameraSpec.A02);
            i4 = (int) (((float) min) * f);
        }
        0eP A0x = AnonymousClass7TF.A0x(Integer.valueOf(i4), min);
        if (i3 == 90 || i3 == 270) {
            valueOf = Integer.valueOf(AnonymousClass7TE.A0M(A0x.A01) & -2);
            obj = A0x.A00;
        } else {
            valueOf = Integer.valueOf(AnonymousClass7TE.A0M(A0x.A00) & -2);
            obj = A0x.A01;
        }
        return AnonymousClass7TF.A0x(valueOf, AnonymousClass7TE.A0M(obj) & -2);
    }
}
