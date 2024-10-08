package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.view.Surface;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.onecamera.outputcontrollers.camera.basic.BasicCameraOutputController;
import com.facebook.onecamera.outputcontrollers.touchgesture.basic.BasicTouchGestureOutputController;
import com.instagram.camera.capture.IgCameraFocusView;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.7l2  reason: invalid class name and case insensitive filesystem */
public final class C340297l2 implements C340307l3 {
    public int A00 = 1;
    public AnonymousClass8GD A01;
    public C343367q6 A02;
    public C3497181l A03;
    public C41842B2x A04;
    public IgCameraFocusView A05;
    public C363968ke A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A = false;
    public C344037rD A0B;
    public C340167ko A0C;
    public Boolean A0D;
    public final int A0E;
    public final View A0F;
    public final C344207rU A0G;
    public final C340287l1 A0H;
    public final C340337l6 A0I = new Object();
    public final UserSession A0J;
    public final ArrayList A0K = new ArrayList();
    public final C340147km A0L;
    public final C3496781h A0M;
    public final C340317l4 A0N = new C340317l4(this);
    public final Runnable A0O = new C340327l5(this);

    public static boolean A05(C390989sA r5, C340297l2 r6) {
        String name = r5.name();
        String.format("Processing toggleTo inputType: %s", new Object[]{name});
        C363898kX A012 = A01(r6);
        if (A012 == null || A012.A01 == r5) {
            String.format("inputType is already %s, return early", new Object[]{name});
            return false;
        }
        boolean A0B2 = A012.A0B(r5, false);
        C41842B2x b2x = r6.A04;
        if (b2x != null) {
            if (r5.ordinal() != 0) {
                r6.A0A = true;
                b2x.Dq4();
            } else {
                b2x.Dq3();
                return A0B2;
            }
        }
        return A0B2;
    }

    public final void A0N(AnonymousClass8GD r3, boolean z) {
        C340547lR r0;
        if (A06(this) && (r0 = ((BasicCameraOutputController) A02(this)).A04) != null) {
            r0.A0N.FIb(r3, true, true, z);
        }
    }

    public final void A9b(B17 b17, int i) {
        C340547lR r0 = ((BasicCameraOutputController) A02(this)).A04;
        if (r0 != null) {
            r0.A0N.A9b(b17, 1);
        }
    }

    public final void EdB(boolean z) {
        this.A0D = true;
    }

    public final boolean Esr() {
        return true;
    }

    public final void EyH(AnonymousClass8GD r3) {
        C340547lR r0 = ((BasicCameraOutputController) A02(this)).A04;
        if (r0 != null) {
            r0.A0N.E24((AnonymousClass8GD) null);
        }
    }

    private C342937pP A00(String str) {
        C342927pO r1;
        C340427lF r2 = new C340427lF();
        C342927pO r12 = C340437lG.A00;
        Integer valueOf = Integer.valueOf(this.A00);
        Map map = r2.A00;
        map.put(r12, valueOf);
        map.put(C340437lG.A02, this.A0L);
        map.put(C340437lG.A01, this.A0C);
        map.put(C342937pP.A02, Boolean.valueOf(this.A07));
        map.put(C342937pP.A04, 27p.A01(this.A0J).A04.A0L);
        map.put(C344247rY.A00, this.A0N);
        if (str != null) {
            map.put(C342937pP.A01, str);
        }
        Boolean bool = this.A0D;
        if (bool != null) {
            map.put(C340437lG.A03, bool);
        }
        if (this.A0H.A00 != null) {
            r1 = C344267ra.A00;
        } else {
            r1 = C340437lG.A04;
        }
        map.put(r1, this.A0I);
        return new C342937pP(r2);
    }

    public static C363898kX A01(C340297l2 r1) {
        C341297me r12 = (C341297me) r1.A0G.A01(C341297me.A02);
        if (r12 instanceof C363898kX) {
            return (C363898kX) r12;
        }
        return null;
    }

    public static C345497tb A02(C340297l2 r1) {
        return (C345497tb) r1.A0G.A02(C345497tb.A00);
    }

    public static Object A03(C342727p4 r2, C340297l2 r3) {
        if (r3.A02 != null) {
            if (!A06(r3)) {
                0kD.A01("OneCameraController", "The camera has been disconnected, so this setting is stale.");
            }
            return r3.A02.A03.A02(r2);
        }
        throw new IllegalStateException("Can not get camera facing, the camera has not been initialised.");
    }

    public static void A04(C340297l2 r9) {
        C363898kX A012;
        int i;
        if (r9.A04 != null && (A012 = A01(r9)) != null) {
            A012.A0A();
            C378839Rk r6 = new C378839Rk(true);
            C390989sA r2 = C390989sA.A04;
            C41842B2x b2x = r9.A04;
            Integer valueOf = Integer.valueOf(b2x.BHR());
            int BHc = b2x.BHc();
            Integer valueOf2 = Integer.valueOf(BHc);
            C343697qe Ape = A012.A00.Ape(r2.A00);
            0qQ.A07(Ape);
            if (Ape instanceof C382249dO) {
                C382249dO r22 = (C382249dO) Ape;
                if (valueOf != null) {
                    i = valueOf.intValue();
                } else {
                    i = r22.A01;
                }
                r22.A01 = i;
                if (valueOf2 == null) {
                    BHc = r22.A02;
                }
                r22.A02 = BHc;
                C346247ur r1 = new C346247ur(r6, new C345047sq());
                r1.A02.A07 = true;
                r22.A06 = r1;
            }
            r9.A04.DKa(new Surface(r6.getSurfaceTexture()));
        }
    }

    public static boolean A06(C340297l2 r2) {
        C340547lR r0;
        C344207rU r22 = r2.A0G;
        if (r22.A08()) {
            C340447lH r1 = C344247rY.A01;
            C343817qr r02 = (C343817qr) r22.A00;
            C343817qr.A01(r02);
            C345437tU r12 = (C345437tU) ((C344247rY) ((C344257rZ) r02.A02.A00(r1)));
            if (!r12.A03.get() || (r0 = r12.A00) == null || !r0.A0N.isConnected()) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int A07() {
        if (this.A02 == null) {
            return this.A00;
        }
        if (!A06(this)) {
            0kD.A01("OneCameraController", "messageThe camera has been disconnected, so this value is stale.");
        }
        return this.A02.A01;
    }

    public final int A08() {
        C343367q6 r0 = this.A02;
        if (r0 == null) {
            return 0;
        }
        Object A022 = r0.A03.A02(C342717p3.A0B);
        A022.getClass();
        return ((Number) A022).intValue();
    }

    public final int A09() {
        Number number;
        C343367q6 r0 = this.A02;
        if (r0 == null || (number = (Number) r0.A03.A02(C342717p3.A0e)) == null) {
            return 0;
        }
        return number.intValue();
    }

    public final Bitmap A0A(int i, int i2) {
        TextureView textureView = this.A0H.A01;
        if (textureView != null) {
            return textureView.getBitmap(i, i2);
        }
        return null;
    }

    public final Rect A0B() {
        Rect rect = (Rect) A03(C342717p3.A0p, this);
        if (rect == null) {
            return new Rect();
        }
        return rect;
    }

    public final void A0C() {
        this.A0H.A00().setVisibility(0);
    }

    public final void A0D() {
        C344207rU r1 = this.A0G;
        if (r1.A08()) {
            r1.A05();
            Iterator it = this.A0K.iterator();
            while (it.hasNext()) {
                C340417lE r12 = (C340417lE) it.next();
                r12.A00.onPaused();
                C345487tZ A002 = C340387lB.A00(r12.A01);
                if (A002 != null) {
                    0sn r13 = 0sn.A00;
                    C345167t2 r0 = ((C345467tX) A002).A00;
                    if (r0 != null) {
                        ((C345157t1) r0).A03.A02(r13);
                    }
                }
            }
        }
    }

    public final void A0E() {
        C363898kX A012;
        int i;
        if (this.A04 != null && (A012 = A01(this)) != null) {
            C378839Rk r6 = new C378839Rk(true);
            C390989sA r2 = C390989sA.A04;
            C41842B2x b2x = this.A04;
            Integer valueOf = Integer.valueOf(b2x.BHR());
            int BHc = b2x.BHc();
            Integer valueOf2 = Integer.valueOf(BHc);
            C343697qe Ape = A012.A00.Ape(r2.A00);
            0qQ.A07(Ape);
            if (Ape instanceof C382249dO) {
                C382249dO r22 = (C382249dO) Ape;
                if (valueOf != null) {
                    i = valueOf.intValue();
                } else {
                    i = r22.A01;
                }
                r22.A01 = i;
                if (valueOf2 == null) {
                    BHc = r22.A02;
                }
                r22.A02 = BHc;
                C346247ur r1 = new C346247ur(r6, new C345047sq());
                r1.A02.A07 = true;
                r22.A06 = r1;
            }
            this.A04.Egc(new Surface(r6.getSurfaceTexture()));
        }
    }

    public final void A0H(AnonymousClass8FP r2) {
        C340547lR r0;
        if (this.A0G.A08() && (r0 = ((BasicCameraOutputController) A02(this)).A04) != null) {
            r0.A0N.EEK(r2);
        }
    }

    public final void A0J(AnonymousClass8GD r5) {
        Context context = this.A0H.A00().getContext();
        C340587lV.A00(context.getApplicationContext(), (Handler) null, C3495180r.A00(context), false).BXP(r5);
    }

    public final void A0L(AnonymousClass8GD r3, int i, int i2) {
        C340547lR r0 = ((C345387tP) ((C345397tQ) this.A0G.A01(C345397tQ.A00))).A04;
        if (r0 == null) {
            r3.A01(new IllegalStateException("CameraViewController is null"));
        } else {
            r0.A0O.Bet(r3, i, i2);
        }
    }

    public final void A0M(AnonymousClass8GD r9, AnonymousClass8GD r10) {
        C343367q6 r0 = this.A02;
        boolean z = false;
        if (r0 != null) {
            C342717p3 r02 = r0.A03;
            C342727p4 r4 = C342717p3.A0e;
            if (r02.A02(r4) != null && (((Number) this.A02.A03.A02(r4)).intValue() == 2 || ((Number) this.A02.A03.A02(r4)).intValue() == 1)) {
                z = true;
            }
        }
        C363988kg r7 = new C363988kg();
        r7.A01(C363988kg.A05, false);
        r7.A01(C363988kg.A08, false);
        C363998kh r3 = C363988kg.A06;
        r7.A01(r3, Boolean.valueOf(z));
        C364008ki r5 = new C364008ki(r9, r10, this);
        C345387tP r6 = (C345387tP) ((C345397tQ) this.A0G.A01(C345397tQ.A00));
        Integer num = AnonymousClass05K.A0C;
        if (Boolean.TRUE.equals(r7.A00(r3))) {
            num = AnonymousClass05K.A0Y;
        }
        C344037rD r42 = r6.A00;
        C363798kM.A00(r42, num, "BasicPhotoCaptureCoordinator", r6.hashCode());
        C340547lR r1 = r6.A04;
        if (r1 != null) {
            r1.A0D(new C364028kk(r6, r5), r7);
            return;
        }
        C391719tX r2 = new C391719tX(10015, "CameraViewController is null");
        C363808kN.A00(r2, r42, "BasicPhotoCaptureCoordinator", "high", r6.hashCode());
        r5.DCn(r2);
    }

    public final void A0O(C3497181l r2) {
        if (r2 != null && CVP()) {
            C343367q6 r0 = this.A02;
            r0.getClass();
            r2.DKf(r0);
        }
        this.A03 = r2;
    }

    public final void A0P(C279284yO r6, String str) {
        ViewGroup viewGroup;
        C344207rU r4 = this.A0G;
        UserSession userSession = this.A0J;
        AnonymousClass8A2 A012 = AnonymousClass8A1.A01(userSession);
        String str2 = 27p.A01(userSession).A04.A0L;
        if (r6 != null) {
            A012.A07(r6, str2);
        }
        C340287l1 r3 = this.A0H;
        SurfaceView surfaceView = r3.A00;
        if (!(surfaceView == null || (viewGroup = r3.A02) == null)) {
            viewGroup.addView(surfaceView, 0);
            r3.A02 = null;
        }
        C343827qs r2 = r4.A00;
        if (((C343817qr) r2).A07 == 4) {
            r4.A06();
            Iterator it = this.A0K.iterator();
            while (it.hasNext()) {
                ((C340417lE) it.next()).A00.onResumed();
            }
            return;
        }
        r2.AJF(A00(str));
    }

    public final void A0Q(C279284yO r4, String str) {
        C344207rU r2 = this.A0G;
        if (r2.A08()) {
            r2.A07(A00(str));
            return;
        }
        UserSession userSession = this.A0J;
        AnonymousClass8A2 A012 = AnonymousClass8A1.A01(userSession);
        String str2 = 27p.A01(userSession).A04.A0L;
        if (r4 != null) {
            A012.A07(r4, str2);
        }
        r2.A00.AJF(A00(str));
    }

    public final void A0R(Integer num) {
        ((C345417tS) this.A0G.A01(C345417tS.A00)).EyS(num);
    }

    public final void A0S(boolean z) {
        C341847nc r0 = ((BasicTouchGestureOutputController) ((C345507td) this.A0G.A02(C345507td.A00))).A01;
        if (r0 != null) {
            r0.A02.A00 = z;
        }
    }

    public final boolean A0U() {
        C363898kX A012;
        boolean z = false;
        if (((C343817qr) this.A0G.A00).A07 != 0) {
            z = true;
        }
        if (!z || (A012 = A01(this)) == null || A012.A01 != C390989sA.A04) {
            return false;
        }
        return true;
    }

    public final boolean A0V() {
        return ((C345417tS) this.A0G.A01(C345417tS.A00)).CaT();
    }

    public final boolean A0W() {
        C340547lR r0;
        C344207rU r1 = this.A0G;
        if (((C343817qr) r1.A00).A07 == 0 || (r0 = ((C345387tP) ((C345397tQ) r1.A01(C345397tQ.A00))).A04) == null || !r0.A0N.Cd1()) {
            return false;
        }
        return true;
    }

    public final void AJI(AnonymousClass8GD r5, C341047mF r6, C279284yO r7) {
        this.A01 = r5;
        C344207rU r3 = this.A0G;
        if (r3.A08()) {
            r3.A07(A00((String) null));
            return;
        }
        UserSession userSession = this.A0J;
        AnonymousClass8A2 A012 = AnonymousClass8A1.A01(userSession);
        String str = 27p.A01(userSession).A04.A0L;
        if (r7 != null) {
            A012.A07(r7, str);
        }
        r3.A00.AJF(A00((String) null));
    }

    public final C344037rD B46() {
        C344037rD r0 = this.A0B;
        if (r0 != null) {
            return r0;
        }
        C344207rU r02 = this.A0G;
        C344037rD r03 = (C344037rD) r02.A00.Apf(C344037rD.A00);
        this.A0B = r03;
        return r03;
    }

    public final void Dza() {
        this.A0M.CZj(this.A0O);
    }

    public final void Egd(SurfaceTexture surfaceTexture, int i, int i2) {
        C343697qe Ape = ((C345357tM) ((B3N) this.A0G.A01(B3N.A00))).A00.Ape(C345547th.A00);
        0qQ.A07(Ape);
        ((C345547th) Ape).Egb(surfaceTexture, i, i2);
    }

    public final void Er8(float f) {
        C343367q6 r3 = this.A02;
        if (r3 != null) {
            int intValue = ((Number) r3.A02.A01(C342687p0.A0j)).intValue();
            int intValue2 = ((Number) r3.A02.A01(C342687p0.A0l)).intValue();
            C345497tb A022 = A02(this);
            int min = Math.min(intValue, (int) Math.max(((float) intValue) * f, (float) intValue2));
            C340547lR r0 = ((BasicCameraOutputController) A022).A04;
            if (r0 != null) {
                r0.A0N.Er9((AnonymousClass8GD) null, min);
            }
        }
    }

    public final void disconnect() {
        this.A0G.A04();
        C340287l1 r2 = this.A0H;
        SurfaceView surfaceView = r2.A00;
        if (surfaceView != null && r2.A02 == null) {
            ViewGroup viewGroup = (ViewGroup) surfaceView.getParent();
            r2.A02 = viewGroup;
            if (viewGroup != null) {
                viewGroup.removeView(surfaceView);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [X.7l6, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x013a, code lost:
        if (X.182.A06(r7, r4, 36317242728125390L) == false) goto L_0x013c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x01db  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C340297l2(android.view.View r11, X.C340277l0 r12, X.C340167ko r13, X.C340147km r14, X.C3496781h r15, X.C340287l1 r16, com.instagram.common.session.UserSession r17, java.lang.String r18, int r19, boolean r20) {
        /*
            r10 = this;
            r10.<init>()
            r5 = 1
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r5)
            r10.A00 = r5
            r2 = 0
            r10.A0A = r2
            X.7l4 r0 = new X.7l4
            r0.<init>(r10)
            r10.A0N = r0
            X.7l5 r0 = new X.7l5
            r0.<init>(r10)
            r10.A0O = r0
            X.7l6 r0 = new X.7l6
            r0.<init>()
            r10.A0I = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r10.A0K = r0
            r10.A0F = r11
            r8 = r16
            r10.A0H = r8
            r4 = r17
            r10.A0J = r4
            r10.A0L = r14
            r10.A0C = r13
            r7 = r19
            r10.A0E = r7
            if (r15 != 0) goto L_0x0042
            X.9Vp r15 = new X.9Vp
            r15.<init>(r10)
        L_0x0042:
            r10.A0M = r15
            X.7qZ r6 = new X.7qZ
            r0 = r18
            r6.<init>((java.lang.String) r0)
            X.7qb r0 = X.C343677qc.A00
            r6.A02(r0, r4)
            X.7qb r0 = X.C340357l8.A00
            r6.A02(r0, r12)
            X.7qb r0 = X.C343687qd.A00
            r6.A02(r0, r3)
            X.7qb r1 = X.C343657qa.A03
            X.27r r0 = X.27p.A01(r4)
            X.283 r0 = r0.A04
            java.lang.String r0 = r0.A0L
            r6.A02(r1, r0)
            android.view.TextureView r1 = r8.A01
            if (r1 == 0) goto L_0x0201
            X.7qb r0 = X.C340357l8.A03
        L_0x006d:
            r6.A02(r0, r1)
        L_0x0070:
            int r1 = r10.A0E
            if (r1 == r5) goto L_0x0077
            r0 = 3
            if (r1 != r0) goto L_0x0092
        L_0x0077:
            X.7qb r1 = X.C343737qi.A02
            java.lang.Object r0 = X.C343747qj.A06
            r6.A02(r1, r0)
            X.7qb r9 = X.C343737qi.A0A
            X.0Tu r8 = X.0Tu.A05
            r0 = 36324252114300839(0x810cb700012fa7, double:3.0349415308824315E-306)
            boolean r0 = X.182.A06(r8, r4, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r6.A02(r9, r0)
        L_0x0092:
            X.7l1 r0 = r10.A0H
            android.view.View r0 = r0.A00()
            android.content.Context r0 = r0.getContext()
            android.content.Context r0 = r0.getApplicationContext()
            boolean r0 = X.C362998is.A00(r0, r4)
            if (r0 == 0) goto L_0x00c0
            X.7qb r0 = X.C341297me.A01
            r6.A02(r0, r3)
            X.0qQ.A0B(r4, r2)
            X.0Tu r8 = X.0Tu.A05
            r0 = 36316242003824799(0x81056e0037109f, double:3.029875904763258E-306)
            boolean r0 = X.182.A06(r8, r4, r0)
            if (r0 == 0) goto L_0x00c0
            X.7qb r0 = X.C341297me.A00
            r6.A02(r0, r3)
        L_0x00c0:
            if (r19 == 0) goto L_0x01db
            if (r7 == r5) goto L_0x011e
            r0 = 2
            if (r7 == r0) goto L_0x0102
            r0 = 3
            if (r7 != r0) goto L_0x0209
            X.7l1 r0 = r10.A0H
            android.view.View r0 = r0.A00()
            android.content.Context r0 = r0.getContext()
            android.content.Context r0 = r0.getApplicationContext()
            X.7qa r5 = new X.7qa
            r5.<init>(r6)
            X.0qQ.A0B(r0, r2)
            X.AUW r2 = new X.AUW
            r2.<init>(r5)
        L_0x00e5:
            X.7qo r6 = X.C343797qo.A00
            android.content.Context r7 = r0.getApplicationContext()
            X.0qQ.A07(r7)
        L_0x00ee:
            java.lang.Class<com.facebook.onecamera.configurations.AppSpecific> r1 = com.facebook.onecamera.configurations.AppSpecific.class
            X.7qq r0 = new X.7qq
            r0.<init>(r1)
            X.7qn r2 = (X.C343787qn) r2
            X.7qn[] r0 = new X.C343787qn[]{r0, r2}
        L_0x00fb:
            X.7rU r0 = r6.A00(r7, r5, r0)
            r10.A0G = r0
            return
        L_0x0102:
            X.7l1 r0 = r10.A0H
            android.view.View r0 = r0.A00()
            android.content.Context r0 = r0.getContext()
            android.content.Context r0 = r0.getApplicationContext()
            X.7qa r5 = new X.7qa
            r5.<init>(r6)
            X.0qQ.A0B(r0, r2)
            X.AUV r2 = new X.AUV
            r2.<init>()
            goto L_0x00e5
        L_0x011e:
            X.7qb r1 = X.C343767ql.A01
            r0 = 1065353216(0x3f800000, float:1.0)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r6.A02(r1, r0)
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 34
            if (r1 < r0) goto L_0x013c
            X.0Tu r7 = X.0Tu.A05
            r0 = 36317242728125390(0x810657000813ce, double:3.030508766840545E-306)
            boolean r0 = X.182.A06(r7, r4, r0)
            if (r0 != 0) goto L_0x014a
        L_0x013c:
            X.0Tu r7 = X.0Tu.A05
            r0 = 36317242727863242(0x810657000413ca, double:3.0305087666747615E-306)
            boolean r0 = X.182.A06(r7, r4, r0)
            if (r0 != 0) goto L_0x014a
            r5 = 0
        L_0x014a:
            X.7qb r1 = X.C343737qi.A04
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            r6.A02(r1, r0)
            X.7qb r0 = X.C343777qm.A00
            r6.A02(r0, r3)
            X.7qb r3 = X.C343737qi.A06
            r0 = 36324252114300839(0x810cb700012fa7, double:3.0349415308824315E-306)
            boolean r0 = X.182.A06(r7, r4, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r6.A02(r3, r0)
            X.7qb r3 = X.C343737qi.A0L
            r0 = 36605727091201328(0x820cb700041530, double:3.212947439683059E-306)
            long r0 = X.182.A01(r7, r4, r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            int r0 = r0.intValue()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r6.A02(r3, r0)
            X.7l1 r0 = r10.A0H
            android.view.View r0 = r0.A00()
            android.content.Context r0 = r0.getContext()
            android.content.Context r3 = r0.getApplicationContext()
            X.7qa r5 = new X.7qa
            r5.<init>(r6)
            boolean r1 = X.C3495280s.A03(r20)
            X.0qQ.A0B(r3, r2)
            X.7l9 r0 = new X.7l9
            r0.<init>(r5, r1)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r4.add(r0)
            X.7qo r6 = X.C343797qo.A00
            android.content.Context r7 = r3.getApplicationContext()
            X.0qQ.A07(r7)
            r0 = 2
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r0)
            java.lang.Class<com.facebook.onecamera.configurations.AppSpecific> r1 = com.facebook.onecamera.configurations.AppSpecific.class
            X.7qq r0 = new X.7qq
            r0.<init>(r1)
            r3.add(r0)
            X.7qn[] r0 = new X.C343787qn[r2]
            java.lang.Object[] r0 = r4.toArray(r0)
            X.0tw.A00(r0, r3)
            int r0 = r3.size()
            X.7qn[] r0 = new X.C343787qn[r0]
            java.lang.Object[] r0 = r3.toArray(r0)
            X.7qn[] r0 = (X.C343787qn[]) r0
            goto L_0x00fb
        L_0x01db:
            X.7l1 r0 = r10.A0H
            android.view.View r0 = r0.A00()
            android.content.Context r0 = r0.getContext()
            android.content.Context r0 = r0.getApplicationContext()
            X.7qa r5 = new X.7qa
            r5.<init>(r6)
            X.0qQ.A0B(r0, r2)
            X.9Vq r2 = new X.9Vq
            r2.<init>()
            X.7qo r6 = X.C343797qo.A00
            android.content.Context r7 = r0.getApplicationContext()
            X.0qQ.A07(r7)
            goto L_0x00ee
        L_0x0201:
            android.view.SurfaceView r1 = r8.A00
            if (r1 == 0) goto L_0x0070
            X.7qb r0 = X.C340357l8.A02
            goto L_0x006d
        L_0x0209:
            java.lang.String r0 = "Invalid OneCamera configuration: "
            java.lang.String r1 = X.002.A0O(r0, r7)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C340297l2.<init>(android.view.View, X.7l0, X.7ko, X.7km, X.81h, X.7l1, com.instagram.common.session.UserSession, java.lang.String, int, boolean):void");
    }

    public final void A0F(ADm aDm, AnonymousClass8GD r4, AnonymousClass8GD r5, AnonymousClass8GD r6, LOF lof) {
        this.A0A = A0U();
        ((C345417tS) this.A0G.A01(C345417tS.A00)).Exo(aDm, lof, new A6Z(r4, r6, r5, this));
    }

    public final void A0G(AnonymousClass8FP r2) {
        C340547lR r0 = ((BasicCameraOutputController) A02(this)).A04;
        if (r0 != null) {
            r0.A0N.A9c(r2);
        }
    }

    public final void A0I(C340347l7 r2) {
        C340547lR r0 = ((BasicCameraOutputController) A02(this)).A04;
        if (r0 != null) {
            r0.A0N.EEL(r2);
        }
    }

    public final void A0K(AnonymousClass8GD r5, int i) {
        C340547lR r3 = ((BasicCameraOutputController) A02(this)).A04;
        if (r3 != null) {
            C342757p7 r2 = new C342757p7();
            r2.A01(C342717p3.A0B, Integer.valueOf(i));
            r3.A0N.CoY(r5, r2.A00());
        }
    }

    public final boolean A0T() {
        C340547lR r0 = ((BasicCameraOutputController) A02(this)).A04;
        if (r0 == null || !r0.A0G()) {
            return false;
        }
        return true;
    }

    public final C352718Eo ALQ() {
        return B46().ALQ();
    }

    public final void ARP(HashMap hashMap, boolean z) {
        C345497tb A022 = A02(this);
        C342757p7 r2 = new C342757p7();
        r2.A01(C342717p3.A0M, Boolean.valueOf(z));
        r2.A01(C342717p3.A02, hashMap);
        C343147pk A002 = r2.A00();
        C364508lX r22 = new C364508lX(this);
        C340547lR r0 = ((BasicCameraOutputController) A022).A04;
        if (r0 != null) {
            r0.A0N.CoY(r22, A002);
        } else {
            r22.A01(new RuntimeException("camera output controller is already released."));
        }
    }

    public final void CJd(AnonymousClass8GD r4) {
        BasicCameraOutputController basicCameraOutputController = (BasicCameraOutputController) A02(this);
        Boolean bool = basicCameraOutputController.A00;
        if (bool != null) {
            BasicCameraOutputController.A03(BasicCameraOutputController.A00(basicCameraOutputController).Aja(), r4, bool);
        } else {
            BasicCameraOutputController.A00(basicCameraOutputController).CJd(new C370378wL(basicCameraOutputController, r4));
        }
    }

    public final void CJq(AnonymousClass8GD r4) {
        BasicCameraOutputController basicCameraOutputController = (BasicCameraOutputController) A02(this);
        Boolean bool = basicCameraOutputController.A01;
        if (bool != null) {
            BasicCameraOutputController.A03(BasicCameraOutputController.A00(basicCameraOutputController).Aja(), r4, bool);
        } else {
            BasicCameraOutputController.A00(basicCameraOutputController).CJq(new C370388wM(basicCameraOutputController, r4));
        }
    }

    public final boolean CJr() {
        BasicCameraOutputController basicCameraOutputController = (BasicCameraOutputController) A02(this);
        Boolean bool = basicCameraOutputController.A01;
        if (bool != null) {
            return bool.booleanValue();
        }
        return BasicCameraOutputController.A00(basicCameraOutputController).CJf(1);
    }

    public final boolean CPy() {
        if (1 != A07()) {
            return false;
        }
        return true;
    }

    public final boolean CVP() {
        if (!A06(this) || this.A02 == null) {
            return false;
        }
        return true;
    }

    public final void EEJ(B17 b17) {
        C340547lR r0;
        if (A06(this) && (r0 = ((BasicCameraOutputController) A02(this)).A04) != null) {
            r0.A0N.EEJ(b17);
        }
    }

    public final void EI4(Boolean bool) {
        C390989sA r1;
        C363898kX A012 = A01(this);
        if (A012 != null && A012.A01 != (r1 = C390989sA.A03)) {
            A012.A0B(r1, false);
            C41842B2x b2x = this.A04;
            if (b2x != null && !bool.booleanValue()) {
                b2x.Dq3();
            }
        }
    }

    public final void EWw(AnonymousClass8GD r2) {
        C340547lR r0 = ((BasicCameraOutputController) A02(this)).A04;
        if (r0 != null) {
            r0.A0N.ARl(r2);
        }
    }

    public final void EXA(boolean z) {
        if (A06(this)) {
            C345497tb A022 = A02(this);
            C342757p7 r2 = new C342757p7();
            r2.A01(C342717p3.A0U, Boolean.valueOf(z));
            C343147pk A002 = r2.A00();
            C341977nq r22 = new C341977nq(this);
            C340547lR r0 = ((BasicCameraOutputController) A022).A04;
            if (r0 != null) {
                r0.A0N.CoY(r22, A002);
            } else {
                r22.A01(new RuntimeException("camera output controller is already released."));
            }
        }
    }

    public final void EzI(AnonymousClass8GD r2) {
        C340547lR r0 = ((BasicCameraOutputController) A02(this)).A04;
        if (r0 != null) {
            r0.A0B(r2);
        }
    }

    public final void Ej6(C340167ko r1) {
        this.A0C = r1;
    }

    public final void setInitialCameraFacing(int i) {
        this.A00 = i;
    }
}
