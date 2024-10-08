package X;

import android.opengl.GLES20;
import java.nio.Buffer;

public final class Tt4 implements C365358my, XBw {
    public int A00 = -1;
    public int A01;
    public int A02 = -1;
    public int A03;
    public C346337v0 A04;

    public final C367428qj B8o() {
        return null;
    }

    public final void CFQ(VY1 vy1) {
        0qQ.A0B(vy1, 0);
        vy1.A02 = 0;
        vy1.A03 = 0;
        vy1.A01 = this.A03;
        vy1.A00 = this.A01;
    }

    public final void cleanup() {
        GLES20.glDeleteFramebuffers(1, new int[]{this.A00}, 0);
        GLES20.glDeleteTextures(1, new int[]{this.A02}, 0);
        this.A04 = null;
    }

    public final int B86() {
        return this.A00;
    }

    public final int Blj() {
        return this.A01;
    }

    public final int Blp() {
        return this.A03;
    }

    public final void EiS(int i, int i2) {
        throw new UnsupportedOperationException("setRenderDimensions() is not supported for FramebufferTexture");
    }

    public final int getHeight() {
        return this.A01;
    }

    public final C346337v0 getTexture() {
        C346337v0 r0 = this.A04;
        if (r0 != null) {
            return r0;
        }
        C346327uz r1 = new C346327uz("FramebufferTexture");
        r1.A01 = this.A02;
        r1.A03 = 3553;
        r1.A00 = 6408;
        C346337v0 r02 = new C346337v0(r1);
        this.A04 = r02;
        return r02;
    }

    public final int getTextureId() {
        return this.A02;
    }

    public final int getWidth() {
        return this.A03;
    }

    public Tt4(int i, int i2) {
        this.A03 = i;
        this.A01 = i2;
        int[] iArr = new int[1];
        GLES20.glGenFramebuffers(1, iArr, 0);
        this.A00 = iArr[0];
        this.A02 = AnonymousClass9S9.A00();
        GLES20.glTexImage2D(3553, 0, 6408, this.A03, this.A01, 0, 6408, 5121, (Buffer) null);
        GLES20.glBindFramebuffer(36160, this.A00);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.A02, 0);
        GLES20.glViewport(0, 0, this.A03, this.A01);
    }
}
