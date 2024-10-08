package X;

import android.graphics.Matrix;
import android.graphics.Shader;

/* renamed from: X.77p  reason: invalid class name and case insensitive filesystem */
public final class C3266477p implements AnonymousClass7OE {
    public int A00;
    public final Matrix A01 = new Matrix();
    public final Shader A02;

    public final void Eov(int i) {
        if (i != this.A00) {
            this.A00 = i;
            Matrix matrix = this.A01;
            matrix.setTranslate(0.0f, -((float) i));
            this.A02.setLocalMatrix(matrix);
        }
    }

    public C3266477p(Shader shader) {
        this.A02 = shader;
    }
}
