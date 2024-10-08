package X;

import android.opengl.Matrix;

/* renamed from: X.ATt  reason: case insensitive filesystem */
public final class C40153ATt implements C346287uv {
    public final C345127sy A00 = new Object();
    public final /* synthetic */ AnonymousClass9WF A01;

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.7sy] */
    public C40153ATt(AnonymousClass9WF r2) {
        this.A01 = r2;
    }

    public final void A00(C365358my r6) {
        if (r6 != null) {
            C345067ss r4 = new C345067ss();
            float[] fArr = new float[16];
            Matrix.setIdentityM(fArr, 0);
            System.arraycopy(fArr, 0, r4.A03, 0, 16);
            System.arraycopy(fArr, 0, r4.A02, 0, 16);
            int width = r6.getWidth();
            int height = r6.getHeight();
            r4.A01 = width;
            r4.A00 = height;
            C345127sy r1 = this.A00;
            r1.A05 = r4;
            r1.A04 = r6.getTexture();
        }
    }

    public final /* bridge */ /* synthetic */ Object BHO() {
        AnonymousClass9WF.A00(this.A01);
        return this.A00;
    }
}
