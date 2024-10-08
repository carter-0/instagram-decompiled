package X;

import android.graphics.LinearGradient;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* renamed from: X.77q  reason: invalid class name and case insensitive filesystem */
public final class C3266577q extends LinearGradient implements AnonymousClass7OE {
    public static float A03;
    public static final WeakHashMap A04 = new WeakHashMap();
    public int A00;
    public final C3266477p A01;
    public final WeakReference A02;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C3266577q(android.graphics.Shader.TileMode r12, android.graphics.drawable.Drawable r13, int[] r14, float r15) {
        /*
            r11 = this;
            r4 = 0
            r9 = 0
            r3 = r11
            r10 = r12
            r8 = r14
            r7 = r15
            r5 = r4
            r6 = r4
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            X.77p r2 = new X.77p
            r2.<init>(r11)
            r11.A01 = r2
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r13)
            r11.A02 = r0
            java.util.WeakHashMap r1 = A04
            r0 = 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.put(r11, r0)
            float r0 = A03
            int r0 = X.AnonymousClass1GB.A01(r0)
            r2.Eov(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3266577q.<init>(android.graphics.Shader$TileMode, android.graphics.drawable.Drawable, int[], float):void");
    }

    public static final void A00(C3266577q r3) {
        r3.A01.Eov(AnonymousClass1GB.A01(A03 + ((float) r3.A00)));
        Drawable drawable = (Drawable) r3.A02.get();
        if (drawable != null) {
            drawable.invalidateSelf();
        }
    }

    public final void Eov(int i) {
        this.A00 = i;
        A00(this);
    }
}
