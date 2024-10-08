package X;

/* renamed from: X.GQu  reason: case insensitive filesystem */
public final class C52395GQu implements C74589Pxc {
    public final float A00;
    public final float A01;

    public final /* bridge */ /* synthetic */ Comparable B1S() {
        return Float.valueOf(this.A00);
    }

    public final /* bridge */ /* synthetic */ Comparable Byc() {
        return Float.valueOf(this.A01);
    }

    public final /* bridge */ /* synthetic */ boolean Cfv(Comparable comparable, Comparable comparable2) {
        if (((Number) comparable).floatValue() <= ((Number) comparable2).floatValue()) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C52395GQu)) {
            return false;
        }
        if (!isEmpty() || !((C52395GQu) obj).isEmpty()) {
            C52395GQu gQu = (C52395GQu) obj;
            if (!(this.A01 == gQu.A01 && this.A00 == gQu.A00)) {
                return false;
            }
        }
        return true;
    }

    public final boolean isEmpty() {
        return AnonymousClass7TF.A1R((this.A01 > this.A00 ? 1 : (this.A01 == this.A00 ? 0 : -1)));
    }

    public C52395GQu(float f, float f2) {
        this.A01 = f;
        this.A00 = f2;
    }

    public final /* bridge */ /* synthetic */ boolean AJZ(Comparable comparable) {
        float A04 = AnonymousClass7TE.A04(comparable);
        if (A04 < this.A01 || A04 > this.A00) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return C51966G9m.A02(G9w.A00(this.A01), this.A00);
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append(this.A01);
        A1A.append("..");
        A1A.append(this.A00);
        return A1A.toString();
    }
}
