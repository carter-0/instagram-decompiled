package X;

/* renamed from: X.IkE  reason: case insensitive filesystem */
public final /* synthetic */ class C58021IkE implements C61910qF, C252213ok {
    public final /* synthetic */ 0sL A00;

    public C58021IkE(0sL r2) {
        0qQ.A0B(r2, 1);
        this.A00 = r2;
    }

    public final /* synthetic */ void DMr(int i, boolean z) {
        this.A00.invoke(Integer.valueOf(i), Boolean.valueOf(z));
    }

    public final AnonymousClass0eL getFunctionDelegate() {
        return this.A00;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C252213ok) || !(obj instanceof C61910qF)) {
            return false;
        }
        return AnonymousClass7TG.A1Y(obj, this.A00);
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }
}
