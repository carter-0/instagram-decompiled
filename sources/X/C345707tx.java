package X;

import android.content.Context;
import android.graphics.Matrix;
import android.os.Looper;
import android.os.SystemClock;
import android.view.Display;
import android.view.TextureView;
import java.util.Map;

/* renamed from: X.7tx  reason: invalid class name and case insensitive filesystem */
public final class C345707tx extends C345597tm {
    public int A00;
    public int A01;
    public int A02 = -1;
    public int A03;
    public int A04;
    public Display A05;
    public TextureView A06;
    public C13554TcQ A07;
    public C70666OFn A08;
    public A3A A09;
    public A3B A0A;
    public C382459dj A0B;
    public C41790B0t A0C;
    public C344337rh A0D;
    public C341007mB A0E;
    public C365938nv A0F;
    public C340947m5 A0G;
    public B17 A0H;
    public AnonymousClass8FP A0I;
    public AnonymousClass8GD A0J;
    public AnonymousClass8GD A0K;
    public C343367q6 A0L;
    public Float A0M;
    public Integer A0N;
    public boolean A0O = true;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R = true;
    public int A0S = 0;
    public int A0T = 0;
    public int A0U = 0;
    public C39878ACz A0V;
    public C343967r6 A0W;
    public C340147km A0X;
    public C340557lS A0Y;
    public C341047mF A0Z;
    public boolean A0a = true;
    public boolean A0b = false;
    public boolean A0c;
    public final C3496981j A0d = new C3496981j();
    public final C340607lX A0e;
    public final Context A0f;
    public final C343927r2 A0g;
    public final C340277l0 A0h;
    public final String A0i;
    public volatile boolean A0j;

    public static void A07(C345707tx r8, C343367q6 r9, int i, int i2) {
        C343047pa r0;
        int i3 = i;
        if (i > 0) {
            int i4 = i2;
            if (i2 > 0 && (r0 = (C343047pa) r9.A03.A02(C342717p3.A0q)) != null) {
                Matrix matrix = new Matrix();
                C340607lX r1 = r8.A0e;
                if (r1.ErX(matrix, i3, i4, r0.A02, r0.A01, r8.A0a)) {
                    r1.CMz(matrix, i, i2, r9.A01);
                    if (r8.A06 != null && !A01(r8).FNS()) {
                        C343927r2 r02 = r8.A0g;
                        ((C343897qz) r02).A00.post(new C40940Alm(matrix, r8));
                    }
                }
            }
        }
    }

    public final void EUU(boolean z) {
        this.A0O = false;
    }

    public final void Efj(boolean z) {
        C70666OFn oFn = this.A08;
        if (oFn == null) {
            oFn = new C70666OFn(this.A0e);
            this.A08 = oFn;
        }
        oFn.A03 = false;
    }

    public final void ElP(boolean z) {
        this.A0R = false;
    }

    public static C340557lS A00(C345707tx r4) {
        Looper mainLooper;
        C343717qg r1 = B3Q.A00;
        C343837qt r0 = r4.A00;
        r0.getClass();
        if (r0.CQN(r1)) {
            C343837qt r02 = r4.A00;
            r02.getClass();
            r02.Ape(r1);
            throw new NullPointerException("getCameraEventLogger");
        }
        C343937r3 r2 = C344037rD.A00;
        C343837qt r03 = r4.A00;
        r03.getClass();
        if (r03.CQO(r2)) {
            C343937r3 r12 = C343927r2.A00;
            C343837qt r04 = r4.A00;
            r04.getClass();
            if (r04.CQO(r12) && r4.A0Y == null) {
                C343837qt r05 = r4.A00;
                r05.getClass();
                C343927r2 r3 = (C343927r2) r05.Apf(r12);
                C343837qt r06 = r4.A00;
                r06.getClass();
                C344037rD r22 = (C344037rD) r06.Apf(r2);
                C343967r6 r13 = r4.A0W;
                if (r13 == null || !r13.CTO(110)) {
                    mainLooper = Looper.getMainLooper();
                } else {
                    mainLooper = r3.BAM("Lite-Controller-Thread").getLooper();
                }
                r4.A0Y = new C341397mo(r22, new C340227ku(mainLooper));
            }
        }
        return r4.A0Y;
    }

    public static C341047mF A01(C345707tx r2) {
        C341047mF r0 = r2.A0Z;
        if (r0 == null) {
            C343717qg r1 = C344397rn.A00;
            C343837qt r02 = r2.A00;
            r02.getClass();
            r0 = ((C344397rn) r02.Ape(r1)).C3L();
            r2.A0Z = r0;
        }
        r0.getClass();
        return r0;
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [X.7kr, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r4v0, types: [X.9dj, X.7kn] */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x007b, code lost:
        if (r2 != null) goto L_0x007d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00ca  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A02(X.C345707tx r17) {
        /*
            r0 = r17
            boolean r1 = r0.A0P
            if (r1 == 0) goto L_0x00d4
            android.os.SystemClock.elapsedRealtime()
            android.os.SystemClock.elapsedRealtime()
            X.7km r8 = r0.A0X
            if (r8 != 0) goto L_0x001b
            int r3 = r0.A0T
            int r2 = r0.A0S
            int r1 = r0.A0U
            X.AUv r8 = new X.AUv
            r8.<init>(r3, r2, r1)
        L_0x001b:
            X.7kp r6 = X.C340177kp.HIGH
            java.util.Map r1 = X.C340157kn.A01
            X.7kr r5 = new X.7kr
            r5.<init>()
            X.7qg r2 = X.C344397rn.A00
            X.7qt r1 = r0.A00
            r1.getClass()
            X.7qe r1 = r1.Ape(r2)
            X.7rn r1 = (X.C344397rn) r1
            boolean r9 = r1.EAg()
            boolean r10 = r0.A0b
            r3 = 0
            boolean r1 = r0.A0c
            r11 = r1 ^ 1
            java.lang.Integer r2 = r0.A0N
            X.7r6 r1 = r0.A0W
            X.9dj r4 = new X.9dj
            r7 = r6
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            r4.A01 = r2
            r4.A00 = r1
            X.7ks r2 = X.C340167ko.A06
            r8 = 1
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r8)
            r4.A00(r2, r1)
            X.7ks r2 = X.C340167ko.A0C
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r3)
            r4.A00(r2, r1)
            r0.A0B = r4
            int r7 = r0.A01
            int r6 = r0.A00
            X.7mF r5 = A01(r0)
            r10 = 0
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            android.view.Display r2 = r0.A05     // Catch:{ RuntimeException -> 0x0081 }
            android.view.TextureView r1 = r0.A06     // Catch:{ RuntimeException -> 0x0081 }
            if (r2 != 0) goto L_0x007d
            if (r1 == 0) goto L_0x0081
            android.view.Display r2 = r1.getDisplay()     // Catch:{ RuntimeException -> 0x0081 }
            r0.A05 = r2     // Catch:{ RuntimeException -> 0x0081 }
            if (r2 == 0) goto L_0x0081
        L_0x007d:
            int r3 = r2.getRotation()     // Catch:{ RuntimeException -> 0x0081 }
        L_0x0081:
            r0.A02 = r3
            X.7lX r9 = r0.A0e
            X.8nv r1 = r0.A0F
            if (r1 != 0) goto L_0x0090
            X.AUd r1 = new X.AUd
            r1.<init>(r0)
            r0.A0F = r1
        L_0x0090:
            r9.EWv(r1)
            java.lang.String r15 = r0.A0i
            int r1 = r0.A00
            r16 = 1
            if (r1 == 0) goto L_0x00a9
            if (r1 == r8) goto L_0x00ab
            java.lang.String r0 = "Could not convert camera facing to optic: "
            java.lang.String r1 = X.002.A0O(r0, r1)
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L_0x00a9:
            r16 = 0
        L_0x00ab:
            X.9dj r12 = r0.A0B
            X.7nz r14 = new X.7nz
            r14.<init>(r5, r4, r6, r7)
            X.7lS r13 = A00(r0)
            X.8GD r11 = r0.A0J
            if (r11 != 0) goto L_0x00c1
            X.9do r11 = new X.9do
            r11.<init>(r0)
            r0.A0J = r11
        L_0x00c1:
            r17 = r3
            r9.AJH(r10, r11, r12, r13, r14, r15, r16, r17)
            X.8FP r1 = r0.A0I
            if (r1 != 0) goto L_0x00d1
            X.AUk r1 = new X.AUk
            r1.<init>(r0)
            r0.A0I = r1
        L_0x00d1:
            r9.A9c(r1)
        L_0x00d4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C345707tx.A02(X.7tx):void");
    }

    public static void A04(C345707tx r3) {
        C340607lX r2 = r3.A0e;
        AnonymousClass8FP r0 = r3.A0I;
        if (r0 == null) {
            r0 = new C40170AUk(r3);
            r3.A0I = r0;
        }
        r2.EEK(r0);
        r2.EWv((C365938nv) null);
        C341007mB r02 = r3.A0E;
        if (r02 != null) {
            r2.EDc(r02);
        }
        r3.A0B = null;
        r3.A0j = false;
        r2.APU(new C382489dm(r3));
    }

    public static void A05(C345707tx r2) {
        if (r2.A0V == null) {
            r2.A0V = new C39878ACz(r2.A0g);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0019, code lost:
        if (r1 != null) goto L_0x001b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0023  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x002b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A06(X.C345707tx r4, X.C343367q6 r5) {
        /*
            X.7lX r3 = r4.A0e
            boolean r0 = r3.isConnected()
            if (r0 == 0) goto L_0x0035
            if (r5 == 0) goto L_0x0035
            r2 = 0
            android.view.Display r1 = r4.A05     // Catch:{ RuntimeException -> 0x001f }
            android.view.TextureView r0 = r4.A06     // Catch:{ RuntimeException -> 0x001f }
            if (r1 != 0) goto L_0x001b
            if (r0 == 0) goto L_0x001f
            android.view.Display r1 = r0.getDisplay()     // Catch:{ RuntimeException -> 0x001f }
            r4.A05 = r1     // Catch:{ RuntimeException -> 0x001f }
            if (r1 == 0) goto L_0x001f
        L_0x001b:
            int r2 = r1.getRotation()     // Catch:{ RuntimeException -> 0x001f }
        L_0x001f:
            int r0 = r4.A02
            if (r0 != r2) goto L_0x002b
            int r1 = r4.A04
            int r0 = r4.A03
            A07(r4, r5, r1, r0)
            return
        L_0x002b:
            r4.A02 = r2
            X.9dn r0 = new X.9dn
            r0.<init>(r4)
            r3.EgX(r0, r2)
        L_0x0035:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C345707tx.A06(X.7tx, X.7q6):void");
    }

    public static void A08(C345707tx r8, String str) {
        C344037rD r2;
        C343937r3 r1 = C344037rD.A00;
        C343837qt r0 = r8.A00;
        r0.getClass();
        if (r0.CQO(r1)) {
            C343837qt r02 = r8.A00;
            r02.getClass();
            r2 = (C344037rD) r02.Apf(r1);
        } else {
            r2 = null;
        }
        C340557lS A002 = A00(r8);
        if (r2 != null && A002 != null) {
            Map A7G = r2.A7G();
            C341397mo r12 = (C341397mo) A002;
            C342077o0 r03 = r12.A00;
            if (r03 == null) {
                r03 = new C342077o0(r12);
                r12.A00 = r03;
            }
            A7G.put("timestamp", String.valueOf(r03.A00.now()));
            r2.ChM((long) r8.hashCode(), str, "OpticControllerImpl", A7G);
            r2.ECg(A7G);
        }
    }

    public final void A9Z(A3C a3c) {
        this.A0d.A01(a3c);
    }

    public final C340607lX Ajm() {
        return this.A0e;
    }

    public final C343717qg BJt() {
        return C345607tn.A00;
    }

    public final boolean CY8() {
        return ((Boolean) A09(B36.A03, true)).booleanValue();
    }

    public final boolean Ccx() {
        return this.A0e.Ccx();
    }

    public final boolean Ce8() {
        if (this.A0h == C340277l0.CAMERA2) {
            return true;
        }
        return false;
    }

    public final void Eew(boolean z) {
        this.A0e.EdB(z);
    }

    public final void Efh(int i) {
        if (this.A0Q) {
            this.A0S = i;
            return;
        }
        throw new IllegalStateException("Photo resolution level must be set before initializing the camera.");
    }

    public final void Ega(int i) {
        if (this.A0Q) {
            this.A0T = i;
            return;
        }
        throw new IllegalStateException("Preview resolution level must be set before initializing the camera.");
    }

    public final void EqJ(int i) {
        if (this.A0Q) {
            this.A0U = i;
            return;
        }
        throw new IllegalStateException("Video resolution level must be set before initializing the camera.");
    }

    public final void EzJ() {
        if (!this.A0Q && this.A0P) {
            C340607lX r1 = this.A0e;
            if (r1.Ccx()) {
                SystemClock.elapsedRealtime();
                SystemClock.elapsedRealtime();
                A05(this);
                AnonymousClass8GD r0 = this.A0K;
                if (r0 == null) {
                    r0 = new C382519dp(this);
                    this.A0K = r0;
                }
                r1.EzI(r0);
            }
        }
    }

    public final void EzY(C364018kj r4, C363988kg r5) {
        AV0 av0 = new AV0(this, r4);
        if (this.A00 == 1) {
            A05(this);
        }
        this.A0e.EzY(av0, r5);
    }

    public final void enable(boolean z) {
        if (this.A0P != z) {
            this.A0P = z;
            if (this.A0Q) {
                return;
            }
            if (z) {
                A02(this);
            } else {
                A04(this);
            }
        }
    }

    public final void setInitialCameraFacing(int i) {
        if (this.A0Q) {
            this.A00 = i;
            return;
        }
        throw new IllegalStateException("Initial camera facing must be set before initializing the camera.");
    }

    public C345707tx(C343837qt r9) {
        super(r9);
        C340277l0 r6;
        C343837qt r0 = this.A00;
        r0.getClass();
        this.A0f = r0.getContext();
        C343667qb r3 = C343657qa.A02;
        C343837qt r02 = this.A00;
        r02.getClass();
        Object Apu = r02.Apu(r3);
        if (Apu != null) {
            this.A0i = (String) Apu;
            C343667qb r1 = B36.A04;
            C343837qt r03 = this.A00;
            r03.getClass();
            Boolean bool = (Boolean) r03.Apu(r1);
            if (bool == null) {
                C343837qt r04 = this.A00;
                r04.getClass();
                bool = Boolean.valueOf(AnonymousClass4x4.A00(r04.getContext(), false));
            }
            if (bool.booleanValue()) {
                r6 = C340277l0.CAMERA2;
            } else {
                r6 = C340277l0.CAMERA1;
            }
            this.A0h = r6;
            C343937r3 r12 = C343927r2.A00;
            C343837qt r05 = this.A00;
            r05.getClass();
            C343927r2 r4 = (C343927r2) r05.Apf(r12);
            this.A0g = r4;
            C343667qb r32 = B36.A00;
            C343837qt r06 = this.A00;
            r06.getClass();
            C340607lX r07 = (C340607lX) r06.Apu(r32);
            if (r07 == null) {
                C343837qt r08 = this.A00;
                r08.getClass();
                r07 = (C340607lX) A09(r32, C340587lV.A00(r08.getContext(), r4.BAM("Lite-Controller-Thread"), r6, false));
            }
            this.A0e = r07;
            this.A00 = 0;
            this.A0Q = true;
            this.A0P = true;
            this.A0b = ((Boolean) A09(B36.A02, false)).booleanValue();
            if (((Boolean) A09(B36.A01, false)).booleanValue()) {
                this.A0E = new C40162AUc(this);
            }
            C343937r3 r13 = C343967r6.A00;
            C343837qt r09 = this.A00;
            r09.getClass();
            if (r09.CQO(r13)) {
                C343837qt r010 = this.A00;
                r010.getClass();
                this.A0W = (C343967r6) r010.Apf(r13);
            }
            this.A01 = 1920;
            this.A00 = 1080;
            this.A0c = true;
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Configuration is not available: ");
        sb.append(r3);
        throw new IllegalArgumentException(sb.toString());
    }

    public final void A0B(float f) {
        C340607lX r3;
        C342687p0 A0A2 = A0A();
        if (A0A2 != null && ((Boolean) A0A2.A01(C342687p0.A0G)).booleanValue()) {
            this.A0M = Float.valueOf(f);
            C342687p0 A0A3 = A0A();
            if (A0A3 != null && (r3 = this.A0e) != null && r3.isConnected()) {
                float floatValue = ((Number) A0A3.A01(C342687p0.A01)).floatValue();
                float intValue = ((float) ((Number) A0A3.A01(C342687p0.A0k)).intValue()) * floatValue;
                float intValue2 = ((float) ((Number) A0A3.A01(C342687p0.A0g)).intValue()) * floatValue;
                if (f < intValue) {
                    f = intValue;
                } else if (f > intValue2) {
                    f = intValue2;
                }
                int round = Math.round(f / floatValue);
                C342757p7 r2 = new C342757p7();
                r2.A01(C342717p3.A09, Integer.valueOf(round));
                r3.CoY(new C341957no(), r2.A00());
            }
        }
    }

    public final void ElS(C340147km r1) {
        this.A0X = r1;
    }
}
