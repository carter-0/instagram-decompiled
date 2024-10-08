package X;

import android.graphics.RenderEffect;
import android.graphics.RenderNode;

/* renamed from: X.HRd  reason: case insensitive filesystem */
public abstract class C54745HRd {
    public static final void A00(RenderNode renderNode, C54727HQg hQg) {
        RenderEffect renderEffect;
        if (hQg != null) {
            renderEffect = hQg.A00();
        } else {
            renderEffect = null;
        }
        renderNode.setRenderEffect(renderEffect);
    }
}
