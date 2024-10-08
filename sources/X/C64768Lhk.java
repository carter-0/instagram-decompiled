package X;

/* renamed from: X.Lhk  reason: case insensitive filesystem */
public final class C64768Lhk implements C232262tL {
    public final String A00;

    public C64768Lhk(String str) {
        0qQ.A0B(str, 1);
        this.A00 = str;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A00;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        String str;
        C64768Lhk lhk = (C64768Lhk) obj;
        String str2 = this.A00;
        if (lhk != null) {
            str = lhk.A00;
        } else {
            str = null;
        }
        return AnonymousClass7TF.A1P(0qQ.A0K(str2, str) ? 1 : 0);
    }
}
