package X;

/* renamed from: X.Goo  reason: case insensitive filesystem */
public final class C53456Goo extends AnonymousClass0T0 implements JSC {
    public final JS5 A00;
    public final JSJ A01;

    public final C53456Goo F75() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53456Goo) {
                C53456Goo goo = (C53456Goo) obj;
                if (!0qQ.A0K(this.A00, goo.A00) || !0qQ.A0K(this.A01, goo.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final JS5 BDa() {
        return this.A00;
    }

    public final JSJ BQl() {
        return this.A01;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A01, AnonymousClass7TE.A0K(this.A00));
    }

    public C53456Goo(JS5 js5, JSJ jsj) {
        AnonymousClass7TG.A1O(js5, jsj);
        this.A00 = js5;
        this.A01 = jsj;
    }
}
