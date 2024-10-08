package X;

import com.facebook.cameracore.mediapipeline.services.audio.implementation.AudioPlatformComponentHostImpl;
import com.facebook.cameracore.mediapipeline.services.audio.interfaces.AudioPlatformComponentHost;
import com.facebook.cameracore.mediapipeline.services.audio.interfaces.AudioRenderCallback;

/* renamed from: X.Aqe  reason: case insensitive filesystem */
public final class C41242Aqe implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ C341617nF A04;
    public final /* synthetic */ byte[] A05;

    public C41242Aqe(C341617nF r1, byte[] bArr, int i, int i2, int i3, int i4) {
        this.A04 = r1;
        this.A05 = bArr;
        this.A03 = i;
        this.A02 = i2;
        this.A01 = i3;
        this.A00 = i4;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [X.9tX, X.9dT] */
    public final void run() {
        int i;
        int i2;
        int i3;
        int i4;
        byte[] bArr;
        C341577nB r8 = this.A04.A00;
        C39897ADz aDz = r8.A0E;
        if (aDz != null) {
            C39897ADz.A00(aDz);
        }
        try {
            if (!r8.A02) {
                bArr = this.A05;
                i4 = this.A03;
                i3 = this.A02;
                i2 = this.A01;
                i = this.A00;
                C345207t6 r0 = (C345207t6) r8.A07.get();
                if (r0 != null) {
                    AudioPlatformComponentHost A002 = r0.A00();
                    AudioRenderCallback audioRenderCallback = r8.A0G;
                    if (!(A002 == null || audioRenderCallback == null)) {
                        Boolean bool = (Boolean) r8.A08.get(A002);
                        if (bool == null || !bool.booleanValue()) {
                            if (C341577nB.A03(r8)) {
                            }
                        }
                        ((AudioPlatformComponentHostImpl) A002).mRenderCallback = audioRenderCallback;
                        if (A002.onInputDataAvailable(bArr, i4, i3, i2, i)) {
                            return;
                        }
                    }
                }
                A9M a9m = r8.A0F;
                if (a9m != null) {
                    a9m.A01(bArr, i);
                }
                C341577nB.A01(r8);
            } else {
                A9M a9m2 = r8.A0F;
                if (a9m2 != null) {
                    a9m2.A01(this.A05, this.A00);
                }
                C341577nB.A01(r8);
                bArr = this.A05;
                i4 = this.A03;
                i3 = this.A02;
                i2 = this.A01;
                i = this.A00;
            }
            C341577nB.A02(r8, bArr, i4, i3, i2, i);
        } catch (Exception e) {
            C341747nS r2 = r8.A0H;
            if (r2 != null) {
                r2.A00(new C391719tX(40000, (Throwable) e));
            }
        }
    }
}
