package X;

import android.graphics.Point;
import android.view.TextureView;
import android.view.View;
import java.nio.FloatBuffer;
import java.util.List;
import org.webrtc.EglBase;
import org.webrtc.EglRenderer;
import org.webrtc.GlRectDrawer;
import org.webrtc.RendererCommon;
import org.webrtc.ThreadUtils;

/* renamed from: X.MsF  reason: case insensitive filesystem */
public final class C67679MsF extends TextureView implements RendererCommon.RendererEvents, C74226PrF {
    public int A00;
    public int A01;
    public C74362Ptc A02;
    public C62320sa A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public float A07;
    public RendererCommon.ScalingType A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public final C20817Wzc A0C;
    public final EglRenderer.FrameDrawnListenerWithContext A0D;
    public final List A0E = AnonymousClass7TE.A1C();
    public final RendererCommon.VideoLayoutMeasure A0F;

    public final void addOnAttachStateChangeListener(View.OnAttachStateChangeListener onAttachStateChangeListener) {
        0qQ.A0B(onAttachStateChangeListener, 0);
        List list = this.A0E;
        if (!list.contains(onAttachStateChangeListener)) {
            list.add(onAttachStateChangeListener);
            if (this.A0B) {
                onAttachStateChangeListener.onViewAttachedToWindow(this);
            }
        }
    }

    public final void removeOnAttachStateChangeListener(View.OnAttachStateChangeListener onAttachStateChangeListener) {
        0qQ.A0B(onAttachStateChangeListener, 0);
        if (this.A0B) {
            onAttachStateChangeListener.onViewDetachedFromWindow(this);
        }
        this.A0E.remove(onAttachStateChangeListener);
    }

    public final void setFirstFrameRendered(C62320sa r2) {
        0qQ.A0B(r2, 0);
        this.A03 = r2;
    }

    public static final void A00(C67679MsF msF) {
        int i;
        int i2;
        RendererCommon.VideoLayoutMeasure videoLayoutMeasure;
        RendererCommon.ScalingType scalingType = msF.A08;
        if (scalingType != null) {
            videoLayoutMeasure = msF.A0F;
        } else {
            if (msF.A09 && (i = msF.A01) > 0 && (i2 = msF.A00) > 0) {
                videoLayoutMeasure = msF.A0F;
                if (((float) i) / ((float) i2) < 1.33f) {
                    scalingType = RendererCommon.ScalingType.SCALE_ASPECT_FILL;
                } else {
                    scalingType = RendererCommon.ScalingType.SCALE_ASPECT_FIT;
                }
            }
            msF.requestLayout();
        }
        videoLayoutMeasure.setScalingType(scalingType);
        msF.requestLayout();
    }

    public static /* synthetic */ void A01(C67679MsF msF, EglBase.Context context) {
        int[] iArr = EglBase.CONFIG_PLAIN;
        RendererCommon.GlDrawer drawer = msF.getDrawer();
        ThreadUtils.checkIsOnMainThread();
        if (!msF.A06) {
            msF.A01 = 0;
            msF.A00 = 0;
            C20817Wzc wzc = msF.A0C;
            wzc.A00(context, msF, iArr, drawer);
            if (msF.A04) {
                wzc.addFrameDrawnListener(msF.A0D);
            }
            msF.A06 = true;
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.NrD, java.lang.Object] */
    private final RendererCommon.GlDrawer getDrawer() {
        RendererCommon.GlDrawer glRectDrawer;
        if (this.A0A) {
            float f = this.A07;
            FloatBuffer floatBuffer = C20551Wu1.A0I;
            glRectDrawer = new C20551Wu1(new Object(), f);
        } else {
            glRectDrawer = new GlRectDrawer();
        }
        return glRectDrawer;
    }

    public final C62320sa getFirstFrameRendered() {
        return this.A03;
    }

    public final RendererCommon.ScalingType getScalingType() {
        return this.A08;
    }

    public final C74362Ptc getVideoSizeChangeListener() {
        return this.A02;
    }

    public final void onFirstFrameRendered() {
        this.A03.invoke();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0013, code lost:
        if (r3.A00 == r4) goto L_0x0016;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0015, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0016, code lost:
        r3.A01 = r2;
        r3.A00 = r4;
        r2 = new X.C73268PZm(r3, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002b, code lost:
        if (java.lang.Thread.currentThread() != android.os.Looper.getMainLooper().getThread()) goto L_0x0033;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002d, code lost:
        r2.run();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0030, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0031, code lost:
        r4 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0033, code lost:
        post(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0036, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0005, code lost:
        if (r6 == 180) goto L_0x0007;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0008, code lost:
        if (r6 != 0) goto L_0x000a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        if (r6 == 180) goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x000e, code lost:
        if (r3.A01 != r2) goto L_0x0015;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0010, code lost:
        r0 = false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onFrameResolutionChanged(int r4, int r5, int r6) {
        /*
            r3 = this;
            r0 = 180(0xb4, float:2.52E-43)
            if (r6 == 0) goto L_0x0007
            r2 = r5
            if (r6 != r0) goto L_0x000a
        L_0x0007:
            r2 = r4
            if (r6 == 0) goto L_0x0031
        L_0x000a:
            if (r6 == r0) goto L_0x0031
        L_0x000c:
            int r0 = r3.A01
            if (r0 != r2) goto L_0x0015
            int r1 = r3.A00
            r0 = 0
            if (r1 == r4) goto L_0x0016
        L_0x0015:
            r0 = 1
        L_0x0016:
            r3.A01 = r2
            r3.A00 = r4
            X.PZm r2 = new X.PZm
            r2.<init>(r3, r0)
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            java.lang.Thread r0 = r0.getThread()
            if (r1 != r0) goto L_0x0033
            r2.run()
            return
        L_0x0031:
            r4 = r5
            goto L_0x000c
        L_0x0033:
            r3.post(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67679MsF.onFrameResolutionChanged(int, int, int):void");
    }

    public final void setAutoAdjustScalingType(boolean z) {
        this.A09 = z;
        A00(this);
    }

    public final void setMirror(boolean z) {
        this.A0C.setMirror(z);
    }

    public final void setScalingType(RendererCommon.ScalingType scalingType) {
        if (this.A08 != scalingType) {
            this.A08 = scalingType;
            A00(this);
        }
    }

    public final void setVideoSizeChangeListener(C74362Ptc ptc) {
        this.A02 = ptc;
        if (ptc != null) {
            ptc.DyG(this.A01, this.A00);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0070, code lost:
        if (r3 != 1) goto L_0x0072;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C67679MsF(android.content.Context r7, com.instagram.common.session.UserSession r8) {
        /*
            r6 = this;
            r6.<init>(r7)
            java.util.ArrayList r0 = X.AnonymousClass7TE.A1C()
            r6.A0E = r0
            X.Wzc r1 = new X.Wzc
            r1.<init>()
            r6.A0C = r1
            org.webrtc.RendererCommon$VideoLayoutMeasure r0 = new org.webrtc.RendererCommon$VideoLayoutMeasure
            r0.<init>()
            r6.A0F = r0
            X.PlD r0 = X.C73876PlD.A00
            r6.A03 = r0
            r6.setSurfaceTextureListener(r1)
            if (r8 == 0) goto L_0x0084
            X.0Tu r5 = X.0Tu.A05
            r0 = 36320536967520836(0x81095600002244, double:3.032592057099062E-306)
            boolean r0 = X.182.A06(r5, r8, r0)
            r6.A04 = r0
            java.lang.String r0 = "activity"
            java.lang.Object r1 = r7.getSystemService(r0)
            r0 = 174(0xae, float:2.44E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.0qQ.A0C(r1, r0)
            android.app.ActivityManager r1 = (android.app.ActivityManager) r1
            android.content.pm.ConfigurationInfo r0 = r1.getDeviceConfigurationInfo()
            X.0qQ.A07(r0)
            java.lang.String r0 = r0.getGlEsVersion()
            X.0qQ.A07(r0)
            java.lang.Double r0 = X.012.A0p(r0)
            if (r0 == 0) goto L_0x0084
            double r3 = r0.doubleValue()
            r1 = 4613937818241073152(0x4008000000000000, double:3.0)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0084
            r0 = 36602742089061106(0x820a00000612f2, double:3.2110597123099435E-306)
            long r3 = X.182.A01(r5, r8, r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r3)
            r1 = 1
            if (r0 == 0) goto L_0x0072
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            r1 = 1
            if (r0 == 0) goto L_0x0073
        L_0x0072:
            r1 = 0
        L_0x0073:
            r6.A0A = r1
            r0 = 36602742089126643(0x820a00000712f3, double:3.2110597123513894E-306)
            long r2 = X.182.A01(r5, r8, r0)
            float r1 = (float) r2
            r0 = 1120403456(0x42c80000, float:100.0)
            float r1 = r1 / r0
            r6.A07 = r1
        L_0x0084:
            X.PeY r0 = X.C73542PeY.A00
            r6.A0D = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67679MsF.<init>(android.content.Context, com.instagram.common.session.UserSession):void");
    }

    public final void onAttachedToWindow() {
        int A062 = AnonymousClass0fD.A06(1699045186);
        super.onAttachedToWindow();
        this.A0B = true;
        for (View.OnAttachStateChangeListener onViewAttachedToWindow : this.A0E) {
            onViewAttachedToWindow.onViewAttachedToWindow(this);
        }
        AnonymousClass0fD.A0D(-1051281600, A062);
    }

    public final void onDetachedFromWindow() {
        int A062 = AnonymousClass0fD.A06(636752973);
        super.onDetachedFromWindow();
        this.A0B = false;
        for (View.OnAttachStateChangeListener onViewDetachedFromWindow : this.A0E) {
            onViewDetachedFromWindow.onViewDetachedFromWindow(this);
        }
        AnonymousClass0fD.A0D(-1780035321, A062);
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        ThreadUtils.checkIsOnMainThread();
        this.A0C.setLayoutAspectRatio(((float) (i3 - i)) / ((float) (i4 - i2)));
    }

    public final void onMeasure(int i, int i2) {
        ThreadUtils.checkIsOnMainThread();
        Point measure = this.A0F.measure(i, i2, this.A01, this.A00);
        setMeasuredDimension(measure.x, measure.y);
    }

    public void setSurfaceTextureListener(TextureView.SurfaceTextureListener surfaceTextureListener) {
        if (getSurfaceTextureListener() != null) {
            0wb.A03("TextureViewRenderer", "Setting surface texture listener again.");
        }
        super.setSurfaceTextureListener(surfaceTextureListener);
    }
}
