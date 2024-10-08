package X;

import android.graphics.RenderEffect;
import android.graphics.RenderNode;

public abstract class HRP {
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
