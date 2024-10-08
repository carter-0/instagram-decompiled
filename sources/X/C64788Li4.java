package X;

/* renamed from: X.Li4  reason: case insensitive filesystem */
public final class C64788Li4 implements C232262tL {
    public final 1Xj A00;
    public final AnonymousClass3W1 A01;
    public final AnonymousClass3TO A02;

    public C64788Li4(1Xj r2, AnonymousClass3W1 r3, AnonymousClass3TO r4) {
        0qQ.A0B(r3, 2);
        this.A00 = r2;
        this.A01 = r3;
        this.A02 = r4;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        String id = this.A00.getId();
        if (id != null) {
            return id;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        String str;
        C64788Li4 li4 = (C64788Li4) obj;
        String id = this.A00.getId();
        if (id != null) {
            if (li4 != null) {
                str = li4.A00.getId();
                if (str == null) {
                    throw AnonymousClass7TE.A0y();
                }
            } else {
                str = null;
            }
            return id.equals(str);
        }
        throw AnonymousClass7TE.A0y();
    }
}
