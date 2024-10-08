package X;

/* renamed from: X.Se4  reason: case insensitive filesystem */
public final class C11662Se4 implements 2YM {
    public final QDL A00;
    public final QDH A01;

    public final /* synthetic */ 2YL create(C62230ry r2, AnonymousClass2YQ r3) {
        return 2YT.A00(this, r3, r2);
    }

    public final 2YL create(Class cls) {
        0qQ.A0B(cls, 0);
        if (cls.equals(QDJ.class)) {
            return new QDJ(this.A00, this.A01);
        }
        throw AnonymousClass7TE.A0w("Input class not implemented");
    }

    public final /* synthetic */ 2YL create(Class cls, AnonymousClass2YQ r3) {
        return 2YT.A01(this, cls);
    }

    public C11662Se4(QDL qdl, QDH qdh) {
        AnonymousClass7TG.A1O(qdh, qdl);
        this.A01 = qdh;
        this.A00 = qdl;
    }
}
