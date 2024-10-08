package X;

import android.opengl.GLES20;

/* renamed from: X.Wkq  reason: case insensitive filesystem */
public final class C20092Wkq implements Runnable {
    public final int[] A00;

    public final void run() {
        GLES20.glDeleteBuffers(1, this.A00, 0);
    }

    public C20092Wkq(int i) {
        this.A00 = new int[]{i};
    }
}
