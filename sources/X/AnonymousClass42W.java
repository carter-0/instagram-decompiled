package X;

/* renamed from: X.42W  reason: invalid class name */
public final class AnonymousClass42W extends C64851Wn {
    public final AnonymousClass42V[] A00;
    public final /* synthetic */ AnonymousClass42U A01;

    public AnonymousClass42W(AnonymousClass42U r1, AnonymousClass42V[] r2) {
        this.A01 = r1;
        this.A00 = r2;
    }

    public final void A06() {
        AnonymousClass42V[] r3 = this.A00;
        int length = r3.length;
        int i = 0;
        while (i < length) {
            AnonymousClass19L r0 = r3[i].A00;
            if (r0 != null) {
                r0.dispose();
                i++;
            } else {
                0qQ.A0F("handle");
                throw AnonymousClass00P.createAndThrow();
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DisposeHandlersOnCancel[");
        sb.append(this.A00);
        sb.append(']');
        return sb.toString();
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        A06();
        return C60340gF.A00;
    }

    public final void A05(Throwable th) {
        A06();
    }
}
