package X;

import com.instagram.camera.effect.models.CameraAREffect;

/* renamed from: X.8aB  reason: invalid class name and case insensitive filesystem */
public final class C357988aB implements AnonymousClass8GH {
    public final /* synthetic */ C357738Zk A00;

    public C357988aB(C357738Zk r1) {
        this.A00 = r1;
    }

    public final boolean D26() {
        C357738Zk r2 = this.A00;
        CameraAREffect cameraAREffect = r2.A0C.A00().A05.A09;
        if (cameraAREffect != null && cameraAREffect.A0I()) {
            C264044Oj.A00(r2.A0D);
        }
        r2.A0J.pause();
        C65509LuX A01 = C357738Zk.A01(r2);
        if (A01 != null) {
            A01.A01(C357738Zk.A00(r2));
        }
        C357738Zk.A0A(r2, AnonymousClass05K.A01);
        return true;
    }
}
