package X;

import android.opengl.GLES10;

/* renamed from: X.8mx  reason: invalid class name and case insensitive filesystem */
public final class C365348mx implements C365358my {
    public C346337v0 A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ int A04;
    public final /* synthetic */ C367428qj A05;

    public final void cleanup() {
        GLES10.glDeleteTextures(1, new int[]{this.A02}, 0);
        C367428qj r0 = this.A05;
        if (r0 != null) {
            r0.cleanup();
        }
    }

    public C365348mx(C367428qj r1, int i, int i2, int i3, int i4) {
        this.A02 = i;
        this.A03 = i2;
        this.A04 = i3;
        this.A01 = i4;
        this.A05 = r1;
    }

    public final C367428qj B8o() {
        return this.A05;
    }

    public final int getHeight() {
        return this.A01;
    }

    public final C346337v0 getTexture() {
        C346337v0 r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        C346327uz r1 = new C346327uz("InputSurface");
        r1.A01 = this.A02;
        r1.A03 = this.A03;
        r1.A00 = 6408;
        r1.A04 = this.A04;
        r1.A02 = this.A01;
        C346337v0 r02 = new C346337v0(r1);
        this.A00 = r02;
        return r02;
    }

    public final int getTextureId() {
        return this.A02;
    }

    public final int getWidth() {
        return this.A04;
    }
}
