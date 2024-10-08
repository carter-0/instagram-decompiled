package X;

/* renamed from: X.LZs  reason: case insensitive filesystem */
public final class C64318LZs implements AnonymousClass2gO, C61910qF {
    public final int A00;
    public final Object A01;

    public C64318LZs(int i, 0sP r2) {
        this.A00 = i;
        this.A01 = r2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AnonymousClass2gO) || !(obj instanceof C61910qF)) {
            return false;
        }
        return AnonymousClass7TG.A1Y(obj, this.A01);
    }

    public final AnonymousClass0eL getFunctionDelegate() {
        return (AnonymousClass0eL) this.A01;
    }

    public final int hashCode() {
        return this.A01.hashCode();
    }

    public final /* synthetic */ void onChanged(Object obj) {
        C51965G9l.A1W(this.A01, obj);
    }
}
