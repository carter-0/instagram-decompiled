package X;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.8mV  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C365088mV implements Runnable {
    public final /* synthetic */ C364838m6 A00;

    public /* synthetic */ C365088mV(C364838m6 r1) {
        this.A00 = r1;
    }

    public final void run() {
        C364838m6 r3 = this.A00;
        C368528sn r2 = r3.A04;
        if (r2 != null) {
            AtomicBoolean atomicBoolean = r3.A0L;
            if (atomicBoolean.get()) {
                atomicBoolean.set(false);
                r2.A0C(r3.A03, (C344557s3) null);
            }
        }
        if (!r3.A0A && r3.A03 != null) {
            C344207rU r5 = r3.A0F;
            C344287rc r4 = C345807u7.A00;
            if (((C345807u7) r5.A02(r4)).Avx().A04 != null) {
                try {
                    C365398n2 r1 = r3.A03;
                    C365358my r0 = r3.A07;
                    r0.getClass();
                    r1.A02(r0.getTexture());
                } catch (IllegalStateException | InterruptedException e) {
                    ((C345807u7) r5.A02(r4)).Avx().A0D("OneCameraArImageRenderController SharedTextureVideoInput onFrameAvailable exception", "OneCameraArImageRenderController", e);
                    0kD.A0H("OneCameraArImageRenderController SharedTextureVideoInput onFrameAvailable exception", e);
                }
            }
        }
    }
}
