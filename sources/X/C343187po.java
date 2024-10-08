package X;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;

/* renamed from: X.7po  reason: invalid class name and case insensitive filesystem */
public final class C343187po implements C343197pp, C340897m0 {
    public static int A0L = 16;
    public static int A0M = 400;
    public static long A0N = 30000000;
    public static int A0O;
    public static boolean A0P;
    public static boolean A0Q;
    public static final float[] A0R = new float[4];
    public static final int[] A0S = new int[18];
    public C21367XYw A00;
    public C346357v2 A01;
    public C340707lh A02;
    public C340677le A03;
    public C340717li A04;
    public C3724490w A05;
    public C3724690y A06;
    public C346347v1 A07;
    public C340857lw A08;
    public C343567qQ A09;
    public C343297pz A0A;
    public Boolean A0B;
    public Integer A0C;
    public boolean A0D;
    public int A0E = 0;
    public final C340627lZ A0F;
    public final C340917m2 A0G;
    public volatile int A0H = 0;
    public volatile boolean A0I;
    public volatile boolean A0J;
    public volatile boolean A0K;

    private void A00(C343297pz r3) {
        if (this.A0H == 1) {
            this.A0H = 0;
            this.A0B = true;
            this.A0A = r3;
            this.A0F.A01();
            C340857lw r0 = this.A08;
            if (r0 != null) {
                r0.DZE();
                return;
            }
            return;
        }
        throw new RuntimeException("Starting preview outside BLOCK_STATE_STARTING_PREVIEW state");
    }

    private void A01(C343297pz r3) {
        if (this.A0H == 7) {
            this.A0H = 0;
            this.A0B = true;
            this.A0A = r3;
            this.A0F.A01();
            return;
        }
        throw new RuntimeException("Starting recording outside BLOCK_STATE_STARTING_RECORD state");
    }

    public static boolean A02(C343337q3 r10) {
        Number number = (Number) r10.A00(CaptureResult.SENSOR_EXPOSURE_TIME);
        Number number2 = (Number) r10.A00(CaptureResult.SENSOR_SENSITIVITY);
        if (number == null || number2 == null) {
            return false;
        }
        boolean z = A0Q;
        long longValue = number.longValue();
        if (!z) {
            if (longValue <= A0N || number2.intValue() <= A0M) {
                return false;
            }
        } else if (((double) longValue) <= ((double) A0N) * 0.5d || ((double) number2.intValue()) <= ((double) A0M) * 0.5d) {
            return false;
        }
        return true;
    }

    public final void ADv() {
        this.A0F.A00();
    }

    public final /* bridge */ /* synthetic */ Object Bny() {
        Boolean bool = this.A0B;
        if (bool == null) {
            throw new IllegalStateException("Start Preview operation hasn't completed yet.");
        } else if (bool.booleanValue()) {
            return this.A0A;
        } else {
            throw this.A01;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(9:26|27|28|(1:30)|31|32|(1:34)|35|(1:38)) */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x01d3, code lost:
        if (r0 != 5) goto L_0x01e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x01e0, code lost:
        if (r7.intValue() != 4) goto L_0x01e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x013f, code lost:
        if (((java.lang.Integer) r10.A00(r1)).intValue() < 370) goto L_0x0141;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0154, code lost:
        if (r3 < r1) goto L_0x0156;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0068 */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0180  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0072 A[Catch:{ IllegalArgumentException -> 0x007c }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x015b  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0165  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void D0w(X.C343297pz r9, X.C343337q3 r10) {
        /*
            r8 = this;
            boolean r0 = r8.A0J
            if (r0 == 0) goto L_0x029a
            X.XYw r0 = r8.A00
            if (r0 == 0) goto L_0x0017
            X.XyF r2 = r0.A00
            boolean r0 = r2.A0K
            if (r0 == 0) goto L_0x0017
            android.os.Handler r1 = r2.A01
            if (r1 == 0) goto L_0x0017
            java.lang.Runnable r0 = r2.A09
            r1.post(r0)
        L_0x0017:
            android.hardware.camera2.CaptureResult$Key r0 = android.hardware.camera2.CaptureResult.CONTROL_AE_STATE
            java.lang.Object r0 = r10.A00(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x0047
            int r1 = r0.intValue()
            int r0 = r8.A0E
            if (r1 == r0) goto L_0x0047
            r8.A0E = r1
            X.90w r0 = r8.A05
            if (r0 == 0) goto L_0x0047
            X.AsR r5 = r0.A00
            X.7lt r4 = r5.A01
            boolean r0 = r4.A0C
            if (r0 == 0) goto L_0x0047
            boolean r0 = r4.A0E
            if (r0 != 0) goto L_0x0047
            r0 = 1
            if (r1 != r0) goto L_0x0047
            r1 = 0
            android.hardware.camera2.CaptureRequest$Builder r3 = r5.A00
            X.7po r0 = r5.A02
            r4.A02(r3, r0, r1)
        L_0x0047:
            boolean r0 = r8.A0K
            if (r0 == 0) goto L_0x0083
            X.7qQ r0 = r8.A09
            if (r0 == 0) goto L_0x0083
            X.7qR r3 = r0.A00(r10)
            r2 = 0
            android.hardware.camera2.CaptureResult$Key r0 = android.hardware.camera2.CaptureResult.COLOR_CORRECTION_GAINS     // Catch:{ IllegalArgumentException -> 0x0068 }
            java.lang.Object r0 = r10.A00(r0)     // Catch:{ IllegalArgumentException -> 0x0068 }
            android.hardware.camera2.params.RggbChannelVector r0 = (android.hardware.camera2.params.RggbChannelVector) r0     // Catch:{ IllegalArgumentException -> 0x0068 }
            if (r0 == 0) goto L_0x0068
            float[] r1 = A0R     // Catch:{ IllegalArgumentException -> 0x0068 }
            r0.copyTo(r1, r2)     // Catch:{ IllegalArgumentException -> 0x0068 }
            X.937 r0 = X.C343577qR.A0H     // Catch:{ IllegalArgumentException -> 0x0068 }
            r3.A01(r0, r1)     // Catch:{ IllegalArgumentException -> 0x0068 }
        L_0x0068:
            android.hardware.camera2.CaptureResult$Key r0 = android.hardware.camera2.CaptureResult.COLOR_CORRECTION_TRANSFORM     // Catch:{ IllegalArgumentException -> 0x007c }
            java.lang.Object r0 = r10.A00(r0)     // Catch:{ IllegalArgumentException -> 0x007c }
            android.hardware.camera2.params.ColorSpaceTransform r0 = (android.hardware.camera2.params.ColorSpaceTransform) r0     // Catch:{ IllegalArgumentException -> 0x007c }
            if (r0 == 0) goto L_0x007c
            int[] r1 = A0S     // Catch:{ IllegalArgumentException -> 0x007c }
            r0.copyElements(r1, r2)     // Catch:{ IllegalArgumentException -> 0x007c }
            X.937 r0 = X.C343577qR.A0I     // Catch:{ IllegalArgumentException -> 0x007c }
            r3.A01(r0, r1)     // Catch:{ IllegalArgumentException -> 0x007c }
        L_0x007c:
            X.7v1 r0 = r8.A07
            if (r0 == 0) goto L_0x0083
            r0.DGo(r8)
        L_0x0083:
            boolean r0 = r8.A0I
            if (r0 == 0) goto L_0x008c
            android.hardware.camera2.CaptureResult$Key r0 = android.hardware.camera2.CaptureResult.SENSOR_EXPOSURE_TIME
            r10.A00(r0)
        L_0x008c:
            X.7lh r0 = r8.A02
            if (r0 == 0) goto L_0x0174
            java.lang.String r1 = android.os.Build.MANUFACTURER
            java.lang.String r0 = "samsung"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L_0x00ba
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 29
            if (r1 < r0) goto L_0x0143
            java.lang.Class<java.lang.Integer> r2 = java.lang.Integer.class
            java.lang.String r1 = "samsung.android.control.nightModeSuggestion"
            android.hardware.camera2.CaptureResult$Key r0 = new android.hardware.camera2.CaptureResult$Key
            r0.<init>(r1, r2)
            java.lang.Object r0 = r10.A00(r0)     // Catch:{ IllegalArgumentException -> 0x0143 }
            java.lang.Number r0 = (java.lang.Number) r0     // Catch:{ IllegalArgumentException -> 0x0143 }
            if (r0 == 0) goto L_0x0143
            int r0 = r0.intValue()     // Catch:{ IllegalArgumentException -> 0x0143 }
            r5 = 1
            if (r0 != r5) goto L_0x0187
            goto L_0x0156
        L_0x00ba:
            java.lang.String r0 = "google"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L_0x00e8
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 29
            if (r1 < r0) goto L_0x0143
            java.lang.Class<float[]> r2 = float[].class
            java.lang.String r1 = "com.google.pixel.experimental2019.GcamAE.Output"
            android.hardware.camera2.CaptureResult$Key r0 = new android.hardware.camera2.CaptureResult$Key
            r0.<init>(r1, r2)
            java.lang.Object r1 = r10.A00(r0)     // Catch:{  }
            float[] r1 = (float[]) r1     // Catch:{  }
            if (r1 == 0) goto L_0x0143
            r0 = 6
            r1 = r1[r0]     // Catch:{  }
            boolean r0 = A0Q     // Catch:{  }
            r5 = 1
            double r3 = (double) r1     // Catch:{  }
            if (r0 != 0) goto L_0x014d
            r1 = -4609749470587618591(0xc006e147ae147ae1, double:-2.86)
            goto L_0x0152
        L_0x00e8:
            java.lang.String r0 = "xiaomi"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L_0x0116
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 29
            if (r1 < r0) goto L_0x0143
            java.lang.String r2 = "org.quic.camera2.statsconfigs.AECLuxIndex"
            java.lang.Class<java.lang.Float> r0 = java.lang.Float.class
            android.hardware.camera2.CaptureResult$Key r1 = new android.hardware.camera2.CaptureResult$Key     // Catch:{  }
            r1.<init>(r2, r0)     // Catch:{  }
            java.lang.Object r0 = r10.A00(r1)     // Catch:{  }
            if (r0 == 0) goto L_0x0187
            java.lang.Object r0 = r10.A00(r1)     // Catch:{  }
            java.lang.Float r0 = (java.lang.Float) r0     // Catch:{  }
            float r1 = r0.floatValue()     // Catch:{  }
            r0 = 1138819072(0x43e10000, float:450.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0187
            goto L_0x0141
        L_0x0116:
            java.lang.String r0 = "vivo"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L_0x0148
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 29
            if (r1 < r0) goto L_0x0143
            java.lang.String r2 = "vivo.feedback.aeluxindex"
            java.lang.Class<java.lang.Integer> r0 = java.lang.Integer.class
            android.hardware.camera2.CaptureResult$Key r1 = new android.hardware.camera2.CaptureResult$Key     // Catch:{  }
            r1.<init>(r2, r0)     // Catch:{  }
            java.lang.Object r0 = r10.A00(r1)     // Catch:{  }
            if (r0 == 0) goto L_0x0187
            java.lang.Object r0 = r10.A00(r1)     // Catch:{  }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{  }
            int r1 = r0.intValue()     // Catch:{  }
            r0 = 370(0x172, float:5.18E-43)
            if (r1 >= r0) goto L_0x0187
        L_0x0141:
            r5 = 1
            goto L_0x0156
        L_0x0143:
            boolean r5 = A02(r10)
            goto L_0x0156
        L_0x0148:
            boolean r5 = A02(r10)
            goto L_0x0156
        L_0x014d:
            r1 = -4611010478483282330(0xc002666666666666, double:-2.3)
        L_0x0152:
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0187
        L_0x0156:
            boolean r3 = A0P
            r2 = 0
            if (r5 == r3) goto L_0x0180
            A0P = r5
            r3 = r5
            A0O = r2
            r0 = 0
        L_0x0161:
            int r1 = A0L
            if (r0 < r1) goto L_0x0174
            X.7lh r1 = r8.A02
            r0 = 0
            if (r3 == 0) goto L_0x016b
            r0 = 2
        L_0x016b:
            r1.DPS(r0)
            boolean r0 = A0P
            A0Q = r0
            A0O = r2
        L_0x0174:
            X.7li r0 = r8.A04
            if (r0 == 0) goto L_0x01af
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 35
            if (r1 < r0) goto L_0x01a5
            r2 = 0
            goto L_0x0189
        L_0x0180:
            int r0 = A0O
            int r0 = r0 + 1
            A0O = r0
            goto L_0x0161
        L_0x0187:
            r5 = 0
            goto L_0x0156
        L_0x0189:
            java.lang.Class<android.hardware.camera2.CaptureResult> r1 = android.hardware.camera2.CaptureResult.class
            java.lang.String r0 = "CONTROL_LOW_LIGHT_BOOST_STATE"
            java.lang.reflect.Field r0 = r1.getField(r0)     // Catch:{ IllegalAccessException | IllegalArgumentException | NoSuchFieldException -> 0x0198 }
            java.lang.Object r0 = r0.get(r2)     // Catch:{ IllegalAccessException | IllegalArgumentException | NoSuchFieldException -> 0x0198 }
            android.hardware.camera2.CaptureResult$Key r0 = (android.hardware.camera2.CaptureResult.Key) r0     // Catch:{ IllegalAccessException | IllegalArgumentException | NoSuchFieldException -> 0x0198 }
            r2 = r0
        L_0x0198:
            if (r2 == 0) goto L_0x01a5
            java.lang.Object r0 = r10.A00(r2)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x01a5
            r0.intValue()
        L_0x01a5:
            X.7li r1 = r8.A04
            X.AiZ r0 = new X.AiZ
            r0.<init>(r1)
            X.C342057ny.A00(r0)
        L_0x01af:
            X.90y r0 = r8.A06
            r3 = 0
            r2 = 1
            r4 = 5
            r5 = 4
            if (r0 == 0) goto L_0x01e6
            android.hardware.camera2.CaptureResult$Key r0 = android.hardware.camera2.CaptureResult.CONTROL_AF_STATE
            java.lang.Object r7 = r10.A00(r0)
            java.lang.Number r7 = (java.lang.Number) r7
            if (r7 == 0) goto L_0x01d5
            X.90y r6 = r8.A06
            if (r6 == 0) goto L_0x01cd
            int r1 = r7.intValue()
            if (r1 != r2) goto L_0x01ee
            r8.A0D = r2
        L_0x01cd:
            int r0 = r7.intValue()
            if (r0 == r5) goto L_0x01d5
            if (r0 != r4) goto L_0x01e6
        L_0x01d5:
            X.90y r6 = r8.A06
            if (r6 == 0) goto L_0x01e6
            if (r7 == 0) goto L_0x01e2
            int r1 = r7.intValue()
            r0 = 1
            if (r1 == r5) goto L_0x01e3
        L_0x01e2:
            r0 = 0
        L_0x01e3:
            r6.DGC(r0)
        L_0x01e6:
            int r0 = r8.A0H
            if (r0 != r2) goto L_0x0202
            r8.A00(r9)
            return
        L_0x01ee:
            boolean r0 = r8.A0D
            if (r0 == 0) goto L_0x01cd
            r0 = 2
            if (r1 != r0) goto L_0x01fb
            r6.DGC(r2)
        L_0x01f8:
            r8.A0D = r3
            goto L_0x01cd
        L_0x01fb:
            r0 = 6
            if (r1 != r0) goto L_0x01cd
            r6.DGC(r3)
            goto L_0x01f8
        L_0x0202:
            int r1 = r8.A0H
            r0 = 7
            if (r1 != r0) goto L_0x020b
            r8.A01(r9)
            return
        L_0x020b:
            int r0 = r8.A0H
            r1 = 2
            if (r0 != r1) goto L_0x0238
            android.hardware.camera2.CaptureResult$Key r0 = android.hardware.camera2.CaptureResult.CONTROL_AE_STATE
            java.lang.Object r0 = r10.A00(r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
            r8.A0C = r0
            android.hardware.camera2.CaptureResult$Key r0 = android.hardware.camera2.CaptureResult.CONTROL_AF_STATE
            java.lang.Object r0 = r10.A00(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x022c
            int r0 = r0.intValue()
            if (r0 == r5) goto L_0x022c
            if (r0 != r4) goto L_0x029a
        L_0x022c:
            int r0 = r8.A0H
            if (r0 != r1) goto L_0x029a
        L_0x0230:
            r8.A0H = r3
            X.7lZ r0 = r8.A0F
            r0.A01()
            return
        L_0x0238:
            int r1 = r8.A0H
            r0 = 3
            if (r1 != r0) goto L_0x0252
            android.hardware.camera2.CaptureResult$Key r0 = android.hardware.camera2.CaptureResult.CONTROL_AE_STATE
            java.lang.Object r0 = r10.A00(r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
            r8.A0C = r0
            if (r0 == 0) goto L_0x024f
            int r0 = r0.intValue()
            if (r0 != r4) goto L_0x029a
        L_0x024f:
            r8.A0H = r5
            return
        L_0x0252:
            int r0 = r8.A0H
            if (r0 != r5) goto L_0x0269
            android.hardware.camera2.CaptureResult$Key r0 = android.hardware.camera2.CaptureResult.CONTROL_AE_STATE
            java.lang.Object r0 = r10.A00(r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
            r8.A0C = r0
            if (r0 == 0) goto L_0x0230
            int r0 = r0.intValue()
            if (r0 == r4) goto L_0x029a
            goto L_0x0230
        L_0x0269:
            int r0 = r8.A0H
            r1 = 6
            if (r0 != r4) goto L_0x0283
            android.hardware.camera2.CaptureResult$Key r0 = android.hardware.camera2.CaptureResult.CONTROL_AE_STATE
            java.lang.Object r0 = r10.A00(r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
            r8.A0C = r0
            if (r0 == 0) goto L_0x0280
            int r0 = r0.intValue()
            if (r0 != r2) goto L_0x029a
        L_0x0280:
            r8.A0H = r1
            return
        L_0x0283:
            int r0 = r8.A0H
            if (r0 != r1) goto L_0x029a
            android.hardware.camera2.CaptureResult$Key r0 = android.hardware.camera2.CaptureResult.CONTROL_AE_STATE
            java.lang.Object r0 = r10.A00(r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
            r8.A0C = r0
            if (r0 == 0) goto L_0x0230
            int r0 = r0.intValue()
            if (r0 == r2) goto L_0x029a
            goto L_0x0230
        L_0x029a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C343187po.D0w(X.7pz, X.7q3):void");
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [X.7v2, java.lang.RuntimeException] */
    public final void D10(C343297pz r3, C343347q4 r4) {
        C341877nf r1;
        if (!this.A0J) {
            return;
        }
        if (this.A0H == 1 || this.A0H == 7) {
            this.A0H = 0;
            this.A0B = false;
            this.A01 = new RuntimeException(002.A0O("Failed to start operation. Reason: ", r4.A00));
            C340677le r0 = this.A03;
            if (!(r0 == null || (r1 = r0.A00.A0l) == null || r1.A00.isEmpty())) {
                C342057ny.A00(new C40745Aib(r1));
            }
            this.A0F.A01();
        }
    }

    public final void D18(CaptureRequest captureRequest, C343297pz r4, long j, long j2) {
        if (!this.A0J) {
            return;
        }
        if (this.A0H == 1) {
            A00(r4);
        } else if (this.A0H == 7) {
            A01(r4);
        }
    }

    public C343187po() {
        C343207pq r1 = new C343207pq(this);
        this.A0G = r1;
        this.A0J = true;
        C340627lZ r0 = new C340627lZ();
        this.A0F = r0;
        r0.A00 = r1;
    }

    public final void DPR(int i) {
    }
}
