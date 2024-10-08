package X;

/* renamed from: X.LZw  reason: case insensitive filesystem */
public final class C64321LZw implements AnonymousClass2gO, C61910qF {
    public final int A00;
    public final Object A01;

    public C64321LZw(int i, 0sP r2) {
        this.A00 = i;
        this.A01 = r2;
    }

    public static void A00(AnonymousClass07Z r1, 2Fk r2, 0sP r3, int i) {
        r2.A06(r1, new C64321LZw(i, r3));
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
