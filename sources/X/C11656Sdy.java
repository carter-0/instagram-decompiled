package X;

/* renamed from: X.Sdy  reason: case insensitive filesystem */
public final class C11656Sdy implements 2YM {
    public final QDH A00;

    public C11656Sdy(QDH qdh) {
        0qQ.A0B(qdh, 1);
        this.A00 = qdh;
    }

    public final /* synthetic */ 2YL create(C62230ry r2, AnonymousClass2YQ r3) {
        return 2YT.A00(this, r3, r2);
    }

    public final 2YL create(Class cls) {
        0qQ.A0B(cls, 0);
        if (cls.isAssignableFrom(C7434QCz.class)) {
            return new C7434QCz(this.A00);
        }
        throw C51973G9u.A0g(cls, "Unknown ViewModel class: ", AnonymousClass7TE.A1A());
    }

    public final /* synthetic */ 2YL create(Class cls, AnonymousClass2YQ r3) {
        return 2YT.A01(this, cls);
    }
}
