package X;

import android.opengl.GLES20;

/* renamed from: X.8te  reason: invalid class name and case insensitive filesystem */
public final class C368988te implements C368998tf {
    public final C369008tg A00;
    public final int A01;
    public final int A02;
    public final C346337v0 A03;
    public final boolean A04;

    public final void bind() {
        GLES20.glBindFramebuffer(36160, this.A00.A00);
    }

    public final int getHeight() {
        return this.A01;
    }

    public final C346337v0 getTexture() {
        return this.A03;
    }

    public final int getWidth() {
        return this.A02;
    }

    public final boolean is10Bit() {
        return this.A04;
    }

    public final void release() {
        this.A00.A01();
    }

    public C368988te(int i, int i2, boolean z) {
        C369008tg r1 = new C369008tg(i, i2, z);
        this.A00 = r1;
        this.A02 = r1.A02;
        this.A01 = r1.A01;
        this.A04 = r1.A04;
        C346337v0 r0 = r1.A03;
        0qQ.A06(r0);
        this.A03 = r0;
    }

    public final void unbind() {
        GLES20.glBindFramebuffer(36160, 0);
    }
}
