package X;

/* renamed from: X.Li3  reason: case insensitive filesystem */
public final class C64787Li3 implements C232262tL {
    public final 1Xj A00;
    public final AnonymousClass3W1 A01;
    public final AnonymousClass3TO A02;

    public final /* bridge */ /* synthetic */ Object getKey() {
        String id = this.A00.getId();
        if (id == null) {
            return "";
        }
        return id;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C64787Li3 li3 = (C64787Li3) obj;
        0qQ.A0B(li3, 0);
        String id = this.A00.getId();
        if (id == null) {
            id = "";
        }
        String id2 = li3.A00.getId();
        if (id2 == null) {
            id2 = "";
        }
        return id.equals(id2);
    }

    public C64787Li3(1Xj r1, AnonymousClass3W1 r2, AnonymousClass3TO r3) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
    }
}
