package X;

/* renamed from: X.IKr  reason: case insensitive filesystem */
public final class C56999IKr implements AnonymousClass4SL {
    public final float BVz(217 r7, float f, int i) {
        int i2 = r7.A0A;
        int i3 = i - i2;
        boolean z = false;
        if (Math.abs(i3) <= r7.A0B) {
            z = true;
        }
        if (z) {
            return 1.0f;
        }
        if (i3 < r7.A09 && i2 - i < r7.A08) {
            return f;
        }
        if (i > i2) {
            return ((float) r7.A03) + 1.0f;
        }
        return 1.0f - ((float) r7.A04);
    }
}
