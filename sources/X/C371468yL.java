package X;

import com.instagram.camera.effect.models.CameraAREffect;

/* renamed from: X.8yL  reason: invalid class name and case insensitive filesystem */
public final class C371468yL implements C371478yM {
    public final /* synthetic */ AnonymousClass8yN A00;
    public final /* synthetic */ CameraAREffect A01;
    public final /* synthetic */ C312246e4 A02;
    public final /* synthetic */ C371218xo A03;

    public C371468yL(AnonymousClass8yN r1, CameraAREffect cameraAREffect, C312246e4 r3, C371218xo r4) {
        this.A02 = r3;
        this.A00 = r1;
        this.A01 = cameraAREffect;
        this.A03 = r4;
    }

    public final void DEV(C8993RKl rKl) {
        this.A03.DBV((C371458yK) null, rKl, this.A01);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        C371458yK r4 = (C371458yK) obj;
        if (r4 != null) {
            r4.A04.A00 = this.A00;
        }
        C312246e4 r0 = this.A02;
        CameraAREffect cameraAREffect = this.A01;
        C371218xo r1 = this.A03;
        r0.A07.put(cameraAREffect, r4);
        r1.DBV(r4, (C8993RKl) null, cameraAREffect);
    }
}
