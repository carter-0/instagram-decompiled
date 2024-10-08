package X;

/* renamed from: X.Otm  reason: case insensitive filesystem */
public final class C71961Otm implements C232262tL {
    public final AnonymousClass3BT A00;

    public C71961Otm(AnonymousClass3BT r2) {
        0qQ.A0B(r2, 1);
        this.A00 = r2;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        String str = this.A00.A03.A1o;
        0qQ.A07(str);
        return str;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        String str;
        C71961Otm otm = (C71961Otm) obj;
        if (otm != null) {
            str = otm.A00.A03.A1o;
            0qQ.A07(str);
        } else {
            str = null;
        }
        String str2 = this.A00.A03.A1o;
        0qQ.A07(str2);
        return 0qQ.A0K(str, str2);
    }
}
