package X;

/* renamed from: X.5lw  reason: invalid class name and case insensitive filesystem */
public final class C294155lw implements C13669Ted {
    public final /* synthetic */ AnonymousClass6SB A00;
    public final /* synthetic */ AnonymousClass6SB A01;

    public C294155lw(AnonymousClass6SB r1, AnonymousClass6SB r2) {
        this.A01 = r1;
        this.A00 = r2;
    }

    public final boolean FN7(C276544tV r6) {
        AnonymousClass6SB r4 = this.A01;
        0qQ.A0A(r6);
        AnonymousClass6SB r3 = this.A00;
        int i = r6.A03;
        Object obj = r4.A02.get(i);
        if (obj != null) {
            r3.A02.put(i, obj);
        }
        Object obj2 = r4.A00.get(i);
        if (obj2 != null) {
            r3.A00.put(i, obj2);
        }
        Object obj3 = r4.A01.get(i);
        if (obj3 == null) {
            return false;
        }
        r3.A01.put(i, obj3);
        return false;
    }
}
