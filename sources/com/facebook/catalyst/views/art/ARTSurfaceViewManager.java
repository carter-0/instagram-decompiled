package com.facebook.catalyst.views.art;

import X.AnonymousClass2T1;
import X.C14710U2v;
import X.C14970UHm;
import X.C17763VfZ;
import X.C20831X0g;
import X.QZK;
import X.QZL;
import X.WL2;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.LayoutShadowNode;

@ReactModule(name = "ARTSurfaceView")
public class ARTSurfaceViewManager extends BaseViewManager {
    public static final AnonymousClass2T1 MEASURE_FUNCTION = new WL2();
    public static final String REACT_CLASS = "ARTSurfaceView";

    public ARTSurfaceViewManager() {
        super((QZK) null);
    }

    public String getName() {
        return REACT_CLASS;
    }

    public static boolean isFabric(C14710U2v u2v) {
        return u2v instanceof C14970UHm;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.react.uimanager.LayoutShadowNode, com.facebook.catalyst.views.art.ARTSurfaceViewShadowNode, com.facebook.react.uimanager.ReactShadowNodeImpl] */
    public ARTSurfaceViewShadowNode createShadowNodeInstance() {
        ? layoutShadowNode = new LayoutShadowNode();
        layoutShadowNode.A09(MEASURE_FUNCTION);
        return layoutShadowNode;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [android.view.TextureView, X.U2v] */
    public C14710U2v createViewInstance(QZL qzl) {
        ? textureView = new TextureView(qzl);
        textureView.setOpaque(false);
        return textureView;
    }

    public Class getShadowNodeClass() {
        return ARTSurfaceViewShadowNode.class;
    }

    public void setBackgroundColor(C14710U2v u2v, int i) {
        if (u2v instanceof C14970UHm) {
            u2v.setBackgroundColor(i);
        }
    }

    public /* bridge */ /* synthetic */ void updateExtraData(View view, Object obj) {
        TextureView textureView = (TextureView) view;
        ARTSurfaceViewShadowNode aRTSurfaceViewShadowNode = (ARTSurfaceViewShadowNode) obj;
        SurfaceTexture surfaceTexture = textureView.getSurfaceTexture();
        textureView.setSurfaceTextureListener(aRTSurfaceViewShadowNode);
        if (surfaceTexture != null && aRTSurfaceViewShadowNode.A00 == null) {
            aRTSurfaceViewShadowNode.A00 = new Surface(surfaceTexture);
            ARTSurfaceViewShadowNode.A00(aRTSurfaceViewShadowNode, true);
        }
    }

    public Object updateState(C14710U2v u2v, C17763VfZ vfZ, C20831X0g x0g) {
        if (!(u2v instanceof C14970UHm) || x0g == null) {
            return null;
        }
        throw new NullPointerException("getStateData");
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.view.View, X.U2v] */
    /* JADX WARNING: type inference failed for: r2v2, types: [X.Tgo, android.view.View, android.view.TextureView] */
    /* JADX WARNING: type inference failed for: r2v3 */
    /* JADX WARNING: type inference failed for: r2v4 */
    /* JADX WARNING: type inference failed for: r2v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C14710U2v createViewInstance(int r4, X.QZL r5, X.C17763VfZ r6, X.C20831X0g r7) {
        /*
            r3 = this;
            r0 = 2
            int r0 = r4 % r0
            if (r0 != 0) goto L_0x002b
            X.UHm r2 = new X.UHm
            r2.<init>(r5)
            r0 = 0
            r2.setOpaque(r0)
            android.content.Context r1 = r2.getContext()
            boolean r0 = r1 instanceof X.QZL
            if (r0 == 0) goto L_0x001b
            X.Q6H r1 = (X.Q6H) r1
            r1.A09(r2)
        L_0x001b:
            r2.setId(r4)
            if (r6 == 0) goto L_0x0023
            r3.updateProperties(r2, r6)
        L_0x0023:
            if (r7 == 0) goto L_0x002a
            if (r6 == 0) goto L_0x002a
            r3.updateState((X.C14710U2v) r2, (X.C17763VfZ) r6, (X.C20831X0g) r7)
        L_0x002a:
            return r2
        L_0x002b:
            X.U2v r2 = new X.U2v
            r2.<init>(r5)
            r0 = 0
            r2.setOpaque(r0)
            goto L_0x001b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.catalyst.views.art.ARTSurfaceViewManager.createViewInstance(int, X.QZL, X.VfZ, X.X0g):X.U2v");
    }

    public void updateExtraData(C14710U2v u2v, Object obj) {
        ARTSurfaceViewShadowNode aRTSurfaceViewShadowNode = (ARTSurfaceViewShadowNode) obj;
        SurfaceTexture surfaceTexture = u2v.getSurfaceTexture();
        u2v.setSurfaceTextureListener(aRTSurfaceViewShadowNode);
        if (surfaceTexture != null && aRTSurfaceViewShadowNode.A00 == null) {
            aRTSurfaceViewShadowNode.A00 = new Surface(surfaceTexture);
            ARTSurfaceViewShadowNode.A00(aRTSurfaceViewShadowNode, true);
        }
    }
}
