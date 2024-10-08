package X;

import com.facebook.cameracore.mediapipeline.services.audio.implementation.AudioPlatformComponentHostImpl;
import com.facebook.cameracore.mediapipeline.services.audio.interfaces.AudioPlatformComponentHost;
import com.facebook.cameracore.mediapipeline.services.audio.interfaces.AudioRenderCallback;
import java.nio.ByteBuffer;

/* renamed from: X.Aqd  reason: case insensitive filesystem */
public final class C41241Aqd implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ Y1G A04;
    public final /* synthetic */ C341617nF A05;

    public C41241Aqd(Y1G y1g, C341617nF r2, int i, int i2, int i3, int i4) {
        this.A05 = r2;
        this.A04 = y1g;
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
        Y1G y1g;
        C341577nB r2 = this.A05.A00;
        C39897ADz aDz = r2.A0E;
        if (aDz != null) {
            C39897ADz.A00(aDz);
        }
        try {
            if (!r2.A02) {
                y1g = this.A04;
                i4 = this.A03;
                i3 = this.A02;
                i2 = this.A01;
                i = this.A00;
                C345207t6 r0 = (C345207t6) r2.A07.get();
                if (r0 != null) {
                    AudioPlatformComponentHost A002 = r0.A00();
                    AudioRenderCallback audioRenderCallback = r2.A0G;
                    if (!(A002 == null || audioRenderCallback == null)) {
                        Boolean bool = (Boolean) r2.A08.get(A002);
                        if (bool == null || !bool.booleanValue()) {
                            if (C341577nB.A03(r2)) {
                            }
                        }
                        ByteBuffer byteBuffer = y1g.A02;
                        if (r2.A03.length != byteBuffer.capacity()) {
                            r2.A03 = new byte[byteBuffer.capacity()];
                        }
                        byteBuffer.get(r2.A03);
                        ((AudioPlatformComponentHostImpl) A002).mRenderCallback = new C380989aq(y1g, r2);
                        if (A002.onInputDataAvailable(byteBuffer, i4, i3, i2, i)) {
                            return;
                        }
                    }
                }
                C341577nB.A01(r2);
            } else {
                C341577nB.A01(r2);
                y1g = this.A04;
                i4 = this.A03;
                i3 = this.A02;
                i2 = this.A01;
                i = this.A00;
            }
            C341747nS r3 = r2.A0H;
            if (r3 != null) {
                r3.A01(y1g, i, r2.A00);
            }
            if (i > 0 && i4 > 0 && i3 > 0 && i2 > 0) {
                r2.A00 += C39902AIk.A01(i3, i2, (long) i, (long) i4);
            }
        } catch (Exception e) {
            C341747nS r22 = r2.A0H;
            if (r22 != null) {
                r22.A00(new C391719tX(40000, (Throwable) e));
            }
        }
    }
}
