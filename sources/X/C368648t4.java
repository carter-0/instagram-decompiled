package X;

import android.content.Context;
import android.content.Intent;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import com.facebook.cameracore.mediapipeline.services.analyticslogger.implementation.AnalyticsLoggerImpl;
import com.facebook.cameracore.mediapipeline.services.analyticslogger.interfaces.AnalyticsLogger;
import com.facebook.cameracore.util.memory.VersionedSharedMemory;
import com.meta.arfx.engine.interfaces.IARAnalyticsLoggerHost;
import com.meta.arfx.engine.interfaces.IARNetworkClientWorkerHost;
import java.nio.ByteBuffer;

/* renamed from: X.8t4  reason: invalid class name and case insensitive filesystem */
public final class C368648t4 {
    public SurfaceTexture A00;
    public Surface A01;
    public VersionedSharedMemory A02;
    public C345937uK A03;
    public C346337v0 A04;
    public C346337v0 A05;
    public C345977uO A06;
    public ByteBuffer A07;
    public boolean A08;
    public final SurfaceTexture.OnFrameAvailableListener A09 = new AL8(this);
    public final AnalyticsLogger A0A;
    public final C344557s3 A0B = C344577s5.A00(2);
    public final AIb A0C;
    public final A6T A0D;
    public final Context A0E;
    public final Intent A0F;
    public final C40107ARu A0G;
    public final C345557ti A0H;

    public C368648t4(Context context, Intent intent, C312546ef r12, C40107ARu aRu, A6T a6t, IARAnalyticsLoggerHost iARAnalyticsLoggerHost, IARNetworkClientWorkerHost iARNetworkClientWorkerHost) {
        this.A0E = context;
        this.A0F = intent;
        this.A0D = a6t;
        this.A0G = aRu;
        this.A0H = new C345557ti(context.getResources());
        this.A0C = new AIb(context, intent, aRu, new A3K(this), a6t, iARAnalyticsLoggerHost, iARNetworkClientWorkerHost);
        this.A0A = new AnalyticsLoggerImpl(r12, (AnonymousClass1YL) null, C312586ej.USE_DEFAULT);
    }

    public static final void A00(C346337v0 r14, C368648t4 r15, float[] fArr, int i, int i2, boolean z) {
        C345977uO r0;
        C346337v0 r2 = r14;
        if (r14 != null && (r0 = r15.A06) != null) {
            C345557ti r1 = r15.A0H;
            float[] fArr2 = C345977uO.A05;
            r0.A01(r1, r2, (C361238ft) null, fArr, fArr2, fArr2, fArr2, 3, 0, i, i2, z, true, false, false, false);
        }
    }

    public static final void A01(C368648t4 r3) {
        r3.A0C.A07((VersionedSharedMemory) null);
        VersionedSharedMemory versionedSharedMemory = r3.A02;
        if (versionedSharedMemory != null) {
            versionedSharedMemory.unmap(r3.A07);
        }
        r3.A07 = null;
        VersionedSharedMemory versionedSharedMemory2 = r3.A02;
        if (versionedSharedMemory2 != null) {
            versionedSharedMemory2.close();
        }
        r3.A02 = null;
    }

    public final void A02() {
        AIb aIb = this.A0C;
        if (aIb.A0A != null) {
            0KC.A02(AIb.class, "Service already running");
            return;
        }
        synchronized (aIb.A0b) {
            aIb.A0V.bindService(aIb.A0W, aIb.A0X, 65);
        }
    }

    public final void finalize() {
        SurfaceTexture surfaceTexture = this.A00;
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
        this.A00 = null;
        C346337v0 r0 = this.A05;
        if (r0 != null) {
            r0.A01();
        }
        this.A05 = null;
        this.A08 = false;
        C345937uK r02 = this.A03;
        if (r02 != null) {
            r02.A02();
        }
        this.A03 = null;
        Surface surface = this.A01;
        if (surface != null) {
            surface.release();
        }
        this.A01 = null;
        C346337v0 r03 = this.A04;
        if (r03 != null) {
            r03.A01();
        }
        this.A04 = null;
        C345977uO r04 = this.A06;
        if (r04 != null) {
            r04.A00();
        }
        AIb aIb = this.A0C;
        if (aIb.A0A != null) {
            synchronized (aIb.A0b) {
                Context context = aIb.A0V;
                context.stopService(aIb.A0W);
                context.unbindService(aIb.A0X);
                aIb.A0A = null;
            }
        }
        Integer num = AnonymousClass05K.A00;
        aIb.A0D = num;
        aIb.A0E = num;
        aIb.A0F = num;
        aIb.A0B = num;
        aIb.A0C = num;
        C344557s3 r05 = this.A0B;
        if (r05 != null) {
            r05.release();
        }
    }
}
