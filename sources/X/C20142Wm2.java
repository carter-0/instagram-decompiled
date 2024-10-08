package X;

import com.facebook.react.uimanager.ReactShadowNode;
import com.facebook.react.uimanager.ReactShadowNodeImpl;

/* renamed from: X.Wm2  reason: case insensitive filesystem */
public final class C20142Wm2 implements Runnable {
    public final /* synthetic */ ReactShadowNode A00;
    public final /* synthetic */ W2L A01;

    public C20142Wm2(ReactShadowNode reactShadowNode, W2L w2l) {
        this.A01 = w2l;
        this.A00 = reactShadowNode;
    }

    public final void run() {
        C17818VgX vgX = this.A01.A04;
        ReactShadowNode reactShadowNode = this.A00;
        vgX.A02.A00();
        int i = ((ReactShadowNodeImpl) reactShadowNode).A00;
        vgX.A00.put(i, reactShadowNode);
        vgX.A01.put(i, true);
    }
}
