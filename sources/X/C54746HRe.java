package X;

import android.graphics.RenderEffect;
import android.view.View;

/* renamed from: X.HRe  reason: case insensitive filesystem */
public abstract class C54746HRe {
    public static final void A00(View view, C54727HQg hQg) {
        RenderEffect renderEffect;
        if (hQg != null) {
            renderEffect = hQg.A00();
        } else {
            renderEffect = null;
        }
        view.setRenderEffect(renderEffect);
    }
}
