package X;

import android.view.View;

public final class WF6 implements X7M {
    public final /* synthetic */ View A00;
    public final /* synthetic */ C14720U4e A01;

    public WF6(View view, C14720U4e u4e) {
        this.A01 = u4e;
        this.A00 = view;
    }

    public final void Dli() {
        C18287VpA.A00(this.A01, 0.0f);
    }

    public final void Dlj(int i) {
        int height = this.A00.getHeight();
        if (height > 0) {
            C18287VpA.A00(this.A01, (((float) i) * 1.0f) / ((float) height));
        }
    }

    public final void Dlk(int i) {
        int height = this.A00.getHeight();
        if (height > 0) {
            C18287VpA.A00(this.A01, (((float) i) * 1.0f) / ((float) height));
        }
    }
}
