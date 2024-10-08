package X;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.Jbj  reason: case insensitive filesystem */
public final class C59920Jbj extends C320806sz {
    public final int A00;
    public final int A01;
    public final Object A02;

    public C59920Jbj(Object obj, int i, int i2) {
        this.A00 = i2;
        this.A02 = obj;
        this.A01 = i;
    }

    public final int A00(int i) {
        int i2;
        int i3;
        C62572Ki5 ki5;
        switch (this.A00) {
            case 0:
                try {
                    i2 = ((2Rw) this.A02).getItemViewType(i);
                } catch (IndexOutOfBoundsException e) {
                    0kD.A0A("GalleryPickerGridSpanSizeUtil", "adapter.getItemViewType failed", e);
                    i2 = 1;
                }
                AnonymousClass2t9 r1 = (AnonymousClass2t9) this.A02;
                i3 = this.A01;
                if (i2 == r1.A01(C64757LhZ.class) || i2 == r1.A01(C64758Lha.class) || i2 == r1.A01(JWp.class) || i2 == r1.A01(C64759Lhb.class)) {
                    return i3;
                }
                return 1;
            case 1:
                2Rw r12 = ((RecyclerView) this.A02).A0A;
                if (r12 != null) {
                    i3 = 1;
                    if (i < r12.getItemCount()) {
                        int itemViewType = r12.getItemViewType(i);
                        if (itemViewType == 2 || itemViewType == 3 || itemViewType == 6 || itemViewType == 7 || itemViewType == 8) {
                            return this.A01;
                        }
                        return 1;
                    }
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
                break;
            default:
                if (((MYR) this.A02).isModelClass(i, C64781Lhx.class)) {
                    ki5 = C62572Ki5.THUMBNAIL;
                } else {
                    ki5 = C62572Ki5.UNRECOGNIZED;
                }
                int ordinal = ki5.ordinal();
                i3 = 2;
                if (ordinal == 4 || ordinal == 3) {
                    return 2 / this.A01;
                }
        }
        return i3;
    }
}
