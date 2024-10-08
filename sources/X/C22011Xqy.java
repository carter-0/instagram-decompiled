package X;

import android.view.RenderNode;

/* renamed from: X.Xqy  reason: case insensitive filesystem */
public abstract class C22011Xqy {
    public static final int A00(RenderNode renderNode) {
        return renderNode.getAmbientShadowColor();
    }

    public static final int A01(RenderNode renderNode) {
        return renderNode.getSpotShadowColor();
    }

    public static final void A02(RenderNode renderNode, int i) {
        renderNode.setAmbientShadowColor(i);
    }

    public static final void A03(RenderNode renderNode, int i) {
        renderNode.setSpotShadowColor(i);
    }
}
