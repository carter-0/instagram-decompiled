package X;

/* renamed from: X.SkJ  reason: case insensitive filesystem */
public final class C12000SkJ implements C13882Tj5 {
    public volatile Object A00;
    public final /* synthetic */ C13882Tj5 A01;

    public C12000SkJ(C13882Tj5 tj5) {
        this.A01 = tj5;
    }

    public final Object get() {
        if (this.A00 == null) {
            synchronized (this) {
                if (this.A00 == null) {
                    Object obj = this.A01.get();
                    C9217RTu.A00(obj);
                    this.A00 = obj;
                }
            }
        }
        return this.A00;
    }
}
