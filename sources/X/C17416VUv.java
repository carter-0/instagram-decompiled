package X;

import android.view.View;

/* renamed from: X.VUv  reason: case insensitive filesystem */
public final class C17416VUv {
    public boolean A00;
    public final View A01;
    public final U1F A02;

    public C17416VUv(View view, U1F u1f) {
        this.A01 = view;
        this.A02 = u1f;
        if (!u1f.A02) {
            u1f.A02 = true;
            u1f.A05.stop();
            u1f.invalidateSelf();
        }
        u1f.A01(true);
        u1f.setCallback(view);
    }
}
