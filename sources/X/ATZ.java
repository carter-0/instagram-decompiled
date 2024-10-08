package X;

import android.opengl.GLES20;

public final class ATZ implements C368998tf {
    public final C369008tg A00;

    public final void bind() {
        GLES20.glBindFramebuffer(36160, this.A00.A00);
    }

    public final int getHeight() {
        return this.A00.A01;
    }

    public final C346337v0 getTexture() {
        return this.A00.A03;
    }

    public final int getWidth() {
        return this.A00.A02;
    }

    public final boolean is10Bit() {
        return this.A00.A04;
    }

    public final void release() {
        this.A00.A01();
    }

    public ATZ(int i, int i2, boolean z) {
        this.A00 = new C369008tg(i, i2, z);
    }

    public final void unbind() {
        GLES20.glBindFramebuffer(36160, 0);
    }
}
