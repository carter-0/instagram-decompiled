package X;

import java.util.List;

/* renamed from: X.Sgk  reason: case insensitive filesystem */
public final class C11798Sgk implements C13826Thx {
    public float A00 = -1.0f;
    public final ST4 A01;

    public final boolean isEmpty() {
        return false;
    }

    public final ST4 Au7() {
        return this.A01;
    }

    public final float B1Y() {
        return this.A01.A01();
    }

    public final float Bye() {
        return this.A01.A02();
    }

    public final boolean CPv(float f) {
        if (this.A00 == f) {
            return true;
        }
        this.A00 = f;
        return false;
    }

    public final boolean CeI(float f) {
        return !this.A01.A03();
    }

    public C11798Sgk(List list) {
        this.A01 = (ST4) AnonymousClass7TE.A13(list);
    }
}
