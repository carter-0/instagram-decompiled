package X;

import android.hardware.camera2.CaptureRequest;
import android.os.SystemClock;
import java.lang.ref.WeakReference;

/* renamed from: X.8kq  reason: invalid class name and case insensitive filesystem */
public final class C364088kq implements C343197pp, C340897m0 {
    public static final float[] A0A = new float[4];
    public static final int[] A0B = new int[18];
    public Long A00;
    public WeakReference A01 = new WeakReference((Object) null);
    public final C343567qQ A02;
    public final C340627lZ A03;
    public final C364098kr A04 = new C364098kr(this);
    public final boolean A05;
    public final C340917m2 A06;
    public volatile C346357v2 A07 = new RuntimeException("Uninitialized exception.");
    public volatile C364128ku A08;
    public volatile Boolean A09;

    public final void ADv() {
        this.A03.A00();
    }

    public final /* bridge */ /* synthetic */ Object Bny() {
        if (this.A09 == null) {
            throw new IllegalStateException("Photo capture operation hasn't completed yet.");
        } else if (this.A09.booleanValue()) {
            C364128ku r1 = this.A08;
            if (r1 != null && (r1.A04 != null || r1.A01 != null)) {
                return r1;
            }
            throw new IllegalStateException("Photo capture data is null.");
        } else {
            throw this.A07;
        }
    }

    public final void D10(C343297pz r2, C343347q4 r3) {
        this.A01.clear();
    }

    public final void DPR(int i) {
        C364018kj r1 = (C364018kj) this.A01.get();
        if (r1 != null) {
            r1.DaE((float) i);
        }
        if (i == 100) {
            this.A01.clear();
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.7v2, java.lang.RuntimeException] */
    public C364088kq(boolean z, boolean z2) {
        long j;
        C364108ks r3 = new C364108ks(this);
        this.A06 = r3;
        this.A05 = z;
        if (z2) {
            j = 20000;
        } else {
            j = 10000;
        }
        C340627lZ r0 = new C340627lZ();
        this.A03 = r0;
        r0.A00 = r3;
        r0.A02(j);
        this.A02 = new C343567qQ();
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0025 */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002f A[Catch:{ IllegalArgumentException -> 0x0039 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void D0w(X.C343297pz r5, X.C343337q3 r6) {
        /*
            r4 = this;
            X.8l9 r3 = X.C364268l9.A00()
            long r1 = r3.A03
            r0 = 6
            X.C364268l9.A01(r3, r0, r1)
            X.7qQ r0 = r4.A02
            X.7qR r3 = r0.A00(r6)
            r2 = 0
            android.hardware.camera2.CaptureResult$Key r0 = android.hardware.camera2.CaptureResult.COLOR_CORRECTION_GAINS     // Catch:{ IllegalArgumentException -> 0x0025 }
            java.lang.Object r0 = r6.A00(r0)     // Catch:{ IllegalArgumentException -> 0x0025 }
            android.hardware.camera2.params.RggbChannelVector r0 = (android.hardware.camera2.params.RggbChannelVector) r0     // Catch:{ IllegalArgumentException -> 0x0025 }
            if (r0 == 0) goto L_0x0025
            float[] r1 = A0A     // Catch:{ IllegalArgumentException -> 0x0025 }
            r0.copyTo(r1, r2)     // Catch:{ IllegalArgumentException -> 0x0025 }
            X.937 r0 = X.C343577qR.A0H     // Catch:{ IllegalArgumentException -> 0x0025 }
            r3.A01(r0, r1)     // Catch:{ IllegalArgumentException -> 0x0025 }
        L_0x0025:
            android.hardware.camera2.CaptureResult$Key r0 = android.hardware.camera2.CaptureResult.COLOR_CORRECTION_TRANSFORM     // Catch:{ IllegalArgumentException -> 0x0039 }
            java.lang.Object r0 = r6.A00(r0)     // Catch:{ IllegalArgumentException -> 0x0039 }
            android.hardware.camera2.params.ColorSpaceTransform r0 = (android.hardware.camera2.params.ColorSpaceTransform) r0     // Catch:{ IllegalArgumentException -> 0x0039 }
            if (r0 == 0) goto L_0x0039
            int[] r1 = A0B     // Catch:{ IllegalArgumentException -> 0x0039 }
            r0.copyElements(r1, r2)     // Catch:{ IllegalArgumentException -> 0x0039 }
            X.937 r0 = X.C343577qR.A0I     // Catch:{ IllegalArgumentException -> 0x0039 }
            r3.A01(r0, r1)     // Catch:{ IllegalArgumentException -> 0x0039 }
        L_0x0039:
            android.hardware.camera2.CaptureResult$Key r0 = android.hardware.camera2.CaptureResult.SENSOR_EXPOSURE_TIME
            java.lang.Object r0 = r6.A00(r0)
            java.lang.Long r0 = (java.lang.Long) r0
            r4.A00 = r0
            boolean r0 = r4.A05
            if (r0 == 0) goto L_0x0056
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            java.lang.Boolean r0 = r4.A09
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0056
            X.7lZ r0 = r4.A03
            r0.A01()
        L_0x0056:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C364088kq.D0w(X.7pz, X.7q3):void");
    }

    public final void D18(CaptureRequest captureRequest, C343297pz r5, long j, long j2) {
        C364268l9.A00().A03 = SystemClock.elapsedRealtime();
    }
}
