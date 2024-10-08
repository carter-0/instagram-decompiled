package com.instagram.xme.threed.view;

import X.0qQ;
import X.AnonymousClass0fD;
import X.C11446SVi;
import X.C315756kV;
import X.C315766kW;
import X.C315776kX;
import X.C315786kY;
import X.C315796kZ;
import X.C315896kl;
import X.C315926ko;
import X.C315986ku;
import X.C60240fb;
import X.C8836RBw;
import android.content.Context;
import android.graphics.Matrix;
import android.hardware.SensorManager;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.TextureView;

public final class IgGltfSceneTextureView extends C315756kV implements C315766kW {
    public C315796kZ A00;
    public boolean A01;
    public boolean A02;
    public final C315796kZ A03;
    public final TextureView.SurfaceTextureListener A04;
    public final C315786kY A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IgGltfSceneTextureView(Context context) {
        super(context, (AttributeSet) null, 0);
        0qQ.A0B(context, 1);
        C315776kX r3 = new C315776kX();
        this.A04 = r3;
        C315786kY r2 = new C315786kY(this);
        this.A05 = r2;
        Context context2 = getContext();
        0qQ.A07(context2);
        this.A03 = new C315796kZ(context2, r3, r2);
        setSurfaceTextureListener(r3);
        setOpaque(false);
    }

    public final void Ew0(String str, String str2) {
    }

    public final void Ew2(String str, String str2, Throwable th) {
    }

    public final void setErrorReportCallback(C315766kW r2) {
        0qQ.A0B(r2, 0);
        this.A03.A05 = r2;
    }

    public void setSurfaceTextureListener(TextureView.SurfaceTextureListener surfaceTextureListener) {
        C315796kZ r1 = null;
        if (surfaceTextureListener != null) {
            r1 = this.A00;
            if (r1 == null || r1.A0J != surfaceTextureListener) {
                r1 = this.A03;
            }
            super.setSurfaceTextureListener(r1);
        }
        C315796kZ r0 = this.A00;
        if (r0 != null) {
            r0.A01();
        }
        super.setSurfaceTextureListener(r1);
        this.A00 = r1;
        super.setSurfaceTextureListener(r1);
    }

    public final void A00() {
        C315796kZ r1 = this.A00;
        if (r1 == null) {
            return;
        }
        if (r1.A02 == null) {
            r1.A0C = true;
            return;
        }
        C8836RBw rBw = r1.A04;
        if (rBw != null) {
            rBw.A01();
        } else {
            r1.A00();
        }
    }

    public final boolean getHandleTouch() {
        return this.A01;
    }

    public final C315796kZ getRenderTarget() {
        return this.A03;
    }

    public final void setSensorEnabled(boolean z) {
        C8836RBw rBw;
        Handler handler;
        C315796kZ r0 = this.A00;
        if (r0 != null && (rBw = r0.A04) != null && (handler = rBw.A02) != null) {
            int i = 6;
            if (z) {
                i = 5;
            }
            handler.sendEmptyMessage(i);
        }
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int A06 = AnonymousClass0fD.A06(-198822209);
        super.onSizeChanged(i, i2, i3, i4);
        C315796kZ r0 = this.A03;
        r0.A01 = i;
        r0.A00 = i2;
        Matrix matrix = new Matrix();
        matrix.setScale(2.0f, 2.0f);
        matrix.postTranslate(0.0f, ((float) i2) * -1.0f);
        setTransform(matrix);
        AnonymousClass0fD.A0D(454823003, A06);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        int A052 = AnonymousClass0fD.A05(2132170171);
        0qQ.A0B(motionEvent, 0);
        if (this.A01) {
            C315796kZ r1 = this.A03;
            if (r1.A04 == null) {
                z = false;
            } else {
                C315896kl r5 = r1.A0K;
                int action = motionEvent.getAction() & 255;
                if (action == 1 || action == 3) {
                    r5.A01 = false;
                    C315986ku r3 = r5.A02;
                    GestureDetector gestureDetector = r3.A01;
                    if (gestureDetector == null) {
                        gestureDetector = new GestureDetector(r3.A00, r3.A02);
                        r3.A01 = gestureDetector;
                    }
                    gestureDetector.onTouchEvent(motionEvent);
                    r5.A03.A00(motionEvent);
                    r5.A00.A01(motionEvent);
                } else {
                    C315986ku r32 = r5.A02;
                    GestureDetector gestureDetector2 = r32.A01;
                    if (gestureDetector2 == null) {
                        gestureDetector2 = new GestureDetector(r32.A00, r32.A02);
                        r32.A01 = gestureDetector2;
                    }
                    if (!gestureDetector2.onTouchEvent(motionEvent)) {
                        if (r5.A03.A00(motionEvent)) {
                            r5.A01 = true;
                        } else {
                            C315926ko r12 = r5.A00;
                            if (!r12.A01(motionEvent)) {
                                if (r12.A05) {
                                    r5.A01 = true;
                                }
                                z = r5.A01;
                            }
                        }
                    }
                }
                z = true;
            }
            AnonymousClass0fD.A0C(1062883202, A052);
            return z;
        }
        AnonymousClass0fD.A0C(879060290, A052);
        return false;
    }

    public final void onWindowFocusChanged(boolean z) {
        int A06 = AnonymousClass0fD.A06(743860007);
        super.onWindowFocusChanged(z);
        if (z) {
            if (this.A02) {
                C315796kZ r2 = this.A03;
                C8836RBw rBw = r2.A04;
                if (rBw != null) {
                    rBw.A01();
                }
                r2.A0E = true;
            }
            this.A02 = false;
        } else {
            C315796kZ r22 = this.A03;
            this.A02 = r22.A0E;
            C8836RBw rBw2 = r22.A04;
            if (rBw2 != null) {
                rBw2.A0H = true;
                C11446SVi sVi = rBw2.A0E;
                SensorManager sensorManager = sVi.A01;
                if (sensorManager != null) {
                    C60240fb.A00(sVi, sensorManager);
                }
            }
            r22.A0E = false;
        }
        AnonymousClass0fD.A0D(113920429, A06);
    }

    public final void setHandleTouch(boolean z) {
        this.A01 = z;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IgGltfSceneTextureView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
        0qQ.A0B(attributeSet, 2);
        C315776kX r3 = new C315776kX();
        this.A04 = r3;
        C315786kY r2 = new C315786kY(this);
        this.A05 = r2;
        Context context2 = getContext();
        0qQ.A07(context2);
        this.A03 = new C315796kZ(context2, r3, r2);
        setSurfaceTextureListener(r3);
        setOpaque(false);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IgGltfSceneTextureView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        0qQ.A0B(context, 1);
        0qQ.A0B(attributeSet, 2);
        C315776kX r3 = new C315776kX();
        this.A04 = r3;
        C315786kY r2 = new C315786kY(this);
        this.A05 = r2;
        Context context2 = getContext();
        0qQ.A07(context2);
        this.A03 = new C315796kZ(context2, r3, r2);
        setSurfaceTextureListener(r3);
        setOpaque(false);
    }
}
