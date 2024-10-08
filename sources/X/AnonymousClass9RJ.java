package X;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.media.MediaRecorder;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import java.io.File;
import java.io.FileDescriptor;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.9RJ  reason: invalid class name */
public final class AnonymousClass9RJ implements C340607lX {
    public static final Camera.ShutterCallback A0f = new AnonymousClass9S4();
    public static volatile AnonymousClass9RJ A0g;
    public int A00;
    public int A01;
    public int A02;
    public Camera.ErrorCallback A03;
    public B17 A04;
    public C340737lk A05;
    public C340167ko A06;
    public C342067nz A07;
    public C21986Xoh A08;
    public C341827na A09;
    public boolean A0A;
    public boolean A0B = true;
    public boolean A0C;
    public Matrix A0D;
    public C379239Tb A0E;
    public boolean A0F;
    public boolean A0G;
    public final AnonymousClass9RZ A0H;
    public final AnonymousClass9S6 A0I;
    public final C378949Rv A0J;
    public final C14255Tsd A0K;
    public final AnonymousClass9S3 A0L = new AnonymousClass9S3();
    public final AnonymousClass9S5 A0M;
    public final C378969Rx A0N;
    public final C3496981j A0O = new C3496981j();
    public final C3496981j A0P = new C3496981j();
    public final C340767ln A0Q;
    public final C340757lm A0R;
    public final AtomicBoolean A0S = new AtomicBoolean(false);
    public final int A0T;
    public final Context A0U;
    public final C3496981j A0V = new C3496981j();
    public final AtomicBoolean A0W = new AtomicBoolean(false);
    public final AtomicBoolean A0X = new AtomicBoolean(false);
    public volatile int A0Y;
    public volatile Camera A0Z;
    public volatile C341877nf A0a;
    public volatile C341047mF A0b;
    public volatile FutureTask A0c;
    public volatile boolean A0d;
    public volatile boolean A0e;

    public static void A06(AnonymousClass9RJ r3) {
        try {
            C341827na r0 = r3.A09;
            if (r0 != null) {
                r0.EyQ();
                r3.A09 = null;
            }
        } finally {
            r3.A0B((MediaRecorder) null);
            r3.A0d = false;
        }
    }

    public static synchronized void A07(AnonymousClass9RJ r2) {
        synchronized (r2) {
            FutureTask futureTask = r2.A0c;
            if (futureTask != null) {
                r2.A0R.A08(futureTask);
                r2.A0c = null;
            }
        }
    }

    public final void A0A() {
        try {
            if (this.A0d) {
                A06(this);
            }
        } catch (RuntimeException e) {
            Log.e("Camera1Device", "Stop video recording failed, likely due to nothing being captured", e);
        } catch (Throwable th) {
            if (this.A0Z != null) {
                A03();
                this.A0K.A00();
            }
            if (this.A0b != null) {
                this.A0b.ECm(this.A0b.C3J());
            }
            this.A0b = null;
            this.A07 = null;
            throw th;
        }
        if (this.A0Z != null) {
            A03();
            this.A0K.A00();
        }
        if (this.A0b != null) {
            this.A0b.ECm(this.A0b.C3J());
        }
        this.A0b = null;
        this.A07 = null;
    }

    public final void A0C(AnonymousClass8GD r10, FileDescriptor fileDescriptor, String str) {
        FileDescriptor fileDescriptor2 = fileDescriptor;
        String str2 = str;
        if (str == null && fileDescriptor == null) {
            throw AnonymousClass7TE.A0w("Both videoPath and videoFileDescriptor cannot be null, one must contain a valid value");
        }
        if (!isConnected()) {
            r10.A01(AnonymousClass7TE.A15("Can't record video before it's initialised."));
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.A0d = true;
        this.A0R.A00(new C15099UOz(0, r10, this), "start_video", new C41353Asa(this, fileDescriptor2, str2, elapsedRealtime));
    }

    public final void A9b(B17 b17, int i) {
        if (b17 != null) {
            C14255Tsd tsd = this.A0K;
            synchronized (tsd) {
                tsd.A05.put(b17, 1);
                tsd.A03.A01(b17);
            }
            if (this.A0Q.A04) {
                this.A0R.A07("enable_preview_frame_listeners_with_buffers", new C41369Asq(this, 9));
                return;
            }
            return;
        }
        throw AnonymousClass7TE.A0w("listener and valid number of buffers required");
    }

    public final void ARl(AnonymousClass8GD r4) {
        this.A0R.A00(r4, "enable_video_focus", new C41369Asq(this, 4));
    }

    public final boolean Ccx() {
        try {
            return this.A0H.A04() > 1;
        } catch (Exception unused) {
            return false;
        }
    }

    public final void E24(AnonymousClass8GD r5) {
        this.A0R.A00((AnonymousClass8GD) null, "pause_preview", new C41369Asq(this, 6));
    }

    public final void EJ6(AnonymousClass8GD r5) {
        this.A0R.A00((AnonymousClass8GD) null, "resume_preview", new C41369Asq(this, 3));
    }

    public final void EgX(AnonymousClass8GD r4, int i) {
        this.A0R.A00(r4, "set_rotation", new C41346AsT(this, i, 0));
    }

    public final void Exr(AnonymousClass8GD r2, FileDescriptor fileDescriptor, FileDescriptor fileDescriptor2) {
        A0C(r2, fileDescriptor, (String) null);
    }

    public final void Exs(AnonymousClass8GD r2, String str, String str2) {
        A0C(r2, (FileDescriptor) null, str);
    }

    public final void FIb(AnonymousClass8GD r4, boolean z, boolean z2, boolean z3) {
        this.A0R.A00(r4, "unlock_camera_values", new C41356Asd(0, this, r4, z3));
    }

    public static int A00(AnonymousClass9RJ r4, int i) {
        int i2;
        int i3;
        int i4 = r4.A00;
        int A052 = r4.A0H.A05(i4);
        if (i == 1) {
            i2 = 90;
        } else if (i != 2) {
            i2 = 270;
            if (i != 3) {
                i2 = 0;
            }
        } else {
            i2 = 180;
        }
        if (i4 == 1) {
            i3 = 360 - ((A052 + i2) % 360);
        } else {
            i3 = (A052 - i2) + 360;
        }
        return i3 % 360;
    }

    public static C378979Ry A01(AnonymousClass9RJ r1, int i) {
        if (r1.A0b != null) {
            r1.A0b.CEH();
        }
        return r1.A0N.A00(i);
    }

    private void A03() {
        if (this.A0Z != null) {
            if (this.A0b != null) {
                this.A0b.CEH();
            }
            A07(this);
            this.A0W.set(false);
            this.A0X.set(false);
            Camera camera = this.A0Z;
            this.A0Z = null;
            AnonymousClass9S5 r2 = this.A0M;
            if (r2.A0B) {
                Handler handler = r2.A04;
                handler.removeMessages(1);
                handler.removeMessages(2);
                r2.A0A = null;
                Camera camera2 = r2.A03;
                camera2.getClass();
                camera2.setZoomChangeListener((Camera.OnZoomChangeListener) null);
                r2.A03 = null;
                r2.A0B = false;
            }
            AnonymousClass9S6 r22 = this.A0I;
            r22.A06.A06("The FocusController must be released on the Optic thread.");
            r22.A09 = false;
            r22.A01 = null;
            r22.A08 = false;
            r22.A07 = false;
            this.A0e = false;
            C378969Rx r0 = this.A0N;
            r0.A02.remove(AnonymousClass9RZ.A00(r0.A03, this.A00));
            this.A0R.A03("close_camera_on_camera_handler_thread", new C41347AsU(7, camera, this));
        }
    }

    public static void A04(AnonymousClass9RJ r2) {
        AnonymousClass9S3 r22 = r2.A0L;
        AtomicReference atomicReference = r22.A00;
        Object obj = atomicReference.get();
        obj.getClass();
        ((CountDownLatch) obj).countDown();
        Object obj2 = atomicReference.get();
        obj2.getClass();
        ((CountDownLatch) obj2).countDown();
        r22.A01(0);
    }

    /* JADX WARNING: type inference failed for: r0v21, types: [X.9Ry, X.7p6, java.lang.Object] */
    public static void A08(AnonymousClass9RJ r9, int i) {
        if (r9.A0U.checkSelfPermission("android.permission.CAMERA") == 0) {
            C342057ny.A01("Should not check for open camera on the UI thread.");
            if (r9.A0Z == null || r9.A00 != i) {
                int A002 = AnonymousClass9RZ.A00(r9.A0H, i);
                if (A002 != -1) {
                    r9.A03();
                    C364268l9.A00().A00 = SystemClock.elapsedRealtime();
                    Camera camera = (Camera) r9.A0R.A03("open_camera_on_camera_handler_thread", new C41346AsT(r9, A002, 1));
                    camera.getClass();
                    r9.A0Z = camera;
                    r9.A00 = i;
                    Camera camera2 = r9.A0Z;
                    Camera.ErrorCallback errorCallback = r9.A03;
                    if (errorCallback == null) {
                        errorCallback = new C379019Sc(r9);
                        r9.A03 = errorCallback;
                    }
                    camera2.setErrorCallback(errorCallback);
                    C378969Rx r1 = r9.A0N;
                    Camera camera3 = r9.A0Z;
                    if (camera3 != null) {
                        C340577lU.A00(43, 0, (Object) null);
                        int A003 = AnonymousClass9RZ.A00(r1.A03, i);
                        Camera.Parameters parameters = camera3.getParameters();
                        C14252Tsa tsa = new C14252Tsa(parameters);
                        r1.A00.put(A003, tsa);
                        C378849Rl r92 = new C378849Rl(parameters, tsa);
                        r1.A01.put(A003, r92);
                        SparseArray sparseArray = r1.A02;
                        ? r0 = new C342747p6();
                        r0.A00 = tsa;
                        r0.A01 = new C378939Ru(parameters, camera3, tsa, r92, i);
                        sparseArray.put(A003, r0);
                        C340577lU.A00(44, 0, (Object) null);
                        return;
                    }
                    throw AnonymousClass7TE.A11("camera is null!");
                }
                throw new UnsupportedOperationException(002.A0O("Open Camera 1 failed: camera facing is not available: ", i));
            }
            return;
        }
        throw new SecurityException("Open Camera 1 failed: No camera permissions!");
    }

    public final void A0B(MediaRecorder mediaRecorder) {
        Camera camera = this.A0Z;
        if (camera != null) {
            boolean z = this.A0A;
            int i = this.A02;
            if (mediaRecorder != null) {
                if (C348137xw.A02(C348147xx.A01)) {
                    this.A0I.A02();
                }
                camera.unlock();
                mediaRecorder.setCamera(camera);
                mediaRecorder.setVideoSource(1);
                return;
            }
            camera.lock();
            if (C348137xw.A02(C348147xx.A01)) {
                camera.reconnect();
            }
            C378979Ry A012 = A01(this, this.A00);
            A012.A00.A01(C342717p3.A0B, Integer.valueOf(i));
            A012.A00.A01(C342717p3.A0W, Boolean.valueOf(z));
            A012.A03();
            A012.A02();
        }
    }

    public final void A8O(C341007mB r2) {
        this.A0O.A01(r2);
    }

    public final void A8q(C340247kw r3) {
        if (this.A0a == null) {
            this.A0a = new C341877nf();
            this.A0J.A03 = this.A0a;
        }
        this.A0a.A00.add(r3);
    }

    public final boolean A9G(C340707lh r2) {
        return this.A0V.A01(r2);
    }

    public final void A9a(B17 b17) {
        C14255Tsd tsd = this.A0K;
        synchronized (tsd) {
            tsd.A03.A01(b17);
        }
        C342717p3 A022 = this.A0N.A02(this.A00);
        C340757lm r2 = this.A0R;
        boolean A092 = r2.A09();
        boolean isConnected = isConnected();
        if (A092) {
            if (isConnected) {
                tsd.A02(this.A0Z, (C343047pa) A022.A02(C342717p3.A0q), AnonymousClass7TG.A08(C342717p3.A0m, A022));
            }
        } else if (isConnected) {
            r2.A07("enable_preview_frame_listeners", new C41347AsU(1, A022, this));
        }
    }

    public final void A9c(AnonymousClass8FP r4) {
        C340167ko r1 = this.A06;
        if (r1 == null || !AnonymousClass7TE.A1a(r1.AXG(C340167ko.A0G))) {
            this.A0J.A01.A01(r4);
        } else {
            this.A0R.A07("add_on_preview_started_listener", new C41347AsU(3, r4, this));
        }
    }

    public final void A9d(C340347l7 r3) {
        C378949Rv r1 = this.A0J;
        if (r1.A00.A01()) {
            r3.DZF();
        }
        r1.A02.A01(r3);
    }

    public final void AAm(AnonymousClass8GT r2) {
        this.A0M.A06.A01(r2);
    }

    public final int AF4(int i, int i2) {
        return this.A0H.A06(i, i2);
    }

    public final void AJH(C342077o0 r11, AnonymousClass8GD r12, C340167ko r13, C340557lS r14, C342067nz r15, String str, int i, int i2) {
        C340577lU.A00 = 9;
        C340577lU.A00(9, 0, (Object) null);
        this.A0R.A00(r12, "connect", new AnonymousClass9RY(this, r13, r15, i, i2));
        C340577lU.A00(10, 0, (Object) null);
    }

    public final boolean APU(AnonymousClass8GD r6) {
        UUID uuid = this.A0Q.A03;
        C340577lU.A00(23, 0, (Object) null);
        A04(this);
        C378949Rv r1 = this.A0J;
        r1.A01.A00();
        r1.A02.A00();
        EWv((C365938nv) null);
        this.A0M.A06.A00();
        this.A0P.A00();
        C340757lm r2 = this.A0R;
        r2.A00(r6, "disconnect", new C41347AsU(0, uuid, this));
        r2.A07("disconnect_guard", new TN4(0));
        return true;
    }

    public final void AW6(int i, int i2) {
        Rect rect = new Rect(i, i2, i, i2);
        int i3 = -this.A0T;
        rect.inset(i3, i3);
        this.A0R.A00(new C15098UOy(this, 0), "focus", new C41347AsU(4, rect, this));
    }

    public final Handler Aja() {
        Handler handler = this.A0R.A00;
        if (handler == null) {
            return C342057ny.A00;
        }
        return handler;
    }

    public final int Ajk() {
        return this.A00;
    }

    public final C342687p0 AlD() {
        A0E("Cannot get camera capabilities");
        return this.A0N.A01(this.A00);
    }

    public final void BXP(AnonymousClass8GD r5) {
        AnonymousClass9RZ r3 = this.A0H;
        int i = AnonymousClass9RZ.A03;
        if (i == -1) {
            if (AnonymousClass9RZ.A03(r3)) {
                i = AnonymousClass9RZ.A03;
            } else {
                r3.A00.A01(r5, "get_number_of_cameras", new C41369Asq((Object) r3, 10));
                return;
            }
        }
        r5.A02(Integer.valueOf(i));
    }

    public final void BXQ(AnonymousClass8GD r5, int i) {
        AnonymousClass9RZ r3 = this.A0H;
        r3.A00.A01(r5, "get_number_of_cameras_facing", new C41346AsT(r3, i, 3));
    }

    public final int BsR() {
        return this.A0H.A05(this.A00);
    }

    public final C342717p3 Bt2() {
        A0E("Cannot get camera settings");
        return this.A0N.A02(this.A00);
    }

    public final int CHf() {
        AnonymousClass9S5 r1 = this.A0M;
        if (r1.A0B) {
            return r1.A09;
        }
        return 0;
    }

    public final void CJd(AnonymousClass8GD r3) {
        this.A0H.A07(r3, 0);
    }

    public final boolean CJf(int i) {
        try {
            return this.A0H.A08(i);
        } catch (RuntimeException unused) {
            return false;
        }
    }

    public final void CJq(AnonymousClass8GD r3) {
        this.A0H.A07(r3, 1);
    }

    public final void CMz(Matrix matrix, int i, int i2, int i3) {
        C379239Tb r1 = new C379239Tb(matrix, i3, A00(this, this.A01), i, i2);
        this.A0E = r1;
        this.A0I.A03 = r1;
    }

    public final boolean CZk() {
        return this.A0J.A00.A01();
    }

    public final boolean CaT() {
        return this.A0d;
    }

    public final boolean Cd1() {
        return AnonymousClass7TF.A1R((AnonymousClass9S3.A00(this.A0L).getCount() > 0 ? 1 : (AnonymousClass9S3.A00(this.A0L).getCount() == 0 ? 0 : -1)));
    }

    public final void Cgd(AnonymousClass8GD r4, boolean z, boolean z2, boolean z3) {
        this.A0R.A00(r4, "lock_camera_values", new C41311Arr(this, z3));
    }

    public final boolean Clf(float[] fArr) {
        C379239Tb r0 = this.A0E;
        if (r0 == null) {
            return false;
        }
        r0.A00.mapPoints(fArr);
        return true;
    }

    public final void CoY(AnonymousClass8GD r4, C343147pk r5) {
        this.A0R.A00(r4, "modify_settings", new C41347AsU(2, r5, this));
    }

    public final void DVY(int i) {
        if (!this.A0F) {
            this.A0Y = i;
            C341047mF r1 = this.A0b;
            if (r1 != null) {
                r1.D8b(this.A0Y);
            }
        }
    }

    public final void E10(AnonymousClass8GD r3, String str, int i) {
        throw new UnsupportedOperationException("Concurrent front back mode not supported with Camera1");
    }

    public final void EAy(String str, View view) {
        if (this.A0a != null) {
            C341877nf r1 = this.A0a;
            if (view != null && !r1.A00.isEmpty()) {
                C342057ny.A00(new C342047nx(view, r1));
            }
        }
    }

    public final void EDc(C341007mB r2) {
        this.A0O.A02(r2);
    }

    public final void EDo(C340247kw r3) {
        if (this.A0a != null) {
            this.A0a.A00.remove(r3);
            if (!(!this.A0a.A00.isEmpty())) {
                this.A0a = null;
                this.A0J.A03 = null;
            }
        }
    }

    public final void EE2(C340707lh r2) {
        this.A0V.A02(r2);
    }

    public final void EEJ(B17 b17) {
        if (b17 != null) {
            C14255Tsd tsd = this.A0K;
            synchronized (tsd) {
                tsd.A05.remove(b17);
                tsd.A03.A02(b17);
            }
            if (this.A0Q.A04) {
                this.A0R.A07("disable_preview_frame_listeners", new C41369Asq(this, 5));
                return;
            }
            return;
        }
        throw AnonymousClass7TE.A0w("listener is required");
    }

    public final void EEK(AnonymousClass8FP r4) {
        C340167ko r1 = this.A06;
        if (r1 == null || !AnonymousClass7TE.A1a(r1.AXG(C340167ko.A0G))) {
            this.A0J.A01.A02(r4);
        } else {
            this.A0R.A07("remove_on_preview_started_listener", new C41347AsU(6, r4, this));
        }
    }

    public final void EEL(C340347l7 r2) {
        this.A0J.A02.A02(r2);
    }

    public final void EWv(C365938nv r2) {
        this.A0I.A02 = r2;
    }

    public final void EXp(AnonymousClass8GD r3, boolean z) {
        throw new UnsupportedOperationException("isHLGCreationAllowed is not supported in Camera1 api");
    }

    public final void EdB(boolean z) {
        this.A0F = z;
        if (z) {
            this.A0Y = 0;
            C341047mF r1 = this.A0b;
            if (r1 != null) {
                r1.D8b(this.A0Y);
            }
        }
    }

    public final void EeX(C340947m5 r2) {
        this.A0Q.A04(r2);
    }

    public final void Er9(AnonymousClass8GD r4, int i) {
        this.A0R.A00(r4, "set_zoom_level", new C41346AsT(this, i, 2));
    }

    public final void ErA(float f, float f2) {
        this.A0R.A07("zoom_to_percent", new C20393Wqb(this, f, f2));
    }

    public final void Evu(AnonymousClass8GD r3, float f) {
        throw new UnsupportedOperationException("smoothZoomTo() is not supported in Camera1 API.");
    }

    public final void EwE(AnonymousClass8GD r4, int i, int i2) {
        Rect rect = new Rect(i, i2, i, i2);
        int i3 = -this.A0T;
        rect.inset(i3, i3);
        this.A0R.A00(r4, "spot_meter", new C41347AsU(5, rect, this));
    }

    public final void EyT(AnonymousClass8GD r4, boolean z) {
        if (!this.A0d) {
            r4.A01(AnonymousClass7TE.A15("Not recording video"));
            return;
        }
        this.A0R.A00(r4, C273654mx.A00(3368), new C41342AsP(this, SystemClock.elapsedRealtime(), z));
    }

    public final boolean isConnected() {
        if (this.A0Z == null) {
            return false;
        }
        if (this.A0W.get() || this.A0X.get()) {
            return true;
        }
        return false;
    }

    public AnonymousClass9RJ(Context context) {
        this.A0U = context;
        C340757lm r3 = new C340757lm();
        this.A0R = r3;
        C340767ln r2 = new C340767ln(r3);
        this.A0Q = r2;
        AnonymousClass9RZ r0 = new AnonymousClass9RZ(context.getPackageManager(), r2, r3);
        this.A0H = r0;
        C378969Rx r1 = new C378969Rx(r0);
        this.A0N = r1;
        this.A0J = new C378949Rv();
        this.A0M = new AnonymousClass9S5(r1, r3);
        this.A0I = new AnonymousClass9S6(r1, r3);
        this.A0T = Math.round(TypedValue.applyDimension(1, 30.0f, AnonymousClass7TF.A0E(context)));
        this.A0K = new C14255Tsd();
    }

    public static C343367q6 A02(AnonymousClass9RJ r27, C340167ko r28, C342067nz r29, int i) {
        C343137pj Bf6;
        int i2;
        0fg.A01("Camera1Device.initialiseCamera", -1360237865);
        C342057ny.A01("initialiseCamera should not run on the UI thread");
        SystemClock.elapsedRealtime();
        AnonymousClass9RJ r11 = r27;
        if (r11.A0Z != null) {
            C340577lU.A00(39, 0, (Object) null);
            AtomicBoolean atomicBoolean = r11.A0W;
            C340167ko r2 = r28;
            C342067nz r4 = r29;
            int i3 = i;
            if (!atomicBoolean.get() || !r4.equals(r11.A07) || r11.A0b != r4.A02 || r11.A01 != i3 || AnonymousClass7TE.A1a(r2.AXG(C340167ko.A0S))) {
                r11.A06 = r2;
                r11.A07 = r4;
                C341047mF r15 = r4.A02;
                r11.A0b = r15;
                r11.A0J.A01(false, r11.A0Z);
                C340177kp r13 = (C340177kp) r11.A06.AXG(C340167ko.A0R);
                C340177kp r10 = (C340177kp) r11.A06.AXG(C340167ko.A0W);
                int i4 = r4.A01;
                int i5 = r4.A00;
                C340147km r42 = (C340147km) r11.A06.AXG(C340167ko.A0U);
                C340197kr r3 = (C340197kr) r11.A06.AXG(C340167ko.A0A);
                r11.A0C = AnonymousClass7TE.A1a(r2.AXG(C340167ko.A0F));
                boolean A1a = AnonymousClass7TE.A1a(r2.AXG(C340167ko.A0I));
                r11.A01 = i3;
                int A002 = A00(r11, i3);
                C378969Rx r22 = r11.A0N;
                C342687p0 A012 = r22.A01(r11.A00);
                C340177kp r14 = C340177kp.DEACTIVATED;
                boolean equals = r10.equals(r14);
                if (equals || r13.equals(r14)) {
                    boolean equals2 = r13.equals(r14);
                    if (equals) {
                        if (!equals2) {
                            Bf6 = r42.Bc4(r13, (List) A012.A01(C342687p0.A10), (List) A012.A01(C342687p0.A14), i4, i5, A002);
                        }
                    } else if (equals2) {
                        Bf6 = r42.CEC(r10, (List) A012.A01(C342687p0.A1A), (List) A012.A01(C342687p0.A14), i4, i5, A002);
                    }
                    Bf6 = r42.Bf6((List) A012.A01(C342687p0.A14), i4, i5, A002);
                } else {
                    C340147km r17 = r42;
                    C340177kp r18 = r13;
                    Bf6 = r17.Ap9(r18, r10, (List) A012.A01(C342687p0.A10), (List) A012.A01(C342687p0.A1A), (List) A012.A01(C342687p0.A14), (List) null, i4, i5, A002);
                }
                if (Bf6 != null) {
                    C378979Ry A013 = A01(r11, r11.A00);
                    if (A1a) {
                        A013.A00.A01(C342717p3.A0c, new C343047pa(0, 0));
                    }
                    C343047pa r5 = Bf6.A00;
                    if (r5 != null) {
                        A013.A00.A01(C342717p3.A0k, r5);
                    } else if (Bf6.A01 == null) {
                        throw AnonymousClass7TE.A15("SizeSetter returned null sizes!");
                    }
                    C343047pa r52 = Bf6.A01;
                    if (r52 != null) {
                        A013.A00.A01(C342717p3.A0q, r52);
                    }
                    C343047pa r53 = Bf6.A02;
                    if (r53 != null) {
                        A013.A00.A01(C342717p3.A0y, r53);
                    }
                    A013.A03();
                    A013.A00.A01(C342717p3.A00, 3);
                    A013.A00.A01(C342717p3.A0z, 1);
                    A013.A00.A01(C342717p3.A0n, r3.A00((List) A013.A00.A01(C342687p0.A12)));
                    A013.A00.A01(C342717p3.A0s, 0);
                    int i6 = r11.A00;
                    C342687p0 A014 = r22.A01(i6);
                    Number number = (Number) r11.A06.AXG(C340167ko.A0K);
                    if (number.intValue() != 0) {
                        A013.A00.A01(C342717p3.A0a, number);
                    }
                    A013.A02();
                    C14255Tsd tsd = r11.A0K;
                    tsd.A01(r11.A0Z);
                    C342717p3 A022 = r22.A02(i6);
                    C342727p4 r43 = C342717p3.A0q;
                    Object A023 = A022.A02(r43);
                    A023.getClass();
                    C343047pa r23 = (C343047pa) A023;
                    int i7 = r23.A02;
                    int i8 = r23.A01;
                    0fg.A01(002.A02(i7, i8, "startCameraPreview ", "x"), -1727691802);
                    C340577lU.A00(37, 0, (Object) null);
                    C342727p4 r1 = C342717p3.A0m;
                    int A082 = AnonymousClass7TG.A08(r1, A022);
                    int A052 = r11.A0H.A05(i6);
                    int i9 = r11.A0Y;
                    int i10 = r11.A01;
                    if (i10 == 1) {
                        i2 = 90;
                    } else if (i10 != 2) {
                        i2 = 270;
                        if (i10 != 3) {
                            i2 = 0;
                        }
                    } else {
                        i2 = 180;
                    }
                    SurfaceTexture C3H = r15.C3H(i7, i8, A082, A052, i9, i2, i6, 0);
                    C340577lU.A00(38, 0, (Object) null);
                    if (C3H != null) {
                        r11.A0Z.setPreviewTexture(C3H);
                    }
                    boolean FNS = r15.FNS();
                    Camera camera = r11.A0Z;
                    if (FNS) {
                        camera.setDisplayOrientation(A00(r11, 0));
                    } else {
                        camera.setDisplayOrientation(A002);
                    }
                    r11.A0G = AnonymousClass7TG.A1V(C342687p0.A0a, A014);
                    atomicBoolean.set(true);
                    r11.A0X.set(false);
                    r11.A0e = AnonymousClass7TG.A1V(C342687p0.A0f, A014);
                    AnonymousClass9S5 r12 = r11.A0M;
                    Camera camera2 = r11.A0Z;
                    int i11 = r11.A00;
                    r12.A03 = camera2;
                    r12.A00 = i11;
                    C378969Rx r132 = r12.A05;
                    C342687p0 A015 = r132.A01(i11);
                    r12.A0A = (List) A015.A01(C342687p0.A1D);
                    r12.A0E = AnonymousClass7TG.A1V(C342687p0.A0e, A015);
                    r12.A09 = AnonymousClass7TG.A08(C342717p3.A11, r132.A02(i11));
                    r12.A01 = AnonymousClass7TE.A0M(r132.A01(i11).A01(C342687p0.A0j));
                    Camera camera3 = r12.A03;
                    camera3.getClass();
                    camera3.setZoomChangeListener(r12);
                    r12.A0B = true;
                    AnonymousClass9S6 r152 = r11.A0I;
                    Camera camera4 = r11.A0Z;
                    int i12 = r11.A00;
                    r152.A06.A06("The FocusController must be prepared on the Optic thread.");
                    r152.A01 = camera4;
                    r152.A00 = i12;
                    r152.A09 = true;
                    r152.A08 = false;
                    r152.A07 = false;
                    r152.A04 = true;
                    r152.A0A = false;
                    A09(r11, i7, i8);
                    tsd.A02(r11.A0Z, (C343047pa) A022.A02(r43), AnonymousClass7TG.A08(r1, A022));
                    A05(r11);
                    C364268l9 A003 = C364268l9.A00();
                    A003.A01 = 0;
                    A003.A02 = 0;
                    SystemClock.elapsedRealtime();
                    C343367q6 r16 = new C343367q6(A014, (C343367q6) null, A022, i6, false);
                    C340577lU.A00(40, 0, (Object) null);
                    0fg.A00(1013111477);
                    0fg.A00(1752859901);
                    return r16;
                }
                throw AnonymousClass7TE.A15("SizeSetter returned a null OptimalSize");
            }
            if (r11.A0J.A00.A01()) {
                A05(r11);
            }
            return new C343367q6(r11.AlD(), (C343367q6) null, r11.Bt2(), r11.A00, false);
        }
        throw AnonymousClass7TE.A15("Can't connect to the camera service.");
    }

    public static void A05(AnonymousClass9RJ r2) {
        if (r2.isConnected()) {
            B17 b17 = r2.A04;
            if (b17 == null) {
                b17 = new C40167AUh(r2, 1);
                r2.A04 = b17;
            }
            r2.A9a(b17);
            r2.A0J.A00(r2.A0Z);
        }
    }

    public static void A09(AnonymousClass9RJ r7, int i, int i2) {
        Matrix matrix;
        float f;
        float f2;
        float f3;
        Matrix A0U2 = AnonymousClass7TE.A0U();
        r7.A0D = A0U2;
        float f4 = 1.0f;
        if (r7.A00 == 1) {
            f4 = -1.0f;
        }
        A0U2.setScale(f4, 1.0f);
        int A002 = A00(r7, r7.A01);
        r7.A0D.postRotate((float) A002);
        if (A002 == 90 || A002 == 270) {
            matrix = r7.A0D;
            f = (float) i2;
            f2 = f / 2000.0f;
            f3 = (float) i;
        } else {
            matrix = r7.A0D;
            f = (float) i;
            f2 = f / 2000.0f;
            f3 = (float) i2;
        }
        matrix.postScale(f2, f3 / 2000.0f);
        r7.A0D.postTranslate(f / 2.0f, f3 / 2.0f);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003b, code lost:
        if (r10.A00(X.C363858kS.A0P) != null) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0054, code lost:
        if (r10.A00(X.C363858kS.A0b) != null) goto L_0x0056;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0D(X.C340167ko r7, X.C364018kj r8, X.C363988kg r9, X.C364158kx r10, X.C363858kS r11) {
        /*
            r6 = this;
            boolean r0 = X.C344237rX.A00()
            r5 = 1
            r4 = 0
            if (r0 != 0) goto L_0x003d
            X.7ks r0 = X.C340167ko.A0D
            java.lang.Object r0 = r7.AXG(r0)
            boolean r0 = X.AnonymousClass7TE.A1a(r0)
            if (r0 != 0) goto L_0x003d
            X.8kz r0 = X.C363858kS.A0T
            java.lang.Object r0 = r10.A00(r0)
            if (r0 != 0) goto L_0x003d
            X.8kz r0 = X.C363858kS.A0Z
            java.lang.Object r0 = r10.A00(r0)
            if (r0 != 0) goto L_0x003d
            X.8kz r0 = X.C363858kS.A0O
            java.lang.Object r0 = r10.A00(r0)
            if (r0 != 0) goto L_0x003d
            X.8kz r0 = X.C363858kS.A0V
            java.lang.Object r0 = r10.A00(r0)
            if (r0 != 0) goto L_0x003d
            X.8kz r0 = X.C363858kS.A0P
            java.lang.Object r0 = r10.A00(r0)
            r3 = 1
            if (r0 == 0) goto L_0x003e
        L_0x003d:
            r3 = 0
        L_0x003e:
            X.8kh r0 = X.C363988kg.A07
            java.lang.Object r0 = r9.A00(r0)
            r0.getClass()
            boolean r0 = X.AnonymousClass7TE.A1a(r0)
            if (r0 == 0) goto L_0x0056
            X.8kz r0 = X.C363858kS.A0b
            java.lang.Object r0 = r10.A00(r0)
            r2 = 1
            if (r0 == 0) goto L_0x0057
        L_0x0056:
            r2 = 0
        L_0x0057:
            X.8kz r1 = X.C363858kS.A0X
            java.lang.Object r0 = r10.A00(r1)
            if (r0 != 0) goto L_0x0189
            if (r11 == 0) goto L_0x018a
            X.8ky r0 = X.C363858kS.A0M
            java.lang.Object r0 = r11.A03(r0)
            android.graphics.Rect r0 = (android.graphics.Rect) r0
            r10.A01 = r0
            java.lang.Object r0 = r11.A04(r1)
            if (r0 == 0) goto L_0x0079
            java.lang.Object r0 = r11.A04(r1)
            byte[] r0 = (byte[]) r0
            r10.A0F = r0
        L_0x0079:
            X.8kz r1 = X.C363858kS.A0b
            java.lang.Object r0 = r11.A04(r1)
            if (r0 == 0) goto L_0x0089
            java.lang.Object r0 = r11.A04(r1)
            byte[] r0 = (byte[]) r0
            r10.A0G = r0
        L_0x0089:
            X.8kz r1 = X.C363858kS.A0Y
            java.lang.Object r0 = r11.A04(r1)
            if (r0 == 0) goto L_0x0099
            java.lang.Object r0 = r11.A04(r1)
            X.8kR r0 = (X.C363848kR) r0
            r10.A03 = r0
        L_0x0099:
            X.8kz r1 = X.C363858kS.A0d
            java.lang.Object r0 = r11.A04(r1)
            if (r0 == 0) goto L_0x00a9
            java.lang.Object r0 = r11.A04(r1)
            android.graphics.Rect r0 = (android.graphics.Rect) r0
            r10.A02 = r0
        L_0x00a9:
            X.8kz r1 = X.C363858kS.A0T
            java.lang.Object r0 = r11.A04(r1)
            if (r0 == 0) goto L_0x00b9
            java.lang.Object r0 = r11.A04(r1)
            java.lang.Long r0 = (java.lang.Long) r0
            r10.A0E = r0
        L_0x00b9:
            X.8kz r1 = X.C363858kS.A0Z
            java.lang.Object r0 = r11.A04(r1)
            if (r0 == 0) goto L_0x00c9
            java.lang.Object r0 = r11.A04(r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            r10.A0A = r0
        L_0x00c9:
            X.8kz r1 = X.C363858kS.A0O
            java.lang.Object r0 = r11.A04(r1)
            if (r0 == 0) goto L_0x00d9
            java.lang.Object r0 = r11.A04(r1)
            java.lang.Float r0 = (java.lang.Float) r0
            r10.A06 = r0
        L_0x00d9:
            X.8kz r1 = X.C363858kS.A0P
            java.lang.Object r0 = r11.A04(r1)
            if (r0 == 0) goto L_0x00e9
            java.lang.Object r0 = r11.A04(r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            r10.A08 = r0
        L_0x00e9:
            X.8kz r1 = X.C363858kS.A0V
            java.lang.Object r0 = r11.A04(r1)
            if (r0 == 0) goto L_0x00f9
            java.lang.Object r0 = r11.A04(r1)
            java.lang.Float r0 = (java.lang.Float) r0
            r10.A07 = r0
        L_0x00f9:
            X.8kz r1 = X.C363858kS.A0R
            java.lang.Object r0 = r11.A04(r1)
            if (r0 == 0) goto L_0x0104
            r11.A04(r1)
        L_0x0104:
            X.8kz r1 = X.C363858kS.A0Q
            java.lang.Object r0 = r11.A04(r1)
            if (r0 == 0) goto L_0x0114
            java.lang.Object r0 = r11.A04(r1)
            X.8kS r0 = (X.C363858kS) r0
            r10.A04 = r0
        L_0x0114:
            X.8kz r1 = X.C363858kS.A0a
            java.lang.Object r0 = r11.A04(r1)
            if (r0 == 0) goto L_0x0124
            java.lang.Object r0 = r11.A04(r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            r10.A0B = r0
        L_0x0124:
            X.8kz r1 = X.C363858kS.A0e
            java.lang.Object r0 = r11.A04(r1)
            if (r0 == 0) goto L_0x0134
            java.lang.Object r0 = r11.A04(r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            r10.A0D = r0
        L_0x0134:
            X.8kz r1 = X.C363858kS.A0S
            java.lang.Object r0 = r11.A04(r1)
            if (r0 == 0) goto L_0x0144
            java.lang.Object r0 = r11.A04(r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            r10.A05 = r0
        L_0x0144:
            X.8kz r1 = X.C363858kS.A0c
            java.lang.Object r0 = r11.A04(r1)
            if (r0 == 0) goto L_0x0154
            java.lang.Object r0 = r11.A04(r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            r10.A0C = r0
        L_0x0154:
            X.8kz r1 = X.C363858kS.A0U
            java.lang.Object r0 = r11.A04(r1)
            if (r0 == 0) goto L_0x0164
            java.lang.Object r0 = r11.A04(r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            r10.A09 = r0
        L_0x0164:
            X.8kz r1 = X.C363858kS.A0W
            java.lang.Object r0 = r11.A04(r1)
            if (r0 == 0) goto L_0x0174
            java.lang.Object r0 = r11.A04(r1)
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            r10.A00 = r0
        L_0x0174:
            if (r3 != 0) goto L_0x0188
            if (r2 != 0) goto L_0x0188
            if (r4 != 0) goto L_0x0188
            X.7lm r2 = r6.A0R
            X.7ln r0 = r6.A0Q
            java.util.UUID r1 = r0.A03
            X.8ty r0 = new X.8ty
            r0.<init>(r8, r10)
            r2.A05(r0, r1)
        L_0x0188:
            return
        L_0x0189:
            r5 = 0
        L_0x018a:
            r4 = r5
            goto L_0x0174
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9RJ.A0D(X.7ko, X.8kj, X.8kg, X.8kx, X.8kS):void");
    }

    public final void A0E(String str) {
        if (!isConnected()) {
            throw new C352928Fp(str);
        }
    }

    public final void Cru() {
        if (isConnected() && (this.A0J.A00.A00 & 4) != 4) {
            this.A0R.A07("gpu_frames_started", new C41369Asq(this, 8));
        }
    }

    public final boolean ErX(Matrix matrix, int i, int i2, int i3, int i4, boolean z) {
        float f;
        matrix.reset();
        float f2 = (float) i;
        float f3 = (float) i2;
        float f4 = f2 / f3;
        int A002 = A00(this, this.A01);
        if (A002 == 90 || A002 == 270) {
            int i5 = i4;
            i4 = i3;
            i3 = i5;
        }
        float f5 = (float) i3;
        float f6 = (float) i4;
        int i6 = ((f5 / f6) > f4 ? 1 : ((f5 / f6) == f4 ? 0 : -1));
        if (!z ? i6 <= 0 : i6 > 0) {
            f = f3 / f6;
        } else {
            f = f2 / f5;
        }
        matrix.setScale((f5 / f2) * f, (f6 / f3) * f, (float) (i / 2), (float) (i2 / 2));
        return true;
    }

    public final void Exq(AnonymousClass8GD r3, File file, File file2) {
        Exs(r3, file.getAbsolutePath(), (String) null);
    }

    public final void EzI(AnonymousClass8GD r4) {
        if (!Cd1()) {
            int i = this.A00;
            C340577lU.A00 = 14;
            C340577lU.A00(14, i, (Object) null);
            this.A0R.A00(r4, "switch_camera", new C41369Asq(this, 2));
        }
    }

    public final void EzY(C364018kj r7, C363988kg r8) {
        if (!isConnected()) {
            r7.DCn(new C352928Fp("Cannot take a photo"));
            return;
        }
        AnonymousClass9S3 r3 = this.A0L;
        if (AnonymousClass9S3.A00(r3).getCount() > 0) {
            r7.DCn(new Exception("Busy taking photo"));
        } else if (!this.A0d || this.A0G) {
            C364268l9.A00().A05 = SystemClock.elapsedRealtime();
            int A082 = AnonymousClass7TG.A08(C342717p3.A0h, Bt2());
            C340577lU.A00 = 19;
            C340577lU.A00(19, A082, (Object) null);
            r3.A01(2);
            this.A0S.set(false);
            this.A0R.A00(new UP0(0, this, r7, r8), "take_photo", new C41357Ase(0, this, r8, r7));
        } else {
            r7.DCn(new Exception("Cannot take a photo while recording video"));
        }
    }

    public final void ARW(boolean z) {
        this.A0B = z;
    }
}
