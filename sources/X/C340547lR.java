package X;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Log;
import android.view.OrientationEventListener;
import android.view.View;
import android.view.WindowManager;
import java.io.File;
import java.io.FileDescriptor;
import java.util.HashMap;

/* renamed from: X.7lR  reason: invalid class name and case insensitive filesystem */
public final class C340547lR {
    public int A00;
    public OrientationEventListener A01;
    public C341007mB A02;
    public C340947m5 A03;
    public C340177kp A04;
    public C340177kp A05;
    public C340167ko A06;
    public C340147km A07;
    public C343367q6 A08;
    public C340557lS A09 = null;
    public B2T A0A;
    public LOF A0B;
    public C340547lR A0C;
    public String A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public int A0J = -1;
    public int A0K = 0;
    public final C340277l0 A0L;
    public final C3496981j A0M;
    public final C340607lX A0N;
    public final C340467lJ A0O;
    public final C340957m6 A0P;
    public final C340527lP A0Q;
    public final C340537lQ A0R;
    public final boolean A0S;
    public final PackageManager A0T;
    public final AnonymousClass8GD A0U = new C340567lT(this);

    public final void A04() {
        this.A0G = true;
        C340957m6 r2 = this.A0P;
        if (r2 == null || !r2.A07) {
            A0I((AnonymousClass8GD) null, "onPause");
        } else if (r2.A04 != null) {
            C340577lU.A01("ConcurrentFrontBackController", "Pausing");
            C340957m6.A01(new C364528lZ(r2), r2, "onPauseConcurrentFrontBack");
        }
    }

    public final void A0F(boolean z) {
        C340957m6 r5;
        this.A0G = false;
        if (!z || (r5 = this.A0P) == null || !r5.A07) {
            if (this.A0O.CPC()) {
                A03();
            }
        } else if (r5.A04 != null) {
            C340607lX r2 = r5.A0F.A0N;
            r2.A9c(r5.A0B);
            r5.A04.A0N.A9c(r5.A0A);
            C340347l7 r1 = r5.A0C;
            r2.A9d(r1);
            r5.A04.A0N.A9d(r1);
            C340577lU.A01("ConcurrentFrontBackController", "Resuming concurrent front-back camera");
            int i = r5.A00;
            View view = r5.A04.A0O.getView();
            C364518lY r22 = new C364518lY(r5);
            r5.A07 = true;
            C340957m6.A01(new C364568ld(view, r22, r5, i), r5, "start");
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: X.7km} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: X.7km} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: X.7km} */
    /* JADX WARNING: type inference failed for: r1v0, types: [X.7kr, java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C340167ko A00(X.C340547lR r7) {
        /*
            X.7ko r0 = r7.A06
            if (r0 != 0) goto L_0x0028
            java.util.Map r0 = X.C340157kn.A01
            X.7kp r2 = r7.A04
            if (r2 != 0) goto L_0x000c
            X.7kp r2 = X.C340177kp.HIGH
        L_0x000c:
            X.7kp r3 = r7.A05
            if (r3 != 0) goto L_0x0012
            X.7kp r3 = X.C340177kp.HIGH
        L_0x0012:
            X.7km r4 = r7.A07
            if (r4 != 0) goto L_0x001b
            X.AUr r4 = new X.AUr
            r4.<init>()
        L_0x001b:
            X.7kr r1 = new X.7kr
            r1.<init>()
            r5 = 0
            X.7kn r0 = new X.7kn
            r6 = r5
            r7 = r5
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
        L_0x0028:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C340547lR.A00(X.7lR):X.7ko");
    }

    public static void A01(C343367q6 r10, C340547lR r11, int i, int i2) {
        C342717p3 r2 = r10.A03;
        C343047pa r0 = (C343047pa) r2.A02(C342717p3.A0q);
        if (r0 != null) {
            int i3 = r0.A02;
            int i4 = r0.A01;
            Matrix matrix = new Matrix();
            C340607lX r3 = r11.A0N;
            if (r3.ErX(matrix, i, i2, i3, i4, true)) {
                C340467lJ r02 = r11.A0O;
                r02.Ep8(matrix);
                r3.CMz(matrix, r02.getWidth(), r02.getHeight(), r10.A01);
                r11.A0E = true;
                return;
            }
            throw new RuntimeException("CameraService doesn't support setting up preview matrix.");
        }
        throw new RuntimeException(002.A0R("Cannot get preview size, maybe camera was never initialised.\n characteristics.settings=\n", (String) r2.A02(C342717p3.A0u)));
    }

    public static void A02(C340547lR r2) {
        Context context = r2.A0O.getContext();
        if ((context instanceof Activity) && r2.A0I) {
            ((Activity) context).setRequestedOrientation(r2.A00);
            r2.A0I = false;
        }
    }

    public final void A03() {
        C340607lX r5 = this.A0N;
        C340467lJ r4 = this.A0O;
        r5.EAy("initialise", r4.getView());
        String str = this.A0D;
        int i = this.A0K;
        C340167ko A002 = A00(this);
        int width = r4.getWidth();
        C342067nz r10 = new C342067nz(this.A0R.A00(this.A0S), (HashMap) null, r4.getHeight(), width);
        int i2 = 0;
        try {
            WindowManager windowManager = (WindowManager) r4.getContext().getSystemService("window");
            if (windowManager != null) {
                i2 = windowManager.getDefaultDisplay().getRotation();
            }
        } catch (RuntimeException unused) {
        }
        r5.AJH((C342077o0) null, this.A0U, A002, this.A09, r10, str, i, i2);
    }

    public final void A05() {
        C340607lX r4 = this.A0N;
        if (r4.isConnected()) {
            int i = 0;
            try {
                WindowManager windowManager = (WindowManager) this.A0O.getContext().getSystemService("window");
                if (windowManager != null) {
                    i = windowManager.getDefaultDisplay().getRotation();
                }
            } catch (RuntimeException unused) {
            }
            C343367q6 r2 = this.A08;
            if (this.A0J != i) {
                this.A0J = i;
                this.A0E = false;
                r4.EgX(new C341987nr(this), i);
            } else if (r2 != null && r2.A03.A02(C342717p3.A0q) != null) {
                C340467lJ r0 = this.A0O;
                A01(r2, this, r0.getWidth(), r0.getHeight());
            }
        }
    }

    public final void A07(float f, float f2) {
        C340607lX r4 = this.A0N;
        if (r4.isConnected()) {
            float[] fArr = {f, f2};
            if (!r4.Clf(fArr)) {
                Log.e("CameraViewController", "mapViewPointToDriverPoint called before initialiseViewToDriverMatrix");
                return;
            }
            int i = (int) fArr[0];
            int i2 = (int) fArr[1];
            r4.EwE(new C346547vM(this), i, i2);
            r4.AW6(i, i2);
        }
    }

    public final void A08(int i) {
        this.A0K = i;
        C340577lU.A01("CameraViewController", 002.A0O("Initial camera facing set to: ", i));
    }

    public final void A0A(AnonymousClass8GD r4) {
        C340957m6 r2 = this.A0P;
        if (r2 != null && r2.A07) {
            if (this.A0S) {
                C340577lU.A02("CameraViewController", "Cannot stop concurrent front back from the auxiliary controller.");
                return;
            }
            C340537lQ r1 = this.A0R;
            r1.A07 = false;
            r1.A08 = false;
            r2.A07 = false;
            C340957m6.A01(new C364558lc(r4, r2), r2, "stop");
            this.A0N.EXp(new C341957no(), true);
        }
    }

    public final void A0C(C340147km r2) {
        C340547lR r0;
        this.A07 = r2;
        if (!this.A0S && (r0 = this.A0C) != null) {
            r0.A0C(r2);
        }
    }

    public final void A0D(C364018kj r10, C363988kg r11) {
        C363998kh r6 = C363988kg.A09;
        C340467lJ r0 = this.A0O;
        r11.A01(r6, new Rect(0, 0, r0.getWidth(), r0.getHeight()));
        C364038kl r1 = new C364038kl(r10, r11, this);
        if (A0G()) {
            C340957m6 r8 = this.A0P;
            r8.getClass();
            if (r8.A04 != null) {
                AV2 av2 = new AV2(r1, r8);
                r8.A0F.A0N.EzY(av2, r11);
                boolean A022 = C348137xw.A02(C343077pd.A02);
                C340547lR r02 = r8.A04;
                if (!A022) {
                    r02.A0D(av2, r11);
                    return;
                }
                Bitmap Bex = r02.A0O.Bex();
                if (Bex != null) {
                    int width = Bex.getWidth();
                    int height = Bex.getHeight();
                    C364158kx r2 = new C364158kx(new Rect(0, 0, width, height), new Rect(0, 0, width, height), 0, r8.A04.A0N.Ajk());
                    r2.A01(C363858kS.A0d, r11.A00(r6));
                    r2.A01(C363858kS.A0W, Bex);
                    C363858kS r03 = new C363858kS(r2);
                    av2.DX5(r03);
                    av2.DsK(r03);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Can't take a concurrent photo, not in concurrent front-back mode.");
        }
        this.A0N.EzY(r1, r11);
    }

    public final void A0E(B2T b2t, LOF lof) {
        if (!this.A0I) {
            Context context = this.A0O.getContext();
            while (true) {
                Context context2 = context;
                if (!(context instanceof Activity)) {
                    if (context instanceof ContextWrapper) {
                        context = ((ContextWrapper) context).getBaseContext();
                        if (context2 == context) {
                            break;
                        }
                    } else {
                        break;
                    }
                } else {
                    Activity activity = (Activity) context2;
                    if (activity != null) {
                        this.A00 = activity.getRequestedOrientation();
                        activity.setRequestedOrientation(14);
                        this.A0I = true;
                    }
                }
            }
        }
        if (A0G()) {
            C340957m6 r3 = this.A0P;
            r3.getClass();
            AV7 av7 = new AV7(b2t, this);
            r3.A02 = lof;
            r3.A01 = av7;
            C21194XMe xMe = new C21194XMe(av7, r3);
            C340957m6.A00(xMe, lof, r3.A0F);
            if (!r3.A08) {
                LOF lof2 = (LOF) lof.A00(LOF.A06);
                if (lof2 != null) {
                    C340547lR r0 = r3.A04;
                    r0.getClass();
                    C340957m6.A00(xMe, lof2, r0);
                    return;
                }
                throw new IllegalArgumentException("VideoCaptureRequest for concurrent capture missing.");
            }
            return;
        }
        this.A0B = lof;
        this.A0A = b2t;
        C364308lD r5 = new C364308lD(b2t, this);
        File file = (File) lof.A00(LOF.A07);
        String str = (String) lof.A00(LOF.A09);
        FileDescriptor fileDescriptor = (FileDescriptor) lof.A00(LOF.A08);
        if (file != null) {
            this.A0N.Exq(r5, file, (File) null);
        } else if (str != null) {
            this.A0N.Exs(r5, str, (String) null);
        } else if (fileDescriptor != null) {
            this.A0N.Exr(r5, fileDescriptor, (FileDescriptor) null);
        }
    }

    public final boolean A0G() {
        C340957m6 r0;
        if (this.A0S || (r0 = this.A0P) == null || !r0.A07) {
            return false;
        }
        return true;
    }

    public final boolean A0H() {
        if (this.A0L != C340277l0.CAMERA2) {
            return false;
        }
        try {
            PackageManager packageManager = this.A0T;
            if (packageManager == null || !packageManager.hasSystemFeature("android.hardware.camera.concurrent")) {
                return C348137xw.A02(C348147xx.A00);
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public final boolean A0I(AnonymousClass8GD r3, String str) {
        OrientationEventListener orientationEventListener = this.A01;
        if (orientationEventListener != null) {
            orientationEventListener.disable();
        }
        C341007mB r1 = this.A02;
        if (r1 != null) {
            this.A0N.EDc(r1);
        }
        C340607lX r12 = this.A0N;
        r12.EAy(str, this.A0O.getView());
        return r12.APU(new C346467vE(r3, this));
    }

    public C340547lR(Context context, C340277l0 r6, C340177kp r7, C340177kp r8, C340467lJ r9, C340527lP r10, C340537lQ r11, String str, int i, boolean z, boolean z2) {
        C340277l0 r0;
        C340927m3 A002;
        C340957m6 r3 = null;
        this.A0D = str;
        this.A04 = r7 == null ? C340177kp.HIGH : r7;
        this.A05 = r8 == null ? C340177kp.HIGH : r8;
        this.A0S = z2;
        this.A0O = r9;
        r9.EQX(this);
        this.A0Q = r10;
        this.A0G = true;
        this.A0T = context.getApplicationContext().getPackageManager();
        if (r6 != null) {
            this.A0L = r6;
        } else {
            if (AnonymousClass4x4.A00(context, false)) {
                r0 = C340277l0.CAMERA2;
            } else {
                r0 = C340277l0.CAMERA1;
            }
            this.A0L = r0;
        }
        A08(i);
        C340277l0 r02 = this.A0L;
        if (!z2) {
            A002 = C340587lV.A00(context, (Handler) null, r02, false);
        } else {
            A002 = C340587lV.A00(context, (Handler) null, r02, true);
        }
        this.A0N = A002;
        this.A0F = z;
        A002.EdB(z);
        this.A0M = new C3496981j();
        this.A0R = r11;
        this.A0P = !z2 ? new C340957m6(this, this.A0D) : r3;
        this.A02 = new C340997mA(this);
    }

    public final void A06() {
        if (A0G()) {
            C340957m6 r4 = this.A0P;
            r4.getClass();
            LOF lof = r4.A02;
            B2T b2t = r4.A01;
            if (lof != null && b2t != null) {
                r4.A02 = null;
                r4.A01 = null;
                if (lof.A00(LOF.A06) != null) {
                    C364578le r2 = new C364578le(b2t, r4);
                    Object A002 = lof.A00(LOF.A0A);
                    A002.getClass();
                    boolean booleanValue = ((Boolean) A002).booleanValue();
                    r4.A0F.A0N.EyT(r2, booleanValue);
                    if (!r4.A08) {
                        C340547lR r0 = r4.A04;
                        r0.getClass();
                        r0.A0N.EyT(r2, booleanValue);
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException("VideoCaptureRequest for concurrent capture missing.");
            }
            return;
        }
        LOF lof2 = this.A0B;
        B2T b2t2 = this.A0A;
        if (lof2 != null && b2t2 != null) {
            Object A003 = lof2.A00(LOF.A0A);
            A003.getClass();
            boolean booleanValue2 = ((Boolean) A003).booleanValue();
            B2T b2t3 = this.A0A;
            if (b2t3 != null) {
                this.A0B = null;
                this.A0A = null;
                this.A0N.EyT(new C364618li(b2t3, this), booleanValue2);
            }
        }
    }

    public final void A09(View view, AnonymousClass8GD r8) {
        C340957m6 r5;
        int i;
        if (!A0H()) {
            C340577lU.A02("CameraViewController", "Failed to start concurrent front-back mode, not supported.");
        } else if (this.A0S || (r5 = this.A0P) == null) {
            throw new IllegalStateException("Cannot call startConcurrentFrontBackMode() from the auxiliary controller.");
        } else {
            C343367q6 r0 = this.A08;
            if (r0 != null) {
                i = r0.A01;
            } else {
                i = 0;
            }
            C340537lQ r2 = this.A0R;
            r2.A07 = true;
            r2.A08 = this.A0H;
            r5.A07 = true;
            C340957m6.A01(new C364568ld(view, r8, r5, i), r5, "start");
            this.A0N.EXp(new C341957no(), false);
        }
    }

    public final void A0B(AnonymousClass8GD r7) {
        if (A0G()) {
            C340957m6 r5 = this.A0P;
            r5.getClass();
            C364608lh r4 = new C364608lh(r7, this);
            if (r5.A04 != null) {
                C340577lU.A01("ConcurrentFrontBackController", "Switching cameras");
                int i = 0;
                if (r5.A00 == 0) {
                    i = 1;
                }
                View view = r5.A04.A0O.getView();
                r5.A07 = true;
                C340957m6.A01(new C364568ld(view, r4, r5, i), r5, "start");
                return;
            }
            throw new IllegalStateException("Can't switch cameras, auxiliary camera controller not created");
        }
        C364268l9.A00().A04 = SystemClock.elapsedRealtime();
        this.A0N.EzI(new C364318lE(r7, this));
    }
}
