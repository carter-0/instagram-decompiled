package X;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.facebook.cameracore.mediapipeline.services.audio.implementation.AudioPlatformComponentHostImpl;
import com.facebook.cameracore.mediapipeline.services.audio.interfaces.AudioPlatformComponentHost;
import com.facebook.cameracore.mediapipeline.services.audio.interfaces.AudioRenderCallback;
import java.nio.ByteBuffer;

/* renamed from: X.AQb  reason: case insensitive filesystem */
public final class C40071AQb implements C22555YAe {
    public long A00;
    public long A01;
    public final Handler A02;
    public final C343487qI A03;
    public final AudioRenderCallback A04 = new C380979ap(this);
    public volatile boolean A05;
    public final /* synthetic */ AQY A06;

    public C40071AQb(Handler handler, C343487qI r4, AQY aqy) {
        this.A06 = aqy;
        this.A03 = r4;
        this.A02 = handler;
        this.A05 = false;
        this.A00 = 0;
        this.A01 = 0;
    }

    public static void A00(C40071AQb aQb, byte[] bArr, int i, int i2) {
        if (!aQb.A05) {
            C341747nS r2 = aQb.A06.A0D;
            if (r2 != null) {
                r2.A02(bArr, i2, aQb.A00);
            }
            if (i2 > 0) {
                C343487qI r22 = aQb.A03;
                aQb.A00 += C39902AIk.A01(r22.A02, Integer.bitCount(r22.A01), (long) i2, (long) i);
            }
        }
    }

    public final void A01() {
        C39897ADz aDz = this.A06.A0B;
        if (aDz != null && this.A01 > 0) {
            long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos() - this.A01;
            aDz.A07 += elapsedRealtimeNanos;
            if (elapsedRealtimeNanos > aDz.A0C) {
                aDz.A01++;
            }
        }
    }

    public final void A02(Y1G y1g, int i) {
        if (!this.A05) {
            C341747nS r2 = this.A06.A0D;
            if (r2 != null) {
                r2.A01(y1g, i, this.A00);
            }
            if (i > 0) {
                C343487qI r22 = this.A03;
                this.A00 += C39902AIk.A01(r22.A02, Integer.bitCount(r22.A01), (long) i, (long) r22.A04);
            }
        }
    }

    public final void D7i(Y1G y1g, int i) {
        AudioPlatformComponentHost A002;
        Boolean bool;
        if (!this.A05) {
            AQY aqy = this.A06;
            C39897ADz aDz = aqy.A0B;
            if (aDz != null) {
                C39897ADz.A00(aDz);
            }
            this.A01 = SystemClock.elapsedRealtimeNanos();
            Looper myLooper = Looper.myLooper();
            Handler handler = this.A02;
            if (myLooper == handler.getLooper()) {
                C345207t6 r0 = (C345207t6) aqy.A05.get();
                int i2 = i;
                if (!(r0 == null || (A002 = r0.A00()) == null || (((bool = (Boolean) aqy.A06.get(A002)) == null || !bool.booleanValue()) && !AQY.A00(aqy)))) {
                    ByteBuffer byteBuffer = y1g.A02;
                    if (aqy.A02.length != byteBuffer.capacity()) {
                        aqy.A02 = new byte[byteBuffer.capacity()];
                    }
                    byteBuffer.get(aqy.A02);
                    ((AudioPlatformComponentHostImpl) A002).mRenderCallback = new C380999ar(y1g, this);
                    byte[] bArr = aqy.A02;
                    C343487qI r02 = this.A03;
                    if (A002.onInputDataAvailable(bArr, r02.A04, r02.A02, Integer.bitCount(r02.A01), i2)) {
                        return;
                    }
                }
                A01();
                A02(y1g, i);
                return;
            }
            StringBuilder A1A = AnonymousClass7TE.A1A();
            A1A.append("onDataAvailable() must be invoked on the same thread as the other methods. Looper: ");
            A1A.append(Looper.myLooper());
            A1A.append(" Expected: ");
            throw AnonymousClass7TE.A0z(AnonymousClass7TF.A0i(handler.getLooper(), A1A));
        }
    }

    public final void D7j(byte[] bArr, int i) {
        AudioPlatformComponentHost A002;
        Boolean bool;
        if (!this.A05) {
            AQY aqy = this.A06;
            C39897ADz aDz = aqy.A0B;
            if (aDz != null) {
                C39897ADz.A00(aDz);
            }
            this.A01 = SystemClock.elapsedRealtimeNanos();
            Looper myLooper = Looper.myLooper();
            Handler handler = this.A02;
            if (myLooper == handler.getLooper()) {
                C345207t6 r0 = (C345207t6) aqy.A05.get();
                byte[] bArr2 = bArr;
                int i2 = i;
                if (!(r0 == null || (A002 = r0.A00()) == null || (((bool = (Boolean) aqy.A06.get(A002)) == null || !bool.booleanValue()) && !AQY.A00(aqy)))) {
                    ((AudioPlatformComponentHostImpl) A002).mRenderCallback = this.A04;
                    C343487qI r02 = this.A03;
                    if (A002.onInputDataAvailable(bArr2, r02.A04, r02.A02, Integer.bitCount(r02.A01), i2)) {
                        return;
                    }
                }
                A9M a9m = aqy.A0C;
                if (a9m != null) {
                    a9m.A01(bArr, i);
                }
                A01();
                A00(this, bArr, this.A03.A04, i);
                return;
            }
            StringBuilder A1A = AnonymousClass7TE.A1A();
            A1A.append("onDataAvailable() must be invoked on the same thread as the other methods. Looper: ");
            A1A.append(Looper.myLooper());
            A1A.append(" Expected: ");
            throw AnonymousClass7TE.A0z(AnonymousClass7TF.A0i(handler.getLooper(), A1A));
        }
    }

    public final void DCe(C382299dT r2) {
        C341747nS r0 = this.A06.A0D;
        if (r0 != null) {
            r0.A00(r2);
        }
    }

    public final void DFw() {
        this.A06.A04.Cjl(19, "recording_start_audio_first_received");
    }
}
