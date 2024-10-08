package X;

import androidx.compose.ui.layout.SubcomposeSlotReusePolicy;

/* renamed from: X.6I8  reason: invalid class name */
public final class AnonymousClass6I8 {
    public AnonymousClass6IJ A00;
    public final SubcomposeSlotReusePolicy A01;
    public final 0sL A02;
    public final 0sL A03;
    public final 0sL A04;

    public static final AnonymousClass6IJ A00(AnonymousClass6I8 r1) {
        AnonymousClass6IJ r0 = r1.A00;
        if (r0 != null) {
            return r0;
        }
        throw new IllegalArgumentException("SubcomposeLayoutState is not attached to SubcomposeLayout");
    }

    public AnonymousClass6I8(SubcomposeSlotReusePolicy subcomposeSlotReusePolicy) {
        this.A01 = subcomposeSlotReusePolicy;
        this.A04 = new AnonymousClass9LZ(this, 9);
        this.A02 = new AnonymousClass9LZ(this, 7);
        this.A03 = new AnonymousClass9LZ(this, 8);
    }

    public AnonymousClass6I8() {
        this(APQ.A00);
    }
}
