package X;

/* renamed from: X.SgS  reason: case insensitive filesystem */
public final class C11780SgS implements C13516Tbl {
    public final int A00;
    public final Object A01;

    public C11780SgS(1IX r1, int i) {
        this.A00 = i;
        this.A01 = r1;
    }

    public final void onResult(Object obj) {
        if (this.A00 != 0) {
            Throwable th = (Throwable) obj;
            AnonymousClass4D7 r1 = (AnonymousClass4D7) this.A01;
            if (!(1IW.A04.get(r1) instanceof AnonymousClass13B)) {
                return;
            }
            if (th == null) {
                0qQ.A0E("LOAD_PARAM");
                throw AnonymousClass00P.createAndThrow();
            } else {
                r1.resumeWith(JTO.A1B(th));
            }
        } else {
            AnonymousClass4D7 r12 = (AnonymousClass4D7) this.A01;
            if (!(!(1IW.A04.get(r12) instanceof AnonymousClass13B))) {
                r12.resumeWith(obj);
            }
        }
    }
}
