package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import com.instagram.android.R;
import com.instagram.arlink.ui.CameraMaskOverlay;
import com.instagram.arlink.ui.GridPatternView;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.shutterbutton.ShutterButton;
import java.util.Map;

public final class LWg implements TextureView.SurfaceTextureListener, C252203oj, 1DN {
    public static final C71392co A0M = C71392co.A01();
    public int A00;
    public TextureView A01;
    public View A02;
    public ViewGroup A03;
    public ImageView A04;
    public CameraMaskOverlay A05;
    public U1A A06;
    public AnonymousClass5Gv A07;
    public C339797kB A08;
    public ShutterButton A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public final Activity A0D;
    public final View A0E;
    public final ViewStub A0F;
    public final KB6 A0G;
    public final C340307l3 A0H;
    public final UserSession A0I;
    public final View A0J;
    public final 2cs A0K;
    public final GridPatternView A0L;

    public final void DWm(Map map) {
        String str;
        boolean z = false;
        this.A0C = false;
        Object obj = map.get("android.permission.CAMERA");
        if (obj == C346927vz.DENIED_DONT_ASK_AGAIN) {
            z = true;
        }
        this.A0A = z;
        C346927vz r3 = C346927vz.GRANTED;
        if (obj == r3) {
            UserSession userSession = this.A0I;
            LCx A002 = C63058Kqn.A00(userSession);
            A002.A01.put("open_camera", Long.valueOf(A002.A00.now()));
            boolean isAvailable = this.A01.isAvailable();
            TextureView textureView = this.A01;
            if (isAvailable) {
                A00(textureView.getSurfaceTexture(), this.A01.getWidth(), this.A01.getHeight());
            } else {
                textureView.setSurfaceTextureListener(this);
            }
            this.A09.setEnabled(true);
            this.A05.setEnabled(true);
            View view = this.A0E;
            view.setEnabled(true);
            view.setVisibility(0);
            1Av A003 = 1Au.A00(userSession);
            if (!AnonymousClass7TG.A1a(A003, A003.A45, 1Av.A8a, 104)) {
                ViewGroup viewGroup = this.A03;
                viewGroup.getClass();
                viewGroup.post(new M1w(this));
            }
            C339797kB r0 = this.A08;
            if (r0 != null) {
                r0.A00();
                this.A08 = null;
            }
        } else {
            if (this.A08 == null) {
                ViewGroup viewGroup2 = this.A03;
                viewGroup2.getClass();
                Context context = viewGroup2.getContext();
                C339797kB A0O = JTQ.A0O(this.A03);
                A0O.A06(map);
                A0O.A05(context.getString(2131967988));
                A0O.A04(context.getString(2131967992));
                A0O.A02(2131967987);
                A0O.A01();
                this.A08 = A0O;
                A0O.A03(new LYC((Object) this, 47));
                this.A0E.setVisibility(8);
            }
            this.A08.A06(map);
        }
        Object obj2 = map.get("android.permission.CAMERA");
        if (obj2 != null) {
            if (obj2.equals(r3)) {
                str = "app_permission_grant";
            } else {
                str = "app_permission_deny";
            }
            UserSession userSession2 = this.A0I;
            JTU.A1F(new AnonymousClass4O6(new C64576LeI(this), userSession2), AnonymousClass4O7.A00(userSession2), str, "SELFIE_CAMERA_CONTROLLER", AnonymousClass7TE.A1I(AnonymousClass4O8.UNKNOWN));
        }
    }

    public final void DmD(2cs r1) {
    }

    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, X.7km] */
    private void A00(SurfaceTexture surfaceTexture, int i, int i2) {
        C340307l3 r4 = this.A0H;
        Map map = C340157kn.A01;
        C340177kp r3 = C340177kp.LOW;
        r4.Ej6(new C382469dk(r3, r3, new Object()));
        r4.setInitialCameraFacing(1);
        r4.Egd(surfaceTexture, i, i2);
        r4.AJI(new K04(this, 0), (C341047mF) null, (C279284yO) null);
    }

    public static void A01(LWg lWg) {
        if (lWg.A03 != null) {
            C17669Vc0 vc0 = new C17669Vc0(lWg.A05, "SelfieCameraController", lWg.A0L);
            vc0.A02 = 10;
            vc0.A00 = 10;
            vc0.A03 = lWg.A03.getContext().getColor(R.color.blur_mask_tint_color);
            U1A u1a = new U1A(vc0);
            lWg.A06 = u1a;
            u1a.setVisible(true, false);
            lWg.A05.setImageDrawable(lWg.A06);
        }
    }

    public static void A02(LWg lWg) {
        if (!lWg.A0C) {
            lWg.A0C = true;
            lWg.A0E.setEnabled(false);
            lWg.A09.setEnabled(false);
            JTP.A11(lWg.A0D, lWg, "android.permission.CAMERA");
        }
    }

    public static void A03(LWg lWg) {
        C62594KiR kiR = (C62594KiR) C62594KiR.A04.get(lWg.A00);
        kiR.getClass();
        ViewGroup viewGroup = lWg.A03;
        viewGroup.getClass();
        Drawable drawable = viewGroup.getContext().getDrawable(kiR.A02);
        drawable.getClass();
        int A032 = (int) (AnonymousClass7TE.A03(lWg.A01) * kiR.A00);
        int intrinsicWidth = (int) (((float) (drawable.getIntrinsicWidth() * A032)) / ((float) drawable.getIntrinsicHeight()));
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) lWg.A04.getLayoutParams();
        marginLayoutParams.width = intrinsicWidth;
        marginLayoutParams.height = A032;
        marginLayoutParams.leftMargin = (lWg.A03.getWidth() - intrinsicWidth) / 2;
        marginLayoutParams.topMargin = lWg.A01.getTop() + ((int) (AnonymousClass7TE.A03(lWg.A01) * kiR.A01));
        lWg.A04.setLayoutParams(marginLayoutParams);
        lWg.A04.setImageDrawable(drawable);
    }

    public final void A04(int i, boolean z, boolean z2) {
        if (this.A03 == null) {
            ViewGroup viewGroup = (ViewGroup) this.A0F.inflate();
            this.A03 = viewGroup;
            this.A01 = (TextureView) viewGroup.requireViewById(R.id.selfie_camera_view);
            CameraMaskOverlay cameraMaskOverlay = (CameraMaskOverlay) this.A03.requireViewById(R.id.camera_mask_overlay);
            this.A05 = cameraMaskOverlay;
            cameraMaskOverlay.A00 = this.A01;
            LYC.A00(cameraMaskOverlay, 48, this);
            A01(this);
            this.A05.setOnSystemUiVisibilityChangeListener(new LYY(this));
            View requireViewById = this.A03.requireViewById(R.id.cancel_button);
            this.A02 = requireViewById;
            AnonymousClass3NG A0m = AnonymousClass7TE.A0m(requireViewById);
            A0m.A04 = new C61685KHt(this, 5);
            Integer num = AnonymousClass05K.A01;
            A0m.A05 = num;
            A0m.A00();
            this.A04 = DbU.A0F(this.A03, R.id.selfie_sticker_view);
            ShutterButton shutterButton = (ShutterButton) this.A03.requireViewById(R.id.selfie_camera_shutter_button);
            this.A09 = shutterButton;
            shutterButton.setVideoRecordingEnabled(false);
            shutterButton.setButtonActionsEnabled(false);
            C61685KHt.A00(AnonymousClass7TE.A0m(shutterButton), this, 6);
            2eS.A04(this.A09, num);
        }
        this.A00 = i;
        this.A0B = z2;
        2cs r1 = this.A0K;
        if (z) {
            r1.A06(1.0d);
        } else {
            r1.A08(1.0d, true);
        }
        this.A01.post(new C65855M1v(this));
        A02(this);
    }

    public final void A05(boolean z) {
        ViewGroup viewGroup = this.A03;
        if (viewGroup != null && viewGroup.getVisibility() == 0) {
            C340307l3 r1 = this.A0H;
            if (r1.CVP()) {
                r1.disconnect();
            }
            AnonymousClass5Gv r12 = this.A07;
            if (r12 != null) {
                r12.A08(true);
                this.A07 = null;
            }
            2cs r13 = this.A0K;
            if (z) {
                r13.A06(0.0d);
            } else {
                r13.A08(0.0d, true);
            }
        }
    }

    public final void DmB(2cs r6) {
        if (r6.A01 == 0.0d) {
            this.A01.setVisibility(8);
            this.A09.setVisibility(8);
        }
        this.A0J.setLayerType(2, (Paint) null);
    }

    public final void DmC(2cs r7) {
        if (r7.A01 == 1.0d) {
            this.A01.setVisibility(0);
            this.A09.setVisibility(0);
            GridPatternView gridPatternView = this.A0L;
            C62594KiR kiR = (C62594KiR) C62594KiR.A04.get(this.A00);
            kiR.getClass();
            gridPatternView.setSticker(kiR.A02);
            U1A u1a = this.A06;
            u1a.getClass();
            u1a.A09 = true;
            U1A.A05(u1a);
        }
        this.A0J.setLayerType(0, (Paint) null);
    }

    public final void DmE(2cs r8) {
        C71412ct r5 = r8.A09;
        float A002 = JTT.A00(r5);
        boolean z = this.A0B;
        int i = 8;
        int i2 = 0;
        View view = this.A02;
        if (z) {
            view.setAlpha(A002);
            this.A02.setVisibility(JTQ.A01((A002 > 0.0f ? 1 : (A002 == 0.0f ? 0 : -1))));
        } else {
            view.setVisibility(8);
        }
        this.A09.setAlpha(A002);
        this.A09.setVisibility(JTQ.A01((A002 > 0.0f ? 1 : (A002 == 0.0f ? 0 : -1))));
        View view2 = this.A0J;
        float f = 1.0f - A002;
        view2.setAlpha(f);
        if (f > 0.0f) {
            i = 0;
        }
        view2.setVisibility(i);
        int A003 = (int) AnonymousClass37Q.A00(r5.A00);
        CameraMaskOverlay cameraMaskOverlay = this.A05;
        int i3 = 4;
        int i4 = 4;
        if (A003 > 0) {
            i4 = 0;
        }
        cameraMaskOverlay.setVisibility(i4);
        this.A05.setImageAlpha(A003);
        ImageView imageView = this.A04;
        int i5 = 4;
        if (A003 > 0) {
            i5 = 0;
        }
        imageView.setVisibility(i5);
        this.A04.setImageAlpha(A003);
        ViewGroup viewGroup = this.A03;
        viewGroup.getClass();
        if (A003 > 0) {
            i3 = 0;
        }
        viewGroup.setVisibility(i3);
        ViewGroup viewGroup2 = this.A03;
        if (A003 >= 255) {
            i2 = -16777216;
        }
        viewGroup2.setBackgroundColor(i2);
    }

    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        C340307l3 r2 = this.A0H;
        if (!r2.Esr()) {
            return true;
        }
        r2.Egd((SurfaceTexture) null, 0, 0);
        return true;
    }

    public LWg(Activity activity, View view, KB6 kb6, UserSession userSession) {
        this.A0D = activity;
        this.A0F = DbU.A0D(view, R.id.selfie_camera_stub);
        this.A0E = view.requireViewById(R.id.background_mode_button);
        this.A0L = (GridPatternView) view.requireViewById(R.id.grid_pattern_view);
        this.A0J = view.requireViewById(R.id.camera_container);
        this.A0I = userSession;
        this.A0H = C340217kt.A01(activity, (C340167ko) null, (C340147km) null, userSession, "nametag_selfie_camera", 2);
        this.A0G = kb6;
        2cs A0J2 = AnonymousClass7TF.A0J();
        A0J2.A09(A0M);
        A0J2.A06 = true;
        A0J2.A0A(this);
        this.A0K = A0J2;
    }

    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        A00(surfaceTexture, i, i2);
    }

    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        A00(surfaceTexture, i, i2);
    }
}
