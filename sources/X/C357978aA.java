package X;

import com.instagram.camera.effect.models.CameraAREffect;
import com.instagram.music.common.model.MusicDataSource;

/* renamed from: X.8aA  reason: invalid class name and case insensitive filesystem */
public final class C357978aA implements AnonymousClass8GH {
    public final /* synthetic */ C357738Zk A00;

    public C357978aA(C357738Zk r1) {
        this.A00 = r1;
    }

    public final boolean D26() {
        MusicDataSource musicDataSource;
        C357738Zk r4 = this.A00;
        if (r4.A03 != null) {
            CameraAREffect cameraAREffect = r4.A0C.A00().A05.A09;
            if (cameraAREffect != null && cameraAREffect.A0I()) {
                C264044Oj.A00(r4.A0D);
            }
            AnonymousClass85s r3 = r4.A0J;
            r3.pause();
            C349337zz r0 = r4.A03;
            if (r0 != null) {
                musicDataSource = C59670JTa.A00(r0.BUu());
                musicDataSource.A00 = null;
            } else {
                musicDataSource = null;
            }
            r4.A0G.A01 = null;
            if (musicDataSource != null) {
                r3.Edj(musicDataSource, true);
            }
            C357738Zk.A07(r4);
            return true;
        }
        throw new IllegalStateException("Required value was null.");
    }
}
