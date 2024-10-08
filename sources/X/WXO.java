package X;

import android.opengl.GLES10;

public final class WXO implements C365358my {
    public int A00;
    public int A01 = -1;
    public int A02;
    public C346337v0 A03;

    public final C367428qj B8o() {
        return null;
    }

    public final void cleanup() {
        GLES10.glDeleteTextures(1, new int[]{this.A01}, 0);
        this.A03 = null;
    }

    public final int getHeight() {
        return this.A00;
    }

    public final C346337v0 getTexture() {
        C346337v0 r0 = this.A03;
        if (r0 != null) {
            return r0;
        }
        C346327uz r1 = new C346327uz("ModifiableInputSurface");
        r1.A01 = this.A01;
        r1.A03 = 3553;
        C346337v0 r02 = new C346337v0(r1);
        this.A03 = r02;
        return r02;
    }

    public final int getTextureId() {
        return this.A01;
    }

    public final int getWidth() {
        return this.A02;
    }
}
