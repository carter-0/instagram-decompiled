package X;

import java.util.List;

/* renamed from: X.Sgl  reason: case insensitive filesystem */
public final class C11799Sgl implements C13826Thx {
    public float A00 = -1.0f;
    public ST4 A01 = null;
    public ST4 A02;
    public final List A03;

    public final boolean isEmpty() {
        return false;
    }

    private ST4 A00(float f) {
        List list = this.A03;
        ST4 st4 = (ST4) list.get(list.size() - 1);
        if (f < st4.A02()) {
            int size = list.size() - 2;
            while (size >= 1) {
                st4 = (ST4) list.get(size);
                if (this.A02 == st4 || f < st4.A02() || f >= st4.A01()) {
                    size--;
                }
            }
            return (ST4) AnonymousClass7TE.A13(list);
        }
        return st4;
    }

    public final ST4 Au7() {
        return this.A02;
    }

    public final float B1Y() {
        return ((ST4) C66582MXn.A0r(this.A03)).A01();
    }

    public final float Bye() {
        return ((ST4) AnonymousClass7TE.A13(this.A03)).A02();
    }

    public final boolean CPv(float f) {
        ST4 st4 = this.A01;
        ST4 st42 = this.A02;
        if (st4 == st42 && this.A00 == f) {
            return true;
        }
        this.A01 = st42;
        this.A00 = f;
        return false;
    }

    public final boolean CeI(float f) {
        ST4 st4 = this.A02;
        if (f >= st4.A02() && f < st4.A01()) {
            return !st4.A03();
        }
        this.A02 = A00(f);
        return true;
    }

    public C11799Sgl(List list) {
        this.A03 = list;
        this.A02 = A00(0.0f);
    }
}
