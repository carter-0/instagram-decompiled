package com.instagram.ui.widget.drawing.gl;

import X.0qQ;
import X.AnonymousClass000;
import X.AnonymousClass0fD;
import X.AnonymousClass4XC;
import X.AnonymousClass8O9;
import X.AnonymousClass8OB;
import X.AnonymousClass8QD;
import X.C14704U2o;
import X.C15850Uja;
import X.C15851Ujb;
import X.C17209VMn;
import X.C17872VhP;
import X.C18565VuH;
import X.C20312Wp1;
import X.C20366Wq6;
import X.C20565Wui;
import X.C20856X1i;
import X.C21006X9e;
import X.C354998Oe;
import X.C40900Al8;
import X.C41092AoE;
import X.VB4;
import X.X1J;
import android.app.ActivityManager;
import android.content.Context;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.View;
import android.view.ViewParent;
import com.google.common.collect.ImmutableList;
import com.instagram.common.ui.widget.textureview.MultiListenerTextureView;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.List;

public class GLDrawingView extends MultiListenerTextureView implements TextureView.SurfaceTextureListener, AnonymousClass4XC {
    public static int A0H;
    public static final C18565VuH A0I = new Object();
    public int A00;
    public GLSurfaceView.Renderer A01;
    public C17209VMn A02;
    public VB4 A03;
    public X1J A04;
    public C20565Wui A05;
    public AnonymousClass8OB A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public float A0A;
    public boolean A0B;
    public boolean A0C;
    public final GestureDetector A0D;
    public final C20366Wq6 A0E;
    public final WeakReference A0F;
    public final C17872VhP A0G;

    public GLDrawingView(Context context) {
        this(context, (AttributeSet) null);
    }

    public View getView() {
        return this;
    }

    public final void A03() {
        C20565Wui wui = this.A05;
        if (wui != null) {
            C18565VuH vuH = A0I;
            synchronized (vuH) {
                wui.A09 = true;
                vuH.notifyAll();
            }
        }
    }

    public final void A04(AnonymousClass8QD r3, C354998Oe r4) {
        Runnable wp1;
        if (r4 == null) {
            wp1 = new C41092AoE(this, new C40900Al8(r3));
        } else {
            wp1 = new C20312Wp1(this, r3, r4);
        }
        C20565Wui wui = this.A05;
        if (wui != null) {
            wui.A07(wp1);
        }
    }

    public final void finalize() {
        C20565Wui wui = this.A05;
        if (wui != null) {
            wui.A04();
        }
    }

    public C21006X9e getBrush() {
        C21006X9e x9e;
        C20366Wq6 wq6 = this.A0E;
        synchronized (wq6) {
            x9e = wq6.A05;
        }
        return x9e;
    }

    public List getBrushStrokes() {
        return this.A0E.A0G;
    }

    public final C20565Wui getGLThread() {
        return this.A05;
    }

    public List getMarks() {
        return ImmutableList.copyOf((Collection) this.A0E.A0H);
    }

    public void setBrush(C21006X9e x9e) {
        C20366Wq6 wq6 = this.A0E;
        synchronized (wq6) {
            wq6.A05 = x9e;
        }
    }

    public void setBrushList(AnonymousClass8O9 r2) {
        this.A0E.A03 = r2;
    }

    public void setBrushSize(float f) {
        C21006X9e x9e;
        if (this.A0C) {
            this.A0A = f;
            return;
        }
        this.A0A = -1.0f;
        C20366Wq6 wq6 = this.A0E;
        synchronized (wq6) {
            x9e = wq6.A05;
        }
        if (x9e != null) {
            x9e.ElQ(f);
        }
    }

    public final void setEGLConfigChooser(X1J x1j) {
        if (this.A05 == null) {
            this.A04 = x1j;
            return;
        }
        throw new IllegalStateException("setRenderer has already been called for this instance.");
    }

    public final void setEGLContextClientVersion(int i) {
        if (this.A05 == null) {
            this.A00 = i;
            return;
        }
        throw new IllegalStateException("setRenderer has already been called for this instance.");
    }

    public void setGLThreadListener(AnonymousClass8OB r3) {
        this.A06 = r3;
        if (this.A08 && r3 != null) {
            r3.DHL(this.A05, this.A0G);
        }
    }

    public void setOnDrawListener(C20856X1i x1i) {
        this.A0E.A04 = x1i;
    }

    public final void setRenderMode(int i) {
        C20565Wui wui = this.A05;
        if (wui != null) {
            wui.A05(i);
        }
    }

    /* JADX WARNING: type inference failed for: r0v6, types: [java.lang.Object, X.VB4] */
    public final void setRenderer(GLSurfaceView.Renderer renderer) {
        if (this.A05 == null) {
            if (this.A04 == null) {
                this.A04 = new C15850Uja(this);
            }
            if (this.A02 == null) {
                this.A02 = new C17209VMn(this);
            }
            if (this.A03 == null) {
                this.A03 = new Object();
            }
            this.A01 = renderer;
            C20565Wui wui = new C20565Wui(this.A0F);
            wui.start();
            this.A05 = wui;
            return;
        }
        throw new IllegalStateException("setRenderer has already been called for this instance.");
    }

    public final void onAttachedToWindow() {
        int i;
        int A062 = AnonymousClass0fD.A06(1018381375);
        super.onAttachedToWindow();
        if (this.A0B && this.A01 != null) {
            C20565Wui wui = this.A05;
            if (wui != null) {
                synchronized (A0I) {
                    i = wui.A00;
                }
            } else {
                i = 1;
            }
            C20565Wui wui2 = new C20565Wui(this.A0F);
            if (i != 1) {
                wui2.A05(i);
            }
            wui2.start();
            this.A05 = wui2;
        }
        this.A0B = false;
        AnonymousClass0fD.A0D(-1149544843, A062);
    }

    public final void onDetachedFromWindow() {
        int A062 = AnonymousClass0fD.A06(837464685);
        C20565Wui wui = this.A05;
        if (wui != null) {
            wui.A04();
        }
        this.A0B = true;
        super.onDetachedFromWindow();
        AnonymousClass0fD.A0D(2071669339, A062);
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int A062 = AnonymousClass0fD.A06(1453115188);
        super.onSizeChanged(i, i2, i3, i4);
        getSurfaceTexture();
        C20565Wui wui = this.A05;
        if (wui != null) {
            wui.A06(i, i2);
        }
        AnonymousClass0fD.A0D(-287971557, A062);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int A052 = AnonymousClass0fD.A05(1525605555);
        boolean isEnabled = isEnabled();
        if (isEnabled) {
            this.A0D.onTouchEvent(motionEvent);
            C20366Wq6 wq6 = this.A0E;
            wq6.A0K.offer(MotionEvent.obtain(motionEvent));
            C20565Wui wui = this.A05;
            if (wui != null) {
                wui.A07(wq6);
            }
            A03();
            int actionMasked = motionEvent.getActionMasked();
            boolean z = true;
            if (actionMasked == 0) {
                float f = this.A0A;
                if (f != -1.0f) {
                    setBrushSize(f);
                }
            } else if (actionMasked == 1 || actionMasked == 3) {
                z = false;
            }
            this.A0C = z;
            ViewParent parent = getParent();
            parent.getClass();
            parent.requestDisallowInterceptTouchEvent(z);
        }
        AnonymousClass0fD.A0C(-1857207591, A052);
        return isEnabled;
    }

    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (i == 0 && this.A07) {
            A01();
        }
    }

    public final void setPreserveEGLContextOnPause(boolean z) {
        this.A09 = z;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GLDrawingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        0qQ.A0B(context, 1);
        this.A0F = new WeakReference(this);
        Object systemService = context.getSystemService("activity");
        0qQ.A0C(systemService, AnonymousClass000.A00(174));
        A0H = ((ActivityManager) systemService).getDeviceConfigurationInfo().reqGlEsVersion;
        A02(this);
        this.A0A = -1.0f;
        this.A0D = new GestureDetector(getContext(), new C14704U2o(this));
        C17872VhP vhP = new C17872VhP(context);
        this.A0G = vhP;
        setOpaque(false);
        setEGLContextClientVersion(2);
        setEGLConfigChooser(new C15851Ujb(this, 8, 0));
        this.A09 = true;
        C20366Wq6 wq6 = new C20366Wq6(this, vhP);
        this.A0E = wq6;
        setRenderer(wq6);
        setRenderMode(0);
        C41092AoE aoE = new C41092AoE(this, (Runnable) null);
        C20565Wui wui = this.A05;
        if (wui != null) {
            wui.A07(aoE);
        }
    }
}
