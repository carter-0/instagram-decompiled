package com.facebook.catalyst.views.art;

import X.002;
import X.0I1;
import X.0Sd;
import X.C13773Tgo;
import X.C18592Vuj;
import X.C51968G9o;
import X.QZL;
import X.USd;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.uimanager.ReactShadowNode;
import com.facebook.react.uimanager.ReactShadowNodeImpl;
import com.facebook.react.uimanager.annotations.ReactProp;

public class ARTSurfaceViewShadowNode extends LayoutShadowNode implements TextureView.SurfaceTextureListener, C13773Tgo {
    public Surface A00;
    public Integer A01;

    private void A01(ReactShadowNode reactShadowNode) {
        for (int i = 0; i < reactShadowNode.AnH(); i++) {
            ReactShadowNodeImpl A06 = ((ReactShadowNodeImpl) reactShadowNode).A06(i);
            A06.Cm6();
            A01(A06);
        }
    }

    public final void A08(C18592Vuj vuj) {
        A00(this, false);
        vuj.A0F.add(new USd(vuj, this, this.A00));
    }

    public final boolean A0B() {
        return true;
    }

    public final void onHostDestroy() {
    }

    public final void onHostPause() {
    }

    public final void onHostResume() {
        A00(this, false);
    }

    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public static void A00(ARTSurfaceViewShadowNode aRTSurfaceViewShadowNode, boolean z) {
        Surface surface = aRTSurfaceViewShadowNode.A00;
        if (surface == null || !surface.isValid()) {
            aRTSurfaceViewShadowNode.A01(aRTSurfaceViewShadowNode);
            return;
        }
        try {
            Canvas lockCanvas = aRTSurfaceViewShadowNode.A00.lockCanvas((Rect) null);
            lockCanvas.drawColor(0, PorterDuff.Mode.CLEAR);
            Integer num = aRTSurfaceViewShadowNode.A01;
            if (num != null) {
                lockCanvas.drawColor(num.intValue());
            }
            Paint paint = new Paint();
            for (int i = 0; i < aRTSurfaceViewShadowNode.AnH(); i++) {
                ARTVirtualNode aRTVirtualNode = (ARTVirtualNode) aRTSurfaceViewShadowNode.A06(i);
                aRTVirtualNode.A0E(lockCanvas, paint, 1.0f);
                if (z) {
                    aRTVirtualNode.A07();
                } else {
                    aRTVirtualNode.Cm6();
                }
            }
            Surface surface2 = aRTSurfaceViewShadowNode.A00;
            if (surface2 != null) {
                surface2.unlockCanvasAndPost(lockCanvas);
            }
        } catch (IllegalArgumentException | IllegalStateException e) {
            0I1.A03("ReactNative", 002.A0R(C51968G9o.A16(e), " in Surface.unlockCanvasAndPost"));
        }
    }

    public final void EoS(QZL qzl) {
        this.A0A = qzl;
        qzl.A09(this);
    }

    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        this.A00 = new Surface(surfaceTexture);
        A00(this, false);
    }

    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.A00.release();
        this.A00 = null;
        return true;
    }

    @ReactProp(customType = "Color", name = "backgroundColor")
    public void setBackgroundColor(Integer num) {
        this.A01 = num;
        A07();
    }

    public final void dispose() {
        super.dispose();
        QZL qzl = this.A0A;
        0Sd.A00(qzl);
        qzl.A0A(this);
    }
}
