package X;

/* renamed from: X.Pe0  reason: case insensitive filesystem */
public final /* synthetic */ class C73517Pe0 implements C61910qF, C74354PtU {
    public final /* synthetic */ C15940UlA A00;

    public C73517Pe0(C15940UlA ulA) {
        this.A00 = ulA;
    }

    public final AnonymousClass0eL getFunctionDelegate() {
        return new 03J(1, this.A00, C15940UlA.class, "getGridPosition", "getGridPosition(Lcom/instagram/discovery/recyclerview/model/GridItemViewModel;)Lcom/instagram/common/recyclerview/grid/model/GridPosition;", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    public final /* bridge */ /* synthetic */ C296995qz B9o(Object obj) {
        C296935qt r2 = (C296935qt) obj;
        0qQ.A0B(r2, 0);
        return this.A00.B9o(r2);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C74354PtU) || !(obj instanceof C61910qF)) {
            return false;
        }
        return AnonymousClass7TG.A1Y(obj, getFunctionDelegate());
    }
}
