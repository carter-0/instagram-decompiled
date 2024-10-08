package X;

import androidx.compose.ui.graphics.layer.GraphicsLayer;

/* renamed from: X.IFy  reason: case insensitive filesystem */
public final class C56877IFy implements C285855Sz {
    public C285855Sz A00;
    public 0vt A01;

    public final void A00() {
        0vt r4 = this.A01;
        if (r4 != null) {
            Object[] objArr = r4.A01;
            int i = r4.A00;
            for (int i2 = 0; i2 < i; i2++) {
                ECb((GraphicsLayer) objArr[i2]);
            }
            0Yw.A0U(r4.A01, 0, r4.A00);
            r4.A00 = 0;
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.0vt, java.lang.Object, X.01j] */
    public final GraphicsLayer AM9() {
        C285855Sz r0 = this.A00;
        if (r0 != null) {
            GraphicsLayer AM9 = r0.AM9();
            0vt r02 = this.A01;
            if (r02 == null) {
                ? obj = new Object();
                obj.A01 = new Object[1];
                obj.A00(AM9);
                this.A01 = obj;
                return AM9;
            }
            r02.A00(AM9);
            return AM9;
        }
        I2E.A01("GraphicsContext not provided");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void ECb(GraphicsLayer graphicsLayer) {
        C285855Sz r0 = this.A00;
        if (r0 != null) {
            r0.ECb(graphicsLayer);
        }
    }
}
