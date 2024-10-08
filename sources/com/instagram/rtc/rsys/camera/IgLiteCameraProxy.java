package com.instagram.rtc.rsys.camera;

import X.002;
import X.0qQ;
import X.A4Q;
import X.AD4;
import X.ADX;
import X.AnonymousClass0eK;
import X.AnonymousClass7TE;
import X.C18015Vjr;
import X.C340537lQ;
import X.C340547lR;
import X.C340607lX;
import X.C340957m6;
import X.C341957no;
import X.C342687p0;
import X.C342717p3;
import X.C342757p7;
import X.C343047pa;
import X.C343717qg;
import X.C343837qt;
import X.C344397rn;
import X.C344447rs;
import X.C345567tj;
import X.C345577tk;
import X.C345597tm;
import X.C345757u2;
import X.C346027uT;
import X.C380729Zh;
import X.C382539dr;
import X.C383709g1;
import X.C40161AUb;
import X.C41183Aph;
import X.C41397AtJ;
import X.C66579MXk;
import X.C71004OWb;
import X.C73139PXa;
import X.C73543Pea;
import X.NCn;
import X.O9Y;
import X.Om5;
import android.content.Context;
import android.graphics.Point;
import android.graphics.SurfaceTexture;
import android.view.View;
import com.facebook.cameracore.instagram.ardelivery.networkconsentmanager.IgNetworkConsentStorage;
import com.facebook.rsys.camera.gen.Camera;
import com.facebook.rsys.camera.gen.CameraApi;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.webrtc.EglBase;
import org.webrtc.SurfaceTextureHelper;

public class IgLiteCameraProxy extends NCn {
    public int A00 = 640;
    public int A01 = 368;
    public C343047pa A02;
    public C343047pa A03;
    public C41397AtJ A04 = new C41397AtJ(this);
    public CameraApi A05;
    public Om5 A06;
    public Integer A07;
    public String A08 = Camera.FRONT_FACING_CAMERA.identifier;
    public SurfaceTextureHelper A09;
    public Float A0A;
    public final AD4 A0B;
    public final UserSession A0C;
    public final O9Y A0D;
    public final AnonymousClass0eK A0E;
    public final EglBase.Context A0F;
    public final boolean A0G;
    public final boolean A0H;
    public final boolean A0I;
    public final Context A0J;
    public final boolean A0K;
    public final boolean A0L;
    public volatile boolean A0M;

    public final void setApi(CameraApi cameraApi) {
        0qQ.A0B(cameraApi, 0);
        this.A05 = cameraApi;
        cameraApi.setCameraStallHandler(new C383709g1(this));
    }

    public final void setCameraMode(int i) {
    }

    public final int setTargetCaptureSettings(int i, int i2, int i3) {
        return 0;
    }

    public IgLiteCameraProxy(Context context, Point point, UserSession userSession, O9Y o9y, AnonymousClass0eK r8, EglBase.Context context2, double d, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        0qQ.A0B(o9y, 12);
        this.A0J = context;
        this.A0C = userSession;
        this.A0F = context2;
        this.A0E = r8;
        this.A0G = z;
        this.A0K = z2;
        this.A0L = z3;
        this.A0I = z4;
        this.A0D = o9y;
        this.A0H = z5;
        AD4 ad4 = new AD4(new A4Q(this));
        ad4.A02 = point;
        this.A0B = ad4;
        int i = (int) (d * 640.0d);
        if (ad4.A01 != i) {
            AD4.A00(ad4, ad4.A00, i);
            ad4.A01 = i;
        }
    }

    public static final void A00(IgLiteCameraProxy igLiteCameraProxy) {
        C343047pa r0 = igLiteCameraProxy.A03;
        if (r0 != null) {
            int i = r0.A02;
            int i2 = r0.A01;
            Float f = igLiteCameraProxy.A0A;
            if (f != null) {
                float floatValue = f.floatValue();
                C340547lR r02 = C41397AtJ.A00(igLiteCameraProxy).A00;
                if (r02 != null && r02.A0G()) {
                    float f2 = (float) i;
                    float f3 = f2 * 0.25f;
                    float f4 = (-(((f2 / 2.0f) - (f3 / 2.0f)) - floatValue)) / f2;
                    float f5 = (((((float) i2) / 2.0f) - ((f3 * 1.7777778f) / 2.0f)) - floatValue) / (f2 * 1.7777778f);
                    C340547lR r03 = C41397AtJ.A00(igLiteCameraProxy).A00;
                    if (r03 != null) {
                        C340537lQ r04 = r03.A0R;
                        r04.A03 = f4;
                        r04.A04 = f5;
                        r04.A06 = 0.25f;
                        r04.A05 = 0.0f;
                        C18015Vjr vjr = r04.A00;
                        if (vjr != null) {
                            vjr.A01(f4, f5, 0.25f, 0.0f);
                        }
                    }
                }
            }
        }
    }

    public static final void A01(IgLiteCameraProxy igLiteCameraProxy, float f, boolean z) {
        if (z) {
            igLiteCameraProxy.A0A = Float.valueOf(f);
            C340547lR r3 = C41397AtJ.A00(igLiteCameraProxy).A00;
            if (r3 != null) {
                C382539dr r2 = new C382539dr(2);
                r3.A0H = true;
                C340547lR r0 = r3.A0C;
                if (r0 != null) {
                    r0.A0H = true;
                }
                C340957m6 r02 = r3.A0P;
                r02.getClass();
                r02.A08 = true;
                r3.A09((View) null, r2);
            }
            A00(igLiteCameraProxy);
            return;
        }
        C340547lR r22 = C41397AtJ.A00(igLiteCameraProxy).A00;
        if (r22 != null) {
            r22.A0A(new C382539dr(3));
        }
    }

    public final ArrayList createAvailableCameras() {
        return ADX.A00.A00(this.A0J);
    }

    public final CameraApi getApi() {
        CameraApi cameraApi = this.A05;
        if (cameraApi != null) {
            return cameraApi;
        }
        throw AnonymousClass7TE.A0z(C66579MXk.A00(166));
    }

    public final boolean isCameraCurrentlyFacingFront() {
        return 0qQ.A0K(this.A08, Camera.FRONT_FACING_CAMERA.identifier);
    }

    public final void release() {
        if (!this.A0M) {
            A03().destroy();
            this.A0M = true;
            this.A04 = new C41397AtJ(this);
            this.A07 = null;
        }
    }

    public final void setCamera(Camera camera) {
        if (camera != null && !0qQ.A0K(camera.identifier, this.A08)) {
            C40161AUb.A00(A03()).EzJ();
            this.A08 = camera.identifier;
        }
    }

    public final void setCameraOn(boolean z, int i) {
        C71004OWb.A00.A00("IgLiteCameraProxy", 002.A1D("setCameraOn: ", z));
        C40161AUb A032 = A03();
        if (z) {
            CameraApi cameraApi = this.A05;
            if (cameraApi != null) {
                cameraApi.setCameraState(1);
            }
            Om5 om5 = new Om5(this);
            this.A06 = om5;
            A032.A04(om5);
            A032.A03(0qQ.A0K(this.A08, Camera.FRONT_FACING_CAMERA.identifier) ? 1 : 0);
            A032.EIx();
            SurfaceTextureHelper surfaceTextureHelper = this.A09;
            if (surfaceTextureHelper == null) {
                surfaceTextureHelper = SurfaceTextureHelper.create("rsys_litecamera_capture", this.A0F);
            }
            this.A09 = surfaceTextureHelper;
            if (surfaceTextureHelper != null) {
                surfaceTextureHelper.setTextureSize(this.A01, this.A00);
                surfaceTextureHelper.startListening(new C73543Pea(this));
                C345577tk r6 = C41397AtJ.A00(this).A02;
                SurfaceTexture surfaceTexture = surfaceTextureHelper.surfaceTexture;
                C345567tj r62 = (C345567tj) r6;
                0qQ.A0B(surfaceTexture, 0);
                HashMap hashMap = r62.A04;
                if (hashMap.get(surfaceTexture) == null) {
                    C346027uT r1 = new C346027uT(surfaceTexture, false);
                    r1.A0D = true;
                    r1.A09 = 1;
                    r1.A07 = 1;
                    hashMap.put(surfaceTexture, r1);
                    ((C344397rn) C343837qt.A00(r62, C344397rn.A00)).A9j(r1);
                }
                SurfaceTexture surfaceTexture2 = surfaceTextureHelper.surfaceTexture;
                boolean z2 = !this.A0G;
                0qQ.A0B(surfaceTexture2, 0);
                C346027uT r0 = (C346027uT) hashMap.get(surfaceTexture2);
                if (r0 != null) {
                    r0.A0E = z2;
                }
                SurfaceTexture surfaceTexture3 = surfaceTextureHelper.surfaceTexture;
                0qQ.A0B(surfaceTexture3, 0);
                C346027uT r02 = (C346027uT) hashMap.get(surfaceTexture3);
                if (r02 != null) {
                    r02.A07 = 4;
                }
            }
            C40161AUb A033 = A03();
            C343717qg r12 = C345757u2.A04;
            if (A033.A00.CQN(r12)) {
                ((C380729Zh) ((C345757u2) A032.A00.Ape(r12))).A07 = this.A0D;
                return;
            }
            return;
        }
        A032.pause();
        Om5 om52 = this.A06;
        if (om52 != null) {
            A032.A05(om52);
        }
        SurfaceTextureHelper surfaceTextureHelper2 = this.A09;
        if (surfaceTextureHelper2 != null) {
            surfaceTextureHelper2.stopListening();
            C345577tk r4 = C41397AtJ.A00(this).A02;
            SurfaceTexture surfaceTexture4 = surfaceTextureHelper2.surfaceTexture;
            C345567tj r42 = (C345567tj) r4;
            0qQ.A0B(surfaceTexture4, 0);
            C346027uT r13 = (C346027uT) r42.A04.remove(surfaceTexture4);
            if (r13 != null) {
                ((C344397rn) C343837qt.A00(r42, C344397rn.A00)).EEN(r13);
            }
            surfaceTextureHelper2.dispose();
            this.A09 = null;
        }
        CameraApi cameraApi2 = this.A05;
        if (cameraApi2 != null) {
            cameraApi2.setCameraState(0);
        }
        C40161AUb A034 = A03();
        C343717qg r14 = C345757u2.A04;
        if (A034.A00.CQN(r14)) {
            ((C380729Zh) ((C345757u2) A032.A00.Ape(r14))).A07 = null;
        }
    }

    public final void setTargetCaptureResolution(int i, int i2) {
        C71004OWb.A00.A00("IgLiteCameraProxy", 002.A02(i, i2, "setTargetCaptureResolution w:", " h:"));
        if (this.A0K) {
            if (i < i2) {
                i = i2;
            }
            AD4 ad4 = this.A0B;
            if (ad4.A01 != i) {
                AD4.A00(ad4, ad4.A00, i);
                ad4.A01 = i;
            }
        }
    }

    public final void setTargetFps(int i) {
        C71004OWb oWb = C71004OWb.A00;
        oWb.A00("IgLiteCameraProxy", 002.A0O("setTargetFps: ", i));
        C340607lX Ajm = C40161AUb.A00(A03()).Ajm();
        if (Ajm == null || !Ajm.isConnected()) {
            oWb.A00("IgLiteCameraProxy", "Camera service it not initialized yet. Caching the target fps value and updating it after the camera initialization.");
            this.A07 = Integer.valueOf(i);
        } else if (this.A0L) {
            A02(this, i);
        }
    }

    public static final void A02(IgLiteCameraProxy igLiteCameraProxy, int i) {
        List list;
        C345597tm r1 = (C345597tm) C40161AUb.A00(igLiteCameraProxy.A03());
        C340607lX Ajm = r1.Ajm();
        if (Ajm != null && Ajm.isConnected()) {
            int i2 = i * IgNetworkConsentStorage.MAX_ENTRIES;
            C342687p0 A0A2 = r1.A0A();
            if (!(A0A2 == null || (list = (List) A0A2.A01(C342687p0.A12)) == null || list.isEmpty())) {
                int[] iArr = (int[]) list.get(0);
                int i3 = iArr[0];
                int i4 = iArr[1];
                for (int i5 = 1; i5 < list.size(); i5++) {
                    int[] iArr2 = (int[]) list.get(i5);
                    int i6 = iArr2[0];
                    int i7 = iArr2[1];
                    if (i4 > i2 ? i7 <= i2 || i7 < i4 || (i7 == i4 && i6 < i3) : i7 <= i2 && (i7 > i4 || (i7 == i4 && i6 < i3))) {
                        iArr = iArr2;
                        i3 = i6;
                        i4 = i7;
                    }
                }
                C342757p7 r12 = new C342757p7();
                r12.A01(C342717p3.A0n, iArr);
                Ajm.CoY(new C341957no(), r12.A00());
            }
        }
        C40161AUb aUb = C41397AtJ.A00(igLiteCameraProxy).A01;
        ((C344447rs) aUb.A00.Ape(C344447rs.A00)).Enu(i);
    }

    public final C40161AUb A03() {
        C40161AUb aUb = C41397AtJ.A00(this).A01;
        0qQ.A06(aUb);
        return aUb;
    }

    public final void blankOutAndDisableCamera() {
        C40161AUb A032 = A03();
        ((C344397rn) A032.A00.Ape(C344397rn.A00)).AQS(new C41183Aph(new C73139PXa(this)));
    }

    public final boolean isSwitchCameraFacingSupported() {
        return C40161AUb.A00(A03()).Ccx();
    }
}
